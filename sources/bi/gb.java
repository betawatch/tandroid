package bi;

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
import org.telegram.ui.Components.fl0;
import org.telegram.ui.Components.jx0;
import org.telegram.ui.Components.qn;
import org.telegram.ui.Components.vl0;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final class gb extends ng.b {
    public final Context d;
    public final org.telegram.ui.ActionBar.f6 e;
    public final db f;
    public vl0 h;
    public final /* synthetic */ kb n;

    public gb(kb kbVar, Context context, org.telegram.ui.ActionBar.f6 f6Var, db dbVar, ra raVar) {
        this.n = kbVar;
        this.d = context;
        this.e = f6Var;
        this.f = dbVar;
    }

    @Override // org.telegram.ui.Components.ul0
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
        kb kbVar = this.n;
        ArrayList arrayList = kbVar.L;
        if (arrayList == null || i10 < 0 || i10 >= arrayList.size()) {
            return -1;
        }
        return ((pa) kbVar.L.get(i10)).a;
    }

    @Override // s4.h0
    public final void v(s4.c1 c1Var, int i10) {
        int i11;
        int i12;
        int i13;
        kb kbVar = this.n;
        rb rbVar = kbVar.W;
        ArrayList arrayList = kbVar.L;
        if (arrayList == null || i10 < 0 || i10 >= arrayList.size()) {
            return;
        }
        pa paVar = (pa) arrayList.get(i10);
        int i14 = c1Var.f;
        View view = c1Var.a;
        boolean z10 = true;
        int i15 = i10 + 1;
        pa paVar2 = i15 < arrayList.size() ? (pa) arrayList.get(i15) : null;
        int i16 = 9;
        boolean z11 = paVar2 != null && ((i13 = paVar2.a) == i14 || (i13 == 9 && paVar2.q == 1));
        if (i14 == 3) {
            qb qbVar = (qb) view;
            boolean z12 = paVar.n;
            qbVar.d(z12, !z12);
            int i17 = paVar.i;
            float f7 = 1.0f;
            if (i17 > 0) {
                qbVar.e(i17, paVar.g, paVar.j);
                qbVar.b(1.0f, false);
            } else {
                TLRPC.User user = paVar.g;
                if (user != null) {
                    qbVar.setUser(user);
                    if (paVar.l && !paVar.k) {
                        f7 = 0.5f;
                    }
                    qbVar.b(f7, false);
                } else {
                    TLRPC.Chat chat = paVar.h;
                    if (chat != null) {
                        qbVar.a(rb.d1(rbVar, chat), chat);
                    }
                }
            }
            if (!paVar.k && !paVar.l) {
                z10 = false;
            }
            qbVar.c(z10, false);
            qbVar.setDivider(z11);
            qbVar.setRedCheckbox(paVar.m);
            qbVar.v = rbVar.F;
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
            if (paVar.o > 0) {
                vl0 vl0Var = this.h;
                i12 = Math.max(((vl0Var == null || vl0Var.getMeasuredHeight() <= 0) ? AndroidUtilities.displaySize.y : this.h.getMeasuredHeight() + kbVar.T) - paVar.o, AndroidUtilities.dp(120.0f));
                view.setTag(33);
            } else {
                i12 = paVar.p;
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
            na naVar = (na) view;
            CharSequence charSequence = paVar.e;
            CharSequence charSequence2 = paVar.f;
            naVar.a.setText(charSequence);
            naVar.b.setText(charSequence2);
            return;
        }
        if (i14 == 11) {
            na naVar2 = (na) view;
            naVar2.a.setText(paVar.e);
            naVar2.b.setText((CharSequence) null);
            return;
        }
        if (i14 == 5) {
            try {
                ((jx0) view).b.getImageReceiver().startAnimation();
                return;
            } catch (Exception unused) {
                return;
            }
        }
        if (i14 == 6) {
            org.telegram.ui.Cells.f9 f9Var = (org.telegram.ui.Cells.f9) view;
            if (paVar.e == null) {
                f9Var.setFixedSize(12);
                f9Var.setText(null);
                return;
            } else {
                f9Var.setFixedSize(0);
                f9Var.setText(paVar.e);
                return;
            }
        }
        if (i14 == 7) {
            int i18 = paVar.c;
            if (i18 == 0) {
                ((org.telegram.ui.Cells.s8) view).j(paVar.e, rbVar.x, z11);
                return;
            } else if (i18 == 1) {
                ((org.telegram.ui.Cells.s8) view).j(paVar.e, rbVar.y, z11);
                return;
            } else {
                if (i18 == 2) {
                    ((org.telegram.ui.Cells.s8) view).j(paVar.e, rbVar.w, z11);
                    return;
                }
                return;
            }
        }
        if (i14 == 9) {
            Drawable drawable = paVar.d;
            if (drawable != null) {
                ((org.telegram.ui.Cells.s8) view).t(paVar.e, drawable, z11);
                return;
            } else {
                ((org.telegram.ui.Cells.s8) view).o(paVar.e, paVar.f, false, z11);
                return;
            }
        }
        if (i14 == 8) {
            ((org.telegram.ui.Cells.m4) view).setText(paVar.e);
            return;
        }
        if (i14 == 10) {
            i11 = ((org.telegram.ui.ActionBar.h3) rbVar).currentAccount;
            int i19 = (int) MessagesController.getInstance(i11).starsPaidMessageAmountMax;
            int[] a2 = org.telegram.ui.Cells.a8.a(i19, new int[]{0, 1, 10, 50, 100, 200, MediaDataController.MAX_LINKS_COUNT, 400, 500, MediaDataController.MAX_STYLE_RUNS_COUNT, 2500, 5000, 7500, 9000, 10000});
            int clamp = Utilities.clamp(rbVar.H, i19, 0);
            androidx.emoji2.text.w wVar = new androidx.emoji2.text.w(12);
            org.telegram.ui.Cells.z7 z7Var = new org.telegram.ui.Cells.z7();
            z7Var.c = a2;
            z7Var.d = 20;
            z7Var.e = wVar;
            ((org.telegram.ui.Cells.a8) view).d(clamp, z7Var, new ai.b(this, i16));
        }
    }

    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        View a8Var;
        org.telegram.ui.Cells.s8 s8Var;
        View view;
        Context context = this.d;
        if (i10 == -1) {
            a8Var = new jb(context);
        } else if (i10 == 0) {
            a8Var = new View(context);
            a8Var.setTag(35);
        } else if (i10 == 1) {
            a8Var = new View(context);
            a8Var.setTag(34);
        } else {
            org.telegram.ui.ActionBar.f6 f6Var = this.e;
            if (i10 == 3) {
                a8Var = new qb(context, f6Var);
            } else {
                if (i10 == 4) {
                    view = new na(context, f6Var, true);
                } else if (i10 == 11) {
                    a8Var = new na(context, f6Var, false);
                } else if (i10 == 8) {
                    a8Var = new org.telegram.ui.Cells.m4(context, f6Var);
                    a8Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.h5, f6Var));
                } else if (i10 == 5) {
                    jx0 jx0Var = new jx0(context, null, 1, f6Var);
                    jx0Var.d.setText(LocaleController.getString(R.string.NoResult));
                    jx0Var.e.setText(LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitle2));
                    jx0Var.a.setTranslationY(AndroidUtilities.dp(24.0f));
                    view = jx0Var;
                } else if (i10 == 6) {
                    a8Var = new org.telegram.ui.Cells.f9(context, f6Var);
                    a8Var.setBackgroundColor(-15921907);
                } else {
                    if (i10 == 7) {
                        s8Var = new org.telegram.ui.Cells.s8(23, this.d, this.e, true, true);
                    } else if (i10 == 9) {
                        s8Var = new org.telegram.ui.Cells.s8(23, this.d, this.e, true, false);
                    } else {
                        a8Var = i10 == 10 ? new org.telegram.ui.Cells.a8(context, f6Var) : new qn(context, 1);
                    }
                    a8Var = s8Var;
                }
                a8Var = view;
            }
        }
        return new fl0(a8Var);
    }
}
