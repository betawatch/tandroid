package org.telegram.ui.Components;

import android.os.Looper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class l5 {
    public HashMap a;
    public HashMap b;
    public HashSet c;
    public og d;
    public final int e;

    public l5(int i7) {
        this.e = i7;
    }

    public static boolean a() {
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            return true;
        }
        boolean z10 = org.telegram.messenger.s2.a;
        org.telegram.messenger.a8.e("EmojiDocumentFetcher", new IllegalStateException("Wrong thread"));
        return false;
    }

    public final void b(long j3, m5 m5Var) {
        TLRPC.Document document;
        if (j3 == 0) {
            return;
        }
        synchronized (this) {
            try {
                HashMap hashMap = this.a;
                if (hashMap != null && (document = (TLRPC.Document) hashMap.get(Long.valueOf(j3))) != null) {
                    if (m5Var != null) {
                        m5Var.a(document);
                    }
                    return;
                }
                if (a()) {
                    if (this.b == null) {
                        this.b = new HashMap();
                    }
                    ArrayList arrayList = (ArrayList) this.b.get(Long.valueOf(j3));
                    if (arrayList != null) {
                        arrayList.add(m5Var);
                        return;
                    }
                    ArrayList arrayList2 = new ArrayList(1);
                    arrayList2.add(m5Var);
                    this.b.put(Long.valueOf(j3), arrayList2);
                    if (this.c == null) {
                        this.c = new HashSet();
                    }
                    this.c.add(Long.valueOf(j3));
                    if (this.d != null) {
                        return;
                    }
                    og ogVar = new og(this, 5);
                    this.d = ogVar;
                    org.telegram.messenger.g0.g3(ogVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final TLRPC.InputStickerSet c(long j3) {
        synchronized (this) {
            try {
                HashMap hashMap = this.a;
                if (hashMap == null) {
                    return null;
                }
                TLRPC.Document document = (TLRPC.Document) hashMap.get(Long.valueOf(j3));
                if (document == null) {
                    return null;
                }
                return org.telegram.messenger.gj.i1(document);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void d(ArrayList arrayList) {
        ArrayList arrayList2;
        if (a()) {
            p5.w();
            for (int i7 = 0; i7 < arrayList.size(); i7++) {
                if (arrayList.get(i7) instanceof TLRPC.Document) {
                    TLRPC.Document document = (TLRPC.Document) arrayList.get(i7);
                    e(document);
                    HashMap hashMap = this.b;
                    if (hashMap != null && (arrayList2 = (ArrayList) hashMap.remove(Long.valueOf(document.id))) != null) {
                        for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                            m5 m5Var = (m5) arrayList2.get(i10);
                            if (m5Var != null) {
                                m5Var.a(document);
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
                int i7 = 0;
                while (i7 < size) {
                    Object obj = arrayList.get(i7);
                    i7++;
                    TLRPC.Document document = (TLRPC.Document) obj;
                    this.a.put(Long.valueOf(document.id), document);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
