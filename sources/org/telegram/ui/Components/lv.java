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

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public class lv extends org.telegram.ui.ActionBar.g3 implements NotificationCenter.NotificationCenterDelegate {
    public static Pattern S;
    public final c2.z B;
    public final qp C;
    public org.telegram.ui.ActionBar.p1 D;
    public final boolean E;
    public boolean F;
    public float G;
    public int H;
    public int I;
    public final z5 J;
    public final uu K;
    public int L;
    public boolean M;
    public long N;
    public ValueAnimator O;
    public boolean P;
    public PorterDuffColorFilter Q;
    public int R;
    public LongSparseArray b;
    public final org.telegram.ui.ActionBar.p2 c;
    public final gn d;
    public final vu e;
    public final bv f;
    public final org.telegram.ui.m3 h;
    public zu n;
    public final View r;
    public final FrameLayout s;
    public final TextView v;
    public final TextView w;
    public final eg.c1 x;
    public final f2.w y;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public lv(org.telegram.ui.ActionBar.p2 p2Var, Context context, org.telegram.ui.ActionBar.f6 f6Var, ArrayList arrayList) {
        super(context, r4, false, false);
        org.telegram.ui.ActionBar.f6 resourceProvider = (p2Var == null || p2Var.getResourceProvider() == null) ? f6Var : p2Var.getResourceProvider();
        this.H = -1;
        this.I = -1;
        this.K = new uu(this);
        this.L = -1;
        this.M = false;
        this.P = true;
        this.c = p2Var;
        fixNavigationBar();
        if (arrayList != null) {
            this.E = arrayList.size() > 1;
        }
        this.e = new vu(this.currentAccount, arrayList, this);
        float dp = AndroidUtilities.dp(32.0f);
        float dp2 = AndroidUtilities.dp(3.5f);
        int i10 = org.telegram.ui.ActionBar.j6.Oh;
        this.C = new qp(dp, dp2, getThemedColor(i10));
        bv bvVar = new bv(this, context);
        this.f = bvVar;
        this.containerView = bvVar;
        this.d = new gn(context, 8);
        org.telegram.ui.m3 m3Var = new org.telegram.ui.m3(this, context, this.resourcesProvider);
        this.h = m3Var;
        this.J = new z5(0.0f, m3Var, 0L, 1250L, mr.i);
        ViewGroup viewGroup = this.containerView;
        int i11 = this.backgroundPaddingLeft;
        viewGroup.setPadding(i11, AndroidUtilities.statusBarHeight, i11, 0);
        this.containerView.setClipChildren(false);
        this.containerView.setClipToPadding(false);
        this.containerView.setWillNotDraw(false);
        m3Var.setWillNotDraw(false);
        m3Var.setSelectorRadius(AndroidUtilities.dp(6.0f));
        m3Var.setSelectorDrawableColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.i6, resourceProvider));
        m3Var.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(this.E ? 8.0f : 68.0f));
        f2.w wVar = new f2.w(8);
        this.y = wVar;
        m3Var.setLayoutManager(wVar);
        int i12 = 2;
        m3Var.i(new gg.e2(this, i12));
        m3Var.j(new eg.f2(this, 26));
        sm smVar = new sm(this, arrayList, p2Var, resourceProvider);
        m3Var.setOnItemClickListener(smVar);
        m3Var.setOnItemLongClickListener((jl0) new o1(19, this, context));
        m3Var.setOnTouchListener(new org.telegram.ui.ActionBar.i1(i12, this, smVar));
        wVar.k1(false);
        wVar.O = new xu(this);
        this.B = new c2.z(m3Var, wVar);
        this.containerView.addView(m3Var, k7.b6.e(-1, -1, 51));
        View view = new View(context);
        this.r = view;
        view.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.V5, false));
        this.containerView.addView(view, k7.b6.a(-1.0f, 1.0f / AndroidUtilities.density, 80));
        view.setTranslationY(-AndroidUtilities.dp(68.0f));
        FrameLayout frameLayout = new FrameLayout(context);
        this.s = frameLayout;
        frameLayout.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.j6.h5));
        this.containerView.addView(frameLayout, k7.b6.e(-1, 68, 87));
        TextView textView = new TextView(context);
        this.v = textView;
        textView.setVisibility(8);
        textView.setBackground(org.telegram.ui.ActionBar.z5.e(new float[]{24.0f}, getThemedColor(i10)));
        textView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.j6.Sh));
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(17);
        k7.d6.b(textView, 0.02f, 1.2f);
        TextView h = org.telegram.ui.ai.h(frameLayout, textView, k7.b6.d(-1, 48.0f, 80, 12.0f, 10.0f, 12.0f, 10.0f), context);
        this.w = h;
        h.setVisibility(8);
        int i13 = org.telegram.ui.ActionBar.j6.q7;
        h.setBackground(org.telegram.ui.ActionBar.j6.Y(getThemedColor(i13) & 268435455, 0, 0));
        h.setTextColor(getThemedColor(i13));
        h.setTypeface(AndroidUtilities.bold());
        h.setGravity(17);
        h.setClickable(true);
        frameLayout.addView(h, k7.b6.d(-1, -1.0f, 80, 0.0f, 0.0f, 0.0f, 19.0f));
        eg.c1 c1Var = new eg.c1(context, this.resourcesProvider, false);
        this.x = c1Var;
        c1Var.a(LocaleController.getString(R.string.UnlockPremiumEmoji), new g0(this, 12), false);
        c1Var.setIcon(R.raw.unlock_icon);
        c1Var.r.setClickable(true);
        frameLayout.addView(c1Var, k7.b6.d(-1, 48.0f, 80, 12.0f, 10.0f, 12.0f, 10.0f));
    }

    public static void P(lv lvVar, int i10) {
        ArrayList arrayList;
        String str;
        org.telegram.ui.ActionBar.p2 p2Var = lvVar.c;
        vu vuVar = lvVar.e;
        if (vuVar == null || (arrayList = vuVar.b) == null || arrayList.isEmpty()) {
            return;
        }
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) vuVar.b.get(0);
        TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
        if (stickerSet == null || !stickerSet.emojis) {
            str = "https://" + MessagesController.getInstance(lvVar.currentAccount).linkPrefix + "/addstickers/" + tL_messages_stickerSet.set.short_name;
        } else {
            str = "https://" + MessagesController.getInstance(lvVar.currentAccount).linkPrefix + "/addemoji/" + tL_messages_stickerSet.set.short_name;
        }
        String str2 = str;
        if (i10 != 1) {
            if (i10 == 2) {
                try {
                    AndroidUtilities.addToClipboard(str2);
                    new qc((FrameLayout) lvVar.containerView, lvVar.resourcesProvider).k(false).j();
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
            parentActivity = lvVar.getContext();
        }
        yu yuVar = new yu(lvVar, parentActivity, str2, str2, lvVar.resourcesProvider);
        if (p2Var != null) {
            p2Var.showDialog(yuVar);
        } else {
            yuVar.show();
        }
    }

    public static void W(final org.telegram.ui.ActionBar.p2 p2Var, TLObject tLObject, final boolean z4, final lh.e8 e8Var, final up upVar) {
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
            if (e8Var != null) {
                e8Var.run(Boolean.TRUE);
            }
        } else {
            TLRPC.TL_messages_installStickerSet tL_messages_installStickerSet = new TLRPC.TL_messages_installStickerSet();
            TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
            tL_messages_installStickerSet.stickerset = tL_inputStickerSetID;
            tL_inputStickerSetID.id = stickerSet2.id;
            tL_inputStickerSetID.access_hash = stickerSet2.access_hash;
            ConnectionsManager.getInstance(currentAccount).sendRequest(tL_messages_installStickerSet, new RequestDelegate() { // from class: org.telegram.ui.Components.tu
                @Override // org.telegram.tgnet.RequestDelegate
                public final void run(final TLObject tLObject2, final TLRPC.TL_error tL_error) {
                    final TLRPC.StickerSet stickerSet3 = TLRPC.StickerSet.this;
                    final boolean z10 = z4;
                    final View view = fragmentView;
                    final org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                    final TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = tL_messages_stickerSet;
                    final int i10 = currentAccount;
                    final Utilities.Callback callback = e8Var;
                    final Runnable runnable = upVar;
                    AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.Components.su
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
                                    if (z10 && view2 != null) {
                                        Context context = p2Var3.getFragmentView().getContext();
                                        TLObject tLObject4 = tL_messages_stickerSet2;
                                        ic.g(p2Var3, new bx0(context, tLObject4 == null ? stickerSet4 : tLObject4, 1, 2, null, p2Var3.getResourceProvider()), 1500).j();
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
                            MediaDataController.getInstance(i12).loadStickers(i11, false, true, false, new v2(runnable, 5));
                        }
                    });
                }
            });
        }
    }

    public static void n(lv lvVar, ArrayList arrayList, org.telegram.ui.ActionBar.p2 p2Var, org.telegram.ui.ActionBar.f6 f6Var, View view, int i10) {
        vu vuVar = lvVar.e;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = null;
        int i11 = 0;
        if (arrayList == null || arrayList.size() <= 1) {
            org.telegram.ui.ActionBar.p1 p1Var = lvVar.D;
            if (p1Var != null) {
                p1Var.d(true);
                lvVar.D = null;
                return;
            }
            if ((p2Var instanceof org.telegram.ui.zn) && ((org.telegram.ui.zn) p2Var).V.getVisibility() == 0 && (view instanceof cv)) {
                u5 u5Var = ((cv) view).c;
                try {
                    TLRPC.Document document = u5Var.document;
                    if (document == null) {
                        document = l5.f(lvVar.currentAccount, u5Var.getDocumentId());
                    }
                    SpannableString spannableString = new SpannableString(MessageObject.findAnimatedEmojiEmoticon(document));
                    spannableString.setSpan(u5Var, 0, spannableString.length(), 33);
                    ((org.telegram.ui.zn) p2Var).V.B0.getText().append((CharSequence) spannableString);
                    lvVar.Y();
                    lvVar.dismiss();
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
        if (SystemClock.elapsedRealtime() - lvVar.N < 250) {
            return;
        }
        int i12 = 0;
        while (true) {
            ArrayList[] arrayListArr = vuVar.c;
            if (i11 >= arrayListArr.length) {
                break;
            }
            int size = arrayListArr[i11].size();
            if (vuVar.c.length > 1) {
                size = Math.min(lvVar.y.J * 2, size);
            }
            i12 += size + 2;
            if (i10 < i12) {
                break;
            } else {
                i11++;
            }
        }
        ArrayList arrayList2 = vuVar.b;
        if (arrayList2 != null && i11 < arrayList2.size()) {
            tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) vuVar.b.get(i11);
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
        new wu(lvVar, p2Var, lvVar.getContext(), f6Var, arrayList3).show();
    }

    public static void o(lv lvVar, u5 u5Var) {
        org.telegram.ui.ActionBar.p1 p1Var = lvVar.D;
        if (p1Var == null) {
            return;
        }
        p1Var.d(true);
        lvVar.D = null;
        SpannableString spannableString = new SpannableString(MessageObject.findAnimatedEmojiEmoticon(l5.f(lvVar.currentAccount, u5Var.getDocumentId())));
        spannableString.setSpan(u5Var, 0, spannableString.length(), 33);
        if (AndroidUtilities.addToClipboard(spannableString)) {
            org.telegram.ui.b.m(R.string.EmojiCopied, new qc((FrameLayout) lvVar.containerView, lvVar.resourcesProvider));
        }
    }

    public static /* synthetic */ void p(lv lvVar, ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        lvVar.G = floatValue;
        lvVar.h.setAlpha(floatValue);
        lvVar.v.setAlpha(lvVar.G);
        lvVar.w.setAlpha(lvVar.G);
        lvVar.containerView.invalidate();
    }

    public final int V() {
        if (this.containerView == null) {
            return 0;
        }
        org.telegram.ui.m3 m3Var = this.h;
        if (m3Var == null || m3Var.getChildCount() < 1) {
            return this.containerView.getPaddingTop();
        }
        View childAt = m3Var.getChildAt(0);
        gn gnVar = this.d;
        return childAt != gnVar ? this.containerView.getPaddingTop() : gnVar.getBottom() + ((int) m3Var.getY());
    }

    public final void Z() {
        org.telegram.ui.ActionBar.p2 p2Var = this.c;
        if (p2Var != null) {
            new eg.o1(p2Var, 11, false).show();
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
        vu vuVar = this.e;
        ArrayList arrayList = vuVar.b == null ? new ArrayList() : new ArrayList(vuVar.b);
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
        boolean z4 = vuVar.a != null && arrayList.size() == vuVar.a.size();
        if (!this.P && z4 && this.O == null) {
            this.O = ValueAnimator.ofFloat(this.G, 1.0f);
            this.containerView.getY();
            this.O.addUpdateListener(new f6(this, 16));
            this.O.setDuration(250L);
            this.O.setInterpolator(mr.h);
            this.O.start();
        }
        this.P = z4;
        org.telegram.ui.m3 m3Var = this.h;
        if (!z4) {
            m3Var.setAlpha(0.0f);
        } else if (this.L >= 0) {
            int L0 = this.y.L0();
            int E = this.n.E(this.L);
            if (Math.abs(L0 - E) > 54) {
                int i14 = L0 < E ? 0 : 1;
                c2.z zVar = this.B;
                zVar.b = i14;
                zVar.c(E, (AndroidUtilities.displaySize.y / 2) - AndroidUtilities.dp(170.0f), false, false);
            } else {
                m3Var.x0(E);
            }
            this.H = this.n.E(this.L);
            zu zuVar = this.n;
            int i15 = this.L;
            lv lvVar = zuVar.c;
            boolean z10 = lvVar.F;
            vu vuVar2 = lvVar.e;
            int i16 = z10 ? 2 : 1;
            int i17 = 0;
            while (true) {
                ArrayList[] arrayListArr = vuVar2.c;
                if (i17 >= arrayListArr.length) {
                    break;
                }
                int size = arrayListArr[i17].size();
                if (vuVar2.c.length > 1) {
                    size = Math.min(lvVar.y.J * 2, size);
                }
                if (i17 == i15) {
                    i16 = i16 + size + 1;
                    break;
                } else {
                    i16 += size + 2;
                    i17++;
                }
            }
            this.I = i16;
            this.J.d(1.0f, true);
            m3Var.invalidate();
            this.L = -1;
        }
        boolean z11 = this.P;
        eg.c1 c1Var = this.x;
        TextView textView = this.w;
        TextView textView2 = this.v;
        if (!z11 || this.E) {
            c1Var.setVisibility(8);
            textView2.setVisibility(8);
            textView.setVisibility(8);
            b0(false);
            return;
        }
        c1Var.setVisibility(4);
        if (arrayList4.size() > 0) {
            textView2.setVisibility(0);
            textView.setVisibility(8);
            if (arrayList4.size() == 1) {
                textView2.setText(LocaleController.formatPluralString("AddManyEmojiCount", ((TLRPC.TL_messages_stickerSet) arrayList4.get(0)).documents.size(), new Object[0]));
            } else {
                textView2.setText(LocaleController.formatPluralString("AddManyEmojiPacksCount", arrayList4.size(), new Object[0]));
            }
            textView2.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.ru
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
                                lv lvVar2 = this;
                                if (i18 >= size3) {
                                    lvVar2.X(true);
                                    if (size2 <= 1) {
                                        lvVar2.dismiss();
                                        break;
                                    }
                                } else {
                                    lv.W(lvVar2.c, (TLObject) arrayList5.get(i18), size2 == 1, size2 > 1 ? new lh.e8(lvVar2, iArr, size2, arrayList5) : null, null);
                                    i18++;
                                }
                            }
                            break;
                        default:
                            lv lvVar3 = this;
                            lvVar3.dismiss();
                            org.telegram.ui.ActionBar.p2 p2Var = lvVar3.c;
                            ArrayList<TLRPC.TL_messages_stickerSet> arrayList6 = arrayList4;
                            if (p2Var != null) {
                                MediaDataController.getInstance(p2Var.getCurrentAccount()).removeMultipleStickerSets(p2Var.getContext(), p2Var, arrayList6);
                            } else {
                                int i19 = 0;
                                while (i19 < arrayList6.size()) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = arrayList6.get(i19);
                                    Context context = lvVar3.getContext();
                                    boolean z12 = i19 == 0;
                                    if (tL_messages_stickerSet2 != null) {
                                        MediaDataController.getInstance(UserConfig.selectedAccount).toggleStickerSet(context, tL_messages_stickerSet2, 0, null, true, z12, null, true);
                                    }
                                    i19++;
                                }
                            }
                            lvVar3.X(false);
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
        textView.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.ru
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
                            lv lvVar2 = this;
                            if (i18 >= size3) {
                                lvVar2.X(true);
                                if (size2 <= 1) {
                                    lvVar2.dismiss();
                                    break;
                                }
                            } else {
                                lv.W(lvVar2.c, (TLObject) arrayList5.get(i18), size2 == 1, size2 > 1 ? new lh.e8(lvVar2, iArr, size2, arrayList5) : null, null);
                                i18++;
                            }
                        }
                        break;
                    default:
                        lv lvVar3 = this;
                        lvVar3.dismiss();
                        org.telegram.ui.ActionBar.p2 p2Var = lvVar3.c;
                        ArrayList<TLRPC.TL_messages_stickerSet> arrayList6 = arrayList2;
                        if (p2Var != null) {
                            MediaDataController.getInstance(p2Var.getCurrentAccount()).removeMultipleStickerSets(p2Var.getContext(), p2Var, arrayList6);
                        } else {
                            int i19 = 0;
                            while (i19 < arrayList6.size()) {
                                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = arrayList6.get(i19);
                                Context context = lvVar3.getContext();
                                boolean z12 = i19 == 0;
                                if (tL_messages_stickerSet2 != null) {
                                    MediaDataController.getInstance(UserConfig.selectedAccount).toggleStickerSet(context, tL_messages_stickerSet2, 0, null, true, z12, null, true);
                                }
                                i19++;
                            }
                        }
                        lvVar3.X(false);
                        break;
                }
            }
        });
        b0(true);
    }

    public final void b0(boolean z4) {
        boolean z10 = !this.M && z4;
        float dp = this.w.getVisibility() == 0 ? AndroidUtilities.dp(19.0f) : 0;
        boolean z11 = this.E;
        org.telegram.ui.m3 m3Var = this.h;
        View view = this.r;
        FrameLayout frameLayout = this.s;
        float f10 = 0.0f;
        if (z10) {
            ViewPropertyAnimator duration = frameLayout.animate().translationY(z4 ? dp : AndroidUtilities.dp(16.0f)).alpha(z4 ? 1.0f : 0.0f).setDuration(250L);
            mr mrVar = mr.h;
            duration.setInterpolator(mrVar).start();
            view.animate().translationY(z4 ? -(AndroidUtilities.dp(68.0f) - dp) : 0.0f).alpha(z4 ? 1.0f : 0.0f).setDuration(250L).setInterpolator(mrVar).start();
            ViewPropertyAnimator animate = m3Var.animate();
            if (!z11 && !z4) {
                f10 = AndroidUtilities.dp(68.0f) - dp;
            }
            animate.translationY(f10).setDuration(250L).setInterpolator(mrVar).start();
        } else {
            frameLayout.setAlpha(z4 ? 1.0f : 0.0f);
            frameLayout.setTranslationY(z4 ? dp : AndroidUtilities.dp(16.0f));
            view.setAlpha(z4 ? 1.0f : 0.0f);
            view.setTranslationY(z4 ? -(AndroidUtilities.dp(68.0f) - dp) : 0.0f);
            if (!z11 && !z4) {
                f10 = AndroidUtilities.dp(68.0f) - dp;
            }
            m3Var.setTranslationY(f10);
        }
        this.M = z4;
    }

    @Override // org.telegram.ui.ActionBar.g3
    public final boolean canDismissWithSwipe() {
        return false;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        gv gvVar;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet;
        if (i10 != NotificationCenter.stickersDidLoad) {
            return;
        }
        int i12 = 0;
        while (true) {
            org.telegram.ui.m3 m3Var = this.h;
            if (i12 >= m3Var.getChildCount()) {
                a0();
                return;
            }
            View childAt = m3Var.getChildAt(i12);
            if ((childAt instanceof gv) && (tL_messages_stickerSet = (gvVar = (gv) childAt).r) != null && tL_messages_stickerSet.set != null) {
                gvVar.a(MediaDataController.getInstance(this.currentAccount).isStickerPackInstalled(gvVar.r.set.id), true);
            }
            i12++;
        }
    }

    @Override // org.telegram.ui.ActionBar.g3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.l2
    public void dismiss() {
        bv bvVar = this.f;
        if (bvVar != null && bvVar.w) {
            bvVar.w = false;
            bvVar.invalidate();
        }
        super.dismiss();
        vu vuVar = this.e;
        if (vuVar != null) {
            NotificationCenter.getInstance(vuVar.d).removeObserver(vuVar, NotificationCenter.groupStickersDidLoad);
        }
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 4);
    }

    @Override // org.telegram.ui.ActionBar.g3
    public final int getContainerViewHeight() {
        org.telegram.ui.m3 m3Var = this.h;
        int measuredHeight = (m3Var == null ? 0 : m3Var.getMeasuredHeight()) - V();
        ViewGroup viewGroup = this.containerView;
        return AndroidUtilities.dp(8.0f) + measuredHeight + (viewGroup != null ? viewGroup.getPaddingTop() : 0) + AndroidUtilities.navigationBarHeight;
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.stickersDidLoad);
    }

    @Override // org.telegram.ui.ActionBar.g3, android.app.Dialog
    public final void onBackPressed() {
        if (org.telegram.ui.rt.q().E) {
            org.telegram.ui.rt.q().o();
        } else {
            super.onBackPressed();
        }
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.stickersDidLoad);
    }

    @Override // org.telegram.ui.ActionBar.g3, android.app.Dialog
    public final void show() {
        TLRPC.StickerSet stickerSet;
        super.show();
        zu zuVar = new zu(this);
        this.n = zuVar;
        this.h.setAdapter(zuVar);
        int i10 = 1;
        int i11 = 0;
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 4);
        vu vuVar = this.e;
        if (!vuVar.e) {
            vuVar.e = true;
            lv lvVar = vuVar.f;
            int i12 = vuVar.d;
            vuVar.b = new ArrayList(vuVar.a.size());
            vuVar.c = new ArrayList[vuVar.a.size()];
            NotificationCenter.getInstance(i12).addObserver(vuVar, NotificationCenter.groupStickersDidLoad);
            boolean[] zArr = new boolean[1];
            int i13 = 0;
            while (true) {
                if (i13 < vuVar.c.length) {
                    TLRPC.TL_messages_stickerSet stickerSet2 = MediaDataController.getInstance(i12).getStickerSet((TLRPC.InputStickerSet) vuVar.a.get(i13), null, false, new vk(i10, vuVar, zArr));
                    if (vuVar.c.length != 1 || stickerSet2 == null || (stickerSet = stickerSet2.set) == null || stickerSet.emojis) {
                        vuVar.b.add(stickerSet2);
                        vuVar.a(i13, stickerSet2);
                        i13++;
                    } else {
                        AndroidUtilities.runOnUIThread(new hv(vuVar, i11));
                        Context context = lvVar.getContext();
                        org.telegram.ui.ActionBar.p2 p2Var = lvVar.c;
                        TLRPC.InputStickerSet inputStickerSet = (TLRPC.InputStickerSet) vuVar.a.get(i13);
                        org.telegram.ui.ActionBar.p2 p2Var2 = lvVar.c;
                        new xx0(context, p2Var, inputStickerSet, null, p2Var2 instanceof org.telegram.ui.zn ? ((org.telegram.ui.zn) p2Var2).V : null, lvVar.resourcesProvider).show();
                    }
                } else {
                    lv lvVar2 = vuVar.h;
                    lvVar2.a0();
                    org.telegram.ui.m3 m3Var = lvVar2.h;
                    if (m3Var != null && m3Var.getAdapter() != null) {
                        m3Var.getAdapter().l();
                    }
                }
            }
        }
        a0();
        org.telegram.ui.ActionBar.p2 p2Var3 = this.c;
        MediaDataController.getInstance(p2Var3 == null ? UserConfig.selectedAccount : p2Var3.getCurrentAccount()).checkStickers(5);
    }

    public void X(boolean z4) {
    }

    public void Y() {
    }
}
