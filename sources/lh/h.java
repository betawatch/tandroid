package lh;

import android.content.Context;
import android.widget.FrameLayout;
import c8.ma;
import c8.ra;
import ci.q;
import h6.m;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.g0;
import org.telegram.messenger.gd;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.lr;
import org.telegram.ui.Components.rq;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class h extends FrameLayout implements te.b {
    public static final int[] s = {R.drawable.msg_input_attach2, R.drawable.pagedown, R.drawable.mentionbutton, R.drawable.reactionbutton, R.drawable.menu_poll_notify, R.drawable.pagedown, R.drawable.pagedown};
    public final String[] a;
    public final i6 b;
    public final gh.a c;
    public final dh.c d;
    public final m[] e;
    public final bg.f[] f;
    public a h;
    public b n;
    public int r;

    public h(Context context, i6 i6Var, gh.b bVar, dh.c cVar) {
        super(context);
        this.a = new String[]{gd.M0(2131753951, null), gd.M0(2131754815, null), gd.M0(2131754842, null), gd.M0(2131754790, null), gd.M0(2131754804, null), gd.M0(2131754778, null), gd.M0(2131754779, null)};
        this.e = new m[7];
        this.f = new bg.f[7];
        this.r = 83;
        this.d = cVar;
        this.c = bVar;
        this.b = i6Var;
    }

    @Override // te.b
    public final void H(int i7, float f10, float f11, te.c cVar) {
        int i10 = i7 >> 16;
        int i11 = i7 & 65535;
        if (i10 >= 0) {
            m[] mVarArr = this.e;
            if (i10 >= mVarArr.length || mVarArr[i10] == null) {
                return;
            }
            if (i11 == 1 || i11 == 2) {
                a();
            }
        }
    }

    public final void a() {
        float f10 = 0.0f;
        int i7 = 0;
        while (true) {
            m[] mVarArr = this.e;
            if (i7 >= mVarArr.length) {
                return;
            }
            m mVar = mVarArr[i7];
            if (mVar != null) {
                kh.b bVar = (kh.b) mVar.b;
                float f11 = ((te.a) mVar.c).e;
                float f12 = ((te.a) mVar.d).e;
                bVar.setVisibility(f11 > 0.0f ? 0 : 8);
                bVar.setAlpha(f11);
                bVar.setScaleX(g0.T1(0.7f, 1.0f, f11));
                bVar.setScaleY(g0.T1(0.7f, 1.0f, f11));
                if (i7 != 0) {
                    bVar.setTranslationY(((1.0f - f11) * g0.L(80.0f)) - f10);
                }
                f10 += (g0.L((f12 * 10.0f) + 10.0f) + g0.L(44.0f)) * f11;
            }
            i7++;
        }
    }

    public final bg.f b(int i7) {
        bg.f[] fVarArr = this.f;
        if (fVarArr[i7] == null) {
            bg.f fVar = new bg.f();
            fVar.a = 0;
            fVar.b = false;
            fVar.c = true;
            fVarArr[i7] = fVar;
        }
        return fVarArr[i7];
    }

    public final void c(int i7, int i10, boolean z10) {
        b(i7).a = i10;
        m mVar = this.e[i7];
        if (mVar != null) {
            ((kh.b) mVar.b).a(i10, z10);
            ((te.a) mVar.d).a(i10 > 0, z10);
        }
    }

    public final void d(boolean z10) {
        b(1).b = z10;
        m mVar = this.e[1];
        if (mVar != null) {
            ((kh.b) mVar.b).c(z10, true);
        }
    }

    public final void e(int i7, boolean z10, boolean z11) {
        int i10;
        int i11;
        m[] mVarArr = this.e;
        m mVar = mVarArr[i7];
        if (mVar != null || z10) {
            if (mVar == null) {
                int i12 = i7 << 16;
                te.a aVar = new te.a(i12 | 1, this, i7 == 0 ? lr.h : se.a.a, i7 == 0 ? 300L : 280L, false);
                te.a aVar2 = new te.a(i12 | 2, this, i7 == 0 ? lr.h : se.a.a, i7 == 0 ? 300L : 280L, false);
                if (i7 == 0) {
                    i10 = 50;
                    i11 = 32;
                } else {
                    i10 = 56;
                    i11 = 48;
                }
                int i13 = i11;
                Context context = getContext();
                int i14 = s[i7];
                i6 i6Var = this.b;
                kh.b bVar = new kh.b(context, i6Var);
                kh.a d = kh.a.d(context, this.d, this.c, i6Var, i14, i13);
                bVar.b = d;
                bVar.addView(d, ma.e(i10, i10, 80));
                d.setIconPadding(g0.L(2.0f));
                ra.b(bVar, 0.13f, 2.0f);
                float f10 = i10 / 2.0f;
                bVar.setPivotX(g0.L(f10));
                bVar.setPivotY(g0.L(f10 + 8.0f));
                bVar.setVisibility(8);
                bVar.setContentDescription(this.a[i7]);
                bVar.setOnClickListener(new q(this, i7, 6));
                bVar.setOnLongClickListener(new g(this, i7, 0));
                if (i7 == 6) {
                    kh.a aVar3 = bVar.b;
                    aVar3.h = -1.0f;
                    aVar3.a();
                }
                if (i7 == 1) {
                    bVar.d = true;
                    rq rqVar = bVar.c;
                    if (rqVar != null) {
                        rqVar.setReverse(true);
                    }
                }
                addView(bVar, ma.e(i10, i10 + 8, this.r));
                mVarArr[i7] = new m(bVar, aVar, aVar2, false, 10);
                bg.f fVar = this.f[i7];
                if (fVar != null) {
                    bVar.a(fVar.a, false);
                    aVar.a(false, false);
                    aVar2.a(fVar.a > 0, false);
                    bVar.c(fVar.b, false);
                    bVar.b(fVar.c, false);
                }
                a();
            }
            ((te.a) mVarArr[i7].c).a(z10, z11);
        }
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return false;
    }

    public void setGravity(int i7) {
        this.r = i7;
    }

    public void setOnClickListener(a aVar) {
        this.h = aVar;
    }

    public void setOnLongClickListener(b bVar) {
        this.n = bVar;
    }

    @Override // te.b
    public final /* synthetic */ void D(float f10, int i7) {
    }
}
