package di;

import ah.g0;
import ah.p0;
import ai.va;
import ai.z6;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.widget.FrameLayout;
import ci.t6;
import ci.v4;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.hs0;
import org.telegram.ui.Components.ku0;
import org.telegram.ui.Components.r41;
import org.telegram.ui.Components.rx0;
import s4.y;
import w7.z5;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes4.dex */
public final class r extends FrameLayout {
    public static final /* synthetic */ int a0 = 0;
    public final n E;
    public final ei.d F;
    public final y G;
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
    public final /* synthetic */ hs0 W;
    public t6 a;
    public boolean b;
    public float c;
    public int d;
    public int e;
    public final i f;
    public final h h;
    public final s4.k n;
    public final ku0 r;
    public final k s;
    public final l v;
    public final q w;
    public final m x;
    public final rx0 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(hs0 hs0Var, Context context) {
        super(context);
        this.W = hs0Var;
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
        kVar.o(bs.h);
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
        iVar.setOnItemClickListener(new va(this, 5));
        iVar.setOnItemLongClickListener(new a1.c(this, 29));
        ku0 ku0Var = new ku0(context, null);
        this.r = ku0Var;
        k kVar2 = new k(this);
        this.s = kVar2;
        ku0Var.setLayoutManager(kVar2);
        ku0Var.i(new j(this, 1));
        kVar2.y1(this.e);
        ku0Var.setVisibility(8);
        addView(ku0Var, z5.d(-1.0f, -1));
        l lVar = new l(this, context);
        this.v = lVar;
        iVar.setAdapter(lVar);
        q qVar = new q(this, getContext());
        lVar.f = qVar;
        this.w = qVar;
        ku0Var.setAdapter(qVar);
        m mVar = new m(this, context);
        this.x = mVar;
        mVar.w = false;
        rx0 rx0Var = new rx0(context, mVar, 1, null);
        this.y = rx0Var;
        rx0Var.setVisibility(8);
        rx0Var.setAnimateLayoutChange(true);
        addView(rx0Var, z5.d(-1.0f, -1));
        rx0Var.setOnTouchListener(new d(0));
        rx0Var.e(true, false);
        rx0Var.b.setVisibility(8);
        rx0Var.d.setText(LocaleController.getString(R.string.ProfileBotPreviewEmptyTitle));
        rx0Var.e.setText(LocaleController.formatPluralString("ProfileBotPreviewEmptyText", MessagesController.getInstance(hs0Var.b).botPreviewMediasMax, new Object[0]));
        String string = LocaleController.getString(R.string.ProfileBotPreviewEmptyButton);
        ei.d dVar = rx0Var.f;
        dVar.g(string, false, true);
        dVar.setVisibility(0);
        dVar.setOnClickListener(new e(this, 0));
        n nVar = new n(this, context);
        this.E = nVar;
        int i10 = h6.y6;
        d6 d6Var = hs0Var.c;
        nVar.setTextColor(h6.w0(i10, d6Var));
        nVar.setText(LocaleController.getString(R.string.ProfileBotOr));
        nVar.setTextSize(1, 14.0f);
        nVar.setTextAlignment(4);
        nVar.setGravity(17);
        nVar.setTypeface(AndroidUtilities.bold());
        rx0Var.a.addView(nVar, z5.t(165, -2, 17, 0, 17, 0, 12));
        ei.d dVar2 = new ei.d(context, d6Var, false);
        this.F = dVar2;
        dVar2.setMinWidth(AndroidUtilities.dp(200.0f));
        rx0Var.a.addView(dVar2, z5.q(-2, 44, 17));
        rx0Var.addView(mVar, 0, z5.d(-1.0f, -1));
        iVar.setEmptyView(rx0Var);
        iVar.W1 = true;
        iVar.X1 = 0;
        new SparseArray();
        new HashMap();
        y yVar = new y(new f(this, 0));
        this.G = yVar;
        yVar.d(iVar);
        o oVar = new o(context, d6Var);
        this.J = oVar;
        addView(oVar, z5.e(-1, -2, 48));
    }

