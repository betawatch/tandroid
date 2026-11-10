package kg;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import c8.ha;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.id;
import org.telegram.messenger.ls;
import org.telegram.messenger.qs;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.v6;
import org.telegram.ui.Components.bi;
import org.telegram.ui.Components.ci;
import org.telegram.ui.Components.iy;
import org.telegram.ui.Components.uh;
import org.telegram.ui.Components.wq;
import org.telegram.ui.Components.xi0;
import org.telegram.ui.Components.yh;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class g0 extends uh implements c6, ls, te.b {
    public final e0 D;
    public final iy E;
    public final yh F;
    public final te.a n;
    public final FrameLayout r;
    public final bi.q1 s;
    public final c0 w;
    public final HashSet x;
    public final d0 y;

    public g0(Context context, h6 h6Var, ci ciVar) {
        super(context, h6Var, ciVar);
        this.n = new te.a(0, this, wq.h, 380L, false);
        this.x = new HashSet();
        this.D = new e0(this, context);
        bi biVar = new bi(m6.d6, context, h6Var);
        biVar.setVisibility(4);
        FrameLayout frameLayout = new FrameLayout(context);
        this.r = frameLayout;
        yh yhVar = new yh(context, h6Var, this.b);
        this.F = yhVar;
        yhVar.setPadding(org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f));
        ah.j jVar = new ah.j(this, 8);
        ah.i iVar = yhVar.r;
        iVar.addTextChangedListener(jVar);
        iVar.setHint(id.M0(2131752656, null));
        frameLayout.addView(biVar, ha.g());
        FrameLayout.LayoutParams d = ha.d(-1, 48.0f, 51, 7.0f, 8.0f, 7.0f, 4.0f);
        ((ViewGroup.MarginLayoutParams) d).topMargin += org.telegram.messenger.g0.m;
        frameLayout.addView(yhVar, d);
        iy iyVar = new iy(context, h6Var);
        this.E = iyVar;
        iyVar.c();
        addView(iyVar, ha.d(-1, -1.0f, 51, 0.0f, 52.0f, 0.0f, 0.0f));
        bi.q1 q1Var = new bi.q1(this, context, h6Var, 5);
        this.s = q1Var;
        q1Var.r1();
        setBlur3Capture(q1Var);
        this.d = q1Var;
        this.h = true;
        this.f = true;
        qs.e().h(q1Var, qs.i4, new ii.c(this, 4));
        q1Var.setClipToPadding(false);
        getContext();
        c0 c0Var = new c0(this, org.telegram.messenger.g0.L(9.0f), q1Var, 0);
        this.w = c0Var;
        q1Var.setLayoutManager(c0Var);
        c0Var.P = false;
        q1Var.setHorizontalScrollBarEnabled(false);
        q1Var.setVerticalScrollBarEnabled(false);
        q1Var.setClipToPadding(false);
        addView(q1Var, ha.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        d0 d0Var = new d0(this, context);
        this.y = d0Var;
        q1Var.setAdapter(d0Var);
        t6.l(q1Var, 21, m6.A5, h6Var);
        q1Var.setOnItemClickListener(new ai.k(this, 15));
        q1Var.setOnScrollListener(new ai.b(this, 21));
        FrameLayout.LayoutParams e10 = ha.e(-1, 60, 51);
        ((ViewGroup.MarginLayoutParams) e10).height += org.telegram.messenger.g0.m;
        addView(frameLayout, e10);
        P();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getCurrentTop() {
        bi.q1 q1Var = this.s;
        if (q1Var.getChildCount() == 0) {
            return -1000;
        }
        int i7 = 0;
        View childAt = q1Var.getChildAt(0);
        xi0 xi0Var = (xi0) q1Var.G(childAt);
        if (xi0Var == null) {
            return -1000;
        }
        int paddingTop = q1Var.getPaddingTop();
        if (xi0Var.b() == 0 && childAt.getTop() >= 0) {
            i7 = childAt.getTop();
        }
        return paddingTop - i7;
    }

    @Override // org.telegram.ui.Components.uh
    public final void B(int i7, int i10) {
        int i11;
        ci ciVar = this.b;
        if (ciVar.o3.Q() > org.telegram.messenger.g0.L(20.0f)) {
            i11 = org.telegram.messenger.g0.L(8.0f);
            ciVar.q0 = false;
        } else {
            if (!org.telegram.messenger.g0.Q1()) {
                Point point = org.telegram.messenger.g0.q;
                if (point.x > point.y) {
                    i11 = (int) (i10 / 3.5f);
                    ciVar.q0 = true;
                }
            }
            i11 = (i10 / 5) * 2;
            ciVar.q0 = true;
        }
        this.s.q1(0, i11 + org.telegram.messenger.g0.m, 0, this.e);
    }

    @Override // org.telegram.ui.Components.uh
    public final void H(uh uhVar) {
        this.w.h1(0, 0);
    }

    @Override // org.telegram.ui.Components.uh
    public final void J() {
        this.s.y0(0);
    }

    public final void P() {
        this.E.setVisibility(this.s.getAdapter().b() == 2 ? 0 : 8);
        Q();
    }

    public final void Q() {
        View childAt;
        iy iyVar = this.E;
        if (iyVar.getVisibility() == 0 && (childAt = this.s.getChildAt(0)) != null) {
            iyVar.setTranslationY((childAt.getTop() + (iyVar.getMeasuredHeight() - getMeasuredHeight())) / 2);
        }
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(m6.U7));
        hashSet.add(Integer.valueOf(m6.T7));
        hashSet.add(Integer.valueOf(m6.S7));
        hashSet.add(Integer.valueOf(m6.R7));
        hashSet.add(Integer.valueOf(m6.Q7));
        hashSet.add(Integer.valueOf(m6.P7));
        hashSet.add(Integer.valueOf(m6.O7));
        hashSet.add(Integer.valueOf(m6.J7));
        hashSet.add(Integer.valueOf(m6.q5));
        hashSet.add(Integer.valueOf(m6.d7));
        hashSet.add(Integer.valueOf(m6.i6));
    }

    @Override // org.telegram.ui.Components.uh
    public int getCurrentItemTop() {
        bi.q1 q1Var = this.s;
        if (q1Var.getChildCount() <= 0) {
            return ConnectionsManager.DEFAULT_DATACENTER_ID;
        }
        View childAt = q1Var.getChildAt(0);
        xi0 xi0Var = (xi0) q1Var.G(childAt);
        int top = (childAt.getTop() - org.telegram.messenger.g0.m) - org.telegram.messenger.g0.L(8.0f);
        int i7 = (top <= 0 || xi0Var == null || xi0Var.b() != 0) ? 0 : top;
        te.a aVar = this.n;
        if (top < 0 || xi0Var == null || xi0Var.b() != 0) {
            aVar.a(true, true);
            top = i7;
        } else {
            aVar.a(false, true);
        }
        this.r.setTranslationY(top);
        return org.telegram.messenger.g0.L(12.0f) + top;
    }

    @Override // org.telegram.ui.Components.uh
    public int getFirstOffset() {
        return org.telegram.messenger.g0.L(4.0f) + getListTopPadding();
    }

    @Override // org.telegram.ui.Components.uh
    public int getListTopPadding() {
        return this.s.getPaddingTop();
    }

    @Override // org.telegram.ui.Components.uh
    public int getSelectedItemsCount() {
        return 0;
    }

    @Override // org.telegram.ui.Components.uh
    public ArrayList<v6> getThemeDescriptions() {
        ArrayList<v6> arrayList = new ArrayList<>();
        arrayList.add(new v6(this.E, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (u6) null, m6.c7));
        arrayList.add(new v6(this.E, 2048, (Class[]) null, (Paint) null, (Drawable[]) null, (u6) null, m6.h6));
        int i7 = m6.q5;
        arrayList.add(new v6(this.s, 0, new Class[]{f0.class}, new String[]{"nameTextView"}, (Drawable[]) null, (u6) null, i7));
        return arrayList;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        super.onLayout(z9, i7, i10, i11, i12);
        Q();
    }

    @Override // android.view.View
    public void setTranslationY(float f10) {
        super.setTranslationY(f10);
        this.b.b.invalidate();
    }

    public void setupBlurredSearchField(dh.c cVar) {
        yh yhVar = this.F;
        if (yhVar != null) {
            yhVar.setupBlurredBackground(cVar.c(yhVar, c8.g0.a(this.a), false));
        }
    }

    @Override // org.telegram.ui.Components.uh
    public final void p() {
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final void updateColors() {
    }

    @Override // te.b
    public final /* synthetic */ void F(float f10, int i7) {
    }

    @Override // org.telegram.messenger.ls
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
    }

    @Override // te.b
    public final void Y(int i7, float f10, float f11, te.c cVar) {
    }
}
