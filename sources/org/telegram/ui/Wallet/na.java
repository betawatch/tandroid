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
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Locale;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.gs;
import org.telegram.messenger.hd;
import org.telegram.messenger.ls;
import org.telegram.messenger.np;
import org.telegram.messenger.o10;
import org.telegram.messenger.p10;
import org.telegram.messenger.si;
import org.telegram.messenger.ur;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_toncenter;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.c51;
import org.telegram.ui.Components.cj;
import org.telegram.ui.Components.e51;
import org.telegram.ui.Components.lc;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.o41;
import org.telegram.ui.Components.oq;
import org.telegram.ui.Components.qf;
import org.telegram.ui.Components.rp0;
import org.telegram.ui.Components.x01;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes4.dex */
public final class na extends e51 {
    public String E;
    public int F;
    public TextView G;
    public FrameLayout H;
    public TextView I;
    public int K;
    public Runnable L;
    public boolean M;
    public x01 N;
    public ah.i O;
    public TextView P;
    public ImageView Q;
    public ClipboardManager U;
    public FrameLayout W;
    public ImageView X;
    public ShapeDrawable Y;
    public int Z;
    public hi.e a0;
    public int b0;
    public int c0;
    public int d0;
    public TL_wallet.nftItem e;
    public ci.b0 e0;
    public String f;
    public boolean h;
    public m n;
    public boolean r;
    public jg.z1 x;
    public String y;
    public final ArrayList s = new ArrayList();
    public final ArrayList w = new ArrayList();
    public final la J = new gs() { // from class: org.telegram.ui.Wallet.la
        @Override // org.telegram.messenger.gs
        public final void didReceivedNotification(int i7, int i10, Object[] objArr) {
            bi.f6 f6Var;
            na naVar = na.this;
            if (naVar.r || (f6Var = naVar.a) == null) {
                return;
            }
            f6Var.g3.O(true);
        }
    };
    public boolean R = true;
    public boolean S = true;
    public boolean T = true;
    public final ma V = new ClipboardManager.OnPrimaryClipChangedListener() { // from class: org.telegram.ui.Wallet.ma
        @Override // android.content.ClipboardManager.OnPrimaryClipChangedListener
        public final void onPrimaryClipChanged() {
            na.this.k0(true);
        }
    };

