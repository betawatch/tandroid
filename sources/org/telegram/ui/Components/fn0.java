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

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class fn0 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public int E;
    public final Activity F;
    public final org.telegram.ui.ActionBar.p2 G;
    public boolean H;
    public org.telegram.ui.y10 I;
    public final org.telegram.ui.r10 J;
    public String K;
    public String L;
    public ym0 M;
    public final zk0 N;
    public boolean O;
    public boolean P;
    public final jx0 a;
    public final bi.y1 b;
    public final en0 c;
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

    public fn0(int i10, org.telegram.ui.ActionBar.p2 p2Var) {
        super(p2Var.getParentActivity());
        en0 en0Var = new en0(this);
        this.c = en0Var;
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
        this.E = -1;
        this.J = new org.telegram.ui.r10(0, 0L);
        this.G = p2Var;
        this.F = p2Var.getParentActivity();
        this.d = i10;
        bi.y1 y1Var = new bi.y1(this, getContext(), 18);
        this.b = y1Var;
        new s4.y(new ai.k(this, 3)).d(y1Var);
        addView(y1Var);
        p2Var.getParentActivity();
        y1Var.setLayoutManager(new fg.a0(10));
        y1Var.setAdapter(en0Var);
        y1Var.setOnScrollListener(new al0(this, 1));
        s4.j jVar = new s4.j();
        jVar.C = false;
        jVar.m = false;
        y1Var.setItemAnimator(jVar);
        y1Var.setOnItemClickListener(new zm0(this, i10, 0));
        y1Var.setOnItemLongClickListener(new pv(this, 16));
        this.N = new zk0(y1Var, true);
        a10 a10Var = new a10(getContext(), null);
        addView(a10Var);
        a10Var.setUseHeaderOffset(true);
        a10Var.setViewType(3);
        a10Var.setVisibility(8);
        jx0 jx0Var = new jx0(getContext(), a10Var, 1, null);
        this.a = jx0Var;
        addView(jx0Var);
        y1Var.setEmptyView(jx0Var);
        FileLoader.getInstance(i10).getCurrentLoadingFiles(arrayList);
    }

    public final void a() {
        bi.y1 y1Var;
        MessageObject message;
        int i10 = this.d;
        if (UserConfig.getInstance(i10).isPremium() || (y1Var = this.b) == null) {
            return;
        }
        for (int i11 = 0; i11 < y1Var.getChildCount(); i11++) {
            try {
                View childAt = y1Var.getChildAt(i11);
                if ((childAt instanceof bn0) && (message = ((bn0) childAt).a.getMessage()) != null) {
                    if (FileLoader.getInstance(i10).checkLoadCaughtPremiumFloodWait(message.getFileName())) {
                        c(false);
                    } else if (FileLoader.getInstance(i10).checkLoadCaughtPremiumFloodWait(message.getFileName())) {
                        c(true);
                    } else {
                        continue;
                    }
                    return;
                }
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
    }

    public final void b(int i10, int i11, boolean z10) {
        setClipToPadding(false);
        this.P = z10;
        setPadding(0, i10, 0, i11);
        bi.y1 y1Var = this.b;
        if (z10) {
            y1Var.n1(0, i10, 0, i11);
        } else {
            y1Var.setPadding(0, i10, 0, i11);
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) y1Var.getLayoutParams();
        marginLayoutParams.topMargin = -i10;
        marginLayoutParams.bottomMargin = -i11;
        this.P = false;
    }

    public final void c(boolean z10) {
        org.telegram.ui.ActionBar.p2 p2Var = this.G;
        if (p2Var == null || !this.b.G) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        long j3 = currentTimeMillis - ConnectionsManager.lastPremiumFloodWaitShown;
        int i10 = this.d;
        if (j3 < MessagesController.getInstance(i10).uploadPremiumSpeedupNotifyPeriod * 1000) {
            return;
        }
        ConnectionsManager.lastPremiumFloodWaitShown = currentTimeMillis;
        if (UserConfig.getInstance(i10).isPremium() || MessagesController.getInstance(i10).premiumFeaturesBlocked()) {
            return;
        }
        SpannableString spannableString = new SpannableString(Double.toString(Math.round((z10 ? MessagesController.getInstance(i10).uploadPremiumSpeedupUpload : MessagesController.getInstance(i10).uploadPremiumSpeedupDownload) * 10.0f) / 10.0d).replaceAll("\\.0$", ""));
        spannableString.setSpan(new s51(AndroidUtilities.bold()), 0, spannableString.length(), 33);
        if (p2Var.hasStoryViewer()) {
            return;
        }
        pc M = wc.a0(p2Var).M(LocaleController.getString(z10 ? R.string.UploadSpeedLimited : R.string.DownloadSpeedLimited), AndroidUtilities.replaceCharSequence("%d", AndroidUtilities.premiumText(LocaleController.getString(z10 ? R.string.UploadSpeedLimitedMessage : R.string.DownloadSpeedLimitedMessage), new ai.j(27, this, z10)), spannableString), R.raw.speed_limit);
        M.j = 8000;
        M.k(false);
    }

    public final void d(boolean z10) {
        en0 en0Var = this.c;
        en0Var.q(0, en0Var.c.r);
        if (!TextUtils.isEmpty(this.K)) {
            int i10 = this.d;
            if (!DownloadController.getInstance(i10).downloadingFiles.isEmpty() || !DownloadController.getInstance(i10).recentDownloadingFiles.isEmpty()) {
                this.a.setStickerType(1);
                ArrayList<MessageObject> arrayList = new ArrayList<>();
                ArrayList<MessageObject> arrayList2 = new ArrayList<>();
                FileLoader.getInstance(this.d).getCurrentLoadingFiles(arrayList);
                FileLoader.getInstance(this.d).getRecentLoadingFiles(arrayList2);
                String lowerCase = this.K.toLowerCase();
                boolean equals = lowerCase.equals(this.L);
                this.L = lowerCase;
                Utilities.searchQueue.cancelRunnable(this.M);
                DispatchQueue dispatchQueue = Utilities.searchQueue;
                ym0 ym0Var = new ym0(this, arrayList, lowerCase, arrayList2);
                this.M = ym0Var;
                dispatchQueue.postRunnable(ym0Var, equals ? 0L : 300L);
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
            this.N.b(0);
        }
        if (this.O) {
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
        this.L = null;
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
        s4.c1 T;
        en0 en0Var = this.c;
        if (!z10) {
            f(arrayList, arrayList2);
            en0Var.l();
            return;
        }
        int i10 = this.s;
        int i11 = this.v;
        int i12 = this.w;
        int i13 = this.x;
        int i14 = this.y;
        int i15 = this.E;
        int i16 = this.r;
        ArrayList arrayList3 = new ArrayList(this.e);
        ArrayList arrayList4 = new ArrayList(this.f);
        f(arrayList, arrayList2);
        s4.o.c(new an0(this, i16, i10, i13, i11, i12, arrayList3, i14, i15, arrayList4), true).b(en0Var);
        int i17 = 0;
        while (true) {
            bi.y1 y1Var = this.b;
            if (i17 >= y1Var.getChildCount()) {
                return;
            }
            View childAt = y1Var.getChildAt(i17);
            int R = RecyclerView.R(childAt);
            if (R >= 0 && (T = y1Var.T(childAt)) != null && !T.r()) {
                if (childAt instanceof org.telegram.ui.Cells.u3) {
                    en0Var.v(T, R);
                } else if (childAt instanceof bn0) {
                    org.telegram.ui.Cells.l7 l7Var = ((bn0) childAt).a;
                    l7Var.f(true);
                    int id2 = l7Var.getMessage().getId();
                    long dialogId = l7Var.getMessage().getDialogId();
                    org.telegram.ui.r10 r10Var = this.J;
                    r10Var.a = dialogId;
                    r10Var.b = id2;
                    l7Var.b(this.I.b(r10Var), true);
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
        this.E = -1;
        this.H = false;
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
                    this.H = true;
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
        this.E = size4;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getInstance(this.d).addObserver(this, NotificationCenter.onDownloadingFilesChanged);
        NotificationCenter.getInstance(this.d).addObserver(this, NotificationCenter.premiumFloodWaitReceived);
        if (getVisibility() == 0) {
            DownloadController.getInstance(this.d).clearUnviewedDownloads();
        }
        if (!this.O) {
            this.O = true;
            Utilities.searchQueue.postRunnable(new kc0(this, 20));
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
        if (this.P) {
            return;
        }
        super.requestLayout();
    }

    public void setUiCallback(org.telegram.ui.y10 y10Var) {
        this.I = y10Var;
    }
}
