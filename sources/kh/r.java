package kh;

import ag.e1;
import ag.p0;
import ag.q1;
import ag.w0;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.widget.FrameLayout;
import f2.f0;
import h3.x;
import h7.z5;
import java.util.HashMap;
import jh.b6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.b31;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.iw0;
import org.telegram.ui.Components.vq0;
import org.telegram.ui.Components.ys0;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public final class r extends FrameLayout {
    public static final /* synthetic */ int T = 0;
    public final e1 A;
    public final lh.d B;
    public final f0 C;
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
    public final /* synthetic */ vq0 S;
    public b6 a;
    public boolean b;
    public float c;
    public int d;
    public int e;
    public final j f;
    public final i h;
    public final f2.l n;
    public final ys0 r;
    public final l s;
    public final m v;
    public final q w;
    public final n x;
    public final iw0 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(vq0 vq0Var, Context context) {
        super(context);
        this.S = vq0Var;
        this.d = Utilities.clamp(SharedConfig.storiesColumnsCount, 6, 2);
        this.e = Utilities.clamp(SharedConfig.storiesColumnsCount, 6, 2);
        this.D = false;
        this.E = false;
        this.R = new Rect();
        i iVar = new i();
        this.h = iVar;
        iVar.O = new h(this, 1);
        iVar.y1(this.d);
        f2.l lVar = new f2.l();
        this.n = lVar;
        lVar.n(280L);
        lVar.o(er.h);
        lVar.m = false;
        j jVar = new j(this, context);
        this.f = jVar;
        jVar.setScrollingTouchSlop(1);
        jVar.setPinnedSectionOffsetY(-AndroidUtilities.dp(2.0f));
        jVar.setPadding(0, 0, 0, 0);
        jVar.setItemAnimator(null);
        jVar.setClipToPadding(false);
        jVar.setSectionsType(2);
        jVar.setLayoutManager(iVar);
        addView(jVar, z5.c(-1.0f, -1));
        jVar.i(new k(this, 0));
        jVar.setOnItemClickListener(new p0(this, 10));
        jVar.setOnItemLongClickListener(new x(this, 29));
        ys0 ys0Var = new ys0(context, null);
        this.r = ys0Var;
        l lVar2 = new l(this);
        this.s = lVar2;
        ys0Var.setLayoutManager(lVar2);
        ys0Var.i(new k(this, 1));
        lVar2.y1(this.e);
        ys0Var.setVisibility(8);
        addView(ys0Var, z5.c(-1.0f, -1));
        m mVar = new m(this, context);
        this.v = mVar;
        jVar.setAdapter(mVar);
        q qVar = new q(this, getContext());
        mVar.f = qVar;
        this.w = qVar;
        ys0Var.setAdapter(qVar);
        n nVar = new n(this, context);
        this.x = nVar;
        nVar.w = false;
        iw0 iw0Var = new iw0(context, nVar, 1, null);
        this.y = iw0Var;
        iw0Var.setVisibility(8);
        iw0Var.setAnimateLayoutChange(true);
        addView(iw0Var, z5.c(-1.0f, -1));
        iw0Var.setOnTouchListener(new e(0));
        iw0Var.e(true, false);
        iw0Var.b.setVisibility(8);
        iw0Var.d.setText(LocaleController.getString(R.string.ProfileBotPreviewEmptyTitle));
        iw0Var.e.setText(LocaleController.formatPluralString("ProfileBotPreviewEmptyText", MessagesController.getInstance(vq0Var.b).botPreviewMediasMax, new Object[0]));
        String string = LocaleController.getString(R.string.ProfileBotPreviewEmptyButton);
        lh.d dVar = iw0Var.f;
        dVar.g(string, false, true);
        dVar.setVisibility(0);
        dVar.setOnClickListener(new f(this, 0));
        e1 e1Var = new e1(this, context);
        this.A = e1Var;
        int i10 = g6.y6;
        c6 c6Var = vq0Var.c;
        e1Var.setTextColor(g6.v0(i10, c6Var));
        e1Var.setText(LocaleController.getString(R.string.ProfileBotOr));
        e1Var.setTextSize(1, 14.0f);
        e1Var.setTextAlignment(4);
        e1Var.setGravity(17);
        e1Var.setTypeface(AndroidUtilities.bold());
        iw0Var.a.addView(e1Var, z5.t(165, -2, 17, 0, 17, 0, 12));
        lh.d dVar2 = new lh.d(context, c6Var, false);
        this.B = dVar2;
        dVar2.setMinWidth(AndroidUtilities.dp(200.0f));
        iw0Var.a.addView(dVar2, z5.q(-2, 44, 17));
        iw0Var.addView(nVar, 0, z5.c(-1.0f, -1));
        jVar.setEmptyView(iw0Var);
        jVar.U1 = true;
        jVar.V1 = 0;
        new SparseArray();
        new HashMap();
        f0 f0Var = new f0(new g(this, 0));
        this.C = f0Var;
        f0Var.d(jVar);
        o oVar = new o(context, c6Var);
        this.F = oVar;
        addView(oVar, z5.e(-1, -2, 48));
    }

    public final void a() {
        if (this.b) {
            float f10 = this.c;
            int i10 = 8;
            ys0 ys0Var = this.r;
            j jVar = this.f;
            if (f10 != 1.0f) {
                if (f10 == 0.0f) {
                    this.b = false;
                    ys0Var.setVisibility(8);
                    jVar.invalidate();
                    return;
                }
                boolean z10 = f10 > 0.2f;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, z10 ? 1.0f : 0.0f);
                ofFloat.addUpdateListener(new q1(this, 4));
                ofFloat.addListener(new ag.x(i10, this, z10));
                ofFloat.setInterpolator(er.f);
                ofFloat.setDuration(200L);
                ofFloat.start();
                return;
            }
            this.b = false;
            int i11 = this.e;
            this.d = i11;
            this.S.y = i11;
            SharedConfig.setStoriesColumnsCount(i11);
            m mVar = this.v;
            int h = mVar.h();
            ys0Var.setVisibility(8);
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
            int i13 = this.O;
            if (i13 >= 0) {
                View m10 = this.s.m(i13);
                if (m10 != null) {
                    this.P = m10.getTop();
                }
                iVar.h1(this.O, (-jVar.getPaddingTop()) + this.P);
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
        ys0 ys0Var = this.r;
        ys0Var.setVisibility(0);
        ys0Var.setAdapter(this.w);
        ys0Var.setPadding(ys0Var.getPaddingLeft(), 0, ys0Var.getPaddingRight(), this.F.getMeasuredHeight() + AndroidUtilities.dp(42.0f));
        l lVar = this.s;
        lVar.y1(clamp);
        ys0Var.a0();
        lVar.O = new h(this, 0);
        AndroidUtilities.updateVisibleRows(this.f);
        this.b = true;
        this.c = 0.0f;
        int i11 = this.O;
        if (i11 >= 0) {
            lVar.h1(i11, this.P - ys0Var.getPaddingTop());
        }
    }

    public final void c() {
        String string;
        int i10 = this.S.b;
        b6 b6Var = this.a;
        int size = b6Var == null ? 0 : b6Var.i.size();
        b6 b6Var2 = this.a;
        int i11 = 1;
        boolean z10 = b6Var2 == null || TextUtils.isEmpty(b6Var2.E);
        int i12 = size > 0 ? 0 : 8;
        o oVar = this.F;
        oVar.setVisibility(i12);
        String string2 = z10 ? LocaleController.getString(R.string.ProfileBotPreviewFooterGeneral) : LocaleController.formatString(R.string.ProfileBotPreviewFooterLanguage, b31.E(this.a.E, null, null));
        String string3 = LocaleController.getString(R.string.ProfileBotAddPreview);
        c cVar = new c(this, i11);
        if (z10 || size <= 0) {
            string = LocaleController.getString(z10 ? R.string.ProfileBotPreviewFooterCreateTranslation : R.string.ProfileBotPreviewFooterDeleteTranslation);
        } else {
            string = null;
        }
        fh.f fVar = (z10 || size <= 0) ? new fh.f(6, this, z10) : null;
        e1 e1Var = oVar.c;
        lh.d dVar = oVar.d;
        oVar.a.setText(string2);
        hh.p pVar = oVar.b;
        pVar.g(string3, false, true);
        pVar.setOnClickListener(new w0(cVar, 26));
        if (string == null) {
            e1Var.setVisibility(8);
            dVar.setVisibility(8);
        } else {
            e1Var.setVisibility(0);
            dVar.setVisibility(0);
            dVar.g(string, false, true);
            dVar.setOnClickListener(new eg.v(3, fVar));
        }
        e1 e1Var2 = this.A;
        lh.d dVar2 = this.B;
        iw0 iw0Var = this.y;
        if (z10) {
            iw0Var.d.setVisibility(0);
            iw0Var.d.setText(LocaleController.getString(R.string.ProfileBotPreviewEmptyTitle));
            iw0Var.e.setText(LocaleController.formatPluralString("ProfileBotPreviewEmptyText", MessagesController.getInstance(i10).botPreviewMediasMax, new Object[0]));
            iw0Var.f.g(LocaleController.getString(R.string.ProfileBotPreviewEmptyButton), false, true);
            e1Var2.setVisibility(8);
            dVar2.setVisibility(8);
        } else {
            iw0Var.d.setVisibility(8);
            iw0Var.e.setText(LocaleController.formatString(R.string.ProfileBotPreviewFooterLanguage, b31.E(this.a.E, null, null)));
            iw0Var.f.g(LocaleController.getString(R.string.ProfileBotPreviewEmptyButton), false, true);
            e1Var2.setVisibility(0);
            dVar2.setVisibility(0);
            dVar2.g(LocaleController.getString(R.string.ProfileBotPreviewFooterDeleteTranslation), false, true);
            dVar2.setOnClickListener(new f(this, i11));
        }
        iw0Var.f.setVisibility(this.v.h() >= MessagesController.getInstance(i10).botPreviewMediasMax ? 8 : 0);
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
        j jVar = this.f;
        jVar.setPadding(jVar.getPaddingLeft(), jVar.U2, jVar.getPaddingRight(), this.F.getMeasuredHeight() + AndroidUtilities.dp(42.0f));
    }

    public void setList(b6 b6Var) {
        if (this.a != b6Var) {
            this.D = false;
            this.E = false;
            this.d = this.S.y;
        }
        this.a = b6Var;
        m mVar = this.v;
        mVar.e = b6Var;
        if (mVar != mVar.s.w) {
            mVar.M();
        }
        mVar.l();
        q qVar = this.w;
        qVar.e = b6Var;
        if (qVar != qVar.s.w) {
            qVar.M();
        }
        qVar.l();
        c();
    }

    public void setVisibleHeight(int i10) {
        float f10 = (-(getMeasuredHeight() - Math.max(i10, AndroidUtilities.dp(280.0f)))) / 2.0f;
        this.y.setTranslationY(f10);
        this.x.setTranslationY(-f10);
    }
}
