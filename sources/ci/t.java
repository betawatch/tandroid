package ci;

import ah.g0;
import ah.p0;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.widget.FrameLayout;
import bi.f8;
import bi.la;
import bi.w5;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.es;
import org.telegram.ui.Components.ms0;
import org.telegram.ui.Components.pu0;
import org.telegram.ui.Components.wx0;
import org.telegram.ui.Components.x41;
import w7.z5;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes4.dex */
public final class t extends FrameLayout {
    public static final /* synthetic */ int a0 = 0;
    public final n E;
    public final di.d F;
    public final s4.y G;
    public boolean H;
    public boolean I;
    public final q J;
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
    public final /* synthetic */ ms0 W;
    public f8 a;
    public boolean b;
    public float c;
    public int d;
    public int e;
    public final i f;
    public final h h;
    public final s4.k n;
    public final pu0 r;
    public final k s;
    public final l v;
    public final s w;
    public final m x;
    public final wx0 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(ms0 ms0Var, Context context) {
        super(context);
        this.W = ms0Var;
        this.d = Utilities.clamp(SharedConfig.storiesColumnsCount, 6, 2);
        this.e = Utilities.clamp(SharedConfig.storiesColumnsCount, 6, 2);
        this.H = false;
        this.I = false;
        this.V = new Rect();
        h hVar = new h();
        this.h = hVar;
        hVar.O = new g(this, 1);
        hVar.y1(this.d);
        s4.k kVar = new s4.k();
        this.n = kVar;
        kVar.n(280L);
        kVar.o(es.h);
        kVar.m = false;
        i iVar = new i(this, context);
        this.f = iVar;
        iVar.setScrollingTouchSlop(1);
        iVar.setPinnedSectionOffsetY(-AndroidUtilities.dp(2.0f));
        iVar.setPadding(0, 0, 0, 0);
        iVar.setItemAnimator(null);
        iVar.setClipToPadding(false);
        iVar.setSectionsType(2);
        iVar.setLayoutManager(hVar);
        addView(iVar, z5.d(-1.0f, -1));
        iVar.i(new j(this, 0));
        iVar.setOnItemClickListener(new bi.d(this, 1));
        iVar.setOnItemLongClickListener(new a1.c(this, 14));
        pu0 pu0Var = new pu0(context, null);
        this.r = pu0Var;
        k kVar2 = new k(this);
        this.s = kVar2;
        pu0Var.setLayoutManager(kVar2);
        pu0Var.i(new j(this, 1));
        kVar2.y1(this.e);
        pu0Var.setVisibility(8);
        addView(pu0Var, z5.d(-1.0f, -1));
        l lVar = new l(this, context);
        this.v = lVar;
        iVar.setAdapter(lVar);
        s sVar = new s(this, getContext());
        lVar.f = sVar;
        this.w = sVar;
        pu0Var.setAdapter(sVar);
        m mVar = new m(this, context);
        this.x = mVar;
        mVar.w = false;
        wx0 wx0Var = new wx0(context, mVar, 1, null);
        this.y = wx0Var;
        wx0Var.setVisibility(8);
        wx0Var.setAnimateLayoutChange(true);
        addView(wx0Var, z5.d(-1.0f, -1));
        wx0Var.setOnTouchListener(new d(0));
        wx0Var.e(true, false);
        wx0Var.b.setVisibility(8);
        wx0Var.d.setText(LocaleController.getString(R.string.ProfileBotPreviewEmptyTitle));
        wx0Var.e.setText(LocaleController.formatPluralString("ProfileBotPreviewEmptyText", MessagesController.getInstance(ms0Var.b).botPreviewMediasMax, new Object[0]));
        String string = LocaleController.getString(R.string.ProfileBotPreviewEmptyButton);
        di.d dVar = wx0Var.f;
        dVar.g(string, false, true);
        dVar.setVisibility(0);
        dVar.setOnClickListener(new e(this, 0));
        n nVar = new n(this, context);
        this.E = nVar;
        int i10 = g6.y6;
        c6 c6Var = ms0Var.c;
        nVar.setTextColor(g6.w0(i10, c6Var));
        nVar.setText(LocaleController.getString(R.string.ProfileBotOr));
        nVar.setTextSize(1, 14.0f);
        nVar.setTextAlignment(4);
        nVar.setGravity(17);
        nVar.setTypeface(AndroidUtilities.bold());
        wx0Var.a.addView(nVar, z5.t(165, -2, 17, 0, 17, 0, 12));
        di.d dVar2 = new di.d(context, c6Var, false);
        this.F = dVar2;
        dVar2.setMinWidth(AndroidUtilities.dp(200.0f));
        wx0Var.a.addView(dVar2, z5.q(-2, 44, 17));
        wx0Var.addView(mVar, 0, z5.d(-1.0f, -1));
        iVar.setEmptyView(wx0Var);
        iVar.W1 = true;
        iVar.X1 = 0;
        new SparseArray();
        new HashMap();
        s4.y yVar = new s4.y(new f(this, 0));
        this.G = yVar;
        yVar.d(iVar);
        q qVar = new q(context, c6Var);
        this.J = qVar;
        addView(qVar, z5.e(-1, -2, 48));
    }

