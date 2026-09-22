package hg;

import android.content.Context;
import android.graphics.Point;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import ci.h2;
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
import org.telegram.ui.Components.il0;
import org.telegram.ui.Components.mz;
import org.telegram.ui.Components.ni;
import org.telegram.ui.Components.qr;
import org.telegram.ui.Components.ri;
import org.telegram.ui.Components.ui;
import org.telegram.ui.Components.vi;
import w7.y5;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class i0 extends ni implements NotificationCenter.NotificationCenterDelegate, le.d {
    public final mz E;
    public final ri F;
    public final le.b n;
    public final FrameLayout r;
    public final ai.w0 s;
    public final e0 v;
    public final HashSet w;
    public final f0 x;
    public final g0 y;

    public i0(Context context, f6 f6Var, vi viVar) {
        super(context, f6Var, viVar);
        this.n = new le.b(0, this, qr.h, 380L, false);
        this.w = new HashSet();
        this.y = new g0(this, context);
        ui uiVar = new ui(context, j6.d6, f6Var);
        uiVar.setVisibility(4);
        FrameLayout frameLayout = new FrameLayout(context);
        this.r = frameLayout;
        ri riVar = new ri(context, f6Var, this.b);
        this.F = riVar;
        riVar.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
        c0 c0Var = new c0(this);
        h2 h2Var = riVar.r;
        h2Var.addTextChangedListener(c0Var);
        h2Var.setHint(LocaleController.getString(R.string.BusinessRepliesSearch));
        frameLayout.addView(uiVar, y5.g());
        FrameLayout.LayoutParams d = y5.d(-1, 48.0f, 51, 7.0f, 8.0f, 7.0f, 4.0f);
        ((ViewGroup.MarginLayoutParams) d).topMargin += AndroidUtilities.statusBarHeight;
        frameLayout.addView(riVar, d);
        mz mzVar = new mz(context, f6Var);
        this.E = mzVar;
        mzVar.c();
        addView(mzVar, y5.d(-1, -1.0f, 51, 0.0f, 52.0f, 0.0f, 0.0f));
        ai.w0 w0Var = new ai.w0(this, context, f6Var, 3);
        this.s = w0Var;
        w0Var.q1();
        this.c = w0Var;
        this.d = w0Var;
        this.h = true;
        this.f = true;
        NotificationCenter.getGlobalInstance().listen(w0Var, NotificationCenter.emojiLoaded, new ai.y1(this, 20));
        w0Var.setClipToPadding(false);
        getContext();
        e0 e0Var = new e0(this, AndroidUtilities.dp(9.0f), w0Var, 0);
        this.v = e0Var;
        w0Var.setLayoutManager(e0Var);
        e0Var.P = false;
        w0Var.setHorizontalScrollBarEnabled(false);
        w0Var.setVerticalScrollBarEnabled(false);
        w0Var.setClipToPadding(false);
        addView(w0Var, y5.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        f0 f0Var = new f0(this, context);
        this.x = f0Var;
        w0Var.setAdapter(f0Var);
        w0Var.setGlowColor(j6.v0(j6.A5, this.a));
        int i10 = 10;
        w0Var.setOnItemClickListener(new ai.g(this, i10));
        w0Var.setOnScrollListener(new ai.r(this, i10));
        FrameLayout.LayoutParams e = y5.e(-1, 60, 51);
        ((ViewGroup.MarginLayoutParams) e).height += AndroidUtilities.statusBarHeight;
        addView(frameLayout, e);
        L();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getCurrentTop() {
        ai.w0 w0Var = this.s;
        if (w0Var.getChildCount() == 0) {
            return -1000;
        }
        int i10 = 0;
        View childAt = w0Var.getChildAt(0);
        il0 il0Var = (il0) w0Var.H(childAt);
        if (il0Var == null) {
            return -1000;
        }
        int paddingTop = w0Var.getPaddingTop();
        if (il0Var.b() == 0 && childAt.getTop() >= 0) {
            i10 = childAt.getTop();
        }
        return paddingTop - i10;
    }

    @Override // org.telegram.ui.Components.ni
    public final void D(ni niVar) {
        this.v.h1(0, 0);
    }

    @Override // org.telegram.ui.Components.ni
    public final void F() {
        this.s.y0(0);
    }

    public final void L() {
        this.E.setVisibility(this.s.getAdapter().h() == 2 ? 0 : 8);
        M();
    }

    public final void M() {
        View childAt;
        mz mzVar = this.E;
        if (mzVar.getVisibility() == 0 && (childAt = this.s.getChildAt(0)) != null) {
            mzVar.setTranslationY((childAt.getTop() + (mzVar.getMeasuredHeight() - getMeasuredHeight())) / 2);
        }
    }

    @Override // org.telegram.ui.Components.ni
    public int getCurrentItemTop() {
        ai.w0 w0Var = this.s;
        if (w0Var.getChildCount() <= 0) {
            return ConnectionsManager.DEFAULT_DATACENTER_ID;
        }
        View childAt = w0Var.getChildAt(0);
        il0 il0Var = (il0) w0Var.H(childAt);
        int top = (childAt.getTop() - AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(8.0f);
        int i10 = (top <= 0 || il0Var == null || il0Var.b() != 0) ? 0 : top;
        le.b bVar = this.n;
        if (top < 0 || il0Var == null || il0Var.b() != 0) {
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
    public ArrayList<l6> getThemeDescriptions() {
        k6 k6Var = new k6() { // from class: hg.b0
            @Override // org.telegram.ui.ActionBar.k6
            public final void b() {
                ai.w0 w0Var = i0.this.s;
                if (w0Var != null) {
                    int childCount = w0Var.getChildCount();
                    for (int i10 = 0; i10 < childCount; i10++) {
                        w0Var.getChildAt(i10);
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
        ai.w0 w0Var = this.s;
        arrayList.add(new l6(w0Var, 32768, null, null, null, null, i10));
        arrayList.add(new l6(w0Var, 4096, null, null, null, null, j6.i6));
        arrayList.add(new l6(w0Var, 0, new Class[]{View.class}, j6.k0, null, null, j6.d7));
        int i11 = j6.q5;
        arrayList.add(new l6(w0Var, 0, new Class[]{h0.class}, new String[]{"nameTextView"}, null, null, -1, null, i11));
        arrayList.add(new l6(w0Var, 0, new Class[]{h0.class}, new String[]{"statusTextView"}, null, null, -1, k6Var, i11));
        arrayList.add(new l6(w0Var, 0, new Class[]{h0.class}, null, j6.r0, null, j6.J7));
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

    public void setupBlurredSearchField(ah.c cVar) {
        ri riVar = this.F;
        if (riVar != null) {
            riVar.setupBlurredBackground(cVar.c(riVar, eh.b.a(this.a), false));
        }
    }

    @Override // org.telegram.ui.Components.ni
    public final void y(int i10, int i11) {
        int i12;
        vi viVar = this.b;
        if (viVar.r1.R() > AndroidUtilities.dp(20.0f)) {
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
        this.s.p1(0, i12 + AndroidUtilities.statusBarHeight, 0, this.e);
    }

    @Override // org.telegram.ui.Components.ni
    public final void m() {
    }

    @Override // le.d
    public final /* synthetic */ void C(float f7, int i10) {
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
    }

    @Override // le.d
    public final void H(int i10, float f7, float f10, le.e eVar) {
    }
}
