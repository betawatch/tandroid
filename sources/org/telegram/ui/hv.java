package org.telegram.ui;

import android.os.Bundle;
import android.view.View;
import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.ui.Components.CheckBox;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class hv implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ ay b;

    public /* synthetic */ hv(ay ayVar, int i10) {
        this.a = i10;
        this.b = ayVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        ArrayList arrayList;
        uw uwVar;
        uw uwVar2;
        int i10 = this.a;
        int i11 = 0;
        int i12 = 1;
        ay ayVar = this.b;
        switch (i10) {
            case 0:
                if (ayVar.l4() && (arrayList = ayVar.D2) != null && !arrayList.isEmpty() && ayVar.getParentActivity() != null) {
                    org.telegram.messenger.ef efVar = (org.telegram.messenger.ef) ayVar.D2.get(0);
                    ow owVar = ayVar.B1;
                    CharSequence fieldText = owVar != null ? owVar.getFieldText() : efVar.a;
                    ArrayList arrayList2 = ayVar.D2;
                    int size = arrayList2.size();
                    while (i11 < size) {
                        Object obj = arrayList2.get(i11);
                        i11++;
                        ((org.telegram.messenger.ef) obj).a = fieldText;
                    }
                    PhotoViewer.v1().N2(null, ayVar, ayVar.getResourceProvider());
                    PhotoViewer.v1().p7 = true;
                    PhotoViewer.v1().q7 = fieldText;
                    ArrayList arrayList3 = new ArrayList(ayVar.D2);
                    boolean[] zArr = new boolean[ayVar.D2.size()];
                    Arrays.fill(zArr, true);
                    PhotoViewer.v1().j2(arrayList3, 0, 0, false, new hx(ayVar, zArr), null);
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
                if (ayVar.G0 && (uwVar = ayVar.E0) != null && !uwVar.g()) {
                    ayVar.I4(true, true);
                    break;
                } else {
                    ayVar.a5();
                    break;
                }
                break;
            case 2:
                if (ayVar.G0 && (uwVar2 = ayVar.E0) != null && !uwVar2.g()) {
                    ayVar.I4(true, true);
                    break;
                } else {
                    ayVar.a5();
                    break;
                }
                break;
            case 3:
                ayVar.Z4(true, false, true, false);
                ayVar.Y.b(true);
                org.telegram.messenger.i0.h3(new fv(ayVar, 9), 100L);
                break;
            case 4:
                ayVar.getClass();
                Bundle bundle = new Bundle();
                bundle.putLong("community_id", ayVar.Y2);
                ayVar.presentFragment(new yh.q(bundle));
                break;
            case 5:
                ay ayVar2 = this.b;
                ArrayList arrayList4 = ayVar2.I2;
                if (ayVar2.C2 != null && !arrayList4.isEmpty()) {
                    ayVar2.M2 = false;
                    ArrayList arrayList5 = new ArrayList();
                    while (i11 < arrayList4.size()) {
                        arrayList5.add(org.telegram.messenger.gs.a(((Long) arrayList4.get(i11)).longValue(), 0L));
                        i11++;
                    }
                    ayVar2.C2.y(ayVar2, arrayList5, ayVar2.B1.getFieldText(), false, ayVar2.J2, ayVar2.K2, ayVar2.L2, null);
                    break;
                }
                break;
            case 6:
                ayVar.m4(true);
                break;
            case 7:
                ayVar.finishPreviewFragment();
                break;
            case 8:
                ayVar.z0.setIsEditing(false);
                ayVar.T4(false);
                break;
            case 9:
                ayVar.getClass();
                ayVar.showDialog(new kg.i1((org.telegram.ui.ActionBar.k2) ayVar, 2, true));
                break;
            case 10:
                ayVar.getContactsController().B();
                ayVar.V4();
                break;
            case 11:
                ayVar.A4(view);
                break;
            case 12:
                ay.v0(ayVar);
                break;
            case 13:
                ay.J0(ayVar);
                break;
            case 14:
                ay.x0(ayVar);
                break;
            case 15:
                ayVar.showDialog((org.telegram.ui.ActionBar.z2) org.telegram.ui.Components.s4.l(ayVar.getParentActivity(), org.telegram.messenger.cd.L0(2131751239, null), org.telegram.messenger.cd.L0(2131751244, null), null, new kv(ayVar, 1), new fv(ayVar, 3), false, false, ayVar.getResourceProvider()).b);
                break;
            case 16:
                ay.C0(ayVar);
                break;
            case 17:
                ay.A0(ayVar);
                break;
            case 18:
                PremiumPreviewFragment premiumPreviewFragment = new PremiumPreviewFragment(0, "dialogs_hint");
                premiumPreviewFragment.j0 = true;
                ayVar.presentFragment(premiumPreviewFragment);
                org.telegram.messenger.i0.h3(new fv(ayVar, 7), 250L);
                break;
            case 19:
                ay.c0(ayVar);
                break;
            case 20:
                PremiumPreviewFragment premiumPreviewFragment2 = new PremiumPreviewFragment(0, "dialogs_hint");
                premiumPreviewFragment2.j0 = true;
                ayVar.presentFragment(premiumPreviewFragment2);
                org.telegram.messenger.i0.h3(new fv(ayVar, i12), 250L);
                break;
            case 21:
                ayVar.presentFragment(new y6());
                org.telegram.messenger.i0.h3(new fv(ayVar, 27), 250L);
                break;
            case 22:
                ay.D0(ayVar);
                break;
            case 23:
                ay.b0(ayVar);
                break;
            case 24:
                ay.n0(ayVar);
                break;
            case 25:
                gf.f.r(ayVar.getParentActivity(), ayVar.getMessagesController().M5);
                break;
            case 26:
                ay.m0(ayVar);
                break;
            case 27:
                ay.z0(ayVar);
                break;
            default:
                ay.a0(ayVar);
                break;
        }
    }
}
