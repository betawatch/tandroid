package ei;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.widget.FrameLayout;
import bh.f0;
import bi.w6;
import di.s6;
import di.s8;
import di.u4;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.f7;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.fy0;
import org.telegram.ui.Components.g51;
import org.telegram.ui.Components.kb1;
import org.telegram.ui.Components.tu0;
import org.telegram.ui.Components.vs0;
import s4.z;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class r extends FrameLayout {
    public static final /* synthetic */ int a0 = 0;
    public final n E;
    public final fi.d F;
    public final z G;
    public boolean H;
    public boolean I;
    public final o J;
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
    public final /* synthetic */ vs0 W;
    public s6 a;
    public boolean b;
    public float c;
    public int d;
    public int e;
    public final i f;
    public final h h;
    public final s4.l n;
    public final tu0 r;
    public final k s;
    public final l v;
    public final q w;
    public final m x;
    public final fy0 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(vs0 vs0Var, Context context) {
        super(context);
        this.W = vs0Var;
        this.d = Utilities.clamp(SharedConfig.storiesColumnsCount, 6, 2);
        this.e = Utilities.clamp(SharedConfig.storiesColumnsCount, 6, 2);
        this.H = false;
        this.I = false;
        this.V = new Rect();
        h hVar = new h();
        this.h = hVar;
        hVar.O = new g(this, 1);
        hVar.z1(this.d);
        s4.l lVar = new s4.l();
        this.n = lVar;
        lVar.n(280L);
        lVar.o(ds.h);
        lVar.m = false;
        i iVar = new i(this, context);
        this.f = iVar;
        iVar.setScrollingTouchSlop(1);
        iVar.setPinnedSectionOffsetY(-AndroidUtilities.dp(2.0f));
        iVar.setPadding(0, 0, 0, 0);
        iVar.setItemAnimator(null);
        iVar.setClipToPadding(false);
        iVar.setSectionsType(2);
        iVar.setLayoutManager(hVar);
        addView(iVar, kb1.g(-1.0f, -1));
        iVar.i(new j(this, 0));
        iVar.setOnItemClickListener(new ai.k(this, 6));
        iVar.setOnItemLongClickListener(new e1.c(this, 2));
        tu0 tu0Var = new tu0(context, null);
        this.r = tu0Var;
        k kVar = new k(this);
        this.s = kVar;
        tu0Var.setLayoutManager(kVar);
        tu0Var.i(new j(this, 1));
        kVar.z1(this.e);
        tu0Var.setVisibility(8);
        addView(tu0Var, kb1.g(-1.0f, -1));
        l lVar2 = new l(this, context);
        this.v = lVar2;
        iVar.setAdapter(lVar2);
        q qVar = new q(this, getContext());
        lVar2.f = qVar;
        this.w = qVar;
        tu0Var.setAdapter(qVar);
        m mVar = new m(this, context);
        this.x = mVar;
        mVar.w = false;
        fy0 fy0Var = new fy0(context, mVar, 1, null);
        this.y = fy0Var;
        fy0Var.setVisibility(8);
        fy0Var.setAnimateLayoutChange(true);
        addView(fy0Var, kb1.g(-1.0f, -1));
        fy0Var.setOnTouchListener(new d(0));
        fy0Var.e(true, false);
        fy0Var.b.setVisibility(8);
        fy0Var.d.setText(LocaleController.getString(R.string.ProfileBotPreviewEmptyTitle));
        fy0Var.e.setText(LocaleController.formatPluralString("ProfileBotPreviewEmptyText", MessagesController.getInstance(vs0Var.b).botPreviewMediasMax, new Object[0]));
        String string = LocaleController.getString(R.string.ProfileBotPreviewEmptyButton);
        fi.d dVar = fy0Var.f;
        dVar.i(string, false, true);
        dVar.setVisibility(0);
        dVar.setOnClickListener(new e(this, 0));
        n nVar = new n(this, context);
        this.E = nVar;
        int i10 = y6.y6;
        u6 u6Var = vs0Var.c;
        f7.V(nVar, i10, u6Var);
        nVar.setText(LocaleController.getString(R.string.ProfileBotOr));
        nVar.setTextSize(1, 14.0f);
        nVar.setTextAlignment(4);
        nVar.setGravity(17);
        nVar.setTypeface(AndroidUtilities.bold());
        fy0Var.a.addView(nVar, kb1.x(165, -2, 17, 0, 17, 0, 12));
        fi.d dVar2 = new fi.d(context, u6Var, false);
        this.F = dVar2;
        dVar2.setMinWidth(AndroidUtilities.dp(200.0f));
        fy0Var.a.addView(dVar2, kb1.u(-2, 44, 17));
        fy0Var.addView(mVar, 0, kb1.g(-1.0f, -1));
        iVar.setEmptyView(fy0Var);
        iVar.W1 = true;
        iVar.X1 = 0;
        new SparseArray();
        new HashMap();
        z zVar = new z(new f(this, 0));
        this.G = zVar;
        zVar.h(iVar);
        o oVar = new o(context, u6Var);
        this.J = oVar;
        addView(oVar, kb1.i(-1, -2, 48));
    }

    public final void a() {
        if (this.b) {
            float f7 = this.c;
            tu0 tu0Var = this.r;
            i iVar = this.f;
            if (f7 != 1.0f) {
                if (f7 == 0.0f) {
                    this.b = false;
                    tu0Var.setVisibility(8);
                    iVar.invalidate();
                    return;
                }
                int i10 = 1;
                boolean z10 = f7 > 0.2f;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(f7, z10 ? 1.0f : 0.0f);
                ofFloat.addUpdateListener(new u4(this, i10));
                ofFloat.addListener(new f0(6, this, z10));
                ofFloat.setInterpolator(ds.f);
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
            tu0Var.setVisibility(8);
            int i12 = this.d;
            h hVar = this.h;
            hVar.z1(i12);
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
        if (this.b || this.W.G.E1) {
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
        tu0 tu0Var = this.r;
        tu0Var.setVisibility(0);
        tu0Var.setAdapter(this.w);
        tu0Var.setPadding(tu0Var.getPaddingLeft(), 0, tu0Var.getPaddingRight(), this.J.getMeasuredHeight() + AndroidUtilities.dp(42.0f));
        k kVar = this.s;
        kVar.z1(clamp);
        tu0Var.a0();
        kVar.O = new g(this, 0);
        AndroidUtilities.updateVisibleRows(this.f);
        this.b = true;
        this.c = 0.0f;
        int i11 = this.S;
        if (i11 >= 0) {
            kVar.h1(i11, this.T - tu0Var.getPaddingTop());
        }
    }

    public final void c() {
        String string;
        int i10 = this.W.b;
        s6 s6Var = this.a;
        int size = s6Var == null ? 0 : s6Var.i.size();
        s6 s6Var2 = this.a;
        int i11 = 1;
        boolean z10 = s6Var2 == null || TextUtils.isEmpty(s6Var2.E);
        int i12 = 8;
        int i13 = size > 0 ? 0 : 8;
        o oVar = this.J;
        oVar.setVisibility(i13);
        String string2 = z10 ? LocaleController.getString(R.string.ProfileBotPreviewFooterGeneral) : LocaleController.formatString(R.string.ProfileBotPreviewFooterLanguage, g51.N(this.a.E, null, null));
        String string3 = LocaleController.getString(R.string.ProfileBotAddPreview);
        s8 s8Var = new s8(this, i12);
        if (z10 || size <= 0) {
            string = LocaleController.getString(z10 ? R.string.ProfileBotPreviewFooterCreateTranslation : R.string.ProfileBotPreviewFooterDeleteTranslation);
        } else {
            string = null;
        }
        bh.n nVar = (z10 || size <= 0) ? new bh.n(4, this, z10) : null;
        n nVar2 = oVar.c;
        fi.d dVar = oVar.d;
        oVar.a.setText(string2);
        bi.v vVar = oVar.b;
        vVar.i(string3, false, true);
        vVar.setOnClickListener(new ai.s(s8Var, 18));
        if (string == null) {
            nVar2.setVisibility(8);
            dVar.setVisibility(8);
        } else {
            nVar2.setVisibility(0);
            dVar.setVisibility(0);
            dVar.i(string, false, true);
            dVar.setOnClickListener(new w6(1, nVar));
        }
        n nVar3 = this.E;
        fi.d dVar2 = this.F;
        fy0 fy0Var = this.y;
        if (z10) {
            fy0Var.d.setVisibility(0);
            fy0Var.d.setText(LocaleController.getString(R.string.ProfileBotPreviewEmptyTitle));
            fy0Var.e.setText(LocaleController.formatPluralString("ProfileBotPreviewEmptyText", MessagesController.getInstance(i10).botPreviewMediasMax, new Object[0]));
            fy0Var.f.i(LocaleController.getString(R.string.ProfileBotPreviewEmptyButton), false, true);
            nVar3.setVisibility(8);
            dVar2.setVisibility(8);
        } else {
            fy0Var.d.setVisibility(8);
            fy0Var.e.setText(LocaleController.formatString(R.string.ProfileBotPreviewFooterLanguage, g51.N(this.a.E, null, null)));
            fy0Var.f.i(LocaleController.getString(R.string.ProfileBotPreviewEmptyButton), false, true);
            nVar3.setVisibility(0);
            dVar2.setVisibility(0);
            dVar2.i(LocaleController.getString(R.string.ProfileBotPreviewFooterDeleteTranslation), false, true);
            dVar2.setOnClickListener(new e(this, i11));
        }
        fy0Var.f.setVisibility(this.v.h() >= MessagesController.getInstance(i10).botPreviewMediasMax ? 8 : 0);
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
        iVar.setPadding(iVar.getPaddingLeft(), iVar.f3, iVar.getPaddingRight(), this.J.getMeasuredHeight() + AndroidUtilities.dp(42.0f));
    }

    public void setList(s6 s6Var) {
        if (this.a != s6Var) {
            this.H = false;
            this.I = false;
            this.d = this.W.y;
        }
        this.a = s6Var;
        l lVar = this.v;
        lVar.e = s6Var;
        if (lVar != lVar.s.w) {
            lVar.M();
        }
        lVar.l();
        q qVar = this.w;
        qVar.e = s6Var;
        if (qVar != qVar.s.w) {
            qVar.M();
        }
        qVar.l();
        c();
    }

    public void setVisibleHeight(int i10) {
        float f7 = (-(getMeasuredHeight() - Math.max(i10, AndroidUtilities.dp(280.0f)))) / 2.0f;
        this.y.setTranslationY(f7);
        this.x.setTranslationY(-f7);
    }
}
