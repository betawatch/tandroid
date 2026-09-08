package di;

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
import org.telegram.ui.Components.jn;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.vk0;
import org.telegram.ui.Components.xw0;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes4.dex */
public final class x9 extends pg.b {
    public final Context d;
    public final org.telegram.ui.ActionBar.f6 e;
    public final t9 f;
    public ll0 h;
    public final /* synthetic */ ba n;

    public x9(ba baVar, Context context, org.telegram.ui.ActionBar.f6 f6Var, t9 t9Var, bi.b5 b5Var) {
        this.n = baVar;
        this.d = context;
        this.e = f6Var;
        this.f = t9Var;
    }

    @Override // org.telegram.ui.Components.kl0
    public final boolean D(s4.c1 c1Var) {
        int i10 = c1Var.f;
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
        ba baVar = this.n;
        ArrayList arrayList = baVar.L;
        if (arrayList == null || i10 < 0 || i10 >= arrayList.size()) {
            return -1;
        }
        return ((m9) baVar.L.get(i10)).a;
    }

    @Override // s4.h0
    public final void v(s4.c1 c1Var, int i10) {
        int i11;
        int i12;
        int i13;
        ba baVar = this.n;
        ia iaVar = baVar.W;
        ArrayList arrayList = baVar.L;
        if (arrayList == null || i10 < 0 || i10 >= arrayList.size()) {
            return;
        }
        m9 m9Var = (m9) arrayList.get(i10);
        int i14 = c1Var.f;
        View view = c1Var.a;
        boolean z10 = true;
        int i15 = i10 + 1;
        m9 m9Var2 = i15 < arrayList.size() ? (m9) arrayList.get(i15) : null;
        int i16 = 0;
        boolean z11 = m9Var2 != null && ((i13 = m9Var2.a) == i14 || (i13 == 9 && m9Var2.q == 1));
        if (i14 == 3) {
            ha haVar = (ha) view;
            boolean z12 = m9Var.n;
            haVar.d(z12, !z12);
            int i17 = m9Var.i;
            float f7 = 1.0f;
            if (i17 > 0) {
                haVar.e(i17, m9Var.g, m9Var.j);
                haVar.b(1.0f, false);
            } else {
                TLRPC.User user = m9Var.g;
                if (user != null) {
                    haVar.setUser(user);
                    if (m9Var.l && !m9Var.k) {
                        f7 = 0.5f;
                    }
                    haVar.b(f7, false);
                } else {
                    TLRPC.Chat chat = m9Var.h;
                    if (chat != null) {
                        haVar.a(ia.d1(iaVar, chat), chat);
                    }
                }
            }
            if (!m9Var.k && !m9Var.l) {
                z10 = false;
            }
            haVar.c(z10, false);
            haVar.setDivider(z11);
            haVar.setRedCheckbox(m9Var.m);
            haVar.v = iaVar.F;
            return;
        }
        if (i14 == 2) {
            return;
        }
        if (i14 == 0) {
            view.setLayoutParams(new s4.p0(-1, AndroidUtilities.dp(56.0f)));
            return;
        }
        if (i14 == -1) {
            if (m9Var.o > 0) {
                ll0 ll0Var = this.h;
                i12 = Math.max(((ll0Var == null || ll0Var.getMeasuredHeight() <= 0) ? AndroidUtilities.displaySize.y : this.h.getMeasuredHeight() + baVar.T) - m9Var.o, AndroidUtilities.dp(120.0f));
                view.setTag(33);
            } else {
                i12 = m9Var.p;
                if (i12 >= 0) {
                    view.setTag(null);
                } else {
                    i12 = (int) (AndroidUtilities.displaySize.y * 0.3f);
                    view.setTag(33);
                }
            }
            view.setLayoutParams(new s4.p0(-1, i12));
            return;
        }
        if (i14 == 1) {
            view.setLayoutParams(new s4.p0(-1, Math.min(AndroidUtilities.dp(150.0f), this.f.J)));
            return;
        }
        if (i14 == 4) {
            k9 k9Var = (k9) view;
            CharSequence charSequence = m9Var.e;
            CharSequence charSequence2 = m9Var.f;
            k9Var.a.setText(charSequence);
            k9Var.b.setText(charSequence2);
            return;
        }
        if (i14 == 11) {
            k9 k9Var2 = (k9) view;
            k9Var2.a.setText(m9Var.e);
            k9Var2.b.setText((CharSequence) null);
            return;
        }
        if (i14 == 5) {
            try {
                ((xw0) view).b.getImageReceiver().startAnimation();
                return;
            } catch (Exception unused) {
                return;
            }
        }
        if (i14 == 6) {
            org.telegram.ui.Cells.e9 e9Var = (org.telegram.ui.Cells.e9) view;
            if (m9Var.e == null) {
                e9Var.setFixedSize(12);
                e9Var.setText(null);
                return;
            } else {
                e9Var.setFixedSize(0);
                e9Var.setText(m9Var.e);
                return;
            }
        }
        if (i14 == 7) {
            int i18 = m9Var.c;
            if (i18 == 0) {
                ((org.telegram.ui.Cells.r8) view).j(m9Var.e, iaVar.x, z11);
                return;
            } else if (i18 == 1) {
                ((org.telegram.ui.Cells.r8) view).j(m9Var.e, iaVar.y, z11);
                return;
            } else {
                if (i18 == 2) {
                    ((org.telegram.ui.Cells.r8) view).j(m9Var.e, iaVar.w, z11);
                    return;
                }
                return;
            }
        }
        if (i14 == 9) {
            Drawable drawable = m9Var.d;
            if (drawable != null) {
                ((org.telegram.ui.Cells.r8) view).t(m9Var.e, drawable, z11);
                return;
            } else {
                ((org.telegram.ui.Cells.r8) view).o(m9Var.e, m9Var.f, false, z11);
                return;
            }
        }
        if (i14 == 8) {
            ((org.telegram.ui.Cells.l4) view).setText(m9Var.e);
            return;
        }
        if (i14 == 10) {
            i11 = ((org.telegram.ui.ActionBar.f3) iaVar).currentAccount;
            int i19 = (int) MessagesController.getInstance(i11).starsPaidMessageAmountMax;
            int[] a2 = org.telegram.ui.Cells.z7.a(i19, new int[]{0, 1, 10, 50, 100, 200, MediaDataController.MAX_LINKS_COUNT, 400, 500, MediaDataController.MAX_STYLE_RUNS_COUNT, 2500, 5000, 7500, 9000, 10000});
            int clamp = Utilities.clamp(iaVar.H, i19, 0);
            w9 w9Var = new w9(i16);
            org.telegram.ui.Cells.y7 y7Var = new org.telegram.ui.Cells.y7();
            y7Var.c = a2;
            y7Var.d = 20;
            y7Var.e = w9Var;
            ((org.telegram.ui.Cells.z7) view).d(clamp, y7Var, new bi.o1(this, 13));
        }
    }

    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        View z7Var;
        org.telegram.ui.Cells.r8 r8Var;
        View view;
        Context context = this.d;
        if (i10 == -1) {
            z7Var = new aa(context);
        } else if (i10 == 0) {
            z7Var = new View(context);
            z7Var.setTag(35);
        } else if (i10 == 1) {
            z7Var = new View(context);
            z7Var.setTag(34);
        } else {
            org.telegram.ui.ActionBar.f6 f6Var = this.e;
            if (i10 == 3) {
                z7Var = new ha(context, f6Var);
            } else {
                if (i10 == 4) {
                    view = new k9(context, f6Var, true);
                } else if (i10 == 11) {
                    z7Var = new k9(context, f6Var, false);
                } else if (i10 == 8) {
                    z7Var = new org.telegram.ui.Cells.l4(context, f6Var);
                    z7Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.h5, f6Var));
                } else if (i10 == 5) {
                    xw0 xw0Var = new xw0(context, null, 1, f6Var);
                    xw0Var.d.setText(LocaleController.getString(R.string.NoResult));
                    xw0Var.e.setText(LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitle2));
                    xw0Var.a.setTranslationY(AndroidUtilities.dp(24.0f));
                    view = xw0Var;
                } else if (i10 == 6) {
                    z7Var = new org.telegram.ui.Cells.e9(context, f6Var);
                    z7Var.setBackgroundColor(-15921907);
                } else {
                    if (i10 == 7) {
                        r8Var = new org.telegram.ui.Cells.r8(23, this.d, this.e, true, true);
                    } else if (i10 == 9) {
                        r8Var = new org.telegram.ui.Cells.r8(23, this.d, this.e, true, false);
                    } else {
                        z7Var = i10 == 10 ? new org.telegram.ui.Cells.z7(context, f6Var) : new jn(context, 2);
                    }
                    z7Var = r8Var;
                }
                z7Var = view;
            }
        }
        return new vk0(z7Var);
    }
}
