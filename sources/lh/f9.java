package lh;

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
import org.telegram.ui.Components.iw0;
import org.telegram.ui.Components.lk0;
import org.telegram.ui.Components.zk0;
import org.telegram.ui.Components.zm;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public final class f9 extends xf.b {
    public final Context d;
    public final org.telegram.ui.ActionBar.c6 e;
    public final c9 f;
    public zk0 h;
    public final /* synthetic */ k9 n;

    public f9(k9 k9Var, Context context, org.telegram.ui.ActionBar.c6 c6Var, c9 c9Var, jh.u3 u3Var) {
        this.n = k9Var;
        this.d = context;
        this.e = c6Var;
        this.f = c9Var;
    }

    @Override // org.telegram.ui.Components.yk0
    public final boolean D(f2.o1 o1Var) {
        int i10 = o1Var.f;
        return (i10 == 3 && this.n.S.B) || i10 == 7 || i10 == 9 || i10 == 10;
    }

    @Override // f2.q0
    public final int h() {
        ArrayList arrayList = this.n.H;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    @Override // f2.q0
    public final int j(int i10) {
        k9 k9Var = this.n;
        ArrayList arrayList = k9Var.H;
        if (arrayList == null || i10 < 0 || i10 >= arrayList.size()) {
            return -1;
        }
        return ((x8) k9Var.H.get(i10)).a;
    }

    @Override // f2.q0
    public final void v(f2.o1 o1Var, int i10) {
        int i11;
        int i12;
        int i13;
        k9 k9Var = this.n;
        q9 q9Var = k9Var.S;
        ArrayList arrayList = k9Var.H;
        if (arrayList == null || i10 < 0 || i10 >= arrayList.size()) {
            return;
        }
        x8 x8Var = (x8) arrayList.get(i10);
        int i14 = o1Var.f;
        View view = o1Var.a;
        boolean z10 = true;
        int i15 = i10 + 1;
        x8 x8Var2 = i15 < arrayList.size() ? (x8) arrayList.get(i15) : null;
        boolean z11 = x8Var2 != null && ((i13 = x8Var2.a) == i14 || (i13 == 9 && x8Var2.q == 1));
        if (i14 == 3) {
            p9 p9Var = (p9) view;
            boolean z12 = x8Var.n;
            p9Var.d(z12, !z12);
            int i16 = x8Var.i;
            float f10 = 1.0f;
            if (i16 > 0) {
                p9Var.e(i16, x8Var.g, x8Var.j);
                p9Var.b(1.0f, false);
            } else {
                TLRPC.User user = x8Var.g;
                if (user != null) {
                    p9Var.setUser(user);
                    if (x8Var.l && !x8Var.k) {
                        f10 = 0.5f;
                    }
                    p9Var.b(f10, false);
                } else {
                    TLRPC.Chat chat = x8Var.h;
                    if (chat != null) {
                        p9Var.a(q9.d1(q9Var, chat), chat);
                    }
                }
            }
            if (!x8Var.k && !x8Var.l) {
                z10 = false;
            }
            p9Var.c(z10, false);
            p9Var.setDivider(z11);
            p9Var.setRedCheckbox(x8Var.m);
            p9Var.v = q9Var.B;
            return;
        }
        if (i14 == 2) {
            return;
        }
        if (i14 == 0) {
            view.setLayoutParams(new f2.y0(-1, AndroidUtilities.dp(56.0f)));
            return;
        }
        if (i14 == -1) {
            if (x8Var.o > 0) {
                zk0 zk0Var = this.h;
                i12 = Math.max(((zk0Var == null || zk0Var.getMeasuredHeight() <= 0) ? AndroidUtilities.displaySize.y : this.h.getMeasuredHeight() + k9Var.P) - x8Var.o, AndroidUtilities.dp(120.0f));
                view.setTag(33);
            } else {
                i12 = x8Var.p;
                if (i12 >= 0) {
                    view.setTag(null);
                } else {
                    i12 = (int) (AndroidUtilities.displaySize.y * 0.3f);
                    view.setTag(33);
                }
            }
            view.setLayoutParams(new f2.y0(-1, i12));
            return;
        }
        if (i14 == 1) {
            view.setLayoutParams(new f2.y0(-1, Math.min(AndroidUtilities.dp(150.0f), this.f.F)));
            return;
        }
        if (i14 == 4) {
            v8 v8Var = (v8) view;
            CharSequence charSequence = x8Var.e;
            CharSequence charSequence2 = x8Var.f;
            v8Var.a.setText(charSequence);
            v8Var.b.setText(charSequence2);
            return;
        }
        if (i14 == 11) {
            v8 v8Var2 = (v8) view;
            v8Var2.a.setText(x8Var.e);
            v8Var2.b.setText((CharSequence) null);
            return;
        }
        if (i14 == 5) {
            try {
                ((iw0) view).b.getImageReceiver().startAnimation();
                return;
            } catch (Exception unused) {
                return;
            }
        }
        if (i14 == 6) {
            org.telegram.ui.Cells.x8 x8Var3 = (org.telegram.ui.Cells.x8) view;
            if (x8Var.e == null) {
                x8Var3.setFixedSize(12);
                x8Var3.setText(null);
                return;
            } else {
                x8Var3.setFixedSize(0);
                x8Var3.setText(x8Var.e);
                return;
            }
        }
        if (i14 == 7) {
            int i17 = x8Var.c;
            if (i17 == 0) {
                ((org.telegram.ui.Cells.l8) view).j(x8Var.e, q9Var.x, z11);
                return;
            } else if (i17 == 1) {
                ((org.telegram.ui.Cells.l8) view).j(x8Var.e, q9Var.y, z11);
                return;
            } else {
                if (i17 == 2) {
                    ((org.telegram.ui.Cells.l8) view).j(x8Var.e, q9Var.w, z11);
                    return;
                }
                return;
            }
        }
        if (i14 == 9) {
            Drawable drawable = x8Var.d;
            if (drawable != null) {
                ((org.telegram.ui.Cells.l8) view).t(x8Var.e, drawable, z11);
                return;
            } else {
                ((org.telegram.ui.Cells.l8) view).o(x8Var.e, x8Var.f, false, z11);
                return;
            }
        }
        if (i14 == 8) {
            ((org.telegram.ui.Cells.j4) view).setText(x8Var.e);
            return;
        }
        if (i14 == 10) {
            i11 = ((org.telegram.ui.ActionBar.e3) q9Var).currentAccount;
            int i18 = (int) MessagesController.getInstance(i11).starsPaidMessageAmountMax;
            int[] a2 = org.telegram.ui.Cells.u7.a(i18, new int[]{0, 1, 10, 50, 100, 200, MediaDataController.MAX_LINKS_COUNT, 400, 500, MediaDataController.MAX_STYLE_RUNS_COUNT, 2500, 5000, 7500, 9000, 10000});
            int clamp = Utilities.clamp(q9Var.D, i18, 0);
            ia.l lVar = new ia.l(23);
            org.telegram.ui.Cells.t7 t7Var = new org.telegram.ui.Cells.t7();
            t7Var.c = a2;
            t7Var.d = 20;
            t7Var.e = lVar;
            ((org.telegram.ui.Cells.u7) view).d(clamp, t7Var, new n6(this, 2));
        }
    }

    @Override // f2.q0
    public final f2.o1 x(ViewGroup viewGroup, int i10) {
        View u7Var;
        org.telegram.ui.Cells.l8 l8Var;
        View view;
        Context context = this.d;
        if (i10 == -1) {
            u7Var = new j9(context);
        } else if (i10 == 0) {
            u7Var = new View(context);
            u7Var.setTag(35);
        } else if (i10 == 1) {
            u7Var = new View(context);
            u7Var.setTag(34);
        } else {
            org.telegram.ui.ActionBar.c6 c6Var = this.e;
            if (i10 == 3) {
                u7Var = new p9(context, c6Var);
            } else {
                if (i10 == 4) {
                    view = new v8(context, c6Var, true);
                } else if (i10 == 11) {
                    u7Var = new v8(context, c6Var, false);
                } else if (i10 == 8) {
                    u7Var = new org.telegram.ui.Cells.j4(context, c6Var);
                    u7Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.h5, c6Var));
                } else if (i10 == 5) {
                    iw0 iw0Var = new iw0(context, null, 1, c6Var);
                    iw0Var.d.setText(LocaleController.getString(R.string.NoResult));
                    iw0Var.e.setText(LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitle2));
                    iw0Var.a.setTranslationY(AndroidUtilities.dp(24.0f));
                    view = iw0Var;
                } else if (i10 == 6) {
                    u7Var = new org.telegram.ui.Cells.x8(context, c6Var);
                    u7Var.setBackgroundColor(-15921907);
                } else {
                    if (i10 == 7) {
                        l8Var = new org.telegram.ui.Cells.l8(23, this.d, this.e, true, true);
                    } else if (i10 == 9) {
                        l8Var = new org.telegram.ui.Cells.l8(23, this.d, this.e, true, false);
                    } else {
                        u7Var = i10 == 10 ? new org.telegram.ui.Cells.u7(context, c6Var) : new zm(context, 5);
                    }
                    u7Var = l8Var;
                }
                u7Var = view;
            }
        }
        return new lk0(u7Var);
    }
}