    public static void d0(na naVar, u0 u0Var, TLRPC.User user, String str, TL_wallet.walletTransaction wallettransaction, String str2) {
        naVar.n = null;
        if (naVar.r) {
            return;
        }
        naVar.a0.setLoading(false);
        if (wallettransaction == null || !u0.c(naVar.f, u0Var.y())) {
            naVar.h = false;
            lc b02 = lc.b0(naVar);
            if (str2 == null) {
                str2 = hd.N0(2131742926, null);
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
        n6.K0(naVar.getParentActivity(), naVar.currentAccount, wallettransaction, new v(naVar, u0Var, user, str), new e(naVar, 10), null, null, naVar.getResourceProvider());
    }

    public static void e0(na naVar, String str) {
        String l02 = l0(str);
        if (naVar.isFinished || naVar.O == null || l02 == null) {
            return;
        }
        if (l02.startsWith("@")) {
            int i7 = naVar.currentAccount;
            np.u1(i7).f2().a(l02.substring(1), null, new ai.b2(i7, new ha(naVar, 1), 8));
            return;
        }
        naVar.O.setText(l02);
        ah.i iVar = naVar.O;
        iVar.setSelection(iVar.length());
        org.telegram.messenger.g0.v1(naVar.O);
        naVar.m0(l02, null);
    }

    public static void f0(na naVar, String str, int i7) {
        naVar.L = null;
        int i10 = naVar.currentAccount;
        ai.b2 b2Var = new ai.b2(naVar, i7, 9);
        TL_toncenter.performApiRequest performapirequest = new TL_toncenter.performApiRequest();
        performapirequest.endpoint = "/api/v3/dns/records";
        performapirequest.query = "domain=" + Uri.encode(str) + "&limit=2";
        naVar.F = ConnectionsManager.getInstance(i10).sendRequestTyped(performapirequest, new d3.b(1), new e0(2, str, b2Var), np.u1(i10).Q3, 0);
    }

    public static void g0(View view, boolean z10, boolean z11) {
        view.animate().cancel();
        view.setEnabled(z10);
        float f10 = z10 ? 1.0f : 0.0f;
        float f11 = z10 ? 1.0f : 0.5f;
        if (z11) {
            view.setVisibility(0);
            view.animate().alpha(f10).scaleX(f11).scaleY(f11).setDuration(320L).setInterpolator(nr.h).withEndAction(new rp0(16, view, z10)).start();
        } else {
            view.setAlpha(f10);
            view.setScaleX(f11);
            view.setScaleY(f11);
            view.setVisibility(z10 ? 0 : 8);
        }
    }

    public static boolean h0(TLRPC.User user) {
        return (user == null || user.bot || user.self || p10.y(user) || p10.B(user.id)) ? false : true;
    }

    public static String l0(String str) {
        Uri i12 = n6.i1(str);
        if ("ton".equalsIgnoreCase(i12.getScheme())) {
            if ("transfer".equalsIgnoreCase(i12.getAuthority()) && i12.getPathSegments().size() == 1) {
                String str2 = i12.getPathSegments().get(0);
                if (WalletEngine2.isValidRecipientAddress(str2)) {
                    return str2;
                }
            }
            return null;
        }
        if (!n6.G0(i12)) {
            return null;
        }
        String j12 = n6.j1(i12);
        if (j12 != null) {
            return "@".concat(j12);
        }
        String queryParameter = i12.getQueryParameter("to");
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
        return p5.c.k("@", queryParameter);
    }

    @Override // org.telegram.ui.Components.e51
    public final void Z(ArrayList arrayList, c51 c51Var) {
        float f10;
        ArrayList arrayList2;
        int i7;
        if (this.N == null) {
            return;
        }
        arrayList.add(o41.D(org.telegram.messenger.g0.L(4.0f)));
        c51Var.V();
        arrayList.add(o41.u(hd.N0(2131742774, null)));
        x01 x01Var = this.N;
        o41 o41Var = new o41(-1);
        o41Var.c = x01Var;
        o41Var.A = 50;
        arrayList.add(o41Var);
        c51Var.U();
        String trim = this.O.getText().toString().trim();
        String lowerCase = trim.toLowerCase(Locale.ROOT);
        float f11 = 12.0f;
        int i10 = 0;
        if (this.y != null) {
            if (this.H == null) {
                FrameLayout frameLayout = new FrameLayout(getParentActivity());
                frameLayout.setBackground(org.telegram.ui.ActionBar.m6.h0(getThemedColor(org.telegram.ui.ActionBar.m6.i6), 2, -1));
                boolean z10 = hd.a0;
                int i11 = z10 ? 5 : 3;
                ImageView imageView = new ImageView(getParentActivity());
                this.X = imageView;
                ShapeDrawable L = org.telegram.ui.ActionBar.m6.L(org.telegram.messenger.g0.L(46.0f), getThemedColor(org.telegram.ui.ActionBar.m6.Fi));
                this.Y = L;
                imageView.setImageDrawable(new oq(L, getParentActivity().getResources().getDrawable(R.drawable.menu_gram_24).mutate()));
                frameLayout.addView(imageView, c8.ma.d(46, 46.0f, i11 | 16, z10 ? 0.0f : 11.0f, 0.0f, z10 ? 11.0f : 0.0f, 0.0f));
                TextView textView = new TextView(getParentActivity());
                this.G = textView;
                o10.l(16.0f, 2131742852, 1, textView, null);
                org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.G6, getResourceProvider());
                textView.setTypeface(org.telegram.messenger.g0.o());
                textView.setSingleLine();
                textView.setGravity(i11);
                frameLayout.addView(textView, c8.ma.d(-1, 24.0f, 48, z10 ? 16.0f : 72.0f, 8.0f, z10 ? 72.0f : 16.0f, 0.0f));
                TextView textView2 = new TextView(getParentActivity());
                this.I = textView2;
                textView2.setTextSize(1, 14.0f);
                org.telegram.ui.ActionBar.t6.U(this.I, org.telegram.ui.ActionBar.m6.y6, getResourceProvider());
                this.I.setSingleLine();
                this.I.setEllipsize(TextUtils.TruncateAt.MIDDLE);
                this.I.setGravity(i11);
                frameLayout.addView(this.I, c8.ma.d(-1, 22.0f, 48, z10 ? 16.0f : 72.0f, 32.0f, z10 ? 72.0f : 16.0f, 0.0f));
                frameLayout.setOnClickListener(new ga(this, i10));
                this.H = frameLayout;
            }
            TextView textView3 = this.G;
            String str = this.E;
            if (str == null) {
                str = hd.N0(2131742852, null);
            }
            textView3.setText(str);
            this.I.setText(this.y);
            arrayList.add(o41.D(org.telegram.messenger.g0.L(12.0f)));
            c51Var.V();
            FrameLayout frameLayout2 = this.H;
            o41 o41Var2 = new o41(-1);
            o41Var2.c = frameLayout2;
            o41Var2.A = 60;
            arrayList.add(o41Var2);
            c51Var.U();
            return;
        }
        if (TextUtils.isEmpty(lowerCase)) {
            arrayList2 = new ArrayList();
            HashSet hashSet = new HashSet();
            ArrayList arrayList3 = si.d0(this.currentAccount).j1;
            int size = arrayList3.size();
            int i12 = 0;
            while (i12 < size) {
                Object obj = arrayList3.get(i12);
                i12++;
                float f12 = f11;
                TLRPC.User c22 = getMessagesController().c2(Long.valueOf(((TLRPC.TL_topPeer) obj).peer.user_id));
                if (h0(c22) && hashSet.add(Long.valueOf(c22.id))) {
                    arrayList2.add(c22);
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
                arrayList.add(o41.D(org.telegram.messenger.g0.L(f10)));
                c51Var.V();
                if (TextUtils.isEmpty(lowerCase)) {
                    i5.c.s(2131746174, null, arrayList);
                }
            }
            o41 w10 = o41.w(user2);
            if (TextUtils.isEmpty(lowerCase)) {
                i7 = i10;
            } else {
                w10.m = org.telegram.messenger.g0.r0(user2.first_name, user2.last_name, trim);
                String o4 = p10.o(user2);
                if (!TextUtils.isEmpty(o4)) {
                    w10.n = org.telegram.messenger.g0.r0(p5.c.k("@", o4), null, "@".concat(trim));
                }
                i7 = i10;
                w10.G = new o(user2, w10.m, w10.n, 9);
            }
            arrayList.add(w10);
            i14++;
            i10 = i7;
        }
        int i16 = i10;
        if (this.M) {
            if (i14 == 0) {
                arrayList.add(o41.D(org.telegram.messenger.g0.L(f10)));
                c51Var.V();
            }
            int i17 = this.E != null ? 1 : 3;
            for (int i18 = i16; i18 < i17; i18++) {
                arrayList.add(o41.q((-1) - i18, 18));
            }
        }
        if (i14 > 0 || this.M) {
            c51Var.U();
        }
        if (this.M || i14 > 0 || TextUtils.isEmpty(lowerCase)) {
            return;
        }
        String N0 = hd.N0(2131745605, null);
        Object[] objArr = new Object[1];
        objArr[i16] = lowerCase;
        arrayList.add(cj.i(hd.a0(null, null, 2131742759, objArr), N0));
    }

    @Override // org.telegram.ui.Components.e51
    public final CharSequence a0() {
        return hd.N0(this.e == null ? 2131742754 : 2131742714, null);
    }

    @Override // org.telegram.ui.Components.e51
    public final void b0(o41 o41Var, View view) {
        Object obj = o41Var.H;
        if (obj instanceof TLRPC.User) {
            TLRPC.User user = (TLRPC.User) obj;
            int i7 = this.currentAccount;
            ur.a0(i7).a.c(new di.m9(i7, user.id, 1));
            org.telegram.messenger.g0.v1(this.O);
            m0(null, user);
        }
    }

    @Override // org.telegram.ui.Components.e51
    public final boolean c0(o41 o41Var, View view) {
        return false;
    }

    @Override // org.telegram.ui.Components.e51, org.telegram.ui.ActionBar.g2
    public final View createView(Context context) {
        this.fragmentView = super.createView(context);
        this.actionBar.setAdaptiveBackground(this.a);
        this.a.r1();
        int i7 = 0;
        this.a.setPadding(0, 0, 0, org.telegram.messenger.g0.L(68.0f));
        this.a.setClipToPadding(false);
        bi.f6 f6Var = this.a;
        f6Var.g3.r = false;
        f6Var.j(new org.telegram.ui.Components.oa(this, 26));
        x01 x01Var = new x01(5, context, this);
        this.U = (ClipboardManager) context.getSystemService("clipboard");
        ah.i iVar = new ah.i(context);
        this.O = iVar;
        org.telegram.ui.ActionBar.t6.U(iVar, org.telegram.ui.ActionBar.m6.G6, getResourceProvider());
        ah.i iVar2 = this.O;
        org.telegram.ui.ActionBar.p6 K = org.telegram.ui.ActionBar.t6.K(0.72f, org.telegram.ui.ActionBar.m6.H6);
        org.telegram.ui.ActionBar.t6.n(iVar2, 1, K.a, -1, 2, K.d, getResourceProvider());
        char c10 = 1;
        this.O.setTextSize(1, 16.0f);
        this.O.setHint(hd.N0(2131742951, null));
        this.O.setSingleLine(true);
        this.O.setBackground(null);
        this.O.setPadding(org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f), 0);
        this.O.setClipToPadding(true);
        this.O.setCursorWidth(1.5f);
        this.O.setGravity(16);
        this.O.setInputType(524289);
        this.O.setImeOptions(33554437);
        x01Var.addView(this.O, c8.ma.d(-1, -1.0f, ls.E1, 8.0f, 0.0f, 52.0f, 0.0f));
        TextView textView = new TextView(context);
        this.P = textView;
        textView.setText(hd.N0(2131742789, null));
        TextView textView2 = this.P;
        int i10 = org.telegram.ui.ActionBar.m6.n6;
        org.telegram.ui.ActionBar.t6.U(textView2, i10, getResourceProvider());
        this.P.setTextSize(1, 14.0f);
        this.P.setTypeface(org.telegram.messenger.g0.o());
        this.P.setGravity(17);
        int r12 = org.telegram.ui.ActionBar.m6.r1(0.1f, getThemedColor(i10));
        TextView textView3 = this.P;
        int L = org.telegram.messenger.g0.L(16.0f);
        int r13 = org.telegram.ui.ActionBar.m6.r1(0.18f, getThemedColor(i10));
        org.telegram.ui.ActionBar.t6.Q(textView3, org.telegram.ui.ActionBar.m6.k0(L, L, L, L, r12, r13, r13), org.telegram.ui.ActionBar.t6.K(0.1f, i10), org.telegram.ui.ActionBar.t6.K(0.18f, i10), getResourceProvider());
        int i11 = 2;
        this.P.setOnClickListener(new ga(this, i11));
        c8.ra.b(this.P, 0.04f, 1.2f);
        x01Var.addView(this.P, c8.ma.d(58, 32.0f, 21, 0.0f, 0.0f, 62.0f, 0.0f));
        this.O.addTextChangedListener(new i9(this, i11));
        ImageView imageView = new ImageView(context);
        this.Q = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        this.Q.setImageResource(R.drawable.scan_qr);
        org.telegram.ui.ActionBar.t6.s(this.Q, i10, getResourceProvider(), PorterDuff.Mode.SRC_IN);
        org.telegram.ui.ActionBar.t6.Q(this.Q, org.telegram.ui.ActionBar.m6.h0(org.telegram.ui.ActionBar.m6.r1(0.12f, getThemedColor(i10)), 1, -1), null, org.telegram.ui.ActionBar.t6.K(0.12f, i10), getResourceProvider());
        this.Q.setContentDescription(hd.N0(2131742761, null));
        this.Q.setOnClickListener(new ga(this, 3));
        x01Var.addView(this.Q, c8.ma.d(32, 40.0f, 21, 0.0f, 0.0f, 20.0f, 0.0f));
        k0(false);
        this.N = x01Var;
        jg.z1 z1Var = new jg.z1(true);
        this.x = z1Var;
        z1Var.a = new qf(this, 8);
        getNotificationCenter().c(this.J, ls.S0);
        si.d0(this.currentAccount).P0(true);
        this.s.clear();
        int i12 = this.currentAccount;
        ur.a0(i12).a.c(new jg.q(i12, i7, new ja(this), i7));
        if (!TextUtils.isEmpty(null)) {
            this.O.setText((CharSequence) null);
            ah.i iVar3 = this.O;
            iVar3.setSelection(iVar3.length());
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.W = frameLayout;
        frameLayout.setPadding(org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(10.0f));
        int themedColor = getThemedColor(org.telegram.ui.ActionBar.m6.a7);
        this.W.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{org.telegram.ui.ActionBar.m6.r1(0.0f, themedColor), themedColor, themedColor}));
        hi.e eVar = new hi.e(context, getResourceProvider(), true);
        eVar.setRoundRadius(24);
        this.a0 = eVar;
        eVar.setText(hd.N0(2131742908, null));
        this.a0.setEnabled(false);
        this.a0.setOnClickListener(new ga(this, c10 == true ? 1 : 0));
        hi.e eVar2 = this.a0;
        if (eVar2 != null) {
            eVar2.setEnabled(this.y != null);
        }
        this.W.addView(this.a0, c8.ma.e(-1, 48, ls.E1));
        ((FrameLayout) this.fragmentView).addView(this.W, c8.ma.e(-1, 68, 87));
        o0();
        this.a.g3.O(false);
        return this.fragmentView;
    }

