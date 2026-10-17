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

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final /* synthetic */ class hv implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ ey b;

    public /* synthetic */ hv(ey eyVar, int i10) {
        this.a = i10;
        this.b = eyVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        ArrayList arrayList;
        vw vwVar;
        vw vwVar2;
        switch (this.a) {
            case 0:
                ey eyVar = this.b;
                if (eyVar.Y3() && (arrayList = eyVar.D2) != null && !arrayList.isEmpty() && eyVar.getParentActivity() != null) {
                    int i10 = 0;
                    MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) eyVar.D2.get(0);
                    ow owVar = eyVar.B1;
                    CharSequence fieldText = owVar != null ? owVar.getFieldText() : photoEntry.caption;
                    ArrayList arrayList2 = eyVar.D2;
                    int size = arrayList2.size();
                    while (i10 < size) {
                        Object obj = arrayList2.get(i10);
                        i10++;
                        ((MediaController.PhotoEntry) obj).caption = fieldText;
                    }
                    PhotoViewer.t1().K2(null, eyVar, eyVar.getResourceProvider());
                    PhotoViewer.t1().p7 = true;
                    PhotoViewer.t1().q7 = fieldText;
                    ArrayList arrayList3 = new ArrayList(eyVar.D2);
                    boolean[] zArr = new boolean[eyVar.D2.size()];
                    Arrays.fill(zArr, true);
                    PhotoViewer.t1().g2(arrayList3, 0, 0, false, new kx(eyVar, zArr), null);
                    PhotoViewer t12 = PhotoViewer.t1();
                    t12.f4 = true;
                    CheckBox checkBox = t12.N0;
                    if (checkBox != null) {
                        checkBox.setVisibility(8);
                    }
                    PhotoViewer.CounterView counterView = t12.O0;
                    if (counterView != null) {
                        counterView.setVisibility(8);
                        break;
                    }
                }
                break;
            case 1:
                ey eyVar2 = this.b;
                eyVar2.M4(true, false, true, false);
                eyVar2.Y.b(true);
                AndroidUtilities.runOnUIThread(new dv(eyVar2, 3), 100L);
                break;
            case 2:
                ey eyVar3 = this.b;
                if (eyVar3.G0 && (vwVar = eyVar3.E0) != null && !vwVar.g()) {
                    eyVar3.v4(true, true);
                    break;
                } else {
                    eyVar3.N4();
                    break;
                }
                break;
            case 3:
                ey eyVar4 = this.b;
                if (eyVar4.G0 && (vwVar2 = eyVar4.E0) != null && !vwVar2.g()) {
                    eyVar4.v4(true, true);
                    break;
                } else {
                    eyVar4.N4();
                    break;
                }
            case 4:
                ey eyVar5 = this.b;
                eyVar5.getClass();
                Bundle bundle = new Bundle();
                bundle.putLong("community_id", eyVar5.Y2);
                eyVar5.presentFragment(new hi.r(bundle));
                break;
            case 5:
                ey eyVar6 = this.b;
                ArrayList arrayList4 = eyVar6.I2;
                if (eyVar6.C2 != null && !arrayList4.isEmpty()) {
                    eyVar6.M2 = false;
                    ArrayList arrayList5 = new ArrayList();
                    for (int i11 = 0; i11 < arrayList4.size(); i11++) {
                        arrayList5.add(MessagesStorage.TopicKey.of(((Long) arrayList4.get(i11)).longValue(), 0L));
                    }
                    eyVar6.C2.w(eyVar6, arrayList5, eyVar6.B1.getFieldText(), false, eyVar6.J2, eyVar6.K2, eyVar6.L2, null);
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
                ey eyVar7 = this.b;
                eyVar7.z0.setIsEditing(false);
                eyVar7.G4(false);
                break;
            case 9:
                ey eyVar8 = this.b;
                eyVar8.getClass();
                eyVar8.showDialog(new sg.x0((org.telegram.ui.ActionBar.n2) eyVar8, 2, true));
                break;
            case 10:
                ey eyVar9 = this.b;
                eyVar9.getContactsController().loadGlobalPrivacySetting();
                eyVar9.I4();
                break;
            case 11:
                this.b.n4(view);
                break;
            case 12:
                ey.r0(this.b);
                break;
            case 13:
                ey.F0(this.b);
                break;
            case 14:
                ey.t0(this.b);
                break;
            case 15:
                ey eyVar10 = this.b;
                eyVar10.showDialog(org.telegram.ui.Components.f5.l(eyVar10.getParentActivity(), LocaleController.getString(R.string.EditProfileBirthdayTitle), LocaleController.getString(R.string.EditProfileBirthdayButton), null, new jv(eyVar10, 1), new dv(eyVar10, 18), false, false, eyVar10.getResourceProvider()).a);
                break;
            case 16:
                ey.A0(this.b);
                break;
            case 17:
                ey.y0(this.b);
                break;
            case 18:
                PremiumPreviewFragment premiumPreviewFragment = new PremiumPreviewFragment(0, "dialogs_hint");
                premiumPreviewFragment.j0 = true;
                ey eyVar11 = this.b;
                eyVar11.presentFragment(premiumPreviewFragment);
                AndroidUtilities.runOnUIThread(new dv(eyVar11, 22), 250L);
                break;
            case 19:
                ey.Z(this.b);
                break;
            case 20:
                PremiumPreviewFragment premiumPreviewFragment2 = new PremiumPreviewFragment(0, "dialogs_hint");
                premiumPreviewFragment2.j0 = true;
                ey eyVar12 = this.b;
                eyVar12.presentFragment(premiumPreviewFragment2);
                AndroidUtilities.runOnUIThread(new dv(eyVar12, 16), 250L);
                break;
            case 21:
                c7 c7Var = new c7();
                ey eyVar13 = this.b;
                eyVar13.presentFragment(c7Var);
                AndroidUtilities.runOnUIThread(new uv(eyVar13, 11), 250L);
                break;
            case 22:
                ey.B0(this.b);
                break;
            case 23:
                ey.X(this.b);
                break;
            case 24:
                ey.l0(this.b);
                break;
            case 25:
                ey eyVar14 = this.b;
                pf.d.r(eyVar14.getParentActivity(), eyVar14.getMessagesController().premiumManageSubscriptionUrl);
                break;
            case 26:
                ey.k0(this.b);
                break;
            case 27:
                ey.w0(this.b);
                break;
            default:
                ey.W(this.b);
                break;
        }
    }
}
