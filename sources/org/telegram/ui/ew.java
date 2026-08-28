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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class ew extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ dy a;

    public ew(dy dyVar) {
        this.a = dyVar;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i9) {
        mx mxVar;
        ArrayList arrayList;
        MessagesController.DialogFilter dialogFilter;
        int i10;
        ArrayList arrayList2;
        boolean z10;
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        dy dyVar = this.a;
        ArrayList arrayList3 = dyVar.E2;
        if ((i9 == 201 || i9 == 200 || i9 == 202 || i9 == 203) && (mxVar = dyVar.y0) != null) {
            HashMap hashMap = mxVar.v0;
            dy dyVar2 = mxVar.F0;
            if (i9 == 202) {
                if (dyVar2 == null || dyVar2.getParentActivity() == null) {
                    return;
                }
                ArrayList arrayList4 = new ArrayList(hashMap.values());
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(dyVar2.getParentActivity());
                alertDialog$Builder.a.N = LocaleController.formatPluralString("RemoveDocumentsTitle", hashMap.size(), new Object[0]);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatPluralString("RemoveDocumentsMessage", hashMap.size(), new Object[0]))).append((CharSequence) "\n\n").append((CharSequence) LocaleController.getString(R.string.RemoveDocumentsAlertMessage));
                alertDialog$Builder.a.P = spannableStringBuilder;
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new org.telegram.ui.Components.if0(3));
                alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new org.telegram.ui.Components.g1(23, mxVar, arrayList4));
                TextView textView = (TextView) alertDialog$Builder.o().d(-1);
                if (textView != null) {
                    textView.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.q7, false));
                    return;
                }
                return;
            }
            if (i9 == 203) {
                if (mxVar.N()) {
                    dyVar2.showDialog(new zf.x0((org.telegram.ui.ActionBar.o2) dyVar2, 2, true));
                    return;
                }
                return;
            } else if (i9 == 200) {
                if (hashMap.size() != 1) {
                    return;
                }
                mxVar.c((MessageObject) hashMap.values().iterator().next());
                return;
            } else {
                if (i9 == 201) {
                    dy dyVar3 = new dy(org.telegram.messenger.l0.e(3, "onlySelect", "dialogsType", true));
                    dyVar3.y2 = new org.telegram.ui.Components.wu(mxVar, 17);
                    dyVar2.presentFragment(dyVar3);
                    return;
                }
                return;
            }
        }
        long j10 = 0;
        if (i9 == -1) {
            yw ywVar = dyVar.B3;
            if (ywVar != null && ywVar.c()) {
                kVar2 = ((org.telegram.ui.ActionBar.o2) dyVar).actionBar;
                if (!kVar2.s()) {
                    dyVar.B3.a();
                    mx mxVar2 = dyVar.y0;
                    if (mxVar2 != null) {
                        mxVar2.R();
                        return;
                    }
                    return;
                }
                mx mxVar3 = dyVar.y0;
                if (mxVar3 != null && mxVar3.getVisibility() == 0) {
                    mx mxVar4 = dyVar.y0;
                    if (mxVar4.u0) {
                        mxVar4.Q(false);
                        return;
                    }
                }
                dyVar.b4(true);
                return;
            }
            cw cwVar = dyVar.v0;
            if (cwVar != null && cwVar.n) {
                cwVar.setIsEditing(false);
                dyVar.I4(false);
                return;
            }
            kVar = ((org.telegram.ui.ActionBar.o2) dyVar).actionBar;
            if (!kVar.s()) {
                if (!dyVar.h2 && dyVar.R2 == 0 && dyVar.T2 == 0) {
                    return;
                }
                dyVar.finishFragment();
                return;
            }
            mx mxVar5 = dyVar.y0;
            if (mxVar5 != null && mxVar5.getVisibility() == 0) {
                mx mxVar6 = dyVar.y0;
                if (mxVar6.u0) {
                    mxVar6.Q(false);
                    return;
                }
            }
            dyVar.b4(true);
            return;
        }
        if (i9 == 1) {
            if (dyVar.getParentActivity() == null) {
                return;
            }
            SharedConfig.appLocked = true;
            SharedConfig.saveConfig();
            int[] iArr = new int[2];
            dyVar.b0.getLocationInWindow(iArr);
            ((LaunchActivity) dyVar.getParentActivity()).G0(false, true, (dyVar.b0.getMeasuredWidth() / 2) + iArr[0], (dyVar.b0.getMeasuredHeight() / 2) + iArr[1], new ri(this, 24));
            dyVar.getNotificationsController().showNotifications();
            dyVar.y3();
            return;
        }
        if (i9 == 3) {
            dyVar.O4(true, true, true, false);
            dyVar.U.b(true);
            return;
        }
        if (i9 == 11) {
            dyVar.p4(dyVar.z1);
            return;
        }
        if (i9 == 109) {
            org.telegram.ui.Components.yz yzVar = new org.telegram.ui.Components.yz(dyVar, arrayList3);
            yzVar.r = new wt(this, 4);
            dyVar.showDialog(yzVar);
            return;
        }
        if (i9 != 110) {
            if (i9 == 100 || i9 == 101 || i9 == 102 || i9 == 103 || i9 == 104 || i9 == 105 || i9 == 106 || i9 == 107 || i9 == 108) {
                dyVar.r4(dyVar.E2, i9, true, false, null);
                return;
            }
            return;
        }
        MessagesController.DialogFilter dialogFilter2 = dyVar.getMessagesController().getDialogFilters().get(dyVar.a0[0].h);
        ArrayList H = org.telegram.ui.Components.yz.H(dyVar, dialogFilter2, arrayList3, false, false);
        if (H.size() + (dialogFilter2 != null ? dialogFilter2.neverShow.size() : 0) > 100) {
            dyVar.showDialog(org.telegram.ui.Components.y4.N(dyVar.getParentActivity(), LocaleController.getString(R.string.FilterAddToAlertFullTitle), LocaleController.getString(R.string.FilterAddToAlertFullText)).a);
            return;
        }
        if (H.isEmpty()) {
            arrayList = H;
            dialogFilter = dialogFilter2;
            i10 = 1;
        } else {
            dialogFilter2.neverShow.addAll(H);
            for (int i11 = 0; i11 < H.size(); i11++) {
                Long l10 = (Long) H.get(i11);
                dialogFilter2.alwaysShow.remove(l10);
                dialogFilter2.pinnedDialogs.delete(l10.longValue());
            }
            if (dialogFilter2.isChatlist()) {
                dialogFilter2.neverShow.clear();
            }
            dialogFilter = dialogFilter2;
            arrayList = H;
            i10 = 1;
            n00.s0(dialogFilter, dialogFilter2.flags, dialogFilter2.name, dialogFilter2.entities, dialogFilter2.title_noanimate, dialogFilter2.color, dialogFilter2.alwaysShow, dialogFilter2.neverShow, dialogFilter2.pinnedDialogs, false, false, true, false, false, dyVar, null);
        }
        if (arrayList.size() == i10) {
            arrayList2 = arrayList;
            z10 = false;
            j10 = ((Long) arrayList2.get(0)).longValue();
        } else {
            arrayList2 = arrayList;
            z10 = false;
        }
        long j11 = j10;
        UndoView Y3 = dyVar.Y3();
        if (Y3 != null) {
            Y3.k(j11, 21, Integer.valueOf(arrayList2.size()), dialogFilter, null, null);
        }
        dyVar.b4(z10);
    }
}
