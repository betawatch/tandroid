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
import org.telegram.ui.Components.ln;
import org.telegram.ui.Components.ml0;
import org.telegram.ui.Components.wk0;
import org.telegram.ui.Components.xw0;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes4.dex */
public final class u9 extends og.b {
    public final Context d;
    public final org.telegram.ui.ActionBar.d6 e;
    public final r9 f;
    public ml0 h;
    public final /* synthetic */ y9 n;

    public u9(y9 y9Var, Context context, org.telegram.ui.ActionBar.d6 d6Var, r9 r9Var, ai.r5 r5Var) {
        this.n = y9Var;
        this.d = context;
        this.e = d6Var;
        this.f = r9Var;
    }

    @Override // org.telegram.ui.Components.ll0
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
        y9 y9Var = this.n;
        ArrayList arrayList = y9Var.L;
        if (arrayList == null || i10 < 0 || i10 >= arrayList.size()) {
            return -1;
        }
        return ((k9) y9Var.L.get(i10)).a;
    }

    @Override // s4.h0
    public final void v(s4.c1 c1Var, int i10) {
        int i11;
        int i12;
        int i13;
        y9 y9Var = this.n;
        fa faVar = y9Var.W;
        ArrayList arrayList = y9Var.L;
        if (arrayList == null || i10 < 0 || i10 >= arrayList.size()) {
            return;
        }
        k9 k9Var = (k9) arrayList.get(i10);
        int i14 = c1Var.f;
        View view = c1Var.a;
        boolean z10 = true;
        int i15 = i10 + 1;
        k9 k9Var2 = i15 < arrayList.size() ? (k9) arrayList.get(i15) : null;
        boolean z11 = k9Var2 != null && ((i13 = k9Var2.a) == i14 || (i13 == 9 && k9Var2.q == 1));
        if (i14 == 3) {
            ea eaVar = (ea) view;
            boolean z12 = k9Var.n;
            eaVar.d(z12, !z12);
            int i16 = k9Var.i;
            float f7 = 1.0f;
            if (i16 > 0) {
                eaVar.e(i16, k9Var.g, k9Var.j);
                eaVar.b(1.0f, false);
            } else {
                TLRPC.User user = k9Var.g;
                if (user != null) {
                    eaVar.setUser(user);
                    if (k9Var.l && !k9Var.k) {
                        f7 = 0.5f;
                    }
                    eaVar.b(f7, false);
                } else {
                    TLRPC.Chat chat = k9Var.h;
                    if (chat != null) {
                        eaVar.a(fa.d1(faVar, chat), chat);
                    }
                }
            }
            if (!k9Var.k && !k9Var.l) {
                z10 = false;
            }
            eaVar.c(z10, false);
            eaVar.setDivider(z11);
            eaVar.setRedCheckbox(k9Var.m);
            eaVar.v = faVar.F;
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
            if (k9Var.o > 0) {
                ml0 ml0Var = this.h;
                i12 = Math.max(((ml0Var == null || ml0Var.getMeasuredHeight() <= 0) ? AndroidUtilities.displaySize.y : this.h.getMeasuredHeight() + y9Var.T) - k9Var.o, AndroidUtilities.dp(120.0f));
                view.setTag(33);
            } else {
                i12 = k9Var.p;
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
            i9 i9Var = (i9) view;
            CharSequence charSequence = k9Var.e;
            CharSequence charSequence2 = k9Var.f;
            i9Var.a.setText(charSequence);
            i9Var.b.setText(charSequence2);
            return;
        }
        if (i14 == 11) {
            i9 i9Var2 = (i9) view;
            i9Var2.a.setText(k9Var.e);
            i9Var2.b.setText((CharSequence) null);
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
            org.telegram.ui.Cells.f9 f9Var = (org.telegram.ui.Cells.f9) view;
            if (k9Var.e == null) {
                f9Var.setFixedSize(12);
                f9Var.setText(null);
                return;
            } else {
                f9Var.setFixedSize(0);
                f9Var.setText(k9Var.e);
                return;
            }
        }
        if (i14 == 7) {
            int i17 = k9Var.c;
            if (i17 == 0) {
                ((org.telegram.ui.Cells.s8) view).j(k9Var.e, faVar.x, z11);
                return;
            } else if (i17 == 1) {
                ((org.telegram.ui.Cells.s8) view).j(k9Var.e, faVar.y, z11);
                return;
            } else {
                if (i17 == 2) {
                    ((org.telegram.ui.Cells.s8) view).j(k9Var.e, faVar.w, z11);
                    return;
                }
                return;
            }
        }
        if (i14 == 9) {
            Drawable drawable = k9Var.d;
            if (drawable != null) {
                ((org.telegram.ui.Cells.s8) view).t(k9Var.e, drawable, z11);
                return;
            } else {
                ((org.telegram.ui.Cells.s8) view).o(k9Var.e, k9Var.f, false, z11);
                return;
            }
        }
        if (i14 == 8) {
            ((org.telegram.ui.Cells.m4) view).setText(k9Var.e);
            return;
        }
        if (i14 == 10) {
            i11 = ((org.telegram.ui.ActionBar.f3) faVar).currentAccount;
            int i18 = (int) MessagesController.getInstance(i11).starsPaidMessageAmountMax;
            int[] a2 = org.telegram.ui.Cells.a8.a(i18, new int[]{0, 1, 10, 50, 100, 200, MediaDataController.MAX_LINKS_COUNT, 400, 500, MediaDataController.MAX_STYLE_RUNS_COUNT, 2500, 5000, 7500, 9000, 10000});
            int clamp = Utilities.clamp(faVar.H, i18, 0);
            ai.w1 w1Var = new ai.w1(23);
            org.telegram.ui.Cells.z7 z7Var = new org.telegram.ui.Cells.z7();
            z7Var.c = a2;
            z7Var.d = 20;
            z7Var.e = w1Var;
            ((org.telegram.ui.Cells.a8) view).d(clamp, z7Var, new ai.y1(this, 16));
        }
    }

    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        View a8Var;
        org.telegram.ui.Cells.s8 s8Var;
        View view;
        Context context = this.d;
        if (i10 == -1) {
            a8Var = new x9(context);
        } else if (i10 == 0) {
            a8Var = new View(context);
            a8Var.setTag(35);
        } else if (i10 == 1) {
            a8Var = new View(context);
            a8Var.setTag(34);
        } else {
            org.telegram.ui.ActionBar.d6 d6Var = this.e;
            if (i10 == 3) {
                a8Var = new ea(context, d6Var);
            } else {
                if (i10 == 4) {
                    view = new i9(context, d6Var, true);
                } else if (i10 == 11) {
                    a8Var = new i9(context, d6Var, false);
                } else if (i10 == 8) {
                    a8Var = new org.telegram.ui.Cells.m4(context, d6Var);
                    a8Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.h5, d6Var));
                } else if (i10 == 5) {
                    xw0 xw0Var = new xw0(context, null, 1, d6Var);
                    xw0Var.d.setText(LocaleController.getString(R.string.NoResult));
                    xw0Var.e.setText(LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitle2));
                    xw0Var.a.setTranslationY(AndroidUtilities.dp(24.0f));
                    view = xw0Var;
                } else if (i10 == 6) {
                    a8Var = new org.telegram.ui.Cells.f9(context, d6Var);
                    a8Var.setBackgroundColor(-15921907);
                } else {
                    if (i10 == 7) {
                        s8Var = new org.telegram.ui.Cells.s8(23, this.d, this.e, true, true);
                    } else if (i10 == 9) {
                        s8Var = new org.telegram.ui.Cells.s8(23, this.d, this.e, true, false);
                    } else {
                        a8Var = i10 == 10 ? new org.telegram.ui.Cells.a8(context, d6Var) : new ln(context, 2);
                    }
                    a8Var = s8Var;
                }
                a8Var = view;
            }
        }
        return new wk0(a8Var);
    }
}
