package kg;

import android.app.Dialog;
import android.content.DialogInterface;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.cd;
import org.telegram.messenger.hc;
import org.telegram.messenger.tz;
import org.telegram.messenger.vp;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.Components.mj0;
import org.telegram.ui.Components.nd;
import org.telegram.ui.Components.wb;
import org.telegram.ui.DataSettingsActivity;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.a7;
import org.telegram.ui.eu0;
import org.telegram.ui.ll0;
import org.telegram.ui.m91;
import org.telegram.ui.sm0;
import org.telegram.ui.un;
import org.telegram.ui.zt;
import th.e5;
import th.o7;
import th.u2;
import th.z2;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class z0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ z0(Object obj, Object obj2, boolean z10, Object obj3, int i10) {
        this.a = i10;
        this.c = obj;
        this.d = obj2;
        this.b = z10;
        this.e = obj3;
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00fd  */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onClick(View view) {
        TLRPC.TL_secureRequiredType tL_secureRequiredType;
        TLRPC.SecureValueType secureValueType;
        boolean z10;
        int size;
        int i10;
        int i11;
        int i12 = this.a;
        int i13 = 2;
        final boolean z11 = this.b;
        Object obj = this.e;
        Object obj2 = this.d;
        Object obj3 = this.c;
        switch (i12) {
            case 0:
                i1 i1Var = (i1) obj3;
                org.telegram.ui.ActionBar.k2 k2Var = (org.telegram.ui.ActionBar.k2) obj2;
                eu0 eu0Var = (eu0) obj;
                if (k2Var instanceof un) {
                    un unVar = (un) k2Var;
                    unVar.I7(true);
                    ag.v vVar = unVar.X1;
                    if (vVar != null) {
                        vVar.a(true);
                    }
                }
                org.telegram.ui.ActionBar.k2 Q = LaunchActivity.Q();
                int i14 = 0;
                while (i14 < 2) {
                    org.telegram.ui.ActionBar.k2 k2Var2 = i14 == 0 ? k2Var : Q;
                    if (k2Var2 != null && k2Var2.getLastStoryViewer() != null) {
                        o7 lastStoryViewer = k2Var2.getLastStoryViewer();
                        Dialog dialog = lastStoryViewer.u0;
                        if (dialog != null) {
                            dialog.dismiss();
                        }
                        org.telegram.ui.ActionBar.g2 g2Var = lastStoryViewer.v0;
                        if (g2Var != null) {
                            g2Var.dismiss();
                        }
                        z2 H = lastStoryViewer.H();
                        if (H != null) {
                            mj0 mj0Var = H.O1;
                            if (mj0Var != null && mj0Var.getReactionsWindow() != null) {
                                H.O1.getReactionsWindow().d();
                            }
                            th.z1 z1Var = H.I2;
                            if (z1Var != null) {
                                z1Var.dismiss();
                            }
                            H.L0();
                        }
                    }
                    if (k2Var2 != null && k2Var2.getVisibleDialog() != null) {
                        k2Var2.getVisibleDialog().dismiss();
                    }
                    i14++;
                }
                if (z11 || i1Var.w1) {
                    PremiumPreviewFragment premiumPreviewFragment = new PremiumPreviewFragment(0, PremiumPreviewFragment.p0(eu0Var.a));
                    if (k2Var instanceof m91) {
                        org.telegram.ui.ActionBar.i2 i2Var = new org.telegram.ui.ActionBar.i2();
                        i2Var.a = true;
                        k2Var.showAsSheet(premiumPreviewFragment, i2Var);
                    } else if (k2Var != null) {
                        k2Var.presentFragment(premiumPreviewFragment);
                    } else {
                        org.telegram.ui.ActionBar.k2 T = LaunchActivity.T();
                        if (T != null) {
                            T.presentFragment(premiumPreviewFragment);
                        }
                    }
                } else {
                    PremiumPreviewFragment.o0(k2Var, i1Var.A1, PremiumPreviewFragment.p0(eu0Var.a), null);
                }
                i1Var.dismiss();
                break;
            case 1:
                DataSettingsActivity dataSettingsActivity = (DataSettingsActivity) obj3;
                String str = (String) obj2;
                AlertDialog$Builder alertDialog$Builder = (AlertDialog$Builder) obj;
                if (!TextUtils.equals(tz.h0, str)) {
                    if (z11) {
                        tz.h0 = str;
                        tz.y();
                        tz.b = false;
                        dataSettingsActivity.r0(dataSettingsActivity.n);
                        hc.D().i(new zt(dataSettingsActivity, i13));
                        alertDialog$Builder.a.N0.run();
                        break;
                    } else {
                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(dataSettingsActivity.getParentActivity());
                        String L0 = cd.L0(2131751602, null);
                        org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder2.a;
                        x1Var.R = L0;
                        x1Var.T = cd.L0(2131745856, null);
                        alertDialog$Builder2.k(cd.L0(2131746758, null), new a7(dataSettingsActivity, str, alertDialog$Builder, 12));
                        i0.a.s(null, 2131753756, alertDialog$Builder2, null);
                        break;
                    }
                }
                break;
            case 2:
                final ll0 ll0Var = (ll0) obj3;
                final ArrayList arrayList = (ArrayList) obj2;
                final TLRPC.TL_secureRequiredType tL_secureRequiredType2 = (TLRPC.TL_secureRequiredType) obj;
                if (arrayList != null) {
                    int size2 = arrayList.size();
                    for (0; i11 < size2; i11 + 1) {
                        tL_secureRequiredType = (TLRPC.TL_secureRequiredType) arrayList.get(i11);
                        i11 = (ll0Var.u1(tL_secureRequiredType, false) == null && size2 != 1) ? i11 + 1 : 0;
                        secureValueType = tL_secureRequiredType2.type;
                        if (!(secureValueType instanceof TLRPC.TL_secureValueTypePersonalDetails) || (secureValueType instanceof TLRPC.TL_secureValueTypeAddress)) {
                            if (tL_secureRequiredType == null && arrayList != null && !arrayList.isEmpty()) {
                                AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(ll0Var.getParentActivity());
                                alertDialog$Builder3.k(cd.L0(2131752589, null), null);
                                TLRPC.SecureValueType secureValueType2 = tL_secureRequiredType2.type;
                                z10 = secureValueType2 instanceof TLRPC.TL_secureValueTypePersonalDetails;
                                org.telegram.ui.ActionBar.x1 x1Var2 = alertDialog$Builder3.a;
                                if (!z10) {
                                    x1Var2.R = cd.L0(2131747581, null);
                                } else if (secureValueType2 instanceof TLRPC.TL_secureValueTypeAddress) {
                                    x1Var2.R = cd.L0(2131747618, null);
                                }
                                ArrayList arrayList2 = new ArrayList();
                                size = arrayList.size();
                                for (i10 = 0; i10 < size; i10++) {
                                    TLRPC.SecureValueType secureValueType3 = ((TLRPC.TL_secureRequiredType) arrayList.get(i10)).type;
                                    if (secureValueType3 instanceof TLRPC.TL_secureValueTypeDriverLicense) {
                                        arrayList2.add(cd.L0(2131747631, null));
                                    } else if (secureValueType3 instanceof TLRPC.TL_secureValueTypePassport) {
                                        arrayList2.add(cd.L0(2131747630, null));
                                    } else if (secureValueType3 instanceof TLRPC.TL_secureValueTypeInternalPassport) {
                                        arrayList2.add(cd.L0(2131747633, null));
                                    } else if (secureValueType3 instanceof TLRPC.TL_secureValueTypeIdentityCard) {
                                        arrayList2.add(cd.L0(2131747636, null));
                                    } else if (secureValueType3 instanceof TLRPC.TL_secureValueTypeUtilityBill) {
                                        arrayList2.add(cd.L0(2131747638, null));
                                    } else if (secureValueType3 instanceof TLRPC.TL_secureValueTypeBankStatement) {
                                        arrayList2.add(cd.L0(2131747640, null));
                                    } else if (secureValueType3 instanceof TLRPC.TL_secureValueTypeRentalAgreement) {
                                        arrayList2.add(cd.L0(2131747642, null));
                                    } else if (secureValueType3 instanceof TLRPC.TL_secureValueTypeTemporaryRegistration) {
                                        arrayList2.add(cd.L0(2131747626, null));
                                    } else if (secureValueType3 instanceof TLRPC.TL_secureValueTypePassportRegistration) {
                                        arrayList2.add(cd.L0(2131747628, null));
                                    }
                                }
                                alertDialog$Builder3.f((CharSequence[]) arrayList2.toArray(new CharSequence[0]), new DialogInterface.OnClickListener() { // from class: org.telegram.ui.fk0
                                    @Override // android.content.DialogInterface.OnClickListener
                                    public final void onClick(DialogInterface dialogInterface, int i15) {
                                        ll0 ll0Var2 = ll0Var;
                                        ll0Var2.getClass();
                                        ArrayList arrayList3 = arrayList;
                                        ll0Var2.H1(tL_secureRequiredType2, (TLRPC.TL_secureRequiredType) arrayList3.get(i15), arrayList3, z11);
                                    }
                                });
                                ll0Var.showDialog(x1Var2);
                                break;
                            }
                        } else {
                            boolean z12 = secureValueType instanceof TLRPC.TL_secureValueTypePhone;
                            if ((z12 || (secureValueType instanceof TLRPC.TL_secureValueTypeEmail)) && ll0Var.u1(tL_secureRequiredType2, false) != null) {
                                AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(ll0Var.getParentActivity());
                                alertDialog$Builder4.k(cd.L0(2131747847, null), new ag.v0(ll0Var, tL_secureRequiredType2, z11, 9));
                                alertDialog$Builder4.h(cd.L0(2131752589, null), null);
                                String L02 = cd.L0(R.string.AppName, null);
                                org.telegram.ui.ActionBar.x1 x1Var3 = alertDialog$Builder4.a;
                                x1Var3.R = L02;
                                x1Var3.T = cd.L0(z12 ? 2131747601 : 2131747604, null);
                                ll0Var.showDialog(x1Var3);
                                break;
                            }
                        }
                        ll0Var.H1(tL_secureRequiredType2, tL_secureRequiredType, arrayList, z11);
                        break;
                    }
                }
                tL_secureRequiredType = null;
                secureValueType = tL_secureRequiredType2.type;
                if (!(secureValueType instanceof TLRPC.TL_secureValueTypePersonalDetails)) {
                }
                if (tL_secureRequiredType == null) {
                    AlertDialog$Builder alertDialog$Builder32 = new AlertDialog$Builder(ll0Var.getParentActivity());
                    alertDialog$Builder32.k(cd.L0(2131752589, null), null);
                    TLRPC.SecureValueType secureValueType22 = tL_secureRequiredType2.type;
                    z10 = secureValueType22 instanceof TLRPC.TL_secureValueTypePersonalDetails;
                    org.telegram.ui.ActionBar.x1 x1Var22 = alertDialog$Builder32.a;
                    if (!z10) {
                    }
                    ArrayList arrayList22 = new ArrayList();
                    size = arrayList.size();
                    while (i10 < size) {
                    }
                    alertDialog$Builder32.f((CharSequence[]) arrayList22.toArray(new CharSequence[0]), new DialogInterface.OnClickListener() { // from class: org.telegram.ui.fk0
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i15) {
                            ll0 ll0Var2 = ll0Var;
                            ll0Var2.getClass();
                            ArrayList arrayList3 = arrayList;
                            ll0Var2.H1(tL_secureRequiredType2, (TLRPC.TL_secureRequiredType) arrayList3.get(i15), arrayList3, z11);
                        }
                    });
                    ll0Var.showDialog(x1Var22);
                }
                ll0Var.H1(tL_secureRequiredType2, tL_secureRequiredType, arrayList, z11);
                break;
            case 3:
                sm0.k0((sm0) obj3, (wb) obj2, z11, (TLRPC.Message[]) obj);
                break;
            case 4:
                sm0.c0((sm0) obj3, (wb) obj2, z11, (TLRPC.Message) obj);
                break;
            default:
                u2 u2Var = (u2) obj3;
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) obj2;
                ArrayList arrayList3 = new ArrayList();
                arrayList3.add(storyItem);
                z2 z2Var = u2Var.x;
                e5 O1 = vp.r1(z2Var.l2).O1();
                long j10 = z2Var.k1;
                boolean z13 = this.b;
                O1.r0(j10, arrayList3, z13, new nd(u2Var, storyItem, z13, (p6) obj));
                u2 u2Var2 = z2Var.c1;
                if (u2Var2 != null) {
                    u2Var2.a();
                    break;
                }
                break;
        }
    }

    public /* synthetic */ z0(ArrayList arrayList, TLRPC.TL_secureRequiredType tL_secureRequiredType, ll0 ll0Var, boolean z10) {
        this.a = 2;
        this.c = ll0Var;
        this.d = arrayList;
        this.e = tL_secureRequiredType;
        this.b = z10;
    }
}