    public final void a() {
        if (this.b) {
            float f7 = this.c;
            pu0 pu0Var = this.r;
            i iVar = this.f;
            if (f7 != 1.0f) {
                if (f7 == 0.0f) {
                    this.b = false;
                    pu0Var.setVisibility(8);
                    iVar.invalidate();
                    return;
                }
                int i10 = 1;
                boolean z10 = f7 > 0.2f;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(f7, z10 ? 1.0f : 0.0f);
                ofFloat.addUpdateListener(new w5(this, i10));
                ofFloat.addListener(new p0(6, this, z10));
                ofFloat.setInterpolator(es.f);
                ofFloat.setDuration(200L);
                ofFloat.start();
                return;
            }
            this.b = false;
            int i11 = this.e;
            this.d = i11;
            this.W.y = i11;
            SharedConfig.setStoriesColumnsCount(i11);
            l lVar = this.v;
            int h = lVar.h();
            pu0Var.setVisibility(8);
            int i12 = this.d;
            h hVar = this.h;
            hVar.y1(i12);
            iVar.a0();
            iVar.invalidate();
            if (lVar.h() == h) {
                AndroidUtilities.updateVisibleRows(iVar);
            } else {
                lVar.l();
            }
            int i13 = this.S;
            if (i13 >= 0) {
                View m10 = this.s.m(i13);
                if (m10 != null) {
                    this.T = m10.getTop();
                }
                hVar.h1(this.S, (-iVar.getPaddingTop()) + this.T);
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
        pu0 pu0Var = this.r;
        pu0Var.setVisibility(0);
        pu0Var.setAdapter(this.w);
        pu0Var.setPadding(pu0Var.getPaddingLeft(), 0, pu0Var.getPaddingRight(), this.J.getMeasuredHeight() + AndroidUtilities.dp(42.0f));
        k kVar = this.s;
        kVar.y1(clamp);
        pu0Var.a0();
        kVar.O = new g(this, 0);
        AndroidUtilities.updateVisibleRows(this.f);
        this.b = true;
        this.c = 0.0f;
        int i11 = this.S;
        if (i11 >= 0) {
            kVar.h1(i11, this.T - pu0Var.getPaddingTop());
        }
    }

    public final void c() {
        String string;
        int i10 = this.W.b;
        f8 f8Var = this.a;
        int size = f8Var == null ? 0 : f8Var.i.size();
        f8 f8Var2 = this.a;
        int i11 = 1;
        boolean z10 = f8Var2 == null || TextUtils.isEmpty(f8Var2.E);
        int i12 = size > 0 ? 0 : 8;
        q qVar = this.J;
        qVar.setVisibility(i12);
        String string2 = z10 ? LocaleController.getString(R.string.ProfileBotPreviewFooterGeneral) : LocaleController.formatString(R.string.ProfileBotPreviewFooterLanguage, x41.F(this.a.E, null, null));
        String string3 = LocaleController.getString(R.string.ProfileBotAddPreview);
        la laVar = new la(this, 10);
        if (z10 || size <= 0) {
            string = LocaleController.getString(z10 ? R.string.ProfileBotPreviewFooterCreateTranslation : R.string.ProfileBotPreviewFooterDeleteTranslation);
        } else {
            string = null;
        }
        ah.t tVar = (z10 || size <= 0) ? new ah.t(i11, this, z10) : null;
        n nVar = qVar.c;
        di.d dVar = qVar.d;
        qVar.a.setText(string2);
        p pVar = qVar.b;
        pVar.g(string3, false, true);
        pVar.setOnClickListener(new g0(laVar, 7));
        if (string == null) {
            nVar.setVisibility(8);
            dVar.setVisibility(8);
        } else {
            nVar.setVisibility(0);
            dVar.setVisibility(0);
            dVar.g(string, false, true);
            dVar.setOnClickListener(new o(0, tVar));
        }
        n nVar2 = this.E;
        di.d dVar2 = this.F;
        wx0 wx0Var = this.y;
        if (z10) {
            wx0Var.d.setVisibility(0);
            wx0Var.d.setText(LocaleController.getString(R.string.ProfileBotPreviewEmptyTitle));
            wx0Var.e.setText(LocaleController.formatPluralString("ProfileBotPreviewEmptyText", MessagesController.getInstance(i10).botPreviewMediasMax, new Object[0]));
            wx0Var.f.g(LocaleController.getString(R.string.ProfileBotPreviewEmptyButton), false, true);
            nVar2.setVisibility(8);
            dVar2.setVisibility(8);
        } else {
            wx0Var.d.setVisibility(8);
            wx0Var.e.setText(LocaleController.formatString(R.string.ProfileBotPreviewFooterLanguage, x41.F(this.a.E, null, null)));
            wx0Var.f.g(LocaleController.getString(R.string.ProfileBotPreviewEmptyButton), false, true);
            nVar2.setVisibility(0);
            dVar2.setVisibility(0);
            dVar2.g(LocaleController.getString(R.string.ProfileBotPreviewFooterDeleteTranslation), false, true);
            dVar2.setOnClickListener(new e(this, i11));
        }
        wx0Var.f.setVisibility(this.v.h() >= MessagesController.getInstance(i10).botPreviewMediasMax ? 8 : 0);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (view == this.r) {
            return true;
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        i iVar = this.f;
        iVar.setPadding(iVar.getPaddingLeft(), iVar.W2, iVar.getPaddingRight(), this.J.getMeasuredHeight() + AndroidUtilities.dp(42.0f));
    }

    public void setList(f8 f8Var) {
        if (this.a != f8Var) {
            this.H = false;
            this.I = false;
            this.d = this.W.y;
        }
        this.a = f8Var;
        l lVar = this.v;
        lVar.e = f8Var;
        if (lVar != lVar.s.w) {
            lVar.M();
        }
        lVar.l();
        s sVar = this.w;
        sVar.e = f8Var;
        if (sVar != sVar.s.w) {
            sVar.M();
        }
        sVar.l();
        c();
    }

    public void setVisibleHeight(int i10) {
        float f7 = (-(getMeasuredHeight() - Math.max(i10, AndroidUtilities.dp(280.0f)))) / 2.0f;
        this.y.setTranslationY(f7);
        this.x.setTranslationY(-f7);
    }
}
