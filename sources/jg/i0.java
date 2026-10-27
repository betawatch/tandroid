package jg;

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
import org.telegram.ui.ActionBar.f7;
import org.telegram.ui.ActionBar.g7;
import org.telegram.ui.ActionBar.h7;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.kb1;
import org.telegram.ui.Components.li;
import org.telegram.ui.Components.pi;
import org.telegram.ui.Components.si;
import org.telegram.ui.Components.ti;
import org.telegram.ui.Components.uz;
import org.telegram.ui.Components.wl0;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class i0 extends li implements p6, NotificationCenter.NotificationCenterDelegate, oe.d {
    public final uz E;
    public final pi F;
    public final oe.b n;
    public final FrameLayout r;
    public final bi.r1 s;
    public final e0 v;
    public final HashSet w;
    public final f0 x;
    public final g0 y;

    public i0(Context context, u6 u6Var, ti tiVar) {
        super(context, u6Var, tiVar);
        this.n = new oe.b(0, this, ds.h, 380L, false);
        this.w = new HashSet();
        this.y = new g0(this, context);
        si siVar = new si(context, y6.d6, u6Var);
        siVar.setVisibility(4);
        FrameLayout frameLayout = new FrameLayout(context);
        this.r = frameLayout;
        pi piVar = new pi(context, u6Var, this.b);
        this.F = piVar;
        piVar.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
        c0 c0Var = new c0(this);
        fi.c2 c2Var = piVar.r;
        c2Var.addTextChangedListener(c0Var);
        c2Var.setHint(LocaleController.getString(R.string.BusinessRepliesSearch));
        frameLayout.addView(siVar, kb1.k());
        FrameLayout.LayoutParams h = kb1.h(-1, 48.0f, 51, 7.0f, 8.0f, 7.0f, 4.0f);
        ((ViewGroup.MarginLayoutParams) h).topMargin += AndroidUtilities.statusBarHeight;
        frameLayout.addView(piVar, h);
        uz uzVar = new uz(context, u6Var);
        this.E = uzVar;
        uzVar.c();
        addView(uzVar, kb1.h(-1, -1.0f, 51, 0.0f, 52.0f, 0.0f, 0.0f));
        bi.r1 r1Var = new bi.r1(this, context, u6Var, 4);
        this.s = r1Var;
        r1Var.u1();
        setBlur3Capture(r1Var);
        this.d = r1Var;
        this.h = true;
        this.f = true;
        NotificationCenter.getGlobalInstance().listen(r1Var, NotificationCenter.emojiLoaded, new ig.o(this, 3));
        r1Var.setClipToPadding(false);
        getContext();
        e0 e0Var = new e0(this, AndroidUtilities.dp(9.0f), r1Var, 0);
        this.v = e0Var;
        r1Var.setLayoutManager(e0Var);
        e0Var.P = false;
        r1Var.setHorizontalScrollBarEnabled(false);
        r1Var.setVerticalScrollBarEnabled(false);
        r1Var.setClipToPadding(false);
        addView(r1Var, kb1.h(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        f0 f0Var = new f0(this, context);
        this.x = f0Var;
        r1Var.setAdapter(f0Var);
        f7.m(r1Var, 21, y6.A5, u6Var);
        r1Var.setOnItemClickListener(new ai.k(this, 15));
        r1Var.setOnScrollListener(new ai.b(this, 18));
        FrameLayout.LayoutParams i10 = kb1.i(-1, 60, 51);
        ((ViewGroup.MarginLayoutParams) i10).height += AndroidUtilities.statusBarHeight;
        addView(frameLayout, i10);
        O();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getCurrentTop() {
        bi.r1 r1Var = this.s;
        if (r1Var.getChildCount() == 0) {
            return -1000;
        }
        int i10 = 0;
        View childAt = r1Var.getChildAt(0);
        wl0 wl0Var = (wl0) r1Var.G(childAt);
        if (wl0Var == null) {
            return -1000;
        }
        int paddingTop = r1Var.getPaddingTop();
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
        this.s.t1(0, i12 + AndroidUtilities.statusBarHeight, 0, this.e);
    }

    @Override // org.telegram.ui.Components.li
    public final void G(li liVar) {
        this.v.h1(0, 0);
    }

    @Override // org.telegram.ui.Components.li
    public final void J() {
        this.s.y0(0);
    }

    public final void O() {
        this.E.setVisibility(this.s.getAdapter().h() == 2 ? 0 : 8);
        P();
    }

    public final void P() {
        View childAt;
        uz uzVar = this.E;
        if (uzVar.getVisibility() == 0 && (childAt = this.s.getChildAt(0)) != null) {
            uzVar.setTranslationY((childAt.getTop() + (uzVar.getMeasuredHeight() - getMeasuredHeight())) / 2);
        }
    }

    @Override // org.telegram.ui.ActionBar.p6
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(y6.U7));
        hashSet.add(Integer.valueOf(y6.T7));
        hashSet.add(Integer.valueOf(y6.S7));
        hashSet.add(Integer.valueOf(y6.R7));
        hashSet.add(Integer.valueOf(y6.Q7));
        hashSet.add(Integer.valueOf(y6.P7));
        hashSet.add(Integer.valueOf(y6.O7));
        hashSet.add(Integer.valueOf(y6.J7));
        hashSet.add(Integer.valueOf(y6.q5));
        hashSet.add(Integer.valueOf(y6.d7));
        hashSet.add(Integer.valueOf(y6.i6));
    }

    @Override // org.telegram.ui.Components.li
    public int getCurrentItemTop() {
        bi.r1 r1Var = this.s;
        if (r1Var.getChildCount() <= 0) {
            return ConnectionsManager.DEFAULT_DATACENTER_ID;
        }
        View childAt = r1Var.getChildAt(0);
        wl0 wl0Var = (wl0) r1Var.G(childAt);
        int top = (childAt.getTop() - AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(8.0f);
        int i10 = (top <= 0 || wl0Var == null || wl0Var.b() != 0) ? 0 : top;
        oe.b bVar = this.n;
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
    public ArrayList<h7> getThemeDescriptions() {
        ArrayList<h7> arrayList = new ArrayList<>();
        arrayList.add(new h7(this.E, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (g7) null, y6.c7));
        arrayList.add(new h7(this.E, 2048, (Class[]) null, (Paint) null, (Drawable[]) null, (g7) null, y6.h6));
        int i10 = y6.q5;
        arrayList.add(new h7(this.s, 0, new Class[]{h0.class}, new String[]{"nameTextView"}, (Drawable[]) null, (g7) null, i10));
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

    public void setupBlurredSearchField(ch.b bVar) {
        pi piVar = this.F;
        if (piVar != null) {
            piVar.setupBlurredBackground(bVar.c(piVar, gh.c.a(this.a), false));
        }
    }

    @Override // org.telegram.ui.Components.li
    public final void o() {
    }

    @Override // org.telegram.ui.ActionBar.p6
    public final void updateColors() {
    }

    @Override // oe.d
    public final /* synthetic */ void z(float f7, int i10) {
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
    }

    @Override // oe.d
    public final void E(int i10, float f7, float f10, oe.e eVar) {
    }
}
