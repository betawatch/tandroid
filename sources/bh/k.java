package bh;

import android.content.Context;
import android.support.v4.media.session.a0;
import android.widget.FrameLayout;
import b2.r1;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.cd;
import org.telegram.messenger.i0;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.lq;
import w7.b6;
import w7.e6;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class k extends FrameLayout implements fe.e {
    public static final int[] s = {R.drawable.msg_input_attach2, R.drawable.pagedown, R.drawable.mentionbutton, R.drawable.reactionbutton, R.drawable.menu_poll_notify, R.drawable.pagedown, R.drawable.pagedown};
    public final String[] a;
    public final p6 b;
    public final wg.a c;
    public final tg.b d;
    public final a0[] e;
    public final r1[] f;
    public a h;
    public b n;
    public int r;

    public k(Context context, p6 p6Var, wg.b bVar, tg.b bVar2) {
        super(context);
        this.a = new String[]{cd.L0(2131753953, null), cd.L0(2131754815, null), cd.L0(2131754842, null), cd.L0(2131754790, null), cd.L0(2131754804, null), cd.L0(2131754778, null), cd.L0(2131754779, null)};
        this.e = new a0[7];
        this.f = new r1[7];
        this.r = 83;
        this.d = bVar2;
        this.c = bVar;
        this.b = p6Var;
    }

    public final void a() {
        float f7 = 0.0f;
        int i10 = 0;
        while (true) {
            a0[] a0VarArr = this.e;
            if (i10 >= a0VarArr.length) {
                return;
            }
            a0 a0Var = a0VarArr[i10];
            if (a0Var != null) {
                ah.b bVar = (ah.b) a0Var.b;
                float f10 = ((fe.b) a0Var.c).e;
                float f11 = ((fe.b) a0Var.d).e;
                bVar.setVisibility(f10 > 0.0f ? 0 : 8);
                bVar.setAlpha(f10);
                bVar.setScaleX(i0.T1(0.7f, 1.0f, f10));
                bVar.setScaleY(i0.T1(0.7f, 1.0f, f10));
                if (i10 != 0) {
                    bVar.setTranslationY(((1.0f - f10) * i0.L(80.0f)) - f7);
                }
                f7 += (i0.L((f11 * 10.0f) + 10.0f) + i0.L(44.0f)) * f10;
            }
            i10++;
        }
    }

    public final r1 b(int i10) {
        r1[] r1VarArr = this.f;
        if (r1VarArr[i10] == null) {
            r1 r1Var = new r1();
            r1Var.a = 0;
            r1Var.b = false;
            r1Var.c = true;
            r1VarArr[i10] = r1Var;
        }
        return r1VarArr[i10];
    }

    public final void c(int i10, int i11, boolean z10) {
        b(i10).a = i11;
        a0 a0Var = this.e[i10];
        if (a0Var != null) {
            ((ah.b) a0Var.b).a(i11, z10);
            ((fe.b) a0Var.d).a(i11 > 0, z10);
        }
    }

    public final void d(boolean z10) {
        b(1).b = z10;
        a0 a0Var = this.e[1];
        if (a0Var != null) {
            ((ah.b) a0Var.b).c(z10, true);
        }
    }

    public final void e(int i10, boolean z10, boolean z11) {
        int i11;
        int i12;
        a0[] a0VarArr = this.e;
        a0 a0Var = a0VarArr[i10];
        if (a0Var != null || z10) {
            if (a0Var == null) {
                int i13 = i10 << 16;
                fe.b bVar = new fe.b(i13 | 1, this, i10 == 0 ? gr.h : ee.a.a, i10 == 0 ? 300L : 280L, false);
                fe.b bVar2 = new fe.b(i13 | 2, this, i10 == 0 ? gr.h : ee.a.a, i10 == 0 ? 300L : 280L, false);
                if (i10 == 0) {
                    i11 = 50;
                    i12 = 32;
                } else {
                    i11 = 56;
                    i12 = 48;
                }
                int i14 = i12;
                Context context = getContext();
                int i15 = s[i10];
                p6 p6Var = this.b;
                ah.b bVar3 = new ah.b(context, p6Var);
                ah.a d = ah.a.d(context, this.d, this.c, p6Var, i15, i14);
                bVar3.b = d;
                bVar3.addView(d, b6.e(i11, i11, 80));
                d.setIconPadding(i0.L(2.0f));
                e6.b(bVar3, 0.13f, 2.0f);
                float f7 = i11 / 2.0f;
                bVar3.setPivotX(i0.L(f7));
                bVar3.setPivotY(i0.L(f7 + 8.0f));
                bVar3.setVisibility(8);
                bVar3.setContentDescription(this.a[i10]);
                bVar3.setOnClickListener(new f(this, i10, 1));
                bVar3.setOnLongClickListener(new j(this, i10, 0));
                if (i10 == 6) {
                    ah.a aVar = bVar3.b;
                    aVar.h = -1.0f;
                    aVar.a();
                }
                if (i10 == 1) {
                    bVar3.d = true;
                    lq lqVar = bVar3.c;
                    if (lqVar != null) {
                        lqVar.setReverse(true);
                    }
                }
                addView(bVar3, b6.e(i11, i11 + 8, this.r));
                a0VarArr[i10] = new a0(bVar3, bVar, bVar2, 6);
                r1 r1Var = this.f[i10];
                if (r1Var != null) {
                    bVar3.a(r1Var.a, false);
                    bVar.a(false, false);
                    bVar2.a(r1Var.a > 0, false);
                    bVar3.c(r1Var.b, false);
                    bVar3.b(r1Var.c, false);
                }
                a();
            }
            ((fe.b) a0VarArr[i10].c).a(z10, z11);
        }
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return false;
    }

    public void setGravity(int i10) {
        this.r = i10;
    }

    public void setOnClickListener(a aVar) {
        this.h = aVar;
    }

    public void setOnLongClickListener(b bVar) {
        this.n = bVar;
    }

    @Override // fe.e
    public final void v(int i10, float f7, float f10, fe.f fVar) {
        int i11 = i10 >> 16;
        int i12 = i10 & 65535;
        if (i11 >= 0) {
            a0[] a0VarArr = this.e;
            if (i11 >= a0VarArr.length || a0VarArr[i11] == null) {
                return;
            }
            if (i12 == 1 || i12 == 2) {
                a();
            }
        }
    }

    @Override // fe.e
    public final /* synthetic */ void E(float f7, int i10) {
    }
}
