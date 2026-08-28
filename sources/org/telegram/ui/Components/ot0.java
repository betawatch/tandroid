package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.messenger.SavedMessagesController;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class ot0 extends vk0 {
    public final Context c;
    public final SavedMessagesController d;
    public boolean h;
    public ws0 s;
    public final /* synthetic */ eu0 x;
    public final ArrayList e = new ArrayList();
    public final ArrayList f = new ArrayList();
    public final tp0 n = new tp0(this, 5);
    public final f2.f1 r = new f2.f1();
    public final f2.h0 v = new f2.h0(new mt0(this));
    public final HashSet w = new HashSet();

    public ot0(eu0 eu0Var, Context context) {
        this.x = eu0Var;
        this.c = context;
        SavedMessagesController savedMessagesController = eu0Var.r1.getMessagesController().getSavedMessagesController();
        this.d = savedMessagesController;
        if (eu0Var.l0()) {
            savedMessagesController.loadDialogs(false);
        }
        C(true);
        F(false);
    }

    @Override // org.telegram.ui.Components.vk0
    public final boolean D(f2.q1 q1Var) {
        return true;
    }

    public final void E(View view) {
        ArrayList arrayList;
        SavedMessagesController.SavedDialog savedDialog;
        if (view instanceof org.telegram.ui.Cells.r2) {
            org.telegram.ui.Cells.r2 r2Var = (org.telegram.ui.Cells.r2) view;
            long dialogId = r2Var.getDialogId();
            int i9 = 0;
            while (true) {
                arrayList = this.f;
                if (i9 >= arrayList.size()) {
                    savedDialog = null;
                    break;
                } else {
                    if (((SavedMessagesController.SavedDialog) arrayList.get(i9)).dialogId == dialogId) {
                        savedDialog = (SavedMessagesController.SavedDialog) arrayList.get(i9);
                        break;
                    }
                    i9++;
                }
            }
            if (savedDialog == null) {
                return;
            }
            Long valueOf = Long.valueOf(savedDialog.dialogId);
            HashSet hashSet = this.w;
            boolean contains = hashSet.contains(valueOf);
            eu0 eu0Var = this.x;
            if (contains) {
                hashSet.remove(Long.valueOf(savedDialog.dialogId));
                if (hashSet.size() <= 0 && eu0Var.y1) {
                    eu0Var.b1(false);
                }
            } else {
                hashSet.add(Long.valueOf(savedDialog.dialogId));
                if (hashSet.size() > 0 && !eu0Var.y1) {
                    eu0Var.b1(true);
                    org.telegram.ui.ActionBar.w0 w0Var = eu0Var.q0;
                    if (w0Var != null) {
                        w0Var.setVisibility(8);
                    }
                    org.telegram.ui.ActionBar.w0 w0Var2 = eu0Var.p0;
                    if (w0Var2 != null) {
                        w0Var2.setVisibility(8);
                    }
                }
            }
            eu0Var.w0.a(hashSet.size(), true);
            boolean z10 = hashSet.size() > 0;
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                long longValue = ((Long) it.next()).longValue();
                int i10 = 0;
                while (true) {
                    if (i10 >= arrayList.size()) {
                        break;
                    }
                    SavedMessagesController.SavedDialog savedDialog2 = (SavedMessagesController.SavedDialog) arrayList.get(i10);
                    if (savedDialog2.dialogId != longValue) {
                        i10++;
                    } else if (!savedDialog2.pinned) {
                        z10 = false;
                    }
                }
                if (!z10) {
                    break;
                }
            }
            org.telegram.ui.ActionBar.w0 w0Var3 = eu0Var.r0;
            if (w0Var3 != null) {
                w0Var3.setVisibility(z10 ? 8 : 0);
            }
            org.telegram.ui.ActionBar.w0 w0Var4 = eu0Var.s0;
            if (w0Var4 != null) {
                w0Var4.setVisibility(z10 ? 0 : 8);
            }
            r2Var.U(hashSet.contains(Long.valueOf(savedDialog.dialogId)), true);
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

    @Override // f2.r0
    public final int h() {
        return this.f.size();
    }

    @Override // f2.r0
    public final long i(int i9) {
        if (i9 >= 0) {
            ArrayList arrayList = this.f;
            if (i9 < arrayList.size()) {
                return ((SavedMessagesController.SavedDialog) arrayList.get(i9)).dialogId;
            }
        }
        return i9;
    }

    @Override // f2.r0
    public final int j(int i9) {
        return 13;
    }

    @Override // f2.r0
    public final void v(f2.q1 q1Var, int i9) {
        View view = q1Var.a;
        if (view instanceof org.telegram.ui.Cells.r2) {
            org.telegram.ui.Cells.r2 r2Var = (org.telegram.ui.Cells.r2) view;
            ArrayList arrayList = this.f;
            SavedMessagesController.SavedDialog savedDialog = (SavedMessagesController.SavedDialog) arrayList.get(i9);
            r2Var.V(savedDialog.dialogId, savedDialog.message, savedDialog.getDate(), false, false);
            r2Var.o0 = true;
            r2Var.U(this.w.contains(Long.valueOf(savedDialog.dialogId)), false);
            r2Var.o2 = i9 + 1 < arrayList.size();
        }
    }

    @Override // f2.r0
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        nt0 nt0Var = new nt0(this, this.c);
        eu0 eu0Var = this.x;
        nt0Var.setDialogCellDelegate(eu0Var);
        nt0Var.n0 = true;
        nt0Var.setBackgroundColor(eu0Var.h0(org.telegram.ui.ActionBar.f6.d6));
        return new ik0(nt0Var);
    }
}
