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

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes3.dex */
public final /* synthetic */ class gv implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ cy b;

    public /* synthetic */ gv(cy cyVar, int i10) {
        this.a = i10;
        this.b = cyVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        ArrayList arrayList;
        tw twVar;
        tw twVar2;
        switch (this.a) {
            case 0:
                cy cyVar = this.b;
                if (cyVar.Y3() && (arrayList = cyVar.D2) != null && !arrayList.isEmpty() && cyVar.getParentActivity() != null) {
                    int i10 = 0;
                    MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) cyVar.D2.get(0);
                    mw mwVar = cyVar.B1;
                    CharSequence fieldText = mwVar != null ? mwVar.getFieldText() : photoEntry.caption;
                    ArrayList arrayList2 = cyVar.D2;
                    int size = arrayList2.size();
                    while (i10 < size) {
                        Object obj = arrayList2.get(i10);
                        i10++;
                        ((MediaController.PhotoEntry) obj).caption = fieldText;
                    }
                    PhotoViewer.u1().M2(null, cyVar, cyVar.getResourceProvider());
                    PhotoViewer.u1().p7 = true;
                    PhotoViewer.u1().q7 = fieldText;
                    ArrayList arrayList3 = new ArrayList(cyVar.D2);
                    boolean[] zArr = new boolean[cyVar.D2.size()];
                    Arrays.fill(zArr, true);
                    PhotoViewer.u1().i2(arrayList3, 0, 0, false, new ix(cyVar, zArr), null);
                    PhotoViewer u12 = PhotoViewer.u1();
                    u12.f4 = true;
                    CheckBox checkBox = u12.N0;
                    if (checkBox != null) {
                        checkBox.setVisibility(8);
                    }
                    PhotoViewer.CounterView counterView = u12.O0;
                    if (counterView != null) {
                        counterView.setVisibility(8);
                        break;
                    }
                }
                break;
            case 1:
                cy cyVar2 = this.b;
                cyVar2.M4(true, false, true, false);
                cyVar2.Y.b(true);
                AndroidUtilities.runOnUIThread(new cv(cyVar2, 3), 100L);
                break;
            case 2:
                cy cyVar3 = this.b;
                if (cyVar3.G0 && (twVar = cyVar3.E0) != null && !twVar.g()) {
                    cyVar3.v4(true, true);
                    break;
                } else {
                    cyVar3.N4();
                    break;
                }
                break;
            case 3:
                cy cyVar4 = this.b;
                if (cyVar4.G0 && (twVar2 = cyVar4.E0) != null && !twVar2.g()) {
                    cyVar4.v4(true, true);
                    break;
                } else {
                    cyVar4.N4();
                    break;
                }
            case 4:
                cy cyVar5 = this.b;
                cyVar5.getClass();
                Bundle bundle = new Bundle();
                bundle.putLong("community_id", cyVar5.Y2);
                cyVar5.presentFragment(new hi.r(bundle));
                break;
            case 5:
                cy cyVar6 = this.b;
                ArrayList arrayList4 = cyVar6.I2;
                if (cyVar6.C2 != null && !arrayList4.isEmpty()) {
                    cyVar6.M2 = false;
                    ArrayList arrayList5 = new ArrayList();
                    for (int i11 = 0; i11 < arrayList4.size(); i11++) {
                        arrayList5.add(MessagesStorage.TopicKey.of(((Long) arrayList4.get(i11)).longValue(), 0L));
                    }
                    cyVar6.C2.w(cyVar6, arrayList5, cyVar6.B1.getFieldText(), false, cyVar6.J2, cyVar6.K2, cyVar6.L2, null);
                    break;
                }
                break;
            case 6:
                this.b.Z3(true);
                break;
            case 7:
                this.b.finishPreviewFragment();
                break;
            case 8:
                cy cyVar7 = this.b;
                cyVar7.z0.setIsEditing(false);
                cyVar7.G4(false);
                break;
            case 9:
                cy cyVar8 = this.b;
                cyVar8.getClass();
                cyVar8.showDialog(new sg.y0((org.telegram.ui.ActionBar.n2) cyVar8, 2, true));
                break;
            case 10:
                cy cyVar9 = this.b;
                cyVar9.getContactsController().loadGlobalPrivacySetting();
                cyVar9.I4();
                break;
            case 11:
                this.b.n4(view);
                break;
            case 12:
                cy.r0(this.b);
                break;
            case 13:
                cy.F0(this.b);
                break;
            case 14:
                cy.t0(this.b);
                break;
            case 15:
                cy cyVar10 = this.b;
                cyVar10.showDialog(org.telegram.ui.Components.f5.l(cyVar10.getParentActivity(), LocaleController.getString(R.string.EditProfileBirthdayTitle), LocaleController.getString(R.string.EditProfileBirthdayButton), null, new iv(cyVar10, 1), new cv(cyVar10, 18), false, false, cyVar10.getResourceProvider()).a);
                break;
            case 16:
                cy.A0(this.b);
                break;
            case 17:
                cy.y0(this.b);
                break;
            case 18:
                PremiumPreviewFragment premiumPreviewFragment = new PremiumPreviewFragment(0, "dialogs_hint");
                premiumPreviewFragment.j0 = true;
                cy cyVar11 = this.b;
                cyVar11.presentFragment(premiumPreviewFragment);
                AndroidUtilities.runOnUIThread(new cv(cyVar11, 22), 250L);
                break;
            case 19:
                cy.Z(this.b);
                break;
            case 20:
                PremiumPreviewFragment premiumPreviewFragment2 = new PremiumPreviewFragment(0, "dialogs_hint");
                premiumPreviewFragment2.j0 = true;
                cy cyVar12 = this.b;
                cyVar12.presentFragment(premiumPreviewFragment2);
                AndroidUtilities.runOnUIThread(new cv(cyVar12, 16), 250L);
                break;
            case 21:
                c7 c7Var = new c7();
                cy cyVar13 = this.b;
                cyVar13.presentFragment(c7Var);
                AndroidUtilities.runOnUIThread(new sv(cyVar13, 11), 250L);
                break;
            case 22:
                cy.B0(this.b);
                break;
            case 23:
                cy.X(this.b);
                break;
            case 24:
                cy.l0(this.b);
                break;
            case 25:
                cy cyVar14 = this.b;
                pf.d.r(cyVar14.getParentActivity(), cyVar14.getMessagesController().premiumManageSubscriptionUrl);
                break;
            case 26:
                cy.k0(this.b);
                break;
            case 27:
                cy.w0(this.b);
                break;
            default:
                cy.W(this.b);
                break;
        }
    }
}