    public final void i0() {
        if (getParentActivity() == null || this.e0 != null || this.Q == null) {
            return;
        }
        org.telegram.messenger.g0.v1(this.O);
        if (getParentActivity().checkSelfPermission("android.permission.CAMERA") != 0) {
            getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 44);
        } else {
            this.e0 = ci.b0.k(this, this.Q, new ci.y(13), new ha(this, 0), new ia(this, 0));
        }
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void j0(String str) {
        String q10;
        String o4;
        ArrayList arrayList = this.w;
        arrayList.clear();
        if (TextUtils.isEmpty(str) || this.y != null || this.E != null) {
            bi.f6 f6Var = this.a;
            if (f6Var != null) {
                f6Var.g3.O(true);
                return;
            }
            return;
        }
        String lowerCase = str.toLowerCase(Locale.ROOT);
        HashSet hashSet = new HashSet();
        ArrayList arrayList2 = getMessagesController().K;
        int size = arrayList2.size();
        int i7 = 0;
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList2.get(i10);
            i10++;
            TLRPC.Dialog dialog = (TLRPC.Dialog) obj;
            if (dialog != null && dialog.id > 0) {
                TLRPC.User c22 = getMessagesController().c2(Long.valueOf(dialog.id));
                if (h0(c22) && (((q10 = p10.q(c22)) != null && q10.toLowerCase(Locale.ROOT).contains(lowerCase)) || ((o4 = p10.o(c22)) != null && o4.toLowerCase(Locale.ROOT).contains(lowerCase)))) {
                    if (hashSet.add(Long.valueOf(c22.id))) {
                        arrayList.add(c22);
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
        bi.f6 f6Var2 = this.a;
        if (f6Var2 != null) {
            f6Var2.g3.O(true);
        }
    }

    public final void k0(boolean z10) {
        if (this.r || this.O == null || this.Q == null) {
            return;
        }
        ClipboardManager clipboardManager = this.U;
        if (clipboardManager != null) {
            this.T = clipboardManager.hasPrimaryClip();
        } else {
            this.T = false;
        }
        p0(z10);
    }

    public final void m0(String str, TLRPC.User user) {
        da daVar;
        if (this.e == null) {
            if (user != null) {
                daVar = new da(user);
            } else {
                da daVar2 = new da(str);
                daVar2.A0(TextUtils.equals(str, this.y) ? this.E : null);
                daVar = daVar2;
            }
            presentFragment(daVar);
            return;
        }
        if (this.h) {
            return;
        }
        this.h = true;
        this.a0.setLoading(true);
        u0 D = u0.D(this.currentAccount);
        o oVar = new o(this, D, user);
        if (user != null) {
            D.j0(user, new e0(7, this, oVar));
        } else {
            oVar.a(str);
        }
    }

    public final void n0(TL_wallet.nftItem nftitem) {
        this.e = nftitem;
        this.f = u0.D(this.currentAccount).y();
    }

    public final void o0() {
        int max = Math.max(0, this.c0 - this.b0);
        bi.f6 f6Var = this.a;
        if (f6Var != null) {
            f6Var.setPadding(0, 0, 0, org.telegram.messenger.g0.L(68.0f) + this.b0 + max);
            this.a.setClipToPadding(false);
        }
        FrameLayout frameLayout = this.W;
        if (frameLayout != null) {
            frameLayout.setPadding(org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(10.0f) + this.b0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.W.getLayoutParams();
            layoutParams.height = org.telegram.messenger.g0.L(68.0f) + this.b0;
            this.W.setLayoutParams(layoutParams);
            if (this.d0 != max) {
                this.W.animate().cancel();
                this.W.animate().translationY(-max).setDuration(320L).setInterpolator(nr.h).start();
                this.d0 = max;
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final boolean onBackPressed(boolean z10) {
        ci.b0 b0Var = this.e0;
        if (b0Var == null) {
            return super.onBackPressed(z10);
        }
        if (!z10) {
            return false;
        }
        b0Var.e();
        return false;
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final void onFragmentDestroy() {
        this.r = true;
        ci.b0 b0Var = this.e0;
        if (b0Var != null) {
            b0Var.g();
            org.telegram.messenger.g0.E2(this.e0);
            this.e0 = null;
        }
        ClipboardManager clipboardManager = this.U;
        if (clipboardManager != null) {
            clipboardManager.removePrimaryClipChangedListener(this.V);
        }
        TextView textView = this.P;
        if (textView != null) {
            textView.animate().cancel();
        }
        ImageView imageView = this.Q;
        if (imageView != null) {
            imageView.animate().cancel();
        }
        if (this.F != 0) {
            getConnectionsManager().cancelRequest(this.F, true);
        }
        FrameLayout frameLayout = this.W;
        if (frameLayout != null) {
            frameLayout.animate().cancel();
        }
        getNotificationCenter().n(this.J, ls.S0);
        Runnable runnable = this.L;
        if (runnable != null) {
            org.telegram.messenger.g0.r(runnable);
        }
        m mVar = this.n;
        if (mVar != null) {
            mVar.run();
        }
        super.onFragmentDestroy();
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final void onInsets(int i7, int i10, int i11, int i12) {
        this.b0 = i12;
        o0();
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final r0.l1 onInsetsInternal(View view, r0.l1 l1Var) {
        this.c0 = l1Var.a.f(8).d;
        return super.onInsetsInternal(view, l1Var);
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final void onPause() {
        ClipboardManager clipboardManager = this.U;
        if (clipboardManager != null) {
            clipboardManager.removePrimaryClipChangedListener(this.V);
        }
        ci.b0 b0Var = this.e0;
        if (b0Var != null) {
            b0Var.g();
            org.telegram.messenger.g0.E2(this.e0);
            this.e0 = null;
        }
        super.onPause();
    }

    @Override // org.telegram.ui.ActionBar.g2
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
        alertDialog$Builder.a.U = org.telegram.messenger.g0.W2(hd.N0(2131746307, null));
        alertDialog$Builder.k(hd.N0(2131747106, null), new ja(this));
        alertDialog$Builder.h(hd.N0(2131751760, null), null);
        int i10 = org.telegram.ui.ActionBar.m6.L5;
        alertDialog$Builder.m(R.raw.permission_request_camera, 72, org.telegram.ui.ActionBar.m6.x0(null, i10, false), null);
        alertDialog$Builder.n(i10, null);
        alertDialog$Builder.p();
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final void onResume() {
        super.onResume();
        ClipboardManager clipboardManager = this.U;
        if (clipboardManager != null) {
            ma maVar = this.V;
            clipboardManager.removePrimaryClipChangedListener(maVar);
            this.U.addPrimaryClipChangedListener(maVar);
        }
        k0(true);
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final void onThemeColorsChanged() {
        int themedColor;
        super.onThemeColorsChanged();
        try {
            FrameLayout frameLayout = this.W;
            if (frameLayout != null && (frameLayout.getBackground() instanceof GradientDrawable) && (themedColor = getThemedColor(org.telegram.ui.ActionBar.m6.a7)) != this.Z) {
                this.Z = themedColor;
                ((GradientDrawable) this.W.getBackground()).setColors(new int[]{org.telegram.ui.ActionBar.m6.r1(0.0f, themedColor), themedColor, themedColor});
            }
            ShapeDrawable shapeDrawable = this.Y;
            if (shapeDrawable != null) {
                org.telegram.ui.ActionBar.m6.C1(getThemedColor(org.telegram.ui.ActionBar.m6.Fi), shapeDrawable);
                ImageView imageView = this.X;
                if (imageView != null) {
                    imageView.invalidate();
                }
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public final void p0(boolean z10) {
        if (this.Q == null) {
            return;
        }
        boolean z11 = false;
        boolean z12 = this.O.length() == 0;
        if (z12 && this.T) {
            z11 = true;
        }
        if (this.R != z11 || !z10) {
            this.R = z11;
            g0(this.P, z11, z10);
        }
        if (this.S != z12 || !z10) {
            this.S = z12;
            g0(this.Q, z12, z10);
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.O.getLayoutParams();
        int L = org.telegram.messenger.g0.L(this.R ? 128.0f : this.S ? 60.0f : 8.0f);
        if (layoutParams.rightMargin != L) {
            layoutParams.rightMargin = L;
            this.O.setLayoutParams(layoutParams);
        }
    }
}
