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

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class po0 extends FrameLayout implements org.telegram.messenger.ls {
    public static final /* synthetic */ int I = 0;
    public int D;
    public boolean E;
    public String F;
    public ob0 G;
    public oo0 H;
    public final fi.i1[] a;
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

    public po0(Activity activity, org.telegram.ui.ActionBar.f6 f6Var) {
        super(activity);
        this.a = new fi.i1[2];
        this.b = 0;
        this.f = new ArrayList();
        this.n = true;
        this.s = new ArrayList();
        this.w = new HashMap();
        int i7 = 0;
        while (true) {
            fi.i1[] i1VarArr = this.a;
            if (i7 >= i1VarArr.length) {
                i1VarArr[0].setVisibility(0);
                this.a[1].setVisibility(8);
                return;
            } else {
                i1VarArr[i7] = new fi.i1(this, activity, f6Var);
                addView(this.a[i7], c8.ha.c(-1.0f, -1));
                i7++;
            }
        }
    }

    public static void a(fi.i1 i1Var, TLRPC.WebPage webPage, String str) {
        ImageView imageView = (ImageView) i1Var.c;
        l9 l9Var = (l9) i1Var.r;
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
            TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(photo.sizes, org.telegram.messenger.qs.r5, false, null, false);
            TLRPC.PhotoSize w11 = org.telegram.messenger.w7.w(webPage.photo.sizes, org.telegram.messenger.g0.L(40.0f), false, null, false);
            if (w10 != null) {
                l9Var.setRoundRadius(org.telegram.messenger.g0.L(4.0f));
                l9Var.g(1, 0L, webPage, "50_50", "50_50_b", null, org.telegram.messenger.hc.f(w10, webPage.photo), org.telegram.messenger.hc.f(w11, webPage.photo));
                l9Var.setVisibility(0);
            } else {
                l9Var.setVisibility(8);
            }
        } else {
            l9Var.setVisibility(8);
        }
        ((LinearLayout) i1Var.b).setClickable(false);
    }

    public static void b(l9 l9Var, org.telegram.messenger.gf gfVar) {
        if (gfVar == null) {
            l9Var.setVisibility(8);
            return;
        }
        int i7 = gfVar.C;
        String str = gfVar.I;
        l9Var.setVisibility(0);
        l9Var.r();
        String str2 = gfVar.c;
        if (str2 != null) {
            l9Var.h(str2, null, null);
            return;
        }
        if (str == null) {
            l9Var.setImageDrawable(null);
            return;
        }
        if (gfVar.b) {
            l9Var.h("vthumb://" + i7 + ":" + str, null, null);
            return;
        }
        l9Var.s(gfVar.J, gfVar.K, true);
        l9Var.h("thumb://" + i7 + ":" + str, null, null);
    }

    public final String c(fi.i1 i1Var) {
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
                sb2.append(org.telegram.messenger.id.M0(2131745904, null));
            } else {
                sb2.append(arrayList.size() == 1 ? org.telegram.messenger.m5.l(this.c, longValue) : org.telegram.messenger.m5.s(this.c, longValue));
            }
        }
        String a02 = org.telegram.messenger.id.a0(null, null, 2131745442, sb2.toString());
        org.telegram.ui.ActionBar.k5 k5Var = (org.telegram.ui.ActionBar.k5) i1Var.e;
        return (arrayList.size() > 2 || k5Var.getPaint().measureText(a02) > ((float) (k5Var.getMeasuredWidth() <= 0 ? org.telegram.messenger.g0.q.x - org.telegram.messenger.g0.L(140.0f) : k5Var.getMeasuredWidth()))) ? org.telegram.messenger.id.G(arrayList.size(), "ShareSendToMany", new Object[0]) : a02;
    }

    public final void d() {
        if (this.y != 0) {
            ConnectionsManager.getInstance(org.telegram.messenger.c.a(this.c).a).cancelRequest(this.y, true);
            this.y = 0;
        }
        this.D++;
    }

    @Override // org.telegram.messenger.ls
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.qs.w0 && this.x != null && i10 == this.c) {
            a0.h hVar = (a0.h) objArr[0];
            for (int i11 = 0; i11 < hVar.m(); i11++) {
                TLRPC.WebPage webPage = (TLRPC.WebPage) hVar.n(i11);
                if (webPage != null && webPage.id == this.x.id) {
                    if (webPage instanceof TLRPC.TL_webPageEmpty) {
                        this.x = null;
                        d();
                        if (this.b != 0) {
                            this.b = 0;
                            oo0 oo0Var = this.H;
                            if (oo0Var != null) {
                                ((org.telegram.ui.fu) oo0Var).i(0);
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
    public final void e(CharSequence charSequence, boolean z9) {
        ArrayList arrayList;
        oo0 oo0Var;
        boolean z10;
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
            if (!z9) {
                if (arrayList != null) {
                    if (arrayList.size() == arrayList2.size()) {
                        for (int i7 = 0; i7 < arrayList.size(); i7++) {
                            if (TextUtils.equals((CharSequence) arrayList.get(i7), (CharSequence) arrayList2.get(i7))) {
                            }
                        }
                        z10 = true;
                    }
                    z10 = false;
                    break;
                }
                z10 = arrayList2.isEmpty();
                if (z10) {
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
                    oo0 oo0Var2 = this.H;
                    if (oo0Var2 != null) {
                        ((org.telegram.ui.fu) oo0Var2).i(0);
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
            boolean z11 = (i10 == 2 || i10 == 0) ? false : true;
            if (i10 != 2) {
                this.b = 2;
            }
            if (z11) {
                k();
            }
            TLRPC.WebPage webPage = (TLRPC.WebPage) this.w.get(str);
            fi.i1[] i1VarArr = this.a;
            if (webPage != null) {
                this.x = webPage;
                a(i1VarArr[0], webPage, str);
            } else {
                fi.i1 i1Var = i1VarArr[0];
                ((ImageView) i1Var.c).setImageResource(R.drawable.msg_link2);
                ((ImageView) i1Var.c).setVisibility(0);
                ((FrameLayout) i1Var.h).setVisibility(8);
                ((l9) i1Var.r).setVisibility(8);
                ((ImageView) i1Var.s).setVisibility(0);
                ((org.telegram.ui.ActionBar.k5) i1Var.d).l(org.telegram.messenger.id.M0(2131750472, null), false);
                ((org.telegram.ui.ActionBar.k5) i1Var.e).l(str == null ? "" : str, false);
                ((LinearLayout) i1Var.b).setClickable(false);
                d();
                if (str != null && !str.isEmpty()) {
                    TL_account.getWebPagePreview getwebpagepreview = new TL_account.getWebPagePreview();
                    getwebpagepreview.message = str;
                    int i11 = this.D + 1;
                    this.D = i11;
                    this.y = ConnectionsManager.getInstance(org.telegram.messenger.c.a(this.c).a).sendRequest(getwebpagepreview, new jg.v(this, i11, str, 7));
                }
            }
            fi.i1 i1Var2 = i1VarArr[0];
            String str3 = this.F;
            if (str3 != null) {
                ((org.telegram.ui.ActionBar.k5) i1Var2.f).l(str3, false);
            }
            int i12 = this.b;
            if (i10 == i12 || (oo0Var = this.H) == null) {
                return;
            }
            ((org.telegram.ui.fu) oo0Var).i(i12);
            return;
        }
        arrayList = null;
        ArrayList arrayList22 = this.s;
        if (!z9) {
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

    public final l9 f(int i7) {
        l9[] l9VarArr;
        if (this.b == 1 && (l9VarArr = (l9[]) this.a[0].n) != null && i7 >= 0 && i7 < l9VarArr.length && l9VarArr[i7].getVisibility() == 0) {
            return l9VarArr[i7];
        }
        return null;
    }

    public final void g(int i7) {
        h(i7);
        this.d = org.telegram.messenger.p10.i(org.telegram.messenger.c.a(i7).a).e();
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
        int i11 = org.telegram.messenger.qs.w0;
        if (i10 == i7) {
            this.c = i7;
            if (isAttachedToWindow()) {
                org.telegram.messenger.qs.f(this.c).c(this, i11);
                return;
            }
            return;
        }
        if (isAttachedToWindow()) {
            org.telegram.messenger.qs.f(this.c).n(this, i11);
        }
        this.c = i7;
        if (isAttachedToWindow()) {
            org.telegram.messenger.qs.f(this.c).c(this, i11);
        }
    }

    public final void i(int i7, ArrayList arrayList) {
        oo0 oo0Var;
        h(i7);
        this.d = org.telegram.messenger.p10.i(org.telegram.messenger.c.a(i7).a).e();
        this.e = arrayList;
        this.h = false;
        this.x = null;
        d();
        this.s.clear();
        int i10 = this.b;
        boolean z9 = (i10 == 1 || i10 == 0) ? false : true;
        this.b = 1;
        if (z9) {
            k();
        }
        fi.i1[] i1VarArr = this.a;
        fi.i1 i1Var = i1VarArr[0];
        ImageView imageView = (ImageView) i1Var.c;
        org.telegram.ui.ActionBar.k5 k5Var = (org.telegram.ui.ActionBar.k5) i1Var.e;
        l9[] l9VarArr = (l9[]) i1Var.n;
        org.telegram.ui.ActionBar.k5 k5Var2 = (org.telegram.ui.ActionBar.k5) i1Var.d;
        imageView.setImageResource(R.drawable.filled_forward);
        ((ImageView) i1Var.c).setVisibility(0);
        ((l9) i1Var.r).setVisibility(8);
        ((FrameLayout) i1Var.h).setVisibility(0);
        ((ImageView) i1Var.s).setVisibility(8);
        ((LinearLayout) i1Var.b).setClickable(true);
        ArrayList arrayList2 = this.e;
        if (arrayList2 == null || arrayList2.isEmpty()) {
            k5Var2.l("", false);
            k5Var.l("", false);
            for (l9 l9Var : l9VarArr) {
                l9Var.setVisibility(8);
            }
        } else {
            int size = arrayList2.size();
            int i11 = 0;
            int i12 = 0;
            int i13 = 0;
            while (i13 < size) {
                Object obj = arrayList2.get(i13);
                i13++;
                if (((org.telegram.messenger.gf) obj).b) {
                    i11++;
                } else {
                    i12++;
                }
            }
            int size2 = arrayList2.size();
            if (size2 == 1) {
                k5Var2.l(org.telegram.messenger.id.M0(((org.telegram.messenger.gf) arrayList2.get(0)).b ? 2131745436 : 2131745447, null), false);
            } else if (i11 == 0) {
                k5Var2.l(org.telegram.messenger.id.G(size2, "ShareSendPhotos", new Object[0]), false);
            } else if (i12 == 0) {
                k5Var2.l(org.telegram.messenger.id.G(size2, "ShareSendVideos", new Object[0]), false);
            } else {
                k5Var2.l(org.telegram.messenger.id.G(size2, "ShareSendItems", new Object[0]), false);
            }
            k5Var.l(c(i1Var), false);
            b(l9VarArr[0], arrayList2.size() > 0 ? (org.telegram.messenger.gf) arrayList2.get(0) : null);
            b(l9VarArr[1], arrayList2.size() > 1 ? (org.telegram.messenger.gf) arrayList2.get(1) : null);
            b(l9VarArr[2], arrayList2.size() > 2 ? (org.telegram.messenger.gf) arrayList2.get(2) : null);
        }
        fi.i1 i1Var2 = i1VarArr[0];
        String str = this.F;
        if (str != null) {
            ((org.telegram.ui.ActionBar.k5) i1Var2.f).l(str, false);
        }
        int i14 = this.b;
        if (i10 == i14 || (oo0Var = this.H) == null) {
            return;
        }
        ((org.telegram.ui.fu) oo0Var).i(i14);
    }

    public final void j() {
        ob0 ob0Var = this.G;
        if (ob0Var != null) {
            org.telegram.messenger.g0.r(ob0Var);
            this.G = null;
        }
        this.E = false;
        for (fi.i1 i1Var : this.a) {
            org.telegram.ui.ActionBar.k5 k5Var = (org.telegram.ui.ActionBar.k5) i1Var.e;
            k5Var.setAlpha(1.0f);
            k5Var.setScaleX(1.0f);
            k5Var.setScaleY(1.0f);
            ((org.telegram.ui.ActionBar.k5) i1Var.f).setAlpha(0.0f);
        }
    }

    public final void k() {
        fi.i1[] i1VarArr = this.a;
        fi.i1 i1Var = i1VarArr[0];
        fi.i1 i1Var2 = i1VarArr[1];
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
        fi.i1 i1Var3 = i1VarArr[1];
        i1Var3.getClass();
        i1Var3.animate().scaleX(0.8f).scaleY(0.8f).alpha(0.0f).translationY(-org.telegram.messenger.g0.L(20.0f)).setInterpolator(xqVar).setDuration(320L).withEndAction(new ob0(i1Var3, 27)).start();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        org.telegram.messenger.qs.f(this.c).c(this, org.telegram.messenger.qs.w0);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.messenger.qs.f(this.c).n(this, org.telegram.messenger.qs.w0);
        d();
    }

    public void setLayoutClickListener(View.OnClickListener onClickListener) {
        for (fi.i1 i1Var : this.a) {
            ((LinearLayout) i1Var.b).setOnClickListener(onClickListener);
        }
    }

    public void setOnModeChangeListener(oo0 oo0Var) {
        this.H = oo0Var;
    }
}
