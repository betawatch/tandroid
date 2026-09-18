package ci;

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
import org.telegram.ui.Components.gl0;
import org.telegram.ui.Components.kn;
import org.telegram.ui.Components.kx0;
import org.telegram.ui.Components.wl0;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes4.dex */
public final class x9 extends og.b {
    public final Context d;
    public final org.telegram.ui.ActionBar.e6 e;
    public final u9 f;
    public wl0 h;
    public final /* synthetic */ ba n;

    public x9(ba baVar, Context context, org.telegram.ui.ActionBar.e6 e6Var, u9 u9Var, ai.s5 s5Var) {
        this.n = baVar;
        this.d = context;
        this.e = e6Var;
        this.f = u9Var;
    }

    @Override // org.telegram.ui.Components.vl0
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
        return ((n9) baVar.L.get(i10)).a;
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
        n9 n9Var = (n9) arrayList.get(i10);
        int i14 = c1Var.f;
        View view = c1Var.a;
        boolean z10 = true;
        int i15 = i10 + 1;
        n9 n9Var2 = i15 < arrayList.size() ? (n9) arrayList.get(i15) : null;
        boolean z11 = n9Var2 != null && ((i13 = n9Var2.a) == i14 || (i13 == 9 && n9Var2.q == 1));
        if (i14 == 3) {
            ha haVar = (ha) view;
            boolean z12 = n9Var.n;
            haVar.d(z12, !z12);
            int i16 = n9Var.i;
            float f7 = 1.0f;
            if (i16 > 0) {
                haVar.e(i16, n9Var.g, n9Var.j);
                haVar.b(1.0f, false);
            } else {
                TLRPC.User user = n9Var.g;
                if (user != null) {
                    haVar.setUser(user);
                    if (n9Var.l && !n9Var.k) {
                        f7 = 0.5f;
                    }
                    haVar.b(f7, false);
                } else {
                    TLRPC.Chat chat = n9Var.h;
                    if (chat != null) {
                        haVar.a(ia.d1(iaVar, chat), chat);
                    }
                }
            }
            if (!n9Var.k && !n9Var.l) {
                z10 = false;
            }
            haVar.c(z10, false);
            haVar.setDivider(z11);
            haVar.setRedCheckbox(n9Var.m);
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
            if (n9Var.o > 0) {
                wl0 wl0Var = this.h;
                i12 = Math.max(((wl0Var == null || wl0Var.getMeasuredHeight() <= 0) ? AndroidUtilities.displaySize.y : this.h.getMeasuredHeight() + baVar.T) - n9Var.o, AndroidUtilities.dp(120.0f));
                view.setTag(33);
            } else {
                i12 = n9Var.p;
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
            l9 l9Var = (l9) view;
            CharSequence charSequence = n9Var.e;
            CharSequence charSequence2 = n9Var.f;
            l9Var.a.setText(charSequence);
            l9Var.b.setText(charSequence2);
            return;
        }
        if (i14 == 11) {
            l9 l9Var2 = (l9) view;
            l9Var2.a.setText(n9Var.e);
            l9Var2.b.setText((CharSequence) null);
            return;
        }
        if (i14 == 5) {
            try {
                ((kx0) view).b.getImageReceiver().startAnimation();
                return;
            } catch (Exception unused) {
                return;
            }
        }
        if (i14 == 6) {
            org.telegram.ui.Cells.e9 e9Var = (org.telegram.ui.Cells.e9) view;
            if (n9Var.e == null) {
                e9Var.setFixedSize(12);
                e9Var.setText(null);
                return;
            } else {
                e9Var.setFixedSize(0);
                e9Var.setText(n9Var.e);
                return;
            }
        }
        if (i14 == 7) {
            int i17 = n9Var.c;
            if (i17 == 0) {
                ((org.telegram.ui.Cells.r8) view).j(n9Var.e, iaVar.x, z11);
                return;
            } else if (i17 == 1) {
                ((org.telegram.ui.Cells.r8) view).j(n9Var.e, iaVar.y, z11);
                return;
            } else {
                if (i17 == 2) {
                    ((org.telegram.ui.Cells.r8) view).j(n9Var.e, iaVar.w, z11);
                    return;
                }
                return;
            }
        }
        if (i14 == 9) {
            Drawable drawable = n9Var.d;
            if (drawable != null) {
                ((org.telegram.ui.Cells.r8) view).t(n9Var.e, drawable, z11);
                return;
            } else {
                ((org.telegram.ui.Cells.r8) view).o(n9Var.e, n9Var.f, false, z11);
                return;
            }
        }
        if (i14 == 8) {
            ((org.telegram.ui.Cells.m4) view).setText(n9Var.e);
            return;
        }
        if (i14 == 10) {
            i11 = ((org.telegram.ui.ActionBar.f3) iaVar).currentAccount;
            int i18 = (int) MessagesController.getInstance(i11).starsPaidMessageAmountMax;
            int[] a2 = org.telegram.ui.Cells.z7.a(i18, new int[]{0, 1, 10, 50, 100, 200, MediaDataController.MAX_LINKS_COUNT, 400, 500, MediaDataController.MAX_STYLE_RUNS_COUNT, 2500, 5000, 7500, 9000, 10000});
            int clamp = Utilities.clamp(iaVar.H, i18, 0);
            ai.w1 w1Var = new ai.w1(23);
            org.telegram.ui.Cells.y7 y7Var = new org.telegram.ui.Cells.y7();
            y7Var.c = a2;
            y7Var.d = 20;
            y7Var.e = w1Var;
            ((org.telegram.ui.Cells.z7) view).d(clamp, y7Var, new ai.y1(this, 13));
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
            org.telegram.ui.ActionBar.e6 e6Var = this.e;
            if (i10 == 3) {
                z7Var = new ha(context, e6Var);
            } else {
                if (i10 == 4) {
                    view = new l9(context, e6Var, true);
                } else if (i10 == 11) {
                    z7Var = new l9(context, e6Var, false);
                } else if (i10 == 8) {
                    z7Var = new org.telegram.ui.Cells.m4(context, e6Var);
                    z7Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.h5, e6Var));
                } else if (i10 == 5) {
                    kx0 kx0Var = new kx0(context, null, 1, e6Var);
                    kx0Var.d.setText(LocaleController.getString(R.string.NoResult));
                    kx0Var.e.setText(LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitle2));
                    kx0Var.a.setTranslationY(AndroidUtilities.dp(24.0f));
                    view = kx0Var;
                } else if (i10 == 6) {
                    z7Var = new org.telegram.ui.Cells.e9(context, e6Var);
                    z7Var.setBackgroundColor(-15921907);
                } else {
                    if (i10 == 7) {
                        r8Var = new org.telegram.ui.Cells.r8(23, this.d, this.e, true, true);
                    } else if (i10 == 9) {
                        r8Var = new org.telegram.ui.Cells.r8(23, this.d, this.e, true, false);
                    } else {
                        z7Var = i10 == 10 ? new org.telegram.ui.Cells.z7(context, e6Var) : new kn(context, 2);
                    }
                    z7Var = r8Var;
                }
                z7Var = view;
            }
        }
        return new gl0(z7Var);
    }
}
