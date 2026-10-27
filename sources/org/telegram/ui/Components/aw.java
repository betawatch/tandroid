package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.text.SpannableString;
import android.util.LongSparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
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

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public class aw extends org.telegram.ui.ActionBar.k3 implements NotificationCenter.NotificationCenterDelegate {
    public static Pattern V;
    public final ql0 E;
    public final gq F;
    public org.telegram.ui.ActionBar.o1 G;
    public final boolean H;
    public boolean I;
    public float J;
    public int K;
    public int L;
    public final h6 M;
    public final jv N;
    public int O;
    public boolean P;
    public long Q;
    public ValueAnimator R;
    public boolean S;
    public PorterDuffColorFilter T;
    public int U;
    public LongSparseArray b;
    public final org.telegram.ui.ActionBar.r2 c;
    public final vn d;
    public final kv e;
    public final qv f;
    public final fi.v h;
    public ov n;
    public final View r;
    public final FrameLayout s;
    public final TextView v;
    public final TextView w;
    public final tg.p0 x;
    public final s4.t y;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public aw(org.telegram.ui.ActionBar.r2 r2Var, Context context, org.telegram.ui.ActionBar.u6 u6Var, ArrayList arrayList) {
        super(1, context, r4, false);
        org.telegram.ui.ActionBar.u6 resourceProvider = (r2Var == null || r2Var.getResourceProvider() == null) ? u6Var : r2Var.getResourceProvider();
        this.K = -1;
        this.L = -1;
        this.N = new jv(this);
        this.O = -1;
        this.P = false;
        this.S = true;
        this.c = r2Var;
        fixNavigationBar();
        if (arrayList != null) {
            this.H = arrayList.size() > 1;
        }
        this.e = new kv(this.currentAccount, arrayList, this);
        float dp = AndroidUtilities.dp(32.0f);
        float dp2 = AndroidUtilities.dp(3.5f);
        int i10 = org.telegram.ui.ActionBar.y6.Oh;
        this.F = new gq(dp, dp2, getThemedColor(i10));
        qv qvVar = new qv(this, context);
        this.f = qvVar;
        this.containerView = qvVar;
        int i11 = 11;
        this.d = new vn(context, i11);
        fi.v vVar = new fi.v(this, context, this.resourcesProvider);
        this.h = vVar;
        this.M = new h6(0.0f, vVar, 0L, 1250L, ds.i);
        ViewGroup viewGroup = this.containerView;
        int i12 = this.backgroundPaddingLeft;
        viewGroup.setPadding(i12, AndroidUtilities.statusBarHeight, i12, 0);
        this.containerView.setClipChildren(false);
        this.containerView.setClipToPadding(false);
        this.containerView.setWillNotDraw(false);
        vVar.setWillNotDraw(false);
        vVar.setSelectorRadius(AndroidUtilities.dp(6.0f));
        int i13 = 20;
        org.telegram.ui.ActionBar.f7.m(vVar, 20, org.telegram.ui.ActionBar.y6.i6, resourceProvider);
        vVar.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(this.H ? 8.0f : 68.0f));
        s4.t tVar = new s4.t(8);
        this.y = tVar;
        vVar.setLayoutManager(tVar);
        vVar.i(new fi.p1(this, 2));
        vVar.j(new ml(this, 4));
        hn hnVar = new hn(this, arrayList, r2Var, resourceProvider);
        vVar.setOnItemClickListener(hnVar);
        vVar.setOnItemLongClickListener((cm0) new p1(i13, this, context));
        vVar.setOnTouchListener(new fi.o1(3, this, hnVar));
        tVar.l1(false);
        tVar.O = new mv(this);
        this.E = new ql0(vVar, tVar);
        this.containerView.addView(vVar, kb1.i(-1, -1, 51));
        View view = new View(context);
        this.r = view;
        org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.V5, view, null);
        this.containerView.addView(view, kb1.e(-1.0f, 1.0f / AndroidUtilities.density, 80));
        view.setTranslationY(-AndroidUtilities.dp(68.0f));
        FrameLayout frameLayout = new FrameLayout(context);
        this.s = frameLayout;
        org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.h5, frameLayout, this.resourcesProvider);
        this.containerView.addView(frameLayout, kb1.i(-1, 68, 87));
        TextView textView = new TextView(context);
        this.v = textView;
        textView.setVisibility(8);
        org.telegram.ui.Cells.y e = org.telegram.ui.ActionBar.o6.e(new float[]{24.0f}, getThemedColor(i10));
        org.telegram.ui.ActionBar.b7 N = org.telegram.ui.ActionBar.f7.N(i10);
        org.telegram.ui.ActionBar.b7 f7 = org.telegram.ui.ActionBar.f7.f(i10);
        org.telegram.ui.ActionBar.u6 u6Var2 = this.resourcesProvider;
        textView.setBackground(e);
        org.telegram.ui.ActionBar.f7.k(textView, e, N, f7, u6Var2);
        org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.Sh, this.resourcesProvider);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(17);
        kb1.c(textView, 0.02f, 1.2f);
        TextView k10 = org.telegram.ui.d3.k(frameLayout, textView, kb1.h(-1, 48.0f, 80, 12.0f, 10.0f, 12.0f, 10.0f), context);
        this.w = k10;
        k10.setVisibility(8);
        int i14 = org.telegram.ui.ActionBar.y6.q7;
        org.telegram.ui.Cells.y Z = org.telegram.ui.ActionBar.y6.Z(getThemedColor(i14) & 268435455, 0, 0);
        org.telegram.ui.ActionBar.b7 h = org.telegram.ui.ActionBar.f7.h(i14, 15);
        org.telegram.ui.ActionBar.u6 u6Var3 = this.resourcesProvider;
        k10.setBackground(Z);
        org.telegram.ui.ActionBar.f7.k(k10, Z, null, h, u6Var3);
        org.telegram.ui.ActionBar.f7.V(k10, i14, this.resourcesProvider);
        k10.setTypeface(AndroidUtilities.bold());
        k10.setGravity(17);
        k10.setClickable(true);
        frameLayout.addView(k10, kb1.h(-1, -1.0f, 80, 0.0f, 0.0f, 0.0f, 19.0f));
        tg.p0 p0Var = new tg.p0(context, this.resourcesProvider, false);
        this.x = p0Var;
        p0Var.a(LocaleController.getString(R.string.UnlockPremiumEmoji), new f0(this, i11), false);
        p0Var.setIcon(R.raw.unlock_icon);
        p0Var.v.setClickable(true);
        frameLayout.addView(p0Var, kb1.h(-1, 48.0f, 80, 12.0f, 10.0f, 12.0f, 10.0f));
    }

    public static void Z(aw awVar, int i10) {
        ArrayList arrayList;
        String str;
        org.telegram.ui.ActionBar.r2 r2Var = awVar.c;
        kv kvVar = awVar.e;
        if (kvVar == null || (arrayList = kvVar.b) == null || arrayList.isEmpty()) {
            return;
        }
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) kvVar.b.get(0);
        TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
        if (stickerSet == null || !stickerSet.emojis) {
            str = "https://" + MessagesController.getInstance(awVar.currentAccount).linkPrefix + "/addstickers/" + tL_messages_stickerSet.set.short_name;
        } else {
            str = "https://" + MessagesController.getInstance(awVar.currentAccount).linkPrefix + "/addemoji/" + tL_messages_stickerSet.set.short_name;
        }
        String str2 = str;
        if (i10 != 1) {
            if (i10 == 2) {
                try {
                    AndroidUtilities.addToClipboard(str2);
                    new wc((FrameLayout) awVar.containerView, awVar.resourcesProvider).k(false).j();
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            }
            return;
        }
        Context parentActivity = r2Var != null ? r2Var.getParentActivity() : null;
        if (parentActivity == null) {
            parentActivity = awVar.getContext();
        }
        nv nvVar = new nv(awVar, parentActivity, str2, str2, awVar.resourcesProvider);
        if (r2Var != null) {
            r2Var.showDialog(nvVar);
        } else {
            nvVar.show();
        }
    }

    public static void g0(final org.telegram.ui.ActionBar.r2 r2Var, TLObject tLObject, final boolean z10, final bi.ua uaVar, final cp cpVar) {
        final int currentAccount = r2Var == null ? UserConfig.selectedAccount : r2Var.getCurrentAccount();
        TLRPC.StickerSet stickerSet = null;
        final View fragmentView = r2Var == null ? null : r2Var.getFragmentView();
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
            if (uaVar != null) {
                uaVar.run(Boolean.TRUE);
            }
        } else {
            TLRPC.TL_messages_installStickerSet tL_messages_installStickerSet = new TLRPC.TL_messages_installStickerSet();
            TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
            tL_messages_installStickerSet.stickerset = tL_inputStickerSetID;
            tL_inputStickerSetID.id = stickerSet2.id;
            tL_inputStickerSetID.access_hash = stickerSet2.access_hash;
            ConnectionsManager.getInstance(currentAccount).sendRequest(tL_messages_installStickerSet, new RequestDelegate() { // from class: org.telegram.ui.Components.iv
                @Override // org.telegram.tgnet.RequestDelegate
                public final void run(final TLObject tLObject2, final TLRPC.TL_error tL_error) {
                    final TLRPC.StickerSet stickerSet3 = TLRPC.StickerSet.this;
                    final boolean z11 = z10;
                    final View view = fragmentView;
                    final org.telegram.ui.ActionBar.r2 r2Var2 = r2Var;
                    final TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = tL_messages_stickerSet;
                    final int i10 = currentAccount;
                    final Utilities.Callback callback = uaVar;
                    final Runnable runnable = cpVar;
                    AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.Components.hv
                        @Override // java.lang.Runnable
                        public final void run() {
                            TLObject tLObject3 = tLObject2;
                            TLRPC.StickerSet stickerSet4 = TLRPC.StickerSet.this;
                            int i11 = stickerSet4.masks ? 1 : stickerSet4.emojis ? 5 : 0;
                            TLRPC.TL_error tL_error2 = tL_error;
                            View view2 = view;
                            org.telegram.ui.ActionBar.r2 r2Var3 = r2Var2;
                            int i12 = i10;
                            Utilities.Callback callback2 = callback;
                            try {
                                if (tL_error2 == null) {
                                    if (z11 && view2 != null) {
                                        Context context = r2Var3.getFragmentView().getContext();
                                        TLObject tLObject4 = tL_messages_stickerSet2;
                                        qc.g(r2Var3, new hy0(context, tLObject4 == null ? stickerSet4 : tLObject4, 1, 2, null, r2Var3.getResourceProvider()), 1500).j();
                                    }
                                    if (tLObject3 instanceof TLRPC.TL_messages_stickerSetInstallResultArchive) {
                                        MediaDataController.getInstance(i12).processStickerSetInstallResultArchive(r2Var3, true, i11, (TLRPC.TL_messages_stickerSetInstallResultArchive) tLObject3);
                                    }
                                    if (callback2 != null) {
                                        callback2.run(Boolean.TRUE);
                                    }
                                } else if (view2 != null) {
                                    Toast.makeText(r2Var3.getFragmentView().getContext(), LocaleController.getString(R.string.ErrorOccurred), 0).show();
                                    if (callback2 != null) {
                                        callback2.run(Boolean.FALSE);
                                    }
                                } else if (callback2 != null) {
                                    callback2.run(Boolean.FALSE);
                                }
                            } catch (Exception e) {
                                FileLog.e(e);
                            }
                            MediaDataController.getInstance(i12).loadStickers(i11, false, true, false, new b3(runnable, 5));
                        }
                    });
                }
            });
        }
    }

    public static void n(aw awVar, ArrayList arrayList, org.telegram.ui.ActionBar.r2 r2Var, org.telegram.ui.ActionBar.u6 u6Var, View view, int i10) {
        kv kvVar = awVar.e;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = null;
        int i11 = 0;
        if (arrayList == null || arrayList.size() <= 1) {
            org.telegram.ui.ActionBar.o1 o1Var = awVar.G;
            if (o1Var != null) {
                o1Var.d(true);
                awVar.G = null;
                return;
            }
            if ((r2Var instanceof org.telegram.ui.wn) && ((org.telegram.ui.wn) r2Var).Y.getVisibility() == 0 && (view instanceof rv)) {
                c6 c6Var = ((rv) view).c;
                try {
                    TLRPC.Document document = c6Var.document;
                    if (document == null) {
                        document = t5.f(awVar.currentAccount, c6Var.getDocumentId());
                    }
                    SpannableString spannableString = new SpannableString(MessageObject.findAnimatedEmojiEmoticon(document));
                    spannableString.setSpan(c6Var, 0, spannableString.length(), 33);
                    ((org.telegram.ui.wn) r2Var).Y.E0.getText().append((CharSequence) spannableString);
                    awVar.i0();
                    awVar.dismiss();
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
        if (SystemClock.elapsedRealtime() - awVar.Q < 250) {
            return;
        }
        int i12 = 0;
        while (true) {
            ArrayList[] arrayListArr = kvVar.c;
            if (i11 >= arrayListArr.length) {
                break;
            }
            int size = arrayListArr[i11].size();
            if (kvVar.c.length > 1) {
                size = Math.min(awVar.y.J * 2, size);
            }
            i12 += size + 2;
            if (i10 < i12) {
                break;
            } else {
                i11++;
            }
        }
        ArrayList arrayList2 = kvVar.b;
        if (arrayList2 != null && i11 < arrayList2.size()) {
            tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) kvVar.b.get(i11);
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
        new lv(awVar, r2Var, awVar.getContext(), u6Var, arrayList3).show();
    }

    public static void o(aw awVar, c6 c6Var) {
        org.telegram.ui.ActionBar.o1 o1Var = awVar.G;
        if (o1Var == null) {
            return;
        }
        o1Var.d(true);
        awVar.G = null;
        SpannableString spannableString = new SpannableString(MessageObject.findAnimatedEmojiEmoticon(t5.f(awVar.currentAccount, c6Var.getDocumentId())));
        spannableString.setSpan(c6Var, 0, spannableString.length(), 33);
        if (AndroidUtilities.addToClipboard(spannableString)) {
            org.telegram.messenger.wh.m(R.string.EmojiCopied, new wc((FrameLayout) awVar.containerView, awVar.resourcesProvider));
        }
    }

    public static /* synthetic */ void p(aw awVar, ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        awVar.J = floatValue;
        awVar.h.setAlpha(floatValue);
        awVar.v.setAlpha(awVar.J);
        awVar.w.setAlpha(awVar.J);
        awVar.containerView.invalidate();
    }

    public static boolean q(aw awVar, Context context, View view) {
        c6 c6Var;
        if (!(view instanceof rv) || (c6Var = ((rv) view).c) == null) {
            return false;
        }
        org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(awVar.getContext(), true, true);
        g1Var.setItemHeight(48);
        g1Var.setPadding(AndroidUtilities.dp(26.0f), 0, AndroidUtilities.dp(26.0f), 0);
        g1Var.setText(LocaleController.getString(R.string.Copy));
        g1Var.getTextView().setTextSize(1, 14.4f);
        g1Var.getTextView().setTypeface(AndroidUtilities.bold());
        g1Var.setOnClickListener(new ga(13, awVar, c6Var));
        LinearLayout linearLayout = new LinearLayout(context);
        Drawable mutate = awVar.getContext().getDrawable(R.drawable.popup_fixed_alert).mutate();
        org.telegram.ui.ActionBar.f7.y(linearLayout, mutate, org.telegram.ui.ActionBar.y6.G8, awVar.resourcesProvider, PorterDuff.Mode.MULTIPLY);
        linearLayout.setBackground(mutate);
        linearLayout.addView(g1Var);
        org.telegram.ui.ActionBar.o1 o1Var = new org.telegram.ui.ActionBar.o1(linearLayout, -2, -2);
        awVar.G = o1Var;
        o1Var.setClippingEnabled(true);
        awVar.G.g();
        awVar.G.setInputMethodMode(2);
        awVar.G.setSoftInputMode(0);
        awVar.G.setOutsideTouchable(true);
        awVar.G.setAnimationStyle(R.style.PopupAnimation);
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        awVar.G.showAtLocation(view, 51, (view.getMeasuredWidth() / 2) + (iArr[0] - AndroidUtilities.dp(49.0f)), iArr[1] - AndroidUtilities.dp(52.0f));
        try {
            view.performHapticFeedback(0, 1);
        } catch (Exception unused) {
        }
        return true;
    }

    @Override // org.telegram.ui.ActionBar.k3
    public final boolean canDismissWithSwipe() {
        return false;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        vv vvVar;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet;
        if (i10 != NotificationCenter.stickersDidLoad) {
            return;
        }
        int i12 = 0;
        while (true) {
            fi.v vVar = this.h;
            if (i12 >= vVar.getChildCount()) {
                k0();
                return;
            }
            View childAt = vVar.getChildAt(i12);
            if ((childAt instanceof vv) && (tL_messages_stickerSet = (vvVar = (vv) childAt).r) != null && tL_messages_stickerSet.set != null) {
                vvVar.a(MediaDataController.getInstance(this.currentAccount).isStickerPackInstalled(vvVar.r.set.id), true);
            }
            i12++;
        }
    }

    @Override // org.telegram.ui.ActionBar.k3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.n2
    public void dismiss() {
        qv qvVar = this.f;
        if (qvVar != null && qvVar.w) {
            qvVar.w = false;
            qvVar.invalidate();
        }
        super.dismiss();
        kv kvVar = this.e;
        if (kvVar != null) {
            NotificationCenter.getInstance(kvVar.d).removeObserver(kvVar, NotificationCenter.groupStickersDidLoad);
        }
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 4);
    }

    public final int f0() {
        if (this.containerView == null) {
            return 0;
        }
        fi.v vVar = this.h;
        if (vVar == null || vVar.getChildCount() < 1) {
            return this.containerView.getPaddingTop();
        }
        View childAt = vVar.getChildAt(0);
        vn vnVar = this.d;
        return childAt != vnVar ? this.containerView.getPaddingTop() : vnVar.getBottom() + ((int) vVar.getY());
    }

    @Override // org.telegram.ui.ActionBar.k3
    public final int getContainerViewHeight() {
        fi.v vVar = this.h;
        int measuredHeight = (vVar == null ? 0 : vVar.getMeasuredHeight()) - f0();
        ViewGroup viewGroup = this.containerView;
        return AndroidUtilities.dp(8.0f) + measuredHeight + (viewGroup != null ? viewGroup.getPaddingTop() : 0) + AndroidUtilities.navigationBarHeight;
    }

    public final void j0() {
        org.telegram.ui.ActionBar.r2 r2Var = this.c;
        if (r2Var != null) {
            new tg.y0(r2Var, 11, false).show();
        } else if (getContext() instanceof LaunchActivity) {
            ((LaunchActivity) getContext()).u0(new PremiumPreviewFragment(0, null));
        }
    }

    public final void k0() {
        final int i10;
        TLRPC.StickerSet stickerSet;
        if (this.s == null) {
            return;
        }
        kv kvVar = this.e;
        ArrayList arrayList = kvVar.b == null ? new ArrayList() : new ArrayList(kvVar.b);
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
        boolean z10 = kvVar.a != null && arrayList.size() == kvVar.a.size();
        if (!this.S && z10 && this.R == null) {
            this.R = ValueAnimator.ofFloat(this.J, 1.0f);
            this.containerView.getY();
            this.R.addUpdateListener(new n6(this, 17));
            this.R.setDuration(250L);
            this.R.setInterpolator(ds.h);
            this.R.start();
        }
        this.S = z10;
        fi.v vVar = this.h;
        if (!z10) {
            vVar.setAlpha(0.0f);
        } else if (this.O >= 0) {
            int L0 = this.y.L0();
            int E = this.n.E(this.O);
            if (Math.abs(L0 - E) > 54) {
                int i14 = L0 < E ? 0 : 1;
                ql0 ql0Var = this.E;
                ql0Var.b = i14;
                ql0Var.c(E, (AndroidUtilities.displaySize.y / 2) - AndroidUtilities.dp(170.0f), false, false);
            } else {
                vVar.y0(E);
            }
            this.K = this.n.E(this.O);
            ov ovVar = this.n;
            int i15 = this.O;
            aw awVar = ovVar.c;
            boolean z11 = awVar.I;
            kv kvVar2 = awVar.e;
            int i16 = z11 ? 2 : 1;
            int i17 = 0;
            while (true) {
                ArrayList[] arrayListArr = kvVar2.c;
                if (i17 >= arrayListArr.length) {
                    break;
                }
                int size = arrayListArr[i17].size();
                if (kvVar2.c.length > 1) {
                    size = Math.min(awVar.y.J * 2, size);
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
        tg.p0 p0Var = this.x;
        TextView textView = this.w;
        TextView textView2 = this.v;
        if (!z12 || this.H) {
            p0Var.setVisibility(8);
            textView2.setVisibility(8);
            textView.setVisibility(8);
            m0(false);
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
            textView2.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.gv
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
                                aw awVar2 = this;
                                if (i18 >= size3) {
                                    awVar2.h0(true);
                                    if (size2 <= 1) {
                                        awVar2.dismiss();
                                        break;
                                    }
                                } else {
                                    aw.g0(awVar2.c, (TLObject) arrayList5.get(i18), size2 == 1, size2 > 1 ? new bi.ua(awVar2, iArr, size2, arrayList5) : null, null);
                                    i18++;
                                }
                            }
                            break;
                        default:
                            aw awVar3 = this;
                            awVar3.dismiss();
                            org.telegram.ui.ActionBar.r2 r2Var = awVar3.c;
                            ArrayList<TLRPC.TL_messages_stickerSet> arrayList6 = arrayList4;
                            if (r2Var != null) {
                                MediaDataController.getInstance(r2Var.getCurrentAccount()).removeMultipleStickerSets(r2Var.getContext(), r2Var, arrayList6);
                            } else {
                                int i19 = 0;
                                while (i19 < arrayList6.size()) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = arrayList6.get(i19);
                                    Context context = awVar3.getContext();
                                    boolean z13 = i19 == 0;
                                    if (tL_messages_stickerSet2 != null) {
                                        MediaDataController.getInstance(UserConfig.selectedAccount).toggleStickerSet(context, tL_messages_stickerSet2, 0, null, true, z13, null, true);
                                    }
                                    i19++;
                                }
                            }
                            awVar3.h0(false);
                            break;
                    }
                }
            });
            m0(true);
            return;
        }
        if (arrayList2.size() <= 0) {
            textView2.setVisibility(8);
            textView.setVisibility(8);
            m0(false);
            return;
        }
        textView2.setVisibility(8);
        textView.setVisibility(0);
        if (arrayList2.size() == 1) {
            textView.setText(LocaleController.formatPluralString("RemoveManyEmojiCount", ((TLRPC.TL_messages_stickerSet) arrayList2.get(0)).documents.size(), new Object[0]));
        } else {
            textView.setText(LocaleController.formatPluralString("RemoveManyEmojiPacksCount", arrayList2.size(), new Object[0]));
        }
        textView.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.gv
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
                            aw awVar2 = this;
                            if (i18 >= size3) {
                                awVar2.h0(true);
                                if (size2 <= 1) {
                                    awVar2.dismiss();
                                    break;
                                }
                            } else {
                                aw.g0(awVar2.c, (TLObject) arrayList5.get(i18), size2 == 1, size2 > 1 ? new bi.ua(awVar2, iArr, size2, arrayList5) : null, null);
                                i18++;
                            }
                        }
                        break;
                    default:
                        aw awVar3 = this;
                        awVar3.dismiss();
                        org.telegram.ui.ActionBar.r2 r2Var = awVar3.c;
                        ArrayList<TLRPC.TL_messages_stickerSet> arrayList6 = arrayList2;
                        if (r2Var != null) {
                            MediaDataController.getInstance(r2Var.getCurrentAccount()).removeMultipleStickerSets(r2Var.getContext(), r2Var, arrayList6);
                        } else {
                            int i19 = 0;
                            while (i19 < arrayList6.size()) {
                                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = arrayList6.get(i19);
                                Context context = awVar3.getContext();
                                boolean z13 = i19 == 0;
                                if (tL_messages_stickerSet2 != null) {
                                    MediaDataController.getInstance(UserConfig.selectedAccount).toggleStickerSet(context, tL_messages_stickerSet2, 0, null, true, z13, null, true);
                                }
                                i19++;
                            }
                        }
                        awVar3.h0(false);
                        break;
                }
            }
        });
        m0(true);
    }

    public final void l0(boolean z10) {
        boolean z11 = AndroidUtilities.computePerceivedBrightness(getThemedColor(org.telegram.ui.ActionBar.y6.h5)) > 0.721f;
        boolean z12 = AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.y6.v(getThemedColor(org.telegram.ui.ActionBar.y6.s8), 855638016)) > 0.721f;
        if (!z10) {
            z11 = z12;
        }
        AndroidUtilities.setLightStatusBar(this, z11);
    }

    public final void m0(boolean z10) {
        boolean z11 = !this.P && z10;
        float dp = this.w.getVisibility() == 0 ? AndroidUtilities.dp(19.0f) : 0;
        boolean z12 = this.H;
        fi.v vVar = this.h;
        View view = this.r;
        FrameLayout frameLayout = this.s;
        float f7 = 0.0f;
        if (z11) {
            ViewPropertyAnimator duration = frameLayout.animate().translationY(z10 ? dp : AndroidUtilities.dp(16.0f)).alpha(z10 ? 1.0f : 0.0f).setDuration(250L);
            ds dsVar = ds.h;
            duration.setInterpolator(dsVar).start();
            view.animate().translationY(z10 ? -(AndroidUtilities.dp(68.0f) - dp) : 0.0f).alpha(z10 ? 1.0f : 0.0f).setDuration(250L).setInterpolator(dsVar).start();
            ViewPropertyAnimator animate = vVar.animate();
            if (!z12 && !z10) {
                f7 = AndroidUtilities.dp(68.0f) - dp;
            }
            animate.translationY(f7).setDuration(250L).setInterpolator(dsVar).start();
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

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getInstance(this.currentAccount).addWeakObserver(this, NotificationCenter.stickersDidLoad);
    }

    @Override // org.telegram.ui.ActionBar.k3, android.app.Dialog
    public final void onBackPressed() {
        if (org.telegram.ui.ht.o().E) {
            org.telegram.ui.ht.o().m();
        } else {
            super.onBackPressed();
        }
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.stickersDidLoad);
    }

    @Override // org.telegram.ui.ActionBar.k3
    public final void onThemeColorsChanged() {
        Boolean bool;
        try {
            super.onThemeColorsChanged();
            gq gqVar = this.F;
            if (gqVar != null) {
                gqVar.b(getThemedColor(org.telegram.ui.ActionBar.y6.Oh));
            }
            qv qvVar = this.f;
            if (qvVar != null && (bool = qvVar.c) != null) {
                l0(bool.booleanValue());
            }
            ViewGroup viewGroup = this.containerView;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override // org.telegram.ui.ActionBar.k3, android.app.Dialog
    public final void show() {
        TLRPC.StickerSet stickerSet;
        super.show();
        ov ovVar = new ov(this);
        this.n = ovVar;
        this.h.setAdapter(ovVar);
        int i10 = 0;
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 4);
        kv kvVar = this.e;
        if (!kvVar.e) {
            kvVar.e = true;
            aw awVar = kvVar.f;
            int i11 = kvVar.d;
            kvVar.b = new ArrayList(kvVar.a.size());
            kvVar.c = new ArrayList[kvVar.a.size()];
            NotificationCenter.getInstance(i11).addWeakObserver(kvVar, NotificationCenter.groupStickersDidLoad);
            boolean[] zArr = new boolean[1];
            int i12 = 0;
            while (true) {
                if (i12 < kvVar.c.length) {
                    TLRPC.TL_messages_stickerSet stickerSet2 = MediaDataController.getInstance(i11).getStickerSet((TLRPC.InputStickerSet) kvVar.a.get(i12), null, false, new li.s2(29, kvVar, zArr));
                    if (kvVar.c.length != 1 || stickerSet2 == null || (stickerSet = stickerSet2.set) == null || stickerSet.emojis) {
                        kvVar.b.add(stickerSet2);
                        kvVar.a(i12, stickerSet2);
                        i12++;
                    } else {
                        AndroidUtilities.runOnUIThread(new wv(kvVar, i10));
                        Context context = awVar.getContext();
                        org.telegram.ui.ActionBar.r2 r2Var = awVar.c;
                        TLRPC.InputStickerSet inputStickerSet = (TLRPC.InputStickerSet) kvVar.a.get(i12);
                        org.telegram.ui.ActionBar.r2 r2Var2 = awVar.c;
                        new dz0(context, r2Var, inputStickerSet, null, r2Var2 instanceof org.telegram.ui.wn ? ((org.telegram.ui.wn) r2Var2).Y : null, awVar.resourcesProvider).show();
                    }
                } else {
                    aw awVar2 = kvVar.h;
                    awVar2.k0();
                    fi.v vVar = awVar2.h;
                    if (vVar != null && vVar.getAdapter() != null) {
                        vVar.getAdapter().l();
                    }
                }
            }
        }
        k0();
        org.telegram.ui.ActionBar.r2 r2Var3 = this.c;
        MediaDataController.getInstance(r2Var3 == null ? UserConfig.selectedAccount : r2Var3.getCurrentAccount()).checkStickers(5);
    }

    public void i0() {
    }

    public void h0(boolean z10) {
    }
}
