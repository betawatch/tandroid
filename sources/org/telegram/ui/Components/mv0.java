package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.messenger.SavedMessagesController;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class mv0 extends mm0 {
    public final Context c;
    public final SavedMessagesController d;
    public boolean h;
    public tu0 s;
    public final /* synthetic */ bw0 x;
    public final ArrayList e = new ArrayList();
    public final ArrayList f = new ArrayList();
    public final np0 n = new np0(this, 9);
    public final s4.w0 r = new s4.w0();
    public final s4.z v = new s4.z(new kv0(this));
    public final HashSet w = new HashSet();

    public mv0(bw0 bw0Var, Context context) {
        this.x = bw0Var;
        this.c = context;
        SavedMessagesController savedMessagesController = bw0Var.x1.getMessagesController().getSavedMessagesController();
        this.d = savedMessagesController;
        if (bw0Var.u0()) {
            savedMessagesController.loadDialogs(false);
        }
        C(true);
        F(false);
    }

    @Override // org.telegram.ui.Components.mm0
    public final boolean D(s4.e1 e1Var) {
        return true;
    }

    public final void E(View view) {
        ArrayList arrayList;
        SavedMessagesController.SavedDialog savedDialog;
        if (view instanceof org.telegram.ui.Cells.p2) {
            org.telegram.ui.Cells.p2 p2Var = (org.telegram.ui.Cells.p2) view;
            long dialogId = p2Var.getDialogId();
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
            bw0 bw0Var = this.x;
            if (contains) {
                hashSet.remove(Long.valueOf(savedDialog.dialogId));
                if (hashSet.size() <= 0 && bw0Var.E1) {
                    bw0Var.k1(false);
                }
            } else {
                hashSet.add(Long.valueOf(savedDialog.dialogId));
                if (hashSet.size() > 0 && !bw0Var.E1) {
                    bw0Var.k1(true);
                    org.telegram.ui.ActionBar.w0 w0Var = bw0Var.w0;
                    if (w0Var != null) {
                        w0Var.setVisibility(8);
                    }
                    org.telegram.ui.ActionBar.w0 w0Var2 = bw0Var.v0;
                    if (w0Var2 != null) {
                        w0Var2.setVisibility(8);
                    }
                }
            }
            bw0Var.i1(hashSet.size(), true);
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
            org.telegram.ui.ActionBar.w0 w0Var3 = bw0Var.x0;
            if (w0Var3 != null) {
                w0Var3.setVisibility(z10 ? 8 : 0);
            }
            org.telegram.ui.ActionBar.w0 w0Var4 = bw0Var.y0;
            if (w0Var4 != null) {
                w0Var4.setVisibility(z10 ? 0 : 8);
            }
            p2Var.U(hashSet.contains(Long.valueOf(savedDialog.dialogId)), true);
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
    public final void v(s4.e1 e1Var, int i10) {
        View view = e1Var.a;
        if (view instanceof org.telegram.ui.Cells.p2) {
            org.telegram.ui.Cells.p2 p2Var = (org.telegram.ui.Cells.p2) view;
            ArrayList arrayList = this.f;
            SavedMessagesController.SavedDialog savedDialog = (SavedMessagesController.SavedDialog) arrayList.get(i10);
            p2Var.V(savedDialog.dialogId, savedDialog.message, savedDialog.getDate(), false, false);
            p2Var.s0 = true;
            p2Var.U(this.w.contains(Long.valueOf(savedDialog.dialogId)), false);
            p2Var.s2 = i10 + 1 < arrayList.size();
        }
    }

    @Override // s4.h0
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        lv0 lv0Var = new lv0(this, this.c);
        bw0 bw0Var = this.x;
        lv0Var.setDialogCellDelegate(bw0Var);
        lv0Var.r0 = true;
        org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.d6, lv0Var, bw0Var.H1);
        return new wl0(lv0Var);
    }
}
