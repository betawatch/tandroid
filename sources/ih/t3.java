package ih;

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
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.uj0;
import org.telegram.ui.DataSettingsActivity;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.co0;
import org.telegram.ui.gw0;
import org.telegram.ui.oc1;
import org.telegram.ui.qn;
import org.telegram.ui.wm0;
import org.telegram.ui.yt;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final /* synthetic */ class t3 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ t3(Object obj, Object obj2, boolean z10, Object obj3, int i9) {
        this.a = i9;
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
        int i9;
        int i10;
        switch (this.a) {
            case 0:
                b4 b4Var = (b4) this.c;
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) this.d;
                org.telegram.ui.ActionBar.b6 b6Var = (org.telegram.ui.ActionBar.b6) this.e;
                ArrayList arrayList = new ArrayList();
                arrayList.add(storyItem);
                i4 i4Var = b4Var.l;
                v6 storiesController = MessagesController.getInstance(i4Var.y2).getStoriesController();
                long j10 = i4Var.x1;
                boolean z12 = this.b;
                storiesController.o0(j10, arrayList, z12, new e3(b4Var, storyItem, z12, b6Var));
                b4 b4Var2 = i4Var.p1;
                if (b4Var2 != null) {
                    b4Var2.a();
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
                        dataSettingsActivity.m0(dataSettingsActivity.n);
                        ImageLoader.getInstance().checkMediaPaths(new yt(dataSettingsActivity, 2));
                        alertDialog$Builder.a.H0.run();
                        break;
                    } else {
                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(dataSettingsActivity.getParentActivity());
                        alertDialog$Builder2.a.N = LocaleController.getString(R.string.DecreaseSpeed);
                        alertDialog$Builder2.a.P = LocaleController.getString(R.string.SdCardAlert);
                        alertDialog$Builder2.k(LocaleController.getString(R.string.Proceed), new org.telegram.ui.a7(dataSettingsActivity, str, alertDialog$Builder, 12));
                        j3.r0.v(R.string.Back, alertDialog$Builder2, null);
                        break;
                    }
                }
                break;
            case 2:
                final wm0 wm0Var = (wm0) this.c;
                final ArrayList arrayList2 = (ArrayList) this.d;
                final TLRPC.TL_secureRequiredType tL_secureRequiredType2 = (TLRPC.TL_secureRequiredType) this.e;
                if (arrayList2 != null) {
                    int size2 = arrayList2.size();
                    while (i10 < size2) {
                        tL_secureRequiredType = (TLRPC.TL_secureRequiredType) arrayList2.get(i10);
                        i10 = (wm0Var.r1(tL_secureRequiredType, false) == null && size2 != 1) ? i10 + 1 : 0;
                        TLRPC.SecureValueType secureValueType2 = tL_secureRequiredType2.type;
                        z10 = secureValueType2 instanceof TLRPC.TL_secureValueTypePersonalDetails;
                        z11 = this.b;
                        if (!z10 || (secureValueType2 instanceof TLRPC.TL_secureValueTypeAddress)) {
                            if (tL_secureRequiredType == null && arrayList2 != null && !arrayList2.isEmpty()) {
                                AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(wm0Var.getParentActivity());
                                alertDialog$Builder3.k(LocaleController.getString(R.string.Cancel), null);
                                secureValueType = tL_secureRequiredType2.type;
                                if (!(secureValueType instanceof TLRPC.TL_secureValueTypePersonalDetails)) {
                                    alertDialog$Builder3.a.N = LocaleController.getString(R.string.PassportIdentityDocument);
                                } else if (secureValueType instanceof TLRPC.TL_secureValueTypeAddress) {
                                    alertDialog$Builder3.a.N = LocaleController.getString(R.string.PassportAddress);
                                }
                                ArrayList arrayList3 = new ArrayList();
                                size = arrayList2.size();
                                for (i9 = 0; i9 < size; i9++) {
                                    TLRPC.SecureValueType secureValueType3 = ((TLRPC.TL_secureRequiredType) arrayList2.get(i9)).type;
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
                                alertDialog$Builder3.f((CharSequence[]) arrayList3.toArray(new CharSequence[0]), new DialogInterface.OnClickListener() { // from class: org.telegram.ui.pl0
                                    @Override // android.content.DialogInterface.OnClickListener
                                    public final void onClick(DialogInterface dialogInterface, int i11) {
                                        wm0 wm0Var2 = wm0Var;
                                        wm0Var2.getClass();
                                        ArrayList arrayList4 = arrayList2;
                                        wm0Var2.E1(tL_secureRequiredType2, (TLRPC.TL_secureRequiredType) arrayList4.get(i11), arrayList4, z11);
                                    }
                                });
                                wm0Var.showDialog(alertDialog$Builder3.a);
                                break;
                            }
                        } else {
                            boolean z13 = secureValueType2 instanceof TLRPC.TL_secureValueTypePhone;
                            if ((z13 || (secureValueType2 instanceof TLRPC.TL_secureValueTypeEmail)) && wm0Var.r1(tL_secureRequiredType2, false) != null) {
                                AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(wm0Var.getParentActivity());
                                alertDialog$Builder4.k(LocaleController.getString(R.string.OK), new b5.e(wm0Var, tL_secureRequiredType2, z11, 10));
                                alertDialog$Builder4.h(LocaleController.getString(R.string.Cancel), null);
                                alertDialog$Builder4.a.N = LocaleController.getString(R.string.AppName);
                                String string = LocaleController.getString(z13 ? R.string.PassportDeletePhoneAlert : R.string.PassportDeleteEmailAlert);
                                org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder4.a;
                                c2Var.P = string;
                                wm0Var.showDialog(c2Var);
                                break;
                            }
                        }
                        wm0Var.E1(tL_secureRequiredType2, tL_secureRequiredType, arrayList2, z11);
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
                    AlertDialog$Builder alertDialog$Builder32 = new AlertDialog$Builder(wm0Var.getParentActivity());
                    alertDialog$Builder32.k(LocaleController.getString(R.string.Cancel), null);
                    secureValueType = tL_secureRequiredType2.type;
                    if (!(secureValueType instanceof TLRPC.TL_secureValueTypePersonalDetails)) {
                    }
                    ArrayList arrayList32 = new ArrayList();
                    size = arrayList2.size();
                    while (i9 < size) {
                    }
                    alertDialog$Builder32.f((CharSequence[]) arrayList32.toArray(new CharSequence[0]), new DialogInterface.OnClickListener() { // from class: org.telegram.ui.pl0
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i11) {
                            wm0 wm0Var2 = wm0Var;
                            wm0Var2.getClass();
                            ArrayList arrayList4 = arrayList2;
                            wm0Var2.E1(tL_secureRequiredType2, (TLRPC.TL_secureRequiredType) arrayList4.get(i11), arrayList4, z11);
                        }
                    });
                    wm0Var.showDialog(alertDialog$Builder32.a);
                }
                wm0Var.E1(tL_secureRequiredType2, tL_secureRequiredType, arrayList2, z11);
                break;
            case 3:
                co0.f0((co0) this.c, (gc) this.d, this.b, (TLRPC.Message[]) this.e);
                break;
            case 4:
                co0.X((co0) this.c, (gc) this.d, this.b, (TLRPC.Message) this.e);
                break;
            default:
                zf.x0 x0Var = (zf.x0) this.c;
                org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) this.d;
                gw0 gw0Var = (gw0) this.e;
                if (o2Var instanceof qn) {
                    qn qnVar = (qn) o2Var;
                    qnVar.A7(true);
                    u2 u2Var = qnVar.F1;
                    if (u2Var != null) {
                        u2Var.dismiss(true);
                    }
                }
                org.telegram.ui.ActionBar.o2 R = LaunchActivity.R();
                int i11 = 0;
                while (i11 < 2) {
                    org.telegram.ui.ActionBar.o2 o2Var2 = i11 == 0 ? o2Var : R;
                    if (o2Var2 != null && o2Var2.getLastStoryViewer() != null) {
                        m9 lastStoryViewer = o2Var2.getLastStoryViewer();
                        Dialog dialog = lastStoryViewer.q0;
                        if (dialog != null) {
                            dialog.dismiss();
                        }
                        org.telegram.ui.ActionBar.k2 k2Var = lastStoryViewer.r0;
                        if (k2Var != null) {
                            k2Var.dismiss();
                        }
                        i4 t10 = lastStoryViewer.t();
                        if (t10 != null) {
                            uj0 uj0Var = t10.b2;
                            if (uj0Var != null && uj0Var.getReactionsWindow() != null) {
                                t10.b2.getReactionsWindow().d();
                            }
                            x2 x2Var = t10.V2;
                            if (x2Var != null) {
                                x2Var.dismiss();
                            }
                            t10.N0();
                        }
                    }
                    if (o2Var2 != null && o2Var2.getVisibleDialog() != null) {
                        o2Var2.getVisibleDialog().dismiss();
                    }
                    i11++;
                }
                if (this.b || x0Var.B) {
                    PremiumPreviewFragment premiumPreviewFragment = new PremiumPreviewFragment(0, PremiumPreviewFragment.k0(gw0Var.a));
                    if (o2Var instanceof oc1) {
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
                    PremiumPreviewFragment.j0(o2Var, x0Var.F, PremiumPreviewFragment.k0(gw0Var.a), null);
                }
                x0Var.dismiss();
                break;
        }
    }

    public /* synthetic */ t3(ArrayList arrayList, TLRPC.TL_secureRequiredType tL_secureRequiredType, wm0 wm0Var, boolean z10) {
        this.a = 2;
        this.c = wm0Var;
        this.d = arrayList;
        this.e = tL_secureRequiredType;
        this.b = z10;
    }
}
