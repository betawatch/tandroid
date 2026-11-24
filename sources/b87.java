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

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class b87 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ b87(hv0 hv0Var, TLObject tLObject, String[] strArr, TLRPC.TL_error tL_error, hd hdVar) {
        this.a = (byte) 8;
        this.b = hv0Var;
        this.d = tLObject;
        this.e = strArr;
        this.c = tL_error;
        this.f = hdVar;
    }

    private final void a() {
        jf2 jf2Var = (jf2) this.b;
        ArrayList arrayList = (ArrayList) this.d;
        vf6 vf6Var = (vf6) this.e;
        ArrayList arrayList2 = (ArrayList) this.f;
        ArrayList arrayList3 = (ArrayList) this.c;
        zr9 zr9Var = jf2Var.h;
        kf2 kf2Var = jf2Var.E;
        if (kf2Var.o1) {
            jf2Var.s = false;
            jf2Var.d = arrayList;
            jf2Var.e = vf6Var;
            jf2Var.f = arrayList2;
            zr9Var.f(arrayList, null);
            if (!hc2.T(kf2Var.n)) {
                ArrayList arrayList4 = zr9Var.g;
                arrayList4.clear();
                arrayList4.addAll(arrayList3);
            }
            int i = jf2Var.r;
            jf2Var.f();
            if (jf2Var.r > i) {
                kf2Var.B0(i);
            }
            if (zr9Var.e() || jf2Var.r != 0) {
                return;
            }
            kf2Var.b.e(false, true);
        }
    }

    private final void b() {
        xv2 xv2Var = (xv2) this.b;
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
                    TLRPC.TL_messages_stickerSet n0 = hq6.d0(xv2Var.r).n0(tL_inputStickerSetID, true);
                    if (n0 == null || n0.documents.size() < 120) {
                        arrayList.add(stickerSetCovered2);
                    }
                }
            }
            if (tL_messages_myStickers.sets.size() == tL_messages_getMyStickers.limit) {
                tL_messages_getMyStickers.offset_id = ((TLRPC.StickerSetCovered) b00.f(1, tL_messages_myStickers.sets)).set.id;
                ConnectionsManager.getInstance(xv2Var.r).sendRequest(tL_messages_getMyStickers, new en0((Object) xv2Var, (Object) arrayList, (Object) tL_messages_getMyStickers, (byte) 20));
            }
        }
    }

    private final void c() {
        v74 v74Var = (v74) this.b;
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
            u74 u74Var = (u74) arrayList.get(i4);
            Integer num2 = tL_getFactCheck.msg_id.get(i4);
            num2.getClass();
            TLRPC.TL_factCheck tL_factCheck = (TLRPC.TL_factCheck) hashMap2.get(num2);
            p8c p8cVar = (p8c) hashMap.get(u74Var);
            if (tL_factCheck != null && !tL_factCheck.need_check && p8cVar != null) {
                p8cVar.a(tL_factCheck);
                i3++;
                v74Var.d.remove(u74Var);
            }
        }
        if (i3 > 0) {
            kk7.f(v74Var.a).k(kk7.C3, new Object[0]);
        }
    }

    private final void d() {
        lu4 lu4Var = (lu4) this.b;
        c01 c01Var = (c01) this.d;
        hd hdVar = (hd) this.e;
        TLRPC.Updates updates = (TLRPC.Updates) this.f;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) this.c;
        nna nnaVar = lu4Var.D1;
        if (nnaVar != null) {
            nnaVar.run();
        }
        c01Var.c(false);
        hdVar.dismiss();
        lu4Var.dismiss();
        d S = LaunchActivity.S();
        if (S != null) {
            if (updates == null) {
                u21.b0(S).g0(tL_error, false);
                return;
            }
            m21 I = u21.b0(S).I(R.raw.forward, k96.M0(2131749683, null), gl.T2(k96.a0(null, null, 2131749684, lu4Var.n1, cf3.s(lu4Var.o1))));
            I.t = true;
            I.j();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:281:0x06b0  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x06b7  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x06c5  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x06e5  */
    /* JADX WARN: Removed duplicated region for block: B:333:0x0787  */
    /* JADX WARN: Type inference failed for: r1v9, types: [android.view.View, android.view.ViewGroup, android.widget.LinearLayout] */
    /* JADX WARN: Type inference failed for: r2v3, types: [org.telegram.ui.ActionBar.AlertDialog$Builder] */
    /* JADX WARN: Type inference failed for: r3v8, types: [android.view.View, android.view.ViewGroup, android.widget.LinearLayout] */
    /* JADX WARN: Type inference failed for: r4v16, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r7v16, types: [android.view.View, hn, java.lang.Object] */
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
        final byte b2 = 1;
        Object obj = this.c;
        Object obj2 = this.f;
        Object obj3 = this.e;
        Object obj4 = this.d;
        Object obj5 = this.b;
        int i2 = 0;
        switch (b) {
            case 0:
                na7 na7Var = (na7) obj5;
                TLRPC.User user = (TLRPC.User) obj4;
                TLRPC.Chat chat = (TLRPC.Chat) obj3;
                z97 z97Var = (z97) obj2;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                d Q = LaunchActivity.Q();
                if (Q != null && Q.getParentActivity() != null) {
                    h26 h26Var = new h26(11, na7Var.currentAccount, null, Q.getParentActivity(), Q);
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(user);
                    h26Var.t1(chat, arrayList, null, null, null);
                    h26Var.show();
                }
                z97Var.b(tL_error);
                break;
            case 1:
                ij.c0(((na7) obj5).currentAccount, (TLRPC.TL_error) obj, (d) obj4, (TLRPC.TL_channels_updateUsername) obj3, new Object[0]);
                ((Runnable) obj2).run();
                break;
            case 2:
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj;
                x0 x0Var = (x0) obj4;
                TLObject tLObject = (TLObject) obj3;
                na7 na7Var2 = (na7) obj5;
                ht htVar = (ht) obj2;
                if (tL_error2 != null) {
                    x0Var.a(tL_error2);
                    break;
                } else if (tLObject instanceof TL_stories.TL_premium_myBoosts) {
                    TL_stories.TL_premium_myBoosts tL_premium_myBoosts = (TL_stories.TL_premium_myBoosts) tLObject;
                    na7Var2.a4(tL_premium_myBoosts.users, false);
                    na7Var2.U3(tL_premium_myBoosts.chats, false);
                    htVar.a(tL_premium_myBoosts);
                    break;
                }
                break;
            case 3:
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj;
                p8c p8cVar = (p8c) obj4;
                TLObject tLObject2 = (TLObject) obj3;
                na7 na7Var3 = (na7) obj5;
                p8c p8cVar2 = (p8c) obj2;
                if (tL_error3 != null) {
                    p8cVar.a(tL_error3);
                    break;
                } else if (tLObject2 instanceof TL_stories.TL_premium_myBoosts) {
                    TL_stories.TL_premium_myBoosts tL_premium_myBoosts2 = (TL_stories.TL_premium_myBoosts) tLObject2;
                    na7Var3.a4(tL_premium_myBoosts2.users, false);
                    na7Var3.U3(tL_premium_myBoosts2.chats, false);
                    p8cVar2.a(tL_premium_myBoosts2);
                    break;
                }
                break;
            case 4:
                TLObject tLObject3 = (TLObject) obj4;
                na7 na7Var4 = (na7) obj5;
                au0 au0Var = (au0) obj3;
                vm0 vm0Var = (vm0) obj2;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) obj;
                if (tLObject3 instanceof TLRPC.TL_payments_checkedGiftCode) {
                    TLRPC.TL_payments_checkedGiftCode tL_payments_checkedGiftCode = (TLRPC.TL_payments_checkedGiftCode) tLObject3;
                    na7Var4.U3(tL_payments_checkedGiftCode.chats, false);
                    na7Var4.a4(tL_payments_checkedGiftCode.users, false);
                    au0Var.a(tL_payments_checkedGiftCode);
                }
                vm0Var.a(tL_error4);
                break;
            case 5:
                hv0 hv0Var = (hv0) obj5;
                String str6 = (String) obj4;
                TLRPC.TL_inputInvoiceSlug tL_inputInvoiceSlug = (TLRPC.TL_inputInvoiceSlug) obj3;
                TLObject tLObject4 = (TLObject) obj2;
                if (((TLRPC.TL_error) obj) != null) {
                    hv0Var.D(str6, "failed", false);
                    break;
                } else {
                    hv0Var.c.n(tL_inputInvoiceSlug, str6, tLObject4);
                    break;
                }
            case 6:
                hv0 hv0Var2 = (hv0) obj5;
                ev0 ev0Var = (ev0) obj3;
                String str7 = (String) obj2;
                String str8 = (String) obj;
                if (((TLObject) obj4) instanceof TLRPC.TL_boolTrue) {
                    Context context = hv0Var2.getContext();
                    String q = l7c.q(hv0Var2.V);
                    final au0 au0Var2 = new au0((Object) hv0Var2, (Object) ev0Var, (Object) str7, (Object) str8, (byte) 1);
                    HashMap hashMap = mp0.g;
                    ?? alertDialog$Builder = new AlertDialog$Builder(context);
                    String M0 = k96.M0(2131753092, null);
                    hd hdVar = alertDialog$Builder.a;
                    hdVar.S = M0;
                    hdVar.U = gl.T2(k96.a0(null, null, 2131753093, q));
                    ?? linearLayout = new LinearLayout(context);
                    linearLayout.setPadding(gl.L(22.0f), 0, gl.L(22.0f), 0);
                    linearLayout.setOrientation(0);
                    ImageView imageView = new ImageView(context);
                    imageView.setScaleType(ImageView.ScaleType.CENTER);
                    int L = gl.L(44.0f);
                    int i3 = bkb.Ei;
                    ShapeDrawable K = bkb.K(L, bkb.w0(null, i3, false));
                    vkb M = zkb.M(i3);
                    imageView.setBackground(K);
                    zkb.j(imageView, K, M, null, null);
                    imageView.setImageResource(R.drawable.msg_round_file_s);
                    linearLayout.addView(imageView, nme.t(44, 44, 19, 0, 0, 10, 0));
                    ?? linearLayout2 = new LinearLayout(context);
                    linearLayout2.setOrientation(1);
                    TextView textView = new TextView(context);
                    textView.setTextSize(1, 15.0f);
                    textView.setTypeface(gl.o());
                    textView.setText(str8);
                    zkb.X(textView, bkb.m5, null);
                    linearLayout2.addView(textView, nme.k(0.0f, 0.0f, 0.0f, 3.0f, -1, -2));
                    ?? hnVar = new hn(context, true, true, true);
                    hnVar.setTextSize(gl.L(12.0f));
                    SpannableString spannableString = new SpannableString("l");
                    u86 u86Var = new u86(gl.L(55.0f), hnVar);
                    int i4 = bkb.ue;
                    u86Var.a(bkb.p1(0.35f, bkb.w0(null, i4, false)), bkb.p1(0.075f, bkb.w0(null, i4, false)));
                    spannableString.setSpan(u86Var, 0, 1, 33);
                    hnVar.setText(spannableString);
                    f fVar = new f(hnVar, (byte) 16);
                    HashMap hashMap2 = mp0.h;
                    if (hashMap2.containsKey(str7)) {
                        Pair pair = (Pair) hashMap2.get(str7);
                        fVar.a((String) pair.first, (Long) pair.second);
                    } else {
                        new gp0(str7, fVar).execute(str7);
                    }
                    zkb.U(hnVar, i4, null);
                    linearLayout2.addView(hnVar, nme.o(-1, 15));
                    linearLayout.addView(linearLayout2, nme.t(-1, -2, 23, 0, 0, 0, 2));
                    alertDialog$Builder.n(linearLayout);
                    final boolean[] zArr = new boolean[1];
                    final byte b3 = 0;
                    alertDialog$Builder.g(k96.M0(2131752577, null), new ed() { // from class: fp0
                        @Override // ed
                        public final void u(hd hdVar2, int i5) {
                            byte b4 = b3;
                            au0 au0Var3 = au0Var2;
                            boolean[] zArr2 = zArr;
                            switch (b4) {
                                case 0:
                                    if (!zArr2[0]) {
                                        au0Var3.a(Boolean.FALSE);
                                        zArr2[0] = true;
                                        break;
                                    }
                                    break;
                                default:
                                    if (!zArr2[0]) {
                                        au0Var3.a(Boolean.TRUE);
                                        zArr2[0] = true;
                                        break;
                                    }
                                    break;
                            }
                        }
                    });
                    alertDialog$Builder.j(k96.M0(2131753094, null), new ed() { // from class: fp0
                        @Override // ed
                        public final void u(hd hdVar2, int i5) {
                            byte b4 = b2;
                            au0 au0Var3 = au0Var2;
                            boolean[] zArr2 = zArr;
                            switch (b4) {
                                case 0:
                                    if (!zArr2[0]) {
                                        au0Var3.a(Boolean.FALSE);
                                        zArr2[0] = true;
                                        break;
                                    }
                                    break;
                                default:
                                    if (!zArr2[0]) {
                                        au0Var3.a(Boolean.TRUE);
                                        zArr2[0] = true;
                                        break;
                                    }
                                    break;
                            }
                        }
                    });
                    hdVar.setOnDismissListener(new cf(zArr, au0Var2, (byte) 5));
                    hdVar.show();
                    break;
                } else {
                    hv0Var2.u(ev0Var, "file_download_requested", hv0.x("cancelled", "status"));
                    break;
                }
            case 7:
                hv0 hv0Var3 = (hv0) obj5;
                ev0 ev0Var2 = (ev0) obj3;
                String str9 = (String) obj2;
                String str10 = (String) obj;
                if (((WebView) obj4) != hv0Var3.a || !hv0Var3.m(ev0Var2)) {
                    hv0Var3.e("onBotWebMessage ignored after document change");
                    break;
                } else {
                    hv0Var3.C(hv0Var3.s0, ev0Var2, str9, str10);
                    break;
                }
            case 8:
                hv0 hv0Var4 = (hv0) obj5;
                TLObject tLObject5 = (TLObject) obj4;
                String[] strArr = (String[]) obj3;
                TLRPC.TL_error tL_error5 = (TLRPC.TL_error) obj;
                hd hdVar2 = (hd) obj2;
                if (tLObject5 != null) {
                    strArr[0] = "allowed";
                    if (tLObject5 instanceof TLRPC.Updates) {
                        na7.q1(hv0Var4.N).Q3((TLRPC.Updates) tLObject5, false);
                    }
                }
                if (tL_error5 != null) {
                    hv0Var4.Y(tL_error5.text);
                }
                hdVar2.dismiss();
                break;
            case 9:
                String str11 = (String) obj4;
                String str12 = (String) obj3;
                String str13 = (String) obj2;
                String str14 = (String) obj;
                cv0 cv0Var = ((bv0) obj5).a;
                try {
                    DownloadManager.Request request = new DownloadManager.Request(Uri.parse(str11));
                    request.setMimeType(str12);
                    request.addRequestHeader("User-Agent", str13);
                    request.setDescription(k96.M0(2131742665, null));
                    request.setTitle(str14);
                    request.setNotificationVisibility(1);
                    request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, str14);
                    DownloadManager downloadManager = (DownloadManager) cv0Var.getContext().getSystemService("download");
                    if (downloadManager != null) {
                        downloadManager.enqueue(request);
                    }
                    hv0 hv0Var5 = cv0Var.R;
                    if (hv0Var5 != null) {
                        new u21(hv0Var5, hv0Var5.e).Q(R.raw.ic_download, 36, gl.T2(k96.a0(null, null, 2131742664, str14))).k(true);
                        break;
                    }
                } catch (Exception e) {
                    fa4.g(e, true);
                    return;
                }
                break;
            case 10:
                BotWebViewContainer$WebViewProxy botWebViewContainer$WebViewProxy = (BotWebViewContainer$WebViewProxy) obj5;
                String str15 = (String) obj4;
                byte[] bArr = (byte[]) obj3;
                String str16 = (String) obj2;
                String str17 = (String) obj;
                cv0 cv0Var2 = botWebViewContainer$WebViewProxy.b;
                if (botWebViewContainer$WebViewProxy.a != null) {
                    long currentTimeMillis = System.currentTimeMillis();
                    hv0 hv0Var6 = botWebViewContainer$WebViewProxy.a;
                    if (currentTimeMillis - hv0Var6.Q > 10000) {
                        cv0Var2.c("window.navigator.__share__receive(\"security\")");
                        break;
                    } else {
                        int i5 = 0;
                        String str18 = str17;
                        hv0Var6.Q = 0L;
                        Context context2 = cv0Var2.getContext();
                        Activity W = gl.W(context2);
                        if (W == null && (launchActivity = LaunchActivity.H1) != null) {
                            W = launchActivity;
                        }
                        if (context2 == null || W == null || !(W instanceof LaunchActivity) || W.isFinishing() || !cv0Var2.isAttachedToWindow()) {
                            cv0Var2.c("window.navigator.__share__receive(\"security\")");
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
                                    fa4.g(e, true);
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
                                    launchActivity2.q1 = new be2(botWebViewContainer$WebViewProxy, (byte) 9);
                                    launchActivity2.startActivityForResult(Intent.createChooser(intent, k96.M0(2131745267, null)), 521);
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
                                        String str19 = str18;
                                        File z = ba4.z(4);
                                        StringBuilder sb3 = new StringBuilder();
                                        sb3.append(ba4.q(str16 == null ? "file" : str16));
                                        sb3.append(i5 > 0 ? tb4.n(i5, " (", ")") : "");
                                        file = new File(z, sb3.toString());
                                        i5++;
                                        str18 = str19;
                                    } else {
                                        try {
                                            FileOutputStream fileOutputStream = new FileOutputStream(file);
                                            fileOutputStream.write(bArr);
                                            fileOutputStream.close();
                                        } catch (Exception e5) {
                                            fa4.g(e5, true);
                                        }
                                        try {
                                            if (str18 == null) {
                                                intent2.setType("text/plain");
                                            } else {
                                                intent2.setType(str18);
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
                                            fa4.g(e6, true);
                                        }
                                    }
                                }
                            } else {
                                intent2.setType("text/plain");
                            }
                            launchActivity2.q1 = new be2(botWebViewContainer$WebViewProxy, (byte) 9);
                            launchActivity2.startActivityForResult(Intent.createChooser(intent2, k96.M0(2131745267, null)), 521);
                        }
                    }
                }
                break;
            case 11:
                o71 o71Var = (o71) obj5;
                u61 u61Var = (u61) obj4;
                TLRPC.TL_documentAttributeAudio tL_documentAttributeAudio = (TLRPC.TL_documentAttributeAudio) obj3;
                u61Var.e.b = false;
                tL_documentAttributeAudio.title = (String) obj2;
                tL_documentAttributeAudio.performer = (String) obj;
                wec wecVar = o71Var.n;
                for (int i6 = 0; i6 < wecVar.getViewPages().length; i6++) {
                    o39 a = o71Var.a(wecVar.getViewPages()[i6]);
                    if (a != null && ((a71) a.getAdapter()).d == 3) {
                        a71 a71Var = (a71) a.getAdapter();
                        int i7 = 0;
                        while (true) {
                            if (i7 >= a71Var.e.size()) {
                                break;
                            } else if (((h71) a71Var.e.get(i7)).d == u61Var) {
                                a71Var.g(i7);
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
                me1 me1Var = (me1) obj5;
                String str20 = (String) obj4;
                TLRPC.TL_error tL_error6 = (TLRPC.TL_error) obj;
                TLObject tLObject6 = (TLObject) obj3;
                TL_account.checkUsername checkusername = (TL_account.checkUsername) obj2;
                me1Var.e = 0;
                String str21 = me1Var.f;
                if (str21 != null && str21.equals(str20)) {
                    if (tL_error6 != null || !(tLObject6 instanceof TLRPC.TL_boolTrue)) {
                        if (me1Var.H != null) {
                            if (tL_error6 != null && "USERNAME_INVALID".equals(tL_error6.text) && checkusername.username.length() == 4) {
                                me1Var.H.setText(k96.M0(2131743415, null));
                                ke1 ke1Var = me1Var.H;
                                int i8 = bkb.o7;
                                ke1Var.setTag(Integer.valueOf(i8));
                                zkb.X(me1Var.H, i8, null);
                            } else if (tL_error6 == null || !"USERNAME_PURCHASE_AVAILABLE".equals(tL_error6.text)) {
                                me1Var.H.setText(k96.M0(2131743419, null));
                                ke1 ke1Var2 = me1Var.H;
                                int i9 = bkb.o7;
                                ke1Var2.setTag(Integer.valueOf(i9));
                                zkb.X(me1Var.H, i9, null);
                            } else {
                                int length = checkusername.username.length();
                                ke1 ke1Var3 = me1Var.H;
                                if (length == 4) {
                                    ke1Var3.setText(k96.M0(2131743414, null));
                                } else {
                                    ke1Var3.setText(k96.M0(2131743418, null));
                                }
                                ke1 ke1Var4 = me1Var.H;
                                int i10 = bkb.E6;
                                ke1Var4.setTag(Integer.valueOf(i10));
                                zkb.X(me1Var.H, i10, null);
                            }
                            le1 le1Var = me1Var.G;
                            if (le1Var != null) {
                                int i11 = le1.f;
                                le1Var.a();
                                break;
                            }
                        }
                    } else {
                        ke1 ke1Var5 = me1Var.H;
                        if (ke1Var5 != null) {
                            ke1Var5.setText(k96.a0("UsernameAvailable", null, 2131743428, str20));
                            ke1 ke1Var6 = me1Var.H;
                            int i12 = bkb.v6;
                            ke1Var6.setTag(Integer.valueOf(i12));
                            zkb.X(me1Var.H, i12, null);
                            le1 le1Var2 = me1Var.G;
                            if (le1Var2 != null) {
                                int i13 = le1.f;
                                le1Var2.a();
                                break;
                            }
                        }
                    }
                }
                break;
            case 14:
                TLRPC.TL_messages_exportedChatInvite tL_messages_exportedChatInvite = (TLRPC.TL_messages_exportedChatInvite) obj3;
                boolean[] zArr2 = (boolean[]) obj2;
                hd hdVar3 = (hd) obj;
                nf1 nf1Var = ((if1) obj5).a.n;
                nf1Var.B0 = false;
                nf1Var.z0.put(((TLRPC.TL_chatInviteExported) obj4).link, tL_messages_exportedChatInvite == null ? 0 : tL_messages_exportedChatInvite);
                if (!zArr2[0]) {
                    hdVar3.dismiss();
                    if (tL_messages_exportedChatInvite != null) {
                        nf1Var.d1(tL_messages_exportedChatInvite, nf1Var.A0);
                        break;
                    } else {
                        ir2.v(null, 2131748721, u21.b0(nf1Var), R.raw.linkbroken, 36);
                        break;
                    }
                }
                break;
            case 15:
                nh1 nh1Var = (nh1) obj5;
                boolean[] zArr3 = (boolean[]) obj4;
                int[] iArr = (int[]) obj3;
                int[] iArr2 = (int[]) obj2;
                TLRPC.TL_error tL_error7 = (TLRPC.TL_error) obj;
                nh1Var.getClass();
                if (!zArr3[0] && (i = iArr[0]) < iArr2[0]) {
                    if (tL_error7 != null) {
                        zArr3[0] = true;
                        if ("BOOSTS_REQUIRED".equals(tL_error7.text)) {
                            nh1Var.getMessagesController().E0().b(nh1Var.a, nh1Var.c, new rg1(nh1Var, b2));
                            break;
                        } else {
                            nh1Var.Q.setLoading(false);
                            u21.b0(nh1Var).Q(R.raw.error, 36, k96.a0(null, null, 2131743639, tL_error7.text)).j();
                            break;
                        }
                    } else {
                        int i14 = i + 1;
                        iArr[0] = i14;
                        if (i14 == iArr2[0]) {
                            nh1Var.finishFragment();
                            d dVar = nh1Var.m0;
                            if (dVar != null) {
                                if (dVar instanceof p82) {
                                    ((p82) dVar).s0();
                                }
                                ir2.v(null, nh1Var.d ? 2131749306 : 2131752447, u21.b0(nh1Var.m0), R.raw.contact_check, 36);
                                nh1Var.m0 = null;
                            }
                            nh1Var.Q.setLoading(false);
                            break;
                        }
                    }
                }
                break;
            case 16:
                yh1 yh1Var = (yh1) obj5;
                String str22 = (String) obj4;
                TLRPC.TL_error tL_error8 = (TLRPC.TL_error) obj;
                TLObject tLObject7 = (TLObject) obj3;
                TLRPC.TL_channels_checkUsername tL_channels_checkUsername = (TLRPC.TL_channels_checkUsername) obj2;
                yh1Var.Y = 0;
                String str23 = yh1Var.Z;
                if (str23 != null && str23.equals(str22)) {
                    if (tL_error8 == null) {
                        if (tLObject7 instanceof TLRPC.TL_boolTrue) {
                            yh1Var.W.setText(k96.a0("LinkAvailable", null, 2131748732, str22));
                            ke1 ke1Var7 = yh1Var.W;
                            int i15 = bkb.v6;
                            ke1Var7.setTag(Integer.valueOf(i15));
                            zkb.X(yh1Var.W, i15, null);
                            yh1Var.b0 = true;
                            break;
                        }
                    } else if ("USERNAME_INVALID".equals(tL_error8.text) && tL_channels_checkUsername.username.length() == 4) {
                        yh1Var.W.setText(k96.M0(2131743415, null));
                        zkb.X(yh1Var.W, bkb.o7, null);
                        yh1Var.b0 = false;
                        break;
                    }
                    if (tL_error8 != null) {
                        if ("USERNAME_PURCHASE_AVAILABLE".equals(tL_error8.text)) {
                            int length2 = tL_channels_checkUsername.username.length();
                            ke1 ke1Var8 = yh1Var.W;
                            if (length2 == 4) {
                                ke1Var8.setText(k96.M0(2131743414, null));
                            } else {
                                ke1Var8.setText(k96.M0(2131743418, null));
                            }
                            zkb.X(yh1Var.W, bkb.E6, null);
                        } else if ("CHANNELS_ADMIN_PUBLIC_TOO_MUCH".equals(tL_error8.text)) {
                            zkb.X(yh1Var.W, bkb.o7, null);
                            yh1Var.l0 = false;
                            yh1Var.k0();
                        }
                        yh1Var.b0 = false;
                    }
                    zkb.X(yh1Var.W, bkb.o7, null);
                    yh1Var.W.setText(k96.M0(2131748720, null));
                    yh1Var.b0 = false;
                }
                break;
            case 17:
                mu1 mu1Var = (mu1) obj5;
                boolean[] zArr4 = (boolean[]) obj4;
                boolean[] zArr5 = (boolean[]) obj3;
                ImageView imageView2 = (ImageView) obj2;
                ImageView imageView3 = (ImageView) obj;
                if (!zArr4[0]) {
                    zArr4[0] = true;
                    long[] jArr = {-1};
                    s67 s67Var = new s67(jArr, zArr5, imageView2, imageView3, (byte) 29);
                    TLRPC.TL_messages_rateTranscribedAudio tL_messages_rateTranscribedAudio = new TLRPC.TL_messages_rateTranscribedAudio();
                    tL_messages_rateTranscribedAudio.msg_id = mu1Var.v5.e1();
                    tL_messages_rateTranscribedAudio.peer = mu1Var.getMessagesController().k1(mu1Var.v5.k.peer_id);
                    tL_messages_rateTranscribedAudio.transcription_id = mu1Var.v5.k.voiceTranscriptionId;
                    tL_messages_rateTranscribedAudio.good = zArr5[0];
                    mu1Var.getConnectionsManager().sendRequest(tL_messages_rateTranscribedAudio, new en0((Object) mu1Var, (Object) s67Var, (Object) jArr, (byte) 16));
                    gl.e3(s67Var, 150L);
                    break;
                }
                break;
            case 18:
                ((mu1) obj5).T8((View) obj4, (boolean[]) obj3, (m8) obj2, (View) obj);
                break;
            case 19:
                wt1 wt1Var = (wt1) obj5;
                hd[] hdVarArr = (hd[]) obj3;
                k27 k27Var = (k27) obj2;
                n1 n1Var = (n1) obj;
                mu1 mu1Var2 = wt1Var.a;
                if (((TLRPC.Message) obj4).suggested_post.schedule_date == 0) {
                    hdVarArr[0].setOnDismissListener(null);
                    fx0 fx0Var = (fx0) ij.Q(mu1Var2.getParentActivity(), 0L, new q31((Object) wt1Var, (Object) k27Var, (byte) 17), mu1Var2.getResourceProvider(), 1).a;
                    fx0Var.show();
                    fx0Var.setOnDismissListener(n1Var);
                    break;
                } else {
                    mu1Var2.getMessagesController().s(k27Var.k.id, 0, cf3.n(k27Var.k.peer_id), null, false);
                    break;
                }
            case 20:
                c cVar = (c) obj5;
                hjc hjcVar = (hjc) obj4;
                ajc ajcVar = (ajc) obj2;
                jjc jjcVar = (jjc) obj;
                ChatActivityEnterView chatActivityEnterView = cVar.a;
                ja8 S5 = chatActivityEnterView.F3.S5(hjcVar, (i4d) obj3);
                if (S5 == null) {
                    gl.B2(hjcVar);
                    break;
                } else {
                    int F0 = chatActivityEnterView.F0(bkb.D8);
                    ArrayList J = chatActivityEnterView.z0().J();
                    int size = J.size();
                    int i16 = 0;
                    while (i16 < size) {
                        Object obj6 = J.get(i16);
                        i16++;
                        kl3 kl3Var = (kl3) obj6;
                        S5.d(new im3(chatActivityEnterView.getContext(), kl3Var, F0, chatActivityEnterView.R, false), 48, new kx1(ajcVar, kl3Var, false ? 1 : 0));
                    }
                    S5.J = new kx1(cVar, hjcVar, b2);
                    chatActivityEnterView.t1 = true;
                    ChatActivityEnterView.RecordCircle recordCircle = chatActivityEnterView.D2;
                    if (recordCircle != null) {
                        recordCircle.invalidate();
                    }
                    Objects.requireNonNull(jjcVar);
                    S5.K = new be2(jjcVar, (byte) 16);
                    int[] iArr3 = new int[2];
                    chatActivityEnterView.getLocationInWindow(iArr3);
                    S5.F = iArr3[1];
                    S5.H = gl.L(316.0f);
                    S5.i();
                    break;
                }
            case 21:
                f92 f92Var = (f92) obj5;
                String str24 = (String) obj4;
                TLRPC.TL_error tL_error9 = (TLRPC.TL_error) obj;
                TLObject tLObject8 = (TLObject) obj3;
                TLRPC.TL_channels_checkUsername tL_channels_checkUsername2 = (TLRPC.TL_channels_checkUsername) obj2;
                f92Var.i0 = 0;
                String str25 = f92Var.j0;
                if (str25 != null && str25.equals(str24)) {
                    if (tL_error9 == null) {
                        if (tLObject8 instanceof TLRPC.TL_boolTrue) {
                            f92Var.h.setText(k96.a0("LinkAvailable", null, 2131748732, str24));
                            f92Var.h.setTextColorByKey(bkb.v6);
                            f92Var.l0 = true;
                            break;
                        }
                    } else if ("USERNAME_INVALID".equals(tL_error9.text) && tL_channels_checkUsername2.username.length() == 4) {
                        f92Var.h.setText(k96.M0(2131743415, null));
                        zkb.X(f92Var.h.getTextView(), bkb.o7, null);
                        f92Var.l0 = false;
                        break;
                    }
                    if (tL_error9 != null) {
                        if ("USERNAME_PURCHASE_AVAILABLE".equals(tL_error9.text)) {
                            int length3 = tL_channels_checkUsername2.username.length();
                            z82 z82Var = f92Var.h;
                            if (length3 == 4) {
                                z82Var.setText(k96.M0(2131743414, null));
                            } else {
                                z82Var.setText(k96.M0(2131743418, null));
                            }
                            zkb.X(f92Var.h.getTextView(), bkb.E6, null);
                        } else if ("CHANNELS_ADMIN_PUBLIC_TOO_MUCH".equals(tL_error9.text)) {
                            f92Var.d0 = false;
                            f92Var.e0();
                        }
                        f92Var.l0 = false;
                    }
                    f92Var.h.setText(k96.M0(2131748720, null));
                    f92Var.h.setTextColorByKey(bkb.o7);
                    f92Var.l0 = false;
                }
                break;
            case 22:
                ((zc2) obj5).k0((TLRPC.TL_error) obj, (TLRPC.TL_inputCheckPasswordSRP) obj4, (TwoStepVerificationActivity) obj3, (TLRPC.TL_channels_editCreator) obj2);
                break;
            case 23:
                je2 je2Var = (je2) obj5;
                TL_account.Tl_chatThemes tl_chatThemes = (TL_account.Tl_chatThemes) obj4;
                ArrayList arrayList2 = (ArrayList) obj3;
                ArrayList arrayList3 = (ArrayList) obj2;
                ud2 ud2Var = (ud2) obj;
                ie2 ie2Var = je2Var.f;
                ie2Var.e = tl_chatThemes.next_offset;
                ie2Var.a = tl_chatThemes.hash;
                ie2Var.b = System.currentTimeMillis();
                ArrayList arrayList4 = (ArrayList) ie2Var.d;
                if (arrayList4 == null) {
                    ie2Var.d = new ArrayList(arrayList2);
                } else {
                    arrayList4.addAll(arrayList2);
                }
                if (TextUtils.isEmpty(tl_chatThemes.next_offset)) {
                    ie2Var.c = true;
                }
                int size2 = arrayList2.size();
                int i17 = 0;
                while (i17 < size2) {
                    Object obj7 = arrayList2.get(i17);
                    i17++;
                    jy3 jy3Var = (jy3) obj7;
                    HashMap hashMap3 = je2Var.e;
                    elb elbVar = jy3Var.c;
                    if (elbVar == null) {
                        str4 = null;
                    } else {
                        str4 = elbVar.b;
                        if (str4 == null) {
                            str4 = elbVar.a;
                        }
                    }
                    hashMap3.put(str4, jy3Var);
                }
                int size3 = arrayList3.size();
                while (i2 < size3) {
                    Object obj8 = arrayList3.get(i2);
                    i2++;
                    TLRPC.TL_chatThemeUniqueGift tL_chatThemeUniqueGift = (TLRPC.TL_chatThemeUniqueGift) obj8;
                    je2Var.r(cf3.n(tL_chatThemeUniqueGift.gift.theme_peer), tL_chatThemeUniqueGift.gift.slug);
                }
                ud2Var.onComplete(null);
                break;
            case 24:
                a();
                break;
            case 25:
                b();
                break;
            case 26:
                ((cj3) obj5).m4((TLObject) obj4, (TLRPC.UserFull) obj3, (TL_account.TL_birthday) obj2, (TLRPC.TL_error) obj);
                break;
            case 27:
                c();
                break;
            case 28:
                d();
                break;
            default:
                xu4 xu4Var = (xu4) obj5;
                TLRPC.UserFull userFull = (TLRPC.UserFull) obj3;
                TL_account.TL_birthday tL_birthday = (TL_account.TL_birthday) obj2;
                TLRPC.TL_error tL_error10 = (TLRPC.TL_error) obj;
                ww0 ww0Var = xu4Var.c;
                if (((TLObject) obj4) instanceof TLRPC.TL_boolTrue) {
                    m21 Q2 = new u21(ww0Var, xu4Var.J0).Q(R.raw.contact_check, 36, k96.M0(2131746665, null));
                    Q2.j = 5000;
                    Q2.j();
                    break;
                } else {
                    if (userFull != null) {
                        int i18 = userFull.flags2;
                        if (tL_birthday == null) {
                            userFull.flags2 = i18 & (-33);
                        } else {
                            userFull.flags2 = i18 | 32;
                        }
                        userFull.birthday = tL_birthday;
                        ad7.Y(xu4Var.a).g2(userFull, false);
                    }
                    if (tL_error10 == null || (str5 = tL_error10.text) == null || !str5.startsWith("FLOOD_WAIT_")) {
                        ir2.v(null, 2131743640, new u21(ww0Var, xu4Var.J0), R.raw.error, 36);
                    } else {
                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(0, xu4Var.J0, xu4Var.getContext());
                        String M02 = k96.M0(2131746661, null);
                        hd hdVar4 = alertDialog$Builder2.a;
                        hdVar4.S = M02;
                        hdVar4.U = k96.M0(2131746662, null);
                        b00.t(null, 2131747638, alertDialog$Builder2, null);
                    }
                    xu4Var.i2.O(true);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ b87(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, byte b) {
        this.a = b;
        this.b = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
        this.c = obj5;
    }

    public /* synthetic */ b87(Object obj, TLRPC.TL_error tL_error, Object obj2, Object obj3, Object obj4, byte b) {
        this.a = b;
        this.b = obj;
        this.c = tL_error;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
    }

    public /* synthetic */ b87(TLObject tLObject, na7 na7Var, au0 au0Var, vm0 vm0Var, TLRPC.TL_error tL_error) {
        this.a = (byte) 4;
        this.d = tLObject;
        this.b = na7Var;
        this.e = au0Var;
        this.f = vm0Var;
        this.c = tL_error;
    }

    public /* synthetic */ b87(TLRPC.TL_error tL_error, p8c p8cVar, TLObject tLObject, na7 na7Var, p8c p8cVar2, byte b) {
        this.a = b;
        this.c = tL_error;
        this.d = p8cVar;
        this.e = tLObject;
        this.b = na7Var;
        this.f = p8cVar2;
    }

    public /* synthetic */ b87(d dVar, String str, TLRPC.TL_error tL_error, TLObject tLObject, TLObject tLObject2, byte b) {
        this.a = b;
        this.b = dVar;
        this.d = str;
        this.c = tL_error;
        this.e = tLObject;
        this.f = tLObject2;
    }
}
