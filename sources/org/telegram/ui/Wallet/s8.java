package org.telegram.ui.Wallet;

import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.bi;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_toncenter;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.ad;
import org.telegram.ui.Components.c71;
import org.telegram.ui.Components.ds0;
import org.telegram.ui.Components.e71;
import org.telegram.ui.Components.f71;
import org.telegram.ui.Components.fr;
import org.telegram.ui.Components.hs;
import org.telegram.ui.Components.ij;
import org.telegram.ui.Components.mh0;
import org.telegram.ui.Components.p61;
import org.telegram.ui.v9;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final class s8 extends f71 {
    public TextView E;
    public FrameLayout F;
    public TextView G;
    public int I;
    public Runnable J;
    public boolean K;
    public ai.f0 L;
    public ci.g2 M;
    public TextView N;
    public ImageView O;
    public ClipboardManager S;
    public FrameLayout U;
    public ci.d V;
    public int W;
    public int X;
    public int Y;
    public TL_wallet.nftItem d;
    public String e;
    public boolean f;
    public m h;
    public boolean n;
    public gg.b2 v;
    public String w;
    public String x;
    public int y;
    public final ArrayList r = new ArrayList();
    public final ArrayList s = new ArrayList();
    public final p8 H = new NotificationCenter.NotificationCenterDelegate() { // from class: org.telegram.ui.Wallet.p8
        @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
        public final void didReceivedNotification(int i10, int i11, Object[] objArr) {
            e71 e71Var;
            s8 s8Var = s8.this;
            if (s8Var.n || (e71Var = s8Var.a) == null) {
                return;
            }
            e71Var.W2.N(true);
        }
    };
    public boolean P = true;
    public boolean Q = true;
    public boolean R = true;
    public final q8 T = new ClipboardManager.OnPrimaryClipChangedListener() { // from class: org.telegram.ui.Wallet.q8
        @Override // android.content.ClipboardManager.OnPrimaryClipChangedListener
        public final void onPrimaryClipChanged() {
            s8.this.e0(true);
        }
    };

    public static void Y(s8 s8Var, String str, int i10) {
        s8Var.J = null;
        int i11 = s8Var.currentAccount;
        ci.k4 k4Var = new ci.k4(s8Var, i10, 6);
        TL_toncenter.performApiRequest performapirequest = new TL_toncenter.performApiRequest();
        performapirequest.endpoint = "/api/v3/dns/records";
        performapirequest.query = "domain=" + Uri.encode(str) + "&limit=2";
        s8Var.y = ConnectionsManager.getInstance(i11).sendRequestTyped(performapirequest, new org.telegram.messenger.a(), new ai.m0(24, str, k4Var), MessagesController.getInstance(i11).webFileDatacenterId, 0);
    }

    public static void Z(s8 s8Var, k0 k0Var, TLRPC.User user, String str, TL_wallet.walletTransaction wallettransaction, String str2) {
        s8Var.h = null;
        if (s8Var.n) {
            return;
        }
        s8Var.V.setLoading(false);
        if (wallettransaction == null || !k0.b(s8Var.e, k0Var.r())) {
            s8Var.f = false;
            ad a02 = ad.a0(s8Var);
            if (str2 == null) {
                str2 = LocaleController.getString(R.string.WalletCollectibleTransferPrepareFailed);
            }
            a02.e0(str2, false);
            return;
        }
        if (user != null) {
            TL_wallet.walletTransactionPeerUser wallettransactionpeeruser = new TL_wallet.walletTransactionPeerUser();
            wallettransactionpeeruser.user_id = user.id;
            wallettransactionpeeruser.address = str;
            wallettransaction.peer = wallettransactionpeeruser;
        }
        a5.s0(s8Var.getParentActivity(), s8Var.currentAccount, wallettransaction, new u(s8Var, k0Var, user, str), new d(s8Var, 10), null, null, s8Var.getResourceProvider());
    }

    public static void a0(View view, boolean z10, boolean z11) {
        view.animate().cancel();
        view.setEnabled(z10);
        float f7 = z10 ? 1.0f : 0.0f;
        float f10 = z10 ? 1.0f : 0.5f;
        if (z11) {
            view.setVisibility(0);
            view.animate().alpha(f7).scaleX(f10).scaleY(f10).setDuration(320L).setInterpolator(hs.h).withEndAction(new ds0(14, view, z10)).start();
        } else {
            view.setAlpha(f7);
            view.setScaleX(f10);
            view.setScaleY(f10);
            view.setVisibility(z10 ? 0 : 8);
        }
    }

    public static boolean b0(TLRPC.User user) {
        return (user == null || user.bot || user.self || UserObject.isDeleted(user) || UserObject.isService(user.id)) ? false : true;
    }

    @Override // org.telegram.ui.Components.f71
    public final void U(ArrayList arrayList, c71 c71Var) {
        float f7;
        ArrayList arrayList2;
        int i10;
        if (this.L == null) {
            return;
        }
        arrayList.add(p61.C(AndroidUtilities.dp(4.0f)));
        c71Var.U();
        com.google.android.gms.internal.vision.e2.n(R.string.WalletRecipient, arrayList);
        ai.f0 f0Var = this.L;
        p61 p61Var = new p61(-1);
        p61Var.c = f0Var;
        p61Var.z = 50;
        arrayList.add(p61Var);
        c71Var.T();
        String trim = this.M.getText().toString().trim();
        String lowerCase = trim.toLowerCase(Locale.ROOT);
        float f10 = 12.0f;
        int i11 = 0;
        if (this.w != null) {
            if (this.F == null) {
                FrameLayout frameLayout = new FrameLayout(getParentActivity());
                frameLayout.setBackground(org.telegram.ui.ActionBar.i6.g0(getThemedColor(org.telegram.ui.ActionBar.i6.i6), 2, -1));
                boolean z10 = LocaleController.isRTL;
                int i12 = z10 ? 5 : 3;
                ImageView imageView = new ImageView(getParentActivity());
                imageView.setImageDrawable(new fr(org.telegram.ui.ActionBar.i6.K(AndroidUtilities.dp(46.0f), getThemedColor(org.telegram.ui.ActionBar.i6.Oh)), getParentActivity().getResources().getDrawable(R.drawable.menu_gram_24).mutate()));
                frameLayout.addView(imageView, w7.x5.a(46.0f, z10 ? 0.0f : 11.0f, 0.0f, z10 ? 11.0f : 0.0f, 0.0f, 46, i12 | 16));
                TextView textView = new TextView(getParentActivity());
                this.E = textView;
                bi.j(16.0f, R.string.WalletGramWalletAddress, 1, textView);
                textView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.i6.G6));
                textView.setTypeface(AndroidUtilities.bold());
                textView.setSingleLine();
                textView.setGravity(i12);
                frameLayout.addView(textView, w7.x5.a(24.0f, z10 ? 16.0f : 72.0f, 8.0f, z10 ? 72.0f : 16.0f, 0.0f, -1, 48));
                TextView textView2 = new TextView(getParentActivity());
                this.G = textView2;
                textView2.setTextSize(1, 14.0f);
                this.G.setTextColor(getThemedColor(org.telegram.ui.ActionBar.i6.y6));
                this.G.setSingleLine();
                this.G.setEllipsize(TextUtils.TruncateAt.MIDDLE);
                this.G.setGravity(i12);
                frameLayout.addView(this.G, w7.x5.a(22.0f, z10 ? 16.0f : 72.0f, 32.0f, z10 ? 72.0f : 16.0f, 0.0f, -1, 48));
                frameLayout.setOnClickListener(new m8(this, i11));
                this.F = frameLayout;
            }
            TextView textView3 = this.E;
            String str = this.x;
            if (str == null) {
                str = LocaleController.getString(R.string.WalletGramWalletAddress);
            }
            textView3.setText(str);
            this.G.setText(this.w);
            arrayList.add(p61.C(AndroidUtilities.dp(12.0f)));
            c71Var.U();
            FrameLayout frameLayout2 = this.F;
            p61 p61Var2 = new p61(-1);
            p61Var2.c = frameLayout2;
            p61Var2.z = 60;
            arrayList.add(p61Var2);
            c71Var.T();
            return;
        }
        if (TextUtils.isEmpty(lowerCase)) {
            arrayList2 = new ArrayList();
            HashSet hashSet = new HashSet();
            ArrayList<TLRPC.TL_topPeer> arrayList3 = MediaDataController.getInstance(this.currentAccount).hints;
            int size = arrayList3.size();
            int i13 = 0;
            while (i13 < size) {
                TLRPC.TL_topPeer tL_topPeer = arrayList3.get(i13);
                i13++;
                float f11 = f10;
                TLRPC.User user = getMessagesController().getUser(Long.valueOf(tL_topPeer.peer.user_id));
                if (b0(user) && hashSet.add(Long.valueOf(user.id))) {
                    arrayList2.add(user);
                }
                f10 = f11;
            }
            f7 = f10;
            ArrayList arrayList4 = this.r;
            int size2 = arrayList4.size();
            int i14 = 0;
            while (i14 < size2) {
                Object obj = arrayList4.get(i14);
                i14++;
                TLRPC.User user2 = (TLRPC.User) obj;
                if (hashSet.add(Long.valueOf(user2.id))) {
                    arrayList2.add(user2);
                }
            }
        } else {
            f7 = 12.0f;
            arrayList2 = this.s;
        }
        int size3 = arrayList2.size();
        int i15 = 0;
        int i16 = 0;
        while (i16 < size3) {
            Object obj2 = arrayList2.get(i16);
            i16++;
            TLRPC.User user3 = (TLRPC.User) obj2;
            if (i15 == 0) {
                arrayList.add(p61.C(AndroidUtilities.dp(f7)));
                c71Var.U();
                if (TextUtils.isEmpty(lowerCase)) {
                    com.google.android.gms.internal.vision.e2.n(R.string.Recent, arrayList);
                }
            }
            p61 v = p61.v(user3);
            if (TextUtils.isEmpty(lowerCase)) {
                i10 = i11;
            } else {
                v.l = AndroidUtilities.generateSearchName(user3.first_name, user3.last_name, trim);
                String publicUsername = UserObject.getPublicUsername(user3);
                if (!TextUtils.isEmpty(publicUsername)) {
                    v.m = AndroidUtilities.generateSearchName(sc.v.i("@", publicUsername), null, "@".concat(trim));
                }
                i10 = i11;
                v.F = new o(user3, v.l, v.m, 8);
            }
            arrayList.add(v);
            i15++;
            i11 = i10;
        }
        int i17 = i11;
        if (this.K) {
            if (i15 == 0) {
                arrayList.add(p61.C(AndroidUtilities.dp(f7)));
                c71Var.U();
            }
            int i18 = this.x != null ? 1 : 3;
            for (int i19 = i17; i19 < i18; i19++) {
                arrayList.add(p61.o((-1) - i19, 18));
            }
        }
        if (i15 > 0 || this.K) {
            c71Var.T();
        }
        if (this.K || i15 > 0 || TextUtils.isEmpty(lowerCase)) {
            return;
        }
        String string = LocaleController.getString(R.string.SearchEmptyViewTitle);
        int i20 = R.string.WalletSearchNoResults;
        Object[] objArr = new Object[1];
        objArr[i17] = lowerCase;
        String formatString = LocaleController.formatString(i20, objArr);
        int i21 = ij.a;
        p61 J = p61.J(ij.class);
        J.l = string;
        J.m = formatString;
        arrayList.add(J);
    }

    @Override // org.telegram.ui.Components.f71
    public final CharSequence V() {
        return LocaleController.getString(this.d == null ? R.string.WalletSendGrams : R.string.WalletTransferCollectible);
    }

    @Override // org.telegram.ui.Components.f71
    public final void W(p61 p61Var, View view) {
        Object obj = p61Var.G;
        if (obj instanceof TLRPC.User) {
            TLRPC.User user = (TLRPC.User) obj;
            int i10 = this.currentAccount;
            MessagesStorage.getInstance(i10).getStorageQueue().postRunnable(new ei.b2(i10, user.id, 1));
            AndroidUtilities.hideKeyboard(this.M);
            f0(null, user);
        }
    }

    @Override // org.telegram.ui.Components.f71
    public final boolean X(p61 p61Var, View view) {
        return false;
    }

    public final void c0() {
        if (getParentActivity() == null) {
            return;
        }
        AndroidUtilities.hideKeyboard(this.M);
        if (getParentActivity().checkSelfPermission("android.permission.CAMERA") != 0) {
            getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 44);
        } else {
            v9.e0(getParentActivity(), true, 1, new r8(this));
        }
    }

    @Override // org.telegram.ui.Components.f71, org.telegram.ui.ActionBar.n2
    public final View createView(Context context) {
        this.fragmentView = super.createView(context);
        this.actionBar.setAdaptiveBackground(this.a);
        this.a.p1();
        this.a.setPadding(0, 0, 0, AndroidUtilities.dp(68.0f));
        this.a.setClipToPadding(false);
        e71 e71Var = this.a;
        e71Var.W2.r = false;
        e71Var.j(new mh0(this, 11));
        ai.f0 f0Var = new ai.f0(this, context, 25);
        this.S = (ClipboardManager) context.getSystemService("clipboard");
        ci.g2 g2Var = new ci.g2(context);
        this.M = g2Var;
        g2Var.setTextColor(getThemedColor(org.telegram.ui.ActionBar.i6.G6));
        this.M.setHintTextColor(org.telegram.ui.ActionBar.i6.m1(0.72f, getThemedColor(org.telegram.ui.ActionBar.i6.H6)));
        this.M.setTextSize(1, 16.0f);
        this.M.setHint(LocaleController.getString(R.string.WalletAddressOrName));
        this.M.setSingleLine(true);
        this.M.setBackground(null);
        this.M.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
        this.M.setClipToPadding(true);
        this.M.setCursorWidth(1.5f);
        this.M.setGravity(16);
        this.M.setInputType(524289);
        this.M.setImeOptions(33554437);
        f0Var.addView(this.M, w7.x5.a(-1.0f, 8.0f, 0.0f, 52.0f, 0.0f, -1, 119));
        TextView textView = new TextView(context);
        this.N = textView;
        textView.setText(LocaleController.getString(R.string.WalletPaste));
        TextView textView2 = this.N;
        int i10 = org.telegram.ui.ActionBar.i6.n6;
        textView2.setTextColor(getThemedColor(i10));
        this.N.setTextSize(1, 14.0f);
        this.N.setTypeface(AndroidUtilities.bold());
        this.N.setGravity(17);
        int m12 = org.telegram.ui.ActionBar.i6.m1(0.1f, getThemedColor(i10));
        TextView textView3 = this.N;
        int dp = AndroidUtilities.dp(16.0f);
        int m13 = org.telegram.ui.ActionBar.i6.m1(0.18f, getThemedColor(i10));
        textView3.setBackground(org.telegram.ui.ActionBar.i6.j0(dp, dp, dp, dp, m12, m13, m13));
        this.N.setOnClickListener(new m8(this, 2));
        w7.z5.b(this.N, 0.04f, 1.2f);
        f0Var.addView(this.N, w7.x5.a(32.0f, 0.0f, 0.0f, 62.0f, 0.0f, 58, 21));
        this.M.addTextChangedListener(new ci.h2(this, 16));
        ImageView imageView = new ImageView(context);
        this.O = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        this.O.setImageResource(R.drawable.scan_qr);
        this.O.setColorFilter(new PorterDuffColorFilter(getThemedColor(i10), PorterDuff.Mode.SRC_IN));
        this.O.setBackground(org.telegram.ui.ActionBar.i6.g0(org.telegram.ui.ActionBar.i6.m1(0.12f, getThemedColor(i10)), 1, -1));
        this.O.setContentDescription(LocaleController.getString(R.string.WalletScanQRCode));
        this.O.setOnClickListener(new m8(this, 3));
        f0Var.addView(this.O, w7.x5.a(40.0f, 0.0f, 0.0f, 20.0f, 0.0f, 32, 21));
        e0(false);
        this.L = f0Var;
        gg.b2 b2Var = new gg.b2(true);
        this.v = b2Var;
        b2Var.a = new k2.g0(this, 16);
        getNotificationCenter().addObserver(this.H, NotificationCenter.reloadHints);
        MediaDataController.getInstance(this.currentAccount).loadHints(true);
        this.r.clear();
        int i11 = this.currentAccount;
        MessagesStorage.getInstance(i11).getStorageQueue().postRunnable(new gg.n(i11, 0, new n8(this), 0));
        if (!TextUtils.isEmpty(null)) {
            this.M.setText((CharSequence) null);
            ci.g2 g2Var2 = this.M;
            g2Var2.setSelection(g2Var2.length());
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.U = frameLayout;
        frameLayout.setPadding(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(10.0f));
        int themedColor = getThemedColor(org.telegram.ui.ActionBar.i6.a7);
        this.U.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{org.telegram.ui.ActionBar.i6.m1(0.0f, themedColor), themedColor, themedColor}));
        ci.d dVar = new ci.d(context, getResourceProvider(), true);
        dVar.setRoundRadius(24);
        this.V = dVar;
        dVar.setText(LocaleController.getString(R.string.WalletContinue));
        this.V.setEnabled(false);
        this.V.setOnClickListener(new m8(this, 1));
        ci.d dVar2 = this.V;
        if (dVar2 != null) {
            dVar2.setEnabled(this.w != null);
        }
        this.U.addView(this.V, w7.x5.e(-1, 48, 119));
        ((FrameLayout) this.fragmentView).addView(this.U, w7.x5.e(-1, 68, 87));
        h0();
        this.a.W2.N(false);
        return this.fragmentView;
    }

    public final void d0(String str) {
        String userName;
        String publicUsername;
        ArrayList arrayList = this.s;
        arrayList.clear();
        if (TextUtils.isEmpty(str) || this.w != null || this.x != null) {
            e71 e71Var = this.a;
            if (e71Var != null) {
                e71Var.W2.N(true);
                return;
            }
            return;
        }
        String lowerCase = str.toLowerCase(Locale.ROOT);
        HashSet hashSet = new HashSet();
        ArrayList<TLRPC.Dialog> arrayList2 = getMessagesController().dialogsUsersOnly;
        int size = arrayList2.size();
        int i10 = 0;
        int i11 = 0;
        while (i11 < size) {
            TLRPC.Dialog dialog = arrayList2.get(i11);
            i11++;
            TLRPC.Dialog dialog2 = dialog;
            if (dialog2 != null && dialog2.id > 0) {
                TLRPC.User user = getMessagesController().getUser(Long.valueOf(dialog2.id));
                if (b0(user) && (((userName = UserObject.getUserName(user)) != null && userName.toLowerCase(Locale.ROOT).contains(lowerCase)) || ((publicUsername = UserObject.getPublicUsername(user)) != null && publicUsername.toLowerCase(Locale.ROOT).contains(lowerCase)))) {
                    if (hashSet.add(Long.valueOf(user.id))) {
                        arrayList.add(user);
                    }
                }
            }
        }
        ArrayList arrayList3 = this.v.e;
        int size2 = arrayList3.size();
        while (i10 < size2) {
            Object obj = arrayList3.get(i10);
            i10++;
            TLObject tLObject = (TLObject) obj;
            if (tLObject instanceof TLRPC.User) {
                TLRPC.User user2 = (TLRPC.User) tLObject;
                if (b0(user2) && hashSet.add(Long.valueOf(user2.id))) {
                    arrayList.add(user2);
                }
            }
        }
        e71 e71Var2 = this.a;
        if (e71Var2 != null) {
            e71Var2.W2.N(true);
        }
    }

    public final void e0(boolean z10) {
        if (this.n || this.M == null || this.O == null) {
            return;
        }
        ClipboardManager clipboardManager = this.S;
        if (clipboardManager != null) {
            this.R = clipboardManager.hasPrimaryClip();
        } else {
            this.R = false;
        }
        i0(z10);
    }

    public final void f0(String str, TLRPC.User user) {
        j8 j8Var;
        if (this.d == null) {
            if (user != null) {
                j8Var = new j8(user);
            } else {
                j8 j8Var2 = new j8(str);
                j8Var2.u0(TextUtils.equals(str, this.w) ? this.x : null);
                j8Var = j8Var2;
            }
            presentFragment(j8Var);
            return;
        }
        if (this.f) {
            return;
        }
        this.f = true;
        this.V.setLoading(true);
        k0 v = k0.v(this.currentAccount);
        o oVar = new o((f71) this, v, (Object) user, 7);
        if (user != null) {
            v.W(user, new ai.m0(29, this, oVar));
        } else {
            oVar.run(str);
        }
    }

    public final void g0(TL_wallet.nftItem nftitem) {
        this.d = nftitem;
        this.e = k0.v(this.currentAccount).r();
    }

    public final void h0() {
        int max = Math.max(0, this.X - this.W);
        e71 e71Var = this.a;
        if (e71Var != null) {
            e71Var.setPadding(0, 0, 0, AndroidUtilities.dp(68.0f) + this.W + max);
            this.a.setClipToPadding(false);
        }
        FrameLayout frameLayout = this.U;
        if (frameLayout != null) {
            frameLayout.setPadding(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(10.0f) + this.W);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.U.getLayoutParams();
            layoutParams.height = AndroidUtilities.dp(68.0f) + this.W;
            this.U.setLayoutParams(layoutParams);
            if (this.Y != max) {
                this.U.animate().cancel();
                this.U.animate().translationY(-max).setDuration(320L).setInterpolator(hs.h).start();
                this.Y = max;
            }
        }
    }

    public final void i0(boolean z10) {
        if (this.O == null) {
            return;
        }
        boolean z11 = false;
        boolean z12 = this.M.length() == 0;
        if (z12 && this.R) {
            z11 = true;
        }
        if (this.P != z11 || !z10) {
            this.P = z11;
            a0(this.N, z11, z10);
        }
        if (this.Q != z12 || !z10) {
            this.Q = z12;
            a0(this.O, z12, z10);
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.M.getLayoutParams();
        int dp = AndroidUtilities.dp(this.P ? 128.0f : this.Q ? 60.0f : 8.0f);
        if (layoutParams.rightMargin != dp) {
            layoutParams.rightMargin = dp;
            this.M.setLayoutParams(layoutParams);
        }
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onFragmentDestroy() {
        this.n = true;
        ClipboardManager clipboardManager = this.S;
        if (clipboardManager != null) {
            clipboardManager.removePrimaryClipChangedListener(this.T);
        }
        TextView textView = this.N;
        if (textView != null) {
            textView.animate().cancel();
        }
        ImageView imageView = this.O;
        if (imageView != null) {
            imageView.animate().cancel();
        }
        if (this.y != 0) {
            getConnectionsManager().cancelRequest(this.y, true);
        }
        FrameLayout frameLayout = this.U;
        if (frameLayout != null) {
            frameLayout.animate().cancel();
        }
        getNotificationCenter().removeObserver(this.H, NotificationCenter.reloadHints);
        Runnable runnable = this.J;
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
        }
        m mVar = this.h;
        if (mVar != null) {
            mVar.run();
        }
        super.onFragmentDestroy();
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onInsets(int i10, int i11, int i12, int i13) {
        this.W = i13;
        h0();
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final r0.k1 onInsetsInternal(View view, r0.k1 k1Var) {
        this.X = k1Var.a.f(8).d;
        return super.onInsetsInternal(view, k1Var);
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onPause() {
        ClipboardManager clipboardManager = this.S;
        if (clipboardManager != null) {
            clipboardManager.removePrimaryClipChangedListener(this.T);
        }
        super.onPause();
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onRequestPermissionsResultFragment(int i10, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResultFragment(i10, strArr, iArr);
        if (i10 != 44 || getParentActivity() == null) {
            return;
        }
        if (iArr.length > 0 && iArr[0] == 0) {
            c0();
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        alertDialog$Builder.a.T = AndroidUtilities.replaceTags(LocaleController.getString(R.string.QRCodePermissionNoCameraWithHint));
        alertDialog$Builder.k(LocaleController.getString(R.string.PermissionOpenSettings), new n8(this));
        alertDialog$Builder.h(LocaleController.getString(R.string.ContactsPermissionAlertNotNow), null);
        alertDialog$Builder.m(R.raw.permission_request_camera, 72, org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.L5, false), null);
        alertDialog$Builder.o();
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onResume() {
        super.onResume();
        ClipboardManager clipboardManager = this.S;
        if (clipboardManager != null) {
            q8 q8Var = this.T;
            clipboardManager.removePrimaryClipChangedListener(q8Var);
            this.S.addPrimaryClipChangedListener(q8Var);
        }
        e0(true);
    }
}
