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
import bi.ua;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Locale;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.id;
import org.telegram.messenger.ls;
import org.telegram.messenger.qp;
import org.telegram.messenger.qs;
import org.telegram.messenger.t10;
import org.telegram.messenger.ui;
import org.telegram.messenger.yr;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_toncenter;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.hc;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.li;
import org.telegram.ui.Components.n41;
import org.telegram.ui.Components.rt;
import org.telegram.ui.Components.tp0;
import org.telegram.ui.Components.v41;
import org.telegram.ui.Components.x31;
import org.telegram.ui.Components.xp;
import org.telegram.ui.Components.xq;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes4.dex */
public final class w9 extends n41 {
    public String D;
    public int E;
    public TextView F;
    public FrameLayout G;
    public TextView H;
    public int J;
    public Runnable K;
    public boolean L;
    public v41 M;
    public ah.i N;
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
    public ai.i0 d0;
    public TL_wallet.nftItem e;
    public String f;
    public boolean h;
    public l n;
    public boolean r;
    public jg.z1 x;
    public String y;
    public final ArrayList s = new ArrayList();
    public final ArrayList w = new ArrayList();
    public final u9 I = new ls() { // from class: org.telegram.ui.Wallet.u9
        @Override // org.telegram.messenger.ls
        public final void didReceivedNotification(int i7, int i10, Object[] objArr) {
            fi.w3 w3Var;
            w9 w9Var = w9.this;
            if (w9Var.r || (w3Var = w9Var.a) == null) {
                return;
            }
            w3Var.f3.O(true);
        }
    };
    public boolean Q = true;
    public boolean R = true;
    public boolean S = true;
    public final v9 U = new ClipboardManager.OnPrimaryClipChangedListener() { // from class: org.telegram.ui.Wallet.v9
        @Override // android.content.ClipboardManager.OnPrimaryClipChangedListener
        public final void onPrimaryClipChanged() {
            w9.this.k0(true);
        }
    };

