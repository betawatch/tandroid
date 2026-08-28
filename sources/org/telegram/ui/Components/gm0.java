package org.telegram.ui.Components;

import android.app.Activity;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.DownloadController;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class gm0 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public int A;
    public final Activity B;
    public final org.telegram.ui.ActionBar.o2 C;
    public boolean D;
    public org.telegram.ui.e10 E;
    public final org.telegram.ui.x00 F;
    public String G;
    public String H;
    public zl0 I;
    public final dk0 J;
    public boolean K;
    public boolean L;
    public final gw0 a;
    public final gh.f1 b;
    public final fm0 c;
    public final int d;
    public final ArrayList e;
    public final ArrayList f;
    public final ArrayList h;
    public final ArrayList n;
    public int r;
    public int s;
    public int v;
    public int w;
    public int x;
    public int y;

    public gm0(int i9, org.telegram.ui.ActionBar.o2 o2Var) {
        super(o2Var.getParentActivity());
        fm0 fm0Var = new fm0(this);
        this.c = fm0Var;
        ArrayList<MessageObject> arrayList = new ArrayList<>();
        this.e = arrayList;
        this.f = new ArrayList();
        this.h = new ArrayList();
        this.n = new ArrayList();
        this.s = -1;
        this.v = -1;
        this.w = -1;
        this.x = -1;
        this.y = -1;
        this.A = -1;
        this.F = new org.telegram.ui.x00(0, 0L);
        this.C = o2Var;
        this.B = o2Var.getParentActivity();
        this.d = i9;
        gh.f1 f1Var = new gh.f1(this, getContext(), 19);
        this.b = f1Var;
        new f2.h0(new jh.f(this, 3)).d(f1Var);
        addView(f1Var);
        o2Var.getParentActivity();
        f1Var.setLayoutManager(new of.y(9));
        f1Var.setAdapter(fm0Var);
        f1Var.setOnScrollListener(new kn(this, 10));
        f2.n nVar = new f2.n();
        nVar.C = false;
        nVar.m = false;
        f1Var.setItemAnimator(nVar);
        f1Var.setOnItemClickListener(new am0(this, i9, 0));
        f1Var.setOnItemLongClickListener(new wu(this, 16));
        this.J = new dk0(f1Var, true);
        e00 e00Var = new e00(getContext(), null);
        addView(e00Var);
        e00Var.setUseHeaderOffset(true);
        e00Var.setViewType(3);
        e00Var.setVisibility(8);
        gw0 gw0Var = new gw0(getContext(), e00Var, 1, null);
        this.a = gw0Var;
        addView(gw0Var);
        f1Var.setEmptyView(gw0Var);
        FileLoader.getInstance(i9).getCurrentLoadingFiles(arrayList);
    }

    public final void a() {
        gh.f1 f1Var;
        MessageObject message;
        int i9 = this.d;
        if (UserConfig.getInstance(i9).isPremium() || (f1Var = this.b) == null) {
            return;
        }
        for (int i10 = 0; i10 < f1Var.getChildCount(); i10++) {
            try {
                View childAt = f1Var.getChildAt(i10);
                if ((childAt instanceof cm0) && (message = ((cm0) childAt).a.getMessage()) != null) {
                    if (FileLoader.getInstance(i9).checkLoadCaughtPremiumFloodWait(message.getFileName())) {
                        c(false);
                    } else if (FileLoader.getInstance(i9).checkLoadCaughtPremiumFloodWait(message.getFileName())) {
                        c(true);
                    } else {
                        continue;
                    }
                    return;
                }
            } catch (Exception e10) {
                FileLog.e(e10);
            }
        }
    }

    public final void b(int i9, int i10, boolean z10) {
        setClipToPadding(false);
        this.L = z10;
        setPadding(0, i9, 0, i10);
        gh.f1 f1Var = this.b;
        if (z10) {
            f1Var.o1(0, i9, 0, i10);
        } else {
            f1Var.setPadding(0, i9, 0, i10);
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) f1Var.getLayoutParams();
        marginLayoutParams.topMargin = -i9;
        marginLayoutParams.bottomMargin = -i10;
        this.L = false;
    }

    public final void c(boolean z10) {
        org.telegram.ui.ActionBar.o2 o2Var = this.C;
        if (o2Var == null || !this.b.C) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        long j10 = currentTimeMillis - ConnectionsManager.lastPremiumFloodWaitShown;
        int i9 = this.d;
        if (j10 < MessagesController.getInstance(i9).uploadPremiumSpeedupNotifyPeriod * 1000) {
            return;
        }
        ConnectionsManager.lastPremiumFloodWaitShown = currentTimeMillis;
        if (UserConfig.getInstance(i9).isPremium() || MessagesController.getInstance(i9).premiumFeaturesBlocked()) {
            return;
        }
        SpannableString spannableString = new SpannableString(Double.toString(Math.round((z10 ? MessagesController.getInstance(i9).uploadPremiumSpeedupUpload : MessagesController.getInstance(i9).uploadPremiumSpeedupDownload) * 10.0f) / 10.0d).replaceAll("\\.0$", ""));
        spannableString.setSpan(new i41(AndroidUtilities.bold()), 0, spannableString.length(), 33);
        if (o2Var.hasStoryViewer()) {
            return;
        }
        gc M = oc.a0(o2Var).M(LocaleController.getString(z10 ? R.string.UploadSpeedLimited : R.string.DownloadSpeedLimited), AndroidUtilities.replaceCharSequence("%d", AndroidUtilities.premiumText(LocaleController.getString(z10 ? R.string.UploadSpeedLimitedMessage : R.string.DownloadSpeedLimitedMessage), new a50(2, this, z10)), spannableString), R.raw.speed_limit);
        M.j = 8000;
        M.k(false);
    }

    public final void d(boolean z10) {
        fm0 fm0Var = this.c;
        fm0Var.q(0, fm0Var.c.r);
        if (!TextUtils.isEmpty(this.G)) {
            int i9 = this.d;
            if (!DownloadController.getInstance(i9).downloadingFiles.isEmpty() || !DownloadController.getInstance(i9).recentDownloadingFiles.isEmpty()) {
                this.a.setStickerType(1);
                ArrayList<MessageObject> arrayList = new ArrayList<>();
                ArrayList<MessageObject> arrayList2 = new ArrayList<>();
                FileLoader.getInstance(this.d).getCurrentLoadingFiles(arrayList);
                FileLoader.getInstance(this.d).getRecentLoadingFiles(arrayList2);
                String lowerCase = this.G.toLowerCase();
                boolean equals = lowerCase.equals(this.H);
                this.H = lowerCase;
                Utilities.searchQueue.cancelRunnable(this.I);
                DispatchQueue dispatchQueue = Utilities.searchQueue;
                zl0 zl0Var = new zl0(this, arrayList, lowerCase, arrayList2);
                this.I = zl0Var;
                dispatchQueue.postRunnable(zl0Var, equals ? 0L : 300L);
                this.n.clear();
                this.h.clear();
                if (equals) {
                    return;
                }
                this.a.e(true, true);
                e(this.h, this.n, z10);
                return;
            }
        }
        if (this.r == 0) {
            this.J.b(0);
        }
        if (this.K) {
            this.h.clear();
            this.n.clear();
        }
        FileLoader.getInstance(this.d).getCurrentLoadingFiles(this.h);
        FileLoader.getInstance(this.d).getRecentLoadingFiles(this.n);
        for (int i10 = 0; i10 < this.e.size(); i10++) {
            ((MessageObject) this.e.get(i10)).setQuery(null);
        }
        for (int i11 = 0; i11 < this.f.size(); i11++) {
            ((MessageObject) this.f.get(i11)).setQuery(null);
        }
        this.H = null;
        e(this.h, this.n, z10);
        if (this.r == 0) {
            this.a.e(false, false);
            this.a.d.setText(LocaleController.getString(R.string.SearchEmptyViewDownloads));
            this.a.e.setVisibility(8);
        }
        this.a.setStickerType(9);
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        if (i9 == NotificationCenter.onDownloadingFilesChanged) {
            if (getVisibility() == 0) {
                DownloadController.getInstance(this.d).clearUnviewedDownloads();
            }
            d(true);
        } else if (i9 == NotificationCenter.premiumFloodWaitReceived) {
            a();
        }
    }

    public final void e(ArrayList arrayList, ArrayList arrayList2, boolean z10) {
        f2.q1 T;
        fm0 fm0Var = this.c;
        if (!z10) {
            f(arrayList, arrayList2);
            fm0Var.l();
            return;
        }
        int i9 = this.s;
        int i10 = this.v;
        int i11 = this.w;
        int i12 = this.x;
        int i13 = this.y;
        int i14 = this.A;
        int i15 = this.r;
        ArrayList arrayList3 = new ArrayList(this.e);
        ArrayList arrayList4 = new ArrayList(this.f);
        f(arrayList, arrayList2);
        f2.s.c(new bm0(this, i15, i9, i12, i10, i11, arrayList3, i13, i14, arrayList4), true).b(fm0Var);
        int i16 = 0;
        while (true) {
            gh.f1 f1Var = this.b;
            if (i16 >= f1Var.getChildCount()) {
                return;
            }
            View childAt = f1Var.getChildAt(i16);
            int R = RecyclerView.R(childAt);
            if (R >= 0 && (T = f1Var.T(childAt)) != null && !T.r()) {
                if (childAt instanceof org.telegram.ui.Cells.v3) {
                    fm0Var.v(T, R);
                } else if (childAt instanceof cm0) {
                    org.telegram.ui.Cells.i7 i7Var = ((cm0) childAt).a;
                    i7Var.f(true);
                    int id2 = i7Var.getMessage().getId();
                    long dialogId = i7Var.getMessage().getDialogId();
                    org.telegram.ui.x00 x00Var = this.F;
                    x00Var.a = dialogId;
                    x00Var.b = id2;
                    i7Var.b(this.E.b(x00Var), true);
                }
            }
            i16++;
        }
    }

    public final void f(ArrayList arrayList, ArrayList arrayList2) {
        ArrayList arrayList3 = this.e;
        arrayList3.clear();
        int size = arrayList.size();
        int i9 = 0;
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            MessageObject messageObject = (MessageObject) obj;
            if (!messageObject.isRoundVideo() && !messageObject.isVoice()) {
                arrayList3.add(messageObject);
            }
        }
        ArrayList arrayList4 = this.f;
        arrayList4.clear();
        int size2 = arrayList2.size();
        int i11 = 0;
        while (i11 < size2) {
            Object obj2 = arrayList2.get(i11);
            i11++;
            MessageObject messageObject2 = (MessageObject) obj2;
            if (!messageObject2.isRoundVideo() && !messageObject2.isVoice()) {
                arrayList4.add(messageObject2);
            }
        }
        this.r = 0;
        this.s = -1;
        this.v = -1;
        this.w = -1;
        this.x = -1;
        this.y = -1;
        this.A = -1;
        this.D = false;
        if (!arrayList3.isEmpty()) {
            int i12 = this.r;
            int i13 = i12 + 1;
            this.r = i13;
            this.s = i12;
            this.v = i13;
            int size3 = arrayList3.size() + i13;
            this.r = size3;
            this.w = size3;
            while (true) {
                if (i9 >= arrayList3.size()) {
                    break;
                }
                if (FileLoader.getInstance(this.d).isLoadingFile(((MessageObject) arrayList3.get(i9)).getFileName())) {
                    this.D = true;
                    break;
                }
                i9++;
            }
        }
        if (arrayList4.isEmpty()) {
            return;
        }
        int i14 = this.r;
        int i15 = i14 + 1;
        this.r = i15;
        this.x = i14;
        this.y = i15;
        int size4 = arrayList4.size() + i15;
        this.r = size4;
        this.A = size4;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getInstance(this.d).addObserver(this, NotificationCenter.onDownloadingFilesChanged);
        NotificationCenter.getInstance(this.d).addObserver(this, NotificationCenter.premiumFloodWaitReceived);
        if (getVisibility() == 0) {
            DownloadController.getInstance(this.d).clearUnviewedDownloads();
        }
        if (!this.K) {
            this.K = true;
            Utilities.searchQueue.postRunnable(new ib0(this, 20));
        }
        d(false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i9 = this.d;
        NotificationCenter.getInstance(i9).removeObserver(this, NotificationCenter.onDownloadingFilesChanged);
        NotificationCenter.getInstance(i9).removeObserver(this, NotificationCenter.premiumFloodWaitReceived);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.L) {
            return;
        }
        super.requestLayout();
    }

    public void setUiCallback(org.telegram.ui.e10 e10Var) {
        this.E = e10Var;
    }
}
