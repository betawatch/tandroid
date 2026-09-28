package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
/* loaded from: classes3.dex */
public final class uj extends ul0 {
    public final int r = UserConfig.selectedAccount;
    public final Context s;
    public final /* synthetic */ ak v;

    public uj(ak akVar, Context context) {
        this.v = akVar;
        this.s = context;
    }

    @Override // org.telegram.ui.Components.gl0
    public final String F(int i10) {
        return null;
    }

    @Override // org.telegram.ui.Components.gl0
    public final void G(yl0 yl0Var, float f7, int[] iArr) {
        iArr[0] = 0;
        iArr[1] = 0;
    }

    @Override // org.telegram.ui.Components.ul0
    public final int M(int i10) {
        if (i10 == 0 || i10 == R() - 1) {
            return 1;
        }
        int i11 = i10 - 1;
        int i12 = this.r;
        HashMap<String, ArrayList<Object>> hashMap = ContactsController.getInstance(i12).phoneBookSectionsDict;
        ArrayList<String> arrayList = ContactsController.getInstance(i12).phoneBookSectionsArray;
        if (i11 < arrayList.size()) {
            return hashMap.get(arrayList.get(i11)).size();
        }
        return 0;
    }

    @Override // org.telegram.ui.Components.ul0
    public final Object O(int i10, int i11) {
        if (i10 == 0) {
            return null;
        }
        int i12 = i10 - 1;
        int i13 = this.r;
        HashMap<String, ArrayList<Object>> hashMap = ContactsController.getInstance(i13).phoneBookSectionsDict;
        ArrayList<String> arrayList = ContactsController.getInstance(i13).phoneBookSectionsArray;
        if (i12 < arrayList.size()) {
            ArrayList<Object> arrayList2 = hashMap.get(arrayList.get(i12));
            if (i11 < arrayList2.size()) {
                return arrayList2.get(i11);
            }
        }
        return null;
    }

    @Override // org.telegram.ui.Components.ul0
    public final int P(int i10, int i11) {
        if (i10 == 0) {
            return 1;
        }
        return i10 == R() - 1 ? 2 : 0;
    }

    @Override // org.telegram.ui.Components.ul0
    public final int R() {
        return ContactsController.getInstance(this.r).phoneBookSectionsArray.size() + 2;
    }

    @Override // org.telegram.ui.Components.ul0
    public final View T(int i10, View view) {
        return null;
    }

    @Override // org.telegram.ui.Components.ul0
    public final boolean V(int i10, int i11, s4.c1 c1Var) {
        if (i10 == 0 || i10 == R() - 1) {
            return false;
        }
        int i12 = this.r;
        return i11 < ContactsController.getInstance(i12).phoneBookSectionsDict.get(ContactsController.getInstance(i12).phoneBookSectionsArray.get(i10 + (-1))).size();
    }

    @Override // org.telegram.ui.Components.ul0
    public final void W(int i10, int i11, s4.c1 c1Var) {
        TLRPC.User user;
        if (c1Var.f == 0) {
            zj zjVar = (zj) c1Var.a;
            Object O = O(i10, i11);
            boolean z10 = true;
            if (i10 == R() - 2 && i11 == M(i10) - 1) {
                z10 = false;
            }
            if (O instanceof ContactsController.Contact) {
                ContactsController.Contact contact = (ContactsController.Contact) O;
                user = contact.user;
                if (user == null) {
                    zjVar.setCurrentId(contact.contact_id);
                    zjVar.a(null, ContactsController.formatName(contact.first_name, contact.last_name), new sj(contact, 0), z10);
                    user = null;
                }
            } else {
                user = (TLRPC.User) O;
            }
            if (user != null) {
                zjVar.a(user, null, new tj(0, user), z10);
            }
            boolean containsKey = this.v.w.containsKey(qj.a(O));
            pp ppVar = zjVar.d;
            if (ppVar.getVisibility() != 0) {
                ppVar.setVisibility(0);
            }
            ppVar.a(containsKey, false);
        }
    }

    @Override // org.telegram.ui.Components.ul0, s4.h0
    public final void l() {
        X(false);
        this.v.N();
    }

    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        View zjVar;
        Context context = this.s;
        if (i10 == 0) {
            zjVar = new zj(context, this.v.a);
        } else if (i10 != 1) {
            zjVar = new View(context);
            zjVar.setTag(-33024);
        } else {
            zjVar = new View(context);
            zjVar.setLayoutParams(new s4.p0(-1, AndroidUtilities.dp(56.0f)));
            zjVar.setTag(-33024);
        }
        return new il0(zjVar);
    }
}
