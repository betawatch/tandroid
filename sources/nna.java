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

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class nna implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ vqa b;

    public /* synthetic */ nna(vqa vqaVar, byte b) {
        this.a = b;
        this.b = vqaVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:136:0x01d1, code lost:
    
        if (android.text.TextUtils.isEmpty(r6) == false) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x01be, code lost:
    
        if (android.text.TextUtils.isEmpty(r6) == false) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x01d3, code lost:
    
        r7 = true;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:105:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x02d6  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0316  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0234  */
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
        cqa cqaVar;
        String str;
        int i;
        boolean z;
        TLRPC.Document document2;
        boolean z2;
        wsa C;
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
        tqa tqaVar;
        JSONObject u;
        TLRPC.Message message2;
        byte b = this.a;
        byte b2 = 4;
        byte b3 = 1;
        vqa vqaVar = this.b;
        switch (b) {
            case 0:
                rqa rqaVar = vqaVar.a2;
                u41 u41Var = vqaVar.f2;
                dqa dqaVar = vqaVar.K2.h;
                ImageReceiver imageReceiver = (dqaVar == null || (cqaVar = dqaVar.c) == null) ? null : ((fqa) cqaVar).d;
                be0 be0Var = rqaVar.d[0];
                if (imageReceiver != null && be0Var != null && be0Var.getImageReceiver() != null) {
                    oy8 y = imageReceiver.y();
                    oy8 y2 = be0Var.getImageReceiver().y();
                    if (y2 != null) {
                        if (y != null) {
                            y2.O(false, y.o());
                        }
                    } else if (y != null) {
                        imageReceiver.f();
                        be0Var.setImageDrawable(y);
                    }
                }
                rqaVar.b.setAlpha(1.0f);
                rqaVar.c.setAlpha(0.0f);
                if (!vqaVar.m2 || vqaVar.U1 == null || vqaVar.B2 == null || vqaVar.w1() < 0 || vqaVar.B2.b(vqaVar.w1()) < 0) {
                    u41Var.setFilled(true);
                    u41Var.i(k96.M0(2131747638, null), true, true);
                    u41Var.g(null, true);
                    u41Var.setOnClickListener(new lna(vqaVar, (byte) 11));
                    break;
                } else {
                    u41Var.setFilled(false);
                    int b4 = vqaVar.B2.b(vqaVar.w1());
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilder.append((CharSequence) k96.M0(2131749839, null));
                    Object obj = vqaVar.B2.get(b4);
                    if (!(obj instanceof TL_stars.SavedStarGift) || (starGift = ((TL_stars.SavedStarGift) obj).gift) == null || (document = starGift.getDocument()) == null) {
                        r5 = 1;
                    } else {
                        spannableStringBuilder.append((CharSequence) " e");
                        r5 = 1;
                        spannableStringBuilder.setSpan(new gm(document, u41Var.getTextPaint().getFontMetricsInt()), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
                    }
                    u41Var.i(spannableStringBuilder, r5, r5);
                    u41Var.g(null, r5);
                    u41Var.setOnClickListener(new mna(vqaVar, b4, r5));
                    break;
                }
                break;
            case 1:
                if (vqaVar.r1() != null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(vqaVar.r1().title);
                    sb.append(" #");
                    str = ls6.m(vqaVar.r1().num, ',', sb);
                } else {
                    str = "";
                }
                m21 I = vqaVar.j().I(R.raw.gift_upgrade, k96.M0(2131749833, null), gl.S2(k96.a0(null, null, 2131749834, str)));
                I.j = 5000;
                I.t = true;
                I.j();
                qh4 qh4Var = vqaVar.V1;
                if (qh4Var != null) {
                    qh4Var.c(true);
                    break;
                }
                break;
            case 2:
                vqaVar.n1.w0(((vqa) vqaVar.O2.d).N2.length - 1);
                break;
            case 3:
                new jh8((d) new hu0(vqaVar, (byte) 13), 12, false).show();
                break;
            case 4:
                vqaVar.dismiss();
                break;
            case 5:
                if (vqaVar.q3 != null) {
                    long j5 = 0;
                    for (int i4 = 0; i4 < vqaVar.q3.invoice.prices.size(); i4++) {
                        j5 += vqaVar.q3.invoice.prices.get(i4).amount;
                    }
                    Context context = vqaVar.getContext();
                    ArrayList arrayList = vqaVar.n3;
                    wjb wjbVar = vqaVar.J0;
                    tqa tqaVar2 = new tqa(context, wjbVar);
                    tqaVar2.V1 = arrayList;
                    float f = tqaVar2.u0 / gl.p;
                    LimitPreviewView limitPreviewView = new LimitPreviewView(tqaVar2.getContext(), R.drawable.star, 0, 0, wjbVar);
                    tqaVar2.W1 = limitPreviewView;
                    limitPreviewView.setTranslationY(-gl.L(14.0f));
                    limitPreviewView.setIconScale(1.8f);
                    LinearLayout.LayoutParams s = nme.s(-1, -2, 17, f, 20.0f, f, 10.0f);
                    LinearLayout linearLayout = tqaVar2.S1;
                    linearLayout.addView(limitPreviewView, s);
                    tqaVar2.Y0(j5);
                    int i5 = bkb.F6;
                    TextView b5 = hve.b(context, 20.0f, i5, true, null);
                    de9.q(b5, 17, null, 2131749852);
                    tqaVar2.setTitle(k96.M0(2131749852, null));
                    linearLayout.addView(b5, nme.t(-1, -2, 17, 32, 0, 32, 0));
                    TextView b6 = hve.b(context, 14.0f, i5, false, null);
                    de9.q(b6, 17, null, 2131749853);
                    linearLayout.addView(b6, nme.t(-1, -2, 17, 32, 10, 32, 10));
                    int currentTime = ConnectionsManager.getInstance(tqaVar2.a).getCurrentTime();
                    mfb mfbVar = new mfb(context, wjbVar);
                    boolean z4 = false;
                    for (int i6 = 0; i6 < arrayList.size(); i6++) {
                        if (currentTime <= ((TL_stars.StarGiftUpgradePrice) arrayList.get(i6)).date || ((i = i6 + 1) < arrayList.size() && currentTime <= ((TL_stars.StarGiftUpgradePrice) arrayList.get(i)).date)) {
                            Date date = new Date(r9.date * 1000);
                            mfbVar.f(k96.D0().o0().format(date) + ", " + k96.D0().p0().format(date), jva.a1(false, "⭐️ ".concat(k96.E((int) r9.upgrade_stars, ',')), 0.8f, null), null, null);
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
                            mfbVar.f(k96.D0().o0().format(date2) + ", " + k96.D0().p0().format(date2), jva.a1(false, "⭐️ ".concat(k96.E((int) starGiftUpgradePrice2.upgrade_stars, ',')), 0.8f, null), null, null);
                        }
                    }
                    float f2 = f + 14.0f;
                    linearLayout.addView(mfbVar, nme.s(-1, -2, 7, f2, 16.0f, f2, 15.0f));
                    TextView b7 = hve.b(context, 12.0f, bkb.x6, false, null);
                    de9.q(b7, 17, null, 2131749855);
                    linearLayout.addView(b7, nme.t(-1, -2, 17, 32, 0, 32, 15));
                    float f3 = tqaVar2.u0 / gl.p;
                    FrameLayout frameLayout = new FrameLayout(tqaVar2.getContext());
                    tqaVar2.T1 = frameLayout;
                    zkb.h(bkb.g5, tqaVar2.J0, frameLayout);
                    View view = new View(tqaVar2.getContext());
                    zkb.h(bkb.c7, tqaVar2.J0, view);
                    tqaVar2.T1.addView(view, nme.a(-1.0f, 1.0f / gl.p, 55));
                    u41 u41Var2 = new u41(tqaVar2.J0, tqaVar2.getContext(), true);
                    tqaVar2.U1 = u41Var2;
                    float f4 = f3 + 16.0f;
                    tqaVar2.T1.addView(u41Var2, nme.d(-1, 48.0f, kk7.D1, f4, 16.0f, f4, 16.0f));
                    tqaVar2.b.addView(tqaVar2.T1, nme.e(-1, -2, 87));
                    o39 o39Var = tqaVar2.n1;
                    o39Var.setPadding(o39Var.getPaddingLeft(), o39Var.getPaddingTop(), o39Var.getPaddingRight(), gl.L(80.0f) + o39Var.getPaddingBottom());
                    tqaVar2.U1.i(vqa.k2(k96.M0(2131743649, null)), false, true);
                    tqaVar2.U1.setOnClickListener(new bna(tqaVar2, (byte) 4));
                    vqaVar.l2 = tqaVar2;
                    tqaVar2.show();
                    break;
                }
                break;
            case 6:
                new wb5(vqaVar.getContext()).show();
                break;
            case 7:
                vqaVar.dismiss();
                break;
            case 8:
                vqa vqaVar2 = this.b;
                u41 u41Var3 = vqaVar2.f2;
                if (!u41Var3.R) {
                    TL_stars.InputSavedStarGift u1 = vqaVar2.u1();
                    k27 k27Var = vqaVar2.C2;
                    if (k27Var == null || (message = k27Var.k) == null) {
                        TL_stars.SavedStarGift savedStarGift = vqaVar2.A2;
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
                    u41Var3.setLoading(true);
                    TL_stars.saveStarGift savestargift = new TL_stars.saveStarGift();
                    savestargift.unsave = z5;
                    savestargift.stargift = u1;
                    if (vqaVar2.A2 == null || (C = gta.v(vqaVar2.a, false).C(vqaVar2.S1, false)) == null) {
                        z2 = false;
                    } else {
                        C.m(vqaVar2.A2, savestargift.unsave);
                        z2 = true;
                    }
                    ConnectionsManager.getInstance(vqaVar2.a).sendRequest(savestargift, new py6(vqaVar2, z2, document3, z5, savestargift));
                    break;
                }
                break;
            case 9:
                eq8 eq8Var = vqaVar.i3;
                if (eq8Var != null) {
                    eq8Var.run();
                }
                vqaVar.dismiss();
                break;
            case 10:
                final vqa vqaVar3 = this.b;
                final long e = y6c.h(vqaVar3.a).e();
                final TL_stars.InputSavedStarGift u12 = vqaVar3.u1();
                if (u12 != null) {
                    k27 k27Var2 = vqaVar3.C2;
                    if (k27Var2 != null) {
                        i2 = k27Var2.k.date;
                        boolean O3 = k27Var2.O3();
                        TLRPC.Message message3 = vqaVar3.C2.k;
                        if (message3 != null) {
                            TLRPC.MessageAction messageAction2 = message3.action;
                            if (messageAction2 instanceof TLRPC.TL_messageActionStarGift) {
                                TLRPC.TL_messageActionStarGift tL_messageActionStarGift2 = (TLRPC.TL_messageActionStarGift) messageAction2;
                                TLRPC.Peer peer = tL_messageActionStarGift2.peer;
                                long n = peer != null ? cf3.n(peer) : O3 ? k27.B0(message3) : e;
                                TLRPC.Peer peer2 = tL_messageActionStarGift2.from_id;
                                long n2 = peer2 != null ? cf3.n(peer2) : O3 ? e : k27.B0(vqaVar3.C2.k);
                                j = 2666000;
                                j2 = tL_messageActionStarGift2.convert_stars;
                                j4 = n2;
                                j3 = n;
                            }
                        }
                    } else {
                        j = 2666000;
                        TL_stars.SavedStarGift savedStarGift2 = vqaVar3.A2;
                        if (savedStarGift2 != null) {
                            i2 = savedStarGift2.date;
                            long n3 = ((savedStarGift2.flags & 2) == 0 || savedStarGift2.name_hidden) ? 2666000L : cf3.n(savedStarGift2.from_id);
                            j2 = vqaVar3.A2.convert_stars;
                            long j6 = n3;
                            j3 = vqaVar3.S1;
                            j4 = j6;
                        }
                    }
                    int max = Math.max(1, (((int) na7.q1(vqaVar3.a).k4.v3.g(TimeUnit.SECONDS)) - (ConnectionsManager.getInstance(vqaVar3.a).getCurrentTime() - i2)) / 86400);
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, vqaVar3.J0, vqaVar3.getContext());
                    String M0 = k96.M0(2131750210, null);
                    hd hdVar = alertDialog$Builder.a;
                    hdVar.S = M0;
                    hdVar.U = gl.S2(k96.G(max, "Gift2ConvertText2", (l7c.C(j4) || j4 == j) ? k96.M0(2131744712, null) : cf3.s(j4), k96.H(',', "Gift2ConvertStars", (int) j2)));
                    final long j7 = j2;
                    alertDialog$Builder.j(k96.M0(2131750217, null), new ed() { // from class: woa
                        @Override // ed
                        public final void u(hd hdVar2, int i8) {
                            vqa vqaVar4 = vqa.this;
                            TL_stars.InputSavedStarGift inputSavedStarGift = u12;
                            long j8 = j3;
                            long j9 = e;
                            long j10 = j7;
                            vqaVar4.getClass();
                            hd hdVar3 = new hd(3, null, a.b);
                            hdVar3.q(500L);
                            TL_stars.convertStarGift convertstargift = new TL_stars.convertStarGift();
                            convertstargift.stargift = inputSavedStarGift;
                            ConnectionsManager.getInstance(vqaVar4.a).sendRequest(convertstargift, new zna(vqaVar4, hdVar3, j8, j9, j10));
                        }
                    });
                    ug8.y(null, 2131752577, alertDialog$Builder, null);
                    break;
                }
                break;
            case 11:
                eq8 eq8Var2 = vqaVar.i3;
                if (eq8Var2 != null) {
                    eq8Var2.run();
                }
                vqaVar.dismiss();
                break;
            case 12:
                Bundle bundle = new Bundle();
                long j8 = vqaVar.S1;
                if (j8 >= 0) {
                    bundle.putLong("user_id", j8);
                } else {
                    bundle.putLong("chat_id", -j8);
                }
                if (j8 == y6c.h(vqaVar.a).e()) {
                    bundle.putBoolean("my_profile", true);
                }
                bundle.putBoolean("open_gifts", true);
                bundle.putBoolean("open_gifts_upgradable", true);
                vqa.g2(new ProfileActivity(bundle, null));
                break;
            case 13:
                eq8 eq8Var3 = vqaVar.i3;
                if (eq8Var3 != null) {
                    eq8Var3.run();
                }
                vqaVar.dismiss();
                break;
            case 14:
                vqaVar.f2.setLoading(false);
                vqaVar.z2(0, true, null);
                break;
            case 15:
                new wb5(vqaVar.getContext()).show();
                break;
            case 16:
                cm2[] cm2VarArr = vqaVar.r3;
                u41 u41Var4 = vqaVar.f2;
                if (vqaVar.W2.b == 1 && !vqaVar.J) {
                    TL_stars.InputSavedStarGift u13 = vqaVar.u1();
                    k27 k27Var3 = vqaVar.C2;
                    if (k27Var3 != null) {
                        TLRPC.MessageAction messageAction3 = k27Var3.k.action;
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
                        TL_stars.SavedStarGift savedStarGift3 = vqaVar.A2;
                        if (savedStarGift3 != null) {
                            long j10 = savedStarGift3.upgrade_stars;
                            str2 = savedStarGift3.prepaid_upgrade_hash;
                            if (j10 <= 0) {
                                break;
                            }
                            z3 = false;
                        }
                    }
                    int currentTime2 = ConnectionsManager.getInstance(vqaVar.a).getCurrentTime();
                    long j11 = 0;
                    if (vqaVar.o3 != null) {
                        for (int i8 = 0; i8 < vqaVar.o3.size(); i8++) {
                            starGiftUpgradePrice = (TL_stars.StarGiftUpgradePrice) vqaVar.o3.get(i8);
                            if (starGiftUpgradePrice.date >= currentTime2) {
                                i3 = i8;
                                if (vqaVar.q3 != null) {
                                    for (int i9 = 0; i9 < vqaVar.q3.invoice.prices.size(); i9++) {
                                        j11 += vqaVar.q3.invoice.prices.get(i9).amount;
                                    }
                                }
                                long j12 = j11;
                                if (i3 > 0 && !vqaVar.p3) {
                                    vqaVar.p3 = true;
                                    if (vqaVar.o3 != null) {
                                        for (int i10 = 0; i10 < i3; i10++) {
                                            vqaVar.o3.remove(0);
                                        }
                                    }
                                    TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
                                    if (TextUtils.isEmpty(str2)) {
                                        TLRPC.TL_inputInvoiceStarGiftPrepaidUpgrade tL_inputInvoiceStarGiftPrepaidUpgrade = new TLRPC.TL_inputInvoiceStarGiftPrepaidUpgrade();
                                        tL_inputInvoiceStarGiftPrepaidUpgrade.hash = str2;
                                        tL_inputInvoiceStarGiftPrepaidUpgrade.peer = na7.q1(vqaVar.a).h1(vqaVar.S1);
                                        tL_payments_getPaymentForm.invoice = tL_inputInvoiceStarGiftPrepaidUpgrade;
                                    } else {
                                        TLRPC.TL_inputInvoiceStarGiftUpgrade tL_inputInvoiceStarGiftUpgrade = new TLRPC.TL_inputInvoiceStarGiftUpgrade();
                                        tL_inputInvoiceStarGiftUpgrade.keep_original_details = vqaVar.r2.a.q;
                                        tL_inputInvoiceStarGiftUpgrade.stargift = u13;
                                        tL_payments_getPaymentForm.invoice = tL_inputInvoiceStarGiftUpgrade;
                                    }
                                    u = ow0.u(vqaVar.J0, false);
                                    if (u != null) {
                                        TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                                        tL_payments_getPaymentForm.theme_params = tL_dataJSON;
                                        tL_dataJSON.data = u.toString();
                                        tL_payments_getPaymentForm.flags |= 1;
                                    }
                                    ConnectionsManager.getInstance(vqaVar.a).sendRequest(tL_payments_getPaymentForm, new xoa(vqaVar, b3));
                                }
                                if (z3) {
                                    u41Var4.i(jva.T0(k96.a0(null, null, 2131749861, Long.valueOf(j12)), 1.13f, cm2VarArr), true, true);
                                } else {
                                    u41Var4.i(jva.T0(k96.a0(null, null, 2131750051, Long.valueOf(j12)), 1.13f, cm2VarArr), true, true);
                                }
                                tqaVar = vqaVar.l2;
                                if (tqaVar != null) {
                                    tqaVar.Y0(j12);
                                }
                                if (starGiftUpgradePrice == null) {
                                    int i11 = starGiftUpgradePrice.date - currentTime2;
                                    String g0 = i11 < 86400 ? gl.g0(i11, false, true) : k96.G(Math.round(i11 / 86400.0f), "Days", new Object[0]);
                                    gn gnVar = u41Var4.e;
                                    gnVar.E = false;
                                    gnVar.F = true;
                                    gnVar.G = true;
                                    gnVar.H = false;
                                    gnVar.I = false;
                                    u41Var4.g(k96.a0(null, null, 2131749860, g0), true);
                                    gl.d3(vqaVar.s3, 1000L);
                                    break;
                                } else {
                                    u41Var4.g(null, true);
                                    break;
                                }
                            }
                        }
                    }
                    starGiftUpgradePrice = null;
                    i3 = -1;
                    if (vqaVar.q3 != null) {
                    }
                    long j122 = j11;
                    if (i3 > 0) {
                        vqaVar.p3 = true;
                        if (vqaVar.o3 != null) {
                        }
                        TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm2 = new TLRPC.TL_payments_getPaymentForm();
                        if (TextUtils.isEmpty(str2)) {
                        }
                        u = ow0.u(vqaVar.J0, false);
                        if (u != null) {
                        }
                        ConnectionsManager.getInstance(vqaVar.a).sendRequest(tL_payments_getPaymentForm2, new xoa(vqaVar, b3));
                    }
                    if (z3) {
                    }
                    tqaVar = vqaVar.l2;
                    if (tqaVar != null) {
                    }
                    if (starGiftUpgradePrice == null) {
                    }
                }
                break;
            case 17:
                vqaVar.onBackPressed();
                break;
            case 18:
                TL_stars.SavedStarGift savedStarGift4 = vqaVar.A2;
                if (savedStarGift4.unsaved) {
                    savedStarGift4.unsaved = false;
                    wsa C2 = gta.v(vqaVar.a, false).C(vqaVar.S1, false);
                    if (C2 != null) {
                        TL_stars.SavedStarGift savedStarGift5 = vqaVar.A2;
                        C2.m(savedStarGift5, savedStarGift5.unsaved);
                    }
                    TL_stars.saveStarGift savestargift2 = new TL_stars.saveStarGift();
                    savestargift2.stargift = vqaVar.u1();
                    savestargift2.unsave = vqaVar.A2.unsaved;
                    ConnectionsManager.getInstance(vqaVar.a).sendRequest(savestargift2, null, 64);
                }
                TL_stars.SavedStarGift savedStarGift6 = vqaVar.A2;
                boolean z6 = savedStarGift6.pinned_to_top;
                if (((xsa) vqaVar.B2).q(savedStarGift6, !z6, false)) {
                    new sq8(vqaVar.getContext(), vqaVar.S1, vqaVar.A2, vqaVar.J0, new wf0(vqaVar, (byte) 6)).show();
                    break;
                } else if (z6) {
                    ir2.v(null, 2131749864, vqaVar.j(), R.raw.ic_unpin, 36);
                    break;
                } else {
                    vqaVar.j().I(R.raw.ic_pin, k96.M0(2131750060, null), k96.M0(2131750061, null)).j();
                    break;
                }
            case 19:
                vqaVar.f2();
                break;
            case 20:
                vqaVar.W1();
                break;
            case 21:
                vqaVar.V1();
                break;
            case 22:
                vqaVar.X1();
                break;
            case 23:
                long q1 = vqaVar.q1();
                if (q1 != 0) {
                    vqaVar.Y1(q1);
                    break;
                }
                break;
            case 24:
                vqa vqaVar4 = this.b;
                TL_stars.InputSavedStarGift u14 = vqaVar4.u1();
                if (u14 != null) {
                    long e2 = y6c.h(vqaVar4.a).e();
                    k27 k27Var4 = vqaVar4.C2;
                    if (k27Var4 != null && (message2 = k27Var4.k) != null) {
                        TLRPC.MessageAction messageAction4 = message2.action;
                        if (messageAction4 instanceof TLRPC.TL_messageActionStarGift) {
                            TLRPC.Peer peer3 = ((TLRPC.TL_messageActionStarGift) messageAction4).peer;
                            if (peer3 != null) {
                                e2 = cf3.n(peer3);
                            }
                            long j13 = e2;
                            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(0, vqaVar4.J0, vqaVar4.getContext());
                            String M02 = k96.M0(2131750202, null);
                            hd hdVar2 = alertDialog$Builder2.a;
                            hdVar2.S = M02;
                            hdVar2.U = k96.M0(2131750201, null);
                            alertDialog$Builder2.j(k96.M0(2131751586, null), new hs0((Object) vqaVar4, (Object) u14, j13, (byte) 8));
                            alertDialog$Builder2.g(k96.M0(2131752577, null), null);
                            alertDialog$Builder2.c(-1);
                            alertDialog$Builder2.o();
                            break;
                        }
                    }
                    if (vqaVar4.A2 != null) {
                        e2 = vqaVar4.S1;
                        long j132 = e2;
                        AlertDialog$Builder alertDialog$Builder22 = new AlertDialog$Builder(0, vqaVar4.J0, vqaVar4.getContext());
                        String M022 = k96.M0(2131750202, null);
                        hd hdVar22 = alertDialog$Builder22.a;
                        hdVar22.S = M022;
                        hdVar22.U = k96.M0(2131750201, null);
                        alertDialog$Builder22.j(k96.M0(2131751586, null), new hs0((Object) vqaVar4, (Object) u14, j132, (byte) 8));
                        alertDialog$Builder22.g(k96.M0(2131752577, null), null);
                        alertDialog$Builder22.c(-1);
                        alertDialog$Builder22.o();
                    }
                }
                break;
            case 25:
                vqaVar.T1(true);
                break;
            case 26:
                vqaVar.Q1();
                break;
            case 27:
                vqaVar.N1();
                break;
            case 28:
                TL_stars.TL_starGiftUnique A1 = vqaVar.A1();
                new iq7(vqaVar.a, cf3.n(A1.owner_id), new nna(vqaVar, b2), vqaVar.J0, vqaVar.getContext(), A1).show();
                break;
            default:
                TL_stars.TL_starGiftUnique A12 = vqaVar.A1();
                new lu4(vqaVar.a, cf3.n(A12.owner_id), new nna(vqaVar, (byte) 7), vqaVar.J0, vqaVar.getContext(), A12).show();
                break;
        }
    }
}
