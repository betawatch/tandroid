package of;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ox;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class s implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ f0 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ int d;
    public final /* synthetic */ String e;

    public /* synthetic */ s(f0 f0Var, int i9, String str, String str2) {
        this.a = 0;
        this.b = f0Var;
        this.d = i9;
        this.c = str;
        this.e = str2;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0064  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        long j10;
        boolean z10;
        String str;
        int i9;
        switch (this.a) {
            case 0:
                f0 f0Var = this.b;
                int i10 = f0Var.R;
                int i11 = f0Var.d0;
                f0Var.h = null;
                int i12 = f0Var.Z;
                int i13 = this.d;
                if (i13 == i12) {
                    if (i10 == 2 || i11 == 6 || i11 == 5 || f0Var.Q.a() != 0) {
                        f0Var.z0 -= 2;
                    } else {
                        w wVar = f0Var.f0;
                        boolean z11 = i11 != 4;
                        if (i11 == 4 || i11 == 11) {
                            j10 = 0;
                            z10 = false;
                        } else {
                            j10 = 0;
                            z10 = true;
                        }
                        boolean z12 = i11 == 2 || i11 == 1;
                        boolean z13 = i11 == 0;
                        ox oxVar = f0Var.Q;
                        if (oxVar != null) {
                            j10 = oxVar.a();
                        }
                        wVar.h(this.c, true, z11, true, z10, z12, 0L, z13, 0, i13, j10, null);
                        i13 = i13;
                    }
                    if (i10 != 0 && i11 != 15) {
                        String str2 = this.e;
                        f0Var.X(str2);
                        f0Var.W(i13, str2);
                        f0Var.V(i13, str2);
                        break;
                    } else {
                        f0Var.z0--;
                        break;
                    }
                }
                break;
            case 1:
                f0 f0Var2 = this.b;
                f0Var2.getClass();
                ArrayList<Object> arrayList = new ArrayList<>();
                ArrayList<CharSequence> arrayList2 = new ArrayList<>();
                ArrayList<TLRPC.User> arrayList3 = new ArrayList<>();
                new ArrayList();
                MessagesStorage messagesStorage = MessagesStorage.getInstance(f0Var2.o0);
                int i14 = f0Var2.d0;
                ArrayList<Long> arrayList4 = f0Var2.m0;
                String str3 = this.c;
                messagesStorage.localSearch(i14, str3, arrayList, arrayList2, arrayList3, arrayList4, -1);
                AndroidUtilities.runOnUIThread(new fh.g1(f0Var2, this.d, arrayList, arrayList2, arrayList3, 4));
                o0.y1(str3, f0Var2.u0);
                f0Var2.v0 = false;
                if (str3.length() >= 3 && (LocaleController.getString(R.string.ArchiveSearchFilter).toLowerCase().startsWith(str3) || "archive".startsWith(this.e))) {
                    f0Var2.v0 = true;
                }
                AndroidUtilities.runOnUIThread(new t(f0Var2, 0));
                break;
            default:
                f0 f0Var3 = this.b;
                f0Var3.f = null;
                int i15 = f0Var3.R;
                String str4 = this.c;
                int i16 = this.d;
                if (i15 != 2) {
                    String lowerCase = str4.trim().toLowerCase();
                    if (lowerCase.length() != 0) {
                        str = str4;
                        i9 = i16;
                        MessagesStorage.getInstance(f0Var3.o0).getStorageQueue().postRunnable(new s(f0Var3, lowerCase, i9, str, 1));
                        if (f0Var3.d0 == 15) {
                            s sVar = new s(f0Var3, i9, str, this.e);
                            f0Var3.h = sVar;
                            AndroidUtilities.runOnUIThread(sVar);
                            break;
                        } else {
                            f0Var3.z0 -= 2;
                            break;
                        }
                    } else {
                        f0Var3.Z = 0;
                        ArrayList arrayList5 = new ArrayList();
                        ArrayList arrayList6 = new ArrayList();
                        ArrayList arrayList7 = new ArrayList();
                        new ArrayList();
                        AndroidUtilities.runOnUIThread(new fh.g1(f0Var3, f0Var3.Z, arrayList5, arrayList6, arrayList7, 4));
                    }
                }
                str = str4;
                i9 = i16;
                if (f0Var3.d0 == 15) {
                }
        }
    }

    public /* synthetic */ s(f0 f0Var, String str, int i9, String str2, int i10) {
        this.a = i10;
        this.b = f0Var;
        this.c = str;
        this.d = i9;
        this.e = str2;
    }
}
