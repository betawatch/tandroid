// default package

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import java.util.ArrayList;
import org.telegram.messenger.a;
import org.telegram.messenger.beta.R;
import org.telegram.ui.ContactsActivity;
import org.telegram.ui.FiltersSetupActivity;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.ThemeActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class kh3 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ nk3 b;

    public /* synthetic */ kh3(nk3 nk3Var, byte b) {
        this.a = b;
        this.b = nk3Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:128:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x02f0  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0280  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        r7 r7Var;
        int i;
        int i2 = 0;
        switch (this.a) {
            case 0:
                this.b.presentFragment(new daa(null));
                break;
            case 1:
                nk3 nk3Var = this.b;
                if (!nk3Var.b3.collapsed_in_dialogs) {
                    nk3Var.getMessagesController().m5(nk3Var.a3, true);
                    nk3Var.finishFragment();
                    break;
                }
                break;
            case 2:
                nk3 nk3Var2 = this.b;
                if (nk3Var2.b3.collapsed_in_dialogs) {
                    nk3Var2.getMessagesController().m5(nk3Var2.a3, false);
                    nk3Var2.finishFragment();
                    break;
                }
                break;
            case 3:
                this.b.presentFragment(new ct());
                break;
            case 4:
                this.b.b5();
                break;
            case 5:
                nk3 nk3Var3 = this.b;
                if (!nk3.E4) {
                    nk3.E4 = true;
                    SharedPreferences sharedPreferences = a.b.getSharedPreferences("themeconfig", 0);
                    String str = "Blue";
                    String string = sharedPreferences.getString("lastDayTheme", "Blue");
                    if (cmb.O0(string) == null || cmb.O0(string).o()) {
                        string = "Blue";
                    }
                    String str2 = "Dark Blue";
                    String string2 = sharedPreferences.getString("lastDarkTheme", "Dark Blue");
                    if (cmb.O0(string2) == null || !cmb.O0(string2).o()) {
                        string2 = "Dark Blue";
                    }
                    bmb bmbVar = cmb.I;
                    if (!string.equals(string2)) {
                        str2 = string2;
                    } else if (bmbVar.o() || string.equals("Dark Blue") || string.equals("Night")) {
                        str2 = string2;
                        boolean equals = str.equals(bmbVar.k());
                        bmb O0 = !equals ? cmb.O0(str2) : cmb.O0(str);
                        r7Var = nk3Var3.l0;
                        if (r7Var != null) {
                            int[] iArr = {(nk3Var3.l0.getIconView().getMeasuredWidth() / 2) + r3, (nk3Var3.l0.getIconView().getMeasuredHeight() / 2) + r3};
                            r7Var.getLocationInWindow(iArr);
                            int i3 = iArr[0];
                            int i4 = iArr[1];
                            nm7.e().k(nm7.x4, O0, Boolean.FALSE, iArr, -1, Boolean.valueOf(equals), null, null, null, Boolean.TRUE);
                        }
                        c41 b0 = c41.b0(nk3Var3);
                        kh3 kh3Var = new kh3(nk3Var3, (byte) 20);
                        i = cmb.o;
                        if (i == 0) {
                            if (b0 != null) {
                                try {
                                    b0.J(R.raw.auto_night_off, i == 3 ? jb6.M0(2131753750, "AutoNightSystemModeOff") : jb6.M0(2131753755, "AutoNightModeOff"), jb6.M0(2131745229, "Settings"), 5000, false, kh3Var).j();
                                } catch (Exception e) {
                                    fc4.g(e, true);
                                }
                            }
                            cmb.o = 0;
                            cmb.u1();
                            cmb.A();
                            break;
                        }
                    }
                    str = string;
                    boolean equals2 = str.equals(bmbVar.k());
                    if (!equals2) {
                    }
                    r7Var = nk3Var3.l0;
                    if (r7Var != null) {
                    }
                    c41 b02 = c41.b0(nk3Var3);
                    kh3 kh3Var2 = new kh3(nk3Var3, (byte) 20);
                    i = cmb.o;
                    if (i == 0) {
                    }
                }
                break;
            case 6:
                this.b.presentFragment(new ContactsActivity(null));
                break;
            case 7:
                this.b.presentFragment(new ia1(null));
                break;
            case 8:
                this.b.presentFragment(new oc5(new Bundle()));
                break;
            case 9:
                this.b.a4();
                break;
            case 10:
                this.b.t4();
                break;
            case 11:
                this.b.q5();
                break;
            case 12:
                this.b.fragmentView.dispatchTouchEvent(gm.R());
                break;
            case 13:
                nk3 nk3Var4 = this.b;
                ArrayList arrayList = nk3Var4.K2;
                nk3Var4.O2 = true;
                if (nk3Var4.E2 != null && !arrayList.isEmpty()) {
                    ArrayList arrayList2 = new ArrayList();
                    while (i2 < arrayList.size()) {
                        arrayList2.add(bf7.a(((Long) arrayList.get(i2)).longValue(), 0L));
                        i2++;
                    }
                    nk3Var4.E2.q(nk3Var4, arrayList2, nk3Var4.D1.getFieldText(), false, nk3Var4.L2, nk3Var4.M2, nk3Var4.N2, null);
                    break;
                }
                break;
            case 14:
                nk3 nk3Var5 = this.b;
                ArrayList arrayList3 = nk3Var5.K2;
                nk3Var5.L2 = false;
                nk3Var5.O2 = false;
                if (nk3Var5.E2 != null && !arrayList3.isEmpty()) {
                    ArrayList arrayList4 = new ArrayList();
                    while (i2 < arrayList3.size()) {
                        arrayList4.add(bf7.a(((Long) arrayList3.get(i2)).longValue(), 0L));
                        i2++;
                    }
                    nk3Var5.E2.q(nk3Var5, arrayList4, nk3Var5.D1.getFieldText(), false, nk3Var5.L2, nk3Var5.M2, nk3Var5.N2, null);
                    break;
                }
                break;
            case 15:
                nk3 nk3Var6 = this.b;
                if (LaunchActivity.Q() != null) {
                    nk3Var6.presentFragment(new PremiumPreviewFragment(0, "noncontacts"));
                    break;
                }
                break;
            case 16:
                nk3 nk3Var7 = this.b;
                nk3Var7.Y.r.requestFocus();
                gm.E3(nk3Var7.Y.r);
                break;
            case 17:
                this.b.presentFragment(new FiltersSetupActivity());
                break;
            case 18:
                this.b.presentFragment(new ct());
                break;
            case 19:
                nk3 nk3Var8 = this.b;
                nk3Var8.getMessagesController().Q4(nk3Var8.x3(), false);
                break;
            case 20:
                this.b.presentFragment(new ThemeActivity(1));
                break;
            case 21:
                this.b.U4(false, true);
                break;
            case 22:
                nk3 nk3Var9 = this.b;
                mk3[] mk3VarArr = nk3Var9.f0;
                if (mk3VarArr != null) {
                    int length = mk3VarArr.length;
                    while (i2 < length) {
                        mk3VarArr[i2].a.requestLayout();
                        i2++;
                    }
                }
                nk3Var9.o5();
                View view = nk3Var9.fragmentView;
                if (view != null) {
                    view.invalidate();
                    break;
                }
                break;
            case 23:
                nk3 nk3Var10 = this.b;
                cf7 messagesStorage = nk3Var10.getMessagesStorage();
                messagesStorage.a.c(new xd7(messagesStorage, (byte) 16));
                Toast.makeText(nk3Var10.getParentActivity(), jb6.M0(2131751588, null), 0).show();
                break;
            case 24:
                oc7 messagesController = this.b.getMessagesController();
                messagesController.u1.b();
                messagesController.v1.b();
                break;
            case 25:
                nk3 nk3Var11 = this.b;
                sj3 sj3Var = nk3Var11.D0;
                if (sj3Var != null && sj3Var.B0) {
                    sj3Var.R(false);
                    break;
                } else {
                    nk3Var11.Y.r.getText().clear();
                    gm.t1(nk3Var11.Y.r);
                    nk3Var11.Y.r.clearFocus();
                    nk3Var11.Z.b(false);
                    break;
                }
            case 26:
                nk3 nk3Var12 = this.b;
                if (nk3Var12.T0 != 10) {
                    nk3Var12.B3(false);
                }
                if (!nk3Var12.M || !nk3Var12.v3().H()) {
                    nk3Var12.R4(true, true);
                    break;
                } else {
                    nk3Var12.F0.h();
                    break;
                }
                break;
            case 27:
                nk3 nk3Var13 = this.b;
                va2 va2Var = nk3Var13.A1;
                if (va2Var != null) {
                    va2Var.d();
                }
                nk3Var13.O2();
                nk3Var13.P2();
                vi3 vi3Var = nk3Var13.E1;
                if (vi3Var != null) {
                    vi3Var.setTranslationY(-nk3Var13.w.d());
                    break;
                }
                break;
            case 28:
                this.b.w4();
                break;
            default:
                this.b.U3();
                break;
        }
    }
}
