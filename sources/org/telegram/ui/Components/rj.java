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

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes3.dex */
public final class rj extends fm0 {
    public final int r = UserConfig.selectedAccount;
    public final Context s;
    public final /* synthetic */ xj v;

    public rj(xj xjVar, Context context) {
        this.v = xjVar;
        this.s = context;
    }

    @Override // org.telegram.ui.Components.rl0
    public final String F(int i10) {
        return null;
    }

    @Override // org.telegram.ui.Components.rl0
    public final void G(jm0 jm0Var, float f7, int[] iArr) {
        iArr[0] = 0;
        iArr[1] = 0;
    }

    @Override // org.telegram.ui.Components.fm0
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

    @Override // org.telegram.ui.Components.fm0
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

    @Override // org.telegram.ui.Components.fm0
    public final int P(int i10, int i11) {
        if (i10 == 0) {
            return 1;
        }
        return i10 == R() - 1 ? 2 : 0;
    }

    @Override // org.telegram.ui.Components.fm0
    public final int R() {
        return ContactsController.getInstance(this.r).phoneBookSectionsArray.size() + 2;
    }

    @Override // org.telegram.ui.Components.fm0
    public final View T(int i10, View view) {
        return null;
    }

    @Override // org.telegram.ui.Components.fm0
    public final boolean V(int i10, int i11, s4.b1 b1Var) {
        if (i10 == 0 || i10 == R() - 1) {
            return false;
        }
        int i12 = this.r;
        return i11 < ContactsController.getInstance(i12).phoneBookSectionsDict.get(ContactsController.getInstance(i12).phoneBookSectionsArray.get(i10 + (-1))).size();
    }

    @Override // org.telegram.ui.Components.fm0
    public final void W(int i10, int i11, s4.b1 b1Var) {
        TLRPC.User user;
        if (b1Var.f == 0) {
            wj wjVar = (wj) b1Var.a;
            Object O = O(i10, i11);
            boolean z10 = true;
            if (i10 == R() - 2 && i11 == M(i10) - 1) {
                z10 = false;
            }
            if (O instanceof ContactsController.Contact) {
                ContactsController.Contact contact = (ContactsController.Contact) O;
                user = contact.user;
                if (user == null) {
                    wjVar.setCurrentId(contact.contact_id);
                    wjVar.a(null, ContactsController.formatName(contact.first_name, contact.last_name), new pj(contact, 0), z10);
                    user = null;
                }
            } else {
                user = (TLRPC.User) O;
            }
            if (user != null) {
                wjVar.a(user, null, new qj(0, user), z10);
            }
            boolean containsKey = this.v.w.containsKey(nj.a(O));
            xp xpVar = wjVar.d;
            if (xpVar.getVisibility() != 0) {
                xpVar.setVisibility(0);
            }
            xpVar.a(containsKey, false);
        }
    }

    @Override // org.telegram.ui.Components.fm0, s4.g0
    public final void l() {
        X(false);
        this.v.Q();
    }

    @Override // s4.g0
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        View wjVar;
        Context context = this.s;
        if (i10 == 0) {
            wjVar = new wj(context, this.v.a);
        } else if (i10 != 1) {
            wjVar = new View(context);
            wjVar.setTag(-33024);
        } else {
            wjVar = new View(context);
            wjVar.setLayoutParams(new s4.o0(-1, AndroidUtilities.dp(56.0f)));
            wjVar.setTag(-33024);
        }
        return new tl0(wjVar);
    }
}
