package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.messenger.SavedMessagesController;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class iu0 extends sl0 {
    public final Context c;
    public final SavedMessagesController d;
    public boolean h;
    public qt0 s;
    public final /* synthetic */ zu0 x;
    public final ArrayList e = new ArrayList();
    public final ArrayList f = new ArrayList();
    public final oq0 n = new oq0(this, 5);
    public final f2.c1 r = new f2.c1();
    public final f2.f0 v = new f2.f0(new gu0(this));
    public final HashSet w = new HashSet();

    public iu0(zu0 zu0Var, Context context) {
        this.x = zu0Var;
        this.c = context;
        SavedMessagesController savedMessagesController = zu0Var.s1.getMessagesController().getSavedMessagesController();
        this.d = savedMessagesController;
        if (zu0Var.l0()) {
            savedMessagesController.loadDialogs(false);
        }
        C(true);
        F(false);
    }

    @Override // org.telegram.ui.Components.sl0
    public final boolean D(f2.m1 m1Var) {
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
            zu0 zu0Var = this.x;
            if (contains) {
                hashSet.remove(Long.valueOf(savedDialog.dialogId));
                if (hashSet.size() <= 0 && zu0Var.z1) {
                    zu0Var.b1(false);
                }
            } else {
                hashSet.add(Long.valueOf(savedDialog.dialogId));
                if (hashSet.size() > 0 && !zu0Var.z1) {
                    zu0Var.b1(true);
                    org.telegram.ui.ActionBar.w0 w0Var = zu0Var.r0;
                    if (w0Var != null) {
                        w0Var.setVisibility(8);
                    }
                    org.telegram.ui.ActionBar.w0 w0Var2 = zu0Var.q0;
                    if (w0Var2 != null) {
                        w0Var2.setVisibility(8);
                    }
                }
            }
            zu0Var.x0.a(hashSet.size(), true);
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
            org.telegram.ui.ActionBar.w0 w0Var3 = zu0Var.s0;
            if (w0Var3 != null) {
                w0Var3.setVisibility(z4 ? 8 : 0);
            }
            org.telegram.ui.ActionBar.w0 w0Var4 = zu0Var.t0;
            if (w0Var4 != null) {
                w0Var4.setVisibility(z4 ? 0 : 8);
            }
            r2Var.V(hashSet.contains(Long.valueOf(savedDialog.dialogId)), true);
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
    public final void v(f2.m1 m1Var, int i10) {
        View view = m1Var.a;
        if (view instanceof org.telegram.ui.Cells.r2) {
            org.telegram.ui.Cells.r2 r2Var = (org.telegram.ui.Cells.r2) view;
            ArrayList arrayList = this.f;
            SavedMessagesController.SavedDialog savedDialog = (SavedMessagesController.SavedDialog) arrayList.get(i10);
            r2Var.W(savedDialog.dialogId, savedDialog.message, savedDialog.getDate(), false, false);
            r2Var.p0 = true;
            r2Var.V(this.w.contains(Long.valueOf(savedDialog.dialogId)), false);
            r2Var.p2 = i10 + 1 < arrayList.size();
        }
    }

    @Override // f2.p0
    public final f2.m1 x(ViewGroup viewGroup, int i10) {
        hu0 hu0Var = new hu0(this, this.c);
        zu0 zu0Var = this.x;
        hu0Var.setDialogCellDelegate(zu0Var);
        hu0Var.o0 = true;
        hu0Var.setBackgroundColor(zu0Var.h0(org.telegram.ui.ActionBar.k6.d6));
        return new fl0(hu0Var);
    }
}
