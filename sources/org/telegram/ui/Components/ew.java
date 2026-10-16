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

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public class ew extends org.telegram.ui.ActionBar.e3 implements NotificationCenter.NotificationCenterDelegate {
    public static Pattern V;
    public final pl0 E;
    public final gq F;
    public org.telegram.ui.ActionBar.m1 G;
    public final boolean H;
    public boolean I;
    public float J;
    public int K;
    public int L;
    public final g6 M;
    public final nv N;
    public int O;
    public boolean P;
    public long Q;
    public ValueAnimator R;
    public boolean S;
    public PorterDuffColorFilter T;
    public int U;
    public LongSparseArray b;
    public final org.telegram.ui.ActionBar.m2 c;
    public final xn d;
    public final ov e;
    public final uv f;
    public final di.v h;
    public sv n;
    public final View r;
    public final FrameLayout s;
    public final TextView v;
    public final TextView w;
    public final sg.q0 x;
    public final s4.s y;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ew(org.telegram.ui.ActionBar.m2 m2Var, Context context, org.telegram.ui.ActionBar.c6 c6Var, ArrayList arrayList) {
        super(1, context, r4, false);
        org.telegram.ui.ActionBar.c6 resourceProvider = (m2Var == null || m2Var.getResourceProvider() == null) ? c6Var : m2Var.getResourceProvider();
        this.K = -1;
        this.L = -1;
        this.N = new nv(this);
        this.O = -1;
        this.P = false;
        this.S = true;
        this.c = m2Var;
        fixNavigationBar();
        if (arrayList != null) {
            this.H = arrayList.size() > 1;
        }
        this.e = new ov(this.currentAccount, arrayList, this);
        float dp = AndroidUtilities.dp(32.0f);
        float dp2 = AndroidUtilities.dp(3.5f);
        int i10 = org.telegram.ui.ActionBar.g6.Oh;
        this.F = new gq(dp, dp2, getThemedColor(i10));
        uv uvVar = new uv(this, context);
        this.f = uvVar;
        this.containerView = uvVar;
        int i11 = 11;
        this.d = new xn(context, i11);
        di.v vVar = new di.v(this, context, this.resourcesProvider);
        this.h = vVar;
        this.M = new g6(0.0f, vVar, 0L, 1250L, es.i);
        ViewGroup viewGroup = this.containerView;
        int i12 = this.backgroundPaddingLeft;
        viewGroup.setPadding(i12, AndroidUtilities.statusBarHeight, i12, 0);
        this.containerView.setClipChildren(false);
        this.containerView.setClipToPadding(false);
        this.containerView.setWillNotDraw(false);
        vVar.setWillNotDraw(false);
        vVar.setSelectorRadius(AndroidUtilities.dp(6.0f));
        vVar.setSelectorDrawableColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.i6, resourceProvider));
        vVar.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(this.H ? 8.0f : 68.0f));
        s4.s sVar = new s4.s(8);
        this.y = sVar;
        vVar.setLayoutManager(sVar);
        vVar.i(new di.q1(this, 2));
        vVar.j(new ah.d0(this, 26));
        jn jnVar = new jn(this, arrayList, m2Var, resourceProvider);
        vVar.setOnItemClickListener(jnVar);
        vVar.setOnItemLongClickListener((cm0) new u2(14, this, context));
        vVar.setOnTouchListener(new di.p1(3, this, jnVar));
        sVar.k1(false);
        sVar.O = new qv(this);
        this.E = new pl0(vVar, sVar);
        this.containerView.addView(vVar, w7.z5.e(-1, -1, 51));
        View view = new View(context);
        this.r = view;
        view.setBackgroundColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.V5, false));
        this.containerView.addView(view, w7.z5.b(-1.0f, 1.0f / AndroidUtilities.density, 80));
        view.setTranslationY(-AndroidUtilities.dp(68.0f));
        FrameLayout frameLayout = new FrameLayout(context);
        this.s = frameLayout;
        frameLayout.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.g6.h5));
        this.containerView.addView(frameLayout, w7.z5.e(-1, 68, 87));
        TextView textView = new TextView(context);
        this.v = textView;
        textView.setVisibility(8);
        textView.setBackground(org.telegram.ui.ActionBar.w5.e(new float[]{24.0f}, getThemedColor(i10)));
        textView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.g6.Sh));
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(17);
        w7.b6.b(textView, 0.02f, 1.2f);
        TextView g10 = org.telegram.ui.Cells.c1.g(frameLayout, textView, w7.z5.a(48.0f, 12.0f, 10.0f, 12.0f, 10.0f, -1, 80), context);
        this.w = g10;
        g10.setVisibility(8);
        int i13 = org.telegram.ui.ActionBar.g6.q7;
        g10.setBackground(org.telegram.ui.ActionBar.g6.Z(getThemedColor(i13) & 268435455, 0, 0));
        g10.setTextColor(getThemedColor(i13));
        g10.setTypeface(AndroidUtilities.bold());
        g10.setGravity(17);
        g10.setClickable(true);
        frameLayout.addView(g10, w7.z5.a(-1.0f, 0.0f, 0.0f, 0.0f, 19.0f, -1, 80));
        sg.q0 q0Var = new sg.q0(context, this.resourcesProvider, false);
        this.x = q0Var;
        q0Var.a(LocaleController.getString(R.string.UnlockPremiumEmoji), new f0(this, i11), false);
        q0Var.setIcon(R.raw.unlock_icon);
        q0Var.r.setClickable(true);
        frameLayout.addView(q0Var, w7.z5.a(48.0f, 12.0f, 10.0f, 12.0f, 10.0f, -1, 80));
    }

    public static void Q(ew ewVar, int i10) {
        ArrayList arrayList;
        String str;
        org.telegram.ui.ActionBar.m2 m2Var = ewVar.c;
        ov ovVar = ewVar.e;
        if (ovVar == null || (arrayList = ovVar.b) == null || arrayList.isEmpty()) {
            return;
        }
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) ovVar.b.get(0);
        TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
        if (stickerSet == null || !stickerSet.emojis) {
            str = "https://" + MessagesController.getInstance(ewVar.currentAccount).linkPrefix + "/addstickers/" + tL_messages_stickerSet.set.short_name;
        } else {
            str = "https://" + MessagesController.getInstance(ewVar.currentAccount).linkPrefix + "/addemoji/" + tL_messages_stickerSet.set.short_name;
        }
        String str2 = str;
        if (i10 != 1) {
            if (i10 == 2) {
                try {
                    AndroidUtilities.addToClipboard(str2);
                    new zc((FrameLayout) ewVar.containerView, ewVar.resourcesProvider).k(false).j();
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            }
            return;
        }
        Context parentActivity = m2Var != null ? m2Var.getParentActivity() : null;
        if (parentActivity == null) {
            parentActivity = ewVar.getContext();
        }
        rv rvVar = new rv(ewVar, parentActivity, str2, str2, ewVar.resourcesProvider);
        if (m2Var != null) {
            m2Var.showDialog(rvVar);
        } else {
            rvVar.show();
        }
    }

    public static void X(final org.telegram.ui.ActionBar.m2 m2Var, TLObject tLObject, final boolean z10, final gi.m0 m0Var, final kq kqVar) {
        final int currentAccount = m2Var == null ? UserConfig.selectedAccount : m2Var.getCurrentAccount();
        TLRPC.StickerSet stickerSet = null;
        final View fragmentView = m2Var == null ? null : m2Var.getFragmentView();
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
            ConnectionsManager.getInstance(currentAccount).sendRequest(tL_messages_installStickerSet, new RequestDelegate() { // from class: org.telegram.ui.Components.mv
                @Override // org.telegram.tgnet.RequestDelegate
                public final void run(final TLObject tLObject2, final TLRPC.TL_error tL_error) {
                    final TLRPC.StickerSet stickerSet3 = TLRPC.StickerSet.this;
                    final boolean z11 = z10;
                    final View view = fragmentView;
                    final org.telegram.ui.ActionBar.m2 m2Var2 = m2Var;
                    final TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = tL_messages_stickerSet;
                    final int i10 = currentAccount;
                    final Utilities.Callback callback = m0Var;
                    final Runnable runnable = kqVar;
                    AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.Components.lv
                        @Override // java.lang.Runnable
                        public final void run() {
                            TLObject tLObject3 = tLObject2;
                            TLRPC.StickerSet stickerSet4 = TLRPC.StickerSet.this;
                            int i11 = stickerSet4.masks ? 1 : stickerSet4.emojis ? 5 : 0;
                            TLRPC.TL_error tL_error2 = tL_error;
                            View view2 = view;
                            org.telegram.ui.ActionBar.m2 m2Var3 = m2Var2;
                            int i12 = i10;
                            Utilities.Callback callback2 = callback;
                            try {
                                if (tL_error2 == null) {
                                    if (z11 && view2 != null) {
                                        Context context = m2Var3.getFragmentView().getContext();
                                        TLObject tLObject4 = tL_messages_stickerSet2;
                                        sc.g(m2Var3, new yx0(context, tLObject4 == null ? stickerSet4 : tLObject4, 1, 2, null, m2Var3.getResourceProvider()), 1500).j();
                                    }
                                    if (tLObject3 instanceof TLRPC.TL_messages_stickerSetInstallResultArchive) {
                                        MediaDataController.getInstance(i12).processStickerSetInstallResultArchive(m2Var3, true, i11, (TLRPC.TL_messages_stickerSetInstallResultArchive) tLObject3);
                                    }
                                    if (callback2 != null) {
                                        callback2.run(Boolean.TRUE);
                                    }
                                } else if (view2 != null) {
                                    Toast.makeText(m2Var3.getFragmentView().getContext(), LocaleController.getString(R.string.ErrorOccurred), 0).show();
                                    if (callback2 != null) {
                                        callback2.run(Boolean.FALSE);
                                    }
                                } else if (callback2 != null) {
                                    callback2.run(Boolean.FALSE);
                                }
                            } catch (Exception e) {
                                FileLog.e(e);
                            }
                            MediaDataController.getInstance(i12).loadStickers(i11, false, true, false, new a3(runnable, 5));
                        }
                    });
                }
            });
        }
    }

    public static void o(ew ewVar, ArrayList arrayList, org.telegram.ui.ActionBar.m2 m2Var, org.telegram.ui.ActionBar.c6 c6Var, View view, int i10) {
        ov ovVar = ewVar.e;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = null;
        int i11 = 0;
        if (arrayList == null || arrayList.size() <= 1) {
            org.telegram.ui.ActionBar.m1 m1Var = ewVar.G;
            if (m1Var != null) {
                m1Var.d(true);
                ewVar.G = null;
                return;
            }
            if ((m2Var instanceof org.telegram.ui.fo) && ((org.telegram.ui.fo) m2Var).Y.getVisibility() == 0 && (view instanceof vv)) {
                b6 b6Var = ((vv) view).c;
                try {
                    TLRPC.Document document = b6Var.document;
                    if (document == null) {
                        document = s5.f(ewVar.currentAccount, b6Var.getDocumentId());
                    }
                    SpannableString spannableString = new SpannableString(MessageObject.findAnimatedEmojiEmoticon(document));
                    spannableString.setSpan(b6Var, 0, spannableString.length(), 33);
                    ((org.telegram.ui.fo) m2Var).Y.E0.getText().append((CharSequence) spannableString);
                    ewVar.Z();
                    ewVar.dismiss();
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
        if (SystemClock.elapsedRealtime() - ewVar.Q < 250) {
            return;
        }
        int i12 = 0;
        while (true) {
            ArrayList[] arrayListArr = ovVar.c;
            if (i11 >= arrayListArr.length) {
                break;
            }
            int size = arrayListArr[i11].size();
            if (ovVar.c.length > 1) {
                size = Math.min(ewVar.y.J * 2, size);
            }
            i12 += size + 2;
            if (i10 < i12) {
                break;
            } else {
                i11++;
            }
        }
        ArrayList arrayList2 = ovVar.b;
        if (arrayList2 != null && i11 < arrayList2.size()) {
            tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) ovVar.b.get(i11);
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
        new pv(ewVar, m2Var, ewVar.getContext(), c6Var, arrayList3).show();
    }

    public static void q(ew ewVar, b6 b6Var) {
        org.telegram.ui.ActionBar.m1 m1Var = ewVar.G;
        if (m1Var == null) {
            return;
        }
        m1Var.d(true);
        ewVar.G = null;
        SpannableString spannableString = new SpannableString(MessageObject.findAnimatedEmojiEmoticon(s5.f(ewVar.currentAccount, b6Var.getDocumentId())));
        spannableString.setSpan(b6Var, 0, spannableString.length(), 33);
        if (AndroidUtilities.addToClipboard(spannableString)) {
            org.telegram.messenger.sk.p(R.string.EmojiCopied, new zc((FrameLayout) ewVar.containerView, ewVar.resourcesProvider));
        }
    }

    public static /* synthetic */ void r(ew ewVar, ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        ewVar.J = floatValue;
        ewVar.h.setAlpha(floatValue);
        ewVar.v.setAlpha(ewVar.J);
        ewVar.w.setAlpha(ewVar.J);
        ewVar.containerView.invalidate();
    }

    public final int W() {
        if (this.containerView == null) {
            return 0;
        }
        di.v vVar = this.h;
        if (vVar == null || vVar.getChildCount() < 1) {
            return this.containerView.getPaddingTop();
        }
        View childAt = vVar.getChildAt(0);
        xn xnVar = this.d;
        return childAt != xnVar ? this.containerView.getPaddingTop() : xnVar.getBottom() + ((int) vVar.getY());
    }

    public final void a0() {
        org.telegram.ui.ActionBar.m2 m2Var = this.c;
        if (m2Var != null) {
            new sg.y0(m2Var, 11, false).show();
        } else if (getContext() instanceof LaunchActivity) {
            ((LaunchActivity) getContext()).p0(new PremiumPreviewFragment(0, null));
        }
    }

    public final void b0() {
        final int i10;
        TLRPC.StickerSet stickerSet;
        if (this.s == null) {
            return;
        }
        ov ovVar = this.e;
        ArrayList arrayList = ovVar.b == null ? new ArrayList() : new ArrayList(ovVar.b);
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
        boolean z10 = ovVar.a != null && arrayList.size() == ovVar.a.size();
        if (!this.S && z10 && this.R == null) {
            this.R = ValueAnimator.ofFloat(this.J, 1.0f);
            this.containerView.getY();
            this.R.addUpdateListener(new n6(this, 17));
            this.R.setDuration(250L);
            this.R.setInterpolator(es.h);
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
                pl0 pl0Var = this.E;
                pl0Var.b = i14;
                pl0Var.d(E, (AndroidUtilities.displaySize.y / 2) - AndroidUtilities.dp(170.0f), false, false);
            } else {
                vVar.x0(E);
            }
            this.K = this.n.E(this.O);
            sv svVar = this.n;
            int i15 = this.O;
            ew ewVar = svVar.c;
            boolean z11 = ewVar.I;
            ov ovVar2 = ewVar.e;
            int i16 = z11 ? 2 : 1;
            int i17 = 0;
            while (true) {
                ArrayList[] arrayListArr = ovVar2.c;
                if (i17 >= arrayListArr.length) {
                    break;
                }
                int size = arrayListArr[i17].size();
                if (ovVar2.c.length > 1) {
                    size = Math.min(ewVar.y.J * 2, size);
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
        sg.q0 q0Var = this.x;
        TextView textView = this.w;
        TextView textView2 = this.v;
        if (!z12 || this.H) {
            q0Var.setVisibility(8);
            textView2.setVisibility(8);
            textView.setVisibility(8);
            c0(false);
            return;
        }
        q0Var.setVisibility(4);
        if (arrayList4.size() > 0) {
            textView2.setVisibility(0);
            textView.setVisibility(8);
            if (arrayList4.size() == 1) {
                textView2.setText(LocaleController.formatPluralString("AddManyEmojiCount", ((TLRPC.TL_messages_stickerSet) arrayList4.get(0)).documents.size(), new Object[0]));
            } else {
                textView2.setText(LocaleController.formatPluralString("AddManyEmojiPacksCount", arrayList4.size(), new Object[0]));
            }
            textView2.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.kv
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
                                ew ewVar2 = this;
                                if (i18 >= size3) {
                                    ewVar2.Y(true);
                                    if (size2 <= 1) {
                                        ewVar2.dismiss();
                                        break;
                                    }
                                } else {
                                    ew.X(ewVar2.c, (TLObject) arrayList5.get(i18), size2 == 1, size2 > 1 ? new gi.m0(ewVar2, iArr, size2, arrayList5) : null, null);
                                    i18++;
                                }
                            }
                            break;
                        default:
                            ew ewVar3 = this;
                            ewVar3.dismiss();
                            org.telegram.ui.ActionBar.m2 m2Var = ewVar3.c;
                            ArrayList<TLRPC.TL_messages_stickerSet> arrayList6 = arrayList4;
                            if (m2Var != null) {
                                MediaDataController.getInstance(m2Var.getCurrentAccount()).removeMultipleStickerSets(m2Var.getContext(), m2Var, arrayList6);
                            } else {
                                int i19 = 0;
                                while (i19 < arrayList6.size()) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = arrayList6.get(i19);
                                    Context context = ewVar3.getContext();
                                    boolean z13 = i19 == 0;
                                    if (tL_messages_stickerSet2 != null) {
                                        MediaDataController.getInstance(UserConfig.selectedAccount).toggleStickerSet(context, tL_messages_stickerSet2, 0, null, true, z13, null, true);
                                    }
                                    i19++;
                                }
                            }
                            ewVar3.Y(false);
                            break;
                    }
                }
            });
            c0(true);
            return;
        }
        if (arrayList2.size() <= 0) {
            textView2.setVisibility(8);
            textView.setVisibility(8);
            c0(false);
            return;
        }
        textView2.setVisibility(8);
        textView.setVisibility(0);
        if (arrayList2.size() == 1) {
            textView.setText(LocaleController.formatPluralString("RemoveManyEmojiCount", ((TLRPC.TL_messages_stickerSet) arrayList2.get(0)).documents.size(), new Object[0]));
        } else {
            textView.setText(LocaleController.formatPluralString("RemoveManyEmojiPacksCount", arrayList2.size(), new Object[0]));
        }
        textView.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.kv
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
                            ew ewVar2 = this;
                            if (i18 >= size3) {
                                ewVar2.Y(true);
                                if (size2 <= 1) {
                                    ewVar2.dismiss();
                                    break;
                                }
                            } else {
                                ew.X(ewVar2.c, (TLObject) arrayList5.get(i18), size2 == 1, size2 > 1 ? new gi.m0(ewVar2, iArr, size2, arrayList5) : null, null);
                                i18++;
                            }
                        }
                        break;
                    default:
                        ew ewVar3 = this;
                        ewVar3.dismiss();
                        org.telegram.ui.ActionBar.m2 m2Var = ewVar3.c;
                        ArrayList<TLRPC.TL_messages_stickerSet> arrayList6 = arrayList2;
                        if (m2Var != null) {
                            MediaDataController.getInstance(m2Var.getCurrentAccount()).removeMultipleStickerSets(m2Var.getContext(), m2Var, arrayList6);
                        } else {
                            int i19 = 0;
                            while (i19 < arrayList6.size()) {
                                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = arrayList6.get(i19);
                                Context context = ewVar3.getContext();
                                boolean z13 = i19 == 0;
                                if (tL_messages_stickerSet2 != null) {
                                    MediaDataController.getInstance(UserConfig.selectedAccount).toggleStickerSet(context, tL_messages_stickerSet2, 0, null, true, z13, null, true);
                                }
                                i19++;
                            }
                        }
                        ewVar3.Y(false);
                        break;
                }
            }
        });
        c0(true);
    }

    public final void c0(boolean z10) {
        boolean z11 = !this.P && z10;
        float dp = this.w.getVisibility() == 0 ? AndroidUtilities.dp(19.0f) : 0;
        boolean z12 = this.H;
        di.v vVar = this.h;
        View view = this.r;
        FrameLayout frameLayout = this.s;
        float f7 = 0.0f;
        if (z11) {
            ViewPropertyAnimator duration = frameLayout.animate().translationY(z10 ? dp : AndroidUtilities.dp(16.0f)).alpha(z10 ? 1.0f : 0.0f).setDuration(250L);
            es esVar = es.h;
            duration.setInterpolator(esVar).start();
            view.animate().translationY(z10 ? -(AndroidUtilities.dp(68.0f) - dp) : 0.0f).alpha(z10 ? 1.0f : 0.0f).setDuration(250L).setInterpolator(esVar).start();
            ViewPropertyAnimator animate = vVar.animate();
            if (!z12 && !z10) {
                f7 = AndroidUtilities.dp(68.0f) - dp;
            }
            animate.translationY(f7).setDuration(250L).setInterpolator(esVar).start();
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

    @Override // org.telegram.ui.ActionBar.e3
    public final boolean canDismissWithSwipe() {
        return false;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        zv zvVar;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet;
        if (i10 != NotificationCenter.stickersDidLoad) {
            return;
        }
        int i12 = 0;
        while (true) {
            di.v vVar = this.h;
            if (i12 >= vVar.getChildCount()) {
                b0();
                return;
            }
            View childAt = vVar.getChildAt(i12);
            if ((childAt instanceof zv) && (tL_messages_stickerSet = (zvVar = (zv) childAt).r) != null && tL_messages_stickerSet.set != null) {
                zvVar.a(MediaDataController.getInstance(this.currentAccount).isStickerPackInstalled(zvVar.r.set.id), true);
            }
            i12++;
        }
    }

    @Override // org.telegram.ui.ActionBar.e3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.i2
    public void dismiss() {
        uv uvVar = this.f;
        if (uvVar != null && uvVar.w) {
            uvVar.w = false;
            uvVar.invalidate();
        }
        super.dismiss();
        ov ovVar = this.e;
        if (ovVar != null) {
            NotificationCenter.getInstance(ovVar.d).removeObserver(ovVar, NotificationCenter.groupStickersDidLoad);
        }
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 4);
    }

    @Override // org.telegram.ui.ActionBar.e3
    public final int getContainerViewHeight() {
        di.v vVar = this.h;
        int measuredHeight = (vVar == null ? 0 : vVar.getMeasuredHeight()) - W();
        ViewGroup viewGroup = this.containerView;
        return AndroidUtilities.dp(8.0f) + measuredHeight + (viewGroup != null ? viewGroup.getPaddingTop() : 0) + AndroidUtilities.navigationBarHeight;
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.stickersDidLoad);
    }

    @Override // org.telegram.ui.ActionBar.e3, android.app.Dialog
    public final void onBackPressed() {
        if (org.telegram.ui.xt.q().E) {
            org.telegram.ui.xt.q().o();
        } else {
            super.onBackPressed();
        }
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.stickersDidLoad);
    }

    @Override // org.telegram.ui.ActionBar.e3, android.app.Dialog
    public final void show() {
        TLRPC.StickerSet stickerSet;
        super.show();
        sv svVar = new sv(this);
        this.n = svVar;
        this.h.setAdapter(svVar);
        int i10 = 0;
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 4);
        ov ovVar = this.e;
        if (!ovVar.e) {
            ovVar.e = true;
            ew ewVar = ovVar.f;
            int i11 = ovVar.d;
            ovVar.b = new ArrayList(ovVar.a.size());
            ovVar.c = new ArrayList[ovVar.a.size()];
            NotificationCenter.getInstance(i11).addObserver(ovVar, NotificationCenter.groupStickersDidLoad);
            boolean[] zArr = new boolean[1];
            int i12 = 0;
            while (true) {
                if (i12 < ovVar.c.length) {
                    TLRPC.TL_messages_stickerSet stickerSet2 = MediaDataController.getInstance(i11).getStickerSet((TLRPC.InputStickerSet) ovVar.a.get(i12), null, false, new org.telegram.ui.uc(21, ovVar, zArr));
                    if (ovVar.c.length != 1 || stickerSet2 == null || (stickerSet = stickerSet2.set) == null || stickerSet.emojis) {
                        ovVar.b.add(stickerSet2);
                        ovVar.a(i12, stickerSet2);
                        i12++;
                    } else {
                        AndroidUtilities.runOnUIThread(new aw(ovVar, i10));
                        Context context = ewVar.getContext();
                        org.telegram.ui.ActionBar.m2 m2Var = ewVar.c;
                        TLRPC.InputStickerSet inputStickerSet = (TLRPC.InputStickerSet) ovVar.a.get(i12);
                        org.telegram.ui.ActionBar.m2 m2Var2 = ewVar.c;
                        new uy0(context, m2Var, inputStickerSet, null, m2Var2 instanceof org.telegram.ui.fo ? ((org.telegram.ui.fo) m2Var2).Y : null, ewVar.resourcesProvider).show();
                    }
                } else {
                    ew ewVar2 = ovVar.h;
                    ewVar2.b0();
                    di.v vVar = ewVar2.h;
                    if (vVar != null && vVar.getAdapter() != null) {
                        vVar.getAdapter().l();
                    }
                }
            }
        }
        b0();
        org.telegram.ui.ActionBar.m2 m2Var3 = this.c;
        MediaDataController.getInstance(m2Var3 == null ? UserConfig.selectedAccount : m2Var3.getCurrentAccount()).checkStickers(5);
    }

    public void Y(boolean z10) {
    }

    public void Z() {
    }
}
