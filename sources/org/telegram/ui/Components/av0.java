package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.messenger.SavedMessagesController;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final class av0 extends yl0 {
    public final Context c;
    public final SavedMessagesController d;
    public boolean h;
    public iu0 s;
    public final /* synthetic */ qv0 x;
    public final ArrayList e = new ArrayList();
    public final ArrayList f = new ArrayList();
    public final gq0 n = new gq0(this, 7);
    public final s4.u0 r = new s4.u0();
    public final s4.y v = new s4.y(new yu0(this));
    public final HashSet w = new HashSet();

    public av0(qv0 qv0Var, Context context) {
        this.x = qv0Var;
        this.c = context;
        SavedMessagesController savedMessagesController = qv0Var.v1.getMessagesController().getSavedMessagesController();
        this.d = savedMessagesController;
        if (qv0Var.l0()) {
            savedMessagesController.loadDialogs(false);
        }
        C(true);
        F(false);
    }

    @Override // org.telegram.ui.Components.yl0
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
            qv0 qv0Var = this.x;
            if (contains) {
                hashSet.remove(Long.valueOf(savedDialog.dialogId));
                if (hashSet.size() <= 0 && qv0Var.C1) {
                    qv0Var.b1(false);
                }
            } else {
                hashSet.add(Long.valueOf(savedDialog.dialogId));
                if (hashSet.size() > 0 && !qv0Var.C1) {
                    qv0Var.b1(true);
                    org.telegram.ui.ActionBar.v0 v0Var = qv0Var.u0;
                    if (v0Var != null) {
                        v0Var.setVisibility(8);
                    }
                    org.telegram.ui.ActionBar.v0 v0Var2 = qv0Var.t0;
                    if (v0Var2 != null) {
                        v0Var2.setVisibility(8);
                    }
                }
            }
            qv0Var.A0.a(hashSet.size(), true);
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
            org.telegram.ui.ActionBar.v0 v0Var3 = qv0Var.v0;
            if (v0Var3 != null) {
                v0Var3.setVisibility(z10 ? 8 : 0);
            }
            org.telegram.ui.ActionBar.v0 v0Var4 = qv0Var.w0;
            if (v0Var4 != null) {
                v0Var4.setVisibility(z10 ? 0 : 8);
            }
            s2Var.T(hashSet.contains(Long.valueOf(savedDialog.dialogId)), true);
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
            s2Var.U(savedDialog.dialogId, savedDialog.message, savedDialog.getDate(), false, false);
            s2Var.s0 = true;
            s2Var.T(this.w.contains(Long.valueOf(savedDialog.dialogId)), false);
            s2Var.s2 = i10 + 1 < arrayList.size();
        }
    }

    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        zu0 zu0Var = new zu0(this, this.c);
        qv0 qv0Var = this.x;
        zu0Var.setDialogCellDelegate(qv0Var);
        zu0Var.r0 = true;
        zu0Var.setBackgroundColor(qv0Var.h0(org.telegram.ui.ActionBar.i6.d6));
        return new il0(zu0Var);
    }
}
