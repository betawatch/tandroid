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

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class pw extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ oy a;

    public pw(oy oyVar) {
        this.a = oyVar;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i10) {
        xx xxVar;
        ArrayList arrayList;
        MessagesController.DialogFilter dialogFilter;
        int i11;
        ArrayList arrayList2;
        boolean z4;
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        oy oyVar = this.a;
        ArrayList arrayList3 = oyVar.F2;
        if ((i10 == 201 || i10 == 200 || i10 == 202 || i10 == 203) && (xxVar = oyVar.z0) != null) {
            HashMap hashMap = xxVar.w0;
            oy oyVar2 = xxVar.G0;
            if (i10 == 202) {
                if (oyVar2 == null || oyVar2.getParentActivity() == null) {
                    return;
                }
                ArrayList arrayList4 = new ArrayList(hashMap.values());
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(oyVar2.getParentActivity());
                alertDialog$Builder.a.O = LocaleController.formatPluralString("RemoveDocumentsTitle", hashMap.size(), new Object[0]);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatPluralString("RemoveDocumentsMessage", hashMap.size(), new Object[0]))).append((CharSequence) "\n\n").append((CharSequence) LocaleController.getString(R.string.RemoveDocumentsAlertMessage));
                alertDialog$Builder.a.Q = spannableStringBuilder;
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new org.telegram.ui.Components.kh0(2));
                alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new org.telegram.ui.Components.o1(22, xxVar, arrayList4));
                TextView textView = (TextView) alertDialog$Builder.o().d(-1);
                if (textView != null) {
                    textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.q7, false));
                    return;
                }
                return;
            }
            if (i10 == 203) {
                if (xxVar.N()) {
                    oyVar2.showDialog(new eg.o1((org.telegram.ui.ActionBar.p2) oyVar2, 2, true));
                    return;
                }
                return;
            } else if (i10 == 200) {
                if (hashMap.size() != 1) {
                    return;
                }
                xxVar.c((MessageObject) hashMap.values().iterator().next());
                return;
            } else {
                if (i10 == 201) {
                    oy oyVar3 = new oy(org.telegram.messenger.y3.e(3, "onlySelect", "dialogsType", true));
                    oyVar3.z2 = new org.telegram.ui.Components.fv(xxVar, 17);
                    oyVar2.presentFragment(oyVar3);
                    return;
                }
                return;
            }
        }
        long j10 = 0;
        if (i10 == -1) {
            jx jxVar = oyVar.C3;
            if (jxVar != null && jxVar.c()) {
                kVar2 = ((org.telegram.ui.ActionBar.p2) oyVar).actionBar;
                if (!kVar2.s()) {
                    oyVar.C3.a();
                    xx xxVar2 = oyVar.z0;
                    if (xxVar2 != null) {
                        xxVar2.R();
                        return;
                    }
                    return;
                }
                xx xxVar3 = oyVar.z0;
                if (xxVar3 != null && xxVar3.getVisibility() == 0) {
                    xx xxVar4 = oyVar.z0;
                    if (xxVar4.v0) {
                        xxVar4.Q(false);
                        return;
                    }
                }
                oyVar.b4(true);
                return;
            }
            nw nwVar = oyVar.w0;
            if (nwVar != null && nwVar.n) {
                nwVar.setIsEditing(false);
                oyVar.I4(false);
                return;
            }
            kVar = ((org.telegram.ui.ActionBar.p2) oyVar).actionBar;
            if (!kVar.s()) {
                if (!oyVar.i2 && oyVar.S2 == 0 && oyVar.U2 == 0) {
                    return;
                }
                oyVar.finishFragment();
                return;
            }
            xx xxVar5 = oyVar.z0;
            if (xxVar5 != null && xxVar5.getVisibility() == 0) {
                xx xxVar6 = oyVar.z0;
                if (xxVar6.v0) {
                    xxVar6.Q(false);
                    return;
                }
            }
            oyVar.b4(true);
            return;
        }
        if (i10 == 1) {
            if (oyVar.getParentActivity() == null) {
                return;
            }
            SharedConfig.appLocked = true;
            SharedConfig.saveConfig();
            int[] iArr = new int[2];
            oyVar.c0.getLocationInWindow(iArr);
            ((LaunchActivity) oyVar.getParentActivity()).G0(false, true, (oyVar.c0.getMeasuredWidth() / 2) + iArr[0], (oyVar.c0.getMeasuredHeight() / 2) + iArr[1], new zi(this, 24));
            oyVar.getNotificationsController().showNotifications();
            oyVar.y3();
            return;
        }
        if (i10 == 3) {
            oyVar.O4(true, true, true, false);
            oyVar.V.b(true);
            return;
        }
        if (i10 == 11) {
            oyVar.p4(oyVar.A1);
            return;
        }
        if (i10 == 109) {
            org.telegram.ui.Components.n00 n00Var = new org.telegram.ui.Components.n00(arrayList3, oyVar);
            n00Var.r = new fu(this, 4);
            oyVar.showDialog(n00Var);
            return;
        }
        if (i10 != 110) {
            if (i10 == 100 || i10 == 101 || i10 == 102 || i10 == 103 || i10 == 104 || i10 == 105 || i10 == 106 || i10 == 107 || i10 == 108) {
                oyVar.r4(oyVar.F2, i10, true, false, null);
                return;
            }
            return;
        }
        MessagesController.DialogFilter dialogFilter2 = oyVar.getMessagesController().getDialogFilters().get(oyVar.b0[0].h);
        ArrayList H = org.telegram.ui.Components.n00.H(oyVar, dialogFilter2, arrayList3, false, false);
        if (H.size() + (dialogFilter2 != null ? dialogFilter2.neverShow.size() : 0) > 100) {
            oyVar.showDialog(org.telegram.ui.Components.z4.N(oyVar.getParentActivity(), LocaleController.getString(R.string.FilterAddToAlertFullTitle), LocaleController.getString(R.string.FilterAddToAlertFullText)).a);
            return;
        }
        if (H.isEmpty()) {
            arrayList = H;
            dialogFilter = dialogFilter2;
            i11 = 1;
        } else {
            dialogFilter2.neverShow.addAll(H);
            for (int i12 = 0; i12 < H.size(); i12++) {
                Long l10 = (Long) H.get(i12);
                dialogFilter2.alwaysShow.remove(l10);
                dialogFilter2.pinnedDialogs.delete(l10.longValue());
            }
            if (dialogFilter2.isChatlist()) {
                dialogFilter2.neverShow.clear();
            }
            dialogFilter = dialogFilter2;
            arrayList = H;
            i11 = 1;
            b10.t0(dialogFilter, dialogFilter2.flags, dialogFilter2.name, dialogFilter2.entities, dialogFilter2.title_noanimate, dialogFilter2.color, dialogFilter2.alwaysShow, dialogFilter2.neverShow, dialogFilter2.pinnedDialogs, false, false, true, false, false, oyVar, null);
        }
        if (arrayList.size() == i11) {
            arrayList2 = arrayList;
            z4 = false;
            j10 = ((Long) arrayList2.get(0)).longValue();
        } else {
            arrayList2 = arrayList;
            z4 = false;
        }
        long j11 = j10;
        UndoView Y3 = oyVar.Y3();
        if (Y3 != null) {
            Y3.k(j11, 21, Integer.valueOf(arrayList2.size()), dialogFilter, null, null);
        }
        oyVar.b4(z4);
    }
}
