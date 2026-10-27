package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import j$.util.concurrent.ConcurrentHashMap;
import java.nio.charset.StandardCharsets;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class nb1 implements cc1 {
    public final String a;
    public final String b;
    public final Context c;
    public u7.s e;
    public dc1 f;
    public ac1 g;
    public ub1 h;
    public int i;
    public int j;
    public int k;
    public boolean l;
    public boolean n;
    public boolean o;
    public boolean p;
    public int q;
    public int r;
    public String s;
    public String t;
    public String u;
    public boolean x;
    public String v = "{}";
    public String w = "{}";
    public boolean m = false;
    public final int d = 1;

    public nb1(Context context, String str, String str2) {
        this.c = context.getApplicationContext();
        this.a = str;
        this.b = str2;
    }

    @Override // org.telegram.ui.Components.cc1
    public final void a(boolean z10) {
        if (this.x == z10) {
            return;
        }
        this.x = z10;
        u7.s sVar = this.e;
        if (sVar != null) {
            sVar.getClass();
            jb1.y();
        }
    }

    @Override // org.telegram.ui.Components.cc1
    public final void b(String str) {
        if (this.e == null || TextUtils.isEmpty(str)) {
            return;
        }
        AndroidUtilities.addToClipboard(str);
        org.telegram.ui.ActionBar.r2 U = AndroidUtilities.shouldShowClipboardToast() ? LaunchActivity.U() : null;
        if (U == null) {
            return;
        }
        if (str.length() > 80) {
            str = str.substring(0, 80) + "…";
        }
        ic.a.s(R.string.WidgetTextCopied, new Object[]{str}, wc.b0(U), R.raw.copy, 36);
    }

    @Override // org.telegram.ui.Components.cc1
    public final void c(String str) {
        ub1 ub1Var = this.h;
        if (ub1Var != null) {
            if (ub1Var.E || (ub1Var.w && ub1Var.D)) {
                ub1Var.a.c(str);
            }
        }
    }

    @Override // org.telegram.ui.Components.cc1
    public final void d(boolean z10, boolean z11, boolean z12) {
        ub1 ub1Var = this.h;
        if (ub1Var == null || !ub1Var.w || ub1Var.x) {
            return;
        }
        ub1Var.k(z10, z11, z12);
    }

    @Override // org.telegram.ui.Components.cc1
    public final void e(String str) {
        u7.s sVar = this.e;
        if (sVar != null) {
            sVar.getClass();
            FileLog.e("widget " + this.a + ": " + str);
        }
        ub1 ub1Var = this.h;
        if (ub1Var != null) {
            ub1Var.a.d();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:68:0x00c8, code lost:
    
        r5.a.add(0, new int[]{r8, r9, r10});
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00d8, code lost:
    
        if (r5.a.size() <= 4) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00da, code lost:
    
        r1 = r5.a;
        r1.remove(r1.size() - 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x00e6, code lost:
    
        org.telegram.messenger.MessagesStorage.getInstance(r13.b).putWidgetHeight(r13.c, r13.d, r8, r9, r10, 4);
     */
    @Override // org.telegram.ui.Components.cc1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f(dc1 dc1Var) {
        ac1 ac1Var;
        gb1 h;
        ub1 ub1Var;
        if (dc1Var == this.f && (ac1Var = dc1Var.E) != null) {
            if (this.g == null || dc1Var.u) {
                this.g = null;
                this.k = ac1Var.d;
                boolean z10 = ac1Var.h;
                boolean z11 = z10 != this.l;
                this.l = z10;
                int max = Math.max(1, ac1Var.e);
                boolean z12 = max != this.i;
                this.i = max;
                ub1 ub1Var2 = this.h;
                if (ub1Var2 != null) {
                    tb1 tb1Var = ub1Var2.a;
                    if (z12) {
                        tb1Var.e();
                    }
                    tb1Var.d();
                }
                if ((z12 || z11) && this.e != null && (h = jb1.h(this)) != null && this.i > 0) {
                    int f7 = jb1.f(this.k);
                    int max2 = Math.max(50, Math.min(600, jb1.f(this.i)));
                    int i10 = this.l;
                    if (f7 > 0 && h.f == 0 && !h.k) {
                        String a2 = h.a();
                        ConcurrentHashMap concurrentHashMap = jb1.b;
                        hb1 hb1Var = (hb1) concurrentHashMap.get(a2);
                        if (hb1Var == null) {
                            hb1Var = new hb1();
                            hb1 hb1Var2 = (hb1) concurrentHashMap.putIfAbsent(a2, hb1Var);
                            if (hb1Var2 != null) {
                                hb1Var = hb1Var2;
                            }
                        }
                        synchronized (hb1Var) {
                            int i11 = 0;
                            while (true) {
                                if (i11 >= hb1Var.a.size()) {
                                    break;
                                }
                                int[] iArr = (int[]) hb1Var.a.get(i11);
                                if (iArr[0] != f7) {
                                    i11++;
                                } else if (iArr[1] != max2 || iArr[2] != i10 || i11 != 0) {
                                    hb1Var.a.remove(i11);
                                }
                            }
                        }
                    }
                    bn0 bn0Var = h.t;
                    if (bn0Var != null) {
                        bn0Var.q("frame off screen");
                    }
                }
                if (!m() || z12 || (ub1Var = this.h) == null) {
                    return;
                }
                tb1 tb1Var2 = ub1Var.a;
                tb1Var2.e();
                tb1Var2.d();
            }
        }
    }

    @Override // org.telegram.ui.Components.cc1
    public final void g(JSONObject jSONObject) {
        org.telegram.ui.ActionBar.r2 U;
        bn0 bn0Var;
        if (this.e != null) {
            gb1 h = jb1.h(this);
            String optString = jSONObject.optString("kind");
            View view = null;
            if (!"openLink".equals(optString) && !"openTelegramLink".equals(optString)) {
                if ("haptic".equals(optString)) {
                    if (h != null && h.w > 0 && (bn0Var = h.v) != null) {
                        view = bn0Var.n();
                    }
                    if (view != null) {
                        String optString2 = jSONObject.optString("haptic");
                        view.performHapticFeedback("selection".equals(optString2) ? 4 : "notification".equals(optString2) ? 16 : 3);
                        return;
                    }
                    return;
                }
                return;
            }
            String optString3 = jSONObject.optString("url");
            boolean equals = "openTelegramLink".equals(optString);
            if (TextUtils.isEmpty(optString3) || jb1.i || (U = LaunchActivity.U()) == null || U.getParentActivity() == null) {
                return;
            }
            Activity parentActivity = U.getParentActivity();
            if (equals) {
                qf.d.r(parentActivity, optString3);
                return;
            }
            jb1.i = true;
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(parentActivity, 0, U.getResourceProvider());
            String string = LocaleController.getString(R.string.WidgetOpenLinkTitle);
            org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.a;
            e2Var.R = string;
            e2Var.T = LocaleController.formatString(R.string.WidgetOpenLinkText, optString3);
            alertDialog$Builder.k(LocaleController.getString(R.string.Open), new p1(29, parentActivity, optString3));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            e2Var.setOnDismissListener(new fi.e1(5));
            if (U.showDialog(e2Var) == null) {
                jb1.i = false;
            }
        }
    }

    @Override // org.telegram.ui.Components.cc1
    public final void h(JSONObject jSONObject) {
        ub1 ub1Var;
        dc1 dc1Var;
        gb1 h;
        if (this.e != null) {
            String optString = jSONObject.optString("dead");
            if (!TextUtils.isEmpty(optString) && (h = jb1.h(this)) != null) {
                int i10 = h.B;
                int i11 = this.q;
                if (i10 != i11) {
                    h.B = i11;
                    h.A++;
                    h.C = true;
                    FileLog.d("widget " + this.a + " stopped (" + h.A + "): " + optString);
                    jb1.a(h);
                    jb1.b();
                }
            }
        }
        if (jSONObject.optBoolean("loaded") && this.g != null && (dc1Var = this.f) != null) {
            f(dc1Var);
        } else {
            if (!m() || (ub1Var = this.h) == null) {
                return;
            }
            tb1 tb1Var = ub1Var.a;
            tb1Var.e();
            tb1Var.d();
        }
    }

    @Override // org.telegram.ui.Components.cc1
    public final void i(final long j10, String str) {
        if (this.e == null) {
            dc1 dc1Var = this.f;
            if (dc1Var != null) {
                dc1Var.a(3, null, j10);
                return;
            }
            return;
        }
        gb1 h = jb1.h(this);
        if (h != null) {
            int i10 = h.b;
            if (h.i) {
                TLRPC.TL_messages_getBotWidgetQueryAnswer tL_messages_getBotWidgetQueryAnswer = new TLRPC.TL_messages_getBotWidgetQueryAnswer();
                tL_messages_getBotWidgetQueryAnswer.peer = MessagesController.getInstance(i10).getInputPeer(h.c);
                tL_messages_getBotWidgetQueryAnswer.msg_id = h.d;
                tL_messages_getBotWidgetQueryAnswer.data = str.getBytes(StandardCharsets.UTF_8);
                final boolean[] zArr = new boolean[1];
                ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i10);
                final bi.a0 a0Var = new bi.a0(zArr, connectionsManager, new int[]{connectionsManager.sendRequestTyped(tL_messages_getBotWidgetQueryAnswer, new org.telegram.messenger.a(), new Utilities.Callback2() { // from class: org.telegram.ui.Components.fb1
                    @Override // org.telegram.messenger.Utilities.Callback2
                    public final void run(Object obj, Object obj2) {
                        TLRPC.TL_messages_botWidgetQueryAnswer tL_messages_botWidgetQueryAnswer = (TLRPC.TL_messages_botWidgetQueryAnswer) obj;
                        TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                        boolean[] zArr2 = zArr;
                        if (zArr2[0]) {
                            return;
                        }
                        zArr2[0] = true;
                        AndroidUtilities.cancelRunOnUIThread(a0Var);
                        nb1 nb1Var = this;
                        long j11 = j10;
                        if (tL_messages_botWidgetQueryAnswer != null) {
                            String w10 = jb1.w(tL_messages_botWidgetQueryAnswer.result);
                            dc1 dc1Var2 = nb1Var.f;
                            if (dc1Var2 != null) {
                                dc1Var2.a(0, w10, j11);
                                return;
                            }
                            return;
                        }
                        String str2 = tL_error != null ? tL_error.text : "";
                        int i11 = "WIDGET_RESPONSE_TIMEOUT".equals(str2) ? 1 : (str2 == null || !str2.startsWith("FLOOD_WAIT")) ? 3 : 2;
                        dc1 dc1Var3 = nb1Var.f;
                        if (dc1Var3 != null) {
                            dc1Var3.a(i11, null, j11);
                        }
                    }
                })}, this, j10, 14);
                AndroidUtilities.runOnUIThread(a0Var, 30000L);
                return;
            }
        }
        dc1 dc1Var2 = this.f;
        if (dc1Var2 != null) {
            dc1Var2.a(3, null, j10);
        }
    }

    @Override // org.telegram.ui.Components.cc1
    public final void j(String str, JSONObject jSONObject) {
        gb1 h;
        String str2;
        if (this.e == null || (h = jb1.h(this)) == null) {
            return;
        }
        String a2 = h.a();
        JSONObject jSONObject2 = (JSONObject) jb1.c.get(a2);
        if (jSONObject2 == null) {
            jSONObject2 = new JSONObject();
        }
        try {
            jSONObject2.put(str, jSONObject);
        } catch (Exception unused) {
        }
        jb1.c.put(a2, jSONObject2);
        for (gb1 gb1Var : jb1.a.values()) {
            if (gb1Var.s != null && a2.equals(gb1Var.a())) {
                nb1 nb1Var = gb1Var.s;
                try {
                    str2 = LocaleController.getInstance().getCurrentLocale().toLanguageTag();
                } catch (Exception unused2) {
                    str2 = null;
                }
                String jSONObject3 = jSONObject2.toString();
                nb1Var.t = str2;
                nb1Var.u = jSONObject3;
            }
        }
        if ("local".equals(str)) {
            jb1.d.put(a2, h);
            k5 k5Var = jb1.e;
            AndroidUtilities.cancelRunOnUIThread(k5Var);
            AndroidUtilities.runOnUIThread(k5Var, 1000L);
        }
    }

    public final void k() {
        int i10;
        dc1 dc1Var = this.f;
        if (dc1Var == null || dc1Var.t || dc1Var.s == 0 || dc1Var.B) {
            return;
        }
        ac1 ac1Var = dc1Var.E;
        if (ac1Var == null || (((i10 = dc1Var.D) != 0 && Math.abs(ac1Var.d - i10) > 1) || !ac1Var.a())) {
            dc1Var.B = true;
            WidgetSandboxNative.repaint(dc1Var.s);
        }
    }

    public final ac1 l() {
        dc1 dc1Var = this.f;
        ac1 ac1Var = dc1Var == null ? null : dc1Var.E;
        if (ac1Var != null && (this.g == null || dc1Var.u)) {
            return ac1Var;
        }
        ac1 ac1Var2 = this.g;
        return (ac1Var2 == null || Math.abs(ac1Var2.d - this.j) > 1) ? ac1Var != null ? ac1Var : this.g : this.g;
    }

    public final boolean m() {
        dc1 dc1Var;
        ac1 ac1Var;
        if (this.r == this.q || (dc1Var = this.f) == null || (ac1Var = dc1Var.E) == null) {
            return false;
        }
        if (!ac1Var.g && !dc1Var.w) {
            return false;
        }
        this.r = this.q;
        if (this.e == null) {
            return true;
        }
        jb1.b();
        gb1 h = jb1.h(this);
        if (h == null) {
            return true;
        }
        jb1.a(h);
        return true;
    }

    public final void n(String str) {
        if (str == null || str.equals(this.v)) {
            return;
        }
        this.v = str;
        dc1 dc1Var = this.f;
        if (dc1Var != null) {
            long j10 = dc1Var.s;
            if (dc1Var.t || j10 == 0) {
                return;
            }
            WidgetSandboxNative.data(j10, str.getBytes(StandardCharsets.UTF_8));
        }
    }

    public final void o(String str) {
        if (str == null || str.equals(this.s)) {
            return;
        }
        this.s = str;
        this.m = str.contains("\"dark\"");
        dc1 dc1Var = this.f;
        if (dc1Var != null) {
            dc1Var.e(str);
        }
    }

    public final void p(boolean z10) {
        this.n = z10;
        dc1 dc1Var = this.f;
        if (dc1Var != null) {
            dc1Var.f(z10 && !this.p);
        }
    }

    public final void q(int i10) {
        if (i10 <= 0 || i10 == this.j) {
            return;
        }
        this.j = i10;
        dc1 dc1Var = this.f;
        if (dc1Var == null || i10 <= 0 || i10 == dc1Var.D || dc1Var.t) {
            return;
        }
        dc1Var.D = i10;
        long j10 = dc1Var.s;
        if (j10 != 0) {
            WidgetSandboxNative.width(j10, i10 / dc1Var.i);
        }
    }

    public final void r() {
        this.o = false;
        if (this.f == null) {
            return;
        }
        ac1 l4 = l();
        if (l4 != null) {
            this.g = l4;
        }
        this.f.b();
        this.f = null;
        if (this.x) {
            this.x = false;
            u7.s sVar = this.e;
            if (sVar != null) {
                sVar.getClass();
                jb1.y();
            }
        }
    }
}
