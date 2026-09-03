package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.messenger.SavedMessagesController;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class hu0 extends ql0 {
    public final Context c;
    public final SavedMessagesController d;
    public boolean h;
    public pt0 s;
    public final /* synthetic */ yu0 x;
    public final ArrayList e = new ArrayList();
    public final ArrayList f = new ArrayList();
    public final nq0 n = new nq0(this, 5);
    public final f2.b1 r = new f2.b1();
    public final f2.e0 v = new f2.e0(new fu0(this));
    public final HashSet w = new HashSet();

    public hu0(yu0 yu0Var, Context context) {
        this.x = yu0Var;
        this.c = context;
        SavedMessagesController savedMessagesController = yu0Var.s1.getMessagesController().getSavedMessagesController();
        this.d = savedMessagesController;
        if (yu0Var.l0()) {
            savedMessagesController.loadDialogs(false);
        }
        C(true);
        F(false);
    }

    @Override // org.telegram.ui.Components.ql0
    public final boolean D(f2.l1 l1Var) {
        return true;
    }

    public final void E(View view) {
        ArrayList arrayList;
        SavedMessagesController.SavedDialog savedDialog;
        if (view instanceof org.telegram.ui.Cells.q2) {
            org.telegram.ui.Cells.q2 q2Var = (org.telegram.ui.Cells.q2) view;
            long dialogId = q2Var.getDialogId();
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
            yu0 yu0Var = this.x;
            if (contains) {
                hashSet.remove(Long.valueOf(savedDialog.dialogId));
                if (hashSet.size() <= 0 && yu0Var.z1) {
                    yu0Var.b1(false);
                }
            } else {
                hashSet.add(Long.valueOf(savedDialog.dialogId));
                if (hashSet.size() > 0 && !yu0Var.z1) {
                    yu0Var.b1(true);
                    org.telegram.ui.ActionBar.w0 w0Var = yu0Var.r0;
                    if (w0Var != null) {
                        w0Var.setVisibility(8);
                    }
                    org.telegram.ui.ActionBar.w0 w0Var2 = yu0Var.q0;
                    if (w0Var2 != null) {
                        w0Var2.setVisibility(8);
                    }
                }
            }
            yu0Var.x0.a(hashSet.size(), true);
            boolean z4 = hashSet.size() > 0;
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
                        z4 = false;
                    }
                }
                if (!z4) {
                    break;
                }
            }
            org.telegram.ui.ActionBar.w0 w0Var3 = yu0Var.s0;
            if (w0Var3 != null) {
                w0Var3.setVisibility(z4 ? 8 : 0);
            }
            org.telegram.ui.ActionBar.w0 w0Var4 = yu0Var.t0;
            if (w0Var4 != null) {
                w0Var4.setVisibility(z4 ? 0 : 8);
            }
            q2Var.V(hashSet.contains(Long.valueOf(savedDialog.dialogId)), true);
        }
    }

    public final void F(boolean z4) {
        ArrayList arrayList = this.e;
        arrayList.clear();
        ArrayList arrayList2 = this.f;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        arrayList2.addAll(this.d.allDialogs);
        if (z4) {
            l();
        }
    }

    @Override // f2.o0
    public final int h() {
        return this.f.size();
    }

    @Override // f2.o0
    public final long i(int i10) {
        if (i10 >= 0) {
            ArrayList arrayList = this.f;
            if (i10 < arrayList.size()) {
                return ((SavedMessagesController.SavedDialog) arrayList.get(i10)).dialogId;
            }
        }
        return i10;
    }

    @Override // f2.o0
    public final int j(int i10) {
        return 13;
    }

    @Override // f2.o0
    public final void v(f2.l1 l1Var, int i10) {
        View view = l1Var.a;
        if (view instanceof org.telegram.ui.Cells.q2) {
            org.telegram.ui.Cells.q2 q2Var = (org.telegram.ui.Cells.q2) view;
            ArrayList arrayList = this.f;
            SavedMessagesController.SavedDialog savedDialog = (SavedMessagesController.SavedDialog) arrayList.get(i10);
            q2Var.W(savedDialog.dialogId, savedDialog.message, savedDialog.getDate(), false, false);
            q2Var.p0 = true;
            q2Var.V(this.w.contains(Long.valueOf(savedDialog.dialogId)), false);
            q2Var.p2 = i10 + 1 < arrayList.size();
        }
    }

    @Override // f2.o0
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        gu0 gu0Var = new gu0(this, this.c);
        yu0 yu0Var = this.x;
        gu0Var.setDialogCellDelegate(yu0Var);
        gu0Var.o0 = true;
        gu0Var.setBackgroundColor(yu0Var.h0(org.telegram.ui.ActionBar.j6.d6));
        return new dl0(gu0Var);
    }
}
