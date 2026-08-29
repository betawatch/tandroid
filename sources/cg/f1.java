package cg;

import android.app.Dialog;
import android.content.DialogInterface;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import lh.c3;
import lh.d4;
import lh.i9;
import lh.s6;
import lh.w3;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.Components.fk0;
import org.telegram.ui.Components.mc;
import org.telegram.ui.DataSettingsActivity;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.bo0;
import org.telegram.ui.fw0;
import org.telegram.ui.qc1;
import org.telegram.ui.tn;
import org.telegram.ui.vm0;
import org.telegram.ui.z6;
import org.telegram.ui.zt;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class f1 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ f1(Object obj, Object obj2, boolean z10, Object obj3, int i10) {
        this.a = i10;
        this.c = obj;
        this.d = obj2;
        this.b = z10;
        this.e = obj3;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00dd  */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onClick(View view) {
        TLRPC.TL_secureRequiredType tL_secureRequiredType;
        boolean z10;
        final boolean z11;
        TLRPC.SecureValueType secureValueType;
        int size;
        int i10;
        int i11;
        switch (this.a) {
            case 0:
                p1 p1Var = (p1) this.c;
                org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) this.d;
                fw0 fw0Var = (fw0) this.e;
                if (o2Var instanceof tn) {
                    tn tnVar = (tn) o2Var;
                    tnVar.A7(true);
                    lh.s2 s2Var = tnVar.F1;
                    if (s2Var != null) {
                        s2Var.dismiss(true);
                    }
                }
                org.telegram.ui.ActionBar.o2 R = LaunchActivity.R();
                int i12 = 0;
                while (i12 < 2) {
                    org.telegram.ui.ActionBar.o2 o2Var2 = i12 == 0 ? o2Var : R;
                    if (o2Var2 != null && o2Var2.getLastStoryViewer() != null) {
                        i9 lastStoryViewer = o2Var2.getLastStoryViewer();
                        Dialog dialog = lastStoryViewer.q0;
                        if (dialog != null) {
                            dialog.dismiss();
                        }
                        org.telegram.ui.ActionBar.k2 k2Var = lastStoryViewer.r0;
                        if (k2Var != null) {
                            k2Var.dismiss();
                        }
                        d4 t10 = lastStoryViewer.t();
                        if (t10 != null) {
                            fk0 fk0Var = t10.b2;
                            if (fk0Var != null && fk0Var.getReactionsWindow() != null) {
                                t10.b2.getReactionsWindow().d();
                            }
                            lh.v2 v2Var = t10.V2;
                            if (v2Var != null) {
                                v2Var.dismiss();
                            }
                            t10.N0();
                        }
                    }
                    if (o2Var2 != null && o2Var2.getVisibleDialog() != null) {
                        o2Var2.getVisibleDialog().dismiss();
                    }
                    i12++;
                }
                if (this.b || p1Var.B) {
                    PremiumPreviewFragment premiumPreviewFragment = new PremiumPreviewFragment(0, PremiumPreviewFragment.l0(fw0Var.a));
                    if (o2Var instanceof qc1) {
                        org.telegram.ui.ActionBar.m2 m2Var = new org.telegram.ui.ActionBar.m2();
                        m2Var.a = true;
                        o2Var.showAsSheet(premiumPreviewFragment, m2Var);
                    } else if (o2Var != null) {
                        o2Var.presentFragment(premiumPreviewFragment);
                    } else {
                        org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
                        if (U != null) {
                            U.presentFragment(premiumPreviewFragment);
                        }
                    }
                } else {
                    PremiumPreviewFragment.k0(o2Var, p1Var.F, PremiumPreviewFragment.l0(fw0Var.a), null);
                }
                p1Var.dismiss();
                break;
            case 1:
                w3 w3Var = (w3) this.c;
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) this.d;
                c6 c6Var = (c6) this.e;
                ArrayList arrayList = new ArrayList();
                arrayList.add(storyItem);
                d4 d4Var = w3Var.l;
                s6 storiesController = MessagesController.getInstance(d4Var.y2).getStoriesController();
                long j10 = d4Var.x1;
                boolean z12 = this.b;
                storiesController.o0(j10, arrayList, z12, new c3(w3Var, storyItem, z12, c6Var));
                w3 w3Var2 = d4Var.p1;
                if (w3Var2 != null) {
                    w3Var2.a();
                    break;
                }
                break;
            case 2:
                DataSettingsActivity dataSettingsActivity = (DataSettingsActivity) this.c;
                String str = (String) this.d;
                AlertDialog$Builder alertDialog$Builder = (AlertDialog$Builder) this.e;
                if (!TextUtils.equals(SharedConfig.storageCacheDir, str)) {
                    if (this.b) {
                        SharedConfig.storageCacheDir = str;
                        SharedConfig.saveConfig();
                        SharedConfig.readOnlyStorageDirAlertShowed = false;
                        dataSettingsActivity.n0(dataSettingsActivity.n);
                        ImageLoader.getInstance().checkMediaPaths(new zt(dataSettingsActivity, 2));
                        alertDialog$Builder.a.H0.run();
                        break;
                    } else {
                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(dataSettingsActivity.getParentActivity());
                        alertDialog$Builder2.a.N = LocaleController.getString(R.string.DecreaseSpeed);
                        alertDialog$Builder2.a.P = LocaleController.getString(R.string.SdCardAlert);
                        alertDialog$Builder2.k(LocaleController.getString(R.string.Proceed), new z6(dataSettingsActivity, str, alertDialog$Builder, 12));
                        j7.l1.u(R.string.Back, alertDialog$Builder2, null);
                        break;
                    }
                }
                break;
            case 3:
                final vm0 vm0Var = (vm0) this.c;
                final ArrayList arrayList2 = (ArrayList) this.d;
                final TLRPC.TL_secureRequiredType tL_secureRequiredType2 = (TLRPC.TL_secureRequiredType) this.e;
                if (arrayList2 != null) {
                    int size2 = arrayList2.size();
                    while (i11 < size2) {
                        tL_secureRequiredType = (TLRPC.TL_secureRequiredType) arrayList2.get(i11);
                        i11 = (vm0Var.r1(tL_secureRequiredType, false) == null && size2 != 1) ? i11 + 1 : 0;
                        TLRPC.SecureValueType secureValueType2 = tL_secureRequiredType2.type;
                        z10 = secureValueType2 instanceof TLRPC.TL_secureValueTypePersonalDetails;
                        z11 = this.b;
                        if (!z10 || (secureValueType2 instanceof TLRPC.TL_secureValueTypeAddress)) {
                            if (tL_secureRequiredType == null && arrayList2 != null && !arrayList2.isEmpty()) {
                                AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(vm0Var.getParentActivity());
                                alertDialog$Builder3.k(LocaleController.getString(R.string.Cancel), null);
                                secureValueType = tL_secureRequiredType2.type;
                                if (!(secureValueType instanceof TLRPC.TL_secureValueTypePersonalDetails)) {
                                    alertDialog$Builder3.a.N = LocaleController.getString(R.string.PassportIdentityDocument);
                                } else if (secureValueType instanceof TLRPC.TL_secureValueTypeAddress) {
                                    alertDialog$Builder3.a.N = LocaleController.getString(R.string.PassportAddress);
                                }
                                ArrayList arrayList3 = new ArrayList();
                                size = arrayList2.size();
                                for (i10 = 0; i10 < size; i10++) {
                                    TLRPC.SecureValueType secureValueType3 = ((TLRPC.TL_secureRequiredType) arrayList2.get(i10)).type;
                                    if (secureValueType3 instanceof TLRPC.TL_secureValueTypeDriverLicense) {
                                        arrayList3.add(LocaleController.getString(R.string.PassportAddLicence));
                                    } else if (secureValueType3 instanceof TLRPC.TL_secureValueTypePassport) {
                                        arrayList3.add(LocaleController.getString(R.string.PassportAddPassport));
                                    } else if (secureValueType3 instanceof TLRPC.TL_secureValueTypeInternalPassport) {
                                        arrayList3.add(LocaleController.getString(R.string.PassportAddInternalPassport));
                                    } else if (secureValueType3 instanceof TLRPC.TL_secureValueTypeIdentityCard) {
                                        arrayList3.add(LocaleController.getString(R.string.PassportAddCard));
                                    } else if (secureValueType3 instanceof TLRPC.TL_secureValueTypeUtilityBill) {
                                        arrayList3.add(LocaleController.getString(R.string.PassportAddBill));
                                    } else if (secureValueType3 instanceof TLRPC.TL_secureValueTypeBankStatement) {
                                        arrayList3.add(LocaleController.getString(R.string.PassportAddBank));
                                    } else if (secureValueType3 instanceof TLRPC.TL_secureValueTypeRentalAgreement) {
                                        arrayList3.add(LocaleController.getString(R.string.PassportAddAgreement));
                                    } else if (secureValueType3 instanceof TLRPC.TL_secureValueTypeTemporaryRegistration) {
                                        arrayList3.add(LocaleController.getString(R.string.PassportAddTemporaryRegistration));
                                    } else if (secureValueType3 instanceof TLRPC.TL_secureValueTypePassportRegistration) {
                                        arrayList3.add(LocaleController.getString(R.string.PassportAddPassportRegistration));
                                    }
                                }
                                alertDialog$Builder3.f((CharSequence[]) arrayList3.toArray(new CharSequence[0]), new DialogInterface.OnClickListener() { // from class: org.telegram.ui.nl0
                                    @Override // android.content.DialogInterface.OnClickListener
                                    public final void onClick(DialogInterface dialogInterface, int i13) {
                                        vm0 vm0Var2 = vm0Var;
                                        vm0Var2.getClass();
                                        ArrayList arrayList4 = arrayList2;
                                        vm0Var2.E1(tL_secureRequiredType2, (TLRPC.TL_secureRequiredType) arrayList4.get(i13), arrayList4, z11);
                                    }
                                });
                                vm0Var.showDialog(alertDialog$Builder3.a);
                                break;
                            }
                        } else {
                            boolean z13 = secureValueType2 instanceof TLRPC.TL_secureValueTypePhone;
                            if ((z13 || (secureValueType2 instanceof TLRPC.TL_secureValueTypeEmail)) && vm0Var.r1(tL_secureRequiredType2, false) != null) {
                                AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(vm0Var.getParentActivity());
                                alertDialog$Builder4.k(LocaleController.getString(R.string.OK), new com.google.firebase.messaging.i(vm0Var, tL_secureRequiredType2, z11, 10));
                                alertDialog$Builder4.h(LocaleController.getString(R.string.Cancel), null);
                                alertDialog$Builder4.a.N = LocaleController.getString(R.string.AppName);
                                String string = LocaleController.getString(z13 ? R.string.PassportDeletePhoneAlert : R.string.PassportDeleteEmailAlert);
                                org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder4.a;
                                c2Var.P = string;
                                vm0Var.showDialog(c2Var);
                                break;
                            }
                        }
                        vm0Var.E1(tL_secureRequiredType2, tL_secureRequiredType, arrayList2, z11);
                        break;
                    }
                }
                tL_secureRequiredType = null;
                TLRPC.SecureValueType secureValueType22 = tL_secureRequiredType2.type;
                z10 = secureValueType22 instanceof TLRPC.TL_secureValueTypePersonalDetails;
                z11 = this.b;
                if (!z10) {
                }
                if (tL_secureRequiredType == null) {
                    AlertDialog$Builder alertDialog$Builder32 = new AlertDialog$Builder(vm0Var.getParentActivity());
                    alertDialog$Builder32.k(LocaleController.getString(R.string.Cancel), null);
                    secureValueType = tL_secureRequiredType2.type;
                    if (!(secureValueType instanceof TLRPC.TL_secureValueTypePersonalDetails)) {
                    }
                    ArrayList arrayList32 = new ArrayList();
                    size = arrayList2.size();
                    while (i10 < size) {
                    }
                    alertDialog$Builder32.f((CharSequence[]) arrayList32.toArray(new CharSequence[0]), new DialogInterface.OnClickListener() { // from class: org.telegram.ui.nl0
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i13) {
                            vm0 vm0Var2 = vm0Var;
                            vm0Var2.getClass();
                            ArrayList arrayList4 = arrayList2;
                            vm0Var2.E1(tL_secureRequiredType2, (TLRPC.TL_secureRequiredType) arrayList4.get(i13), arrayList4, z11);
                        }
                    });
                    vm0Var.showDialog(alertDialog$Builder32.a);
                }
                vm0Var.E1(tL_secureRequiredType2, tL_secureRequiredType, arrayList2, z11);
                break;
            case 4:
                bo0.g0((bo0) this.c, (mc) this.d, this.b, (TLRPC.Message[]) this.e);
                break;
            default:
                bo0.Y((bo0) this.c, (mc) this.d, this.b, (TLRPC.Message) this.e);
                break;
        }
    }

    public /* synthetic */ f1(ArrayList arrayList, TLRPC.TL_secureRequiredType tL_secureRequiredType, vm0 vm0Var, boolean z10) {
        this.a = 3;
        this.c = vm0Var;
        this.d = arrayList;
        this.e = tL_secureRequiredType;
        this.b = z10;
    }
}
