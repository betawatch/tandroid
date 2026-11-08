package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class fj0 implements RequestDelegate {
    public final /* synthetic */ qj0 a;
    public final /* synthetic */ String b;
    public final /* synthetic */ TL_account.saveSecureValue c;
    public final /* synthetic */ TLRPC.TL_secureRequiredType d;
    public final /* synthetic */ TLRPC.TL_secureRequiredType e;
    public final /* synthetic */ ArrayList f;
    public final /* synthetic */ org.telegram.messenger.ew g;
    public final /* synthetic */ org.telegram.messenger.ew h;
    public final /* synthetic */ org.telegram.messenger.ew i;
    public final /* synthetic */ ArrayList j;
    public final /* synthetic */ String k;
    public final /* synthetic */ String l;
    public final /* synthetic */ Runnable m;
    public final /* synthetic */ gj0 n;
    public final /* synthetic */ TLRPC.TL_inputSecureValue o;
    public final /* synthetic */ gj0 p;

    public fj0(gj0 gj0Var, qj0 qj0Var, String str, TL_account.saveSecureValue savesecurevalue, TLRPC.TL_secureRequiredType tL_secureRequiredType, TLRPC.TL_secureRequiredType tL_secureRequiredType2, ArrayList arrayList, org.telegram.messenger.ew ewVar, org.telegram.messenger.ew ewVar2, org.telegram.messenger.ew ewVar3, ArrayList arrayList2, String str2, String str3, Runnable runnable, gj0 gj0Var2, TLRPC.TL_inputSecureValue tL_inputSecureValue) {
        this.p = gj0Var;
        this.a = qj0Var;
        this.b = str;
        this.c = savesecurevalue;
        this.d = tL_secureRequiredType;
        this.e = tL_secureRequiredType2;
        this.f = arrayList;
        this.g = ewVar;
        this.h = ewVar2;
        this.i = ewVar3;
        this.j = arrayList2;
        this.k = str2;
        this.l = str3;
        this.m = runnable;
        this.n = gj0Var2;
        this.o = tL_inputSecureValue;
    }

    public final void a(final TLRPC.TL_error tL_error, final TLRPC.TL_secureValue tL_secureValue, final TLRPC.TL_secureValue tL_secureValue2) {
        gj0 gj0Var = this.p;
        final boolean z9 = gj0Var.b;
        final int i7 = gj0Var.c;
        final qj0 qj0Var = this.a;
        final String str = this.b;
        final TL_account.saveSecureValue savesecurevalue = this.c;
        final TLRPC.TL_secureRequiredType tL_secureRequiredType = this.d;
        final TLRPC.TL_secureRequiredType tL_secureRequiredType2 = this.e;
        final ArrayList arrayList = this.f;
        final org.telegram.messenger.ew ewVar = this.g;
        final org.telegram.messenger.ew ewVar2 = this.h;
        final org.telegram.messenger.ew ewVar3 = this.i;
        final ArrayList arrayList2 = this.j;
        final String str2 = this.k;
        final String str3 = this.l;
        final Runnable runnable = this.m;
        org.telegram.messenger.g0.h3(new Runnable() { // from class: org.telegram.ui.ej0
            @Override // java.lang.Runnable
            public final void run() {
                bk0 bk0Var;
                TLRPC.TL_secureRequiredType tL_secureRequiredType3;
                int i10;
                gj0 gj0Var2 = fj0.this.p;
                bk0 bk0Var2 = gj0Var2.d;
                TLRPC.TL_error tL_error2 = tL_error;
                String str4 = str;
                int i11 = 0;
                if (tL_error2 != null) {
                    qj0 qj0Var2 = qj0Var;
                    if (qj0Var2 != null) {
                        qj0Var2.a(tL_error2.text, str4);
                    }
                    i10 = ((org.telegram.ui.ActionBar.f2) bk0Var2).currentAccount;
                    org.telegram.ui.Components.v4.c0(i10, tL_error2, bk0Var2, savesecurevalue, str4);
                    return;
                }
                boolean z10 = z9;
                TLRPC.TL_secureRequiredType tL_secureRequiredType4 = tL_secureRequiredType;
                TLRPC.TL_secureRequiredType tL_secureRequiredType5 = tL_secureRequiredType2;
                if (!z10) {
                    bk0Var2.L1(tL_secureRequiredType5);
                    bk0Var2.L1(tL_secureRequiredType4);
                } else if (tL_secureRequiredType4 != null) {
                    bk0Var2.L1(tL_secureRequiredType4);
                } else {
                    bk0Var2.L1(tL_secureRequiredType5);
                }
                TLRPC.TL_secureValue tL_secureValue3 = tL_secureValue;
                if (tL_secureValue3 != null) {
                    bk0Var2.D.values.add(tL_secureValue3);
                }
                TLRPC.TL_secureValue tL_secureValue4 = tL_secureValue2;
                if (tL_secureValue4 != null) {
                    bk0Var2.D.values.add(tL_secureValue4);
                }
                ArrayList arrayList3 = arrayList;
                if (arrayList3 != null && !arrayList3.isEmpty()) {
                    int size = arrayList3.size();
                    int i12 = 0;
                    while (i12 < size) {
                        org.telegram.messenger.ew ewVar4 = (org.telegram.messenger.ew) arrayList3.get(i12);
                        if (ewVar4.d != null) {
                            int size2 = tL_secureValue3.files.size();
                            int i13 = i11;
                            while (i13 < size2) {
                                TLRPC.SecureFile secureFile = tL_secureValue3.files.get(i13);
                                if (secureFile instanceof TLRPC.TL_secureFile) {
                                    TLRPC.TL_secureFile tL_secureFile = (TLRPC.TL_secureFile) secureFile;
                                    bk0Var = bk0Var2;
                                    tL_secureRequiredType3 = tL_secureRequiredType5;
                                    if (Utilities.d(ewVar4.e, tL_secureFile.secret, 0)) {
                                        gj0.a(gj0Var2, ewVar4, tL_secureFile);
                                        break;
                                    }
                                } else {
                                    bk0Var = bk0Var2;
                                    tL_secureRequiredType3 = tL_secureRequiredType5;
                                }
                                i13++;
                                bk0Var2 = bk0Var;
                                tL_secureRequiredType5 = tL_secureRequiredType3;
                            }
                        }
                        bk0Var = bk0Var2;
                        tL_secureRequiredType3 = tL_secureRequiredType5;
                        i12++;
                        bk0Var2 = bk0Var;
                        tL_secureRequiredType5 = tL_secureRequiredType3;
                        i11 = 0;
                    }
                }
                bk0 bk0Var3 = bk0Var2;
                TLRPC.TL_secureRequiredType tL_secureRequiredType6 = tL_secureRequiredType5;
                org.telegram.messenger.ew ewVar5 = ewVar;
                if (ewVar5 != null && ewVar5.d != null) {
                    TLRPC.SecureFile secureFile2 = tL_secureValue3.selfie;
                    if (secureFile2 instanceof TLRPC.TL_secureFile) {
                        TLRPC.TL_secureFile tL_secureFile2 = (TLRPC.TL_secureFile) secureFile2;
                        if (Utilities.d(ewVar5.e, tL_secureFile2.secret, 0)) {
                            gj0.a(gj0Var2, ewVar5, tL_secureFile2);
                        }
                    }
                }
                org.telegram.messenger.ew ewVar6 = ewVar2;
                if (ewVar6 != null && ewVar6.d != null) {
                    TLRPC.SecureFile secureFile3 = tL_secureValue3.front_side;
                    if (secureFile3 instanceof TLRPC.TL_secureFile) {
                        TLRPC.TL_secureFile tL_secureFile3 = (TLRPC.TL_secureFile) secureFile3;
                        if (Utilities.d(ewVar6.e, tL_secureFile3.secret, 0)) {
                            gj0.a(gj0Var2, ewVar6, tL_secureFile3);
                        }
                    }
                }
                org.telegram.messenger.ew ewVar7 = ewVar3;
                if (ewVar7 != null && ewVar7.d != null) {
                    TLRPC.SecureFile secureFile4 = tL_secureValue3.reverse_side;
                    if (secureFile4 instanceof TLRPC.TL_secureFile) {
                        TLRPC.TL_secureFile tL_secureFile4 = (TLRPC.TL_secureFile) secureFile4;
                        if (Utilities.d(ewVar7.e, tL_secureFile4.secret, 0)) {
                            gj0.a(gj0Var2, ewVar7, tL_secureFile4);
                        }
                    }
                }
                ArrayList arrayList4 = arrayList2;
                if (arrayList4 != null && !arrayList4.isEmpty()) {
                    int size3 = arrayList4.size();
                    for (int i14 = 0; i14 < size3; i14++) {
                        org.telegram.messenger.ew ewVar8 = (org.telegram.messenger.ew) arrayList4.get(i14);
                        if (ewVar8.d != null) {
                            int size4 = tL_secureValue3.translation.size();
                            for (int i15 = 0; i15 < size4; i15++) {
                                TLRPC.SecureFile secureFile5 = tL_secureValue3.translation.get(i15);
                                if (secureFile5 instanceof TLRPC.TL_secureFile) {
                                    TLRPC.TL_secureFile tL_secureFile5 = (TLRPC.TL_secureFile) secureFile5;
                                    if (Utilities.d(ewVar8.e, tL_secureFile5.secret, 0)) {
                                        gj0.a(gj0Var2, ewVar8, tL_secureFile5);
                                        break;
                                    }
                                }
                            }
                        }
                    }
                }
                bk0Var3.P1(tL_secureRequiredType6, str4, str2, tL_secureRequiredType4, str3, z10, i7);
                runnable.run();
            }
        });
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        fj0 fj0Var;
        TLRPC.TL_inputSecureValue tL_inputSecureValue;
        int i7;
        int i10;
        bk0 bk0Var = this.p.d;
        if (tL_error != null) {
            boolean equals = tL_error.text.equals("EMAIL_VERIFICATION_NEEDED");
            String str = this.b;
            if (equals) {
                TL_account.sendVerifyEmailCode sendverifyemailcode = new TL_account.sendVerifyEmailCode();
                sendverifyemailcode.purpose = new TLRPC.TL_emailVerifyPurposePassport();
                sendverifyemailcode.email = str;
                i10 = ((org.telegram.ui.ActionBar.f2) bk0Var).currentAccount;
                ConnectionsManager.getInstance(i10).sendRequest(sendverifyemailcode, new bi.r8(this, this.b, this.e, this.n, this.a, 11));
                return;
            }
            fj0Var = this;
            if (tL_error.text.equals("PHONE_VERIFICATION_NEEDED")) {
                org.telegram.messenger.g0.h3(new mc0(fj0Var.a, tL_error, str, 13));
                return;
            }
        } else {
            fj0Var = this;
        }
        if (tL_error != null || (tL_inputSecureValue = fj0Var.o) == null) {
            a(tL_error, (TLRPC.TL_secureValue) tLObject, null);
            return;
        }
        TL_account.saveSecureValue savesecurevalue = new TL_account.saveSecureValue();
        savesecurevalue.value = tL_inputSecureValue;
        savesecurevalue.secure_secret_id = bk0Var.b1;
        i7 = ((org.telegram.ui.ActionBar.f2) bk0Var).currentAccount;
        ConnectionsManager.getInstance(i7).sendRequest(savesecurevalue, new h50(13, this, (TLRPC.TL_secureValue) tLObject));
    }
}
