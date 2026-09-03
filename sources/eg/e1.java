package eg;

import android.app.Dialog;
import android.content.DialogInterface;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import nh.d3;
import nh.d4;
import nh.i9;
import nh.t6;
import nh.w2;
import nh.w3;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.ic;
import org.telegram.ui.Components.pk0;
import org.telegram.ui.DataSettingsActivity;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.f7;
import org.telegram.ui.fn0;
import org.telegram.ui.jd1;
import org.telegram.ui.ju;
import org.telegram.ui.lo0;
import org.telegram.ui.ww0;
import org.telegram.ui.zn;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class e1 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ e1(Object obj, Object obj2, boolean z4, Object obj3, int i10) {
        this.a = i10;
        this.c = obj;
        this.d = obj2;
        this.b = z4;
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
        boolean z4;
        final boolean z10;
        TLRPC.SecureValueType secureValueType;
        int size;
        int i10;
        int i11;
        switch (this.a) {
            case 0:
                o1 o1Var = (o1) this.c;
                org.telegram.ui.ActionBar.p2 p2Var = (org.telegram.ui.ActionBar.p2) this.d;
                ww0 ww0Var = (ww0) this.e;
                if (p2Var instanceof zn) {
                    zn znVar = (zn) p2Var;
                    znVar.A7(true);
                    nh.t2 t2Var = znVar.G1;
                    if (t2Var != null) {
                        t2Var.dismiss(true);
                    }
                }
                org.telegram.ui.ActionBar.p2 R = LaunchActivity.R();
                int i12 = 0;
                while (i12 < 2) {
                    org.telegram.ui.ActionBar.p2 p2Var2 = i12 == 0 ? p2Var : R;
                    if (p2Var2 != null && p2Var2.getLastStoryViewer() != null) {
                        i9 lastStoryViewer = p2Var2.getLastStoryViewer();
                        Dialog dialog = lastStoryViewer.r0;
                        if (dialog != null) {
                            dialog.dismiss();
                        }
                        org.telegram.ui.ActionBar.l2 l2Var = lastStoryViewer.s0;
                        if (l2Var != null) {
                            l2Var.dismiss();
                        }
                        d4 t6 = lastStoryViewer.t();
                        if (t6 != null) {
                            pk0 pk0Var = t6.c2;
                            if (pk0Var != null && pk0Var.getReactionsWindow() != null) {
                                t6.c2.getReactionsWindow().d();
                            }
                            w2 w2Var = t6.W2;
                            if (w2Var != null) {
                                w2Var.dismiss();
                            }
                            t6.N0();
                        }
                    }
                    if (p2Var2 != null && p2Var2.getVisibleDialog() != null) {
                        p2Var2.getVisibleDialog().dismiss();
                    }
                    i12++;
                }
                if (this.b || o1Var.C) {
                    PremiumPreviewFragment premiumPreviewFragment = new PremiumPreviewFragment(0, PremiumPreviewFragment.l0(ww0Var.a));
                    if (p2Var instanceof jd1) {
                        org.telegram.ui.ActionBar.n2 n2Var = new org.telegram.ui.ActionBar.n2();
                        n2Var.a = true;
                        p2Var.showAsSheet(premiumPreviewFragment, n2Var);
                    } else if (p2Var != null) {
                        p2Var.presentFragment(premiumPreviewFragment);
                    } else {
                        org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
                        if (U != null) {
                            U.presentFragment(premiumPreviewFragment);
                        }
                    }
                } else {
                    PremiumPreviewFragment.k0(p2Var, o1Var.G, PremiumPreviewFragment.l0(ww0Var.a), null);
                }
                o1Var.dismiss();
                break;
            case 1:
                w3 w3Var = (w3) this.c;
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) this.d;
                f6 f6Var = (f6) this.e;
                ArrayList arrayList = new ArrayList();
                arrayList.add(storyItem);
                d4 d4Var = w3Var.l;
                t6 storiesController = MessagesController.getInstance(d4Var.z2).getStoriesController();
                long j10 = d4Var.y1;
                boolean z11 = this.b;
                storiesController.o0(j10, arrayList, z11, new d3(w3Var, storyItem, z11, f6Var));
                w3 w3Var2 = d4Var.q1;
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
                        ImageLoader.getInstance().checkMediaPaths(new ju(dataSettingsActivity, 2));
                        alertDialog$Builder.a.I0.run();
                        break;
                    } else {
                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(dataSettingsActivity.getParentActivity());
                        alertDialog$Builder2.a.O = LocaleController.getString(R.string.DecreaseSpeed);
                        alertDialog$Builder2.a.Q = LocaleController.getString(R.string.SdCardAlert);
                        alertDialog$Builder2.k(LocaleController.getString(R.string.Proceed), new f7(dataSettingsActivity, str, alertDialog$Builder, 12));
                        kf.k0.u(R.string.Back, alertDialog$Builder2, null);
                        break;
                    }
                }
                break;
            case 3:
                final fn0 fn0Var = (fn0) this.c;
                final ArrayList arrayList2 = (ArrayList) this.d;
                final TLRPC.TL_secureRequiredType tL_secureRequiredType2 = (TLRPC.TL_secureRequiredType) this.e;
                if (arrayList2 != null) {
                    int size2 = arrayList2.size();
                    while (i11 < size2) {
                        tL_secureRequiredType = (TLRPC.TL_secureRequiredType) arrayList2.get(i11);
                        i11 = (fn0Var.r1(tL_secureRequiredType, false) == null && size2 != 1) ? i11 + 1 : 0;
                        TLRPC.SecureValueType secureValueType2 = tL_secureRequiredType2.type;
                        z4 = secureValueType2 instanceof TLRPC.TL_secureValueTypePersonalDetails;
                        z10 = this.b;
                        if (!z4 || (secureValueType2 instanceof TLRPC.TL_secureValueTypeAddress)) {
                            if (tL_secureRequiredType == null && arrayList2 != null && !arrayList2.isEmpty()) {
                                AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(fn0Var.getParentActivity());
                                alertDialog$Builder3.k(LocaleController.getString(R.string.Cancel), null);
                                secureValueType = tL_secureRequiredType2.type;
                                if (!(secureValueType instanceof TLRPC.TL_secureValueTypePersonalDetails)) {
                                    alertDialog$Builder3.a.O = LocaleController.getString(R.string.PassportIdentityDocument);
                                } else if (secureValueType instanceof TLRPC.TL_secureValueTypeAddress) {
                                    alertDialog$Builder3.a.O = LocaleController.getString(R.string.PassportAddress);
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
                                alertDialog$Builder3.f((CharSequence[]) arrayList3.toArray(new CharSequence[0]), new DialogInterface.OnClickListener() { // from class: org.telegram.ui.xl0
                                    @Override // android.content.DialogInterface.OnClickListener
                                    public final void onClick(DialogInterface dialogInterface, int i13) {
                                        fn0 fn0Var2 = fn0Var;
                                        fn0Var2.getClass();
                                        ArrayList arrayList4 = arrayList2;
                                        fn0Var2.E1(tL_secureRequiredType2, (TLRPC.TL_secureRequiredType) arrayList4.get(i13), arrayList4, z10);
                                    }
                                });
                                fn0Var.showDialog(alertDialog$Builder3.a);
                                break;
                            }
                        } else {
                            boolean z12 = secureValueType2 instanceof TLRPC.TL_secureValueTypePhone;
                            if ((z12 || (secureValueType2 instanceof TLRPC.TL_secureValueTypeEmail)) && fn0Var.r1(tL_secureRequiredType2, false) != null) {
                                AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(fn0Var.getParentActivity());
                                alertDialog$Builder4.k(LocaleController.getString(R.string.OK), new com.google.firebase.messaging.i(fn0Var, tL_secureRequiredType2, z10, 10));
                                alertDialog$Builder4.h(LocaleController.getString(R.string.Cancel), null);
                                alertDialog$Builder4.a.O = LocaleController.getString(R.string.AppName);
                                String string = LocaleController.getString(z12 ? R.string.PassportDeletePhoneAlert : R.string.PassportDeleteEmailAlert);
                                org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder4.a;
                                d2Var.Q = string;
                                fn0Var.showDialog(d2Var);
                                break;
                            }
                        }
                        fn0Var.E1(tL_secureRequiredType2, tL_secureRequiredType, arrayList2, z10);
                        break;
                    }
                }
                tL_secureRequiredType = null;
                TLRPC.SecureValueType secureValueType22 = tL_secureRequiredType2.type;
                z4 = secureValueType22 instanceof TLRPC.TL_secureValueTypePersonalDetails;
                z10 = this.b;
                if (!z4) {
                }
                if (tL_secureRequiredType == null) {
                    AlertDialog$Builder alertDialog$Builder32 = new AlertDialog$Builder(fn0Var.getParentActivity());
                    alertDialog$Builder32.k(LocaleController.getString(R.string.Cancel), null);
                    secureValueType = tL_secureRequiredType2.type;
                    if (!(secureValueType instanceof TLRPC.TL_secureValueTypePersonalDetails)) {
                    }
                    ArrayList arrayList32 = new ArrayList();
                    size = arrayList2.size();
                    while (i10 < size) {
                    }
                    alertDialog$Builder32.f((CharSequence[]) arrayList32.toArray(new CharSequence[0]), new DialogInterface.OnClickListener() { // from class: org.telegram.ui.xl0
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i13) {
                            fn0 fn0Var2 = fn0Var;
                            fn0Var2.getClass();
                            ArrayList arrayList4 = arrayList2;
                            fn0Var2.E1(tL_secureRequiredType2, (TLRPC.TL_secureRequiredType) arrayList4.get(i13), arrayList4, z10);
                        }
                    });
                    fn0Var.showDialog(alertDialog$Builder32.a);
                }
                fn0Var.E1(tL_secureRequiredType2, tL_secureRequiredType, arrayList2, z10);
                break;
            case 4:
                lo0.g0((lo0) this.c, (ic) this.d, this.b, (TLRPC.Message[]) this.e);
                break;
            default:
                lo0.Y((lo0) this.c, (ic) this.d, this.b, (TLRPC.Message) this.e);
                break;
        }
    }

    public /* synthetic */ e1(ArrayList arrayList, TLRPC.TL_secureRequiredType tL_secureRequiredType, fn0 fn0Var, boolean z4) {
        this.a = 3;
        this.c = fn0Var;
        this.d = arrayList;
        this.e = tL_secureRequiredType;
        this.b = z4;
    }
}
