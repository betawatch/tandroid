package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class jj0 implements RequestDelegate {
    public final /* synthetic */ uj0 a;
    public final /* synthetic */ String b;
    public final /* synthetic */ TL_account.saveSecureValue c;
    public final /* synthetic */ TLRPC.TL_secureRequiredType d;
    public final /* synthetic */ TLRPC.TL_secureRequiredType e;
    public final /* synthetic */ ArrayList f;
    public final /* synthetic */ org.telegram.messenger.yv g;
    public final /* synthetic */ org.telegram.messenger.yv h;
    public final /* synthetic */ org.telegram.messenger.yv i;
    public final /* synthetic */ ArrayList j;
    public final /* synthetic */ String k;
    public final /* synthetic */ String l;
    public final /* synthetic */ Runnable m;
    public final /* synthetic */ kj0 n;
    public final /* synthetic */ TLRPC.TL_inputSecureValue o;
    public final /* synthetic */ kj0 p;

    public jj0(kj0 kj0Var, uj0 uj0Var, String str, TL_account.saveSecureValue savesecurevalue, TLRPC.TL_secureRequiredType tL_secureRequiredType, TLRPC.TL_secureRequiredType tL_secureRequiredType2, ArrayList arrayList, org.telegram.messenger.yv yvVar, org.telegram.messenger.yv yvVar2, org.telegram.messenger.yv yvVar3, ArrayList arrayList2, String str2, String str3, Runnable runnable, kj0 kj0Var2, TLRPC.TL_inputSecureValue tL_inputSecureValue) {
        this.p = kj0Var;
        this.a = uj0Var;
        this.b = str;
        this.c = savesecurevalue;
        this.d = tL_secureRequiredType;
        this.e = tL_secureRequiredType2;
        this.f = arrayList;
        this.g = yvVar;
        this.h = yvVar2;
        this.i = yvVar3;
        this.j = arrayList2;
        this.k = str2;
        this.l = str3;
        this.m = runnable;
        this.n = kj0Var2;
        this.o = tL_inputSecureValue;
    }

    public final void a(final TLRPC.TL_error tL_error, final TLRPC.TL_secureValue tL_secureValue, final TLRPC.TL_secureValue tL_secureValue2) {
        kj0 kj0Var = this.p;
        final boolean z10 = kj0Var.b;
        final int i7 = kj0Var.c;
        final uj0 uj0Var = this.a;
        final String str = this.b;
        final TL_account.saveSecureValue savesecurevalue = this.c;
        final TLRPC.TL_secureRequiredType tL_secureRequiredType = this.d;
        final TLRPC.TL_secureRequiredType tL_secureRequiredType2 = this.e;
        final ArrayList arrayList = this.f;
        final org.telegram.messenger.yv yvVar = this.g;
        final org.telegram.messenger.yv yvVar2 = this.h;
        final org.telegram.messenger.yv yvVar3 = this.i;
        final ArrayList arrayList2 = this.j;
        final String str2 = this.k;
        final String str3 = this.l;
        final Runnable runnable = this.m;
        org.telegram.messenger.g0.g3(new Runnable() { // from class: org.telegram.ui.ij0
            @Override // java.lang.Runnable
            public final void run() {
                fk0 fk0Var;
                TLRPC.TL_secureRequiredType tL_secureRequiredType3;
                int i10;
                kj0 kj0Var2 = jj0.this.p;
                fk0 fk0Var2 = kj0Var2.d;
                TLRPC.TL_error tL_error2 = tL_error;
                String str4 = str;
                int i11 = 0;
                if (tL_error2 != null) {
                    uj0 uj0Var2 = uj0Var;
                    if (uj0Var2 != null) {
                        uj0Var2.f(tL_error2.text, str4);
                    }
                    i10 = ((org.telegram.ui.ActionBar.g2) fk0Var2).currentAccount;
                    org.telegram.ui.Components.b5.c0(i10, tL_error2, fk0Var2, savesecurevalue, str4);
                    return;
                }
                boolean z11 = z10;
                TLRPC.TL_secureRequiredType tL_secureRequiredType4 = tL_secureRequiredType;
                TLRPC.TL_secureRequiredType tL_secureRequiredType5 = tL_secureRequiredType2;
                if (!z11) {
                    fk0Var2.L1(tL_secureRequiredType5);
                    fk0Var2.L1(tL_secureRequiredType4);
                } else if (tL_secureRequiredType4 != null) {
                    fk0Var2.L1(tL_secureRequiredType4);
                } else {
                    fk0Var2.L1(tL_secureRequiredType5);
                }
                TLRPC.TL_secureValue tL_secureValue3 = tL_secureValue;
                if (tL_secureValue3 != null) {
                    fk0Var2.E.values.add(tL_secureValue3);
                }
                TLRPC.TL_secureValue tL_secureValue4 = tL_secureValue2;
                if (tL_secureValue4 != null) {
                    fk0Var2.E.values.add(tL_secureValue4);
                }
                ArrayList arrayList3 = arrayList;
                if (arrayList3 != null && !arrayList3.isEmpty()) {
                    int size = arrayList3.size();
                    int i12 = 0;
                    while (i12 < size) {
                        org.telegram.messenger.yv yvVar4 = (org.telegram.messenger.yv) arrayList3.get(i12);
                        if (yvVar4.d != null) {
                            int size2 = tL_secureValue3.files.size();
                            int i13 = i11;
                            while (i13 < size2) {
                                TLRPC.SecureFile secureFile = tL_secureValue3.files.get(i13);
                                if (secureFile instanceof TLRPC.TL_secureFile) {
                                    TLRPC.TL_secureFile tL_secureFile = (TLRPC.TL_secureFile) secureFile;
                                    fk0Var = fk0Var2;
                                    tL_secureRequiredType3 = tL_secureRequiredType5;
                                    if (Utilities.d(yvVar4.e, tL_secureFile.secret, 0)) {
                                        kj0.a(kj0Var2, yvVar4, tL_secureFile);
                                        break;
                                    }
                                } else {
                                    fk0Var = fk0Var2;
                                    tL_secureRequiredType3 = tL_secureRequiredType5;
                                }
                                i13++;
                                fk0Var2 = fk0Var;
                                tL_secureRequiredType5 = tL_secureRequiredType3;
                            }
                        }
                        fk0Var = fk0Var2;
                        tL_secureRequiredType3 = tL_secureRequiredType5;
                        i12++;
                        fk0Var2 = fk0Var;
                        tL_secureRequiredType5 = tL_secureRequiredType3;
                        i11 = 0;
                    }
                }
                fk0 fk0Var3 = fk0Var2;
                TLRPC.TL_secureRequiredType tL_secureRequiredType6 = tL_secureRequiredType5;
                org.telegram.messenger.yv yvVar5 = yvVar;
                if (yvVar5 != null && yvVar5.d != null) {
                    TLRPC.SecureFile secureFile2 = tL_secureValue3.selfie;
                    if (secureFile2 instanceof TLRPC.TL_secureFile) {
                        TLRPC.TL_secureFile tL_secureFile2 = (TLRPC.TL_secureFile) secureFile2;
                        if (Utilities.d(yvVar5.e, tL_secureFile2.secret, 0)) {
                            kj0.a(kj0Var2, yvVar5, tL_secureFile2);
                        }
                    }
                }
                org.telegram.messenger.yv yvVar6 = yvVar2;
                if (yvVar6 != null && yvVar6.d != null) {
                    TLRPC.SecureFile secureFile3 = tL_secureValue3.front_side;
                    if (secureFile3 instanceof TLRPC.TL_secureFile) {
                        TLRPC.TL_secureFile tL_secureFile3 = (TLRPC.TL_secureFile) secureFile3;
                        if (Utilities.d(yvVar6.e, tL_secureFile3.secret, 0)) {
                            kj0.a(kj0Var2, yvVar6, tL_secureFile3);
                        }
                    }
                }
                org.telegram.messenger.yv yvVar7 = yvVar3;
                if (yvVar7 != null && yvVar7.d != null) {
                    TLRPC.SecureFile secureFile4 = tL_secureValue3.reverse_side;
                    if (secureFile4 instanceof TLRPC.TL_secureFile) {
                        TLRPC.TL_secureFile tL_secureFile4 = (TLRPC.TL_secureFile) secureFile4;
                        if (Utilities.d(yvVar7.e, tL_secureFile4.secret, 0)) {
                            kj0.a(kj0Var2, yvVar7, tL_secureFile4);
                        }
                    }
                }
                ArrayList arrayList4 = arrayList2;
                if (arrayList4 != null && !arrayList4.isEmpty()) {
                    int size3 = arrayList4.size();
                    for (int i14 = 0; i14 < size3; i14++) {
                        org.telegram.messenger.yv yvVar8 = (org.telegram.messenger.yv) arrayList4.get(i14);
                        if (yvVar8.d != null) {
                            int size4 = tL_secureValue3.translation.size();
                            for (int i15 = 0; i15 < size4; i15++) {
                                TLRPC.SecureFile secureFile5 = tL_secureValue3.translation.get(i15);
                                if (secureFile5 instanceof TLRPC.TL_secureFile) {
                                    TLRPC.TL_secureFile tL_secureFile5 = (TLRPC.TL_secureFile) secureFile5;
                                    if (Utilities.d(yvVar8.e, tL_secureFile5.secret, 0)) {
                                        kj0.a(kj0Var2, yvVar8, tL_secureFile5);
                                        break;
                                    }
                                }
                            }
                        }
                    }
                }
                fk0Var3.P1(tL_secureRequiredType6, str4, str2, tL_secureRequiredType4, str3, z11, i7);
                runnable.run();
            }
        });
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        jj0 jj0Var;
        TLRPC.TL_inputSecureValue tL_inputSecureValue;
        int i7;
        int i10;
        fk0 fk0Var = this.p.d;
        if (tL_error != null) {
            boolean equals = tL_error.text.equals("EMAIL_VERIFICATION_NEEDED");
            String str = this.b;
            if (equals) {
                TL_account.sendVerifyEmailCode sendverifyemailcode = new TL_account.sendVerifyEmailCode();
                sendverifyemailcode.purpose = new TLRPC.TL_emailVerifyPurposePassport();
                sendverifyemailcode.email = str;
                i10 = ((org.telegram.ui.ActionBar.g2) fk0Var).currentAccount;
                ConnectionsManager.getInstance(i10).sendRequest(sendverifyemailcode, new di.m7(this, this.b, this.e, this.n, this.a, 11));
                return;
            }
            jj0Var = this;
            if (tL_error.text.equals("PHONE_VERIFICATION_NEEDED")) {
                org.telegram.messenger.g0.g3(new lc0(jj0Var.a, tL_error, str, 13));
                return;
            }
        } else {
            jj0Var = this;
        }
        if (tL_error != null || (tL_inputSecureValue = jj0Var.o) == null) {
            a(tL_error, (TLRPC.TL_secureValue) tLObject, null);
            return;
        }
        TL_account.saveSecureValue savesecurevalue = new TL_account.saveSecureValue();
        savesecurevalue.value = tL_inputSecureValue;
        savesecurevalue.secure_secret_id = fk0Var.c1;
        i7 = ((org.telegram.ui.ActionBar.g2) fk0Var).currentAccount;
        ConnectionsManager.getInstance(i7).sendRequest(savesecurevalue, new d00(15, this, (TLRPC.TL_secureValue) tLObject));
    }
}
