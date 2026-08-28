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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class wp0 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public static final /* synthetic */ int E = 0;
    public boolean A;
    public String B;
    public ib0 C;
    public vp0 D;
    public final up0[] a;
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

    public wp0(Activity activity, org.telegram.ui.ActionBar.b6 b6Var) {
        super(activity);
        this.a = new up0[2];
        this.b = 0;
        this.f = new ArrayList();
        this.n = true;
        this.s = new ArrayList();
        this.v = new HashMap();
        int i9 = 0;
        while (true) {
            up0[] up0VarArr = this.a;
            if (i9 >= up0VarArr.length) {
                up0VarArr[0].setVisibility(0);
                this.a[1].setVisibility(8);
                return;
            } else {
                up0VarArr[i9] = new up0(this, activity, b6Var);
                addView(this.a[i9], g7.e6.c(-1.0f, -1));
                i9++;
            }
        }
    }

    public static void a(up0 up0Var, TLRPC.WebPage webPage, String str) {
        ImageView imageView = up0Var.b;
        o9 o9Var = up0Var.n;
        imageView.setImageResource(R.drawable.msg_link2);
        up0Var.b.setVisibility(0);
        up0Var.f.setVisibility(8);
        up0Var.r.setVisibility(0);
        String str2 = webPage.site_name;
        if (str2 == null) {
            str2 = webPage.title;
        }
        if (str2 == null) {
            str2 = str;
        }
        up0Var.c.l(str2, false);
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
        up0Var.d.l(str3, false);
        TLRPC.Photo photo = webPage.photo;
        if (photo != null) {
            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, 320);
            TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(webPage.photo.sizes, AndroidUtilities.dp(40.0f));
            if (closestPhotoSizeWithSize != null) {
                o9Var.setRoundRadius(AndroidUtilities.dp(4.0f));
                o9Var.k(ImageLocation.getForObject(closestPhotoSizeWithSize, webPage.photo), "50_50", ImageLocation.getForObject(closestPhotoSizeWithSize2, webPage.photo), "50_50_b", 0L, null, webPage, 1);
                o9Var.setVisibility(0);
            } else {
                o9Var.setVisibility(8);
            }
        } else {
            o9Var.setVisibility(8);
        }
        up0Var.a.setClickable(false);
    }

    public static void b(o9 o9Var, MediaController.PhotoEntry photoEntry) {
        if (photoEntry == null) {
            o9Var.setVisibility(8);
            return;
        }
        o9Var.setVisibility(0);
        o9Var.q(0, true);
        String str = photoEntry.thumbPath;
        if (str != null) {
            o9Var.f(str, null, null);
            return;
        }
        if (photoEntry.path == null) {
            o9Var.setImageDrawable(null);
            return;
        }
        if (photoEntry.isVideo) {
            o9Var.f("vthumb://" + photoEntry.imageId + ":" + photoEntry.path, null, null);
            return;
        }
        o9Var.p(photoEntry.orientation, photoEntry.invert, true);
        o9Var.f("thumb://" + photoEntry.imageId + ":" + photoEntry.path, null, null);
    }

    public final String c(up0 up0Var) {
        ArrayList arrayList = this.f;
        if (arrayList.isEmpty()) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder();
        int size = arrayList.size();
        int i9 = 0;
        while (i9 < size) {
            Object obj = arrayList.get(i9);
            i9++;
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
        org.telegram.ui.ActionBar.h5 h5Var = up0Var.d;
        return (arrayList.size() > 2 || h5Var.getPaint().measureText(formatString) > ((float) (h5Var.getMeasuredWidth() <= 0 ? AndroidUtilities.displaySize.x - AndroidUtilities.dp(140.0f) : h5Var.getMeasuredWidth()))) ? LocaleController.formatPluralString("ShareSendToMany", arrayList.size(), new Object[0]) : formatString;
    }

    public final void d() {
        if (this.x != 0) {
            AccountInstance.getInstance(this.c).getConnectionsManager().cancelRequest(this.x, true);
            this.x = 0;
        }
        this.y++;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        if (i9 == NotificationCenter.didReceivedWebpagesInUpdates && this.w != null && i10 == this.c) {
            a0.h hVar = (a0.h) objArr[0];
            for (int i11 = 0; i11 < hVar.m(); i11++) {
                TLRPC.WebPage webPage = (TLRPC.WebPage) hVar.n(i11);
                if (webPage != null && webPage.id == this.w.id) {
                    if (webPage instanceof TLRPC.TL_webPageEmpty) {
                        this.w = null;
                        d();
                        if (this.b != 0) {
                            this.b = 0;
                            vp0 vp0Var = this.D;
                            if (vp0Var != null) {
                                ((org.telegram.ui.jv) vp0Var).h(0);
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
    /* JADX WARN: Removed duplicated region for block: B:93:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:98:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(CharSequence charSequence, boolean z10) {
        ArrayList arrayList;
        vp0 vp0Var;
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
                        for (int i9 = 0; i9 < arrayList.size(); i9++) {
                            if (TextUtils.equals((CharSequence) arrayList.get(i9), (CharSequence) arrayList2.get(i9))) {
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
                    vp0 vp0Var2 = this.D;
                    if (vp0Var2 != null) {
                        ((org.telegram.ui.jv) vp0Var2).h(0);
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
            TLRPC.WebPage webPage = (TLRPC.WebPage) this.v.get(str);
            up0[] up0VarArr = this.a;
            if (webPage != null) {
                this.w = webPage;
                a(up0VarArr[0], webPage, str);
            } else {
                up0 up0Var = up0VarArr[0];
                up0Var.b.setImageResource(R.drawable.msg_link2);
                up0Var.b.setVisibility(0);
                up0Var.f.setVisibility(8);
                up0Var.n.setVisibility(8);
                up0Var.r.setVisibility(0);
                up0Var.c.l(LocaleController.getString(R.string.GettingLinkInfo), false);
                up0Var.d.l(str == null ? "" : str, false);
                up0Var.a.setClickable(false);
                d();
                if (str != null && !str.isEmpty()) {
                    TL_account.getWebPagePreview getwebpagepreview = new TL_account.getWebPagePreview();
                    getwebpagepreview.message = str;
                    int i11 = this.y + 1;
                    this.y = i11;
                    this.x = AccountInstance.getInstance(this.c).getConnectionsManager().sendRequest(getwebpagepreview, new bg.q0(this, i11, str, 8));
                }
            }
            up0 up0Var2 = up0VarArr[0];
            String str3 = this.B;
            if (str3 != null) {
                up0Var2.e.l(str3, false);
            }
            int i12 = this.b;
            if (i10 == i12 || (vp0Var = this.D) == null) {
                return;
            }
            ((org.telegram.ui.jv) vp0Var).h(i12);
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

    public final o9 f(int i9) {
        o9[] o9VarArr;
        if (this.b == 1 && (o9VarArr = this.a[0].h) != null && i9 >= 0 && i9 < o9VarArr.length && o9VarArr[i9].getVisibility() == 0) {
            return o9VarArr[i9];
        }
        return null;
    }

    public final void g(int i9) {
        h(i9);
        this.d = AccountInstance.getInstance(i9).getUserConfig().getClientUserId();
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

    public final void h(int i9) {
        if (this.c == i9) {
            this.c = i9;
            if (isAttachedToWindow()) {
                NotificationCenter.getInstance(this.c).addObserver(this, NotificationCenter.didReceivedWebpagesInUpdates);
                return;
            }
            return;
        }
        if (isAttachedToWindow()) {
            NotificationCenter.getInstance(this.c).removeObserver(this, NotificationCenter.didReceivedWebpagesInUpdates);
        }
        this.c = i9;
        if (isAttachedToWindow()) {
            NotificationCenter.getInstance(this.c).addObserver(this, NotificationCenter.didReceivedWebpagesInUpdates);
        }
    }

    public final void i(int i9, ArrayList arrayList) {
        vp0 vp0Var;
        h(i9);
        this.d = AccountInstance.getInstance(i9).getUserConfig().getClientUserId();
        this.e = arrayList;
        this.h = false;
        this.w = null;
        d();
        this.s.clear();
        int i10 = this.b;
        boolean z10 = (i10 == 1 || i10 == 0) ? false : true;
        this.b = 1;
        if (z10) {
            k();
        }
        up0[] up0VarArr = this.a;
        up0 up0Var = up0VarArr[0];
        ImageView imageView = up0Var.b;
        org.telegram.ui.ActionBar.h5 h5Var = up0Var.d;
        o9[] o9VarArr = up0Var.h;
        org.telegram.ui.ActionBar.h5 h5Var2 = up0Var.c;
        imageView.setImageResource(R.drawable.filled_forward);
        up0Var.b.setVisibility(0);
        up0Var.n.setVisibility(8);
        up0Var.f.setVisibility(0);
        up0Var.r.setVisibility(8);
        up0Var.a.setClickable(true);
        ArrayList arrayList2 = this.e;
        if (arrayList2 == null || arrayList2.isEmpty()) {
            h5Var2.l("", false);
            h5Var.l("", false);
            for (o9 o9Var : o9VarArr) {
                o9Var.setVisibility(8);
            }
        } else {
            int size = arrayList2.size();
            int i11 = 0;
            int i12 = 0;
            int i13 = 0;
            while (i13 < size) {
                Object obj = arrayList2.get(i13);
                i13++;
                if (((MediaController.PhotoEntry) obj).isVideo) {
                    i11++;
                } else {
                    i12++;
                }
            }
            int size2 = arrayList2.size();
            if (size2 == 1) {
                h5Var2.l(LocaleController.getString(((MediaController.PhotoEntry) arrayList2.get(0)).isVideo ? R.string.ShareSendVideo : R.string.ShareSendPhoto), false);
            } else if (i11 == 0) {
                h5Var2.l(LocaleController.formatPluralString("ShareSendPhotos", size2, new Object[0]), false);
            } else if (i12 == 0) {
                h5Var2.l(LocaleController.formatPluralString("ShareSendVideos", size2, new Object[0]), false);
            } else {
                h5Var2.l(LocaleController.formatPluralString("ShareSendItems", size2, new Object[0]), false);
            }
            h5Var.l(c(up0Var), false);
            b(o9VarArr[0], arrayList2.size() > 0 ? (MediaController.PhotoEntry) arrayList2.get(0) : null);
            b(o9VarArr[1], arrayList2.size() > 1 ? (MediaController.PhotoEntry) arrayList2.get(1) : null);
            b(o9VarArr[2], arrayList2.size() > 2 ? (MediaController.PhotoEntry) arrayList2.get(2) : null);
        }
        up0 up0Var2 = up0VarArr[0];
        String str = this.B;
        if (str != null) {
            up0Var2.e.l(str, false);
        }
        int i14 = this.b;
        if (i10 == i14 || (vp0Var = this.D) == null) {
            return;
        }
        ((org.telegram.ui.jv) vp0Var).h(i14);
    }

    public final void j() {
        ib0 ib0Var = this.C;
        if (ib0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(ib0Var);
            this.C = null;
        }
        this.A = false;
        for (up0 up0Var : this.a) {
            org.telegram.ui.ActionBar.h5 h5Var = up0Var.d;
            h5Var.setAlpha(1.0f);
            h5Var.setScaleX(1.0f);
            h5Var.setScaleY(1.0f);
            up0Var.e.setAlpha(0.0f);
        }
    }

    public final void k() {
        up0[] up0VarArr = this.a;
        up0 up0Var = up0VarArr[0];
        up0 up0Var2 = up0VarArr[1];
        up0VarArr[0] = up0Var2;
        up0VarArr[1] = up0Var;
        up0Var2.getClass();
        up0VarArr[0].setVisibility(0);
        up0VarArr[0].setScaleX(0.8f);
        up0VarArr[0].setScaleY(0.8f);
        up0VarArr[0].setAlpha(0.0f);
        up0VarArr[0].setTranslationY(AndroidUtilities.dp(20.0f));
        ViewPropertyAnimator translationY = up0VarArr[0].animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f).translationY(0.0f);
        gr grVar = gr.h;
        org.telegram.messenger.ll.r(translationY, grVar, 320L);
        up0 up0Var3 = up0VarArr[1];
        up0Var3.getClass();
        up0Var3.animate().scaleX(0.8f).scaleY(0.8f).alpha(0.0f).translationY(-AndroidUtilities.dp(20.0f)).setInterpolator(grVar).setDuration(320L).withEndAction(new tp0(up0Var3, 0)).start();
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
        for (up0 up0Var : this.a) {
            up0Var.a.setOnClickListener(onClickListener);
        }
    }

    public void setOnModeChangeListener(vp0 vp0Var) {
        this.D = vp0Var;
    }
}
