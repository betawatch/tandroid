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

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class hw extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ gy a;

    public hw(gy gyVar) {
        this.a = gyVar;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i10) {
        px pxVar;
        ArrayList arrayList;
        MessagesController.DialogFilter dialogFilter;
        int i11;
        ArrayList arrayList2;
        boolean z10;
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        gy gyVar = this.a;
        ArrayList arrayList3 = gyVar.E2;
        if ((i10 == 201 || i10 == 200 || i10 == 202 || i10 == 203) && (pxVar = gyVar.y0) != null) {
            HashMap hashMap = pxVar.v0;
            gy gyVar2 = pxVar.F0;
            if (i10 == 202) {
                if (gyVar2 == null || gyVar2.getParentActivity() == null) {
                    return;
                }
                ArrayList arrayList4 = new ArrayList(hashMap.values());
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(gyVar2.getParentActivity());
                alertDialog$Builder.a.N = LocaleController.formatPluralString("RemoveDocumentsTitle", hashMap.size(), new Object[0]);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatPluralString("RemoveDocumentsMessage", hashMap.size(), new Object[0]))).append((CharSequence) "\n\n").append((CharSequence) LocaleController.getString(R.string.RemoveDocumentsAlertMessage));
                alertDialog$Builder.a.P = spannableStringBuilder;
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new org.telegram.ui.Components.pc0(8));
                alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new org.telegram.ui.Components.g1(23, pxVar, arrayList4));
                TextView textView = (TextView) alertDialog$Builder.o().d(-1);
                if (textView != null) {
                    textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.q7, false));
                    return;
                }
                return;
            }
            if (i10 == 203) {
                if (pxVar.N()) {
                    gyVar2.showDialog(new ag.g2((org.telegram.ui.ActionBar.n2) gyVar2, 2, true));
                    return;
                }
                return;
            } else if (i10 == 200) {
                if (hashMap.size() != 1) {
                    return;
                }
                pxVar.c((MessageObject) hashMap.values().iterator().next());
                return;
            } else {
                if (i10 == 201) {
                    gy gyVar3 = new gy(org.telegram.messenger.y1.e(3, "onlySelect", "dialogsType", true));
                    gyVar3.y2 = new org.telegram.ui.Components.vu(pxVar, 17);
                    gyVar2.presentFragment(gyVar3);
                    return;
                }
                return;
            }
        }
        long j10 = 0;
        if (i10 == -1) {
            bx bxVar = gyVar.B3;
            if (bxVar != null && bxVar.c()) {
                kVar2 = ((org.telegram.ui.ActionBar.n2) gyVar).actionBar;
                if (!kVar2.t()) {
                    gyVar.B3.a();
                    px pxVar2 = gyVar.y0;
                    if (pxVar2 != null) {
                        pxVar2.R();
                        return;
                    }
                    return;
                }
                px pxVar3 = gyVar.y0;
                if (pxVar3 != null && pxVar3.getVisibility() == 0) {
                    px pxVar4 = gyVar.y0;
                    if (pxVar4.u0) {
                        pxVar4.Q(false);
                        return;
                    }
                }
                gyVar.b4(true);
                return;
            }
            fw fwVar = gyVar.v0;
            if (fwVar != null && fwVar.n) {
                fwVar.setIsEditing(false);
                gyVar.I4(false);
                return;
            }
            kVar = ((org.telegram.ui.ActionBar.n2) gyVar).actionBar;
            if (!kVar.t()) {
                if (!gyVar.h2 && gyVar.R2 == 0 && gyVar.T2 == 0) {
                    return;
                }
                gyVar.finishFragment();
                return;
            }
            px pxVar5 = gyVar.y0;
            if (pxVar5 != null && pxVar5.getVisibility() == 0) {
                px pxVar6 = gyVar.y0;
                if (pxVar6.u0) {
                    pxVar6.Q(false);
                    return;
                }
            }
            gyVar.b4(true);
            return;
        }
        if (i10 == 1) {
            if (gyVar.getParentActivity() == null) {
                return;
            }
            SharedConfig.appLocked = true;
            SharedConfig.saveConfig();
            int[] iArr = new int[2];
            gyVar.b0.getLocationInWindow(iArr);
            ((LaunchActivity) gyVar.getParentActivity()).G0(false, true, (gyVar.b0.getMeasuredWidth() / 2) + iArr[0], (gyVar.b0.getMeasuredHeight() / 2) + iArr[1], new ti(this, 24));
            gyVar.getNotificationsController().showNotifications();
            gyVar.y3();
            return;
        }
        if (i10 == 3) {
            gyVar.O4(true, true, true, false);
            gyVar.U.b(true);
            return;
        }
        if (i10 == 11) {
            gyVar.p4(gyVar.z1);
            return;
        }
        if (i10 == 109) {
            org.telegram.ui.Components.b00 b00Var = new org.telegram.ui.Components.b00(gyVar, arrayList3);
            b00Var.r = new zt(this, 4);
            gyVar.showDialog(b00Var);
            return;
        }
        if (i10 != 110) {
            if (i10 == 100 || i10 == 101 || i10 == 102 || i10 == 103 || i10 == 104 || i10 == 105 || i10 == 106 || i10 == 107 || i10 == 108) {
                gyVar.r4(gyVar.E2, i10, true, false, null);
                return;
            }
            return;
        }
        MessagesController.DialogFilter dialogFilter2 = gyVar.getMessagesController().getDialogFilters().get(gyVar.a0[0].h);
        ArrayList I = org.telegram.ui.Components.b00.I(gyVar, dialogFilter2, arrayList3, false, false);
        if (I.size() + (dialogFilter2 != null ? dialogFilter2.neverShow.size() : 0) > 100) {
            gyVar.showDialog(org.telegram.ui.Components.y4.N(gyVar.getParentActivity(), LocaleController.getString(R.string.FilterAddToAlertFullTitle), LocaleController.getString(R.string.FilterAddToAlertFullText)).a);
            return;
        }
        if (I.isEmpty()) {
            arrayList = I;
            dialogFilter = dialogFilter2;
            i11 = 1;
        } else {
            dialogFilter2.neverShow.addAll(I);
            for (int i12 = 0; i12 < I.size(); i12++) {
                Long l10 = (Long) I.get(i12);
                dialogFilter2.alwaysShow.remove(l10);
                dialogFilter2.pinnedDialogs.delete(l10.longValue());
            }
            if (dialogFilter2.isChatlist()) {
                dialogFilter2.neverShow.clear();
            }
            dialogFilter = dialogFilter2;
            arrayList = I;
            i11 = 1;
            q00.t0(dialogFilter, dialogFilter2.flags, dialogFilter2.name, dialogFilter2.entities, dialogFilter2.title_noanimate, dialogFilter2.color, dialogFilter2.alwaysShow, dialogFilter2.neverShow, dialogFilter2.pinnedDialogs, false, false, true, false, false, gyVar, null);
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
        UndoView Y3 = gyVar.Y3();
        if (Y3 != null) {
            Y3.k(j11, 21, Integer.valueOf(arrayList2.size()), dialogFilter, null, null);
        }
        gyVar.b4(z10);
    }
}
