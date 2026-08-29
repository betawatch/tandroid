package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.messenger.SavedMessagesController;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class zt0 extends il0 {
    public final Context c;
    public final SavedMessagesController d;
    public boolean h;
    public ht0 s;
    public final /* synthetic */ qu0 x;
    public final ArrayList e = new ArrayList();
    public final ArrayList f = new ArrayList();
    public final fq0 n = new fq0(this, 5);
    public final f2.c1 r = new f2.c1();
    public final f2.e0 v = new f2.e0(new xt0(this));
    public final HashSet w = new HashSet();

    public zt0(qu0 qu0Var, Context context) {
        this.x = qu0Var;
        this.c = context;
        SavedMessagesController savedMessagesController = qu0Var.r1.getMessagesController().getSavedMessagesController();
        this.d = savedMessagesController;
        if (qu0Var.l0()) {
            savedMessagesController.loadDialogs(false);
        }
        C(true);
        F(false);
    }

    @Override // org.telegram.ui.Components.il0
    public final boolean D(f2.n1 n1Var) {
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
            qu0 qu0Var = this.x;
            if (contains) {
                hashSet.remove(Long.valueOf(savedDialog.dialogId));
                if (hashSet.size() <= 0 && qu0Var.y1) {
                    qu0Var.b1(false);
                }
            } else {
                hashSet.add(Long.valueOf(savedDialog.dialogId));
                if (hashSet.size() > 0 && !qu0Var.y1) {
                    qu0Var.b1(true);
                    org.telegram.ui.ActionBar.w0 w0Var = qu0Var.q0;
                    if (w0Var != null) {
                        w0Var.setVisibility(8);
                    }
                    org.telegram.ui.ActionBar.w0 w0Var2 = qu0Var.p0;
                    if (w0Var2 != null) {
                        w0Var2.setVisibility(8);
                    }
                }
            }
            qu0Var.w0.a(hashSet.size(), true);
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
            org.telegram.ui.ActionBar.w0 w0Var3 = qu0Var.r0;
            if (w0Var3 != null) {
                w0Var3.setVisibility(z10 ? 8 : 0);
            }
            org.telegram.ui.ActionBar.w0 w0Var4 = qu0Var.s0;
            if (w0Var4 != null) {
                w0Var4.setVisibility(z10 ? 0 : 8);
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

    @Override // f2.p0
    public final int h() {
        return this.f.size();
    }

    @Override // f2.p0
    public final long i(int i10) {
        if (i10 >= 0) {
            ArrayList arrayList = this.f;
            if (i10 < arrayList.size()) {
                return ((SavedMessagesController.SavedDialog) arrayList.get(i10)).dialogId;
            }
        }
        return i10;
    }

    @Override // f2.p0
    public final int j(int i10) {
        return 13;
    }

    @Override // f2.p0
    public final void v(f2.n1 n1Var, int i10) {
        View view = n1Var.a;
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

    @Override // f2.p0
    public final f2.n1 x(ViewGroup viewGroup, int i10) {
        yt0 yt0Var = new yt0(this, this.c);
        qu0 qu0Var = this.x;
        yt0Var.setDialogCellDelegate(qu0Var);
        yt0Var.n0 = true;
        yt0Var.setBackgroundColor(qu0Var.h0(org.telegram.ui.ActionBar.g6.d6));
        return new vk0(yt0Var);
    }
}
