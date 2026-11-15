package li;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import bi.x4;
import bi.z4;
import c8.ja;
import di.sb;
import hi.q4;
import java.util.WeakHashMap;
import kg.t1;
import org.telegram.messenger.a8;
import org.telegram.messenger.hd;
import org.telegram.messenger.np;
import org.telegram.messenger.t3;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e2;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.q6;
import org.telegram.ui.ActionBar.x1;
import org.telegram.ui.Components.b41;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.cv0;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.u41;
import org.telegram.ui.an;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes4.dex */
public final class r extends e2 implements te.b {
    public final te.a a;
    public long b;
    public FrameLayout c;
    public u41 d;
    public lh.f e;
    public LinearLayout f;
    public hi.d h;
    public hi.d n;
    public cv0 r;
    public TLRPC.ChatFull s;
    public k0 w;
    public int x;

    public r(Bundle bundle) {
        super(bundle);
        this.a = new te.a(0, this, er.h, 320L, false);
    }

    public static void Z(r rVar, b41 b41Var) {
        Object obj = b41Var.G;
        if (obj instanceof mi.f) {
            mi.f fVar = (mi.f) obj;
            long j3 = fVar.a;
            TLRPC.Chat M0 = np.s1(rVar.currentAccount).M0(Long.valueOf(-j3));
            TLRPC.User a22 = np.s1(rVar.currentAccount).a2(Long.valueOf(j3));
            if (a22 != null) {
                rVar.presentFragment(an.ua(a22.id));
            } else if (t3.t0(M0) || t3.j0(M0)) {
                rVar.presentFragment(an.ua(-M0.id));
            } else {
                new ni.b(rVar.getParentActivity(), M0, new t1(13, rVar, fVar)).show();
            }
        }
    }

    @Override // te.b
    public final void G(int i7, float f10, float f11, te.c cVar) {
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

    @Override // org.telegram.ui.ActionBar.e2
    public final View createView(Context context) {
        boolean z10 = true;
        z10 = true;
        setHasOwnBackground(true);
        k0 k0Var = new k0(getParentActivity(), this.resourceProvider, cc.a0(this), this.currentAccount, this.b);
        this.w = k0Var;
        k0Var.h = new hi.l0(this, 9);
        k0Var.d();
        this.w.e();
        final int i7 = 0;
        this.actionBar.setBackButtonDrawable(new x1(false));
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new x4(this, 17));
        this.actionBar.setTitle(hd.M0(2131751895, null));
        FrameLayout frameLayout = new FrameLayout(context);
        this.c = frameLayout;
        int i10 = j6.a7;
        q6.h(i10, frameLayout, null);
        u41 u41Var = new u41(this, new q4(this, 23), new o(this), new p(this, 0));
        this.d = u41Var;
        u41Var.setClipToPadding(false);
        u41 u41Var2 = this.d;
        u41Var2.g3.r = false;
        u41Var2.r1();
        this.d.j(new z4(this, 22));
        this.actionBar.setAdaptiveBackground(this.d);
        this.c.addView(this.d, ja.c(-1.0f, -1));
        lh.f fVar = new lh.f(context);
        this.e = fVar;
        fVar.setupColorKey(i10);
        this.e.setFadeZoneBottom(org.telegram.messenger.g0.L(72.0f));
        this.e.setFadeHeightBottom(org.telegram.messenger.g0.L(24.0f));
        this.c.addView(this.e, ja.g());
        this.c.addView(this.actionBar, ja.e(-1, -2, 48));
        LinearLayout linearLayout = new LinearLayout(context);
        this.f = linearLayout;
        linearLayout.setOrientation(0);
        this.f.setPadding(org.telegram.messenger.g0.L(7.0f), 0, org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(12.0f));
        hi.d dVar = new hi.d(context, this.resourceProvider, true);
        this.n = dVar;
        dVar.e();
        hi.d dVar2 = this.n;
        int f10 = i0.a.f(0.125f, getThemedColor(j6.d6), getThemedColor(j6.G6));
        this.x = f10;
        dVar2.setColor(f10);
        this.n.setText(hd.M0(2131751900, null));
        this.n.f();
        this.n.setOnClickListener(new View.OnClickListener(this) { // from class: li.q
            public final /* synthetic */ r b;

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
        this.f.addView(this.n, ja.q(0, 48, 1.0f, 0, 4, 0, 4, 0));
        hi.d dVar3 = new hi.d(context, this.resourceProvider, true);
        this.h = dVar3;
        dVar3.setText(hd.M0(2131751902, null));
        this.h.f();
        hi.d dVar4 = this.h;
        final int i11 = z10 ? 1 : 0;
        dVar4.setOnClickListener(new View.OnClickListener(this) { // from class: li.q
            public final /* synthetic */ r b;

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
        this.f.addView(this.h, ja.q(0, 48, 1.0f, 0, 4, 0, 4, 0));
        this.c.addView(this.f, ja.e(-1, -2, 80));
        cv0 cv0Var = new cv0(getParentActivity(), null, 16, this.resourceProvider);
        this.r = cv0Var;
        cv0Var.d.setText(hd.M0(2131748225, null));
        this.r.e.setText(hd.M0(2131748224, null));
        this.r.setAnimateLayoutChange(true);
        this.r.setVisibility(8);
        this.c.addView(this.r, ja.e(-2, -2, 17));
        TLRPC.ChatFull chatFull = this.s;
        if (chatFull != null && chatFull.requests_pending != 0) {
            z10 = false;
        }
        this.a.a(z10, false);
        a0(0);
        FrameLayout frameLayout2 = this.c;
        o oVar = new o(this);
        WeakHashMap weakHashMap = r0.i0.a;
        r0.a0.i(frameLayout2, oVar);
        setBulletinDelegate(new bi.t(5));
        FrameLayout frameLayout3 = this.c;
        this.fragmentView = frameLayout3;
        return frameLayout3;
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final boolean drawEdgeNavigationBar() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final boolean onFragmentCreate() {
        this.b = this.arguments.getLong("community_id", 0L);
        getMessagesController().M0(Long.valueOf(this.b));
        this.s = getMessagesController().N0(this.b);
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        k0 k0Var = this.w;
        sb sbVar = k0Var.i;
        if (sbVar != null) {
            sbVar.run();
        }
        k0Var.i = null;
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            int f10 = i0.a.f(0.125f, getThemedColor(j6.d6), getThemedColor(j6.G6));
            hi.d dVar = this.n;
            if (dVar == null || f10 == this.x) {
                return;
            }
            this.x = f10;
            dVar.setColor(f10);
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    @Override // te.b
    public final /* synthetic */ void E(float f10, int i7) {
    }
}
