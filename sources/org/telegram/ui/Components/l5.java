package org.telegram.ui.Components;

import android.os.Looper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class l5 {
    public HashMap a;
    public HashMap b;
    public HashSet c;
    public ig d;
    public final int e;

    public l5(int i10) {
        this.e = i10;
    }

    public static boolean a() {
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            return true;
        }
        if (!BuildVars.DEBUG_VERSION) {
            return false;
        }
        FileLog.e("EmojiDocumentFetcher", new IllegalStateException("Wrong thread"));
        return false;
    }

    public final void b(long j10, m5 m5Var) {
        TLRPC.Document document;
        if (j10 == 0) {
            return;
        }
        synchronized (this) {
            try {
                HashMap hashMap = this.a;
                if (hashMap != null && (document = (TLRPC.Document) hashMap.get(Long.valueOf(j10))) != null) {
                    if (m5Var != null) {
                        m5Var.a(document);
                    }
                    return;
                }
                if (a()) {
                    if (this.b == null) {
                        this.b = new HashMap();
                    }
                    ArrayList arrayList = (ArrayList) this.b.get(Long.valueOf(j10));
                    if (arrayList != null) {
                        arrayList.add(m5Var);
                        return;
                    }
                    ArrayList arrayList2 = new ArrayList(1);
                    arrayList2.add(m5Var);
                    this.b.put(Long.valueOf(j10), arrayList2);
                    if (this.c == null) {
                        this.c = new HashSet();
                    }
                    this.c.add(Long.valueOf(j10));
                    if (this.d != null) {
                        return;
                    }
                    ig igVar = new ig(this, 5);
                    this.d = igVar;
                    AndroidUtilities.runOnUIThread(igVar);
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
                return MessageObject.getInputStickerSet(document);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void d(ArrayList arrayList) {
        ArrayList arrayList2;
        if (a()) {
            p5.x();
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                if (arrayList.get(i10) instanceof TLRPC.Document) {
                    TLRPC.Document document = (TLRPC.Document) arrayList.get(i10);
                    e(document);
                    HashMap hashMap = this.b;
                    if (hashMap != null && (arrayList2 = (ArrayList) hashMap.remove(Long.valueOf(document.id))) != null) {
                        for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                            m5 m5Var = (m5) arrayList2.get(i11);
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
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    TLRPC.Document document = (TLRPC.Document) obj;
                    this.a.put(Long.valueOf(document.id), document);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
