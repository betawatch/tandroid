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

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class cw extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ cy a;

    public cw(cy cyVar) {
        this.a = cyVar;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i10) {
        lx lxVar;
        ArrayList arrayList;
        MessagesController.DialogFilter dialogFilter;
        int i11;
        ArrayList arrayList2;
        boolean z10;
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        cy cyVar = this.a;
        ArrayList arrayList3 = cyVar.I2;
        if ((i10 == 201 || i10 == 200 || i10 == 202 || i10 == 203) && (lxVar = cyVar.C0) != null) {
            HashMap hashMap = lxVar.z0;
            cy cyVar2 = lxVar.J0;
            if (i10 == 202) {
                if (cyVar2 == null || cyVar2.getParentActivity() == null) {
                    return;
                }
                ArrayList arrayList4 = new ArrayList(hashMap.values());
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(cyVar2.getParentActivity());
                alertDialog$Builder.a.R = LocaleController.formatPluralString("RemoveDocumentsTitle", hashMap.size(), new Object[0]);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatPluralString("RemoveDocumentsMessage", hashMap.size(), new Object[0]))).append((CharSequence) "\n\n").append((CharSequence) LocaleController.getString(R.string.RemoveDocumentsAlertMessage));
                alertDialog$Builder.a.T = spannableStringBuilder;
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new org.telegram.ui.Components.tg0(4));
                alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new org.telegram.ui.Components.q2(19, lxVar, arrayList4));
                TextView textView = (TextView) alertDialog$Builder.o().d(-1);
                if (textView != null) {
                    textView.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.q7, false));
                    return;
                }
                return;
            }
            if (i10 == 203) {
                if (lxVar.N()) {
                    cyVar2.showDialog(new sg.y0((org.telegram.ui.ActionBar.n2) cyVar2, 2, true));
                    return;
                }
                return;
            } else if (i10 == 200) {
                if (hashMap.size() != 1) {
                    return;
                }
                lxVar.c((MessageObject) hashMap.values().iterator().next());
                return;
            } else {
                if (i10 == 201) {
                    cy cyVar3 = new cy(org.telegram.messenger.kk.d(3, "onlySelect", "dialogsType", true));
                    cyVar3.C2 = new org.telegram.ui.Components.tv(lxVar, 18);
                    cyVar2.presentFragment(cyVar3);
                    return;
                }
                return;
            }
        }
        long j10 = 0;
        if (i10 == -1) {
            ww wwVar = cyVar.G3;
            if (wwVar != null && wwVar.c()) {
                kVar2 = ((org.telegram.ui.ActionBar.n2) cyVar).actionBar;
                if (!kVar2.t()) {
                    cyVar.G3.a();
                    lx lxVar2 = cyVar.C0;
                    if (lxVar2 != null) {
                        lxVar2.R();
                        return;
                    }
                    return;
                }
                lx lxVar3 = cyVar.C0;
                if (lxVar3 != null && lxVar3.getVisibility() == 0) {
                    lx lxVar4 = cyVar.C0;
                    if (lxVar4.y0) {
                        lxVar4.Q(false);
                        return;
                    }
                }
                cyVar.Z3(true);
                return;
            }
            aw awVar = cyVar.z0;
            if (awVar != null && awVar.n) {
                awVar.setIsEditing(false);
                cyVar.G4(false);
                return;
            }
            kVar = ((org.telegram.ui.ActionBar.n2) cyVar).actionBar;
            if (!kVar.t()) {
                if (!cyVar.l2 && cyVar.W2 == 0 && cyVar.Y2 == 0) {
                    return;
                }
                cyVar.finishFragment();
                return;
            }
            lx lxVar5 = cyVar.C0;
            if (lxVar5 != null && lxVar5.getVisibility() == 0) {
                lx lxVar6 = cyVar.C0;
                if (lxVar6.y0) {
                    lxVar6.Q(false);
                    return;
                }
            }
            cyVar.Z3(true);
            return;
        }
        if (i10 == 1) {
            if (cyVar.getParentActivity() == null) {
                return;
            }
            SharedConfig.appLocked = true;
            SharedConfig.saveConfig();
            int[] iArr = new int[2];
            cyVar.f0.getLocationInWindow(iArr);
            ((LaunchActivity) cyVar.getParentActivity()).K0(false, true, (cyVar.f0.getMeasuredWidth() / 2) + iArr[0], (cyVar.f0.getMeasuredHeight() / 2) + iArr[1], new ti(this, 25));
            cyVar.getNotificationsController().showNotifications();
            cyVar.w3();
            return;
        }
        if (i10 == 3) {
            cyVar.M4(true, true, true, false);
            cyVar.Y.b(true);
            return;
        }
        if (i10 == 11) {
            cyVar.n4(cyVar.D1);
            return;
        }
        if (i10 == 109) {
            org.telegram.ui.Components.v00 v00Var = new org.telegram.ui.Components.v00(cyVar, arrayList3);
            v00Var.r = new ut(this, 4);
            cyVar.showDialog(v00Var);
            return;
        }
        if (i10 != 110) {
            if (i10 == 100 || i10 == 101 || i10 == 102 || i10 == 103 || i10 == 104 || i10 == 105 || i10 == 106 || i10 == 107 || i10 == 108) {
                cyVar.p4(cyVar.I2, i10, true, false, null);
                return;
            }
            return;
        }
        MessagesController.DialogFilter dialogFilter2 = cyVar.getMessagesController().getDialogFilters().get(cyVar.e0[0].h);
        ArrayList J = org.telegram.ui.Components.v00.J(cyVar, dialogFilter2, arrayList3, false, false);
        if (J.size() + (dialogFilter2 != null ? dialogFilter2.neverShow.size() : 0) > 100) {
            cyVar.showDialog(org.telegram.ui.Components.f5.M(cyVar.getParentActivity(), LocaleController.getString(R.string.FilterAddToAlertFullTitle), LocaleController.getString(R.string.FilterAddToAlertFullText)).a);
            return;
        }
        if (J.isEmpty()) {
            arrayList = J;
            dialogFilter = dialogFilter2;
            i11 = 1;
        } else {
            dialogFilter2.neverShow.addAll(J);
            for (int i12 = 0; i12 < J.size(); i12++) {
                Long l4 = (Long) J.get(i12);
                dialogFilter2.alwaysShow.remove(l4);
                dialogFilter2.pinnedDialogs.delete(l4.longValue());
            }
            if (dialogFilter2.isChatlist()) {
                dialogFilter2.neverShow.clear();
            }
            dialogFilter = dialogFilter2;
            arrayList = J;
            i11 = 1;
            n00.t0(dialogFilter, dialogFilter2.flags, dialogFilter2.name, dialogFilter2.entities, dialogFilter2.title_noanimate, dialogFilter2.color, dialogFilter2.alwaysShow, dialogFilter2.neverShow, dialogFilter2.pinnedDialogs, false, false, true, false, false, cyVar, null);
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
        UndoView W3 = cyVar.W3();
        if (W3 != null) {
            W3.k(j11, 21, Integer.valueOf(arrayList2.size()), dialogFilter, null, null);
        }
        cyVar.Z3(z10);
    }
}
