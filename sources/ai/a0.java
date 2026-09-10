package ai;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.widget.FrameLayout;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.i41;
import org.telegram.ui.Components.jx0;
import org.telegram.ui.Components.vr0;
import org.telegram.ui.Components.wr;
import org.telegram.ui.Components.zt0;
import w7.a6;
import zh.s4;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final class a0 extends FrameLayout {
    public static final /* synthetic */ int a0 = 0;
    public final t E;
    public final bi.d F;
    public final s4.y G;
    public boolean H;
    public boolean I;
    public final x J;
    public boolean K;
    public boolean L;
    public boolean M;
    public int N;
    public int O;
    public float P;
    public float Q;
    public boolean R;
    public int S;
    public int T;
    public int U;
    public final Rect V;
    public final /* synthetic */ vr0 W;
    public s4 a;
    public boolean b;
    public float c;
    public int d;
    public int e;
    public final o f;
    public final n h;
    public final s4.j n;
    public final zt0 r;
    public final q s;
    public final r v;
    public final z w;
    public final s x;
    public final jx0 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(vr0 vr0Var, Context context) {
        super(context);
        this.W = vr0Var;
        this.d = Utilities.clamp(SharedConfig.storiesColumnsCount, 6, 2);
        this.e = Utilities.clamp(SharedConfig.storiesColumnsCount, 6, 2);
        this.H = false;
        this.I = false;
        this.V = new Rect();
        n nVar = new n();
        this.h = nVar;
        nVar.O = new l(this, 1);
        nVar.y1(this.d);
        s4.j jVar = new s4.j();
        this.n = jVar;
        jVar.n(280L);
        jVar.o(wr.h);
        jVar.m = false;
        o oVar = new o(this, context);
        this.f = oVar;
        oVar.setScrollingTouchSlop(1);
        oVar.setPinnedSectionOffsetY(-AndroidUtilities.dp(2.0f));
        oVar.setPadding(0, 0, 0, 0);
        oVar.setItemAnimator(null);
        oVar.setClipToPadding(false);
        oVar.setSectionsType(2);
        oVar.setLayoutManager(nVar);
        addView(oVar, a6.c(-1.0f, -1));
        int i10 = 0;
        oVar.i(new p(this, i10));
        oVar.setOnItemClickListener(new g(this, i10));
        oVar.setOnItemLongClickListener(new a1.c(this, 3));
        zt0 zt0Var = new zt0(context, null);
        this.r = zt0Var;
        q qVar = new q(this);
        this.s = qVar;
        zt0Var.setLayoutManager(qVar);
        zt0Var.i(new p(this, 1));
        qVar.y1(this.e);
        zt0Var.setVisibility(8);
        addView(zt0Var, a6.c(-1.0f, -1));
        r rVar = new r(this, context);
        this.v = rVar;
        oVar.setAdapter(rVar);
        z zVar = new z(this, getContext());
        rVar.f = zVar;
        this.w = zVar;
        zt0Var.setAdapter(zVar);
        s sVar = new s(this, context);
        this.x = sVar;
        sVar.w = false;
        jx0 jx0Var = new jx0(context, sVar, 1, null);
        this.y = jx0Var;
        jx0Var.setVisibility(8);
        jx0Var.setAnimateLayoutChange(true);
        addView(jx0Var, a6.c(-1.0f, -1));
        jx0Var.setOnTouchListener(new h(0));
        jx0Var.e(true, false);
        jx0Var.b.setVisibility(8);
        jx0Var.d.setText(LocaleController.getString(R.string.ProfileBotPreviewEmptyTitle));
        jx0Var.e.setText(LocaleController.formatPluralString("ProfileBotPreviewEmptyText", MessagesController.getInstance(vr0Var.b).botPreviewMediasMax, new Object[0]));
        String string = LocaleController.getString(R.string.ProfileBotPreviewEmptyButton);
        bi.d dVar = jx0Var.f;
        dVar.g(string, false, true);
        dVar.setVisibility(0);
        dVar.setOnClickListener(new i(this, 0));
        t tVar = new t(this, context);
        this.E = tVar;
        int i11 = j6.y6;
        f6 f6Var = vr0Var.c;
        tVar.setTextColor(j6.v0(i11, f6Var));
        tVar.setText(LocaleController.getString(R.string.ProfileBotOr));
        tVar.setTextSize(1, 14.0f);
        tVar.setTextAlignment(4);
        tVar.setGravity(17);
        tVar.setTypeface(AndroidUtilities.bold());
        jx0Var.a.addView(tVar, a6.t(165, -2, 17, 0, 17, 0, 12));
        bi.d dVar2 = new bi.d(context, f6Var, false);
        this.F = dVar2;
        dVar2.setMinWidth(AndroidUtilities.dp(200.0f));
        jx0Var.a.addView(dVar2, a6.q(-2, 44, 17));
        jx0Var.addView(sVar, 0, a6.c(-1.0f, -1));
        oVar.setEmptyView(jx0Var);
        oVar.Y1 = true;
        oVar.Z1 = 0;
        new SparseArray();
        new HashMap();
        s4.y yVar = new s4.y(new k(this, 0));
        this.G = yVar;
        yVar.d(oVar);
        x xVar = new x(context, f6Var);
        this.J = xVar;
        addView(xVar, a6.e(-1, -2, 48));
    }

    public final void a() {
        if (this.b) {
            float f7 = this.c;
            zt0 zt0Var = this.r;
            int i10 = 0;
            o oVar = this.f;
            if (f7 != 1.0f) {
                if (f7 == 0.0f) {
                    this.b = false;
                    zt0Var.setVisibility(8);
                    oVar.invalidate();
                    return;
                }
                int i11 = 1;
                boolean z10 = f7 > 0.2f;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(f7, z10 ? 1.0f : 0.0f);
                ofFloat.addUpdateListener(new m(this, i10));
                ofFloat.addListener(new e(i11, this, z10));
                ofFloat.setInterpolator(wr.f);
                ofFloat.setDuration(200L);
                ofFloat.start();
                return;
            }
            this.b = false;
            int i12 = this.e;
            this.d = i12;
            this.W.y = i12;
            SharedConfig.setStoriesColumnsCount(i12);
            r rVar = this.v;
            int h = rVar.h();
            zt0Var.setVisibility(8);
            int i13 = this.d;
            n nVar = this.h;
            nVar.y1(i13);
            oVar.a0();
            oVar.invalidate();
            if (rVar.h() == h) {
                AndroidUtilities.updateVisibleRows(oVar);
            } else {
                rVar.l();
            }
            int i14 = this.S;
            if (i14 >= 0) {
                View m10 = this.s.m(i14);
                if (m10 != null) {
                    this.T = m10.getTop();
                }
                nVar.h1(this.S, (-oVar.getPaddingTop()) + this.T);
            }
        }
    }

    public final void b(boolean z10) {
        if (this.b || this.W.G.C1) {
            return;
        }
        int i10 = this.d + (!z10 ? 1 : -1);
        if (i10 > 6) {
            i10 = !z10 ? 9 : 6;
        }
        int clamp = Utilities.clamp(i10, 6, this.H ? 1 : 2);
        this.e = clamp;
        if (clamp == this.d || this.H) {
            return;
        }
        zt0 zt0Var = this.r;
        zt0Var.setVisibility(0);
        zt0Var.setAdapter(this.w);
        zt0Var.setPadding(zt0Var.getPaddingLeft(), 0, zt0Var.getPaddingRight(), this.J.getMeasuredHeight() + AndroidUtilities.dp(42.0f));
        q qVar = this.s;
        qVar.y1(clamp);
        zt0Var.a0();
        qVar.O = new l(this, 0);
        AndroidUtilities.updateVisibleRows(this.f);
        this.b = true;
        this.c = 0.0f;
        int i11 = this.S;
        if (i11 >= 0) {
            qVar.h1(i11, this.T - zt0Var.getPaddingTop());
        }
    }

    public final void c() {
        String string;
        int i10 = this.W.b;
        s4 s4Var = this.a;
        int size = s4Var == null ? 0 : s4Var.i.size();
        s4 s4Var2 = this.a;
        int i11 = 1;
        boolean z10 = s4Var2 == null || TextUtils.isEmpty(s4Var2.E);
        int i12 = size > 0 ? 0 : 8;
        x xVar = this.J;
        xVar.setVisibility(i12);
        String string2 = z10 ? LocaleController.getString(R.string.ProfileBotPreviewFooterGeneral) : LocaleController.formatString(R.string.ProfileBotPreviewFooterLanguage, i41.D(this.a.E, null, null));
        String string3 = LocaleController.getString(R.string.ProfileBotAddPreview);
        a3.d dVar = new a3.d(this, 3);
        if (z10 || size <= 0) {
            string = LocaleController.getString(z10 ? R.string.ProfileBotPreviewFooterCreateTranslation : R.string.ProfileBotPreviewFooterDeleteTranslation);
        } else {
            string = null;
        }
        j jVar = (z10 || size <= 0) ? new j(r2, this, z10) : null;
        t tVar = xVar.c;
        bi.d dVar2 = xVar.d;
        xVar.a.setText(string2);
        w wVar = xVar.b;
        wVar.g(string3, false, true);
        wVar.setOnClickListener(new u(dVar, r2));
        if (string == null) {
            tVar.setVisibility(8);
            dVar2.setVisibility(8);
        } else {
            tVar.setVisibility(0);
            dVar2.setVisibility(0);
            dVar2.g(string, false, true);
            dVar2.setOnClickListener(new v(0, jVar));
        }
        t tVar2 = this.E;
        bi.d dVar3 = this.F;
        jx0 jx0Var = this.y;
        if (z10) {
            jx0Var.d.setVisibility(0);
            jx0Var.d.setText(LocaleController.getString(R.string.ProfileBotPreviewEmptyTitle));
            jx0Var.e.setText(LocaleController.formatPluralString("ProfileBotPreviewEmptyText", MessagesController.getInstance(i10).botPreviewMediasMax, new Object[0]));
            jx0Var.f.g(LocaleController.getString(R.string.ProfileBotPreviewEmptyButton), false, true);
            tVar2.setVisibility(8);
            dVar3.setVisibility(8);
        } else {
            jx0Var.d.setVisibility(8);
            jx0Var.e.setText(LocaleController.formatString(R.string.ProfileBotPreviewFooterLanguage, i41.D(this.a.E, null, null)));
            jx0Var.f.g(LocaleController.getString(R.string.ProfileBotPreviewEmptyButton), false, true);
            tVar2.setVisibility(0);
            dVar3.setVisibility(0);
            dVar3.g(LocaleController.getString(R.string.ProfileBotPreviewFooterDeleteTranslation), false, true);
            dVar3.setOnClickListener(new i(this, i11));
        }
        jx0Var.f.setVisibility(this.v.h() >= MessagesController.getInstance(i10).botPreviewMediasMax ? 8 : 0);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (view == this.r) {
            return true;
        }
        return super.drawChild(canvas, view, j3);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        o oVar = this.f;
        oVar.setPadding(oVar.getPaddingLeft(), oVar.Y2, oVar.getPaddingRight(), this.J.getMeasuredHeight() + AndroidUtilities.dp(42.0f));
    }

    public void setList(s4 s4Var) {
        if (this.a != s4Var) {
            this.H = false;
            this.I = false;
            this.d = this.W.y;
        }
        this.a = s4Var;
        r rVar = this.v;
        rVar.e = s4Var;
        if (rVar != rVar.s.w) {
            rVar.M();
        }
        rVar.l();
        z zVar = this.w;
        zVar.e = s4Var;
        if (zVar != zVar.s.w) {
            zVar.M();
        }
        zVar.l();
        c();
    }

    public void setVisibleHeight(int i10) {
        float f7 = (-(getMeasuredHeight() - Math.max(i10, AndroidUtilities.dp(280.0f)))) / 2.0f;
        this.y.setTranslationY(f7);
        this.x.setTranslationY(-f7);
    }
}
