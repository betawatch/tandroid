package fg;

import android.app.Dialog;
import android.content.DialogInterface;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import oh.e3;
import oh.f4;
import oh.i9;
import oh.t6;
import oh.u2;
import oh.x2;
import oh.y3;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.ic;
import org.telegram.ui.Components.qk0;
import org.telegram.ui.DataSettingsActivity;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.d7;
import org.telegram.ui.fn0;
import org.telegram.ui.iu;
import org.telegram.ui.jd1;
import org.telegram.ui.lo0;
import org.telegram.ui.ww0;
import org.telegram.ui.xn;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class d1 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ d1(Object obj, Object obj2, boolean z4, Object obj3, int i10) {
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
                n1 n1Var = (n1) this.c;
                org.telegram.ui.ActionBar.p2 p2Var = (org.telegram.ui.ActionBar.p2) this.d;
                ww0 ww0Var = (ww0) this.e;
                if (p2Var instanceof xn) {
                    xn xnVar = (xn) p2Var;
                    xnVar.A7(true);
                    u2 u2Var = xnVar.G1;
                    if (u2Var != null) {
                        u2Var.dismiss(true);
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
                        f4 t6 = lastStoryViewer.t();
                        if (t6 != null) {
                            qk0 qk0Var = t6.c2;
                            if (qk0Var != null && qk0Var.getReactionsWindow() != null) {
                                t6.c2.getReactionsWindow().d();
                            }
                            x2 x2Var = t6.W2;
                            if (x2Var != null) {
                                x2Var.dismiss();
                            }
                            t6.N0();
                        }
                    }
                    if (p2Var2 != null && p2Var2.getVisibleDialog() != null) {
                        p2Var2.getVisibleDialog().dismiss();
                    }
                    i12++;
                }
                if (this.b || n1Var.C) {
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
                    PremiumPreviewFragment.k0(p2Var, n1Var.G, PremiumPreviewFragment.l0(ww0Var.a), null);
                }
                n1Var.dismiss();
                break;
            case 1:
                y3 y3Var = (y3) this.c;
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) this.d;
                g6 g6Var = (g6) this.e;
                ArrayList arrayList = new ArrayList();
                arrayList.add(storyItem);
                f4 f4Var = y3Var.l;
                t6 storiesController = MessagesController.getInstance(f4Var.z2).getStoriesController();
                long j10 = f4Var.y1;
                boolean z11 = this.b;
                storiesController.o0(j10, arrayList, z11, new e3(y3Var, storyItem, z11, g6Var));
                y3 y3Var2 = f4Var.q1;
                if (y3Var2 != null) {
                    y3Var2.a();
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
                        ImageLoader.getInstance().checkMediaPaths(new iu(dataSettingsActivity, 2));
                        alertDialog$Builder.a.I0.run();
                        break;
                    } else {
                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(dataSettingsActivity.getParentActivity());
                        alertDialog$Builder2.a.O = LocaleController.getString(R.string.DecreaseSpeed);
                        alertDialog$Builder2.a.Q = LocaleController.getString(R.string.SdCardAlert);
                        alertDialog$Builder2.k(LocaleController.getString(R.string.Proceed), new d7(dataSettingsActivity, str, alertDialog$Builder, 12));
                        l.d.u(R.string.Back, alertDialog$Builder2, null);
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

    public /* synthetic */ d1(ArrayList arrayList, TLRPC.TL_secureRequiredType tL_secureRequiredType, fn0 fn0Var, boolean z4) {
        this.a = 3;
        this.c = fn0Var;
        this.d = arrayList;
        this.e = tL_secureRequiredType;
        this.b = z4;
    }
}
