package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.messenger.SavedMessagesController;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class hv0 extends lm0 {
    public final Context c;
    public final SavedMessagesController d;
    public boolean h;
    public pu0 s;
    public final /* synthetic */ xv0 x;
    public final ArrayList e = new ArrayList();
    public final ArrayList f = new ArrayList();
    public final kr0 n = new kr0(this, 6);
    public final s4.t0 r = new s4.t0();
    public final s4.y v = new s4.y(new fv0(this));
    public final HashSet w = new HashSet();

    public hv0(xv0 xv0Var, Context context) {
        this.x = xv0Var;
        this.c = context;
        SavedMessagesController savedMessagesController = xv0Var.v1.getMessagesController().getSavedMessagesController();
        this.d = savedMessagesController;
        if (xv0Var.l0()) {
            savedMessagesController.loadDialogs(false);
        }
        C(true);
        F(false);
    }

    @Override // org.telegram.ui.Components.lm0
    public final boolean D(s4.b1 b1Var) {
        return true;
    }

    public final void E(View view) {
        ArrayList arrayList;
        SavedMessagesController.SavedDialog savedDialog;
        if (view instanceof org.telegram.ui.Cells.s2) {
            org.telegram.ui.Cells.s2 s2Var = (org.telegram.ui.Cells.s2) view;
            long dialogId = s2Var.getDialogId();
            int i10 = 0;
            while (true) {
                arrayList = this.f;
                if (i10 >= arrayList.size()) {
                    savedDialog = null;
                    break;
                } else {
                    if (((SavedMessagesController.SavedDialog) arrayList.get(i10)).dialogId == dialogId) {
                        savedDialog = (SavedMessagesController.SavedDialog) arrayList.get(i10);
                        break;
                    }
                    i10++;
                }
            }
            if (savedDialog == null) {
                return;
            }
            Long valueOf = Long.valueOf(savedDialog.dialogId);
            HashSet hashSet = this.w;
            boolean contains = hashSet.contains(valueOf);
            xv0 xv0Var = this.x;
            if (contains) {
                hashSet.remove(Long.valueOf(savedDialog.dialogId));
                if (hashSet.size() <= 0 && xv0Var.C1) {
                    xv0Var.c1(false);
                }
            } else {
                hashSet.add(Long.valueOf(savedDialog.dialogId));
                if (hashSet.size() > 0 && !xv0Var.C1) {
                    xv0Var.c1(true);
                    org.telegram.ui.ActionBar.u0 u0Var = xv0Var.u0;
                    if (u0Var != null) {
                        u0Var.setVisibility(8);
                    }
                    org.telegram.ui.ActionBar.u0 u0Var2 = xv0Var.t0;
                    if (u0Var2 != null) {
                        u0Var2.setVisibility(8);
                    }
                }
            }
            xv0Var.A0.a(hashSet.size(), true);
            boolean z10 = hashSet.size() > 0;
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                long longValue = ((Long) it.next()).longValue();
                int i11 = 0;
                while (true) {
                    if (i11 >= arrayList.size()) {
                        break;
                    }
                    SavedMessagesController.SavedDialog savedDialog2 = (SavedMessagesController.SavedDialog) arrayList.get(i11);
                    if (savedDialog2.dialogId != longValue) {
                        i11++;
                    } else if (!savedDialog2.pinned) {
                        z10 = false;
                    }
                }
                if (!z10) {
                    break;
                }
            }
            org.telegram.ui.ActionBar.u0 u0Var3 = xv0Var.v0;
            if (u0Var3 != null) {
                u0Var3.setVisibility(z10 ? 8 : 0);
            }
            org.telegram.ui.ActionBar.u0 u0Var4 = xv0Var.w0;
            if (u0Var4 != null) {
                u0Var4.setVisibility(z10 ? 0 : 8);
            }
            s2Var.V(hashSet.contains(Long.valueOf(savedDialog.dialogId)), true);
        }
    }

    public final void F(boolean z10) {
        ArrayList arrayList = this.e;
        arrayList.clear();
        ArrayList arrayList2 = this.f;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        arrayList2.addAll(this.d.allDialogs);
        if (z10) {
            l();
        }
    }

    @Override // s4.g0
    public final int h() {
        return this.f.size();
    }

    @Override // s4.g0
    public final long i(int i10) {
        if (i10 >= 0) {
            ArrayList arrayList = this.f;
            if (i10 < arrayList.size()) {
                return ((SavedMessagesController.SavedDialog) arrayList.get(i10)).dialogId;
            }
        }
        return i10;
    }

    @Override // s4.g0
    public final int j(int i10) {
        return 13;
    }

    @Override // s4.g0
    public final void v(s4.b1 b1Var, int i10) {
        View view = b1Var.a;
        if (view instanceof org.telegram.ui.Cells.s2) {
            org.telegram.ui.Cells.s2 s2Var = (org.telegram.ui.Cells.s2) view;
            ArrayList arrayList = this.f;
            SavedMessagesController.SavedDialog savedDialog = (SavedMessagesController.SavedDialog) arrayList.get(i10);
            s2Var.W(savedDialog.dialogId, savedDialog.message, savedDialog.getDate(), false, false);
            s2Var.s0 = true;
            s2Var.V(this.w.contains(Long.valueOf(savedDialog.dialogId)), false);
            s2Var.s2 = i10 + 1 < arrayList.size();
        }
    }

    @Override // s4.g0
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        gv0 gv0Var = new gv0(this, this.c);
        xv0 xv0Var = this.x;
        gv0Var.setDialogCellDelegate(xv0Var);
        gv0Var.r0 = true;
        gv0Var.setBackgroundColor(xv0Var.h0(org.telegram.ui.ActionBar.g6.d6));
        return new wl0(gv0Var);
    }
}
