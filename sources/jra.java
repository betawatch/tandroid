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
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.Components.Premium.LimitPreviewView;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class jra implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ wua b;

    public /* synthetic */ jra(wua wuaVar, byte b) {
        this.a = b;
        this.b = wuaVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:142:0x01ec, code lost:
    
        if (android.text.TextUtils.isEmpty(r6) == false) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01d9, code lost:
    
        if (android.text.TextUtils.isEmpty(r6) == false) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x01ee, code lost:
    
        r7 = true;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:105:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x02ec  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x02f1  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0331  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0221  */
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
        dua duaVar;
        String str;
        int i;
        boolean z;
        TLRPC.Document document2;
        boolean z2;
        zwa C;
        TLRPC.Message message;
        long j;
        int i2;
        long n;
        long j2;
        long j3;
        String str2;
        boolean z3;
        TL_stars.StarGiftUpgradePrice starGiftUpgradePrice;
        int i3;
        uua uuaVar;
        JSONObject u;
        TLRPC.Message message2;
        byte b = this.a;
        byte b2 = 5;
        byte b3 = 1;
        wua wuaVar = this.b;
        switch (b) {
            case 0:
                sua suaVar = wuaVar.a2;
                c51 c51Var = wuaVar.f2;
                eua euaVar = wuaVar.K2.h;
                ImageReceiver imageReceiver = (euaVar == null || (duaVar = euaVar.c) == null) ? null : ((gua) duaVar).d;
                de0 de0Var = suaVar.d[0];
                if (imageReceiver != null && de0Var != null && de0Var.getImageReceiver() != null) {
                    b29 y = imageReceiver.y();
                    b29 y2 = de0Var.getImageReceiver().y();
                    if (y2 != null) {
                        if (y != null) {
                            y2.O(false, y.o());
                        }
                    } else if (y != null) {
                        imageReceiver.f();
                        de0Var.setImageDrawable(y);
                    }
                }
                suaVar.b.setAlpha(1.0f);
                suaVar.c.setAlpha(0.0f);
                if (!wuaVar.m2 || wuaVar.U1 == null || wuaVar.B2 == null || wuaVar.x1() < 0 || wuaVar.B2.b(wuaVar.x1()) < 0) {
                    c51Var.setFilled(true);
                    c51Var.i(ob6.M0(2131747558, null), true, true);
                    c51Var.g(null, true);
                    c51Var.setOnClickListener(new hra(wuaVar, (byte) 10));
                    break;
                } else {
                    c51Var.setFilled(false);
                    int b4 = wuaVar.B2.b(wuaVar.x1());
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilder.append((CharSequence) ob6.M0(2131749801, null));
                    Object obj = wuaVar.B2.get(b4);
                    if (!(obj instanceof TL_stars.SavedStarGift) || (starGift = ((TL_stars.SavedStarGift) obj).gift) == null || (document = starGift.getDocument()) == null) {
                        r5 = 1;
                    } else {
                        spannableStringBuilder.append((CharSequence) " e");
                        r5 = 1;
                        spannableStringBuilder.setSpan(new hm(document, c51Var.getTextPaint().getFontMetricsInt()), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
                    }
                    c51Var.i(spannableStringBuilder, r5, r5);
                    c51Var.g(null, r5);
                    c51Var.setOnClickListener(new ira(wuaVar, b4, r5));
                    break;
                }
                break;
            case 1:
                if (wuaVar.s1() != null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(wuaVar.s1().title);
                    sb.append(" #");
                    str = qu6.m(wuaVar.s1().num, ',', sb);
                } else {
                    str = "";
                }
                v21 I = wuaVar.j().I(R.raw.gift_upgrade, ob6.M0(2131749795, null), hl.S2(ob6.a0(null, null, 2131749796, str)));
                I.j = 5000;
                I.u = true;
                I.j();
                tj4 tj4Var = wuaVar.V1;
                if (tj4Var != null) {
                    tj4Var.c(true);
                    break;
                }
                break;
            case 2:
                wuaVar.n1.x0(((wua) wuaVar.O2.d).N2.length - 1);
                break;
            case 3:
                wuaVar.dismiss();
                break;
            case 4:
                if (wuaVar.q3 != null) {
                    long j4 = 0;
                    for (int i4 = 0; i4 < wuaVar.q3.invoice.prices.size(); i4++) {
                        j4 += wuaVar.q3.invoice.prices.get(i4).amount;
                    }
                    Context context = wuaVar.getContext();
                    ArrayList arrayList = wuaVar.n3;
                    vnb vnbVar = wuaVar.J0;
                    uua uuaVar2 = new uua(context, vnbVar);
                    uuaVar2.V1 = arrayList;
                    float f = uuaVar2.u0 / hl.p;
                    LimitPreviewView limitPreviewView = new LimitPreviewView(uuaVar2.getContext(), R.drawable.star, 0, 0, vnbVar);
                    uuaVar2.W1 = limitPreviewView;
                    limitPreviewView.setTranslationY(-hl.L(14.0f));
                    limitPreviewView.setIconScale(1.8f);
                    LinearLayout.LayoutParams s = tre.s(-1, -2, 17, f, 20.0f, f, 10.0f);
                    LinearLayout linearLayout = uuaVar2.S1;
                    linearLayout.addView(limitPreviewView, s);
                    uuaVar2.Z0(j4);
                    int i5 = aob.G6;
                    TextView b5 = zze.b(context, 20.0f, i5, true, null);
                    uh9.q(b5, 17, null, 2131749814);
                    uuaVar2.setTitle(ob6.M0(2131749814, null));
                    linearLayout.addView(b5, tre.t(-1, -2, 17, 32, 0, 32, 0));
                    TextView b6 = zze.b(context, 14.0f, i5, false, null);
                    uh9.q(b6, 17, null, 2131749815);
                    linearLayout.addView(b6, tre.t(-1, -2, 17, 32, 10, 32, 10));
                    int currentTime = ConnectionsManager.getInstance(uuaVar2.a).getCurrentTime();
                    hjb hjbVar = new hjb(context, vnbVar);
                    boolean z4 = false;
                    for (int i6 = 0; i6 < arrayList.size(); i6++) {
                        if (currentTime <= ((TL_stars.StarGiftUpgradePrice) arrayList.get(i6)).date || ((i = i6 + 1) < arrayList.size() && currentTime <= ((TL_stars.StarGiftUpgradePrice) arrayList.get(i)).date)) {
                            Date date = new Date(r9.date * 1000);
                            hjbVar.f(ob6.D0().o0().format(date) + ", " + ob6.D0().p0().format(date), nza.b1(false, "⭐️ ".concat(ob6.E((int) r9.upgrade_stars, ',')), 0.8f, null), null, null);
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
                            hjbVar.f(ob6.D0().o0().format(date2) + ", " + ob6.D0().p0().format(date2), nza.b1(false, "⭐️ ".concat(ob6.E((int) starGiftUpgradePrice2.upgrade_stars, ',')), 0.8f, null), null, null);
                        }
                    }
                    float f2 = f + 14.0f;
                    linearLayout.addView(hjbVar, tre.s(-1, -2, 7, f2, 16.0f, f2, 15.0f));
                    TextView b7 = zze.b(context, 12.0f, aob.y6, false, null);
                    uh9.q(b7, 17, null, 2131749817);
                    linearLayout.addView(b7, tre.t(-1, -2, 17, 32, 0, 32, 15));
                    float f3 = uuaVar2.u0 / hl.p;
                    FrameLayout frameLayout = new FrameLayout(uuaVar2.getContext());
                    uuaVar2.T1 = frameLayout;
                    yob.h(aob.h5, uuaVar2.J0, frameLayout);
                    View view = new View(uuaVar2.getContext());
                    yob.h(aob.d7, uuaVar2.J0, view);
                    uuaVar2.T1.addView(view, tre.a(-1.0f, 1.0f / hl.p, 55));
                    c51 c51Var2 = new c51(uuaVar2.J0, uuaVar2.getContext(), true);
                    uuaVar2.U1 = c51Var2;
                    float f4 = f3 + 16.0f;
                    uuaVar2.T1.addView(c51Var2, tre.d(-1, 48.0f, jn7.D1, f4, 16.0f, f4, 16.0f));
                    uuaVar2.b.addView(uuaVar2.T1, tre.e(-1, -2, 87));
                    d79 d79Var = uuaVar2.n1;
                    d79Var.setPadding(d79Var.getPaddingLeft(), d79Var.getPaddingTop(), d79Var.getPaddingRight(), hl.L(80.0f) + d79Var.getPaddingBottom());
                    uuaVar2.U1.i(wua.l2(ob6.M0(2131743543, null)), false, true);
                    uuaVar2.U1.setOnClickListener(new kla(uuaVar2, (byte) 5));
                    wuaVar.l2 = uuaVar2;
                    uuaVar2.show();
                    break;
                }
                break;
            case 5:
                wuaVar.dismiss();
                break;
            case 6:
                new xk8((e) new qu0(wuaVar, (byte) 13), 12, false).show();
                break;
            case 7:
                qt8 qt8Var = wuaVar.i3;
                if (qt8Var != null) {
                    qt8Var.run();
                }
                wuaVar.dismiss();
                break;
            case 8:
                new xd5(wuaVar.getContext()).show();
                break;
            case 9:
                qt8 qt8Var2 = wuaVar.i3;
                if (qt8Var2 != null) {
                    qt8Var2.run();
                }
                wuaVar.dismiss();
                break;
            case 10:
                Bundle bundle = new Bundle();
                long j5 = wuaVar.S1;
                if (j5 >= 0) {
                    bundle.putLong("user_id", j5);
                } else {
                    bundle.putLong("chat_id", -j5);
                }
                if (j5 == yac.h(wuaVar.a).e()) {
                    bundle.putBoolean("my_profile", true);
                }
                bundle.putBoolean("open_gifts", true);
                bundle.putBoolean("open_gifts_upgradable", true);
                wua.h2(new ProfileActivity(bundle, null));
                break;
            case 11:
                qt8 qt8Var3 = wuaVar.i3;
                if (qt8Var3 != null) {
                    qt8Var3.run();
                }
                wuaVar.dismiss();
                break;
            case 12:
                wua wuaVar2 = this.b;
                c51 c51Var3 = wuaVar2.f2;
                if (!c51Var3.R) {
                    TL_stars.InputSavedStarGift v1 = wuaVar2.v1();
                    r47 r47Var = wuaVar2.C2;
                    if (r47Var == null || (message = r47Var.k) == null) {
                        TL_stars.SavedStarGift savedStarGift = wuaVar2.A2;
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
                    c51Var3.setLoading(true);
                    TL_stars.saveStarGift savestargift = new TL_stars.saveStarGift();
                    savestargift.unsave = z5;
                    savestargift.stargift = v1;
                    if (wuaVar2.A2 == null || (C = jxa.v(wuaVar2.a, false).C(wuaVar2.S1, false)) == null) {
                        z2 = false;
                    } else {
                        C.m(wuaVar2.A2, savestargift.unsave);
                        z2 = true;
                    }
                    ConnectionsManager.getInstance(wuaVar2.a).sendRequest(savestargift, new w07(wuaVar2, z2, document3, z5, savestargift));
                    break;
                }
                break;
            case 13:
                wuaVar.f2.setLoading(false);
                wuaVar.A2(0, true, null);
                break;
            case 14:
                final wua wuaVar3 = this.b;
                final long e = yac.h(wuaVar3.a).e();
                final TL_stars.InputSavedStarGift v12 = wuaVar3.v1();
                if (v12 != null) {
                    r47 r47Var2 = wuaVar3.C2;
                    if (r47Var2 != null) {
                        i2 = r47Var2.k.date;
                        boolean O3 = r47Var2.O3();
                        TLRPC.Message message3 = wuaVar3.C2.k;
                        if (message3 != null) {
                            TLRPC.MessageAction messageAction2 = message3.action;
                            if (messageAction2 instanceof TLRPC.TL_messageActionStarGift) {
                                TLRPC.TL_messageActionStarGift tL_messageActionStarGift2 = (TLRPC.TL_messageActionStarGift) messageAction2;
                                TLRPC.Peer peer = tL_messageActionStarGift2.peer;
                                j3 = peer != null ? wf3.n(peer) : O3 ? r47.B0(message3) : e;
                                TLRPC.Peer peer2 = tL_messageActionStarGift2.from_id;
                                n = peer2 != null ? wf3.n(peer2) : O3 ? e : r47.B0(wuaVar3.C2.k);
                                j = 2666000;
                                j2 = tL_messageActionStarGift2.convert_stars;
                            }
                        }
                    } else {
                        j = 2666000;
                        TL_stars.SavedStarGift savedStarGift2 = wuaVar3.A2;
                        if (savedStarGift2 != null) {
                            i2 = savedStarGift2.date;
                            n = ((savedStarGift2.flags & 2) == 0 || savedStarGift2.name_hidden) ? 2666000L : wf3.n(savedStarGift2.from_id);
                            j2 = wuaVar3.A2.convert_stars;
                            j3 = wuaVar3.S1;
                        }
                    }
                    long j6 = n;
                    final long j7 = j3;
                    int max = Math.max(1, (((int) uc7.s1(wuaVar3.a).k4.D3.g(TimeUnit.SECONDS)) - (ConnectionsManager.getInstance(wuaVar3.a).getCurrentTime() - i2)) / 86400);
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, wuaVar3.J0, wuaVar3.getContext());
                    String M0 = ob6.M0(2131750185, null);
                    id idVar = alertDialog$Builder.a;
                    idVar.S = M0;
                    idVar.U = hl.S2(ob6.G(max, "Gift2ConvertText2", (lbc.C(j6) || j6 == j) ? ob6.M0(2131744606, null) : wf3.s(j6), ob6.H(',', "Gift2ConvertStars", (int) j2)));
                    final long j8 = j2;
                    alertDialog$Builder.j(ob6.M0(2131750192, null), new fd() { // from class: vsa
                        @Override // fd
                        public final void w(id idVar2, int i8) {
                            wua wuaVar4 = wua.this;
                            TL_stars.InputSavedStarGift inputSavedStarGift = v12;
                            long j9 = j7;
                            long j10 = e;
                            long j11 = j8;
                            wuaVar4.getClass();
                            id idVar3 = new id(3, null, a.b);
                            idVar3.q(500L);
                            TL_stars.convertStarGift convertstargift = new TL_stars.convertStarGift();
                            convertstargift.stargift = inputSavedStarGift;
                            ConnectionsManager.getInstance(wuaVar4.a).sendRequest(convertstargift, new zra(wuaVar4, idVar3, j9, j10, j11));
                        }
                    });
                    ik8.y(null, 2131752570, alertDialog$Builder, null);
                    break;
                }
                break;
            case 15:
                wm2[] wm2VarArr = wuaVar.r3;
                c51 c51Var4 = wuaVar.f2;
                if (wuaVar.W2.b == 1 && !wuaVar.J) {
                    TL_stars.InputSavedStarGift v13 = wuaVar.v1();
                    r47 r47Var3 = wuaVar.C2;
                    if (r47Var3 != null) {
                        TLRPC.MessageAction messageAction3 = r47Var3.k.action;
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
                        TL_stars.SavedStarGift savedStarGift3 = wuaVar.A2;
                        if (savedStarGift3 != null) {
                            long j10 = savedStarGift3.upgrade_stars;
                            str2 = savedStarGift3.prepaid_upgrade_hash;
                            if (j10 <= 0) {
                                break;
                            }
                            z3 = false;
                        }
                    }
                    int currentTime2 = ConnectionsManager.getInstance(wuaVar.a).getCurrentTime();
                    long j11 = 0;
                    if (wuaVar.o3 != null) {
                        for (int i8 = 0; i8 < wuaVar.o3.size(); i8++) {
                            starGiftUpgradePrice = (TL_stars.StarGiftUpgradePrice) wuaVar.o3.get(i8);
                            if (starGiftUpgradePrice.date >= currentTime2) {
                                i3 = i8;
                                if (wuaVar.q3 != null) {
                                    for (int i9 = 0; i9 < wuaVar.q3.invoice.prices.size(); i9++) {
                                        j11 += wuaVar.q3.invoice.prices.get(i9).amount;
                                    }
                                }
                                long j12 = j11;
                                if (i3 > 0 && !wuaVar.p3) {
                                    wuaVar.p3 = true;
                                    if (wuaVar.o3 != null) {
                                        for (int i10 = 0; i10 < i3; i10++) {
                                            wuaVar.o3.remove(0);
                                        }
                                    }
                                    TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
                                    if (TextUtils.isEmpty(str2)) {
                                        TLRPC.TL_inputInvoiceStarGiftPrepaidUpgrade tL_inputInvoiceStarGiftPrepaidUpgrade = new TLRPC.TL_inputInvoiceStarGiftPrepaidUpgrade();
                                        tL_inputInvoiceStarGiftPrepaidUpgrade.hash = str2;
                                        tL_inputInvoiceStarGiftPrepaidUpgrade.peer = uc7.s1(wuaVar.a).j1(wuaVar.S1);
                                        tL_payments_getPaymentForm.invoice = tL_inputInvoiceStarGiftPrepaidUpgrade;
                                    } else {
                                        TLRPC.TL_inputInvoiceStarGiftUpgrade tL_inputInvoiceStarGiftUpgrade = new TLRPC.TL_inputInvoiceStarGiftUpgrade();
                                        tL_inputInvoiceStarGiftUpgrade.keep_original_details = wuaVar.r2.a.q;
                                        tL_inputInvoiceStarGiftUpgrade.stargift = v13;
                                        tL_payments_getPaymentForm.invoice = tL_inputInvoiceStarGiftUpgrade;
                                    }
                                    u = xw0.u(wuaVar.J0, false);
                                    if (u != null) {
                                        TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                                        tL_payments_getPaymentForm.theme_params = tL_dataJSON;
                                        tL_dataJSON.data = u.toString();
                                        tL_payments_getPaymentForm.flags |= 1;
                                    }
                                    ConnectionsManager.getInstance(wuaVar.a).sendRequest(tL_payments_getPaymentForm, new xsa(wuaVar, b3));
                                }
                                if (z3) {
                                    c51Var4.i(nza.U0(ob6.a0(null, null, 2131749823, Long.valueOf(j12)), 1.13f, wm2VarArr), true, true);
                                } else {
                                    c51Var4.i(nza.U0(ob6.a0(null, null, 2131750025, Long.valueOf(j12)), 1.13f, wm2VarArr), true, true);
                                }
                                uuaVar = wuaVar.l2;
                                if (uuaVar != null) {
                                    uuaVar.Z0(j12);
                                }
                                if (starGiftUpgradePrice == null) {
                                    int i11 = starGiftUpgradePrice.date - currentTime2;
                                    String g0 = i11 < 86400 ? hl.g0(i11, false, true) : ob6.G(Math.round(i11 / 86400.0f), "Days", new Object[0]);
                                    hn hnVar = c51Var4.e;
                                    hnVar.E = false;
                                    hnVar.F = true;
                                    hnVar.G = true;
                                    hnVar.H = false;
                                    hnVar.I = false;
                                    c51Var4.g(ob6.a0(null, null, 2131749822, g0), true);
                                    hl.d3(wuaVar.s3, 1000L);
                                    break;
                                } else {
                                    c51Var4.g(null, true);
                                    break;
                                }
                            }
                        }
                    }
                    starGiftUpgradePrice = null;
                    i3 = -1;
                    if (wuaVar.q3 != null) {
                    }
                    long j122 = j11;
                    if (i3 > 0) {
                        wuaVar.p3 = true;
                        if (wuaVar.o3 != null) {
                        }
                        TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm2 = new TLRPC.TL_payments_getPaymentForm();
                        if (TextUtils.isEmpty(str2)) {
                        }
                        u = xw0.u(wuaVar.J0, false);
                        if (u != null) {
                        }
                        ConnectionsManager.getInstance(wuaVar.a).sendRequest(tL_payments_getPaymentForm2, new xsa(wuaVar, b3));
                    }
                    if (z3) {
                    }
                    uuaVar = wuaVar.l2;
                    if (uuaVar != null) {
                    }
                    if (starGiftUpgradePrice == null) {
                    }
                }
                break;
            case 16:
                wuaVar.onBackPressed();
                break;
            case 17:
                TL_stars.SavedStarGift savedStarGift4 = wuaVar.A2;
                if (savedStarGift4.unsaved) {
                    savedStarGift4.unsaved = false;
                    zwa C2 = jxa.v(wuaVar.a, false).C(wuaVar.S1, false);
                    if (C2 != null) {
                        TL_stars.SavedStarGift savedStarGift5 = wuaVar.A2;
                        C2.m(savedStarGift5, savedStarGift5.unsaved);
                    }
                    TL_stars.saveStarGift savestargift2 = new TL_stars.saveStarGift();
                    savestargift2.stargift = wuaVar.v1();
                    savestargift2.unsave = wuaVar.A2.unsaved;
                    ConnectionsManager.getInstance(wuaVar.a).sendRequest(savestargift2, null, 64);
                }
                TL_stars.SavedStarGift savedStarGift6 = wuaVar.A2;
                boolean z6 = savedStarGift6.pinned_to_top;
                if (((axa) wuaVar.B2).q(savedStarGift6, !z6, false)) {
                    new du8(wuaVar.getContext(), wuaVar.S1, wuaVar.A2, wuaVar.J0, new yf0(wuaVar, (byte) 6)).show();
                    break;
                } else if (z6) {
                    bs2.v(null, 2131749826, wuaVar.j(), R.raw.ic_unpin, 36);
                    break;
                } else {
                    wuaVar.j().I(R.raw.ic_pin, ob6.M0(2131750034, null), ob6.M0(2131750035, null)).j();
                    break;
                }
            case 18:
                wuaVar.g2();
                break;
            case 19:
                wuaVar.X1();
                break;
            case 20:
                wuaVar.W1();
                break;
            case 21:
                wuaVar.Y1();
                break;
            case 22:
                long r1 = wuaVar.r1();
                if (r1 != 0) {
                    wuaVar.Z1(r1);
                    break;
                }
                break;
            case 23:
                wua wuaVar4 = this.b;
                TL_stars.InputSavedStarGift v14 = wuaVar4.v1();
                if (v14 != null) {
                    long e2 = yac.h(wuaVar4.a).e();
                    r47 r47Var4 = wuaVar4.C2;
                    if (r47Var4 != null && (message2 = r47Var4.k) != null) {
                        TLRPC.MessageAction messageAction4 = message2.action;
                        if (messageAction4 instanceof TLRPC.TL_messageActionStarGift) {
                            TLRPC.Peer peer3 = ((TLRPC.TL_messageActionStarGift) messageAction4).peer;
                            if (peer3 != null) {
                                e2 = wf3.n(peer3);
                            }
                            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(0, wuaVar4.J0, wuaVar4.getContext());
                            String M02 = ob6.M0(2131750177, null);
                            id idVar2 = alertDialog$Builder2.a;
                            idVar2.S = M02;
                            idVar2.U = ob6.M0(2131750176, null);
                            alertDialog$Builder2.j(ob6.M0(2131751563, null), new ps0((Object) wuaVar4, (Object) v14, e2, (byte) 9));
                            alertDialog$Builder2.g(ob6.M0(2131752570, null), null);
                            alertDialog$Builder2.c(-1);
                            alertDialog$Builder2.o();
                            break;
                        }
                    }
                    if (wuaVar4.A2 != null) {
                        e2 = wuaVar4.S1;
                        AlertDialog$Builder alertDialog$Builder22 = new AlertDialog$Builder(0, wuaVar4.J0, wuaVar4.getContext());
                        String M022 = ob6.M0(2131750177, null);
                        id idVar22 = alertDialog$Builder22.a;
                        idVar22.S = M022;
                        idVar22.U = ob6.M0(2131750176, null);
                        alertDialog$Builder22.j(ob6.M0(2131751563, null), new ps0((Object) wuaVar4, (Object) v14, e2, (byte) 9));
                        alertDialog$Builder22.g(ob6.M0(2131752570, null), null);
                        alertDialog$Builder22.c(-1);
                        alertDialog$Builder22.o();
                    }
                }
                break;
            case 24:
                wuaVar.U1(true);
                break;
            case 25:
                wuaVar.R1();
                break;
            case 26:
                wuaVar.O1();
                break;
            case 27:
                TL_stars.TL_starGiftUnique B1 = wuaVar.B1();
                new ot7(wuaVar.a, wf3.n(B1.owner_id), new jra(wuaVar, (byte) 3), wuaVar.J0, wuaVar.getContext(), B1).show();
                break;
            case 28:
                TL_stars.TL_starGiftUnique B12 = wuaVar.B1();
                new ow4(wuaVar.a, wf3.n(B12.owner_id), new jra(wuaVar, b2), wuaVar.J0, wuaVar.getContext(), B12).show();
                break;
            default:
                wuaVar.dismiss();
                e S = LaunchActivity.S();
                TL_stars.TL_starGiftUnique B13 = wuaVar.B1();
                if (S != null && B13 != null) {
                    uj3 uj3Var = new uj3(qd4.j(4, "onlySelect", "dialogsType", true));
                    uj3Var.E2 = new o48((Object) wuaVar, (Object) B13, (Object) uj3Var, (byte) 14);
                    S.presentFragment(uj3Var);
                    break;
                }
                break;
        }
    }
}
