package hi;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.hd;
import org.telegram.messenger.ls;
import org.telegram.messenger.np;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.ln;
import org.telegram.ui.Components.mj0;
import org.telegram.ui.Components.nv0;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes4.dex */
public final class g8 extends rg.b {
    public final Context d;
    public final org.telegram.ui.ActionBar.h6 e;
    public final d8 f;
    public ek0 h;
    public final /* synthetic */ k8 n;

    public g8(k8 k8Var, Context context, org.telegram.ui.ActionBar.h6 h6Var, d8 d8Var, fi.o3 o3Var) {
        this.n = k8Var;
        this.d = context;
        this.e = h6Var;
        this.f = d8Var;
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
        k8 k8Var = this.n;
        ArrayList arrayList = k8Var.M;
        if (arrayList == null || i7 < 0 || i7 >= arrayList.size()) {
            return -1;
        }
        return ((y7) k8Var.M.get(i7)).a;
    }

    @Override // v4.i0
    public final void t(v4.f1 f1Var, int i7) {
        int i10;
        int i11;
        k8 k8Var = this.n;
        p8 p8Var = k8Var.a0;
        ArrayList arrayList = k8Var.M;
        if (arrayList == null || i7 < 0 || i7 >= arrayList.size()) {
            return;
        }
        y7 y7Var = (y7) arrayList.get(i7);
        int i12 = f1Var.f;
        View view = f1Var.a;
        boolean z10 = true;
        int i13 = i7 + 1;
        y7 y7Var2 = i13 < arrayList.size() ? (y7) arrayList.get(i13) : null;
        boolean z11 = y7Var2 != null && ((i11 = y7Var2.a) == i12 || (i11 == 9 && y7Var2.q == 1));
        if (i12 == 3) {
            o8 o8Var = (o8) view;
            boolean z12 = y7Var.n;
            o8Var.d(z12, !z12);
            int i14 = y7Var.i;
            float f10 = 1.0f;
            if (i14 > 0) {
                o8Var.e(i14, y7Var.j, y7Var.g);
                o8Var.b(false, 1.0f);
            } else {
                TLRPC.User user = y7Var.g;
                if (user != null) {
                    o8Var.setUser(user);
                    if (y7Var.l && !y7Var.k) {
                        f10 = 0.5f;
                    }
                    o8Var.b(false, f10);
                } else {
                    TLRPC.Chat chat = y7Var.h;
                    if (chat != null) {
                        o8Var.a(p8.L0(p8Var, chat), chat);
                    }
                }
            }
            if (!y7Var.k && !y7Var.l) {
                z10 = false;
            }
            o8Var.c(z10, false);
            o8Var.setDivider(z11);
            o8Var.setRedCheckbox(y7Var.m);
            o8Var.w = p8Var.A1;
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
            if (y7Var.o > 0) {
                ek0 ek0Var = this.h;
                i10 = Math.max(((ek0Var == null || ek0Var.getMeasuredHeight() <= 0) ? org.telegram.messenger.g0.q.y : this.h.getMeasuredHeight() + k8Var.U) - y7Var.o, org.telegram.messenger.g0.L(120.0f));
                view.setTag(33);
            } else {
                i10 = y7Var.p;
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
            w7 w7Var = (w7) view;
            CharSequence charSequence = y7Var.e;
            CharSequence charSequence2 = y7Var.f;
            w7Var.a.setText(charSequence);
            w7Var.b.setText(charSequence2);
            return;
        }
        if (i12 == 11) {
            w7 w7Var2 = (w7) view;
            w7Var2.a.setText(y7Var.e);
            w7Var2.b.setText((CharSequence) null);
            return;
        }
        if (i12 == 5) {
            try {
                ((nv0) view).b.getImageReceiver().P0(false);
                return;
            } catch (Exception unused) {
                return;
            }
        }
        if (i12 == 6) {
            org.telegram.ui.Cells.a9 a9Var = (org.telegram.ui.Cells.a9) view;
            if (y7Var.e == null) {
                a9Var.setFixedSize(12);
                a9Var.setText(null);
                return;
            } else {
                a9Var.setFixedSize(0);
                a9Var.setText(y7Var.e);
                return;
            }
        }
        if (i12 == 7) {
            int i16 = y7Var.c;
            if (i16 == 0) {
                ((org.telegram.ui.Cells.n8) view).l(y7Var.e, p8Var.x1, z11);
                return;
            } else if (i16 == 1) {
                ((org.telegram.ui.Cells.n8) view).l(y7Var.e, p8Var.y1, z11);
                return;
            } else {
                if (i16 == 2) {
                    ((org.telegram.ui.Cells.n8) view).l(y7Var.e, p8Var.w1, z11);
                    return;
                }
                return;
            }
        }
        if (i12 == 9) {
            Drawable drawable = y7Var.d;
            if (drawable != null) {
                ((org.telegram.ui.Cells.n8) view).v(y7Var.e, drawable, z11);
                return;
            } else {
                ((org.telegram.ui.Cells.n8) view).q(y7Var.e, y7Var.f, false, z11);
                return;
            }
        }
        if (i12 == 8) {
            ((org.telegram.ui.Cells.o4) view).setText(y7Var.e);
            return;
        }
        if (i12 == 10) {
            int i17 = p8.Y1;
            int i18 = (int) np.u1(p8Var.a).L6;
            int[] a10 = org.telegram.ui.Cells.u7.a(new int[]{0, 1, 10, 50, 100, ls.e3, ls.Z3, 400, 500, 1000, 2500, 5000, 7500, 9000, 10000}, i18);
            int j3 = Utilities.j(p8Var.C1, i18, 0);
            g0.e eVar = new g0.e(29);
            org.telegram.ui.Cells.t7 t7Var = new org.telegram.ui.Cells.t7();
            t7Var.c = a10;
            t7Var.d = 20;
            t7Var.e = eVar;
            ((org.telegram.ui.Cells.u7) view).d(j3, t7Var, new s6(this, i15));
        }
    }

    @Override // v4.i0
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        View u7Var;
        org.telegram.ui.Cells.n8 n8Var;
        View view;
        Context context = this.d;
        if (i7 == -1) {
            u7Var = new j8(context);
        } else if (i7 == 0) {
            u7Var = new View(context);
            u7Var.setTag(35);
        } else if (i7 == 1) {
            u7Var = new View(context);
            u7Var.setTag(34);
        } else {
            org.telegram.ui.ActionBar.h6 h6Var = this.e;
            if (i7 == 3) {
                u7Var = new o8(context, h6Var);
            } else {
                if (i7 == 4) {
                    view = new w7(context, h6Var, true);
                } else if (i7 == 11) {
                    u7Var = new w7(context, h6Var, false);
                } else if (i7 == 8) {
                    u7Var = new org.telegram.ui.Cells.o4(context, h6Var);
                    org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.h5, u7Var, h6Var);
                } else if (i7 == 5) {
                    nv0 nv0Var = new nv0(context, null, 1, h6Var);
                    nv0Var.d.setText(hd.N0(2131747974, null));
                    nv0Var.e.setText(hd.N0(2131745611, null));
                    nv0Var.a.setTranslationY(org.telegram.messenger.g0.L(24.0f));
                    view = nv0Var;
                } else if (i7 == 6) {
                    u7Var = new org.telegram.ui.Cells.a9(context, h6Var);
                    u7Var.setBackgroundColor(-15921907);
                } else {
                    if (i7 == 7) {
                        n8Var = new org.telegram.ui.Cells.n8(23, this.d, this.e, true, true);
                    } else if (i7 == 9) {
                        n8Var = new org.telegram.ui.Cells.n8(23, this.d, this.e, true, false);
                    } else if (i7 == 10) {
                        u7Var = new org.telegram.ui.Cells.u7(context, h6Var);
                    } else {
                        view = new ln(context, 1);
                    }
                    u7Var = n8Var;
                }
                u7Var = view;
            }
        }
        return new mj0(u7Var);
    }
}
