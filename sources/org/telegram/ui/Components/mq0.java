package org.telegram.ui.Components;

import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.Matcher;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class mq0 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public static final /* synthetic */ int I = 0;
    public boolean E;
    public String F;
    public cc0 G;
    public lq0 H;
    public final kq0[] a;
    public int b;
    public int c;
    public long d;
    public ArrayList e;
    public final ArrayList f;
    public boolean h;
    public boolean n;
    public String r;
    public final ArrayList s;
    public final HashMap v;
    public TLRPC.WebPage w;
    public int x;
    public int y;

    public mq0(Activity activity, org.telegram.ui.ActionBar.f6 f6Var) {
        super(activity);
        this.a = new kq0[2];
        this.b = 0;
        this.f = new ArrayList();
        this.n = true;
        this.s = new ArrayList();
        this.v = new HashMap();
        int i10 = 0;
        while (true) {
            kq0[] kq0VarArr = this.a;
            if (i10 >= kq0VarArr.length) {
                kq0VarArr[0].setVisibility(0);
                this.a[1].setVisibility(8);
                return;
            } else {
                kq0VarArr[i10] = new kq0(this, activity, f6Var);
                addView(this.a[i10], w7.x5.c(-1.0f, -1));
                i10++;
            }
        }
    }

    public static void a(kq0 kq0Var, TLRPC.WebPage webPage, String str) {
        ImageView imageView = kq0Var.b;
        x9 x9Var = kq0Var.n;
        imageView.setImageResource(R.drawable.msg_link2);
        kq0Var.b.setVisibility(0);
        kq0Var.f.setVisibility(8);
        kq0Var.r.setVisibility(0);
        String str2 = webPage.site_name;
        if (str2 == null) {
            str2 = webPage.title;
        }
        if (str2 == null) {
            str2 = str;
        }
        kq0Var.c.l(str2, false);
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
        kq0Var.d.l(str3, false);
        TLRPC.Photo photo = webPage.photo;
        if (photo != null) {
            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, 320);
            TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(webPage.photo.sizes, AndroidUtilities.dp(40.0f));
            if (closestPhotoSizeWithSize != null) {
                x9Var.setRoundRadius(AndroidUtilities.dp(4.0f));
                x9Var.k(ImageLocation.getForObject(closestPhotoSizeWithSize, webPage.photo), "50_50", ImageLocation.getForObject(closestPhotoSizeWithSize2, webPage.photo), "50_50_b", 0L, null, webPage, 1);
                x9Var.setVisibility(0);
            } else {
                x9Var.setVisibility(8);
            }
        } else {
            x9Var.setVisibility(8);
        }
        kq0Var.a.setClickable(false);
    }

    public static void b(x9 x9Var, MediaController.PhotoEntry photoEntry) {
        if (photoEntry == null) {
            x9Var.setVisibility(8);
            return;
        }
        x9Var.setVisibility(0);
        x9Var.q(0, true);
        String str = photoEntry.thumbPath;
        if (str != null) {
            x9Var.f(str, null, null);
            return;
        }
        if (photoEntry.path == null) {
            x9Var.setImageDrawable(null);
            return;
        }
        if (photoEntry.isVideo) {
            x9Var.f("vthumb://" + photoEntry.imageId + ":" + photoEntry.path, null, null);
            return;
        }
        x9Var.p(photoEntry.orientation, photoEntry.invert, true);
        x9Var.f("thumb://" + photoEntry.imageId + ":" + photoEntry.path, null, null);
    }

    public final String c(kq0 kq0Var) {
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
                sb2.append(LocaleController.getString(R.string.SavedMessages));
            } else {
                sb2.append(arrayList.size() == 1 ? DialogObject.getName(this.c, longValue) : DialogObject.getShortName(this.c, longValue));
            }
        }
        String formatString = LocaleController.formatString(R.string.ShareSendToChats, sb2.toString());
        org.telegram.ui.ActionBar.j5 j5Var = kq0Var.d;
        return (arrayList.size() > 2 || j5Var.getPaint().measureText(formatString) > ((float) (j5Var.getMeasuredWidth() <= 0 ? AndroidUtilities.displaySize.x - AndroidUtilities.dp(140.0f) : j5Var.getMeasuredWidth()))) ? LocaleController.formatPluralString("ShareSendToMany", arrayList.size(), new Object[0]) : formatString;
    }

    public final void d() {
        if (this.x != 0) {
            AccountInstance.getInstance(this.c).getConnectionsManager().cancelRequest(this.x, true);
            this.x = 0;
        }
        this.y++;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.didReceivedWebpagesInUpdates && this.w != null && i11 == this.c) {
            a0.i iVar = (a0.i) objArr[0];
            for (int i12 = 0; i12 < iVar.m(); i12++) {
                TLRPC.WebPage webPage = (TLRPC.WebPage) iVar.n(i12);
                if (webPage != null && webPage.id == this.w.id) {
                    if (webPage instanceof TLRPC.TL_webPageEmpty) {
                        this.w = null;
                        d();
                        if (this.b != 0) {
                            this.b = 0;
                            lq0 lq0Var = this.H;
                            if (lq0Var != null) {
                                ((org.telegram.ui.xv) lq0Var).h(0);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    if (webPage instanceof TLRPC.TL_webPage) {
                        this.w = webPage;
                        ArrayList arrayList = this.s;
                        String str = arrayList.isEmpty() ? "" : TextUtils.join(" ", arrayList).toString();
                        HashMap hashMap = this.v;
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

    /* JADX WARN: Removed duplicated region for block: B:28:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:98:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(CharSequence charSequence, boolean z10) {
        ArrayList arrayList;
        lq0 lq0Var;
        boolean z11;
        if (charSequence != null && charSequence.length() != 0) {
            try {
                Matcher matcher = AndroidUtilities.WEB_URL.matcher(charSequence);
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
                this.w = null;
                if (this.b == 0) {
                    this.b = 0;
                    lq0 lq0Var2 = this.H;
                    if (lq0Var2 != null) {
                        ((org.telegram.ui.xv) lq0Var2).h(0);
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
            TLRPC.WebPage webPage = (TLRPC.WebPage) this.v.get(str);
            kq0[] kq0VarArr = this.a;
            if (webPage != null) {
                this.w = webPage;
                a(kq0VarArr[0], webPage, str);
            } else {
                kq0 kq0Var = kq0VarArr[0];
                kq0Var.b.setImageResource(R.drawable.msg_link2);
                kq0Var.b.setVisibility(0);
                kq0Var.f.setVisibility(8);
                kq0Var.n.setVisibility(8);
                kq0Var.r.setVisibility(0);
                kq0Var.c.l(LocaleController.getString(R.string.GettingLinkInfo), false);
                kq0Var.d.l(str == null ? "" : str, false);
                kq0Var.a.setClickable(false);
                d();
                if (str != null && !str.isEmpty()) {
                    TL_account.getWebPagePreview getwebpagepreview = new TL_account.getWebPagePreview();
                    getwebpagepreview.message = str;
                    int i12 = this.y + 1;
                    this.y = i12;
                    this.x = AccountInstance.getInstance(this.c).getConnectionsManager().sendRequest(getwebpagepreview, new hg.u(this, i12, str, 7));
                }
            }
            kq0 kq0Var2 = kq0VarArr[0];
            String str3 = this.F;
            if (str3 != null) {
                kq0Var2.e.l(str3, false);
            }
            int i13 = this.b;
            if (i11 == i13 || (lq0Var = this.H) == null) {
                return;
            }
            ((org.telegram.ui.xv) lq0Var).h(i13);
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
        this.w = null;
        if (this.b == 0) {
        }
    }

    public final x9 f(int i10) {
        x9[] x9VarArr;
        if (this.b == 1 && (x9VarArr = this.a[0].h) != null && i10 >= 0 && i10 < x9VarArr.length && x9VarArr[i10].getVisibility() == 0) {
            return x9VarArr[i10];
        }
        return null;
    }

    public final void g(int i10) {
        h(i10);
        this.d = AccountInstance.getInstance(i10).getUserConfig().getClientUserId();
        this.e = null;
        this.h = true;
        this.n = true;
        this.r = null;
        this.w = null;
        d();
        this.s.clear();
    }

    public TLRPC.WebPage getLoadedWebPage() {
        return this.w;
    }

    public int getMode() {
        return this.b;
    }

    public final void h(int i10) {
        if (this.c == i10) {
            this.c = i10;
            if (isAttachedToWindow()) {
                NotificationCenter.getInstance(this.c).addObserver(this, NotificationCenter.didReceivedWebpagesInUpdates);
                return;
            }
            return;
        }
        if (isAttachedToWindow()) {
            NotificationCenter.getInstance(this.c).removeObserver(this, NotificationCenter.didReceivedWebpagesInUpdates);
        }
        this.c = i10;
        if (isAttachedToWindow()) {
            NotificationCenter.getInstance(this.c).addObserver(this, NotificationCenter.didReceivedWebpagesInUpdates);
        }
    }

    public final void i(int i10, ArrayList arrayList) {
        lq0 lq0Var;
        h(i10);
        this.d = AccountInstance.getInstance(i10).getUserConfig().getClientUserId();
        this.e = arrayList;
        this.h = false;
        this.w = null;
        d();
        this.s.clear();
        int i11 = this.b;
        boolean z10 = (i11 == 1 || i11 == 0) ? false : true;
        this.b = 1;
        if (z10) {
            k();
        }
        kq0[] kq0VarArr = this.a;
        kq0 kq0Var = kq0VarArr[0];
        ImageView imageView = kq0Var.b;
        org.telegram.ui.ActionBar.j5 j5Var = kq0Var.d;
        x9[] x9VarArr = kq0Var.h;
        org.telegram.ui.ActionBar.j5 j5Var2 = kq0Var.c;
        imageView.setImageResource(R.drawable.filled_forward);
        kq0Var.b.setVisibility(0);
        kq0Var.n.setVisibility(8);
        kq0Var.f.setVisibility(0);
        kq0Var.r.setVisibility(8);
        kq0Var.a.setClickable(true);
        ArrayList arrayList2 = this.e;
        if (arrayList2 == null || arrayList2.isEmpty()) {
            j5Var2.l("", false);
            j5Var.l("", false);
            for (x9 x9Var : x9VarArr) {
                x9Var.setVisibility(8);
            }
        } else {
            int size = arrayList2.size();
            int i12 = 0;
            int i13 = 0;
            int i14 = 0;
            while (i14 < size) {
                Object obj = arrayList2.get(i14);
                i14++;
                if (((MediaController.PhotoEntry) obj).isVideo) {
                    i12++;
                } else {
                    i13++;
                }
            }
            int size2 = arrayList2.size();
            if (size2 == 1) {
                j5Var2.l(LocaleController.getString(((MediaController.PhotoEntry) arrayList2.get(0)).isVideo ? R.string.ShareSendVideo : R.string.ShareSendPhoto), false);
            } else if (i12 == 0) {
                j5Var2.l(LocaleController.formatPluralString("ShareSendPhotos", size2, new Object[0]), false);
            } else if (i13 == 0) {
                j5Var2.l(LocaleController.formatPluralString("ShareSendVideos", size2, new Object[0]), false);
            } else {
                j5Var2.l(LocaleController.formatPluralString("ShareSendItems", size2, new Object[0]), false);
            }
            j5Var.l(c(kq0Var), false);
            b(x9VarArr[0], arrayList2.size() > 0 ? (MediaController.PhotoEntry) arrayList2.get(0) : null);
            b(x9VarArr[1], arrayList2.size() > 1 ? (MediaController.PhotoEntry) arrayList2.get(1) : null);
            b(x9VarArr[2], arrayList2.size() > 2 ? (MediaController.PhotoEntry) arrayList2.get(2) : null);
        }
        kq0 kq0Var2 = kq0VarArr[0];
        String str = this.F;
        if (str != null) {
            kq0Var2.e.l(str, false);
        }
        int i15 = this.b;
        if (i11 == i15 || (lq0Var = this.H) == null) {
            return;
        }
        ((org.telegram.ui.xv) lq0Var).h(i15);
    }

    public final void j() {
        cc0 cc0Var = this.G;
        if (cc0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(cc0Var);
            this.G = null;
        }
        this.E = false;
        for (kq0 kq0Var : this.a) {
            org.telegram.ui.ActionBar.j5 j5Var = kq0Var.d;
            j5Var.setAlpha(1.0f);
            j5Var.setScaleX(1.0f);
            j5Var.setScaleY(1.0f);
            kq0Var.e.setAlpha(0.0f);
        }
    }

    public final void k() {
        kq0[] kq0VarArr = this.a;
        kq0 kq0Var = kq0VarArr[0];
        kq0 kq0Var2 = kq0VarArr[1];
        kq0VarArr[0] = kq0Var2;
        kq0VarArr[1] = kq0Var;
        kq0Var2.getClass();
        kq0VarArr[0].setVisibility(0);
        kq0VarArr[0].setScaleX(0.8f);
        kq0VarArr[0].setScaleY(0.8f);
        kq0VarArr[0].setAlpha(0.0f);
        kq0VarArr[0].setTranslationY(AndroidUtilities.dp(20.0f));
        ViewPropertyAnimator translationY = kq0VarArr[0].animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f).translationY(0.0f);
        pr prVar = pr.h;
        org.telegram.messenger.wl.q(translationY, prVar, 320L);
        kq0 kq0Var3 = kq0VarArr[1];
        kq0Var3.getClass();
        kq0Var3.animate().scaleX(0.8f).scaleY(0.8f).alpha(0.0f).translationY(-AndroidUtilities.dp(20.0f)).setInterpolator(prVar).setDuration(320L).withEndAction(new jq0(kq0Var3, 0)).start();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getInstance(this.c).addObserver(this, NotificationCenter.didReceivedWebpagesInUpdates);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.c).removeObserver(this, NotificationCenter.didReceivedWebpagesInUpdates);
        d();
    }

    public void setLayoutClickListener(View.OnClickListener onClickListener) {
        for (kq0 kq0Var : this.a) {
            kq0Var.a.setOnClickListener(onClickListener);
        }
    }

    public void setOnModeChangeListener(lq0 lq0Var) {
        this.H = lq0Var;
    }
}
