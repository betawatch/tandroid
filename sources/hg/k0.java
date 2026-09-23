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
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.nz;
import org.telegram.ui.Components.oi;
import org.telegram.ui.Components.rr;
import org.telegram.ui.Components.si;
import org.telegram.ui.Components.vi;
import org.telegram.ui.Components.wi;
import org.telegram.ui.Components.wk0;
import w7.x5;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class k0 extends oi implements NotificationCenter.NotificationCenterDelegate, le.e {
    public final nz E;
    public final si F;
    public final le.c n;
    public final FrameLayout r;
    public final ai.w0 s;
    public final g0 v;
    public final HashSet w;
    public final h0 x;
    public final i0 y;

    public k0(Context context, d6 d6Var, wi wiVar) {
        super(context, d6Var, wiVar);
        this.n = new le.c(0, this, rr.h, 380L, false);
        this.w = new HashSet();
        this.y = new i0(this, context);
        vi viVar = new vi(context, h6.d6, d6Var);
        viVar.setVisibility(4);
        FrameLayout frameLayout = new FrameLayout(context);
        this.r = frameLayout;
        si siVar = new si(context, d6Var, this.b);
        this.F = siVar;
        siVar.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
        e0 e0Var = new e0(this);
        h2 h2Var = siVar.r;
        h2Var.addTextChangedListener(e0Var);
        h2Var.setHint(LocaleController.getString(R.string.BusinessRepliesSearch));
        frameLayout.addView(viVar, x5.g());
        FrameLayout.LayoutParams d = x5.d(-1, 48.0f, 51, 7.0f, 8.0f, 7.0f, 4.0f);
        ((ViewGroup.MarginLayoutParams) d).topMargin += AndroidUtilities.statusBarHeight;
        frameLayout.addView(siVar, d);
        nz nzVar = new nz(context, d6Var);
        this.E = nzVar;
        nzVar.c();
        addView(nzVar, x5.d(-1, -1.0f, 51, 0.0f, 52.0f, 0.0f, 0.0f));
        ai.w0 w0Var = new ai.w0(this, context, d6Var, 3);
        this.s = w0Var;
        w0Var.p1();
        this.c = w0Var;
        this.d = w0Var;
        this.h = true;
        this.f = true;
        NotificationCenter.getGlobalInstance().listen(w0Var, NotificationCenter.emojiLoaded, new ai.y1(this, 23));
        w0Var.setClipToPadding(false);
        getContext();
        g0 g0Var = new g0(this, AndroidUtilities.dp(9.0f), w0Var, 0);
        this.v = g0Var;
        w0Var.setLayoutManager(g0Var);
        g0Var.P = false;
        w0Var.setHorizontalScrollBarEnabled(false);
        w0Var.setVerticalScrollBarEnabled(false);
        w0Var.setClipToPadding(false);
        addView(w0Var, x5.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        h0 h0Var = new h0(this, context);
        this.x = h0Var;
        w0Var.setAdapter(h0Var);
        w0Var.setGlowColor(h6.v0(h6.A5, this.a));
        w0Var.setOnItemClickListener(new ai.g(this, 10));
        w0Var.setOnScrollListener(new ai.r(this, 9));
        FrameLayout.LayoutParams e = x5.e(-1, 60, 51);
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
        wk0 wk0Var = (wk0) w0Var.G(childAt);
        if (wk0Var == null) {
            return -1000;
        }
        int paddingTop = w0Var.getPaddingTop();
        if (wk0Var.b() == 0 && childAt.getTop() >= 0) {
            i10 = childAt.getTop();
        }
        return paddingTop - i10;
    }

    @Override // org.telegram.ui.Components.oi
    public final void E(oi oiVar) {
        this.v.h1(0, 0);
    }

    @Override // org.telegram.ui.Components.oi
    public final void G() {
        this.s.x0(0);
    }

    public final void L() {
        this.E.setVisibility(this.s.getAdapter().h() == 2 ? 0 : 8);
        M();
    }

    public final void M() {
        View childAt;
        nz nzVar = this.E;
        if (nzVar.getVisibility() == 0 && (childAt = this.s.getChildAt(0)) != null) {
            nzVar.setTranslationY((childAt.getTop() + (nzVar.getMeasuredHeight() - getMeasuredHeight())) / 2);
        }
    }

    @Override // org.telegram.ui.Components.oi
    public int getCurrentItemTop() {
        ai.w0 w0Var = this.s;
        if (w0Var.getChildCount() <= 0) {
            return ConnectionsManager.DEFAULT_DATACENTER_ID;
        }
        View childAt = w0Var.getChildAt(0);
        wk0 wk0Var = (wk0) w0Var.G(childAt);
        int top = (childAt.getTop() - AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(8.0f);
        int i10 = (top <= 0 || wk0Var == null || wk0Var.b() != 0) ? 0 : top;
        le.c cVar = this.n;
        if (top < 0 || wk0Var == null || wk0Var.b() != 0) {
            cVar.a(true, true);
            top = i10;
        } else {
            cVar.a(false, true);
        }
        this.r.setTranslationY(top);
        return AndroidUtilities.dp(12.0f) + top;
    }

    @Override // org.telegram.ui.Components.oi
    public int getFirstOffset() {
        return AndroidUtilities.dp(4.0f) + getListTopPadding();
    }

    @Override // org.telegram.ui.Components.oi
    public int getListTopPadding() {
        return this.s.getPaddingTop();
    }

    @Override // org.telegram.ui.Components.oi
    public int getSelectedItemsCount() {
        return 0;
    }

    @Override // org.telegram.ui.Components.oi
    public ArrayList<j6> getThemeDescriptions() {
        i6 i6Var = new i6() { // from class: hg.d0
            @Override // org.telegram.ui.ActionBar.i6
            public final void b() {
                ai.w0 w0Var = k0.this.s;
                if (w0Var != null) {
                    int childCount = w0Var.getChildCount();
                    for (int i10 = 0; i10 < childCount; i10++) {
                        w0Var.getChildAt(i10);
                    }
                }
            }

            @Override // org.telegram.ui.ActionBar.i6
            public final /* synthetic */ void a(float f7) {
            }
        };
        ArrayList<j6> arrayList = new ArrayList<>();
        arrayList.add(new j6(this.E, 4, null, null, null, null, h6.c7));
        arrayList.add(new j6(this.E, 2048, null, null, null, null, h6.h6));
        int i10 = h6.A5;
        ai.w0 w0Var = this.s;
        arrayList.add(new j6(w0Var, 32768, null, null, null, null, i10));
        arrayList.add(new j6(w0Var, 4096, null, null, null, null, h6.i6));
        arrayList.add(new j6(w0Var, 0, new Class[]{View.class}, h6.k0, null, null, h6.d7));
        int i11 = h6.q5;
        arrayList.add(new j6(w0Var, 0, new Class[]{j0.class}, new String[]{"nameTextView"}, null, null, -1, null, i11));
        arrayList.add(new j6(w0Var, 0, new Class[]{j0.class}, new String[]{"statusTextView"}, null, null, -1, i6Var, i11));
        arrayList.add(new j6(w0Var, 0, new Class[]{j0.class}, null, h6.r0, null, h6.J7));
        arrayList.add(new j6(null, 0, null, null, null, i6Var, h6.O7));
        arrayList.add(new j6(null, 0, null, null, null, i6Var, h6.P7));
        arrayList.add(new j6(null, 0, null, null, null, i6Var, h6.Q7));
        arrayList.add(new j6(null, 0, null, null, null, i6Var, h6.R7));
        arrayList.add(new j6(null, 0, null, null, null, i6Var, h6.S7));
        arrayList.add(new j6(null, 0, null, null, null, i6Var, h6.T7));
        arrayList.add(new j6(null, 0, null, null, null, i6Var, h6.U7));
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
        si siVar = this.F;
        if (siVar != null) {
            siVar.setupBlurredBackground(cVar.c(siVar, eh.b.a(this.a), false));
        }
    }

    @Override // org.telegram.ui.Components.oi
    public final void y(int i10, int i11) {
        int i12;
        wi wiVar = this.b;
        if (wiVar.r1.R() > AndroidUtilities.dp(20.0f)) {
            i12 = AndroidUtilities.dp(8.0f);
            wiVar.setAllowNestedScroll(false);
        } else {
            if (!AndroidUtilities.isTablet()) {
                Point point = AndroidUtilities.displaySize;
                if (point.x > point.y) {
                    i12 = (int) (i11 / 3.5f);
                    wiVar.setAllowNestedScroll(true);
                }
            }
            i12 = (i11 / 5) * 2;
            wiVar.setAllowNestedScroll(true);
        }
        this.s.o1(0, i12 + AndroidUtilities.statusBarHeight, 0, this.e);
    }

    @Override // org.telegram.ui.Components.oi
    public final void m() {
    }

    @Override // le.e
    public final /* synthetic */ void C(float f7, int i10) {
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
    }

    @Override // le.e
    public final void D(int i10, float f7, float f10, le.f fVar) {
    }
}
