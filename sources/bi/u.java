package bi;

import ai.k6;
import ai.u8;
import ai.v0;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.widget.FrameLayout;
import androidx.fragment.app.a0;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.mr0;
import org.telegram.ui.Components.qt0;
import org.telegram.ui.Components.rr;
import org.telegram.ui.Components.u31;
import org.telegram.ui.Components.xw0;
import w7.x5;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes4.dex */
public final class u extends FrameLayout {
    public static final /* synthetic */ int a0 = 0;
    public final o E;
    public final ci.d F;
    public final s4.y G;
    public boolean H;
    public boolean I;
    public final r J;
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
    public final /* synthetic */ mr0 W;
    public u8 a;
    public boolean b;
    public float c;
    public int d;
    public int e;
    public final j f;
    public final i h;
    public final s4.j n;
    public final qt0 r;
    public final l s;
    public final m v;
    public final t w;
    public final n x;
    public final xw0 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(mr0 mr0Var, Context context) {
        super(context);
        this.W = mr0Var;
        this.d = Utilities.clamp(SharedConfig.storiesColumnsCount, 6, 2);
        this.e = Utilities.clamp(SharedConfig.storiesColumnsCount, 6, 2);
        this.H = false;
        this.I = false;
        this.V = new Rect();
        i iVar = new i();
        this.h = iVar;
        iVar.O = new h(this, 1);
        iVar.y1(this.d);
        s4.j jVar = new s4.j();
        this.n = jVar;
        jVar.n(280L);
        jVar.o(rr.h);
        jVar.m = false;
        j jVar2 = new j(this, context);
        this.f = jVar2;
        jVar2.setScrollingTouchSlop(1);
        jVar2.setPinnedSectionOffsetY(-AndroidUtilities.dp(2.0f));
        jVar2.setPadding(0, 0, 0, 0);
        jVar2.setItemAnimator(null);
        jVar2.setClipToPadding(false);
        jVar2.setSectionsType(2);
        jVar2.setLayoutManager(iVar);
        addView(jVar2, x5.c(-1.0f, -1));
        jVar2.i(new k(this, 0));
        jVar2.setOnItemClickListener(new ai.g(this, 1));
        jVar2.setOnItemLongClickListener(new a1.c(this, 12));
        qt0 qt0Var = new qt0(context, null);
        this.r = qt0Var;
        l lVar = new l(this);
        this.s = lVar;
        qt0Var.setLayoutManager(lVar);
        qt0Var.i(new k(this, 1));
        lVar.y1(this.e);
        qt0Var.setVisibility(8);
        addView(qt0Var, x5.c(-1.0f, -1));
        m mVar = new m(this, context);
        this.v = mVar;
        jVar2.setAdapter(mVar);
        t tVar = new t(this, getContext());
        mVar.f = tVar;
        this.w = tVar;
        qt0Var.setAdapter(tVar);
        n nVar = new n(this, context);
        this.x = nVar;
        nVar.w = false;
        xw0 xw0Var = new xw0(context, nVar, 1, null);
        this.y = xw0Var;
        xw0Var.setVisibility(8);
        xw0Var.setAnimateLayoutChange(true);
        addView(xw0Var, x5.c(-1.0f, -1));
        xw0Var.setOnTouchListener(new d(0));
        xw0Var.e(true, false);
        xw0Var.b.setVisibility(8);
        xw0Var.d.setText(LocaleController.getString(R.string.ProfileBotPreviewEmptyTitle));
        xw0Var.e.setText(LocaleController.formatPluralString("ProfileBotPreviewEmptyText", MessagesController.getInstance(mr0Var.b).botPreviewMediasMax, new Object[0]));
        String string = LocaleController.getString(R.string.ProfileBotPreviewEmptyButton);
        ci.d dVar = xw0Var.f;
        dVar.g(string, false, true);
        dVar.setVisibility(0);
        dVar.setOnClickListener(new e(this, 0));
        o oVar = new o(this, context);
        this.E = oVar;
        int i10 = h6.y6;
        d6 d6Var = mr0Var.c;
        oVar.setTextColor(h6.v0(i10, d6Var));
        oVar.setText(LocaleController.getString(R.string.ProfileBotOr));
        oVar.setTextSize(1, 14.0f);
        oVar.setTextAlignment(4);
        oVar.setGravity(17);
        oVar.setTypeface(AndroidUtilities.bold());
        xw0Var.a.addView(oVar, x5.t(165, -2, 17, 0, 17, 0, 12));
        ci.d dVar2 = new ci.d(context, d6Var, false);
        this.F = dVar2;
        dVar2.setMinWidth(AndroidUtilities.dp(200.0f));
        xw0Var.a.addView(dVar2, x5.q(-2, 44, 17));
        xw0Var.addView(nVar, 0, x5.c(-1.0f, -1));
        jVar2.setEmptyView(xw0Var);
        jVar2.Y1 = true;
        jVar2.Z1 = 0;
        new SparseArray();
        new HashMap();
        s4.y yVar = new s4.y(new g(this, 0));
        this.G = yVar;
        yVar.e(jVar2);
        r rVar = new r(context, d6Var);
        this.J = rVar;
        addView(rVar, x5.e(-1, -2, 48));
    }

