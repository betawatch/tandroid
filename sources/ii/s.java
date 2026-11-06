package ii;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import bi.kd;
import c8.ha;
import fi.r7;
import hi.u1;
import hi.x3;
import java.util.WeakHashMap;
import org.telegram.messenger.a8;
import org.telegram.messenger.hd;
import org.telegram.messenger.qp;
import org.telegram.messenger.t3;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.f2;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.ActionBar.y1;
import org.telegram.ui.Components.av0;
import org.telegram.ui.Components.hc;
import org.telegram.ui.Components.q41;
import org.telegram.ui.Components.x31;
import org.telegram.ui.Components.xq;
import org.telegram.ui.an;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes4.dex */
public final class s extends f2 implements te.b {
    public final te.a a;
    public long b;
    public FrameLayout c;
    public q41 d;
    public lh.f e;
    public LinearLayout f;
    public fi.d h;
    public fi.d n;
    public av0 r;
    public TLRPC.ChatFull s;
    public l0 w;
    public int x;

    public s(Bundle bundle) {
        super(bundle);
        this.a = new te.a(0, this, xq.h, 320L, false);
    }

    public static void Z(s sVar, x31 x31Var) {
        Object obj = x31Var.G;
        if (obj instanceof ji.f) {
            ji.f fVar = (ji.f) obj;
            long j3 = fVar.a;
            TLRPC.Chat M0 = qp.s1(sVar.currentAccount).M0(Long.valueOf(-j3));
            TLRPC.User a22 = qp.s1(sVar.currentAccount).a2(Long.valueOf(j3));
            if (a22 != null) {
                sVar.presentFragment(an.ra(a22.id));
            } else if (t3.t0(M0) || t3.j0(M0)) {
                sVar.presentFragment(an.ra(-M0.id));
            } else {
                new ki.b(sVar.getParentActivity(), M0, new ha.b(9, sVar, fVar)).show();
            }
        }
    }

    @Override // te.b
    public final void Y(int i7, float f10, float f11, te.c cVar) {
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

    @Override // org.telegram.ui.ActionBar.f2
    public final View createView(Context context) {
        boolean z9 = true;
        z9 = true;
        setHasOwnBackground(true);
        l0 l0Var = new l0(getParentActivity(), this.resourceProvider, hc.a0(this), this.currentAccount, this.b);
        this.w = l0Var;
        l0Var.h = new g6.d0(this, 6);
        l0Var.d();
        this.w.e();
        final int i7 = 0;
        this.actionBar.setBackButtonDrawable(new y1(false));
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new bi.s(this, 7));
        this.actionBar.setTitle(hd.M0(2131751895, null));
        FrameLayout frameLayout = new FrameLayout(context);
        this.c = frameLayout;
        int i10 = k6.a7;
        r6.i(i10, frameLayout, null);
        q41 q41Var = new q41(this, new u1(this, 3), new q(this), new x3(this, 7));
        this.d = q41Var;
        q41Var.setClipToPadding(false);
        q41 q41Var2 = this.d;
        q41Var2.f3.r = false;
        q41Var2.r1();
        this.d.j(new ai.b(this, 16));
        this.actionBar.setAdaptiveBackground(this.d);
        this.c.addView(this.d, ha.c(-1.0f, -1));
        lh.f fVar = new lh.f(context);
        this.e = fVar;
        fVar.setupColorKey(i10);
        this.e.setFadeZoneBottom(org.telegram.messenger.g0.L(72.0f));
        this.e.setFadeHeightBottom(org.telegram.messenger.g0.L(24.0f));
        this.c.addView(this.e, ha.g());
        this.c.addView(this.actionBar, ha.e(-1, -2, 48));
        LinearLayout linearLayout = new LinearLayout(context);
        this.f = linearLayout;
        linearLayout.setOrientation(0);
        this.f.setPadding(org.telegram.messenger.g0.L(7.0f), 0, org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(12.0f));
        fi.d dVar = new fi.d(context, this.resourceProvider, true);
        this.n = dVar;
        dVar.e();
        fi.d dVar2 = this.n;
        int f10 = i0.a.f(0.125f, getThemedColor(k6.d6), getThemedColor(k6.G6));
        this.x = f10;
        dVar2.setColor(f10);
        this.n.setText(hd.M0(2131751900, null));
        this.n.f();
        this.n.setOnClickListener(new View.OnClickListener(this) { // from class: ii.r
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
        this.f.addView(this.n, ha.q(0, 48, 1.0f, 0, 4, 0, 4, 0));
        fi.d dVar3 = new fi.d(context, this.resourceProvider, true);
        this.h = dVar3;
        dVar3.setText(hd.M0(2131751902, null));
        this.h.f();
        fi.d dVar4 = this.h;
        final int i11 = z9 ? 1 : 0;
        dVar4.setOnClickListener(new View.OnClickListener(this) { // from class: ii.r
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
        this.f.addView(this.h, ha.q(0, 48, 1.0f, 0, 4, 0, 4, 0));
        this.c.addView(this.f, ha.e(-1, -2, 80));
        av0 av0Var = new av0(getParentActivity(), null, 16, this.resourceProvider);
        this.r = av0Var;
        av0Var.d.setText(hd.M0(2131748224, null));
        this.r.e.setText(hd.M0(2131748223, null));
        this.r.setAnimateLayoutChange(true);
        this.r.setVisibility(8);
        this.c.addView(this.r, ha.e(-2, -2, 17));
        TLRPC.ChatFull chatFull = this.s;
        if (chatFull != null && chatFull.requests_pending != 0) {
            z9 = false;
        }
        this.a.a(z9, false);
        a0(0);
        FrameLayout frameLayout2 = this.c;
        q qVar = new q(this);
        WeakHashMap weakHashMap = r0.i0.a;
        r0.a0.i(frameLayout2, qVar);
        setBulletinDelegate(new r7(4));
        FrameLayout frameLayout3 = this.c;
        this.fragmentView = frameLayout3;
        return frameLayout3;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean drawEdgeNavigationBar() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean onFragmentCreate() {
        this.b = this.arguments.getLong("community_id", 0L);
        getMessagesController().M0(Long.valueOf(this.b));
        this.s = getMessagesController().N0(this.b);
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        l0 l0Var = this.w;
        kd kdVar = l0Var.i;
        if (kdVar != null) {
            kdVar.run();
        }
        l0Var.i = null;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            int f10 = i0.a.f(0.125f, getThemedColor(k6.d6), getThemedColor(k6.G6));
            fi.d dVar = this.n;
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
    public final /* synthetic */ void F(float f10, int i7) {
    }
}
