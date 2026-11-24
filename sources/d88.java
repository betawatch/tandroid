// default package

import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.ScrollSlidingTextTabStrip;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class d88 extends d {
    public static final rg3 E = new rg3((byte) 2);
    public final w78 a;
    public final w78 b;
    public r7 c;
    public cv3 d;
    public boolean e;
    public final Paint f;
    public ScrollSlidingTextTabStrip h;
    public final c88[] n;
    public AnimatorSet r;
    public boolean s;
    public boolean w;
    public boolean x;
    public int y;

    public d88(HashMap hashMap, ArrayList arrayList, int i, boolean z, yv1 yv1Var) {
        super(null);
        this.e = true;
        this.f = new Paint();
        this.n = new c88[2];
        this.a = new w78(0, null, hashMap, arrayList, i, z, yv1Var, false);
        this.b = new w78(1, null, hashMap, arrayList, i, z, yv1Var, false);
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        w78 w78Var = this.a;
        if (w78Var != null) {
            w78Var.addThemeColorKeys(hashSet);
        }
        w78 w78Var2 = this.b;
        if (w78Var2 != null) {
            w78Var2.addThemeColorKeys(hashSet);
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final View createView(Context context) {
        c88[] c88VarArr;
        anb.h(cmb.g5, null, this.actionBar);
        a aVar = this.actionBar;
        int i = cmb.i5;
        anb.l(aVar, 5, i, null);
        anb.l(this.actionBar, 1, i, null);
        anb.l(this.actionBar, 3, cmb.H5, null);
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        tk5 tk5Var = this.parentLayout;
        if (tk5Var != null && ((ActionBarLayout) tk5Var).T0) {
            this.actionBar.setOccupyStatusBar(false);
        }
        float f = 44.0f;
        this.actionBar.setExtraHeight(gm.L(44.0f));
        this.actionBar.setAllowOverlayTitle(false);
        this.actionBar.setAddToContainer(false);
        this.actionBar.setClipContent(true);
        byte b = 21;
        this.actionBar.setActionBarMenuOnItemClick(new wl5(this, b));
        this.hasOwnBackground = true;
        r7 a = this.actionBar.t().a(0, R.drawable.outline_header_search);
        a.N();
        a.I = new q20(this, (byte) 18);
        this.c = a;
        a.setSearchFieldHint(jb6.M0(2131745495, null));
        EditTextBoldCursor searchField = this.c.getSearchField();
        anb.X(searchField, i, null);
        anb.v(searchField, i, null);
        anb.D(searchField, cmb.Le, null);
        ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = new ScrollSlidingTextTabStrip(context, null);
        this.h = scrollSlidingTextTabStrip;
        scrollSlidingTextTabStrip.setUseSameWidth(true);
        ScrollSlidingTextTabStrip scrollSlidingTextTabStrip2 = this.h;
        int i2 = cmb.X9;
        int i3 = cmb.Y9;
        scrollSlidingTextTabStrip2.M = i2;
        scrollSlidingTextTabStrip2.N = i3;
        scrollSlidingTextTabStrip2.updateColors();
        this.actionBar.addView(this.h, qoe.e(-1, 44, 83));
        this.h.setDelegate(new ai4(this, b));
        this.y = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
        b88 b88Var = new b88(this, context);
        this.fragmentView = b88Var;
        b88Var.setWillNotDraw(false);
        w78 w78Var = this.a;
        w78Var.setParentFragment(this);
        cv3 cv3Var = w78Var.e0;
        this.d = cv3Var;
        cv3Var.setSizeNotifierLayout(b88Var);
        int i4 = 0;
        while (i4 < 4) {
            View view = i4 != 0 ? i4 != 1 ? i4 != 2 ? w78Var.d0 : w78Var.c0 : w78Var.b0 : w78Var.a0;
            ((ViewGroup) view.getParent()).removeView(view);
            i4++;
        }
        FrameLayout frameLayout = w78Var.a0;
        ne6 ne6Var = w78Var.b0;
        sb sbVar = w78Var.c0;
        View view2 = w78Var.d0;
        cv3 cv3Var2 = w78Var.e0;
        w78 w78Var2 = this.b;
        w78Var2.a0 = frameLayout;
        w78Var2.b0 = ne6Var;
        w78Var2.e0 = cv3Var2;
        w78Var2.c0 = sbVar;
        w78Var2.d0 = view2;
        w78Var2.r0 = false;
        w78Var2.setParentFragment(this);
        int i5 = 0;
        while (true) {
            c88VarArr = this.n;
            if (i5 >= c88VarArr.length) {
                break;
            }
            c88 c88Var = new c88(this, context);
            c88VarArr[i5] = c88Var;
            float f2 = f;
            b88Var.addView(c88Var, qoe.c(-1.0f, -1));
            if (i5 == 0) {
                c88 c88Var2 = c88VarArr[i5];
                c88Var2.c = w78Var;
                c88Var2.f = w78Var.L;
            } else if (i5 == 1) {
                c88 c88Var3 = c88VarArr[i5];
                c88Var3.c = w78Var2;
                c88Var3.f = w78Var2.L;
                c88Var3.setVisibility(8);
            }
            ((r59) c88VarArr[i5].f).setScrollingTouchSlop(1);
            c88 c88Var4 = c88VarArr[i5];
            c88Var4.d = (FrameLayout) ((w78) c88Var4.c).getFragmentView();
            ((r59) c88VarArr[i5].f).setClipToPadding(false);
            c88 c88Var5 = c88VarArr[i5];
            c88Var5.e = ((w78) c88Var5.c).getActionBar();
            c88 c88Var6 = c88VarArr[i5];
            c88Var6.addView((FrameLayout) c88Var6.d, qoe.c(-1.0f, -1));
            c88 c88Var7 = c88VarArr[i5];
            c88Var7.addView((a) c88Var7.e, qoe.c(-2.0f, -1));
            ((a) c88VarArr[i5].e).setVisibility(8);
            ((r59) c88VarArr[i5].f).setOnScrollListener(new bk1(this, ((r59) c88VarArr[i5].f).getOnScrollListener(), (byte) 6));
            i5++;
            f = f2;
        }
        float f3 = f;
        b88Var.addView(this.actionBar, qoe.c(-2.0f, -1));
        b88Var.addView(w78Var.a0, qoe.e(-1, 48, 83));
        b88Var.addView(w78Var.b0, qoe.d(60, 60.0f, 85, 0.0f, 0.0f, 12.0f, 10.0f));
        b88Var.addView(w78Var.c0, qoe.d(42, 24.0f, 85, 0.0f, 0.0f, -2.0f, 9.0f));
        ScrollSlidingTextTabStrip scrollSlidingTextTabStrip3 = this.h;
        if (scrollSlidingTextTabStrip3 != null) {
            scrollSlidingTextTabStrip3.a(0, jb6.M0(2131749027, null), null);
            this.h.a(1, jb6.M0(2131750401, null), null);
            this.h.setVisibility(0);
            this.actionBar.setExtraHeight(gm.L(f3));
            int currentTabId = this.h.getCurrentTabId();
            if (currentTabId >= 0) {
                c88VarArr[0].b = currentTabId;
            }
            this.h.c();
        }
        o0(false);
        this.e = this.h.getCurrentTabId() == this.h.getFirstTabId();
        if (gm.B(cmb.w0(null, cmb.g5, false)) >= 0.721f) {
            View view3 = this.fragmentView;
            view3.setSystemUiVisibility(view3.getSystemUiVisibility() | TLObject.FLAG_13);
        }
        return this.fragmentView;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new cnb(this.fragmentView, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.g5));
        arrayList.add(new cnb(this.actionBar, 67108864, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.Le));
        arrayList.add(new cnb(this.c.getSearchField(), 16777216, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.i5));
        int i = cmb.X9;
        arrayList.add(new cnb(this.h.getTabsContainer(), 262148, new Class[]{TextView.class}, (Paint) null, (Drawable[]) null, (bnb) null, i));
        arrayList.add(new cnb(this.h.getTabsContainer(), 262148, new Class[]{TextView.class}, (Paint) null, (Drawable[]) null, (bnb) null, cmb.Y9));
        arrayList.add(new cnb(this.h.getTabsContainer(), 65568, new Class[]{TextView.class}, (Paint) null, (Drawable[]) null, (bnb) null, cmb.H5));
        arrayList.add(new cnb((View) null, 0, (Class[]) null, (Paint) null, new Drawable[]{this.h.getSelectorDrawable()}, (bnb) null, i));
        arrayList.addAll(this.a.getThemeDescriptions());
        arrayList.addAll(this.b.getThemeDescriptions());
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return this.e;
    }

    public final void m0(String str) {
        this.c.getSearchField().setText(str);
        this.c.getSearchField().setSelection(str.length());
        this.actionBar.C();
    }

    public final void n0(float f) {
        this.actionBar.setTranslationY(f);
        int i = 0;
        while (true) {
            c88[] c88VarArr = this.n;
            if (i >= c88VarArr.length) {
                this.fragmentView.invalidate();
                return;
            } else {
                ((r59) c88VarArr[i].f).setPinnedSectionOffsetY((int) f);
                i++;
            }
        }
    }

    public final void o0(boolean z) {
        c88[] c88VarArr;
        int i = 0;
        while (true) {
            c88VarArr = this.n;
            if (i >= c88VarArr.length) {
                break;
            }
            ((r59) c88VarArr[i].f).D0();
            i++;
        }
        ((r59) c88VarArr[z ? 1 : 0].f).getAdapter();
        ((r59) c88VarArr[z ? 1 : 0].f).setPinnedHeaderShadowDrawable(null);
        if (this.actionBar.getTranslationY() != 0.0f) {
            ((u46) ((r59) c88VarArr[z ? 1 : 0].f).getLayoutManager()).g1(0, (int) this.actionBar.getTranslationY());
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        w78 w78Var = this.a;
        if (w78Var != null) {
            w78Var.onConfigurationChanged(configuration);
        }
        w78 w78Var2 = this.b;
        if (w78Var2 != null) {
            w78Var2.onConfigurationChanged(configuration);
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onFragmentDestroy() {
        w78 w78Var = this.a;
        if (w78Var != null) {
            w78Var.onFragmentDestroy();
        }
        w78 w78Var2 = this.b;
        if (w78Var2 != null) {
            w78Var2.onFragmentDestroy();
        }
        super.onFragmentDestroy();
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onPause() {
        super.onPause();
        w78 w78Var = this.a;
        if (w78Var != null) {
            w78Var.onPause();
        }
        w78 w78Var2 = this.b;
        if (w78Var2 != null) {
            w78Var2.onPause();
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onResume() {
        super.onResume();
        r7 r7Var = this.c;
        if (r7Var != null) {
            r7Var.G(true);
            getParentActivity().getWindow().setSoftInputMode(32);
        }
        w78 w78Var = this.a;
        if (w78Var != null) {
            w78Var.onResume();
        }
        w78 w78Var2 = this.b;
        if (w78Var2 != null) {
            w78Var2.onResume();
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            r7 r7Var = this.c;
            if (r7Var != null && r7Var.getSearchField() != null) {
                this.c.getSearchField().setCursorColor(cmb.w0(null, cmb.i5, false));
            }
            if (this.fragmentView != null) {
                boolean z = gm.B(cmb.w0(null, cmb.g5, false)) >= 0.721f;
                int systemUiVisibility = this.fragmentView.getSystemUiVisibility();
                int i = z ? systemUiVisibility | TLObject.FLAG_13 : systemUiVisibility & (-8193);
                if (i != systemUiVisibility) {
                    this.fragmentView.setSystemUiVisibility(i);
                }
            }
        } catch (Exception e) {
            fc4.g(e, true);
        }
        try {
            w78 w78Var = this.a;
            if (w78Var != null && w78Var.fragmentView != null) {
                w78Var.onThemeColorsChanged();
            }
        } catch (Exception e2) {
            fc4.g(e2, true);
        }
        try {
            w78 w78Var2 = this.b;
            if (w78Var2 == null || w78Var2.fragmentView == null) {
                return;
            }
            w78Var2.onThemeColorsChanged();
        } catch (Exception e3) {
            fc4.g(e3, true);
        }
    }
}
