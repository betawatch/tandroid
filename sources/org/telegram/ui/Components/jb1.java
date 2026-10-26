package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class jb1 implements xb1 {
    public final String a;
    public final String b;
    public final Context c;
    public u7.s e;
    public yb1 f;
    public vb1 g;
    public pb1 h;
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
    public boolean m = false;
    public final int d = 1;

    public jb1(Context context, String str, String str2) {
        this.c = context.getApplicationContext();
        this.a = str;
        this.b = str2;
    }

    @Override // org.telegram.ui.Components.xb1
    public final void a(String str) {
        pb1 pb1Var = this.h;
        if (pb1Var != null) {
            if (pb1Var.E || (pb1Var.w && pb1Var.D)) {
                pb1Var.a.o(str);
            }
        }
    }

    @Override // org.telegram.ui.Components.xb1
    public final void b(boolean z10, boolean z11, boolean z12) {
        pb1 pb1Var = this.h;
        if (pb1Var == null || !pb1Var.w || pb1Var.x) {
            return;
        }
        pb1Var.j(z10, z11, z12);
    }

    @Override // org.telegram.ui.Components.xb1
    public final void c(String str) {
        if (this.e != null) {
            FileLog.e("widget " + this.a + ": " + str);
        }
        pb1 pb1Var = this.h;
        if (pb1Var != null) {
            pb1Var.a.j();
        }
    }

    @Override // org.telegram.ui.Components.xb1
    public final void d(yb1 yb1Var) {
        vb1 vb1Var;
        db1 d;
        pb1 pb1Var;
        if (yb1Var == this.f && (vb1Var = yb1Var.D) != null) {
            if (this.g == null || yb1Var.t) {
                this.g = null;
                this.k = vb1Var.d;
                boolean z10 = vb1Var.h;
                boolean z11 = z10 != this.l;
                this.l = z10;
                int max = Math.max(1, vb1Var.e);
                boolean z12 = max != this.i;
                this.i = max;
                pb1 pb1Var2 = this.h;
                if (pb1Var2 != null) {
                    pb1Var2.l(z12);
                }
                if ((z12 || z11) && this.e != null && (d = fb1.d(this)) != null && this.i > 0) {
                    int c10 = fb1.c(this.k);
                    int max2 = Math.max(50, Math.min(600, fb1.c(this.i)));
                    int i10 = this.l;
                    if (c10 > 0 && d.f == 0) {
                        String a2 = d.a();
                        ConcurrentHashMap concurrentHashMap = fb1.b;
                        eb1 eb1Var = (eb1) concurrentHashMap.get(a2);
                        if (eb1Var == null) {
                            eb1Var = new eb1();
                            eb1 eb1Var2 = (eb1) concurrentHashMap.putIfAbsent(a2, eb1Var);
                            if (eb1Var2 != null) {
                                eb1Var = eb1Var2;
                            }
                        }
                        synchronized (eb1Var) {
                            int i11 = 0;
                            while (true) {
                                if (i11 >= eb1Var.a.size()) {
                                    break;
                                }
                                int[] iArr = (int[]) eb1Var.a.get(i11);
                                if (iArr[0] != c10) {
                                    i11++;
                                } else if (iArr[1] != max2 || iArr[2] != i10 || i11 != 0) {
                                    eb1Var.a.remove(i11);
                                }
                            }
                            eb1Var.a.add(0, new int[]{c10, max2, i10});
                            while (eb1Var.a.size() > 4) {
                                ArrayList arrayList = eb1Var.a;
                                arrayList.remove(arrayList.size() - 1);
                            }
                            MessagesStorage.getInstance(d.b).putWidgetHeight(d.c, d.d, c10, max2, i10, 4);
                        }
                    }
                    an0 an0Var = d.j;
                    if (an0Var != null) {
                        an0Var.l("frame off screen");
                    }
                }
                if (!j() || z12 || (pb1Var = this.h) == null) {
                    return;
                }
                pb1Var.l(true);
            }
        }
    }

    @Override // org.telegram.ui.Components.xb1
    public final void e(JSONObject jSONObject) {
        org.telegram.ui.ActionBar.r2 U;
        an0 an0Var;
        if (this.e != null) {
            db1 d = fb1.d(this);
            String optString = jSONObject.optString("kind");
            View view = null;
            if (!"openLink".equals(optString) && !"openTelegramLink".equals(optString)) {
                if ("haptic".equals(optString)) {
                    if (d != null && d.m > 0 && (an0Var = d.l) != null) {
                        view = an0Var.i();
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
            if (TextUtils.isEmpty(optString3) || fb1.i || (U = LaunchActivity.U()) == null || U.getParentActivity() == null) {
                return;
            }
            Activity parentActivity = U.getParentActivity();
            if (equals) {
                qf.d.r(parentActivity, optString3);
                return;
            }
            fb1.i = true;
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(parentActivity, 0, U.getResourceProvider());
            String string = LocaleController.getString(R.string.WidgetOpenLinkTitle);
            org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.a;
            e2Var.R = string;
            e2Var.T = LocaleController.formatString(R.string.WidgetOpenLinkText, optString3);
            alertDialog$Builder.k(LocaleController.getString(R.string.Open), new p1(29, parentActivity, optString3));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            e2Var.setOnDismissListener(new fi.e1(5));
            if (U.showDialog(e2Var) == null) {
                fb1.i = false;
            }
        }
    }

    @Override // org.telegram.ui.Components.xb1
    public final void f(JSONObject jSONObject) {
        pb1 pb1Var;
        yb1 yb1Var;
        db1 d;
        if (this.e != null) {
            String optString = jSONObject.optString("dead");
            if (!TextUtils.isEmpty(optString) && (d = fb1.d(this)) != null) {
                int i10 = d.r;
                int i11 = this.q;
                if (i10 != i11) {
                    d.r = i11;
                    d.q++;
                    d.s = true;
                    FileLog.d("widget " + this.a + " stopped (" + d.q + "): " + optString);
                    fb1.a(d);
                    fb1.b();
                }
            }
        }
        if (jSONObject.optBoolean("loaded") && this.g != null && (yb1Var = this.f) != null) {
            d(yb1Var);
        } else {
            if (!j() || (pb1Var = this.h) == null) {
                return;
            }
            pb1Var.l(true);
        }
    }

    @Override // org.telegram.ui.Components.xb1
    public final void g(String str, JSONObject jSONObject) {
        db1 d;
        String str2;
        if (this.e == null || (d = fb1.d(this)) == null) {
            return;
        }
        String a2 = d.a();
        JSONObject jSONObject2 = (JSONObject) fb1.c.get(a2);
        if (jSONObject2 == null) {
            jSONObject2 = new JSONObject();
        }
        try {
            jSONObject2.put(str, jSONObject);
        } catch (Exception unused) {
        }
        fb1.c.put(a2, jSONObject2);
        for (db1 db1Var : fb1.a.values()) {
            if (db1Var.i != null && a2.equals(db1Var.a())) {
                jb1 jb1Var = db1Var.i;
                try {
                    str2 = LocaleController.getInstance().getCurrentLocale().toLanguageTag();
                } catch (Exception unused2) {
                    str2 = null;
                }
                String jSONObject3 = jSONObject2.toString();
                jb1Var.t = str2;
                jb1Var.u = jSONObject3;
            }
        }
        if ("local".equals(str)) {
            fb1.d.put(a2, d);
            k5 k5Var = fb1.e;
            AndroidUtilities.cancelRunOnUIThread(k5Var);
            AndroidUtilities.runOnUIThread(k5Var, 1000L);
        }
    }

    public final void h() {
        int i10;
        yb1 yb1Var = this.f;
        if (yb1Var == null || yb1Var.s || yb1Var.r == 0 || yb1Var.A) {
            return;
        }
        vb1 vb1Var = yb1Var.D;
        if (vb1Var == null || (((i10 = yb1Var.C) != 0 && Math.abs(vb1Var.d - i10) > 1) || !vb1Var.a())) {
            yb1Var.A = true;
            WidgetSandboxNative.repaint(yb1Var.r);
        }
    }

    public final vb1 i() {
        yb1 yb1Var = this.f;
        vb1 vb1Var = yb1Var == null ? null : yb1Var.D;
        if (vb1Var != null && (this.g == null || yb1Var.t)) {
            return vb1Var;
        }
        vb1 vb1Var2 = this.g;
        return (vb1Var2 == null || Math.abs(vb1Var2.d - this.j) > 1) ? vb1Var != null ? vb1Var : this.g : this.g;
    }

    public final boolean j() {
        yb1 yb1Var;
        vb1 vb1Var;
        if (this.r == this.q || (yb1Var = this.f) == null || (vb1Var = yb1Var.D) == null) {
            return false;
        }
        if (!vb1Var.g && !yb1Var.v) {
            return false;
        }
        this.r = this.q;
        if (this.e == null) {
            return true;
        }
        fb1.b();
        db1 d = fb1.d(this);
        if (d == null) {
            return true;
        }
        fb1.a(d);
        return true;
    }

    public final void k(boolean z10) {
        this.n = z10;
        yb1 yb1Var = this.f;
        if (yb1Var != null) {
            yb1Var.e(z10 && !this.p);
        }
    }

    public final void l(int i10) {
        if (i10 <= 0 || i10 == this.j) {
            return;
        }
        this.j = i10;
        yb1 yb1Var = this.f;
        if (yb1Var == null || i10 <= 0 || i10 == yb1Var.C || yb1Var.s) {
            return;
        }
        yb1Var.C = i10;
        long j10 = yb1Var.r;
        if (j10 != 0) {
            WidgetSandboxNative.width(j10, i10 / yb1Var.h);
        }
    }

    public final void m() {
        this.o = false;
        if (this.f == null) {
            return;
        }
        vb1 i10 = i();
        if (i10 != null) {
            this.g = i10;
        }
        this.f.a();
        this.f = null;
    }
}
