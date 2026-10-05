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
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.il0;
import org.telegram.ui.Components.pi;
import org.telegram.ui.Components.pz;
import org.telegram.ui.Components.ti;
import org.telegram.ui.Components.tr;
import org.telegram.ui.Components.wi;
import org.telegram.ui.Components.xi;
import w7.z5;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final class j0 extends pi implements NotificationCenter.NotificationCenterDelegate, le.d {
    public final pz E;
    public final ti F;
    public final le.b n;
    public final FrameLayout r;
    public final ai.w0 s;
    public final f0 v;
    public final HashSet w;
    public final g0 x;
    public final h0 y;

    public j0(Context context, d6 d6Var, xi xiVar) {
        super(context, d6Var, xiVar);
        this.n = new le.b(0, this, tr.h, 380L, false);
        this.w = new HashSet();
        this.y = new h0(this, context);
        wi wiVar = new wi(context, i6.d6, d6Var);
        wiVar.setVisibility(4);
        FrameLayout frameLayout = new FrameLayout(context);
        this.r = frameLayout;
        ti tiVar = new ti(context, d6Var, this.b);
        this.F = tiVar;
        tiVar.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
        d0 d0Var = new d0(this);
        h2 h2Var = tiVar.r;
        h2Var.addTextChangedListener(d0Var);
        h2Var.setHint(LocaleController.getString(R.string.BusinessRepliesSearch));
        frameLayout.addView(wiVar, z5.g());
        FrameLayout.LayoutParams d = z5.d(-1, 48.0f, 51, 7.0f, 8.0f, 7.0f, 4.0f);
        ((ViewGroup.MarginLayoutParams) d).topMargin += AndroidUtilities.statusBarHeight;
        frameLayout.addView(tiVar, d);
        pz pzVar = new pz(context, d6Var);
        this.E = pzVar;
        pzVar.c();
        addView(pzVar, z5.d(-1, -1.0f, 51, 0.0f, 52.0f, 0.0f, 0.0f));
        ai.w0 w0Var = new ai.w0(this, context, d6Var, 3);
        this.s = w0Var;
        w0Var.r1();
        setBlur3Capture(w0Var);
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
        addView(w0Var, z5.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        g0 g0Var = new g0(this, context);
        this.x = g0Var;
        w0Var.setAdapter(g0Var);
        w0Var.setGlowColor(i6.v0(i6.A5, this.a));
        int i10 = 10;
        w0Var.setOnItemClickListener(new ai.g(this, i10));
        w0Var.setOnScrollListener(new ai.r(this, i10));
        FrameLayout.LayoutParams e7 = z5.e(-1, 60, 51);
        ((ViewGroup.MarginLayoutParams) e7).height += AndroidUtilities.statusBarHeight;
        addView(frameLayout, e7);
        J();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getCurrentTop() {
        ai.w0 w0Var = this.s;
        if (w0Var.getChildCount() == 0) {
            return -1000;
        }
        int i10 = 0;
        View childAt = w0Var.getChildAt(0);
        il0 il0Var = (il0) w0Var.G(childAt);
        if (il0Var == null) {
            return -1000;
        }
        int paddingTop = w0Var.getPaddingTop();
        if (il0Var.b() == 0 && childAt.getTop() >= 0) {
            i10 = childAt.getTop();
        }
        return paddingTop - i10;
    }

    @Override // org.telegram.ui.Components.pi
    public final void C(pi piVar) {
        this.v.h1(0, 0);
    }

    @Override // org.telegram.ui.Components.pi
    public final void E() {
        this.s.y0(0);
    }

    public final void J() {
        this.E.setVisibility(this.s.getAdapter().h() == 2 ? 0 : 8);
        K();
    }

    public final void K() {
        View childAt;
        pz pzVar = this.E;
        if (pzVar.getVisibility() == 0 && (childAt = this.s.getChildAt(0)) != null) {
            pzVar.setTranslationY((childAt.getTop() + (pzVar.getMeasuredHeight() - getMeasuredHeight())) / 2);
        }
    }

    @Override // org.telegram.ui.Components.pi
    public int getCurrentItemTop() {
        ai.w0 w0Var = this.s;
        if (w0Var.getChildCount() <= 0) {
            return ConnectionsManager.DEFAULT_DATACENTER_ID;
        }
        View childAt = w0Var.getChildAt(0);
        il0 il0Var = (il0) w0Var.G(childAt);
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

    @Override // org.telegram.ui.Components.pi
    public int getFirstOffset() {
        return AndroidUtilities.dp(4.0f) + getListTopPadding();
    }

    @Override // org.telegram.ui.Components.pi
    public int getListTopPadding() {
        return this.s.getPaddingTop();
    }

    @Override // org.telegram.ui.Components.pi
    public int getSelectedItemsCount() {
        return 0;
    }

    @Override // org.telegram.ui.Components.pi
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
        K();
    }

    @Override // android.view.View
    public void setTranslationY(float f7) {
        super.setTranslationY(f7);
        this.b.getSheetContainer().invalidate();
    }

    public void setupBlurredSearchField(ah.c cVar) {
        ti tiVar = this.F;
        if (tiVar != null) {
            tiVar.setupBlurredBackground(cVar.c(tiVar, eh.b.a(this.a), false));
        }
    }

    @Override // org.telegram.ui.Components.pi
    public final void y(int i10, int i11) {
        int i12;
        xi xiVar = this.b;
        if (xiVar.r1.R() > AndroidUtilities.dp(20.0f)) {
            i12 = AndroidUtilities.dp(8.0f);
            xiVar.setAllowNestedScroll(false);
        } else {
            if (!AndroidUtilities.isTablet()) {
                Point point = AndroidUtilities.displaySize;
                if (point.x > point.y) {
                    i12 = (int) (i11 / 3.5f);
                    xiVar.setAllowNestedScroll(true);
                }
            }
            i12 = (i11 / 5) * 2;
            xiVar.setAllowNestedScroll(true);
        }
        this.s.q1(0, i12 + AndroidUtilities.statusBarHeight, 0, this.e);
    }

    @Override // org.telegram.ui.Components.pi
    public final void m() {
    }

    @Override // le.d
    public final /* synthetic */ void V(float f7, int i10) {
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
    }

    @Override // le.d
    public final void a0(int i10, float f7, float f10, le.e eVar) {
    }
}
