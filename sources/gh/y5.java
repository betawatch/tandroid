package gh;

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
import hh.da;
import hh.u7;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.rl;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.Cells.pa;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.b70;
import org.telegram.ui.Components.bp;
import org.telegram.ui.Components.cq;
import org.telegram.ui.Components.ec;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.f00;
import org.telegram.ui.Components.h00;
import org.telegram.ui.Components.lt;
import org.telegram.ui.Components.m10;
import org.telegram.ui.Components.mc;
import org.telegram.ui.Components.n41;
import org.telegram.ui.Components.n9;
import org.telegram.ui.Components.oi0;
import org.telegram.ui.Components.p80;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public class y5 extends org.telegram.ui.ActionBar.n2 implements ud.b {
    public LinearLayout A;
    public z4 B;
    public z4 C;
    public z4 D;
    public z4 E;
    public f00 F;
    public boolean G;
    public og.c H;
    public jg.a I;
    public final ud.a a;
    public final long b;
    public final String c;
    public final i5 d;
    public Utilities.Callback e;
    public org.telegram.ui.ActionBar.g2 f;
    public View h;
    public r4 n;
    public FrameLayout r;
    public FrameLayout s;
    public TextView v;
    public a5 w;
    public boolean x;
    public HorizontalScrollView y;

    public y5(long j10, String str, long j11, org.telegram.ui.ActionBar.c6 c6Var) {
        super(null);
        this.a = new ud.a(0, this, er.h, 380L, false);
        this.G = true;
        this.b = j10;
        this.c = str;
        this.resourceProvider = c6Var;
        i5 i5Var = new i5(j11, this.currentAccount, new ag.n0(this, 10));
        this.d = i5Var;
        i5Var.g(false);
    }

    public static void U(y5 y5Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j10, boolean z10) {
        if (j10 == UserConfig.getInstance(y5Var.currentAccount).getClientUserId()) {
            y5Var.d.d.remove(tL_starGiftUnique);
            y5Var.e0(false);
            if (j10 == UserConfig.getInstance(y5Var.currentAccount).getClientUserId()) {
                mc a02 = mc.a0(y5Var);
                TLRPC.Document document = tL_starGiftUnique.getDocument();
                String string = LocaleController.getString(R.string.BoughtResoldGiftTitle);
                int i10 = R.string.BoughtResoldGiftText;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(tL_starGiftUnique.title);
                sb2.append(" #");
                ec O = a02.O(document, string, LocaleController.formatString(i10, i0.a.m(tL_starGiftUnique.num, ',', sb2)));
                O.r = false;
                O.j();
            } else {
                ec O2 = mc.a0(y5Var).O(tL_starGiftUnique.getDocument(), LocaleController.getString(R.string.BoughtResoldGiftToTitle), LocaleController.formatString(R.string.BoughtResoldGiftToText, DialogObject.getShortName(y5Var.currentAccount, j10)));
                O2.r = false;
                O2.j();
            }
            y5Var.F.c(true);
            return;
        }
        Bundle bundle = new Bundle();
        if (j10 >= 0) {
            bundle.putLong("user_id", j10);
        } else {
            bundle.putLong("chat_id", -j10);
        }
        p4 p4Var = new p4(bundle, tL_starGiftUnique, j10);
        org.telegram.ui.ActionBar.b5 b5Var = y5Var.parentLayout;
        if (b5Var == null || !((ActionBarLayout) b5Var).b) {
            y5Var.presentFragment(p4Var, true, z10);
        } else {
            Dialog dialog = y5Var.parentDialog;
            if ((dialog instanceof org.telegram.ui.ActionBar.e3) && z10) {
                ((org.telegram.ui.ActionBar.e3) dialog).skipDismissAnimation();
            }
            y5Var.finishFragment();
            org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
            if (U != null) {
                U.presentFragment(p4Var, false, z10);
            }
        }
        Utilities.Callback callback = y5Var.e;
        if (callback != null) {
            callback.run(Boolean.valueOf(z10));
        }
    }

    public static void V(y5 y5Var, Context context) {
        i5 i5Var = y5Var.d;
        if (y5Var.G && !i5Var.h.isEmpty()) {
            b70 b70Var = new b70(y5Var, y5Var.E, false, false);
            b70Var.t = false;
            b70Var.Y = true;
            b70Var.a0(0.0f, AndroidUtilities.dp(-8.0f));
            b70Var.R = true;
            b70Var.p = new m3(b70Var, 1);
            String[] strArr = {""};
            ArrayList arrayList = new ArrayList(i5Var.h);
            Collections.sort(arrayList, new f4(y5Var, 0));
            u4 u4Var = new u4(y5Var, new g4(y5Var, strArr, arrayList, 0), new h4(y5Var, b70Var, 0), null);
            u4Var.U2.r = false;
            FrameLayout frameLayout = new FrameLayout(context);
            ImageView imageView = new ImageView(context);
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            imageView.setImageResource(R.drawable.smiles_inputsearch);
            imageView.setColorFilter(new PorterDuffColorFilter(y5Var.getThemedColor(org.telegram.ui.ActionBar.g6.F8), PorterDuff.Mode.SRC_IN));
            frameLayout.addView(imageView, h7.z5.d(24, 24.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
            lt ltVar = new lt(context, y5Var.resourceProvider);
            ltVar.setTextSize(1, 16.0f);
            ltVar.setInputType(573441);
            ltVar.setRawInputType(573441);
            ltVar.setHintTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.A6, y5Var.resourceProvider));
            ltVar.setCursorColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.G6, y5Var.resourceProvider));
            ltVar.setCursorSize(AndroidUtilities.dp(19.0f));
            ltVar.setCursorWidth(1.5f);
            ltVar.setHint(LocaleController.getString(R.string.Gift2ResaleFiltersSearch));
            ltVar.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.E8, y5Var.resourceProvider));
            ltVar.setBackground(null);
            frameLayout.addView(ltVar, h7.z5.d(-1, -2.0f, 19, 43.0f, 0.0f, 8.0f, 0.0f));
            ltVar.addTextChangedListener(new n4(0, strArr, u4Var));
            if (arrayList.size() > 8) {
                b70Var.r(frameLayout, h7.z5.n(-1, 44));
                b70Var.k();
            }
            if (!i5Var.l.isEmpty()) {
                b70Var.c(R.drawable.msg_select, LocaleController.getString(R.string.SelectAll), new i4(y5Var, 0), false);
            }
            b70Var.q(u4Var);
            b70Var.Z();
        }
    }

    public static void W(y5 y5Var, Context context) {
        i5 i5Var = y5Var.d;
        if (y5Var.G && !i5Var.f.isEmpty()) {
            b70 b70Var = new b70(y5Var, y5Var.C, false, false);
            b70Var.t = false;
            b70Var.Y = true;
            b70Var.a0(0.0f, AndroidUtilities.dp(-8.0f));
            b70Var.R = true;
            b70Var.p = new m3(b70Var, 3);
            String[] strArr = {""};
            ArrayList arrayList = new ArrayList(i5Var.f);
            Collections.sort(arrayList, new f4(y5Var, 2));
            s4 s4Var = new s4(y5Var, new g4(y5Var, strArr, arrayList, 2), new h4(y5Var, b70Var, 2), null);
            s4Var.U2.r = false;
            FrameLayout frameLayout = new FrameLayout(context);
            ImageView imageView = new ImageView(context);
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            imageView.setImageResource(R.drawable.smiles_inputsearch);
            imageView.setColorFilter(new PorterDuffColorFilter(y5Var.getThemedColor(org.telegram.ui.ActionBar.g6.F8), PorterDuff.Mode.SRC_IN));
            frameLayout.addView(imageView, h7.z5.d(24, 24.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
            lt ltVar = new lt(context, y5Var.resourceProvider);
            ltVar.setTextSize(1, 16.0f);
            ltVar.setInputType(573441);
            ltVar.setRawInputType(573441);
            ltVar.setHintTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.A6, y5Var.resourceProvider));
            ltVar.setCursorColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.G6, y5Var.resourceProvider));
            ltVar.setCursorSize(AndroidUtilities.dp(19.0f));
            ltVar.setCursorWidth(1.5f);
            ltVar.setHint(LocaleController.getString(R.string.Gift2ResaleFiltersSearch));
            ltVar.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.E8, y5Var.resourceProvider));
            ltVar.setBackground(null);
            frameLayout.addView(ltVar, h7.z5.d(-1, -2.0f, 19, 43.0f, 0.0f, 8.0f, 0.0f));
            ltVar.addTextChangedListener(new n4(1, strArr, s4Var));
            if (arrayList.size() > 8) {
                b70Var.r(frameLayout, h7.z5.n(-1, 44));
                b70Var.k();
            }
            if (!i5Var.j.isEmpty()) {
                b70Var.c(R.drawable.msg_select, LocaleController.getString(R.string.SelectAll), new i4(y5Var, 2), false);
            }
            b70Var.q(s4Var);
            b70Var.Z();
        }
    }

    public static void X(y5 y5Var, Context context) {
        i5 i5Var = y5Var.d;
        if (y5Var.G && !i5Var.g.isEmpty()) {
            b70 b70Var = new b70(y5Var, y5Var.D, false, false);
            b70Var.t = false;
            b70Var.Y = true;
            b70Var.a0(0.0f, AndroidUtilities.dp(-8.0f));
            b70Var.R = true;
            b70Var.p = new m3(b70Var, 2);
            String[] strArr = {""};
            ArrayList arrayList = new ArrayList(i5Var.g);
            Collections.sort(arrayList, new f4(y5Var, 1));
            t4 t4Var = new t4(y5Var, new g4(y5Var, strArr, arrayList, 1), new h4(y5Var, b70Var, 1), null);
            t4Var.U2.r = false;
            FrameLayout frameLayout = new FrameLayout(context);
            ImageView imageView = new ImageView(context);
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            imageView.setImageResource(R.drawable.smiles_inputsearch);
            imageView.setColorFilter(new PorterDuffColorFilter(y5Var.getThemedColor(org.telegram.ui.ActionBar.g6.F8), PorterDuff.Mode.SRC_IN));
            frameLayout.addView(imageView, h7.z5.d(24, 24.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
            lt ltVar = new lt(context, y5Var.resourceProvider);
            ltVar.setTextSize(1, 16.0f);
            ltVar.setInputType(573441);
            ltVar.setRawInputType(573441);
            ltVar.setHintTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.A6, y5Var.resourceProvider));
            ltVar.setCursorColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.G6, y5Var.resourceProvider));
            ltVar.setCursorSize(AndroidUtilities.dp(19.0f));
            ltVar.setCursorWidth(1.5f);
            ltVar.setHint(LocaleController.getString(R.string.Gift2ResaleFiltersSearch));
            ltVar.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.E8, y5Var.resourceProvider));
            ltVar.setBackground(null);
            frameLayout.addView(ltVar, h7.z5.d(-1, -2.0f, 19, 43.0f, 0.0f, 8.0f, 0.0f));
            ltVar.addTextChangedListener(new n4(2, strArr, t4Var));
            if (arrayList.size() > 8) {
                b70Var.r(frameLayout, h7.z5.n(-1, 44));
                b70Var.k();
            }
            if (!i5Var.k.isEmpty()) {
                b70Var.c(R.drawable.msg_select, LocaleController.getString(R.string.SelectAll), new i4(y5Var, 1), false);
            }
            b70Var.q(t4Var);
            b70Var.Z();
        }
    }

    public static void Y(y5 y5Var, n41 n41Var) {
        Object obj = n41Var.G;
        if (obj instanceof TL_stars.TL_starGiftUnique) {
            TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) obj;
            hh.i5 i5Var = new hh.i5(y5Var.getParentActivity(), y5Var.currentAccount, y5Var.b, y5Var.resourceProvider, null);
            i5Var.h2(tL_starGiftUnique.slug, tL_starGiftUnique, y5Var.d);
            i5Var.K0 = new k4(y5Var);
            y5Var.showDialog(i5Var);
        }
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final View createView(final Context context) {
        og.c cVar = new og.c();
        this.H = cVar;
        int i10 = org.telegram.ui.ActionBar.g6.d6;
        cVar.a(getThemedColor(i10));
        this.I = new jg.a(this.H);
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        org.telegram.ui.ActionBar.g2 g2Var = new org.telegram.ui.ActionBar.g2(false);
        this.f = g2Var;
        kVar.setBackButtonDrawable(g2Var);
        this.f.k = 240.0f;
        this.actionBar.setCastShadows(false);
        this.actionBar.setAddToContainer(false);
        this.actionBar.setActionBarMenuOnItemClick(new ag.e2(this, 1));
        this.actionBar.setTitle(this.c);
        this.actionBar.setBackgroundColor(getThemedColor(i10));
        org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
        int i11 = org.telegram.ui.ActionBar.g6.G6;
        kVar2.D(getThemedColor(i11), false);
        this.actionBar.D(getThemedColor(i11), true);
        this.actionBar.C(getThemedColor(org.telegram.ui.ActionBar.g6.z8), false);
        this.actionBar.setTitleColor(getThemedColor(i11));
        this.actionBar.setSubtitleColor(getThemedColor(org.telegram.ui.ActionBar.g6.z6));
        q4 q4Var = new q4(this, context, 0);
        int v = org.telegram.ui.ActionBar.g6.v(org.telegram.ui.ActionBar.g6.v0(i10, this.resourceProvider), org.telegram.ui.ActionBar.g6.l1(0.04f, org.telegram.ui.ActionBar.g6.v0(i11, this.resourceProvider)));
        q4Var.setBackgroundColor(v);
        this.fragmentView = q4Var;
        da daVar = new da(context, this.currentAccount, this.resourceProvider);
        daVar.d = true;
        h7.b6.a(daVar);
        daVar.setOnClickListener(new ag.q0(11, this, daVar));
        this.actionBar.addView(daVar, h7.z5.d(-2, -2.0f, 85, 0.0f, 0.0f, 4.0f, 0.0f));
        r4 r4Var = new r4(this, new ch.c(this, 11), new k4(this), new k4(this));
        this.n = r4Var;
        r4Var.U2.r = false;
        r4Var.setSpanCount(3);
        this.n.j(new ag.z2(this, 4));
        this.n.setPadding(0, AndroidUtilities.dp(45.0f), 0, AndroidUtilities.dp(101.0f));
        this.n.setClipToPadding(false);
        q4Var.addView(this.n, h7.z5.d(-1, -1.0f, 119, 7.33f, 0.0f, 7.33f, -45.0f));
        q4Var.addView(this.actionBar);
        final int i12 = 0;
        View.OnClickListener onClickListener = new View.OnClickListener(this) { // from class: gh.l4
            public final /* synthetic */ y5 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i12) {
                    case 0:
                        i5 i5Var = this.b.d;
                        i5Var.k.clear();
                        i5Var.j.clear();
                        i5Var.l.clear();
                        i5Var.h();
                        break;
                    default:
                        i5 i5Var2 = this.b.d;
                        i5Var2.k.clear();
                        i5Var2.j.clear();
                        i5Var2.l.clear();
                        i5Var2.h();
                        break;
                }
            }
        };
        org.telegram.ui.ActionBar.c6 c6Var = this.resourceProvider;
        a5 a5Var = new a5(context);
        LinearLayout g10 = org.telegram.messenger.y1.g(context, 1);
        a5Var.addView(g10, h7.z5.e(-1, -2, 23));
        n9 n9Var = new n9(context);
        n9Var.setImageDrawable(new oi0(R.raw.utyan_empty, AndroidUtilities.dp(130.0f), "utyan_empty", AndroidUtilities.dp(130.0f)));
        g10.addView(n9Var, h7.z5.q(130, 130, 17));
        TextView textView = new TextView(context);
        rl.l(org.telegram.ui.ActionBar.g6.G6, c6Var, textView, 1, 17.0f);
        textView.setGravity(17);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setText(LocaleController.getString(R.string.Gift2ResaleFiltersEmptyTitle));
        g10.addView(textView, h7.z5.t(-2, -2, 17, 32, 12, 32, 9));
        p80 p80Var = new p80(context, null);
        p80Var.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.A6, c6Var));
        p80Var.setTextSize(1, 14.0f);
        p80Var.setGravity(17);
        p80Var.setText(LocaleController.getString(R.string.Gift2ResaleFiltersEmptySubtitle));
        p80Var.setMaxWidth(AndroidUtilities.dp(200.0f));
        g10.addView(p80Var, h7.z5.t(-2, -2, 17, 32, 0, 32, 12));
        TextView textView2 = new TextView(context);
        int i13 = org.telegram.ui.ActionBar.g6.Oh;
        textView2.setTextColor(org.telegram.ui.ActionBar.g6.v0(i13, c6Var));
        textView2.setBackground(org.telegram.ui.ActionBar.g6.Y(org.telegram.ui.ActionBar.g6.l1(0.1f, org.telegram.ui.ActionBar.g6.v0(i13, c6Var)), 6, 6));
        textView2.setGravity(17);
        textView2.setPadding(pa.c(13.0f, R.string.Gift2ResaleFiltersEmptyClear, textView2), 0, AndroidUtilities.dp(13.0f), 0);
        h7.b6.a(textView2);
        g10.addView(textView2, h7.z5.t(-2, 27, 17, 32, 0, 32, 12));
        textView2.setOnClickListener(onClickListener);
        this.w = a5Var;
        this.x = false;
        a5Var.setAlpha(0.0f);
        this.w.setScaleX(0.95f);
        this.w.setScaleY(0.95f);
        this.w.setVisibility(8);
        q4Var.addView(this.w, h7.z5.d(-1, -1.0f, 119, 0.0f, 0.0f, 0.0f, -45.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.A = linearLayout;
        linearLayout.setPadding(AndroidUtilities.dp(11.0f), 0, AndroidUtilities.dp(11.0f), 0);
        this.A.setOrientation(0);
        HorizontalScrollView horizontalScrollView = new HorizontalScrollView(context);
        this.y = horizontalScrollView;
        horizontalScrollView.setHorizontalScrollBarEnabled(false);
        this.y.addView(this.A);
        this.y.setBackgroundColor(v);
        this.y.setClipChildren(false);
        q4Var.addView(this.y, h7.z5.e(-1, 47, 55));
        View view = new View(context);
        this.h = view;
        view.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.g6.d7));
        this.h.setAlpha(0.0f);
        q4Var.addView(this.h, h7.z5.a(-1.0f, 2.0f / AndroidUtilities.density, 55));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(15.0f), 0);
        linearLayout2.setOrientation(0);
        final bp bpVar = new bp(context, 24, this.resourceProvider);
        bpVar.b(org.telegram.ui.ActionBar.g6.h7, org.telegram.ui.ActionBar.g6.j7, org.telegram.ui.ActionBar.g6.k7);
        bpVar.setDrawUnchecked(true);
        bpVar.a(false, false);
        bpVar.setDrawBackgroundAsArc(10);
        bpVar.setTranslationX(AndroidUtilities.dp(4.0f));
        bpVar.setScaleX(0.8f);
        bpVar.setScaleY(0.8f);
        linearLayout2.addView(bpVar, h7.z5.q(26, 26, 16));
        TextView textView3 = new TextView(context);
        rl.l(org.telegram.ui.ActionBar.g6.j5, this.resourceProvider, textView3, 1, 14.0f);
        textView3.setText(LocaleController.getString(R.string.GiftResaleStarsOnly));
        linearLayout2.addView(textView3, h7.z5.t(-2, -2, 16, 9, 0, 0, 0));
        int dp = AndroidUtilities.dp(18.0f);
        int themedColor = getThemedColor(i10);
        int i14 = org.telegram.ui.ActionBar.g6.Oh;
        int v4 = org.telegram.ui.ActionBar.g6.v(themedColor, org.telegram.ui.ActionBar.g6.l1(0.1f, getThemedColor(i14)));
        linearLayout2.setBackground(org.telegram.ui.ActionBar.g6.i0(dp, dp, dp, dp, 0, v4, v4));
        FrameLayout frameLayout = new FrameLayout(context);
        this.s = frameLayout;
        frameLayout.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        View view2 = this.s;
        lg.d c10 = this.I.c(view2, null, false);
        c10.n(ng.c.k(this.resourceProvider));
        c10.o(AndroidUtilities.dp(8.0f));
        c10.p(AndroidUtilities.dp(18.0f));
        view2.setBackground(c10);
        final int i15 = 0;
        this.s.setOnClickListener(new View.OnClickListener(this) { // from class: gh.m4
            public final /* synthetic */ y5 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                switch (i15) {
                    case 0:
                        i5 i5Var = this.b.d;
                        if (i5Var != null) {
                            boolean z10 = !i5Var.r;
                            i5Var.r = z10;
                            bpVar.a(z10, true);
                            i5Var.h();
                            break;
                        }
                        break;
                    default:
                        final y5 y5Var = this.b;
                        i5 i5Var2 = y5Var.d;
                        if (y5Var.G) {
                            b70 H = b70.H(y5Var, y5Var.B);
                            H.c(R.drawable.menu_sort_value, LocaleController.getString(h5.b.a), new i4(y5Var, 3), false);
                            H.c(R.drawable.menu_sort_date, LocaleController.getString(h5.c.a), new i4(y5Var, 4), false);
                            H.c(R.drawable.menu_sort_number, LocaleController.getString(h5.d.a), new i4(y5Var, 5), false);
                            H.k();
                            boolean z11 = !i5Var2.r;
                            String string = LocaleController.getString(R.string.GiftResaleFilterAllListings);
                            final int i16 = 0;
                            final bp bpVar2 = bpVar;
                            H.i(new Runnable() { // from class: gh.j4
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i16) {
                                        case 0:
                                            i5 i5Var3 = y5Var.d;
                                            if (i5Var3.r) {
                                                i5Var3.r = false;
                                                bpVar2.a(false, true);
                                                i5Var3.h();
                                                break;
                                            }
                                            break;
                                        default:
                                            i5 i5Var4 = y5Var.d;
                                            if (!i5Var4.r) {
                                                i5Var4.r = true;
                                                bpVar2.a(true, true);
                                                i5Var4.h();
                                                break;
                                            }
                                            break;
                                    }
                                }
                            }, string, z11);
                            final int i17 = 1;
                            H.i(new Runnable() { // from class: gh.j4
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i17) {
                                        case 0:
                                            i5 i5Var3 = y5Var.d;
                                            if (i5Var3.r) {
                                                i5Var3.r = false;
                                                bpVar2.a(false, true);
                                                i5Var3.h();
                                                break;
                                            }
                                            break;
                                        default:
                                            i5 i5Var4 = y5Var.d;
                                            if (!i5Var4.r) {
                                                i5Var4.r = true;
                                                bpVar2.a(true, true);
                                                i5Var4.h();
                                                break;
                                            }
                                            break;
                                    }
                                }
                            }, LocaleController.getString(R.string.GiftResaleFilterForStarsOnly), i5Var2.r);
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
        this.s.addView(linearLayout2, h7.z5.c(-1.0f, -2));
        h7.b6.b(this.s, 0.04f, 1.5f);
        q4Var.addView(this.s, h7.z5.d(-2, 52.0f, 81, 0.0f, 0.0f, 0.0f, AndroidUtilities.navigationBarHeight / AndroidUtilities.density));
        u7 y10 = u7.y(this.currentAccount, true);
        if (y10.e && !y10.s().k()) {
            this.s.setVisibility(8);
        }
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.r = frameLayout2;
        frameLayout2.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        View view3 = this.r;
        lg.d c11 = this.I.c(view3, null, false);
        c11.n(ng.c.k(this.resourceProvider));
        c11.o(AndroidUtilities.dp(8.0f));
        c11.p(AndroidUtilities.dp(22.0f));
        view3.setBackground(c11);
        q4Var.addView(this.r, h7.z5.d(-2, 60.0f, 81, 0.0f, 0.0f, 0.0f, AndroidUtilities.navigationBarHeight / AndroidUtilities.density));
        this.v = new TextView(context);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x");
        spannableStringBuilder.setSpan(new cq(R.drawable.msg_clearcache, 0), 0, 1, 33);
        spannableStringBuilder.append((CharSequence) " ").append((CharSequence) LocaleController.getString(R.string.Gift2ResaleFiltersClear));
        this.v.setText(spannableStringBuilder);
        this.v.setTextColor(getThemedColor(i14));
        this.v.setTypeface(AndroidUtilities.bold());
        this.v.setPadding(AndroidUtilities.dp(20.0f), 0, AndroidUtilities.dp(20.0f), 0);
        TextView textView4 = this.v;
        int dp2 = AndroidUtilities.dp(22.0f);
        int v10 = org.telegram.ui.ActionBar.g6.v(getThemedColor(i10), org.telegram.ui.ActionBar.g6.l1(0.1f, getThemedColor(i14)));
        textView4.setBackground(org.telegram.ui.ActionBar.g6.i0(dp2, dp2, dp2, dp2, 0, v10, v10));
        this.v.setGravity(17);
        final int i16 = 1;
        this.r.setOnClickListener(new View.OnClickListener(this) { // from class: gh.l4
            public final /* synthetic */ y5 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view4) {
                switch (i16) {
                    case 0:
                        i5 i5Var = this.b.d;
                        i5Var.k.clear();
                        i5Var.j.clear();
                        i5Var.l.clear();
                        i5Var.h();
                        break;
                    default:
                        i5 i5Var2 = this.b.d;
                        i5Var2.k.clear();
                        i5Var2.j.clear();
                        i5Var2.l.clear();
                        i5Var2.h();
                        break;
                }
            }
        });
        this.r.addView(this.v, h7.z5.c(-1.0f, -2));
        this.r.setVisibility(8);
        h7.b6.b(this.r, 0.05f, 1.5f);
        z4 z4Var = new z4(context, this.resourceProvider);
        this.B = z4Var;
        z4Var.setSorting(this.d.p);
        this.A.addView(this.B, h7.z5.t(-2, -2, 16, 0, 0, 6, 0));
        final int i17 = 1;
        this.B.setOnClickListener(new View.OnClickListener(this) { // from class: gh.m4
            public final /* synthetic */ y5 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view32) {
                switch (i17) {
                    case 0:
                        i5 i5Var = this.b.d;
                        if (i5Var != null) {
                            boolean z10 = !i5Var.r;
                            i5Var.r = z10;
                            bpVar.a(z10, true);
                            i5Var.h();
                            break;
                        }
                        break;
                    default:
                        final y5 y5Var = this.b;
                        i5 i5Var2 = y5Var.d;
                        if (y5Var.G) {
                            b70 H = b70.H(y5Var, y5Var.B);
                            H.c(R.drawable.menu_sort_value, LocaleController.getString(h5.b.a), new i4(y5Var, 3), false);
                            H.c(R.drawable.menu_sort_date, LocaleController.getString(h5.c.a), new i4(y5Var, 4), false);
                            H.c(R.drawable.menu_sort_number, LocaleController.getString(h5.d.a), new i4(y5Var, 5), false);
                            H.k();
                            boolean z11 = !i5Var2.r;
                            String string = LocaleController.getString(R.string.GiftResaleFilterAllListings);
                            final int i162 = 0;
                            final bp bpVar2 = bpVar;
                            H.i(new Runnable() { // from class: gh.j4
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i162) {
                                        case 0:
                                            i5 i5Var3 = y5Var.d;
                                            if (i5Var3.r) {
                                                i5Var3.r = false;
                                                bpVar2.a(false, true);
                                                i5Var3.h();
                                                break;
                                            }
                                            break;
                                        default:
                                            i5 i5Var4 = y5Var.d;
                                            if (!i5Var4.r) {
                                                i5Var4.r = true;
                                                bpVar2.a(true, true);
                                                i5Var4.h();
                                                break;
                                            }
                                            break;
                                    }
                                }
                            }, string, z11);
                            final int i172 = 1;
                            H.i(new Runnable() { // from class: gh.j4
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i172) {
                                        case 0:
                                            i5 i5Var3 = y5Var.d;
                                            if (i5Var3.r) {
                                                i5Var3.r = false;
                                                bpVar2.a(false, true);
                                                i5Var3.h();
                                                break;
                                            }
                                            break;
                                        default:
                                            i5 i5Var4 = y5Var.d;
                                            if (!i5Var4.r) {
                                                i5Var4.r = true;
                                                bpVar2.a(true, true);
                                                i5Var4.h();
                                                break;
                                            }
                                            break;
                                    }
                                }
                            }, LocaleController.getString(R.string.GiftResaleFilterForStarsOnly), i5Var2.r);
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
        z4 z4Var2 = new z4(context, this.resourceProvider);
        this.C = z4Var2;
        z4Var2.setValue(LocaleController.getString(R.string.Gift2AttributeModel));
        this.A.addView(this.C, h7.z5.t(-2, -2, 16, 0, 0, 6, 0));
        final int i18 = 0;
        this.C.setOnClickListener(new View.OnClickListener(this) { // from class: gh.e4
            public final /* synthetic */ y5 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view4) {
                switch (i18) {
                    case 0:
                        y5.W(this.b, context);
                        break;
                    case 1:
                        y5.X(this.b, context);
                        break;
                    default:
                        y5.V(this.b, context);
                        break;
                }
            }
        });
        z4 z4Var3 = new z4(context, this.resourceProvider);
        this.D = z4Var3;
        z4Var3.setValue(LocaleController.getString(R.string.Gift2AttributeBackdrop));
        this.A.addView(this.D, h7.z5.t(-2, -2, 16, 0, 0, 6, 0));
        final int i19 = 1;
        this.D.setOnClickListener(new View.OnClickListener(this) { // from class: gh.e4
            public final /* synthetic */ y5 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view4) {
                switch (i19) {
                    case 0:
                        y5.W(this.b, context);
                        break;
                    case 1:
                        y5.X(this.b, context);
                        break;
                    default:
                        y5.V(this.b, context);
                        break;
                }
            }
        });
        z4 z4Var4 = new z4(context, this.resourceProvider);
        this.E = z4Var4;
        z4Var4.setValue(LocaleController.getString(R.string.Gift2AttributeSymbol));
        this.A.addView(this.E, h7.z5.t(-2, -2, 16, 0, 0, 0, 0));
        final int i20 = 2;
        this.E.setOnClickListener(new View.OnClickListener(this) { // from class: gh.e4
            public final /* synthetic */ y5 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view4) {
                switch (i20) {
                    case 0:
                        y5.W(this.b, context);
                        break;
                    case 1:
                        y5.X(this.b, context);
                        break;
                    default:
                        y5.V(this.b, context);
                        break;
                }
            }
        });
        f00 f00Var = new f00(getParentActivity());
        this.F = f00Var;
        q4Var.addView(f00Var, h7.z5.c(-1.0f, -1));
        d0(false, false);
        return q4Var;
    }

    public final void d0(boolean z10, boolean z11) {
        if (this.G == z10) {
            return;
        }
        this.G = z10;
        if (!z11) {
            this.y.setVisibility(z10 ? 0 : 8);
            this.y.setTranslationY(z10 ? 0.0f : -AndroidUtilities.dp(45.0f));
            this.y.setAlpha(z10 ? 1.0f : 0.0f);
            this.h.setTranslationY(z10 ? 0.0f : -AndroidUtilities.dp(45.0f));
            this.n.setTranslationY(z10 ? 0.0f : -AndroidUtilities.dp(39.0f));
            return;
        }
        this.y.setVisibility(0);
        ViewPropertyAnimator alpha = this.y.animate().translationY(z10 ? 0.0f : -AndroidUtilities.dp(45.0f)).alpha(z10 ? 1.0f : 0.0f);
        er erVar = er.h;
        alpha.setInterpolator(erVar).setDuration(420L).setListener(new o4(this, z10, 0)).start();
        this.h.animate().translationY(z10 ? 0.0f : -AndroidUtilities.dp(45.0f)).setInterpolator(erVar).setDuration(420L).start();
        this.n.animate().translationY(z10 ? 0.0f : -AndroidUtilities.dp(39.0f)).setInterpolator(erVar).setDuration(420L).start();
    }

    public final void e0(boolean z10) {
        b51 b51Var;
        i5 i5Var = this.d;
        int i10 = i5Var.e;
        HashSet hashSet = i5Var.l;
        ArrayList arrayList = i5Var.h;
        HashSet hashSet2 = i5Var.k;
        ArrayList arrayList2 = i5Var.g;
        HashSet hashSet3 = i5Var.j;
        ArrayList arrayList3 = i5Var.f;
        if (i10 > 12) {
            d0(true, true);
        }
        r4 r4Var = this.n;
        boolean z11 = false;
        if (r4Var != null && (b51Var = r4Var.U2) != null) {
            b51Var.N(true);
            if (z10) {
                this.n.u0(0);
            }
        }
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        if (kVar != null) {
            kVar.setTitle(this.c);
            org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
            int i11 = i5Var.e;
            kVar2.setSubtitle(i11 <= 0 ? LocaleController.getString(R.string.Gift2ResaleNoCount) : LocaleController.formatPluralStringComma("Gift2ListingsCount", i11));
        }
        z4 z4Var = this.B;
        if (z4Var != null) {
            z4Var.setSorting(i5Var.p);
        }
        if (this.C != null) {
            int size = arrayList3.size() - hashSet3.size();
            this.C.setValue((size <= 0 || size == arrayList3.size()) ? LocaleController.getString(R.string.Gift2ResaleFilterModel) : LocaleController.formatPluralStringComma("Gift2ResaleFilterModels", size));
        }
        if (this.D != null) {
            int size2 = arrayList2.size() - hashSet2.size();
            this.D.setValue((size2 <= 0 || size2 == arrayList2.size()) ? LocaleController.getString(R.string.Gift2ResaleFilterBackdrop) : LocaleController.formatPluralStringComma("Gift2ResaleFilterBackdrops", size2));
        }
        if (this.E != null) {
            int size3 = arrayList.size() - hashSet.size();
            this.E.setValue((size3 <= 0 || size3 == arrayList.size()) ? LocaleController.getString(R.string.Gift2ResaleFilterSymbol) : LocaleController.formatPluralStringComma("Gift2ResaleFilterSymbols", size3));
        }
        int i12 = 0;
        while (true) {
            if (i12 >= this.n.getChildCount()) {
                break;
            }
            if (this.n.getChildAt(i12) instanceof h00) {
                i5Var.g(false);
                break;
            }
            i12++;
        }
        if ((i5Var.t || i5Var.e > 0) && (!hashSet3.isEmpty() || !hashSet2.isEmpty() || !hashSet.isEmpty())) {
            z11 = true;
        }
        this.a.a(z11, true);
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean isLightStatusBar() {
        if (getLastStoryViewer() == null || getLastStoryViewer().D0) {
            int w02 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.d6, false);
            if (this.actionBar.t()) {
                w02 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.w8, false);
            }
            if (i0.b.f(w02) > 0.699999988079071d) {
                return true;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // ud.b
    public final void o(int i10, float f10, float f11, ud.c cVar) {
        if (i10 == 0) {
            this.s.setTranslationY((-AndroidUtilities.dp(52.0f)) * f10);
            m10.d(this.r, f10);
        }
    }

    @Override // ud.b
    public final /* synthetic */ void A(float f10, int i10) {
    }
}
