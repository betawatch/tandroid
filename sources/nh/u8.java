package nh;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.fn;
import org.telegram.ui.Components.jl0;
import org.telegram.ui.Components.qw0;
import org.telegram.ui.Components.vk0;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final class u8 extends zf.b {
    public final Context d;
    public final org.telegram.ui.ActionBar.c6 e;
    public final r8 f;
    public jl0 h;
    public final /* synthetic */ y8 n;

    public u8(y8 y8Var, Context context, org.telegram.ui.ActionBar.c6 c6Var, r8 r8Var, lh.t3 t3Var) {
        this.n = y8Var;
        this.d = context;
        this.e = c6Var;
        this.f = r8Var;
    }

    @Override // org.telegram.ui.Components.il0
    public final boolean D(f2.n1 n1Var) {
        int i10 = n1Var.f;
        return (i10 == 3 && this.n.S.B) || i10 == 7 || i10 == 9 || i10 == 10;
    }

    @Override // f2.p0
    public final int h() {
        ArrayList arrayList = this.n.H;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    @Override // f2.p0
    public final int j(int i10) {
        y8 y8Var = this.n;
        ArrayList arrayList = y8Var.H;
        if (arrayList == null || i10 < 0 || i10 >= arrayList.size()) {
            return -1;
        }
        return ((m8) y8Var.H.get(i10)).a;
    }

    @Override // f2.p0
    public final void v(f2.n1 n1Var, int i10) {
        int i11;
        int i12;
        int i13;
        y8 y8Var = this.n;
        e9 e9Var = y8Var.S;
        ArrayList arrayList = y8Var.H;
        if (arrayList == null || i10 < 0 || i10 >= arrayList.size()) {
            return;
        }
        m8 m8Var = (m8) arrayList.get(i10);
        int i14 = n1Var.f;
        View view = n1Var.a;
        boolean z10 = true;
        int i15 = i10 + 1;
        m8 m8Var2 = i15 < arrayList.size() ? (m8) arrayList.get(i15) : null;
        boolean z11 = m8Var2 != null && ((i13 = m8Var2.a) == i14 || (i13 == 9 && m8Var2.q == 1));
        if (i14 == 3) {
            d9 d9Var = (d9) view;
            boolean z12 = m8Var.n;
            d9Var.d(z12, !z12);
            int i16 = m8Var.i;
            float f9 = 1.0f;
            if (i16 > 0) {
                d9Var.e(i16, m8Var.g, m8Var.j);
                d9Var.b(1.0f, false);
            } else {
                TLRPC.User user = m8Var.g;
                if (user != null) {
                    d9Var.setUser(user);
                    if (m8Var.l && !m8Var.k) {
                        f9 = 0.5f;
                    }
                    d9Var.b(f9, false);
                } else {
                    TLRPC.Chat chat = m8Var.h;
                    if (chat != null) {
                        d9Var.a(e9.d1(e9Var, chat), chat);
                    }
                }
            }
            if (!m8Var.k && !m8Var.l) {
                z10 = false;
            }
            d9Var.c(z10, false);
            d9Var.setDivider(z11);
            d9Var.setRedCheckbox(m8Var.m);
            d9Var.v = e9Var.B;
            return;
        }
        if (i14 == 2) {
            return;
        }
        if (i14 == 0) {
            view.setLayoutParams(new f2.x0(-1, AndroidUtilities.dp(56.0f)));
            return;
        }
        if (i14 == -1) {
            if (m8Var.o > 0) {
                jl0 jl0Var = this.h;
                i12 = Math.max(((jl0Var == null || jl0Var.getMeasuredHeight() <= 0) ? AndroidUtilities.displaySize.y : this.h.getMeasuredHeight() + y8Var.P) - m8Var.o, AndroidUtilities.dp(120.0f));
                view.setTag(33);
            } else {
                i12 = m8Var.p;
                if (i12 >= 0) {
                    view.setTag(null);
                } else {
                    i12 = (int) (AndroidUtilities.displaySize.y * 0.3f);
                    view.setTag(33);
                }
            }
            view.setLayoutParams(new f2.x0(-1, i12));
            return;
        }
        if (i14 == 1) {
            view.setLayoutParams(new f2.x0(-1, Math.min(AndroidUtilities.dp(150.0f), this.f.F)));
            return;
        }
        if (i14 == 4) {
            k8 k8Var = (k8) view;
            CharSequence charSequence = m8Var.e;
            CharSequence charSequence2 = m8Var.f;
            k8Var.a.setText(charSequence);
            k8Var.b.setText(charSequence2);
            return;
        }
        if (i14 == 11) {
            k8 k8Var2 = (k8) view;
            k8Var2.a.setText(m8Var.e);
            k8Var2.b.setText((CharSequence) null);
            return;
        }
        if (i14 == 5) {
            try {
                ((qw0) view).b.getImageReceiver().startAnimation();
                return;
            } catch (Exception unused) {
                return;
            }
        }
        int i17 = 6;
        if (i14 == 6) {
            org.telegram.ui.Cells.y8 y8Var2 = (org.telegram.ui.Cells.y8) view;
            if (m8Var.e == null) {
                y8Var2.setFixedSize(12);
                y8Var2.setText(null);
                return;
            } else {
                y8Var2.setFixedSize(0);
                y8Var2.setText(m8Var.e);
                return;
            }
        }
        int i18 = 7;
        if (i14 == 7) {
            int i19 = m8Var.c;
            if (i19 == 0) {
                ((org.telegram.ui.Cells.m8) view).j(m8Var.e, e9Var.x, z11);
                return;
            } else if (i19 == 1) {
                ((org.telegram.ui.Cells.m8) view).j(m8Var.e, e9Var.y, z11);
                return;
            } else {
                if (i19 == 2) {
                    ((org.telegram.ui.Cells.m8) view).j(m8Var.e, e9Var.w, z11);
                    return;
                }
                return;
            }
        }
        if (i14 == 9) {
            Drawable drawable = m8Var.d;
            if (drawable != null) {
                ((org.telegram.ui.Cells.m8) view).t(m8Var.e, drawable, z11);
                return;
            } else {
                ((org.telegram.ui.Cells.m8) view).o(m8Var.e, m8Var.f, false, z11);
                return;
            }
        }
        if (i14 == 8) {
            ((org.telegram.ui.Cells.k4) view).setText(m8Var.e);
            return;
        }
        if (i14 == 10) {
            i11 = ((org.telegram.ui.ActionBar.f3) e9Var).currentAccount;
            int i20 = (int) MessagesController.getInstance(i11).starsPaidMessageAmountMax;
            int[] a2 = org.telegram.ui.Cells.v7.a(i20, new int[]{0, 1, 10, 50, 100, 200, MediaDataController.MAX_LINKS_COUNT, 400, 500, MediaDataController.MAX_STYLE_RUNS_COUNT, 2500, 5000, 7500, 9000, 10000});
            int clamp = Utilities.clamp(e9Var.D, i20, 0);
            m4.a aVar = new m4.a(i17);
            org.telegram.ui.Cells.u7 u7Var = new org.telegram.ui.Cells.u7();
            u7Var.c = a2;
            u7Var.d = 20;
            u7Var.e = aVar;
            ((org.telegram.ui.Cells.v7) view).d(clamp, u7Var, new b0(this, i18));
        }
    }

    @Override // f2.p0
    public final f2.n1 x(ViewGroup viewGroup, int i10) {
        View v7Var;
        org.telegram.ui.Cells.m8 m8Var;
        View view;
        Context context = this.d;
        if (i10 == -1) {
            v7Var = new x8(context);
        } else if (i10 == 0) {
            v7Var = new View(context);
            v7Var.setTag(35);
        } else if (i10 == 1) {
            v7Var = new View(context);
            v7Var.setTag(34);
        } else {
            org.telegram.ui.ActionBar.c6 c6Var = this.e;
            if (i10 == 3) {
                v7Var = new d9(context, c6Var);
            } else {
                if (i10 == 4) {
                    view = new k8(context, c6Var, true);
                } else if (i10 == 11) {
                    v7Var = new k8(context, c6Var, false);
                } else if (i10 == 8) {
                    v7Var = new org.telegram.ui.Cells.k4(context, c6Var);
                    v7Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.h5, c6Var));
                } else if (i10 == 5) {
                    qw0 qw0Var = new qw0(context, null, 1, c6Var);
                    qw0Var.d.setText(LocaleController.getString(R.string.NoResult));
                    qw0Var.e.setText(LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitle2));
                    qw0Var.a.setTranslationY(AndroidUtilities.dp(24.0f));
                    view = qw0Var;
                } else if (i10 == 6) {
                    v7Var = new org.telegram.ui.Cells.y8(context, c6Var);
                    v7Var.setBackgroundColor(-15921907);
                } else {
                    if (i10 == 7) {
                        m8Var = new org.telegram.ui.Cells.m8(23, this.d, this.e, true, true);
                    } else if (i10 == 9) {
                        m8Var = new org.telegram.ui.Cells.m8(23, this.d, this.e, true, false);
                    } else {
                        v7Var = i10 == 10 ? new org.telegram.ui.Cells.v7(context, c6Var) : new fn(context, 5);
                    }
                    v7Var = m8Var;
                }
                v7Var = view;
            }
        }
        return new vk0(v7Var);
    }
}
