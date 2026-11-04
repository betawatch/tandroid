package ji;

import ai.g5;
import ai.j5;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import b8.mf;
import ci.cc;
import gi.q4;
import ii.y3;
import java.util.WeakHashMap;
import org.telegram.messenger.a8;
import org.telegram.messenger.bd;
import org.telegram.messenger.hp;
import org.telegram.messenger.t3;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d2;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.ActionBar.w1;
import org.telegram.ui.Components.fc;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.r31;
import org.telegram.ui.Components.xq;
import org.telegram.ui.Components.zu0;
import org.telegram.ui.wm;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class q extends d2 implements qe.b {
    public final qe.a a;
    public long b;
    public FrameLayout c;
    public l41 d;
    public mh.f e;
    public LinearLayout f;
    public gi.d h;
    public gi.d n;
    public zu0 r;
    public TLRPC.ChatFull s;
    public i0 w;
    public int x;

    public q(Bundle bundle) {
        super(bundle);
        this.a = new qe.a(0, this, xq.h, 320L, false);
    }

    public static void Z(q qVar, r31 r31Var) {
        Object obj = r31Var.G;
        if (obj instanceof ki.f) {
            ki.f fVar = (ki.f) obj;
            long j10 = fVar.a;
            TLRPC.Chat M0 = hp.s1(qVar.currentAccount).M0(Long.valueOf(-j10));
            TLRPC.User a22 = hp.s1(qVar.currentAccount).a2(Long.valueOf(j10));
            if (a22 != null) {
                qVar.presentFragment(wm.ra(a22.id));
            } else if (t3.t0(M0) || t3.j0(M0)) {
                qVar.presentFragment(wm.ra(-M0.id));
            } else {
                new li.b(qVar.getParentActivity(), M0, new ii.e(8, qVar, fVar)).show();
            }
        }
    }

    @Override // qe.b
    public final void Y(int i3, float f10, float f11, qe.c cVar) {
        float f12 = 1.0f - f10;
        this.f.setAlpha(f12);
        this.f.setVisibility(f12 > 0.0f ? 0 : 8);
        this.r.setAlpha(f10);
        this.r.setVisibility(f10 > 0.0f ? 0 : 8);
    }

    public final void a0(int i3) {
        this.d.setPadding(0, 0, 0, org.telegram.messenger.g0.L(60.0f) + i3);
        this.f.setPadding(org.telegram.messenger.g0.L(7.0f), 0, org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(12.0f) + i3);
        this.r.setTranslationY((this.d.getPaddingTop() - this.d.getPaddingBottom()) / 2.0f);
        this.e.setFadeZoneBottom(org.telegram.messenger.g0.L(72.0f) + i3);
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final View createView(Context context) {
        boolean z10 = true;
        z10 = true;
        setHasOwnBackground(true);
        i0 i0Var = new i0(getParentActivity(), this.resourceProvider, fc.a0(this), this.currentAccount, this.b);
        this.w = i0Var;
        i0Var.h = new hi.d(this, 3);
        i0Var.d();
        this.w.e();
        final int i3 = 0;
        this.actionBar.setBackButtonDrawable(new w1(false));
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new g5(this, 8));
        this.actionBar.setTitle(bd.M0(2131751895, null));
        FrameLayout frameLayout = new FrameLayout(context);
        this.c = frameLayout;
        int i10 = k6.a7;
        r6.i(i10, frameLayout, null);
        l41 l41Var = new l41(this, new q4(this, 13), new o(this), new y3(this, 5));
        this.d = l41Var;
        l41Var.setClipToPadding(false);
        l41 l41Var2 = this.d;
        l41Var2.g3.r = false;
        l41Var2.r1();
        this.d.j(new j5(this, 19));
        this.actionBar.setAdaptiveBackground(this.d);
        this.c.addView(this.d, mf.c(-1.0f, -1));
        mh.f fVar = new mh.f(context);
        this.e = fVar;
        fVar.setupColorKey(i10);
        this.e.setFadeZoneBottom(org.telegram.messenger.g0.L(72.0f));
        this.e.setFadeHeightBottom(org.telegram.messenger.g0.L(24.0f));
        this.c.addView(this.e, mf.g());
        this.c.addView(this.actionBar, mf.e(-1, -2, 48));
        LinearLayout linearLayout = new LinearLayout(context);
        this.f = linearLayout;
        linearLayout.setOrientation(0);
        this.f.setPadding(org.telegram.messenger.g0.L(7.0f), 0, org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(12.0f));
        gi.d dVar = new gi.d(context, this.resourceProvider, true);
        this.n = dVar;
        dVar.e();
        gi.d dVar2 = this.n;
        int f10 = i0.a.f(0.125f, getThemedColor(k6.d6), getThemedColor(k6.G6));
        this.x = f10;
        dVar2.setColor(f10);
        this.n.setText(bd.M0(2131751900, null));
        this.n.f();
        this.n.setOnClickListener(new View.OnClickListener(this) { // from class: ji.p
            public final /* synthetic */ q b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i3) {
                    case 0:
                        this.b.w.f(false, true);
                        break;
                    default:
                        this.b.w.f(true, true);
                        break;
                }
            }
        });
        this.f.addView(this.n, mf.q(0, 48, 1.0f, 0, 4, 0, 4, 0));
        gi.d dVar3 = new gi.d(context, this.resourceProvider, true);
        this.h = dVar3;
        dVar3.setText(bd.M0(2131751902, null));
        this.h.f();
        gi.d dVar4 = this.h;
        final int i11 = z10 ? 1 : 0;
        dVar4.setOnClickListener(new View.OnClickListener(this) { // from class: ji.p
            public final /* synthetic */ q b;

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
        this.f.addView(this.h, mf.q(0, 48, 1.0f, 0, 4, 0, 4, 0));
        this.c.addView(this.f, mf.e(-1, -2, 80));
        zu0 zu0Var = new zu0(getParentActivity(), null, 16, this.resourceProvider);
        this.r = zu0Var;
        zu0Var.d.setText(bd.M0(2131748233, null));
        this.r.e.setText(bd.M0(2131748232, null));
        this.r.setAnimateLayoutChange(true);
        this.r.setVisibility(8);
        this.c.addView(this.r, mf.e(-2, -2, 17));
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
        setBulletinDelegate(new ai.y(5));
        FrameLayout frameLayout3 = this.c;
        this.fragmentView = frameLayout3;
        return frameLayout3;
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final boolean drawEdgeNavigationBar() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final boolean onFragmentCreate() {
        this.b = this.arguments.getLong("community_id", 0L);
        getMessagesController().M0(Long.valueOf(this.b));
        this.s = getMessagesController().N0(this.b);
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        i0 i0Var = this.w;
        cc ccVar = i0Var.i;
        if (ccVar != null) {
            ccVar.run();
        }
        i0Var.i = null;
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            int f10 = i0.a.f(0.125f, getThemedColor(k6.d6), getThemedColor(k6.G6));
            gi.d dVar = this.n;
            if (dVar == null || f10 == this.x) {
                return;
            }
            this.x = f10;
            dVar.setColor(f10);
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    @Override // qe.b
    public final /* synthetic */ void F(float f10, int i3) {
    }
}
