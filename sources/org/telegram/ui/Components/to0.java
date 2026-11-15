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

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class to0 extends FrameLayout implements org.telegram.messenger.is {
    public static final /* synthetic */ int J = 0;
    public int E;
    public boolean F;
    public String G;
    public wa0 H;
    public so0 I;
    public final hi.k1[] a;
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

    public to0(Activity activity, org.telegram.ui.ActionBar.e6 e6Var) {
        super(activity);
        this.a = new hi.k1[2];
        this.b = 0;
        this.f = new ArrayList();
        this.n = true;
        this.s = new ArrayList();
        this.w = new HashMap();
        int i7 = 0;
        while (true) {
            hi.k1[] k1VarArr = this.a;
            if (i7 >= k1VarArr.length) {
                k1VarArr[0].setVisibility(0);
                this.a[1].setVisibility(8);
                return;
            } else {
                k1VarArr[i7] = new hi.k1(this, activity, e6Var);
                addView(this.a[i7], c8.ja.c(-1.0f, -1));
                i7++;
            }
        }
    }

    public static void a(hi.k1 k1Var, TLRPC.WebPage webPage, String str) {
        ImageView imageView = (ImageView) k1Var.c;
        i9 i9Var = (i9) k1Var.r;
        imageView.setImageResource(R.drawable.msg_link2);
        ((ImageView) k1Var.c).setVisibility(0);
        ((FrameLayout) k1Var.h).setVisibility(8);
        ((ImageView) k1Var.s).setVisibility(0);
        String str2 = webPage.site_name;
        if (str2 == null) {
            str2 = webPage.title;
        }
        if (str2 == null) {
            str2 = str;
        }
        ((org.telegram.ui.ActionBar.j5) k1Var.d).l(str2, false);
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
        ((org.telegram.ui.ActionBar.j5) k1Var.e).l(str3, false);
        TLRPC.Photo photo = webPage.photo;
        if (photo != null) {
            TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(photo.sizes, org.telegram.messenger.ns.r5, false, null, false);
            TLRPC.PhotoSize w11 = org.telegram.messenger.w7.w(webPage.photo.sizes, org.telegram.messenger.g0.L(40.0f), false, null, false);
            if (w10 != null) {
                i9Var.setRoundRadius(org.telegram.messenger.g0.L(4.0f));
                i9Var.g(1, 0L, webPage, "50_50", "50_50_b", null, org.telegram.messenger.gc.f(w10, webPage.photo), org.telegram.messenger.gc.f(w11, webPage.photo));
                i9Var.setVisibility(0);
            } else {
                i9Var.setVisibility(8);
            }
        } else {
            i9Var.setVisibility(8);
        }
        ((LinearLayout) k1Var.b).setClickable(false);
    }

    public static void b(i9 i9Var, org.telegram.messenger.ff ffVar) {
        if (ffVar == null) {
            i9Var.setVisibility(8);
            return;
        }
        int i7 = ffVar.C;
        String str = ffVar.I;
        i9Var.setVisibility(0);
        i9Var.r();
        String str2 = ffVar.c;
        if (str2 != null) {
            i9Var.h(str2, null, null);
            return;
        }
        if (str == null) {
            i9Var.setImageDrawable(null);
            return;
        }
        if (ffVar.b) {
            i9Var.h("vthumb://" + i7 + ":" + str, null, null);
            return;
        }
        i9Var.s(ffVar.J, ffVar.K, true);
        i9Var.h("thumb://" + i7 + ":" + str, null, null);
    }

    public final String c(hi.k1 k1Var) {
        ArrayList arrayList = this.f;
        if (arrayList.isEmpty()) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder();
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            long longValue = ((Long) obj).longValue();
            if (sb2.length() > 0) {
                sb2.append(", ");
            }
            if (longValue == this.d) {
                sb2.append(org.telegram.messenger.hd.M0(2131745901, null));
            } else {
                sb2.append(arrayList.size() == 1 ? org.telegram.messenger.m5.l(this.c, longValue) : org.telegram.messenger.m5.s(this.c, longValue));
            }
        }
        String a02 = org.telegram.messenger.hd.a0(null, null, 2131745439, sb2.toString());
        org.telegram.ui.ActionBar.j5 j5Var = (org.telegram.ui.ActionBar.j5) k1Var.e;
        return (arrayList.size() > 2 || j5Var.getPaint().measureText(a02) > ((float) (j5Var.getMeasuredWidth() <= 0 ? org.telegram.messenger.g0.q.x - org.telegram.messenger.g0.L(140.0f) : j5Var.getMeasuredWidth()))) ? org.telegram.messenger.hd.G(arrayList.size(), "ShareSendToMany", new Object[0]) : a02;
    }

    public final void d() {
        if (this.y != 0) {
            ConnectionsManager.getInstance(org.telegram.messenger.c.a(this.c).a).cancelRequest(this.y, true);
            this.y = 0;
        }
        this.E++;
    }

    @Override // org.telegram.messenger.is
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.ns.w0 && this.x != null && i10 == this.c) {
            a0.h hVar = (a0.h) objArr[0];
            for (int i11 = 0; i11 < hVar.m(); i11++) {
                TLRPC.WebPage webPage = (TLRPC.WebPage) hVar.n(i11);
                if (webPage != null && webPage.id == this.x.id) {
                    if (webPage instanceof TLRPC.TL_webPageEmpty) {
                        this.x = null;
                        d();
                        if (this.b != 0) {
                            this.b = 0;
                            so0 so0Var = this.I;
                            if (so0Var != null) {
                                ((org.telegram.ui.hu) so0Var).g(0);
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
        so0 so0Var;
        boolean z11;
        if (charSequence != null && charSequence.length() != 0) {
            try {
                Matcher matcher = org.telegram.messenger.g0.S.matcher(charSequence);
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
                        for (int i7 = 0; i7 < arrayList.size(); i7++) {
                            if (TextUtils.equals((CharSequence) arrayList.get(i7), (CharSequence) arrayList2.get(i7))) {
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
                    so0 so0Var2 = this.I;
                    if (so0Var2 != null) {
                        ((org.telegram.ui.hu) so0Var2).g(0);
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
            int i10 = this.b;
            boolean z12 = (i10 == 2 || i10 == 0) ? false : true;
            if (i10 != 2) {
                this.b = 2;
            }
            if (z12) {
                k();
            }
            TLRPC.WebPage webPage = (TLRPC.WebPage) this.w.get(str);
            hi.k1[] k1VarArr = this.a;
            if (webPage != null) {
                this.x = webPage;
                a(k1VarArr[0], webPage, str);
            } else {
                hi.k1 k1Var = k1VarArr[0];
                ((ImageView) k1Var.c).setImageResource(R.drawable.msg_link2);
                ((ImageView) k1Var.c).setVisibility(0);
                ((FrameLayout) k1Var.h).setVisibility(8);
                ((i9) k1Var.r).setVisibility(8);
                ((ImageView) k1Var.s).setVisibility(0);
                ((org.telegram.ui.ActionBar.j5) k1Var.d).l(org.telegram.messenger.hd.M0(2131750471, null), false);
                ((org.telegram.ui.ActionBar.j5) k1Var.e).l(str == null ? "" : str, false);
                ((LinearLayout) k1Var.b).setClickable(false);
                d();
                if (str != null && !str.isEmpty()) {
                    TL_account.getWebPagePreview getwebpagepreview = new TL_account.getWebPagePreview();
                    getwebpagepreview.message = str;
                    int i11 = this.E + 1;
                    this.E = i11;
                    this.y = ConnectionsManager.getInstance(org.telegram.messenger.c.a(this.c).a).sendRequest(getwebpagepreview, new jg.u(this, i11, str, 7));
                }
            }
            hi.k1 k1Var2 = k1VarArr[0];
            String str3 = this.G;
            if (str3 != null) {
                ((org.telegram.ui.ActionBar.j5) k1Var2.f).l(str3, false);
            }
            int i12 = this.b;
            if (i10 == i12 || (so0Var = this.I) == null) {
                return;
            }
            ((org.telegram.ui.hu) so0Var).g(i12);
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

    public final i9 f(int i7) {
        i9[] i9VarArr;
        if (this.b == 1 && (i9VarArr = (i9[]) this.a[0].n) != null && i7 >= 0 && i7 < i9VarArr.length && i9VarArr[i7].getVisibility() == 0) {
            return i9VarArr[i7];
        }
        return null;
    }

    public final void g(int i7) {
        h(i7);
        this.d = org.telegram.messenger.m10.i(org.telegram.messenger.c.a(i7).a).e();
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

    public final void h(int i7) {
        int i10 = this.c;
        int i11 = org.telegram.messenger.ns.w0;
        if (i10 == i7) {
            this.c = i7;
            if (isAttachedToWindow()) {
                org.telegram.messenger.ns.f(this.c).c(this, i11);
                return;
            }
            return;
        }
        if (isAttachedToWindow()) {
            org.telegram.messenger.ns.f(this.c).n(this, i11);
        }
        this.c = i7;
        if (isAttachedToWindow()) {
            org.telegram.messenger.ns.f(this.c).c(this, i11);
        }
    }

    public final void i(int i7, ArrayList arrayList) {
        so0 so0Var;
        h(i7);
        this.d = org.telegram.messenger.m10.i(org.telegram.messenger.c.a(i7).a).e();
        this.e = arrayList;
        this.h = false;
        this.x = null;
        d();
        this.s.clear();
        int i10 = this.b;
        boolean z10 = (i10 == 1 || i10 == 0) ? false : true;
        this.b = 1;
        if (z10) {
            k();
        }
        hi.k1[] k1VarArr = this.a;
        hi.k1 k1Var = k1VarArr[0];
        ImageView imageView = (ImageView) k1Var.c;
        org.telegram.ui.ActionBar.j5 j5Var = (org.telegram.ui.ActionBar.j5) k1Var.e;
        i9[] i9VarArr = (i9[]) k1Var.n;
        org.telegram.ui.ActionBar.j5 j5Var2 = (org.telegram.ui.ActionBar.j5) k1Var.d;
        imageView.setImageResource(R.drawable.filled_forward);
        ((ImageView) k1Var.c).setVisibility(0);
        ((i9) k1Var.r).setVisibility(8);
        ((FrameLayout) k1Var.h).setVisibility(0);
        ((ImageView) k1Var.s).setVisibility(8);
        ((LinearLayout) k1Var.b).setClickable(true);
        ArrayList arrayList2 = this.e;
        if (arrayList2 == null || arrayList2.isEmpty()) {
            j5Var2.l("", false);
            j5Var.l("", false);
            for (i9 i9Var : i9VarArr) {
                i9Var.setVisibility(8);
            }
        } else {
            int size = arrayList2.size();
            int i11 = 0;
            int i12 = 0;
            int i13 = 0;
            while (i13 < size) {
                Object obj = arrayList2.get(i13);
                i13++;
                if (((org.telegram.messenger.ff) obj).b) {
                    i11++;
                } else {
                    i12++;
                }
            }
            int size2 = arrayList2.size();
            if (size2 == 1) {
                j5Var2.l(org.telegram.messenger.hd.M0(((org.telegram.messenger.ff) arrayList2.get(0)).b ? 2131745433 : 2131745444, null), false);
            } else if (i11 == 0) {
                j5Var2.l(org.telegram.messenger.hd.G(size2, "ShareSendPhotos", new Object[0]), false);
            } else if (i12 == 0) {
                j5Var2.l(org.telegram.messenger.hd.G(size2, "ShareSendVideos", new Object[0]), false);
            } else {
                j5Var2.l(org.telegram.messenger.hd.G(size2, "ShareSendItems", new Object[0]), false);
            }
            j5Var.l(c(k1Var), false);
            b(i9VarArr[0], arrayList2.size() > 0 ? (org.telegram.messenger.ff) arrayList2.get(0) : null);
            b(i9VarArr[1], arrayList2.size() > 1 ? (org.telegram.messenger.ff) arrayList2.get(1) : null);
            b(i9VarArr[2], arrayList2.size() > 2 ? (org.telegram.messenger.ff) arrayList2.get(2) : null);
        }
        hi.k1 k1Var2 = k1VarArr[0];
        String str = this.G;
        if (str != null) {
            ((org.telegram.ui.ActionBar.j5) k1Var2.f).l(str, false);
        }
        int i14 = this.b;
        if (i10 == i14 || (so0Var = this.I) == null) {
            return;
        }
        ((org.telegram.ui.hu) so0Var).g(i14);
    }

    public final void j() {
        wa0 wa0Var = this.H;
        if (wa0Var != null) {
            org.telegram.messenger.g0.r(wa0Var);
            this.H = null;
        }
        this.F = false;
        for (hi.k1 k1Var : this.a) {
            org.telegram.ui.ActionBar.j5 j5Var = (org.telegram.ui.ActionBar.j5) k1Var.e;
            j5Var.setAlpha(1.0f);
            j5Var.setScaleX(1.0f);
            j5Var.setScaleY(1.0f);
            ((org.telegram.ui.ActionBar.j5) k1Var.f).setAlpha(0.0f);
        }
    }

    public final void k() {
        hi.k1[] k1VarArr = this.a;
        hi.k1 k1Var = k1VarArr[0];
        hi.k1 k1Var2 = k1VarArr[1];
        k1VarArr[0] = k1Var2;
        k1VarArr[1] = k1Var;
        k1Var2.getClass();
        k1VarArr[0].setVisibility(0);
        k1VarArr[0].setScaleX(0.8f);
        k1VarArr[0].setScaleY(0.8f);
        k1VarArr[0].setAlpha(0.0f);
        k1VarArr[0].setTranslationY(org.telegram.messenger.g0.L(20.0f));
        ViewPropertyAnimator translationY = k1VarArr[0].animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f).translationY(0.0f);
        er erVar = er.h;
        org.telegram.messenger.i20.n(translationY, erVar, 320L);
        hi.k1 k1Var3 = k1VarArr[1];
        k1Var3.getClass();
        k1Var3.animate().scaleX(0.8f).scaleY(0.8f).alpha(0.0f).translationY(-org.telegram.messenger.g0.L(20.0f)).setInterpolator(erVar).setDuration(320L).withEndAction(new ro0(k1Var3, 0)).start();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        org.telegram.messenger.ns.f(this.c).c(this, org.telegram.messenger.ns.w0);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.messenger.ns.f(this.c).n(this, org.telegram.messenger.ns.w0);
        d();
    }

    public void setLayoutClickListener(View.OnClickListener onClickListener) {
        for (hi.k1 k1Var : this.a) {
            ((LinearLayout) k1Var.b).setOnClickListener(onClickListener);
        }
    }

    public void setOnModeChangeListener(so0 so0Var) {
        this.I = so0Var;
    }
}
