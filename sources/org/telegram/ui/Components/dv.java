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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public class dv extends org.telegram.ui.ActionBar.f3 implements NotificationCenter.NotificationCenterDelegate {
    public static Pattern R;
    public final c2.y A;
    public final jp B;
    public org.telegram.ui.ActionBar.o1 C;
    public final boolean D;
    public boolean E;
    public float F;
    public int G;
    public int H;
    public final y5 I;
    public final mu J;
    public int K;
    public boolean L;
    public long M;
    public ValueAnimator N;
    public boolean O;
    public PorterDuffColorFilter P;
    public int Q;
    public LongSparseArray b;
    public final org.telegram.ui.ActionBar.o2 c;
    public final an d;
    public final nu e;
    public final tu f;
    public final kh.w h;
    public ru n;
    public final View r;
    public final FrameLayout s;
    public final TextView v;
    public final TextView w;
    public final zf.p0 x;
    public final f2.y y;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public dv(org.telegram.ui.ActionBar.o2 o2Var, Context context, org.telegram.ui.ActionBar.b6 b6Var, ArrayList arrayList) {
        super(context, r4, false, false);
        org.telegram.ui.ActionBar.b6 resourceProvider = (o2Var == null || o2Var.getResourceProvider() == null) ? b6Var : o2Var.getResourceProvider();
        this.G = -1;
        this.H = -1;
        this.J = new mu(this);
        this.K = -1;
        this.L = false;
        this.O = true;
        this.c = o2Var;
        fixNavigationBar();
        if (arrayList != null) {
            this.D = arrayList.size() > 1;
        }
        this.e = new nu(this.currentAccount, arrayList, this);
        float dp = AndroidUtilities.dp(32.0f);
        float dp2 = AndroidUtilities.dp(3.5f);
        int i9 = org.telegram.ui.ActionBar.f6.Oh;
        this.B = new jp(dp, dp2, getThemedColor(i9));
        tu tuVar = new tu(this, context);
        this.f = tuVar;
        this.containerView = tuVar;
        int i10 = 12;
        this.d = new an(context, i10);
        kh.w wVar = new kh.w(this, context, this.resourcesProvider);
        this.h = wVar;
        this.I = new y5(0.0f, wVar, 0L, 1250L, gr.i);
        ViewGroup viewGroup = this.containerView;
        int i11 = this.backgroundPaddingLeft;
        viewGroup.setPadding(i11, AndroidUtilities.statusBarHeight, i11, 0);
        this.containerView.setClipChildren(false);
        this.containerView.setClipToPadding(false);
        this.containerView.setWillNotDraw(false);
        wVar.setWillNotDraw(false);
        wVar.setSelectorRadius(AndroidUtilities.dp(6.0f));
        wVar.setSelectorDrawableColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.i6, resourceProvider));
        wVar.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(this.D ? 8.0f : 68.0f));
        f2.y yVar = new f2.y(8);
        this.y = yVar;
        wVar.setLayoutManager(yVar);
        int i12 = 3;
        wVar.i(new bg.p2(this, i12));
        wVar.j(new kn(this, 2));
        mm mmVar = new mm(this, arrayList, o2Var, resourceProvider);
        wVar.setOnItemClickListener(mmVar);
        wVar.setOnItemLongClickListener((ok0) new g1(20, this, context));
        wVar.setOnTouchListener(new kh.r1(i12, this, mmVar));
        yVar.k1(false);
        yVar.O = new pu(this);
        this.A = new c2.y(wVar, yVar);
        this.containerView.addView(wVar, g7.e6.e(-1, -1, 51));
        View view = new View(context);
        this.r = view;
        view.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.V5, false));
        this.containerView.addView(view, g7.e6.a(-1.0f, 1.0f / AndroidUtilities.density, 80));
        view.setTranslationY(-AndroidUtilities.dp(68.0f));
        FrameLayout frameLayout = new FrameLayout(context);
        this.s = frameLayout;
        frameLayout.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.f6.h5));
        this.containerView.addView(frameLayout, g7.e6.e(-1, 68, 87));
        TextView textView = new TextView(context);
        this.v = textView;
        textView.setVisibility(8);
        textView.setBackground(org.telegram.ui.ActionBar.v5.e(new float[]{24.0f}, getThemedColor(i9)));
        textView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.f6.Sh));
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(17);
        g7.g6.b(textView, 0.02f, 1.2f);
        TextView g10 = org.telegram.ui.Cells.j2.g(frameLayout, textView, g7.e6.d(-1, 48.0f, 80, 12.0f, 10.0f, 12.0f, 10.0f), context);
        this.w = g10;
        g10.setVisibility(8);
        int i13 = org.telegram.ui.ActionBar.f6.q7;
        g10.setBackground(org.telegram.ui.ActionBar.f6.Y(getThemedColor(i13) & 268435455, 0, 0));
        g10.setTextColor(getThemedColor(i13));
        g10.setTypeface(AndroidUtilities.bold());
        g10.setGravity(17);
        g10.setClickable(true);
        frameLayout.addView(g10, g7.e6.d(-1, -1.0f, 80, 0.0f, 0.0f, 0.0f, 19.0f));
        zf.p0 p0Var = new zf.p0(context, this.resourcesProvider, false);
        this.x = p0Var;
        p0Var.a(LocaleController.getString(R.string.UnlockPremiumEmoji), new f0(this, i10), false);
        p0Var.setIcon(R.raw.unlock_icon);
        p0Var.r.setClickable(true);
        frameLayout.addView(p0Var, g7.e6.d(-1, 48.0f, 80, 12.0f, 10.0f, 12.0f, 10.0f));
    }

    public static void O(dv dvVar, int i9) {
        ArrayList arrayList;
        String str;
        org.telegram.ui.ActionBar.o2 o2Var = dvVar.c;
        nu nuVar = dvVar.e;
        if (nuVar == null || (arrayList = nuVar.b) == null || arrayList.isEmpty()) {
            return;
        }
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) nuVar.b.get(0);
        TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
        if (stickerSet == null || !stickerSet.emojis) {
            str = "https://" + MessagesController.getInstance(dvVar.currentAccount).linkPrefix + "/addstickers/" + tL_messages_stickerSet.set.short_name;
        } else {
            str = "https://" + MessagesController.getInstance(dvVar.currentAccount).linkPrefix + "/addemoji/" + tL_messages_stickerSet.set.short_name;
        }
        String str2 = str;
        if (i9 != 1) {
            if (i9 == 2) {
                try {
                    AndroidUtilities.addToClipboard(str2);
                    new oc((FrameLayout) dvVar.containerView, dvVar.resourcesProvider).k(false).j();
                    return;
                } catch (Exception e10) {
                    FileLog.e(e10);
                    return;
                }
            }
            return;
        }
        Context parentActivity = o2Var != null ? o2Var.getParentActivity() : null;
        if (parentActivity == null) {
            parentActivity = dvVar.getContext();
        }
        qu quVar = new qu(dvVar, parentActivity, str2, str2, dvVar.resourcesProvider);
        if (o2Var != null) {
            o2Var.showDialog(quVar);
        } else {
            quVar.show();
        }
    }

    public static void V(final org.telegram.ui.ActionBar.o2 o2Var, TLObject tLObject, final boolean z10, final gh.g8 g8Var, final np npVar) {
        final int currentAccount = o2Var == null ? UserConfig.selectedAccount : o2Var.getCurrentAccount();
        TLRPC.StickerSet stickerSet = null;
        final View fragmentView = o2Var == null ? null : o2Var.getFragmentView();
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
            if (g8Var != null) {
                g8Var.run(Boolean.TRUE);
            }
        } else {
            TLRPC.TL_messages_installStickerSet tL_messages_installStickerSet = new TLRPC.TL_messages_installStickerSet();
            TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
            tL_messages_installStickerSet.stickerset = tL_inputStickerSetID;
            tL_inputStickerSetID.id = stickerSet2.id;
            tL_inputStickerSetID.access_hash = stickerSet2.access_hash;
            ConnectionsManager.getInstance(currentAccount).sendRequest(tL_messages_installStickerSet, new RequestDelegate() { // from class: org.telegram.ui.Components.lu
                @Override // org.telegram.tgnet.RequestDelegate
                public final void run(final TLObject tLObject2, final TLRPC.TL_error tL_error) {
                    final TLRPC.StickerSet stickerSet3 = TLRPC.StickerSet.this;
                    final boolean z11 = z10;
                    final View view = fragmentView;
                    final org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                    final TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = tL_messages_stickerSet;
                    final int i9 = currentAccount;
                    final Utilities.Callback callback = g8Var;
                    final Runnable runnable = npVar;
                    AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.Components.ku
                        @Override // java.lang.Runnable
                        public final void run() {
                            TLObject tLObject3 = tLObject2;
                            TLRPC.StickerSet stickerSet4 = TLRPC.StickerSet.this;
                            int i10 = stickerSet4.masks ? 1 : stickerSet4.emojis ? 5 : 0;
                            TLRPC.TL_error tL_error2 = tL_error;
                            View view2 = view;
                            org.telegram.ui.ActionBar.o2 o2Var3 = o2Var2;
                            int i11 = i9;
                            Utilities.Callback callback2 = callback;
                            try {
                                if (tL_error2 == null) {
                                    if (z11 && view2 != null) {
                                        Context context = o2Var3.getFragmentView().getContext();
                                        TLObject tLObject4 = tL_messages_stickerSet2;
                                        gc.g(o2Var3, new iw0(context, tLObject4 == null ? stickerSet4 : tLObject4, 1, 2, null, o2Var3.getResourceProvider()), 1500).j();
                                    }
                                    if (tLObject3 instanceof TLRPC.TL_messages_stickerSetInstallResultArchive) {
                                        MediaDataController.getInstance(i11).processStickerSetInstallResultArchive(o2Var3, true, i10, (TLRPC.TL_messages_stickerSetInstallResultArchive) tLObject3);
                                    }
                                    if (callback2 != null) {
                                        callback2.run(Boolean.TRUE);
                                    }
                                } else if (view2 != null) {
                                    Toast.makeText(o2Var3.getFragmentView().getContext(), LocaleController.getString(R.string.ErrorOccurred), 0).show();
                                    if (callback2 != null) {
                                        callback2.run(Boolean.FALSE);
                                    }
                                } else if (callback2 != null) {
                                    callback2.run(Boolean.FALSE);
                                }
                            } catch (Exception e10) {
                                FileLog.e(e10);
                            }
                            MediaDataController.getInstance(i11).loadStickers(i10, false, true, false, new v2(runnable, 5));
                        }
                    });
                }
            });
        }
    }

    public static void n(dv dvVar, ArrayList arrayList, org.telegram.ui.ActionBar.o2 o2Var, org.telegram.ui.ActionBar.b6 b6Var, View view, int i9) {
        nu nuVar = dvVar.e;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = null;
        int i10 = 0;
        if (arrayList == null || arrayList.size() <= 1) {
            org.telegram.ui.ActionBar.o1 o1Var = dvVar.C;
            if (o1Var != null) {
                o1Var.d(true);
                dvVar.C = null;
                return;
            }
            if ((o2Var instanceof org.telegram.ui.qn) && ((org.telegram.ui.qn) o2Var).U.getVisibility() == 0 && (view instanceof uu)) {
                t5 t5Var = ((uu) view).c;
                try {
                    TLRPC.Document document = t5Var.document;
                    if (document == null) {
                        document = k5.f(dvVar.currentAccount, t5Var.getDocumentId());
                    }
                    SpannableString spannableString = new SpannableString(MessageObject.findAnimatedEmojiEmoticon(document));
                    spannableString.setSpan(t5Var, 0, spannableString.length(), 33);
                    ((org.telegram.ui.qn) o2Var).U.A0.getText().append((CharSequence) spannableString);
                    dvVar.X();
                    dvVar.dismiss();
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
        if (SystemClock.elapsedRealtime() - dvVar.M < 250) {
            return;
        }
        int i11 = 0;
        while (true) {
            ArrayList[] arrayListArr = nuVar.c;
            if (i10 >= arrayListArr.length) {
                break;
            }
            int size = arrayListArr[i10].size();
            if (nuVar.c.length > 1) {
                size = Math.min(dvVar.y.J * 2, size);
            }
            i11 += size + 2;
            if (i9 < i11) {
                break;
            } else {
                i10++;
            }
        }
        ArrayList arrayList2 = nuVar.b;
        if (arrayList2 != null && i10 < arrayList2.size()) {
            tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) nuVar.b.get(i10);
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
        new ou(dvVar, o2Var, dvVar.getContext(), b6Var, arrayList3).show();
    }

    public static void o(dv dvVar, t5 t5Var) {
        org.telegram.ui.ActionBar.o1 o1Var = dvVar.C;
        if (o1Var == null) {
            return;
        }
        o1Var.d(true);
        dvVar.C = null;
        SpannableString spannableString = new SpannableString(MessageObject.findAnimatedEmojiEmoticon(k5.f(dvVar.currentAccount, t5Var.getDocumentId())));
        spannableString.setSpan(t5Var, 0, spannableString.length(), 33);
        if (AndroidUtilities.addToClipboard(spannableString)) {
            org.telegram.messenger.ll.o(R.string.EmojiCopied, new oc((FrameLayout) dvVar.containerView, dvVar.resourcesProvider));
        }
    }

    public static /* synthetic */ void p(dv dvVar, ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        dvVar.F = floatValue;
        dvVar.h.setAlpha(floatValue);
        dvVar.v.setAlpha(dvVar.F);
        dvVar.w.setAlpha(dvVar.F);
        dvVar.containerView.invalidate();
    }

    public final int U() {
        if (this.containerView == null) {
            return 0;
        }
        kh.w wVar = this.h;
        if (wVar == null || wVar.getChildCount() < 1) {
            return this.containerView.getPaddingTop();
        }
        View childAt = wVar.getChildAt(0);
        an anVar = this.d;
        return childAt != anVar ? this.containerView.getPaddingTop() : anVar.getBottom() + ((int) wVar.getY());
    }

    public final void Y() {
        org.telegram.ui.ActionBar.o2 o2Var = this.c;
        if (o2Var != null) {
            new zf.x0(o2Var, 11, false).show();
        } else if (getContext() instanceof LaunchActivity) {
            ((LaunchActivity) getContext()).p0(new PremiumPreviewFragment(0, null));
        }
    }

    public final void Z() {
        final int i9;
        TLRPC.StickerSet stickerSet;
        if (this.s == null) {
            return;
        }
        nu nuVar = this.e;
        ArrayList arrayList = nuVar.b == null ? new ArrayList() : new ArrayList(nuVar.b);
        final int i10 = 0;
        int i11 = 0;
        while (true) {
            i9 = 1;
            if (i11 >= arrayList.size()) {
                break;
            }
            if (arrayList.get(i11) == null) {
                arrayList.remove(i11);
                i11--;
            }
            i11++;
        }
        MediaDataController mediaDataController = MediaDataController.getInstance(this.currentAccount);
        final ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) arrayList.get(i12);
            if (tL_messages_stickerSet != null && (stickerSet = tL_messages_stickerSet.set) != null) {
                if (mediaDataController.isStickerPackInstalled(stickerSet.id)) {
                    arrayList2.add(tL_messages_stickerSet);
                } else {
                    arrayList3.add(tL_messages_stickerSet);
                }
            }
        }
        final ArrayList arrayList4 = new ArrayList(arrayList3);
        boolean z10 = nuVar.a != null && arrayList.size() == nuVar.a.size();
        if (!this.O && z10 && this.N == null) {
            this.N = ValueAnimator.ofFloat(this.F, 1.0f);
            this.containerView.getY();
            this.N.addUpdateListener(new e6(this, 16));
            this.N.setDuration(250L);
            this.N.setInterpolator(gr.h);
            this.N.start();
        }
        this.O = z10;
        kh.w wVar = this.h;
        if (!z10) {
            wVar.setAlpha(0.0f);
        } else if (this.K >= 0) {
            int L0 = this.y.L0();
            int E = this.n.E(this.K);
            if (Math.abs(L0 - E) > 54) {
                int i13 = L0 < E ? 0 : 1;
                c2.y yVar = this.A;
                yVar.b = i13;
                yVar.c(E, (AndroidUtilities.displaySize.y / 2) - AndroidUtilities.dp(170.0f), false, false);
            } else {
                wVar.x0(E);
            }
            this.G = this.n.E(this.K);
            ru ruVar = this.n;
            int i14 = this.K;
            dv dvVar = ruVar.c;
            boolean z11 = dvVar.E;
            nu nuVar2 = dvVar.e;
            int i15 = z11 ? 2 : 1;
            int i16 = 0;
            while (true) {
                ArrayList[] arrayListArr = nuVar2.c;
                if (i16 >= arrayListArr.length) {
                    break;
                }
                int size = arrayListArr[i16].size();
                if (nuVar2.c.length > 1) {
                    size = Math.min(dvVar.y.J * 2, size);
                }
                if (i16 == i14) {
                    i15 = i15 + size + 1;
                    break;
                } else {
                    i15 += size + 2;
                    i16++;
                }
            }
            this.H = i15;
            this.I.d(1.0f, true);
            wVar.invalidate();
            this.K = -1;
        }
        boolean z12 = this.O;
        zf.p0 p0Var = this.x;
        TextView textView = this.w;
        TextView textView2 = this.v;
        if (!z12 || this.D) {
            p0Var.setVisibility(8);
            textView2.setVisibility(8);
            textView.setVisibility(8);
            a0(false);
            return;
        }
        p0Var.setVisibility(4);
        if (arrayList4.size() > 0) {
            textView2.setVisibility(0);
            textView.setVisibility(8);
            if (arrayList4.size() == 1) {
                textView2.setText(LocaleController.formatPluralString("AddManyEmojiCount", ((TLRPC.TL_messages_stickerSet) arrayList4.get(0)).documents.size(), new Object[0]));
            } else {
                textView2.setText(LocaleController.formatPluralString("AddManyEmojiPacksCount", arrayList4.size(), new Object[0]));
            }
            textView2.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.ju
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i10) {
                        case 0:
                            ArrayList arrayList5 = arrayList4;
                            int size2 = arrayList5.size();
                            int[] iArr = new int[2];
                            int i17 = 0;
                            while (true) {
                                int size3 = arrayList5.size();
                                dv dvVar2 = this;
                                if (i17 >= size3) {
                                    dvVar2.W(true);
                                    if (size2 <= 1) {
                                        dvVar2.dismiss();
                                        break;
                                    }
                                } else {
                                    dv.V(dvVar2.c, (TLObject) arrayList5.get(i17), size2 == 1, size2 > 1 ? new gh.g8(dvVar2, iArr, size2, arrayList5) : null, null);
                                    i17++;
                                }
                            }
                            break;
                        default:
                            dv dvVar3 = this;
                            dvVar3.dismiss();
                            org.telegram.ui.ActionBar.o2 o2Var = dvVar3.c;
                            ArrayList<TLRPC.TL_messages_stickerSet> arrayList6 = arrayList4;
                            if (o2Var != null) {
                                MediaDataController.getInstance(o2Var.getCurrentAccount()).removeMultipleStickerSets(o2Var.getContext(), o2Var, arrayList6);
                            } else {
                                int i18 = 0;
                                while (i18 < arrayList6.size()) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = arrayList6.get(i18);
                                    Context context = dvVar3.getContext();
                                    boolean z13 = i18 == 0;
                                    if (tL_messages_stickerSet2 != null) {
                                        MediaDataController.getInstance(UserConfig.selectedAccount).toggleStickerSet(context, tL_messages_stickerSet2, 0, null, true, z13, null, true);
                                    }
                                    i18++;
                                }
                            }
                            dvVar3.W(false);
                            break;
                    }
                }
            });
            a0(true);
            return;
        }
        if (arrayList2.size() <= 0) {
            textView2.setVisibility(8);
            textView.setVisibility(8);
            a0(false);
            return;
        }
        textView2.setVisibility(8);
        textView.setVisibility(0);
        if (arrayList2.size() == 1) {
            textView.setText(LocaleController.formatPluralString("RemoveManyEmojiCount", ((TLRPC.TL_messages_stickerSet) arrayList2.get(0)).documents.size(), new Object[0]));
        } else {
            textView.setText(LocaleController.formatPluralString("RemoveManyEmojiPacksCount", arrayList2.size(), new Object[0]));
        }
        textView.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.ju
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i9) {
                    case 0:
                        ArrayList arrayList5 = arrayList2;
                        int size2 = arrayList5.size();
                        int[] iArr = new int[2];
                        int i17 = 0;
                        while (true) {
                            int size3 = arrayList5.size();
                            dv dvVar2 = this;
                            if (i17 >= size3) {
                                dvVar2.W(true);
                                if (size2 <= 1) {
                                    dvVar2.dismiss();
                                    break;
                                }
                            } else {
                                dv.V(dvVar2.c, (TLObject) arrayList5.get(i17), size2 == 1, size2 > 1 ? new gh.g8(dvVar2, iArr, size2, arrayList5) : null, null);
                                i17++;
                            }
                        }
                        break;
                    default:
                        dv dvVar3 = this;
                        dvVar3.dismiss();
                        org.telegram.ui.ActionBar.o2 o2Var = dvVar3.c;
                        ArrayList<TLRPC.TL_messages_stickerSet> arrayList6 = arrayList2;
                        if (o2Var != null) {
                            MediaDataController.getInstance(o2Var.getCurrentAccount()).removeMultipleStickerSets(o2Var.getContext(), o2Var, arrayList6);
                        } else {
                            int i18 = 0;
                            while (i18 < arrayList6.size()) {
                                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = arrayList6.get(i18);
                                Context context = dvVar3.getContext();
                                boolean z13 = i18 == 0;
                                if (tL_messages_stickerSet2 != null) {
                                    MediaDataController.getInstance(UserConfig.selectedAccount).toggleStickerSet(context, tL_messages_stickerSet2, 0, null, true, z13, null, true);
                                }
                                i18++;
                            }
                        }
                        dvVar3.W(false);
                        break;
                }
            }
        });
        a0(true);
    }

    public final void a0(boolean z10) {
        boolean z11 = !this.L && z10;
        float dp = this.w.getVisibility() == 0 ? AndroidUtilities.dp(19.0f) : 0;
        boolean z12 = this.D;
        kh.w wVar = this.h;
        View view = this.r;
        FrameLayout frameLayout = this.s;
        float f10 = 0.0f;
        if (z11) {
            ViewPropertyAnimator duration = frameLayout.animate().translationY(z10 ? dp : AndroidUtilities.dp(16.0f)).alpha(z10 ? 1.0f : 0.0f).setDuration(250L);
            gr grVar = gr.h;
            duration.setInterpolator(grVar).start();
            view.animate().translationY(z10 ? -(AndroidUtilities.dp(68.0f) - dp) : 0.0f).alpha(z10 ? 1.0f : 0.0f).setDuration(250L).setInterpolator(grVar).start();
            ViewPropertyAnimator animate = wVar.animate();
            if (!z12 && !z10) {
                f10 = AndroidUtilities.dp(68.0f) - dp;
            }
            animate.translationY(f10).setDuration(250L).setInterpolator(grVar).start();
        } else {
            frameLayout.setAlpha(z10 ? 1.0f : 0.0f);
            frameLayout.setTranslationY(z10 ? dp : AndroidUtilities.dp(16.0f));
            view.setAlpha(z10 ? 1.0f : 0.0f);
            view.setTranslationY(z10 ? -(AndroidUtilities.dp(68.0f) - dp) : 0.0f);
            if (!z12 && !z10) {
                f10 = AndroidUtilities.dp(68.0f) - dp;
            }
            wVar.setTranslationY(f10);
        }
        this.L = z10;
    }

    @Override // org.telegram.ui.ActionBar.f3
    public final boolean canDismissWithSwipe() {
        return false;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        yu yuVar;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet;
        if (i9 != NotificationCenter.stickersDidLoad) {
            return;
        }
        int i11 = 0;
        while (true) {
            kh.w wVar = this.h;
            if (i11 >= wVar.getChildCount()) {
                Z();
                return;
            }
            View childAt = wVar.getChildAt(i11);
            if ((childAt instanceof yu) && (tL_messages_stickerSet = (yuVar = (yu) childAt).r) != null && tL_messages_stickerSet.set != null) {
                yuVar.a(MediaDataController.getInstance(this.currentAccount).isStickerPackInstalled(yuVar.r.set.id), true);
            }
            i11++;
        }
    }

    @Override // org.telegram.ui.ActionBar.f3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.k2
    public void dismiss() {
        tu tuVar = this.f;
        if (tuVar != null && tuVar.w) {
            tuVar.w = false;
            tuVar.invalidate();
        }
        super.dismiss();
        nu nuVar = this.e;
        if (nuVar != null) {
            NotificationCenter.getInstance(nuVar.d).removeObserver(nuVar, NotificationCenter.groupStickersDidLoad);
        }
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 4);
    }

    @Override // org.telegram.ui.ActionBar.f3
    public final int getContainerViewHeight() {
        kh.w wVar = this.h;
        int measuredHeight = (wVar == null ? 0 : wVar.getMeasuredHeight()) - U();
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
        if (org.telegram.ui.ht.q().E) {
            org.telegram.ui.ht.q().o();
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
        ru ruVar = new ru(this);
        this.n = ruVar;
        this.h.setAdapter(ruVar);
        int i9 = 0;
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 4);
        nu nuVar = this.e;
        if (!nuVar.e) {
            nuVar.e = true;
            dv dvVar = nuVar.f;
            int i10 = nuVar.d;
            nuVar.b = new ArrayList(nuVar.a.size());
            nuVar.c = new ArrayList[nuVar.a.size()];
            NotificationCenter.getInstance(i10).addObserver(nuVar, NotificationCenter.groupStickersDidLoad);
            boolean[] zArr = new boolean[1];
            int i11 = 0;
            while (true) {
                if (i11 < nuVar.c.length) {
                    TLRPC.TL_messages_stickerSet stickerSet2 = MediaDataController.getInstance(i10).getStickerSet((TLRPC.InputStickerSet) nuVar.a.get(i11), null, false, new org.telegram.ui.df(16, nuVar, zArr));
                    if (nuVar.c.length != 1 || stickerSet2 == null || (stickerSet = stickerSet2.set) == null || stickerSet.emojis) {
                        nuVar.b.add(stickerSet2);
                        nuVar.a(i11, stickerSet2);
                        i11++;
                    } else {
                        AndroidUtilities.runOnUIThread(new zu(nuVar, i9));
                        Context context = dvVar.getContext();
                        org.telegram.ui.ActionBar.o2 o2Var = dvVar.c;
                        TLRPC.InputStickerSet inputStickerSet = (TLRPC.InputStickerSet) nuVar.a.get(i11);
                        org.telegram.ui.ActionBar.o2 o2Var2 = dvVar.c;
                        new cx0(context, o2Var, inputStickerSet, null, o2Var2 instanceof org.telegram.ui.qn ? ((org.telegram.ui.qn) o2Var2).U : null, dvVar.resourcesProvider).show();
                    }
                } else {
                    dv dvVar2 = nuVar.h;
                    dvVar2.Z();
                    kh.w wVar = dvVar2.h;
                    if (wVar != null && wVar.getAdapter() != null) {
                        wVar.getAdapter().l();
                    }
                }
            }
        }
        Z();
        org.telegram.ui.ActionBar.o2 o2Var3 = this.c;
        MediaDataController.getInstance(o2Var3 == null ? UserConfig.selectedAccount : o2Var3.getCurrentAccount()).checkStickers(5);
    }

    public void W(boolean z10) {
    }

    public void X() {
    }
}
