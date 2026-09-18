package ai;

import android.app.Dialog;
import android.content.DialogInterface;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.gk0;
import org.telegram.ui.DataSettingsActivity;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.bo;
import org.telegram.ui.lu;
import org.telegram.ui.mx0;
import org.telegram.ui.qn0;
import org.telegram.ui.xd1;
import org.telegram.ui.yo0;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes4.dex */
public final /* synthetic */ class m5 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ m5(Object obj, Object obj2, boolean z10, Object obj3, int i10) {
        this.a = i10;
        this.c = obj;
        this.d = obj2;
        this.b = z10;
        this.e = obj3;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0190  */
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
                w5 w5Var = (w5) this.c;
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) this.d;
                org.telegram.ui.ActionBar.f6 f6Var = (org.telegram.ui.ActionBar.f6) this.e;
                ArrayList arrayList = new ArrayList();
                arrayList.add(storyItem);
                f6 f6Var2 = w5Var.l;
                l9 storiesController = MessagesController.getInstance(f6Var2.C2).getStoriesController();
                long j3 = f6Var2.B1;
                boolean z12 = this.b;
                storiesController.o0(j3, arrayList, z12, new t4(w5Var, storyItem, z12, f6Var));
                w5 w5Var2 = f6Var2.t1;
                if (w5Var2 != null) {
                    w5Var2.a();
                    break;
                }
                break;
            case 1:
                DataSettingsActivity dataSettingsActivity = (DataSettingsActivity) this.c;
                String str = (String) this.d;
                AlertDialog$Builder alertDialog$Builder = (AlertDialog$Builder) this.e;
                if (!TextUtils.equals(SharedConfig.storageCacheDir, str)) {
                    if (this.b) {
                        SharedConfig.storageCacheDir = str;
                        SharedConfig.saveConfig();
                        SharedConfig.readOnlyStorageDirAlertShowed = false;
                        dataSettingsActivity.n0(dataSettingsActivity.n);
                        ImageLoader.getInstance().checkMediaPaths(new lu(dataSettingsActivity, 2));
                        alertDialog$Builder.a.L0.run();
                        break;
                    } else {
                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(dataSettingsActivity.getParentActivity());
                        alertDialog$Builder2.a.R = LocaleController.getString(R.string.DecreaseSpeed);
                        alertDialog$Builder2.a.T = LocaleController.getString(R.string.SdCardAlert);
                        alertDialog$Builder2.k(LocaleController.getString(R.string.Proceed), new org.telegram.ui.c7(dataSettingsActivity, str, alertDialog$Builder, 12));
                        hg.k0.r(R.string.Back, alertDialog$Builder2, null);
                        break;
                    }
                }
                break;
            case 2:
                final qn0 qn0Var = (qn0) this.c;
                final ArrayList arrayList2 = (ArrayList) this.d;
                final TLRPC.TL_secureRequiredType tL_secureRequiredType2 = (TLRPC.TL_secureRequiredType) this.e;
                if (arrayList2 != null) {
                    int size2 = arrayList2.size();
                    while (i11 < size2) {
                        tL_secureRequiredType = (TLRPC.TL_secureRequiredType) arrayList2.get(i11);
                        i11 = (qn0Var.r1(tL_secureRequiredType, false) == null && size2 != 1) ? i11 + 1 : 0;
                        TLRPC.SecureValueType secureValueType2 = tL_secureRequiredType2.type;
                        z10 = secureValueType2 instanceof TLRPC.TL_secureValueTypePersonalDetails;
                        z11 = this.b;
                        if (!z10 || (secureValueType2 instanceof TLRPC.TL_secureValueTypeAddress)) {
                            if (tL_secureRequiredType == null && arrayList2 != null && !arrayList2.isEmpty()) {
                                AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(qn0Var.getParentActivity());
                                alertDialog$Builder3.k(LocaleController.getString(R.string.Cancel), null);
                                secureValueType = tL_secureRequiredType2.type;
                                if (!(secureValueType instanceof TLRPC.TL_secureValueTypePersonalDetails)) {
                                    alertDialog$Builder3.a.R = LocaleController.getString(R.string.PassportIdentityDocument);
                                } else if (secureValueType instanceof TLRPC.TL_secureValueTypeAddress) {
                                    alertDialog$Builder3.a.R = LocaleController.getString(R.string.PassportAddress);
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
                                alertDialog$Builder3.f((CharSequence[]) arrayList3.toArray(new CharSequence[0]), new DialogInterface.OnClickListener() { // from class: org.telegram.ui.im0
                                    @Override // android.content.DialogInterface.OnClickListener
                                    public final void onClick(DialogInterface dialogInterface, int i12) {
                                        qn0 qn0Var2 = qn0Var;
                                        qn0Var2.getClass();
                                        ArrayList arrayList4 = arrayList2;
                                        qn0Var2.E1(tL_secureRequiredType2, (TLRPC.TL_secureRequiredType) arrayList4.get(i12), arrayList4, z11);
                                    }
                                });
                                qn0Var.showDialog(alertDialog$Builder3.a);
                                break;
                            }
                        } else {
                            boolean z13 = secureValueType2 instanceof TLRPC.TL_secureValueTypePhone;
                            if ((z13 || (secureValueType2 instanceof TLRPC.TL_secureValueTypeEmail)) && qn0Var.r1(tL_secureRequiredType2, false) != null) {
                                AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(qn0Var.getParentActivity());
                                alertDialog$Builder4.k(LocaleController.getString(R.string.OK), new com.google.firebase.messaging.i(qn0Var, tL_secureRequiredType2, z11, 11));
                                alertDialog$Builder4.h(LocaleController.getString(R.string.Cancel), null);
                                alertDialog$Builder4.a.R = LocaleController.getString(R.string.AppName);
                                String string = LocaleController.getString(z13 ? R.string.PassportDeletePhoneAlert : R.string.PassportDeleteEmailAlert);
                                org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder4.a;
                                c2Var.T = string;
                                qn0Var.showDialog(c2Var);
                                break;
                            }
                        }
                        qn0Var.E1(tL_secureRequiredType2, tL_secureRequiredType, arrayList2, z11);
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
                    AlertDialog$Builder alertDialog$Builder32 = new AlertDialog$Builder(qn0Var.getParentActivity());
                    alertDialog$Builder32.k(LocaleController.getString(R.string.Cancel), null);
                    secureValueType = tL_secureRequiredType2.type;
                    if (!(secureValueType instanceof TLRPC.TL_secureValueTypePersonalDetails)) {
                    }
                    ArrayList arrayList32 = new ArrayList();
                    size = arrayList2.size();
                    while (i10 < size) {
                    }
                    alertDialog$Builder32.f((CharSequence[]) arrayList32.toArray(new CharSequence[0]), new DialogInterface.OnClickListener() { // from class: org.telegram.ui.im0
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i12) {
                            qn0 qn0Var2 = qn0Var;
                            qn0Var2.getClass();
                            ArrayList arrayList4 = arrayList2;
                            qn0Var2.E1(tL_secureRequiredType2, (TLRPC.TL_secureRequiredType) arrayList4.get(i12), arrayList4, z11);
                        }
                    });
                    qn0Var.showDialog(alertDialog$Builder32.a);
                }
                qn0Var.E1(tL_secureRequiredType2, tL_secureRequiredType, arrayList2, z11);
                break;
            case 3:
                yo0.g0((yo0) this.c, (org.telegram.ui.Components.oc) this.d, this.b, (TLRPC.Message[]) this.e);
                break;
            case 4:
                yo0.Y((yo0) this.c, (org.telegram.ui.Components.oc) this.d, this.b, (TLRPC.Message) this.e);
                break;
            default:
                rg.x0 x0Var = (rg.x0) this.c;
                org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) this.d;
                mx0 mx0Var = (mx0) this.e;
                if (o2Var instanceof bo) {
                    bo boVar = (bo) o2Var;
                    boVar.A7(true);
                    g4 g4Var = boVar.J1;
                    if (g4Var != null) {
                        g4Var.dismiss(true);
                    }
                }
                org.telegram.ui.ActionBar.o2 R = LaunchActivity.R();
                int i12 = 0;
                while (i12 < 2) {
                    org.telegram.ui.ActionBar.o2 o2Var2 = i12 == 0 ? o2Var : R;
                    if (o2Var2 != null && o2Var2.getLastStoryViewer() != null) {
                        jc lastStoryViewer = o2Var2.getLastStoryViewer();
                        Dialog dialog = lastStoryViewer.u0;
                        if (dialog != null) {
                            dialog.dismiss();
                        }
                        org.telegram.ui.ActionBar.k2 k2Var = lastStoryViewer.v0;
                        if (k2Var != null) {
                            k2Var.dismiss();
                        }
                        f6 t10 = lastStoryViewer.t();
                        if (t10 != null) {
                            gk0 gk0Var = t10.f2;
                            if (gk0Var != null && gk0Var.getReactionsWindow() != null) {
                                t10.f2.getReactionsWindow().d();
                            }
                            j4 j4Var = t10.Z2;
                            if (j4Var != null) {
                                j4Var.dismiss();
                            }
                            t10.N0();
                        }
                    }
                    if (o2Var2 != null && o2Var2.getVisibleDialog() != null) {
                        o2Var2.getVisibleDialog().dismiss();
                    }
                    i12++;
                }
                if (this.b || x0Var.F) {
                    PremiumPreviewFragment premiumPreviewFragment = new PremiumPreviewFragment(0, PremiumPreviewFragment.l0(mx0Var.a));
                    if (o2Var instanceof xd1) {
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
                    PremiumPreviewFragment.k0(o2Var, x0Var.J, PremiumPreviewFragment.l0(mx0Var.a), null);
                }
                x0Var.dismiss();
                break;
        }
    }

    public /* synthetic */ m5(ArrayList arrayList, TLRPC.TL_secureRequiredType tL_secureRequiredType, qn0 qn0Var, boolean z10) {
        this.a = 2;
        this.c = qn0Var;
        this.d = arrayList;
        this.e = tL_secureRequiredType;
        this.b = z10;
    }
}
