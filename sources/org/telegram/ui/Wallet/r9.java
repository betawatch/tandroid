package org.telegram.ui.Wallet;

import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import bi.qa;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_toncenter;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.ar;
import org.telegram.ui.Components.b10;
import org.telegram.ui.Components.d60;
import org.telegram.ui.Components.dj;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.gb1;
import org.telegram.ui.Components.j71;
import org.telegram.ui.Components.l71;
import org.telegram.ui.Components.m71;
import org.telegram.ui.Components.ml;
import org.telegram.ui.Components.t61;
import org.telegram.ui.Components.wc;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final class r9 extends m71 {
    public int E;
    public TextView F;
    public FrameLayout G;
    public TextView H;
    public int J;
    public Runnable K;
    public boolean L;
    public p5 M;
    public fi.c2 N;
    public TextView O;
    public ImageView P;
    public ClipboardManager T;
    public FrameLayout V;
    public ImageView W;
    public ShapeDrawable X;
    public int Y;
    public fi.d Z;
    public int a0;
    public int b0;
    public int c0;
    public ai.o0 d0;
    public TL_wallet.nftItem e;
    public String f;
    public boolean h;
    public m n;
    public boolean r;
    public ig.a2 w;
    public String x;
    public String y;
    public final ArrayList s = new ArrayList();
    public final ArrayList v = new ArrayList();
    public final h3 I = new h3(this, 1);
    public boolean Q = true;
    public boolean R = true;
    public boolean S = true;
    public final q9 U = new ClipboardManager.OnPrimaryClipChangedListener() { // from class: org.telegram.ui.Wallet.q9
        @Override // android.content.ClipboardManager.OnPrimaryClipChangedListener
        public final void onPrimaryClipChanged() {
            r9.this.g0(true);
        }
    };

    public static void Z(r9 r9Var, l0 l0Var, TLRPC.User user, String str, TL_wallet.walletTransaction wallettransaction, String str2) {
        r9Var.n = null;
        if (r9Var.r) {
            return;
        }
        r9Var.Z.setLoading(false);
        if (wallettransaction == null || !l0.a(r9Var.f, l0Var.s())) {
            r9Var.h = false;
            wc b02 = wc.b0(r9Var);
            if (str2 == null) {
                str2 = LocaleController.getString(R.string.WalletCollectibleTransferPrepareFailed);
            }
            b02.f0(str2, false);
            return;
        }
        if (user != null) {
            TL_wallet.walletTransactionPeerUser wallettransactionpeeruser = new TL_wallet.walletTransactionPeerUser();
            wallettransactionpeeruser.user_id = user.id;
            wallettransactionpeeruser.address = str;
            wallettransaction.peer = wallettransactionpeeruser;
        }
        m5.C0(r9Var.getParentActivity(), r9Var.currentAccount, wallettransaction, new t(r9Var, l0Var, user, str), new d(r9Var, 10), null, null, r9Var.getResourceProvider());
    }

    public static void a0(r9 r9Var, String str) {
        String h02 = h0(str);
        if (r9Var.isFinished || r9Var.N == null || h02 == null) {
            return;
        }
        if (h02.startsWith("@")) {
            int i10 = r9Var.currentAccount;
            MessagesController.getInstance(i10).getUserNameResolver().resolve(h02.substring(1), new fi.c4(i10, new m9(r9Var, 1)));
            return;
        }
        r9Var.N.setText(h02);
        fi.c2 c2Var = r9Var.N;
        c2Var.setSelection(c2Var.length());
        AndroidUtilities.hideKeyboard(r9Var.N);
        r9Var.i0(h02, null);
    }

    public static void b0(r9 r9Var, String str, int i10) {
        r9Var.K = null;
        int i11 = r9Var.currentAccount;
        fi.c4 c4Var = new fi.c4(r9Var, i10, 7);
        TL_toncenter.performApiRequest performapirequest = new TL_toncenter.performApiRequest();
        performapirequest.endpoint = "/api/v3/dns/records";
        performapirequest.query = "domain=" + Uri.encode(str) + "&limit=2";
        r9Var.E = ConnectionsManager.getInstance(i11).sendRequestTyped(performapirequest, new org.telegram.messenger.a(), new bi.m5(29, str, c4Var), MessagesController.getInstance(i11).webFileDatacenterId, 0);
    }

    public static void c0(View view, boolean z10, boolean z11) {
        view.animate().cancel();
        view.setEnabled(z10);
        float f7 = z10 ? 1.0f : 0.0f;
        float f10 = z10 ? 1.0f : 0.5f;
        if (z11) {
            view.setVisibility(0);
            view.animate().alpha(f7).scaleX(f10).scaleY(f10).setDuration(320L).setInterpolator(ds.h).withEndAction(new d60(19, view, z10)).start();
        } else {
            view.setAlpha(f7);
            view.setScaleX(f10);
            view.setScaleY(f10);
            view.setVisibility(z10 ? 0 : 8);
        }
    }

    public static boolean d0(TLRPC.User user) {
        return (user == null || user.bot || user.self || UserObject.isDeleted(user) || UserObject.isService(user.id)) ? false : true;
    }

    public static String h0(String str) {
        Uri X0 = m5.X0(str);
        if ("ton".equalsIgnoreCase(X0.getScheme())) {
            if ("transfer".equalsIgnoreCase(X0.getAuthority()) && X0.getPathSegments().size() == 1) {
                String str2 = X0.getPathSegments().get(0);
                if (WalletEngine2.isValidRecipientAddress(str2)) {
                    return str2;
                }
            }
            return null;
        }
        if (!m5.y0(X0)) {
            return null;
        }
        String Y0 = m5.Y0(X0);
        if (Y0 != null) {
            return "@".concat(Y0);
        }
        String queryParameter = X0.getQueryParameter("to");
        if (TextUtils.isEmpty(queryParameter)) {
            return null;
        }
        if (!queryParameter.startsWith("@") && !queryParameter.matches("[a-zA-Z0-9_]{1,32}")) {
            if (WalletEngine2.isValidRecipientAddress(queryParameter)) {
                return queryParameter;
            }
            return null;
        }
        if (queryParameter.startsWith("@")) {
            queryParameter = queryParameter.substring(1);
        }
        if (TextUtils.isEmpty(queryParameter)) {
            return null;
        }
        return b10.j("@", queryParameter);
    }

    @Override // org.telegram.ui.Components.m71
    public final void V(ArrayList arrayList, j71 j71Var) {
        float f7;
        ArrayList arrayList2;
        int i10;
        if (this.M == null) {
            return;
        }
        arrayList.add(t61.D(AndroidUtilities.dp(4.0f)));
        j71Var.V();
        ic.a.p(R.string.WalletRecipient, arrayList);
        p5 p5Var = this.M;
        t61 t61Var = new t61(-1);
        t61Var.c = p5Var;
        t61Var.z = 50;
        arrayList.add(t61Var);
        j71Var.U();
        String trim = this.N.getText().toString().trim();
        String lowerCase = trim.toLowerCase(Locale.ROOT);
        float f10 = 12.0f;
        int i11 = 0;
        if (this.x != null) {
            if (this.G == null) {
                FrameLayout frameLayout = new FrameLayout(getParentActivity());
                frameLayout.setBackground(org.telegram.ui.ActionBar.y6.g0(getThemedColor(org.telegram.ui.ActionBar.y6.i6), 2, -1));
                boolean z10 = LocaleController.isRTL;
                int i12 = z10 ? 5 : 3;
                ImageView imageView = new ImageView(getParentActivity());
                this.W = imageView;
                ShapeDrawable K = org.telegram.ui.ActionBar.y6.K(AndroidUtilities.dp(46.0f), getThemedColor(org.telegram.ui.ActionBar.y6.Oh));
                this.X = K;
                imageView.setImageDrawable(new ar(K, getParentActivity().getResources().getDrawable(R.drawable.menu_gram_24).mutate()));
                frameLayout.addView(imageView, gb1.h(46, 46.0f, i12 | 16, z10 ? 0.0f : 11.0f, 0.0f, z10 ? 11.0f : 0.0f, 0.0f));
                TextView textView = new TextView(getParentActivity());
                this.F = textView;
                org.telegram.ui.d3.o(R.string.WalletGramWalletAddress, textView, 1, 16.0f);
                org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.G6, getResourceProvider());
                textView.setTypeface(AndroidUtilities.bold());
                textView.setSingleLine();
                textView.setGravity(i12);
                frameLayout.addView(textView, gb1.h(-1, 24.0f, 48, z10 ? 16.0f : 72.0f, 8.0f, z10 ? 72.0f : 16.0f, 0.0f));
                TextView textView2 = new TextView(getParentActivity());
                this.H = textView2;
                textView2.setTextSize(1, 14.0f);
                org.telegram.ui.ActionBar.f7.V(this.H, org.telegram.ui.ActionBar.y6.y6, getResourceProvider());
                this.H.setSingleLine();
                this.H.setEllipsize(TextUtils.TruncateAt.MIDDLE);
                this.H.setGravity(i12);
                frameLayout.addView(this.H, gb1.h(-1, 22.0f, 48, z10 ? 16.0f : 72.0f, 32.0f, z10 ? 72.0f : 16.0f, 0.0f));
                frameLayout.setOnClickListener(new l9(this, i11));
                this.G = frameLayout;
            }
            TextView textView3 = this.F;
            String str = this.y;
            if (str == null) {
                str = LocaleController.getString(R.string.WalletGramWalletAddress);
            }
            textView3.setText(str);
            this.H.setText(this.x);
            arrayList.add(t61.D(AndroidUtilities.dp(12.0f)));
            j71Var.V();
            FrameLayout frameLayout2 = this.G;
            t61 t61Var2 = new t61(-1);
            t61Var2.c = frameLayout2;
            t61Var2.z = 60;
            arrayList.add(t61Var2);
            j71Var.U();
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
                if (d0(user) && hashSet.add(Long.valueOf(user.id))) {
                    arrayList2.add(user);
                }
                f10 = f11;
            }
            f7 = f10;
            ArrayList arrayList4 = this.s;
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
            arrayList2 = this.v;
        }
        int size3 = arrayList2.size();
        int i15 = 0;
        int i16 = 0;
        while (i16 < size3) {
            Object obj2 = arrayList2.get(i16);
            i16++;
            TLRPC.User user3 = (TLRPC.User) obj2;
            if (i15 == 0) {
                arrayList.add(t61.D(AndroidUtilities.dp(f7)));
                j71Var.V();
                if (TextUtils.isEmpty(lowerCase)) {
                    ic.a.p(R.string.Recent, arrayList);
                }
            }
            t61 w10 = t61.w(user3);
            if (TextUtils.isEmpty(lowerCase)) {
                i10 = i11;
            } else {
                w10.l = AndroidUtilities.generateSearchName(user3.first_name, user3.last_name, trim);
                String publicUsername = UserObject.getPublicUsername(user3);
                if (!TextUtils.isEmpty(publicUsername)) {
                    w10.m = AndroidUtilities.generateSearchName(b10.j("@", publicUsername), null, "@".concat(trim));
                }
                i10 = i11;
                w10.F = new o(user3, w10.l, w10.m, 8);
            }
            arrayList.add(w10);
            i15++;
            i11 = i10;
        }
        int i17 = i11;
        if (this.L) {
            if (i15 == 0) {
                arrayList.add(t61.D(AndroidUtilities.dp(f7)));
                j71Var.V();
            }
            int i18 = this.y != null ? 1 : 3;
            for (int i19 = i17; i19 < i18; i19++) {
                arrayList.add(t61.q((-1) - i19, 18));
            }
        }
        if (i15 > 0 || this.L) {
            j71Var.U();
        }
        if (this.L || i15 > 0 || TextUtils.isEmpty(lowerCase)) {
            return;
        }
        String string = LocaleController.getString(R.string.SearchEmptyViewTitle);
        int i20 = R.string.WalletSearchNoResults;
        Object[] objArr = new Object[1];
        objArr[i17] = lowerCase;
        String formatString = LocaleController.formatString(i20, objArr);
        int i21 = dj.a;
        t61 K2 = t61.K(dj.class);
        K2.l = string;
        K2.m = formatString;
        arrayList.add(K2);
    }

    @Override // org.telegram.ui.Components.m71
    public final CharSequence W() {
        return LocaleController.getString(this.e == null ? R.string.WalletSendGrams : R.string.WalletTransferCollectible);
    }

    @Override // org.telegram.ui.Components.m71
    public final void X(t61 t61Var, View view) {
        Object obj = t61Var.G;
        if (obj instanceof TLRPC.User) {
            TLRPC.User user = (TLRPC.User) obj;
            int i10 = this.currentAccount;
            MessagesStorage.getInstance(i10).getStorageQueue().postRunnable(new qa(i10, user.id, 2));
            AndroidUtilities.hideKeyboard(this.N);
            i0(null, user);
        }
    }

    @Override // org.telegram.ui.Components.m71
    public final boolean Y(t61 t61Var, View view) {
        return false;
    }

    @Override // org.telegram.ui.Components.m71, org.telegram.ui.ActionBar.r2
    public final View createView(Context context) {
        this.fragmentView = super.createView(context);
        this.actionBar.setAdaptiveBackground(this.a);
        this.a.u1();
        this.a.setPadding(0, 0, 0, AndroidUtilities.dp(68.0f));
        this.a.setClipToPadding(false);
        l71 l71Var = this.a;
        l71Var.g3.r = false;
        l71Var.j(new ml(this, 21));
        p5 p5Var = new p5(this, context, 1);
        this.T = (ClipboardManager) context.getSystemService("clipboard");
        fi.c2 c2Var = new fi.c2(context);
        this.N = c2Var;
        org.telegram.ui.ActionBar.f7.V(c2Var, org.telegram.ui.ActionBar.y6.G6, getResourceProvider());
        fi.c2 c2Var2 = this.N;
        org.telegram.ui.ActionBar.b7 L = org.telegram.ui.ActionBar.f7.L(0.72f, org.telegram.ui.ActionBar.y6.H6);
        org.telegram.ui.ActionBar.f7.o(c2Var2, 1, L.a, -1, 2, L.d, getResourceProvider());
        this.N.setTextSize(1, 16.0f);
        this.N.setHint(LocaleController.getString(R.string.WalletAddressOrName));
        this.N.setSingleLine(true);
        this.N.setBackground(null);
        this.N.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
        this.N.setClipToPadding(true);
        this.N.setCursorWidth(1.5f);
        this.N.setGravity(16);
        this.N.setInputType(524289);
        this.N.setImeOptions(33554437);
        p5Var.addView(this.N, gb1.h(-1, -1.0f, 119, 8.0f, 0.0f, 52.0f, 0.0f));
        TextView textView = new TextView(context);
        this.O = textView;
        textView.setText(LocaleController.getString(R.string.WalletPaste));
        TextView textView2 = this.O;
        int i10 = org.telegram.ui.ActionBar.y6.n6;
        org.telegram.ui.ActionBar.f7.V(textView2, i10, getResourceProvider());
        this.O.setTextSize(1, 14.0f);
        this.O.setTypeface(AndroidUtilities.bold());
        this.O.setGravity(17);
        int o12 = org.telegram.ui.ActionBar.y6.o1(0.1f, getThemedColor(i10));
        TextView textView3 = this.O;
        int dp = AndroidUtilities.dp(16.0f);
        int o13 = org.telegram.ui.ActionBar.y6.o1(0.18f, getThemedColor(i10));
        org.telegram.ui.ActionBar.f7.R(textView3, org.telegram.ui.ActionBar.y6.j0(dp, dp, dp, dp, o12, o13, o13), org.telegram.ui.ActionBar.f7.L(0.1f, i10), org.telegram.ui.ActionBar.f7.L(0.18f, i10), getResourceProvider());
        this.O.setOnClickListener(new l9(this, 2));
        gb1.c(this.O, 0.04f, 1.2f);
        p5Var.addView(this.O, gb1.h(58, 32.0f, 21, 0.0f, 0.0f, 62.0f, 0.0f));
        this.N.addTextChangedListener(new bi.u(this, 17));
        ImageView imageView = new ImageView(context);
        this.P = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        this.P.setImageResource(R.drawable.scan_qr);
        org.telegram.ui.ActionBar.f7.t(this.P, i10, getResourceProvider(), PorterDuff.Mode.SRC_IN);
        org.telegram.ui.ActionBar.f7.R(this.P, org.telegram.ui.ActionBar.y6.g0(org.telegram.ui.ActionBar.y6.o1(0.12f, getThemedColor(i10)), 1, -1), null, org.telegram.ui.ActionBar.f7.L(0.12f, i10), getResourceProvider());
        this.P.setContentDescription(LocaleController.getString(R.string.WalletScanQRCode));
        this.P.setOnClickListener(new l9(this, 3));
        p5Var.addView(this.P, gb1.h(32, 40.0f, 21, 0.0f, 0.0f, 20.0f, 0.0f));
        g0(false);
        this.M = p5Var;
        ig.a2 a2Var = new ig.a2(true);
        this.w = a2Var;
        a2Var.a = new jg.s0(this, 23);
        getNotificationCenter().addObserver(this.I, NotificationCenter.reloadHints);
        MediaDataController.getInstance(this.currentAccount).loadHints(true);
        this.s.clear();
        int i11 = this.currentAccount;
        MessagesStorage.getInstance(i11).getStorageQueue().postRunnable(new i2.v(i11, 0, new o9(this), 2));
        if (!TextUtils.isEmpty(null)) {
            this.N.setText((CharSequence) null);
            fi.c2 c2Var3 = this.N;
            c2Var3.setSelection(c2Var3.length());
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.V = frameLayout;
        frameLayout.setPadding(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(10.0f));
        int themedColor = getThemedColor(org.telegram.ui.ActionBar.y6.a7);
        this.V.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{org.telegram.ui.ActionBar.y6.o1(0.0f, themedColor), themedColor, themedColor}));
        fi.d dVar = new fi.d(context, getResourceProvider(), true);
        dVar.setRoundRadius(24);
        this.Z = dVar;
        dVar.setText(LocaleController.getString(R.string.WalletContinue));
        this.Z.setEnabled(false);
        this.Z.setOnClickListener(new l9(this, 1));
        fi.d dVar2 = this.Z;
        if (dVar2 != null) {
            dVar2.setEnabled(this.x != null);
        }
        this.V.addView(this.Z, gb1.i(-1, 48, 119));
        ((FrameLayout) this.fragmentView).addView(this.V, gb1.i(-1, 68, 87));
        k0();
        this.a.g3.O(false);
        return this.fragmentView;
    }

    public final void e0() {
        if (getParentActivity() == null || this.d0 != null || this.P == null) {
            return;
        }
        AndroidUtilities.hideKeyboard(this.N);
        if (getParentActivity().checkSelfPermission("android.permission.CAMERA") != 0) {
            getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 44);
        } else {
            this.d0 = ai.o0.k(this, this.P, new ai.d0(15), new m9(this, 0), new n9(this, 0));
        }
    }

    public final void f0(String str) {
        String userName;
        String publicUsername;
        ArrayList arrayList = this.v;
        arrayList.clear();
        if (TextUtils.isEmpty(str) || this.x != null || this.y != null) {
            l71 l71Var = this.a;
            if (l71Var != null) {
                l71Var.g3.O(true);
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
                if (d0(user) && (((userName = UserObject.getUserName(user)) != null && userName.toLowerCase(Locale.ROOT).contains(lowerCase)) || ((publicUsername = UserObject.getPublicUsername(user)) != null && publicUsername.toLowerCase(Locale.ROOT).contains(lowerCase)))) {
                    if (hashSet.add(Long.valueOf(user.id))) {
                        arrayList.add(user);
                    }
                }
            }
        }
        ArrayList arrayList3 = this.w.e;
        int size2 = arrayList3.size();
        while (i10 < size2) {
            Object obj = arrayList3.get(i10);
            i10++;
            TLObject tLObject = (TLObject) obj;
            if (tLObject instanceof TLRPC.User) {
                TLRPC.User user2 = (TLRPC.User) tLObject;
                if (d0(user2) && hashSet.add(Long.valueOf(user2.id))) {
                    arrayList.add(user2);
                }
            }
        }
        l71 l71Var2 = this.a;
        if (l71Var2 != null) {
            l71Var2.g3.O(true);
        }
    }

    public final void g0(boolean z10) {
        if (this.r || this.N == null || this.P == null) {
            return;
        }
        ClipboardManager clipboardManager = this.T;
        if (clipboardManager != null) {
            this.S = clipboardManager.hasPrimaryClip();
        } else {
            this.S = false;
        }
        l0(z10);
    }

    public final void i0(String str, TLRPC.User user) {
        i9 i9Var;
        if (this.e == null) {
            if (user != null) {
                i9Var = new i9(user);
            } else {
                i9 i9Var2 = new i9(str);
                i9Var2.w0(TextUtils.equals(str, this.x) ? this.y : null);
                i9Var = i9Var2;
            }
            presentFragment(i9Var);
            return;
        }
        if (this.h) {
            return;
        }
        this.h = true;
        this.Z.setLoading(true);
        l0 w10 = l0.w(this.currentAccount);
        o oVar = new o((m71) this, w10, (Object) user, 7);
        if (user != null) {
            w10.Y(user, new r1(4, this, oVar));
        } else {
            oVar.run(str);
        }
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void j0(TL_wallet.nftItem nftitem) {
        this.e = nftitem;
        this.f = l0.w(this.currentAccount).s();
    }

    public final void k0() {
        int max = Math.max(0, this.b0 - this.a0);
        l71 l71Var = this.a;
        if (l71Var != null) {
            l71Var.setPadding(0, 0, 0, AndroidUtilities.dp(68.0f) + this.a0 + max);
            this.a.setClipToPadding(false);
        }
        FrameLayout frameLayout = this.V;
        if (frameLayout != null) {
            frameLayout.setPadding(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(10.0f) + this.a0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.V.getLayoutParams();
            layoutParams.height = AndroidUtilities.dp(68.0f) + this.a0;
            this.V.setLayoutParams(layoutParams);
            if (this.c0 != max) {
                this.V.animate().cancel();
                this.V.animate().translationY(-max).setDuration(320L).setInterpolator(ds.h).start();
                this.c0 = max;
            }
        }
    }

    public final void l0(boolean z10) {
        if (this.P == null) {
            return;
        }
        boolean z11 = false;
        boolean z12 = this.N.length() == 0;
        if (z12 && this.S) {
            z11 = true;
        }
        if (this.Q != z11 || !z10) {
            this.Q = z11;
            c0(this.O, z11, z10);
        }
        if (this.R != z12 || !z10) {
            this.R = z12;
            c0(this.P, z12, z10);
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.N.getLayoutParams();
        int dp = AndroidUtilities.dp(this.Q ? 128.0f : this.R ? 60.0f : 8.0f);
        if (layoutParams.rightMargin != dp) {
            layoutParams.rightMargin = dp;
            this.N.setLayoutParams(layoutParams);
        }
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final boolean onBackPressed(boolean z10) {
        ai.o0 o0Var = this.d0;
        if (o0Var == null) {
            return super.onBackPressed(z10);
        }
        if (!z10) {
            return false;
        }
        o0Var.e();
        return false;
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void onFragmentDestroy() {
        this.r = true;
        ai.o0 o0Var = this.d0;
        if (o0Var != null) {
            o0Var.g();
            AndroidUtilities.removeFromParent(this.d0);
            this.d0 = null;
        }
        ClipboardManager clipboardManager = this.T;
        if (clipboardManager != null) {
            clipboardManager.removePrimaryClipChangedListener(this.U);
        }
        TextView textView = this.O;
        if (textView != null) {
            textView.animate().cancel();
        }
        ImageView imageView = this.P;
        if (imageView != null) {
            imageView.animate().cancel();
        }
        if (this.E != 0) {
            getConnectionsManager().cancelRequest(this.E, true);
        }
        FrameLayout frameLayout = this.V;
        if (frameLayout != null) {
            frameLayout.animate().cancel();
        }
        getNotificationCenter().removeObserver(this.I, NotificationCenter.reloadHints);
        Runnable runnable = this.K;
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
        }
        m mVar = this.n;
        if (mVar != null) {
            mVar.run();
        }
        super.onFragmentDestroy();
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void onInsets(int i10, int i11, int i12, int i13) {
        this.a0 = i13;
        k0();
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final r0.k1 onInsetsInternal(View view, r0.k1 k1Var) {
        this.b0 = k1Var.a.f(8).d;
        return super.onInsetsInternal(view, k1Var);
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void onPause() {
        ClipboardManager clipboardManager = this.T;
        if (clipboardManager != null) {
            clipboardManager.removePrimaryClipChangedListener(this.U);
        }
        ai.o0 o0Var = this.d0;
        if (o0Var != null) {
            o0Var.g();
            AndroidUtilities.removeFromParent(this.d0);
            this.d0 = null;
        }
        super.onPause();
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void onRequestPermissionsResultFragment(int i10, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResultFragment(i10, strArr, iArr);
        if (i10 != 44 || getParentActivity() == null) {
            return;
        }
        if (iArr.length > 0 && iArr[0] == 0) {
            e0();
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        alertDialog$Builder.a.T = AndroidUtilities.replaceTags(LocaleController.getString(R.string.QRCodePermissionNoCameraWithHint));
        alertDialog$Builder.k(LocaleController.getString(R.string.PermissionOpenSettings), new o9(this));
        alertDialog$Builder.h(LocaleController.getString(R.string.ContactsPermissionAlertNotNow), null);
        int i11 = R.raw.permission_request_camera;
        int i12 = org.telegram.ui.ActionBar.y6.L5;
        alertDialog$Builder.m(i11, 72, org.telegram.ui.ActionBar.y6.x0(null, i12, false), null);
        alertDialog$Builder.n(i12, null);
        alertDialog$Builder.p();
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void onResume() {
        super.onResume();
        ClipboardManager clipboardManager = this.T;
        if (clipboardManager != null) {
            q9 q9Var = this.U;
            clipboardManager.removePrimaryClipChangedListener(q9Var);
            this.T.addPrimaryClipChangedListener(q9Var);
        }
        g0(true);
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void onThemeColorsChanged() {
        int themedColor;
        super.onThemeColorsChanged();
        try {
            FrameLayout frameLayout = this.V;
            if (frameLayout != null && (frameLayout.getBackground() instanceof GradientDrawable) && (themedColor = getThemedColor(org.telegram.ui.ActionBar.y6.a7)) != this.Y) {
                this.Y = themedColor;
                ((GradientDrawable) this.V.getBackground()).setColors(new int[]{org.telegram.ui.ActionBar.y6.o1(0.0f, themedColor), themedColor, themedColor});
            }
            ShapeDrawable shapeDrawable = this.X;
            if (shapeDrawable != null) {
                org.telegram.ui.ActionBar.y6.z1(getThemedColor(org.telegram.ui.ActionBar.y6.Oh), shapeDrawable);
                ImageView imageView = this.W;
                if (imageView != null) {
                    imageView.invalidate();
                }
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }
}
