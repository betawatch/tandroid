package mh;

import android.content.Context;
import android.widget.FrameLayout;
import b8.mf;
import b8.pf;
import bd.i;
import bi.q;
import k4.j;
import org.telegram.messenger.bd;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.g0;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.Components.dq;
import org.telegram.ui.Components.xq;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class h extends FrameLayout implements qe.b {
    public static final int[] s = {R.drawable.msg_input_attach2, R.drawable.pagedown, R.drawable.mentionbutton, R.drawable.reactionbutton, R.drawable.menu_poll_notify, R.drawable.pagedown, R.drawable.pagedown};
    public final String[] a;
    public final e6 b;
    public final hh.a c;
    public final eh.c d;
    public final j[] e;
    public final i[] f;
    public a h;
    public b n;
    public int r;

    public h(Context context, e6 e6Var, hh.b bVar, eh.c cVar) {
        super(context);
        this.a = new String[]{bd.M0(2131753953, null), bd.M0(2131754815, null), bd.M0(2131754842, null), bd.M0(2131754790, null), bd.M0(2131754804, null), bd.M0(2131754778, null), bd.M0(2131754779, null)};
        this.e = new j[7];
        this.f = new i[7];
        this.r = 83;
        this.d = cVar;
        this.c = bVar;
        this.b = e6Var;
    }

    @Override // qe.b
    public final void Y(int i3, float f10, float f11, qe.c cVar) {
        int i10 = i3 >> 16;
        int i11 = i3 & 65535;
        if (i10 >= 0) {
            j[] jVarArr = this.e;
            if (i10 >= jVarArr.length || jVarArr[i10] == null) {
                return;
            }
            if (i11 == 1 || i11 == 2) {
                a();
            }
        }
    }

    public final void a() {
        float f10 = 0.0f;
        int i3 = 0;
        while (true) {
            j[] jVarArr = this.e;
            if (i3 >= jVarArr.length) {
                return;
            }
            j jVar = jVarArr[i3];
            if (jVar != null) {
                lh.b bVar = (lh.b) jVar.a;
                float f11 = ((qe.a) jVar.b).e;
                float f12 = ((qe.a) jVar.c).e;
                bVar.setVisibility(f11 > 0.0f ? 0 : 8);
                bVar.setAlpha(f11);
                bVar.setScaleX(g0.T1(0.7f, 1.0f, f11));
                bVar.setScaleY(g0.T1(0.7f, 1.0f, f11));
                if (i3 != 0) {
                    bVar.setTranslationY(((1.0f - f11) * g0.L(80.0f)) - f10);
                }
                f10 += (g0.L((f12 * 10.0f) + 10.0f) + g0.L(44.0f)) * f11;
            }
            i3++;
        }
    }

    public final i b(int i3) {
        i[] iVarArr = this.f;
        if (iVarArr[i3] == null) {
            i iVar = new i();
            iVar.a = 0;
            iVar.b = false;
            iVar.c = true;
            iVarArr[i3] = iVar;
        }
        return iVarArr[i3];
    }

    public final void c(int i3, int i10, boolean z10) {
        b(i3).a = i10;
        j jVar = this.e[i3];
        if (jVar != null) {
            ((lh.b) jVar.a).a(i10, z10);
            ((qe.a) jVar.c).a(i10 > 0, z10);
        }
    }

    public final void d(boolean z10) {
        b(1).b = z10;
        j jVar = this.e[1];
        if (jVar != null) {
            ((lh.b) jVar.a).c(z10, true);
        }
    }

    public final void e(int i3, boolean z10, boolean z11) {
        int i10;
        int i11;
        j[] jVarArr = this.e;
        j jVar = jVarArr[i3];
        if (jVar != null || z10) {
            if (jVar == null) {
                int i12 = i3 << 16;
                qe.a aVar = new qe.a(i12 | 1, this, i3 == 0 ? xq.h : pe.a.a, i3 == 0 ? 300L : 280L, false);
                qe.a aVar2 = new qe.a(i12 | 2, this, i3 == 0 ? xq.h : pe.a.a, i3 == 0 ? 300L : 280L, false);
                if (i3 == 0) {
                    i10 = 50;
                    i11 = 32;
                } else {
                    i10 = 56;
                    i11 = 48;
                }
                int i13 = i11;
                Context context = getContext();
                int i14 = s[i3];
                e6 e6Var = this.b;
                lh.b bVar = new lh.b(context, e6Var);
                lh.a d = lh.a.d(context, this.d, this.c, e6Var, i14, i13);
                bVar.b = d;
                bVar.addView(d, mf.e(i10, i10, 80));
                d.setIconPadding(g0.L(2.0f));
                pf.b(bVar, 0.13f, 2.0f);
                float f10 = i10 / 2.0f;
                bVar.setPivotX(g0.L(f10));
                bVar.setPivotY(g0.L(f10 + 8.0f));
                bVar.setVisibility(8);
                bVar.setContentDescription(this.a[i3]);
                bVar.setOnClickListener(new q(this, i3, 6));
                bVar.setOnLongClickListener(new g(this, i3, 0));
                if (i3 == 6) {
                    lh.a aVar3 = bVar.b;
                    aVar3.h = -1.0f;
                    aVar3.a();
                }
                if (i3 == 1) {
                    bVar.d = true;
                    dq dqVar = bVar.c;
                    if (dqVar != null) {
                        dqVar.setReverse(true);
                    }
                }
                addView(bVar, mf.e(i10, i10 + 8, this.r));
                jVarArr[i3] = new j(bVar, aVar, aVar2);
                i iVar = this.f[i3];
                if (iVar != null) {
                    bVar.a(iVar.a, false);
                    aVar.a(false, false);
                    aVar2.a(iVar.a > 0, false);
                    bVar.c(iVar.b, false);
                    bVar.b(iVar.c, false);
                }
                a();
            }
            ((qe.a) jVarArr[i3].b).a(z10, z11);
        }
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return false;
    }

    public void setGravity(int i3) {
        this.r = i3;
    }

    public void setOnClickListener(a aVar) {
        this.h = aVar;
    }

    public void setOnLongClickListener(b bVar) {
        this.n = bVar;
    }

    @Override // qe.b
    public final /* synthetic */ void F(float f10, int i3) {
    }
}