    public final void a() {
        if (this.b) {
            float f7 = this.c;
            ku0 ku0Var = this.r;
            i iVar = this.f;
            if (f7 != 1.0f) {
                if (f7 == 0.0f) {
                    this.b = false;
                    ku0Var.setVisibility(8);
                    iVar.invalidate();
                    return;
                }
                int i10 = 1;
                boolean z10 = f7 > 0.2f;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(f7, z10 ? 1.0f : 0.0f);
                ofFloat.addUpdateListener(new v4(this, i10));
                ofFloat.addListener(new p0(6, this, z10));
                ofFloat.setInterpolator(bs.f);
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
            ku0Var.setVisibility(8);
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
        ku0 ku0Var = this.r;
        ku0Var.setVisibility(0);
        ku0Var.setAdapter(this.w);
        ku0Var.setPadding(ku0Var.getPaddingLeft(), 0, ku0Var.getPaddingRight(), this.J.getMeasuredHeight() + AndroidUtilities.dp(42.0f));
        k kVar = this.s;
        kVar.y1(clamp);
        ku0Var.a0();
        kVar.O = new g(this, 0);
        AndroidUtilities.updateVisibleRows(this.f);
        this.b = true;
        this.c = 0.0f;
        int i11 = this.S;
        if (i11 >= 0) {
            kVar.h1(i11, this.T - ku0Var.getPaddingTop());
        }
    }

    public final void c() {
        String string;
        int i10 = this.W.b;
        t6 t6Var = this.a;
        int size = t6Var == null ? 0 : t6Var.i.size();
        t6 t6Var2 = this.a;
        int i11 = 1;
        boolean z10 = t6Var2 == null || TextUtils.isEmpty(t6Var2.E);
        int i12 = size > 0 ? 0 : 8;
        o oVar = this.J;
        oVar.setVisibility(i12);
        String string2 = z10 ? LocaleController.getString(R.string.ProfileBotPreviewFooterGeneral) : LocaleController.formatString(R.string.ProfileBotPreviewFooterLanguage, r41.F(this.a.E, null, null));
        String string3 = LocaleController.getString(R.string.ProfileBotAddPreview);
        com.google.firebase.messaging.s sVar = new com.google.firebase.messaging.s(this, 3);
        if (z10 || size <= 0) {
            string = LocaleController.getString(z10 ? R.string.ProfileBotPreviewFooterCreateTranslation : R.string.ProfileBotPreviewFooterDeleteTranslation);
        } else {
            string = null;
        }
        ah.t tVar = (z10 || size <= 0) ? new ah.t(4, this, z10) : null;
        n nVar = oVar.c;
        ei.d dVar = oVar.d;
        oVar.a.setText(string2);
        ai.v vVar = oVar.b;
        vVar.g(string3, false, true);
        vVar.setOnClickListener(new g0(sVar, 17));
        if (string == null) {
            nVar.setVisibility(8);
            dVar.setVisibility(8);
        } else {
            nVar.setVisibility(0);
            dVar.setVisibility(0);
            dVar.g(string, false, true);
            dVar.setOnClickListener(new z6(1, tVar));
        }
        n nVar2 = this.E;
        ei.d dVar2 = this.F;
        rx0 rx0Var = this.y;
        if (z10) {
            rx0Var.d.setVisibility(0);
            rx0Var.d.setText(LocaleController.getString(R.string.ProfileBotPreviewEmptyTitle));
            rx0Var.e.setText(LocaleController.formatPluralString("ProfileBotPreviewEmptyText", MessagesController.getInstance(i10).botPreviewMediasMax, new Object[0]));
            rx0Var.f.g(LocaleController.getString(R.string.ProfileBotPreviewEmptyButton), false, true);
            nVar2.setVisibility(8);
            dVar2.setVisibility(8);
        } else {
            rx0Var.d.setVisibility(8);
            rx0Var.e.setText(LocaleController.formatString(R.string.ProfileBotPreviewFooterLanguage, r41.F(this.a.E, null, null)));
            rx0Var.f.g(LocaleController.getString(R.string.ProfileBotPreviewEmptyButton), false, true);
            nVar2.setVisibility(0);
            dVar2.setVisibility(0);
            dVar2.g(LocaleController.getString(R.string.ProfileBotPreviewFooterDeleteTranslation), false, true);
            dVar2.setOnClickListener(new e(this, i11));
        }
        rx0Var.f.setVisibility(this.v.h() >= MessagesController.getInstance(i10).botPreviewMediasMax ? 8 : 0);
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

    public void setList(t6 t6Var) {
        if (this.a != t6Var) {
            this.H = false;
            this.I = false;
            this.d = this.W.y;
        }
        this.a = t6Var;
        l lVar = this.v;
        lVar.e = t6Var;
        if (lVar != lVar.s.w) {
            lVar.M();
        }
        lVar.l();
        q qVar = this.w;
        qVar.e = t6Var;
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
