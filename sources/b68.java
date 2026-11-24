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

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class b68 extends d {
    public static final ef3 E = new ef3((byte) 2);
    public final u58 a;
    public final u58 b;
    public r7 c;
    public rt3 d;
    public boolean e;
    public final Paint f;
    public ScrollSlidingTextTabStrip h;
    public final a68[] n;
    public AnimatorSet r;
    public boolean s;
    public boolean w;
    public boolean x;
    public int y;

    public b68(HashMap hashMap, ArrayList arrayList, int i, boolean z, mu1 mu1Var) {
        super(null);
        this.e = true;
        this.f = new Paint();
        this.n = new a68[2];
        this.a = new u58(0, null, hashMap, arrayList, i, z, mu1Var, false);
        this.b = new u58(1, null, hashMap, arrayList, i, z, mu1Var, false);
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        u58 u58Var = this.a;
        if (u58Var != null) {
            u58Var.addThemeColorKeys(hashSet);
        }
        u58 u58Var2 = this.b;
        if (u58Var2 != null) {
            u58Var2.addThemeColorKeys(hashSet);
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final View createView(Context context) {
        a68[] a68VarArr;
        zkb.h(bkb.g5, null, this.actionBar);
        a aVar = this.actionBar;
        int i = bkb.i5;
        zkb.l(aVar, 5, i, null);
        zkb.l(this.actionBar, 1, i, null);
        zkb.l(this.actionBar, 3, bkb.H5, null);
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        ui5 ui5Var = this.parentLayout;
        if (ui5Var != null && ((ActionBarLayout) ui5Var).T0) {
            this.actionBar.setOccupyStatusBar(false);
        }
        float f = 44.0f;
        this.actionBar.setExtraHeight(gl.L(44.0f));
        this.actionBar.setAllowOverlayTitle(false);
        this.actionBar.setAddToContainer(false);
        this.actionBar.setClipContent(true);
        this.actionBar.setActionBarMenuOnItemClick(new bq5(this, (byte) 20));
        this.hasOwnBackground = true;
        r7 a = this.actionBar.t().a(0, R.drawable.outline_header_search);
        a.N();
        a.I = new q10(this, (byte) 18);
        this.c = a;
        a.setSearchFieldHint(k96.M0(2131745569, null));
        EditTextBoldCursor searchField = this.c.getSearchField();
        zkb.X(searchField, i, null);
        zkb.v(searchField, i, null);
        zkb.D(searchField, bkb.Le, null);
        ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = new ScrollSlidingTextTabStrip(context, null);
        this.h = scrollSlidingTextTabStrip;
        scrollSlidingTextTabStrip.setUseSameWidth(true);
        ScrollSlidingTextTabStrip scrollSlidingTextTabStrip2 = this.h;
        int i2 = bkb.X9;
        int i3 = bkb.Y9;
        scrollSlidingTextTabStrip2.M = i2;
        scrollSlidingTextTabStrip2.N = i3;
        scrollSlidingTextTabStrip2.updateColors();
        this.actionBar.addView(this.h, nme.e(-1, 44, 83));
        this.h.setDelegate(new z24((Object) this, (byte) 24));
        this.y = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
        z58 z58Var = new z58(this, context);
        this.fragmentView = z58Var;
        z58Var.setWillNotDraw(false);
        u58 u58Var = this.a;
        u58Var.setParentFragment(this);
        rt3 rt3Var = u58Var.e0;
        this.d = rt3Var;
        rt3Var.setSizeNotifierLayout(z58Var);
        int i4 = 0;
        while (i4 < 4) {
            View view = i4 != 0 ? i4 != 1 ? i4 != 2 ? u58Var.d0 : u58Var.c0 : u58Var.b0 : u58Var.a0;
            ((ViewGroup) view.getParent()).removeView(view);
            i4++;
        }
        FrameLayout frameLayout = u58Var.a0;
        oc6 oc6Var = u58Var.b0;
        sb sbVar = u58Var.c0;
        View view2 = u58Var.d0;
        rt3 rt3Var2 = u58Var.e0;
        u58 u58Var2 = this.b;
        u58Var2.a0 = frameLayout;
        u58Var2.b0 = oc6Var;
        u58Var2.e0 = rt3Var2;
        u58Var2.c0 = sbVar;
        u58Var2.d0 = view2;
        u58Var2.r0 = false;
        u58Var2.setParentFragment(this);
        int i5 = 0;
        while (true) {
            a68VarArr = this.n;
            if (i5 >= a68VarArr.length) {
                break;
            }
            a68 a68Var = new a68(this, context);
            a68VarArr[i5] = a68Var;
            float f2 = f;
            z58Var.addView(a68Var, nme.c(-1.0f, -1));
            if (i5 == 0) {
                a68 a68Var2 = a68VarArr[i5];
                a68Var2.c = u58Var;
                a68Var2.f = u58Var.L;
            } else if (i5 == 1) {
                a68 a68Var3 = a68VarArr[i5];
                a68Var3.c = u58Var2;
                a68Var3.f = u58Var2.L;
                a68Var3.setVisibility(8);
            }
            ((o39) a68VarArr[i5].f).setScrollingTouchSlop(1);
            a68 a68Var4 = a68VarArr[i5];
            a68Var4.d = (FrameLayout) ((u58) a68Var4.c).getFragmentView();
            ((o39) a68VarArr[i5].f).setClipToPadding(false);
            a68 a68Var5 = a68VarArr[i5];
            a68Var5.e = ((u58) a68Var5.c).getActionBar();
            a68 a68Var6 = a68VarArr[i5];
            a68Var6.addView((FrameLayout) a68Var6.d, nme.c(-1.0f, -1));
            a68 a68Var7 = a68VarArr[i5];
            a68Var7.addView((a) a68Var7.e, nme.c(-2.0f, -1));
            ((a) a68VarArr[i5].e).setVisibility(8);
            ((o39) a68VarArr[i5].f).setOnScrollListener(new si1(this, ((o39) a68VarArr[i5].f).getOnScrollListener(), (byte) 6));
            i5++;
            f = f2;
        }
        float f3 = f;
        z58Var.addView(this.actionBar, nme.c(-2.0f, -1));
        z58Var.addView(u58Var.a0, nme.e(-1, 48, 83));
        z58Var.addView(u58Var.b0, nme.d(60, 60.0f, 85, 0.0f, 0.0f, 12.0f, 10.0f));
        z58Var.addView(u58Var.c0, nme.d(42, 24.0f, 85, 0.0f, 0.0f, -2.0f, 9.0f));
        ScrollSlidingTextTabStrip scrollSlidingTextTabStrip3 = this.h;
        if (scrollSlidingTextTabStrip3 != null) {
            scrollSlidingTextTabStrip3.a(0, k96.M0(2131749078, null), null);
            this.h.a(1, k96.M0(2131750452, null), null);
            this.h.setVisibility(0);
            this.actionBar.setExtraHeight(gl.L(f3));
            int currentTabId = this.h.getCurrentTabId();
            if (currentTabId >= 0) {
                a68VarArr[0].b = currentTabId;
            }
            this.h.c();
        }
        n0(false);
        this.e = this.h.getCurrentTabId() == this.h.getFirstTabId();
        if (gl.B(bkb.w0(null, bkb.g5, false)) >= 0.721f) {
            View view3 = this.fragmentView;
            view3.setSystemUiVisibility(view3.getSystemUiVisibility() | TLObject.FLAG_13);
        }
        return this.fragmentView;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new blb(this.fragmentView, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.g5));
        arrayList.add(new blb(this.actionBar, 67108864, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.Le));
        arrayList.add(new blb(this.c.getSearchField(), 16777216, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.i5));
        int i = bkb.X9;
        arrayList.add(new blb(this.h.getTabsContainer(), 262148, new Class[]{TextView.class}, (Paint) null, (Drawable[]) null, (alb) null, i));
        arrayList.add(new blb(this.h.getTabsContainer(), 262148, new Class[]{TextView.class}, (Paint) null, (Drawable[]) null, (alb) null, bkb.Y9));
        arrayList.add(new blb(this.h.getTabsContainer(), 65568, new Class[]{TextView.class}, (Paint) null, (Drawable[]) null, (alb) null, bkb.H5));
        arrayList.add(new blb((View) null, 0, (Class[]) null, (Paint) null, new Drawable[]{this.h.getSelectorDrawable()}, (alb) null, i));
        arrayList.addAll(this.a.getThemeDescriptions());
        arrayList.addAll(this.b.getThemeDescriptions());
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return this.e;
    }

    public final void l0(String str) {
        this.c.getSearchField().setText(str);
        this.c.getSearchField().setSelection(str.length());
        this.actionBar.C();
    }

    public final void m0(float f) {
        this.actionBar.setTranslationY(f);
        int i = 0;
        while (true) {
            a68[] a68VarArr = this.n;
            if (i >= a68VarArr.length) {
                this.fragmentView.invalidate();
                return;
            } else {
                ((o39) a68VarArr[i].f).setPinnedSectionOffsetY((int) f);
                i++;
            }
        }
    }

    public final void n0(boolean z) {
        a68[] a68VarArr;
        int i = 0;
        while (true) {
            a68VarArr = this.n;
            if (i >= a68VarArr.length) {
                break;
            }
            ((o39) a68VarArr[i].f).D0();
            i++;
        }
        ((o39) a68VarArr[z ? 1 : 0].f).getAdapter();
        ((o39) a68VarArr[z ? 1 : 0].f).setPinnedHeaderShadowDrawable(null);
        if (this.actionBar.getTranslationY() != 0.0f) {
            ((t26) ((o39) a68VarArr[z ? 1 : 0].f).getLayoutManager()).g1(0, (int) this.actionBar.getTranslationY());
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        u58 u58Var = this.a;
        if (u58Var != null) {
            u58Var.onConfigurationChanged(configuration);
        }
        u58 u58Var2 = this.b;
        if (u58Var2 != null) {
            u58Var2.onConfigurationChanged(configuration);
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onFragmentDestroy() {
        u58 u58Var = this.a;
        if (u58Var != null) {
            u58Var.onFragmentDestroy();
        }
        u58 u58Var2 = this.b;
        if (u58Var2 != null) {
            u58Var2.onFragmentDestroy();
        }
        super.onFragmentDestroy();
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onPause() {
        super.onPause();
        u58 u58Var = this.a;
        if (u58Var != null) {
            u58Var.onPause();
        }
        u58 u58Var2 = this.b;
        if (u58Var2 != null) {
            u58Var2.onPause();
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
        u58 u58Var = this.a;
        if (u58Var != null) {
            u58Var.onResume();
        }
        u58 u58Var2 = this.b;
        if (u58Var2 != null) {
            u58Var2.onResume();
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            r7 r7Var = this.c;
            if (r7Var != null && r7Var.getSearchField() != null) {
                this.c.getSearchField().setCursorColor(bkb.w0(null, bkb.i5, false));
            }
            if (this.fragmentView != null) {
                boolean z = gl.B(bkb.w0(null, bkb.g5, false)) >= 0.721f;
                int systemUiVisibility = this.fragmentView.getSystemUiVisibility();
                int i = z ? systemUiVisibility | TLObject.FLAG_13 : systemUiVisibility & (-8193);
                if (i != systemUiVisibility) {
                    this.fragmentView.setSystemUiVisibility(i);
                }
            }
        } catch (Exception e) {
            fa4.g(e, true);
        }
        try {
            u58 u58Var = this.a;
            if (u58Var != null && u58Var.fragmentView != null) {
                u58Var.onThemeColorsChanged();
            }
        } catch (Exception e2) {
            fa4.g(e2, true);
        }
        try {
            u58 u58Var2 = this.b;
            if (u58Var2 == null || u58Var2.fragmentView == null) {
                return;
            }
            u58Var2.onThemeColorsChanged();
        } catch (Exception e3) {
            fa4.g(e3, true);
        }
    }
}