    public static void d0(w9 w9Var, m0 m0Var, TLRPC.User user, String str, TL_wallet.walletTransaction wallettransaction, String str2) {
        w9Var.n = null;
        if (w9Var.r) {
            return;
        }
        w9Var.Z.setLoading(false);
        if (wallettransaction == null || !m0.b(w9Var.f, m0Var.t())) {
            w9Var.h = false;
            hc a02 = hc.a0(w9Var);
            if (str2 == null) {
                str2 = id.M0(2131743175, null);
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
        x5.G0(w9Var.getParentActivity(), w9Var.currentAccount, wallettransaction, new u(w9Var, m0Var, user, str), new d(w9Var, 10), null, null, w9Var.getResourceProvider());
    }

    public static void e0(w9 w9Var, String str) {
        String l02 = l0(str);
        if (w9Var.isFinished || w9Var.N == null || l02 == null) {
            return;
        }
        if (l02.startsWith("@")) {
            int i7 = w9Var.currentAccount;
            qp.s1(i7).d2().a(l02.substring(1), null, new fi.t3(new q9(w9Var, 1), i7));
            return;
        }
        w9Var.N.setText(l02);
        ah.i iVar = w9Var.N;
        iVar.setSelection(iVar.length());
        org.telegram.messenger.g0.v1(w9Var.N);
        w9Var.m0(l02, null);
    }

    public static void f0(w9 w9Var, String str, int i7) {
        w9Var.K = null;
        int i10 = w9Var.currentAccount;
        fi.t3 t3Var = new fi.t3(w9Var, i7, 7);
        TL_toncenter.performApiRequest performapirequest = new TL_toncenter.performApiRequest();
        performapirequest.endpoint = "/api/v3/dns/records";
        performapirequest.query = "domain=" + Uri.encode(str) + "&limit=2";
        w9Var.E = ConnectionsManager.getInstance(i10).sendRequestTyped(performapirequest, new d3.b(1), new bi.p5(28, str, t3Var), qp.s1(i10).N3, 0);
    }

    public static void g0(View view, boolean z9, boolean z10) {
        view.animate().cancel();
        view.setEnabled(z9);
        float f10 = z9 ? 1.0f : 0.0f;
        float f11 = z9 ? 1.0f : 0.5f;
        if (z10) {
            view.setVisibility(0);
            view.animate().alpha(f10).scaleX(f11).scaleY(f11).setDuration(320L).setInterpolator(xq.h).withEndAction(new tp0(15, view, z9)).start();
        } else {
            view.setAlpha(f10);
            view.setScaleX(f11);
            view.setScaleY(f11);
            view.setVisibility(z9 ? 0 : 8);
        }
    }

    public static boolean h0(TLRPC.User user) {
        return (user == null || user.bot || user.self || t10.x(user) || t10.A(user.id)) ? false : true;
    }

    public static String l0(String str) {
        Uri b12 = x5.b1(str);
        if ("ton".equalsIgnoreCase(b12.getScheme())) {
            if ("transfer".equalsIgnoreCase(b12.getAuthority()) && b12.getPathSegments().size() == 1) {
                String str2 = b12.getPathSegments().get(0);
                if (WalletEngine2.isValidRecipientAddress(str2)) {
                    return str2;
                }
            }
            return null;
        }
        if (!x5.C0(b12)) {
            return null;
        }
        String c12 = x5.c1(b12);
        if (c12 != null) {
            return "@".concat(c12);
        }
        String queryParameter = b12.getQueryParameter("to");
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
        return rf.b.i("@", queryParameter);
    }

    @Override // org.telegram.ui.Components.n41
    public final void Z(ArrayList arrayList, l41 l41Var) {
        float f10;
        ArrayList arrayList2;
        int i7;
        if (this.M == null) {
            return;
        }
        arrayList.add(x31.D(org.telegram.messenger.g0.L(4.0f)));
        l41Var.V();
        arrayList.add(x31.u(id.M0(2131743043, null)));
        v41 v41Var = this.M;
        x31 x31Var = new x31(-1);
        x31Var.c = v41Var;
        x31Var.z = 50;
        arrayList.add(x31Var);
        l41Var.U();
        String trim = this.N.getText().toString().trim();
        String lowerCase = trim.toLowerCase(Locale.ROOT);
        float f11 = 12.0f;
        int i10 = 0;
        if (this.y != null) {
            if (this.G == null) {
                FrameLayout frameLayout = new FrameLayout(getParentActivity());
                frameLayout.setBackground(org.telegram.ui.ActionBar.k6.h0(getThemedColor(org.telegram.ui.ActionBar.k6.i6), 2, -1));
                boolean z9 = id.a0;
                int i11 = z9 ? 5 : 3;
                ImageView imageView = new ImageView(getParentActivity());
                this.W = imageView;
                ShapeDrawable L = org.telegram.ui.ActionBar.k6.L(org.telegram.messenger.g0.L(46.0f), getThemedColor(org.telegram.ui.ActionBar.k6.Ci));
                this.X = L;
                imageView.setImageDrawable(new xp(L, getParentActivity().getResources().getDrawable(R.drawable.menu_gram_24).mutate()));
                frameLayout.addView(imageView, c8.ha.d(46, 46.0f, i11 | 16, z9 ? 0.0f : 11.0f, 0.0f, z9 ? 11.0f : 0.0f, 0.0f));
                TextView textView = new TextView(getParentActivity());
                this.F = textView;
                textView.setText(id.M0(2131743102, null));
                textView.setTextSize(1, 16.0f);
                org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.G6, getResourceProvider());
                textView.setTypeface(org.telegram.messenger.g0.o());
                textView.setSingleLine();
                textView.setGravity(i11);
                frameLayout.addView(textView, c8.ha.d(-1, 24.0f, 48, z9 ? 16.0f : 72.0f, 8.0f, z9 ? 72.0f : 16.0f, 0.0f));
                TextView textView2 = new TextView(getParentActivity());
                this.H = textView2;
                textView2.setTextSize(1, 14.0f);
                org.telegram.ui.ActionBar.r6.V(this.H, org.telegram.ui.ActionBar.k6.y6, getResourceProvider());
                this.H.setSingleLine();
                this.H.setEllipsize(TextUtils.TruncateAt.MIDDLE);
                this.H.setGravity(i11);
                frameLayout.addView(this.H, c8.ha.d(-1, 22.0f, 48, z9 ? 16.0f : 72.0f, 32.0f, z9 ? 72.0f : 16.0f, 0.0f));
                frameLayout.setOnClickListener(new p9(this, i10));
                this.G = frameLayout;
            }
            TextView textView3 = this.F;
            String str = this.D;
            if (str == null) {
                str = id.M0(2131743102, null);
            }
            textView3.setText(str);
            this.H.setText(this.y);
            arrayList.add(x31.D(org.telegram.messenger.g0.L(12.0f)));
            l41Var.V();
            FrameLayout frameLayout2 = this.G;
            x31 x31Var2 = new x31(-1);
            x31Var2.c = frameLayout2;
            x31Var2.z = 60;
            arrayList.add(x31Var2);
            l41Var.U();
            return;
        }
        if (TextUtils.isEmpty(lowerCase)) {
            arrayList2 = new ArrayList();
            HashSet hashSet = new HashSet();
            ArrayList arrayList3 = ui.b0(this.currentAccount).i1;
            int size = arrayList3.size();
            int i12 = 0;
            while (i12 < size) {
                Object obj = arrayList3.get(i12);
                i12++;
                float f12 = f11;
                TLRPC.User a22 = getMessagesController().a2(Long.valueOf(((TLRPC.TL_topPeer) obj).peer.user_id));
                if (h0(a22) && hashSet.add(Long.valueOf(a22.id))) {
                    arrayList2.add(a22);
                }
                f11 = f12;
            }
            f10 = f11;
            ArrayList arrayList4 = this.s;
            int size2 = arrayList4.size();
            int i13 = 0;
            while (i13 < size2) {
                Object obj2 = arrayList4.get(i13);
                i13++;
                TLRPC.User user = (TLRPC.User) obj2;
                if (hashSet.add(Long.valueOf(user.id))) {
                    arrayList2.add(user);
                }
            }
        } else {
            f10 = 12.0f;
            arrayList2 = this.w;
        }
        int size3 = arrayList2.size();
        int i14 = 0;
        int i15 = 0;
        while (i15 < size3) {
            Object obj3 = arrayList2.get(i15);
            i15++;
            TLRPC.User user2 = (TLRPC.User) obj3;
            if (i14 == 0) {
                arrayList.add(x31.D(org.telegram.messenger.g0.L(f10)));
                l41Var.V();
                if (TextUtils.isEmpty(lowerCase)) {
                    arrayList.add(x31.u(id.M0(2131746371, null)));
                }
            }
            x31 w10 = x31.w(user2);
            if (TextUtils.isEmpty(lowerCase)) {
                i7 = i10;
            } else {
                w10.l = org.telegram.messenger.g0.r0(user2.first_name, user2.last_name, trim);
                String n10 = t10.n(user2);
                if (!TextUtils.isEmpty(n10)) {
                    w10.m = org.telegram.messenger.g0.r0(rf.b.i("@", n10), null, "@".concat(trim));
                }
                i7 = i10;
                w10.F = new m(user2, w10.l, w10.m, 8);
            }
            arrayList.add(w10);
            i14++;
            i10 = i7;
        }
        int i16 = i10;
        if (this.L) {
            if (i14 == 0) {
                arrayList.add(x31.D(org.telegram.messenger.g0.L(f10)));
                l41Var.V();
            }
            int i17 = this.D != null ? 1 : 3;
            for (int i18 = i16; i18 < i17; i18++) {
                arrayList.add(x31.q((-1) - i18, 18));
            }
        }
        if (i14 > 0 || this.L) {
            l41Var.U();
        }
        if (this.L || i14 > 0 || TextUtils.isEmpty(lowerCase)) {
            return;
        }
        String M0 = id.M0(2131745804, null);
        Object[] objArr = new Object[1];
        objArr[i16] = lowerCase;
        String a02 = id.a0(null, null, 2131743028, objArr);
        int i19 = li.b;
        x31 K = x31.K(li.class);
        K.l = M0;
        K.m = a02;
        arrayList.add(K);
    }

    @Override // org.telegram.ui.Components.n41
    public final CharSequence a0() {
        return id.M0(this.e == null ? 2131743023 : 2131742983, null);
    }

    @Override // org.telegram.ui.Components.n41
    public final void b0(x31 x31Var, View view) {
        Object obj = x31Var.G;
        if (obj instanceof TLRPC.User) {
            TLRPC.User user = (TLRPC.User) obj;
            int i7 = this.currentAccount;
            yr.a0(i7).a.c(new ua(i7, user.id, 2));
            org.telegram.messenger.g0.v1(this.N);
            m0(null, user);
        }
    }

    @Override // org.telegram.ui.Components.n41
    public final boolean c0(x31 x31Var, View view) {
        return false;
    }

    @Override // org.telegram.ui.Components.n41, org.telegram.ui.ActionBar.f2
    public final View createView(Context context) {
        this.fragmentView = super.createView(context);
        this.actionBar.setAdaptiveBackground(this.a);
        this.a.r1();
        int i7 = 0;
        this.a.setPadding(0, 0, 0, org.telegram.messenger.g0.L(68.0f));
        this.a.setClipToPadding(false);
        fi.w3 w3Var = this.a;
        w3Var.f3.r = false;
        w3Var.j(new org.telegram.ui.Components.ui(this, 23));
        v41 v41Var = new v41(5, context, this);
        this.T = (ClipboardManager) context.getSystemService("clipboard");
        ah.i iVar = new ah.i(context);
        this.N = iVar;
        org.telegram.ui.ActionBar.r6.V(iVar, org.telegram.ui.ActionBar.k6.G6, getResourceProvider());
        ah.i iVar2 = this.N;
        org.telegram.ui.ActionBar.n6 L = org.telegram.ui.ActionBar.r6.L(0.72f, org.telegram.ui.ActionBar.k6.H6);
        org.telegram.ui.ActionBar.r6.o(iVar2, 1, L.a, -1, 2, L.d, getResourceProvider());
        char c10 = 1;
        this.N.setTextSize(1, 16.0f);
        this.N.setHint(id.M0(2131743200, null));
        this.N.setSingleLine(true);
        this.N.setBackground(null);
        this.N.setPadding(org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f), 0);
        this.N.setClipToPadding(true);
        this.N.setCursorWidth(1.5f);
        this.N.setGravity(16);
        this.N.setInputType(524289);
        this.N.setImeOptions(33554437);
        v41Var.addView(this.N, c8.ha.d(-1, -1.0f, qs.E1, 8.0f, 0.0f, 52.0f, 0.0f));
        TextView textView = new TextView(context);
        this.O = textView;
        textView.setText(id.M0(2131743058, null));
        TextView textView2 = this.O;
        int i10 = org.telegram.ui.ActionBar.k6.n6;
        org.telegram.ui.ActionBar.r6.V(textView2, i10, getResourceProvider());
        this.O.setTextSize(1, 14.0f);
        this.O.setTypeface(org.telegram.messenger.g0.o());
        this.O.setGravity(17);
        int r12 = org.telegram.ui.ActionBar.k6.r1(0.1f, getThemedColor(i10));
        TextView textView3 = this.O;
        int L2 = org.telegram.messenger.g0.L(16.0f);
        int r13 = org.telegram.ui.ActionBar.k6.r1(0.18f, getThemedColor(i10));
        org.telegram.ui.ActionBar.r6.R(textView3, org.telegram.ui.ActionBar.k6.k0(L2, L2, L2, L2, r12, r13, r13), org.telegram.ui.ActionBar.r6.L(0.1f, i10), org.telegram.ui.ActionBar.r6.L(0.18f, i10), getResourceProvider());
        this.O.setOnClickListener(new p9(this, 2));
        c8.ka.b(this.O, 0.04f, 1.2f);
        v41Var.addView(this.O, c8.ha.d(58, 32.0f, 21, 0.0f, 0.0f, 62.0f, 0.0f));
        this.N.addTextChangedListener(new ah.j(this, 29));
        ImageView imageView = new ImageView(context);
        this.P = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        this.P.setImageResource(R.drawable.scan_qr);
        org.telegram.ui.ActionBar.r6.t(this.P, i10, getResourceProvider(), PorterDuff.Mode.SRC_IN);
        org.telegram.ui.ActionBar.r6.R(this.P, org.telegram.ui.ActionBar.k6.h0(org.telegram.ui.ActionBar.k6.r1(0.12f, getThemedColor(i10)), 1, -1), null, org.telegram.ui.ActionBar.r6.L(0.12f, i10), getResourceProvider());
        this.P.setContentDescription(id.M0(2131743030, null));
        this.P.setOnClickListener(new p9(this, 3));
        v41Var.addView(this.P, c8.ha.d(32, 40.0f, 21, 0.0f, 0.0f, 20.0f, 0.0f));
        k0(false);
        this.M = v41Var;
        jg.z1 z1Var = new jg.z1(true);
        this.x = z1Var;
        z1Var.a = new rt(this, 6);
        getNotificationCenter().c(this.I, qs.S0);
        ui.b0(this.currentAccount).M0(true);
        this.s.clear();
        int i11 = this.currentAccount;
        yr.a0(i11).a.c(new jg.r(i11, i7, new s9(this), i7));
        if (!TextUtils.isEmpty(null)) {
            this.N.setText((CharSequence) null);
            ah.i iVar3 = this.N;
            iVar3.setSelection(iVar3.length());
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.V = frameLayout;
        frameLayout.setPadding(org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(10.0f));
        int themedColor = getThemedColor(org.telegram.ui.ActionBar.k6.a7);
        this.V.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{org.telegram.ui.ActionBar.k6.r1(0.0f, themedColor), themedColor, themedColor}));
        fi.d dVar = new fi.d(context, getResourceProvider(), true);
        dVar.setRoundRadius(24);
        this.Z = dVar;
        dVar.setText(id.M0(2131743157, null));
        this.Z.setEnabled(false);
        this.Z.setOnClickListener(new p9(this, c10 == true ? 1 : 0));
        fi.d dVar2 = this.Z;
        if (dVar2 != null) {
            dVar2.setEnabled(this.y != null);
        }
        this.V.addView(this.Z, c8.ha.e(-1, 48, qs.E1));
        ((FrameLayout) this.fragmentView).addView(this.V, c8.ha.e(-1, 68, 87));
        o0();
        this.a.f3.O(false);
        return this.fragmentView;
    }

    public final void i0() {
        if (getParentActivity() == null || this.d0 != null || this.P == null) {
            return;
        }
        org.telegram.messenger.g0.v1(this.N);
        if (getParentActivity().checkSelfPermission("android.permission.CAMERA") != 0) {
            getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 44);
        } else {
            this.d0 = ai.i0.k(this, this.P, new ai.c0(13), new q9(this, 0), new r9(this, 0));
        }
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void j0(String str) {
        String p10;
        String n10;
        ArrayList arrayList = this.w;
        arrayList.clear();
        if (TextUtils.isEmpty(str) || this.y != null || this.D != null) {
            fi.w3 w3Var = this.a;
            if (w3Var != null) {
                w3Var.f3.O(true);
                return;
            }
            return;
        }
        String lowerCase = str.toLowerCase(Locale.ROOT);
        HashSet hashSet = new HashSet();
        ArrayList arrayList2 = getMessagesController().J;
        int size = arrayList2.size();
        int i7 = 0;
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList2.get(i10);
            i10++;
            TLRPC.Dialog dialog = (TLRPC.Dialog) obj;
            if (dialog != null && dialog.id > 0) {
                TLRPC.User a22 = getMessagesController().a2(Long.valueOf(dialog.id));
                if (h0(a22) && (((p10 = t10.p(a22)) != null && p10.toLowerCase(Locale.ROOT).contains(lowerCase)) || ((n10 = t10.n(a22)) != null && n10.toLowerCase(Locale.ROOT).contains(lowerCase)))) {
                    if (hashSet.add(Long.valueOf(a22.id))) {
                        arrayList.add(a22);
                    }
                }
            }
        }
        ArrayList arrayList3 = this.x.e;
        int size2 = arrayList3.size();
        while (i7 < size2) {
            Object obj2 = arrayList3.get(i7);
            i7++;
            TLObject tLObject = (TLObject) obj2;
            if (tLObject instanceof TLRPC.User) {
                TLRPC.User user = (TLRPC.User) tLObject;
                if (h0(user) && hashSet.add(Long.valueOf(user.id))) {
                    arrayList.add(user);
                }
            }
        }
        fi.w3 w3Var2 = this.a;
        if (w3Var2 != null) {
            w3Var2.f3.O(true);
        }
    }

    public final void k0(boolean z9) {
        if (this.r || this.N == null || this.P == null) {
            return;
        }
        ClipboardManager clipboardManager = this.T;
        if (clipboardManager != null) {
            this.S = clipboardManager.hasPrimaryClip();
        } else {
            this.S = false;
        }
        p0(z9);
    }

    public final void m0(String str, TLRPC.User user) {
        m9 m9Var;
        if (this.e == null) {
            if (user != null) {
                m9Var = new m9(user);
            } else {
                m9 m9Var2 = new m9(str);
                m9Var2.A0(TextUtils.equals(str, this.y) ? this.D : null);
                m9Var = m9Var2;
            }
            presentFragment(m9Var);
            return;
        }
        if (this.h) {
            return;
        }
        this.h = true;
        this.Z.setLoading(true);
        m0 x10 = m0.x(this.currentAccount);
        m mVar = new m(this, x10, user);
        if (user != null) {
            x10.a0(user, new u1(3, this, mVar));
        } else {
            mVar.a(str);
        }
    }

    public final void n0(TL_wallet.nftItem nftitem) {
        this.e = nftitem;
        this.f = m0.x(this.currentAccount).t();
    }

    public final void o0() {
        int max = Math.max(0, this.b0 - this.a0);
        fi.w3 w3Var = this.a;
        if (w3Var != null) {
            w3Var.setPadding(0, 0, 0, org.telegram.messenger.g0.L(68.0f) + this.a0 + max);
            this.a.setClipToPadding(false);
        }
        FrameLayout frameLayout = this.V;
        if (frameLayout != null) {
            frameLayout.setPadding(org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(10.0f) + this.a0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.V.getLayoutParams();
            layoutParams.height = org.telegram.messenger.g0.L(68.0f) + this.a0;
            this.V.setLayoutParams(layoutParams);
            if (this.c0 != max) {
                this.V.animate().cancel();
                this.V.animate().translationY(-max).setDuration(320L).setInterpolator(xq.h).start();
                this.c0 = max;
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean onBackPressed(boolean z9) {
        ai.i0 i0Var = this.d0;
        if (i0Var == null) {
            return super.onBackPressed(z9);
        }
        if (!z9) {
            return false;
        }
        i0Var.e();
        return false;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onFragmentDestroy() {
        this.r = true;
        ai.i0 i0Var = this.d0;
        if (i0Var != null) {
            i0Var.g();
            org.telegram.messenger.g0.E2(this.d0);
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
        getNotificationCenter().n(this.I, qs.S0);
        Runnable runnable = this.K;
        if (runnable != null) {
            org.telegram.messenger.g0.r(runnable);
        }
        l lVar = this.n;
        if (lVar != null) {
            lVar.run();
        }
        super.onFragmentDestroy();
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onInsets(int i7, int i10, int i11, int i12) {
        this.a0 = i12;
        o0();
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final r0.k1 onInsetsInternal(View view, r0.k1 k1Var) {
        this.b0 = k1Var.a.f(8).d;
        return super.onInsetsInternal(view, k1Var);
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onPause() {
        ClipboardManager clipboardManager = this.T;
        if (clipboardManager != null) {
            clipboardManager.removePrimaryClipChangedListener(this.U);
        }
        ai.i0 i0Var = this.d0;
        if (i0Var != null) {
            i0Var.g();
            org.telegram.messenger.g0.E2(this.d0);
            this.d0 = null;
        }
        super.onPause();
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onRequestPermissionsResultFragment(int i7, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResultFragment(i7, strArr, iArr);
        if (i7 != 44 || getParentActivity() == null) {
            return;
        }
        if (iArr.length > 0 && iArr[0] == 0) {
            i0();
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        alertDialog$Builder.a.T = org.telegram.messenger.g0.X2(id.M0(2131746504, null));
        alertDialog$Builder.k(id.M0(2131747301, null), new s9(this));
        alertDialog$Builder.h(id.M0(2131751772, null), null);
        int i10 = org.telegram.ui.ActionBar.k6.L5;
        alertDialog$Builder.m(R.raw.permission_request_camera, 72, org.telegram.ui.ActionBar.k6.x0(null, i10, false), null);
        alertDialog$Builder.n(i10, null);
        alertDialog$Builder.p();
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onResume() {
        super.onResume();
        ClipboardManager clipboardManager = this.T;
        if (clipboardManager != null) {
            v9 v9Var = this.U;
            clipboardManager.removePrimaryClipChangedListener(v9Var);
            this.T.addPrimaryClipChangedListener(v9Var);
        }
        k0(true);
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onThemeColorsChanged() {
        int themedColor;
        super.onThemeColorsChanged();
        try {
            FrameLayout frameLayout = this.V;
            if (frameLayout != null && (frameLayout.getBackground() instanceof GradientDrawable) && (themedColor = getThemedColor(org.telegram.ui.ActionBar.k6.a7)) != this.Y) {
                this.Y = themedColor;
                ((GradientDrawable) this.V.getBackground()).setColors(new int[]{org.telegram.ui.ActionBar.k6.r1(0.0f, themedColor), themedColor, themedColor});
            }
            ShapeDrawable shapeDrawable = this.X;
            if (shapeDrawable != null) {
                org.telegram.ui.ActionBar.k6.C1(getThemedColor(org.telegram.ui.ActionBar.k6.Ci), shapeDrawable);
                ImageView imageView = this.W;
                if (imageView != null) {
                    imageView.invalidate();
                }
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public final void p0(boolean z9) {
        if (this.P == null) {
            return;
        }
        boolean z10 = false;
        boolean z11 = this.N.length() == 0;
        if (z11 && this.S) {
            z10 = true;
        }
        if (this.Q != z10 || !z9) {
            this.Q = z10;
            g0(this.O, z10, z9);
        }
        if (this.R != z11 || !z9) {
            this.R = z11;
            g0(this.P, z11, z9);
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.N.getLayoutParams();
        int L = org.telegram.messenger.g0.L(this.Q ? 128.0f : this.R ? 60.0f : 8.0f);
        if (layoutParams.rightMargin != L) {
            layoutParams.rightMargin = L;
            this.N.setLayoutParams(layoutParams);
        }
    }
}
