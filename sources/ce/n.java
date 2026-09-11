package ce;

import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes.dex */
public final class n extends de.b implements l, b {
    public static final /* synthetic */ AtomicReferenceFieldUpdater e = AtomicReferenceFieldUpdater.newUpdater(n.class, Object.class, "_state$volatile");
    private volatile /* synthetic */ Object _state$volatile;
    public int d;

    public n(Object obj) {
        this._state$volatile = obj;
    }

    @Override // ce.c
    public final Object a(Object obj, kd.c cVar) {
        d(obj);
        return gd.i.a;
    }

    public final Object c() {
        Object obj = e.get(this);
        if (obj == de.e.a) {
            return null;
        }
        return obj;
    }

    public final void d(Object obj) {
        int i10;
        p[] pVarArr;
        d9.f fVar;
        if (obj == null) {
            obj = de.e.a;
        }
        synchronized (this) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = e;
            if (kotlin.jvm.internal.i.a(atomicReferenceFieldUpdater.get(this), obj)) {
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
            p[] pVarArr2 = this.a;
            while (true) {
                if (pVarArr2 != null) {
                    for (p pVar : pVarArr2) {
                        if (pVar != null) {
                            AtomicReference atomicReference = pVar.a;
                            while (true) {
                                Object obj2 = atomicReference.get();
                                if (obj2 != null && obj2 != (fVar = o.b)) {
                                    d9.f fVar2 = o.a;
                                    if (obj2 != fVar2) {
                                        while (!atomicReference.compareAndSet(obj2, fVar2)) {
                                            if (atomicReference.get() != obj2) {
                                                break;
                                            }
                                        }
                                        ((zd.m) obj2).resumeWith(gd.i.a);
                                        break;
                                    }
                                    while (!atomicReference.compareAndSet(obj2, fVar)) {
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
                    pVarArr = this.a;
                }
                pVarArr2 = pVarArr;
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
    @Override // ce.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object z(ce.c r18, kd.c r19) {
        /*
            Method dump skipped, instructions count: 330
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ce.n.z(ce.c, kd.c):java.lang.Object");
    }
}
