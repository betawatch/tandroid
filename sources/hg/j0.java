package hg;

import android.content.Context;
import android.graphics.Point;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.am0;
import org.telegram.ui.Components.c00;
import org.telegram.ui.Components.hs;
import org.telegram.ui.Components.qi;
import org.telegram.ui.Components.ui;
import org.telegram.ui.Components.xi;
import org.telegram.ui.Components.yi;
import w7.x5;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class j0 extends qi implements NotificationCenter.NotificationCenterDelegate, me.d {
    public final c00 E;
    public final ui F;
    public final me.b n;
    public final FrameLayout r;
    public final ai.w0 s;
    public final f0 v;
    public final HashSet w;
    public final g0 x;
    public final h0 y;

    public j0(Context context, e6 e6Var, yi yiVar) {
        super(context, e6Var, yiVar);
        this.n = new me.b(0, this, hs.h, 380L, false);
        this.w = new HashSet();
        this.y = new h0(this, context);
        xi xiVar = new xi(context, i6.d6, e6Var);
        xiVar.setVisibility(4);
        FrameLayout frameLayout = new FrameLayout(context);
        this.r = frameLayout;
        ui uiVar = new ui(context, e6Var, this.b);
        this.F = uiVar;
        uiVar.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
        d0 d0Var = new d0(this);
        ci.g2 g2Var = uiVar.r;
        g2Var.addTextChangedListener(d0Var);
        g2Var.setHint(LocaleController.getString(R.string.BusinessRepliesSearch));
        frameLayout.addView(xiVar, x5.g());
        FrameLayout.LayoutParams a2 = x5.a(48.0f, 7.0f, 8.0f, 7.0f, 4.0f, -1, 51);
        ((ViewGroup.MarginLayoutParams) a2).topMargin += AndroidUtilities.statusBarHeight;
        frameLayout.addView(uiVar, a2);
        c00 c00Var = new c00(context, e6Var);
        this.E = c00Var;
        c00Var.c();
        addView(c00Var, x5.a(-1.0f, 0.0f, 52.0f, 0.0f, 0.0f, -1, 51));
        ai.w0 w0Var = new ai.w0(this, context, e6Var, 3);
        this.s = w0Var;
        w0Var.p1();
        this.c = w0Var;
        this.d = w0Var;
        this.h = true;
        this.f = true;
        NotificationCenter.getGlobalInstance().listen(w0Var, NotificationCenter.emojiLoaded, new ai.y1(this, 23));
        w0Var.setClipToPadding(false);
        getContext();
        f0 f0Var = new f0(this, AndroidUtilities.dp(9.0f), w0Var, 0);
        this.v = f0Var;
        w0Var.setLayoutManager(f0Var);
        f0Var.P = false;
        w0Var.setHorizontalScrollBarEnabled(false);
        w0Var.setVerticalScrollBarEnabled(false);
        w0Var.setClipToPadding(false);
        addView(w0Var, x5.a(-1.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1, 51));
        g0 g0Var = new g0(this, context);
        this.x = g0Var;
        w0Var.setAdapter(g0Var);
        w0Var.setGlowColor(i6.w0(i6.A5, this.a));
        w0Var.setOnItemClickListener(new ai.g(this, 10));
        w0Var.setOnScrollListener(new ai.r(this, 9));
        FrameLayout.LayoutParams e7 = x5.e(-1, 60, 51);
        ((ViewGroup.MarginLayoutParams) e7).height += AndroidUtilities.statusBarHeight;
        addView(frameLayout, e7);
        O();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getCurrentTop() {
        ai.w0 w0Var = this.s;
        if (w0Var.getChildCount() == 0) {
            return -1000;
        }
        int i10 = 0;
        View childAt = w0Var.getChildAt(0);
        am0 am0Var = (am0) w0Var.G(childAt);
        if (am0Var == null) {
            return -1000;
        }
        int paddingTop = w0Var.getPaddingTop();
        if (am0Var.b() == 0 && childAt.getTop() >= 0) {
            i10 = childAt.getTop();
        }
        return paddingTop - i10;
    }

    @Override // org.telegram.ui.Components.qi
    public final void C(int i10, int i11) {
        int i12;
        yi yiVar = this.b;
        if (yiVar.u1.R() > AndroidUtilities.dp(20.0f)) {
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
        this.s.o1(0, i12 + AndroidUtilities.statusBarHeight, 0, this.e);
    }

    @Override // org.telegram.ui.Components.qi
    public final void G(qi qiVar) {
        this.v.h1(0, 0);
    }

    @Override // org.telegram.ui.Components.qi
    public final void J() {
        this.s.x0(0);
    }

    public final void O() {
        this.E.setVisibility(this.s.getAdapter().h() == 2 ? 0 : 8);
        P();
    }

    public final void P() {
        View childAt;
        c00 c00Var = this.E;
        if (c00Var.getVisibility() == 0 && (childAt = this.s.getChildAt(0)) != null) {
            c00Var.setTranslationY((childAt.getTop() + (c00Var.getMeasuredHeight() - getMeasuredHeight())) / 2);
        }
    }

    @Override // org.telegram.ui.Components.qi
    public int getCurrentItemTop() {
        ai.w0 w0Var = this.s;
        if (w0Var.getChildCount() <= 0) {
            return ConnectionsManager.DEFAULT_DATACENTER_ID;
        }
        View childAt = w0Var.getChildAt(0);
        am0 am0Var = (am0) w0Var.G(childAt);
        int top = (childAt.getTop() - AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(8.0f);
        int i10 = (top <= 0 || am0Var == null || am0Var.b() != 0) ? 0 : top;
        me.b bVar = this.n;
        if (top < 0 || am0Var == null || am0Var.b() != 0) {
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
    public ArrayList<k6> getThemeDescriptions() {
        j6 j6Var = new j6() { // from class: hg.c0
            @Override // org.telegram.ui.ActionBar.j6
            public final void b() {
                ai.w0 w0Var = j0.this.s;
                if (w0Var != null) {
                    int childCount = w0Var.getChildCount();
                    for (int i10 = 0; i10 < childCount; i10++) {
                        w0Var.getChildAt(i10);
                    }
                }
            }

            @Override // org.telegram.ui.ActionBar.j6
            public final /* synthetic */ void a(float f7) {
            }
        };
        ArrayList<k6> arrayList = new ArrayList<>();
        arrayList.add(new k6(this.E, 4, null, null, null, null, i6.c7));
        arrayList.add(new k6(this.E, 2048, null, null, null, null, i6.h6));
        int i10 = i6.A5;
        ai.w0 w0Var = this.s;
        arrayList.add(new k6(w0Var, 32768, null, null, null, null, i10));
        arrayList.add(new k6(w0Var, 4096, null, null, null, null, i6.i6));
        arrayList.add(new k6(w0Var, 0, new Class[]{View.class}, i6.k0, null, null, i6.d7));
        int i11 = i6.q5;
        arrayList.add(new k6(w0Var, 0, new Class[]{i0.class}, new String[]{"nameTextView"}, null, null, -1, null, i11));
        arrayList.add(new k6(w0Var, 0, new Class[]{i0.class}, new String[]{"statusTextView"}, null, null, -1, j6Var, i11));
        arrayList.add(new k6(w0Var, 0, new Class[]{i0.class}, null, i6.r0, null, i6.J7));
        arrayList.add(new k6(null, 0, null, null, null, j6Var, i6.O7));
        arrayList.add(new k6(null, 0, null, null, null, j6Var, i6.P7));
        arrayList.add(new k6(null, 0, null, null, null, j6Var, i6.Q7));
        arrayList.add(new k6(null, 0, null, null, null, j6Var, i6.R7));
        arrayList.add(new k6(null, 0, null, null, null, j6Var, i6.S7));
        arrayList.add(new k6(null, 0, null, null, null, j6Var, i6.T7));
        arrayList.add(new k6(null, 0, null, null, null, j6Var, i6.U7));
        return arrayList;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        P();
    }

    @Override // android.view.View
    public void setTranslationY(float f7) {
        super.setTranslationY(f7);
        this.b.getSheetContainer().invalidate();
    }

    public void setupBlurredSearchField(ah.c cVar) {
        ui uiVar = this.F;
        if (uiVar != null) {
            uiVar.setupBlurredBackground(cVar.c(uiVar, eh.b.a(this.a), false));
        }
    }

    @Override // org.telegram.ui.Components.qi
    public final void p() {
    }

    @Override // me.d
    public final /* synthetic */ void A(float f7, int i10) {
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
    }

    @Override // me.d
    public final void n(int i10, float f7, float f10, me.e eVar) {
    }
}
