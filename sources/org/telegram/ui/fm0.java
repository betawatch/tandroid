package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SecureDocument;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class fm0 implements RequestDelegate {
    public final /* synthetic */ rm0 a;
    public final /* synthetic */ String b;
    public final /* synthetic */ TL_account.saveSecureValue c;
    public final /* synthetic */ TLRPC.TL_secureRequiredType d;
    public final /* synthetic */ TLRPC.TL_secureRequiredType e;
    public final /* synthetic */ ArrayList f;
    public final /* synthetic */ SecureDocument g;
    public final /* synthetic */ SecureDocument h;
    public final /* synthetic */ SecureDocument i;
    public final /* synthetic */ ArrayList j;
    public final /* synthetic */ String k;
    public final /* synthetic */ String l;
    public final /* synthetic */ Runnable m;
    public final /* synthetic */ gm0 n;
    public final /* synthetic */ TLRPC.TL_inputSecureValue o;
    public final /* synthetic */ gm0 p;

    public fm0(gm0 gm0Var, rm0 rm0Var, String str, TL_account.saveSecureValue savesecurevalue, TLRPC.TL_secureRequiredType tL_secureRequiredType, TLRPC.TL_secureRequiredType tL_secureRequiredType2, ArrayList arrayList, SecureDocument secureDocument, SecureDocument secureDocument2, SecureDocument secureDocument3, ArrayList arrayList2, String str2, String str3, Runnable runnable, gm0 gm0Var2, TLRPC.TL_inputSecureValue tL_inputSecureValue) {
        this.p = gm0Var;
        this.a = rm0Var;
        this.b = str;
        this.c = savesecurevalue;
        this.d = tL_secureRequiredType;
        this.e = tL_secureRequiredType2;
        this.f = arrayList;
        this.g = secureDocument;
        this.h = secureDocument2;
        this.i = secureDocument3;
        this.j = arrayList2;
        this.k = str2;
        this.l = str3;
        this.m = runnable;
        this.n = gm0Var2;
        this.o = tL_inputSecureValue;
    }

    public final void a(final TLRPC.TL_error tL_error, final TLRPC.TL_secureValue tL_secureValue, final TLRPC.TL_secureValue tL_secureValue2) {
        gm0 gm0Var = this.p;
        final boolean z4 = gm0Var.b;
        final int i10 = gm0Var.c;
        final rm0 rm0Var = this.a;
        final String str = this.b;
        final TL_account.saveSecureValue savesecurevalue = this.c;
        final TLRPC.TL_secureRequiredType tL_secureRequiredType = this.d;
        final TLRPC.TL_secureRequiredType tL_secureRequiredType2 = this.e;
        final ArrayList arrayList = this.f;
        final SecureDocument secureDocument = this.g;
        final SecureDocument secureDocument2 = this.h;
        final SecureDocument secureDocument3 = this.i;
        final ArrayList arrayList2 = this.j;
        final String str2 = this.k;
        final String str3 = this.l;
        final Runnable runnable = this.m;
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.em0
            @Override // java.lang.Runnable
            public final void run() {
                dn0 dn0Var;
                TLRPC.TL_secureRequiredType tL_secureRequiredType3;
                int i11;
                gm0 gm0Var2 = fm0.this.p;
                dn0 dn0Var2 = gm0Var2.d;
                TLRPC.TL_error tL_error2 = tL_error;
                String str4 = str;
                if (tL_error2 != null) {
                    rm0 rm0Var2 = rm0Var;
                    if (rm0Var2 != null) {
                        rm0Var2.D(tL_error2.text, str4);
                    }
                    i11 = ((org.telegram.ui.ActionBar.p2) dn0Var2).currentAccount;
                    org.telegram.ui.Components.z4.f0(i11, tL_error2, dn0Var2, savesecurevalue, str4);
                    return;
                }
                boolean z10 = z4;
                TLRPC.TL_secureRequiredType tL_secureRequiredType4 = tL_secureRequiredType;
                TLRPC.TL_secureRequiredType tL_secureRequiredType5 = tL_secureRequiredType2;
                if (!z10) {
                    dn0Var2.H1(tL_secureRequiredType5);
                    dn0Var2.H1(tL_secureRequiredType4);
                } else if (tL_secureRequiredType4 != null) {
                    dn0Var2.H1(tL_secureRequiredType4);
                } else {
                    dn0Var2.H1(tL_secureRequiredType5);
                }
                TLRPC.TL_secureValue tL_secureValue3 = tL_secureValue;
                if (tL_secureValue3 != null) {
                    dn0Var2.y.values.add(tL_secureValue3);
                }
                TLRPC.TL_secureValue tL_secureValue4 = tL_secureValue2;
                if (tL_secureValue4 != null) {
                    dn0Var2.y.values.add(tL_secureValue4);
                }
                ArrayList arrayList3 = arrayList;
                if (arrayList3 != null && !arrayList3.isEmpty()) {
                    int size = arrayList3.size();
                    int i12 = 0;
                    while (i12 < size) {
                        SecureDocument secureDocument4 = (SecureDocument) arrayList3.get(i12);
                        if (secureDocument4.inputFile != null) {
                            int size2 = tL_secureValue3.files.size();
                            int i13 = 0;
                            while (i13 < size2) {
                                TLRPC.SecureFile secureFile = tL_secureValue3.files.get(i13);
                                if (secureFile instanceof TLRPC.TL_secureFile) {
                                    TLRPC.TL_secureFile tL_secureFile = (TLRPC.TL_secureFile) secureFile;
                                    dn0Var = dn0Var2;
                                    tL_secureRequiredType3 = tL_secureRequiredType5;
                                    if (Utilities.arraysEquals(secureDocument4.fileSecret, 0, tL_secureFile.secret, 0)) {
                                        gm0.a(gm0Var2, secureDocument4, tL_secureFile);
                                        break;
                                    }
                                } else {
                                    dn0Var = dn0Var2;
                                    tL_secureRequiredType3 = tL_secureRequiredType5;
                                }
                                i13++;
                                dn0Var2 = dn0Var;
                                tL_secureRequiredType5 = tL_secureRequiredType3;
                            }
                        }
                        dn0Var = dn0Var2;
                        tL_secureRequiredType3 = tL_secureRequiredType5;
                        i12++;
                        dn0Var2 = dn0Var;
                        tL_secureRequiredType5 = tL_secureRequiredType3;
                    }
                }
                dn0 dn0Var3 = dn0Var2;
                TLRPC.TL_secureRequiredType tL_secureRequiredType6 = tL_secureRequiredType5;
                SecureDocument secureDocument5 = secureDocument;
                if (secureDocument5 != null && secureDocument5.inputFile != null) {
                    TLRPC.SecureFile secureFile2 = tL_secureValue3.selfie;
                    if (secureFile2 instanceof TLRPC.TL_secureFile) {
                        TLRPC.TL_secureFile tL_secureFile2 = (TLRPC.TL_secureFile) secureFile2;
                        if (Utilities.arraysEquals(secureDocument5.fileSecret, 0, tL_secureFile2.secret, 0)) {
                            gm0.a(gm0Var2, secureDocument5, tL_secureFile2);
                        }
                    }
                }
                SecureDocument secureDocument6 = secureDocument2;
                if (secureDocument6 != null && secureDocument6.inputFile != null) {
                    TLRPC.SecureFile secureFile3 = tL_secureValue3.front_side;
                    if (secureFile3 instanceof TLRPC.TL_secureFile) {
                        TLRPC.TL_secureFile tL_secureFile3 = (TLRPC.TL_secureFile) secureFile3;
                        if (Utilities.arraysEquals(secureDocument6.fileSecret, 0, tL_secureFile3.secret, 0)) {
                            gm0.a(gm0Var2, secureDocument6, tL_secureFile3);
                        }
                    }
                }
                SecureDocument secureDocument7 = secureDocument3;
                if (secureDocument7 != null && secureDocument7.inputFile != null) {
                    TLRPC.SecureFile secureFile4 = tL_secureValue3.reverse_side;
                    if (secureFile4 instanceof TLRPC.TL_secureFile) {
                        TLRPC.TL_secureFile tL_secureFile4 = (TLRPC.TL_secureFile) secureFile4;
                        if (Utilities.arraysEquals(secureDocument7.fileSecret, 0, tL_secureFile4.secret, 0)) {
                            gm0.a(gm0Var2, secureDocument7, tL_secureFile4);
                        }
                    }
                }
                ArrayList arrayList4 = arrayList2;
                if (arrayList4 != null && !arrayList4.isEmpty()) {
                    int size3 = arrayList4.size();
                    for (int i14 = 0; i14 < size3; i14++) {
                        SecureDocument secureDocument8 = (SecureDocument) arrayList4.get(i14);
                        if (secureDocument8.inputFile != null) {
                            int size4 = tL_secureValue3.translation.size();
                            for (int i15 = 0; i15 < size4; i15++) {
                                TLRPC.SecureFile secureFile5 = tL_secureValue3.translation.get(i15);
                                if (secureFile5 instanceof TLRPC.TL_secureFile) {
                                    TLRPC.TL_secureFile tL_secureFile5 = (TLRPC.TL_secureFile) secureFile5;
                                    if (Utilities.arraysEquals(secureDocument8.fileSecret, 0, tL_secureFile5.secret, 0)) {
                                        gm0.a(gm0Var2, secureDocument8, tL_secureFile5);
                                        break;
                                    }
                                }
                            }
                        }
                    }
                }
                dn0Var3.L1(tL_secureRequiredType6, str4, str2, tL_secureRequiredType4, str3, z10, i10);
                runnable.run();
            }
        });
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        fm0 fm0Var;
        TLRPC.TL_inputSecureValue tL_inputSecureValue;
        int i10;
        int i11;
        dn0 dn0Var = this.p.d;
        if (tL_error != null) {
            boolean equals = tL_error.text.equals("EMAIL_VERIFICATION_NEEDED");
            String str = this.b;
            if (equals) {
                TL_account.sendVerifyEmailCode sendverifyemailcode = new TL_account.sendVerifyEmailCode();
                sendverifyemailcode.purpose = new TLRPC.TL_emailVerifyPurposePassport();
                sendverifyemailcode.email = str;
                i11 = ((org.telegram.ui.ActionBar.p2) dn0Var).currentAccount;
                ConnectionsManager.getInstance(i11).sendRequest(sendverifyemailcode, new gg.e0(this, this.b, this.e, this.n, this.a, 12));
                return;
            }
            fm0Var = this;
            if (tL_error.text.equals("PHONE_VERIFICATION_NEEDED")) {
                AndroidUtilities.runOnUIThread(new hf0(fm0Var.a, tL_error, str, 11));
                return;
            }
        } else {
            fm0Var = this;
        }
        if (tL_error != null || (tL_inputSecureValue = fm0Var.o) == null) {
            a(tL_error, (TLRPC.TL_secureValue) tLObject, null);
            return;
        }
        TL_account.saveSecureValue savesecurevalue = new TL_account.saveSecureValue();
        savesecurevalue.value = tL_inputSecureValue;
        savesecurevalue.secure_secret_id = dn0Var.Y0;
        i10 = ((org.telegram.ui.ActionBar.p2) dn0Var).currentAccount;
        ConnectionsManager.getInstance(i10).sendRequest(savesecurevalue, new sb0(7, this, (TLRPC.TL_secureValue) tLObject));
    }
}
