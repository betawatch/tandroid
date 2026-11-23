package hi;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.gd;
import org.telegram.messenger.ks;
import org.telegram.messenger.mp;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.in;
import org.telegram.ui.Components.mj0;
import org.telegram.ui.Components.mv0;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final class b9 extends rg.b {
    public final Context d;
    public final org.telegram.ui.ActionBar.i6 e;
    public final y8 f;
    public ek0 h;
    public final /* synthetic */ f9 n;

    public b9(f9 f9Var, Context context, org.telegram.ui.ActionBar.i6 i6Var, y8 y8Var, fi.o3 o3Var) {
        this.n = f9Var;
        this.d = context;
        this.e = i6Var;
        this.f = y8Var;
    }

    @Override // org.telegram.ui.Components.dk0
    public final boolean D(v4.f1 f1Var) {
        int i7 = f1Var.f;
        return (i7 == 3 && this.n.a0.A1) || i7 == 7 || i7 == 9 || i7 == 10;
    }

    @Override // v4.i0
    public final int b() {
        ArrayList arrayList = this.n.M;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    @Override // v4.i0
    public final int d(int i7) {
        f9 f9Var = this.n;
        ArrayList arrayList = f9Var.M;
        if (arrayList == null || i7 < 0 || i7 >= arrayList.size()) {
            return -1;
        }
        return ((t8) f9Var.M.get(i7)).a;
    }

    @Override // v4.i0
    public final void t(v4.f1 f1Var, int i7) {
        int i10;
        int i11;
        f9 f9Var = this.n;
        k9 k9Var = f9Var.a0;
        ArrayList arrayList = f9Var.M;
        if (arrayList == null || i7 < 0 || i7 >= arrayList.size()) {
            return;
        }
        t8 t8Var = (t8) arrayList.get(i7);
        int i12 = f1Var.f;
        View view = f1Var.a;
        boolean z10 = true;
        int i13 = i7 + 1;
        t8 t8Var2 = i13 < arrayList.size() ? (t8) arrayList.get(i13) : null;
        boolean z11 = t8Var2 != null && ((i11 = t8Var2.a) == i12 || (i11 == 9 && t8Var2.q == 1));
        if (i12 == 3) {
            j9 j9Var = (j9) view;
            boolean z12 = t8Var.n;
            j9Var.d(z12, !z12);
            int i14 = t8Var.i;
            float f10 = 1.0f;
            if (i14 > 0) {
                j9Var.e(i14, t8Var.j, t8Var.g);
                j9Var.b(false, 1.0f);
            } else {
                TLRPC.User user = t8Var.g;
                if (user != null) {
                    j9Var.setUser(user);
                    if (t8Var.l && !t8Var.k) {
                        f10 = 0.5f;
                    }
                    j9Var.b(false, f10);
                } else {
                    TLRPC.Chat chat = t8Var.h;
                    if (chat != null) {
                        j9Var.a(k9.L0(k9Var, chat), chat);
                    }
                }
            }
            if (!t8Var.k && !t8Var.l) {
                z10 = false;
            }
            j9Var.c(z10, false);
            j9Var.setDivider(z11);
            j9Var.setRedCheckbox(t8Var.m);
            j9Var.w = k9Var.A1;
            return;
        }
        int i15 = 2;
        if (i12 == 2) {
            return;
        }
        if (i12 == 0) {
            view.setLayoutParams(new v4.q0(-1, org.telegram.messenger.g0.L(56.0f)));
            return;
        }
        if (i12 == -1) {
            if (t8Var.o > 0) {
                ek0 ek0Var = this.h;
                i10 = Math.max(((ek0Var == null || ek0Var.getMeasuredHeight() <= 0) ? org.telegram.messenger.g0.q.y : this.h.getMeasuredHeight() + f9Var.U) - t8Var.o, org.telegram.messenger.g0.L(120.0f));
                view.setTag(33);
            } else {
                i10 = t8Var.p;
                if (i10 >= 0) {
                    view.setTag(null);
                } else {
                    i10 = (int) (org.telegram.messenger.g0.q.y * 0.3f);
                    view.setTag(33);
                }
            }
            view.setLayoutParams(new v4.q0(-1, i10));
            return;
        }
        if (i12 == 1) {
            view.setLayoutParams(new v4.q0(-1, Math.min(org.telegram.messenger.g0.L(150.0f), this.f.L)));
            return;
        }
        if (i12 == 4) {
            r8 r8Var = (r8) view;
            CharSequence charSequence = t8Var.e;
            CharSequence charSequence2 = t8Var.f;
            r8Var.a.setText(charSequence);
            r8Var.b.setText(charSequence2);
            return;
        }
        if (i12 == 11) {
            r8 r8Var2 = (r8) view;
            r8Var2.a.setText(t8Var.e);
            r8Var2.b.setText((CharSequence) null);
            return;
        }
        if (i12 == 5) {
            try {
                ((mv0) view).b.getImageReceiver().Q0(false);
                return;
            } catch (Exception unused) {
                return;
            }
        }
        if (i12 == 6) {
            org.telegram.ui.Cells.z8 z8Var = (org.telegram.ui.Cells.z8) view;
            if (t8Var.e == null) {
                z8Var.setFixedSize(12);
                z8Var.setText(null);
                return;
            } else {
                z8Var.setFixedSize(0);
                z8Var.setText(t8Var.e);
                return;
            }
        }
        if (i12 == 7) {
            int i16 = t8Var.c;
            if (i16 == 0) {
                ((org.telegram.ui.Cells.m8) view).l(t8Var.e, k9Var.x1, z11);
                return;
            } else if (i16 == 1) {
                ((org.telegram.ui.Cells.m8) view).l(t8Var.e, k9Var.y1, z11);
                return;
            } else {
                if (i16 == 2) {
                    ((org.telegram.ui.Cells.m8) view).l(t8Var.e, k9Var.w1, z11);
                    return;
                }
                return;
            }
        }
        if (i12 == 9) {
            Drawable drawable = t8Var.d;
            if (drawable != null) {
                ((org.telegram.ui.Cells.m8) view).v(t8Var.e, drawable, z11);
                return;
            } else {
                ((org.telegram.ui.Cells.m8) view).q(t8Var.e, t8Var.f, false, z11);
                return;
            }
        }
        if (i12 == 8) {
            ((org.telegram.ui.Cells.o4) view).setText(t8Var.e);
            return;
        }
        if (i12 == 10) {
            int i17 = k9.Y1;
            int i18 = (int) mp.u1(k9Var.a).L6;
            int[] a10 = org.telegram.ui.Cells.t7.a(new int[]{0, 1, 10, 50, 100, ks.e3, ks.Z3, 400, 500, 1000, 2500, 5000, 7500, 9000, 10000}, i18);
            int j3 = Utilities.j(k9Var.C1, i18, 0);
            g0.f fVar = new g0.f(29);
            org.telegram.ui.Cells.s7 s7Var = new org.telegram.ui.Cells.s7();
            s7Var.c = a10;
            s7Var.d = 20;
            s7Var.e = fVar;
            ((org.telegram.ui.Cells.t7) view).d(j3, s7Var, new c7(this, i15));
        }
    }

    @Override // v4.i0
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        View t7Var;
        org.telegram.ui.Cells.m8 m8Var;
        View view;
        Context context = this.d;
        if (i7 == -1) {
            t7Var = new e9(context);
        } else if (i7 == 0) {
            t7Var = new View(context);
            t7Var.setTag(35);
        } else if (i7 == 1) {
            t7Var = new View(context);
            t7Var.setTag(34);
        } else {
            org.telegram.ui.ActionBar.i6 i6Var = this.e;
            if (i7 == 3) {
                t7Var = new j9(context, i6Var);
            } else {
                if (i7 == 4) {
                    view = new r8(context, i6Var, true);
                } else if (i7 == 11) {
                    t7Var = new r8(context, i6Var, false);
                } else if (i7 == 8) {
                    t7Var = new org.telegram.ui.Cells.o4(context, i6Var);
                    org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.h5, t7Var, i6Var);
                } else if (i7 == 5) {
                    mv0 mv0Var = new mv0(context, null, 1, i6Var);
                    mv0Var.d.setText(gd.N0(2131747974, null));
                    mv0Var.e.setText(gd.N0(2131745611, null));
                    mv0Var.a.setTranslationY(org.telegram.messenger.g0.L(24.0f));
                    view = mv0Var;
                } else if (i7 == 6) {
                    t7Var = new org.telegram.ui.Cells.z8(context, i6Var);
                    t7Var.setBackgroundColor(-15921907);
                } else {
                    if (i7 == 7) {
                        m8Var = new org.telegram.ui.Cells.m8(23, this.d, this.e, true, true);
                    } else if (i7 == 9) {
                        m8Var = new org.telegram.ui.Cells.m8(23, this.d, this.e, true, false);
                    } else if (i7 == 10) {
                        t7Var = new org.telegram.ui.Cells.t7(context, i6Var);
                    } else {
                        view = new in(context, 1);
                    }
                    t7Var = m8Var;
                }
                t7Var = view;
            }
        }
        return new mj0(t7Var);
    }
}
