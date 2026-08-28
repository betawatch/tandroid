package fh;

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
import gh.n7;
import gh.v7;
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
import org.telegram.ui.Components.e00;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.mt;
import org.telegram.ui.Components.sa;
import org.telegram.ui.Components.vk0;
import org.telegram.ui.Components.wk0;
import org.telegram.ui.Components.x60;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class f6 extends sa {
    public static final /* synthetic */ int g0 = 0;
    public final String T;
    public final e6 U;
    public final HorizontalScrollView V;
    public final g5 W;
    public final g5 X;
    public final g5 Y;
    public final g5 Z;
    public final gh.s3 a0;
    public gh.p1 b0;
    public final HashSet c0;
    public boolean d0;
    public d6 e0;
    public boolean f0;

    public f6(final Context context, String str, final e6 e6Var) {
        super(context, null, false, false, false, 2, null);
        this.c0 = new HashSet();
        this.G = AndroidUtilities.dp(12.0f);
        fixNavigationBar();
        this.T = str;
        this.U = e6Var;
        this.e.setTitle(y());
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
        g5 g5Var = new g5(context, this.resourcesProvider);
        this.W = g5Var;
        g5Var.setSorting(e6Var.c.p);
        linearLayout.addView(g5Var, g7.e6.t(-2, -2, 16, 0, 0, 6, 0));
        g5Var.setOnClickListener(new bg.u1(11, this, e6Var));
        g5 g5Var2 = new g5(context, this.resourcesProvider);
        this.X = g5Var2;
        g5Var2.setValue(LocaleController.getString(R.string.Gift2AttributeModel));
        linearLayout.addView(g5Var2, g7.e6.t(-2, -2, 16, 0, 0, 6, 0));
        final int i9 = 0;
        g5Var2.setOnClickListener(new View.OnClickListener(this) { // from class: fh.x5
            public final /* synthetic */ f6 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i9) {
                    case 0:
                        f6.Q(this.b, e6Var, context);
                        break;
                    case 1:
                        f6.V(this.b, e6Var, context);
                        break;
                    default:
                        f6.R(this.b, e6Var, context);
                        break;
                }
            }
        });
        g5 g5Var3 = new g5(context, this.resourcesProvider);
        this.Y = g5Var3;
        g5Var3.setValue(LocaleController.getString(R.string.Gift2AttributeBackdrop));
        linearLayout.addView(g5Var3, g7.e6.t(-2, -2, 16, 0, 0, 6, 0));
        final int i10 = 1;
        g5Var3.setOnClickListener(new View.OnClickListener(this) { // from class: fh.x5
            public final /* synthetic */ f6 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        f6.Q(this.b, e6Var, context);
                        break;
                    case 1:
                        f6.V(this.b, e6Var, context);
                        break;
                    default:
                        f6.R(this.b, e6Var, context);
                        break;
                }
            }
        });
        g5 g5Var4 = new g5(context, this.resourcesProvider);
        this.Z = g5Var4;
        g5Var4.setValue(LocaleController.getString(R.string.Gift2AttributeSymbol));
        linearLayout.addView(g5Var4, g7.e6.t(-2, -2, 16, 0, 0, 0, 0));
        final int i11 = 2;
        g5Var4.setOnClickListener(new View.OnClickListener(this) { // from class: fh.x5
            public final /* synthetic */ f6 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        f6.Q(this.b, e6Var, context);
                        break;
                    case 1:
                        f6.V(this.b, e6Var, context);
                        break;
                    default:
                        f6.R(this.b, e6Var, context);
                        break;
                }
            }
        });
        getContext();
        f2.y yVar = new f2.y(3);
        yVar.O = new c6(this, 0);
        this.d.setLayoutManager(yVar);
        this.d.setOnItemClickListener(new b5.d(20, this, e6Var));
        this.d.setPadding(AndroidUtilities.dp(8.0f) + this.backgroundPaddingLeft, 0, AndroidUtilities.dp(8.0f) + this.backgroundPaddingLeft, 0);
        this.d.setOnScrollListener(new bg.o2(this, 4));
        f2.n nVar = new f2.n();
        nVar.m = false;
        nVar.C = false;
        nVar.o(gr.h);
        nVar.n(350L);
        this.d.setItemAnimator(nVar);
        this.d.setItemSelectorColorProvider(new y5(0));
        gh.s3 s3Var = new gh.s3(context);
        this.a0 = s3Var;
        int dp = AndroidUtilities.dp(20.0f);
        int dp2 = AndroidUtilities.dp(9.0f);
        s3Var.h = dp;
        s3Var.n = dp2;
        s3Var.setRoundRadius(AndroidUtilities.dp(22.0f));
        s3Var.setFullRect(true);
        AndroidUtilities.makeGlobalBlurBitmap(new bg.i(s3Var, 13), 12.0f, 12, null, new ArrayList());
        s3Var.setPivotY(0.0f);
        this.container.addView(s3Var, g7.e6.e(-1, -2, 55));
        this.e0.N(false);
        e6Var.d = new t5(this, 1);
    }

    public static void O(f6 f6Var, e6 e6Var) {
        x60 F = x60.F(f6Var.container, f6Var.resourcesProvider, f6Var.W);
        F.c(R.drawable.menu_sort_value, LocaleController.getString(o5.b.a), new s5(e6Var, 3), false);
        F.c(R.drawable.menu_sort_date, LocaleController.getString(o5.c.a), new s5(e6Var, 4), false);
        F.c(R.drawable.menu_sort_number, LocaleController.getString(o5.d.a), new s5(e6Var, 5), false);
        F.t = false;
        F.Y = true;
        F.a0(0.0f, AndroidUtilities.dp(-8.0f));
        F.Z();
    }

    public static void P(f6 f6Var, e6 e6Var, int i9) {
        TL_stars.SavedStarGift savedStarGift;
        l41 G = f6Var.e0.G(i9 - 1);
        if (G == null) {
            return;
        }
        Object obj = G.G;
        if (obj instanceof TL_stars.StarGift) {
            TL_stars.StarGift starGift = (TL_stars.StarGift) obj;
            boolean z10 = G.r;
            if (!TextUtils.isEmpty(starGift.gift_address) && f6Var.d0) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(f6Var.getContext(), 0, f6Var.resourcesProvider);
                String string = LocaleController.getString(R.string.GiftCraftCantChooseFirstTitle);
                org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
                c2Var.N = string;
                c2Var.P = LocaleController.getString(R.string.GiftCraftCantChooseFirst);
                org.telegram.messenger.l0.o(R.string.OK, alertDialog$Builder, null);
                return;
            }
            if (z10 && (starGift instanceof TL_stars.TL_starGiftUnique)) {
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) G.G;
                org.telegram.ui.ActionBar.c2 c2Var2 = new org.telegram.ui.ActionBar.c2(f6Var.getContext(), 3, null);
                c2Var2.q(400L);
                long clientUserId = UserConfig.getInstance(f6Var.currentAccount).getClientUserId();
                gf.b bVar = tL_starGiftUnique.resale_ton_only ? gf.b.b : gf.b.a;
                v7.x(f6Var.currentAccount, bVar).H(tL_starGiftUnique, clientUserId, null, true, new v5(f6Var, c2Var2, bVar, tL_starGiftUnique, clientUserId));
                return;
            }
            if (!z10) {
                ArrayList arrayList = e6Var.b.l;
                int size = arrayList.size();
                int i10 = 0;
                while (true) {
                    if (i10 >= size) {
                        savedStarGift = null;
                        break;
                    }
                    Object obj2 = arrayList.get(i10);
                    i10++;
                    savedStarGift = (TL_stars.SavedStarGift) obj2;
                    if (savedStarGift.gift == starGift) {
                        break;
                    }
                }
                if (savedStarGift != null && savedStarGift.can_craft_at > 0 && savedStarGift.can_craft_at > ConnectionsManager.getInstance(f6Var.currentAccount).getCurrentTime()) {
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(f6Var.getContext());
                    String string2 = LocaleController.getString(R.string.GiftCraftUnavailableTitle);
                    org.telegram.ui.ActionBar.c2 c2Var3 = alertDialog$Builder2.a;
                    c2Var3.N = string2;
                    c2Var3.P = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GiftCraftUnavailableTextTime, LocaleController.formatDateTime(savedStarGift.can_craft_at, true)));
                    org.telegram.messenger.l0.o(R.string.OK, alertDialog$Builder2, null);
                    return;
                }
            }
            f6Var.b0.run(starGift);
            f6Var.dismiss();
        }
    }

    public static void Q(f6 f6Var, e6 e6Var, Context context) {
        p5 p5Var = e6Var.c;
        if (p5Var.f.isEmpty()) {
            return;
        }
        x60 x60Var = new x60(f6Var.container, f6Var.resourcesProvider, f6Var.X, false, true, false);
        x60Var.t = false;
        x60Var.Y = true;
        x60Var.a0(0.0f, AndroidUtilities.dp(-8.0f));
        x60Var.R = true;
        x60Var.p = new r3(x60Var, 6);
        String[] strArr = {""};
        ArrayList arrayList = new ArrayList(p5Var.f);
        Collections.sort(arrayList, new u5(e6Var, 2));
        int i9 = 0;
        z5 z5Var = new z5(context, f6Var.currentAccount, 0, false, new q5(strArr, e6Var, arrayList, i9), new r5(e6Var, x60Var, i9), null, f6Var.resourcesProvider);
        z5Var.U2.r = false;
        FrameLayout frameLayout = new FrameLayout(context);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.smiles_inputsearch);
        imageView.setColorFilter(new PorterDuffColorFilter(f6Var.getThemedColor(org.telegram.ui.ActionBar.f6.F8), PorterDuff.Mode.SRC_IN));
        frameLayout.addView(imageView, g7.e6.d(24, 24.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
        mt mtVar = new mt(context, f6Var.resourcesProvider);
        mtVar.setTextSize(1, 16.0f);
        mtVar.setInputType(573441);
        mtVar.setRawInputType(573441);
        mtVar.setHintTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.A6, f6Var.resourcesProvider));
        mtVar.setCursorColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.G6, f6Var.resourcesProvider));
        mtVar.setCursorSize(AndroidUtilities.dp(19.0f));
        mtVar.setCursorWidth(1.5f);
        mtVar.setHint(LocaleController.getString(R.string.Gift2ResaleFiltersSearch));
        mtVar.setTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.E8, f6Var.resourcesProvider));
        mtVar.setBackground(null);
        frameLayout.addView(mtVar, g7.e6.d(-1, -2.0f, 19, 43.0f, 0.0f, 8.0f, 0.0f));
        mtVar.addTextChangedListener(new t4(3, strArr, z5Var));
        if (arrayList.size() > 8) {
            x60Var.r(frameLayout, g7.e6.n(-1, 44));
            x60Var.k();
        }
        if (!p5Var.j.isEmpty()) {
            x60Var.c(R.drawable.msg_select, LocaleController.getString(R.string.SelectAll), new s5(e6Var, 0), false);
        }
        x60Var.q(z5Var);
        x60Var.Z();
    }

    public static void R(f6 f6Var, e6 e6Var, Context context) {
        p5 p5Var = e6Var.c;
        if (p5Var.h.isEmpty()) {
            return;
        }
        x60 x60Var = new x60(f6Var.container, f6Var.resourcesProvider, f6Var.Z, false, true, false);
        x60Var.t = false;
        x60Var.Y = true;
        x60Var.a0(0.0f, AndroidUtilities.dp(-8.0f));
        x60Var.R = true;
        x60Var.p = new r3(x60Var, 5);
        String[] strArr = {""};
        ArrayList arrayList = new ArrayList(p5Var.h);
        Collections.sort(arrayList, new u5(e6Var, 1));
        int i9 = 2;
        b6 b6Var = new b6(context, f6Var.currentAccount, 0, false, new q5(strArr, e6Var, arrayList, i9), new r5(e6Var, x60Var, i9), null, f6Var.resourcesProvider);
        b6Var.U2.r = false;
        FrameLayout frameLayout = new FrameLayout(context);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.smiles_inputsearch);
        imageView.setColorFilter(new PorterDuffColorFilter(f6Var.getThemedColor(org.telegram.ui.ActionBar.f6.F8), PorterDuff.Mode.SRC_IN));
        frameLayout.addView(imageView, g7.e6.d(24, 24.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
        mt mtVar = new mt(context, f6Var.resourcesProvider);
        mtVar.setTextSize(1, 16.0f);
        mtVar.setInputType(573441);
        mtVar.setRawInputType(573441);
        mtVar.setHintTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.A6, f6Var.resourcesProvider));
        mtVar.setCursorColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.G6, f6Var.resourcesProvider));
        mtVar.setCursorSize(AndroidUtilities.dp(19.0f));
        mtVar.setCursorWidth(1.5f);
        mtVar.setHint(LocaleController.getString(R.string.Gift2ResaleFiltersSearch));
        mtVar.setTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.E8, f6Var.resourcesProvider));
        mtVar.setBackground(null);
        frameLayout.addView(mtVar, g7.e6.d(-1, -2.0f, 19, 43.0f, 0.0f, 8.0f, 0.0f));
        mtVar.addTextChangedListener(new t4(5, strArr, b6Var));
        if (arrayList.size() > 8) {
            x60Var.r(frameLayout, g7.e6.n(-1, 44));
            x60Var.k();
        }
        if (!p5Var.l.isEmpty()) {
            x60Var.c(R.drawable.msg_select, LocaleController.getString(R.string.SelectAll), new s5(e6Var, 2), false);
        }
        x60Var.q(b6Var);
        x60Var.Z();
    }

    public static void S(f6 f6Var, ArrayList arrayList) {
        e6 e6Var = f6Var.U;
        if (e6Var != null) {
            n7 n7Var = e6Var.b;
            p5 p5Var = e6Var.c;
            if (n7Var == null || p5Var == null) {
                return;
            }
            int currentTime = ConnectionsManager.getInstance(f6Var.currentAccount).getCurrentTime();
            arrayList.add(l41.s(-1, LocaleController.getString(R.string.GiftCraftSelectYour)));
            ArrayList arrayList2 = n7Var.l;
            int size = arrayList2.size();
            int i9 = 0;
            boolean z10 = true;
            int i10 = 0;
            int i11 = 0;
            while (i11 < size) {
                Object obj = arrayList2.get(i11);
                i11++;
                TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj;
                if (!f6Var.c0.contains(Long.valueOf(savedStarGift.gift.id))) {
                    boolean z11 = savedStarGift.can_craft_at <= currentTime;
                    l41 a2 = e2.a(0, savedStarGift.gift, false, true, false, false, true);
                    a2.g = z11;
                    arrayList.add(a2);
                    i10++;
                    z10 = false;
                }
            }
            if (n7Var.i || !n7Var.j) {
                int i12 = i10 % 3;
                int i13 = 6 - i12;
                for (int i14 = 0; i14 < i13; i14++) {
                    l41 o6 = l41.o((i14 - i12) + 1, 35);
                    o6.u = 1;
                    arrayList.add(o6);
                }
            } else if (z10) {
                arrayList.add(l41.g(LocaleController.getString(R.string.GiftCraftSelectYourEmpty)));
            }
            if (p5Var.e > 0 || f6Var.f0) {
                f6Var.f0 = true;
                String string = LocaleController.getString(R.string.GiftCraftSelectResale);
                l41 l41Var = new l41(42);
                l41Var.d = -2;
                l41Var.o = string;
                arrayList.add(l41Var);
                HorizontalScrollView horizontalScrollView = f6Var.V;
                if (horizontalScrollView != null) {
                    arrayList.add(l41.j(-3, horizontalScrollView));
                }
                ArrayList arrayList3 = p5Var.d;
                int size2 = arrayList3.size();
                while (i9 < size2) {
                    Object obj2 = arrayList3.get(i9);
                    i9++;
                    arrayList.add(e2.a(0, (TL_stars.TL_starGiftUnique) obj2, false, true, false, true, true));
                }
                if (p5Var.t || !p5Var.u) {
                    l41 o9 = l41.o(10, 35);
                    o9.u = 1;
                    arrayList.add(o9);
                    l41 o10 = l41.o(11, 35);
                    o10.u = 1;
                    arrayList.add(o10);
                    l41 o11 = l41.o(12, 35);
                    o11.u = 1;
                    arrayList.add(o11);
                    l41 o12 = l41.o(13, 35);
                    o12.u = 1;
                    arrayList.add(o12);
                    l41 o13 = l41.o(14, 35);
                    o13.u = 1;
                    arrayList.add(o13);
                    l41 o14 = l41.o(15, 35);
                    o14.u = 1;
                    arrayList.add(o14);
                }
            }
        }
    }

    public static /* synthetic */ void T(f6 f6Var, org.telegram.ui.ActionBar.c2 c2Var, gf.b bVar, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j10, TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift) {
        c2Var.dismiss();
        if (tL_payments_paymentFormStarGift == null) {
            return;
        }
        gh.m4 m4Var = new gh.m4(bVar, tL_payments_paymentFormStarGift);
        Context context = f6Var.getContext();
        org.telegram.ui.ActionBar.b6 b6Var = f6Var.resourcesProvider;
        int i9 = f6Var.currentAccount;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(tL_starGiftUnique.title);
        sb2.append(" #");
        new gh.o4(context, b6Var, tL_starGiftUnique, m4Var, i9, j10, j3.r0.n(tL_starGiftUnique.num, ',', sb2), true, new w5(f6Var, tL_starGiftUnique, j10, 0)).b();
    }

    public static void U(f6 f6Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j10, gh.m4 m4Var, ve.d dVar) {
        dVar.d();
        v7.x(f6Var.currentAccount, m4Var.a).h(m4Var.b, tL_starGiftUnique, j10, null, true, new f0(f6Var, dVar, tL_starGiftUnique, 1));
    }

    public static void V(f6 f6Var, e6 e6Var, Context context) {
        p5 p5Var = e6Var.c;
        if (p5Var.g.isEmpty()) {
            return;
        }
        x60 x60Var = new x60(f6Var.container, f6Var.resourcesProvider, f6Var.Y, false, true, false);
        x60Var.t = false;
        x60Var.Y = true;
        x60Var.a0(0.0f, AndroidUtilities.dp(-8.0f));
        x60Var.R = true;
        x60Var.p = new r3(x60Var, 4);
        String[] strArr = {""};
        ArrayList arrayList = new ArrayList(p5Var.g);
        Collections.sort(arrayList, new u5(e6Var, 0));
        int i9 = 1;
        a6 a6Var = new a6(context, f6Var.currentAccount, 0, false, new q5(strArr, e6Var, arrayList, i9), new r5(e6Var, x60Var, i9), null, f6Var.resourcesProvider);
        a6Var.U2.r = false;
        FrameLayout frameLayout = new FrameLayout(context);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.smiles_inputsearch);
        imageView.setColorFilter(new PorterDuffColorFilter(f6Var.getThemedColor(org.telegram.ui.ActionBar.f6.F8), PorterDuff.Mode.SRC_IN));
        frameLayout.addView(imageView, g7.e6.d(24, 24.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
        mt mtVar = new mt(context, f6Var.resourcesProvider);
        mtVar.setTextSize(1, 16.0f);
        mtVar.setInputType(573441);
        mtVar.setRawInputType(573441);
        mtVar.setHintTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.A6, f6Var.resourcesProvider));
        mtVar.setCursorColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.G6, f6Var.resourcesProvider));
        mtVar.setCursorSize(AndroidUtilities.dp(19.0f));
        mtVar.setCursorWidth(1.5f);
        mtVar.setHint(LocaleController.getString(R.string.Gift2ResaleFiltersSearch));
        mtVar.setTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.E8, f6Var.resourcesProvider));
        mtVar.setBackground(null);
        frameLayout.addView(mtVar, g7.e6.d(-1, -2.0f, 19, 43.0f, 0.0f, 8.0f, 0.0f));
        mtVar.addTextChangedListener(new t4(4, strArr, a6Var));
        if (arrayList.size() > 8) {
            x60Var.r(frameLayout, g7.e6.n(-1, 44));
            x60Var.k();
        }
        if (!p5Var.k.isEmpty()) {
            x60Var.c(R.drawable.msg_select, LocaleController.getString(R.string.SelectAll), new s5(e6Var, 1), false);
        }
        x60Var.q(a6Var);
        x60Var.Z();
    }

    @Override // org.telegram.ui.Components.sa
    public final void E(float f10) {
        float y10 = this.containerView.getY() + f10;
        gh.s3 s3Var = this.a0;
        float measuredHeight = y10 - s3Var.getMeasuredHeight();
        float clamp01 = 1.0f - Utilities.clamp01(Math.max(0.0f, (-measuredHeight) + AndroidUtilities.dp(8.0f)) / s3Var.getMeasuredHeight());
        float height = this.container.getHeight() / 2.0f;
        if (measuredHeight > height) {
            clamp01 = Math.min(clamp01, Utilities.clamp01(1.0f - ((measuredHeight - height) / AndroidUtilities.dpf2(128.0f))));
        }
        s3Var.setScaleX(clamp01);
        s3Var.setScaleY(clamp01);
        s3Var.setAlpha(AndroidUtilities.ilerp(clamp01, 0.5f, 1.0f));
        s3Var.setTranslationY(measuredHeight);
    }

    public final void Y() {
        int R;
        l41 G;
        int i9 = 0;
        boolean z10 = false;
        boolean z11 = false;
        while (true) {
            wk0 wk0Var = this.d;
            if (i9 >= wk0Var.getChildCount()) {
                break;
            }
            View childAt = wk0Var.getChildAt(i9);
            if ((childAt instanceof e00) && (R = RecyclerView.R(childAt) - 1) >= 0 && (G = this.e0.G(R)) != null) {
                if (G.d < 10) {
                    z10 = true;
                } else {
                    z11 = true;
                }
            }
            i9++;
        }
        e6 e6Var = this.U;
        if (z10) {
            e6Var.b.a();
        }
        if (z11) {
            e6Var.c.g(false);
        }
    }

    @Override // org.telegram.ui.Components.sa
    public final vk0 v(wk0 wk0Var) {
        d6 d6Var = new d6(this, wk0Var, getContext(), this.currentAccount, new bh.c(this, 12), this.resourcesProvider);
        this.e0 = d6Var;
        return d6Var;
    }

    @Override // org.telegram.ui.Components.sa
    public final CharSequence y() {
        String str = this.T;
        return str != null ? str : LocaleController.getString(R.string.GiftCraftSelectTitle);
    }
}
