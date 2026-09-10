package org.telegram.ui;

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

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class ou implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ ou(Object obj, Object obj2, boolean z10, Object obj3, int i10) {
        this.a = i10;
        this.c = obj;
        this.d = obj2;
        this.b = z10;
        this.e = obj3;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01cf  */
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
                DataSettingsActivity dataSettingsActivity = (DataSettingsActivity) this.c;
                String str = (String) this.d;
                AlertDialog$Builder alertDialog$Builder = (AlertDialog$Builder) this.e;
                if (!TextUtils.equals(SharedConfig.storageCacheDir, str)) {
                    if (this.b) {
                        SharedConfig.storageCacheDir = str;
                        SharedConfig.saveConfig();
                        SharedConfig.readOnlyStorageDirAlertShowed = false;
                        dataSettingsActivity.n0(dataSettingsActivity.n);
                        ImageLoader.getInstance().checkMediaPaths(new ku(dataSettingsActivity, 2));
                        alertDialog$Builder.a.L0.run();
                        break;
                    } else {
                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(dataSettingsActivity.getParentActivity());
                        alertDialog$Builder2.a.R = LocaleController.getString(R.string.DecreaseSpeed);
                        alertDialog$Builder2.a.T = LocaleController.getString(R.string.SdCardAlert);
                        alertDialog$Builder2.k(LocaleController.getString(R.string.Proceed), new a7(dataSettingsActivity, str, alertDialog$Builder, 12));
                        hc.b.s(R.string.Back, alertDialog$Builder2, null);
                        break;
                    }
                }
                break;
            case 1:
                final on0 on0Var = (on0) this.c;
                final ArrayList arrayList = (ArrayList) this.d;
                final TLRPC.TL_secureRequiredType tL_secureRequiredType2 = (TLRPC.TL_secureRequiredType) this.e;
                if (arrayList != null) {
                    int size2 = arrayList.size();
                    while (i11 < size2) {
                        tL_secureRequiredType = (TLRPC.TL_secureRequiredType) arrayList.get(i11);
                        i11 = (on0Var.r1(tL_secureRequiredType, false) == null && size2 != 1) ? i11 + 1 : 0;
                        TLRPC.SecureValueType secureValueType2 = tL_secureRequiredType2.type;
                        z10 = secureValueType2 instanceof TLRPC.TL_secureValueTypePersonalDetails;
                        z11 = this.b;
                        if (!z10 || (secureValueType2 instanceof TLRPC.TL_secureValueTypeAddress)) {
                            if (tL_secureRequiredType == null && arrayList != null && !arrayList.isEmpty()) {
                                AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(on0Var.getParentActivity());
                                alertDialog$Builder3.k(LocaleController.getString(R.string.Cancel), null);
                                secureValueType = tL_secureRequiredType2.type;
                                if (!(secureValueType instanceof TLRPC.TL_secureValueTypePersonalDetails)) {
                                    alertDialog$Builder3.a.R = LocaleController.getString(R.string.PassportIdentityDocument);
                                } else if (secureValueType instanceof TLRPC.TL_secureValueTypeAddress) {
                                    alertDialog$Builder3.a.R = LocaleController.getString(R.string.PassportAddress);
                                }
                                ArrayList arrayList2 = new ArrayList();
                                size = arrayList.size();
                                for (i10 = 0; i10 < size; i10++) {
                                    TLRPC.SecureValueType secureValueType3 = ((TLRPC.TL_secureRequiredType) arrayList.get(i10)).type;
                                    if (secureValueType3 instanceof TLRPC.TL_secureValueTypeDriverLicense) {
                                        arrayList2.add(LocaleController.getString(R.string.PassportAddLicence));
                                    } else if (secureValueType3 instanceof TLRPC.TL_secureValueTypePassport) {
                                        arrayList2.add(LocaleController.getString(R.string.PassportAddPassport));
                                    } else if (secureValueType3 instanceof TLRPC.TL_secureValueTypeInternalPassport) {
                                        arrayList2.add(LocaleController.getString(R.string.PassportAddInternalPassport));
                                    } else if (secureValueType3 instanceof TLRPC.TL_secureValueTypeIdentityCard) {
                                        arrayList2.add(LocaleController.getString(R.string.PassportAddCard));
                                    } else if (secureValueType3 instanceof TLRPC.TL_secureValueTypeUtilityBill) {
                                        arrayList2.add(LocaleController.getString(R.string.PassportAddBill));
                                    } else if (secureValueType3 instanceof TLRPC.TL_secureValueTypeBankStatement) {
                                        arrayList2.add(LocaleController.getString(R.string.PassportAddBank));
                                    } else if (secureValueType3 instanceof TLRPC.TL_secureValueTypeRentalAgreement) {
                                        arrayList2.add(LocaleController.getString(R.string.PassportAddAgreement));
                                    } else if (secureValueType3 instanceof TLRPC.TL_secureValueTypeTemporaryRegistration) {
                                        arrayList2.add(LocaleController.getString(R.string.PassportAddTemporaryRegistration));
                                    } else if (secureValueType3 instanceof TLRPC.TL_secureValueTypePassportRegistration) {
                                        arrayList2.add(LocaleController.getString(R.string.PassportAddPassportRegistration));
                                    }
                                }
                                alertDialog$Builder3.f((CharSequence[]) arrayList2.toArray(new CharSequence[0]), new DialogInterface.OnClickListener() { // from class: org.telegram.ui.gm0
                                    @Override // android.content.DialogInterface.OnClickListener
                                    public final void onClick(DialogInterface dialogInterface, int i12) {
                                        on0 on0Var2 = on0Var;
                                        on0Var2.getClass();
                                        ArrayList arrayList3 = arrayList;
                                        on0Var2.E1(tL_secureRequiredType2, (TLRPC.TL_secureRequiredType) arrayList3.get(i12), arrayList3, z11);
                                    }
                                });
                                on0Var.showDialog(alertDialog$Builder3.a);
                                break;
                            }
                        } else {
                            boolean z12 = secureValueType2 instanceof TLRPC.TL_secureValueTypePhone;
                            if ((z12 || (secureValueType2 instanceof TLRPC.TL_secureValueTypeEmail)) && on0Var.r1(tL_secureRequiredType2, false) != null) {
                                AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(on0Var.getParentActivity());
                                alertDialog$Builder4.k(LocaleController.getString(R.string.OK), new com.google.firebase.messaging.i(on0Var, tL_secureRequiredType2, z11, 11));
                                alertDialog$Builder4.h(LocaleController.getString(R.string.Cancel), null);
                                alertDialog$Builder4.a.R = LocaleController.getString(R.string.AppName);
                                String string = LocaleController.getString(z12 ? R.string.PassportDeletePhoneAlert : R.string.PassportDeleteEmailAlert);
                                org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder4.a;
                                d2Var.T = string;
                                on0Var.showDialog(d2Var);
                                break;
                            }
                        }
                        on0Var.E1(tL_secureRequiredType2, tL_secureRequiredType, arrayList, z11);
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
                    AlertDialog$Builder alertDialog$Builder32 = new AlertDialog$Builder(on0Var.getParentActivity());
                    alertDialog$Builder32.k(LocaleController.getString(R.string.Cancel), null);
                    secureValueType = tL_secureRequiredType2.type;
                    if (!(secureValueType instanceof TLRPC.TL_secureValueTypePersonalDetails)) {
                    }
                    ArrayList arrayList22 = new ArrayList();
                    size = arrayList.size();
                    while (i10 < size) {
                    }
                    alertDialog$Builder32.f((CharSequence[]) arrayList22.toArray(new CharSequence[0]), new DialogInterface.OnClickListener() { // from class: org.telegram.ui.gm0
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i12) {
                            on0 on0Var2 = on0Var;
                            on0Var2.getClass();
                            ArrayList arrayList3 = arrayList;
                            on0Var2.E1(tL_secureRequiredType2, (TLRPC.TL_secureRequiredType) arrayList3.get(i12), arrayList3, z11);
                        }
                    });
                    on0Var.showDialog(alertDialog$Builder32.a);
                }
                on0Var.E1(tL_secureRequiredType2, tL_secureRequiredType, arrayList, z11);
                break;
            case 2:
                wo0.g0((wo0) this.c, (org.telegram.ui.Components.pc) this.d, this.b, (TLRPC.Message[]) this.e);
                break;
            case 3:
                wo0.Y((wo0) this.c, (org.telegram.ui.Components.pc) this.d, this.b, (TLRPC.Message) this.e);
                break;
            case 4:
                qg.a1 a1Var = (qg.a1) this.c;
                org.telegram.ui.ActionBar.p2 p2Var = (org.telegram.ui.ActionBar.p2) this.d;
                mx0 mx0Var = (mx0) this.e;
                if (p2Var instanceof eo) {
                    eo eoVar = (eo) p2Var;
                    eoVar.A7(true);
                    gg.m mVar = eoVar.J1;
                    if (mVar != null) {
                        mVar.dismiss(true);
                    }
                }
                org.telegram.ui.ActionBar.p2 R = LaunchActivity.R();
                int i12 = 0;
                while (i12 < 2) {
                    org.telegram.ui.ActionBar.p2 p2Var2 = i12 == 0 ? p2Var : R;
                    if (p2Var2 != null && p2Var2.getLastStoryViewer() != null) {
                        zh.u7 lastStoryViewer = p2Var2.getLastStoryViewer();
                        Dialog dialog = lastStoryViewer.u0;
                        if (dialog != null) {
                            dialog.dismiss();
                        }
                        org.telegram.ui.ActionBar.l2 l2Var = lastStoryViewer.v0;
                        if (l2Var != null) {
                            l2Var.dismiss();
                        }
                        zh.a3 t10 = lastStoryViewer.t();
                        if (t10 != null) {
                            org.telegram.ui.Components.pk0 pk0Var = t10.f2;
                            if (pk0Var != null && pk0Var.getReactionsWindow() != null) {
                                t10.f2.getReactionsWindow().d();
                            }
                            zh.z1 z1Var = t10.Z2;
                            if (z1Var != null) {
                                z1Var.dismiss();
                            }
                            t10.N0();
                        }
                    }
                    if (p2Var2 != null && p2Var2.getVisibleDialog() != null) {
                        p2Var2.getVisibleDialog().dismiss();
                    }
                    i12++;
                }
                if (this.b || a1Var.F) {
                    PremiumPreviewFragment premiumPreviewFragment = new PremiumPreviewFragment(0, PremiumPreviewFragment.l0(mx0Var.a));
                    if (p2Var instanceof ae1) {
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
                    PremiumPreviewFragment.k0(p2Var, a1Var.J, PremiumPreviewFragment.l0(mx0Var.a), null);
                }
                a1Var.dismiss();
                break;
            default:
                zh.v2 v2Var = (zh.v2) this.c;
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) this.d;
                org.telegram.ui.ActionBar.f6 f6Var = (org.telegram.ui.ActionBar.f6) this.e;
                ArrayList arrayList3 = new ArrayList();
                arrayList3.add(storyItem);
                zh.a3 a3Var = v2Var.l;
                zh.i5 storiesController = MessagesController.getInstance(a3Var.C2).getStoriesController();
                long j3 = a3Var.B1;
                boolean z13 = this.b;
                storiesController.o0(j3, arrayList3, z13, new org.telegram.ui.Components.je(v2Var, storyItem, z13, f6Var));
                zh.v2 v2Var2 = a3Var.t1;
                if (v2Var2 != null) {
                    v2Var2.a();
                    break;
                }
                break;
        }
    }

    public /* synthetic */ ou(ArrayList arrayList, TLRPC.TL_secureRequiredType tL_secureRequiredType, on0 on0Var, boolean z10) {
        this.a = 1;
        this.c = on0Var;
        this.d = arrayList;
        this.e = tL_secureRequiredType;
        this.b = z10;
    }
}
