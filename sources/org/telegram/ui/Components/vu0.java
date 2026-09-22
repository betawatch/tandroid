package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.messenger.SavedMessagesController;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class vu0 extends xl0 {
    public final Context c;
    public final SavedMessagesController d;
    public boolean h;
    public du0 s;
    public final /* synthetic */ lv0 x;
    public final ArrayList e = new ArrayList();
    public final ArrayList f = new ArrayList();
    public final yq0 n = new yq0(this, 6);
    public final s4.u0 r = new s4.u0();
    public final s4.y v = new s4.y(new tu0(this));
    public final HashSet w = new HashSet();

    public vu0(lv0 lv0Var, Context context) {
        this.x = lv0Var;
        this.c = context;
        SavedMessagesController savedMessagesController = lv0Var.v1.getMessagesController().getSavedMessagesController();
        this.d = savedMessagesController;
        if (lv0Var.l0()) {
            savedMessagesController.loadDialogs(false);
        }
        C(true);
        F(false);
    }

    @Override // org.telegram.ui.Components.xl0
    public final boolean D(s4.c1 c1Var) {
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
            lv0 lv0Var = this.x;
            if (contains) {
                hashSet.remove(Long.valueOf(savedDialog.dialogId));
                if (hashSet.size() <= 0 && lv0Var.C1) {
                    lv0Var.b1(false);
                }
            } else {
                hashSet.add(Long.valueOf(savedDialog.dialogId));
                if (hashSet.size() > 0 && !lv0Var.C1) {
                    lv0Var.b1(true);
                    org.telegram.ui.ActionBar.v0 v0Var = lv0Var.u0;
                    if (v0Var != null) {
                        v0Var.setVisibility(8);
                    }
                    org.telegram.ui.ActionBar.v0 v0Var2 = lv0Var.t0;
                    if (v0Var2 != null) {
                        v0Var2.setVisibility(8);
                    }
                }
            }
            lv0Var.A0.a(hashSet.size(), true);
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
            org.telegram.ui.ActionBar.v0 v0Var3 = lv0Var.v0;
            if (v0Var3 != null) {
                v0Var3.setVisibility(z10 ? 8 : 0);
            }
            org.telegram.ui.ActionBar.v0 v0Var4 = lv0Var.w0;
            if (v0Var4 != null) {
                v0Var4.setVisibility(z10 ? 0 : 8);
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

    @Override // s4.h0
    public final int h() {
        return this.f.size();
    }

    @Override // s4.h0
    public final long i(int i10) {
        if (i10 >= 0) {
            ArrayList arrayList = this.f;
            if (i10 < arrayList.size()) {
                return ((SavedMessagesController.SavedDialog) arrayList.get(i10)).dialogId;
            }
        }
        return i10;
    }

    @Override // s4.h0
    public final int j(int i10) {
        return 13;
    }

    @Override // s4.h0
    public final void v(s4.c1 c1Var, int i10) {
        View view = c1Var.a;
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

    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        uu0 uu0Var = new uu0(this, this.c);
        lv0 lv0Var = this.x;
        uu0Var.setDialogCellDelegate(lv0Var);
        uu0Var.r0 = true;
        uu0Var.setBackgroundColor(lv0Var.h0(org.telegram.ui.ActionBar.j6.d6));
        return new il0(uu0Var);
    }
}
