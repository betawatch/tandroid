package ld;

import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class m extends md.b implements k, b {
    public static final /* synthetic */ AtomicReferenceFieldUpdater e = AtomicReferenceFieldUpdater.newUpdater(m.class, Object.class, "_state$volatile");
    private volatile /* synthetic */ Object _state$volatile;
    public int d;

    public m(Object obj) {
        this._state$volatile = obj;
    }

    public final Object b() {
        Object obj = e.get(this);
        if (obj == md.e.a) {
            return null;
        }
        return obj;
    }

    @Override // ld.c
    public final Object c(Object obj, tc.c cVar) {
        d(obj);
        return pc.i.a;
    }

    public final void d(Object obj) {
        int i10;
        o[] oVarArr;
        ec.a aVar;
        if (obj == null) {
            obj = md.e.a;
        }
        synchronized (this) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = e;
            if (kotlin.jvm.internal.j.a(atomicReferenceFieldUpdater.get(this), obj)) {
                return;
            }
            atomicReferenceFieldUpdater.set(this, obj);
            int i11 = this.d;
            if ((i11 & 1) != 0) {
                this.d = i11 + 2;
                return;
            }
            int i12 = i11 + 1;
            this.d = i12;
            o[] oVarArr2 = this.a;
            while (true) {
                if (oVarArr2 != null) {
                    for (o oVar : oVarArr2) {
                        if (oVar != null) {
                            AtomicReference atomicReference = oVar.a;
                            while (true) {
                                Object obj2 = atomicReference.get();
                                if (obj2 != null && obj2 != (aVar = n.b)) {
                                    ec.a aVar2 = n.a;
                                    if (obj2 != aVar2) {
                                        while (!atomicReference.compareAndSet(obj2, aVar2)) {
                                            if (atomicReference.get() != obj2) {
                                                break;
                                            }
                                        }
                                        ((id.m) obj2).resumeWith(pc.i.a);
                                        break;
                                    }
                                    while (!atomicReference.compareAndSet(obj2, aVar)) {
                                        if (atomicReference.get() != obj2) {
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                synchronized (this) {
                    i10 = this.d;
                    if (i10 == i12) {
                        this.d = i12 + 1;
                        return;
                    }
                    oVarArr = this.a;
                }
                oVarArr2 = oVarArr;
                i12 = i10;
            }
        }
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00cd A[Catch: all -> 0x003d, TryCatch #0 {all -> 0x003d, blocks: (B:13:0x0037, B:15:0x00c5, B:17:0x00cd, B:20:0x00d4, B:21:0x00d8, B:25:0x00db, B:27:0x00fc, B:30:0x010c, B:31:0x0128, B:37:0x0138, B:33:0x012f, B:36:0x0135, B:46:0x00e1, B:49:0x00e8, B:57:0x0052, B:59:0x005d, B:60:0x00b6), top: B:7:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x010c A[Catch: all -> 0x003d, TryCatch #0 {all -> 0x003d, blocks: (B:13:0x0037, B:15:0x00c5, B:17:0x00cd, B:20:0x00d4, B:21:0x00d8, B:25:0x00db, B:27:0x00fc, B:30:0x010c, B:31:0x0128, B:37:0x0138, B:33:0x012f, B:36:0x0135, B:46:0x00e1, B:49:0x00e8, B:57:0x0052, B:59:0x005d, B:60:0x00b6), top: B:7:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00e7  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x010b -> B:15:0x00c5). Please report as a decompilation issue!!! */
    @Override // ld.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object q(ld.c r18, tc.c r19) {
        /*
            Method dump skipped, instructions count: 330
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ld.m.q(ld.c, tc.c):java.lang.Object");
    }
}
