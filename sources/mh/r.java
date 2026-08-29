package mh;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.widget.FrameLayout;
import bg.z2;
import cg.c1;
import cg.s0;
import f2.e0;
import i7.f6;
import java.util.HashMap;
import lh.c6;
import lh.m5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.fr0;
import org.telegram.ui.Components.ht0;
import org.telegram.ui.Components.jr;
import org.telegram.ui.Components.k31;
import org.telegram.ui.Components.qw0;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final class r extends FrameLayout {
    public static final /* synthetic */ int T = 0;
    public final s0 A;
    public final nh.d B;
    public final e0 C;
    public boolean D;
    public boolean E;
    public final o F;
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
    public final /* synthetic */ fr0 S;
    public c6 a;
    public boolean b;
    public float c;
    public int d;
    public int e;
    public final i f;
    public final h h;
    public final f2.l n;
    public final ht0 r;
    public final k s;
    public final l v;
    public final q w;
    public final m x;
    public final qw0 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(fr0 fr0Var, Context context) {
        super(context);
        this.S = fr0Var;
        this.d = Utilities.clamp(SharedConfig.storiesColumnsCount, 6, 2);
        this.e = Utilities.clamp(SharedConfig.storiesColumnsCount, 6, 2);
        this.D = false;
        this.E = false;
        this.R = new Rect();
        h hVar = new h();
        this.h = hVar;
        hVar.O = new g(this, 1);
        hVar.y1(this.d);
        f2.l lVar = new f2.l();
        this.n = lVar;
        lVar.n(280L);
        lVar.o(jr.h);
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
        addView(iVar, f6.c(-1.0f, -1));
        iVar.i(new j(this, 0));
        iVar.setOnItemClickListener(new bg.o(this, 12));
        iVar.setOnItemLongClickListener(new l4.s0(this, 11));
        ht0 ht0Var = new ht0(context, null);
        this.r = ht0Var;
        k kVar = new k(this);
        this.s = kVar;
        ht0Var.setLayoutManager(kVar);
        ht0Var.i(new j(this, 1));
        kVar.y1(this.e);
        ht0Var.setVisibility(8);
        addView(ht0Var, f6.c(-1.0f, -1));
        l lVar2 = new l(this, context);
        this.v = lVar2;
        iVar.setAdapter(lVar2);
        q qVar = new q(this, getContext());
        lVar2.f = qVar;
        this.w = qVar;
        ht0Var.setAdapter(qVar);
        m mVar = new m(this, context);
        this.x = mVar;
        mVar.w = false;
        qw0 qw0Var = new qw0(context, mVar, 1, null);
        this.y = qw0Var;
        qw0Var.setVisibility(8);
        qw0Var.setAnimateLayoutChange(true);
        addView(qw0Var, f6.c(-1.0f, -1));
        qw0Var.setOnTouchListener(new d(0));
        qw0Var.e(true, false);
        qw0Var.b.setVisibility(8);
        qw0Var.d.setText(LocaleController.getString(R.string.ProfileBotPreviewEmptyTitle));
        qw0Var.e.setText(LocaleController.formatPluralString("ProfileBotPreviewEmptyText", MessagesController.getInstance(fr0Var.b).botPreviewMediasMax, new Object[0]));
        String string = LocaleController.getString(R.string.ProfileBotPreviewEmptyButton);
        nh.d dVar = qw0Var.f;
        dVar.g(string, false, true);
        dVar.setVisibility(0);
        dVar.setOnClickListener(new e(this, 0));
        s0 s0Var = new s0(this, context);
        this.A = s0Var;
        int i10 = g6.y6;
        org.telegram.ui.ActionBar.c6 c6Var = fr0Var.c;
        s0Var.setTextColor(g6.v0(i10, c6Var));
        s0Var.setText(LocaleController.getString(R.string.ProfileBotOr));
        s0Var.setTextSize(1, 14.0f);
        s0Var.setTextAlignment(4);
        s0Var.setGravity(17);
        s0Var.setTypeface(AndroidUtilities.bold());
        qw0Var.a.addView(s0Var, f6.t(165, -2, 17, 0, 17, 0, 12));
        nh.d dVar2 = new nh.d(context, c6Var, false);
        this.B = dVar2;
        dVar2.setMinWidth(AndroidUtilities.dp(200.0f));
        qw0Var.a.addView(dVar2, f6.q(-2, 44, 17));
        qw0Var.addView(mVar, 0, f6.c(-1.0f, -1));
        iVar.setEmptyView(qw0Var);
        iVar.U1 = true;
        iVar.V1 = 0;
        new SparseArray();
        new HashMap();
        e0 e0Var = new e0(new f(this, 0));
        this.C = e0Var;
        e0Var.d(iVar);
        o oVar = new o(context, c6Var);
        this.F = oVar;
        addView(oVar, f6.e(-1, -2, 48));
    }

    public final void a() {
        if (this.b) {
            float f9 = this.c;
            ht0 ht0Var = this.r;
            i iVar = this.f;
            if (f9 != 1.0f) {
                if (f9 == 0.0f) {
                    this.b = false;
                    ht0Var.setVisibility(8);
                    iVar.invalidate();
                    return;
                }
                boolean z10 = f9 > 0.2f;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(f9, z10 ? 1.0f : 0.0f);
                ofFloat.addUpdateListener(new c1(this, 4));
                ofFloat.addListener(new z2(9, this, z10));
                ofFloat.setInterpolator(jr.f);
                ofFloat.setDuration(200L);
                ofFloat.start();
                return;
            }
            this.b = false;
            int i10 = this.e;
            this.d = i10;
            this.S.y = i10;
            SharedConfig.setStoriesColumnsCount(i10);
            l lVar = this.v;
            int h = lVar.h();
            ht0Var.setVisibility(8);
            int i11 = this.d;
            h hVar = this.h;
            hVar.y1(i11);
            iVar.a0();
            iVar.invalidate();
            if (lVar.h() == h) {
                AndroidUtilities.updateVisibleRows(iVar);
            } else {
                lVar.l();
            }
            int i12 = this.O;
            if (i12 >= 0) {
                View m10 = this.s.m(i12);
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
        int i10 = this.d + (!z10 ? 1 : -1);
        if (i10 > 6) {
            i10 = !z10 ? 9 : 6;
        }
        int clamp = Utilities.clamp(i10, 6, this.D ? 1 : 2);
        this.e = clamp;
        if (clamp == this.d || this.D) {
            return;
        }
        ht0 ht0Var = this.r;
        ht0Var.setVisibility(0);
        ht0Var.setAdapter(this.w);
        ht0Var.setPadding(ht0Var.getPaddingLeft(), 0, ht0Var.getPaddingRight(), this.F.getMeasuredHeight() + AndroidUtilities.dp(42.0f));
        k kVar = this.s;
        kVar.y1(clamp);
        ht0Var.a0();
        kVar.O = new g(this, 0);
        AndroidUtilities.updateVisibleRows(this.f);
        this.b = true;
        this.c = 0.0f;
        int i11 = this.O;
        if (i11 >= 0) {
            kVar.h1(i11, this.P - ht0Var.getPaddingTop());
        }
    }

    public final void c() {
        String string;
        int i10 = this.S.b;
        c6 c6Var = this.a;
        int size = c6Var == null ? 0 : c6Var.i.size();
        c6 c6Var2 = this.a;
        int i11 = 1;
        boolean z10 = c6Var2 == null || TextUtils.isEmpty(c6Var2.E);
        int i12 = size > 0 ? 0 : 8;
        o oVar = this.F;
        oVar.setVisibility(i12);
        String string2 = z10 ? LocaleController.getString(R.string.ProfileBotPreviewFooterGeneral) : LocaleController.formatString(R.string.ProfileBotPreviewFooterLanguage, k31.D(this.a.E, null, null));
        String string3 = LocaleController.getString(R.string.ProfileBotAddPreview);
        m5 m5Var = new m5(this, 15);
        if (z10 || size <= 0) {
            string = LocaleController.getString(z10 ? R.string.ProfileBotPreviewFooterCreateTranslation : R.string.ProfileBotPreviewFooterDeleteTranslation);
        } else {
            string = null;
        }
        hh.f fVar = (z10 || size <= 0) ? new hh.f(6, this, z10) : null;
        s0 s0Var = oVar.c;
        nh.d dVar = oVar.d;
        oVar.a.setText(string2);
        jh.n nVar = oVar.b;
        nVar.g(string3, false, true);
        nVar.setOnClickListener(new n(m5Var, r2));
        if (string == null) {
            s0Var.setVisibility(8);
            dVar.setVisibility(8);
        } else {
            s0Var.setVisibility(0);
            dVar.setVisibility(0);
            dVar.g(string, false, true);
            dVar.setOnClickListener(new gg.u(3, fVar));
        }
        s0 s0Var2 = this.A;
        nh.d dVar2 = this.B;
        qw0 qw0Var = this.y;
        if (z10) {
            qw0Var.d.setVisibility(0);
            qw0Var.d.setText(LocaleController.getString(R.string.ProfileBotPreviewEmptyTitle));
            qw0Var.e.setText(LocaleController.formatPluralString("ProfileBotPreviewEmptyText", MessagesController.getInstance(i10).botPreviewMediasMax, new Object[0]));
            qw0Var.f.g(LocaleController.getString(R.string.ProfileBotPreviewEmptyButton), false, true);
            s0Var2.setVisibility(8);
            dVar2.setVisibility(8);
        } else {
            qw0Var.d.setVisibility(8);
            qw0Var.e.setText(LocaleController.formatString(R.string.ProfileBotPreviewFooterLanguage, k31.D(this.a.E, null, null)));
            qw0Var.f.g(LocaleController.getString(R.string.ProfileBotPreviewEmptyButton), false, true);
            s0Var2.setVisibility(0);
            dVar2.setVisibility(0);
            dVar2.g(LocaleController.getString(R.string.ProfileBotPreviewFooterDeleteTranslation), false, true);
            dVar2.setOnClickListener(new e(this, i11));
        }
        qw0Var.f.setVisibility(this.v.h() >= MessagesController.getInstance(i10).botPreviewMediasMax ? 8 : 0);
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
        iVar.setPadding(iVar.getPaddingLeft(), iVar.U2, iVar.getPaddingRight(), this.F.getMeasuredHeight() + AndroidUtilities.dp(42.0f));
    }

    public void setList(c6 c6Var) {
        if (this.a != c6Var) {
            this.D = false;
            this.E = false;
            this.d = this.S.y;
        }
        this.a = c6Var;
        l lVar = this.v;
        lVar.e = c6Var;
        if (lVar != lVar.s.w) {
            lVar.M();
        }
        lVar.l();
        q qVar = this.w;
        qVar.e = c6Var;
        if (qVar != qVar.s.w) {
            qVar.M();
        }
        qVar.l();
        c();
    }

    public void setVisibleHeight(int i10) {
        float f9 = (-(getMeasuredHeight() - Math.max(i10, AndroidUtilities.dp(280.0f)))) / 2.0f;
        this.y.setTranslationY(f9);
        this.x.setTranslationY(-f9);
    }
}
