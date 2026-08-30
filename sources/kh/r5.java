package kh;

import android.app.Dialog;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import lh.t7;
import lh.y9;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.e90;
import org.telegram.ui.Components.gj0;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.ic;
import org.telegram.ui.Components.lp;
import org.telegram.ui.Components.mq;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.o70;
import org.telegram.ui.Components.p9;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.r00;
import org.telegram.ui.Components.t00;
import org.telegram.ui.Components.vt;
import org.telegram.ui.Components.w51;
import org.telegram.ui.Components.z10;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public class r5 extends org.telegram.ui.ActionBar.p2 implements xd.b {
    public LinearLayout B;
    public s4 C;
    public s4 D;
    public s4 E;
    public s4 F;
    public r00 G;
    public boolean H;
    public sg.c I;
    public ng.a J;
    public final xd.a a;
    public final long b;
    public final String c;
    public final b5 d;
    public Utilities.Callback e;
    public org.telegram.ui.ActionBar.i2 f;
    public View h;
    public k4 n;
    public FrameLayout r;
    public FrameLayout s;
    public TextView v;
    public t4 w;
    public boolean x;
    public HorizontalScrollView y;

    public r5(long j10, String str, long j11, org.telegram.ui.ActionBar.f6 f6Var) {
        super(null);
        this.a = new xd.a(0, this, nr.h, 380L, false);
        this.H = true;
        this.b = j10;
        this.c = str;
        this.resourceProvider = f6Var;
        b5 b5Var = new b5(j11, this.currentAccount, new cg.h0(this, 15));
        this.d = b5Var;
        b5Var.g(false);
    }

    public static void U(r5 r5Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j10, boolean z4) {
        if (j10 == UserConfig.getInstance(r5Var.currentAccount).getClientUserId()) {
            r5Var.d.d.remove(tL_starGiftUnique);
            r5Var.e0(false);
            if (j10 == UserConfig.getInstance(r5Var.currentAccount).getClientUserId()) {
                qc a02 = qc.a0(r5Var);
                TLRPC.Document document = tL_starGiftUnique.getDocument();
                String string = LocaleController.getString(R.string.BoughtResoldGiftTitle);
                int i10 = R.string.BoughtResoldGiftText;
                StringBuilder sb = new StringBuilder();
                sb.append(tL_starGiftUnique.title);
                sb.append(" #");
                ic O = a02.O(document, string, LocaleController.formatString(i10, a2.l(tL_starGiftUnique.num, ',', sb)));
                O.r = false;
                O.j();
            } else {
                ic O2 = qc.a0(r5Var).O(tL_starGiftUnique.getDocument(), LocaleController.getString(R.string.BoughtResoldGiftToTitle), LocaleController.formatString(R.string.BoughtResoldGiftToText, DialogObject.getShortName(r5Var.currentAccount, j10)));
                O2.r = false;
                O2.j();
            }
            r5Var.G.c(true);
            return;
        }
        Bundle bundle = new Bundle();
        if (j10 >= 0) {
            bundle.putLong("user_id", j10);
        } else {
            bundle.putLong("chat_id", -j10);
        }
        i4 i4Var = new i4(bundle, tL_starGiftUnique, j10);
        org.telegram.ui.ActionBar.e5 e5Var = r5Var.parentLayout;
        if (e5Var == null || !((ActionBarLayout) e5Var).b) {
            r5Var.presentFragment(i4Var, true, z4);
        } else {
            Dialog dialog = r5Var.parentDialog;
            if ((dialog instanceof org.telegram.ui.ActionBar.g3) && z4) {
                ((org.telegram.ui.ActionBar.g3) dialog).skipDismissAnimation();
            }
            r5Var.finishFragment();
            org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
            if (U != null) {
                U.presentFragment(i4Var, false, z4);
            }
        }
        Utilities.Callback callback = r5Var.e;
        if (callback != null) {
            callback.run(Boolean.valueOf(z4));
        }
    }

    public static void V(r5 r5Var, Context context) {
        b5 b5Var = r5Var.d;
        if (r5Var.H && !b5Var.h.isEmpty()) {
            o70 o70Var = new o70(r5Var, r5Var.F, false, false);
            o70Var.t = false;
            o70Var.Y = true;
            o70Var.a0(0.0f, AndroidUtilities.dp(-8.0f));
            o70Var.R = true;
            o70Var.p = new g3(o70Var, 1);
            String[] strArr = {""};
            ArrayList arrayList = new ArrayList(b5Var.h);
            Collections.sort(arrayList, new z3(r5Var, 0));
            n4 n4Var = new n4(r5Var, new a4(r5Var, strArr, arrayList, 0), new b4(r5Var, o70Var, 0), null);
            n4Var.V2.r = false;
            FrameLayout frameLayout = new FrameLayout(context);
            ImageView imageView = new ImageView(context);
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            imageView.setImageResource(R.drawable.smiles_inputsearch);
            imageView.setColorFilter(new PorterDuffColorFilter(r5Var.getThemedColor(j6.F8), PorterDuff.Mode.SRC_IN));
            frameLayout.addView(imageView, k7.b6.d(24, 24.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
            vt vtVar = new vt(context, r5Var.resourceProvider);
            vtVar.setTextSize(1, 16.0f);
            vtVar.setInputType(573441);
            vtVar.setRawInputType(573441);
            vtVar.setHintTextColor(j6.v0(j6.A6, r5Var.resourceProvider));
            vtVar.setCursorColor(j6.v0(j6.G6, r5Var.resourceProvider));
            vtVar.setCursorSize(AndroidUtilities.dp(19.0f));
            vtVar.setCursorWidth(1.5f);
            vtVar.setHint(LocaleController.getString(R.string.Gift2ResaleFiltersSearch));
            vtVar.setTextColor(j6.v0(j6.E8, r5Var.resourceProvider));
            vtVar.setBackground(null);
            frameLayout.addView(vtVar, k7.b6.d(-1, -2.0f, 19, 43.0f, 0.0f, 8.0f, 0.0f));
            vtVar.addTextChangedListener(new cg.b0(1, strArr, n4Var));
            if (arrayList.size() > 8) {
                o70Var.r(frameLayout, k7.b6.n(-1, 44));
                o70Var.k();
            }
            if (!b5Var.l.isEmpty()) {
                o70Var.c(R.drawable.msg_select, LocaleController.getString(R.string.SelectAll), new c4(r5Var, 0), false);
            }
            o70Var.q(n4Var);
            o70Var.Z();
        }
    }

    public static void W(r5 r5Var, Context context) {
        b5 b5Var = r5Var.d;
        if (r5Var.H && !b5Var.f.isEmpty()) {
            o70 o70Var = new o70(r5Var, r5Var.D, false, false);
            o70Var.t = false;
            o70Var.Y = true;
            o70Var.a0(0.0f, AndroidUtilities.dp(-8.0f));
            o70Var.R = true;
            o70Var.p = new g3(o70Var, 3);
            String[] strArr = {""};
            ArrayList arrayList = new ArrayList(b5Var.f);
            Collections.sort(arrayList, new z3(r5Var, 2));
            l4 l4Var = new l4(r5Var, new a4(r5Var, strArr, arrayList, 2), new b4(r5Var, o70Var, 2), null);
            l4Var.V2.r = false;
            FrameLayout frameLayout = new FrameLayout(context);
            ImageView imageView = new ImageView(context);
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            imageView.setImageResource(R.drawable.smiles_inputsearch);
            imageView.setColorFilter(new PorterDuffColorFilter(r5Var.getThemedColor(j6.F8), PorterDuff.Mode.SRC_IN));
            frameLayout.addView(imageView, k7.b6.d(24, 24.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
            vt vtVar = new vt(context, r5Var.resourceProvider);
            vtVar.setTextSize(1, 16.0f);
            vtVar.setInputType(573441);
            vtVar.setRawInputType(573441);
            vtVar.setHintTextColor(j6.v0(j6.A6, r5Var.resourceProvider));
            vtVar.setCursorColor(j6.v0(j6.G6, r5Var.resourceProvider));
            vtVar.setCursorSize(AndroidUtilities.dp(19.0f));
            vtVar.setCursorWidth(1.5f);
            vtVar.setHint(LocaleController.getString(R.string.Gift2ResaleFiltersSearch));
            vtVar.setTextColor(j6.v0(j6.E8, r5Var.resourceProvider));
            vtVar.setBackground(null);
            frameLayout.addView(vtVar, k7.b6.d(-1, -2.0f, 19, 43.0f, 0.0f, 8.0f, 0.0f));
            vtVar.addTextChangedListener(new cg.b0(2, strArr, l4Var));
            if (arrayList.size() > 8) {
                o70Var.r(frameLayout, k7.b6.n(-1, 44));
                o70Var.k();
            }
            if (!b5Var.j.isEmpty()) {
                o70Var.c(R.drawable.msg_select, LocaleController.getString(R.string.SelectAll), new c4(r5Var, 2), false);
            }
            o70Var.q(l4Var);
            o70Var.Z();
        }
    }

    public static void X(r5 r5Var, Context context) {
        b5 b5Var = r5Var.d;
        if (r5Var.H && !b5Var.g.isEmpty()) {
            o70 o70Var = new o70(r5Var, r5Var.E, false, false);
            o70Var.t = false;
            o70Var.Y = true;
            o70Var.a0(0.0f, AndroidUtilities.dp(-8.0f));
            o70Var.R = true;
            o70Var.p = new g3(o70Var, 2);
            String[] strArr = {""};
            ArrayList arrayList = new ArrayList(b5Var.g);
            Collections.sort(arrayList, new z3(r5Var, 1));
            m4 m4Var = new m4(r5Var, new a4(r5Var, strArr, arrayList, 1), new b4(r5Var, o70Var, 1), null);
            m4Var.V2.r = false;
            FrameLayout frameLayout = new FrameLayout(context);
            ImageView imageView = new ImageView(context);
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            imageView.setImageResource(R.drawable.smiles_inputsearch);
            imageView.setColorFilter(new PorterDuffColorFilter(r5Var.getThemedColor(j6.F8), PorterDuff.Mode.SRC_IN));
            frameLayout.addView(imageView, k7.b6.d(24, 24.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
            vt vtVar = new vt(context, r5Var.resourceProvider);
            vtVar.setTextSize(1, 16.0f);
            vtVar.setInputType(573441);
            vtVar.setRawInputType(573441);
            vtVar.setHintTextColor(j6.v0(j6.A6, r5Var.resourceProvider));
            vtVar.setCursorColor(j6.v0(j6.G6, r5Var.resourceProvider));
            vtVar.setCursorSize(AndroidUtilities.dp(19.0f));
            vtVar.setCursorWidth(1.5f);
            vtVar.setHint(LocaleController.getString(R.string.Gift2ResaleFiltersSearch));
            vtVar.setTextColor(j6.v0(j6.E8, r5Var.resourceProvider));
            vtVar.setBackground(null);
            frameLayout.addView(vtVar, k7.b6.d(-1, -2.0f, 19, 43.0f, 0.0f, 8.0f, 0.0f));
            vtVar.addTextChangedListener(new cg.b0(3, strArr, m4Var));
            if (arrayList.size() > 8) {
                o70Var.r(frameLayout, k7.b6.n(-1, 44));
                o70Var.k();
            }
            if (!b5Var.k.isEmpty()) {
                o70Var.c(R.drawable.msg_select, LocaleController.getString(R.string.SelectAll), new c4(r5Var, 1), false);
            }
            o70Var.q(m4Var);
            o70Var.Z();
        }
    }

    public static void Y(r5 r5Var, i51 i51Var) {
        Object obj = i51Var.G;
        if (obj instanceof TL_stars.TL_starGiftUnique) {
            TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) obj;
            lh.g5 g5Var = new lh.g5(r5Var.getParentActivity(), r5Var.currentAccount, r5Var.b, r5Var.resourceProvider, null);
            g5Var.h2(tL_starGiftUnique.slug, tL_starGiftUnique, r5Var.d);
            g5Var.L0 = new e4(r5Var);
            r5Var.showDialog(g5Var);
        }
    }

    @Override // xd.b
    public final void L(int i10, float f10, float f11, xd.c cVar) {
        if (i10 == 0) {
            this.s.setTranslationY((-AndroidUtilities.dp(52.0f)) * f10);
            z10.d(this.r, f10);
        }
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final View createView(final Context context) {
        sg.c cVar = new sg.c();
        this.I = cVar;
        int i10 = j6.d6;
        cVar.a(getThemedColor(i10));
        this.J = new ng.a(this.I);
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        org.telegram.ui.ActionBar.i2 i2Var = new org.telegram.ui.ActionBar.i2(false);
        this.f = i2Var;
        kVar.setBackButtonDrawable(i2Var);
        this.f.k = 240.0f;
        this.actionBar.setCastShadows(false);
        this.actionBar.setAddToContainer(false);
        this.actionBar.setActionBarMenuOnItemClick(new eg.m1(this, 1));
        this.actionBar.setTitle(this.c);
        this.actionBar.setBackgroundColor(getThemedColor(i10));
        org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
        int i11 = j6.G6;
        kVar2.C(getThemedColor(i11), false);
        this.actionBar.C(getThemedColor(i11), true);
        this.actionBar.B(getThemedColor(j6.z8), false);
        this.actionBar.setTitleColor(getThemedColor(i11));
        this.actionBar.setSubtitleColor(getThemedColor(j6.z6));
        j4 j4Var = new j4(this, context, 0);
        int v = j6.v(j6.v0(i10, this.resourceProvider), j6.l1(0.04f, j6.v0(i11, this.resourceProvider)));
        j4Var.setBackgroundColor(v);
        this.fragmentView = j4Var;
        y9 y9Var = new y9(context, this.currentAccount, this.resourceProvider);
        y9Var.d = true;
        k7.d6.a(y9Var);
        y9Var.setOnClickListener(new cg.n(14, this, y9Var));
        this.actionBar.addView(y9Var, k7.b6.d(-2, -2.0f, 85, 0.0f, 0.0f, 4.0f, 0.0f));
        k4 k4Var = new k4(this, new dg.r1(this, 12), new e4(this), new e4(this));
        this.n = k4Var;
        k4Var.V2.r = false;
        k4Var.setSpanCount(3);
        this.n.j(new eg.f2(this, 4));
        this.n.setPadding(0, AndroidUtilities.dp(45.0f), 0, AndroidUtilities.dp(101.0f));
        this.n.setClipToPadding(false);
        j4Var.addView(this.n, k7.b6.d(-1, -1.0f, 119, 7.33f, 0.0f, 7.33f, -45.0f));
        j4Var.addView(this.actionBar);
        final int i12 = 0;
        View.OnClickListener onClickListener = new View.OnClickListener(this) { // from class: kh.f4
            public final /* synthetic */ r5 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i12) {
                    case 0:
                        b5 b5Var = this.b.d;
                        b5Var.k.clear();
                        b5Var.j.clear();
                        b5Var.l.clear();
                        b5Var.h();
                        break;
                    default:
                        b5 b5Var2 = this.b.d;
                        b5Var2.k.clear();
                        b5Var2.j.clear();
                        b5Var2.l.clear();
                        b5Var2.h();
                        break;
                }
            }
        };
        org.telegram.ui.ActionBar.f6 f6Var = this.resourceProvider;
        t4 t4Var = new t4(context);
        LinearLayout f10 = org.telegram.messenger.y3.f(context, 1);
        t4Var.addView(f10, k7.b6.e(-1, -2, 23));
        p9 p9Var = new p9(context);
        p9Var.setImageDrawable(new gj0(R.raw.utyan_empty, AndroidUtilities.dp(130.0f), "utyan_empty", AndroidUtilities.dp(130.0f)));
        f10.addView(p9Var, k7.b6.q(130, 130, 17));
        TextView textView = new TextView(context);
        org.telegram.ui.b.l(j6.G6, f6Var, textView, 1, 17.0f);
        textView.setGravity(17);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setText(LocaleController.getString(R.string.Gift2ResaleFiltersEmptyTitle));
        f10.addView(textView, k7.b6.t(-2, -2, 17, 32, 12, 32, 9));
        e90 e90Var = new e90(context, null);
        e90Var.setTextColor(j6.v0(j6.A6, f6Var));
        e90Var.setTextSize(1, 14.0f);
        e90Var.setGravity(17);
        e90Var.setText(LocaleController.getString(R.string.Gift2ResaleFiltersEmptySubtitle));
        e90Var.setMaxWidth(AndroidUtilities.dp(200.0f));
        f10.addView(e90Var, k7.b6.t(-2, -2, 17, 32, 0, 32, 12));
        TextView textView2 = new TextView(context);
        int i13 = j6.Oh;
        textView2.setTextColor(j6.v0(i13, f6Var));
        textView2.setBackground(j6.Y(j6.l1(0.1f, j6.v0(i13, f6Var)), 6, 6));
        textView2.setGravity(17);
        textView2.setPadding(org.telegram.ui.b.e(13.0f, R.string.Gift2ResaleFiltersEmptyClear, textView2), 0, AndroidUtilities.dp(13.0f), 0);
        k7.d6.a(textView2);
        f10.addView(textView2, k7.b6.t(-2, 27, 17, 32, 0, 32, 12));
        textView2.setOnClickListener(onClickListener);
        this.w = t4Var;
        this.x = false;
        t4Var.setAlpha(0.0f);
        this.w.setScaleX(0.95f);
        this.w.setScaleY(0.95f);
        this.w.setVisibility(8);
        j4Var.addView(this.w, k7.b6.d(-1, -1.0f, 119, 0.0f, 0.0f, 0.0f, -45.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.B = linearLayout;
        linearLayout.setPadding(AndroidUtilities.dp(11.0f), 0, AndroidUtilities.dp(11.0f), 0);
        this.B.setOrientation(0);
        HorizontalScrollView horizontalScrollView = new HorizontalScrollView(context);
        this.y = horizontalScrollView;
        horizontalScrollView.setHorizontalScrollBarEnabled(false);
        this.y.addView(this.B);
        this.y.setBackgroundColor(v);
        this.y.setClipChildren(false);
        j4Var.addView(this.y, k7.b6.e(-1, 47, 55));
        View view = new View(context);
        this.h = view;
        view.setBackgroundColor(getThemedColor(j6.d7));
        this.h.setAlpha(0.0f);
        j4Var.addView(this.h, k7.b6.a(-1.0f, 2.0f / AndroidUtilities.density, 55));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(15.0f), 0);
        linearLayout2.setOrientation(0);
        final lp lpVar = new lp(context, 24, this.resourceProvider);
        lpVar.b(j6.h7, j6.j7, j6.k7);
        lpVar.setDrawUnchecked(true);
        lpVar.a(false, false);
        lpVar.setDrawBackgroundAsArc(10);
        lpVar.setTranslationX(AndroidUtilities.dp(4.0f));
        lpVar.setScaleX(0.8f);
        lpVar.setScaleY(0.8f);
        linearLayout2.addView(lpVar, k7.b6.q(26, 26, 16));
        TextView textView3 = new TextView(context);
        org.telegram.ui.b.l(j6.j5, this.resourceProvider, textView3, 1, 14.0f);
        textView3.setText(LocaleController.getString(R.string.GiftResaleStarsOnly));
        linearLayout2.addView(textView3, k7.b6.t(-2, -2, 16, 9, 0, 0, 0));
        int dp = AndroidUtilities.dp(18.0f);
        int themedColor = getThemedColor(i10);
        int i14 = j6.Oh;
        int v10 = j6.v(themedColor, j6.l1(0.1f, getThemedColor(i14)));
        linearLayout2.setBackground(j6.i0(dp, dp, dp, dp, 0, v10, v10));
        FrameLayout frameLayout = new FrameLayout(context);
        this.s = frameLayout;
        frameLayout.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        View view2 = this.s;
        pg.b c3 = this.J.c(view2, null, false);
        c3.n(rg.b.k(this.resourceProvider));
        c3.o(AndroidUtilities.dp(8.0f));
        c3.p(AndroidUtilities.dp(18.0f));
        view2.setBackground(c3);
        final int i15 = 0;
        this.s.setOnClickListener(new View.OnClickListener(this) { // from class: kh.g4
            public final /* synthetic */ r5 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                switch (i15) {
                    case 0:
                        b5 b5Var = this.b.d;
                        if (b5Var != null) {
                            boolean z4 = !b5Var.r;
                            b5Var.r = z4;
                            lpVar.a(z4, true);
                            b5Var.h();
                            break;
                        }
                        break;
                    default:
                        final r5 r5Var = this.b;
                        b5 b5Var2 = r5Var.d;
                        if (r5Var.H) {
                            o70 H = o70.H(r5Var, r5Var.C);
                            H.c(R.drawable.menu_sort_value, LocaleController.getString(a5.b.a), new c4(r5Var, 3), false);
                            H.c(R.drawable.menu_sort_date, LocaleController.getString(a5.c.a), new c4(r5Var, 4), false);
                            H.c(R.drawable.menu_sort_number, LocaleController.getString(a5.d.a), new c4(r5Var, 5), false);
                            H.k();
                            boolean z10 = !b5Var2.r;
                            String string = LocaleController.getString(R.string.GiftResaleFilterAllListings);
                            final int i16 = 0;
                            final lp lpVar2 = lpVar;
                            H.i(new Runnable() { // from class: kh.d4
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i16) {
                                        case 0:
                                            b5 b5Var3 = r5Var.d;
                                            if (b5Var3.r) {
                                                b5Var3.r = false;
                                                lpVar2.a(false, true);
                                                b5Var3.h();
                                                break;
                                            }
                                            break;
                                        default:
                                            b5 b5Var4 = r5Var.d;
                                            if (!b5Var4.r) {
                                                b5Var4.r = true;
                                                lpVar2.a(true, true);
                                                b5Var4.h();
                                                break;
                                            }
                                            break;
                                    }
                                }
                            }, string, z10);
                            final int i17 = 1;
                            H.i(new Runnable() { // from class: kh.d4
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i17) {
                                        case 0:
                                            b5 b5Var3 = r5Var.d;
                                            if (b5Var3.r) {
                                                b5Var3.r = false;
                                                lpVar2.a(false, true);
                                                b5Var3.h();
                                                break;
                                            }
                                            break;
                                        default:
                                            b5 b5Var4 = r5Var.d;
                                            if (!b5Var4.r) {
                                                b5Var4.r = true;
                                                lpVar2.a(true, true);
                                                b5Var4.h();
                                                break;
                                            }
                                            break;
                                    }
                                }
                            }, LocaleController.getString(R.string.GiftResaleFilterForStarsOnly), b5Var2.r);
                            H.t = false;
                            H.Y = true;
                            H.a0(0.0f, AndroidUtilities.dp(-8.0f));
                            H.Z();
                            break;
                        }
                        break;
                }
            }
        });
        this.s.addView(linearLayout2, k7.b6.c(-1.0f, -2));
        k7.d6.b(this.s, 0.04f, 1.5f);
        j4Var.addView(this.s, k7.b6.d(-2, 52.0f, 81, 0.0f, 0.0f, 0.0f, AndroidUtilities.navigationBarHeight / AndroidUtilities.density));
        t7 y10 = t7.y(this.currentAccount, true);
        if (y10.e && !y10.s().k()) {
            this.s.setVisibility(8);
        }
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.r = frameLayout2;
        frameLayout2.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        View view3 = this.r;
        pg.b c10 = this.J.c(view3, null, false);
        c10.n(rg.b.k(this.resourceProvider));
        c10.o(AndroidUtilities.dp(8.0f));
        c10.p(AndroidUtilities.dp(22.0f));
        view3.setBackground(c10);
        j4Var.addView(this.r, k7.b6.d(-2, 60.0f, 81, 0.0f, 0.0f, 0.0f, AndroidUtilities.navigationBarHeight / AndroidUtilities.density));
        this.v = new TextView(context);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x");
        spannableStringBuilder.setSpan(new mq(R.drawable.msg_clearcache, 0), 0, 1, 33);
        spannableStringBuilder.append((CharSequence) " ").append((CharSequence) LocaleController.getString(R.string.Gift2ResaleFiltersClear));
        this.v.setText(spannableStringBuilder);
        this.v.setTextColor(getThemedColor(i14));
        this.v.setTypeface(AndroidUtilities.bold());
        this.v.setPadding(AndroidUtilities.dp(20.0f), 0, AndroidUtilities.dp(20.0f), 0);
        TextView textView4 = this.v;
        int dp2 = AndroidUtilities.dp(22.0f);
        int v11 = j6.v(getThemedColor(i10), j6.l1(0.1f, getThemedColor(i14)));
        textView4.setBackground(j6.i0(dp2, dp2, dp2, dp2, 0, v11, v11));
        this.v.setGravity(17);
        final int i16 = 1;
        this.r.setOnClickListener(new View.OnClickListener(this) { // from class: kh.f4
            public final /* synthetic */ r5 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view4) {
                switch (i16) {
                    case 0:
                        b5 b5Var = this.b.d;
                        b5Var.k.clear();
                        b5Var.j.clear();
                        b5Var.l.clear();
                        b5Var.h();
                        break;
                    default:
                        b5 b5Var2 = this.b.d;
                        b5Var2.k.clear();
                        b5Var2.j.clear();
                        b5Var2.l.clear();
                        b5Var2.h();
                        break;
                }
            }
        });
        this.r.addView(this.v, k7.b6.c(-1.0f, -2));
        this.r.setVisibility(8);
        k7.d6.b(this.r, 0.05f, 1.5f);
        s4 s4Var = new s4(context, this.resourceProvider);
        this.C = s4Var;
        s4Var.setSorting(this.d.p);
        this.B.addView(this.C, k7.b6.t(-2, -2, 16, 0, 0, 6, 0));
        final int i17 = 1;
        this.C.setOnClickListener(new View.OnClickListener(this) { // from class: kh.g4
            public final /* synthetic */ r5 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view32) {
                switch (i17) {
                    case 0:
                        b5 b5Var = this.b.d;
                        if (b5Var != null) {
                            boolean z4 = !b5Var.r;
                            b5Var.r = z4;
                            lpVar.a(z4, true);
                            b5Var.h();
                            break;
                        }
                        break;
                    default:
                        final r5 r5Var = this.b;
                        b5 b5Var2 = r5Var.d;
                        if (r5Var.H) {
                            o70 H = o70.H(r5Var, r5Var.C);
                            H.c(R.drawable.menu_sort_value, LocaleController.getString(a5.b.a), new c4(r5Var, 3), false);
                            H.c(R.drawable.menu_sort_date, LocaleController.getString(a5.c.a), new c4(r5Var, 4), false);
                            H.c(R.drawable.menu_sort_number, LocaleController.getString(a5.d.a), new c4(r5Var, 5), false);
                            H.k();
                            boolean z10 = !b5Var2.r;
                            String string = LocaleController.getString(R.string.GiftResaleFilterAllListings);
                            final int i162 = 0;
                            final lp lpVar2 = lpVar;
                            H.i(new Runnable() { // from class: kh.d4
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i162) {
                                        case 0:
                                            b5 b5Var3 = r5Var.d;
                                            if (b5Var3.r) {
                                                b5Var3.r = false;
                                                lpVar2.a(false, true);
                                                b5Var3.h();
                                                break;
                                            }
                                            break;
                                        default:
                                            b5 b5Var4 = r5Var.d;
                                            if (!b5Var4.r) {
                                                b5Var4.r = true;
                                                lpVar2.a(true, true);
                                                b5Var4.h();
                                                break;
                                            }
                                            break;
                                    }
                                }
                            }, string, z10);
                            final int i172 = 1;
                            H.i(new Runnable() { // from class: kh.d4
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i172) {
                                        case 0:
                                            b5 b5Var3 = r5Var.d;
                                            if (b5Var3.r) {
                                                b5Var3.r = false;
                                                lpVar2.a(false, true);
                                                b5Var3.h();
                                                break;
                                            }
                                            break;
                                        default:
                                            b5 b5Var4 = r5Var.d;
                                            if (!b5Var4.r) {
                                                b5Var4.r = true;
                                                lpVar2.a(true, true);
                                                b5Var4.h();
                                                break;
                                            }
                                            break;
                                    }
                                }
                            }, LocaleController.getString(R.string.GiftResaleFilterForStarsOnly), b5Var2.r);
                            H.t = false;
                            H.Y = true;
                            H.a0(0.0f, AndroidUtilities.dp(-8.0f));
                            H.Z();
                            break;
                        }
                        break;
                }
            }
        });
        s4 s4Var2 = new s4(context, this.resourceProvider);
        this.D = s4Var2;
        s4Var2.setValue(LocaleController.getString(R.string.Gift2AttributeModel));
        this.B.addView(this.D, k7.b6.t(-2, -2, 16, 0, 0, 6, 0));
        final int i18 = 0;
        this.D.setOnClickListener(new View.OnClickListener(this) { // from class: kh.y3
            public final /* synthetic */ r5 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view4) {
                switch (i18) {
                    case 0:
                        r5.W(this.b, context);
                        break;
                    case 1:
                        r5.X(this.b, context);
                        break;
                    default:
                        r5.V(this.b, context);
                        break;
                }
            }
        });
        s4 s4Var3 = new s4(context, this.resourceProvider);
        this.E = s4Var3;
        s4Var3.setValue(LocaleController.getString(R.string.Gift2AttributeBackdrop));
        this.B.addView(this.E, k7.b6.t(-2, -2, 16, 0, 0, 6, 0));
        final int i19 = 1;
        this.E.setOnClickListener(new View.OnClickListener(this) { // from class: kh.y3
            public final /* synthetic */ r5 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view4) {
                switch (i19) {
                    case 0:
                        r5.W(this.b, context);
                        break;
                    case 1:
                        r5.X(this.b, context);
                        break;
                    default:
                        r5.V(this.b, context);
                        break;
                }
            }
        });
        s4 s4Var4 = new s4(context, this.resourceProvider);
        this.F = s4Var4;
        s4Var4.setValue(LocaleController.getString(R.string.Gift2AttributeSymbol));
        this.B.addView(this.F, k7.b6.t(-2, -2, 16, 0, 0, 0, 0));
        final int i20 = 2;
        this.F.setOnClickListener(new View.OnClickListener(this) { // from class: kh.y3
            public final /* synthetic */ r5 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view4) {
                switch (i20) {
                    case 0:
                        r5.W(this.b, context);
                        break;
                    case 1:
                        r5.X(this.b, context);
                        break;
                    default:
                        r5.V(this.b, context);
                        break;
                }
            }
        });
        r00 r00Var = new r00(getParentActivity());
        this.G = r00Var;
        j4Var.addView(r00Var, k7.b6.c(-1.0f, -1));
        d0(false, false);
        return j4Var;
    }

    public final void d0(boolean z4, boolean z10) {
        if (this.H == z4) {
            return;
        }
        this.H = z4;
        if (!z10) {
            this.y.setVisibility(z4 ? 0 : 8);
            this.y.setTranslationY(z4 ? 0.0f : -AndroidUtilities.dp(45.0f));
            this.y.setAlpha(z4 ? 1.0f : 0.0f);
            this.h.setTranslationY(z4 ? 0.0f : -AndroidUtilities.dp(45.0f));
            this.n.setTranslationY(z4 ? 0.0f : -AndroidUtilities.dp(39.0f));
            return;
        }
        this.y.setVisibility(0);
        ViewPropertyAnimator alpha = this.y.animate().translationY(z4 ? 0.0f : -AndroidUtilities.dp(45.0f)).alpha(z4 ? 1.0f : 0.0f);
        nr nrVar = nr.h;
        alpha.setInterpolator(nrVar).setDuration(420L).setListener(new h4(this, z4, 0)).start();
        this.h.animate().translationY(z4 ? 0.0f : -AndroidUtilities.dp(45.0f)).setInterpolator(nrVar).setDuration(420L).start();
        this.n.animate().translationY(z4 ? 0.0f : -AndroidUtilities.dp(39.0f)).setInterpolator(nrVar).setDuration(420L).start();
    }

    public final void e0(boolean z4) {
        w51 w51Var;
        b5 b5Var = this.d;
        int i10 = b5Var.e;
        HashSet hashSet = b5Var.l;
        ArrayList arrayList = b5Var.h;
        HashSet hashSet2 = b5Var.k;
        ArrayList arrayList2 = b5Var.g;
        HashSet hashSet3 = b5Var.j;
        ArrayList arrayList3 = b5Var.f;
        if (i10 > 12) {
            d0(true, true);
        }
        k4 k4Var = this.n;
        boolean z10 = false;
        if (k4Var != null && (w51Var = k4Var.V2) != null) {
            w51Var.N(true);
            if (z4) {
                this.n.u0(0);
            }
        }
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        if (kVar != null) {
            kVar.setTitle(this.c);
            org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
            int i11 = b5Var.e;
            kVar2.setSubtitle(i11 <= 0 ? LocaleController.getString(R.string.Gift2ResaleNoCount) : LocaleController.formatPluralStringComma("Gift2ListingsCount", i11));
        }
        s4 s4Var = this.C;
        if (s4Var != null) {
            s4Var.setSorting(b5Var.p);
        }
        if (this.D != null) {
            int size = arrayList3.size() - hashSet3.size();
            this.D.setValue((size <= 0 || size == arrayList3.size()) ? LocaleController.getString(R.string.Gift2ResaleFilterModel) : LocaleController.formatPluralStringComma("Gift2ResaleFilterModels", size));
        }
        if (this.E != null) {
            int size2 = arrayList2.size() - hashSet2.size();
            this.E.setValue((size2 <= 0 || size2 == arrayList2.size()) ? LocaleController.getString(R.string.Gift2ResaleFilterBackdrop) : LocaleController.formatPluralStringComma("Gift2ResaleFilterBackdrops", size2));
        }
        if (this.F != null) {
            int size3 = arrayList.size() - hashSet.size();
            this.F.setValue((size3 <= 0 || size3 == arrayList.size()) ? LocaleController.getString(R.string.Gift2ResaleFilterSymbol) : LocaleController.formatPluralStringComma("Gift2ResaleFilterSymbols", size3));
        }
        int i12 = 0;
        while (true) {
            if (i12 >= this.n.getChildCount()) {
                break;
            }
            if (this.n.getChildAt(i12) instanceof t00) {
                b5Var.g(false);
                break;
            }
            i12++;
        }
        if ((b5Var.t || b5Var.e > 0) && (!hashSet3.isEmpty() || !hashSet2.isEmpty() || !hashSet.isEmpty())) {
            z10 = true;
        }
        this.a.a(z10, true);
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final boolean isLightStatusBar() {
        if (getLastStoryViewer() == null || getLastStoryViewer().E0) {
            int w02 = j6.w0(null, j6.d6, false);
            if (this.actionBar.s()) {
                w02 = j6.w0(null, j6.w8, false);
            }
            if (i0.a.f(w02) > 0.699999988079071d) {
                return true;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // xd.b
    public final /* synthetic */ void z(float f10, int i10) {
    }
}
