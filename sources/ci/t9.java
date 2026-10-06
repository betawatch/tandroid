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
import org.telegram.ui.Components.il0;
import org.telegram.ui.Components.nn;
import org.telegram.ui.Components.ux0;
import org.telegram.ui.Components.zl0;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes4.dex */
public final class t9 extends og.b {
    public final Context d;
    public final org.telegram.ui.ActionBar.d6 e;
    public final q9 f;
    public zl0 h;
    public final /* synthetic */ x9 n;

    public t9(x9 x9Var, Context context, org.telegram.ui.ActionBar.d6 d6Var, q9 q9Var, ai.r5 r5Var) {
        this.n = x9Var;
        this.d = context;
        this.e = d6Var;
        this.f = q9Var;
    }

    @Override // org.telegram.ui.Components.yl0
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
        x9 x9Var = this.n;
        ArrayList arrayList = x9Var.L;
        if (arrayList == null || i10 < 0 || i10 >= arrayList.size()) {
            return -1;
        }
        return ((j9) x9Var.L.get(i10)).a;
    }

    @Override // s4.h0
    public final void v(s4.c1 c1Var, int i10) {
        int i11;
        int i12;
        int i13;
        x9 x9Var = this.n;
        ea eaVar = x9Var.W;
        ArrayList arrayList = x9Var.L;
        if (arrayList == null || i10 < 0 || i10 >= arrayList.size()) {
            return;
        }
        j9 j9Var = (j9) arrayList.get(i10);
        int i14 = c1Var.f;
        View view = c1Var.a;
        boolean z10 = true;
        int i15 = i10 + 1;
        j9 j9Var2 = i15 < arrayList.size() ? (j9) arrayList.get(i15) : null;
        boolean z11 = j9Var2 != null && ((i13 = j9Var2.a) == i14 || (i13 == 9 && j9Var2.q == 1));
        if (i14 == 3) {
            da daVar = (da) view;
            boolean z12 = j9Var.n;
            daVar.d(z12, !z12);
            int i16 = j9Var.i;
            float f7 = 1.0f;
            if (i16 > 0) {
                daVar.e(i16, j9Var.g, j9Var.j);
                daVar.b(1.0f, false);
            } else {
                TLRPC.User user = j9Var.g;
                if (user != null) {
                    daVar.setUser(user);
                    if (j9Var.l && !j9Var.k) {
                        f7 = 0.5f;
                    }
                    daVar.b(f7, false);
                } else {
                    TLRPC.Chat chat = j9Var.h;
                    if (chat != null) {
                        daVar.a(ea.d1(eaVar, chat), chat);
                    }
                }
            }
            if (!j9Var.k && !j9Var.l) {
                z10 = false;
            }
            daVar.c(z10, false);
            daVar.setDivider(z11);
            daVar.setRedCheckbox(j9Var.m);
            daVar.v = eaVar.F;
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
            if (j9Var.o > 0) {
                zl0 zl0Var = this.h;
                i12 = Math.max(((zl0Var == null || zl0Var.getMeasuredHeight() <= 0) ? AndroidUtilities.displaySize.y : this.h.getMeasuredHeight() + x9Var.T) - j9Var.o, AndroidUtilities.dp(120.0f));
                view.setTag(33);
            } else {
                i12 = j9Var.p;
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
            h9 h9Var = (h9) view;
            CharSequence charSequence = j9Var.e;
            CharSequence charSequence2 = j9Var.f;
            h9Var.a.setText(charSequence);
            h9Var.b.setText(charSequence2);
            return;
        }
        if (i14 == 11) {
            h9 h9Var2 = (h9) view;
            h9Var2.a.setText(j9Var.e);
            h9Var2.b.setText((CharSequence) null);
            return;
        }
        if (i14 == 5) {
            try {
                ((ux0) view).b.getImageReceiver().startAnimation();
                return;
            } catch (Exception unused) {
                return;
            }
        }
        if (i14 == 6) {
            org.telegram.ui.Cells.e9 e9Var = (org.telegram.ui.Cells.e9) view;
            if (j9Var.e == null) {
                e9Var.setFixedSize(12);
                e9Var.setText(null);
                return;
            } else {
                e9Var.setFixedSize(0);
                e9Var.setText(j9Var.e);
                return;
            }
        }
        if (i14 == 7) {
            int i17 = j9Var.c;
            if (i17 == 0) {
                ((org.telegram.ui.Cells.r8) view).j(j9Var.e, eaVar.x, z11);
                return;
            } else if (i17 == 1) {
                ((org.telegram.ui.Cells.r8) view).j(j9Var.e, eaVar.y, z11);
                return;
            } else {
                if (i17 == 2) {
                    ((org.telegram.ui.Cells.r8) view).j(j9Var.e, eaVar.w, z11);
                    return;
                }
                return;
            }
        }
        if (i14 == 9) {
            Drawable drawable = j9Var.d;
            if (drawable != null) {
                ((org.telegram.ui.Cells.r8) view).t(j9Var.e, drawable, z11);
                return;
            } else {
                ((org.telegram.ui.Cells.r8) view).o(j9Var.e, j9Var.f, false, z11);
                return;
            }
        }
        if (i14 == 8) {
            ((org.telegram.ui.Cells.m4) view).setText(j9Var.e);
            return;
        }
        if (i14 == 10) {
            i11 = ((org.telegram.ui.ActionBar.f3) eaVar).currentAccount;
            int i18 = (int) MessagesController.getInstance(i11).starsPaidMessageAmountMax;
            int[] a2 = org.telegram.ui.Cells.z7.a(i18, new int[]{0, 1, 10, 50, 100, 200, MediaDataController.MAX_LINKS_COUNT, 400, 500, MediaDataController.MAX_STYLE_RUNS_COUNT, 2500, 5000, 7500, 9000, 10000});
            int clamp = Utilities.clamp(eaVar.H, i18, 0);
            ai.w1 w1Var = new ai.w1(23);
            org.telegram.ui.Cells.y7 y7Var = new org.telegram.ui.Cells.y7();
            y7Var.c = a2;
            y7Var.d = 20;
            y7Var.e = w1Var;
            ((org.telegram.ui.Cells.z7) view).d(clamp, y7Var, new ai.y1(this, 16));
        }
    }

    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        View z7Var;
        org.telegram.ui.Cells.r8 r8Var;
        View view;
        Context context = this.d;
        if (i10 == -1) {
            z7Var = new w9(context);
        } else if (i10 == 0) {
            z7Var = new View(context);
            z7Var.setTag(35);
        } else if (i10 == 1) {
            z7Var = new View(context);
            z7Var.setTag(34);
        } else {
            org.telegram.ui.ActionBar.d6 d6Var = this.e;
            if (i10 == 3) {
                z7Var = new da(context, d6Var);
            } else {
                if (i10 == 4) {
                    view = new h9(context, d6Var, true);
                } else if (i10 == 11) {
                    z7Var = new h9(context, d6Var, false);
                } else if (i10 == 8) {
                    z7Var = new org.telegram.ui.Cells.m4(context, d6Var);
                    z7Var.setBackgroundColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.h5, d6Var));
                } else if (i10 == 5) {
                    ux0 ux0Var = new ux0(context, null, 1, d6Var);
                    ux0Var.d.setText(LocaleController.getString(R.string.NoResult));
                    ux0Var.e.setText(LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitle2));
                    ux0Var.a.setTranslationY(AndroidUtilities.dp(24.0f));
                    view = ux0Var;
                } else if (i10 == 6) {
                    z7Var = new org.telegram.ui.Cells.e9(context, d6Var);
                    z7Var.setBackgroundColor(-15921907);
                } else {
                    if (i10 == 7) {
                        r8Var = new org.telegram.ui.Cells.r8(23, this.d, this.e, true, true);
                    } else if (i10 == 9) {
                        r8Var = new org.telegram.ui.Cells.r8(23, this.d, this.e, true, false);
                    } else {
                        z7Var = i10 == 10 ? new org.telegram.ui.Cells.z7(context, d6Var) : new nn(context, 2);
                    }
                    z7Var = r8Var;
                }
                z7Var = view;
            }
        }
        return new il0(z7Var);
    }
}
