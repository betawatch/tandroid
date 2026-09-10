package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PorterDuffColorFilter;
import android.os.SystemClock;
import android.text.SpannableString;
import android.util.LongSparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.TextView;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public class wv extends org.telegram.ui.ActionBar.h3 implements NotificationCenter.NotificationCenterDelegate {
    public static Pattern V;
    public final yk0 E;
    public final zp F;
    public org.telegram.ui.ActionBar.p1 G;
    public final boolean H;
    public boolean I;
    public float J;
    public int K;
    public int L;
    public final d6 M;
    public final fv N;
    public int O;
    public boolean P;
    public long Q;
    public ValueAnimator R;
    public boolean S;
    public PorterDuffColorFilter T;
    public int U;
    public LongSparseArray b;
    public final org.telegram.ui.ActionBar.p2 c;
    public final qn d;
    public final gv e;
    public final mv f;
    public final bi.z h;
    public kv n;
    public final View r;
    public final FrameLayout s;
    public final TextView v;
    public final TextView w;
    public final qg.s0 x;
    public final s4.s y;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public wv(org.telegram.ui.ActionBar.p2 p2Var, Context context, org.telegram.ui.ActionBar.f6 f6Var, ArrayList arrayList) {
        super(1, context, r4, false);
        org.telegram.ui.ActionBar.f6 resourceProvider = (p2Var == null || p2Var.getResourceProvider() == null) ? f6Var : p2Var.getResourceProvider();
        this.K = -1;
        this.L = -1;
        this.N = new fv(this);
        this.O = -1;
        this.P = false;
        this.S = true;
        this.c = p2Var;
        fixNavigationBar();
        if (arrayList != null) {
            this.H = arrayList.size() > 1;
        }
        this.e = new gv(this.currentAccount, arrayList, this);
        float dp = AndroidUtilities.dp(32.0f);
        float dp2 = AndroidUtilities.dp(3.5f);
        int i10 = org.telegram.ui.ActionBar.j6.Oh;
        this.F = new zp(dp, dp2, getThemedColor(i10));
        mv mvVar = new mv(this, context);
        this.f = mvVar;
        this.containerView = mvVar;
        this.d = new qn(context, 10);
        bi.z zVar = new bi.z(this, context, this.resourcesProvider);
        this.h = zVar;
        this.M = new d6(0.0f, zVar, 0L, 1250L, wr.i);
        ViewGroup viewGroup = this.containerView;
        int i11 = this.backgroundPaddingLeft;
        viewGroup.setPadding(i11, AndroidUtilities.statusBarHeight, i11, 0);
        this.containerView.setClipChildren(false);
        this.containerView.setClipToPadding(false);
        this.containerView.setWillNotDraw(false);
        zVar.setWillNotDraw(false);
        zVar.setSelectorRadius(AndroidUtilities.dp(6.0f));
        zVar.setSelectorDrawableColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.i6, resourceProvider));
        zVar.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(this.H ? 8.0f : 68.0f));
        s4.s sVar = new s4.s(8);
        this.y = sVar;
        zVar.setLayoutManager(sVar);
        zVar.i(new bi.z1(this, 2));
        zVar.j(new bi.a2(this, 23));
        cn cnVar = new cn(this, arrayList, p2Var, resourceProvider);
        zVar.setOnItemClickListener(cnVar);
        zVar.setOnItemLongClickListener((ll0) new km(6, this, context));
        zVar.setOnTouchListener(new bi.x1(3, this, cnVar));
        sVar.k1(false);
        sVar.O = new iv(this);
        this.E = new yk0(zVar, sVar);
        this.containerView.addView(zVar, w7.a6.e(-1, -1, 51));
        View view = new View(context);
        this.r = view;
        view.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.V5, false));
        this.containerView.addView(view, w7.a6.a(-1.0f, 1.0f / AndroidUtilities.density, 80));
        view.setTranslationY(-AndroidUtilities.dp(68.0f));
        FrameLayout frameLayout = new FrameLayout(context);
        this.s = frameLayout;
        frameLayout.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.j6.h5));
        this.containerView.addView(frameLayout, w7.a6.e(-1, 68, 87));
        TextView textView = new TextView(context);
        this.v = textView;
        textView.setVisibility(8);
        textView.setBackground(org.telegram.ui.ActionBar.z5.e(new float[]{24.0f}, getThemedColor(i10)));
        textView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.j6.Sh));
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(17);
        w7.c6.b(textView, 0.02f, 1.2f);
        TextView f7 = org.telegram.ui.Cells.r6.f(frameLayout, textView, w7.a6.d(-1, 48.0f, 80, 12.0f, 10.0f, 12.0f, 10.0f), context);
        this.w = f7;
        f7.setVisibility(8);
        int i12 = org.telegram.ui.ActionBar.j6.q7;
        f7.setBackground(org.telegram.ui.ActionBar.j6.Y(getThemedColor(i12) & 268435455, 0, 0));
        f7.setTextColor(getThemedColor(i12));
        f7.setTypeface(AndroidUtilities.bold());
        f7.setGravity(17);
        f7.setClickable(true);
        frameLayout.addView(f7, w7.a6.d(-1, -1.0f, 80, 0.0f, 0.0f, 0.0f, 19.0f));
        qg.s0 s0Var = new qg.s0(context, this.resourcesProvider, false);
        this.x = s0Var;
        s0Var.a(LocaleController.getString(R.string.UnlockPremiumEmoji), new h0(this, 12), false);
        s0Var.setIcon(R.raw.unlock_icon);
        s0Var.r.setClickable(true);
        frameLayout.addView(s0Var, w7.a6.d(-1, 48.0f, 80, 12.0f, 10.0f, 12.0f, 10.0f));
    }

    public static void P(wv wvVar, int i10) {
        ArrayList arrayList;
        String str;
        org.telegram.ui.ActionBar.p2 p2Var = wvVar.c;
        gv gvVar = wvVar.e;
        if (gvVar == null || (arrayList = gvVar.b) == null || arrayList.isEmpty()) {
            return;
        }
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) gvVar.b.get(0);
        TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
        if (stickerSet == null || !stickerSet.emojis) {
            str = "https://" + MessagesController.getInstance(wvVar.currentAccount).linkPrefix + "/addstickers/" + tL_messages_stickerSet.set.short_name;
        } else {
            str = "https://" + MessagesController.getInstance(wvVar.currentAccount).linkPrefix + "/addemoji/" + tL_messages_stickerSet.set.short_name;
        }
        String str2 = str;
        if (i10 != 1) {
            if (i10 == 2) {
                try {
                    AndroidUtilities.addToClipboard(str2);
                    new wc((FrameLayout) wvVar.containerView, wvVar.resourcesProvider).k(false).j();
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            }
            return;
        }
        Context parentActivity = p2Var != null ? p2Var.getParentActivity() : null;
        if (parentActivity == null) {
            parentActivity = wvVar.getContext();
        }
        jv jvVar = new jv(wvVar, parentActivity, str2, str2, wvVar.resourcesProvider);
        if (p2Var != null) {
            p2Var.showDialog(jvVar);
        } else {
            jvVar.show();
        }
    }

    public static void W(final org.telegram.ui.ActionBar.p2 p2Var, TLObject tLObject, final boolean z10, final ei.m0 m0Var, final dq dqVar) {
        final int currentAccount = p2Var == null ? UserConfig.selectedAccount : p2Var.getCurrentAccount();
        TLRPC.StickerSet stickerSet = null;
        final View fragmentView = p2Var == null ? null : p2Var.getFragmentView();
        if (tLObject == null) {
            return;
        }
        final TLRPC.TL_messages_stickerSet tL_messages_stickerSet = tLObject instanceof TLRPC.TL_messages_stickerSet ? (TLRPC.TL_messages_stickerSet) tLObject : null;
        if (tL_messages_stickerSet != null) {
            stickerSet = tL_messages_stickerSet.set;
        } else if (tLObject instanceof TLRPC.StickerSet) {
            stickerSet = (TLRPC.StickerSet) tLObject;
        }
        final TLRPC.StickerSet stickerSet2 = stickerSet;
        if (stickerSet2 == null) {
            return;
        }
        if (MediaDataController.getInstance(currentAccount).cancelRemovingStickerSet(stickerSet2.id)) {
            if (m0Var != null) {
                m0Var.run(Boolean.TRUE);
            }
        } else {
            TLRPC.TL_messages_installStickerSet tL_messages_installStickerSet = new TLRPC.TL_messages_installStickerSet();
            TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
            tL_messages_installStickerSet.stickerset = tL_inputStickerSetID;
            tL_inputStickerSetID.id = stickerSet2.id;
            tL_inputStickerSetID.access_hash = stickerSet2.access_hash;
            ConnectionsManager.getInstance(currentAccount).sendRequest(tL_messages_installStickerSet, new RequestDelegate() { // from class: org.telegram.ui.Components.ev
                @Override // org.telegram.tgnet.RequestDelegate
                public final void run(final TLObject tLObject2, final TLRPC.TL_error tL_error) {
                    final TLRPC.StickerSet stickerSet3 = TLRPC.StickerSet.this;
                    final boolean z11 = z10;
                    final View view = fragmentView;
                    final org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                    final TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = tL_messages_stickerSet;
                    final int i10 = currentAccount;
                    final Utilities.Callback callback = m0Var;
                    final Runnable runnable = dqVar;
                    AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.Components.dv
                        @Override // java.lang.Runnable
                        public final void run() {
                            TLObject tLObject3 = tLObject2;
                            TLRPC.StickerSet stickerSet4 = TLRPC.StickerSet.this;
                            int i11 = stickerSet4.masks ? 1 : stickerSet4.emojis ? 5 : 0;
                            TLRPC.TL_error tL_error2 = tL_error;
                            View view2 = view;
                            org.telegram.ui.ActionBar.p2 p2Var3 = p2Var2;
                            int i12 = i10;
                            Utilities.Callback callback2 = callback;
                            try {
                                if (tL_error2 == null) {
                                    if (z11 && view2 != null) {
                                        Context context = p2Var3.getFragmentView().getContext();
                                        TLObject tLObject4 = tL_messages_stickerSet2;
                                        pc.g(p2Var3, new lx0(context, tLObject4 == null ? stickerSet4 : tLObject4, 1, 2, null, p2Var3.getResourceProvider()), 1500).j();
                                    }
                                    if (tLObject3 instanceof TLRPC.TL_messages_stickerSetInstallResultArchive) {
                                        MediaDataController.getInstance(i12).processStickerSetInstallResultArchive(p2Var3, true, i11, (TLRPC.TL_messages_stickerSetInstallResultArchive) tLObject3);
                                    }
                                    if (callback2 != null) {
                                        callback2.run(Boolean.TRUE);
                                    }
                                } else if (view2 != null) {
                                    Toast.makeText(p2Var3.getFragmentView().getContext(), LocaleController.getString(R.string.ErrorOccurred), 0).show();
                                    if (callback2 != null) {
                                        callback2.run(Boolean.FALSE);
                                    }
                                } else if (callback2 != null) {
                                    callback2.run(Boolean.FALSE);
                                }
                            } catch (Exception e) {
                                FileLog.e(e);
                            }
                            MediaDataController.getInstance(i12).loadStickers(i11, false, true, false, new y2(runnable, 5));
                        }
                    });
                }
            });
        }
    }

    public static void n(wv wvVar, ArrayList arrayList, org.telegram.ui.ActionBar.p2 p2Var, org.telegram.ui.ActionBar.f6 f6Var, View view, int i10) {
        gv gvVar = wvVar.e;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = null;
        int i11 = 0;
        if (arrayList == null || arrayList.size() <= 1) {
            org.telegram.ui.ActionBar.p1 p1Var = wvVar.G;
            if (p1Var != null) {
                p1Var.d(true);
                wvVar.G = null;
                return;
            }
            if ((p2Var instanceof org.telegram.ui.eo) && ((org.telegram.ui.eo) p2Var).Y.getVisibility() == 0 && (view instanceof nv)) {
                y5 y5Var = ((nv) view).c;
                try {
                    TLRPC.Document document = y5Var.document;
                    if (document == null) {
                        document = p5.f(wvVar.currentAccount, y5Var.getDocumentId());
                    }
                    SpannableString spannableString = new SpannableString(MessageObject.findAnimatedEmojiEmoticon(document));
                    spannableString.setSpan(y5Var, 0, spannableString.length(), 33);
                    ((org.telegram.ui.eo) p2Var).Y.E0.getText().append((CharSequence) spannableString);
                    wvVar.Y();
                    wvVar.dismiss();
                } catch (Exception unused) {
                }
                try {
                    view.performHapticFeedback(3, 1);
                    return;
                } catch (Exception unused2) {
                    return;
                }
            }
            return;
        }
        if (SystemClock.elapsedRealtime() - wvVar.Q < 250) {
            return;
        }
        int i12 = 0;
        while (true) {
            ArrayList[] arrayListArr = gvVar.c;
            if (i11 >= arrayListArr.length) {
                break;
            }
            int size = arrayListArr[i11].size();
            if (gvVar.c.length > 1) {
                size = Math.min(wvVar.y.J * 2, size);
            }
            i12 += size + 2;
            if (i10 < i12) {
                break;
            } else {
                i11++;
            }
        }
        ArrayList arrayList2 = gvVar.b;
        if (arrayList2 != null && i11 < arrayList2.size()) {
            tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) gvVar.b.get(i11);
        }
        if (tL_messages_stickerSet == null || tL_messages_stickerSet.set == null) {
            return;
        }
        ArrayList arrayList3 = new ArrayList();
        TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
        TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
        tL_inputStickerSetID.id = stickerSet.id;
        tL_inputStickerSetID.access_hash = stickerSet.access_hash;
        arrayList3.add(tL_inputStickerSetID);
        new hv(wvVar, p2Var, wvVar.getContext(), f6Var, arrayList3).show();
    }

    public static void o(wv wvVar, y5 y5Var) {
        org.telegram.ui.ActionBar.p1 p1Var = wvVar.G;
        if (p1Var == null) {
            return;
        }
        p1Var.d(true);
        wvVar.G = null;
        SpannableString spannableString = new SpannableString(MessageObject.findAnimatedEmojiEmoticon(p5.f(wvVar.currentAccount, y5Var.getDocumentId())));
        spannableString.setSpan(y5Var, 0, spannableString.length(), 33);
        if (AndroidUtilities.addToClipboard(spannableString)) {
            org.telegram.messenger.em.o(R.string.EmojiCopied, new wc((FrameLayout) wvVar.containerView, wvVar.resourcesProvider));
        }
    }

    public static /* synthetic */ void p(wv wvVar, ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        wvVar.J = floatValue;
        wvVar.h.setAlpha(floatValue);
        wvVar.v.setAlpha(wvVar.J);
        wvVar.w.setAlpha(wvVar.J);
        wvVar.containerView.invalidate();
    }

    public final int V() {
        if (this.containerView == null) {
            return 0;
        }
        bi.z zVar = this.h;
        if (zVar == null || zVar.getChildCount() < 1) {
            return this.containerView.getPaddingTop();
        }
        View childAt = zVar.getChildAt(0);
        qn qnVar = this.d;
        return childAt != qnVar ? this.containerView.getPaddingTop() : qnVar.getBottom() + ((int) zVar.getY());
    }

    public final void Z() {
        org.telegram.ui.ActionBar.p2 p2Var = this.c;
        if (p2Var != null) {
            new qg.a1(p2Var, 11, false).show();
        } else if (getContext() instanceof LaunchActivity) {
            ((LaunchActivity) getContext()).p0(new PremiumPreviewFragment(0, null));
        }
    }

    public final void a0() {
        final int i10;
        TLRPC.StickerSet stickerSet;
        if (this.s == null) {
            return;
        }
        gv gvVar = this.e;
        ArrayList arrayList = gvVar.b == null ? new ArrayList() : new ArrayList(gvVar.b);
        final int i11 = 0;
        int i12 = 0;
        while (true) {
            i10 = 1;
            if (i12 >= arrayList.size()) {
                break;
            }
            if (arrayList.get(i12) == null) {
                arrayList.remove(i12);
                i12--;
            }
            i12++;
        }
        MediaDataController mediaDataController = MediaDataController.getInstance(this.currentAccount);
        final ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (int i13 = 0; i13 < arrayList.size(); i13++) {
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) arrayList.get(i13);
            if (tL_messages_stickerSet != null && (stickerSet = tL_messages_stickerSet.set) != null) {
                if (mediaDataController.isStickerPackInstalled(stickerSet.id)) {
                    arrayList2.add(tL_messages_stickerSet);
                } else {
                    arrayList3.add(tL_messages_stickerSet);
                }
            }
        }
        final ArrayList arrayList4 = new ArrayList(arrayList3);
        boolean z10 = gvVar.a != null && arrayList.size() == gvVar.a.size();
        if (!this.S && z10 && this.R == null) {
            this.R = ValueAnimator.ofFloat(this.J, 1.0f);
            this.containerView.getY();
            this.R.addUpdateListener(new j6(this, 16));
            this.R.setDuration(250L);
            this.R.setInterpolator(wr.h);
            this.R.start();
        }
        this.S = z10;
        bi.z zVar = this.h;
        if (!z10) {
            zVar.setAlpha(0.0f);
        } else if (this.O >= 0) {
            int L0 = this.y.L0();
            int E = this.n.E(this.O);
            if (Math.abs(L0 - E) > 54) {
                int i14 = L0 < E ? 0 : 1;
                yk0 yk0Var = this.E;
                yk0Var.b = i14;
                yk0Var.c(E, (AndroidUtilities.displaySize.y / 2) - AndroidUtilities.dp(170.0f), false, false);
            } else {
                zVar.x0(E);
            }
            this.K = this.n.E(this.O);
            kv kvVar = this.n;
            int i15 = this.O;
            wv wvVar = kvVar.c;
            boolean z11 = wvVar.I;
            gv gvVar2 = wvVar.e;
            int i16 = z11 ? 2 : 1;
            int i17 = 0;
            while (true) {
                ArrayList[] arrayListArr = gvVar2.c;
                if (i17 >= arrayListArr.length) {
                    break;
                }
                int size = arrayListArr[i17].size();
                if (gvVar2.c.length > 1) {
                    size = Math.min(wvVar.y.J * 2, size);
                }
                if (i17 == i15) {
                    i16 = i16 + size + 1;
                    break;
                } else {
                    i16 += size + 2;
                    i17++;
                }
            }
            this.L = i16;
            this.M.d(1.0f, true);
            zVar.invalidate();
            this.O = -1;
        }
        boolean z12 = this.S;
        qg.s0 s0Var = this.x;
        TextView textView = this.w;
        TextView textView2 = this.v;
        if (!z12 || this.H) {
            s0Var.setVisibility(8);
            textView2.setVisibility(8);
            textView.setVisibility(8);
            b0(false);
            return;
        }
        s0Var.setVisibility(4);
        if (arrayList4.size() > 0) {
            textView2.setVisibility(0);
            textView.setVisibility(8);
            if (arrayList4.size() == 1) {
                textView2.setText(LocaleController.formatPluralString("AddManyEmojiCount", ((TLRPC.TL_messages_stickerSet) arrayList4.get(0)).documents.size(), new Object[0]));
            } else {
                textView2.setText(LocaleController.formatPluralString("AddManyEmojiPacksCount", arrayList4.size(), new Object[0]));
            }
            textView2.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.cv
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i11) {
                        case 0:
                            ArrayList arrayList5 = arrayList4;
                            int size2 = arrayList5.size();
                            int[] iArr = new int[2];
                            int i18 = 0;
                            while (true) {
                                int size3 = arrayList5.size();
                                wv wvVar2 = this;
                                if (i18 >= size3) {
                                    wvVar2.X(true);
                                    if (size2 <= 1) {
                                        wvVar2.dismiss();
                                        break;
                                    }
                                } else {
                                    wv.W(wvVar2.c, (TLObject) arrayList5.get(i18), size2 == 1, size2 > 1 ? new ei.m0(wvVar2, iArr, size2, arrayList5) : null, null);
                                    i18++;
                                }
                            }
                            break;
                        default:
                            wv wvVar3 = this;
                            wvVar3.dismiss();
                            org.telegram.ui.ActionBar.p2 p2Var = wvVar3.c;
                            ArrayList<TLRPC.TL_messages_stickerSet> arrayList6 = arrayList4;
                            if (p2Var != null) {
                                MediaDataController.getInstance(p2Var.getCurrentAccount()).removeMultipleStickerSets(p2Var.getContext(), p2Var, arrayList6);
                            } else {
                                int i19 = 0;
                                while (i19 < arrayList6.size()) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = arrayList6.get(i19);
                                    Context context = wvVar3.getContext();
                                    boolean z13 = i19 == 0;
                                    if (tL_messages_stickerSet2 != null) {
                                        MediaDataController.getInstance(UserConfig.selectedAccount).toggleStickerSet(context, tL_messages_stickerSet2, 0, null, true, z13, null, true);
                                    }
                                    i19++;
                                }
                            }
                            wvVar3.X(false);
                            break;
                    }
                }
            });
            b0(true);
            return;
        }
        if (arrayList2.size() <= 0) {
            textView2.setVisibility(8);
            textView.setVisibility(8);
            b0(false);
            return;
        }
        textView2.setVisibility(8);
        textView.setVisibility(0);
        if (arrayList2.size() == 1) {
            textView.setText(LocaleController.formatPluralString("RemoveManyEmojiCount", ((TLRPC.TL_messages_stickerSet) arrayList2.get(0)).documents.size(), new Object[0]));
        } else {
            textView.setText(LocaleController.formatPluralString("RemoveManyEmojiPacksCount", arrayList2.size(), new Object[0]));
        }
        textView.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.cv
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        ArrayList arrayList5 = arrayList2;
                        int size2 = arrayList5.size();
                        int[] iArr = new int[2];
                        int i18 = 0;
                        while (true) {
                            int size3 = arrayList5.size();
                            wv wvVar2 = this;
                            if (i18 >= size3) {
                                wvVar2.X(true);
                                if (size2 <= 1) {
                                    wvVar2.dismiss();
                                    break;
                                }
                            } else {
                                wv.W(wvVar2.c, (TLObject) arrayList5.get(i18), size2 == 1, size2 > 1 ? new ei.m0(wvVar2, iArr, size2, arrayList5) : null, null);
                                i18++;
                            }
                        }
                        break;
                    default:
                        wv wvVar3 = this;
                        wvVar3.dismiss();
                        org.telegram.ui.ActionBar.p2 p2Var = wvVar3.c;
                        ArrayList<TLRPC.TL_messages_stickerSet> arrayList6 = arrayList2;
                        if (p2Var != null) {
                            MediaDataController.getInstance(p2Var.getCurrentAccount()).removeMultipleStickerSets(p2Var.getContext(), p2Var, arrayList6);
                        } else {
                            int i19 = 0;
                            while (i19 < arrayList6.size()) {
                                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = arrayList6.get(i19);
                                Context context = wvVar3.getContext();
                                boolean z13 = i19 == 0;
                                if (tL_messages_stickerSet2 != null) {
                                    MediaDataController.getInstance(UserConfig.selectedAccount).toggleStickerSet(context, tL_messages_stickerSet2, 0, null, true, z13, null, true);
                                }
                                i19++;
                            }
                        }
                        wvVar3.X(false);
                        break;
                }
            }
        });
        b0(true);
    }

    public final void b0(boolean z10) {
        boolean z11 = !this.P && z10;
        float dp = this.w.getVisibility() == 0 ? AndroidUtilities.dp(19.0f) : 0;
        boolean z12 = this.H;
        bi.z zVar = this.h;
        View view = this.r;
        FrameLayout frameLayout = this.s;
        float f7 = 0.0f;
        if (z11) {
            ViewPropertyAnimator duration = frameLayout.animate().translationY(z10 ? dp : AndroidUtilities.dp(16.0f)).alpha(z10 ? 1.0f : 0.0f).setDuration(250L);
            wr wrVar = wr.h;
            duration.setInterpolator(wrVar).start();
            view.animate().translationY(z10 ? -(AndroidUtilities.dp(68.0f) - dp) : 0.0f).alpha(z10 ? 1.0f : 0.0f).setDuration(250L).setInterpolator(wrVar).start();
            ViewPropertyAnimator animate = zVar.animate();
            if (!z12 && !z10) {
                f7 = AndroidUtilities.dp(68.0f) - dp;
            }
            animate.translationY(f7).setDuration(250L).setInterpolator(wrVar).start();
        } else {
            frameLayout.setAlpha(z10 ? 1.0f : 0.0f);
            frameLayout.setTranslationY(z10 ? dp : AndroidUtilities.dp(16.0f));
            view.setAlpha(z10 ? 1.0f : 0.0f);
            view.setTranslationY(z10 ? -(AndroidUtilities.dp(68.0f) - dp) : 0.0f);
            if (!z12 && !z10) {
                f7 = AndroidUtilities.dp(68.0f) - dp;
            }
            zVar.setTranslationY(f7);
        }
        this.P = z10;
    }

    @Override // org.telegram.ui.ActionBar.h3
    public final boolean canDismissWithSwipe() {
        return false;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        rv rvVar;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet;
        if (i10 != NotificationCenter.stickersDidLoad) {
            return;
        }
        int i12 = 0;
        while (true) {
            bi.z zVar = this.h;
            if (i12 >= zVar.getChildCount()) {
                a0();
                return;
            }
            View childAt = zVar.getChildAt(i12);
            if ((childAt instanceof rv) && (tL_messages_stickerSet = (rvVar = (rv) childAt).r) != null && tL_messages_stickerSet.set != null) {
                rvVar.a(MediaDataController.getInstance(this.currentAccount).isStickerPackInstalled(rvVar.r.set.id), true);
            }
            i12++;
        }
    }

    @Override // org.telegram.ui.ActionBar.h3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.l2
    public void dismiss() {
        mv mvVar = this.f;
        if (mvVar != null && mvVar.w) {
            mvVar.w = false;
            mvVar.invalidate();
        }
        super.dismiss();
        gv gvVar = this.e;
        if (gvVar != null) {
            NotificationCenter.getInstance(gvVar.d).removeObserver(gvVar, NotificationCenter.groupStickersDidLoad);
        }
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 4);
    }

    @Override // org.telegram.ui.ActionBar.h3
    public final int getContainerViewHeight() {
        bi.z zVar = this.h;
        int measuredHeight = (zVar == null ? 0 : zVar.getMeasuredHeight()) - V();
        ViewGroup viewGroup = this.containerView;
        return AndroidUtilities.dp(8.0f) + measuredHeight + (viewGroup != null ? viewGroup.getPaddingTop() : 0) + AndroidUtilities.navigationBarHeight;
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.stickersDidLoad);
    }

    @Override // org.telegram.ui.ActionBar.h3, android.app.Dialog
    public final void onBackPressed() {
        if (org.telegram.ui.tt.q().E) {
            org.telegram.ui.tt.q().o();
        } else {
            super.onBackPressed();
        }
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.stickersDidLoad);
    }

    @Override // org.telegram.ui.ActionBar.h3, android.app.Dialog
    public final void show() {
        TLRPC.StickerSet stickerSet;
        super.show();
        kv kvVar = new kv(this);
        this.n = kvVar;
        this.h.setAdapter(kvVar);
        int i10 = 0;
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 4);
        gv gvVar = this.e;
        if (!gvVar.e) {
            gvVar.e = true;
            wv wvVar = gvVar.f;
            int i11 = gvVar.d;
            gvVar.b = new ArrayList(gvVar.a.size());
            gvVar.c = new ArrayList[gvVar.a.size()];
            NotificationCenter.getInstance(i11).addObserver(gvVar, NotificationCenter.groupStickersDidLoad);
            boolean[] zArr = new boolean[1];
            int i12 = 0;
            while (true) {
                if (i12 < gvVar.c.length) {
                    TLRPC.TL_messages_stickerSet stickerSet2 = MediaDataController.getInstance(i11).getStickerSet((TLRPC.InputStickerSet) gvVar.a.get(i12), null, false, new org.telegram.ui.pf(14, gvVar, zArr));
                    if (gvVar.c.length != 1 || stickerSet2 == null || (stickerSet = stickerSet2.set) == null || stickerSet.emojis) {
                        gvVar.b.add(stickerSet2);
                        gvVar.a(i12, stickerSet2);
                        i12++;
                    } else {
                        AndroidUtilities.runOnUIThread(new sv(gvVar, i10));
                        Context context = wvVar.getContext();
                        org.telegram.ui.ActionBar.p2 p2Var = wvVar.c;
                        TLRPC.InputStickerSet inputStickerSet = (TLRPC.InputStickerSet) gvVar.a.get(i12);
                        org.telegram.ui.ActionBar.p2 p2Var2 = wvVar.c;
                        new hy0(context, p2Var, inputStickerSet, null, p2Var2 instanceof org.telegram.ui.eo ? ((org.telegram.ui.eo) p2Var2).Y : null, wvVar.resourcesProvider).show();
                    }
                } else {
                    wv wvVar2 = gvVar.h;
                    wvVar2.a0();
                    bi.z zVar = wvVar2.h;
                    if (zVar != null && zVar.getAdapter() != null) {
                        zVar.getAdapter().l();
                    }
                }
            }
        }
        a0();
        org.telegram.ui.ActionBar.p2 p2Var3 = this.c;
        MediaDataController.getInstance(p2Var3 == null ? UserConfig.selectedAccount : p2Var3.getCurrentAccount()).checkStickers(5);
    }

    public void X(boolean z10) {
    }

    public void Y() {
    }
}
