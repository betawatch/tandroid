package gg;

import android.content.Context;
import android.graphics.Point;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import bi.t2;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.l6;
import org.telegram.ui.Components.fl0;
import org.telegram.ui.Components.qi;
import org.telegram.ui.Components.tz;
import org.telegram.ui.Components.ui;
import org.telegram.ui.Components.wr;
import org.telegram.ui.Components.xi;
import org.telegram.ui.Components.yi;
import w7.a6;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class n0 extends qi implements NotificationCenter.NotificationCenterDelegate, le.d {
    public final tz E;
    public final ui F;
    public final le.b n;
    public final FrameLayout r;
    public final bi.y1 s;
    public final j0 v;
    public final HashSet w;
    public final k0 x;
    public final l0 y;

    public n0(Context context, f6 f6Var, yi yiVar) {
        super(context, f6Var, yiVar);
        this.n = new le.b(0, this, wr.h, 380L, false);
        this.w = new HashSet();
        this.y = new l0(this, context);
        xi xiVar = new xi(context, j6.d6, f6Var);
        xiVar.setVisibility(4);
        FrameLayout frameLayout = new FrameLayout(context);
        this.r = frameLayout;
        ui uiVar = new ui(context, f6Var, this.b);
        this.F = uiVar;
        uiVar.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
        h0 h0Var = new h0(this);
        t2 t2Var = uiVar.r;
        t2Var.addTextChangedListener(h0Var);
        t2Var.setHint(LocaleController.getString(R.string.BusinessRepliesSearch));
        frameLayout.addView(xiVar, a6.g());
        FrameLayout.LayoutParams d = a6.d(-1, 48.0f, 51, 7.0f, 8.0f, 7.0f, 4.0f);
        ((ViewGroup.MarginLayoutParams) d).topMargin += AndroidUtilities.statusBarHeight;
        frameLayout.addView(uiVar, d);
        tz tzVar = new tz(context, f6Var);
        this.E = tzVar;
        tzVar.c();
        addView(tzVar, a6.d(-1, -1.0f, 51, 0.0f, 52.0f, 0.0f, 0.0f));
        bi.y1 y1Var = new bi.y1(this, context, f6Var, 2);
        this.s = y1Var;
        y1Var.o1();
        this.c = y1Var;
        this.d = y1Var;
        this.h = true;
        this.f = true;
        NotificationCenter.getGlobalInstance().listen(y1Var, NotificationCenter.emojiLoaded, new ai.b(this, 16));
        y1Var.setClipToPadding(false);
        getContext();
        j0 j0Var = new j0(this, AndroidUtilities.dp(9.0f), y1Var, 0);
        this.v = j0Var;
        y1Var.setLayoutManager(j0Var);
        j0Var.P = false;
        y1Var.setHorizontalScrollBarEnabled(false);
        y1Var.setVerticalScrollBarEnabled(false);
        y1Var.setClipToPadding(false);
        addView(y1Var, a6.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        k0 k0Var = new k0(this, context);
        this.x = k0Var;
        y1Var.setAdapter(k0Var);
        y1Var.setGlowColor(j6.v0(j6.A5, this.a));
        y1Var.setOnItemClickListener(new ai.g(this, 9));
        y1Var.setOnScrollListener(new bi.a2(this, 8));
        FrameLayout.LayoutParams e = a6.e(-1, 60, 51);
        ((ViewGroup.MarginLayoutParams) e).height += AndroidUtilities.statusBarHeight;
        addView(frameLayout, e);
        L();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getCurrentTop() {
        bi.y1 y1Var = this.s;
        if (y1Var.getChildCount() == 0) {
            return -1000;
        }
        int i10 = 0;
        View childAt = y1Var.getChildAt(0);
        fl0 fl0Var = (fl0) y1Var.G(childAt);
        if (fl0Var == null) {
            return -1000;
        }
        int paddingTop = y1Var.getPaddingTop();
        if (fl0Var.b() == 0 && childAt.getTop() >= 0) {
            i10 = childAt.getTop();
        }
        return paddingTop - i10;
    }

    @Override // org.telegram.ui.Components.qi
    public final void D(qi qiVar) {
        this.v.h1(0, 0);
    }

    @Override // org.telegram.ui.Components.qi
    public final void F() {
        this.s.x0(0);
    }

    public final void L() {
        this.E.setVisibility(this.s.getAdapter().h() == 2 ? 0 : 8);
        M();
    }

    public final void M() {
        View childAt;
        tz tzVar = this.E;
        if (tzVar.getVisibility() == 0 && (childAt = this.s.getChildAt(0)) != null) {
            tzVar.setTranslationY((childAt.getTop() + (tzVar.getMeasuredHeight() - getMeasuredHeight())) / 2);
        }
    }

    @Override // org.telegram.ui.Components.qi
    public int getCurrentItemTop() {
        bi.y1 y1Var = this.s;
        if (y1Var.getChildCount() <= 0) {
            return ConnectionsManager.DEFAULT_DATACENTER_ID;
        }
        View childAt = y1Var.getChildAt(0);
        fl0 fl0Var = (fl0) y1Var.G(childAt);
        int top = (childAt.getTop() - AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(8.0f);
        int i10 = (top <= 0 || fl0Var == null || fl0Var.b() != 0) ? 0 : top;
        le.b bVar = this.n;
        if (top < 0 || fl0Var == null || fl0Var.b() != 0) {
            bVar.a(true, true);
            top = i10;
        } else {
            bVar.a(false, true);
        }
        this.r.setTranslationY(top);
        return AndroidUtilities.dp(12.0f) + top;
    }

    @Override // org.telegram.ui.Components.qi
    public int getFirstOffset() {
        return AndroidUtilities.dp(4.0f) + getListTopPadding();
    }

    @Override // org.telegram.ui.Components.qi
    public int getListTopPadding() {
        return this.s.getPaddingTop();
    }

    @Override // org.telegram.ui.Components.qi
    public int getSelectedItemsCount() {
        return 0;
    }

    @Override // org.telegram.ui.Components.qi
    public ArrayList<l6> getThemeDescriptions() {
        k6 k6Var = new k6() { // from class: gg.f0
            @Override // org.telegram.ui.ActionBar.k6
            public final void b() {
                bi.y1 y1Var = n0.this.s;
                if (y1Var != null) {
                    int childCount = y1Var.getChildCount();
                    for (int i10 = 0; i10 < childCount; i10++) {
                        y1Var.getChildAt(i10);
                    }
                }
            }

            @Override // org.telegram.ui.ActionBar.k6
            public final /* synthetic */ void a(float f7) {
            }
        };
        ArrayList<l6> arrayList = new ArrayList<>();
        arrayList.add(new l6(this.E, 4, null, null, null, null, j6.c7));
        arrayList.add(new l6(this.E, 2048, null, null, null, null, j6.h6));
        int i10 = j6.A5;
        bi.y1 y1Var = this.s;
        arrayList.add(new l6(y1Var, 32768, null, null, null, null, i10));
        arrayList.add(new l6(y1Var, 4096, null, null, null, null, j6.i6));
        arrayList.add(new l6(y1Var, 0, new Class[]{View.class}, j6.k0, null, null, j6.d7));
        int i11 = j6.q5;
        arrayList.add(new l6(y1Var, 0, new Class[]{m0.class}, new String[]{"nameTextView"}, null, null, -1, null, i11));
        arrayList.add(new l6(y1Var, 0, new Class[]{m0.class}, new String[]{"statusTextView"}, null, null, -1, k6Var, i11));
        arrayList.add(new l6(y1Var, 0, new Class[]{m0.class}, null, j6.r0, null, j6.J7));
        arrayList.add(new l6(null, 0, null, null, null, k6Var, j6.O7));
        arrayList.add(new l6(null, 0, null, null, null, k6Var, j6.P7));
        arrayList.add(new l6(null, 0, null, null, null, k6Var, j6.Q7));
        arrayList.add(new l6(null, 0, null, null, null, k6Var, j6.R7));
        arrayList.add(new l6(null, 0, null, null, null, k6Var, j6.S7));
        arrayList.add(new l6(null, 0, null, null, null, k6Var, j6.T7));
        arrayList.add(new l6(null, 0, null, null, null, k6Var, j6.U7));
        return arrayList;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        M();
    }

    @Override // android.view.View
    public void setTranslationY(float f7) {
        super.setTranslationY(f7);
        this.b.getSheetContainer().invalidate();
    }

    public void setupBlurredSearchField(zg.a aVar) {
        ui uiVar = this.F;
        if (uiVar != null) {
            uiVar.setupBlurredBackground(aVar.c(uiVar, dh.c.a(this.a), false));
        }
    }

    @Override // org.telegram.ui.Components.qi
    public final void y(int i10, int i11) {
        int i12;
        yi yiVar = this.b;
        if (yiVar.r1.R() > AndroidUtilities.dp(20.0f)) {
            i12 = AndroidUtilities.dp(8.0f);
            yiVar.setAllowNestedScroll(false);
        } else {
            if (!AndroidUtilities.isTablet()) {
                Point point = AndroidUtilities.displaySize;
                if (point.x > point.y) {
                    i12 = (int) (i11 / 3.5f);
                    yiVar.setAllowNestedScroll(true);
                }
            }
            i12 = (i11 / 5) * 2;
            yiVar.setAllowNestedScroll(true);
        }
        this.s.n1(0, i12 + AndroidUtilities.statusBarHeight, 0, this.e);
    }

    @Override // org.telegram.ui.Components.qi
    public final void m() {
    }

    @Override // le.d
    public final /* synthetic */ void B(float f7, int i10) {
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
    }

    @Override // le.d
    public final void G(int i10, float f7, float f10, le.e eVar) {
    }
}
