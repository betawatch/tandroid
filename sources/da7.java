// default package

import android.app.Activity;
import android.app.DownloadManager;
import android.content.Context;
import android.content.Intent;
import android.graphics.SurfaceTexture;
import android.graphics.drawable.ShapeDrawable;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.text.SpannableString;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.content.FileProvider;
import j$.util.Objects;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import org.json.JSONObject;
import org.telegram.messenger.a;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.camera.CameraSession;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.c;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.web.BotWebViewContainer$WebViewProxy;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class da7 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ da7(qw0 qw0Var, TLObject tLObject, String[] strArr, TLRPC.TL_error tL_error, he heVar) {
        this.a = (byte) 8;
        this.b = qw0Var;
        this.d = tLObject;
        this.e = strArr;
        this.c = tL_error;
        this.f = heVar;
    }

    private final void a() {
        vg2 vg2Var = (vg2) this.b;
        ArrayList arrayList = (ArrayList) this.d;
        vh6 vh6Var = (vh6) this.e;
        ArrayList arrayList2 = (ArrayList) this.f;
        ArrayList arrayList3 = (ArrayList) this.c;
        bu9 bu9Var = vg2Var.h;
        wg2 wg2Var = vg2Var.E;
        if (wg2Var.o1) {
            vg2Var.s = false;
            vg2Var.d = arrayList;
            vg2Var.e = vh6Var;
            vg2Var.f = arrayList2;
            bu9Var.f(arrayList, null);
            if (!sd2.T(wg2Var.n)) {
                ArrayList arrayList4 = bu9Var.g;
                arrayList4.clear();
                arrayList4.addAll(arrayList3);
            }
            int i = vg2Var.r;
            vg2Var.f();
            if (vg2Var.r > i) {
                wg2Var.C0(i);
            }
            if (bu9Var.e() || vg2Var.r != 0) {
                return;
            }
            wg2Var.b.e(false, true);
        }
    }

    private final void b() {
        hx2 hx2Var = (hx2) this.b;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) this.c;
        TLObject tLObject = (TLObject) this.d;
        ArrayList arrayList = (ArrayList) this.e;
        TLRPC.TL_messages_getMyStickers tL_messages_getMyStickers = (TLRPC.TL_messages_getMyStickers) this.f;
        if (tL_error == null && (tLObject instanceof TLRPC.TL_messages_myStickers)) {
            TLRPC.TL_messages_myStickers tL_messages_myStickers = (TLRPC.TL_messages_myStickers) tLObject;
            ArrayList<TLRPC.StickerSetCovered> arrayList2 = tL_messages_myStickers.sets;
            int size = arrayList2.size();
            int i = 0;
            while (i < size) {
                TLRPC.StickerSetCovered stickerSetCovered = arrayList2.get(i);
                i++;
                TLRPC.StickerSetCovered stickerSetCovered2 = stickerSetCovered;
                TLRPC.StickerSet stickerSet = stickerSetCovered2.set;
                if (!stickerSet.emojis && !stickerSet.masks) {
                    TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
                    tL_inputStickerSetID.id = stickerSetCovered2.set.id;
                    TLRPC.TL_messages_stickerSet n0 = hs6.d0(hx2Var.r).n0(tL_inputStickerSetID, true);
                    if (n0 == null || n0.documents.size() < 120) {
                        arrayList.add(stickerSetCovered2);
                    }
                }
            }
            if (tL_messages_myStickers.sets.size() == tL_messages_getMyStickers.limit) {
                tL_messages_getMyStickers.offset_id = ((TLRPC.StickerSetCovered) b10.f(1, tL_messages_myStickers.sets)).set.id;
                ConnectionsManager.getInstance(hx2Var.r).sendRequest(tL_messages_getMyStickers, new eo0((Object) hx2Var, (Object) arrayList, (Object) tL_messages_getMyStickers, (byte) 20));
            }
        }
    }

    private final void c() {
        e94 e94Var = (e94) this.b;
        TLObject tLObject = (TLObject) this.d;
        TLRPC.TL_getFactCheck tL_getFactCheck = (TLRPC.TL_getFactCheck) this.e;
        ArrayList arrayList = (ArrayList) this.f;
        HashMap hashMap = (HashMap) this.c;
        ArrayList arrayList2 = new ArrayList();
        if (tLObject instanceof Vector) {
            ArrayList<T> arrayList3 = ((Vector) tLObject).objects;
            for (int i = 0; i < arrayList3.size(); i++) {
                if (arrayList3.get(i) instanceof TLRPC.TL_factCheck) {
                    arrayList2.add((TLRPC.TL_factCheck) arrayList3.get(i));
                }
            }
        }
        HashMap hashMap2 = new HashMap();
        for (int i2 = 0; i2 < Math.min(tL_getFactCheck.msg_id.size(), arrayList2.size()); i2++) {
            Integer num = tL_getFactCheck.msg_id.get(i2);
            num.getClass();
            hashMap2.put(num, (TLRPC.TL_factCheck) arrayList2.get(i2));
        }
        int i3 = 0;
        for (int i4 = 0; i4 < tL_getFactCheck.msg_id.size(); i4++) {
            d94 d94Var = (d94) arrayList.get(i4);
            Integer num2 = tL_getFactCheck.msg_id.get(i4);
            num2.getClass();
            TLRPC.TL_factCheck tL_factCheck = (TLRPC.TL_factCheck) hashMap2.get(num2);
            qac qacVar = (qac) hashMap.get(d94Var);
            if (tL_factCheck != null && !tL_factCheck.need_check && qacVar != null) {
                qacVar.a(tL_factCheck);
                i3++;
                e94Var.d.remove(d94Var);
            }
        }
        if (i3 > 0) {
            nm7.f(e94Var.a).k(nm7.D3, new Object[0]);
        }
    }

    private final void d() {
        mw4 mw4Var = (mw4) this.b;
        k11 k11Var = (k11) this.d;
        he heVar = (he) this.e;
        TLRPC.Updates updates = (TLRPC.Updates) this.f;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) this.c;
        npa npaVar = mw4Var.D1;
        if (npaVar != null) {
            npaVar.run();
        }
        k11Var.c(false);
        heVar.dismiss();
        mw4Var.dismiss();
        d S = LaunchActivity.S();
        if (S != null) {
            if (updates == null) {
                c41.b0(S).g0(tL_error, false);
                return;
            }
            u31 I = c41.b0(S).I(R.raw.forward, jb6.M0(2131749632, null), gm.S2(jb6.a0(null, null, 2131749633, mw4Var.n1, pg3.s(mw4Var.o1))));
            I.u = true;
            I.j();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:282:0x06b0  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x06b7  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x06c5  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x06e5  */
    /* JADX WARN: Removed duplicated region for block: B:334:0x0784  */
    /* JADX WARN: Type inference failed for: r2v4, types: [org.telegram.ui.ActionBar.AlertDialog$Builder] */
    /* JADX WARN: Type inference failed for: r3v15, types: [android.view.View, android.view.ViewGroup, android.widget.LinearLayout] */
    /* JADX WARN: Type inference failed for: r3v39, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r5v5, types: [android.view.View, io, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v2, types: [int] */
    /* JADX WARN: Type inference failed for: r8v12, types: [android.view.View, android.view.ViewGroup, android.widget.LinearLayout] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        String str;
        String str2;
        String str3;
        LaunchActivity launchActivity;
        int i;
        String str4;
        String str5;
        byte b = this.a;
        final byte b2 = 0;
        int i2 = 0;
        int i3 = 0;
        Object obj = this.c;
        Object obj2 = this.f;
        Object obj3 = this.e;
        Object obj4 = this.d;
        Object obj5 = this.b;
        switch (b) {
            case 0:
                oc7 oc7Var = (oc7) obj5;
                TLRPC.User user = (TLRPC.User) obj4;
                TLRPC.Chat chat = (TLRPC.Chat) obj3;
                ac7 ac7Var = (ac7) obj2;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                d Q = LaunchActivity.Q();
                if (Q != null && Q.getParentActivity() != null) {
                    i46 i46Var = new i46(11, oc7Var.currentAccount, null, Q.getParentActivity(), Q);
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(user);
                    i46Var.t1(chat, arrayList, null, null, null);
                    i46Var.show();
                }
                ac7Var.b(tL_error);
                break;
            case 1:
                ik.c0(((oc7) obj5).currentAccount, (TLRPC.TL_error) obj, (d) obj4, (TLRPC.TL_channels_updateUsername) obj3, new Object[0]);
                ((Runnable) obj2).run();
                break;
            case 2:
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj;
                x0 x0Var = (x0) obj4;
                TLObject tLObject = (TLObject) obj3;
                oc7 oc7Var2 = (oc7) obj5;
                iu iuVar = (iu) obj2;
                if (tL_error2 != null) {
                    x0Var.a(tL_error2);
                    break;
                } else if (tLObject instanceof TL_stories.TL_premium_myBoosts) {
                    TL_stories.TL_premium_myBoosts tL_premium_myBoosts = (TL_stories.TL_premium_myBoosts) tLObject;
                    oc7Var2.d4(tL_premium_myBoosts.users, false);
                    oc7Var2.X3(tL_premium_myBoosts.chats, false);
                    iuVar.a(tL_premium_myBoosts);
                    break;
                }
                break;
            case 3:
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj;
                qac qacVar = (qac) obj4;
                TLObject tLObject2 = (TLObject) obj3;
                oc7 oc7Var3 = (oc7) obj5;
                qac qacVar2 = (qac) obj2;
                if (tL_error3 != null) {
                    qacVar.a(tL_error3);
                    break;
                } else if (tLObject2 instanceof TL_stories.TL_premium_myBoosts) {
                    TL_stories.TL_premium_myBoosts tL_premium_myBoosts2 = (TL_stories.TL_premium_myBoosts) tLObject2;
                    oc7Var3.d4(tL_premium_myBoosts2.users, false);
                    oc7Var3.X3(tL_premium_myBoosts2.chats, false);
                    qacVar2.a(tL_premium_myBoosts2);
                    break;
                }
                break;
            case 4:
                TLObject tLObject3 = (TLObject) obj4;
                oc7 oc7Var4 = (oc7) obj5;
                jv0 jv0Var = (jv0) obj3;
                vn0 vn0Var = (vn0) obj2;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) obj;
                if (tLObject3 instanceof TLRPC.TL_payments_checkedGiftCode) {
                    TLRPC.TL_payments_checkedGiftCode tL_payments_checkedGiftCode = (TLRPC.TL_payments_checkedGiftCode) tLObject3;
                    oc7Var4.X3(tL_payments_checkedGiftCode.chats, false);
                    oc7Var4.d4(tL_payments_checkedGiftCode.users, false);
                    jv0Var.a(tL_payments_checkedGiftCode);
                }
                vn0Var.a(tL_error4);
                break;
            case 5:
                qw0 qw0Var = (qw0) obj5;
                String str6 = (String) obj4;
                TLRPC.TL_inputInvoiceSlug tL_inputInvoiceSlug = (TLRPC.TL_inputInvoiceSlug) obj3;
                TLObject tLObject4 = (TLObject) obj2;
                if (((TLRPC.TL_error) obj) != null) {
                    qw0Var.D(str6, "failed", false);
                    break;
                } else {
                    qw0Var.c.n(tL_inputInvoiceSlug, str6, tLObject4);
                    break;
                }
            case 6:
                qw0 qw0Var2 = (qw0) obj5;
                ow0 ow0Var = (ow0) obj3;
                String str7 = (String) obj2;
                String str8 = (String) obj;
                if (((TLObject) obj4) instanceof TLRPC.TL_boolTrue) {
                    Context context = qw0Var2.getContext();
                    String r = m9c.r(qw0Var2.V);
                    final jv0 jv0Var2 = new jv0((Object) qw0Var2, (Object) ow0Var, (Object) str7, (Object) str8, (byte) 1);
                    HashMap hashMap = mq0.g;
                    ?? alertDialog$Builder = new AlertDialog$Builder(context);
                    String M0 = jb6.M0(2131753060, null);
                    he heVar = alertDialog$Builder.a;
                    heVar.S = M0;
                    heVar.U = gm.S2(jb6.a0(null, null, 2131753061, r));
                    ?? linearLayout = new LinearLayout(context);
                    linearLayout.setPadding(gm.L(22.0f), 0, gm.L(22.0f), 0);
                    linearLayout.setOrientation(0);
                    ImageView imageView = new ImageView(context);
                    imageView.setScaleType(ImageView.ScaleType.CENTER);
                    int L = gm.L(44.0f);
                    int i4 = cmb.Ei;
                    ShapeDrawable K = cmb.K(L, cmb.w0(null, i4, false));
                    wmb M = anb.M(i4);
                    imageView.setBackground(K);
                    anb.j(imageView, K, M, null, null);
                    imageView.setImageResource(R.drawable.msg_round_file_s);
                    linearLayout.addView(imageView, qoe.t(44, 44, 19, 0, 0, 10, 0));
                    ?? linearLayout2 = new LinearLayout(context);
                    linearLayout2.setOrientation(1);
                    TextView textView = new TextView(context);
                    textView.setTextSize(1, 15.0f);
                    textView.setTypeface(gm.o());
                    textView.setText(str8);
                    anb.X(textView, cmb.m5, null);
                    linearLayout2.addView(textView, qoe.k(0.0f, 0.0f, 0.0f, 3.0f, -1, -2));
                    ?? ioVar = new io(context, true, true, true);
                    ioVar.setTextSize(gm.L(12.0f));
                    SpannableString spannableString = new SpannableString("l");
                    ta6 ta6Var = new ta6(gm.L(55.0f), ioVar);
                    int i5 = cmb.ue;
                    ta6Var.a(cmb.p1(0.35f, cmb.w0(null, i5, false)), cmb.p1(0.075f, cmb.w0(null, i5, false)));
                    spannableString.setSpan(ta6Var, 0, 1, 33);
                    ioVar.setText(spannableString);
                    f fVar = new f(ioVar, (byte) 16);
                    HashMap hashMap2 = mq0.h;
                    if (hashMap2.containsKey(str7)) {
                        Pair pair = (Pair) hashMap2.get(str7);
                        fVar.a((String) pair.first, (Long) pair.second);
                    } else {
                        new gq0(str7, fVar).execute(str7);
                    }
                    anb.U(ioVar, i5, null);
                    linearLayout2.addView(ioVar, qoe.o(-1, 15));
                    linearLayout.addView(linearLayout2, qoe.t(-1, -2, 23, 0, 0, 0, 2));
                    alertDialog$Builder.n(linearLayout);
                    final byte b3 = 1;
                    final boolean[] zArr = new boolean[1];
                    alertDialog$Builder.g(jb6.M0(2131752542, null), new ee() { // from class: fq0
                        @Override // ee
                        public final void r(he heVar2, int i6) {
                            byte b4 = b2;
                            jv0 jv0Var3 = jv0Var2;
                            boolean[] zArr2 = zArr;
                            switch (b4) {
                                case 0:
                                    if (!zArr2[0]) {
                                        jv0Var3.a(Boolean.FALSE);
                                        zArr2[0] = true;
                                        break;
                                    }
                                    break;
                                default:
                                    if (!zArr2[0]) {
                                        jv0Var3.a(Boolean.TRUE);
                                        zArr2[0] = true;
                                        break;
                                    }
                                    break;
                            }
                        }
                    });
                    alertDialog$Builder.j(jb6.M0(2131753062, null), new ee() { // from class: fq0
                        @Override // ee
                        public final void r(he heVar2, int i6) {
                            byte b4 = b3;
                            jv0 jv0Var3 = jv0Var2;
                            boolean[] zArr2 = zArr;
                            switch (b4) {
                                case 0:
                                    if (!zArr2[0]) {
                                        jv0Var3.a(Boolean.FALSE);
                                        zArr2[0] = true;
                                        break;
                                    }
                                    break;
                                default:
                                    if (!zArr2[0]) {
                                        jv0Var3.a(Boolean.TRUE);
                                        zArr2[0] = true;
                                        break;
                                    }
                                    break;
                            }
                        }
                    });
                    heVar.setOnDismissListener(new dg(zArr, jv0Var2, (byte) 5));
                    heVar.show();
                    break;
                } else {
                    qw0Var2.u(ow0Var, "file_download_requested", qw0.x("cancelled", "status"));
                    break;
                }
            case 7:
                qw0 qw0Var3 = (qw0) obj5;
                ow0 ow0Var2 = (ow0) obj3;
                String str9 = (String) obj2;
                String str10 = (String) obj;
                if (((WebView) obj4) != qw0Var3.a || !qw0Var3.m(ow0Var2)) {
                    qw0Var3.e("onBotWebMessage ignored after document change");
                    break;
                } else {
                    qw0Var3.C(qw0Var3.s0, ow0Var2, str9, str10);
                    break;
                }
            case 8:
                qw0 qw0Var4 = (qw0) obj5;
                TLObject tLObject5 = (TLObject) obj4;
                String[] strArr = (String[]) obj3;
                TLRPC.TL_error tL_error5 = (TLRPC.TL_error) obj;
                he heVar2 = (he) obj2;
                if (tLObject5 != null) {
                    strArr[0] = "allowed";
                    if (tLObject5 instanceof TLRPC.Updates) {
                        oc7.r1(qw0Var4.N).T3((TLRPC.Updates) tLObject5, false);
                    }
                }
                if (tL_error5 != null) {
                    qw0Var4.Y(tL_error5.text);
                }
                heVar2.dismiss();
                break;
            case 9:
                String str11 = (String) obj4;
                String str12 = (String) obj3;
                String str13 = (String) obj2;
                String str14 = (String) obj;
                mw0 mw0Var = ((lw0) obj5).a;
                try {
                    DownloadManager.Request request = new DownloadManager.Request(Uri.parse(str11));
                    request.setMimeType(str12);
                    request.addRequestHeader("User-Agent", str13);
                    request.setDescription(jb6.M0(2131742591, null));
                    request.setTitle(str14);
                    request.setNotificationVisibility(1);
                    request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, str14);
                    DownloadManager downloadManager = (DownloadManager) mw0Var.getContext().getSystemService("download");
                    if (downloadManager != null) {
                        downloadManager.enqueue(request);
                    }
                    qw0 qw0Var5 = mw0Var.R;
                    if (qw0Var5 != null) {
                        new c41(qw0Var5, qw0Var5.e).Q(R.raw.ic_download, 36, gm.S2(jb6.a0(null, null, 2131742590, str14))).k(true);
                        break;
                    }
                } catch (Exception e) {
                    fc4.g(e, true);
                    return;
                }
                break;
            case 10:
                BotWebViewContainer$WebViewProxy botWebViewContainer$WebViewProxy = (BotWebViewContainer$WebViewProxy) obj5;
                String str15 = (String) obj4;
                byte[] bArr = (byte[]) obj3;
                String str16 = (String) obj2;
                String str17 = (String) obj;
                mw0 mw0Var2 = botWebViewContainer$WebViewProxy.b;
                if (botWebViewContainer$WebViewProxy.a != null) {
                    long currentTimeMillis = System.currentTimeMillis();
                    qw0 qw0Var6 = botWebViewContainer$WebViewProxy.a;
                    if (currentTimeMillis - qw0Var6.Q > 10000) {
                        mw0Var2.c("window.navigator.__share__receive(\"security\")");
                        break;
                    } else {
                        qw0Var6.Q = 0L;
                        Context context2 = mw0Var2.getContext();
                        Activity W = gm.W(context2);
                        if (W == null && (launchActivity = LaunchActivity.H1) != null) {
                            W = launchActivity;
                        }
                        if (context2 == null || W == null || !(W instanceof LaunchActivity) || W.isFinishing() || !mw0Var2.isAttachedToWindow()) {
                            mw0Var2.c("window.navigator.__share__receive(\"security\")");
                            break;
                        } else {
                            LaunchActivity launchActivity2 = (LaunchActivity) W;
                            try {
                                JSONObject jSONObject = new JSONObject(str15);
                                str = jSONObject.optString("url", null);
                                try {
                                    str2 = jSONObject.optString("text", null);
                                } catch (Exception e2) {
                                    e = e2;
                                    str2 = null;
                                }
                                try {
                                    str3 = jSONObject.optString("title", null);
                                } catch (Exception e3) {
                                    e = e3;
                                    fc4.g(e, true);
                                    str3 = null;
                                    StringBuilder sb = new StringBuilder();
                                    if (str3 != null) {
                                    }
                                    if (str2 != null) {
                                    }
                                    if (str != null) {
                                    }
                                    Intent intent = new Intent("android.intent.action.SEND");
                                    intent.putExtra("android.intent.extra.TEXT", sb.toString());
                                    if (bArr == null) {
                                    }
                                    launchActivity2.q1 = new mf2(botWebViewContainer$WebViewProxy, (byte) 9);
                                    launchActivity2.startActivityForResult(Intent.createChooser(intent, jb6.M0(2131745193, null)), 521);
                                    return;
                                }
                            } catch (Exception e4) {
                                e = e4;
                                str = null;
                                str2 = null;
                            }
                            StringBuilder sb2 = new StringBuilder();
                            if (str3 != null) {
                                sb2.append(str3);
                            }
                            if (str2 != null) {
                                if (sb2.length() > 0) {
                                    sb2.append("\n");
                                }
                                sb2.append(str2);
                            }
                            if (str != null) {
                                if (sb2.length() > 0) {
                                    sb2.append("\n");
                                }
                                sb2.append(str);
                            }
                            Intent intent2 = new Intent("android.intent.action.SEND");
                            intent2.putExtra("android.intent.extra.TEXT", sb2.toString());
                            if (bArr == null) {
                                File file = null;
                                while (true) {
                                    if (file == null || file.exists()) {
                                        File z = bc4.z(4);
                                        StringBuilder sb3 = new StringBuilder();
                                        sb3.append(bc4.q(str16 == null ? "file" : str16));
                                        sb3.append(b2 > 0 ? td4.o(b2, " (", ")") : "");
                                        file = new File(z, sb3.toString());
                                        b2++;
                                    } else {
                                        try {
                                            FileOutputStream fileOutputStream = new FileOutputStream(file);
                                            fileOutputStream.write(bArr);
                                            fileOutputStream.close();
                                        } catch (Exception e5) {
                                            fc4.g(e5, true);
                                        }
                                        try {
                                            if (str17 == null) {
                                                intent2.setType("text/plain");
                                            } else {
                                                intent2.setType(str17);
                                            }
                                            if (str16 != null) {
                                                intent2.putExtra("android.intent.extra.TITLE", str16);
                                            }
                                            if (Build.VERSION.SDK_INT >= 24) {
                                                try {
                                                    StringBuilder sb4 = new StringBuilder();
                                                    a.d();
                                                    sb4.append("org.telegram.messenger.beta");
                                                    sb4.append(".provider");
                                                    intent2.putExtra("android.intent.extra.STREAM", FileProvider.c(launchActivity2, sb4.toString(), file));
                                                    intent2.setFlags(1);
                                                } catch (Exception unused) {
                                                    intent2.putExtra("android.intent.extra.STREAM", Uri.fromFile(file));
                                                }
                                            } else {
                                                intent2.putExtra("android.intent.extra.STREAM", Uri.fromFile(file));
                                            }
                                        } catch (Exception e6) {
                                            fc4.g(e6, true);
                                        }
                                    }
                                }
                            } else {
                                intent2.setType("text/plain");
                            }
                            launchActivity2.q1 = new mf2(botWebViewContainer$WebViewProxy, (byte) 9);
                            launchActivity2.startActivityForResult(Intent.createChooser(intent2, jb6.M0(2131745193, null)), 521);
                        }
                    }
                }
                break;
            case 11:
                w81 w81Var = (w81) obj5;
                b81 b81Var = (b81) obj4;
                TLRPC.TL_documentAttributeAudio tL_documentAttributeAudio = (TLRPC.TL_documentAttributeAudio) obj3;
                b81Var.e.b = false;
                tL_documentAttributeAudio.title = (String) obj2;
                tL_documentAttributeAudio.performer = (String) obj;
                wgc wgcVar = w81Var.n;
                for (int i6 = 0; i6 < wgcVar.getViewPages().length; i6++) {
                    r59 a = w81Var.a(wgcVar.getViewPages()[i6]);
                    if (a != null && ((h81) a.getAdapter()).d == 3) {
                        h81 h81Var = (h81) a.getAdapter();
                        int i7 = 0;
                        while (true) {
                            if (i7 >= h81Var.e.size()) {
                                break;
                            } else if (((p81) h81Var.e.get(i7)).d == b81Var) {
                                h81Var.g(i7);
                            } else {
                                i7++;
                            }
                        }
                    }
                }
                break;
            case 12:
                ((CameraController) obj5).lambda$open$10((CameraSession) obj4, (Runnable) obj3, (SurfaceTexture) obj2, (Runnable) obj);
                break;
            case 13:
                uf1 uf1Var = (uf1) obj5;
                String str18 = (String) obj4;
                TLRPC.TL_error tL_error6 = (TLRPC.TL_error) obj;
                TLObject tLObject6 = (TLObject) obj3;
                TL_account.checkUsername checkusername = (TL_account.checkUsername) obj2;
                uf1Var.e = 0;
                String str19 = uf1Var.f;
                if (str19 != null && str19.equals(str18)) {
                    if (tL_error6 != null || !(tLObject6 instanceof TLRPC.TL_boolTrue)) {
                        if (uf1Var.H != null) {
                            if (tL_error6 != null && "USERNAME_INVALID".equals(tL_error6.text) && checkusername.username.length() == 4) {
                                uf1Var.H.setText(jb6.M0(2131743341, null));
                                sf1 sf1Var = uf1Var.H;
                                int i8 = cmb.o7;
                                sf1Var.setTag(Integer.valueOf(i8));
                                anb.X(uf1Var.H, i8, null);
                            } else if (tL_error6 == null || !"USERNAME_PURCHASE_AVAILABLE".equals(tL_error6.text)) {
                                uf1Var.H.setText(jb6.M0(2131743345, null));
                                sf1 sf1Var2 = uf1Var.H;
                                int i9 = cmb.o7;
                                sf1Var2.setTag(Integer.valueOf(i9));
                                anb.X(uf1Var.H, i9, null);
                            } else {
                                int length = checkusername.username.length();
                                sf1 sf1Var3 = uf1Var.H;
                                if (length == 4) {
                                    sf1Var3.setText(jb6.M0(2131743340, null));
                                } else {
                                    sf1Var3.setText(jb6.M0(2131743344, null));
                                }
                                sf1 sf1Var4 = uf1Var.H;
                                int i10 = cmb.E6;
                                sf1Var4.setTag(Integer.valueOf(i10));
                                anb.X(uf1Var.H, i10, null);
                            }
                            tf1 tf1Var = uf1Var.G;
                            if (tf1Var != null) {
                                int i11 = tf1.f;
                                tf1Var.a();
                                break;
                            }
                        }
                    } else {
                        sf1 sf1Var5 = uf1Var.H;
                        if (sf1Var5 != null) {
                            sf1Var5.setText(jb6.a0("UsernameAvailable", null, 2131743354, str18));
                            sf1 sf1Var6 = uf1Var.H;
                            int i12 = cmb.v6;
                            sf1Var6.setTag(Integer.valueOf(i12));
                            anb.X(uf1Var.H, i12, null);
                            tf1 tf1Var2 = uf1Var.G;
                            if (tf1Var2 != null) {
                                int i13 = tf1.f;
                                tf1Var2.a();
                                break;
                            }
                        }
                    }
                }
                break;
            case 14:
                TLRPC.TL_messages_exportedChatInvite tL_messages_exportedChatInvite = (TLRPC.TL_messages_exportedChatInvite) obj3;
                boolean[] zArr2 = (boolean[]) obj2;
                he heVar3 = (he) obj;
                vg1 vg1Var = ((qg1) obj5).a.n;
                vg1Var.B0 = false;
                vg1Var.z0.put(((TLRPC.TL_chatInviteExported) obj4).link, tL_messages_exportedChatInvite == null ? 0 : tL_messages_exportedChatInvite);
                if (!zArr2[0]) {
                    heVar3.dismiss();
                    if (tL_messages_exportedChatInvite != null) {
                        vg1Var.e1(tL_messages_exportedChatInvite, vg1Var.A0);
                        break;
                    } else {
                        ts2.u(null, 2131748670, c41.b0(vg1Var), R.raw.linkbroken, 36);
                        break;
                    }
                }
                break;
            case 15:
                vi1 vi1Var = (vi1) obj5;
                boolean[] zArr3 = (boolean[]) obj4;
                int[] iArr = (int[]) obj3;
                int[] iArr2 = (int[]) obj2;
                TLRPC.TL_error tL_error7 = (TLRPC.TL_error) obj;
                vi1Var.getClass();
                if (!zArr3[0] && (i = iArr[0]) < iArr2[0]) {
                    byte b4 = 1;
                    if (tL_error7 != null) {
                        zArr3[0] = true;
                        if ("BOOSTS_REQUIRED".equals(tL_error7.text)) {
                            vi1Var.getMessagesController().F0().b(vi1Var.a, vi1Var.c, new zh1(vi1Var, b4));
                            break;
                        } else {
                            vi1Var.Q.setLoading(false);
                            c41.b0(vi1Var).Q(R.raw.error, 36, jb6.a0(null, null, 2131743565, tL_error7.text)).j();
                            break;
                        }
                    } else {
                        int i14 = i + 1;
                        iArr[0] = i14;
                        if (i14 == iArr2[0]) {
                            vi1Var.finishFragment();
                            d dVar = vi1Var.m0;
                            if (dVar != null) {
                                if (dVar instanceof ba2) {
                                    ((ba2) dVar).t0();
                                }
                                ts2.u(null, vi1Var.d ? 2131749255 : 2131752406, c41.b0(vi1Var.m0), R.raw.contact_check, 36);
                                vi1Var.m0 = null;
                            }
                            vi1Var.Q.setLoading(false);
                            break;
                        }
                    }
                }
                break;
            case 16:
                fj1 fj1Var = (fj1) obj5;
                String str20 = (String) obj4;
                TLRPC.TL_error tL_error8 = (TLRPC.TL_error) obj;
                TLObject tLObject7 = (TLObject) obj3;
                TLRPC.TL_channels_checkUsername tL_channels_checkUsername = (TLRPC.TL_channels_checkUsername) obj2;
                fj1Var.Y = 0;
                String str21 = fj1Var.Z;
                if (str21 != null && str21.equals(str20)) {
                    if (tL_error8 == null) {
                        if (tLObject7 instanceof TLRPC.TL_boolTrue) {
                            fj1Var.W.setText(jb6.a0("LinkAvailable", null, 2131748681, str20));
                            sf1 sf1Var7 = fj1Var.W;
                            int i15 = cmb.v6;
                            sf1Var7.setTag(Integer.valueOf(i15));
                            anb.X(fj1Var.W, i15, null);
                            fj1Var.b0 = true;
                            break;
                        }
                    } else if ("USERNAME_INVALID".equals(tL_error8.text) && tL_channels_checkUsername.username.length() == 4) {
                        fj1Var.W.setText(jb6.M0(2131743341, null));
                        anb.X(fj1Var.W, cmb.o7, null);
                        fj1Var.b0 = false;
                        break;
                    }
                    if (tL_error8 != null) {
                        if ("USERNAME_PURCHASE_AVAILABLE".equals(tL_error8.text)) {
                            int length2 = tL_channels_checkUsername.username.length();
                            sf1 sf1Var8 = fj1Var.W;
                            if (length2 == 4) {
                                sf1Var8.setText(jb6.M0(2131743340, null));
                            } else {
                                sf1Var8.setText(jb6.M0(2131743344, null));
                            }
                            anb.X(fj1Var.W, cmb.E6, null);
                        } else if ("CHANNELS_ADMIN_PUBLIC_TOO_MUCH".equals(tL_error8.text)) {
                            anb.X(fj1Var.W, cmb.o7, null);
                            fj1Var.l0 = false;
                            fj1Var.l0();
                        }
                        fj1Var.b0 = false;
                    }
                    anb.X(fj1Var.W, cmb.o7, null);
                    fj1Var.W.setText(jb6.M0(2131748669, null));
                    fj1Var.b0 = false;
                }
                break;
            case 17:
                yv1 yv1Var = (yv1) obj5;
                boolean[] zArr4 = (boolean[]) obj4;
                boolean[] zArr5 = (boolean[]) obj3;
                ImageView imageView2 = (ImageView) obj2;
                ImageView imageView3 = (ImageView) obj;
                if (!zArr4[0]) {
                    zArr4[0] = true;
                    long[] jArr = {-1};
                    l97 l97Var = new l97(jArr, zArr5, imageView2, imageView3, (byte) 28);
                    TLRPC.TL_messages_rateTranscribedAudio tL_messages_rateTranscribedAudio = new TLRPC.TL_messages_rateTranscribedAudio();
                    tL_messages_rateTranscribedAudio.msg_id = yv1Var.v5.e1();
                    tL_messages_rateTranscribedAudio.peer = yv1Var.getMessagesController().l1(yv1Var.v5.k.peer_id);
                    tL_messages_rateTranscribedAudio.transcription_id = yv1Var.v5.k.voiceTranscriptionId;
                    tL_messages_rateTranscribedAudio.good = zArr5[0];
                    yv1Var.getConnectionsManager().sendRequest(tL_messages_rateTranscribedAudio, new eo0((Object) yv1Var, (Object) l97Var, (Object) jArr, (byte) 16));
                    gm.d3(l97Var, 150L);
                    break;
                }
                break;
            case 18:
                ((yv1) obj5).f9((View) obj4, (boolean[]) obj3, (m8) obj2, (View) obj);
                break;
            case 19:
                iv1 iv1Var = (iv1) obj5;
                he[] heVarArr = (he[]) obj3;
                k47 k47Var = (k47) obj2;
                n1 n1Var = (n1) obj;
                yv1 yv1Var2 = iv1Var.a;
                if (((TLRPC.Message) obj4).suggested_post.schedule_date == 0) {
                    heVarArr[0].setOnDismissListener(null);
                    my0 my0Var = (my0) ik.Q(yv1Var2.getParentActivity(), 0L, new g11((Object) iv1Var, (Object) k47Var, (byte) 18), yv1Var2.getResourceProvider(), 1).b;
                    my0Var.show();
                    my0Var.setOnDismissListener(n1Var);
                    break;
                } else {
                    yv1Var2.getMessagesController().s(k47Var.k.id, 0, pg3.n(k47Var.k.peer_id), null, false);
                    break;
                }
            case 20:
                c cVar = (c) obj5;
                hlc hlcVar = (hlc) obj4;
                alc alcVar = (alc) obj2;
                jlc jlcVar = (jlc) obj;
                ChatActivityEnterView chatActivityEnterView = cVar.a;
                mc8 a6 = chatActivityEnterView.F3.a6(hlcVar, (nl9) obj3);
                if (a6 == null) {
                    gm.B2(hlcVar);
                    break;
                } else {
                    int F0 = chatActivityEnterView.F0(cmb.D8);
                    ArrayList J = chatActivityEnterView.z0().J();
                    int size = J.size();
                    while (i3 < size) {
                        Object obj6 = J.get(i3);
                        i3++;
                        vm3 vm3Var = (vm3) obj6;
                        a6.e(new tn3(chatActivityEnterView.getContext(), vm3Var, F0, chatActivityEnterView.R, false), 48, new lx1(alcVar, vm3Var, (byte) 1));
                    }
                    a6.J = new lx1(cVar, hlcVar, (byte) 2);
                    chatActivityEnterView.t1 = true;
                    ChatActivityEnterView.RecordCircle recordCircle = chatActivityEnterView.D2;
                    if (recordCircle != null) {
                        recordCircle.invalidate();
                    }
                    Objects.requireNonNull(jlcVar);
                    a6.K = new mf2(jlcVar, (byte) 17);
                    int[] iArr3 = new int[2];
                    chatActivityEnterView.getLocationInWindow(iArr3);
                    a6.F = iArr3[1];
                    a6.H = gm.L(316.0f);
                    a6.j();
                    break;
                }
            case 21:
                qa2 qa2Var = (qa2) obj5;
                String str22 = (String) obj4;
                TLRPC.TL_error tL_error9 = (TLRPC.TL_error) obj;
                TLObject tLObject8 = (TLObject) obj3;
                TLRPC.TL_channels_checkUsername tL_channels_checkUsername2 = (TLRPC.TL_channels_checkUsername) obj2;
                qa2Var.i0 = 0;
                String str23 = qa2Var.j0;
                if (str23 != null && str23.equals(str22)) {
                    if (tL_error9 == null) {
                        if (tLObject8 instanceof TLRPC.TL_boolTrue) {
                            qa2Var.h.setText(jb6.a0("LinkAvailable", null, 2131748681, str22));
                            qa2Var.h.setTextColorByKey(cmb.v6);
                            qa2Var.l0 = true;
                            break;
                        }
                    } else if ("USERNAME_INVALID".equals(tL_error9.text) && tL_channels_checkUsername2.username.length() == 4) {
                        qa2Var.h.setText(jb6.M0(2131743341, null));
                        anb.X(qa2Var.h.getTextView(), cmb.o7, null);
                        qa2Var.l0 = false;
                        break;
                    }
                    if (tL_error9 != null) {
                        if ("USERNAME_PURCHASE_AVAILABLE".equals(tL_error9.text)) {
                            int length3 = tL_channels_checkUsername2.username.length();
                            ka2 ka2Var = qa2Var.h;
                            if (length3 == 4) {
                                ka2Var.setText(jb6.M0(2131743340, null));
                            } else {
                                ka2Var.setText(jb6.M0(2131743344, null));
                            }
                            anb.X(qa2Var.h.getTextView(), cmb.E6, null);
                        } else if ("CHANNELS_ADMIN_PUBLIC_TOO_MUCH".equals(tL_error9.text)) {
                            qa2Var.d0 = false;
                            qa2Var.f0();
                        }
                        qa2Var.l0 = false;
                    }
                    qa2Var.h.setText(jb6.M0(2131748669, null));
                    qa2Var.h.setTextColorByKey(cmb.o7);
                    qa2Var.l0 = false;
                }
                break;
            case 22:
                ((ke2) obj5).l0((TLRPC.TL_error) obj, (TLRPC.TL_inputCheckPasswordSRP) obj4, (TwoStepVerificationActivity) obj3, (TLRPC.TL_channels_editCreator) obj2);
                break;
            case 23:
                uf2 uf2Var = (uf2) obj5;
                TL_account.Tl_chatThemes tl_chatThemes = (TL_account.Tl_chatThemes) obj4;
                ArrayList arrayList2 = (ArrayList) obj3;
                ArrayList arrayList3 = (ArrayList) obj2;
                ff2 ff2Var = (ff2) obj;
                tf2 tf2Var = uf2Var.f;
                tf2Var.e = tl_chatThemes.next_offset;
                tf2Var.a = tl_chatThemes.hash;
                tf2Var.b = System.currentTimeMillis();
                ArrayList arrayList4 = (ArrayList) tf2Var.d;
                if (arrayList4 == null) {
                    tf2Var.d = new ArrayList(arrayList2);
                } else {
                    arrayList4.addAll(arrayList2);
                }
                if (TextUtils.isEmpty(tl_chatThemes.next_offset)) {
                    tf2Var.c = true;
                }
                int size2 = arrayList2.size();
                int i16 = 0;
                while (i16 < size2) {
                    Object obj7 = arrayList2.get(i16);
                    i16++;
                    tz3 tz3Var = (tz3) obj7;
                    HashMap hashMap3 = uf2Var.e;
                    fnb fnbVar = tz3Var.c;
                    if (fnbVar == null) {
                        str4 = null;
                    } else {
                        str4 = fnbVar.b;
                        if (str4 == null) {
                            str4 = fnbVar.a;
                        }
                    }
                    hashMap3.put(str4, tz3Var);
                }
                int size3 = arrayList3.size();
                while (i2 < size3) {
                    Object obj8 = arrayList3.get(i2);
                    i2++;
                    TLRPC.TL_chatThemeUniqueGift tL_chatThemeUniqueGift = (TLRPC.TL_chatThemeUniqueGift) obj8;
                    uf2Var.r(pg3.n(tL_chatThemeUniqueGift.gift.theme_peer), tL_chatThemeUniqueGift.gift.slug);
                }
                ff2Var.onComplete(null);
                break;
            case 24:
                a();
                break;
            case 25:
                b();
                break;
            case 26:
                ((nk3) obj5).p4((TLObject) obj4, (TLRPC.UserFull) obj3, (TL_account.TL_birthday) obj2, (TLRPC.TL_error) obj);
                break;
            case 27:
                c();
                break;
            case 28:
                d();
                break;
            default:
                yw4 yw4Var = (yw4) obj5;
                TLRPC.UserFull userFull = (TLRPC.UserFull) obj3;
                TL_account.TL_birthday tL_birthday = (TL_account.TL_birthday) obj2;
                TLRPC.TL_error tL_error10 = (TLRPC.TL_error) obj;
                dy0 dy0Var = yw4Var.c;
                if (((TLObject) obj4) instanceof TLRPC.TL_boolTrue) {
                    u31 Q2 = new c41(dy0Var, yw4Var.J0).Q(R.raw.contact_check, 36, jb6.M0(2131746591, null));
                    Q2.j = 5000;
                    Q2.j();
                    break;
                } else {
                    if (userFull != null) {
                        int i17 = userFull.flags2;
                        if (tL_birthday == null) {
                            userFull.flags2 = i17 & (-33);
                        } else {
                            userFull.flags2 = i17 | 32;
                        }
                        userFull.birthday = tL_birthday;
                        cf7.Y(yw4Var.a).g2(userFull, false);
                    }
                    if (tL_error10 == null || (str5 = tL_error10.text) == null || !str5.startsWith("FLOOD_WAIT_")) {
                        ts2.u(null, 2131743566, new c41(dy0Var, yw4Var.J0), R.raw.error, 36);
                    } else {
                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(0, yw4Var.J0, yw4Var.getContext());
                        String M02 = jb6.M0(2131746587, null);
                        he heVar4 = alertDialog$Builder2.a;
                        heVar4.S = M02;
                        heVar4.U = jb6.M0(2131746588, null);
                        b10.t(null, 2131747564, alertDialog$Builder2, null);
                    }
                    yw4Var.i2.O(true);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ da7(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, byte b) {
        this.a = b;
        this.b = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
        this.c = obj5;
    }

    public /* synthetic */ da7(Object obj, TLRPC.TL_error tL_error, Object obj2, Object obj3, Object obj4, byte b) {
        this.a = b;
        this.b = obj;
        this.c = tL_error;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
    }

    public /* synthetic */ da7(TLObject tLObject, oc7 oc7Var, jv0 jv0Var, vn0 vn0Var, TLRPC.TL_error tL_error) {
        this.a = (byte) 4;
        this.d = tLObject;
        this.b = oc7Var;
        this.e = jv0Var;
        this.f = vn0Var;
        this.c = tL_error;
    }

    public /* synthetic */ da7(TLRPC.TL_error tL_error, qac qacVar, TLObject tLObject, oc7 oc7Var, qac qacVar2, byte b) {
        this.a = b;
        this.c = tL_error;
        this.d = qacVar;
        this.e = tLObject;
        this.b = oc7Var;
        this.f = qacVar2;
    }

    public /* synthetic */ da7(d dVar, String str, TLRPC.TL_error tL_error, TLObject tLObject, TLObject tLObject2, byte b) {
        this.a = b;
        this.b = dVar;
        this.d = str;
        this.c = tL_error;
        this.e = tLObject;
        this.f = tLObject2;
    }
}
