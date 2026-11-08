package org.telegram.ui;

import android.os.Bundle;
import android.view.View;
import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.ui.Components.CheckBox;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class eu implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ ww b;

    public /* synthetic */ eu(ww wwVar, int i7) {
        this.a = i7;
        this.b = wwVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        ArrayList arrayList;
        pv pvVar;
        pv pvVar2;
        int i7 = this.a;
        int i10 = 0;
        int i11 = 1;
        ww wwVar = this.b;
        switch (i7) {
            case 0:
                if (wwVar.m4() && (arrayList = wwVar.D2) != null && !arrayList.isEmpty() && wwVar.getParentActivity() != null) {
                    org.telegram.messenger.gf gfVar = (org.telegram.messenger.gf) wwVar.D2.get(0);
                    jv jvVar = wwVar.B1;
                    CharSequence fieldText = jvVar != null ? jvVar.getFieldText() : gfVar.a;
                    ArrayList arrayList2 = wwVar.D2;
                    int size = arrayList2.size();
                    while (i10 < size) {
                        Object obj = arrayList2.get(i10);
                        i10++;
                        ((org.telegram.messenger.gf) obj).a = fieldText;
                    }
                    PhotoViewer.p1().H2(null, wwVar, wwVar.getResourceProvider());
                    PhotoViewer.p1().o7 = true;
                    PhotoViewer.p1().p7 = fieldText;
                    ArrayList arrayList3 = new ArrayList(wwVar.D2);
                    boolean[] zArr = new boolean[wwVar.D2.size()];
                    Arrays.fill(zArr, true);
                    PhotoViewer.p1().e2(arrayList3, 0, 0, false, new cw(wwVar, zArr), null);
                    PhotoViewer p12 = PhotoViewer.p1();
                    p12.e4 = true;
                    CheckBox checkBox = p12.N0;
                    if (checkBox != null) {
                        checkBox.setVisibility(8);
                    }
                    PhotoViewer.CounterView counterView = p12.O0;
                    if (counterView != null) {
                        counterView.setVisibility(8);
                        break;
                    }
                }
                break;
            case 1:
                if (wwVar.G0 && (pvVar = wwVar.E0) != null && !pvVar.g()) {
                    wwVar.J4(true, true);
                    break;
                } else {
                    wwVar.b5();
                    break;
                }
                break;
            case 2:
                if (wwVar.G0 && (pvVar2 = wwVar.E0) != null && !pvVar2.g()) {
                    wwVar.J4(true, true);
                    break;
                } else {
                    wwVar.b5();
                    break;
                }
                break;
            case 3:
                wwVar.a5(true, false, true, false);
                wwVar.Y.b(true);
                org.telegram.messenger.g0.i3(new cu(wwVar, 9), 100L);
                break;
            case 4:
                wwVar.getClass();
                Bundle bundle = new Bundle();
                bundle.putLong("community_id", wwVar.Y2);
                wwVar.presentFragment(new ii.s(bundle));
                break;
            case 5:
                ww wwVar2 = this.b;
                ArrayList arrayList4 = wwVar2.I2;
                if (wwVar2.C2 != null && !arrayList4.isEmpty()) {
                    wwVar2.M2 = false;
                    ArrayList arrayList5 = new ArrayList();
                    while (i10 < arrayList4.size()) {
                        arrayList5.add(org.telegram.messenger.xr.a(((Long) arrayList4.get(i10)).longValue(), 0L));
                        i10++;
                    }
                    wwVar2.C2.y(wwVar2, arrayList5, wwVar2.B1.getFieldText(), false, wwVar2.J2, wwVar2.K2, wwVar2.L2, null);
                    break;
                }
                break;
            case 6:
                wwVar.n4(true);
                break;
            case 7:
                wwVar.finishPreviewFragment();
                break;
            case 8:
                wwVar.z0.setIsEditing(false);
                wwVar.U4(false);
                break;
            case 9:
                wwVar.getClass();
                wwVar.showDialog(new ug.w0((org.telegram.ui.ActionBar.f2) wwVar, 2, true));
                break;
            case 10:
                wwVar.getContactsController().B();
                wwVar.W4();
                break;
            case 11:
                wwVar.B4(view);
                break;
            case 12:
                ww.w0(wwVar);
                break;
            case 13:
                ww.K0(wwVar);
                break;
            case 14:
                ww.y0(wwVar);
                break;
            case 15:
                wwVar.showDialog((org.telegram.ui.ActionBar.v2) org.telegram.ui.Components.v4.l(wwVar.getParentActivity(), org.telegram.messenger.id.M0(2131751239, null), org.telegram.messenger.id.M0(2131751244, null), null, new hu(wwVar, 1), new cu(wwVar, 3), false, false, wwVar.getResourceProvider()).b);
                break;
            case 16:
                ww.D0(wwVar);
                break;
            case 17:
                ww.B0(wwVar);
                break;
            case 18:
                PremiumPreviewFragment premiumPreviewFragment = new PremiumPreviewFragment(0, "dialogs_hint");
                premiumPreviewFragment.j0 = true;
                wwVar.presentFragment(premiumPreviewFragment);
                org.telegram.messenger.g0.i3(new cu(wwVar, 7), 250L);
                break;
            case 19:
                ww.d0(wwVar);
                break;
            case 20:
                PremiumPreviewFragment premiumPreviewFragment2 = new PremiumPreviewFragment(0, "dialogs_hint");
                premiumPreviewFragment2.j0 = true;
                wwVar.presentFragment(premiumPreviewFragment2);
                org.telegram.messenger.g0.i3(new cu(wwVar, i11), 250L);
                break;
            case 21:
                wwVar.presentFragment(new y6());
                org.telegram.messenger.g0.i3(new cu(wwVar, 27), 250L);
                break;
            case 22:
                ww.E0(wwVar);
                break;
            case 23:
                ww.c0(wwVar);
                break;
            case 24:
                ww.o0(wwVar);
                break;
            case 25:
                vf.c.t(wwVar.getParentActivity(), wwVar.getMessagesController().L5);
                break;
            case 26:
                ww.n0(wwVar);
                break;
            case 27:
                ww.A0(wwVar);
                break;
            default:
                ww.b0(wwVar);
                break;
        }
    }
}
