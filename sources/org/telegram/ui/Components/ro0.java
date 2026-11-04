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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class ro0 extends FrameLayout implements org.telegram.messenger.cs {
    public static final /* synthetic */ int J = 0;
    public int E;
    public boolean F;
    public String G;
    public jb0 H;
    public qo0 I;
    public final gi.i1[] a;
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

    public ro0(Activity activity, org.telegram.ui.ActionBar.e6 e6Var) {
        super(activity);
        this.a = new gi.i1[2];
        this.b = 0;
        this.f = new ArrayList();
        this.n = true;
        this.s = new ArrayList();
        this.w = new HashMap();
        int i3 = 0;
        while (true) {
            gi.i1[] i1VarArr = this.a;
            if (i3 >= i1VarArr.length) {
                i1VarArr[0].setVisibility(0);
                this.a[1].setVisibility(8);
                return;
            } else {
                i1VarArr[i3] = new gi.i1(this, activity, e6Var);
                addView(this.a[i3], b8.mf.c(-1.0f, -1));
                i3++;
            }
        }
    }

    public static void a(gi.i1 i1Var, TLRPC.WebPage webPage, String str) {
        ImageView imageView = (ImageView) i1Var.c;
        k9 k9Var = (k9) i1Var.r;
        imageView.setImageResource(R.drawable.msg_link2);
        ((ImageView) i1Var.c).setVisibility(0);
        ((FrameLayout) i1Var.h).setVisibility(8);
        ((ImageView) i1Var.s).setVisibility(0);
        String str2 = webPage.site_name;
        if (str2 == null) {
            str2 = webPage.title;
        }
        if (str2 == null) {
            str2 = str;
        }
        ((org.telegram.ui.ActionBar.k5) i1Var.d).l(str2, false);
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
        ((org.telegram.ui.ActionBar.k5) i1Var.e).l(str3, false);
        TLRPC.Photo photo = webPage.photo;
        if (photo != null) {
            TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(photo.sizes, org.telegram.messenger.hs.r5, false, null, false);
            TLRPC.PhotoSize w11 = org.telegram.messenger.w7.w(webPage.photo.sizes, org.telegram.messenger.g0.L(40.0f), false, null, false);
            if (w10 != null) {
                k9Var.setRoundRadius(org.telegram.messenger.g0.L(4.0f));
                k9Var.g(1, 0L, webPage, "50_50", "50_50_b", null, org.telegram.messenger.ac.f(w10, webPage.photo), org.telegram.messenger.ac.f(w11, webPage.photo));
                k9Var.setVisibility(0);
            } else {
                k9Var.setVisibility(8);
            }
        } else {
            k9Var.setVisibility(8);
        }
        ((LinearLayout) i1Var.b).setClickable(false);
    }

    public static void b(k9 k9Var, org.telegram.messenger.ye yeVar) {
        if (yeVar == null) {
            k9Var.setVisibility(8);
            return;
        }
        int i3 = yeVar.C;
        String str = yeVar.I;
        k9Var.setVisibility(0);
        k9Var.r();
        String str2 = yeVar.c;
        if (str2 != null) {
            k9Var.h(str2, null, null);
            return;
        }
        if (str == null) {
            k9Var.setImageDrawable(null);
            return;
        }
        if (yeVar.b) {
            k9Var.h("vthumb://" + i3 + ":" + str, null, null);
            return;
        }
        k9Var.s(yeVar.J, yeVar.K, true);
        k9Var.h("thumb://" + i3 + ":" + str, null, null);
    }

    public final String c(gi.i1 i1Var) {
        ArrayList arrayList = this.f;
        if (arrayList.isEmpty()) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder();
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            long longValue = ((Long) obj).longValue();
            if (sb2.length() > 0) {
                sb2.append(", ");
            }
            if (longValue == this.d) {
                sb2.append(org.telegram.messenger.bd.M0(2131745911, null));
            } else {
                sb2.append(arrayList.size() == 1 ? org.telegram.messenger.m5.l(this.c, longValue) : org.telegram.messenger.m5.s(this.c, longValue));
            }
        }
        String a02 = org.telegram.messenger.bd.a0(null, null, 2131745449, sb2.toString());
        org.telegram.ui.ActionBar.k5 k5Var = (org.telegram.ui.ActionBar.k5) i1Var.e;
        return (arrayList.size() > 2 || k5Var.getPaint().measureText(a02) > ((float) (k5Var.getMeasuredWidth() <= 0 ? org.telegram.messenger.g0.q.x - org.telegram.messenger.g0.L(140.0f) : k5Var.getMeasuredWidth()))) ? org.telegram.messenger.bd.G(arrayList.size(), "ShareSendToMany", new Object[0]) : a02;
    }

    public final void d() {
        if (this.y != 0) {
            ConnectionsManager.getInstance(org.telegram.messenger.c.a(this.c).a).cancelRequest(this.y, true);
            this.y = 0;
        }
        this.E++;
    }

    @Override // org.telegram.messenger.cs
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        if (i3 == org.telegram.messenger.hs.w0 && this.x != null && i10 == this.c) {
            a0.h hVar = (a0.h) objArr[0];
            for (int i11 = 0; i11 < hVar.m(); i11++) {
                TLRPC.WebPage webPage = (TLRPC.WebPage) hVar.n(i11);
                if (webPage != null && webPage.id == this.x.id) {
                    if (webPage instanceof TLRPC.TL_webPageEmpty) {
                        this.x = null;
                        d();
                        if (this.b != 0) {
                            this.b = 0;
                            qo0 qo0Var = this.I;
                            if (qo0Var != null) {
                                ((org.telegram.ui.du) qo0Var).i(0);
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
        qo0 qo0Var;
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
                        for (int i3 = 0; i3 < arrayList.size(); i3++) {
                            if (TextUtils.equals((CharSequence) arrayList.get(i3), (CharSequence) arrayList2.get(i3))) {
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
                    qo0 qo0Var2 = this.I;
                    if (qo0Var2 != null) {
                        ((org.telegram.ui.du) qo0Var2).i(0);
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
            gi.i1[] i1VarArr = this.a;
            if (webPage != null) {
                this.x = webPage;
                a(i1VarArr[0], webPage, str);
            } else {
                gi.i1 i1Var = i1VarArr[0];
                ((ImageView) i1Var.c).setImageResource(R.drawable.msg_link2);
                ((ImageView) i1Var.c).setVisibility(0);
                ((FrameLayout) i1Var.h).setVisibility(8);
                ((k9) i1Var.r).setVisibility(8);
                ((ImageView) i1Var.s).setVisibility(0);
                ((org.telegram.ui.ActionBar.k5) i1Var.d).l(org.telegram.messenger.bd.M0(2131750479, null), false);
                ((org.telegram.ui.ActionBar.k5) i1Var.e).l(str == null ? "" : str, false);
                ((LinearLayout) i1Var.b).setClickable(false);
                d();
                if (str != null && !str.isEmpty()) {
                    TL_account.getWebPagePreview getwebpagepreview = new TL_account.getWebPagePreview();
                    getwebpagepreview.message = str;
                    int i11 = this.E + 1;
                    this.E = i11;
                    this.y = ConnectionsManager.getInstance(org.telegram.messenger.c.a(this.c).a).sendRequest(getwebpagepreview, new kg.t(this, i11, str, 7));
                }
            }
            gi.i1 i1Var2 = i1VarArr[0];
            String str3 = this.G;
            if (str3 != null) {
                ((org.telegram.ui.ActionBar.k5) i1Var2.f).l(str3, false);
            }
            int i12 = this.b;
            if (i10 == i12 || (qo0Var = this.I) == null) {
                return;
            }
            ((org.telegram.ui.du) qo0Var).i(i12);
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

    public final k9 f(int i3) {
        k9[] k9VarArr;
        if (this.b == 1 && (k9VarArr = (k9[]) this.a[0].n) != null && i3 >= 0 && i3 < k9VarArr.length && k9VarArr[i3].getVisibility() == 0) {
            return k9VarArr[i3];
        }
        return null;
    }

    public final void g(int i3) {
        h(i3);
        this.d = org.telegram.messenger.h10.i(org.telegram.messenger.c.a(i3).a).e();
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

    public final void h(int i3) {
        int i10 = this.c;
        int i11 = org.telegram.messenger.hs.w0;
        if (i10 == i3) {
            this.c = i3;
            if (isAttachedToWindow()) {
                org.telegram.messenger.hs.f(this.c).c(this, i11);
                return;
            }
            return;
        }
        if (isAttachedToWindow()) {
            org.telegram.messenger.hs.f(this.c).n(this, i11);
        }
        this.c = i3;
        if (isAttachedToWindow()) {
            org.telegram.messenger.hs.f(this.c).c(this, i11);
        }
    }

    public final void i(int i3, ArrayList arrayList) {
        qo0 qo0Var;
        h(i3);
        this.d = org.telegram.messenger.h10.i(org.telegram.messenger.c.a(i3).a).e();
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
        gi.i1[] i1VarArr = this.a;
        gi.i1 i1Var = i1VarArr[0];
        ImageView imageView = (ImageView) i1Var.c;
        org.telegram.ui.ActionBar.k5 k5Var = (org.telegram.ui.ActionBar.k5) i1Var.e;
        k9[] k9VarArr = (k9[]) i1Var.n;
        org.telegram.ui.ActionBar.k5 k5Var2 = (org.telegram.ui.ActionBar.k5) i1Var.d;
        imageView.setImageResource(R.drawable.filled_forward);
        ((ImageView) i1Var.c).setVisibility(0);
        ((k9) i1Var.r).setVisibility(8);
        ((FrameLayout) i1Var.h).setVisibility(0);
        ((ImageView) i1Var.s).setVisibility(8);
        ((LinearLayout) i1Var.b).setClickable(true);
        ArrayList arrayList2 = this.e;
        if (arrayList2 == null || arrayList2.isEmpty()) {
            k5Var2.l("", false);
            k5Var.l("", false);
            for (k9 k9Var : k9VarArr) {
                k9Var.setVisibility(8);
            }
        } else {
            int size = arrayList2.size();
            int i11 = 0;
            int i12 = 0;
            int i13 = 0;
            while (i13 < size) {
                Object obj = arrayList2.get(i13);
                i13++;
                if (((org.telegram.messenger.ye) obj).b) {
                    i11++;
                } else {
                    i12++;
                }
            }
            int size2 = arrayList2.size();
            if (size2 == 1) {
                k5Var2.l(org.telegram.messenger.bd.M0(((org.telegram.messenger.ye) arrayList2.get(0)).b ? 2131745443 : 2131745454, null), false);
            } else if (i11 == 0) {
                k5Var2.l(org.telegram.messenger.bd.G(size2, "ShareSendPhotos", new Object[0]), false);
            } else if (i12 == 0) {
                k5Var2.l(org.telegram.messenger.bd.G(size2, "ShareSendVideos", new Object[0]), false);
            } else {
                k5Var2.l(org.telegram.messenger.bd.G(size2, "ShareSendItems", new Object[0]), false);
            }
            k5Var.l(c(i1Var), false);
            b(k9VarArr[0], arrayList2.size() > 0 ? (org.telegram.messenger.ye) arrayList2.get(0) : null);
            b(k9VarArr[1], arrayList2.size() > 1 ? (org.telegram.messenger.ye) arrayList2.get(1) : null);
            b(k9VarArr[2], arrayList2.size() > 2 ? (org.telegram.messenger.ye) arrayList2.get(2) : null);
        }
        gi.i1 i1Var2 = i1VarArr[0];
        String str = this.G;
        if (str != null) {
            ((org.telegram.ui.ActionBar.k5) i1Var2.f).l(str, false);
        }
        int i14 = this.b;
        if (i10 == i14 || (qo0Var = this.I) == null) {
            return;
        }
        ((org.telegram.ui.du) qo0Var).i(i14);
    }

    public final void j() {
        jb0 jb0Var = this.H;
        if (jb0Var != null) {
            org.telegram.messenger.g0.r(jb0Var);
            this.H = null;
        }
        this.F = false;
        for (gi.i1 i1Var : this.a) {
            org.telegram.ui.ActionBar.k5 k5Var = (org.telegram.ui.ActionBar.k5) i1Var.e;
            k5Var.setAlpha(1.0f);
            k5Var.setScaleX(1.0f);
            k5Var.setScaleY(1.0f);
            ((org.telegram.ui.ActionBar.k5) i1Var.f).setAlpha(0.0f);
        }
    }

    public final void k() {
        gi.i1[] i1VarArr = this.a;
        gi.i1 i1Var = i1VarArr[0];
        gi.i1 i1Var2 = i1VarArr[1];
        i1VarArr[0] = i1Var2;
        i1VarArr[1] = i1Var;
        i1Var2.getClass();
        i1VarArr[0].setVisibility(0);
        i1VarArr[0].setScaleX(0.8f);
        i1VarArr[0].setScaleY(0.8f);
        i1VarArr[0].setAlpha(0.0f);
        i1VarArr[0].setTranslationY(org.telegram.messenger.g0.L(20.0f));
        ViewPropertyAnimator translationY = i1VarArr[0].animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f).translationY(0.0f);
        xq xqVar = xq.h;
        org.telegram.messenger.camera.q.l(translationY, xqVar, 320L);
        gi.i1 i1Var3 = i1VarArr[1];
        i1Var3.getClass();
        i1Var3.animate().scaleX(0.8f).scaleY(0.8f).alpha(0.0f).translationY(-org.telegram.messenger.g0.L(20.0f)).setInterpolator(xqVar).setDuration(320L).withEndAction(new jb0(i1Var3, 29)).start();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        org.telegram.messenger.hs.f(this.c).c(this, org.telegram.messenger.hs.w0);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.messenger.hs.f(this.c).n(this, org.telegram.messenger.hs.w0);
        d();
    }

    public void setLayoutClickListener(View.OnClickListener onClickListener) {
        for (gi.i1 i1Var : this.a) {
            ((LinearLayout) i1Var.b).setOnClickListener(onClickListener);
        }
    }

    public void setOnModeChangeListener(qo0 qo0Var) {
        this.I = qo0Var;
    }
}
