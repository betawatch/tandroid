package jh;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.widget.FrameLayout;
import dg.w;
import f2.f0;
import f2.h0;
import g7.e6;
import gh.i3;
import hg.b0;
import ih.f6;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.gw0;
import org.telegram.ui.Components.uq0;
import org.telegram.ui.Components.ws0;
import org.telegram.ui.Components.z21;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class q extends FrameLayout {
    public static final /* synthetic */ int T = 0;
    public final bh.e A;
    public final kh.d B;
    public final h0 C;
    public boolean D;
    public boolean E;
    public final n F;
    public boolean G;
    public boolean H;
    public boolean I;
    public int J;
    public int K;
    public float L;
    public float M;
    public boolean N;
    public int O;
    public int P;
    public int Q;
    public final Rect R;
    public final /* synthetic */ uq0 S;
    public f6 a;
    public boolean b;
    public float c;
    public int d;
    public int e;
    public final i f;
    public final h h;
    public final f2.n n;
    public final ws0 r;
    public final k s;
    public final l v;
    public final p w;
    public final m x;
    public final gw0 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(uq0 uq0Var, Context context) {
        super(context);
        this.S = uq0Var;
        this.d = Utilities.clamp(SharedConfig.storiesColumnsCount, 6, 2);
        this.e = Utilities.clamp(SharedConfig.storiesColumnsCount, 6, 2);
        this.D = false;
        this.E = false;
        this.R = new Rect();
        h hVar = new h();
        this.h = hVar;
        hVar.O = new g(this, 1);
        hVar.y1(this.d);
        f2.n nVar = new f2.n();
        this.n = nVar;
        nVar.n(280L);
        nVar.o(gr.h);
        nVar.m = false;
        i iVar = new i(this, context);
        this.f = iVar;
        iVar.setScrollingTouchSlop(1);
        iVar.setPinnedSectionOffsetY(-AndroidUtilities.dp(2.0f));
        iVar.setPadding(0, 0, 0, 0);
        iVar.setItemAnimator(null);
        iVar.setClipToPadding(false);
        iVar.setSectionsType(2);
        iVar.setLayoutManager(hVar);
        addView(iVar, e6.c(-1.0f, -1));
        iVar.i(new j(this, 0));
        iVar.setOnItemClickListener(new eh.j(this, 8));
        iVar.setOnItemLongClickListener(new i3(this, 29));
        ws0 ws0Var = new ws0(context, null);
        this.r = ws0Var;
        k kVar = new k(this);
        this.s = kVar;
        ws0Var.setLayoutManager(kVar);
        ws0Var.i(new j(this, 1));
        kVar.y1(this.e);
        ws0Var.setVisibility(8);
        addView(ws0Var, e6.c(-1.0f, -1));
        l lVar = new l(this, context);
        this.v = lVar;
        iVar.setAdapter(lVar);
        p pVar = new p(this, getContext());
        lVar.f = pVar;
        this.w = pVar;
        ws0Var.setAdapter(pVar);
        m mVar = new m(this, context);
        this.x = mVar;
        mVar.w = false;
        gw0 gw0Var = new gw0(context, mVar, 1, null);
        this.y = gw0Var;
        gw0Var.setVisibility(8);
        gw0Var.setAnimateLayoutChange(true);
        addView(gw0Var, e6.c(-1.0f, -1));
        gw0Var.setOnTouchListener(new d(0));
        gw0Var.e(true, false);
        gw0Var.b.setVisibility(8);
        gw0Var.d.setText(LocaleController.getString(R.string.ProfileBotPreviewEmptyTitle));
        gw0Var.e.setText(LocaleController.formatPluralString("ProfileBotPreviewEmptyText", MessagesController.getInstance(uq0Var.b).botPreviewMediasMax, new Object[0]));
        String string = LocaleController.getString(R.string.ProfileBotPreviewEmptyButton);
        kh.d dVar = gw0Var.f;
        dVar.g(string, false, true);
        dVar.setVisibility(0);
        dVar.setOnClickListener(new e(this, 0));
        bh.e eVar = new bh.e(this, context);
        this.A = eVar;
        int i9 = org.telegram.ui.ActionBar.f6.y6;
        b6 b6Var = uq0Var.c;
        eVar.setTextColor(org.telegram.ui.ActionBar.f6.v0(i9, b6Var));
        eVar.setText(LocaleController.getString(R.string.ProfileBotOr));
        eVar.setTextSize(1, 14.0f);
        eVar.setTextAlignment(4);
        eVar.setGravity(17);
        eVar.setTypeface(AndroidUtilities.bold());
        gw0Var.a.addView(eVar, e6.t(165, -2, 17, 0, 17, 0, 12));
        kh.d dVar2 = new kh.d(context, b6Var, false);
        this.B = dVar2;
        dVar2.setMinWidth(AndroidUtilities.dp(200.0f));
        gw0Var.a.addView(dVar2, e6.q(-2, 44, 17));
        gw0Var.addView(mVar, 0, e6.c(-1.0f, -1));
        iVar.setEmptyView(gw0Var);
        iVar.U1 = true;
        iVar.V1 = 0;
        new SparseArray();
        new HashMap();
        h0 h0Var = new h0(new f(this, 0));
        this.C = h0Var;
        h0Var.d(iVar);
        n nVar2 = new n(context, b6Var);
        this.F = nVar2;
        addView(nVar2, e6.e(-1, -2, 48));
    }

    public final void a() {
        if (this.b) {
            float f10 = this.c;
            ws0 ws0Var = this.r;
            i iVar = this.f;
            if (f10 != 1.0f) {
                if (f10 == 0.0f) {
                    this.b = false;
                    ws0Var.setVisibility(8);
                    iVar.invalidate();
                    return;
                }
                boolean z10 = f10 > 0.2f;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, z10 ? 1.0f : 0.0f);
                ofFloat.addUpdateListener(new f0(this, 2));
                ofFloat.addListener(new b0(6, this, z10));
                ofFloat.setInterpolator(gr.f);
                ofFloat.setDuration(200L);
                ofFloat.start();
                return;
            }
            this.b = false;
            int i9 = this.e;
            this.d = i9;
            this.S.y = i9;
            SharedConfig.setStoriesColumnsCount(i9);
            l lVar = this.v;
            int h = lVar.h();
            ws0Var.setVisibility(8);
            int i10 = this.d;
            h hVar = this.h;
            hVar.y1(i10);
            iVar.a0();
            iVar.invalidate();
            if (lVar.h() == h) {
                AndroidUtilities.updateVisibleRows(iVar);
            } else {
                lVar.l();
            }
            int i11 = this.O;
            if (i11 >= 0) {
                View m10 = this.s.m(i11);
                if (m10 != null) {
                    this.P = m10.getTop();
                }
                hVar.h1(this.O, (-iVar.getPaddingTop()) + this.P);
            }
        }
    }

    public final void b(boolean z10) {
        if (this.b || this.S.C.y1) {
            return;
        }
        int i9 = this.d + (!z10 ? 1 : -1);
        if (i9 > 6) {
            i9 = !z10 ? 9 : 6;
        }
        int clamp = Utilities.clamp(i9, 6, this.D ? 1 : 2);
        this.e = clamp;
        if (clamp == this.d || this.D) {
            return;
        }
        ws0 ws0Var = this.r;
        ws0Var.setVisibility(0);
        ws0Var.setAdapter(this.w);
        ws0Var.setPadding(ws0Var.getPaddingLeft(), 0, ws0Var.getPaddingRight(), this.F.getMeasuredHeight() + AndroidUtilities.dp(42.0f));
        k kVar = this.s;
        kVar.y1(clamp);
        ws0Var.a0();
        kVar.O = new g(this, 0);
        AndroidUtilities.updateVisibleRows(this.f);
        this.b = true;
        this.c = 0.0f;
        int i10 = this.O;
        if (i10 >= 0) {
            kVar.h1(i10, this.P - ws0Var.getPaddingTop());
        }
    }

    public final void c() {
        String string;
        int i9 = this.S.b;
        f6 f6Var = this.a;
        int size = f6Var == null ? 0 : f6Var.i.size();
        f6 f6Var2 = this.a;
        int i10 = 1;
        boolean z10 = f6Var2 == null || TextUtils.isEmpty(f6Var2.E);
        int i11 = size > 0 ? 0 : 8;
        n nVar = this.F;
        nVar.setVisibility(i11);
        String string2 = z10 ? LocaleController.getString(R.string.ProfileBotPreviewFooterGeneral) : LocaleController.formatString(R.string.ProfileBotPreviewFooterLanguage, z21.D(this.a.E, null, null));
        String string3 = LocaleController.getString(R.string.ProfileBotAddPreview);
        int i12 = 24;
        ih.g gVar = new ih.g(this, i12);
        if (z10 || size <= 0) {
            string = LocaleController.getString(z10 ? R.string.ProfileBotPreviewFooterCreateTranslation : R.string.ProfileBotPreviewFooterDeleteTranslation);
        } else {
            string = null;
        }
        eh.f fVar = (z10 || size <= 0) ? new eh.f(6, this, z10) : null;
        bh.e eVar = nVar.c;
        kh.d dVar = nVar.d;
        nVar.a.setText(string2);
        gh.p pVar = nVar.b;
        pVar.g(string3, false, true);
        pVar.setOnClickListener(new androidx.mediarouter.app.c(gVar, i12));
        if (string == null) {
            eVar.setVisibility(8);
            dVar.setVisibility(8);
        } else {
            eVar.setVisibility(0);
            dVar.setVisibility(0);
            dVar.g(string, false, true);
            dVar.setOnClickListener(new w(3, fVar));
        }
        bh.e eVar2 = this.A;
        kh.d dVar2 = this.B;
        gw0 gw0Var = this.y;
        if (z10) {
            gw0Var.d.setVisibility(0);
            gw0Var.d.setText(LocaleController.getString(R.string.ProfileBotPreviewEmptyTitle));
            gw0Var.e.setText(LocaleController.formatPluralString("ProfileBotPreviewEmptyText", MessagesController.getInstance(i9).botPreviewMediasMax, new Object[0]));
            gw0Var.f.g(LocaleController.getString(R.string.ProfileBotPreviewEmptyButton), false, true);
            eVar2.setVisibility(8);
            dVar2.setVisibility(8);
        } else {
            gw0Var.d.setVisibility(8);
            gw0Var.e.setText(LocaleController.formatString(R.string.ProfileBotPreviewFooterLanguage, z21.D(this.a.E, null, null)));
            gw0Var.f.g(LocaleController.getString(R.string.ProfileBotPreviewEmptyButton), false, true);
            eVar2.setVisibility(0);
            dVar2.setVisibility(0);
            dVar2.g(LocaleController.getString(R.string.ProfileBotPreviewFooterDeleteTranslation), false, true);
            dVar2.setOnClickListener(new e(this, i10));
        }
        gw0Var.f.setVisibility(this.v.h() >= MessagesController.getInstance(i9).botPreviewMediasMax ? 8 : 0);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (view == this.r) {
            return true;
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(i9, i10);
        i iVar = this.f;
        iVar.setPadding(iVar.getPaddingLeft(), iVar.U2, iVar.getPaddingRight(), this.F.getMeasuredHeight() + AndroidUtilities.dp(42.0f));
    }

    public void setList(f6 f6Var) {
        if (this.a != f6Var) {
            this.D = false;
            this.E = false;
            this.d = this.S.y;
        }
        this.a = f6Var;
        l lVar = this.v;
        lVar.e = f6Var;
        if (lVar != lVar.s.w) {
            lVar.M();
        }
        lVar.l();
        p pVar = this.w;
        pVar.e = f6Var;
        if (pVar != pVar.s.w) {
            pVar.M();
        }
        pVar.l();
        c();
    }

    public void setVisibleHeight(int i9) {
        float f10 = (-(getMeasuredHeight() - Math.max(i9, AndroidUtilities.dp(280.0f)))) / 2.0f;
        this.y.setTranslationY(f10);
        this.x.setTranslationY(-f10);
    }
}
