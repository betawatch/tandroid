package li;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import bi.u1;
import bi.v1;
import c8.ma;
import di.vb;
import h9.g1;
import hi.d7;
import java.util.WeakHashMap;
import org.telegram.messenger.a8;
import org.telegram.messenger.gd;
import org.telegram.messenger.mp;
import org.telegram.messenger.v3;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.g2;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.ActionBar.x1;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.lc;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.nv0;
import org.telegram.ui.Components.o41;
import org.telegram.ui.bn;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes4.dex */
public final class s extends g2 implements te.b {
    public final te.a a;
    public long b;
    public FrameLayout c;
    public h51 d;
    public lh.f e;
    public LinearLayout f;
    public hi.e h;
    public hi.e n;
    public nv0 r;
    public TLRPC.ChatFull s;
    public k0 w;
    public int x;

    public s(Bundle bundle) {
        super(bundle);
        this.a = new te.a(0, this, nr.h, 320L, false);
    }

    public static void Z(s sVar, o41 o41Var) {
        Object obj = o41Var.H;
        if (obj instanceof mi.f) {
            mi.f fVar = (mi.f) obj;
            long j3 = fVar.a;
            TLRPC.Chat O0 = mp.u1(sVar.currentAccount).O0(Long.valueOf(-j3));
            TLRPC.User c22 = mp.u1(sVar.currentAccount).c2(Long.valueOf(j3));
            if (c22 != null) {
                sVar.presentFragment(bn.ua(c22.id));
            } else if (v3.t0(O0) || v3.j0(O0)) {
                sVar.presentFragment(bn.ua(-O0.id));
            } else {
                new ni.b(sVar.getParentActivity(), O0, new ji.i(18, sVar, fVar)).show();
            }
        }
    }

    @Override // te.b
    public final void H(int i7, float f10, float f11, te.c cVar) {
        float f12 = 1.0f - f10;
        this.f.setAlpha(f12);
        this.f.setVisibility(f12 > 0.0f ? 0 : 8);
        this.r.setAlpha(f10);
        this.r.setVisibility(f10 > 0.0f ? 0 : 8);
    }

    public final void a0(int i7) {
        this.d.setPadding(0, 0, 0, org.telegram.messenger.g0.L(60.0f) + i7);
        this.f.setPadding(org.telegram.messenger.g0.L(7.0f), 0, org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(12.0f) + i7);
        this.r.setTranslationY((this.d.getPaddingTop() - this.d.getPaddingBottom()) / 2.0f);
        this.e.setFadeZoneBottom(org.telegram.messenger.g0.L(72.0f) + i7);
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final View createView(Context context) {
        boolean z10 = true;
        z10 = true;
        setHasOwnBackground(true);
        k0 k0Var = new k0(getParentActivity(), this.resourceProvider, lc.b0(this), this.currentAccount, this.b);
        this.w = k0Var;
        k0Var.h = new g1(this, 9);
        k0Var.d();
        this.w.e();
        final int i7 = 0;
        this.actionBar.setBackButtonDrawable(new x1(false));
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new v1(this, 19));
        this.actionBar.setTitle(gd.N0(2131751883, null));
        FrameLayout frameLayout = new FrameLayout(context);
        this.c = frameLayout;
        int i10 = m6.a7;
        t6.h(i10, frameLayout, null);
        h51 h51Var = new h51(this, new d7(this, 23), new q(this), new c(this, 1));
        this.d = h51Var;
        h51Var.setClipToPadding(false);
        h51 h51Var2 = this.d;
        h51Var2.g3.r = false;
        h51Var2.r1();
        this.d.j(new u1(this, 23));
        this.actionBar.setAdaptiveBackground(this.d);
        this.c.addView(this.d, ma.c(-1.0f, -1));
        lh.f fVar = new lh.f(context);
        this.e = fVar;
        fVar.setupColorKey(i10);
        this.e.setFadeZoneBottom(org.telegram.messenger.g0.L(72.0f));
        this.e.setFadeHeightBottom(org.telegram.messenger.g0.L(24.0f));
        this.c.addView(this.e, ma.g());
        this.c.addView(this.actionBar, ma.e(-1, -2, 48));
        LinearLayout linearLayout = new LinearLayout(context);
        this.f = linearLayout;
        linearLayout.setOrientation(0);
        this.f.setPadding(org.telegram.messenger.g0.L(7.0f), 0, org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(12.0f));
        hi.e eVar = new hi.e(context, this.resourceProvider, true);
        this.n = eVar;
        eVar.e();
        hi.e eVar2 = this.n;
        int f10 = i0.a.f(0.125f, getThemedColor(m6.d6), getThemedColor(m6.G6));
        this.x = f10;
        eVar2.setColor(f10);
        this.n.setText(gd.N0(2131751888, null));
        this.n.f();
        this.n.setOnClickListener(new View.OnClickListener(this) { // from class: li.r
            public final /* synthetic */ s b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i7) {
                    case 0:
                        this.b.w.f(false, true);
                        break;
                    default:
                        this.b.w.f(true, true);
                        break;
                }
            }
        });
        this.f.addView(this.n, ma.q(0, 48, 1.0f, 0, 4, 0, 4, 0));
        hi.e eVar3 = new hi.e(context, this.resourceProvider, true);
        this.h = eVar3;
        eVar3.setText(gd.N0(2131751890, null));
        this.h.f();
        hi.e eVar4 = this.h;
        final int i11 = z10 ? 1 : 0;
        eVar4.setOnClickListener(new View.OnClickListener(this) { // from class: li.r
            public final /* synthetic */ s b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        this.b.w.f(false, true);
                        break;
                    default:
                        this.b.w.f(true, true);
                        break;
                }
            }
        });
        this.f.addView(this.h, ma.q(0, 48, 1.0f, 0, 4, 0, 4, 0));
        this.c.addView(this.f, ma.e(-1, -2, 80));
        nv0 nv0Var = new nv0(getParentActivity(), null, 16, this.resourceProvider);
        this.r = nv0Var;
        nv0Var.d.setText(gd.N0(2131748032, null));
        this.r.e.setText(gd.N0(2131748031, null));
        this.r.setAnimateLayoutChange(true);
        this.r.setVisibility(8);
        this.c.addView(this.r, ma.e(-2, -2, 17));
        TLRPC.ChatFull chatFull = this.s;
        if (chatFull != null && chatFull.requests_pending != 0) {
            z10 = false;
        }
        this.a.a(z10, false);
        a0(0);
        FrameLayout frameLayout2 = this.c;
        q qVar = new q(this);
        WeakHashMap weakHashMap = r0.i0.a;
        r0.a0.i(frameLayout2, qVar);
        setBulletinDelegate(new bi.t(5));
        FrameLayout frameLayout3 = this.c;
        this.fragmentView = frameLayout3;
        return frameLayout3;
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final boolean drawEdgeNavigationBar() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final boolean onFragmentCreate() {
        this.b = this.arguments.getLong("community_id", 0L);
        getMessagesController().O0(Long.valueOf(this.b));
        this.s = getMessagesController().P0(this.b);
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        k0 k0Var = this.w;
        vb vbVar = k0Var.i;
        if (vbVar != null) {
            vbVar.run();
        }
        k0Var.i = null;
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            int f10 = i0.a.f(0.125f, getThemedColor(m6.d6), getThemedColor(m6.G6));
            hi.e eVar = this.n;
            if (eVar == null || f10 == this.x) {
                return;
            }
            this.x = f10;
            eVar.setColor(f10);
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    @Override // te.b
    public final /* synthetic */ void D(float f10, int i7) {
    }
}
