package ig;

import ai.xa;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
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
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.ActionBar.s6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.li;
import org.telegram.ui.Components.pi;
import org.telegram.ui.Components.si;
import org.telegram.ui.Components.ti;
import org.telegram.ui.Components.vz;
import org.telegram.ui.Components.wl0;
import w7.z5;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final class h0 extends li implements b6, NotificationCenter.NotificationCenterDelegate, ne.d {
    public final vz E;
    public final pi F;
    public final ne.b n;
    public final FrameLayout r;
    public final ai.u1 s;
    public final d0 v;
    public final HashSet w;
    public final e0 x;
    public final f0 y;

    public h0(Context context, g6 g6Var, ti tiVar) {
        super(context, g6Var, tiVar);
        this.n = new ne.b(0, this, bs.h, 380L, false);
        this.w = new HashSet();
        this.y = new f0(this, context);
        si siVar = new si(context, k6.d6, g6Var);
        siVar.setVisibility(4);
        FrameLayout frameLayout = new FrameLayout(context);
        this.r = frameLayout;
        pi piVar = new pi(context, g6Var, this.b);
        this.F = piVar;
        piVar.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
        b0 b0Var = new b0(this);
        ei.e2 e2Var = piVar.r;
        e2Var.addTextChangedListener(b0Var);
        e2Var.setHint(LocaleController.getString(R.string.BusinessRepliesSearch));
        frameLayout.addView(siVar, z5.g());
        FrameLayout.LayoutParams d = z5.d(-1, 48.0f, 51, 7.0f, 8.0f, 7.0f, 4.0f);
        ((ViewGroup.MarginLayoutParams) d).topMargin += AndroidUtilities.statusBarHeight;
        frameLayout.addView(piVar, d);
        vz vzVar = new vz(context, g6Var);
        this.E = vzVar;
        vzVar.c();
        addView(vzVar, z5.d(-1, -1.0f, 51, 0.0f, 52.0f, 0.0f, 0.0f));
        ai.u1 u1Var = new ai.u1(this, context, g6Var, 4);
        this.s = u1Var;
        u1Var.t1();
        this.c = u1Var;
        this.d = u1Var;
        this.h = true;
        this.f = true;
        NotificationCenter.getGlobalInstance().listen(u1Var, NotificationCenter.emojiLoaded, new ai.r0(this, 29));
        u1Var.setClipToPadding(false);
        getContext();
        d0 d0Var = new d0(this, AndroidUtilities.dp(9.0f), u1Var, 0);
        this.v = d0Var;
        u1Var.setLayoutManager(d0Var);
        d0Var.P = false;
        u1Var.setHorizontalScrollBarEnabled(false);
        u1Var.setVerticalScrollBarEnabled(false);
        u1Var.setClipToPadding(false);
        addView(u1Var, z5.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        e0 e0Var = new e0(this, context);
        this.x = e0Var;
        u1Var.setAdapter(e0Var);
        r6.m(u1Var, 21, k6.A5, g6Var);
        int i10 = 14;
        u1Var.setOnItemClickListener(new xa(this, i10));
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
        wl0 wl0Var = (wl0) u1Var.G(childAt);
        if (wl0Var == null) {
            return -1000;
        }
        int paddingTop = u1Var.getPaddingTop();
        if (wl0Var.b() == 0 && childAt.getTop() >= 0) {
            i10 = childAt.getTop();
        }
        return paddingTop - i10;
    }

    @Override // org.telegram.ui.Components.li
    public final void B(int i10, int i11) {
        int i12;
        ti tiVar = this.b;
        if (tiVar.u1.Q() > AndroidUtilities.dp(20.0f)) {
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
        this.s.s1(0, i12 + AndroidUtilities.statusBarHeight, 0, this.e);
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

    @Override // org.telegram.ui.ActionBar.b6
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(k6.U7));
        hashSet.add(Integer.valueOf(k6.T7));
        hashSet.add(Integer.valueOf(k6.S7));
        hashSet.add(Integer.valueOf(k6.R7));
        hashSet.add(Integer.valueOf(k6.Q7));
        hashSet.add(Integer.valueOf(k6.P7));
        hashSet.add(Integer.valueOf(k6.O7));
        hashSet.add(Integer.valueOf(k6.J7));
        hashSet.add(Integer.valueOf(k6.q5));
        hashSet.add(Integer.valueOf(k6.d7));
        hashSet.add(Integer.valueOf(k6.i6));
    }

    @Override // org.telegram.ui.Components.li
    public int getCurrentItemTop() {
        ai.u1 u1Var = this.s;
        if (u1Var.getChildCount() <= 0) {
            return ConnectionsManager.DEFAULT_DATACENTER_ID;
        }
        View childAt = u1Var.getChildAt(0);
        wl0 wl0Var = (wl0) u1Var.G(childAt);
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
    public ArrayList<t6> getThemeDescriptions() {
        ArrayList<t6> arrayList = new ArrayList<>();
        arrayList.add(new t6(this.E, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (s6) null, k6.c7));
        arrayList.add(new t6(this.E, 2048, (Class[]) null, (Paint) null, (Drawable[]) null, (s6) null, k6.h6));
        int i10 = k6.q5;
        arrayList.add(new t6(this.s, 0, new Class[]{g0.class}, new String[]{"nameTextView"}, (Drawable[]) null, (s6) null, i10));
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
    public final void p() {
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final void updateColors() {
    }

    @Override // ne.d
    public final /* synthetic */ void H(float f7, int i10) {
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
    }

    @Override // ne.d
    public final void o(int i10, float f7, float f10, ne.e eVar) {
    }
}
