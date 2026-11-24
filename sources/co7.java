// default package

import android.util.SparseArray;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final /* synthetic */ class co7 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ lo7 b;
    public final /* synthetic */ long c;
    public final /* synthetic */ int d;

    public /* synthetic */ co7(lo7 lo7Var, long j, int i, byte b) {
        this.a = b;
        this.b = lo7Var;
        this.c = j;
        this.d = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0110  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        boolean z;
        int i;
        boolean z2;
        byte b = this.a;
        byte b2 = 4;
        int i2 = this.d;
        long j = this.c;
        lo7 lo7Var = this.b;
        switch (b) {
            case 0:
                vh6 vh6Var = lo7Var.c;
                ArrayList arrayList = lo7Var.a;
                vh6 vh6Var2 = lo7Var.F;
                ko7 ko7Var = (ko7) vh6Var2.f(j);
                if (ko7Var != null) {
                    HashMap hashMap = ko7Var.c;
                    hashMap.remove(Integer.valueOf(i2));
                    if (hashMap.isEmpty()) {
                        vh6Var2.l(j);
                        lo7Var.E.remove(ko7Var);
                        cf7 messagesStorage = lo7Var.getMessagesStorage();
                        messagesStorage.a.c(new vc7(messagesStorage, j, b2));
                        z = true;
                        i = 0;
                        while (i < arrayList.size()) {
                            k47 k47Var = (k47) arrayList.get(i);
                            if (k47Var != null && k47Var.N && k47Var.e1() == i2) {
                                arrayList.remove(i);
                                i--;
                                SparseArray sparseArray = (SparseArray) vh6Var.f(k47.B0(k47Var.k));
                                if (sparseArray != null) {
                                    sparseArray.remove(k47Var.e1());
                                    if (sparseArray.size() <= 0) {
                                        vh6Var.l(k47.B0(k47Var.k));
                                    }
                                }
                                z = true;
                            }
                            i++;
                        }
                        if (!z) {
                            lo7Var.Z(false);
                            break;
                        }
                    } else {
                        cf7 messagesStorage2 = lo7Var.getMessagesStorage();
                        messagesStorage2.a.c(new q87(messagesStorage2, ko7Var, (byte) 28));
                    }
                }
                z = false;
                i = 0;
                while (i < arrayList.size()) {
                }
                if (!z) {
                }
                break;
            default:
                vh6 vh6Var3 = lo7Var.c;
                ArrayList arrayList2 = lo7Var.a;
                vh6 vh6Var4 = lo7Var.F;
                ko7 ko7Var2 = (ko7) vh6Var4.f(j);
                if (ko7Var2 != null) {
                    vh6Var4.l(j);
                    lo7Var.E.remove(ko7Var2);
                    cf7 messagesStorage3 = lo7Var.getMessagesStorage();
                    messagesStorage3.a.c(new vc7(messagesStorage3, j, b2));
                    z2 = true;
                } else {
                    z2 = false;
                }
                int i3 = 0;
                while (i3 < arrayList2.size()) {
                    k47 k47Var2 = (k47) arrayList2.get(i3);
                    if (k47Var2 != null && k47Var2.N && k47Var2.e1() <= i2) {
                        arrayList2.remove(i3);
                        i3--;
                        SparseArray sparseArray2 = (SparseArray) vh6Var3.f(k47.B0(k47Var2.k));
                        if (sparseArray2 != null) {
                            sparseArray2.remove(k47Var2.e1());
                            if (sparseArray2.size() <= 0) {
                                vh6Var3.l(k47.B0(k47Var2.k));
                            }
                        }
                        z2 = true;
                    }
                    i3++;
                }
                if (z2) {
                    lo7Var.Z(false);
                    lo7Var.d0();
                    break;
                }
                break;
        }
    }
}
