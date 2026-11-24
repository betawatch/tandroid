// default package

import android.app.Activity;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import android.webkit.ValueCallback;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import org.json.JSONObject;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;
import org.telegram.utils.twidget.x;
import org.telegram.utils.twidget.z;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes3.dex */
public final /* synthetic */ class isc implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ isc(atc atcVar, Object obj, byte b) {
        this.a = b;
        this.c = atcVar;
        this.b = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00b8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void a() {
        SQLiteCursor sQLiteCursor;
        ArrayList arrayList;
        ad7 ad7Var = (ad7) this.b;
        svc svcVar = (svc) this.c;
        long j = svcVar.c;
        int i = svcVar.d;
        ArrayList arrayList2 = new ArrayList();
        SQLiteCursor sQLiteCursor2 = null;
        r11 = null;
        r11 = null;
        SQLiteCursor sQLiteCursor3 = null;
        SQLiteCursor sQLiteCursor4 = null;
        try {
            try {
                SQLiteDatabase sQLiteDatabase = ad7Var.b;
                Locale locale = Locale.US;
                SQLiteCursor queryFinalized = sQLiteDatabase.queryFinalized("SELECT local FROM widget_state WHERE uid = " + j + " AND mid = " + i, new Object[0]);
                try {
                    if (queryFinalized.next() && !queryFinalized.isNull(0)) {
                        sQLiteCursor3 = queryFinalized.stringValue(0);
                    }
                    queryFinalized.dispose();
                    SQLiteCursor queryFinalized2 = ad7Var.b.queryFinalized("SELECT width, height, anchor FROM widget_heights WHERE uid = " + j + " AND mid = " + i + " ORDER BY date DESC", new Object[0]);
                    while (queryFinalized2.next()) {
                        try {
                            arrayList2.add(new int[]{queryFinalized2.intValue(0), queryFinalized2.intValue(1), queryFinalized2.intValue(2)});
                        } catch (Exception e) {
                            SQLiteCursor sQLiteCursor5 = sQLiteCursor3;
                            sQLiteCursor4 = queryFinalized2;
                            e = e;
                            sQLiteCursor = sQLiteCursor5;
                            ad7Var.n(e, true);
                            if (sQLiteCursor4 != null) {
                                sQLiteCursor4.dispose();
                            }
                            sQLiteCursor2 = sQLiteCursor;
                            Object[] objArr = {sQLiteCursor2, arrayList2};
                            arrayList = (ArrayList) objArr[1];
                            if (!arrayList.isEmpty()) {
                            }
                            gl.c3(new isc((Object) svcVar, (Object) objArr, (byte) 13));
                        } catch (Throwable th) {
                            th = th;
                            sQLiteCursor2 = queryFinalized2;
                            if (sQLiteCursor2 != null) {
                                sQLiteCursor2.dispose();
                            }
                            throw th;
                        }
                    }
                    queryFinalized2.dispose();
                    sQLiteCursor2 = sQLiteCursor3;
                } catch (Exception e2) {
                    e = e2;
                    sQLiteCursor = sQLiteCursor3;
                    sQLiteCursor4 = queryFinalized;
                } catch (Throwable th2) {
                    th = th2;
                    sQLiteCursor2 = queryFinalized;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Exception e3) {
            e = e3;
            sQLiteCursor = null;
        }
        Object[] objArr2 = {sQLiteCursor2, arrayList2};
        arrayList = (ArrayList) objArr2[1];
        if (!arrayList.isEmpty()) {
            tvc k = vvc.k(svcVar.a());
            synchronized (k) {
                if (k.a.isEmpty()) {
                    for (int i2 = 0; i2 < arrayList.size() && i2 < 4; i2++) {
                        k.a.add((int[]) arrayList.get(i2));
                    }
                }
            }
        }
        gl.c3(new isc((Object) svcVar, (Object) objArr2, (byte) 13));
    }

    /* JADX WARN: Code restructure failed: missing block: B:199:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:213:?, code lost:
    
        return;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        TLRPC.WebPage webPage;
        il1 il1Var;
        InputStream inputStream;
        String str;
        bwc bwcVar;
        gwc gwcVar;
        bwc bwcVar2;
        d S;
        zi9 zi9Var;
        bwc bwcVar3;
        byte b = 3;
        TLRPC.WebPage webPage2 = null;
        r3 = null;
        r3 = null;
        View view = null;
        switch (this.a) {
            case 0:
                a8 a8Var = (a8) this.b;
                a8Var.setEnabled(((atc) this.c).b() != null);
                a8Var.animate().alpha(a8Var.isEnabled() ? 1.0f : 0.5f);
                return;
            case 1:
                ((wt) this.b).g0.a((Integer) this.c);
                return;
            case 2:
                tsc tscVar = (tsc) this.b;
                String str2 = (String) this.c;
                na7 messagesController = tscVar.getMessagesController();
                messagesController.getClass();
                TL_account.toggleWebBrowserSettingsException togglewebbrowsersettingsexception = new TL_account.toggleWebBrowserSettingsException();
                togglewebbrowsersettingsexception.url = str2;
                togglewebbrowsersettingsexception.delete = true;
                messagesController.getConnectionsManager().sendRequestTyped(togglewebbrowsersettingsexception, new k67(messagesController, b));
                tscVar.a.g3.O(true);
                return;
            case 3:
                atc atcVar = (atc) this.c;
                TLObject tLObject = (TLObject) this.b;
                int i = atcVar.a;
                atcVar.g = true;
                if (tLObject instanceof TLRPC.TL_messages_webPage) {
                    TLRPC.TL_messages_webPage tL_messages_webPage = (TLRPC.TL_messages_webPage) tLObject;
                    na7.q1(i).b4(tL_messages_webPage.users, false);
                    na7.q1(i).V3(tL_messages_webPage.chats, false);
                    webPage = tL_messages_webPage.webpage;
                    atcVar.h = webPage;
                } else {
                    if (tLObject instanceof TLRPC.TL_webPage) {
                        webPage = (TLRPC.TL_webPage) tLObject;
                        if (webPage.cached_page instanceof TL_iv.TL_page) {
                            atcVar.h = webPage;
                        }
                    }
                    atcVar.h = null;
                    webPage = null;
                }
                if (webPage == null || webPage.cached_page != null) {
                    webPage2 = webPage;
                } else {
                    atcVar.h = null;
                }
                if (!gba.t0 && webPage2 != null && (il1Var = atcVar.l) != null) {
                    il1Var.run();
                }
                atcVar.c();
                return;
            case 4:
                ((atc) this.c).m.remove((isc) this.b);
                return;
            case 5:
                final rtc rtcVar = (rtc) this.b;
                rtcVar.e.b.evaluateJavascript((String) this.c, new ValueCallback() { // from class: qtc
                    @Override // android.webkit.ValueCallback
                    public final void onReceiveValue(Object obj) {
                        String str3 = (String) obj;
                        rtc rtcVar2 = rtc.this;
                        String[] strArr = rtcVar2.c;
                        strArr[0] = strArr[0].replace(rtcVar2.d, "/signature/".concat(str3.substring(1, str3.length() - 1)));
                        rtcVar2.b.countDown();
                    }
                });
                return;
            case 6:
                auc aucVar = (auc) this.b;
                ztc ztcVar = (ztc) this.c;
                aucVar.getClass();
                byte[] bArr = new byte[65536];
                try {
                    inputStream = ztcVar.b.getInputStream();
                } catch (Exception unused) {
                    aucVar.d(ztcVar, true);
                    return;
                }
                while (true) {
                    synchronized (aucVar.a) {
                        while (!aucVar.u && aucVar.m.get(Integer.valueOf(ztcVar.a)) == ztcVar && (!aucVar.t || !ztcVar.e || ztcVar.c == 0)) {
                            aucVar.a.wait();
                        }
                        if (!aucVar.u && aucVar.m.get(Integer.valueOf(ztcVar.a)) == ztcVar) {
                            int read = inputStream.read(bArr, 0, (int) Math.min(65536L, ztcVar.c));
                            if (read < 0) {
                                aucVar.d(ztcVar, true);
                                return;
                            }
                            if (read != 0) {
                                byte[] bArr2 = new byte[read];
                                System.arraycopy(bArr, 0, bArr2, 0, read);
                                synchronized (aucVar.a) {
                                    if (!aucVar.u && aucVar.m.get(Integer.valueOf(ztcVar.a)) == ztcVar && aucVar.t) {
                                        ztcVar.c -= read;
                                        aucVar.n(2, ztcVar.a, bArr2);
                                    }
                                }
                            }
                        }
                        aucVar.d(ztcVar, true);
                        return;
                    }
                }
            case 7:
                auc aucVar2 = (auc) this.b;
                String str3 = (String) this.c;
                aucVar2.getClass();
                try {
                    byte[] decode = Base64.decode(str3.substring(14), 2);
                    if (decode.length < 8 || decode.length > 1048584) {
                        aucVar2.h();
                    } else {
                        aucVar2.m(decode);
                    }
                    return;
                } catch (IllegalArgumentException e) {
                    fa4.g(e, true);
                    aucVar2.h();
                    return;
                }
            case 8:
                ((auc) this.b).m((byte[]) this.c);
                return;
            case 9:
                suc sucVar = (suc) this.b;
                String str4 = (String) this.c;
                tuc tucVar = sucVar.a;
                Activity parentActivity = tucVar.getParentActivity();
                k27 k27Var = tucVar.n;
                if (parentActivity != null) {
                    if (w01.a) {
                        fa4.b(str4);
                    }
                    str4.getClass();
                    if (str4.equals("share_game")) {
                        k27Var.k.with_my_score = false;
                    } else if (str4.equals("share_score")) {
                        k27Var.k.with_my_score = true;
                    }
                    tucVar.showDialog(taa.G0(tucVar.getParentActivity(), k27Var, null, false, tucVar.h));
                    return;
                }
                return;
            case 10:
                svc svcVar = (svc) this.b;
                TLRPC.TL_messageMediaWidget tL_messageMediaWidget = (TLRPC.TL_messageMediaWidget) this.c;
                svcVar.r = tL_messageMediaWidget;
                svcVar.q = tL_messageMediaWidget.public_data_hash;
                vvc.a(svcVar, vvc.C(tL_messageMediaWidget.chat_data), vvc.C(tL_messageMediaWidget.public_data));
                return;
            case 11:
                ((il3) this.b).a(null, (TLRPC.TL_error) this.c);
                return;
            case 12:
                a();
                return;
            case 13:
                svc svcVar2 = (svc) this.b;
                String str5 = (String) ((Object[]) this.c)[0];
                HashMap hashMap = vvc.c;
                svcVar2.z = true;
                String a = svcVar2.a();
                if (str5 != null && !hashMap.containsKey(a)) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("local", new JSONObject(str5));
                        hashMap.put(a, jSONObject);
                    } catch (Exception e2) {
                        fa4.g(e2, true);
                    }
                }
                bwc bwcVar4 = svcVar2.t;
                if (bwcVar4 != null) {
                    JSONObject jSONObject2 = (JSONObject) hashMap.get(a);
                    try {
                        str = k96.D0().y.toLanguageTag();
                    } catch (Exception unused2) {
                        str = null;
                    }
                    String jSONObject3 = jSONObject2 != null ? jSONObject2.toString() : null;
                    bwcVar4.s = str;
                    bwcVar4.t = jSONObject3;
                }
                zi9 zi9Var2 = svcVar2.u;
                if (zi9Var2 != null && (bwcVar4 == null || bwcVar4.h <= 0)) {
                    zi9Var2.p0("cached heights read");
                }
                if (svcVar2.A) {
                    svcVar2.A = false;
                    if (svcVar2.x > 0 && bwcVar4 != null) {
                        vvc.A(svcVar2);
                    }
                }
                vvc.o();
                return;
            case 14:
                ((x) this.b).q((yvc) this.c, "did not make a session in 15000 ms");
                return;
            case 15:
                z zVar = (z) this.b;
                String str6 = (String) this.c;
                if (zVar.A || (bwcVar = zVar.R) == null || (gwcVar = bwcVar.g) == null) {
                    return;
                }
                if (gwcVar.F || (gwcVar.w && gwcVar.E)) {
                    gwcVar.a.f(str6);
                    return;
                }
                return;
            case 16:
                z zVar2 = (z) this.b;
                JSONObject jSONObject4 = (JSONObject) this.c;
                if (zVar2.A || (bwcVar2 = zVar2.R) == null || bwcVar2.d == null) {
                    return;
                }
                svc g = vvc.g(bwcVar2);
                String optString = jSONObject4.optString("kind");
                if (!"openLink".equals(optString) && !"openTelegramLink".equals(optString)) {
                    if ("haptic".equals(optString)) {
                        if (g != null && g.x > 0 && (zi9Var = g.w) != null) {
                            view = zi9Var.W;
                        }
                        if (view != null) {
                            String optString2 = jSONObject4.optString("haptic");
                            if ("selection".equals(optString2)) {
                                b = 4;
                            } else if ("notification".equals(optString2)) {
                                b = 16;
                            }
                            view.performHapticFeedback(b);
                            return;
                        }
                        return;
                    }
                    return;
                }
                String optString3 = jSONObject4.optString("url");
                boolean equals = "openTelegramLink".equals(optString);
                if (TextUtils.isEmpty(optString3) || vvc.i || (S = LaunchActivity.S()) == null || S.getParentActivity() == null) {
                    return;
                }
                Activity parentActivity2 = S.getParentActivity();
                if (equals) {
                    d01.t(parentActivity2, optString3);
                    return;
                }
                vvc.i = true;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, S.getResourceProvider(), parentActivity2);
                alertDialog$Builder.a.S = k96.M0(2131742609, null);
                alertDialog$Builder.a.U = k96.a0(null, null, 2131742610, optString3);
                alertDialog$Builder.j(k96.M0(2131747624, null), new cwb(parentActivity2, optString3, (byte) 12));
                alertDialog$Builder.g(k96.M0(2131752577, null), null);
                hd hdVar = alertDialog$Builder.a;
                hdVar.setOnDismissListener(new g5((byte) 7));
                if (S.showDialog(hdVar) == null) {
                    vvc.i = false;
                    return;
                }
                return;
            default:
                z zVar3 = (z) this.b;
                zVar3.U = ((Exception) this.c).toString();
                if (zVar3.A || (bwcVar3 = zVar3.R) == null) {
                    return;
                }
                bwcVar3.f(zVar3.U);
                return;
        }
    }

    public /* synthetic */ isc(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }
}
