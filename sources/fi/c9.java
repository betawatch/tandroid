package fi;

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
import org.telegram.ui.Components.ey0;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.vl0;
import org.telegram.ui.Components.vn;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final class c9 extends qg.b {
    public final Context d;
    public final org.telegram.ui.ActionBar.u6 e;
    public final z8 f;
    public mm0 h;
    public final /* synthetic */ g9 n;

    public c9(g9 g9Var, Context context, org.telegram.ui.ActionBar.u6 u6Var, z8 z8Var, di.e4 e4Var) {
        this.n = g9Var;
        this.d = context;
        this.e = u6Var;
        this.f = z8Var;
    }

    @Override // org.telegram.ui.Components.lm0
    public final boolean D(s4.e1 e1Var) {
        int i10 = e1Var.f;
        return (i10 == 3 && this.n.W.F) || i10 == 7 || i10 == 9 || i10 == 10;
    }

    @Override // s4.h0
    public final int h() {
        ArrayList arrayList = this.n.L;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    @Override // s4.h0
    public final int j(int i10) {
        g9 g9Var = this.n;
        ArrayList arrayList = g9Var.L;
        if (arrayList == null || i10 < 0 || i10 >= arrayList.size()) {
            return -1;
        }
        return ((u8) g9Var.L.get(i10)).a;
    }

    @Override // s4.h0
    public final void v(s4.e1 e1Var, int i10) {
        int i11;
        int i12;
        int i13;
        g9 g9Var = this.n;
        n9 n9Var = g9Var.W;
        ArrayList arrayList = g9Var.L;
        if (arrayList == null || i10 < 0 || i10 >= arrayList.size()) {
            return;
        }
        u8 u8Var = (u8) arrayList.get(i10);
        int i14 = e1Var.f;
        View view = e1Var.a;
        boolean z10 = true;
        int i15 = i10 + 1;
        u8 u8Var2 = i15 < arrayList.size() ? (u8) arrayList.get(i15) : null;
        boolean z11 = u8Var2 != null && ((i13 = u8Var2.a) == i14 || (i13 == 9 && u8Var2.q == 1));
        if (i14 == 3) {
            m9 m9Var = (m9) view;
            boolean z12 = u8Var.n;
            m9Var.d(z12, !z12);
            int i16 = u8Var.i;
            float f7 = 1.0f;
            if (i16 > 0) {
                m9Var.e(i16, u8Var.g, u8Var.j);
                m9Var.b(1.0f, false);
            } else {
                TLRPC.User user = u8Var.g;
                if (user != null) {
                    m9Var.setUser(user);
                    if (u8Var.l && !u8Var.k) {
                        f7 = 0.5f;
                    }
                    m9Var.b(f7, false);
                } else {
                    TLRPC.Chat chat = u8Var.h;
                    if (chat != null) {
                        m9Var.a(n9.e1(n9Var, chat), chat);
                    }
                }
            }
            if (!u8Var.k && !u8Var.l) {
                z10 = false;
            }
            m9Var.c(z10, false);
            m9Var.setDivider(z11);
            m9Var.setRedCheckbox(u8Var.m);
            m9Var.v = n9Var.F;
            return;
        }
        if (i14 == 2) {
            return;
        }
        if (i14 == 0) {
            view.setLayoutParams(new s4.q0(-1, AndroidUtilities.dp(56.0f)));
            return;
        }
        if (i14 == -1) {
            if (u8Var.o > 0) {
                mm0 mm0Var = this.h;
                i12 = Math.max(((mm0Var == null || mm0Var.getMeasuredHeight() <= 0) ? AndroidUtilities.displaySize.y : this.h.getMeasuredHeight() + g9Var.T) - u8Var.o, AndroidUtilities.dp(120.0f));
                view.setTag(33);
            } else {
                i12 = u8Var.p;
                if (i12 >= 0) {
                    view.setTag(null);
                } else {
                    i12 = (int) (AndroidUtilities.displaySize.y * 0.3f);
                    view.setTag(33);
                }
            }
            view.setLayoutParams(new s4.q0(-1, i12));
            return;
        }
        if (i14 == 1) {
            view.setLayoutParams(new s4.q0(-1, Math.min(AndroidUtilities.dp(150.0f), this.f.K)));
            return;
        }
        if (i14 == 4) {
            s8 s8Var = (s8) view;
            CharSequence charSequence = u8Var.e;
            CharSequence charSequence2 = u8Var.f;
            s8Var.a.setText(charSequence);
            s8Var.b.setText(charSequence2);
            return;
        }
        if (i14 == 11) {
            s8 s8Var2 = (s8) view;
            s8Var2.a.setText(u8Var.e);
            s8Var2.b.setText((CharSequence) null);
            return;
        }
        if (i14 == 5) {
            try {
                ((ey0) view).b.getImageReceiver().startAnimation();
                return;
            } catch (Exception unused) {
                return;
            }
        }
        if (i14 == 6) {
            org.telegram.ui.Cells.i9 i9Var = (org.telegram.ui.Cells.i9) view;
            if (u8Var.e == null) {
                i9Var.setFixedSize(12);
                i9Var.setText(null);
                return;
            } else {
                i9Var.setFixedSize(0);
                i9Var.setText(u8Var.e);
                return;
            }
        }
        if (i14 == 7) {
            int i17 = u8Var.c;
            if (i17 == 0) {
                ((org.telegram.ui.Cells.v8) view).l(u8Var.e, n9Var.x, z11);
                return;
            } else if (i17 == 1) {
                ((org.telegram.ui.Cells.v8) view).l(u8Var.e, n9Var.y, z11);
                return;
            } else {
                if (i17 == 2) {
                    ((org.telegram.ui.Cells.v8) view).l(u8Var.e, n9Var.w, z11);
                    return;
                }
                return;
            }
        }
        if (i14 == 9) {
            Drawable drawable = u8Var.d;
            if (drawable != null) {
                ((org.telegram.ui.Cells.v8) view).v(u8Var.e, drawable, z11);
                return;
            } else {
                ((org.telegram.ui.Cells.v8) view).q(u8Var.e, u8Var.f, false, z11);
                return;
            }
        }
        if (i14 == 8) {
            ((org.telegram.ui.Cells.q4) view).setText(u8Var.e);
            return;
        }
        if (i14 == 10) {
            i11 = ((org.telegram.ui.ActionBar.k3) n9Var).currentAccount;
            int i18 = (int) MessagesController.getInstance(i11).starsPaidMessageAmountMax;
            int[] a2 = org.telegram.ui.Cells.c8.a(i18, new int[]{0, 1, 10, 50, 100, 200, MediaDataController.MAX_LINKS_COUNT, 400, 500, MediaDataController.MAX_STYLE_RUNS_COUNT, 2500, 5000, 7500, 9000, 10000});
            int clamp = Utilities.clamp(n9Var.H, i18, 0);
            c2.i iVar = new c2.i(20);
            org.telegram.ui.Cells.b8 b8Var = new org.telegram.ui.Cells.b8();
            b8Var.c = a2;
            b8Var.d = 20;
            b8Var.e = iVar;
            ((org.telegram.ui.Cells.c8) view).d(clamp, b8Var, new ai.i(this, 26));
        }
    }

    @Override // s4.h0
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        View c8Var;
        org.telegram.ui.Cells.v8 v8Var;
        View view;
        Context context = this.d;
        if (i10 == -1) {
            c8Var = new f9(context);
        } else if (i10 == 0) {
            c8Var = new View(context);
            c8Var.setTag(35);
        } else if (i10 == 1) {
            c8Var = new View(context);
            c8Var.setTag(34);
        } else {
            org.telegram.ui.ActionBar.u6 u6Var = this.e;
            if (i10 == 3) {
                c8Var = new m9(context, u6Var);
            } else {
                if (i10 == 4) {
                    view = new s8(context, u6Var, true);
                } else if (i10 == 11) {
                    c8Var = new s8(context, u6Var, false);
                } else if (i10 == 8) {
                    c8Var = new org.telegram.ui.Cells.q4(context, u6Var);
                    org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.h5, c8Var, u6Var);
                } else if (i10 == 5) {
                    ey0 ey0Var = new ey0(context, null, 1, u6Var);
                    ey0Var.d.setText(LocaleController.getString(R.string.NoResult));
                    ey0Var.e.setText(LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitle2));
                    ey0Var.a.setTranslationY(AndroidUtilities.dp(24.0f));
                    view = ey0Var;
                } else if (i10 == 6) {
                    c8Var = new org.telegram.ui.Cells.i9(context, u6Var);
                    c8Var.setBackgroundColor(-15921907);
                } else {
                    if (i10 == 7) {
                        v8Var = new org.telegram.ui.Cells.v8(23, this.d, this.e, true, true);
                    } else if (i10 == 9) {
                        v8Var = new org.telegram.ui.Cells.v8(23, this.d, this.e, true, false);
                    } else {
                        c8Var = i10 == 10 ? new org.telegram.ui.Cells.c8(context, u6Var) : new vn(context, 2);
                    }
                    c8Var = v8Var;
                }
                c8Var = view;
            }
        }
        return new vl0(c8Var);
    }
}
