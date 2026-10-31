package ag;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.cd;
import org.telegram.messenger.us;
import org.telegram.messenger.zs;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.ActionBar.b7;
import org.telegram.ui.ActionBar.c7;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.bi;
import org.telegram.ui.Components.ck0;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.uh;
import org.telegram.ui.Components.xy;
import org.telegram.ui.Components.yh;
import w7.b6;
import w7.b9;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class h1 extends uh implements k6, us, fe.e {
    public final f1 D;
    public final xy E;
    public final yh F;
    public final fe.b n;
    public final FrameLayout r;
    public final b1 s;
    public final d1 w;
    public final HashSet x;
    public final e1 y;

    public h1(Context context, p6 p6Var, bi biVar) {
        super(context, p6Var, biVar);
        this.n = new fe.b(0, this, gr.h, 380L, false);
        this.x = new HashSet();
        this.D = new f1(this, context);
        ih.e eVar = new ih.e(t6.d6, context, p6Var);
        eVar.setVisibility(4);
        FrameLayout frameLayout = new FrameLayout(context);
        this.r = frameLayout;
        yh yhVar = new yh(context, p6Var, this.b);
        this.F = yhVar;
        yhVar.setPadding(org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f));
        int i10 = 0;
        a1 a1Var = new a1(this, i10);
        org.telegram.ui.ActionBar.n0 n0Var = yhVar.r;
        n0Var.addTextChangedListener(a1Var);
        n0Var.setHint(cd.L0(2131752656, null));
        frameLayout.addView(eVar, b6.g());
        FrameLayout.LayoutParams d = b6.d(-1, 48.0f, 51, 7.0f, 8.0f, 7.0f, 4.0f);
        ((ViewGroup.MarginLayoutParams) d).topMargin += org.telegram.messenger.i0.m;
        frameLayout.addView(yhVar, d);
        xy xyVar = new xy(context, p6Var);
        this.E = xyVar;
        xyVar.c();
        addView(xyVar, b6.d(-1, -1.0f, 51, 0.0f, 52.0f, 0.0f, 0.0f));
        b1 b1Var = new b1(this, context, p6Var, i10);
        this.s = b1Var;
        b1Var.r1();
        setBlur3Capture(b1Var);
        this.d = b1Var;
        int i11 = 1;
        this.h = true;
        this.f = true;
        zs.e().h(b1Var, zs.i4, new l(this, i11));
        b1Var.setClipToPadding(false);
        getContext();
        d1 d1Var = new d1(this, org.telegram.messenger.i0.L(9.0f), b1Var, i10);
        this.w = d1Var;
        b1Var.setLayoutManager(d1Var);
        d1Var.P = false;
        b1Var.setHorizontalScrollBarEnabled(false);
        b1Var.setVerticalScrollBarEnabled(false);
        b1Var.setClipToPadding(false);
        addView(b1Var, b6.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        e1 e1Var = new e1(this, context);
        this.y = e1Var;
        b1Var.setAdapter(e1Var);
        a7.m(b1Var, 21, t6.A5, p6Var);
        b1Var.setOnItemClickListener(new y0(this, i10));
        b1Var.setOnScrollListener(new u(this, i11));
        FrameLayout.LayoutParams e = b6.e(-1, 60, 51);
        ((ViewGroup.MarginLayoutParams) e).height += org.telegram.messenger.i0.m;
        addView(frameLayout, e);
        O();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getCurrentTop() {
        b1 b1Var = this.s;
        if (b1Var.getChildCount() == 0) {
            return -1000;
        }
        int i10 = 0;
        View childAt = b1Var.getChildAt(0);
        ck0 ck0Var = (ck0) b1Var.G(childAt);
        if (ck0Var == null) {
            return -1000;
        }
        int paddingTop = b1Var.getPaddingTop();
        if (ck0Var.b() == 0 && childAt.getTop() >= 0) {
            i10 = childAt.getTop();
        }
        return paddingTop - i10;
    }

    @Override // org.telegram.ui.Components.uh
    public final void B(int i10, int i11) {
        int i12;
        bi biVar = this.b;
        if (biVar.l3.Q() > org.telegram.messenger.i0.L(20.0f)) {
            i12 = org.telegram.messenger.i0.L(8.0f);
            biVar.q0 = false;
        } else {
            if (!org.telegram.messenger.i0.Q1()) {
                Point point = org.telegram.messenger.i0.q;
                if (point.x > point.y) {
                    i12 = (int) (i11 / 3.5f);
                    biVar.q0 = true;
                }
            }
            i12 = (i11 / 5) * 2;
            biVar.q0 = true;
        }
        this.s.q1(0, i12 + org.telegram.messenger.i0.m, 0, this.e);
    }

    @Override // org.telegram.ui.Components.uh
    public final void G(uh uhVar) {
        this.w.h1(0, 0);
    }

    @Override // org.telegram.ui.Components.uh
    public final void I() {
        this.s.y0(0);
    }

    public final void O() {
        this.E.setVisibility(this.s.getAdapter().b() == 2 ? 0 : 8);
        P();
    }

    public final void P() {
        View childAt;
        xy xyVar = this.E;
        if (xyVar.getVisibility() == 0 && (childAt = this.s.getChildAt(0)) != null) {
            xyVar.setTranslationY((childAt.getTop() + (xyVar.getMeasuredHeight() - getMeasuredHeight())) / 2);
        }
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(t6.U7));
        hashSet.add(Integer.valueOf(t6.T7));
        hashSet.add(Integer.valueOf(t6.S7));
        hashSet.add(Integer.valueOf(t6.R7));
        hashSet.add(Integer.valueOf(t6.Q7));
        hashSet.add(Integer.valueOf(t6.P7));
        hashSet.add(Integer.valueOf(t6.O7));
        hashSet.add(Integer.valueOf(t6.J7));
        hashSet.add(Integer.valueOf(t6.q5));
        hashSet.add(Integer.valueOf(t6.d7));
        hashSet.add(Integer.valueOf(t6.i6));
    }

    @Override // org.telegram.ui.Components.uh
    public int getCurrentItemTop() {
        b1 b1Var = this.s;
        if (b1Var.getChildCount() <= 0) {
            return ConnectionsManager.DEFAULT_DATACENTER_ID;
        }
        View childAt = b1Var.getChildAt(0);
        ck0 ck0Var = (ck0) b1Var.G(childAt);
        int top = (childAt.getTop() - org.telegram.messenger.i0.m) - org.telegram.messenger.i0.L(8.0f);
        int i10 = (top <= 0 || ck0Var == null || ck0Var.b() != 0) ? 0 : top;
        fe.b bVar = this.n;
        if (top < 0 || ck0Var == null || ck0Var.b() != 0) {
            bVar.a(true, true);
            top = i10;
        } else {
            bVar.a(false, true);
        }
        this.r.setTranslationY(top);
        return org.telegram.messenger.i0.L(12.0f) + top;
    }

    @Override // org.telegram.ui.Components.uh
    public int getFirstOffset() {
        return org.telegram.messenger.i0.L(4.0f) + getListTopPadding();
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
    public ArrayList<c7> getThemeDescriptions() {
        ArrayList<c7> arrayList = new ArrayList<>();
        arrayList.add(new c7(this.E, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (b7) null, t6.c7));
        arrayList.add(new c7(this.E, 2048, (Class[]) null, (Paint) null, (Drawable[]) null, (b7) null, t6.h6));
        int i10 = t6.q5;
        arrayList.add(new c7(this.s, 0, new Class[]{g1.class}, new String[]{"nameTextView"}, (Drawable[]) null, (b7) null, i10));
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
        this.b.b.invalidate();
    }

    public void setupBlurredSearchField(tg.b bVar) {
        yh yhVar = this.F;
        if (yhVar != null) {
            yhVar.setupBlurredBackground(bVar.c(yhVar, b9.a(this.a), false));
        }
    }

    @Override // org.telegram.ui.Components.uh
    public final void o() {
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final void updateColors() {
    }

    @Override // fe.e
    public final /* synthetic */ void E(float f7, int i10) {
    }

    @Override // org.telegram.messenger.us
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
    }

    @Override // fe.e
    public final void v(int i10, float f7, float f10, fe.f fVar) {
    }
}
