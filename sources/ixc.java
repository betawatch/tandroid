// default package

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.CookieManager;
import android.webkit.WebStorage;
import android.webkit.WebView;
import android.widget.LinearLayout;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.e;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class ixc extends n9c implements fn7 {
    public d58 e;
    public final vs f;
    public long h;
    public long n;
    public long r;
    public int s;
    public int w;

    public ixc(vs vsVar) {
        this.f = vsVar;
    }

    public static boolean c0(File file, Boolean bool) {
        boolean z;
        if (file == null || !file.exists()) {
            return false;
        }
        if (file.isDirectory()) {
            File[] listFiles = file.listFiles();
            if (listFiles != null) {
                z = true;
                for (File file2 : listFiles) {
                    if ((bool == null || bool.booleanValue() == file2.getName().startsWith("Cookies")) && !c0(file2, bool)) {
                        z = false;
                    }
                }
            } else {
                z = true;
            }
            if (z) {
                file.delete();
            }
        } else {
            if (bool != null && bool.booleanValue() != file.getName().startsWith("Cookies")) {
                return false;
            }
            file.delete();
        }
        return true;
    }

    public static long d0(File file, Boolean bool) {
        long j = 0;
        if (file == null || !file.exists()) {
            return 0L;
        }
        if (file.isDirectory()) {
            File[] listFiles = file.listFiles();
            if (listFiles != null) {
                for (File file2 : listFiles) {
                    j += d0(file2, bool);
                }
                return j;
            }
        } else if (bool == null || bool.booleanValue() == file.getName().startsWith("Cookies")) {
            return file.length();
        }
        return 0L;
    }

    @Override // n9c
    public final void Y(ArrayList arrayList, l9c l9cVar) {
        boolean S2 = getMessagesController().S2();
        arrayList.size();
        String M0 = ob6.M0(2131752838, null);
        b8c b8cVar = new b8c(9);
        b8cVar.d = 1;
        b8cVar.m = M0;
        b8cVar.L(S2);
        arrayList.add(b8cVar);
        arrayList.add(b8c.C(ob6.M0(2131752837, null)));
        int i = 0;
        if (!S2) {
            getMessagesController().U2();
            b8c i2 = b8c.i(17, ob6.M0(2131742565, null));
            i2.L(getMessagesController().U2());
            arrayList.add(i2);
            arrayList.add(b8c.C(ob6.M0(2131742564, null)));
            arrayList.add(b8c.u(ob6.M0(2131752846, null)));
            arrayList.size();
            d58 d58Var = this.e;
            String M02 = ob6.M0(2131752830, null);
            b8c b8cVar2 = new b8c(3);
            b8cVar2.d = 16;
            b8cVar2.H = d58Var;
            b8cVar2.m = M02;
            b8cVar2.r = true;
            arrayList.add(b8cVar2);
            TL_account.TL_webBrowserSettings tL_webBrowserSettings = getMessagesController().o5;
            ArrayList<TL_account.WebDomainException> arrayList2 = tL_webBrowserSettings == null ? new ArrayList<>() : tL_webBrowserSettings.inapp_exceptions;
            int size = arrayList2.size();
            while (i < size) {
                TL_account.WebDomainException webDomainException = arrayList2.get(i);
                i++;
                TL_account.WebDomainException webDomainException2 = webDomainException;
                String str = webDomainException2.domain;
                String str2 = webDomainException2.title;
                long j = webDomainException2.favicon;
                int i3 = gxc.b;
                b8c K = b8c.K(gxc.class);
                K.m = str;
                K.o = str2;
                K.C = j;
                arrayList.add(K);
            }
            arrayList.add(b8c.C(ob6.M0(2131752847, null)));
            if (arrayList2.isEmpty()) {
                return;
            }
            arrayList.size();
            b8c e = b8c.e(5, ob6.M0(2131752829, null));
            e.s = true;
            arrayList.add(e);
            arrayList.add(b8c.C(null));
            return;
        }
        arrayList.size();
        String M03 = ob6.M0(2131752843, null);
        long j2 = this.n;
        arrayList.add(b8c.d(3, R.drawable.menu_clear_cookies, M03, j2 > 0 ? hl.i0(j2, false, false) : ""));
        arrayList.size();
        String M04 = ob6.M0(2131752845, null);
        long j3 = this.h;
        arrayList.add(b8c.d(2, R.drawable.menu_clear_cache, M04, j3 > 0 ? hl.i0(j3, false, false) : ""));
        arrayList.add(b8c.C(ob6.M0(2131752841, null)));
        if (this.r > 0) {
            arrayList.size();
            arrayList.add(b8c.c(9, R.drawable.menu_clear_recent, ob6.M0(2131752831, null)));
            arrayList.size();
            arrayList.add(b8c.d(7, R.drawable.menu_clear_cache, ob6.M0(2131752836, null), ob6.H(',', "BrowserSettingsHistoryPages", (int) this.r)));
            arrayList.add(b8c.C(null));
        }
        arrayList.add(b8c.u(ob6.M0(2131752827, null)));
        arrayList.size();
        d58 d58Var2 = this.e;
        String M05 = ob6.M0(2131752830, null);
        b8c b8cVar3 = new b8c(3);
        b8cVar3.d = 15;
        b8cVar3.H = d58Var2;
        b8cVar3.m = M05;
        b8cVar3.r = true;
        arrayList.add(b8cVar3);
        TL_account.TL_webBrowserSettings tL_webBrowserSettings2 = getMessagesController().o5;
        ArrayList<TL_account.WebDomainException> arrayList3 = tL_webBrowserSettings2 == null ? new ArrayList<>() : tL_webBrowserSettings2.external_exceptions;
        int size2 = arrayList3.size();
        int i4 = 0;
        while (i4 < size2) {
            TL_account.WebDomainException webDomainException3 = arrayList3.get(i4);
            i4++;
            TL_account.WebDomainException webDomainException4 = webDomainException3;
            String str3 = webDomainException4.domain;
            String str4 = webDomainException4.title;
            long j4 = webDomainException4.favicon;
            int i5 = gxc.b;
            b8c K2 = b8c.K(gxc.class);
            K2.m = str3;
            K2.o = str4;
            K2.C = j4;
            arrayList.add(K2);
        }
        arrayList.add(b8c.C(ob6.M0(2131752828, null)));
        if (!arrayList3.isEmpty()) {
            arrayList.size();
            b8c e2 = b8c.e(5, ob6.M0(2131752829, null));
            e2.s = true;
            arrayList.add(e2);
            arrayList.add(b8c.C(null));
        }
        arrayList.size();
        arrayList.add(b8c.d(6, R.drawable.msg_search, ob6.M0(2131745527, null), bw9.a().a));
        arrayList.add(b8c.C(ob6.M0(2131752823, null)));
        boolean z = f11.a;
    }

    @Override // n9c
    public final CharSequence Z() {
        return ob6.M0(2131752822, null);
    }

    @Override // n9c
    public final void a0(b8c b8cVar, View view) {
        int i = b8cVar.d;
        if (i == 12) {
            xea.I();
            ((wkb) view).setChecked(xea.s0);
            return;
        }
        final byte b = 1;
        if (i == 13) {
            xea.t0 = !xea.t0;
            SharedPreferences.Editor edit = uc7.e1().edit();
            edit.putBoolean("onlyLocalInstantView", xea.t0);
            edit.apply();
            ((wkb) view).setChecked(xea.t0);
            return;
        }
        if (i == 17) {
            boolean z = !getMessagesController().U2();
            uc7 messagesController = getMessagesController();
            TL_account.TL_webBrowserSettings tL_webBrowserSettings = messagesController.o5;
            if (tL_webBrowserSettings != null) {
                messagesController.I5(tL_webBrowserSettings.open_external_browser, z);
            }
            ((wkb) view).setChecked(z);
            this.a.g3.O(true);
            return;
        }
        final byte b2 = 0;
        if (i == 1) {
            uc7 messagesController2 = getMessagesController();
            TL_account.TL_webBrowserSettings tL_webBrowserSettings2 = messagesController2.o5;
            if (tL_webBrowserSettings2 != null) {
                messagesController2.I5(!tL_webBrowserSettings2.open_external_browser, tL_webBrowserSettings2.display_close_button);
            }
            boolean S2 = getMessagesController().S2();
            wkb wkbVar = (wkb) view;
            wkbVar.setChecked(S2);
            wkbVar.b(aob.w0(null, S2 ? aob.f6 : aob.e6, false), S2);
            this.a.g3.O(true);
            return;
        }
        if (i == 10) {
            uc7 messagesController3 = getMessagesController();
            TL_account.TL_webBrowserSettings tL_webBrowserSettings3 = messagesController3.o5;
            if (tL_webBrowserSettings3 != null) {
                messagesController3.I5(tL_webBrowserSettings3.open_external_browser, true);
            }
            this.a.g3.O(true);
            return;
        }
        byte b3 = 11;
        if (i == 11) {
            uc7 messagesController4 = getMessagesController();
            TL_account.TL_webBrowserSettings tL_webBrowserSettings4 = messagesController4.o5;
            if (tL_webBrowserSettings4 != null) {
                messagesController4.I5(tL_webBrowserSettings4.open_external_browser, false);
            }
            this.a.g3.O(true);
            return;
        }
        final byte b4 = 2;
        if (i == 2) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, getResourceProvider(), getParentActivity());
            String M0 = ob6.M0(2131752845, null);
            id idVar = alertDialog$Builder.a;
            idVar.S = M0;
            idVar.U = ob6.a0(null, null, 2131752844, this.h != 0 ? c00.k(new StringBuilder(" ("), hl.i0(this.h, false, false), ")") : "");
            alertDialog$Builder.j(ob6.M0(2131752066, null), new fd(this) { // from class: fxc
                public final /* synthetic */ ixc b;

                {
                    this.b = this;
                }

                @Override // fd
                public final void w(id idVar2, int i2) {
                    byte b5 = b2;
                    ixc ixcVar = this.b;
                    switch (b5) {
                        case 0:
                            a.b.deleteDatabase("webview.db");
                            a.b.deleteDatabase("webviewCache.db");
                            WebStorage.getInstance().deleteAllData();
                            try {
                                WebView webView = new WebView(ixcVar.getParentActivity());
                                webView.clearCache(true);
                                webView.clearHistory();
                                webView.destroy();
                            } catch (Exception unused) {
                            }
                            try {
                                File file = new File(a.b.getApplicationInfo().dataDir, "app_webview");
                                if (file.exists()) {
                                    ixc.c0(file, Boolean.FALSE);
                                }
                            } catch (Exception e) {
                                cc4.g(e, true);
                            }
                            try {
                                File file2 = new File(a.b.getApplicationInfo().dataDir, "cache/WebView");
                                if (file2.exists()) {
                                    ixc.c0(file2, null);
                                }
                            } catch (Exception e2) {
                                cc4.g(e2, true);
                            }
                            j84 c = j84.c();
                            HashMap hashMap = (HashMap) c.d;
                            if (hashMap == null) {
                                c.b = false;
                                c.a = true;
                                c.d = new HashMap();
                            } else {
                                hashMap.clear();
                            }
                            c.e();
                            ixcVar.e0();
                            break;
                        case 1:
                            CookieManager cookieManager = CookieManager.getInstance();
                            cookieManager.removeAllCookies(null);
                            cookieManager.flush();
                            try {
                                File file3 = new File(a.b.getApplicationInfo().dataDir, "app_webview");
                                if (file3.exists()) {
                                    ixc.c0(file3, Boolean.TRUE);
                                }
                            } catch (Exception e3) {
                                cc4.g(e3, true);
                            }
                            ixcVar.e0();
                            break;
                        case 2:
                            try {
                                ptd.c.clear();
                                ptd.d.clear();
                                File file4 = new File(xb4.z(4), "webhistory.dat");
                                if (file4.exists()) {
                                    file4.delete();
                                }
                            } catch (Exception e4) {
                                cc4.g(e4, true);
                            }
                            ixcVar.r = 0L;
                            ixcVar.a.g3.O(true);
                            break;
                        default:
                            uc7 messagesController5 = ixcVar.getMessagesController();
                            TL_account.TL_webBrowserSettings tL_webBrowserSettings5 = messagesController5.o5;
                            if (tL_webBrowserSettings5 != null) {
                                tL_webBrowserSettings5.open_external_browser = true;
                                tL_webBrowserSettings5.display_close_button = true;
                                tL_webBrowserSettings5.external_exceptions.clear();
                                messagesController5.o5.inapp_exceptions.clear();
                                messagesController5.e5(messagesController5.o5);
                            }
                            messagesController5.getConnectionsManager().sendRequestTyped(new TL_account.deleteWebBrowserSettingsExceptions(), new ic((byte) 0), new f87(messagesController5, (byte) 4));
                            ixcVar.a.g3.O(true);
                            break;
                    }
                }
            });
            alertDialog$Builder.g(ob6.M0(2131752570, null), null);
            alertDialog$Builder.c(-1);
            alertDialog$Builder.o();
            return;
        }
        final byte b5 = 3;
        if (i == 3) {
            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(0, getResourceProvider(), getParentActivity());
            String M02 = ob6.M0(2131752843, null);
            id idVar2 = alertDialog$Builder2.a;
            idVar2.S = M02;
            idVar2.U = ob6.a0(null, null, 2131752842, this.n != 0 ? c00.k(new StringBuilder(" ("), hl.i0(this.n, false, false), ")") : "");
            alertDialog$Builder2.j(ob6.M0(2131752066, null), new fd(this) { // from class: fxc
                public final /* synthetic */ ixc b;

                {
                    this.b = this;
                }

                @Override // fd
                public final void w(id idVar22, int i2) {
                    byte b52 = b;
                    ixc ixcVar = this.b;
                    switch (b52) {
                        case 0:
                            a.b.deleteDatabase("webview.db");
                            a.b.deleteDatabase("webviewCache.db");
                            WebStorage.getInstance().deleteAllData();
                            try {
                                WebView webView = new WebView(ixcVar.getParentActivity());
                                webView.clearCache(true);
                                webView.clearHistory();
                                webView.destroy();
                            } catch (Exception unused) {
                            }
                            try {
                                File file = new File(a.b.getApplicationInfo().dataDir, "app_webview");
                                if (file.exists()) {
                                    ixc.c0(file, Boolean.FALSE);
                                }
                            } catch (Exception e) {
                                cc4.g(e, true);
                            }
                            try {
                                File file2 = new File(a.b.getApplicationInfo().dataDir, "cache/WebView");
                                if (file2.exists()) {
                                    ixc.c0(file2, null);
                                }
                            } catch (Exception e2) {
                                cc4.g(e2, true);
                            }
                            j84 c = j84.c();
                            HashMap hashMap = (HashMap) c.d;
                            if (hashMap == null) {
                                c.b = false;
                                c.a = true;
                                c.d = new HashMap();
                            } else {
                                hashMap.clear();
                            }
                            c.e();
                            ixcVar.e0();
                            break;
                        case 1:
                            CookieManager cookieManager = CookieManager.getInstance();
                            cookieManager.removeAllCookies(null);
                            cookieManager.flush();
                            try {
                                File file3 = new File(a.b.getApplicationInfo().dataDir, "app_webview");
                                if (file3.exists()) {
                                    ixc.c0(file3, Boolean.TRUE);
                                }
                            } catch (Exception e3) {
                                cc4.g(e3, true);
                            }
                            ixcVar.e0();
                            break;
                        case 2:
                            try {
                                ptd.c.clear();
                                ptd.d.clear();
                                File file4 = new File(xb4.z(4), "webhistory.dat");
                                if (file4.exists()) {
                                    file4.delete();
                                }
                            } catch (Exception e4) {
                                cc4.g(e4, true);
                            }
                            ixcVar.r = 0L;
                            ixcVar.a.g3.O(true);
                            break;
                        default:
                            uc7 messagesController5 = ixcVar.getMessagesController();
                            TL_account.TL_webBrowserSettings tL_webBrowserSettings5 = messagesController5.o5;
                            if (tL_webBrowserSettings5 != null) {
                                tL_webBrowserSettings5.open_external_browser = true;
                                tL_webBrowserSettings5.display_close_button = true;
                                tL_webBrowserSettings5.external_exceptions.clear();
                                messagesController5.o5.inapp_exceptions.clear();
                                messagesController5.e5(messagesController5.o5);
                            }
                            messagesController5.getConnectionsManager().sendRequestTyped(new TL_account.deleteWebBrowserSettingsExceptions(), new ic((byte) 0), new f87(messagesController5, (byte) 4));
                            ixcVar.a.g3.O(true);
                            break;
                    }
                }
            });
            alertDialog$Builder2.g(ob6.M0(2131752570, null), null);
            alertDialog$Builder2.c(-1);
            alertDialog$Builder2.o();
            return;
        }
        if (i == 7) {
            ArrayList a = ptd.a(null);
            int size = a.size();
            long j = Long.MAX_VALUE;
            int i2 = 0;
            while (i2 < size) {
                Object obj = a.get(i2);
                i2++;
                j = Math.min(j, ((n01) obj).b);
            }
            AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(0, getResourceProvider(), getParentActivity());
            String M03 = ob6.M0(2131752836, null);
            id idVar3 = alertDialog$Builder3.a;
            idVar3.S = M03;
            idVar3.U = ob6.a0(null, null, 2131752835, ob6.u(j / 1000, false));
            alertDialog$Builder3.j(ob6.M0(2131752066, null), new fd(this) { // from class: fxc
                public final /* synthetic */ ixc b;

                {
                    this.b = this;
                }

                @Override // fd
                public final void w(id idVar22, int i22) {
                    byte b52 = b4;
                    ixc ixcVar = this.b;
                    switch (b52) {
                        case 0:
                            a.b.deleteDatabase("webview.db");
                            a.b.deleteDatabase("webviewCache.db");
                            WebStorage.getInstance().deleteAllData();
                            try {
                                WebView webView = new WebView(ixcVar.getParentActivity());
                                webView.clearCache(true);
                                webView.clearHistory();
                                webView.destroy();
                            } catch (Exception unused) {
                            }
                            try {
                                File file = new File(a.b.getApplicationInfo().dataDir, "app_webview");
                                if (file.exists()) {
                                    ixc.c0(file, Boolean.FALSE);
                                }
                            } catch (Exception e) {
                                cc4.g(e, true);
                            }
                            try {
                                File file2 = new File(a.b.getApplicationInfo().dataDir, "cache/WebView");
                                if (file2.exists()) {
                                    ixc.c0(file2, null);
                                }
                            } catch (Exception e2) {
                                cc4.g(e2, true);
                            }
                            j84 c = j84.c();
                            HashMap hashMap = (HashMap) c.d;
                            if (hashMap == null) {
                                c.b = false;
                                c.a = true;
                                c.d = new HashMap();
                            } else {
                                hashMap.clear();
                            }
                            c.e();
                            ixcVar.e0();
                            break;
                        case 1:
                            CookieManager cookieManager = CookieManager.getInstance();
                            cookieManager.removeAllCookies(null);
                            cookieManager.flush();
                            try {
                                File file3 = new File(a.b.getApplicationInfo().dataDir, "app_webview");
                                if (file3.exists()) {
                                    ixc.c0(file3, Boolean.TRUE);
                                }
                            } catch (Exception e3) {
                                cc4.g(e3, true);
                            }
                            ixcVar.e0();
                            break;
                        case 2:
                            try {
                                ptd.c.clear();
                                ptd.d.clear();
                                File file4 = new File(xb4.z(4), "webhistory.dat");
                                if (file4.exists()) {
                                    file4.delete();
                                }
                            } catch (Exception e4) {
                                cc4.g(e4, true);
                            }
                            ixcVar.r = 0L;
                            ixcVar.a.g3.O(true);
                            break;
                        default:
                            uc7 messagesController5 = ixcVar.getMessagesController();
                            TL_account.TL_webBrowserSettings tL_webBrowserSettings5 = messagesController5.o5;
                            if (tL_webBrowserSettings5 != null) {
                                tL_webBrowserSettings5.open_external_browser = true;
                                tL_webBrowserSettings5.display_close_button = true;
                                tL_webBrowserSettings5.external_exceptions.clear();
                                messagesController5.o5.inapp_exceptions.clear();
                                messagesController5.e5(messagesController5.o5);
                            }
                            messagesController5.getConnectionsManager().sendRequestTyped(new TL_account.deleteWebBrowserSettingsExceptions(), new ic((byte) 0), new f87(messagesController5, (byte) 4));
                            ixcVar.a.g3.O(true);
                            break;
                    }
                }
            });
            alertDialog$Builder3.g(ob6.M0(2131752570, null), null);
            alertDialog$Builder3.c(-1);
            alertDialog$Builder3.o();
            return;
        }
        if (i == 9) {
            ng5[] ng5VarArr = {null};
            e ng5Var = new ng5(null, new ku9(this, ng5VarArr, (byte) 25));
            ng5VarArr[0] = ng5Var;
            presentFragment(ng5Var);
            return;
        }
        if (i == 5) {
            AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(0, getResourceProvider(), getParentActivity());
            String M04 = ob6.M0(2131742568, null);
            id idVar4 = alertDialog$Builder4.a;
            idVar4.S = M04;
            idVar4.U = ob6.M0(2131742569, null);
            alertDialog$Builder4.j(ob6.M0(2131751563, null), new fd(this) { // from class: fxc
                public final /* synthetic */ ixc b;

                {
                    this.b = this;
                }

                @Override // fd
                public final void w(id idVar22, int i22) {
                    byte b52 = b5;
                    ixc ixcVar = this.b;
                    switch (b52) {
                        case 0:
                            a.b.deleteDatabase("webview.db");
                            a.b.deleteDatabase("webviewCache.db");
                            WebStorage.getInstance().deleteAllData();
                            try {
                                WebView webView = new WebView(ixcVar.getParentActivity());
                                webView.clearCache(true);
                                webView.clearHistory();
                                webView.destroy();
                            } catch (Exception unused) {
                            }
                            try {
                                File file = new File(a.b.getApplicationInfo().dataDir, "app_webview");
                                if (file.exists()) {
                                    ixc.c0(file, Boolean.FALSE);
                                }
                            } catch (Exception e) {
                                cc4.g(e, true);
                            }
                            try {
                                File file2 = new File(a.b.getApplicationInfo().dataDir, "cache/WebView");
                                if (file2.exists()) {
                                    ixc.c0(file2, null);
                                }
                            } catch (Exception e2) {
                                cc4.g(e2, true);
                            }
                            j84 c = j84.c();
                            HashMap hashMap = (HashMap) c.d;
                            if (hashMap == null) {
                                c.b = false;
                                c.a = true;
                                c.d = new HashMap();
                            } else {
                                hashMap.clear();
                            }
                            c.e();
                            ixcVar.e0();
                            break;
                        case 1:
                            CookieManager cookieManager = CookieManager.getInstance();
                            cookieManager.removeAllCookies(null);
                            cookieManager.flush();
                            try {
                                File file3 = new File(a.b.getApplicationInfo().dataDir, "app_webview");
                                if (file3.exists()) {
                                    ixc.c0(file3, Boolean.TRUE);
                                }
                            } catch (Exception e3) {
                                cc4.g(e3, true);
                            }
                            ixcVar.e0();
                            break;
                        case 2:
                            try {
                                ptd.c.clear();
                                ptd.d.clear();
                                File file4 = new File(xb4.z(4), "webhistory.dat");
                                if (file4.exists()) {
                                    file4.delete();
                                }
                            } catch (Exception e4) {
                                cc4.g(e4, true);
                            }
                            ixcVar.r = 0L;
                            ixcVar.a.g3.O(true);
                            break;
                        default:
                            uc7 messagesController5 = ixcVar.getMessagesController();
                            TL_account.TL_webBrowserSettings tL_webBrowserSettings5 = messagesController5.o5;
                            if (tL_webBrowserSettings5 != null) {
                                tL_webBrowserSettings5.open_external_browser = true;
                                tL_webBrowserSettings5.display_close_button = true;
                                tL_webBrowserSettings5.external_exceptions.clear();
                                messagesController5.o5.inapp_exceptions.clear();
                                messagesController5.e5(messagesController5.o5);
                            }
                            messagesController5.getConnectionsManager().sendRequestTyped(new TL_account.deleteWebBrowserSettingsExceptions(), new ic((byte) 0), new f87(messagesController5, (byte) 4));
                            ixcVar.a.g3.O(true);
                            break;
                    }
                }
            });
            alertDialog$Builder4.g(ob6.M0(2131752570, null), null);
            alertDialog$Builder4.c(-1);
            alertDialog$Builder4.o();
            return;
        }
        if (b8cVar.H(gxc.class)) {
            hxc hxcVar = (hxc) view;
            String str = hxcVar.e;
            fu5 G = fu5.G((ViewGroup) this.fragmentView, null, hxcVar);
            G.s = (short) 40;
            G.b(R.drawable.menu_delete_old, ob6.M0(2131746048, null), new zwc(this, str, (byte) 2), false);
            G.a0();
            return;
        }
        int i3 = b8cVar.d;
        if (i3 == 6) {
            if (getParentActivity() != null) {
                AtomicReference atomicReference = new AtomicReference();
                LinearLayout linearLayout = new LinearLayout(getParentActivity());
                linearLayout.setOrientation(1);
                ArrayList b6 = bw9.b();
                int size2 = b6.size();
                CharSequence[] charSequenceArr = new CharSequence[size2];
                int i4 = 0;
                while (i4 < size2) {
                    charSequenceArr[i4] = ((bw9) b6.get(i4)).a;
                    j29 j29Var = new j29(getParentActivity(), null);
                    j29Var.setPadding(hl.L(4.0f), 0, hl.L(4.0f), 0);
                    j29Var.a(aob.w0(null, aob.g7, false), aob.w0(null, aob.E5, false));
                    j29Var.b(charSequenceArr[i4], i4 == xea.m0);
                    int i5 = aob.i6;
                    hf0 f0 = aob.f0(aob.w0(null, i5, false), 2, -1);
                    uob M = yob.M(i5);
                    j29Var.setBackground(f0);
                    yob.j(j29Var, f0, null, M, null);
                    linearLayout.addView(j29Var);
                    j29Var.setOnClickListener(new ae(i4, view, atomicReference));
                    i4++;
                }
                AlertDialog$Builder alertDialog$Builder5 = new AlertDialog$Builder(getParentActivity());
                String M05 = ob6.M0(2131745527, null);
                id idVar5 = alertDialog$Builder5.a;
                idVar5.S = M05;
                alertDialog$Builder5.n(linearLayout);
                alertDialog$Builder5.g(ob6.M0(2131752570, null), null);
                atomicReference.set(idVar5);
                showDialog(idVar5);
                return;
            }
            return;
        }
        if (i3 == 15 || i3 == 16) {
            boolean S22 = getMessagesController().S2();
            if (getMessagesController().R2(S22)) {
                jj.r0(this, ob6.M0(2131742566, null), ob6.M0(2131742567, null), null);
                return;
            }
            Activity parentActivity = getParentActivity();
            vnb resourceProvider = getResourceProvider();
            sa saVar = new sa(b3, this, S22);
            Pattern pattern = jj.a;
            Activity W = hl.W(parentActivity);
            View currentFocus = W != null ? W.getCurrentFocus() : null;
            id[] idVarArr = new id[1];
            AlertDialog$Builder alertDialog$Builder6 = new AlertDialog$Builder(0, resourceProvider, parentActivity);
            String M06 = ob6.M0(S22 ? 2131752849 : 2131752848, null);
            id idVar6 = alertDialog$Builder6.a;
            idVar6.S = M06;
            idVar6.U = ob6.M0(S22 ? 2131752851 : 2131752850, null);
            ij ijVar = new ij(parentActivity);
            ijVar.setTextSize(1, 16.0f);
            int i6 = aob.j5;
            yob.X(ijVar, i6, resourceProvider);
            yob.D(ijVar, aob.Oi, resourceProvider);
            ijVar.setHint(ob6.M0(2131752852, null));
            ijVar.setInputType(17);
            ijVar.setImeOptions(6);
            ijVar.setSingleLine(true);
            ijVar.setFocusable(true);
            ijVar.setPadding(hl.L(16.0f), hl.L(13.0f), hl.L(16.0f), hl.L(13.0f));
            ijVar.setCursorWidth(1.5f);
            ijVar.A(aob.q6, resourceProvider);
            ShapeDrawable b0 = aob.b0(hl.L(22.0f), aob.p1(0.06f, aob.v0(i6, resourceProvider)));
            uob K = yob.K(0.06f, i6);
            ijVar.setBackground(b0);
            yob.j(ijVar, b0, K, null, resourceProvider);
            o97 o97Var = new o97(ijVar, saVar, idVarArr, currentFocus, (byte) 7);
            ijVar.setOnEditorActionListener(new j(o97Var, b4));
            LinearLayout linearLayout2 = new LinearLayout(parentActivity);
            linearLayout2.setOrientation(1);
            linearLayout2.addView(ijVar, tre.k(24.0f, 4.0f, 24.0f, 9.0f, -1, -2));
            alertDialog$Builder6.b();
            alertDialog$Builder6.n(linearLayout2);
            idVar6.a = Math.min(hl.L(320.0f), (hl.q.x * 85) / 100);
            alertDialog$Builder6.j(ob6.M0(2131751319, null), new m0(o97Var, (byte) 17));
            alertDialog$Builder6.g(ob6.M0(2131752570, null), new bg((byte) 17));
            idVarArr[0] = idVar6;
            idVar6.k0 = false;
            idVar6.setOnDismissListener(new o1(ijVar, (byte) 4));
            idVarArr[0].setOnShowListener(new df(ijVar, (byte) 1));
            idVarArr[0].show();
        }
    }

    @Override // n9c
    public final boolean b0(b8c b8cVar, View view) {
        return false;
    }

    @Override // n9c, org.telegram.ui.ActionBar.e
    public final View createView(Context context) {
        setHasOwnBackground(true);
        Drawable mutate = context.getResources().getDrawable(R.drawable.poll_add_circle).mutate();
        Drawable e = c00.e(context, R.drawable.poll_add_plus);
        int themedColor = getThemedColor(aob.N6);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        mutate.setColorFilter(new PorterDuffColorFilter(themedColor, mode));
        e.setColorFilter(new PorterDuffColorFilter(getThemedColor(aob.k7), mode));
        d58 d58Var = new d58(mutate, e, (byte) 4);
        d58Var.y = hl.L(2.0f);
        this.e = d58Var;
        this.fragmentView = super.createView(context);
        this.a.s1();
        this.a.setSectionsDrawBackground(true);
        return this.fragmentView;
    }

    @Override // fn7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        wa waVar;
        if (i != jn7.U5 || (waVar = this.a) == null) {
            return;
        }
        waVar.g3.O(true);
    }

    public final void e0() {
        l9c l9cVar;
        if (ptd.a(new sh9(this, (byte) 29)) != null) {
            this.r = r0.size();
            wa waVar = this.a;
            if (waVar != null && (l9cVar = waVar.g3) != null && waVar.H) {
                l9cVar.O(true);
            }
        }
        Utilities.e.c(new olc(this, (byte) 19));
    }

    @Override // org.telegram.ui.ActionBar.e
    public final d79 getListViewForSimpleGlass() {
        return this.a;
    }

    @Override // org.telegram.ui.ActionBar.e
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.e
    public final boolean onFragmentCreate() {
        e0();
        getNotificationCenter().b(this, jn7.U5);
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.e
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().n(this, jn7.U5);
    }

    @Override // org.telegram.ui.ActionBar.e
    public final void onThemeColorsChanged() {
        super.onThemeColorsChanged();
        try {
            d58 d58Var = this.e;
            if (d58Var != null) {
                int themedColor = getThemedColor(aob.N6);
                int themedColor2 = getThemedColor(aob.k7);
                if (themedColor == this.s && themedColor2 == this.w) {
                    return;
                }
                this.s = themedColor;
                this.w = themedColor2;
                Drawable drawable = d58Var.a;
                if (drawable != null) {
                    drawable.setColorFilter(new PorterDuffColorFilter(themedColor, PorterDuff.Mode.MULTIPLY));
                }
                Drawable drawable2 = d58Var.b;
                if (drawable2 != null) {
                    drawable2.setColorFilter(new PorterDuffColorFilter(themedColor2, PorterDuff.Mode.MULTIPLY));
                }
                wa waVar = this.a;
                if (waVar != null) {
                    waVar.i1();
                }
            }
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.e
    public final boolean useSimpleActionBar() {
        return true;
    }
}
