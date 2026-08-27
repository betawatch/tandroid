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

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class lv implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ gy b;

    public /* synthetic */ lv(gy gyVar, int i10) {
        this.a = i10;
        this.b = gyVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        ArrayList arrayList;
        yw ywVar;
        yw ywVar2;
        switch (this.a) {
            case 0:
                gy gyVar = this.b;
                if (gyVar.a4() && (arrayList = gyVar.z2) != null && !arrayList.isEmpty() && gyVar.getParentActivity() != null) {
                    int i10 = 0;
                    MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) gyVar.z2.get(0);
                    rw rwVar = gyVar.x1;
                    CharSequence fieldText = rwVar != null ? rwVar.getFieldText() : photoEntry.caption;
                    ArrayList arrayList2 = gyVar.z2;
                    int size = arrayList2.size();
                    while (i10 < size) {
                        Object obj = arrayList2.get(i10);
                        i10++;
                        ((MediaController.PhotoEntry) obj).caption = fieldText;
                    }
                    PhotoViewer.t1().K2(null, gyVar, gyVar.getResourceProvider());
                    PhotoViewer.t1().l7 = true;
                    PhotoViewer.t1().m7 = fieldText;
                    ArrayList arrayList3 = new ArrayList(gyVar.z2);
                    boolean[] zArr = new boolean[gyVar.z2.size()];
                    Arrays.fill(zArr, true);
                    PhotoViewer.t1().f2(arrayList3, 0, 0, false, new mx(gyVar, zArr), null);
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
                gy gyVar2 = this.b;
                gyVar2.O4(true, false, true, false);
                gyVar2.U.b(true);
                AndroidUtilities.runOnUIThread(new gv(gyVar2, 3), 100L);
                break;
            case 2:
                gy gyVar3 = this.b;
                if (gyVar3.C0 && (ywVar = gyVar3.A0) != null && !ywVar.g()) {
                    gyVar3.x4(true, true);
                    break;
                } else {
                    gyVar3.P4();
                    break;
                }
                break;
            case 3:
                gy gyVar4 = this.b;
                if (gyVar4.C0 && (ywVar2 = gyVar4.A0) != null && !ywVar2.g()) {
                    gyVar4.x4(true, true);
                    break;
                } else {
                    gyVar4.P4();
                    break;
                }
                break;
            case 4:
                gy gyVar5 = this.b;
                gyVar5.getClass();
                Bundle bundle = new Bundle();
                bundle.putLong("community_id", gyVar5.T2);
                gyVar5.presentFragment(new oh.r(bundle));
                break;
            case 5:
                gy gyVar6 = this.b;
                ArrayList arrayList4 = gyVar6.E2;
                if (gyVar6.y2 != null && !arrayList4.isEmpty()) {
                    ArrayList arrayList5 = new ArrayList();
                    for (int i11 = 0; i11 < arrayList4.size(); i11++) {
                        arrayList5.add(MessagesStorage.TopicKey.of(((Long) arrayList4.get(i11)).longValue(), 0L));
                    }
                    gyVar6.y2.w(gyVar6, arrayList5, gyVar6.x1.getFieldText(), false, gyVar6.F2, gyVar6.G2, gyVar6.H2, null);
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
                gy gyVar7 = this.b;
                gyVar7.v0.setIsEditing(false);
                gyVar7.I4(false);
                break;
            case 9:
                gy gyVar8 = this.b;
                gyVar8.getClass();
                gyVar8.showDialog(new ag.g2((org.telegram.ui.ActionBar.n2) gyVar8, 2, true));
                break;
            case 10:
                gy gyVar9 = this.b;
                gyVar9.getContactsController().loadGlobalPrivacySetting();
                gyVar9.K4();
                break;
            case 11:
                this.b.p4(view);
                break;
            case 12:
                gy.s0(this.b);
                break;
            case 13:
                gy.J0(this.b);
                break;
            case 14:
                gy.u0(this.b);
                break;
            case 15:
                gy gyVar10 = this.b;
                gyVar10.showDialog(org.telegram.ui.Components.y4.m(gyVar10.getParentActivity(), LocaleController.getString(R.string.EditProfileBirthdayTitle), LocaleController.getString(R.string.EditProfileBirthdayButton), null, new ov(gyVar10, 1), new gv(gyVar10, 17), false, false, gyVar10.getResourceProvider()).a);
                break;
            case 16:
                gy.C0(this.b);
                break;
            case 17:
                gy.z0(this.b);
                break;
            case 18:
                PremiumPreviewFragment premiumPreviewFragment = new PremiumPreviewFragment(0, "dialogs_hint");
                premiumPreviewFragment.f0 = true;
                gy gyVar11 = this.b;
                gyVar11.presentFragment(premiumPreviewFragment);
                AndroidUtilities.runOnUIThread(new gv(gyVar11, 21), 250L);
                break;
            case 19:
                gy.Z(this.b);
                break;
            case 20:
                PremiumPreviewFragment premiumPreviewFragment2 = new PremiumPreviewFragment(0, "dialogs_hint");
                premiumPreviewFragment2.f0 = true;
                gy gyVar12 = this.b;
                gyVar12.presentFragment(premiumPreviewFragment2);
                AndroidUtilities.runOnUIThread(new gv(gyVar12, 15), 250L);
                break;
            case 21:
                z6 z6Var = new z6();
                gy gyVar13 = this.b;
                gyVar13.presentFragment(z6Var);
                AndroidUtilities.runOnUIThread(new xv(gyVar13, 10), 250L);
                break;
            case 22:
                gy.D0(this.b);
                break;
            case 23:
                gy.Y(this.b);
                break;
            case 24:
                gy.l0(this.b);
                break;
            case 25:
                gy gyVar14 = this.b;
                we.e.s(gyVar14.getParentActivity(), gyVar14.getMessagesController().premiumManageSubscriptionUrl);
                break;
            case 26:
                gy.k0(this.b);
                break;
            case 27:
                gy.y0(this.b);
                break;
            default:
                gy.X(this.b);
                break;
        }
    }
}
