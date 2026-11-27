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
import android.widget.FrameLayout;
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
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.c;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.web.BotWebViewContainer$WebViewProxy;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class la7 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ la7(rv0 rv0Var, TLObject tLObject, String[] strArr, TLRPC.TL_error tL_error, id idVar) {
        this.a = (byte) 8;
        this.b = rv0Var;
        this.d = tLObject;
        this.e = strArr;
        this.c = tL_error;
        this.f = idVar;
    }

    private final void a() {
        af2 af2Var = (af2) this.b;
        TL_account.Tl_chatThemes tl_chatThemes = (TL_account.Tl_chatThemes) this.d;
        ArrayList arrayList = (ArrayList) this.e;
        ArrayList arrayList2 = (ArrayList) this.f;
        le2 le2Var = (le2) this.c;
        ze2 ze2Var = af2Var.f;
        ze2Var.e = tl_chatThemes.next_offset;
        ze2Var.a = tl_chatThemes.hash;
        ze2Var.b = System.currentTimeMillis();
        ArrayList arrayList3 = (ArrayList) ze2Var.d;
        if (arrayList3 == null) {
            ze2Var.d = new ArrayList(arrayList);
        } else {
            arrayList3.addAll(arrayList);
        }
        if (TextUtils.isEmpty(tl_chatThemes.next_offset)) {
            ze2Var.c = true;
        }
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (true) {
            String str = null;
            if (i2 >= size) {
                break;
            }
            Object obj = arrayList.get(i2);
            i2++;
            ez3 ez3Var = (ez3) obj;
            HashMap hashMap = af2Var.e;
            dpb dpbVar = ez3Var.c;
            if (dpbVar != null && (str = dpbVar.b) == null) {
                str = dpbVar.a;
            }
            hashMap.put(str, ez3Var);
        }
        int size2 = arrayList2.size();
        while (i < size2) {
            Object obj2 = arrayList2.get(i);
            i++;
            TLRPC.TL_chatThemeUniqueGift tL_chatThemeUniqueGift = (TLRPC.TL_chatThemeUniqueGift) obj2;
            af2Var.r(wf3.n(tL_chatThemeUniqueGift.gift.theme_peer), tL_chatThemeUniqueGift.gift.slug);
        }
        le2Var.onComplete(null);
    }

    private final void b() {
        ag2 ag2Var = (ag2) this.b;
        ArrayList arrayList = (ArrayList) this.d;
        zh6 zh6Var = (zh6) this.e;
        ArrayList arrayList2 = (ArrayList) this.f;
        ArrayList arrayList3 = (ArrayList) this.c;
        sv9 sv9Var = ag2Var.h;
        bg2 bg2Var = ag2Var.E;
        if (bg2Var.o1) {
            ag2Var.s = false;
            ag2Var.d = arrayList;
            ag2Var.e = zh6Var;
            ag2Var.f = arrayList2;
            sv9Var.f(arrayList, null);
            if (!xc2.T(bg2Var.n)) {
                ArrayList arrayList4 = sv9Var.g;
                arrayList4.clear();
                arrayList4.addAll(arrayList3);
            }
            int i = ag2Var.r;
            ag2Var.f();
            if (ag2Var.r > i) {
                bg2Var.C0(i);
            }
            if (sv9Var.e() || ag2Var.r != 0) {
                return;
            }
            bg2Var.b.e(false, true);
        }
    }

    private final void c() {
        rw2 rw2Var = (rw2) this.b;
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
                    TLRPC.TL_messages_stickerSet n0 = ls6.d0(rw2Var.r).n0(tL_inputStickerSetID, true);
                    if (n0 == null || n0.documents.size() < 120) {
                        arrayList.add(stickerSetCovered2);
                    }
                }
            }
            if (tL_messages_myStickers.sets.size() == tL_messages_getMyStickers.limit) {
                tL_messages_getMyStickers.offset_id = ((TLRPC.StickerSetCovered) c00.g(1, tL_messages_myStickers.sets)).set.id;
                ConnectionsManager.getInstance(rw2Var.r).sendRequest(tL_messages_getMyStickers, new fn0((Object) rw2Var, (Object) arrayList, (Object) tL_messages_getMyStickers, (byte) 20));
            }
        }
    }

    private final void d() {
        q84 q84Var = (q84) this.b;
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
            p84 p84Var = (p84) arrayList.get(i4);
            Integer num2 = tL_getFactCheck.msg_id.get(i4);
            num2.getClass();
            TLRPC.TL_factCheck tL_factCheck = (TLRPC.TL_factCheck) hashMap2.get(num2);
            pcc pccVar = (pcc) hashMap.get(p84Var);
            if (tL_factCheck != null && !tL_factCheck.need_check && pccVar != null) {
                pccVar.a(tL_factCheck);
                i3++;
                q84Var.d.remove(p84Var);
            }
        }
        if (i3 > 0) {
            jn7.f(q84Var.a).k(jn7.D3, new Object[0]);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:258:0x06bc  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x06c3  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x06d1  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x06f1  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x078d  */
    /* JADX WARN: Type inference failed for: r14v4, types: [int] */
    /* JADX WARN: Type inference failed for: r2v9, types: [org.telegram.ui.ActionBar.AlertDialog$Builder] */
    /* JADX WARN: Type inference failed for: r3v13, types: [android.view.View, android.view.ViewGroup, android.widget.LinearLayout] */
    /* JADX WARN: Type inference failed for: r5v18, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r5v5, types: [android.view.View, in, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v13, types: [android.view.View, android.view.ViewGroup, android.widget.LinearLayout] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        String str;
        String str2;
        String str3;
        JSONObject jSONObject;
        LaunchActivity launchActivity;
        int i;
        byte b = this.a;
        final byte b2 = 1;
        Object obj = this.c;
        Object obj2 = this.f;
        Object obj3 = this.e;
        Object obj4 = this.d;
        Object obj5 = this.b;
        final byte b3 = 0;
        int i2 = 0;
        switch (b) {
            case 0:
                uc7 uc7Var = (uc7) obj5;
                TLRPC.User user = (TLRPC.User) obj4;
                TLRPC.Chat chat = (TLRPC.Chat) obj3;
                gc7 gc7Var = (gc7) obj2;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                e Q = LaunchActivity.Q();
                if (Q != null && Q.getParentActivity() != null) {
                    l46 l46Var = new l46(11, uc7Var.currentAccount, null, Q.getParentActivity(), Q);
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(user);
                    l46Var.u1(chat, arrayList, null, null, null);
                    l46Var.show();
                }
                gc7Var.b(tL_error);
                break;
            case 1:
                jj.c0(((uc7) obj5).currentAccount, (TLRPC.TL_error) obj, (e) obj4, (TLRPC.TL_channels_updateUsername) obj3, new Object[0]);
                ((Runnable) obj2).run();
                break;
            case 2:
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj;
                y0 y0Var = (y0) obj4;
                TLObject tLObject = (TLObject) obj3;
                uc7 uc7Var2 = (uc7) obj5;
                gt gtVar = (gt) obj2;
                if (tL_error2 != null) {
                    y0Var.a(tL_error2);
                    break;
                } else if (tLObject instanceof TL_stories.TL_premium_myBoosts) {
                    TL_stories.TL_premium_myBoosts tL_premium_myBoosts = (TL_stories.TL_premium_myBoosts) tLObject;
                    uc7Var2.j4(tL_premium_myBoosts.users, false);
                    uc7Var2.c4(tL_premium_myBoosts.chats, false);
                    gtVar.a(tL_premium_myBoosts);
                    break;
                }
                break;
            case 3:
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj;
                pcc pccVar = (pcc) obj4;
                TLObject tLObject2 = (TLObject) obj3;
                uc7 uc7Var3 = (uc7) obj5;
                pcc pccVar2 = (pcc) obj2;
                if (tL_error3 != null) {
                    pccVar.a(tL_error3);
                    break;
                } else if (tLObject2 instanceof TL_stories.TL_premium_myBoosts) {
                    TL_stories.TL_premium_myBoosts tL_premium_myBoosts2 = (TL_stories.TL_premium_myBoosts) tLObject2;
                    uc7Var3.j4(tL_premium_myBoosts2.users, false);
                    uc7Var3.c4(tL_premium_myBoosts2.chats, false);
                    pccVar2.a(tL_premium_myBoosts2);
                    break;
                }
                break;
            case 4:
                TLObject tLObject3 = (TLObject) obj4;
                uc7 uc7Var4 = (uc7) obj5;
                ku0 ku0Var = (ku0) obj3;
                nm0 nm0Var = (nm0) obj2;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) obj;
                if (tLObject3 instanceof TLRPC.TL_payments_checkedGiftCode) {
                    TLRPC.TL_payments_checkedGiftCode tL_payments_checkedGiftCode = (TLRPC.TL_payments_checkedGiftCode) tLObject3;
                    uc7Var4.c4(tL_payments_checkedGiftCode.chats, false);
                    uc7Var4.j4(tL_payments_checkedGiftCode.users, false);
                    ku0Var.a(tL_payments_checkedGiftCode);
                }
                nm0Var.a(tL_error4);
                break;
            case 5:
                rv0 rv0Var = (rv0) obj5;
                String str4 = (String) obj4;
                TLRPC.TL_inputInvoiceSlug tL_inputInvoiceSlug = (TLRPC.TL_inputInvoiceSlug) obj3;
                TLObject tLObject4 = (TLObject) obj2;
                if (((TLRPC.TL_error) obj) != null) {
                    rv0Var.D(str4, "failed", false);
                    break;
                } else {
                    rv0Var.c.n(tL_inputInvoiceSlug, str4, tLObject4);
                    break;
                }
            case 6:
                rv0 rv0Var2 = (rv0) obj5;
                pv0 pv0Var = (pv0) obj3;
                String str5 = (String) obj2;
                String str6 = (String) obj;
                if (((TLObject) obj4) instanceof TLRPC.TL_boolTrue) {
                    Context context = rv0Var2.getContext();
                    String r = lbc.r(rv0Var2.V);
                    final ku0 ku0Var2 = new ku0((Object) rv0Var2, (Object) pv0Var, (Object) str5, (Object) str6, (byte) 1);
                    HashMap hashMap = mp0.g;
                    ?? alertDialog$Builder = new AlertDialog$Builder(context);
                    String M0 = ob6.M0(2131753088, null);
                    id idVar = alertDialog$Builder.a;
                    idVar.S = M0;
                    idVar.U = hl.S2(ob6.a0(null, null, 2131753089, r));
                    ?? linearLayout = new LinearLayout(context);
                    linearLayout.setPadding(hl.L(22.0f), 0, hl.L(22.0f), 0);
                    linearLayout.setOrientation(0);
                    ImageView imageView = new ImageView(context);
                    imageView.setScaleType(ImageView.ScaleType.CENTER);
                    int L = hl.L(44.0f);
                    int i3 = aob.Fi;
                    ShapeDrawable K = aob.K(L, aob.w0(null, i3, false));
                    uob M = yob.M(i3);
                    imageView.setBackground(K);
                    yob.j(imageView, K, M, null, null);
                    imageView.setImageResource(R.drawable.msg_round_file_s);
                    linearLayout.addView(imageView, tre.t(44, 44, 19, 0, 0, 10, 0));
                    ?? linearLayout2 = new LinearLayout(context);
                    linearLayout2.setOrientation(1);
                    TextView textView = new TextView(context);
                    textView.setTextSize(1, 15.0f);
                    textView.setTypeface(hl.o());
                    textView.setText(str6);
                    yob.X(textView, aob.n5, null);
                    linearLayout2.addView(textView, tre.k(0.0f, 0.0f, 0.0f, 3.0f, -1, -2));
                    ?? inVar = new in(context, true, true, true);
                    inVar.setTextSize(hl.L(12.0f));
                    SpannableString spannableString = new SpannableString("l");
                    ya6 ya6Var = new ya6(hl.L(55.0f), inVar);
                    int i4 = aob.ve;
                    ya6Var.a(aob.p1(0.35f, aob.w0(null, i4, false)), aob.p1(0.075f, aob.w0(null, i4, false)));
                    spannableString.setSpan(ya6Var, 0, 1, 33);
                    inVar.setText(spannableString);
                    c cVar = new c(inVar, (byte) 16);
                    HashMap hashMap2 = mp0.h;
                    if (hashMap2.containsKey(str5)) {
                        Pair pair = (Pair) hashMap2.get(str5);
                        cVar.a((String) pair.first, (Long) pair.second);
                    } else {
                        new gp0(str5, cVar).execute(str5);
                    }
                    yob.U(inVar, i4, null);
                    linearLayout2.addView(inVar, tre.o(-1, 15));
                    linearLayout.addView(linearLayout2, tre.t(-1, -2, 23, 0, 0, 0, 2));
                    alertDialog$Builder.n(linearLayout);
                    final boolean[] zArr = new boolean[1];
                    alertDialog$Builder.g(ob6.M0(2131752570, null), new fd() { // from class: fp0
                        @Override // fd
                        public final void w(id idVar2, int i5) {
                            byte b4 = b3;
                            ku0 ku0Var3 = ku0Var2;
                            boolean[] zArr2 = zArr;
                            switch (b4) {
                                case 0:
                                    if (!zArr2[0]) {
                                        ku0Var3.a(Boolean.FALSE);
                                        zArr2[0] = true;
                                        break;
                                    }
                                    break;
                                default:
                                    if (!zArr2[0]) {
                                        ku0Var3.a(Boolean.TRUE);
                                        zArr2[0] = true;
                                        break;
                                    }
                                    break;
                            }
                        }
                    });
                    alertDialog$Builder.j(ob6.M0(2131753090, null), new fd() { // from class: fp0
                        @Override // fd
                        public final void w(id idVar2, int i5) {
                            byte b4 = b2;
                            ku0 ku0Var3 = ku0Var2;
                            boolean[] zArr2 = zArr;
                            switch (b4) {
                                case 0:
                                    if (!zArr2[0]) {
                                        ku0Var3.a(Boolean.FALSE);
                                        zArr2[0] = true;
                                        break;
                                    }
                                    break;
                                default:
                                    if (!zArr2[0]) {
                                        ku0Var3.a(Boolean.TRUE);
                                        zArr2[0] = true;
                                        break;
                                    }
                                    break;
                            }
                        }
                    });
                    idVar.setOnDismissListener(new gf(zArr, ku0Var2, (byte) 5));
                    idVar.show();
                    break;
                } else {
                    rv0Var2.u(pv0Var, "file_download_requested", rv0.x("cancelled", "status"));
                    break;
                }
            case 7:
                rv0 rv0Var3 = (rv0) obj5;
                pv0 pv0Var2 = (pv0) obj3;
                String str7 = (String) obj2;
                String str8 = (String) obj;
                if (((WebView) obj4) != rv0Var3.a || !rv0Var3.m(pv0Var2)) {
                    rv0Var3.e("onBotWebMessage ignored after document change");
                    break;
                } else {
                    rv0Var3.C(rv0Var3.s0, pv0Var2, str7, str8);
                    break;
                }
                break;
            case 8:
                rv0 rv0Var4 = (rv0) obj5;
                TLObject tLObject5 = (TLObject) obj4;
                String[] strArr = (String[]) obj3;
                TLRPC.TL_error tL_error5 = (TLRPC.TL_error) obj;
                id idVar2 = (id) obj2;
                if (tLObject5 != null) {
                    strArr[0] = "allowed";
                    if (tLObject5 instanceof TLRPC.Updates) {
                        uc7.s1(rv0Var4.N).Y3((TLRPC.Updates) tLObject5, false);
                    }
                }
                if (tL_error5 != null) {
                    rv0Var4.Y(tL_error5.text);
                }
                idVar2.dismiss();
                break;
            case 9:
                String str9 = (String) obj4;
                String str10 = (String) obj3;
                String str11 = (String) obj2;
                String str12 = (String) obj;
                nv0 nv0Var = ((mv0) obj5).a;
                try {
                    DownloadManager.Request request = new DownloadManager.Request(Uri.parse(str9));
                    request.setMimeType(str10);
                    request.addRequestHeader("User-Agent", str11);
                    request.setDescription(ob6.M0(2131742559, null));
                    request.setTitle(str12);
                    request.setNotificationVisibility(1);
                    request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, str12);
                    DownloadManager downloadManager = (DownloadManager) nv0Var.getContext().getSystemService("download");
                    if (downloadManager != null) {
                        downloadManager.enqueue(request);
                    }
                    rv0 rv0Var5 = nv0Var.R;
                    if (rv0Var5 != null) {
                        new d31(rv0Var5, rv0Var5.e).Q(R.raw.ic_download, 36, hl.S2(ob6.a0(null, null, 2131742558, str12))).k(true);
                        break;
                    }
                } catch (Exception e) {
                    cc4.g(e, true);
                    return;
                }
                break;
            case 10:
                BotWebViewContainer$WebViewProxy botWebViewContainer$WebViewProxy = (BotWebViewContainer$WebViewProxy) obj5;
                String str13 = (String) obj4;
                byte[] bArr = (byte[]) obj3;
                String str14 = (String) obj2;
                String str15 = (String) obj;
                nv0 nv0Var2 = botWebViewContainer$WebViewProxy.b;
                if (botWebViewContainer$WebViewProxy.a != null) {
                    long currentTimeMillis = System.currentTimeMillis();
                    rv0 rv0Var6 = botWebViewContainer$WebViewProxy.a;
                    if (currentTimeMillis - rv0Var6.Q > 10000) {
                        nv0Var2.c("window.navigator.__share__receive(\"security\")");
                        break;
                    } else {
                        rv0Var6.Q = 0L;
                        Context context2 = nv0Var2.getContext();
                        Activity W = hl.W(context2);
                        if (W == null && (launchActivity = LaunchActivity.H1) != null) {
                            W = launchActivity;
                        }
                        if (context2 == null || W == null || !(W instanceof LaunchActivity) || W.isFinishing() || !nv0Var2.isAttachedToWindow()) {
                            nv0Var2.c("window.navigator.__share__receive(\"security\")");
                            break;
                        } else {
                            LaunchActivity launchActivity2 = (LaunchActivity) W;
                            try {
                                jSONObject = new JSONObject(str13);
                                str = jSONObject.optString("url", null);
                                try {
                                    str2 = jSONObject.optString("text", null);
                                } catch (Exception e2) {
                                    e = e2;
                                    str2 = null;
                                }
                            } catch (Exception e3) {
                                e = e3;
                                str = null;
                                str2 = null;
                            }
                            try {
                                str3 = jSONObject.optString("title", null);
                            } catch (Exception e4) {
                                e = e4;
                                cc4.g(e, true);
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
                                launchActivity2.q1 = new te2(botWebViewContainer$WebViewProxy, (byte) 9);
                                launchActivity2.startActivityForResult(Intent.createChooser(intent, ob6.M0(2131745187, null)), 521);
                                return;
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
                                        File z = xb4.z(4);
                                        StringBuilder sb3 = new StringBuilder();
                                        sb3.append(xb4.q(str14 == null ? "file" : str14));
                                        sb3.append(b3 > 0 ? qd4.n(b3, " (", ")") : "");
                                        file = new File(z, sb3.toString());
                                        b3++;
                                    } else {
                                        try {
                                            FileOutputStream fileOutputStream = new FileOutputStream(file);
                                            fileOutputStream.write(bArr);
                                            fileOutputStream.close();
                                        } catch (Exception e5) {
                                            cc4.g(e5, true);
                                        }
                                        try {
                                            if (str15 == null) {
                                                intent2.setType("text/plain");
                                            } else {
                                                intent2.setType(str15);
                                            }
                                            if (str14 != null) {
                                                intent2.putExtra("android.intent.extra.TITLE", str14);
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
                                            cc4.g(e6, true);
                                        }
                                    }
                                }
                            } else {
                                intent2.setType("text/plain");
                            }
                            launchActivity2.q1 = new te2(botWebViewContainer$WebViewProxy, (byte) 9);
                            launchActivity2.startActivityForResult(Intent.createChooser(intent2, ob6.M0(2131745187, null)), 521);
                        }
                    }
                }
                break;
            case 11:
                w71 w71Var = (w71) obj5;
                c71 c71Var = (c71) obj4;
                TLRPC.TL_documentAttributeAudio tL_documentAttributeAudio = (TLRPC.TL_documentAttributeAudio) obj3;
                c71Var.e.b = false;
                tL_documentAttributeAudio.title = (String) obj2;
                tL_documentAttributeAudio.performer = (String) obj;
                vic vicVar = w71Var.n;
                for (int i5 = 0; i5 < vicVar.getViewPages().length; i5++) {
                    d79 a = w71Var.a(vicVar.getViewPages()[i5]);
                    if (a != null && ((i71) a.getAdapter()).d == 3) {
                        i71 i71Var = (i71) a.getAdapter();
                        int i6 = 0;
                        while (true) {
                            if (i6 >= i71Var.e.size()) {
                                break;
                            } else if (((p71) i71Var.e.get(i6)).d == c71Var) {
                                i71Var.g(i6);
                            } else {
                                i6++;
                            }
                        }
                    }
                }
                break;
            case 12:
                ((CameraController) obj5).lambda$open$10((CameraSession) obj4, (Runnable) obj3, (SurfaceTexture) obj2, (Runnable) obj);
                break;
            case 13:
                ve1 ve1Var = (ve1) obj5;
                String str16 = (String) obj4;
                TLRPC.TL_error tL_error6 = (TLRPC.TL_error) obj;
                TLObject tLObject6 = (TLObject) obj3;
                TL_account.checkUsername checkusername = (TL_account.checkUsername) obj2;
                ve1Var.e = 0;
                String str17 = ve1Var.f;
                if (str17 != null && str17.equals(str16)) {
                    if (tL_error6 != null || !(tLObject6 instanceof TLRPC.TL_boolTrue)) {
                        if (ve1Var.H != null) {
                            if (tL_error6 != null && "USERNAME_INVALID".equals(tL_error6.text) && checkusername.username.length() == 4) {
                                ve1Var.H.setText(ob6.M0(2131743309, null));
                                te1 te1Var = ve1Var.H;
                                int i7 = aob.p7;
                                te1Var.setTag(Integer.valueOf(i7));
                                yob.X(ve1Var.H, i7, null);
                            } else if (tL_error6 == null || !"USERNAME_PURCHASE_AVAILABLE".equals(tL_error6.text)) {
                                ve1Var.H.setText(ob6.M0(2131743313, null));
                                te1 te1Var2 = ve1Var.H;
                                int i8 = aob.p7;
                                te1Var2.setTag(Integer.valueOf(i8));
                                yob.X(ve1Var.H, i8, null);
                            } else {
                                int length = checkusername.username.length();
                                te1 te1Var3 = ve1Var.H;
                                if (length == 4) {
                                    te1Var3.setText(ob6.M0(2131743308, null));
                                } else {
                                    te1Var3.setText(ob6.M0(2131743312, null));
                                }
                                te1 te1Var4 = ve1Var.H;
                                int i9 = aob.F6;
                                te1Var4.setTag(Integer.valueOf(i9));
                                yob.X(ve1Var.H, i9, null);
                            }
                            ue1 ue1Var = ve1Var.G;
                            if (ue1Var != null) {
                                int i10 = ue1.f;
                                ue1Var.a();
                                break;
                            }
                        }
                    } else {
                        te1 te1Var5 = ve1Var.H;
                        if (te1Var5 != null) {
                            te1Var5.setText(ob6.a0("UsernameAvailable", null, 2131743322, str16));
                            te1 te1Var6 = ve1Var.H;
                            int i11 = aob.w6;
                            te1Var6.setTag(Integer.valueOf(i11));
                            yob.X(ve1Var.H, i11, null);
                            ue1 ue1Var2 = ve1Var.G;
                            if (ue1Var2 != null) {
                                int i12 = ue1.f;
                                ue1Var2.a();
                                break;
                            }
                        }
                    }
                }
                break;
            case 14:
                TLRPC.TL_messages_exportedChatInvite tL_messages_exportedChatInvite = (TLRPC.TL_messages_exportedChatInvite) obj3;
                boolean[] zArr2 = (boolean[]) obj2;
                id idVar3 = (id) obj;
                wf1 wf1Var = ((rf1) obj5).a.n;
                wf1Var.B0 = false;
                wf1Var.z0.put(((TLRPC.TL_chatInviteExported) obj4).link, tL_messages_exportedChatInvite == null ? 0 : tL_messages_exportedChatInvite);
                if (!zArr2[0]) {
                    idVar3.dismiss();
                    if (tL_messages_exportedChatInvite != null) {
                        wf1Var.e1(tL_messages_exportedChatInvite, wf1Var.A0);
                        break;
                    } else {
                        bs2.v(null, 2131748667, d31.b0(wf1Var), R.raw.linkbroken, 36);
                        break;
                    }
                }
                break;
            case 15:
                wh1 wh1Var = (wh1) obj5;
                boolean[] zArr3 = (boolean[]) obj4;
                int[] iArr = (int[]) obj3;
                int[] iArr2 = (int[]) obj2;
                TLRPC.TL_error tL_error7 = (TLRPC.TL_error) obj;
                wh1Var.getClass();
                if (!zArr3[0] && (i = iArr[0]) < iArr2[0]) {
                    if (tL_error7 != null) {
                        zArr3[0] = true;
                        if ("BOOSTS_REQUIRED".equals(tL_error7.text)) {
                            wh1Var.getMessagesController().G0().b(wh1Var.a, wh1Var.c, new ah1(wh1Var, b2));
                            break;
                        } else {
                            wh1Var.Q.setLoading(false);
                            d31.b0(wh1Var).Q(R.raw.error, 36, ob6.a0(null, null, 2131743533, tL_error7.text)).j();
                            break;
                        }
                    } else {
                        int i13 = i + 1;
                        iArr[0] = i13;
                        if (i13 == iArr2[0]) {
                            wh1Var.finishFragment();
                            e eVar = wh1Var.m0;
                            if (eVar != null) {
                                if (eVar instanceof g92) {
                                    ((g92) eVar).s0();
                                }
                                bs2.v(null, wh1Var.d ? 2131749252 : 2131752434, d31.b0(wh1Var.m0), R.raw.contact_check, 36);
                                wh1Var.m0 = null;
                            }
                            wh1Var.Q.setLoading(false);
                            break;
                        }
                    }
                }
                break;
            case 16:
                gi1 gi1Var = (gi1) obj5;
                String str18 = (String) obj4;
                TLRPC.TL_error tL_error8 = (TLRPC.TL_error) obj;
                TLObject tLObject7 = (TLObject) obj3;
                TLRPC.TL_channels_checkUsername tL_channels_checkUsername = (TLRPC.TL_channels_checkUsername) obj2;
                gi1Var.Y = 0;
                String str19 = gi1Var.Z;
                if (str19 != null && str19.equals(str18)) {
                    if (tL_error8 == null) {
                        if (tLObject7 instanceof TLRPC.TL_boolTrue) {
                            gi1Var.W.setText(ob6.a0("LinkAvailable", null, 2131748678, str18));
                            te1 te1Var7 = gi1Var.W;
                            int i14 = aob.w6;
                            te1Var7.setTag(Integer.valueOf(i14));
                            yob.X(gi1Var.W, i14, null);
                            gi1Var.b0 = true;
                            break;
                        }
                    } else if ("USERNAME_INVALID".equals(tL_error8.text) && tL_channels_checkUsername.username.length() == 4) {
                        gi1Var.W.setText(ob6.M0(2131743309, null));
                        yob.X(gi1Var.W, aob.p7, null);
                        gi1Var.b0 = false;
                        break;
                    }
                    if (tL_error8 != null) {
                        if ("USERNAME_PURCHASE_AVAILABLE".equals(tL_error8.text)) {
                            int length2 = tL_channels_checkUsername.username.length();
                            te1 te1Var8 = gi1Var.W;
                            if (length2 == 4) {
                                te1Var8.setText(ob6.M0(2131743308, null));
                            } else {
                                te1Var8.setText(ob6.M0(2131743312, null));
                            }
                            yob.X(gi1Var.W, aob.F6, null);
                        } else if ("CHANNELS_ADMIN_PUBLIC_TOO_MUCH".equals(tL_error8.text)) {
                            yob.X(gi1Var.W, aob.p7, null);
                            gi1Var.l0 = false;
                            gi1Var.k0();
                        }
                        gi1Var.b0 = false;
                    }
                    yob.X(gi1Var.W, aob.p7, null);
                    gi1Var.W.setText(ob6.M0(2131748666, null));
                    gi1Var.b0 = false;
                }
                break;
            case 17:
                ((zu1) obj5).g9((View) obj4, (boolean[]) obj3, (n8) obj2, (View) obj);
                break;
            case 18:
                zu1 zu1Var = (zu1) obj5;
                boolean[] zArr4 = (boolean[]) obj4;
                boolean[] zArr5 = (boolean[]) obj3;
                ImageView imageView2 = (ImageView) obj2;
                ImageView imageView3 = (ImageView) obj;
                if (!zArr4[0]) {
                    zArr4[0] = true;
                    long[] jArr = {-1};
                    ao1 ao1Var = new ao1(jArr, zArr5, imageView2, imageView3, (byte) 1);
                    TLRPC.TL_messages_rateTranscribedAudio tL_messages_rateTranscribedAudio = new TLRPC.TL_messages_rateTranscribedAudio();
                    tL_messages_rateTranscribedAudio.msg_id = zu1Var.v5.e1();
                    tL_messages_rateTranscribedAudio.peer = zu1Var.getMessagesController().m1(zu1Var.v5.k.peer_id);
                    tL_messages_rateTranscribedAudio.transcription_id = zu1Var.v5.k.voiceTranscriptionId;
                    tL_messages_rateTranscribedAudio.good = zArr5[0];
                    zu1Var.getConnectionsManager().sendRequest(tL_messages_rateTranscribedAudio, new fn0((Object) zu1Var, (Object) ao1Var, (Object) jArr, (byte) 17));
                    hl.d3(ao1Var, 150L);
                    break;
                }
                break;
            case 19:
                ju1 ju1Var = (ju1) obj5;
                id[] idVarArr = (id[]) obj3;
                r47 r47Var = (r47) obj2;
                o1 o1Var = (o1) obj;
                zu1 zu1Var2 = ju1Var.a;
                if (((TLRPC.Message) obj4).suggested_post.schedule_date == 0) {
                    idVarArr[0].setOnDismissListener(null);
                    nx0 nx0Var = (nx0) jj.Q(zu1Var2.getParentActivity(), 0L, new h01((Object) ju1Var, (Object) r47Var, (byte) 18), zu1Var2.getResourceProvider(), 1).b;
                    nx0Var.show();
                    nx0Var.setOnDismissListener(o1Var);
                    break;
                } else {
                    zu1Var2.getMessagesController().t(r47Var.k.id, 0, wf3.n(r47Var.k.peer_id), null, false);
                    break;
                }
            case 20:
                c cVar2 = (c) obj5;
                FrameLayout frameLayout = (FrameLayout) obj4;
                ey1 ey1Var = (ey1) obj3;
                ChatActivityEnterView chatActivityEnterView = cVar2.a;
                int i15 = ChatActivityEnterView.X7;
                bn3 D0 = chatActivityEnterView.D0();
                ay1 ay1Var = new ay1(cVar2, frameLayout, b2);
                te2 te2Var = new te2((sh9) obj2, (byte) 16);
                jj1 jj1Var = new jj1((knc) obj, frameLayout, (byte) 29);
                D0.n();
                Context context3 = D0.h;
                vnb vnbVar = D0.n;
                zv4 zv4Var = new zv4(context3, ey1Var, vnbVar, ay1Var);
                int[] iArr3 = new int[2];
                ey1Var.getLocationInWindow(iArr3);
                zv4Var.c0 = iArr3[1] > hl.q.y / 2;
                zv4Var.a0 = true;
                zv4Var.M = hl.L(220.0f);
                zv4Var.L = aob.p1(0.74f, aob.v0(aob.d6, vnbVar));
                zv4Var.n = hl.L(292.0f);
                int v0 = aob.v0(aob.G6, vnbVar);
                ArrayList N = D0.N();
                int size = N.size();
                while (i2 < size) {
                    Object obj6 = N.get(i2);
                    i2++;
                    cm3 cm3Var = (cm3) obj6;
                    zv4Var.a(new an3(D0.h, cm3Var, v0, D0.f.a.R, false), 44, new wd3(te2Var, cm3Var, (byte) 19));
                }
                zv4Var.setFocusableInTouchMode(true);
                zv4Var.setOnKeyListener(new by1(zv4Var, (byte) 3));
                zv4Var.R = jj1Var;
                frameLayout.addView(zv4Var, new FrameLayout.LayoutParams(-1, -1));
                zv4Var.requestFocus();
                zv4Var.g();
                break;
            case 21:
                c cVar3 = (c) obj5;
                tnc tncVar = (tnc) obj4;
                mnc mncVar = (mnc) obj2;
                vnc vncVar = (vnc) obj;
                ChatActivityEnterView chatActivityEnterView2 = cVar3.a;
                ae8 a6 = chatActivityEnterView2.E3.a6(tncVar, (zm9) obj3);
                if (a6 == null) {
                    hl.B2(tncVar);
                    break;
                } else {
                    int J0 = chatActivityEnterView2.J0(aob.E8);
                    ArrayList N2 = chatActivityEnterView2.D0().N();
                    int size2 = N2.size();
                    int i16 = 0;
                    while (i16 < size2) {
                        Object obj7 = N2.get(i16);
                        i16++;
                        cm3 cm3Var2 = (cm3) obj7;
                        a6.e(new an3(chatActivityEnterView2.getContext(), cm3Var2, J0, chatActivityEnterView2.R, false), 48, new dy1(mncVar, cm3Var2, b3));
                    }
                    a6.J = new dy1(cVar3, tncVar, b2);
                    chatActivityEnterView2.t1 = true;
                    ChatActivityEnterView.RecordCircle recordCircle = chatActivityEnterView2.C2;
                    if (recordCircle != null) {
                        recordCircle.invalidate();
                    }
                    Objects.requireNonNull(vncVar);
                    a6.K = new te2(vncVar, (byte) 17);
                    int[] iArr4 = new int[2];
                    chatActivityEnterView2.getLocationInWindow(iArr4);
                    a6.F = iArr4[1];
                    a6.H = hl.L(316.0f);
                    a6.j();
                    break;
                }
            case 22:
                v92 v92Var = (v92) obj5;
                String str20 = (String) obj4;
                TLRPC.TL_error tL_error9 = (TLRPC.TL_error) obj;
                TLObject tLObject8 = (TLObject) obj3;
                TLRPC.TL_channels_checkUsername tL_channels_checkUsername2 = (TLRPC.TL_channels_checkUsername) obj2;
                v92Var.i0 = 0;
                String str21 = v92Var.j0;
                if (str21 != null && str21.equals(str20)) {
                    if (tL_error9 == null) {
                        if (tLObject8 instanceof TLRPC.TL_boolTrue) {
                            v92Var.h.setText(ob6.a0("LinkAvailable", null, 2131748678, str20));
                            v92Var.h.setTextColorByKey(aob.w6);
                            v92Var.l0 = true;
                            break;
                        }
                    } else if ("USERNAME_INVALID".equals(tL_error9.text) && tL_channels_checkUsername2.username.length() == 4) {
                        v92Var.h.setText(ob6.M0(2131743309, null));
                        yob.X(v92Var.h.getTextView(), aob.p7, null);
                        v92Var.l0 = false;
                        break;
                    }
                    if (tL_error9 != null) {
                        if ("USERNAME_PURCHASE_AVAILABLE".equals(tL_error9.text)) {
                            int length3 = tL_channels_checkUsername2.username.length();
                            p92 p92Var = v92Var.h;
                            if (length3 == 4) {
                                p92Var.setText(ob6.M0(2131743308, null));
                            } else {
                                p92Var.setText(ob6.M0(2131743312, null));
                            }
                            yob.X(v92Var.h.getTextView(), aob.F6, null);
                        } else if ("CHANNELS_ADMIN_PUBLIC_TOO_MUCH".equals(tL_error9.text)) {
                            v92Var.d0 = false;
                            v92Var.e0();
                        }
                        v92Var.l0 = false;
                    }
                    v92Var.h.setText(ob6.M0(2131748666, null));
                    v92Var.h.setTextColorByKey(aob.p7);
                    v92Var.l0 = false;
                }
                break;
            case 23:
                ((pd2) obj5).k0((TLRPC.TL_error) obj, (TLRPC.TL_inputCheckPasswordSRP) obj4, (TwoStepVerificationActivity) obj3, (TLRPC.TL_channels_editCreator) obj2);
                break;
            case 24:
                a();
                break;
            case 25:
                b();
                break;
            case 26:
                c();
                break;
            case 27:
                ((uj3) obj5).p4((TLObject) obj4, (TLRPC.UserFull) obj3, (TL_account.TL_birthday) obj2, (TLRPC.TL_error) obj);
                break;
            case 28:
                d();
                break;
            default:
                ow4 ow4Var = (ow4) obj5;
                l01 l01Var = (l01) obj4;
                id idVar4 = (id) obj3;
                TLRPC.Updates updates = (TLRPC.Updates) obj2;
                TLRPC.TL_error tL_error10 = (TLRPC.TL_error) obj;
                jra jraVar = ow4Var.D1;
                if (jraVar != null) {
                    jraVar.run();
                }
                l01Var.c(false);
                idVar4.dismiss();
                ow4Var.dismiss();
                e S = LaunchActivity.S();
                if (S != null) {
                    if (updates != null) {
                        v21 I = d31.b0(S).I(R.raw.forward, ob6.M0(2131749645, null), hl.S2(ob6.a0(null, null, 2131749646, ow4Var.n1, wf3.s(ow4Var.o1))));
                        I.u = true;
                        I.j();
                        break;
                    } else {
                        d31.b0(S).g0(tL_error10, false);
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ la7(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, byte b) {
        this.a = b;
        this.b = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
        this.c = obj5;
    }

    public /* synthetic */ la7(Object obj, TLRPC.TL_error tL_error, Object obj2, Object obj3, Object obj4, byte b) {
        this.a = b;
        this.b = obj;
        this.c = tL_error;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
    }

    public /* synthetic */ la7(TLObject tLObject, uc7 uc7Var, ku0 ku0Var, nm0 nm0Var, TLRPC.TL_error tL_error) {
        this.a = (byte) 4;
        this.d = tLObject;
        this.b = uc7Var;
        this.e = ku0Var;
        this.f = nm0Var;
        this.c = tL_error;
    }

    public /* synthetic */ la7(TLRPC.TL_error tL_error, pcc pccVar, TLObject tLObject, uc7 uc7Var, pcc pccVar2, byte b) {
        this.a = b;
        this.c = tL_error;
        this.d = pccVar;
        this.e = tLObject;
        this.b = uc7Var;
        this.f = pccVar2;
    }

    public /* synthetic */ la7(e eVar, String str, TLRPC.TL_error tL_error, TLObject tLObject, TLObject tLObject2, byte b) {
        this.a = b;
        this.b = eVar;
        this.d = str;
        this.c = tL_error;
        this.e = tLObject;
        this.f = tLObject2;
    }
}
