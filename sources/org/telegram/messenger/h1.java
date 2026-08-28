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
import org.telegram.ui.s80;
import org.telegram.ui.x20;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class h1 implements RequestDelegate {
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

    public /* synthetic */ h1(ContactsController contactsController, HashMap hashMap, SparseArray sparseArray, boolean[] zArr, HashMap hashMap2, TLRPC.TL_contacts_importContacts tL_contacts_importContacts, int i9, HashMap hashMap3, boolean z10, HashMap hashMap4, ArrayList arrayList, HashMap hashMap5) {
        this.d = contactsController;
        this.e = hashMap;
        this.j = sparseArray;
        this.k = zArr;
        this.f = hashMap2;
        this.l = tL_contacts_importContacts;
        this.c = i9;
        this.g = hashMap3;
        this.b = z10;
        this.h = hashMap4;
        this.m = arrayList;
        this.i = hashMap5;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i9 = this.a;
        Cloneable cloneable = this.m;
        Object obj = this.l;
        Object obj2 = this.k;
        Object obj3 = this.j;
        Serializable serializable = this.i;
        Serializable serializable2 = this.h;
        Object obj4 = this.g;
        Serializable serializable3 = this.f;
        Object obj5 = this.e;
        Object obj6 = this.d;
        switch (i9) {
            case 0:
                ((ContactsController) obj6).lambda$performSyncPhoneBook$20((HashMap) obj5, (SparseArray) obj3, (boolean[]) obj2, (HashMap) serializable3, (TLRPC.TL_contacts_importContacts) obj, this.c, (HashMap) obj4, this.b, (HashMap) serializable2, (ArrayList) cloneable, (HashMap) serializable, tLObject, tL_error);
                break;
            default:
                Pattern pattern = LaunchActivity.x1;
                boolean z10 = this.b;
                AndroidUtilities.runOnUIThread(new s80((LaunchActivity) obj6, (x20) obj5, tLObject, z10, (Long) serializable3, (ve.d) obj4, (Long) serializable2, (Integer) serializable, (Integer) obj3, (byte[]) obj2, (org.telegram.ui.ActionBar.o2) obj, this.c, (Bundle) cloneable));
                break;
        }
    }

    public /* synthetic */ h1(LaunchActivity launchActivity, x20 x20Var, boolean z10, Long l10, ve.d dVar, Long l11, Integer num, Integer num2, byte[] bArr, org.telegram.ui.ActionBar.o2 o2Var, int i9, Bundle bundle) {
        this.d = launchActivity;
        this.e = x20Var;
        this.b = z10;
        this.f = l10;
        this.g = dVar;
        this.h = l11;
        this.i = num;
        this.j = num2;
        this.k = bArr;
        this.l = o2Var;
        this.c = i9;
        this.m = bundle;
    }
}
