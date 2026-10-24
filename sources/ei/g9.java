package ei;

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
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.un;
import org.telegram.ui.Components.wl0;
import org.telegram.ui.Components.wx0;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes4.dex */
public final class g9 extends pg.b {
    public final Context d;
    public final org.telegram.ui.ActionBar.g6 e;
    public final d9 f;
    public mm0 h;
    public final /* synthetic */ k9 n;

    public g9(k9 k9Var, Context context, org.telegram.ui.ActionBar.g6 g6Var, d9 d9Var, ci.d4 d4Var) {
        this.n = k9Var;
        this.d = context;
        this.e = g6Var;
        this.f = d9Var;
    }

    @Override // org.telegram.ui.Components.lm0
    public final boolean D(s4.b1 b1Var) {
        int i10 = b1Var.f;
        return (i10 == 3 && this.n.W.F) || i10 == 7 || i10 == 9 || i10 == 10;
    }

    @Override // s4.g0
    public final int h() {
        ArrayList arrayList = this.n.L;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    @Override // s4.g0
    public final int j(int i10) {
        k9 k9Var = this.n;
        ArrayList arrayList = k9Var.L;
        if (arrayList == null || i10 < 0 || i10 >= arrayList.size()) {
            return -1;
        }
        return ((y8) k9Var.L.get(i10)).a;
    }

    @Override // s4.g0
    public final void v(s4.b1 b1Var, int i10) {
        int i11;
        int i12;
        int i13;
        k9 k9Var = this.n;
        r9 r9Var = k9Var.W;
        ArrayList arrayList = k9Var.L;
        if (arrayList == null || i10 < 0 || i10 >= arrayList.size()) {
            return;
        }
        y8 y8Var = (y8) arrayList.get(i10);
        int i14 = b1Var.f;
        View view = b1Var.a;
        boolean z10 = true;
        int i15 = i10 + 1;
        y8 y8Var2 = i15 < arrayList.size() ? (y8) arrayList.get(i15) : null;
        boolean z11 = y8Var2 != null && ((i13 = y8Var2.a) == i14 || (i13 == 9 && y8Var2.q == 1));
        if (i14 == 3) {
            q9 q9Var = (q9) view;
            boolean z12 = y8Var.n;
            q9Var.d(z12, !z12);
            int i16 = y8Var.i;
            float f7 = 1.0f;
            if (i16 > 0) {
                q9Var.e(i16, y8Var.g, y8Var.j);
                q9Var.b(1.0f, false);
            } else {
                TLRPC.User user = y8Var.g;
                if (user != null) {
                    q9Var.setUser(user);
                    if (y8Var.l && !y8Var.k) {
                        f7 = 0.5f;
                    }
                    q9Var.b(f7, false);
                } else {
                    TLRPC.Chat chat = y8Var.h;
                    if (chat != null) {
                        q9Var.a(r9.e1(r9Var, chat), chat);
                    }
                }
            }
            if (!y8Var.k && !y8Var.l) {
                z10 = false;
            }
            q9Var.c(z10, false);
            q9Var.setDivider(z11);
            q9Var.setRedCheckbox(y8Var.m);
            q9Var.v = r9Var.F;
            return;
        }
        if (i14 == 2) {
            return;
        }
        if (i14 == 0) {
            view.setLayoutParams(new s4.o0(-1, AndroidUtilities.dp(56.0f)));
            return;
        }
        if (i14 == -1) {
            if (y8Var.o > 0) {
                mm0 mm0Var = this.h;
                i12 = Math.max(((mm0Var == null || mm0Var.getMeasuredHeight() <= 0) ? AndroidUtilities.displaySize.y : this.h.getMeasuredHeight() + k9Var.T) - y8Var.o, AndroidUtilities.dp(120.0f));
                view.setTag(33);
            } else {
                i12 = y8Var.p;
                if (i12 >= 0) {
                    view.setTag(null);
                } else {
                    i12 = (int) (AndroidUtilities.displaySize.y * 0.3f);
                    view.setTag(33);
                }
            }
            view.setLayoutParams(new s4.o0(-1, i12));
            return;
        }
        if (i14 == 1) {
            view.setLayoutParams(new s4.o0(-1, Math.min(AndroidUtilities.dp(150.0f), this.f.K)));
            return;
        }
        if (i14 == 4) {
            w8 w8Var = (w8) view;
            CharSequence charSequence = y8Var.e;
            CharSequence charSequence2 = y8Var.f;
            w8Var.a.setText(charSequence);
            w8Var.b.setText(charSequence2);
            return;
        }
        if (i14 == 11) {
            w8 w8Var2 = (w8) view;
            w8Var2.a.setText(y8Var.e);
            w8Var2.b.setText((CharSequence) null);
            return;
        }
        if (i14 == 5) {
            try {
                ((wx0) view).b.getImageReceiver().startAnimation();
                return;
            } catch (Exception unused) {
                return;
            }
        }
        if (i14 == 6) {
            org.telegram.ui.Cells.e9 e9Var = (org.telegram.ui.Cells.e9) view;
            if (y8Var.e == null) {
                e9Var.setFixedSize(12);
                e9Var.setText(null);
                return;
            } else {
                e9Var.setFixedSize(0);
                e9Var.setText(y8Var.e);
                return;
            }
        }
        if (i14 == 7) {
            int i17 = y8Var.c;
            if (i17 == 0) {
                ((org.telegram.ui.Cells.r8) view).l(y8Var.e, r9Var.x, z11);
                return;
            } else if (i17 == 1) {
                ((org.telegram.ui.Cells.r8) view).l(y8Var.e, r9Var.y, z11);
                return;
            } else {
                if (i17 == 2) {
                    ((org.telegram.ui.Cells.r8) view).l(y8Var.e, r9Var.w, z11);
                    return;
                }
                return;
            }
        }
        if (i14 == 9) {
            Drawable drawable = y8Var.d;
            if (drawable != null) {
                ((org.telegram.ui.Cells.r8) view).v(y8Var.e, drawable, z11);
                return;
            } else {
                ((org.telegram.ui.Cells.r8) view).q(y8Var.e, y8Var.f, false, z11);
                return;
            }
        }
        if (i14 == 8) {
            ((org.telegram.ui.Cells.l4) view).setText(y8Var.e);
            return;
        }
        if (i14 == 10) {
            i11 = ((org.telegram.ui.ActionBar.h3) r9Var).currentAccount;
            int i18 = (int) MessagesController.getInstance(i11).starsPaidMessageAmountMax;
            int[] a2 = org.telegram.ui.Cells.y7.a(i18, new int[]{0, 1, 10, 50, 100, 200, MediaDataController.MAX_LINKS_COUNT, 400, 500, MediaDataController.MAX_STYLE_RUNS_COUNT, 2500, 5000, 7500, 9000, 10000});
            int clamp = Utilities.clamp(r9Var.H, i18, 0);
            c3.m mVar = new c3.m(18);
            org.telegram.ui.Cells.x7 x7Var = new org.telegram.ui.Cells.x7();
            x7Var.c = a2;
            x7Var.d = 20;
            x7Var.e = mVar;
            ((org.telegram.ui.Cells.y7) view).d(clamp, x7Var, new ai.r0(this, 22));
        }
    }

    @Override // s4.g0
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        View y7Var;
        org.telegram.ui.Cells.r8 r8Var;
        View view;
        Context context = this.d;
        if (i10 == -1) {
            y7Var = new j9(context);
        } else if (i10 == 0) {
            y7Var = new View(context);
            y7Var.setTag(35);
        } else if (i10 == 1) {
            y7Var = new View(context);
            y7Var.setTag(34);
        } else {
            org.telegram.ui.ActionBar.g6 g6Var = this.e;
            if (i10 == 3) {
                y7Var = new q9(context, g6Var);
            } else {
                if (i10 == 4) {
                    view = new w8(context, g6Var, true);
                } else if (i10 == 11) {
                    y7Var = new w8(context, g6Var, false);
                } else if (i10 == 8) {
                    y7Var = new org.telegram.ui.Cells.l4(context, g6Var);
                    org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.h5, y7Var, g6Var);
                } else if (i10 == 5) {
                    wx0 wx0Var = new wx0(context, null, 1, g6Var);
                    wx0Var.d.setText(LocaleController.getString(R.string.NoResult));
                    wx0Var.e.setText(LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitle2));
                    wx0Var.a.setTranslationY(AndroidUtilities.dp(24.0f));
                    view = wx0Var;
                } else if (i10 == 6) {
                    y7Var = new org.telegram.ui.Cells.e9(context, g6Var);
                    y7Var.setBackgroundColor(-15921907);
                } else {
                    if (i10 == 7) {
                        r8Var = new org.telegram.ui.Cells.r8(23, this.d, this.e, true, true);
                    } else if (i10 == 9) {
                        r8Var = new org.telegram.ui.Cells.r8(23, this.d, this.e, true, false);
                    } else {
                        y7Var = i10 == 10 ? new org.telegram.ui.Cells.y7(context, g6Var) : new un(context, 2);
                    }
                    y7Var = r8Var;
                }
                y7Var = view;
            }
        }
        return new wl0(y7Var);
    }
}
