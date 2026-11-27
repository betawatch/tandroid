// default package

import android.app.Activity;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import android.webkit.ValueCallback;
import j$.util.concurrent.ConcurrentHashMap;
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
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.LaunchActivity;
import org.telegram.utils.twidget.x;
import org.telegram.utils.twidget.z;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes3.dex */
public final /* synthetic */ class cxc implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ cxc(pxc pxcVar, Object obj, byte b) {
        this.a = b;
        this.c = pxcVar;
        this.b = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00b8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void a() {
        SQLiteCursor sQLiteCursor;
        ArrayList arrayList;
        jf7 jf7Var = (jf7) this.b;
        h0d h0dVar = (h0d) this.c;
        long j = h0dVar.c;
        int i = h0dVar.d;
        ArrayList arrayList2 = new ArrayList();
        SQLiteCursor sQLiteCursor2 = null;
        r11 = null;
        r11 = null;
        SQLiteCursor sQLiteCursor3 = null;
        SQLiteCursor sQLiteCursor4 = null;
        try {
            try {
                SQLiteDatabase sQLiteDatabase = jf7Var.b;
                Locale locale = Locale.US;
                SQLiteCursor queryFinalized = sQLiteDatabase.queryFinalized("SELECT local FROM widget_state WHERE uid = " + j + " AND mid = " + i, new Object[0]);
                try {
                    if (queryFinalized.next() && !queryFinalized.isNull(0)) {
                        sQLiteCursor3 = queryFinalized.stringValue(0);
                    }
                    queryFinalized.dispose();
                    SQLiteCursor queryFinalized2 = jf7Var.b.queryFinalized("SELECT width, height, anchor FROM widget_heights WHERE uid = " + j + " AND mid = " + i + " ORDER BY date DESC", new Object[0]);
                    while (queryFinalized2.next()) {
                        try {
                            arrayList2.add(new int[]{queryFinalized2.intValue(0), queryFinalized2.intValue(1), queryFinalized2.intValue(2)});
                        } catch (Exception e) {
                            SQLiteCursor sQLiteCursor5 = sQLiteCursor3;
                            sQLiteCursor4 = queryFinalized2;
                            e = e;
                            sQLiteCursor = sQLiteCursor5;
                            jf7Var.n(e, true);
                            if (sQLiteCursor4 != null) {
                                sQLiteCursor4.dispose();
                            }
                            sQLiteCursor2 = sQLiteCursor;
                            Object[] objArr = {sQLiteCursor2, arrayList2};
                            arrayList = (ArrayList) objArr[1];
                            if (!arrayList.isEmpty()) {
                            }
                            hl.c3(new cxc((Object) h0dVar, (Object) objArr, (byte) 12));
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
            i0d k = k0d.k(h0dVar.a());
            synchronized (k) {
                if (k.a.isEmpty()) {
                    for (int i2 = 0; i2 < arrayList.size() && i2 < 4; i2++) {
                        k.a.add((int[]) arrayList.get(i2));
                    }
                }
            }
        }
        hl.c3(new cxc((Object) h0dVar, (Object) objArr2, (byte) 12));
    }

    /* JADX WARN: Code restructure failed: missing block: B:296:?, code lost:
    
        return;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        TLRPC.WebPage webPage;
        om1 om1Var;
        InputStream inputStream;
        String str;
        StringBuilder sb;
        TL_bots.TL_botProfileWidget tL_botProfileWidget;
        q0d q0dVar;
        v0d v0dVar;
        q0d q0dVar2;
        e S;
        q0d q0dVar3;
        byte b = 2;
        TLRPC.WebPage webPage2 = null;
        r5 = null;
        r5 = null;
        View view = null;
        switch (this.a) {
            case 0:
                b8 b8Var = (b8) this.b;
                b8Var.setEnabled(((pxc) this.c).b() != null);
                b8Var.animate().alpha(b8Var.isEnabled() ? 1.0f : 0.5f);
                return;
            case 1:
                ixc ixcVar = (ixc) this.b;
                String str2 = (String) this.c;
                uc7 messagesController = ixcVar.getMessagesController();
                messagesController.getClass();
                TL_account.toggleWebBrowserSettingsException togglewebbrowsersettingsexception = new TL_account.toggleWebBrowserSettingsException();
                togglewebbrowsersettingsexception.url = str2;
                togglewebbrowsersettingsexception.delete = true;
                messagesController.getConnectionsManager().sendRequestTyped(togglewebbrowsersettingsexception, new f87(messagesController, b));
                ixcVar.a.g3.O(true);
                return;
            case 2:
                pxc pxcVar = (pxc) this.c;
                TLObject tLObject = (TLObject) this.b;
                int i = pxcVar.a;
                pxcVar.g = true;
                if (tLObject instanceof TLRPC.TL_messages_webPage) {
                    TLRPC.TL_messages_webPage tL_messages_webPage = (TLRPC.TL_messages_webPage) tLObject;
                    uc7.s1(i).j4(tL_messages_webPage.users, false);
                    uc7.s1(i).c4(tL_messages_webPage.chats, false);
                    webPage = tL_messages_webPage.webpage;
                    pxcVar.h = webPage;
                } else {
                    if (tLObject instanceof TLRPC.TL_webPage) {
                        webPage = (TLRPC.TL_webPage) tLObject;
                        if (webPage.cached_page instanceof TL_iv.TL_page) {
                            pxcVar.h = webPage;
                        }
                    }
                    pxcVar.h = null;
                    webPage = null;
                }
                if (webPage == null || webPage.cached_page != null) {
                    webPage2 = webPage;
                } else {
                    pxcVar.h = null;
                }
                if (!xea.t0 && webPage2 != null && (om1Var = pxcVar.l) != null) {
                    om1Var.run();
                }
                pxcVar.c();
                return;
            case 3:
                ((pxc) this.c).m.remove((cxc) this.b);
                return;
            case 4:
                final gyc gycVar = (gyc) this.b;
                gycVar.e.b.evaluateJavascript((String) this.c, new ValueCallback() { // from class: fyc
                    @Override // android.webkit.ValueCallback
                    public final void onReceiveValue(Object obj) {
                        String str3 = (String) obj;
                        gyc gycVar2 = gyc.this;
                        String[] strArr = gycVar2.c;
                        strArr[0] = strArr[0].replace(gycVar2.d, "/signature/".concat(str3.substring(1, str3.length() - 1)));
                        gycVar2.b.countDown();
                    }
                });
                return;
            case 5:
                pyc pycVar = (pyc) this.b;
                oyc oycVar = (oyc) this.c;
                pycVar.getClass();
                byte[] bArr = new byte[65536];
                try {
                    inputStream = oycVar.b.getInputStream();
                } catch (Exception unused) {
                    pycVar.d(oycVar, true);
                    return;
                }
                while (true) {
                    synchronized (pycVar.a) {
                        while (!pycVar.u && pycVar.m.get(Integer.valueOf(oycVar.a)) == oycVar && (!pycVar.t || !oycVar.e || oycVar.c == 0)) {
                            pycVar.a.wait();
                        }
                        if (!pycVar.u && pycVar.m.get(Integer.valueOf(oycVar.a)) == oycVar) {
                            int read = inputStream.read(bArr, 0, (int) Math.min(65536L, oycVar.c));
                            if (read < 0) {
                                pycVar.d(oycVar, true);
                                return;
                            }
                            if (read != 0) {
                                byte[] bArr2 = new byte[read];
                                System.arraycopy(bArr, 0, bArr2, 0, read);
                                synchronized (pycVar.a) {
                                    if (!pycVar.u && pycVar.m.get(Integer.valueOf(oycVar.a)) == oycVar && pycVar.t) {
                                        oycVar.c -= read;
                                        pycVar.n(2, oycVar.a, bArr2);
                                    }
                                }
                            }
                        }
                        pycVar.d(oycVar, true);
                        return;
                    }
                }
                return;
            case 6:
                pyc pycVar2 = (pyc) this.b;
                String str3 = (String) this.c;
                pycVar2.getClass();
                try {
                    byte[] decode = Base64.decode(str3.substring(14), 2);
                    if (decode.length < 8 || decode.length > 1048584) {
                        pycVar2.h();
                    } else {
                        pycVar2.m(decode);
                    }
                    return;
                } catch (IllegalArgumentException e) {
                    cc4.g(e, true);
                    pycVar2.h();
                    return;
                }
            case 7:
                ((pyc) this.b).m((byte[]) this.c);
                return;
            case 8:
                izc izcVar = (izc) this.b;
                String str4 = (String) this.c;
                jzc jzcVar = izcVar.a;
                Activity parentActivity = jzcVar.getParentActivity();
                r47 r47Var = jzcVar.n;
                if (parentActivity != null) {
                    if (f11.a) {
                        cc4.b(str4);
                    }
                    str4.getClass();
                    if (str4.equals("share_game")) {
                        r47Var.k.with_my_score = false;
                    } else if (str4.equals("share_score")) {
                        r47Var.k.with_my_score = true;
                    }
                    jzcVar.showDialog(kea.H0(jzcVar.getParentActivity(), r47Var, null, false, jzcVar.h));
                    return;
                }
                return;
            case 9:
                h0d h0dVar = (h0d) this.b;
                TLRPC.TL_messageMediaWidget tL_messageMediaWidget = (TLRPC.TL_messageMediaWidget) this.c;
                h0dVar.t = tL_messageMediaWidget;
                h0dVar.s = tL_messageMediaWidget.public_data_hash;
                k0d.a(h0dVar, k0d.D(tL_messageMediaWidget.chat_data), k0d.D(tL_messageMediaWidget.public_data));
                return;
            case 10:
                ((am3) this.b).a(null, (TLRPC.TL_error) this.c);
                return;
            case 11:
                a();
                return;
            case 12:
                h0d h0dVar2 = (h0d) this.b;
                String str5 = (String) ((Object[]) this.c)[0];
                HashMap hashMap = k0d.c;
                h0dVar2.B = true;
                String a = h0dVar2.a();
                if (str5 != null && !hashMap.containsKey(a)) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("local", new JSONObject(str5));
                        hashMap.put(a, jSONObject);
                    } catch (Exception e2) {
                        cc4.g(e2, true);
                    }
                }
                q0d q0dVar4 = h0dVar2.v;
                if (q0dVar4 != null) {
                    JSONObject jSONObject2 = (JSONObject) hashMap.get(a);
                    try {
                        str = ob6.D0().y.toLanguageTag();
                    } catch (Exception unused2) {
                        str = null;
                    }
                    String jSONObject3 = jSONObject2 != null ? jSONObject2.toString() : null;
                    q0dVar4.s = str;
                    q0dVar4.t = jSONObject3;
                }
                nm9 nm9Var = h0dVar2.w;
                if (nm9Var != null && (q0dVar4 == null || q0dVar4.h <= 0)) {
                    nm9Var.o0("cached heights read");
                }
                if (h0dVar2.C) {
                    h0dVar2.C = false;
                    if (h0dVar2.z > 0 && q0dVar4 != null) {
                        k0d.B(h0dVar2);
                    }
                }
                k0d.o();
                return;
            case 13:
                TLObject tLObject2 = (TLObject) this.b;
                j0d j0dVar = (j0d) this.c;
                ConcurrentHashMap concurrentHashMap = k0d.a;
                TLRPC.messages_WidgetPublicData messages_widgetpublicdata = tLObject2 instanceof TLRPC.messages_WidgetPublicData ? (TLRPC.messages_WidgetPublicData) tLObject2 : null;
                j0dVar.f = 0;
                long j = j0dVar.b;
                int i2 = j0dVar.a;
                long j2 = j0dVar.c;
                HashMap hashMap2 = k0d.l;
                if (j2 != 0) {
                    sb = new StringBuilder();
                    sb.append(i2);
                    sb.append("/bot");
                    sb.append(j2);
                } else {
                    sb = new StringBuilder();
                    sb.append(i2);
                    sb.append("/");
                    sb.append(j);
                }
                if (hashMap2.get(sb.toString()) == j0dVar) {
                    if (messages_widgetpublicdata != null) {
                        int i3 = messages_widgetpublicdata.period;
                        j0dVar.e = i3 <= 0 ? 30 : Math.max(5, Math.min(3600, i3));
                        if (messages_widgetpublicdata instanceof TLRPC.TL_messages_widgetPublicData) {
                            TLRPC.TL_messages_widgetPublicData tL_messages_widgetPublicData = (TLRPC.TL_messages_widgetPublicData) messages_widgetpublicdata;
                            long j3 = tL_messages_widgetPublicData.hash;
                            j0dVar.d = j3;
                            String str6 = tL_messages_widgetPublicData.data;
                            if (j2 != 0) {
                                String D = k0d.D(str6);
                                for (h0d h0dVar3 : concurrentHashMap.values()) {
                                    if (h0dVar3.o && h0dVar3.b == i2 && h0dVar3.n == j2) {
                                        h0dVar3.s = j3;
                                        k0d.a(h0dVar3, h0dVar3.q, D);
                                    }
                                }
                                TLRPC.UserFull Y1 = uc7.s1(i2).Y1(j2);
                                if (Y1 != null && (tL_botProfileWidget = Y1.bot_profile_widget) != null) {
                                    tL_botProfileWidget.public_data = str6;
                                    tL_botProfileWidget.public_data_hash = j3;
                                }
                            } else {
                                String D2 = k0d.D(str6);
                                for (h0d h0dVar4 : concurrentHashMap.values()) {
                                    if (h0dVar4.b == i2 && h0dVar4.l == j && !h0dVar4.k && (!TextUtils.equals(h0dVar4.r, D2) || h0dVar4.s != j3)) {
                                        h0dVar4.s = j3;
                                        k0d.a(h0dVar4, h0dVar4.q, D2);
                                        TLRPC.TL_messageMediaWidget tL_messageMediaWidget2 = h0dVar4.t;
                                        if (tL_messageMediaWidget2 != null) {
                                            tL_messageMediaWidget2.public_data_hash = j3;
                                        }
                                        long j4 = j3;
                                        jf7 Y = jf7.Y(i2);
                                        Y.a.c(new ic2(Y, h0dVar4.d, h0dVar4.c, str6 == null ? "" : str6, j4, (String) null));
                                        j3 = j4;
                                    }
                                }
                            }
                        }
                    }
                    hl.d3(j0dVar.g, j0dVar.e * 1000);
                    return;
                }
                return;
            case 14:
                ((x) this.b).q((n0d) this.c, "did not make a session in 15000 ms");
                return;
            case 15:
                z zVar = (z) this.b;
                String str7 = (String) this.c;
                if (zVar.A || (q0dVar = zVar.R) == null || (v0dVar = q0dVar.g) == null) {
                    return;
                }
                if (v0dVar.F || (v0dVar.w && v0dVar.E)) {
                    v0dVar.a.setCursor(str7);
                    return;
                }
                return;
            case 16:
                z zVar2 = (z) this.b;
                JSONObject jSONObject4 = (JSONObject) this.c;
                if (zVar2.A || (q0dVar2 = zVar2.R) == null || q0dVar2.d == null) {
                    return;
                }
                h0d g = k0d.g(q0dVar2);
                String optString = jSONObject4.optString("kind");
                if (!"openLink".equals(optString) && !"openTelegramLink".equals(optString)) {
                    if ("haptic".equals(optString)) {
                        if (g != null && g.z != 0) {
                            nm9 nm9Var2 = g.y;
                            if (nm9Var2 != null) {
                                view = nm9Var2.W;
                            } else {
                                sr0 sr0Var = g.p;
                                if (sr0Var != null) {
                                    view = sr0Var.h;
                                }
                            }
                        }
                        if (view != null) {
                            String optString2 = jSONObject4.optString("haptic");
                            view.performHapticFeedback("selection".equals(optString2) ? 4 : "notification".equals(optString2) ? 16 : 3);
                            return;
                        }
                        return;
                    }
                    return;
                }
                String optString3 = jSONObject4.optString("url");
                boolean equals = "openTelegramLink".equals(optString);
                if (TextUtils.isEmpty(optString3) || k0d.i || (S = LaunchActivity.S()) == null || S.getParentActivity() == null) {
                    return;
                }
                Activity parentActivity2 = S.getParentActivity();
                if (equals) {
                    m01.u(parentActivity2, optString3);
                    return;
                }
                k0d.i = true;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, S.getResourceProvider(), parentActivity2);
                alertDialog$Builder.a.S = ob6.M0(2131742503, null);
                alertDialog$Builder.a.U = ob6.a0(null, null, 2131742504, optString3);
                alertDialog$Builder.j(ob6.M0(2131747544, null), new yw9(parentActivity2, optString3, (byte) 28));
                alertDialog$Builder.g(ob6.M0(2131752570, null), null);
                id idVar = alertDialog$Builder.a;
                idVar.setOnDismissListener(new h5((byte) 7));
                if (S.showDialog(idVar) == null) {
                    k0d.i = false;
                    return;
                }
                return;
            default:
                z zVar3 = (z) this.b;
                zVar3.U = ((Exception) this.c).toString();
                if (zVar3.A || (q0dVar3 = zVar3.R) == null) {
                    return;
                }
                q0dVar3.g(zVar3.U);
                return;
        }
    }

    public /* synthetic */ cxc(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }
}
