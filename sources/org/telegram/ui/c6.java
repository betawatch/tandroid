package org.telegram.ui;

import android.text.TextUtils;
import android.util.LongSparseArray;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class c6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ y6 b;
    public final /* synthetic */ ArrayList c;
    public final /* synthetic */ ArrayList d;
    public final /* synthetic */ ArrayList e;
    public final /* synthetic */ hh.b f;

    public /* synthetic */ c6(y6 y6Var, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, hh.b bVar, int i9) {
        this.a = i9;
        this.b = y6Var;
        this.c = arrayList;
        this.d = arrayList2;
        this.e = arrayList3;
        this.f = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z10;
        switch (this.a) {
            case 0:
                y6 y6Var = this.b;
                ArrayList<Long> arrayList = this.c;
                ArrayList arrayList2 = this.d;
                ArrayList arrayList3 = this.e;
                hh.b bVar = this.f;
                ArrayList<TLRPC.User> arrayList4 = new ArrayList<>();
                ArrayList<TLRPC.Chat> arrayList5 = new ArrayList<>();
                if (!arrayList.isEmpty()) {
                    try {
                        y6Var.getMessagesStorage().getUsersInternal(arrayList, arrayList4);
                    } catch (Exception e10) {
                        FileLog.e(e10);
                    }
                }
                if (!arrayList2.isEmpty()) {
                    try {
                        y6Var.getMessagesStorage().getChatsInternal(TextUtils.join(",", arrayList2), arrayList5);
                    } catch (Exception e11) {
                        FileLog.e(e11);
                    }
                }
                int i9 = 0;
                while (i9 < arrayList3.size()) {
                    if (((r6) arrayList3.get(i9)).c <= 0) {
                        arrayList3.remove(i9);
                        i9--;
                    }
                    i9++;
                }
                Collections.sort(arrayList3, new j9.a(13));
                AndroidUtilities.runOnUIThread(new c6(y6Var, arrayList4, arrayList5, arrayList3, bVar, 1));
                break;
            default:
                y6 y6Var2 = this.b;
                ArrayList<TLRPC.User> arrayList6 = this.c;
                ArrayList<TLRPC.Chat> arrayList7 = this.d;
                ArrayList arrayList8 = this.e;
                hh.b bVar2 = this.f;
                y6Var2.getMessagesController().putUsers(arrayList6, true);
                y6Var2.getMessagesController().putChats(arrayList7, true);
                boolean z11 = false;
                r6 r6Var = null;
                int i10 = 0;
                while (i10 < arrayList8.size()) {
                    r6 r6Var2 = (r6) arrayList8.get(i10);
                    if (y6Var2.getMessagesController().getUserOrChat(r6Var2.a) == null) {
                        r6Var2.a = Long.MAX_VALUE;
                        if (r6Var != null) {
                            SparseArray sparseArray = r6Var.d;
                            int i11 = 0;
                            while (true) {
                                SparseArray sparseArray2 = r6Var2.d;
                                if (i11 < sparseArray2.size()) {
                                    int keyAt = sparseArray2.keyAt(i11);
                                    s6 s6Var = (s6) sparseArray2.valueAt(i11);
                                    s6 s6Var2 = (s6) sparseArray.get(keyAt, z11);
                                    if (s6Var2 == null) {
                                        s6Var2 = new s6();
                                        sparseArray.put(keyAt, s6Var2);
                                    }
                                    s6Var.getClass();
                                    r6 r6Var3 = r6Var;
                                    s6Var2.a += s6Var.a;
                                    r6Var3.c += s6Var.a;
                                    s6Var2.b.addAll(s6Var.b);
                                    i11++;
                                    r6Var = r6Var3;
                                    z11 = false;
                                } else {
                                    r6Var.b += r6Var2.b;
                                    arrayList8.remove(i10);
                                    i10--;
                                    z10 = true;
                                }
                            }
                        } else {
                            r6Var = r6Var2;
                            z10 = false;
                        }
                        if (z10) {
                            Collections.sort(arrayList8, new j9.a(13));
                        }
                    }
                    i10++;
                    z11 = false;
                }
                bVar2.b = arrayList8;
                LongSparseArray longSparseArray = bVar2.c;
                longSparseArray.clear();
                int size = arrayList8.size();
                int i12 = 0;
                while (i12 < size) {
                    Object obj = arrayList8.get(i12);
                    i12++;
                    r6 r6Var4 = (r6) obj;
                    longSparseArray.put(r6Var4.a, r6Var4);
                }
                if (!y6.g0) {
                    y6Var2.U = bVar2;
                    v6 v6Var = y6Var2.J;
                    if (v6Var != null) {
                        v6Var.setCacheModel(bVar2);
                    }
                    y6Var2.v0(true);
                    y6Var2.u0();
                    if (y6Var2.N != null && !y6Var2.H && System.currentTimeMillis() - y6Var2.Q > 120) {
                        i6 i6Var = y6Var2.N;
                        long j10 = y6Var2.D;
                        boolean z12 = j10 > 0;
                        long j11 = y6Var2.E;
                        float f10 = 0.0f;
                        float f11 = j11 <= 0 ? 0.0f : j10 / j11;
                        if (y6Var2.F > 0 && j11 > 0) {
                            f10 = (j11 - r11) / j11;
                        }
                        i6Var.b(f11, f10, z12);
                        break;
                    }
                }
                break;
        }
    }
}
