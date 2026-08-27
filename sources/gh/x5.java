package gh;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import hh.m7;
import hh.u7;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.b70;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.h00;
import org.telegram.ui.Components.lt;
import org.telegram.ui.Components.n41;
import org.telegram.ui.Components.qa;
import org.telegram.ui.Components.yk0;
import org.telegram.ui.Components.zk0;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class x5 extends qa {
    public static final /* synthetic */ int g0 = 0;
    public final String T;
    public final w5 U;
    public final HorizontalScrollView V;
    public final z4 W;
    public final z4 X;
    public final z4 Y;
    public final z4 Z;
    public final hh.r3 a0;
    public hh.p1 b0;
    public final HashSet c0;
    public boolean d0;
    public v5 e0;
    public boolean f0;

    public x5(final Context context, String str, final w5 w5Var) {
        super(context, null, false, false, false, 2, null);
        this.c0 = new HashSet();
        this.G = AndroidUtilities.dp(12.0f);
        fixNavigationBar();
        this.T = str;
        this.U = w5Var;
        this.e.setTitle(z());
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setPadding(AndroidUtilities.dp(11.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(11.0f), AndroidUtilities.dp(6.0f));
        linearLayout.setOrientation(0);
        linearLayout.setClipChildren(false);
        linearLayout.setClipToPadding(false);
        HorizontalScrollView horizontalScrollView = new HorizontalScrollView(context);
        this.V = horizontalScrollView;
        horizontalScrollView.setHorizontalScrollBarEnabled(false);
        horizontalScrollView.setClipChildren(false);
        horizontalScrollView.setClipToPadding(false);
        horizontalScrollView.addView(linearLayout);
        z4 z4Var = new z4(context, this.resourcesProvider);
        this.W = z4Var;
        z4Var.setSorting(w5Var.c.p);
        linearLayout.addView(z4Var, h7.z5.t(-2, -2, 16, 0, 0, 6, 0));
        z4Var.setOnClickListener(new ag.q0(12, this, w5Var));
        z4 z4Var2 = new z4(context, this.resourcesProvider);
        this.X = z4Var2;
        z4Var2.setValue(LocaleController.getString(R.string.Gift2AttributeModel));
        linearLayout.addView(z4Var2, h7.z5.t(-2, -2, 16, 0, 0, 6, 0));
        final int i10 = 0;
        z4Var2.setOnClickListener(new View.OnClickListener(this) { // from class: gh.q5
            public final /* synthetic */ x5 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        x5.R(this.b, w5Var, context);
                        break;
                    case 1:
                        x5.W(this.b, w5Var, context);
                        break;
                    default:
                        x5.S(this.b, w5Var, context);
                        break;
                }
            }
        });
        z4 z4Var3 = new z4(context, this.resourcesProvider);
        this.Y = z4Var3;
        z4Var3.setValue(LocaleController.getString(R.string.Gift2AttributeBackdrop));
        linearLayout.addView(z4Var3, h7.z5.t(-2, -2, 16, 0, 0, 6, 0));
        final int i11 = 1;
        z4Var3.setOnClickListener(new View.OnClickListener(this) { // from class: gh.q5
            public final /* synthetic */ x5 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        x5.R(this.b, w5Var, context);
                        break;
                    case 1:
                        x5.W(this.b, w5Var, context);
                        break;
                    default:
                        x5.S(this.b, w5Var, context);
                        break;
                }
            }
        });
        z4 z4Var4 = new z4(context, this.resourcesProvider);
        this.Z = z4Var4;
        z4Var4.setValue(LocaleController.getString(R.string.Gift2AttributeSymbol));
        linearLayout.addView(z4Var4, h7.z5.t(-2, -2, 16, 0, 0, 0, 0));
        final int i12 = 2;
        z4Var4.setOnClickListener(new View.OnClickListener(this) { // from class: gh.q5
            public final /* synthetic */ x5 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i12) {
                    case 0:
                        x5.R(this.b, w5Var, context);
                        break;
                    case 1:
                        x5.W(this.b, w5Var, context);
                        break;
                    default:
                        x5.S(this.b, w5Var, context);
                        break;
                }
            }
        });
        getContext();
        f2.x xVar = new f2.x(3);
        xVar.O = new u5(this, 0);
        this.d.setLayoutManager(xVar);
        this.d.setOnItemClickListener(new ag.h0(21, this, w5Var));
        this.d.setPadding(AndroidUtilities.dp(8.0f) + this.backgroundPaddingLeft, 0, AndroidUtilities.dp(8.0f) + this.backgroundPaddingLeft, 0);
        this.d.setOnScrollListener(new ag.z2(this, 5));
        f2.l lVar = new f2.l();
        lVar.m = false;
        lVar.C = false;
        lVar.o(er.h);
        lVar.n(350L);
        this.d.setItemAnimator(lVar);
        this.d.setItemSelectorColorProvider(new f9.z(11));
        hh.r3 r3Var = new hh.r3(context);
        this.a0 = r3Var;
        int dp = AndroidUtilities.dp(20.0f);
        int dp2 = AndroidUtilities.dp(9.0f);
        r3Var.h = dp;
        r3Var.n = dp2;
        r3Var.setRoundRadius(AndroidUtilities.dp(22.0f));
        r3Var.setFullRect(true);
        AndroidUtilities.makeGlobalBlurBitmap(new ag.n0(r3Var, 15), 12.0f, 12, null, new ArrayList());
        r3Var.setPivotY(0.0f);
        this.container.addView(r3Var, h7.z5.e(-1, -2, 55));
        this.e0.N(false);
        w5Var.d = new m5(this, 1);
    }

    public static void P(x5 x5Var, w5 w5Var) {
        b70 F = b70.F(x5Var.container, x5Var.resourcesProvider, x5Var.W);
        F.c(R.drawable.menu_sort_value, LocaleController.getString(h5.b.a), new l5(w5Var, 3), false);
        F.c(R.drawable.menu_sort_date, LocaleController.getString(h5.c.a), new l5(w5Var, 4), false);
        F.c(R.drawable.menu_sort_number, LocaleController.getString(h5.d.a), new l5(w5Var, 5), false);
        F.t = false;
        F.Y = true;
        F.a0(0.0f, AndroidUtilities.dp(-8.0f));
        F.Z();
    }

    public static void Q(x5 x5Var, w5 w5Var, int i10) {
        TL_stars.SavedStarGift savedStarGift;
        n41 G = x5Var.e0.G(i10 - 1);
        if (G == null) {
            return;
        }
        Object obj = G.G;
        if (obj instanceof TL_stars.StarGift) {
            TL_stars.StarGift starGift = (TL_stars.StarGift) obj;
            boolean z10 = G.r;
            if (!TextUtils.isEmpty(starGift.gift_address) && x5Var.d0) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(x5Var.getContext(), 0, x5Var.resourcesProvider);
                String string = LocaleController.getString(R.string.GiftCraftCantChooseFirstTitle);
                org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
                b2Var.N = string;
                b2Var.P = LocaleController.getString(R.string.GiftCraftCantChooseFirst);
                i0.a.C(R.string.OK, alertDialog$Builder, null);
                return;
            }
            if (z10 && (starGift instanceof TL_stars.TL_starGiftUnique)) {
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) G.G;
                org.telegram.ui.ActionBar.b2 b2Var2 = new org.telegram.ui.ActionBar.b2(x5Var.getContext(), 3, null);
                b2Var2.q(400L);
                long clientUserId = UserConfig.getInstance(x5Var.currentAccount).getClientUserId();
                hf.b bVar = tL_starGiftUnique.resale_ton_only ? hf.b.b : hf.b.a;
                u7.x(x5Var.currentAccount, bVar).H(tL_starGiftUnique, clientUserId, null, true, new o5(x5Var, b2Var2, bVar, tL_starGiftUnique, clientUserId));
                return;
            }
            if (!z10) {
                ArrayList arrayList = w5Var.b.l;
                int size = arrayList.size();
                int i11 = 0;
                while (true) {
                    if (i11 >= size) {
                        savedStarGift = null;
                        break;
                    }
                    Object obj2 = arrayList.get(i11);
                    i11++;
                    savedStarGift = (TL_stars.SavedStarGift) obj2;
                    if (savedStarGift.gift == starGift) {
                        break;
                    }
                }
                if (savedStarGift != null && savedStarGift.can_craft_at > 0 && savedStarGift.can_craft_at > ConnectionsManager.getInstance(x5Var.currentAccount).getCurrentTime()) {
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(x5Var.getContext());
                    String string2 = LocaleController.getString(R.string.GiftCraftUnavailableTitle);
                    org.telegram.ui.ActionBar.b2 b2Var3 = alertDialog$Builder2.a;
                    b2Var3.N = string2;
                    b2Var3.P = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GiftCraftUnavailableTextTime, LocaleController.formatDateTime(savedStarGift.can_craft_at, true)));
                    i0.a.C(R.string.OK, alertDialog$Builder2, null);
                    return;
                }
            }
            x5Var.b0.run(starGift);
            x5Var.dismiss();
        }
    }

    public static void R(x5 x5Var, w5 w5Var, Context context) {
        i5 i5Var = w5Var.c;
        if (i5Var.f.isEmpty()) {
            return;
        }
        b70 b70Var = new b70(x5Var.container, x5Var.resourcesProvider, x5Var.X, false, true, false);
        b70Var.t = false;
        b70Var.Y = true;
        b70Var.a0(0.0f, AndroidUtilities.dp(-8.0f));
        b70Var.R = true;
        b70Var.p = new m3(b70Var, 6);
        String[] strArr = {""};
        ArrayList arrayList = new ArrayList(i5Var.f);
        Collections.sort(arrayList, new n5(w5Var, 2));
        int i10 = 0;
        r5 r5Var = new r5(context, x5Var.currentAccount, 0, false, new j5(strArr, w5Var, arrayList, i10), new k5(w5Var, b70Var, i10), null, x5Var.resourcesProvider);
        r5Var.U2.r = false;
        FrameLayout frameLayout = new FrameLayout(context);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.smiles_inputsearch);
        imageView.setColorFilter(new PorterDuffColorFilter(x5Var.getThemedColor(org.telegram.ui.ActionBar.g6.F8), PorterDuff.Mode.SRC_IN));
        frameLayout.addView(imageView, h7.z5.d(24, 24.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
        lt ltVar = new lt(context, x5Var.resourcesProvider);
        ltVar.setTextSize(1, 16.0f);
        ltVar.setInputType(573441);
        ltVar.setRawInputType(573441);
        ltVar.setHintTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.A6, x5Var.resourcesProvider));
        ltVar.setCursorColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.G6, x5Var.resourcesProvider));
        ltVar.setCursorSize(AndroidUtilities.dp(19.0f));
        ltVar.setCursorWidth(1.5f);
        ltVar.setHint(LocaleController.getString(R.string.Gift2ResaleFiltersSearch));
        ltVar.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.E8, x5Var.resourcesProvider));
        ltVar.setBackground(null);
        frameLayout.addView(ltVar, h7.z5.d(-1, -2.0f, 19, 43.0f, 0.0f, 8.0f, 0.0f));
        ltVar.addTextChangedListener(new n4(3, strArr, r5Var));
        if (arrayList.size() > 8) {
            b70Var.r(frameLayout, h7.z5.n(-1, 44));
            b70Var.k();
        }
        if (!i5Var.j.isEmpty()) {
            b70Var.c(R.drawable.msg_select, LocaleController.getString(R.string.SelectAll), new l5(w5Var, 0), false);
        }
        b70Var.q(r5Var);
        b70Var.Z();
    }

    public static void S(x5 x5Var, w5 w5Var, Context context) {
        i5 i5Var = w5Var.c;
        if (i5Var.h.isEmpty()) {
            return;
        }
        b70 b70Var = new b70(x5Var.container, x5Var.resourcesProvider, x5Var.Z, false, true, false);
        b70Var.t = false;
        b70Var.Y = true;
        b70Var.a0(0.0f, AndroidUtilities.dp(-8.0f));
        b70Var.R = true;
        b70Var.p = new m3(b70Var, 5);
        String[] strArr = {""};
        ArrayList arrayList = new ArrayList(i5Var.h);
        Collections.sort(arrayList, new n5(w5Var, 1));
        int i10 = 2;
        t5 t5Var = new t5(context, x5Var.currentAccount, 0, false, new j5(strArr, w5Var, arrayList, i10), new k5(w5Var, b70Var, i10), null, x5Var.resourcesProvider);
        t5Var.U2.r = false;
        FrameLayout frameLayout = new FrameLayout(context);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.smiles_inputsearch);
        imageView.setColorFilter(new PorterDuffColorFilter(x5Var.getThemedColor(org.telegram.ui.ActionBar.g6.F8), PorterDuff.Mode.SRC_IN));
        frameLayout.addView(imageView, h7.z5.d(24, 24.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
        lt ltVar = new lt(context, x5Var.resourcesProvider);
        ltVar.setTextSize(1, 16.0f);
        ltVar.setInputType(573441);
        ltVar.setRawInputType(573441);
        ltVar.setHintTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.A6, x5Var.resourcesProvider));
        ltVar.setCursorColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.G6, x5Var.resourcesProvider));
        ltVar.setCursorSize(AndroidUtilities.dp(19.0f));
        ltVar.setCursorWidth(1.5f);
        ltVar.setHint(LocaleController.getString(R.string.Gift2ResaleFiltersSearch));
        ltVar.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.E8, x5Var.resourcesProvider));
        ltVar.setBackground(null);
        frameLayout.addView(ltVar, h7.z5.d(-1, -2.0f, 19, 43.0f, 0.0f, 8.0f, 0.0f));
        ltVar.addTextChangedListener(new n4(5, strArr, t5Var));
        if (arrayList.size() > 8) {
            b70Var.r(frameLayout, h7.z5.n(-1, 44));
            b70Var.k();
        }
        if (!i5Var.l.isEmpty()) {
            b70Var.c(R.drawable.msg_select, LocaleController.getString(R.string.SelectAll), new l5(w5Var, 2), false);
        }
        b70Var.q(t5Var);
        b70Var.Z();
    }

    public static void T(x5 x5Var, ArrayList arrayList) {
        w5 w5Var = x5Var.U;
        if (w5Var != null) {
            m7 m7Var = w5Var.b;
            i5 i5Var = w5Var.c;
            if (m7Var == null || i5Var == null) {
                return;
            }
            int currentTime = ConnectionsManager.getInstance(x5Var.currentAccount).getCurrentTime();
            arrayList.add(n41.s(-1, LocaleController.getString(R.string.GiftCraftSelectYour)));
            ArrayList arrayList2 = m7Var.l;
            int size = arrayList2.size();
            int i10 = 0;
            boolean z10 = true;
            int i11 = 0;
            int i12 = 0;
            while (i12 < size) {
                Object obj = arrayList2.get(i12);
                i12++;
                TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj;
                if (!x5Var.c0.contains(Long.valueOf(savedStarGift.gift.id))) {
                    boolean z11 = savedStarGift.can_craft_at <= currentTime;
                    n41 a2 = a2.a(0, savedStarGift.gift, false, true, false, false, true);
                    a2.g = z11;
                    arrayList.add(a2);
                    i11++;
                    z10 = false;
                }
            }
            if (m7Var.i || !m7Var.j) {
                int i13 = i11 % 3;
                int i14 = 6 - i13;
                for (int i15 = 0; i15 < i14; i15++) {
                    n41 o10 = n41.o((i15 - i13) + 1, 35);
                    o10.u = 1;
                    arrayList.add(o10);
                }
            } else if (z10) {
                arrayList.add(n41.g(LocaleController.getString(R.string.GiftCraftSelectYourEmpty)));
            }
            if (i5Var.e > 0 || x5Var.f0) {
                x5Var.f0 = true;
                String string = LocaleController.getString(R.string.GiftCraftSelectResale);
                n41 n41Var = new n41(42);
                n41Var.d = -2;
                n41Var.o = string;
                arrayList.add(n41Var);
                HorizontalScrollView horizontalScrollView = x5Var.V;
                if (horizontalScrollView != null) {
                    arrayList.add(n41.j(-3, horizontalScrollView));
                }
                ArrayList arrayList3 = i5Var.d;
                int size2 = arrayList3.size();
                while (i10 < size2) {
                    Object obj2 = arrayList3.get(i10);
                    i10++;
                    arrayList.add(a2.a(0, (TL_stars.TL_starGiftUnique) obj2, false, true, false, true, true));
                }
                if (i5Var.t || !i5Var.u) {
                    n41 o11 = n41.o(10, 35);
                    o11.u = 1;
                    arrayList.add(o11);
                    n41 o12 = n41.o(11, 35);
                    o12.u = 1;
                    arrayList.add(o12);
                    n41 o13 = n41.o(12, 35);
                    o13.u = 1;
                    arrayList.add(o13);
                    n41 o14 = n41.o(13, 35);
                    o14.u = 1;
                    arrayList.add(o14);
                    n41 o15 = n41.o(14, 35);
                    o15.u = 1;
                    arrayList.add(o15);
                    n41 o16 = n41.o(15, 35);
                    o16.u = 1;
                    arrayList.add(o16);
                }
            }
        }
    }

    public static /* synthetic */ void U(x5 x5Var, org.telegram.ui.ActionBar.b2 b2Var, hf.b bVar, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j10, TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift) {
        b2Var.dismiss();
        if (tL_payments_paymentFormStarGift == null) {
            return;
        }
        hh.k4 k4Var = new hh.k4(bVar, tL_payments_paymentFormStarGift);
        Context context = x5Var.getContext();
        org.telegram.ui.ActionBar.c6 c6Var = x5Var.resourcesProvider;
        int i10 = x5Var.currentAccount;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(tL_starGiftUnique.title);
        sb2.append(" #");
        new hh.m4(context, c6Var, tL_starGiftUnique, k4Var, i10, j10, i0.a.m(tL_starGiftUnique.num, ',', sb2), true, new p5(x5Var, tL_starGiftUnique, j10, 0)).b();
    }

    public static void V(x5 x5Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j10, hh.k4 k4Var, we.d dVar) {
        dVar.d();
        u7.x(x5Var.currentAccount, k4Var.a).h(k4Var.b, tL_starGiftUnique, j10, null, true, new d0(x5Var, dVar, tL_starGiftUnique, 1));
    }

    public static void W(x5 x5Var, w5 w5Var, Context context) {
        i5 i5Var = w5Var.c;
        if (i5Var.g.isEmpty()) {
            return;
        }
        b70 b70Var = new b70(x5Var.container, x5Var.resourcesProvider, x5Var.Y, false, true, false);
        b70Var.t = false;
        b70Var.Y = true;
        b70Var.a0(0.0f, AndroidUtilities.dp(-8.0f));
        b70Var.R = true;
        b70Var.p = new m3(b70Var, 4);
        String[] strArr = {""};
        ArrayList arrayList = new ArrayList(i5Var.g);
        Collections.sort(arrayList, new n5(w5Var, 0));
        int i10 = 1;
        s5 s5Var = new s5(context, x5Var.currentAccount, 0, false, new j5(strArr, w5Var, arrayList, i10), new k5(w5Var, b70Var, i10), null, x5Var.resourcesProvider);
        s5Var.U2.r = false;
        FrameLayout frameLayout = new FrameLayout(context);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.smiles_inputsearch);
        imageView.setColorFilter(new PorterDuffColorFilter(x5Var.getThemedColor(org.telegram.ui.ActionBar.g6.F8), PorterDuff.Mode.SRC_IN));
        frameLayout.addView(imageView, h7.z5.d(24, 24.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
        lt ltVar = new lt(context, x5Var.resourcesProvider);
        ltVar.setTextSize(1, 16.0f);
        ltVar.setInputType(573441);
        ltVar.setRawInputType(573441);
        ltVar.setHintTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.A6, x5Var.resourcesProvider));
        ltVar.setCursorColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.G6, x5Var.resourcesProvider));
        ltVar.setCursorSize(AndroidUtilities.dp(19.0f));
        ltVar.setCursorWidth(1.5f);
        ltVar.setHint(LocaleController.getString(R.string.Gift2ResaleFiltersSearch));
        ltVar.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.E8, x5Var.resourcesProvider));
        ltVar.setBackground(null);
        frameLayout.addView(ltVar, h7.z5.d(-1, -2.0f, 19, 43.0f, 0.0f, 8.0f, 0.0f));
        ltVar.addTextChangedListener(new n4(4, strArr, s5Var));
        if (arrayList.size() > 8) {
            b70Var.r(frameLayout, h7.z5.n(-1, 44));
            b70Var.k();
        }
        if (!i5Var.k.isEmpty()) {
            b70Var.c(R.drawable.msg_select, LocaleController.getString(R.string.SelectAll), new l5(w5Var, 1), false);
        }
        b70Var.q(s5Var);
        b70Var.Z();
    }

    @Override // org.telegram.ui.Components.qa
    public final void F(float f10) {
        float y10 = this.containerView.getY() + f10;
        hh.r3 r3Var = this.a0;
        float measuredHeight = y10 - r3Var.getMeasuredHeight();
        float clamp01 = 1.0f - Utilities.clamp01(Math.max(0.0f, (-measuredHeight) + AndroidUtilities.dp(8.0f)) / r3Var.getMeasuredHeight());
        float height = this.container.getHeight() / 2.0f;
        if (measuredHeight > height) {
            clamp01 = Math.min(clamp01, Utilities.clamp01(1.0f - ((measuredHeight - height) / AndroidUtilities.dpf2(128.0f))));
        }
        r3Var.setScaleX(clamp01);
        r3Var.setScaleY(clamp01);
        r3Var.setAlpha(AndroidUtilities.ilerp(clamp01, 0.5f, 1.0f));
        r3Var.setTranslationY(measuredHeight);
    }

    public final void Z() {
        int R;
        n41 G;
        int i10 = 0;
        boolean z10 = false;
        boolean z11 = false;
        while (true) {
            zk0 zk0Var = this.d;
            if (i10 >= zk0Var.getChildCount()) {
                break;
            }
            View childAt = zk0Var.getChildAt(i10);
            if ((childAt instanceof h00) && (R = RecyclerView.R(childAt) - 1) >= 0 && (G = this.e0.G(R)) != null) {
                if (G.d < 10) {
                    z10 = true;
                } else {
                    z11 = true;
                }
            }
            i10++;
        }
        w5 w5Var = this.U;
        if (z10) {
            w5Var.b.a();
        }
        if (z11) {
            w5Var.c.g(false);
        }
    }

    @Override // org.telegram.ui.Components.qa
    public final yk0 w(zk0 zk0Var) {
        v5 v5Var = new v5(this, zk0Var, getContext(), this.currentAccount, new ch.c(this, 12), this.resourcesProvider);
        this.e0 = v5Var;
        return v5Var;
    }

    @Override // org.telegram.ui.Components.qa
    public final CharSequence z() {
        String str = this.T;
        return str != null ? str : LocaleController.getString(R.string.GiftCraftSelectTitle);
    }
}
