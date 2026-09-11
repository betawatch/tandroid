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

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public class rv extends org.telegram.ui.ActionBar.f3 implements NotificationCenter.NotificationCenterDelegate {
    public static Pattern V;
    public final ok0 E;
    public final sp F;
    public org.telegram.ui.ActionBar.n1 G;
    public final boolean H;
    public boolean I;
    public float J;
    public int K;
    public int L;
    public final e6 M;
    public final av N;
    public int O;
    public boolean P;
    public long Q;
    public ValueAnimator R;
    public boolean S;
    public PorterDuffColorFilter T;
    public int U;
    public LongSparseArray b;
    public final org.telegram.ui.ActionBar.n2 c;
    public final jn d;
    public final bv e;
    public final hv f;
    public final di.v h;
    public fv n;
    public final View r;
    public final FrameLayout s;
    public final TextView v;
    public final TextView w;
    public final sg.r0 x;
    public final s4.s y;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public rv(org.telegram.ui.ActionBar.n2 n2Var, Context context, org.telegram.ui.ActionBar.f6 f6Var, ArrayList arrayList) {
        super(1, context, r4, false);
        org.telegram.ui.ActionBar.f6 resourceProvider = (n2Var == null || n2Var.getResourceProvider() == null) ? f6Var : n2Var.getResourceProvider();
        this.K = -1;
        this.L = -1;
        this.N = new av(this);
        this.O = -1;
        this.P = false;
        this.S = true;
        this.c = n2Var;
        fixNavigationBar();
        if (arrayList != null) {
            this.H = arrayList.size() > 1;
        }
        this.e = new bv(this.currentAccount, arrayList, this);
        float dp = AndroidUtilities.dp(32.0f);
        float dp2 = AndroidUtilities.dp(3.5f);
        int i10 = org.telegram.ui.ActionBar.j6.Oh;
        this.F = new sp(dp, dp2, getThemedColor(i10));
        hv hvVar = new hv(this, context);
        this.f = hvVar;
        this.containerView = hvVar;
        int i11 = 11;
        this.d = new jn(context, i11);
        di.v vVar = new di.v(this, context, this.resourcesProvider);
        this.h = vVar;
        this.M = new e6(0.0f, vVar, 0L, 1250L, pr.i);
        ViewGroup viewGroup = this.containerView;
        int i12 = this.backgroundPaddingLeft;
        viewGroup.setPadding(i12, AndroidUtilities.statusBarHeight, i12, 0);
        this.containerView.setClipChildren(false);
        this.containerView.setClipToPadding(false);
        this.containerView.setWillNotDraw(false);
        vVar.setWillNotDraw(false);
        vVar.setSelectorRadius(AndroidUtilities.dp(6.0f));
        vVar.setSelectorDrawableColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.i6, resourceProvider));
        vVar.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(this.H ? 8.0f : 68.0f));
        s4.s sVar = new s4.s(8);
        this.y = sVar;
        vVar.setLayoutManager(sVar);
        vVar.i(new di.r1(this, 2));
        vVar.j(new ah.e0(this, 26));
        vm vmVar = new vm(this, arrayList, n2Var, resourceProvider);
        vVar.setOnItemClickListener(vmVar);
        vVar.setOnItemLongClickListener((bl0) new b3(i11, this, context));
        vVar.setOnTouchListener(new di.q1(3, this, vmVar));
        sVar.k1(false);
        sVar.O = new dv(this);
        this.E = new ok0(vVar, sVar);
        this.containerView.addView(vVar, w7.x5.e(-1, -1, 51));
        View view = new View(context);
        this.r = view;
        view.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.V5, false));
        this.containerView.addView(view, w7.x5.a(-1.0f, 1.0f / AndroidUtilities.density, 80));
        view.setTranslationY(-AndroidUtilities.dp(68.0f));
        FrameLayout frameLayout = new FrameLayout(context);
        this.s = frameLayout;
        frameLayout.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.j6.h5));
        this.containerView.addView(frameLayout, w7.x5.e(-1, 68, 87));
        TextView textView = new TextView(context);
        this.v = textView;
        textView.setVisibility(8);
        textView.setBackground(org.telegram.ui.ActionBar.y5.e(new float[]{24.0f}, getThemedColor(i10)));
        textView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.j6.Sh));
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(17);
        w7.z5.b(textView, 0.02f, 1.2f);
        TextView f7 = org.telegram.ui.Cells.p6.f(frameLayout, textView, w7.x5.d(-1, 48.0f, 80, 12.0f, 10.0f, 12.0f, 10.0f), context);
        this.w = f7;
        f7.setVisibility(8);
        int i13 = org.telegram.ui.ActionBar.j6.q7;
        f7.setBackground(org.telegram.ui.ActionBar.j6.Y(getThemedColor(i13) & 268435455, 0, 0));
        f7.setTextColor(getThemedColor(i13));
        f7.setTypeface(AndroidUtilities.bold());
        f7.setGravity(17);
        f7.setClickable(true);
        frameLayout.addView(f7, w7.x5.d(-1, -1.0f, 80, 0.0f, 0.0f, 0.0f, 19.0f));
        sg.r0 r0Var = new sg.r0(context, this.resourcesProvider, false);
        this.x = r0Var;
        r0Var.a(LocaleController.getString(R.string.UnlockPremiumEmoji), new g0(this, 12), false);
        r0Var.setIcon(R.raw.unlock_icon);
        r0Var.r.setClickable(true);
        frameLayout.addView(r0Var, w7.x5.d(-1, 48.0f, 80, 12.0f, 10.0f, 12.0f, 10.0f));
    }

    public static void P(rv rvVar, int i10) {
        ArrayList arrayList;
        String str;
        org.telegram.ui.ActionBar.n2 n2Var = rvVar.c;
        bv bvVar = rvVar.e;
        if (bvVar == null || (arrayList = bvVar.b) == null || arrayList.isEmpty()) {
            return;
        }
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) bvVar.b.get(0);
        TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
        if (stickerSet == null || !stickerSet.emojis) {
            str = "https://" + MessagesController.getInstance(rvVar.currentAccount).linkPrefix + "/addstickers/" + tL_messages_stickerSet.set.short_name;
        } else {
            str = "https://" + MessagesController.getInstance(rvVar.currentAccount).linkPrefix + "/addemoji/" + tL_messages_stickerSet.set.short_name;
        }
        String str2 = str;
        if (i10 != 1) {
            if (i10 == 2) {
                try {
                    AndroidUtilities.addToClipboard(str2);
                    new yc((FrameLayout) rvVar.containerView, rvVar.resourcesProvider).k(false).j();
                    return;
                } catch (Exception e7) {
                    FileLog.e(e7);
                    return;
                }
            }
            return;
        }
        Context parentActivity = n2Var != null ? n2Var.getParentActivity() : null;
        if (parentActivity == null) {
            parentActivity = rvVar.getContext();
        }
        ev evVar = new ev(rvVar, parentActivity, str2, str2, rvVar.resourcesProvider);
        if (n2Var != null) {
            n2Var.showDialog(evVar);
        } else {
            evVar.show();
        }
    }

    public static void W(final org.telegram.ui.ActionBar.n2 n2Var, TLObject tLObject, final boolean z10, final gi.m0 m0Var, final wp wpVar) {
        final int currentAccount = n2Var == null ? UserConfig.selectedAccount : n2Var.getCurrentAccount();
        TLRPC.StickerSet stickerSet = null;
        final View fragmentView = n2Var == null ? null : n2Var.getFragmentView();
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
            ConnectionsManager.getInstance(currentAccount).sendRequest(tL_messages_installStickerSet, new RequestDelegate() { // from class: org.telegram.ui.Components.yu
                @Override // org.telegram.tgnet.RequestDelegate
                public final void run(final TLObject tLObject2, final TLRPC.TL_error tL_error) {
                    final TLRPC.StickerSet stickerSet3 = TLRPC.StickerSet.this;
                    final boolean z11 = z10;
                    final View view = fragmentView;
                    final org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                    final TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = tL_messages_stickerSet;
                    final int i10 = currentAccount;
                    final Utilities.Callback callback = m0Var;
                    final Runnable runnable = wpVar;
                    AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.Components.xu
                        @Override // java.lang.Runnable
                        public final void run() {
                            TLObject tLObject3 = tLObject2;
                            TLRPC.StickerSet stickerSet4 = TLRPC.StickerSet.this;
                            int i11 = stickerSet4.masks ? 1 : stickerSet4.emojis ? 5 : 0;
                            TLRPC.TL_error tL_error2 = tL_error;
                            View view2 = view;
                            org.telegram.ui.ActionBar.n2 n2Var3 = n2Var2;
                            int i12 = i10;
                            Utilities.Callback callback2 = callback;
                            try {
                                if (tL_error2 == null) {
                                    if (z11 && view2 != null) {
                                        Context context = n2Var3.getFragmentView().getContext();
                                        TLObject tLObject4 = tL_messages_stickerSet2;
                                        qc.g(n2Var3, new zw0(context, tLObject4 == null ? stickerSet4 : tLObject4, 1, 2, null, n2Var3.getResourceProvider()), 1500).j();
                                    }
                                    if (tLObject3 instanceof TLRPC.TL_messages_stickerSetInstallResultArchive) {
                                        MediaDataController.getInstance(i12).processStickerSetInstallResultArchive(n2Var3, true, i11, (TLRPC.TL_messages_stickerSetInstallResultArchive) tLObject3);
                                    }
                                    if (callback2 != null) {
                                        callback2.run(Boolean.TRUE);
                                    }
                                } else if (view2 != null) {
                                    Toast.makeText(n2Var3.getFragmentView().getContext(), LocaleController.getString(R.string.ErrorOccurred), 0).show();
                                    if (callback2 != null) {
                                        callback2.run(Boolean.FALSE);
                                    }
                                } else if (callback2 != null) {
                                    callback2.run(Boolean.FALSE);
                                }
                            } catch (Exception e7) {
                                FileLog.e(e7);
                            }
                            MediaDataController.getInstance(i12).loadStickers(i11, false, true, false, new y2(runnable, 5));
                        }
                    });
                }
            });
        }
    }

    public static void n(rv rvVar, ArrayList arrayList, org.telegram.ui.ActionBar.n2 n2Var, org.telegram.ui.ActionBar.f6 f6Var, View view, int i10) {
        bv bvVar = rvVar.e;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = null;
        int i11 = 0;
        if (arrayList == null || arrayList.size() <= 1) {
            org.telegram.ui.ActionBar.n1 n1Var = rvVar.G;
            if (n1Var != null) {
                n1Var.d(true);
                rvVar.G = null;
                return;
            }
            if ((n2Var instanceof org.telegram.ui.co) && ((org.telegram.ui.co) n2Var).Y.getVisibility() == 0 && (view instanceof iv)) {
                z5 z5Var = ((iv) view).c;
                try {
                    TLRPC.Document document = z5Var.document;
                    if (document == null) {
                        document = q5.f(rvVar.currentAccount, z5Var.getDocumentId());
                    }
                    SpannableString spannableString = new SpannableString(MessageObject.findAnimatedEmojiEmoticon(document));
                    spannableString.setSpan(z5Var, 0, spannableString.length(), 33);
                    ((org.telegram.ui.co) n2Var).Y.E0.getText().append((CharSequence) spannableString);
                    rvVar.Y();
                    rvVar.dismiss();
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
        if (SystemClock.elapsedRealtime() - rvVar.Q < 250) {
            return;
        }
        int i12 = 0;
        while (true) {
            ArrayList[] arrayListArr = bvVar.c;
            if (i11 >= arrayListArr.length) {
                break;
            }
            int size = arrayListArr[i11].size();
            if (bvVar.c.length > 1) {
                size = Math.min(rvVar.y.J * 2, size);
            }
            i12 += size + 2;
            if (i10 < i12) {
                break;
            } else {
                i11++;
            }
        }
        ArrayList arrayList2 = bvVar.b;
        if (arrayList2 != null && i11 < arrayList2.size()) {
            tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) bvVar.b.get(i11);
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
        new cv(rvVar, n2Var, rvVar.getContext(), f6Var, arrayList3).show();
    }

    public static void o(rv rvVar, z5 z5Var) {
        org.telegram.ui.ActionBar.n1 n1Var = rvVar.G;
        if (n1Var == null) {
            return;
        }
        n1Var.d(true);
        rvVar.G = null;
        SpannableString spannableString = new SpannableString(MessageObject.findAnimatedEmojiEmoticon(q5.f(rvVar.currentAccount, z5Var.getDocumentId())));
        spannableString.setSpan(z5Var, 0, spannableString.length(), 33);
        if (AndroidUtilities.addToClipboard(spannableString)) {
            org.telegram.messenger.vl.o(R.string.EmojiCopied, new yc((FrameLayout) rvVar.containerView, rvVar.resourcesProvider));
        }
    }

    public static /* synthetic */ void p(rv rvVar, ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        rvVar.J = floatValue;
        rvVar.h.setAlpha(floatValue);
        rvVar.v.setAlpha(rvVar.J);
        rvVar.w.setAlpha(rvVar.J);
        rvVar.containerView.invalidate();
    }

    public final int V() {
        if (this.containerView == null) {
            return 0;
        }
        di.v vVar = this.h;
        if (vVar == null || vVar.getChildCount() < 1) {
            return this.containerView.getPaddingTop();
        }
        View childAt = vVar.getChildAt(0);
        jn jnVar = this.d;
        return childAt != jnVar ? this.containerView.getPaddingTop() : jnVar.getBottom() + ((int) vVar.getY());
    }

    public final void Z() {
        org.telegram.ui.ActionBar.n2 n2Var = this.c;
        if (n2Var != null) {
            new sg.a1(n2Var, 11, false).show();
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
        bv bvVar = this.e;
        ArrayList arrayList = bvVar.b == null ? new ArrayList() : new ArrayList(bvVar.b);
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
        boolean z10 = bvVar.a != null && arrayList.size() == bvVar.a.size();
        if (!this.S && z10 && this.R == null) {
            this.R = ValueAnimator.ofFloat(this.J, 1.0f);
            this.containerView.getY();
            this.R.addUpdateListener(new l6(this, 16));
            this.R.setDuration(250L);
            this.R.setInterpolator(pr.h);
            this.R.start();
        }
        this.S = z10;
        di.v vVar = this.h;
        if (!z10) {
            vVar.setAlpha(0.0f);
        } else if (this.O >= 0) {
            int L0 = this.y.L0();
            int E = this.n.E(this.O);
            if (Math.abs(L0 - E) > 54) {
                int i14 = L0 < E ? 0 : 1;
                ok0 ok0Var = this.E;
                ok0Var.b = i14;
                ok0Var.c(E, (AndroidUtilities.displaySize.y / 2) - AndroidUtilities.dp(170.0f), false, false);
            } else {
                vVar.x0(E);
            }
            this.K = this.n.E(this.O);
            fv fvVar = this.n;
            int i15 = this.O;
            rv rvVar = fvVar.c;
            boolean z11 = rvVar.I;
            bv bvVar2 = rvVar.e;
            int i16 = z11 ? 2 : 1;
            int i17 = 0;
            while (true) {
                ArrayList[] arrayListArr = bvVar2.c;
                if (i17 >= arrayListArr.length) {
                    break;
                }
                int size = arrayListArr[i17].size();
                if (bvVar2.c.length > 1) {
                    size = Math.min(rvVar.y.J * 2, size);
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
            vVar.invalidate();
            this.O = -1;
        }
        boolean z12 = this.S;
        sg.r0 r0Var = this.x;
        TextView textView = this.w;
        TextView textView2 = this.v;
        if (!z12 || this.H) {
            r0Var.setVisibility(8);
            textView2.setVisibility(8);
            textView.setVisibility(8);
            b0(false);
            return;
        }
        r0Var.setVisibility(4);
        if (arrayList4.size() > 0) {
            textView2.setVisibility(0);
            textView.setVisibility(8);
            if (arrayList4.size() == 1) {
                textView2.setText(LocaleController.formatPluralString("AddManyEmojiCount", ((TLRPC.TL_messages_stickerSet) arrayList4.get(0)).documents.size(), new Object[0]));
            } else {
                textView2.setText(LocaleController.formatPluralString("AddManyEmojiPacksCount", arrayList4.size(), new Object[0]));
            }
            textView2.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.wu
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
                                rv rvVar2 = this;
                                if (i18 >= size3) {
                                    rvVar2.X(true);
                                    if (size2 <= 1) {
                                        rvVar2.dismiss();
                                        break;
                                    }
                                } else {
                                    rv.W(rvVar2.c, (TLObject) arrayList5.get(i18), size2 == 1, size2 > 1 ? new gi.m0(rvVar2, iArr, size2, arrayList5) : null, null);
                                    i18++;
                                }
                            }
                            break;
                        default:
                            rv rvVar3 = this;
                            rvVar3.dismiss();
                            org.telegram.ui.ActionBar.n2 n2Var = rvVar3.c;
                            ArrayList<TLRPC.TL_messages_stickerSet> arrayList6 = arrayList4;
                            if (n2Var != null) {
                                MediaDataController.getInstance(n2Var.getCurrentAccount()).removeMultipleStickerSets(n2Var.getContext(), n2Var, arrayList6);
                            } else {
                                int i19 = 0;
                                while (i19 < arrayList6.size()) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = arrayList6.get(i19);
                                    Context context = rvVar3.getContext();
                                    boolean z13 = i19 == 0;
                                    if (tL_messages_stickerSet2 != null) {
                                        MediaDataController.getInstance(UserConfig.selectedAccount).toggleStickerSet(context, tL_messages_stickerSet2, 0, null, true, z13, null, true);
                                    }
                                    i19++;
                                }
                            }
                            rvVar3.X(false);
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
        textView.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.wu
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
                            rv rvVar2 = this;
                            if (i18 >= size3) {
                                rvVar2.X(true);
                                if (size2 <= 1) {
                                    rvVar2.dismiss();
                                    break;
                                }
                            } else {
                                rv.W(rvVar2.c, (TLObject) arrayList5.get(i18), size2 == 1, size2 > 1 ? new gi.m0(rvVar2, iArr, size2, arrayList5) : null, null);
                                i18++;
                            }
                        }
                        break;
                    default:
                        rv rvVar3 = this;
                        rvVar3.dismiss();
                        org.telegram.ui.ActionBar.n2 n2Var = rvVar3.c;
                        ArrayList<TLRPC.TL_messages_stickerSet> arrayList6 = arrayList2;
                        if (n2Var != null) {
                            MediaDataController.getInstance(n2Var.getCurrentAccount()).removeMultipleStickerSets(n2Var.getContext(), n2Var, arrayList6);
                        } else {
                            int i19 = 0;
                            while (i19 < arrayList6.size()) {
                                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = arrayList6.get(i19);
                                Context context = rvVar3.getContext();
                                boolean z13 = i19 == 0;
                                if (tL_messages_stickerSet2 != null) {
                                    MediaDataController.getInstance(UserConfig.selectedAccount).toggleStickerSet(context, tL_messages_stickerSet2, 0, null, true, z13, null, true);
                                }
                                i19++;
                            }
                        }
                        rvVar3.X(false);
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
        di.v vVar = this.h;
        View view = this.r;
        FrameLayout frameLayout = this.s;
        float f7 = 0.0f;
        if (z11) {
            ViewPropertyAnimator duration = frameLayout.animate().translationY(z10 ? dp : AndroidUtilities.dp(16.0f)).alpha(z10 ? 1.0f : 0.0f).setDuration(250L);
            pr prVar = pr.h;
            duration.setInterpolator(prVar).start();
            view.animate().translationY(z10 ? -(AndroidUtilities.dp(68.0f) - dp) : 0.0f).alpha(z10 ? 1.0f : 0.0f).setDuration(250L).setInterpolator(prVar).start();
            ViewPropertyAnimator animate = vVar.animate();
            if (!z12 && !z10) {
                f7 = AndroidUtilities.dp(68.0f) - dp;
            }
            animate.translationY(f7).setDuration(250L).setInterpolator(prVar).start();
        } else {
            frameLayout.setAlpha(z10 ? 1.0f : 0.0f);
            frameLayout.setTranslationY(z10 ? dp : AndroidUtilities.dp(16.0f));
            view.setAlpha(z10 ? 1.0f : 0.0f);
            view.setTranslationY(z10 ? -(AndroidUtilities.dp(68.0f) - dp) : 0.0f);
            if (!z12 && !z10) {
                f7 = AndroidUtilities.dp(68.0f) - dp;
            }
            vVar.setTranslationY(f7);
        }
        this.P = z10;
    }

    @Override // org.telegram.ui.ActionBar.f3
    public final boolean canDismissWithSwipe() {
        return false;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        mv mvVar;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet;
        if (i10 != NotificationCenter.stickersDidLoad) {
            return;
        }
        int i12 = 0;
        while (true) {
            di.v vVar = this.h;
            if (i12 >= vVar.getChildCount()) {
                a0();
                return;
            }
            View childAt = vVar.getChildAt(i12);
            if ((childAt instanceof mv) && (tL_messages_stickerSet = (mvVar = (mv) childAt).r) != null && tL_messages_stickerSet.set != null) {
                mvVar.a(MediaDataController.getInstance(this.currentAccount).isStickerPackInstalled(mvVar.r.set.id), true);
            }
            i12++;
        }
    }

    @Override // org.telegram.ui.ActionBar.f3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.j2
    public void dismiss() {
        hv hvVar = this.f;
        if (hvVar != null && hvVar.w) {
            hvVar.w = false;
            hvVar.invalidate();
        }
        super.dismiss();
        bv bvVar = this.e;
        if (bvVar != null) {
            NotificationCenter.getInstance(bvVar.d).removeObserver(bvVar, NotificationCenter.groupStickersDidLoad);
        }
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 4);
    }

    @Override // org.telegram.ui.ActionBar.f3
    public final int getContainerViewHeight() {
        di.v vVar = this.h;
        int measuredHeight = (vVar == null ? 0 : vVar.getMeasuredHeight()) - V();
        ViewGroup viewGroup = this.containerView;
        return AndroidUtilities.dp(8.0f) + measuredHeight + (viewGroup != null ? viewGroup.getPaddingTop() : 0) + AndroidUtilities.navigationBarHeight;
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.stickersDidLoad);
    }

    @Override // org.telegram.ui.ActionBar.f3, android.app.Dialog
    public final void onBackPressed() {
        if (org.telegram.ui.st.q().E) {
            org.telegram.ui.st.q().o();
        } else {
            super.onBackPressed();
        }
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.stickersDidLoad);
    }

    @Override // org.telegram.ui.ActionBar.f3, android.app.Dialog
    public final void show() {
        TLRPC.StickerSet stickerSet;
        super.show();
        fv fvVar = new fv(this);
        this.n = fvVar;
        this.h.setAdapter(fvVar);
        int i10 = 0;
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 4);
        bv bvVar = this.e;
        if (!bvVar.e) {
            bvVar.e = true;
            rv rvVar = bvVar.f;
            int i11 = bvVar.d;
            bvVar.b = new ArrayList(bvVar.a.size());
            bvVar.c = new ArrayList[bvVar.a.size()];
            NotificationCenter.getInstance(i11).addObserver(bvVar, NotificationCenter.groupStickersDidLoad);
            boolean[] zArr = new boolean[1];
            int i12 = 0;
            while (true) {
                if (i12 < bvVar.c.length) {
                    TLRPC.TL_messages_stickerSet stickerSet2 = MediaDataController.getInstance(i11).getStickerSet((TLRPC.InputStickerSet) bvVar.a.get(i12), null, false, new org.telegram.ui.nf(14, bvVar, zArr));
                    if (bvVar.c.length != 1 || stickerSet2 == null || (stickerSet = stickerSet2.set) == null || stickerSet.emojis) {
                        bvVar.b.add(stickerSet2);
                        bvVar.a(i12, stickerSet2);
                        i12++;
                    } else {
                        AndroidUtilities.runOnUIThread(new nv(bvVar, i10));
                        Context context = rvVar.getContext();
                        org.telegram.ui.ActionBar.n2 n2Var = rvVar.c;
                        TLRPC.InputStickerSet inputStickerSet = (TLRPC.InputStickerSet) bvVar.a.get(i12);
                        org.telegram.ui.ActionBar.n2 n2Var2 = rvVar.c;
                        new ux0(context, n2Var, inputStickerSet, null, n2Var2 instanceof org.telegram.ui.co ? ((org.telegram.ui.co) n2Var2).Y : null, rvVar.resourcesProvider).show();
                    }
                } else {
                    rv rvVar2 = bvVar.h;
                    rvVar2.a0();
                    di.v vVar = rvVar2.h;
                    if (vVar != null && vVar.getAdapter() != null) {
                        vVar.getAdapter().l();
                    }
                }
            }
        }
        a0();
        org.telegram.ui.ActionBar.n2 n2Var3 = this.c;
        MediaDataController.getInstance(n2Var3 == null ? UserConfig.selectedAccount : n2Var3.getCurrentAccount()).checkStickers(5);
    }

    public void X(boolean z10) {
    }

    public void Y() {
    }
}
