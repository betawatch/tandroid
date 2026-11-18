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
import org.telegram.ui.Components.ck0;
import org.telegram.ui.Components.jn;
import org.telegram.ui.Components.kj0;
import org.telegram.ui.Components.kv0;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes4.dex */
public final class h8 extends rg.b {
    public final Context d;
    public final org.telegram.ui.ActionBar.i6 e;
    public final e8 f;
    public ck0 h;
    public final /* synthetic */ l8 n;

    public h8(l8 l8Var, Context context, org.telegram.ui.ActionBar.i6 i6Var, e8 e8Var, fi.o3 o3Var) {
        this.n = l8Var;
        this.d = context;
        this.e = i6Var;
        this.f = e8Var;
    }

    @Override // org.telegram.ui.Components.bk0
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
        l8 l8Var = this.n;
        ArrayList arrayList = l8Var.M;
        if (arrayList == null || i7 < 0 || i7 >= arrayList.size()) {
            return -1;
        }
        return ((z7) l8Var.M.get(i7)).a;
    }

    @Override // v4.i0
    public final void t(v4.f1 f1Var, int i7) {
        int i10;
        int i11;
        l8 l8Var = this.n;
        q8 q8Var = l8Var.a0;
        ArrayList arrayList = l8Var.M;
        if (arrayList == null || i7 < 0 || i7 >= arrayList.size()) {
            return;
        }
        z7 z7Var = (z7) arrayList.get(i7);
        int i12 = f1Var.f;
        View view = f1Var.a;
        boolean z10 = true;
        int i13 = i7 + 1;
        z7 z7Var2 = i13 < arrayList.size() ? (z7) arrayList.get(i13) : null;
        boolean z11 = z7Var2 != null && ((i11 = z7Var2.a) == i12 || (i11 == 9 && z7Var2.q == 1));
        if (i12 == 3) {
            p8 p8Var = (p8) view;
            boolean z12 = z7Var.n;
            p8Var.d(z12, !z12);
            int i14 = z7Var.i;
            float f10 = 1.0f;
            if (i14 > 0) {
                p8Var.e(i14, z7Var.j, z7Var.g);
                p8Var.b(false, 1.0f);
            } else {
                TLRPC.User user = z7Var.g;
                if (user != null) {
                    p8Var.setUser(user);
                    if (z7Var.l && !z7Var.k) {
                        f10 = 0.5f;
                    }
                    p8Var.b(false, f10);
                } else {
                    TLRPC.Chat chat = z7Var.h;
                    if (chat != null) {
                        p8Var.a(q8.L0(q8Var, chat), chat);
                    }
                }
            }
            if (!z7Var.k && !z7Var.l) {
                z10 = false;
            }
            p8Var.c(z10, false);
            p8Var.setDivider(z11);
            p8Var.setRedCheckbox(z7Var.m);
            p8Var.w = q8Var.A1;
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
            if (z7Var.o > 0) {
                ck0 ck0Var = this.h;
                i10 = Math.max(((ck0Var == null || ck0Var.getMeasuredHeight() <= 0) ? org.telegram.messenger.g0.q.y : this.h.getMeasuredHeight() + l8Var.U) - z7Var.o, org.telegram.messenger.g0.L(120.0f));
                view.setTag(33);
            } else {
                i10 = z7Var.p;
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
            x7 x7Var = (x7) view;
            CharSequence charSequence = z7Var.e;
            CharSequence charSequence2 = z7Var.f;
            x7Var.a.setText(charSequence);
            x7Var.b.setText(charSequence2);
            return;
        }
        if (i12 == 11) {
            x7 x7Var2 = (x7) view;
            x7Var2.a.setText(z7Var.e);
            x7Var2.b.setText((CharSequence) null);
            return;
        }
        if (i12 == 5) {
            try {
                ((kv0) view).b.getImageReceiver().P0(false);
                return;
            } catch (Exception unused) {
                return;
            }
        }
        if (i12 == 6) {
            org.telegram.ui.Cells.a9 a9Var = (org.telegram.ui.Cells.a9) view;
            if (z7Var.e == null) {
                a9Var.setFixedSize(12);
                a9Var.setText(null);
                return;
            } else {
                a9Var.setFixedSize(0);
                a9Var.setText(z7Var.e);
                return;
            }
        }
        if (i12 == 7) {
            int i16 = z7Var.c;
            if (i16 == 0) {
                ((org.telegram.ui.Cells.n8) view).l(z7Var.e, q8Var.x1, z11);
                return;
            } else if (i16 == 1) {
                ((org.telegram.ui.Cells.n8) view).l(z7Var.e, q8Var.y1, z11);
                return;
            } else {
                if (i16 == 2) {
                    ((org.telegram.ui.Cells.n8) view).l(z7Var.e, q8Var.w1, z11);
                    return;
                }
                return;
            }
        }
        if (i12 == 9) {
            Drawable drawable = z7Var.d;
            if (drawable != null) {
                ((org.telegram.ui.Cells.n8) view).v(z7Var.e, drawable, z11);
                return;
            } else {
                ((org.telegram.ui.Cells.n8) view).q(z7Var.e, z7Var.f, false, z11);
                return;
            }
        }
        if (i12 == 8) {
            ((org.telegram.ui.Cells.o4) view).setText(z7Var.e);
            return;
        }
        if (i12 == 10) {
            int i17 = q8.Y1;
            int i18 = (int) mp.u1(q8Var.a).L6;
            int[] a10 = org.telegram.ui.Cells.u7.a(new int[]{0, 1, 10, 50, 100, ks.e3, ks.Z3, 400, 500, 1000, 2500, 5000, 7500, 9000, 10000}, i18);
            int j3 = Utilities.j(q8Var.C1, i18, 0);
            g0.e eVar = new g0.e(29);
            org.telegram.ui.Cells.t7 t7Var = new org.telegram.ui.Cells.t7();
            t7Var.c = a10;
            t7Var.d = 20;
            t7Var.e = eVar;
            ((org.telegram.ui.Cells.u7) view).d(j3, t7Var, new t6(this, i15));
        }
    }

    @Override // v4.i0
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        View u7Var;
        org.telegram.ui.Cells.n8 n8Var;
        View view;
        Context context = this.d;
        if (i7 == -1) {
            u7Var = new k8(context);
        } else if (i7 == 0) {
            u7Var = new View(context);
            u7Var.setTag(35);
        } else if (i7 == 1) {
            u7Var = new View(context);
            u7Var.setTag(34);
        } else {
            org.telegram.ui.ActionBar.i6 i6Var = this.e;
            if (i7 == 3) {
                u7Var = new p8(context, i6Var);
            } else {
                if (i7 == 4) {
                    view = new x7(context, i6Var, true);
                } else if (i7 == 11) {
                    u7Var = new x7(context, i6Var, false);
                } else if (i7 == 8) {
                    u7Var = new org.telegram.ui.Cells.o4(context, i6Var);
                    org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.h5, u7Var, i6Var);
                } else if (i7 == 5) {
                    kv0 kv0Var = new kv0(context, null, 1, i6Var);
                    kv0Var.d.setText(gd.M0(2131747975, null));
                    kv0Var.e.setText(gd.M0(2131745612, null));
                    kv0Var.a.setTranslationY(org.telegram.messenger.g0.L(24.0f));
                    view = kv0Var;
                } else if (i7 == 6) {
                    u7Var = new org.telegram.ui.Cells.a9(context, i6Var);
                    u7Var.setBackgroundColor(-15921907);
                } else {
                    if (i7 == 7) {
                        n8Var = new org.telegram.ui.Cells.n8(23, this.d, this.e, true, true);
                    } else if (i7 == 9) {
                        n8Var = new org.telegram.ui.Cells.n8(23, this.d, this.e, true, false);
                    } else if (i7 == 10) {
                        u7Var = new org.telegram.ui.Cells.u7(context, i6Var);
                    } else {
                        view = new jn(context, 1);
                    }
                    u7Var = n8Var;
                }
                u7Var = view;
            }
        }
        return new kj0(u7Var);
    }
}
