package hg;

import ai.vb;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.px;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final /* synthetic */ class s implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ h0 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ int d;
    public final /* synthetic */ String e;

    public /* synthetic */ s(h0 h0Var, int i10, String str, String str2) {
        this.a = 0;
        this.b = h0Var;
        this.d = i10;
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
        boolean z11;
        String str;
        int i10;
        switch (this.a) {
            case 0:
                h0 h0Var = this.b;
                int i11 = h0Var.V;
                int i12 = h0Var.h0;
                h0Var.h = null;
                int i13 = h0Var.d0;
                int i14 = this.d;
                if (i14 == i13) {
                    if (i11 == 2 || i12 == 6 || i12 == 5 || h0Var.U.a() != 0) {
                        h0Var.D0 -= 2;
                    } else {
                        y yVar = h0Var.j0;
                        boolean z12 = false;
                        boolean z13 = i12 != 4;
                        if (i12 == 4 || i12 == 11) {
                            j10 = 0;
                            z10 = false;
                        } else {
                            j10 = 0;
                            z10 = true;
                        }
                        if (i12 == 2 || i12 == 1) {
                            z11 = false;
                            z12 = true;
                        } else {
                            z11 = false;
                        }
                        boolean z14 = i12 == 0 ? true : z11;
                        px pxVar = h0Var.U;
                        if (pxVar != null) {
                            j10 = pxVar.a();
                        }
                        yVar.h(this.c, true, z13, true, z10, z12, 0L, z14, 0, i14, j10, null);
                        i14 = i14;
                    }
                    if (i11 != 0 && i12 != 15) {
                        String str2 = this.e;
                        h0Var.W(str2);
                        h0Var.V(i14, str2);
                        h0Var.U(i14, str2);
                        break;
                    } else {
                        h0Var.D0--;
                        break;
                    }
                }
                break;
            case 1:
                h0 h0Var2 = this.b;
                h0Var2.getClass();
                ArrayList<Object> arrayList = new ArrayList<>();
                ArrayList<CharSequence> arrayList2 = new ArrayList<>();
                ArrayList<TLRPC.User> arrayList3 = new ArrayList<>();
                new ArrayList();
                MessagesStorage messagesStorage = MessagesStorage.getInstance(h0Var2.s0);
                int i15 = h0Var2.h0;
                ArrayList<Long> arrayList4 = h0Var2.q0;
                String str3 = this.c;
                messagesStorage.localSearch(i15, str3, arrayList, arrayList2, arrayList3, arrayList4, -1);
                AndroidUtilities.runOnUIThread(new vb(h0Var2, this.d, arrayList, arrayList2, arrayList3, 3));
                q0.E1(str3, h0Var2.y0);
                h0Var2.z0 = false;
                if (str3.length() >= 3 && (LocaleController.getString(R.string.ArchiveSearchFilter).toLowerCase().startsWith(str3) || "archive".startsWith(this.e))) {
                    h0Var2.z0 = true;
                }
                AndroidUtilities.runOnUIThread(new v(h0Var2, 0));
                break;
            default:
                h0 h0Var3 = this.b;
                h0Var3.f = null;
                int i16 = h0Var3.V;
                String str4 = this.c;
                int i17 = this.d;
                if (i16 != 2) {
                    String lowerCase = str4.trim().toLowerCase();
                    if (lowerCase.length() != 0) {
                        str = str4;
                        i10 = i17;
                        MessagesStorage.getInstance(h0Var3.s0).getStorageQueue().postRunnable(new s(h0Var3, lowerCase, i10, str, 1));
                        if (h0Var3.h0 == 15) {
                            s sVar = new s(h0Var3, i10, str, this.e);
                            h0Var3.h = sVar;
                            AndroidUtilities.runOnUIThread(sVar);
                            break;
                        } else {
                            h0Var3.D0 -= 2;
                            break;
                        }
                    } else {
                        h0Var3.d0 = 0;
                        ArrayList arrayList5 = new ArrayList();
                        ArrayList arrayList6 = new ArrayList();
                        ArrayList arrayList7 = new ArrayList();
                        new ArrayList();
                        AndroidUtilities.runOnUIThread(new vb(h0Var3, h0Var3.d0, arrayList5, arrayList6, arrayList7, 3));
                    }
                }
                str = str4;
                i10 = i17;
                if (h0Var3.h0 == 15) {
                }
        }
    }

    public /* synthetic */ s(h0 h0Var, String str, int i10, String str2, int i11) {
        this.a = i11;
        this.b = h0Var;
        this.c = str;
        this.d = i10;
        this.e = str2;
    }
}
