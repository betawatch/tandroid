package gi;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.bd;
import org.telegram.messenger.hp;
import org.telegram.messenger.hs;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.bj0;
import org.telegram.ui.Components.sm;
import org.telegram.ui.Components.tj0;
import org.telegram.ui.Components.zu0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class k8 extends sg.b {
    public final Context d;
    public final org.telegram.ui.ActionBar.e6 e;
    public final f8 f;
    public tj0 h;
    public final /* synthetic */ o8 n;

    public k8(o8 o8Var, Context context, org.telegram.ui.ActionBar.e6 e6Var, f8 f8Var, ei.y3 y3Var) {
        this.n = o8Var;
        this.d = context;
        this.e = e6Var;
        this.f = f8Var;
    }

    @Override // org.telegram.ui.Components.sj0
    public final boolean D(u4.d1 d1Var) {
        int i3 = d1Var.f;
        return (i3 == 3 && this.n.a0.x1) || i3 == 7 || i3 == 9 || i3 == 10;
    }

    @Override // u4.h0
    public final int b() {
        ArrayList arrayList = this.n.M;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    @Override // u4.h0
    public final int d(int i3) {
        o8 o8Var = this.n;
        ArrayList arrayList = o8Var.M;
        if (arrayList == null || i3 < 0 || i3 >= arrayList.size()) {
            return -1;
        }
        return ((a8) o8Var.M.get(i3)).a;
    }

    @Override // u4.h0
    public final void t(u4.d1 d1Var, int i3) {
        int i10;
        int i11;
        o8 o8Var = this.n;
        t8 t8Var = o8Var.a0;
        ArrayList arrayList = o8Var.M;
        if (arrayList == null || i3 < 0 || i3 >= arrayList.size()) {
            return;
        }
        a8 a8Var = (a8) arrayList.get(i3);
        int i12 = d1Var.f;
        View view = d1Var.a;
        boolean z10 = true;
        int i13 = i3 + 1;
        a8 a8Var2 = i13 < arrayList.size() ? (a8) arrayList.get(i13) : null;
        int i14 = 0;
        boolean z11 = a8Var2 != null && ((i11 = a8Var2.a) == i12 || (i11 == 9 && a8Var2.q == 1));
        if (i12 == 3) {
            s8 s8Var = (s8) view;
            boolean z12 = a8Var.n;
            s8Var.d(z12, !z12);
            int i15 = a8Var.i;
            float f10 = 1.0f;
            if (i15 > 0) {
                s8Var.e(i15, a8Var.j, a8Var.g);
                s8Var.b(false, 1.0f);
            } else {
                TLRPC.User user = a8Var.g;
                if (user != null) {
                    s8Var.setUser(user);
                    if (a8Var.l && !a8Var.k) {
                        f10 = 0.5f;
                    }
                    s8Var.b(false, f10);
                } else {
                    TLRPC.Chat chat = a8Var.h;
                    if (chat != null) {
                        s8Var.a(t8.K0(t8Var, chat), chat);
                    }
                }
            }
            if (!a8Var.k && !a8Var.l) {
                z10 = false;
            }
            s8Var.c(z10, false);
            s8Var.setDivider(z11);
            s8Var.setRedCheckbox(a8Var.m);
            s8Var.w = t8Var.x1;
            return;
        }
        if (i12 == 2) {
            return;
        }
        if (i12 == 0) {
            view.setLayoutParams(new u4.p0(-1, org.telegram.messenger.g0.L(56.0f)));
            return;
        }
        if (i12 == -1) {
            if (a8Var.o > 0) {
                tj0 tj0Var = this.h;
                i10 = Math.max(((tj0Var == null || tj0Var.getMeasuredHeight() <= 0) ? org.telegram.messenger.g0.q.y : this.h.getMeasuredHeight() + o8Var.U) - a8Var.o, org.telegram.messenger.g0.L(120.0f));
                view.setTag(33);
            } else {
                i10 = a8Var.p;
                if (i10 >= 0) {
                    view.setTag(null);
                } else {
                    i10 = (int) (org.telegram.messenger.g0.q.y * 0.3f);
                    view.setTag(33);
                }
            }
            view.setLayoutParams(new u4.p0(-1, i10));
            return;
        }
        if (i12 == 1) {
            view.setLayoutParams(new u4.p0(-1, Math.min(org.telegram.messenger.g0.L(150.0f), this.f.L)));
            return;
        }
        if (i12 == 4) {
            y7 y7Var = (y7) view;
            CharSequence charSequence = a8Var.e;
            CharSequence charSequence2 = a8Var.f;
            y7Var.a.setText(charSequence);
            y7Var.b.setText(charSequence2);
            return;
        }
        if (i12 == 11) {
            y7 y7Var2 = (y7) view;
            y7Var2.a.setText(a8Var.e);
            y7Var2.b.setText((CharSequence) null);
            return;
        }
        if (i12 == 5) {
            try {
                ((zu0) view).b.getImageReceiver().P0(false);
                return;
            } catch (Exception unused) {
                return;
            }
        }
        if (i12 == 6) {
            org.telegram.ui.Cells.y8 y8Var = (org.telegram.ui.Cells.y8) view;
            if (a8Var.e == null) {
                y8Var.setFixedSize(12);
                y8Var.setText(null);
                return;
            } else {
                y8Var.setFixedSize(0);
                y8Var.setText(a8Var.e);
                return;
            }
        }
        if (i12 == 7) {
            int i16 = a8Var.c;
            if (i16 == 0) {
                ((org.telegram.ui.Cells.l8) view).l(a8Var.e, t8Var.u1, z11);
                return;
            } else if (i16 == 1) {
                ((org.telegram.ui.Cells.l8) view).l(a8Var.e, t8Var.v1, z11);
                return;
            } else {
                if (i16 == 2) {
                    ((org.telegram.ui.Cells.l8) view).l(a8Var.e, t8Var.t1, z11);
                    return;
                }
                return;
            }
        }
        if (i12 == 9) {
            Drawable drawable = a8Var.d;
            if (drawable != null) {
                ((org.telegram.ui.Cells.l8) view).v(a8Var.e, drawable, z11);
                return;
            } else {
                ((org.telegram.ui.Cells.l8) view).q(a8Var.e, a8Var.f, false, z11);
                return;
            }
        }
        if (i12 == 8) {
            ((org.telegram.ui.Cells.n4) view).setText(a8Var.e);
            return;
        }
        if (i12 == 10) {
            int i17 = t8.V1;
            int i18 = (int) hp.s1(t8Var.a).I6;
            int[] a10 = org.telegram.ui.Cells.s7.a(new int[]{0, 1, 10, 50, 100, hs.e3, hs.Z3, 400, 500, 1000, 2500, 5000, 7500, 9000, 10000}, i18);
            int j10 = Utilities.j(t8Var.z1, i18, 0);
            i8 i8Var = new i8(i14);
            org.telegram.ui.Cells.r7 r7Var = new org.telegram.ui.Cells.r7();
            r7Var.c = a10;
            r7Var.d = 20;
            r7Var.e = i8Var;
            ((org.telegram.ui.Cells.s7) view).d(j10, r7Var, new j8(this, i14));
        }
    }

    @Override // u4.h0
    public final u4.d1 x(ViewGroup viewGroup, int i3) {
        View s7Var;
        org.telegram.ui.Cells.l8 l8Var;
        View view;
        Context context = this.d;
        if (i3 == -1) {
            s7Var = new n8(context);
        } else if (i3 == 0) {
            s7Var = new View(context);
            s7Var.setTag(35);
        } else if (i3 == 1) {
            s7Var = new View(context);
            s7Var.setTag(34);
        } else {
            org.telegram.ui.ActionBar.e6 e6Var = this.e;
            if (i3 == 3) {
                s7Var = new s8(context, e6Var);
            } else {
                if (i3 == 4) {
                    view = new y7(context, e6Var, true);
                } else if (i3 == 11) {
                    s7Var = new y7(context, e6Var, false);
                } else if (i3 == 8) {
                    s7Var = new org.telegram.ui.Cells.n4(context, e6Var);
                    org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.h5, s7Var, e6Var);
                } else if (i3 == 5) {
                    zu0 zu0Var = new zu0(context, null, 1, e6Var);
                    zu0Var.d.setText(bd.M0(2131748175, null));
                    zu0Var.e.setText(bd.M0(2131745817, null));
                    zu0Var.a.setTranslationY(org.telegram.messenger.g0.L(24.0f));
                    view = zu0Var;
                } else if (i3 == 6) {
                    s7Var = new org.telegram.ui.Cells.y8(context, e6Var);
                    s7Var.setBackgroundColor(-15921907);
                } else {
                    if (i3 == 7) {
                        l8Var = new org.telegram.ui.Cells.l8(23, this.d, this.e, true, true);
                    } else if (i3 == 9) {
                        l8Var = new org.telegram.ui.Cells.l8(23, this.d, this.e, true, false);
                    } else {
                        s7Var = i3 == 10 ? new org.telegram.ui.Cells.s7(context, e6Var) : new sm(context, 2);
                    }
                    s7Var = l8Var;
                }
                s7Var = view;
            }
        }
        return new bj0(s7Var);
    }
}
