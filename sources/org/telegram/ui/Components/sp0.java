package org.telegram.ui.Components;

import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.Matcher;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class sp0 extends FrameLayout implements org.telegram.messenger.us {
    public static final /* synthetic */ int I = 0;
    public int D;
    public boolean E;
    public String F;
    public uo0 G;
    public rp0 H;
    public final qp0[] a;
    public int b;
    public int c;
    public long d;
    public ArrayList e;
    public final ArrayList f;
    public boolean h;
    public boolean n;
    public String r;
    public final ArrayList s;
    public final HashMap w;
    public TLRPC.WebPage x;
    public int y;

    public sp0(Activity activity, org.telegram.ui.ActionBar.p6 p6Var) {
        super(activity);
        this.a = new qp0[2];
        this.b = 0;
        this.f = new ArrayList();
        this.n = true;
        this.s = new ArrayList();
        this.w = new HashMap();
        int i10 = 0;
        while (true) {
            qp0[] qp0VarArr = this.a;
            if (i10 >= qp0VarArr.length) {
                qp0VarArr[0].setVisibility(0);
                this.a[1].setVisibility(8);
                return;
            } else {
                qp0VarArr[i10] = new qp0(this, activity, p6Var);
                addView(this.a[i10], w7.b6.c(-1.0f, -1));
                i10++;
            }
        }
    }

    public static void a(qp0 qp0Var, TLRPC.WebPage webPage, String str) {
        ImageView imageView = (ImageView) qp0Var.c;
        g9 g9Var = (g9) qp0Var.s;
        imageView.setImageResource(R.drawable.msg_link2);
        ((ImageView) qp0Var.c).setVisibility(0);
        ((FrameLayout) qp0Var.n).setVisibility(8);
        ((ImageView) qp0Var.d).setVisibility(0);
        String str2 = webPage.site_name;
        if (str2 == null) {
            str2 = webPage.title;
        }
        if (str2 == null) {
            str2 = str;
        }
        ((org.telegram.ui.ActionBar.u5) qp0Var.e).l(str2, false);
        String str3 = webPage.title;
        if (str3 == null || webPage.site_name == null) {
            str3 = webPage.description;
        }
        if (str3 == null) {
            String str4 = webPage.display_url;
            if (str4 != null) {
                str = str4;
            }
            str3 = str;
        }
        ((org.telegram.ui.ActionBar.u5) qp0Var.f).l(str3, false);
        TLRPC.Photo photo = webPage.photo;
        if (photo != null) {
            TLRPC.PhotoSize w9 = org.telegram.messenger.b8.w(photo.sizes, org.telegram.messenger.zs.r5, false, null, false);
            TLRPC.PhotoSize w10 = org.telegram.messenger.b8.w(webPage.photo.sizes, org.telegram.messenger.i0.L(40.0f), false, null, false);
            if (w9 != null) {
                g9Var.setRoundRadius(org.telegram.messenger.i0.L(4.0f));
                g9Var.g(1, 0L, webPage, "50_50", "50_50_b", null, org.telegram.messenger.ic.f(w9, webPage.photo), org.telegram.messenger.ic.f(w10, webPage.photo));
                g9Var.setVisibility(0);
            } else {
                g9Var.setVisibility(8);
            }
        } else {
            g9Var.setVisibility(8);
        }
        ((LinearLayout) qp0Var.b).setClickable(false);
    }

    public static void b(g9 g9Var, org.telegram.messenger.ef efVar) {
        if (efVar == null) {
            g9Var.setVisibility(8);
            return;
        }
        int i10 = efVar.C;
        String str = efVar.I;
        g9Var.setVisibility(0);
        g9Var.r();
        String str2 = efVar.c;
        if (str2 != null) {
            g9Var.h(str2, null, null);
            return;
        }
        if (str == null) {
            g9Var.setImageDrawable(null);
            return;
        }
        if (efVar.b) {
            g9Var.h("vthumb://" + i10 + ":" + str, null, null);
            return;
        }
        g9Var.s(efVar.J, efVar.K, true);
        g9Var.h("thumb://" + i10 + ":" + str, null, null);
    }

    public final String c(qp0 qp0Var) {
        ArrayList arrayList = this.f;
        if (arrayList.isEmpty()) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder();
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            long longValue = ((Long) obj).longValue();
            if (sb2.length() > 0) {
                sb2.append(", ");
            }
            if (longValue == this.d) {
                sb2.append(org.telegram.messenger.cd.L0(2131745918, null));
            } else {
                sb2.append(arrayList.size() == 1 ? org.telegram.messenger.o5.l(this.c, longValue) : org.telegram.messenger.o5.s(this.c, longValue));
            }
        }
        String a02 = org.telegram.messenger.cd.a0(null, null, 2131745457, sb2.toString());
        org.telegram.ui.ActionBar.u5 u5Var = (org.telegram.ui.ActionBar.u5) qp0Var.f;
        return (arrayList.size() > 2 || u5Var.getPaint().measureText(a02) > ((float) (u5Var.getMeasuredWidth() <= 0 ? org.telegram.messenger.i0.q.x - org.telegram.messenger.i0.L(140.0f) : u5Var.getMeasuredWidth()))) ? org.telegram.messenger.cd.G(arrayList.size(), "ShareSendToMany", new Object[0]) : a02;
    }

    public final void d() {
        if (this.y != 0) {
            ConnectionsManager.getInstance(org.telegram.messenger.c.a(this.c).a).cancelRequest(this.y, true);
            this.y = 0;
        }
        this.D++;
    }

    @Override // org.telegram.messenger.us
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == org.telegram.messenger.zs.w0 && this.x != null && i11 == this.c) {
            a0.h hVar = (a0.h) objArr[0];
            for (int i12 = 0; i12 < hVar.m(); i12++) {
                TLRPC.WebPage webPage = (TLRPC.WebPage) hVar.n(i12);
                if (webPage != null && webPage.id == this.x.id) {
                    if (webPage instanceof TLRPC.TL_webPageEmpty) {
                        this.x = null;
                        d();
                        if (this.b != 0) {
                            this.b = 0;
                            rp0 rp0Var = this.H;
                            if (rp0Var != null) {
                                ((org.telegram.ui.iv) rp0Var).i(0);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    if (webPage instanceof TLRPC.TL_webPage) {
                        this.x = webPage;
                        ArrayList arrayList = this.s;
                        String str = arrayList.isEmpty() ? "" : TextUtils.join(" ", arrayList).toString();
                        HashMap hashMap = this.w;
                        if (!hashMap.containsKey(str)) {
                            hashMap.put(str, webPage);
                        }
                        a(this.a[0], webPage, str);
                        return;
                    }
                    return;
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:98:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(CharSequence charSequence, boolean z10) {
        ArrayList arrayList;
        rp0 rp0Var;
        boolean z11;
        if (charSequence != null && charSequence.length() != 0) {
            try {
                Matcher matcher = org.telegram.messenger.i0.S.matcher(charSequence);
                arrayList = null;
                while (matcher.find()) {
                    try {
                        if (matcher.start() <= 0 || charSequence.charAt(matcher.start() - 1) != '@') {
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                            }
                            arrayList.add(charSequence.subSequence(matcher.start(), matcher.end()));
                        }
                    } catch (Exception unused) {
                    }
                }
            } catch (Exception unused2) {
            }
            ArrayList arrayList2 = this.s;
            if (!z10) {
                if (arrayList != null) {
                    if (arrayList.size() == arrayList2.size()) {
                        for (int i10 = 0; i10 < arrayList.size(); i10++) {
                            if (TextUtils.equals((CharSequence) arrayList.get(i10), (CharSequence) arrayList2.get(i10))) {
                            }
                        }
                        z11 = true;
                    }
                    z11 = false;
                    break;
                }
                z11 = arrayList2.isEmpty();
                if (z11) {
                    return;
                }
            }
            arrayList2.clear();
            if (arrayList != null) {
                arrayList2.addAll(arrayList);
            }
            if (arrayList != null || arrayList.isEmpty()) {
                d();
                this.x = null;
                if (this.b == 0) {
                    this.b = 0;
                    rp0 rp0Var2 = this.H;
                    if (rp0Var2 != null) {
                        ((org.telegram.ui.iv) rp0Var2).i(0);
                        return;
                    }
                    return;
                }
                return;
            }
            String str = TextUtils.join(" ", arrayList).toString();
            if (!this.n) {
                String str2 = this.r;
                if (str2 != null && str2.equals(str)) {
                    return;
                }
                this.n = true;
                this.r = null;
            }
            int i11 = this.b;
            boolean z12 = (i11 == 2 || i11 == 0) ? false : true;
            if (i11 != 2) {
                this.b = 2;
            }
            if (z12) {
                k();
            }
            TLRPC.WebPage webPage = (TLRPC.WebPage) this.w.get(str);
            qp0[] qp0VarArr = this.a;
            if (webPage != null) {
                this.x = webPage;
                a(qp0VarArr[0], webPage, str);
            } else {
                qp0 qp0Var = qp0VarArr[0];
                ((ImageView) qp0Var.c).setImageResource(R.drawable.msg_link2);
                ((ImageView) qp0Var.c).setVisibility(0);
                ((FrameLayout) qp0Var.n).setVisibility(8);
                ((g9) qp0Var.s).setVisibility(8);
                ((ImageView) qp0Var.d).setVisibility(0);
                ((org.telegram.ui.ActionBar.u5) qp0Var.e).l(org.telegram.messenger.cd.L0(2131750480, null), false);
                ((org.telegram.ui.ActionBar.u5) qp0Var.f).l(str == null ? "" : str, false);
                ((LinearLayout) qp0Var.b).setClickable(false);
                d();
                if (str != null && !str.isEmpty()) {
                    TL_account.getWebPagePreview getwebpagepreview = new TL_account.getWebPagePreview();
                    getwebpagepreview.message = str;
                    int i12 = this.D + 1;
                    this.D = i12;
                    this.y = ConnectionsManager.getInstance(org.telegram.messenger.c.a(this.c).a).sendRequest(getwebpagepreview, new mg.w(this, i12, str, 7));
                }
            }
            qp0 qp0Var2 = qp0VarArr[0];
            String str3 = this.F;
            if (str3 != null) {
                ((org.telegram.ui.ActionBar.u5) qp0Var2.h).l(str3, false);
            }
            int i13 = this.b;
            if (i11 == i13 || (rp0Var = this.H) == null) {
                return;
            }
            ((org.telegram.ui.iv) rp0Var).i(i13);
            return;
        }
        arrayList = null;
        ArrayList arrayList22 = this.s;
        if (!z10) {
        }
        arrayList22.clear();
        if (arrayList != null) {
        }
        if (arrayList != null) {
        }
        d();
        this.x = null;
        if (this.b == 0) {
        }
    }

    public final g9 f(int i10) {
        g9[] g9VarArr;
        if (this.b == 1 && (g9VarArr = (g9[]) this.a[0].r) != null && i10 >= 0 && i10 < g9VarArr.length && g9VarArr[i10].getVisibility() == 0) {
            return g9VarArr[i10];
        }
        return null;
    }

    public final void g(int i10) {
        h(i10);
        this.d = org.telegram.messenger.d20.i(org.telegram.messenger.c.a(i10).a).e();
        this.e = null;
        this.h = true;
        this.n = true;
        this.r = null;
        this.x = null;
        d();
        this.s.clear();
    }

    public TLRPC.WebPage getLoadedWebPage() {
        return this.x;
    }

    public int getMode() {
        return this.b;
    }

    public final void h(int i10) {
        int i11 = this.c;
        int i12 = org.telegram.messenger.zs.w0;
        if (i11 == i10) {
            this.c = i10;
            if (isAttachedToWindow()) {
                org.telegram.messenger.zs.f(this.c).c(this, i12);
                return;
            }
            return;
        }
        if (isAttachedToWindow()) {
            org.telegram.messenger.zs.f(this.c).n(this, i12);
        }
        this.c = i10;
        if (isAttachedToWindow()) {
            org.telegram.messenger.zs.f(this.c).c(this, i12);
        }
    }

    public final void i(int i10, ArrayList arrayList) {
        rp0 rp0Var;
        h(i10);
        this.d = org.telegram.messenger.d20.i(org.telegram.messenger.c.a(i10).a).e();
        this.e = arrayList;
        this.h = false;
        this.x = null;
        d();
        this.s.clear();
        int i11 = this.b;
        boolean z10 = (i11 == 1 || i11 == 0) ? false : true;
        this.b = 1;
        if (z10) {
            k();
        }
        qp0[] qp0VarArr = this.a;
        qp0 qp0Var = qp0VarArr[0];
        ImageView imageView = (ImageView) qp0Var.c;
        org.telegram.ui.ActionBar.u5 u5Var = (org.telegram.ui.ActionBar.u5) qp0Var.f;
        g9[] g9VarArr = (g9[]) qp0Var.r;
        org.telegram.ui.ActionBar.u5 u5Var2 = (org.telegram.ui.ActionBar.u5) qp0Var.e;
        imageView.setImageResource(R.drawable.filled_forward);
        ((ImageView) qp0Var.c).setVisibility(0);
        ((g9) qp0Var.s).setVisibility(8);
        ((FrameLayout) qp0Var.n).setVisibility(0);
        ((ImageView) qp0Var.d).setVisibility(8);
        ((LinearLayout) qp0Var.b).setClickable(true);
        ArrayList arrayList2 = this.e;
        if (arrayList2 == null || arrayList2.isEmpty()) {
            u5Var2.l("", false);
            u5Var.l("", false);
            for (g9 g9Var : g9VarArr) {
                g9Var.setVisibility(8);
            }
        } else {
            int size = arrayList2.size();
            int i12 = 0;
            int i13 = 0;
            int i14 = 0;
            while (i14 < size) {
                Object obj = arrayList2.get(i14);
                i14++;
                if (((org.telegram.messenger.ef) obj).b) {
                    i12++;
                } else {
                    i13++;
                }
            }
            int size2 = arrayList2.size();
            if (size2 == 1) {
                u5Var2.l(org.telegram.messenger.cd.L0(((org.telegram.messenger.ef) arrayList2.get(0)).b ? 2131745451 : 2131745462, null), false);
            } else if (i12 == 0) {
                u5Var2.l(org.telegram.messenger.cd.G(size2, "ShareSendPhotos", new Object[0]), false);
            } else if (i13 == 0) {
                u5Var2.l(org.telegram.messenger.cd.G(size2, "ShareSendVideos", new Object[0]), false);
            } else {
                u5Var2.l(org.telegram.messenger.cd.G(size2, "ShareSendItems", new Object[0]), false);
            }
            u5Var.l(c(qp0Var), false);
            b(g9VarArr[0], arrayList2.size() > 0 ? (org.telegram.messenger.ef) arrayList2.get(0) : null);
            b(g9VarArr[1], arrayList2.size() > 1 ? (org.telegram.messenger.ef) arrayList2.get(1) : null);
            b(g9VarArr[2], arrayList2.size() > 2 ? (org.telegram.messenger.ef) arrayList2.get(2) : null);
        }
        qp0 qp0Var2 = qp0VarArr[0];
        String str = this.F;
        if (str != null) {
            ((org.telegram.ui.ActionBar.u5) qp0Var2.h).l(str, false);
        }
        int i15 = this.b;
        if (i11 == i15 || (rp0Var = this.H) == null) {
            return;
        }
        ((org.telegram.ui.iv) rp0Var).i(i15);
    }

    public final void j() {
        uo0 uo0Var = this.G;
        if (uo0Var != null) {
            org.telegram.messenger.i0.r(uo0Var);
            this.G = null;
        }
        this.E = false;
        for (qp0 qp0Var : this.a) {
            org.telegram.ui.ActionBar.u5 u5Var = (org.telegram.ui.ActionBar.u5) qp0Var.f;
            u5Var.setAlpha(1.0f);
            u5Var.setScaleX(1.0f);
            u5Var.setScaleY(1.0f);
            ((org.telegram.ui.ActionBar.u5) qp0Var.h).setAlpha(0.0f);
        }
    }

    public final void k() {
        qp0[] qp0VarArr = this.a;
        qp0 qp0Var = qp0VarArr[0];
        qp0 qp0Var2 = qp0VarArr[1];
        qp0VarArr[0] = qp0Var2;
        qp0VarArr[1] = qp0Var;
        qp0Var2.getClass();
        qp0VarArr[0].setVisibility(0);
        qp0VarArr[0].setScaleX(0.8f);
        qp0VarArr[0].setScaleY(0.8f);
        qp0VarArr[0].setAlpha(0.0f);
        qp0VarArr[0].setTranslationY(org.telegram.messenger.i0.L(20.0f));
        ViewPropertyAnimator translationY = qp0VarArr[0].animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f).translationY(0.0f);
        gr grVar = gr.h;
        org.telegram.messenger.z20.m(translationY, grVar, 320L);
        qp0 qp0Var3 = qp0VarArr[1];
        qp0Var3.getClass();
        qp0Var3.animate().scaleX(0.8f).scaleY(0.8f).alpha(0.0f).translationY(-org.telegram.messenger.i0.L(20.0f)).setInterpolator(grVar).setDuration(320L).withEndAction(new uo0(qp0Var3, 2)).start();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        org.telegram.messenger.zs.f(this.c).c(this, org.telegram.messenger.zs.w0);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.messenger.zs.f(this.c).n(this, org.telegram.messenger.zs.w0);
        d();
    }

    public void setLayoutClickListener(View.OnClickListener onClickListener) {
        for (qp0 qp0Var : this.a) {
            ((LinearLayout) qp0Var.b).setOnClickListener(onClickListener);
        }
    }

    public void setOnModeChangeListener(rp0 rp0Var) {
        this.H = rp0Var;
    }
}
