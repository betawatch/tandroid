package kh;

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
import org.telegram.ui.Components.an;
import org.telegram.ui.Components.gw0;
import org.telegram.ui.Components.ik0;
import org.telegram.ui.Components.wk0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class j9 extends wf.b {
    public final Context d;
    public final org.telegram.ui.ActionBar.b6 e;
    public final f9 f;
    public wk0 h;
    public final /* synthetic */ n9 n;

    public j9(n9 n9Var, Context context, org.telegram.ui.ActionBar.b6 b6Var, f9 f9Var, ih.y3 y3Var) {
        this.n = n9Var;
        this.d = context;
        this.e = b6Var;
        this.f = f9Var;
    }

    @Override // org.telegram.ui.Components.vk0
    public final boolean D(f2.q1 q1Var) {
        int i9 = q1Var.f;
        return (i9 == 3 && this.n.S.B) || i9 == 7 || i9 == 9 || i9 == 10;
    }

    @Override // f2.r0
    public final int h() {
        ArrayList arrayList = this.n.H;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    @Override // f2.r0
    public final int j(int i9) {
        n9 n9Var = this.n;
        ArrayList arrayList = n9Var.H;
        if (arrayList == null || i9 < 0 || i9 >= arrayList.size()) {
            return -1;
        }
        return ((a9) n9Var.H.get(i9)).a;
    }

    @Override // f2.r0
    public final void v(f2.q1 q1Var, int i9) {
        int i10;
        int i11;
        int i12;
        n9 n9Var = this.n;
        t9 t9Var = n9Var.S;
        ArrayList arrayList = n9Var.H;
        if (arrayList == null || i9 < 0 || i9 >= arrayList.size()) {
            return;
        }
        a9 a9Var = (a9) arrayList.get(i9);
        int i13 = q1Var.f;
        View view = q1Var.a;
        boolean z10 = true;
        int i14 = i9 + 1;
        a9 a9Var2 = i14 < arrayList.size() ? (a9) arrayList.get(i14) : null;
        boolean z11 = a9Var2 != null && ((i12 = a9Var2.a) == i13 || (i12 == 9 && a9Var2.q == 1));
        if (i13 == 3) {
            s9 s9Var = (s9) view;
            boolean z12 = a9Var.n;
            s9Var.d(z12, !z12);
            int i15 = a9Var.i;
            float f10 = 1.0f;
            if (i15 > 0) {
                s9Var.e(i15, a9Var.g, a9Var.j);
                s9Var.b(1.0f, false);
            } else {
                TLRPC.User user = a9Var.g;
                if (user != null) {
                    s9Var.setUser(user);
                    if (a9Var.l && !a9Var.k) {
                        f10 = 0.5f;
                    }
                    s9Var.b(f10, false);
                } else {
                    TLRPC.Chat chat = a9Var.h;
                    if (chat != null) {
                        s9Var.a(t9.d1(t9Var, chat), chat);
                    }
                }
            }
            if (!a9Var.k && !a9Var.l) {
                z10 = false;
            }
            s9Var.c(z10, false);
            s9Var.setDivider(z11);
            s9Var.setRedCheckbox(a9Var.m);
            s9Var.v = t9Var.B;
            return;
        }
        if (i13 == 2) {
            return;
        }
        if (i13 == 0) {
            view.setLayoutParams(new f2.a1(-1, AndroidUtilities.dp(56.0f)));
            return;
        }
        if (i13 == -1) {
            if (a9Var.o > 0) {
                wk0 wk0Var = this.h;
                i11 = Math.max(((wk0Var == null || wk0Var.getMeasuredHeight() <= 0) ? AndroidUtilities.displaySize.y : this.h.getMeasuredHeight() + n9Var.P) - a9Var.o, AndroidUtilities.dp(120.0f));
                view.setTag(33);
            } else {
                i11 = a9Var.p;
                if (i11 >= 0) {
                    view.setTag(null);
                } else {
                    i11 = (int) (AndroidUtilities.displaySize.y * 0.3f);
                    view.setTag(33);
                }
            }
            view.setLayoutParams(new f2.a1(-1, i11));
            return;
        }
        if (i13 == 1) {
            view.setLayoutParams(new f2.a1(-1, Math.min(AndroidUtilities.dp(150.0f), this.f.F)));
            return;
        }
        if (i13 == 4) {
            y8 y8Var = (y8) view;
            CharSequence charSequence = a9Var.e;
            CharSequence charSequence2 = a9Var.f;
            y8Var.a.setText(charSequence);
            y8Var.b.setText(charSequence2);
            return;
        }
        if (i13 == 11) {
            y8 y8Var2 = (y8) view;
            y8Var2.a.setText(a9Var.e);
            y8Var2.b.setText((CharSequence) null);
            return;
        }
        if (i13 == 5) {
            try {
                ((gw0) view).b.getImageReceiver().startAnimation();
                return;
            } catch (Exception unused) {
                return;
            }
        }
        if (i13 == 6) {
            org.telegram.ui.Cells.b9 b9Var = (org.telegram.ui.Cells.b9) view;
            if (a9Var.e == null) {
                b9Var.setFixedSize(12);
                b9Var.setText(null);
                return;
            } else {
                b9Var.setFixedSize(0);
                b9Var.setText(a9Var.e);
                return;
            }
        }
        if (i13 == 7) {
            int i16 = a9Var.c;
            if (i16 == 0) {
                ((org.telegram.ui.Cells.p8) view).j(a9Var.e, t9Var.x, z11);
                return;
            } else if (i16 == 1) {
                ((org.telegram.ui.Cells.p8) view).j(a9Var.e, t9Var.y, z11);
                return;
            } else {
                if (i16 == 2) {
                    ((org.telegram.ui.Cells.p8) view).j(a9Var.e, t9Var.w, z11);
                    return;
                }
                return;
            }
        }
        if (i13 == 9) {
            Drawable drawable = a9Var.d;
            if (drawable != null) {
                ((org.telegram.ui.Cells.p8) view).t(a9Var.e, drawable, z11);
                return;
            } else {
                ((org.telegram.ui.Cells.p8) view).o(a9Var.e, a9Var.f, false, z11);
                return;
            }
        }
        if (i13 == 8) {
            ((org.telegram.ui.Cells.m4) view).setText(a9Var.e);
            return;
        }
        if (i13 == 10) {
            i10 = ((org.telegram.ui.ActionBar.f3) t9Var).currentAccount;
            int i17 = (int) MessagesController.getInstance(i10).starsPaidMessageAmountMax;
            int[] a2 = org.telegram.ui.Cells.x7.a(i17, new int[]{0, 1, 10, 50, 100, 200, MediaDataController.MAX_LINKS_COUNT, 400, 500, MediaDataController.MAX_STYLE_RUNS_COUNT, 2500, 5000, 7500, 9000, 10000});
            int clamp = Utilities.clamp(t9Var.D, i17, 0);
            i3.i iVar = new i3.i(16);
            org.telegram.ui.Cells.w7 w7Var = new org.telegram.ui.Cells.w7();
            w7Var.c = a2;
            w7Var.d = 20;
            w7Var.e = iVar;
            ((org.telegram.ui.Cells.x7) view).d(clamp, w7Var, new i9(this, 0));
        }
    }

    @Override // f2.r0
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        View x7Var;
        org.telegram.ui.Cells.p8 p8Var;
        View view;
        Context context = this.d;
        if (i9 == -1) {
            x7Var = new m9(context);
        } else if (i9 == 0) {
            x7Var = new View(context);
            x7Var.setTag(35);
        } else if (i9 == 1) {
            x7Var = new View(context);
            x7Var.setTag(34);
        } else {
            org.telegram.ui.ActionBar.b6 b6Var = this.e;
            if (i9 == 3) {
                x7Var = new s9(context, b6Var);
            } else {
                if (i9 == 4) {
                    view = new y8(context, b6Var, true);
                } else if (i9 == 11) {
                    x7Var = new y8(context, b6Var, false);
                } else if (i9 == 8) {
                    x7Var = new org.telegram.ui.Cells.m4(context, b6Var);
                    x7Var.setBackgroundColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.h5, b6Var));
                } else if (i9 == 5) {
                    gw0 gw0Var = new gw0(context, null, 1, b6Var);
                    gw0Var.d.setText(LocaleController.getString(R.string.NoResult));
                    gw0Var.e.setText(LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitle2));
                    gw0Var.a.setTranslationY(AndroidUtilities.dp(24.0f));
                    view = gw0Var;
                } else if (i9 == 6) {
                    x7Var = new org.telegram.ui.Cells.b9(context, b6Var);
                    x7Var.setBackgroundColor(-15921907);
                } else {
                    if (i9 == 7) {
                        p8Var = new org.telegram.ui.Cells.p8(23, this.d, this.e, true, true);
                    } else if (i9 == 9) {
                        p8Var = new org.telegram.ui.Cells.p8(23, this.d, this.e, true, false);
                    } else {
                        x7Var = i9 == 10 ? new org.telegram.ui.Cells.x7(context, b6Var) : new an(context, 3);
                    }
                    x7Var = p8Var;
                }
                x7Var = view;
            }
        }
        return new ik0(x7Var);
    }
}
