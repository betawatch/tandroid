package org.telegram.ui;

import android.os.Bundle;
import android.view.View;
import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.ui.Components.CheckBox;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class gu implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ yw b;

    public /* synthetic */ gu(yw ywVar, int i7) {
        this.a = i7;
        this.b = ywVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        ArrayList arrayList;
        qv qvVar;
        qv qvVar2;
        int i7 = this.a;
        int i10 = 0;
        int i11 = 1;
        yw ywVar = this.b;
        switch (i7) {
            case 0:
                if (ywVar.m4() && (arrayList = ywVar.F2) != null && !arrayList.isEmpty() && ywVar.getParentActivity() != null) {
                    org.telegram.messenger.ff ffVar = (org.telegram.messenger.ff) ywVar.F2.get(0);
                    kv kvVar = ywVar.D1;
                    CharSequence fieldText = kvVar != null ? kvVar.getFieldText() : ffVar.a;
                    ArrayList arrayList2 = ywVar.F2;
                    int size = arrayList2.size();
                    while (i10 < size) {
                        Object obj = arrayList2.get(i10);
                        i10++;
                        ((org.telegram.messenger.ff) obj).a = fieldText;
                    }
                    PhotoViewer.p1().I2(null, ywVar, ywVar.getResourceProvider());
                    PhotoViewer.p1().p7 = true;
                    PhotoViewer.p1().q7 = fieldText;
                    ArrayList arrayList3 = new ArrayList(ywVar.F2);
                    boolean[] zArr = new boolean[ywVar.F2.size()];
                    Arrays.fill(zArr, true);
                    PhotoViewer.p1().f2(arrayList3, 0, 0, false, new ew(ywVar, zArr), null);
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
                if (ywVar.H0 && (qvVar = ywVar.F0) != null && !qvVar.g()) {
                    ywVar.J4(true, true);
                    break;
                } else {
                    ywVar.b5();
                    break;
                }
                break;
            case 2:
                if (ywVar.H0 && (qvVar2 = ywVar.F0) != null && !qvVar2.g()) {
                    ywVar.J4(true, true);
                    break;
                } else {
                    ywVar.b5();
                    break;
                }
                break;
            case 3:
                ywVar.a5(true, false, true, false);
                ywVar.Z.b(true);
                org.telegram.messenger.g0.i3(new eu(ywVar, 9), 100L);
                break;
            case 4:
                ywVar.getClass();
                Bundle bundle = new Bundle();
                bundle.putLong("community_id", ywVar.a3);
                ywVar.presentFragment(new li.r(bundle));
                break;
            case 5:
                yw ywVar2 = this.b;
                ArrayList arrayList4 = ywVar2.K2;
                if (ywVar2.E2 != null && !arrayList4.isEmpty()) {
                    ywVar2.O2 = false;
                    ArrayList arrayList5 = new ArrayList();
                    while (i10 < arrayList4.size()) {
                        arrayList5.add(org.telegram.messenger.ur.a(((Long) arrayList4.get(i10)).longValue(), 0L));
                        i10++;
                    }
                    ywVar2.E2.y(ywVar2, arrayList5, ywVar2.D1.getFieldText(), false, ywVar2.L2, ywVar2.M2, ywVar2.N2, null);
                    break;
                }
                break;
            case 6:
                ywVar.n4(true);
                break;
            case 7:
                ywVar.finishPreviewFragment();
                break;
            case 8:
                ywVar.A0.setIsEditing(false);
                ywVar.U4(false);
                break;
            case 9:
                ywVar.getClass();
                ywVar.showDialog(new ug.x0((org.telegram.ui.ActionBar.e2) ywVar, 2, true));
                break;
            case 10:
                ywVar.getContactsController().B();
                ywVar.W4();
                break;
            case 11:
                ywVar.B4(view);
                break;
            case 12:
                yw.w0(ywVar);
                break;
            case 13:
                yw.K0(ywVar);
                break;
            case 14:
                yw.y0(ywVar);
                break;
            case 15:
                ywVar.showDialog((org.telegram.ui.ActionBar.u2) org.telegram.ui.Components.t4.l(ywVar.getParentActivity(), org.telegram.messenger.hd.M0(2131751238, null), org.telegram.messenger.hd.M0(2131751243, null), null, new ju(ywVar, 1), new eu(ywVar, 3), false, false, ywVar.getResourceProvider()).b);
                break;
            case 16:
                yw.D0(ywVar);
                break;
            case 17:
                yw.B0(ywVar);
                break;
            case 18:
                PremiumPreviewFragment premiumPreviewFragment = new PremiumPreviewFragment(0, "dialogs_hint");
                premiumPreviewFragment.k0 = true;
                ywVar.presentFragment(premiumPreviewFragment);
                org.telegram.messenger.g0.i3(new eu(ywVar, 7), 250L);
                break;
            case 19:
                yw.d0(ywVar);
                break;
            case 20:
                PremiumPreviewFragment premiumPreviewFragment2 = new PremiumPreviewFragment(0, "dialogs_hint");
                premiumPreviewFragment2.k0 = true;
                ywVar.presentFragment(premiumPreviewFragment2);
                org.telegram.messenger.g0.i3(new eu(ywVar, i11), 250L);
                break;
            case 21:
                ywVar.presentFragment(new y6());
                org.telegram.messenger.g0.i3(new eu(ywVar, 27), 250L);
                break;
            case 22:
                yw.E0(ywVar);
                break;
            case 23:
                yw.c0(ywVar);
                break;
            case 24:
                yw.o0(ywVar);
                break;
            case 25:
                vf.c.t(ywVar.getParentActivity(), ywVar.getMessagesController().M5);
                break;
            case 26:
                yw.n0(ywVar);
                break;
            case 27:
                yw.A0(ywVar);
                break;
            default:
                yw.b0(ywVar);
                break;
        }
    }
}
