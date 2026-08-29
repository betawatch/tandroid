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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public class jv extends org.telegram.ui.ActionBar.f3 implements NotificationCenter.NotificationCenterDelegate {
    public static Pattern R;
    public final c2.z A;
    public final np B;
    public org.telegram.ui.ActionBar.o1 C;
    public final boolean D;
    public boolean E;
    public float F;
    public int G;
    public int H;
    public final d6 I;
    public final su J;
    public int K;
    public boolean L;
    public long M;
    public ValueAnimator N;
    public boolean O;
    public PorterDuffColorFilter P;
    public int Q;
    public LongSparseArray b;
    public final org.telegram.ui.ActionBar.o2 c;
    public final fn d;
    public final tu e;
    public final zu f;
    public final nh.v h;
    public xu n;
    public final View r;
    public final FrameLayout s;
    public final TextView v;
    public final TextView w;
    public final cg.d1 x;
    public final f2.w y;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public jv(org.telegram.ui.ActionBar.o2 o2Var, Context context, org.telegram.ui.ActionBar.c6 c6Var, ArrayList arrayList) {
        super(context, r4, false, false);
        org.telegram.ui.ActionBar.c6 resourceProvider = (o2Var == null || o2Var.getResourceProvider() == null) ? c6Var : o2Var.getResourceProvider();
        this.G = -1;
        this.H = -1;
        this.J = new su(this);
        this.K = -1;
        this.L = false;
        this.O = true;
        this.c = o2Var;
        fixNavigationBar();
        if (arrayList != null) {
            this.D = arrayList.size() > 1;
        }
        this.e = new tu(this.currentAccount, arrayList, this);
        float dp = AndroidUtilities.dp(32.0f);
        float dp2 = AndroidUtilities.dp(3.5f);
        int i10 = org.telegram.ui.ActionBar.g6.Oh;
        this.B = new np(dp, dp2, getThemedColor(i10));
        zu zuVar = new zu(this, context);
        this.f = zuVar;
        this.containerView = zuVar;
        this.d = new fn(context, 9);
        nh.v vVar = new nh.v(this, context, this.resourcesProvider);
        this.h = vVar;
        this.I = new d6(0.0f, vVar, 0L, 1250L, jr.i);
        ViewGroup viewGroup = this.containerView;
        int i11 = this.backgroundPaddingLeft;
        viewGroup.setPadding(i11, AndroidUtilities.statusBarHeight, i11, 0);
        this.containerView.setClipChildren(false);
        this.containerView.setClipToPadding(false);
        this.containerView.setWillNotDraw(false);
        vVar.setWillNotDraw(false);
        vVar.setSelectorRadius(AndroidUtilities.dp(6.0f));
        vVar.setSelectorDrawableColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.i6, resourceProvider));
        vVar.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(this.D ? 8.0f : 68.0f));
        f2.w wVar = new f2.w(8);
        this.y = wVar;
        vVar.setLayoutManager(wVar);
        int i12 = 3;
        vVar.i(new eg.f2(this, i12));
        vVar.j(new cg.g2(this, 28));
        qm qmVar = new qm(this, arrayList, o2Var, resourceProvider);
        vVar.setOnItemClickListener(qmVar);
        vVar.setOnItemLongClickListener((bl0) new j1(20, this, context));
        vVar.setOnTouchListener(new nh.o1(i12, this, qmVar));
        wVar.k1(false);
        wVar.O = new vu(this);
        this.A = new c2.z(vVar, wVar);
        this.containerView.addView(vVar, i7.f6.e(-1, -1, 51));
        View view = new View(context);
        this.r = view;
        view.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.V5, false));
        this.containerView.addView(view, i7.f6.a(-1.0f, 1.0f / AndroidUtilities.density, 80));
        view.setTranslationY(-AndroidUtilities.dp(68.0f));
        FrameLayout frameLayout = new FrameLayout(context);
        this.s = frameLayout;
        frameLayout.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.g6.h5));
        this.containerView.addView(frameLayout, i7.f6.e(-1, 68, 87));
        TextView textView = new TextView(context);
        this.v = textView;
        textView.setVisibility(8);
        textView.setBackground(org.telegram.ui.ActionBar.w5.e(new float[]{24.0f}, getThemedColor(i10)));
        textView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.g6.Sh));
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(17);
        i7.h6.b(textView, 0.02f, 1.2f);
        TextView h = org.telegram.ui.th.h(frameLayout, textView, i7.f6.d(-1, 48.0f, 80, 12.0f, 10.0f, 12.0f, 10.0f), context);
        this.w = h;
        h.setVisibility(8);
        int i13 = org.telegram.ui.ActionBar.g6.q7;
        h.setBackground(org.telegram.ui.ActionBar.g6.Y(getThemedColor(i13) & 268435455, 0, 0));
        h.setTextColor(getThemedColor(i13));
        h.setTypeface(AndroidUtilities.bold());
        h.setGravity(17);
        h.setClickable(true);
        frameLayout.addView(h, i7.f6.d(-1, -1.0f, 80, 0.0f, 0.0f, 0.0f, 19.0f));
        cg.d1 d1Var = new cg.d1(context, this.resourcesProvider, false);
        this.x = d1Var;
        d1Var.a(LocaleController.getString(R.string.UnlockPremiumEmoji), new h0(this, 12), false);
        d1Var.setIcon(R.raw.unlock_icon);
        d1Var.r.setClickable(true);
        frameLayout.addView(d1Var, i7.f6.d(-1, 48.0f, 80, 12.0f, 10.0f, 12.0f, 10.0f));
    }

    public static void P(jv jvVar, int i10) {
        ArrayList arrayList;
        String str;
        org.telegram.ui.ActionBar.o2 o2Var = jvVar.c;
        tu tuVar = jvVar.e;
        if (tuVar == null || (arrayList = tuVar.b) == null || arrayList.isEmpty()) {
            return;
        }
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tuVar.b.get(0);
        TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
        if (stickerSet == null || !stickerSet.emojis) {
            str = "https://" + MessagesController.getInstance(jvVar.currentAccount).linkPrefix + "/addstickers/" + tL_messages_stickerSet.set.short_name;
        } else {
            str = "https://" + MessagesController.getInstance(jvVar.currentAccount).linkPrefix + "/addemoji/" + tL_messages_stickerSet.set.short_name;
        }
        String str2 = str;
        if (i10 != 1) {
            if (i10 == 2) {
                try {
                    AndroidUtilities.addToClipboard(str2);
                    new tc((FrameLayout) jvVar.containerView, jvVar.resourcesProvider).k(false).j();
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
            parentActivity = jvVar.getContext();
        }
        wu wuVar = new wu(jvVar, parentActivity, str2, str2, jvVar.resourcesProvider);
        if (o2Var != null) {
            o2Var.showDialog(wuVar);
        } else {
            wuVar.show();
        }
    }

    public static void W(final org.telegram.ui.ActionBar.o2 o2Var, TLObject tLObject, final boolean z10, final jh.d8 d8Var, final rp rpVar) {
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
            if (d8Var != null) {
                d8Var.run(Boolean.TRUE);
            }
        } else {
            TLRPC.TL_messages_installStickerSet tL_messages_installStickerSet = new TLRPC.TL_messages_installStickerSet();
            TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
            tL_messages_installStickerSet.stickerset = tL_inputStickerSetID;
            tL_inputStickerSetID.id = stickerSet2.id;
            tL_inputStickerSetID.access_hash = stickerSet2.access_hash;
            ConnectionsManager.getInstance(currentAccount).sendRequest(tL_messages_installStickerSet, new RequestDelegate() { // from class: org.telegram.ui.Components.ru
                @Override // org.telegram.tgnet.RequestDelegate
                public final void run(final TLObject tLObject2, final TLRPC.TL_error tL_error) {
                    final TLRPC.StickerSet stickerSet3 = TLRPC.StickerSet.this;
                    final boolean z11 = z10;
                    final View view = fragmentView;
                    final org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                    final TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = tL_messages_stickerSet;
                    final int i10 = currentAccount;
                    final Utilities.Callback callback = d8Var;
                    final Runnable runnable = rpVar;
                    AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.Components.qu
                        @Override // java.lang.Runnable
                        public final void run() {
                            TLObject tLObject3 = tLObject2;
                            TLRPC.StickerSet stickerSet4 = TLRPC.StickerSet.this;
                            int i11 = stickerSet4.masks ? 1 : stickerSet4.emojis ? 5 : 0;
                            TLRPC.TL_error tL_error2 = tL_error;
                            View view2 = view;
                            org.telegram.ui.ActionBar.o2 o2Var3 = o2Var2;
                            int i12 = i10;
                            Utilities.Callback callback2 = callback;
                            try {
                                if (tL_error2 == null) {
                                    if (z11 && view2 != null) {
                                        Context context = o2Var3.getFragmentView().getContext();
                                        TLObject tLObject4 = tL_messages_stickerSet2;
                                        mc.g(o2Var3, new sw0(context, tLObject4 == null ? stickerSet4 : tLObject4, 1, 2, null, o2Var3.getResourceProvider()), 1500).j();
                                    }
                                    if (tLObject3 instanceof TLRPC.TL_messages_stickerSetInstallResultArchive) {
                                        MediaDataController.getInstance(i12).processStickerSetInstallResultArchive(o2Var3, true, i11, (TLRPC.TL_messages_stickerSetInstallResultArchive) tLObject3);
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
                            MediaDataController.getInstance(i12).loadStickers(i11, false, true, false, new y2(runnable, 5));
                        }
                    });
                }
            });
        }
    }

    public static void n(jv jvVar, ArrayList arrayList, org.telegram.ui.ActionBar.o2 o2Var, org.telegram.ui.ActionBar.c6 c6Var, View view, int i10) {
        tu tuVar = jvVar.e;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = null;
        int i11 = 0;
        if (arrayList == null || arrayList.size() <= 1) {
            org.telegram.ui.ActionBar.o1 o1Var = jvVar.C;
            if (o1Var != null) {
                o1Var.d(true);
                jvVar.C = null;
                return;
            }
            if ((o2Var instanceof org.telegram.ui.tn) && ((org.telegram.ui.tn) o2Var).U.getVisibility() == 0 && (view instanceof av)) {
                y5 y5Var = ((av) view).c;
                try {
                    TLRPC.Document document = y5Var.document;
                    if (document == null) {
                        document = p5.f(jvVar.currentAccount, y5Var.getDocumentId());
                    }
                    SpannableString spannableString = new SpannableString(MessageObject.findAnimatedEmojiEmoticon(document));
                    spannableString.setSpan(y5Var, 0, spannableString.length(), 33);
                    ((org.telegram.ui.tn) o2Var).U.A0.getText().append((CharSequence) spannableString);
                    jvVar.Y();
                    jvVar.dismiss();
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
        if (SystemClock.elapsedRealtime() - jvVar.M < 250) {
            return;
        }
        int i12 = 0;
        while (true) {
            ArrayList[] arrayListArr = tuVar.c;
            if (i11 >= arrayListArr.length) {
                break;
            }
            int size = arrayListArr[i11].size();
            if (tuVar.c.length > 1) {
                size = Math.min(jvVar.y.J * 2, size);
            }
            i12 += size + 2;
            if (i10 < i12) {
                break;
            } else {
                i11++;
            }
        }
        ArrayList arrayList2 = tuVar.b;
        if (arrayList2 != null && i11 < arrayList2.size()) {
            tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tuVar.b.get(i11);
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
        new uu(jvVar, o2Var, jvVar.getContext(), c6Var, arrayList3).show();
    }

    public static void o(jv jvVar, y5 y5Var) {
        org.telegram.ui.ActionBar.o1 o1Var = jvVar.C;
        if (o1Var == null) {
            return;
        }
        o1Var.d(true);
        jvVar.C = null;
        SpannableString spannableString = new SpannableString(MessageObject.findAnimatedEmojiEmoticon(p5.f(jvVar.currentAccount, y5Var.getDocumentId())));
        spannableString.setSpan(y5Var, 0, spannableString.length(), 33);
        if (AndroidUtilities.addToClipboard(spannableString)) {
            org.telegram.ui.b.n(R.string.EmojiCopied, new tc((FrameLayout) jvVar.containerView, jvVar.resourcesProvider));
        }
    }

    public static /* synthetic */ void p(jv jvVar, ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        jvVar.F = floatValue;
        jvVar.h.setAlpha(floatValue);
        jvVar.v.setAlpha(jvVar.F);
        jvVar.w.setAlpha(jvVar.F);
        jvVar.containerView.invalidate();
    }

    public final int V() {
        if (this.containerView == null) {
            return 0;
        }
        nh.v vVar = this.h;
        if (vVar == null || vVar.getChildCount() < 1) {
            return this.containerView.getPaddingTop();
        }
        View childAt = vVar.getChildAt(0);
        fn fnVar = this.d;
        return childAt != fnVar ? this.containerView.getPaddingTop() : fnVar.getBottom() + ((int) vVar.getY());
    }

    public final void Z() {
        org.telegram.ui.ActionBar.o2 o2Var = this.c;
        if (o2Var != null) {
            new cg.p1(o2Var, 11, false).show();
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
        tu tuVar = this.e;
        ArrayList arrayList = tuVar.b == null ? new ArrayList() : new ArrayList(tuVar.b);
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
        boolean z10 = tuVar.a != null && arrayList.size() == tuVar.a.size();
        if (!this.O && z10 && this.N == null) {
            this.N = ValueAnimator.ofFloat(this.F, 1.0f);
            this.containerView.getY();
            this.N.addUpdateListener(new j6(this, 16));
            this.N.setDuration(250L);
            this.N.setInterpolator(jr.h);
            this.N.start();
        }
        this.O = z10;
        nh.v vVar = this.h;
        if (!z10) {
            vVar.setAlpha(0.0f);
        } else if (this.K >= 0) {
            int L0 = this.y.L0();
            int E = this.n.E(this.K);
            if (Math.abs(L0 - E) > 54) {
                int i14 = L0 < E ? 0 : 1;
                c2.z zVar = this.A;
                zVar.b = i14;
                zVar.c(E, (AndroidUtilities.displaySize.y / 2) - AndroidUtilities.dp(170.0f), false, false);
            } else {
                vVar.x0(E);
            }
            this.G = this.n.E(this.K);
            xu xuVar = this.n;
            int i15 = this.K;
            jv jvVar = xuVar.c;
            boolean z11 = jvVar.E;
            tu tuVar2 = jvVar.e;
            int i16 = z11 ? 2 : 1;
            int i17 = 0;
            while (true) {
                ArrayList[] arrayListArr = tuVar2.c;
                if (i17 >= arrayListArr.length) {
                    break;
                }
                int size = arrayListArr[i17].size();
                if (tuVar2.c.length > 1) {
                    size = Math.min(jvVar.y.J * 2, size);
                }
                if (i17 == i15) {
                    i16 = i16 + size + 1;
                    break;
                } else {
                    i16 += size + 2;
                    i17++;
                }
            }
            this.H = i16;
            this.I.d(1.0f, true);
            vVar.invalidate();
            this.K = -1;
        }
        boolean z12 = this.O;
        cg.d1 d1Var = this.x;
        TextView textView = this.w;
        TextView textView2 = this.v;
        if (!z12 || this.D) {
            d1Var.setVisibility(8);
            textView2.setVisibility(8);
            textView.setVisibility(8);
            b0(false);
            return;
        }
        d1Var.setVisibility(4);
        if (arrayList4.size() > 0) {
            textView2.setVisibility(0);
            textView.setVisibility(8);
            if (arrayList4.size() == 1) {
                textView2.setText(LocaleController.formatPluralString("AddManyEmojiCount", ((TLRPC.TL_messages_stickerSet) arrayList4.get(0)).documents.size(), new Object[0]));
            } else {
                textView2.setText(LocaleController.formatPluralString("AddManyEmojiPacksCount", arrayList4.size(), new Object[0]));
            }
            textView2.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.pu
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
                                jv jvVar2 = this;
                                if (i18 >= size3) {
                                    jvVar2.X(true);
                                    if (size2 <= 1) {
                                        jvVar2.dismiss();
                                        break;
                                    }
                                } else {
                                    jv.W(jvVar2.c, (TLObject) arrayList5.get(i18), size2 == 1, size2 > 1 ? new jh.d8(jvVar2, iArr, size2, arrayList5) : null, null);
                                    i18++;
                                }
                            }
                            break;
                        default:
                            jv jvVar3 = this;
                            jvVar3.dismiss();
                            org.telegram.ui.ActionBar.o2 o2Var = jvVar3.c;
                            ArrayList<TLRPC.TL_messages_stickerSet> arrayList6 = arrayList4;
                            if (o2Var != null) {
                                MediaDataController.getInstance(o2Var.getCurrentAccount()).removeMultipleStickerSets(o2Var.getContext(), o2Var, arrayList6);
                            } else {
                                int i19 = 0;
                                while (i19 < arrayList6.size()) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = arrayList6.get(i19);
                                    Context context = jvVar3.getContext();
                                    boolean z13 = i19 == 0;
                                    if (tL_messages_stickerSet2 != null) {
                                        MediaDataController.getInstance(UserConfig.selectedAccount).toggleStickerSet(context, tL_messages_stickerSet2, 0, null, true, z13, null, true);
                                    }
                                    i19++;
                                }
                            }
                            jvVar3.X(false);
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
        textView.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.pu
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
                            jv jvVar2 = this;
                            if (i18 >= size3) {
                                jvVar2.X(true);
                                if (size2 <= 1) {
                                    jvVar2.dismiss();
                                    break;
                                }
                            } else {
                                jv.W(jvVar2.c, (TLObject) arrayList5.get(i18), size2 == 1, size2 > 1 ? new jh.d8(jvVar2, iArr, size2, arrayList5) : null, null);
                                i18++;
                            }
                        }
                        break;
                    default:
                        jv jvVar3 = this;
                        jvVar3.dismiss();
                        org.telegram.ui.ActionBar.o2 o2Var = jvVar3.c;
                        ArrayList<TLRPC.TL_messages_stickerSet> arrayList6 = arrayList2;
                        if (o2Var != null) {
                            MediaDataController.getInstance(o2Var.getCurrentAccount()).removeMultipleStickerSets(o2Var.getContext(), o2Var, arrayList6);
                        } else {
                            int i19 = 0;
                            while (i19 < arrayList6.size()) {
                                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = arrayList6.get(i19);
                                Context context = jvVar3.getContext();
                                boolean z13 = i19 == 0;
                                if (tL_messages_stickerSet2 != null) {
                                    MediaDataController.getInstance(UserConfig.selectedAccount).toggleStickerSet(context, tL_messages_stickerSet2, 0, null, true, z13, null, true);
                                }
                                i19++;
                            }
                        }
                        jvVar3.X(false);
                        break;
                }
            }
        });
        b0(true);
    }

    public final void b0(boolean z10) {
        boolean z11 = !this.L && z10;
        float dp = this.w.getVisibility() == 0 ? AndroidUtilities.dp(19.0f) : 0;
        boolean z12 = this.D;
        nh.v vVar = this.h;
        View view = this.r;
        FrameLayout frameLayout = this.s;
        float f9 = 0.0f;
        if (z11) {
            ViewPropertyAnimator duration = frameLayout.animate().translationY(z10 ? dp : AndroidUtilities.dp(16.0f)).alpha(z10 ? 1.0f : 0.0f).setDuration(250L);
            jr jrVar = jr.h;
            duration.setInterpolator(jrVar).start();
            view.animate().translationY(z10 ? -(AndroidUtilities.dp(68.0f) - dp) : 0.0f).alpha(z10 ? 1.0f : 0.0f).setDuration(250L).setInterpolator(jrVar).start();
            ViewPropertyAnimator animate = vVar.animate();
            if (!z12 && !z10) {
                f9 = AndroidUtilities.dp(68.0f) - dp;
            }
            animate.translationY(f9).setDuration(250L).setInterpolator(jrVar).start();
        } else {
            frameLayout.setAlpha(z10 ? 1.0f : 0.0f);
            frameLayout.setTranslationY(z10 ? dp : AndroidUtilities.dp(16.0f));
            view.setAlpha(z10 ? 1.0f : 0.0f);
            view.setTranslationY(z10 ? -(AndroidUtilities.dp(68.0f) - dp) : 0.0f);
            if (!z12 && !z10) {
                f9 = AndroidUtilities.dp(68.0f) - dp;
            }
            vVar.setTranslationY(f9);
        }
        this.L = z10;
    }

    @Override // org.telegram.ui.ActionBar.f3
    public final boolean canDismissWithSwipe() {
        return false;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        ev evVar;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet;
        if (i10 != NotificationCenter.stickersDidLoad) {
            return;
        }
        int i12 = 0;
        while (true) {
            nh.v vVar = this.h;
            if (i12 >= vVar.getChildCount()) {
                a0();
                return;
            }
            View childAt = vVar.getChildAt(i12);
            if ((childAt instanceof ev) && (tL_messages_stickerSet = (evVar = (ev) childAt).r) != null && tL_messages_stickerSet.set != null) {
                evVar.a(MediaDataController.getInstance(this.currentAccount).isStickerPackInstalled(evVar.r.set.id), true);
            }
            i12++;
        }
    }

    @Override // org.telegram.ui.ActionBar.f3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.k2
    public void dismiss() {
        zu zuVar = this.f;
        if (zuVar != null && zuVar.w) {
            zuVar.w = false;
            zuVar.invalidate();
        }
        super.dismiss();
        tu tuVar = this.e;
        if (tuVar != null) {
            NotificationCenter.getInstance(tuVar.d).removeObserver(tuVar, NotificationCenter.groupStickersDidLoad);
        }
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 4);
    }

    @Override // org.telegram.ui.ActionBar.f3
    public final int getContainerViewHeight() {
        nh.v vVar = this.h;
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
        xu xuVar = new xu(this);
        this.n = xuVar;
        this.h.setAdapter(xuVar);
        int i10 = 0;
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 4);
        tu tuVar = this.e;
        if (!tuVar.e) {
            tuVar.e = true;
            jv jvVar = tuVar.f;
            int i11 = tuVar.d;
            tuVar.b = new ArrayList(tuVar.a.size());
            tuVar.c = new ArrayList[tuVar.a.size()];
            NotificationCenter.getInstance(i11).addObserver(tuVar, NotificationCenter.groupStickersDidLoad);
            boolean[] zArr = new boolean[1];
            int i12 = 0;
            while (true) {
                if (i12 < tuVar.c.length) {
                    TLRPC.TL_messages_stickerSet stickerSet2 = MediaDataController.getInstance(i11).getStickerSet((TLRPC.InputStickerSet) tuVar.a.get(i12), null, false, new org.telegram.ui.tm(9, tuVar, zArr));
                    if (tuVar.c.length != 1 || stickerSet2 == null || (stickerSet = stickerSet2.set) == null || stickerSet.emojis) {
                        tuVar.b.add(stickerSet2);
                        tuVar.a(i12, stickerSet2);
                        i12++;
                    } else {
                        AndroidUtilities.runOnUIThread(new fv(tuVar, i10));
                        Context context = jvVar.getContext();
                        org.telegram.ui.ActionBar.o2 o2Var = jvVar.c;
                        TLRPC.InputStickerSet inputStickerSet = (TLRPC.InputStickerSet) tuVar.a.get(i12);
                        org.telegram.ui.ActionBar.o2 o2Var2 = jvVar.c;
                        new nx0(context, o2Var, inputStickerSet, null, o2Var2 instanceof org.telegram.ui.tn ? ((org.telegram.ui.tn) o2Var2).U : null, jvVar.resourcesProvider).show();
                    }
                } else {
                    jv jvVar2 = tuVar.h;
                    jvVar2.a0();
                    nh.v vVar = jvVar2.h;
                    if (vVar != null && vVar.getAdapter() != null) {
                        vVar.getAdapter().l();
                    }
                }
            }
        }
        a0();
        org.telegram.ui.ActionBar.o2 o2Var3 = this.c;
        MediaDataController.getInstance(o2Var3 == null ? UserConfig.selectedAccount : o2Var3.getCurrentAccount()).checkStickers(5);
    }

    public void X(boolean z10) {
    }

    public void Y() {
    }
}
