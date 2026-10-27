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

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class jv implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ ey b;

    public /* synthetic */ jv(ey eyVar, int i10) {
        this.a = i10;
        this.b = eyVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        ArrayList arrayList;
        sw swVar;
        sw swVar2;
        switch (this.a) {
            case 0:
                ey eyVar = this.b;
                if (eyVar.i4() && (arrayList = eyVar.D2) != null && !arrayList.isEmpty() && eyVar.getParentActivity() != null) {
                    int i10 = 0;
                    MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) eyVar.D2.get(0);
                    lw lwVar = eyVar.B1;
                    CharSequence fieldText = lwVar != null ? lwVar.getFieldText() : photoEntry.caption;
                    ArrayList arrayList2 = eyVar.D2;
                    int size = arrayList2.size();
                    while (i10 < size) {
                        Object obj = arrayList2.get(i10);
                        i10++;
                        ((MediaController.PhotoEntry) obj).caption = fieldText;
                    }
                    PhotoViewer.v1().N2(null, eyVar, eyVar.getResourceProvider());
                    PhotoViewer.v1().p7 = true;
                    PhotoViewer.v1().q7 = fieldText;
                    ArrayList arrayList3 = new ArrayList(eyVar.D2);
                    boolean[] zArr = new boolean[eyVar.D2.size()];
                    Arrays.fill(zArr, true);
                    PhotoViewer.v1().j2(arrayList3, 0, 0, false, new hx(eyVar, zArr), null);
                    PhotoViewer v12 = PhotoViewer.v1();
                    v12.f4 = true;
                    CheckBox checkBox = v12.N0;
                    if (checkBox != null) {
                        checkBox.setVisibility(8);
                    }
                    PhotoViewer.CounterView counterView = v12.O0;
                    if (counterView != null) {
                        counterView.setVisibility(8);
                        break;
                    }
                }
                break;
            case 1:
                ey eyVar2 = this.b;
                eyVar2.W4(true, false, true, false);
                eyVar2.Y.b(true);
                AndroidUtilities.runOnUIThread(new ev(eyVar2, 23), 100L);
                break;
            case 2:
                ey eyVar3 = this.b;
                if (eyVar3.G0 && (swVar = eyVar3.E0) != null && !swVar.g()) {
                    eyVar3.F4(true, true);
                    break;
                } else {
                    eyVar3.X4();
                    break;
                }
                break;
            case 3:
                ey eyVar4 = this.b;
                if (eyVar4.G0 && (swVar2 = eyVar4.E0) != null && !swVar2.g()) {
                    eyVar4.F4(true, true);
                    break;
                } else {
                    eyVar4.X4();
                    break;
                }
            case 4:
                ey eyVar5 = this.b;
                eyVar5.getClass();
                Bundle bundle = new Bundle();
                bundle.putLong("community_id", eyVar5.Y2);
                eyVar5.presentFragment(new ii.r(bundle));
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
                    eyVar6.C2.v(eyVar6, arrayList5, eyVar6.B1.getFieldText(), false, eyVar6.J2, eyVar6.K2, eyVar6.L2, null);
                    break;
                }
                break;
            case 6:
                this.b.finishPreviewFragment();
                break;
            case 7:
                this.b.j4(true);
                break;
            case 8:
                ey eyVar7 = this.b;
                eyVar7.z0.setIsEditing(false);
                eyVar7.Q4(false);
                break;
            case 9:
                ey eyVar8 = this.b;
                eyVar8.getClass();
                eyVar8.showDialog(new tg.y0((org.telegram.ui.ActionBar.r2) eyVar8, 2, true));
                break;
            case 10:
                ey eyVar9 = this.b;
                eyVar9.getContactsController().loadGlobalPrivacySetting();
                eyVar9.S4();
                break;
            case 11:
                this.b.x4(view);
                break;
            case 12:
                ey.r0(this.b);
                break;
            case 13:
                ey.H0(this.b);
                break;
            case 14:
                ey.u0(this.b);
                break;
            case 15:
                ey eyVar10 = this.b;
                eyVar10.showDialog(org.telegram.ui.Components.g5.l(eyVar10.getParentActivity(), LocaleController.getString(R.string.EditProfileBirthdayTitle), LocaleController.getString(R.string.EditProfileBirthdayButton), null, new hv(eyVar10, 1), new ev(eyVar10, 17), false, false, eyVar10.getResourceProvider()).a);
                break;
            case 16:
                ey.B0(this.b);
                break;
            case 17:
                ey.y0(this.b);
                break;
            case 18:
                PremiumPreviewFragment premiumPreviewFragment = new PremiumPreviewFragment(0, "dialogs_hint");
                premiumPreviewFragment.j0 = true;
                ey eyVar11 = this.b;
                eyVar11.presentFragment(premiumPreviewFragment);
                AndroidUtilities.runOnUIThread(new ev(eyVar11, 21), 250L);
                break;
            case 19:
                ey.a0(this.b);
                break;
            case 20:
                PremiumPreviewFragment premiumPreviewFragment2 = new PremiumPreviewFragment(0, "dialogs_hint");
                premiumPreviewFragment2.j0 = true;
                ey eyVar12 = this.b;
                eyVar12.presentFragment(premiumPreviewFragment2);
                AndroidUtilities.runOnUIThread(new ev(eyVar12, 15), 250L);
                break;
            case 21:
                c7 c7Var = new c7();
                ey eyVar13 = this.b;
                eyVar13.presentFragment(c7Var);
                AndroidUtilities.runOnUIThread(new uv(eyVar13, 12), 250L);
                break;
            case 22:
                ey.C0(this.b);
                break;
            case 23:
                ey.Z(this.b);
                break;
            case 24:
                ey.x0(this.b);
                break;
            case 25:
                ey.k0(this.b);
                break;
            case 26:
                ey eyVar14 = this.b;
                qf.d.r(eyVar14.getParentActivity(), eyVar14.getMessagesController().premiumManageSubscriptionUrl);
                break;
            case 27:
                ey.j0(this.b);
                break;
            default:
                ey.Y(this.b);
                break;
        }
    }
}
