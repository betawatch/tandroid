package org.telegram.ui;

import android.os.Bundle;
import android.view.View;
import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.ui.Components.CheckBox;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class hu implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ bx b;

    public /* synthetic */ hu(bx bxVar, int i7) {
        this.a = i7;
        this.b = bxVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        ArrayList arrayList;
        sv svVar;
        sv svVar2;
        int i7 = this.a;
        int i10 = 8;
        int i11 = 0;
        bx bxVar = this.b;
        switch (i7) {
            case 0:
                if (bxVar.o4() && (arrayList = bxVar.F2) != null && !arrayList.isEmpty() && bxVar.getParentActivity() != null) {
                    org.telegram.messenger.ef efVar = (org.telegram.messenger.ef) bxVar.F2.get(0);
                    mv mvVar = bxVar.D1;
                    CharSequence fieldText = mvVar != null ? mvVar.getFieldText() : efVar.a;
                    ArrayList arrayList2 = bxVar.F2;
                    int size = arrayList2.size();
                    while (i11 < size) {
                        Object obj = arrayList2.get(i11);
                        i11++;
                        ((org.telegram.messenger.ef) obj).a = fieldText;
                    }
                    PhotoViewer.p1().J2(null, bxVar, bxVar.getResourceProvider());
                    PhotoViewer.p1().v7 = true;
                    PhotoViewer.p1().w7 = fieldText;
                    ArrayList arrayList3 = new ArrayList(bxVar.F2);
                    boolean[] zArr = new boolean[bxVar.F2.size()];
                    Arrays.fill(zArr, true);
                    PhotoViewer.p1().g2(arrayList3, 0, 0, false, new gw(bxVar, zArr), null);
                    PhotoViewer p12 = PhotoViewer.p1();
                    p12.f4 = true;
                    CheckBox checkBox = p12.O0;
                    if (checkBox != null) {
                        checkBox.setVisibility(8);
                    }
                    PhotoViewer.CounterView counterView = p12.P0;
                    if (counterView != null) {
                        counterView.setVisibility(8);
                        break;
                    }
                }
                break;
            case 1:
                if (bxVar.H0 && (svVar = bxVar.F0) != null && !svVar.g()) {
                    bxVar.R4(true, true);
                    break;
                } else {
                    bxVar.j5();
                    break;
                }
                break;
            case 2:
                if (bxVar.H0 && (svVar2 = bxVar.F0) != null && !svVar2.g()) {
                    bxVar.R4(true, true);
                    break;
                } else {
                    bxVar.j5();
                    break;
                }
                break;
            case 3:
                bxVar.i5(true, false, true, false);
                bxVar.Z.b(true);
                org.telegram.messenger.g0.h3(new fu(bxVar, 16), 100L);
                break;
            case 4:
                bxVar.getClass();
                Bundle bundle = new Bundle();
                bundle.putLong("community_id", bxVar.a3);
                bxVar.presentFragment(new li.r(bundle));
                break;
            case 5:
                bx bxVar2 = this.b;
                ArrayList arrayList4 = bxVar2.K2;
                if (bxVar2.E2 != null && !arrayList4.isEmpty()) {
                    bxVar2.O2 = false;
                    ArrayList arrayList5 = new ArrayList();
                    while (i11 < arrayList4.size()) {
                        arrayList5.add(org.telegram.messenger.sr.a(((Long) arrayList4.get(i11)).longValue(), 0L));
                        i11++;
                    }
                    bxVar2.E2.z(bxVar2, arrayList5, bxVar2.D1.getFieldText(), false, bxVar2.L2, bxVar2.M2, bxVar2.N2, null);
                    break;
                }
                break;
            case 6:
                bxVar.p4(true);
                break;
            case 7:
                bxVar.finishPreviewFragment();
                break;
            case 8:
                bxVar.A0.setIsEditing(false);
                bxVar.c5(false);
                break;
            case 9:
                bxVar.getClass();
                bxVar.showDialog(new ug.y0((org.telegram.ui.ActionBar.g2) bxVar, 2, true));
                break;
            case 10:
                bxVar.getContactsController().B();
                bxVar.e5();
                break;
            case 11:
                bxVar.G4(view);
                break;
            case 12:
                bx.q0(bxVar);
                break;
            case 13:
                bx.x0(bxVar);
                break;
            case 14:
                bx.u0(bxVar);
                break;
            case 15:
                bxVar.showDialog((org.telegram.ui.ActionBar.w2) org.telegram.ui.Components.b5.l(bxVar.getParentActivity(), org.telegram.messenger.gd.N0(2131751226, null), org.telegram.messenger.gd.N0(2131751231, null), null, new gu(bxVar, 1), new yu(bxVar, 12), false, false, bxVar.getResourceProvider()).b);
                break;
            case 16:
                bx.B0(bxVar);
                break;
            case 17:
                bx.v0(bxVar);
                break;
            case 18:
                PremiumPreviewFragment premiumPreviewFragment = new PremiumPreviewFragment(0, "dialogs_hint");
                premiumPreviewFragment.k0 = true;
                bxVar.presentFragment(premiumPreviewFragment);
                org.telegram.messenger.g0.h3(new fu(bxVar, 10), 250L);
                break;
            case 19:
                bx.y0(bxVar);
                break;
            case 20:
                PremiumPreviewFragment premiumPreviewFragment2 = new PremiumPreviewFragment(0, "dialogs_hint");
                premiumPreviewFragment2.k0 = true;
                bxVar.presentFragment(premiumPreviewFragment2);
                org.telegram.messenger.g0.h3(new yu(bxVar, i10), 250L);
                break;
            case 21:
                bxVar.presentFragment(new y6());
                org.telegram.messenger.g0.h3(new yu(bxVar, 6), 250L);
                break;
            case 22:
                bx.Z(bxVar);
                break;
            case 23:
                bx.e0(bxVar);
                break;
            case 24:
                bx.m0(bxVar);
                break;
            case 25:
                vf.c.t(bxVar.getParentActivity(), bxVar.getMessagesController().O5);
                break;
            case 26:
                bx.I0(bxVar);
                break;
            case 27:
                bx.A0(bxVar);
                break;
            default:
                bx.b0(bxVar);
                break;
        }
    }
}
