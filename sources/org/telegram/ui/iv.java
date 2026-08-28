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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class iv implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ dy b;

    public /* synthetic */ iv(dy dyVar, int i9) {
        this.a = i9;
        this.b = dyVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        ArrayList arrayList;
        vw vwVar;
        vw vwVar2;
        switch (this.a) {
            case 0:
                dy dyVar = this.b;
                if (dyVar.a4() && (arrayList = dyVar.z2) != null && !arrayList.isEmpty() && dyVar.getParentActivity() != null) {
                    int i9 = 0;
                    MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) dyVar.z2.get(0);
                    ow owVar = dyVar.x1;
                    CharSequence fieldText = owVar != null ? owVar.getFieldText() : photoEntry.caption;
                    ArrayList arrayList2 = dyVar.z2;
                    int size = arrayList2.size();
                    while (i9 < size) {
                        Object obj = arrayList2.get(i9);
                        i9++;
                        ((MediaController.PhotoEntry) obj).caption = fieldText;
                    }
                    PhotoViewer.t1().K2(null, dyVar, dyVar.getResourceProvider());
                    PhotoViewer.t1().l7 = true;
                    PhotoViewer.t1().m7 = fieldText;
                    ArrayList arrayList3 = new ArrayList(dyVar.z2);
                    boolean[] zArr = new boolean[dyVar.z2.size()];
                    Arrays.fill(zArr, true);
                    PhotoViewer.t1().f2(arrayList3, 0, 0, false, new jx(dyVar, zArr), null);
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
                dy dyVar2 = this.b;
                dyVar2.O4(true, false, true, false);
                dyVar2.U.b(true);
                AndroidUtilities.runOnUIThread(new dv(dyVar2, 3), 100L);
                break;
            case 2:
                dy dyVar3 = this.b;
                if (dyVar3.C0 && (vwVar = dyVar3.A0) != null && !vwVar.g()) {
                    dyVar3.x4(true, true);
                    break;
                } else {
                    dyVar3.P4();
                    break;
                }
                break;
            case 3:
                dy dyVar4 = this.b;
                if (dyVar4.C0 && (vwVar2 = dyVar4.A0) != null && !vwVar2.g()) {
                    dyVar4.x4(true, true);
                    break;
                } else {
                    dyVar4.P4();
                    break;
                }
                break;
            case 4:
                dy dyVar5 = this.b;
                dyVar5.getClass();
                Bundle bundle = new Bundle();
                bundle.putLong("community_id", dyVar5.T2);
                dyVar5.presentFragment(new nh.r(bundle));
                break;
            case 5:
                dy dyVar6 = this.b;
                ArrayList arrayList4 = dyVar6.E2;
                if (dyVar6.y2 != null && !arrayList4.isEmpty()) {
                    ArrayList arrayList5 = new ArrayList();
                    for (int i10 = 0; i10 < arrayList4.size(); i10++) {
                        arrayList5.add(MessagesStorage.TopicKey.of(((Long) arrayList4.get(i10)).longValue(), 0L));
                    }
                    dyVar6.y2.v(dyVar6, arrayList5, dyVar6.x1.getFieldText(), false, dyVar6.F2, dyVar6.G2, dyVar6.H2, null);
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
                dy dyVar7 = this.b;
                dyVar7.v0.setIsEditing(false);
                dyVar7.I4(false);
                break;
            case 9:
                dy dyVar8 = this.b;
                dyVar8.getClass();
                dyVar8.showDialog(new zf.x0((org.telegram.ui.ActionBar.o2) dyVar8, 2, true));
                break;
            case 10:
                dy dyVar9 = this.b;
                dyVar9.getContactsController().loadGlobalPrivacySetting();
                dyVar9.K4();
                break;
            case 11:
                this.b.p4(view);
                break;
            case 12:
                dy.r0(this.b);
                break;
            case 13:
                dy.I0(this.b);
                break;
            case 14:
                dy.t0(this.b);
                break;
            case 15:
                dy dyVar10 = this.b;
                dyVar10.showDialog(org.telegram.ui.Components.y4.m(dyVar10.getParentActivity(), LocaleController.getString(R.string.EditProfileBirthdayTitle), LocaleController.getString(R.string.EditProfileBirthdayButton), null, new lv(dyVar10, 1), new dv(dyVar10, 17), false, false, dyVar10.getResourceProvider()).a);
                break;
            case 16:
                dy.B0(this.b);
                break;
            case 17:
                dy.y0(this.b);
                break;
            case 18:
                PremiumPreviewFragment premiumPreviewFragment = new PremiumPreviewFragment(0, "dialogs_hint");
                premiumPreviewFragment.f0 = true;
                dy dyVar11 = this.b;
                dyVar11.presentFragment(premiumPreviewFragment);
                AndroidUtilities.runOnUIThread(new dv(dyVar11, 21), 250L);
                break;
            case 19:
                dy.Y(this.b);
                break;
            case 20:
                PremiumPreviewFragment premiumPreviewFragment2 = new PremiumPreviewFragment(0, "dialogs_hint");
                premiumPreviewFragment2.f0 = true;
                dy dyVar12 = this.b;
                dyVar12.presentFragment(premiumPreviewFragment2);
                AndroidUtilities.runOnUIThread(new dv(dyVar12, 15), 250L);
                break;
            case 21:
                y6 y6Var = new y6();
                dy dyVar13 = this.b;
                dyVar13.presentFragment(y6Var);
                AndroidUtilities.runOnUIThread(new uv(dyVar13, 10), 250L);
                break;
            case 22:
                dy.C0(this.b);
                break;
            case 23:
                dy.X(this.b);
                break;
            case 24:
                dy.k0(this.b);
                break;
            case 25:
                dy dyVar14 = this.b;
                ve.e.s(dyVar14.getParentActivity(), dyVar14.getMessagesController().premiumManageSubscriptionUrl);
                break;
            case 26:
                dy.j0(this.b);
                break;
            case 27:
                dy.x0(this.b);
                break;
            default:
                dy.W(this.b);
                break;
        }
    }
}
