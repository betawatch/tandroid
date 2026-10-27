package di;

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
import org.telegram.ui.Components.gl0;
import org.telegram.ui.Components.qc;
import org.telegram.ui.DataSettingsActivity;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.kn0;
import org.telegram.ui.ro0;
import org.telegram.ui.vc1;
import org.telegram.ui.wn;
import org.telegram.ui.yt;
import org.telegram.ui.yw0;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final /* synthetic */ class y3 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ y3(Object obj, Object obj2, boolean z10, Object obj3, int i10) {
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
                h4 h4Var = (h4) this.c;
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) this.d;
                org.telegram.ui.ActionBar.u6 u6Var = (org.telegram.ui.ActionBar.u6) this.e;
                ArrayList arrayList = new ArrayList();
                arrayList.add(storyItem);
                q4 q4Var = h4Var.l;
                h7 storiesController = MessagesController.getInstance(q4Var.r2).getStoriesController();
                long j10 = q4Var.q1;
                boolean z12 = this.b;
                storiesController.r0(j10, arrayList, z12, new k3(h4Var, storyItem, z12, u6Var));
                h4 h4Var2 = q4Var.i1;
                if (h4Var2 != null) {
                    h4Var2.a();
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
                        dataSettingsActivity.o0(dataSettingsActivity.n);
                        ImageLoader.getInstance().checkMediaPaths(new yt(dataSettingsActivity, 2));
                        alertDialog$Builder.a.N0.run();
                        break;
                    } else {
                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(dataSettingsActivity.getParentActivity());
                        alertDialog$Builder2.a.R = LocaleController.getString(R.string.DecreaseSpeed);
                        alertDialog$Builder2.a.T = LocaleController.getString(R.string.SdCardAlert);
                        alertDialog$Builder2.k(LocaleController.getString(R.string.Proceed), new org.telegram.ui.e7(dataSettingsActivity, str, alertDialog$Builder, 12));
                        ic.a.r(R.string.Back, alertDialog$Builder2, null);
                        break;
                    }
                }
                break;
            case 2:
                final kn0 kn0Var = (kn0) this.c;
                final ArrayList arrayList2 = (ArrayList) this.d;
                final TLRPC.TL_secureRequiredType tL_secureRequiredType2 = (TLRPC.TL_secureRequiredType) this.e;
                if (arrayList2 != null) {
                    int size2 = arrayList2.size();
                    for (0; i11 < size2; i11 + 1) {
                        tL_secureRequiredType = (TLRPC.TL_secureRequiredType) arrayList2.get(i11);
                        i11 = (kn0Var.r1(tL_secureRequiredType, false) == null && size2 != 1) ? i11 + 1 : 0;
                        TLRPC.SecureValueType secureValueType2 = tL_secureRequiredType2.type;
                        z10 = secureValueType2 instanceof TLRPC.TL_secureValueTypePersonalDetails;
                        z11 = this.b;
                        if (!z10 || (secureValueType2 instanceof TLRPC.TL_secureValueTypeAddress)) {
                            if (tL_secureRequiredType == null && arrayList2 != null && !arrayList2.isEmpty()) {
                                AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(kn0Var.getParentActivity());
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
                                alertDialog$Builder3.f((CharSequence[]) arrayList3.toArray(new CharSequence[0]), new DialogInterface.OnClickListener() { // from class: org.telegram.ui.cm0
                                    @Override // android.content.DialogInterface.OnClickListener
                                    public final void onClick(DialogInterface dialogInterface, int i12) {
                                        kn0 kn0Var2 = kn0Var;
                                        kn0Var2.getClass();
                                        ArrayList arrayList4 = arrayList2;
                                        kn0Var2.E1(tL_secureRequiredType2, (TLRPC.TL_secureRequiredType) arrayList4.get(i12), arrayList4, z11);
                                    }
                                });
                                kn0Var.showDialog(alertDialog$Builder3.a);
                                break;
                            }
                        } else {
                            boolean z13 = secureValueType2 instanceof TLRPC.TL_secureValueTypePhone;
                            if ((z13 || (secureValueType2 instanceof TLRPC.TL_secureValueTypeEmail)) && kn0Var.r1(tL_secureRequiredType2, false) != null) {
                                AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(kn0Var.getParentActivity());
                                alertDialog$Builder4.k(LocaleController.getString(R.string.OK), new bi.z3(kn0Var, tL_secureRequiredType2, z11, 11));
                                alertDialog$Builder4.h(LocaleController.getString(R.string.Cancel), null);
                                alertDialog$Builder4.a.R = LocaleController.getString(R.string.AppName);
                                String string = LocaleController.getString(z13 ? R.string.PassportDeletePhoneAlert : R.string.PassportDeleteEmailAlert);
                                org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder4.a;
                                e2Var.T = string;
                                kn0Var.showDialog(e2Var);
                                break;
                            }
                        }
                        kn0Var.E1(tL_secureRequiredType2, tL_secureRequiredType, arrayList2, z11);
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
                    AlertDialog$Builder alertDialog$Builder32 = new AlertDialog$Builder(kn0Var.getParentActivity());
                    alertDialog$Builder32.k(LocaleController.getString(R.string.Cancel), null);
                    secureValueType = tL_secureRequiredType2.type;
                    if (!(secureValueType instanceof TLRPC.TL_secureValueTypePersonalDetails)) {
                    }
                    ArrayList arrayList32 = new ArrayList();
                    size = arrayList2.size();
                    while (i10 < size) {
                    }
                    alertDialog$Builder32.f((CharSequence[]) arrayList32.toArray(new CharSequence[0]), new DialogInterface.OnClickListener() { // from class: org.telegram.ui.cm0
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i12) {
                            kn0 kn0Var2 = kn0Var;
                            kn0Var2.getClass();
                            ArrayList arrayList4 = arrayList2;
                            kn0Var2.E1(tL_secureRequiredType2, (TLRPC.TL_secureRequiredType) arrayList4.get(i12), arrayList4, z11);
                        }
                    });
                    kn0Var.showDialog(alertDialog$Builder32.a);
                }
                kn0Var.E1(tL_secureRequiredType2, tL_secureRequiredType, arrayList2, z11);
                break;
            case 3:
                ro0.h0((ro0) this.c, (qc) this.d, this.b, (TLRPC.Message[]) this.e);
                break;
            case 4:
                ro0.Z((ro0) this.c, (qc) this.d, this.b, (TLRPC.Message) this.e);
                break;
            default:
                tg.y0 y0Var = (tg.y0) this.c;
                org.telegram.ui.ActionBar.r2 r2Var = (org.telegram.ui.ActionBar.r2) this.d;
                yw0 yw0Var = (yw0) this.e;
                if (r2Var instanceof wn) {
                    wn wnVar = (wn) r2Var;
                    wnVar.J7(true);
                    a3 a3Var = wnVar.V1;
                    if (a3Var != null) {
                        a3Var.dismiss(true);
                    }
                }
                org.telegram.ui.ActionBar.r2 R = LaunchActivity.R();
                int i12 = 0;
                while (i12 < 2) {
                    org.telegram.ui.ActionBar.r2 r2Var2 = i12 == 0 ? r2Var : R;
                    if (r2Var2 != null && r2Var2.getLastStoryViewer() != null) {
                        y9 lastStoryViewer = r2Var2.getLastStoryViewer();
                        Dialog dialog = lastStoryViewer.u0;
                        if (dialog != null) {
                            dialog.dismiss();
                        }
                        org.telegram.ui.ActionBar.n2 n2Var = lastStoryViewer.v0;
                        if (n2Var != null) {
                            n2Var.dismiss();
                        }
                        q4 u10 = lastStoryViewer.u();
                        if (u10 != null) {
                            gl0 gl0Var = u10.U1;
                            if (gl0Var != null && gl0Var.getReactionsWindow() != null) {
                                u10.U1.getReactionsWindow().d();
                            }
                            d3 d3Var = u10.O2;
                            if (d3Var != null) {
                                d3Var.dismiss();
                            }
                            u10.L0();
                        }
                    }
                    if (r2Var2 != null && r2Var2.getVisibleDialog() != null) {
                        r2Var2.getVisibleDialog().dismiss();
                    }
                    i12++;
                }
                if (this.b || y0Var.F) {
                    PremiumPreviewFragment premiumPreviewFragment = new PremiumPreviewFragment(0, PremiumPreviewFragment.m0(yw0Var.a));
                    if (r2Var instanceof vc1) {
                        org.telegram.ui.ActionBar.p2 p2Var = new org.telegram.ui.ActionBar.p2();
                        p2Var.a = true;
                        r2Var.showAsSheet(premiumPreviewFragment, p2Var);
                    } else if (r2Var != null) {
                        r2Var.presentFragment(premiumPreviewFragment);
                    } else {
                        org.telegram.ui.ActionBar.r2 U = LaunchActivity.U();
                        if (U != null) {
                            U.presentFragment(premiumPreviewFragment);
                        }
                    }
                } else {
                    PremiumPreviewFragment.l0(r2Var, y0Var.J, PremiumPreviewFragment.m0(yw0Var.a), null);
                }
                y0Var.dismiss();
                break;
        }
    }

    public /* synthetic */ y3(ArrayList arrayList, TLRPC.TL_secureRequiredType tL_secureRequiredType, kn0 kn0Var, boolean z10) {
        this.a = 2;
        this.c = kn0Var;
        this.d = arrayList;
        this.e = tL_secureRequiredType;
        this.b = z10;
    }
}
