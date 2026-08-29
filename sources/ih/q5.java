package ih;

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
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import jh.k7;
import jh.s7;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.il0;
import org.telegram.ui.Components.j70;
import org.telegram.ui.Components.jl0;
import org.telegram.ui.Components.jr;
import org.telegram.ui.Components.p00;
import org.telegram.ui.Components.st;
import org.telegram.ui.Components.w41;
import org.telegram.ui.Components.xa;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class q5 extends xa {
    public static final /* synthetic */ int g0 = 0;
    public final String T;
    public final p5 U;
    public final HorizontalScrollView V;
    public final s4 W;
    public final s4 X;
    public final s4 Y;
    public final s4 Z;
    public final jh.r3 a0;
    public jh.n1 b0;
    public final HashSet c0;
    public boolean d0;
    public o5 e0;
    public boolean f0;

    public q5(final Context context, String str, final p5 p5Var) {
        super(context, null, false, false, false, 2, null);
        this.c0 = new HashSet();
        this.G = AndroidUtilities.dp(12.0f);
        fixNavigationBar();
        this.T = str;
        this.U = p5Var;
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
        s4 s4Var = new s4(context, this.resourcesProvider);
        this.W = s4Var;
        s4Var.setSorting(p5Var.c.p);
        linearLayout.addView(s4Var, i7.f6.t(-2, -2, 16, 0, 0, 6, 0));
        s4Var.setOnClickListener(new ag.n(15, this, p5Var));
        s4 s4Var2 = new s4(context, this.resourcesProvider);
        this.X = s4Var2;
        s4Var2.setValue(LocaleController.getString(R.string.Gift2AttributeModel));
        linearLayout.addView(s4Var2, i7.f6.t(-2, -2, 16, 0, 0, 6, 0));
        final int i10 = 0;
        s4Var2.setOnClickListener(new View.OnClickListener(this) { // from class: ih.j5
            public final /* synthetic */ q5 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        q5.R(this.b, p5Var, context);
                        break;
                    case 1:
                        q5.W(this.b, p5Var, context);
                        break;
                    default:
                        q5.S(this.b, p5Var, context);
                        break;
                }
            }
        });
        s4 s4Var3 = new s4(context, this.resourcesProvider);
        this.Y = s4Var3;
        s4Var3.setValue(LocaleController.getString(R.string.Gift2AttributeBackdrop));
        linearLayout.addView(s4Var3, i7.f6.t(-2, -2, 16, 0, 0, 6, 0));
        final int i11 = 1;
        s4Var3.setOnClickListener(new View.OnClickListener(this) { // from class: ih.j5
            public final /* synthetic */ q5 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        q5.R(this.b, p5Var, context);
                        break;
                    case 1:
                        q5.W(this.b, p5Var, context);
                        break;
                    default:
                        q5.S(this.b, p5Var, context);
                        break;
                }
            }
        });
        s4 s4Var4 = new s4(context, this.resourcesProvider);
        this.Z = s4Var4;
        s4Var4.setValue(LocaleController.getString(R.string.Gift2AttributeSymbol));
        linearLayout.addView(s4Var4, i7.f6.t(-2, -2, 16, 0, 0, 0, 0));
        final int i12 = 2;
        s4Var4.setOnClickListener(new View.OnClickListener(this) { // from class: ih.j5
            public final /* synthetic */ q5 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i12) {
                    case 0:
                        q5.R(this.b, p5Var, context);
                        break;
                    case 1:
                        q5.W(this.b, p5Var, context);
                        break;
                    default:
                        q5.S(this.b, p5Var, context);
                        break;
                }
            }
        });
        getContext();
        f2.w wVar = new f2.w(3);
        wVar.O = new n5(this, 0);
        this.d.setLayoutManager(wVar);
        this.d.setOnItemClickListener(new a9.s(23, this, p5Var));
        this.d.setPadding(AndroidUtilities.dp(8.0f) + this.backgroundPaddingLeft, 0, AndroidUtilities.dp(8.0f) + this.backgroundPaddingLeft, 0);
        this.d.setOnScrollListener(new cg.g2(this, 5));
        f2.l lVar = new f2.l();
        lVar.m = false;
        lVar.C = false;
        lVar.o(jr.h);
        lVar.n(350L);
        this.d.setItemAnimator(lVar);
        this.d.setItemSelectorColorProvider(new eg.c(24));
        jh.r3 r3Var = new jh.r3(context);
        this.a0 = r3Var;
        int dp = AndroidUtilities.dp(20.0f);
        int dp2 = AndroidUtilities.dp(9.0f);
        r3Var.h = dp;
        r3Var.n = dp2;
        r3Var.setRoundRadius(AndroidUtilities.dp(22.0f));
        r3Var.setFullRect(true);
        AndroidUtilities.makeGlobalBlurBitmap(new ag.i0(r3Var, 20), 12.0f, 12, null, new ArrayList());
        r3Var.setPivotY(0.0f);
        this.container.addView(r3Var, i7.f6.e(-1, -2, 55));
        this.e0.N(false);
        p5Var.d = new f5(this, 1);
    }

    public static void P(q5 q5Var, p5 p5Var) {
        j70 F = j70.F(q5Var.container, q5Var.resourcesProvider, q5Var.W);
        F.c(R.drawable.menu_sort_value, LocaleController.getString(a5.b.a), new e5(p5Var, 3), false);
        F.c(R.drawable.menu_sort_date, LocaleController.getString(a5.c.a), new e5(p5Var, 4), false);
        F.c(R.drawable.menu_sort_number, LocaleController.getString(a5.d.a), new e5(p5Var, 5), false);
        F.t = false;
        F.Y = true;
        F.a0(0.0f, AndroidUtilities.dp(-8.0f));
        F.Z();
    }

    public static void Q(q5 q5Var, p5 p5Var, int i10) {
        TL_stars.SavedStarGift savedStarGift;
        w41 G = q5Var.e0.G(i10 - 1);
        if (G == null) {
            return;
        }
        Object obj = G.G;
        if (obj instanceof TL_stars.StarGift) {
            TL_stars.StarGift starGift = (TL_stars.StarGift) obj;
            boolean z10 = G.r;
            if (!TextUtils.isEmpty(starGift.gift_address) && q5Var.d0) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(q5Var.getContext(), 0, q5Var.resourcesProvider);
                String string = LocaleController.getString(R.string.GiftCraftCantChooseFirstTitle);
                org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
                c2Var.N = string;
                c2Var.P = LocaleController.getString(R.string.GiftCraftCantChooseFirst);
                j7.l1.C(R.string.OK, alertDialog$Builder, null);
                return;
            }
            if (z10 && (starGift instanceof TL_stars.TL_starGiftUnique)) {
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) G.G;
                org.telegram.ui.ActionBar.c2 c2Var2 = new org.telegram.ui.ActionBar.c2(q5Var.getContext(), 3, null);
                c2Var2.q(400L);
                long clientUserId = UserConfig.getInstance(q5Var.currentAccount).getClientUserId();
                kf.b bVar = tL_starGiftUnique.resale_ton_only ? kf.b.b : kf.b.a;
                s7.x(q5Var.currentAccount, bVar).H(tL_starGiftUnique, clientUserId, null, true, new h5(q5Var, c2Var2, bVar, tL_starGiftUnique, clientUserId));
                return;
            }
            if (!z10) {
                ArrayList arrayList = p5Var.b.l;
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
                if (savedStarGift != null && savedStarGift.can_craft_at > 0 && savedStarGift.can_craft_at > ConnectionsManager.getInstance(q5Var.currentAccount).getCurrentTime()) {
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(q5Var.getContext());
                    String string2 = LocaleController.getString(R.string.GiftCraftUnavailableTitle);
                    org.telegram.ui.ActionBar.c2 c2Var3 = alertDialog$Builder2.a;
                    c2Var3.N = string2;
                    c2Var3.P = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GiftCraftUnavailableTextTime, LocaleController.formatDateTime(savedStarGift.can_craft_at, true)));
                    j7.l1.C(R.string.OK, alertDialog$Builder2, null);
                    return;
                }
            }
            q5Var.b0.run(starGift);
            q5Var.dismiss();
        }
    }

    public static void R(q5 q5Var, p5 p5Var, Context context) {
        b5 b5Var = p5Var.c;
        if (b5Var.f.isEmpty()) {
            return;
        }
        j70 j70Var = new j70(q5Var.container, q5Var.resourcesProvider, q5Var.X, false, true, false);
        j70Var.t = false;
        j70Var.Y = true;
        j70Var.a0(0.0f, AndroidUtilities.dp(-8.0f));
        j70Var.R = true;
        j70Var.p = new g3(j70Var, 6);
        String[] strArr = {""};
        ArrayList arrayList = new ArrayList(b5Var.f);
        Collections.sort(arrayList, new g5(p5Var, 2));
        int i10 = 0;
        k5 k5Var = new k5(context, q5Var.currentAccount, 0, false, new c5(strArr, p5Var, arrayList, i10), new d5(p5Var, j70Var, i10), null, q5Var.resourcesProvider);
        k5Var.U2.r = false;
        FrameLayout frameLayout = new FrameLayout(context);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.smiles_inputsearch);
        imageView.setColorFilter(new PorterDuffColorFilter(q5Var.getThemedColor(g6.F8), PorterDuff.Mode.SRC_IN));
        frameLayout.addView(imageView, i7.f6.d(24, 24.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
        st stVar = new st(context, q5Var.resourcesProvider);
        stVar.setTextSize(1, 16.0f);
        stVar.setInputType(573441);
        stVar.setRawInputType(573441);
        stVar.setHintTextColor(g6.v0(g6.A6, q5Var.resourcesProvider));
        stVar.setCursorColor(g6.v0(g6.G6, q5Var.resourcesProvider));
        stVar.setCursorSize(AndroidUtilities.dp(19.0f));
        stVar.setCursorWidth(1.5f);
        stVar.setHint(LocaleController.getString(R.string.Gift2ResaleFiltersSearch));
        stVar.setTextColor(g6.v0(g6.E8, q5Var.resourcesProvider));
        stVar.setBackground(null);
        frameLayout.addView(stVar, i7.f6.d(-1, -2.0f, 19, 43.0f, 0.0f, 8.0f, 0.0f));
        stVar.addTextChangedListener(new ag.c0(4, strArr, k5Var));
        if (arrayList.size() > 8) {
            j70Var.r(frameLayout, i7.f6.n(-1, 44));
            j70Var.k();
        }
        if (!b5Var.j.isEmpty()) {
            j70Var.c(R.drawable.msg_select, LocaleController.getString(R.string.SelectAll), new e5(p5Var, 0), false);
        }
        j70Var.q(k5Var);
        j70Var.Z();
    }

    public static void S(q5 q5Var, p5 p5Var, Context context) {
        b5 b5Var = p5Var.c;
        if (b5Var.h.isEmpty()) {
            return;
        }
        j70 j70Var = new j70(q5Var.container, q5Var.resourcesProvider, q5Var.Z, false, true, false);
        j70Var.t = false;
        j70Var.Y = true;
        j70Var.a0(0.0f, AndroidUtilities.dp(-8.0f));
        j70Var.R = true;
        j70Var.p = new g3(j70Var, 5);
        String[] strArr = {""};
        ArrayList arrayList = new ArrayList(b5Var.h);
        Collections.sort(arrayList, new g5(p5Var, 1));
        int i10 = 2;
        m5 m5Var = new m5(context, q5Var.currentAccount, 0, false, new c5(strArr, p5Var, arrayList, i10), new d5(p5Var, j70Var, i10), null, q5Var.resourcesProvider);
        m5Var.U2.r = false;
        FrameLayout frameLayout = new FrameLayout(context);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.smiles_inputsearch);
        imageView.setColorFilter(new PorterDuffColorFilter(q5Var.getThemedColor(g6.F8), PorterDuff.Mode.SRC_IN));
        frameLayout.addView(imageView, i7.f6.d(24, 24.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
        st stVar = new st(context, q5Var.resourcesProvider);
        stVar.setTextSize(1, 16.0f);
        stVar.setInputType(573441);
        stVar.setRawInputType(573441);
        stVar.setHintTextColor(g6.v0(g6.A6, q5Var.resourcesProvider));
        stVar.setCursorColor(g6.v0(g6.G6, q5Var.resourcesProvider));
        stVar.setCursorSize(AndroidUtilities.dp(19.0f));
        stVar.setCursorWidth(1.5f);
        stVar.setHint(LocaleController.getString(R.string.Gift2ResaleFiltersSearch));
        stVar.setTextColor(g6.v0(g6.E8, q5Var.resourcesProvider));
        stVar.setBackground(null);
        frameLayout.addView(stVar, i7.f6.d(-1, -2.0f, 19, 43.0f, 0.0f, 8.0f, 0.0f));
        stVar.addTextChangedListener(new ag.c0(6, strArr, m5Var));
        if (arrayList.size() > 8) {
            j70Var.r(frameLayout, i7.f6.n(-1, 44));
            j70Var.k();
        }
        if (!b5Var.l.isEmpty()) {
            j70Var.c(R.drawable.msg_select, LocaleController.getString(R.string.SelectAll), new e5(p5Var, 2), false);
        }
        j70Var.q(m5Var);
        j70Var.Z();
    }

    public static void T(q5 q5Var, ArrayList arrayList) {
        p5 p5Var = q5Var.U;
        if (p5Var != null) {
            k7 k7Var = p5Var.b;
            b5 b5Var = p5Var.c;
            if (k7Var == null || b5Var == null) {
                return;
            }
            int currentTime = ConnectionsManager.getInstance(q5Var.currentAccount).getCurrentTime();
            arrayList.add(w41.s(-1, LocaleController.getString(R.string.GiftCraftSelectYour)));
            ArrayList arrayList2 = k7Var.l;
            int size = arrayList2.size();
            int i10 = 0;
            boolean z10 = true;
            int i11 = 0;
            int i12 = 0;
            while (i12 < size) {
                Object obj = arrayList2.get(i12);
                i12++;
                TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj;
                if (!q5Var.c0.contains(Long.valueOf(savedStarGift.gift.id))) {
                    boolean z11 = savedStarGift.can_craft_at <= currentTime;
                    w41 a2 = x1.a(0, savedStarGift.gift, false, true, false, false, true);
                    a2.g = z11;
                    arrayList.add(a2);
                    i11++;
                    z10 = false;
                }
            }
            if (k7Var.i || !k7Var.j) {
                int i13 = i11 % 3;
                int i14 = 6 - i13;
                for (int i15 = 0; i15 < i14; i15++) {
                    w41 o10 = w41.o((i15 - i13) + 1, 35);
                    o10.u = 1;
                    arrayList.add(o10);
                }
            } else if (z10) {
                arrayList.add(w41.g(LocaleController.getString(R.string.GiftCraftSelectYourEmpty)));
            }
            if (b5Var.e > 0 || q5Var.f0) {
                q5Var.f0 = true;
                String string = LocaleController.getString(R.string.GiftCraftSelectResale);
                w41 w41Var = new w41(42);
                w41Var.d = -2;
                w41Var.o = string;
                arrayList.add(w41Var);
                HorizontalScrollView horizontalScrollView = q5Var.V;
                if (horizontalScrollView != null) {
                    arrayList.add(w41.j(-3, horizontalScrollView));
                }
                ArrayList arrayList3 = b5Var.d;
                int size2 = arrayList3.size();
                while (i10 < size2) {
                    Object obj2 = arrayList3.get(i10);
                    i10++;
                    arrayList.add(x1.a(0, (TL_stars.TL_starGiftUnique) obj2, false, true, false, true, true));
                }
                if (b5Var.t || !b5Var.u) {
                    w41 o11 = w41.o(10, 35);
                    o11.u = 1;
                    arrayList.add(o11);
                    w41 o12 = w41.o(11, 35);
                    o12.u = 1;
                    arrayList.add(o12);
                    w41 o13 = w41.o(12, 35);
                    o13.u = 1;
                    arrayList.add(o13);
                    w41 o14 = w41.o(13, 35);
                    o14.u = 1;
                    arrayList.add(o14);
                    w41 o15 = w41.o(14, 35);
                    o15.u = 1;
                    arrayList.add(o15);
                    w41 o16 = w41.o(15, 35);
                    o16.u = 1;
                    arrayList.add(o16);
                }
            }
        }
    }

    public static /* synthetic */ void U(q5 q5Var, org.telegram.ui.ActionBar.c2 c2Var, kf.b bVar, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j10, TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift) {
        c2Var.dismiss();
        if (tL_payments_paymentFormStarGift == null) {
            return;
        }
        jh.j4 j4Var = new jh.j4(bVar, tL_payments_paymentFormStarGift);
        Context context = q5Var.getContext();
        org.telegram.ui.ActionBar.c6 c6Var = q5Var.resourcesProvider;
        int i10 = q5Var.currentAccount;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(tL_starGiftUnique.title);
        sb2.append(" #");
        new jh.l4(context, c6Var, tL_starGiftUnique, j4Var, i10, j10, j7.l1.m(tL_starGiftUnique.num, ',', sb2), true, new i5(q5Var, tL_starGiftUnique, j10, 0)).b();
    }

    public static void V(q5 q5Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j10, jh.j4 j4Var, ye.c cVar) {
        cVar.d();
        s7.x(q5Var.currentAccount, j4Var.a).h(j4Var.b, tL_starGiftUnique, j10, null, true, new b0(q5Var, cVar, tL_starGiftUnique, 1));
    }

    public static void W(q5 q5Var, p5 p5Var, Context context) {
        b5 b5Var = p5Var.c;
        if (b5Var.g.isEmpty()) {
            return;
        }
        j70 j70Var = new j70(q5Var.container, q5Var.resourcesProvider, q5Var.Y, false, true, false);
        j70Var.t = false;
        j70Var.Y = true;
        j70Var.a0(0.0f, AndroidUtilities.dp(-8.0f));
        j70Var.R = true;
        j70Var.p = new g3(j70Var, 4);
        String[] strArr = {""};
        ArrayList arrayList = new ArrayList(b5Var.g);
        Collections.sort(arrayList, new g5(p5Var, 0));
        int i10 = 1;
        l5 l5Var = new l5(context, q5Var.currentAccount, 0, false, new c5(strArr, p5Var, arrayList, i10), new d5(p5Var, j70Var, i10), null, q5Var.resourcesProvider);
        l5Var.U2.r = false;
        FrameLayout frameLayout = new FrameLayout(context);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.smiles_inputsearch);
        imageView.setColorFilter(new PorterDuffColorFilter(q5Var.getThemedColor(g6.F8), PorterDuff.Mode.SRC_IN));
        frameLayout.addView(imageView, i7.f6.d(24, 24.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
        st stVar = new st(context, q5Var.resourcesProvider);
        stVar.setTextSize(1, 16.0f);
        stVar.setInputType(573441);
        stVar.setRawInputType(573441);
        stVar.setHintTextColor(g6.v0(g6.A6, q5Var.resourcesProvider));
        stVar.setCursorColor(g6.v0(g6.G6, q5Var.resourcesProvider));
        stVar.setCursorSize(AndroidUtilities.dp(19.0f));
        stVar.setCursorWidth(1.5f);
        stVar.setHint(LocaleController.getString(R.string.Gift2ResaleFiltersSearch));
        stVar.setTextColor(g6.v0(g6.E8, q5Var.resourcesProvider));
        stVar.setBackground(null);
        frameLayout.addView(stVar, i7.f6.d(-1, -2.0f, 19, 43.0f, 0.0f, 8.0f, 0.0f));
        stVar.addTextChangedListener(new ag.c0(5, strArr, l5Var));
        if (arrayList.size() > 8) {
            j70Var.r(frameLayout, i7.f6.n(-1, 44));
            j70Var.k();
        }
        if (!b5Var.k.isEmpty()) {
            j70Var.c(R.drawable.msg_select, LocaleController.getString(R.string.SelectAll), new e5(p5Var, 1), false);
        }
        j70Var.q(l5Var);
        j70Var.Z();
    }

    @Override // org.telegram.ui.Components.xa
    public final void E(float f9) {
        float y8 = this.containerView.getY() + f9;
        jh.r3 r3Var = this.a0;
        float measuredHeight = y8 - r3Var.getMeasuredHeight();
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
        w41 G;
        int i10 = 0;
        boolean z10 = false;
        boolean z11 = false;
        while (true) {
            jl0 jl0Var = this.d;
            if (i10 >= jl0Var.getChildCount()) {
                break;
            }
            View childAt = jl0Var.getChildAt(i10);
            if ((childAt instanceof p00) && (R = RecyclerView.R(childAt) - 1) >= 0 && (G = this.e0.G(R)) != null) {
                if (G.d < 10) {
                    z10 = true;
                } else {
                    z11 = true;
                }
            }
            i10++;
        }
        p5 p5Var = this.U;
        if (z10) {
            p5Var.b.a();
        }
        if (z11) {
            p5Var.c.g(false);
        }
    }

    @Override // org.telegram.ui.Components.xa
    public final il0 v(jl0 jl0Var) {
        o5 o5Var = new o5(this, jl0Var, getContext(), this.currentAccount, new bg.t1(this, 13), this.resourcesProvider);
        this.e0 = o5Var;
        return o5Var;
    }

    @Override // org.telegram.ui.Components.xa
    public final CharSequence y() {
        String str = this.T;
        return str != null ? str : LocaleController.getString(R.string.GiftCraftSelectTitle);
    }
}
