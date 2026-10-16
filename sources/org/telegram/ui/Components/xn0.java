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

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class xn0 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public int E;
    public final Activity F;
    public final org.telegram.ui.ActionBar.m2 G;
    public boolean H;
    public org.telegram.ui.a20 I;
    public final org.telegram.ui.t10 J;
    public String K;
    public String L;
    public qn0 M;
    public final rl0 N;
    public boolean O;
    public boolean P;
    public final wx0 a;
    public final bi.o0 b;
    public final wn0 c;
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

    public xn0(int i10, org.telegram.ui.ActionBar.m2 m2Var) {
        super(m2Var.getParentActivity());
        wn0 wn0Var = new wn0(this);
        this.c = wn0Var;
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
        this.J = new org.telegram.ui.t10(0, 0L);
        this.G = m2Var;
        this.F = m2Var.getParentActivity();
        this.d = i10;
        bi.o0 o0Var = new bi.o0(this, getContext(), 19);
        this.b = o0Var;
        new s4.y(new ci.f(this, 3)).d(o0Var);
        addView(o0Var);
        m2Var.getParentActivity();
        o0Var.setLayoutManager(new hg.a0(10));
        o0Var.setAdapter(wn0Var);
        o0Var.setOnScrollListener(new kc0(this, 4));
        s4.k kVar = new s4.k();
        kVar.C = false;
        kVar.m = false;
        o0Var.setItemAnimator(kVar);
        o0Var.setOnItemClickListener(new rn0(this, i10, 0));
        o0Var.setOnItemLongClickListener(new xv(this, 17));
        this.N = new rl0(o0Var, true);
        f10 f10Var = new f10(getContext(), null);
        addView(f10Var);
        f10Var.setUseHeaderOffset(true);
        f10Var.setViewType(3);
        f10Var.setVisibility(8);
        wx0 wx0Var = new wx0(getContext(), f10Var, 1, null);
        this.a = wx0Var;
        addView(wx0Var);
        o0Var.setEmptyView(wx0Var);
        FileLoader.getInstance(i10).getCurrentLoadingFiles(arrayList);
    }

    public final void a() {
        bi.o0 o0Var;
        MessageObject message;
        int i10 = this.d;
        if (UserConfig.getInstance(i10).isPremium() || (o0Var = this.b) == null) {
            return;
        }
        for (int i11 = 0; i11 < o0Var.getChildCount(); i11++) {
            try {
                View childAt = o0Var.getChildAt(i11);
                if ((childAt instanceof tn0) && (message = ((tn0) childAt).a.getMessage()) != null) {
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
        bi.o0 o0Var = this.b;
        if (z10) {
            o0Var.o1(0, i10, 0, i11);
        } else {
            o0Var.setPadding(0, i10, 0, i11);
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) o0Var.getLayoutParams();
        marginLayoutParams.topMargin = -i10;
        marginLayoutParams.bottomMargin = -i11;
        this.P = false;
    }

    public final void c(boolean z10) {
        org.telegram.ui.ActionBar.m2 m2Var = this.G;
        if (m2Var == null || !this.b.G) {
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
        spannableString.setSpan(new j61(AndroidUtilities.bold()), 0, spannableString.length(), 33);
        if (m2Var.hasStoryViewer()) {
            return;
        }
        sc M = zc.a0(m2Var).M(LocaleController.getString(z10 ? R.string.UploadSpeedLimited : R.string.DownloadSpeedLimited), AndroidUtilities.replaceCharSequence("%d", AndroidUtilities.premiumText(LocaleController.getString(z10 ? R.string.UploadSpeedLimitedMessage : R.string.DownloadSpeedLimitedMessage), new ah.t(29, this, z10)), spannableString), R.raw.speed_limit);
        M.j = 8000;
        M.k(false);
    }

    public final void d(boolean z10) {
        wn0 wn0Var = this.c;
        wn0Var.q(0, wn0Var.c.r);
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
                qn0 qn0Var = new qn0(this, arrayList, lowerCase, arrayList2);
                this.M = qn0Var;
                dispatchQueue.postRunnable(qn0Var, equals ? 0L : 300L);
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
        s4.b1 T;
        wn0 wn0Var = this.c;
        if (!z10) {
            f(arrayList, arrayList2);
            wn0Var.l();
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
        s4.o.c(new sn0(this, i16, i10, i13, i11, i12, arrayList3, i14, i15, arrayList4), true).c(wn0Var);
        int i17 = 0;
        while (true) {
            bi.o0 o0Var = this.b;
            if (i17 >= o0Var.getChildCount()) {
                return;
            }
            View childAt = o0Var.getChildAt(i17);
            int R = RecyclerView.R(childAt);
            if (R >= 0 && (T = o0Var.T(childAt)) != null && !T.r()) {
                if (childAt instanceof org.telegram.ui.Cells.v3) {
                    wn0Var.v(T, R);
                } else if (childAt instanceof tn0) {
                    org.telegram.ui.Cells.j7 j7Var = ((tn0) childAt).a;
                    j7Var.f(true);
                    int id2 = j7Var.getMessage().getId();
                    long dialogId = j7Var.getMessage().getDialogId();
                    org.telegram.ui.t10 t10Var = this.J;
                    t10Var.a = dialogId;
                    t10Var.b = id2;
                    j7Var.b(this.I.b(t10Var), true);
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
            Utilities.searchQueue.postRunnable(new yc0(this, 21));
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

    public void setUiCallback(org.telegram.ui.a20 a20Var) {
        this.I = a20Var;
    }
}
