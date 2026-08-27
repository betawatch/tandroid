package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.messenger.SavedMessagesController;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class qt0 extends yk0 {
    public final Context c;
    public final SavedMessagesController d;
    public boolean h;
    public ys0 s;
    public final /* synthetic */ hu0 x;
    public final ArrayList e = new ArrayList();
    public final ArrayList f = new ArrayList();
    public final up0 n = new up0(this, 5);
    public final f2.d1 r = new f2.d1();
    public final f2.f0 v = new f2.f0(new ot0(this));
    public final HashSet w = new HashSet();

    public qt0(hu0 hu0Var, Context context) {
        this.x = hu0Var;
        this.c = context;
        SavedMessagesController savedMessagesController = hu0Var.r1.getMessagesController().getSavedMessagesController();
        this.d = savedMessagesController;
        if (hu0Var.l0()) {
            savedMessagesController.loadDialogs(false);
        }
        C(true);
        F(false);
    }

    @Override // org.telegram.ui.Components.yk0
    public final boolean D(f2.o1 o1Var) {
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
            hu0 hu0Var = this.x;
            if (contains) {
                hashSet.remove(Long.valueOf(savedDialog.dialogId));
                if (hashSet.size() <= 0 && hu0Var.y1) {
                    hu0Var.b1(false);
                }
            } else {
                hashSet.add(Long.valueOf(savedDialog.dialogId));
                if (hashSet.size() > 0 && !hu0Var.y1) {
                    hu0Var.b1(true);
                    org.telegram.ui.ActionBar.v0 v0Var = hu0Var.q0;
                    if (v0Var != null) {
                        v0Var.setVisibility(8);
                    }
                    org.telegram.ui.ActionBar.v0 v0Var2 = hu0Var.p0;
                    if (v0Var2 != null) {
                        v0Var2.setVisibility(8);
                    }
                }
            }
            hu0Var.w0.a(hashSet.size(), true);
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
            org.telegram.ui.ActionBar.v0 v0Var3 = hu0Var.r0;
            if (v0Var3 != null) {
                v0Var3.setVisibility(z10 ? 8 : 0);
            }
            org.telegram.ui.ActionBar.v0 v0Var4 = hu0Var.s0;
            if (v0Var4 != null) {
                v0Var4.setVisibility(z10 ? 0 : 8);
            }
            p2Var.V(hashSet.contains(Long.valueOf(savedDialog.dialogId)), true);
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

    @Override // f2.q0
    public final int h() {
        return this.f.size();
    }

    @Override // f2.q0
    public final long i(int i10) {
        if (i10 >= 0) {
            ArrayList arrayList = this.f;
            if (i10 < arrayList.size()) {
                return ((SavedMessagesController.SavedDialog) arrayList.get(i10)).dialogId;
            }
        }
        return i10;
    }

    @Override // f2.q0
    public final int j(int i10) {
        return 13;
    }

    @Override // f2.q0
    public final void v(f2.o1 o1Var, int i10) {
        View view = o1Var.a;
        if (view instanceof org.telegram.ui.Cells.p2) {
            org.telegram.ui.Cells.p2 p2Var = (org.telegram.ui.Cells.p2) view;
            ArrayList arrayList = this.f;
            SavedMessagesController.SavedDialog savedDialog = (SavedMessagesController.SavedDialog) arrayList.get(i10);
            p2Var.W(savedDialog.dialogId, savedDialog.message, savedDialog.getDate(), false, false);
            p2Var.o0 = true;
            p2Var.V(this.w.contains(Long.valueOf(savedDialog.dialogId)), false);
            p2Var.o2 = i10 + 1 < arrayList.size();
        }
    }

    @Override // f2.q0
    public final f2.o1 x(ViewGroup viewGroup, int i10) {
        pt0 pt0Var = new pt0(this, this.c);
        hu0 hu0Var = this.x;
        pt0Var.setDialogCellDelegate(hu0Var);
        pt0Var.n0 = true;
        pt0Var.setBackgroundColor(hu0Var.h0(org.telegram.ui.ActionBar.g6.d6));
        return new lk0(pt0Var);
    }
}
