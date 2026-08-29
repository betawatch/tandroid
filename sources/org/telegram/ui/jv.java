package org.telegram.ui;

import android.os.Bundle;
import android.view.View;
import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.R;
import org.telegram.ui.Components.CheckBox;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class jv implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ fy b;

    public /* synthetic */ jv(fy fyVar, int i10) {
        this.a = i10;
        this.b = fyVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        ArrayList arrayList;
        xw xwVar;
        xw xwVar2;
        switch (this.a) {
            case 0:
                fy fyVar = this.b;
                if (fyVar.a4() && (arrayList = fyVar.z2) != null && !arrayList.isEmpty() && fyVar.getParentActivity() != null) {
                    int i10 = 0;
                    MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) fyVar.z2.get(0);
                    qw qwVar = fyVar.x1;
                    CharSequence fieldText = qwVar != null ? qwVar.getFieldText() : photoEntry.caption;
                    ArrayList arrayList2 = fyVar.z2;
                    int size = arrayList2.size();
                    while (i10 < size) {
                        Object obj = arrayList2.get(i10);
                        i10++;
                        ((MediaController.PhotoEntry) obj).caption = fieldText;
                    }
                    PhotoViewer.t1().K2(null, fyVar, fyVar.getResourceProvider());
                    PhotoViewer.t1().l7 = true;
                    PhotoViewer.t1().m7 = fieldText;
                    ArrayList arrayList3 = new ArrayList(fyVar.z2);
                    boolean[] zArr = new boolean[fyVar.z2.size()];
                    Arrays.fill(zArr, true);
                    PhotoViewer.t1().f2(arrayList3, 0, 0, false, new lx(fyVar, zArr), null);
                    PhotoViewer t12 = PhotoViewer.t1();
                    t12.b4 = true;
                    CheckBox checkBox = t12.J0;
                    if (checkBox != null) {
                        checkBox.setVisibility(8);
                    }
                    PhotoViewer.CounterView counterView = t12.K0;
                    if (counterView != null) {
                        counterView.setVisibility(8);
                        break;
                    }
                }
                break;
            case 1:
                fy fyVar2 = this.b;
                fyVar2.O4(true, false, true, false);
                fyVar2.U.b(true);
                AndroidUtilities.runOnUIThread(new ev(fyVar2, 3), 100L);
                break;
            case 2:
                fy fyVar3 = this.b;
                if (fyVar3.C0 && (xwVar = fyVar3.A0) != null && !xwVar.g()) {
                    fyVar3.x4(true, true);
                    break;
                } else {
                    fyVar3.P4();
                    break;
                }
                break;
            case 3:
                fy fyVar4 = this.b;
                if (fyVar4.C0 && (xwVar2 = fyVar4.A0) != null && !xwVar2.g()) {
                    fyVar4.x4(true, true);
                    break;
                } else {
                    fyVar4.P4();
                    break;
                }
                break;
            case 4:
                fy fyVar5 = this.b;
                fyVar5.getClass();
                Bundle bundle = new Bundle();
                bundle.putLong("community_id", fyVar5.T2);
                fyVar5.presentFragment(new qh.q(bundle));
                break;
            case 5:
                fy fyVar6 = this.b;
                ArrayList arrayList4 = fyVar6.E2;
                if (fyVar6.y2 != null && !arrayList4.isEmpty()) {
                    ArrayList arrayList5 = new ArrayList();
                    for (int i11 = 0; i11 < arrayList4.size(); i11++) {
                        arrayList5.add(MessagesStorage.TopicKey.of(((Long) arrayList4.get(i11)).longValue(), 0L));
                    }
                    fyVar6.y2.v(fyVar6, arrayList5, fyVar6.x1.getFieldText(), false, fyVar6.F2, fyVar6.G2, fyVar6.H2, null);
                    break;
                }
                break;
            case 6:
                this.b.b4(true);
                break;
            case 7:
                this.b.finishPreviewFragment();
                break;
            case 8:
                fy fyVar7 = this.b;
                fyVar7.v0.setIsEditing(false);
                fyVar7.I4(false);
                break;
            case 9:
                fy fyVar8 = this.b;
                fyVar8.getClass();
                fyVar8.showDialog(new cg.p1((org.telegram.ui.ActionBar.o2) fyVar8, 2, true));
                break;
            case 10:
                fy fyVar9 = this.b;
                fyVar9.getContactsController().loadGlobalPrivacySetting();
                fyVar9.K4();
                break;
            case 11:
                this.b.p4(view);
                break;
            case 12:
                fy.s0(this.b);
                break;
            case 13:
                fy.J0(this.b);
                break;
            case 14:
                fy.u0(this.b);
                break;
            case 15:
                fy fyVar10 = this.b;
                fyVar10.showDialog(org.telegram.ui.Components.c5.m(fyVar10.getParentActivity(), LocaleController.getString(R.string.EditProfileBirthdayTitle), LocaleController.getString(R.string.EditProfileBirthdayButton), null, new mv(fyVar10, 1), new ev(fyVar10, 17), false, false, fyVar10.getResourceProvider()).a);
                break;
            case 16:
                fy.C0(this.b);
                break;
            case 17:
                fy.z0(this.b);
                break;
            case 18:
                PremiumPreviewFragment premiumPreviewFragment = new PremiumPreviewFragment(0, "dialogs_hint");
                premiumPreviewFragment.f0 = true;
                fy fyVar11 = this.b;
                fyVar11.presentFragment(premiumPreviewFragment);
                AndroidUtilities.runOnUIThread(new ev(fyVar11, 21), 250L);
                break;
            case 19:
                fy.Z(this.b);
                break;
            case 20:
                PremiumPreviewFragment premiumPreviewFragment2 = new PremiumPreviewFragment(0, "dialogs_hint");
                premiumPreviewFragment2.f0 = true;
                fy fyVar12 = this.b;
                fyVar12.presentFragment(premiumPreviewFragment2);
                AndroidUtilities.runOnUIThread(new ev(fyVar12, 15), 250L);
                break;
            case 21:
                x6 x6Var = new x6();
                fy fyVar13 = this.b;
                fyVar13.presentFragment(x6Var);
                AndroidUtilities.runOnUIThread(new vv(fyVar13, 10), 250L);
                break;
            case 22:
                fy.D0(this.b);
                break;
            case 23:
                fy.Y(this.b);
                break;
            case 24:
                fy.l0(this.b);
                break;
            case 25:
                fy fyVar14 = this.b;
                ye.d.s(fyVar14.getParentActivity(), fyVar14.getMessagesController().premiumManageSubscriptionUrl);
                break;
            case 26:
                fy.k0(this.b);
                break;
            case 27:
                fy.y0(this.b);
                break;
            default:
                fy.X(this.b);
                break;
        }
    }
}
