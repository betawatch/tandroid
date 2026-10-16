package ig;

import android.content.Context;
import android.graphics.Point;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import di.g2;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.es;
import org.telegram.ui.Components.ni;
import org.telegram.ui.Components.ri;
import org.telegram.ui.Components.ui;
import org.telegram.ui.Components.vi;
import org.telegram.ui.Components.wl0;
import org.telegram.ui.Components.yz;
import w7.z5;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class i0 extends ni implements NotificationCenter.NotificationCenterDelegate, ne.d {
    public final yz E;
    public final ri F;
    public final ne.b n;
    public final FrameLayout r;
    public final bi.o0 s;
    public final e0 v;
    public final HashSet w;
    public final f0 x;
    public final g0 y;

    public i0(Context context, c6 c6Var, vi viVar) {
        super(context, c6Var, viVar);
        this.n = new ne.b(0, this, es.h, 380L, false);
        this.w = new HashSet();
        this.y = new g0(this, context);
        ui uiVar = new ui(context, g6.d6, c6Var);
        uiVar.setVisibility(4);
        FrameLayout frameLayout = new FrameLayout(context);
        this.r = frameLayout;
        ri riVar = new ri(context, c6Var, this.b);
        this.F = riVar;
        riVar.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
        c0 c0Var = new c0(this);
        g2 g2Var = riVar.r;
        g2Var.addTextChangedListener(c0Var);
        g2Var.setHint(LocaleController.getString(R.string.BusinessRepliesSearch));
        frameLayout.addView(uiVar, z5.g());
        FrameLayout.LayoutParams a2 = z5.a(48.0f, 7.0f, 8.0f, 7.0f, 4.0f, -1, 51);
        ((ViewGroup.MarginLayoutParams) a2).topMargin += AndroidUtilities.statusBarHeight;
        frameLayout.addView(riVar, a2);
        yz yzVar = new yz(context, c6Var);
        this.E = yzVar;
        yzVar.c();
        addView(yzVar, z5.a(-1.0f, 0.0f, 52.0f, 0.0f, 0.0f, -1, 51));
        bi.o0 o0Var = new bi.o0(this, context, c6Var, 3);
        this.s = o0Var;
        o0Var.p1();
        this.c = o0Var;
        this.d = o0Var;
        this.h = true;
        this.f = true;
        NotificationCenter.getGlobalInstance().listen(o0Var, NotificationCenter.emojiLoaded, new bi.o1(this, 23));
        o0Var.setClipToPadding(false);
        getContext();
        e0 e0Var = new e0(this, AndroidUtilities.dp(9.0f), o0Var, 0);
        this.v = e0Var;
        o0Var.setLayoutManager(e0Var);
        e0Var.P = false;
        o0Var.setHorizontalScrollBarEnabled(false);
        o0Var.setVerticalScrollBarEnabled(false);
        o0Var.setClipToPadding(false);
        addView(o0Var, z5.a(-1.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1, 51));
        f0 f0Var = new f0(this, context);
        this.x = f0Var;
        o0Var.setAdapter(f0Var);
        o0Var.setGlowColor(g6.w0(g6.A5, this.a));
        int i10 = 10;
        o0Var.setOnItemClickListener(new bi.d(this, i10));
        o0Var.setOnScrollListener(new ah.d0(this, i10));
        FrameLayout.LayoutParams e = z5.e(-1, 60, 51);
        ((ViewGroup.MarginLayoutParams) e).height += AndroidUtilities.statusBarHeight;
        addView(frameLayout, e);
        O();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getCurrentTop() {
        bi.o0 o0Var = this.s;
        if (o0Var.getChildCount() == 0) {
            return -1000;
        }
        int i10 = 0;
        View childAt = o0Var.getChildAt(0);
        wl0 wl0Var = (wl0) o0Var.G(childAt);
        if (wl0Var == null) {
            return -1000;
        }
        int paddingTop = o0Var.getPaddingTop();
        if (wl0Var.b() == 0 && childAt.getTop() >= 0) {
            i10 = childAt.getTop();
        }
        return paddingTop - i10;
    }

    @Override // org.telegram.ui.Components.ni
    public final void C(int i10, int i11) {
        int i12;
        vi viVar = this.b;
        if (viVar.u1.R() > AndroidUtilities.dp(20.0f)) {
            i12 = AndroidUtilities.dp(8.0f);
            viVar.setAllowNestedScroll(false);
        } else {
            if (!AndroidUtilities.isTablet()) {
                Point point = AndroidUtilities.displaySize;
                if (point.x > point.y) {
                    i12 = (int) (i11 / 3.5f);
                    viVar.setAllowNestedScroll(true);
                }
            }
            i12 = (i11 / 5) * 2;
            viVar.setAllowNestedScroll(true);
        }
        this.s.o1(0, i12 + AndroidUtilities.statusBarHeight, 0, this.e);
    }

    @Override // org.telegram.ui.Components.ni
    public final void G(ni niVar) {
        this.v.h1(0, 0);
    }

    @Override // org.telegram.ui.Components.ni
    public final void J() {
        this.s.x0(0);
    }

    public final void O() {
        this.E.setVisibility(this.s.getAdapter().h() == 2 ? 0 : 8);
        P();
    }

    public final void P() {
        View childAt;
        yz yzVar = this.E;
        if (yzVar.getVisibility() == 0 && (childAt = this.s.getChildAt(0)) != null) {
            yzVar.setTranslationY((childAt.getTop() + (yzVar.getMeasuredHeight() - getMeasuredHeight())) / 2);
        }
    }

    @Override // org.telegram.ui.Components.ni
    public int getCurrentItemTop() {
        bi.o0 o0Var = this.s;
        if (o0Var.getChildCount() <= 0) {
            return ConnectionsManager.DEFAULT_DATACENTER_ID;
        }
        View childAt = o0Var.getChildAt(0);
        wl0 wl0Var = (wl0) o0Var.G(childAt);
        int top = (childAt.getTop() - AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(8.0f);
        int i10 = (top <= 0 || wl0Var == null || wl0Var.b() != 0) ? 0 : top;
        ne.b bVar = this.n;
        if (top < 0 || wl0Var == null || wl0Var.b() != 0) {
            bVar.a(true, true);
            top = i10;
        } else {
            bVar.a(false, true);
        }
        this.r.setTranslationY(top);
        return AndroidUtilities.dp(12.0f) + top;
    }

    @Override // org.telegram.ui.Components.ni
    public int getFirstOffset() {
        return AndroidUtilities.dp(4.0f) + getListTopPadding();
    }

    @Override // org.telegram.ui.Components.ni
    public int getListTopPadding() {
        return this.s.getPaddingTop();
    }

    @Override // org.telegram.ui.Components.ni
    public int getSelectedItemsCount() {
        return 0;
    }

    @Override // org.telegram.ui.Components.ni
    public ArrayList<i6> getThemeDescriptions() {
        h6 h6Var = new h6() { // from class: ig.b0
            @Override // org.telegram.ui.ActionBar.h6
            public final void b() {
                bi.o0 o0Var = i0.this.s;
                if (o0Var != null) {
                    int childCount = o0Var.getChildCount();
                    for (int i10 = 0; i10 < childCount; i10++) {
                        o0Var.getChildAt(i10);
                    }
                }
            }

            @Override // org.telegram.ui.ActionBar.h6
            public final /* synthetic */ void a(float f7) {
            }
        };
        ArrayList<i6> arrayList = new ArrayList<>();
        arrayList.add(new i6(this.E, 4, null, null, null, null, g6.c7));
        arrayList.add(new i6(this.E, 2048, null, null, null, null, g6.h6));
        int i10 = g6.A5;
        bi.o0 o0Var = this.s;
        arrayList.add(new i6(o0Var, 32768, null, null, null, null, i10));
        arrayList.add(new i6(o0Var, 4096, null, null, null, null, g6.i6));
        arrayList.add(new i6(o0Var, 0, new Class[]{View.class}, g6.k0, null, null, g6.d7));
        int i11 = g6.q5;
        arrayList.add(new i6(o0Var, 0, new Class[]{h0.class}, new String[]{"nameTextView"}, null, null, -1, null, i11));
        arrayList.add(new i6(o0Var, 0, new Class[]{h0.class}, new String[]{"statusTextView"}, null, null, -1, h6Var, i11));
        arrayList.add(new i6(o0Var, 0, new Class[]{h0.class}, null, g6.r0, null, g6.J7));
        arrayList.add(new i6(null, 0, null, null, null, h6Var, g6.O7));
        arrayList.add(new i6(null, 0, null, null, null, h6Var, g6.P7));
        arrayList.add(new i6(null, 0, null, null, null, h6Var, g6.Q7));
        arrayList.add(new i6(null, 0, null, null, null, h6Var, g6.R7));
        arrayList.add(new i6(null, 0, null, null, null, h6Var, g6.S7));
        arrayList.add(new i6(null, 0, null, null, null, h6Var, g6.T7));
        arrayList.add(new i6(null, 0, null, null, null, h6Var, g6.U7));
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

    public void setupBlurredSearchField(bh.b bVar) {
        ri riVar = this.F;
        if (riVar != null) {
            riVar.setupBlurredBackground(bVar.c(riVar, fh.b.a(this.a), false));
        }
    }

    @Override // org.telegram.ui.Components.ni
    public final void o() {
    }

    @Override // ne.d
    public final /* synthetic */ void A(float f7, int i10) {
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
    }

    @Override // ne.d
    public final void p(int i10, float f7, float f10, ne.e eVar) {
    }
}
