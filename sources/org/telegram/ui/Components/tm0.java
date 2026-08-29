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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class tm0 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public int A;
    public final Activity B;
    public final org.telegram.ui.ActionBar.o2 C;
    public boolean D;
    public org.telegram.ui.g10 E;
    public final org.telegram.ui.z00 F;
    public String G;
    public String H;
    public mm0 I;
    public final pk0 J;
    public boolean K;
    public boolean L;
    public final qw0 a;
    public final jh.e1 b;
    public final sm0 c;
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

    public tm0(int i10, org.telegram.ui.ActionBar.o2 o2Var) {
        super(o2Var.getParentActivity());
        sm0 sm0Var = new sm0(this);
        this.c = sm0Var;
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
        this.F = new org.telegram.ui.z00(0, 0L);
        this.C = o2Var;
        this.B = o2Var.getParentActivity();
        this.d = i10;
        jh.e1 e1Var = new jh.e1(this, getContext(), 18);
        this.b = e1Var;
        new f2.e0(new mh.f(this, 3)).d(e1Var);
        addView(e1Var);
        o2Var.getParentActivity();
        e1Var.setLayoutManager(new org.telegram.ui.k(8));
        e1Var.setAdapter(sm0Var);
        e1Var.setOnScrollListener(new h00(this, 6));
        f2.l lVar = new f2.l();
        lVar.C = false;
        lVar.m = false;
        e1Var.setItemAnimator(lVar);
        e1Var.setOnItemClickListener(new nm0(this, i10, 0));
        e1Var.setOnItemLongClickListener(new cv(this, 16));
        this.J = new pk0(e1Var, true);
        p00 p00Var = new p00(getContext(), null);
        addView(p00Var);
        p00Var.setUseHeaderOffset(true);
        p00Var.setViewType(3);
        p00Var.setVisibility(8);
        qw0 qw0Var = new qw0(getContext(), p00Var, 1, null);
        this.a = qw0Var;
        addView(qw0Var);
        e1Var.setEmptyView(qw0Var);
        FileLoader.getInstance(i10).getCurrentLoadingFiles(arrayList);
    }

    public final void a() {
        jh.e1 e1Var;
        MessageObject message;
        int i10 = this.d;
        if (UserConfig.getInstance(i10).isPremium() || (e1Var = this.b) == null) {
            return;
        }
        for (int i11 = 0; i11 < e1Var.getChildCount(); i11++) {
            try {
                View childAt = e1Var.getChildAt(i11);
                if ((childAt instanceof pm0) && (message = ((pm0) childAt).a.getMessage()) != null) {
                    if (FileLoader.getInstance(i10).checkLoadCaughtPremiumFloodWait(message.getFileName())) {
                        c(false);
                    } else if (FileLoader.getInstance(i10).checkLoadCaughtPremiumFloodWait(message.getFileName())) {
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

    public final void b(int i10, int i11, boolean z10) {
        setClipToPadding(false);
        this.L = z10;
        setPadding(0, i10, 0, i11);
        jh.e1 e1Var = this.b;
        if (z10) {
            e1Var.o1(0, i10, 0, i11);
        } else {
            e1Var.setPadding(0, i10, 0, i11);
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) e1Var.getLayoutParams();
        marginLayoutParams.topMargin = -i10;
        marginLayoutParams.bottomMargin = -i11;
        this.L = false;
    }

    public final void c(boolean z10) {
        org.telegram.ui.ActionBar.o2 o2Var = this.C;
        if (o2Var == null || !this.b.C) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        long j10 = currentTimeMillis - ConnectionsManager.lastPremiumFloodWaitShown;
        int i10 = this.d;
        if (j10 < MessagesController.getInstance(i10).uploadPremiumSpeedupNotifyPeriod * 1000) {
            return;
        }
        ConnectionsManager.lastPremiumFloodWaitShown = currentTimeMillis;
        if (UserConfig.getInstance(i10).isPremium() || MessagesController.getInstance(i10).premiumFeaturesBlocked()) {
            return;
        }
        SpannableString spannableString = new SpannableString(Double.toString(Math.round((z10 ? MessagesController.getInstance(i10).uploadPremiumSpeedupUpload : MessagesController.getInstance(i10).uploadPremiumSpeedupDownload) * 10.0f) / 10.0d).replaceAll("\\.0$", ""));
        spannableString.setSpan(new t41(AndroidUtilities.bold()), 0, spannableString.length(), 33);
        if (o2Var.hasStoryViewer()) {
            return;
        }
        mc M = tc.a0(o2Var).M(LocaleController.getString(z10 ? R.string.UploadSpeedLimited : R.string.DownloadSpeedLimited), AndroidUtilities.replaceCharSequence("%d", AndroidUtilities.premiumText(LocaleController.getString(z10 ? R.string.UploadSpeedLimitedMessage : R.string.DownloadSpeedLimitedMessage), new p90(1, this, z10)), spannableString), R.raw.speed_limit);
        M.j = 8000;
        M.k(false);
    }

    public final void d(boolean z10) {
        sm0 sm0Var = this.c;
        sm0Var.q(0, sm0Var.c.r);
        if (!TextUtils.isEmpty(this.G)) {
            int i10 = this.d;
            if (!DownloadController.getInstance(i10).downloadingFiles.isEmpty() || !DownloadController.getInstance(i10).recentDownloadingFiles.isEmpty()) {
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
                mm0 mm0Var = new mm0(this, arrayList, lowerCase, arrayList2);
                this.I = mm0Var;
                dispatchQueue.postRunnable(mm0Var, equals ? 0L : 300L);
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
        for (int i11 = 0; i11 < this.e.size(); i11++) {
            ((MessageObject) this.e.get(i11)).setQuery(null);
        }
        for (int i12 = 0; i12 < this.f.size(); i12++) {
            ((MessageObject) this.f.get(i12)).setQuery(null);
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
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.onDownloadingFilesChanged) {
            if (getVisibility() == 0) {
                DownloadController.getInstance(this.d).clearUnviewedDownloads();
            }
            d(true);
        } else if (i10 == NotificationCenter.premiumFloodWaitReceived) {
            a();
        }
    }

    public final void e(ArrayList arrayList, ArrayList arrayList2, boolean z10) {
        f2.n1 T;
        sm0 sm0Var = this.c;
        if (!z10) {
            f(arrayList, arrayList2);
            sm0Var.l();
            return;
        }
        int i10 = this.s;
        int i11 = this.v;
        int i12 = this.w;
        int i13 = this.x;
        int i14 = this.y;
        int i15 = this.A;
        int i16 = this.r;
        ArrayList arrayList3 = new ArrayList(this.e);
        ArrayList arrayList4 = new ArrayList(this.f);
        f(arrayList, arrayList2);
        f2.q.c(new om0(this, i16, i10, i13, i11, i12, arrayList3, i14, i15, arrayList4), true).b(sm0Var);
        int i17 = 0;
        while (true) {
            jh.e1 e1Var = this.b;
            if (i17 >= e1Var.getChildCount()) {
                return;
            }
            View childAt = e1Var.getChildAt(i17);
            int R = RecyclerView.R(childAt);
            if (R >= 0 && (T = e1Var.T(childAt)) != null && !T.r()) {
                if (childAt instanceof org.telegram.ui.Cells.s3) {
                    sm0Var.v(T, R);
                } else if (childAt instanceof pm0) {
                    org.telegram.ui.Cells.g7 g7Var = ((pm0) childAt).a;
                    g7Var.f(true);
                    int id2 = g7Var.getMessage().getId();
                    long dialogId = g7Var.getMessage().getDialogId();
                    org.telegram.ui.z00 z00Var = this.F;
                    z00Var.a = dialogId;
                    z00Var.b = id2;
                    g7Var.b(this.E.b(z00Var), true);
                }
            }
            i17++;
        }
    }

    public final void f(ArrayList arrayList, ArrayList arrayList2) {
        ArrayList arrayList3 = this.e;
        arrayList3.clear();
        int size = arrayList.size();
        int i10 = 0;
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            MessageObject messageObject = (MessageObject) obj;
            if (!messageObject.isRoundVideo() && !messageObject.isVoice()) {
                arrayList3.add(messageObject);
            }
        }
        ArrayList arrayList4 = this.f;
        arrayList4.clear();
        int size2 = arrayList2.size();
        int i12 = 0;
        while (i12 < size2) {
            Object obj2 = arrayList2.get(i12);
            i12++;
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
            int i13 = this.r;
            int i14 = i13 + 1;
            this.r = i14;
            this.s = i13;
            this.v = i14;
            int size3 = arrayList3.size() + i14;
            this.r = size3;
            this.w = size3;
            while (true) {
                if (i10 >= arrayList3.size()) {
                    break;
                }
                if (FileLoader.getInstance(this.d).isLoadingFile(((MessageObject) arrayList3.get(i10)).getFileName())) {
                    this.D = true;
                    break;
                }
                i10++;
            }
        }
        if (arrayList4.isEmpty()) {
            return;
        }
        int i15 = this.r;
        int i16 = i15 + 1;
        this.r = i16;
        this.x = i15;
        this.y = i16;
        int size4 = arrayList4.size() + i16;
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
            Utilities.searchQueue.postRunnable(new xb0(this, 20));
        }
        d(false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i10 = this.d;
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.onDownloadingFilesChanged);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.premiumFloodWaitReceived);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.L) {
            return;
        }
        super.requestLayout();
    }

    public void setUiCallback(org.telegram.ui.g10 g10Var) {
        this.E = g10Var;
    }
}
