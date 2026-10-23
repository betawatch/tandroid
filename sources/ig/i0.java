package ig;

import ai.wa;
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
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.li;
import org.telegram.ui.Components.pi;
import org.telegram.ui.Components.si;
import org.telegram.ui.Components.ti;
import org.telegram.ui.Components.tl0;
import org.telegram.ui.Components.vz;
import w7.z5;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes3.dex */
public final class i0 extends li implements NotificationCenter.NotificationCenterDelegate, ne.d {
    public final vz E;
    public final pi F;
    public final ne.b n;
    public final FrameLayout r;
    public final ai.u1 s;
    public final e0 v;
    public final HashSet w;
    public final f0 x;
    public final g0 y;

    public i0(Context context, d6 d6Var, ti tiVar) {
        super(context, d6Var, tiVar);
        this.n = new ne.b(0, this, bs.h, 380L, false);
        this.w = new HashSet();
        this.y = new g0(this, context);
        si siVar = new si(context, h6.d6, d6Var);
        siVar.setVisibility(4);
        FrameLayout frameLayout = new FrameLayout(context);
        this.r = frameLayout;
        pi piVar = new pi(context, d6Var, this.b);
        this.F = piVar;
        piVar.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
        c0 c0Var = new c0(this);
        ei.e2 e2Var = piVar.r;
        e2Var.addTextChangedListener(c0Var);
        e2Var.setHint(LocaleController.getString(R.string.BusinessRepliesSearch));
        frameLayout.addView(siVar, z5.g());
        FrameLayout.LayoutParams d = z5.d(-1, 48.0f, 51, 7.0f, 8.0f, 7.0f, 4.0f);
        ((ViewGroup.MarginLayoutParams) d).topMargin += AndroidUtilities.statusBarHeight;
        frameLayout.addView(piVar, d);
        vz vzVar = new vz(context, d6Var);
        this.E = vzVar;
        vzVar.c();
        addView(vzVar, z5.d(-1, -1.0f, 51, 0.0f, 52.0f, 0.0f, 0.0f));
        ai.u1 u1Var = new ai.u1(this, context, d6Var, 4);
        this.s = u1Var;
        u1Var.p1();
        this.c = u1Var;
        this.d = u1Var;
        this.h = true;
        this.f = true;
        NotificationCenter.getGlobalInstance().listen(u1Var, NotificationCenter.emojiLoaded, new ai.r0(this, 29));
        u1Var.setClipToPadding(false);
        getContext();
        e0 e0Var = new e0(this, AndroidUtilities.dp(9.0f), u1Var, 0);
        this.v = e0Var;
        u1Var.setLayoutManager(e0Var);
        e0Var.P = false;
        u1Var.setHorizontalScrollBarEnabled(false);
        u1Var.setVerticalScrollBarEnabled(false);
        u1Var.setClipToPadding(false);
        addView(u1Var, z5.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        f0 f0Var = new f0(this, context);
        this.x = f0Var;
        u1Var.setAdapter(f0Var);
        u1Var.setGlowColor(h6.w0(h6.A5, this.a));
        int i10 = 14;
        u1Var.setOnItemClickListener(new wa(this, i10));
        u1Var.setOnScrollListener(new ah.d0(this, i10));
        FrameLayout.LayoutParams e = z5.e(-1, 60, 51);
        ((ViewGroup.MarginLayoutParams) e).height += AndroidUtilities.statusBarHeight;
        addView(frameLayout, e);
        O();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getCurrentTop() {
        ai.u1 u1Var = this.s;
        if (u1Var.getChildCount() == 0) {
            return -1000;
        }
        int i10 = 0;
        View childAt = u1Var.getChildAt(0);
        tl0 tl0Var = (tl0) u1Var.G(childAt);
        if (tl0Var == null) {
            return -1000;
        }
        int paddingTop = u1Var.getPaddingTop();
        if (tl0Var.b() == 0 && childAt.getTop() >= 0) {
            i10 = childAt.getTop();
        }
        return paddingTop - i10;
    }

    @Override // org.telegram.ui.Components.li
    public final void B(int i10, int i11) {
        int i12;
        ti tiVar = this.b;
        if (tiVar.u1.R() > AndroidUtilities.dp(20.0f)) {
            i12 = AndroidUtilities.dp(8.0f);
            tiVar.setAllowNestedScroll(false);
        } else {
            if (!AndroidUtilities.isTablet()) {
                Point point = AndroidUtilities.displaySize;
                if (point.x > point.y) {
                    i12 = (int) (i11 / 3.5f);
                    tiVar.setAllowNestedScroll(true);
                }
            }
            i12 = (i11 / 5) * 2;
            tiVar.setAllowNestedScroll(true);
        }
        this.s.o1(0, i12 + AndroidUtilities.statusBarHeight, 0, this.e);
    }

    @Override // org.telegram.ui.Components.li
    public final void F(li liVar) {
        this.v.h1(0, 0);
    }

    @Override // org.telegram.ui.Components.li
    public final void J() {
        this.s.x0(0);
    }

    public final void O() {
        this.E.setVisibility(this.s.getAdapter().h() == 2 ? 0 : 8);
        P();
    }

    public final void P() {
        View childAt;
        vz vzVar = this.E;
        if (vzVar.getVisibility() == 0 && (childAt = this.s.getChildAt(0)) != null) {
            vzVar.setTranslationY((childAt.getTop() + (vzVar.getMeasuredHeight() - getMeasuredHeight())) / 2);
        }
    }

    @Override // org.telegram.ui.Components.li
    public int getCurrentItemTop() {
        ai.u1 u1Var = this.s;
        if (u1Var.getChildCount() <= 0) {
            return ConnectionsManager.DEFAULT_DATACENTER_ID;
        }
        View childAt = u1Var.getChildAt(0);
        tl0 tl0Var = (tl0) u1Var.G(childAt);
        int top = (childAt.getTop() - AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(8.0f);
        int i10 = (top <= 0 || tl0Var == null || tl0Var.b() != 0) ? 0 : top;
        ne.b bVar = this.n;
        if (top < 0 || tl0Var == null || tl0Var.b() != 0) {
            bVar.a(true, true);
            top = i10;
        } else {
            bVar.a(false, true);
        }
        this.r.setTranslationY(top);
        return AndroidUtilities.dp(12.0f) + top;
    }

    @Override // org.telegram.ui.Components.li
    public int getFirstOffset() {
        return AndroidUtilities.dp(4.0f) + getListTopPadding();
    }

    @Override // org.telegram.ui.Components.li
    public int getListTopPadding() {
        return this.s.getPaddingTop();
    }

    @Override // org.telegram.ui.Components.li
    public int getSelectedItemsCount() {
        return 0;
    }

    @Override // org.telegram.ui.Components.li
    public ArrayList<j6> getThemeDescriptions() {
        i6 i6Var = new i6() { // from class: ig.b0
            @Override // org.telegram.ui.ActionBar.i6
            public final void b() {
                ai.u1 u1Var = i0.this.s;
                if (u1Var != null) {
                    int childCount = u1Var.getChildCount();
                    for (int i10 = 0; i10 < childCount; i10++) {
                        u1Var.getChildAt(i10);
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
        ai.u1 u1Var = this.s;
        arrayList.add(new j6(u1Var, 32768, null, null, null, null, i10));
        arrayList.add(new j6(u1Var, 4096, null, null, null, null, h6.i6));
        arrayList.add(new j6(u1Var, 0, new Class[]{View.class}, h6.k0, null, null, h6.d7));
        int i11 = h6.q5;
        arrayList.add(new j6(u1Var, 0, new Class[]{h0.class}, new String[]{"nameTextView"}, null, null, -1, null, i11));
        arrayList.add(new j6(u1Var, 0, new Class[]{h0.class}, new String[]{"statusTextView"}, null, null, -1, i6Var, i11));
        arrayList.add(new j6(u1Var, 0, new Class[]{h0.class}, null, h6.r0, null, h6.J7));
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
        P();
    }

    @Override // android.view.View
    public void setTranslationY(float f7) {
        super.setTranslationY(f7);
        this.b.getSheetContainer().invalidate();
    }

    public void setupBlurredSearchField(bh.b bVar) {
        pi piVar = this.F;
        if (piVar != null) {
            piVar.setupBlurredBackground(bVar.c(piVar, fh.c.a(this.a), false));
        }
    }

    @Override // org.telegram.ui.Components.li
    public final void o() {
    }

    @Override // ne.d
    public final /* synthetic */ void H(float f7, int i10) {
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
    }

    @Override // ne.d
    public final void r(int i10, float f7, float f10, ne.e eVar) {
    }
}
