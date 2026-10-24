package org.telegram.ui;

import android.text.SpannableStringBuilder;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class ew extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ ey a;

    public ew(ey eyVar) {
        this.a = eyVar;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i10) {
        nx nxVar;
        ArrayList arrayList;
        MessagesController.DialogFilter dialogFilter;
        int i11;
        ArrayList arrayList2;
        boolean z10;
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        ey eyVar = this.a;
        ArrayList arrayList3 = eyVar.I2;
        if ((i10 == 201 || i10 == 200 || i10 == 202 || i10 == 203) && (nxVar = eyVar.C0) != null) {
            HashMap hashMap = nxVar.z0;
            ey eyVar2 = nxVar.J0;
            if (i10 == 202) {
                if (eyVar2 == null || eyVar2.getParentActivity() == null) {
                    return;
                }
                ArrayList arrayList4 = new ArrayList(hashMap.values());
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(eyVar2.getParentActivity());
                alertDialog$Builder.a.R = LocaleController.formatPluralString("RemoveDocumentsTitle", hashMap.size(), new Object[0]);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatPluralString("RemoveDocumentsMessage", hashMap.size(), new Object[0]))).append((CharSequence) "\n\n").append((CharSequence) LocaleController.getString(R.string.RemoveDocumentsAlertMessage));
                alertDialog$Builder.a.T = spannableStringBuilder;
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new org.telegram.ui.Components.ud0(10));
                alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new org.telegram.ui.Components.p2(21, nxVar, arrayList4));
                TextView textView = (TextView) alertDialog$Builder.p().d(-1);
                if (textView != null) {
                    org.telegram.ui.ActionBar.r6.W(textView, org.telegram.ui.ActionBar.k6.q7, null);
                    return;
                }
                return;
            }
            if (i10 == 203) {
                if (nxVar.M()) {
                    eyVar2.showDialog(new sg.y0((org.telegram.ui.ActionBar.o2) eyVar2, 2, true));
                    return;
                }
                return;
            } else if (i10 == 200) {
                if (hashMap.size() != 1) {
                    return;
                }
                nxVar.c((MessageObject) hashMap.values().iterator().next());
                return;
            } else {
                if (i10 == 201) {
                    ey eyVar3 = new ey(org.telegram.messenger.v0.e(3, "onlySelect", "dialogsType", true));
                    eyVar3.C2 = new org.telegram.ui.Components.tv(nxVar, 18);
                    eyVar2.presentFragment(eyVar3);
                    return;
                }
                return;
            }
        }
        long j10 = 0;
        if (i10 == -1) {
            yw ywVar = eyVar.G3;
            if (ywVar != null && ywVar.c()) {
                kVar2 = ((org.telegram.ui.ActionBar.o2) eyVar).actionBar;
                if (!kVar2.s()) {
                    eyVar.G3.a();
                    nx nxVar2 = eyVar.C0;
                    if (nxVar2 != null) {
                        nxVar2.Q();
                        return;
                    }
                    return;
                }
                nx nxVar3 = eyVar.C0;
                if (nxVar3 != null && nxVar3.getVisibility() == 0) {
                    nx nxVar4 = eyVar.C0;
                    if (nxVar4.y0) {
                        nxVar4.P(false);
                        return;
                    }
                }
                eyVar.Z3(true);
                return;
            }
            cw cwVar = eyVar.z0;
            if (cwVar != null && cwVar.n) {
                cwVar.setIsEditing(false);
                eyVar.G4(false);
                return;
            }
            kVar = ((org.telegram.ui.ActionBar.o2) eyVar).actionBar;
            if (!kVar.s()) {
                if (!eyVar.l2 && eyVar.W2 == 0 && eyVar.Y2 == 0) {
                    return;
                }
                eyVar.finishFragment();
                return;
            }
            nx nxVar5 = eyVar.C0;
            if (nxVar5 != null && nxVar5.getVisibility() == 0) {
                nx nxVar6 = eyVar.C0;
                if (nxVar6.y0) {
                    nxVar6.P(false);
                    return;
                }
            }
            eyVar.Z3(true);
            return;
        }
        if (i10 == 1) {
            if (eyVar.getParentActivity() == null) {
                return;
            }
            SharedConfig.appLocked = true;
            SharedConfig.saveConfig();
            int[] iArr = new int[2];
            eyVar.f0.getLocationInWindow(iArr);
            ((LaunchActivity) eyVar.getParentActivity()).L0(false, true, (eyVar.f0.getMeasuredWidth() / 2) + iArr[0], (eyVar.f0.getMeasuredHeight() / 2) + iArr[1], new ti(this, 25));
            eyVar.getNotificationsController().showNotifications();
            eyVar.w3();
            return;
        }
        if (i10 == 3) {
            eyVar.M4(true, true, true, false);
            eyVar.Y.b(true);
            return;
        }
        if (i10 == 11) {
            eyVar.n4(eyVar.D1);
            return;
        }
        if (i10 == 109) {
            org.telegram.ui.Components.v00 v00Var = new org.telegram.ui.Components.v00(eyVar, arrayList3);
            v00Var.s = new xt(this, 4);
            eyVar.showDialog(v00Var);
            return;
        }
        if (i10 != 110) {
            if (i10 == 100 || i10 == 101 || i10 == 102 || i10 == 103 || i10 == 104 || i10 == 105 || i10 == 106 || i10 == 107 || i10 == 108) {
                eyVar.p4(eyVar.I2, i10, true, false, null);
                return;
            }
            return;
        }
        MessagesController.DialogFilter dialogFilter2 = eyVar.getMessagesController().getDialogFilters().get(eyVar.e0[0].h);
        ArrayList I = org.telegram.ui.Components.v00.I(eyVar, dialogFilter2, arrayList3, false, false);
        if (I.size() + (dialogFilter2 != null ? dialogFilter2.neverShow.size() : 0) > 100) {
            eyVar.showDialog(org.telegram.ui.Components.f5.N(eyVar.getParentActivity(), LocaleController.getString(R.string.FilterAddToAlertFullTitle), LocaleController.getString(R.string.FilterAddToAlertFullText)).a);
            return;
        }
        if (I.isEmpty()) {
            arrayList = I;
            dialogFilter = dialogFilter2;
            i11 = 1;
        } else {
            dialogFilter2.neverShow.addAll(I);
            for (int i12 = 0; i12 < I.size(); i12++) {
                Long l4 = (Long) I.get(i12);
                dialogFilter2.alwaysShow.remove(l4);
                dialogFilter2.pinnedDialogs.delete(l4.longValue());
            }
            if (dialogFilter2.isChatlist()) {
                dialogFilter2.neverShow.clear();
            }
            dialogFilter = dialogFilter2;
            arrayList = I;
            i11 = 1;
            q00.t0(dialogFilter, dialogFilter2.flags, dialogFilter2.name, dialogFilter2.entities, dialogFilter2.title_noanimate, dialogFilter2.color, dialogFilter2.alwaysShow, dialogFilter2.neverShow, dialogFilter2.pinnedDialogs, false, false, true, false, false, eyVar, null);
        }
        if (arrayList.size() == i11) {
            arrayList2 = arrayList;
            z10 = false;
            j10 = ((Long) arrayList2.get(0)).longValue();
        } else {
            arrayList2 = arrayList;
            z10 = false;
        }
        long j11 = j10;
        UndoView W3 = eyVar.W3();
        if (W3 != null) {
            W3.k(j11, 21, Integer.valueOf(arrayList2.size()), dialogFilter, null, null);
        }
        eyVar.Z3(z10);
    }
}
