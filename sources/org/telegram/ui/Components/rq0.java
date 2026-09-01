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

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class rq0 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public static final /* synthetic */ int F = 0;
    public boolean B;
    public String C;
    public ec0 D;
    public qq0 E;
    public final pq0[] a;
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

    public rq0(Activity activity, org.telegram.ui.ActionBar.g6 g6Var) {
        super(activity);
        this.a = new pq0[2];
        this.b = 0;
        this.f = new ArrayList();
        this.n = true;
        this.s = new ArrayList();
        this.v = new HashMap();
        int i10 = 0;
        while (true) {
            pq0[] pq0VarArr = this.a;
            if (i10 >= pq0VarArr.length) {
                pq0VarArr[0].setVisibility(0);
                this.a[1].setVisibility(8);
                return;
            } else {
                pq0VarArr[i10] = new pq0(this, activity, g6Var);
                addView(this.a[i10], k7.c6.c(-1.0f, -1));
                i10++;
            }
        }
    }

    public static void a(pq0 pq0Var, TLRPC.WebPage webPage, String str) {
        ImageView imageView = pq0Var.b;
        p9 p9Var = pq0Var.n;
        imageView.setImageResource(R.drawable.msg_link2);
        pq0Var.b.setVisibility(0);
        pq0Var.f.setVisibility(8);
        pq0Var.r.setVisibility(0);
        String str2 = webPage.site_name;
        if (str2 == null) {
            str2 = webPage.title;
        }
        if (str2 == null) {
            str2 = str;
        }
        pq0Var.c.l(str2, false);
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
        pq0Var.d.l(str3, false);
        TLRPC.Photo photo = webPage.photo;
        if (photo != null) {
            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, 320);
            TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(webPage.photo.sizes, AndroidUtilities.dp(40.0f));
            if (closestPhotoSizeWithSize != null) {
                p9Var.setRoundRadius(AndroidUtilities.dp(4.0f));
                p9Var.k(ImageLocation.getForObject(closestPhotoSizeWithSize, webPage.photo), "50_50", ImageLocation.getForObject(closestPhotoSizeWithSize2, webPage.photo), "50_50_b", 0L, null, webPage, 1);
                p9Var.setVisibility(0);
            } else {
                p9Var.setVisibility(8);
            }
        } else {
            p9Var.setVisibility(8);
        }
        pq0Var.a.setClickable(false);
    }

    public static void b(p9 p9Var, MediaController.PhotoEntry photoEntry) {
        if (photoEntry == null) {
            p9Var.setVisibility(8);
            return;
        }
        p9Var.setVisibility(0);
        p9Var.q(0, true);
        String str = photoEntry.thumbPath;
        if (str != null) {
            p9Var.f(str, null, null);
            return;
        }
        if (photoEntry.path == null) {
            p9Var.setImageDrawable(null);
            return;
        }
        if (photoEntry.isVideo) {
            p9Var.f("vthumb://" + photoEntry.imageId + ":" + photoEntry.path, null, null);
            return;
        }
        p9Var.p(photoEntry.orientation, photoEntry.invert, true);
        p9Var.f("thumb://" + photoEntry.imageId + ":" + photoEntry.path, null, null);
    }

    public final String c(pq0 pq0Var) {
        ArrayList arrayList = this.f;
        if (arrayList.isEmpty()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            long longValue = ((Long) obj).longValue();
            if (sb.length() > 0) {
                sb.append(", ");
            }
            if (longValue == this.d) {
                sb.append(LocaleController.getString(R.string.SavedMessages));
            } else {
                sb.append(arrayList.size() == 1 ? DialogObject.getName(this.c, longValue) : DialogObject.getShortName(this.c, longValue));
            }
        }
        String formatString = LocaleController.formatString(R.string.ShareSendToChats, sb.toString());
        org.telegram.ui.ActionBar.l5 l5Var = pq0Var.d;
        return (arrayList.size() > 2 || l5Var.getPaint().measureText(formatString) > ((float) (l5Var.getMeasuredWidth() <= 0 ? AndroidUtilities.displaySize.x - AndroidUtilities.dp(140.0f) : l5Var.getMeasuredWidth()))) ? LocaleController.formatPluralString("ShareSendToMany", arrayList.size(), new Object[0]) : formatString;
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
            a0.h hVar = (a0.h) objArr[0];
            for (int i12 = 0; i12 < hVar.m(); i12++) {
                TLRPC.WebPage webPage = (TLRPC.WebPage) hVar.n(i12);
                if (webPage != null && webPage.id == this.w.id) {
                    if (webPage instanceof TLRPC.TL_webPageEmpty) {
                        this.w = null;
                        d();
                        if (this.b != 0) {
                            this.b = 0;
                            qq0 qq0Var = this.E;
                            if (qq0Var != null) {
                                ((org.telegram.ui.tv) qq0Var).g(0);
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
    public final void e(CharSequence charSequence, boolean z4) {
        ArrayList arrayList;
        qq0 qq0Var;
        boolean z10;
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
            if (!z4) {
                if (arrayList != null) {
                    if (arrayList.size() == arrayList2.size()) {
                        for (int i10 = 0; i10 < arrayList.size(); i10++) {
                            if (TextUtils.equals((CharSequence) arrayList.get(i10), (CharSequence) arrayList2.get(i10))) {
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
                this.w = null;
                if (this.b == 0) {
                    this.b = 0;
                    qq0 qq0Var2 = this.E;
                    if (qq0Var2 != null) {
                        ((org.telegram.ui.tv) qq0Var2).g(0);
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
            boolean z11 = (i11 == 2 || i11 == 0) ? false : true;
            if (i11 != 2) {
                this.b = 2;
            }
            if (z11) {
                k();
            }
            TLRPC.WebPage webPage = (TLRPC.WebPage) this.v.get(str);
            pq0[] pq0VarArr = this.a;
            if (webPage != null) {
                this.w = webPage;
                a(pq0VarArr[0], webPage, str);
            } else {
                pq0 pq0Var = pq0VarArr[0];
                pq0Var.b.setImageResource(R.drawable.msg_link2);
                pq0Var.b.setVisibility(0);
                pq0Var.f.setVisibility(8);
                pq0Var.n.setVisibility(8);
                pq0Var.r.setVisibility(0);
                pq0Var.c.l(LocaleController.getString(R.string.GettingLinkInfo), false);
                pq0Var.d.l(str == null ? "" : str, false);
                pq0Var.a.setClickable(false);
                d();
                if (str != null && !str.isEmpty()) {
                    TL_account.getWebPagePreview getwebpagepreview = new TL_account.getWebPagePreview();
                    getwebpagepreview.message = str;
                    int i12 = this.y + 1;
                    this.y = i12;
                    this.x = AccountInstance.getInstance(this.c).getConnectionsManager().sendRequest(getwebpagepreview, new hg.l0(this, i12, str, 7));
                }
            }
            pq0 pq0Var2 = pq0VarArr[0];
            String str3 = this.C;
            if (str3 != null) {
                pq0Var2.e.l(str3, false);
            }
            int i13 = this.b;
            if (i11 == i13 || (qq0Var = this.E) == null) {
                return;
            }
            ((org.telegram.ui.tv) qq0Var).g(i13);
            return;
        }
        arrayList = null;
        ArrayList arrayList22 = this.s;
        if (!z4) {
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

    public final p9 f(int i10) {
        p9[] p9VarArr;
        if (this.b == 1 && (p9VarArr = this.a[0].h) != null && i10 >= 0 && i10 < p9VarArr.length && p9VarArr[i10].getVisibility() == 0) {
            return p9VarArr[i10];
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
        qq0 qq0Var;
        h(i10);
        this.d = AccountInstance.getInstance(i10).getUserConfig().getClientUserId();
        this.e = arrayList;
        this.h = false;
        this.w = null;
        d();
        this.s.clear();
        int i11 = this.b;
        boolean z4 = (i11 == 1 || i11 == 0) ? false : true;
        this.b = 1;
        if (z4) {
            k();
        }
        pq0[] pq0VarArr = this.a;
        pq0 pq0Var = pq0VarArr[0];
        ImageView imageView = pq0Var.b;
        org.telegram.ui.ActionBar.l5 l5Var = pq0Var.d;
        p9[] p9VarArr = pq0Var.h;
        org.telegram.ui.ActionBar.l5 l5Var2 = pq0Var.c;
        imageView.setImageResource(R.drawable.filled_forward);
        pq0Var.b.setVisibility(0);
        pq0Var.n.setVisibility(8);
        pq0Var.f.setVisibility(0);
        pq0Var.r.setVisibility(8);
        pq0Var.a.setClickable(true);
        ArrayList arrayList2 = this.e;
        if (arrayList2 == null || arrayList2.isEmpty()) {
            l5Var2.l("", false);
            l5Var.l("", false);
            for (p9 p9Var : p9VarArr) {
                p9Var.setVisibility(8);
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
                l5Var2.l(LocaleController.getString(((MediaController.PhotoEntry) arrayList2.get(0)).isVideo ? R.string.ShareSendVideo : R.string.ShareSendPhoto), false);
            } else if (i12 == 0) {
                l5Var2.l(LocaleController.formatPluralString("ShareSendPhotos", size2, new Object[0]), false);
            } else if (i13 == 0) {
                l5Var2.l(LocaleController.formatPluralString("ShareSendVideos", size2, new Object[0]), false);
            } else {
                l5Var2.l(LocaleController.formatPluralString("ShareSendItems", size2, new Object[0]), false);
            }
            l5Var.l(c(pq0Var), false);
            b(p9VarArr[0], arrayList2.size() > 0 ? (MediaController.PhotoEntry) arrayList2.get(0) : null);
            b(p9VarArr[1], arrayList2.size() > 1 ? (MediaController.PhotoEntry) arrayList2.get(1) : null);
            b(p9VarArr[2], arrayList2.size() > 2 ? (MediaController.PhotoEntry) arrayList2.get(2) : null);
        }
        pq0 pq0Var2 = pq0VarArr[0];
        String str = this.C;
        if (str != null) {
            pq0Var2.e.l(str, false);
        }
        int i15 = this.b;
        if (i11 == i15 || (qq0Var = this.E) == null) {
            return;
        }
        ((org.telegram.ui.tv) qq0Var).g(i15);
    }

    public final void j() {
        ec0 ec0Var = this.D;
        if (ec0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(ec0Var);
            this.D = null;
        }
        this.B = false;
        for (pq0 pq0Var : this.a) {
            org.telegram.ui.ActionBar.l5 l5Var = pq0Var.d;
            l5Var.setAlpha(1.0f);
            l5Var.setScaleX(1.0f);
            l5Var.setScaleY(1.0f);
            pq0Var.e.setAlpha(0.0f);
        }
    }

    public final void k() {
        pq0[] pq0VarArr = this.a;
        pq0 pq0Var = pq0VarArr[0];
        pq0 pq0Var2 = pq0VarArr[1];
        pq0VarArr[0] = pq0Var2;
        pq0VarArr[1] = pq0Var;
        pq0Var2.getClass();
        pq0VarArr[0].setVisibility(0);
        pq0VarArr[0].setScaleX(0.8f);
        pq0VarArr[0].setScaleY(0.8f);
        pq0VarArr[0].setAlpha(0.0f);
        pq0VarArr[0].setTranslationY(AndroidUtilities.dp(20.0f));
        ViewPropertyAnimator translationY = pq0VarArr[0].animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f).translationY(0.0f);
        pr prVar = pr.h;
        org.telegram.ui.b.p(translationY, prVar, 320L);
        pq0 pq0Var3 = pq0VarArr[1];
        pq0Var3.getClass();
        pq0Var3.animate().scaleX(0.8f).scaleY(0.8f).alpha(0.0f).translationY(-AndroidUtilities.dp(20.0f)).setInterpolator(prVar).setDuration(320L).withEndAction(new oq0(pq0Var3, 0)).start();
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
        for (pq0 pq0Var : this.a) {
            pq0Var.a.setOnClickListener(onClickListener);
        }
    }

    public void setOnModeChangeListener(qq0 qq0Var) {
        this.E = qq0Var;
    }
}
