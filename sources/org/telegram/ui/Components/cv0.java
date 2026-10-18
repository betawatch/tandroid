package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.messenger.SavedMessagesController;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class cv0 extends hm0 {
    public final Context c;
    public final SavedMessagesController d;
    public boolean h;
    public ku0 s;
    public final /* synthetic */ sv0 x;
    public final ArrayList e = new ArrayList();
    public final ArrayList f = new ArrayList();
    public final fr0 n = new fr0(this, 5);
    public final s4.t0 r = new s4.t0();
    public final s4.y v = new s4.y(new av0(this));
    public final HashSet w = new HashSet();

    public cv0(sv0 sv0Var, Context context) {
        this.x = sv0Var;
        this.c = context;
        SavedMessagesController savedMessagesController = sv0Var.v1.getMessagesController().getSavedMessagesController();
        this.d = savedMessagesController;
        if (sv0Var.m0()) {
            savedMessagesController.loadDialogs(false);
        }
        C(true);
        F(false);
    }

    @Override // org.telegram.ui.Components.hm0
    public final boolean D(s4.b1 b1Var) {
        return true;
    }

    public final void E(View view) {
        ArrayList arrayList;
        SavedMessagesController.SavedDialog savedDialog;
        if (view instanceof org.telegram.ui.Cells.r2) {
            org.telegram.ui.Cells.r2 r2Var = (org.telegram.ui.Cells.r2) view;
            long dialogId = r2Var.getDialogId();
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
            sv0 sv0Var = this.x;
            if (contains) {
                hashSet.remove(Long.valueOf(savedDialog.dialogId));
                if (hashSet.size() <= 0 && sv0Var.C1) {
                    sv0Var.d1(false);
                }
            } else {
                hashSet.add(Long.valueOf(savedDialog.dialogId));
                if (hashSet.size() > 0 && !sv0Var.C1) {
                    sv0Var.d1(true);
                    org.telegram.ui.ActionBar.u0 u0Var = sv0Var.u0;
                    if (u0Var != null) {
                        u0Var.setVisibility(8);
                    }
                    org.telegram.ui.ActionBar.u0 u0Var2 = sv0Var.t0;
                    if (u0Var2 != null) {
                        u0Var2.setVisibility(8);
                    }
                }
            }
            sv0Var.A0.a(hashSet.size(), true);
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
            org.telegram.ui.ActionBar.u0 u0Var3 = sv0Var.v0;
            if (u0Var3 != null) {
                u0Var3.setVisibility(z10 ? 8 : 0);
            }
            org.telegram.ui.ActionBar.u0 u0Var4 = sv0Var.w0;
            if (u0Var4 != null) {
                u0Var4.setVisibility(z10 ? 0 : 8);
            }
            r2Var.V(hashSet.contains(Long.valueOf(savedDialog.dialogId)), true);
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
        if (view instanceof org.telegram.ui.Cells.r2) {
            org.telegram.ui.Cells.r2 r2Var = (org.telegram.ui.Cells.r2) view;
            ArrayList arrayList = this.f;
            SavedMessagesController.SavedDialog savedDialog = (SavedMessagesController.SavedDialog) arrayList.get(i10);
            r2Var.W(savedDialog.dialogId, savedDialog.message, savedDialog.getDate(), false, false);
            r2Var.s0 = true;
            r2Var.V(this.w.contains(Long.valueOf(savedDialog.dialogId)), false);
            r2Var.s2 = i10 + 1 < arrayList.size();
        }
    }

    @Override // s4.g0
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        bv0 bv0Var = new bv0(this, this.c);
        sv0 sv0Var = this.x;
        bv0Var.setDialogCellDelegate(sv0Var);
        bv0Var.r0 = true;
        bv0Var.setBackgroundColor(sv0Var.i0(org.telegram.ui.ActionBar.h6.d6));
        return new sl0(bv0Var);
    }
}
