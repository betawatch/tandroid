package fi;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.hd;
import org.telegram.messenger.qp;
import org.telegram.messenger.qs;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.av0;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.tm;
import org.telegram.ui.Components.xi0;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class j8 extends rg.b {
    public final Context d;
    public final org.telegram.ui.ActionBar.f6 e;
    public final g8 f;
    public pj0 h;
    public final /* synthetic */ n8 n;

    public j8(n8 n8Var, Context context, org.telegram.ui.ActionBar.f6 f6Var, g8 g8Var, di.w3 w3Var) {
        this.n = n8Var;
        this.d = context;
        this.e = f6Var;
        this.f = g8Var;
    }

    @Override // org.telegram.ui.Components.oj0
    public final boolean D(v4.d1 d1Var) {
        int i7 = d1Var.f;
        return (i7 == 3 && this.n.W.w1) || i7 == 7 || i7 == 9 || i7 == 10;
    }

    @Override // v4.g0
    public final int b() {
        ArrayList arrayList = this.n.L;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    @Override // v4.g0
    public final int d(int i7) {
        n8 n8Var = this.n;
        ArrayList arrayList = n8Var.L;
        if (arrayList == null || i7 < 0 || i7 >= arrayList.size()) {
            return -1;
        }
        return ((b8) n8Var.L.get(i7)).a;
    }

    @Override // v4.g0
    public final void t(v4.d1 d1Var, int i7) {
        int i10;
        int i11;
        n8 n8Var = this.n;
        s8 s8Var = n8Var.W;
        ArrayList arrayList = n8Var.L;
        if (arrayList == null || i7 < 0 || i7 >= arrayList.size()) {
            return;
        }
        b8 b8Var = (b8) arrayList.get(i7);
        int i12 = d1Var.f;
        View view = d1Var.a;
        boolean z9 = true;
        int i13 = i7 + 1;
        b8 b8Var2 = i13 < arrayList.size() ? (b8) arrayList.get(i13) : null;
        boolean z10 = b8Var2 != null && ((i11 = b8Var2.a) == i12 || (i11 == 9 && b8Var2.q == 1));
        if (i12 == 3) {
            r8 r8Var = (r8) view;
            boolean z11 = b8Var.n;
            r8Var.d(z11, !z11);
            int i14 = b8Var.i;
            float f10 = 1.0f;
            if (i14 > 0) {
                r8Var.e(i14, b8Var.j, b8Var.g);
                r8Var.b(false, 1.0f);
            } else {
                TLRPC.User user = b8Var.g;
                if (user != null) {
                    r8Var.setUser(user);
                    if (b8Var.l && !b8Var.k) {
                        f10 = 0.5f;
                    }
                    r8Var.b(false, f10);
                } else {
                    TLRPC.Chat chat = b8Var.h;
                    if (chat != null) {
                        r8Var.a(s8.K0(s8Var, chat), chat);
                    }
                }
            }
            if (!b8Var.k && !b8Var.l) {
                z9 = false;
            }
            r8Var.c(z9, false);
            r8Var.setDivider(z10);
            r8Var.setRedCheckbox(b8Var.m);
            r8Var.w = s8Var.w1;
            return;
        }
        if (i12 == 2) {
            return;
        }
        if (i12 == 0) {
            view.setLayoutParams(new v4.o0(-1, org.telegram.messenger.g0.L(56.0f)));
            return;
        }
        if (i12 == -1) {
            if (b8Var.o > 0) {
                pj0 pj0Var = this.h;
                i10 = Math.max(((pj0Var == null || pj0Var.getMeasuredHeight() <= 0) ? org.telegram.messenger.g0.q.y : this.h.getMeasuredHeight() + n8Var.T) - b8Var.o, org.telegram.messenger.g0.L(120.0f));
                view.setTag(33);
            } else {
                i10 = b8Var.p;
                if (i10 >= 0) {
                    view.setTag(null);
                } else {
                    i10 = (int) (org.telegram.messenger.g0.q.y * 0.3f);
                    view.setTag(33);
                }
            }
            view.setLayoutParams(new v4.o0(-1, i10));
            return;
        }
        if (i12 == 1) {
            view.setLayoutParams(new v4.o0(-1, Math.min(org.telegram.messenger.g0.L(150.0f), this.f.K)));
            return;
        }
        if (i12 == 4) {
            z7 z7Var = (z7) view;
            CharSequence charSequence = b8Var.e;
            CharSequence charSequence2 = b8Var.f;
            z7Var.a.setText(charSequence);
            z7Var.b.setText(charSequence2);
            return;
        }
        if (i12 == 11) {
            z7 z7Var2 = (z7) view;
            z7Var2.a.setText(b8Var.e);
            z7Var2.b.setText((CharSequence) null);
            return;
        }
        if (i12 == 5) {
            try {
                ((av0) view).b.getImageReceiver().P0(false);
                return;
            } catch (Exception unused) {
                return;
            }
        }
        if (i12 == 6) {
            org.telegram.ui.Cells.z8 z8Var = (org.telegram.ui.Cells.z8) view;
            if (b8Var.e == null) {
                z8Var.setFixedSize(12);
                z8Var.setText(null);
                return;
            } else {
                z8Var.setFixedSize(0);
                z8Var.setText(b8Var.e);
                return;
            }
        }
        if (i12 == 7) {
            int i15 = b8Var.c;
            if (i15 == 0) {
                ((org.telegram.ui.Cells.m8) view).l(b8Var.e, s8Var.t1, z10);
                return;
            } else if (i15 == 1) {
                ((org.telegram.ui.Cells.m8) view).l(b8Var.e, s8Var.u1, z10);
                return;
            } else {
                if (i15 == 2) {
                    ((org.telegram.ui.Cells.m8) view).l(b8Var.e, s8Var.s1, z10);
                    return;
                }
                return;
            }
        }
        if (i12 == 9) {
            Drawable drawable = b8Var.d;
            if (drawable != null) {
                ((org.telegram.ui.Cells.m8) view).v(b8Var.e, drawable, z10);
                return;
            } else {
                ((org.telegram.ui.Cells.m8) view).q(b8Var.e, b8Var.f, false, z10);
                return;
            }
        }
        if (i12 == 8) {
            ((org.telegram.ui.Cells.n4) view).setText(b8Var.e);
            return;
        }
        if (i12 == 10) {
            int i16 = s8.U1;
            int i17 = (int) qp.s1(s8Var.a).I6;
            int[] a10 = org.telegram.ui.Cells.t7.a(new int[]{0, 1, 10, 50, 100, qs.e3, qs.Z3, 400, 500, 1000, 2500, 5000, 7500, 9000, 10000}, i17);
            int j3 = Utilities.j(s8Var.y1, i17, 0);
            di.a1 a1Var = new di.a1(23);
            org.telegram.ui.Cells.s7 s7Var = new org.telegram.ui.Cells.s7();
            s7Var.c = a10;
            s7Var.d = 20;
            s7Var.e = a1Var;
            ((org.telegram.ui.Cells.t7) view).d(j3, s7Var, new ai.i(this, 27));
        }
    }

    @Override // v4.g0
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        View t7Var;
        org.telegram.ui.Cells.m8 m8Var;
        View view;
        Context context = this.d;
        if (i7 == -1) {
            t7Var = new m8(context);
        } else if (i7 == 0) {
            t7Var = new View(context);
            t7Var.setTag(35);
        } else if (i7 == 1) {
            t7Var = new View(context);
            t7Var.setTag(34);
        } else {
            org.telegram.ui.ActionBar.f6 f6Var = this.e;
            if (i7 == 3) {
                t7Var = new r8(context, f6Var);
            } else {
                if (i7 == 4) {
                    view = new z7(context, f6Var, true);
                } else if (i7 == 11) {
                    t7Var = new z7(context, f6Var, false);
                } else if (i7 == 8) {
                    t7Var = new org.telegram.ui.Cells.n4(context, f6Var);
                    org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.h5, t7Var, f6Var);
                } else if (i7 == 5) {
                    av0 av0Var = new av0(context, null, 1, f6Var);
                    av0Var.d.setText(hd.M0(2131748166, null));
                    av0Var.e.setText(hd.M0(2131745808, null));
                    av0Var.a.setTranslationY(org.telegram.messenger.g0.L(24.0f));
                    view = av0Var;
                } else if (i7 == 6) {
                    t7Var = new org.telegram.ui.Cells.z8(context, f6Var);
                    t7Var.setBackgroundColor(-15921907);
                } else {
                    if (i7 == 7) {
                        m8Var = new org.telegram.ui.Cells.m8(23, this.d, this.e, true, true);
                    } else if (i7 == 9) {
                        m8Var = new org.telegram.ui.Cells.m8(23, this.d, this.e, true, false);
                    } else if (i7 == 10) {
                        t7Var = new org.telegram.ui.Cells.t7(context, f6Var);
                    } else {
                        view = new tm(context, 1);
                    }
                    t7Var = m8Var;
                }
                t7Var = view;
            }
        }
        return new xi0(t7Var);
    }
}
