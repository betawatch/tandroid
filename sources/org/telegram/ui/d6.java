package org.telegram.ui;

import android.text.TextUtils;
import android.util.LongSparseArray;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final /* synthetic */ class d6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ z6 b;
    public final /* synthetic */ ArrayList c;
    public final /* synthetic */ ArrayList d;
    public final /* synthetic */ ArrayList e;
    public final /* synthetic */ zh.b f;

    public /* synthetic */ d6(z6 z6Var, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, zh.b bVar, int i10) {
        this.a = i10;
        this.b = z6Var;
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
                z6 z6Var = this.b;
                ArrayList<Long> arrayList = this.c;
                ArrayList arrayList2 = this.d;
                ArrayList arrayList3 = this.e;
                zh.b bVar = this.f;
                ArrayList<TLRPC.User> arrayList4 = new ArrayList<>();
                ArrayList<TLRPC.Chat> arrayList5 = new ArrayList<>();
                if (!arrayList.isEmpty()) {
                    try {
                        z6Var.getMessagesStorage().getUsersInternal(arrayList, arrayList4);
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                }
                if (!arrayList2.isEmpty()) {
                    try {
                        z6Var.getMessagesStorage().getChatsInternal(TextUtils.join(",", arrayList2), arrayList5);
                    } catch (Exception e7) {
                        FileLog.e(e7);
                    }
                }
                int i10 = 0;
                while (i10 < arrayList3.size()) {
                    if (((r6) arrayList3.get(i10)).c <= 0) {
                        arrayList3.remove(i10);
                        i10--;
                    }
                    i10++;
                }
                Collections.sort(arrayList3, new a4.e(27));
                AndroidUtilities.runOnUIThread(new d6(z6Var, arrayList4, arrayList5, arrayList3, bVar, 1));
                break;
            default:
                z6 z6Var2 = this.b;
                ArrayList<TLRPC.User> arrayList6 = this.c;
                ArrayList<TLRPC.Chat> arrayList7 = this.d;
                ArrayList arrayList8 = this.e;
                zh.b bVar2 = this.f;
                z6Var2.getMessagesController().putUsers(arrayList6, true);
                z6Var2.getMessagesController().putChats(arrayList7, true);
                boolean z11 = false;
                r6 r6Var = null;
                int i11 = 0;
                while (i11 < arrayList8.size()) {
                    r6 r6Var2 = (r6) arrayList8.get(i11);
                    if (z6Var2.getMessagesController().getUserOrChat(r6Var2.a) == null) {
                        r6Var2.a = Long.MAX_VALUE;
                        if (r6Var != null) {
                            SparseArray sparseArray = r6Var.d;
                            int i12 = 0;
                            while (true) {
                                SparseArray sparseArray2 = r6Var2.d;
                                if (i12 < sparseArray2.size()) {
                                    int keyAt = sparseArray2.keyAt(i12);
                                    s6 s6Var = (s6) sparseArray2.valueAt(i12);
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
                                    i12++;
                                    r6Var = r6Var3;
                                    z11 = false;
                                } else {
                                    r6Var.b += r6Var2.b;
                                    arrayList8.remove(i11);
                                    i11--;
                                    z10 = true;
                                }
                            }
                        } else {
                            r6Var = r6Var2;
                            z10 = false;
                        }
                        if (z10) {
                            Collections.sort(arrayList8, new a4.e(27));
                        }
                    }
                    i11++;
                    z11 = false;
                }
                bVar2.b = arrayList8;
                LongSparseArray longSparseArray = bVar2.c;
                longSparseArray.clear();
                int size = arrayList8.size();
                int i13 = 0;
                while (i13 < size) {
                    Object obj = arrayList8.get(i13);
                    i13++;
                    r6 r6Var4 = (r6) obj;
                    longSparseArray.put(r6Var4.a, r6Var4);
                }
                if (!z6.k0) {
                    z6Var2.Y = bVar2;
                    w6 w6Var = z6Var2.N;
                    if (w6Var != null) {
                        w6Var.setCacheModel(bVar2);
                    }
                    z6Var2.w0(true);
                    z6Var2.v0();
                    if (z6Var2.R != null && !z6Var2.L && System.currentTimeMillis() - z6Var2.U > 120) {
                        j6 j6Var = z6Var2.R;
                        long j3 = z6Var2.H;
                        boolean z12 = j3 > 0;
                        long j10 = z6Var2.I;
                        float f7 = 0.0f;
                        float f10 = j10 <= 0 ? 0.0f : j3 / j10;
                        if (z6Var2.J > 0 && j10 > 0) {
                            f7 = (j10 - r11) / j10;
                        }
                        j6Var.b(f10, f7, z12);
                        break;
                    }
                }
                break;
        }
    }
}
