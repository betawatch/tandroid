package org.telegram.messenger;

import android.os.Bundle;
import android.util.SparseArray;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.Pattern;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.f70;
import org.telegram.ui.i80;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class r4 implements RequestDelegate {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Serializable f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Serializable h;
    public final /* synthetic */ Serializable i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;
    public final /* synthetic */ Object l;
    public final /* synthetic */ Cloneable m;

    public /* synthetic */ r4(i5 i5Var, HashMap hashMap, SparseArray sparseArray, boolean[] zArr, HashMap hashMap2, TLRPC.TL_contacts_importContacts tL_contacts_importContacts, int i10, HashMap hashMap3, boolean z10, HashMap hashMap4, ArrayList arrayList, HashMap hashMap5) {
        this.d = i5Var;
        this.e = hashMap;
        this.j = sparseArray;
        this.k = zArr;
        this.f = hashMap2;
        this.l = tL_contacts_importContacts;
        this.c = i10;
        this.g = hashMap3;
        this.b = z10;
        this.h = hashMap4;
        this.m = arrayList;
        this.i = hashMap5;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        boolean z10;
        boolean z11;
        switch (this.a) {
            case 0:
                i5 i5Var = (i5) this.d;
                HashMap hashMap = (HashMap) this.e;
                SparseArray sparseArray = (SparseArray) this.j;
                boolean[] zArr = (boolean[]) this.k;
                HashMap hashMap2 = (HashMap) this.f;
                TLRPC.TL_contacts_importContacts tL_contacts_importContacts = (TLRPC.TL_contacts_importContacts) this.l;
                int i10 = this.c;
                HashMap hashMap3 = (HashMap) this.g;
                boolean z12 = this.b;
                HashMap hashMap4 = (HashMap) this.h;
                ArrayList arrayList = (ArrayList) this.m;
                HashMap hashMap5 = (HashMap) this.i;
                boolean z13 = true;
                i5Var.m0++;
                if (tL_error == null) {
                    if (v2.a) {
                        f8.b("contacts imported");
                    }
                    TLRPC.TL_contacts_importedContacts tL_contacts_importedContacts = (TLRPC.TL_contacts_importedContacts) tLObject;
                    if (tL_contacts_importedContacts.retry_contacts.isEmpty()) {
                        z11 = true;
                        z10 = false;
                    } else {
                        int i11 = 0;
                        while (i11 < tL_contacts_importedContacts.retry_contacts.size()) {
                            hashMap.remove(sparseArray.get((int) tL_contacts_importedContacts.retry_contacts.get(i11).longValue()));
                            i11++;
                            z13 = z13;
                        }
                        z11 = z13;
                        z10 = false;
                        z10 = false;
                        zArr[0] = z11;
                        if (v2.a) {
                            f8.b("result has retry contacts");
                        }
                    }
                    for (int i12 = z10 ? 1 : 0; i12 < tL_contacts_importedContacts.popular_invites.size(); i12++) {
                        TLRPC.TL_popularContact tL_popularContact = tL_contacts_importedContacts.popular_invites.get(i12);
                        f5 f5Var = (f5) hashMap2.get(sparseArray.get((int) tL_popularContact.client_id));
                        if (f5Var != null) {
                            f5Var.l = tL_popularContact.importers;
                        }
                    }
                    boolean z14 = z11;
                    i5Var.getMessagesStorage().m1(tL_contacts_importedContacts.users, null, z14, z14);
                    ArrayList arrayList2 = new ArrayList();
                    int i13 = z10 ? 1 : 0;
                    while (i13 < tL_contacts_importedContacts.imported.size()) {
                        TLRPC.TL_contact tL_contact = new TLRPC.TL_contact();
                        tL_contact.user_id = tL_contacts_importedContacts.imported.get(i13).user_id;
                        arrayList2.add(tL_contact);
                        i13++;
                        i5Var = i5Var;
                    }
                    i0.g3(new cg(i5Var, tL_contacts_importedContacts.users, 2, arrayList2, 3));
                } else {
                    boolean z15 = false;
                    int i14 = 0;
                    while (i14 < tL_contacts_importContacts.contacts.size()) {
                        hashMap.remove(sparseArray.get((int) tL_contacts_importContacts.contacts.get(i14).client_id));
                        i14++;
                        z15 = z15;
                    }
                    z10 = z15;
                    zArr[z10 ? 1 : 0] = true;
                    if (v2.a) {
                        a1.g.z(tL_error.text, new StringBuilder("import contacts error "));
                    }
                }
                if (i5Var.m0 == i10) {
                    if (!hashMap.isEmpty()) {
                        boolean z16 = z10;
                        i5Var.getMessagesStorage().Z0(hashMap, z16, z16);
                    }
                    Utilities.d.c(new yg(i5Var, hashMap3, hashMap2, z12, hashMap4, arrayList, hashMap5, zArr));
                    break;
                }
                break;
            default:
                LaunchActivity launchActivity = (LaunchActivity) this.d;
                f70 f70Var = (f70) this.e;
                boolean z17 = this.b;
                Long l4 = (Long) this.f;
                gf.e eVar = (gf.e) this.g;
                Long l10 = (Long) this.h;
                Integer num = (Integer) this.i;
                Integer num2 = (Integer) this.j;
                byte[] bArr = (byte[]) this.k;
                org.telegram.ui.ActionBar.k2 k2Var = (org.telegram.ui.ActionBar.k2) this.l;
                int i15 = this.c;
                Bundle bundle = (Bundle) this.m;
                Pattern pattern = LaunchActivity.D1;
                i0.g3(new i80(launchActivity, f70Var, tLObject, z17, l4, eVar, l10, num, num2, bArr, k2Var, i15, bundle));
                break;
        }
    }

    public /* synthetic */ r4(LaunchActivity launchActivity, f70 f70Var, boolean z10, Long l4, gf.e eVar, Long l10, Integer num, Integer num2, byte[] bArr, org.telegram.ui.ActionBar.k2 k2Var, int i10, Bundle bundle) {
        this.d = launchActivity;
        this.e = f70Var;
        this.b = z10;
        this.f = l4;
        this.g = eVar;
        this.h = l10;
        this.i = num;
        this.j = num2;
        this.k = bArr;
        this.l = k2Var;
        this.c = i10;
        this.m = bundle;
    }
}