    public final void a() {
        if (this.b) {
            float f7 = this.c;
            qt0 qt0Var = this.r;
            j jVar = this.f;
            if (f7 != 1.0f) {
                if (f7 == 0.0f) {
                    this.b = false;
                    qt0Var.setVisibility(8);
                    jVar.invalidate();
                    return;
                }
                int i10 = 1;
                boolean z10 = f7 > 0.2f;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(f7, z10 ? 1.0f : 0.0f);
                ofFloat.addUpdateListener(new k6(this, i10));
                ofFloat.addListener(new ai.n(5, this, z10));
                ofFloat.setInterpolator(rr.f);
                ofFloat.setDuration(200L);
                ofFloat.start();
                return;
            }
            this.b = false;
            int i11 = this.e;
            this.d = i11;
            this.W.y = i11;
            SharedConfig.setStoriesColumnsCount(i11);
            m mVar = this.v;
            int h = mVar.h();
            qt0Var.setVisibility(8);
            int i12 = this.d;
            i iVar = this.h;
            iVar.y1(i12);
            jVar.a0();
            jVar.invalidate();
            if (mVar.h() == h) {
                AndroidUtilities.updateVisibleRows(jVar);
            } else {
                mVar.l();
            }
            int i13 = this.S;
            if (i13 >= 0) {
                View m10 = this.s.m(i13);
                if (m10 != null) {
                    this.T = m10.getTop();
                }
                iVar.h1(this.S, (-jVar.getPaddingTop()) + this.T);
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
        qt0 qt0Var = this.r;
        qt0Var.setVisibility(0);
        qt0Var.setAdapter(this.w);
        qt0Var.setPadding(qt0Var.getPaddingLeft(), 0, qt0Var.getPaddingRight(), this.J.getMeasuredHeight() + AndroidUtilities.dp(42.0f));
        l lVar = this.s;
        lVar.y1(clamp);
        qt0Var.a0();
        lVar.O = new h(this, 0);
        AndroidUtilities.updateVisibleRows(this.f);
        this.b = true;
        this.c = 0.0f;
        int i11 = this.S;
        if (i11 >= 0) {
            lVar.h1(i11, this.T - qt0Var.getPaddingTop());
        }
    }

    public final void c() {
        String string;
        int i10 = this.W.b;
        u8 u8Var = this.a;
        int size = u8Var == null ? 0 : u8Var.i.size();
        u8 u8Var2 = this.a;
        int i11 = 1;
        boolean z10 = u8Var2 == null || TextUtils.isEmpty(u8Var2.E);
        int i12 = size > 0 ? 0 : 8;
        r rVar = this.J;
        rVar.setVisibility(i12);
        String string2 = z10 ? LocaleController.getString(R.string.ProfileBotPreviewFooterGeneral) : LocaleController.formatString(R.string.ProfileBotPreviewFooterLanguage, u31.E(this.a.E, null, null));
        String string3 = LocaleController.getString(R.string.ProfileBotAddPreview);
        a0 a0Var = new a0(this, 3);
        if (z10 || size <= 0) {
            string = LocaleController.getString(z10 ? R.string.ProfileBotPreviewFooterCreateTranslation : R.string.ProfileBotPreviewFooterDeleteTranslation);
        } else {
            string = null;
        }
        f fVar = (z10 || size <= 0) ? new f(r2, this, z10) : null;
        o oVar = rVar.c;
        ci.d dVar = rVar.d;
        rVar.a.setText(string2);
        q qVar = rVar.b;
        qVar.g(string3, false, true);
        qVar.setOnClickListener(new v0(a0Var, 6));
        if (string == null) {
            oVar.setVisibility(8);
            dVar.setVisibility(8);
        } else {
            oVar.setVisibility(0);
            dVar.setVisibility(0);
            dVar.g(string, false, true);
            dVar.setOnClickListener(new p(0, fVar));
        }
        o oVar2 = this.E;
        ci.d dVar2 = this.F;
        xw0 xw0Var = this.y;
        if (z10) {
            xw0Var.d.setVisibility(0);
            xw0Var.d.setText(LocaleController.getString(R.string.ProfileBotPreviewEmptyTitle));
            xw0Var.e.setText(LocaleController.formatPluralString("ProfileBotPreviewEmptyText", MessagesController.getInstance(i10).botPreviewMediasMax, new Object[0]));
            xw0Var.f.g(LocaleController.getString(R.string.ProfileBotPreviewEmptyButton), false, true);
            oVar2.setVisibility(8);
            dVar2.setVisibility(8);
        } else {
            xw0Var.d.setVisibility(8);
            xw0Var.e.setText(LocaleController.formatString(R.string.ProfileBotPreviewFooterLanguage, u31.E(this.a.E, null, null)));
            xw0Var.f.g(LocaleController.getString(R.string.ProfileBotPreviewEmptyButton), false, true);
            oVar2.setVisibility(0);
            dVar2.setVisibility(0);
            dVar2.g(LocaleController.getString(R.string.ProfileBotPreviewFooterDeleteTranslation), false, true);
            dVar2.setOnClickListener(new e(this, i11));
        }
        xw0Var.f.setVisibility(this.v.h() >= MessagesController.getInstance(i10).botPreviewMediasMax ? 8 : 0);
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
        j jVar = this.f;
        jVar.setPadding(jVar.getPaddingLeft(), jVar.Y2, jVar.getPaddingRight(), this.J.getMeasuredHeight() + AndroidUtilities.dp(42.0f));
    }

    public void setList(u8 u8Var) {
        if (this.a != u8Var) {
            this.H = false;
            this.I = false;
            this.d = this.W.y;
        }
        this.a = u8Var;
        m mVar = this.v;
        mVar.e = u8Var;
        if (mVar != mVar.s.w) {
            mVar.M();
        }
        mVar.l();
        t tVar = this.w;
        tVar.e = u8Var;
        if (tVar != tVar.s.w) {
            tVar.M();
        }
        tVar.l();
        c();
    }

    public void setVisibleHeight(int i10) {
        float f7 = (-(getMeasuredHeight() - Math.max(i10, AndroidUtilities.dp(280.0f)))) / 2.0f;
        this.y.setTranslationY(f7);
        this.x.setTranslationY(-f7);
    }
}
