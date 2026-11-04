package org.telegram.ui.Components;

import android.os.Looper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class c5 {
    public HashMap a;
    public HashMap b;
    public HashSet c;
    public vf d;
    public final int e;

    public c5(int i3) {
        this.e = i3;
    }

    public static boolean a() {
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            return true;
        }
        boolean z10 = org.telegram.messenger.r2.a;
        org.telegram.messenger.a8.e("EmojiDocumentFetcher", new IllegalStateException("Wrong thread"));
        return false;
    }

    public final void b(long j10, d5 d5Var) {
        TLRPC.Document document;
        if (j10 == 0) {
            return;
        }
        synchronized (this) {
            try {
                HashMap hashMap = this.a;
                if (hashMap != null && (document = (TLRPC.Document) hashMap.get(Long.valueOf(j10))) != null) {
                    if (d5Var != null) {
                        d5Var.a(document);
                    }
                    return;
                }
                if (a()) {
                    if (this.b == null) {
                        this.b = new HashMap();
                    }
                    ArrayList arrayList = (ArrayList) this.b.get(Long.valueOf(j10));
                    if (arrayList != null) {
                        arrayList.add(d5Var);
                        return;
                    }
                    ArrayList arrayList2 = new ArrayList(1);
                    arrayList2.add(d5Var);
                    this.b.put(Long.valueOf(j10), arrayList2);
                    if (this.c == null) {
                        this.c = new HashSet();
                    }
                    this.c.add(Long.valueOf(j10));
                    if (this.d != null) {
                        return;
                    }
                    vf vfVar = new vf(this, 5);
                    this.d = vfVar;
                    org.telegram.messenger.g0.h3(vfVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final TLRPC.InputStickerSet c(long j10) {
        synchronized (this) {
            try {
                HashMap hashMap = this.a;
                if (hashMap == null) {
                    return null;
                }
                TLRPC.Document document = (TLRPC.Document) hashMap.get(Long.valueOf(j10));
                if (document == null) {
                    return null;
                }
                return org.telegram.messenger.zi.j1(document);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void d(ArrayList arrayList) {
        ArrayList arrayList2;
        if (a()) {
            g5.w();
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                if (arrayList.get(i3) instanceof TLRPC.Document) {
                    TLRPC.Document document = (TLRPC.Document) arrayList.get(i3);
                    e(document);
                    HashMap hashMap = this.b;
                    if (hashMap != null && (arrayList2 = (ArrayList) hashMap.remove(Long.valueOf(document.id))) != null) {
                        for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                            d5 d5Var = (d5) arrayList2.get(i10);
                            if (d5Var != null) {
                                d5Var.a(document);
                            }
                        }
                        arrayList2.clear();
                    }
                }
            }
        }
    }

    public final void e(TLRPC.Document document) {
        if (document == null) {
            return;
        }
        synchronized (this) {
            try {
                if (this.a == null) {
                    this.a = new HashMap();
                }
                this.a.put(Long.valueOf(document.id), document);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void f(ArrayList arrayList) {
        if (arrayList == null) {
            return;
        }
        synchronized (this) {
            try {
                if (this.a == null) {
                    this.a = new HashMap();
                }
                int size = arrayList.size();
                int i3 = 0;
                while (i3 < size) {
                    Object obj = arrayList.get(i3);
                    i3++;
                    TLRPC.Document document = (TLRPC.Document) obj;
                    this.a.put(Long.valueOf(document.id), document);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
