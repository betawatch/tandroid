package fe;

import he.v;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class m extends ge.b implements k, b {
    public static final /* synthetic */ AtomicReferenceFieldUpdater e = AtomicReferenceFieldUpdater.newUpdater(m.class, Object.class, "_state$volatile");
    private volatile /* synthetic */ Object _state$volatile;
    public int d;

    public m(Object obj) {
        this._state$volatile = obj;
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00cc A[Catch: all -> 0x003d, TryCatch #0 {all -> 0x003d, blocks: (B:13:0x0037, B:15:0x00c4, B:17:0x00cc, B:20:0x00d3, B:21:0x00d7, B:25:0x00da, B:27:0x00fb, B:30:0x010b, B:31:0x0127, B:37:0x0137, B:33:0x012e, B:36:0x0134, B:46:0x00e0, B:49:0x00e7, B:57:0x0052, B:59:0x005d, B:60:0x00b5), top: B:7:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x010b A[Catch: all -> 0x003d, TryCatch #0 {all -> 0x003d, blocks: (B:13:0x0037, B:15:0x00c4, B:17:0x00cc, B:20:0x00d3, B:21:0x00d7, B:25:0x00da, B:27:0x00fb, B:30:0x010b, B:31:0x0127, B:37:0x0137, B:33:0x012e, B:36:0x0134, B:46:0x00e0, B:49:0x00e7, B:57:0x0052, B:59:0x005d, B:60:0x00b5), top: B:7:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00e6  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x010a -> B:15:0x00c4). Please report as a decompilation issue!!! */
    @Override // fe.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object C(fe.c r18, nd.c r19) {
        /*
            Method dump skipped, instructions count: 329
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: fe.m.C(fe.c, nd.c):java.lang.Object");
    }

    @Override // fe.c
    public final Object b(Object obj, nd.c cVar) {
        d(obj);
        return jd.i.a;
    }

    public final Object c() {
        Object obj = e.get(this);
        if (obj == ge.e.a) {
            return null;
        }
        return obj;
    }

    public final void d(Object obj) {
        int i10;
        o[] oVarArr;
        v vVar;
        if (obj == null) {
            obj = ge.e.a;
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
            o[] oVarArr2 = this.a;
            while (true) {
                if (oVarArr2 != null) {
                    for (o oVar : oVarArr2) {
                        if (oVar != null) {
                            AtomicReference atomicReference = oVar.a;
                            while (true) {
                                Object obj2 = atomicReference.get();
                                if (obj2 != null && obj2 != (vVar = n.b)) {
                                    v vVar2 = n.a;
                                    if (obj2 != vVar2) {
                                        while (!atomicReference.compareAndSet(obj2, vVar2)) {
                                            if (atomicReference.get() != obj2) {
                                                break;
                                            }
                                        }
                                        ((ce.m) obj2).resumeWith(jd.i.a);
                                        break;
                                    }
                                    while (!atomicReference.compareAndSet(obj2, vVar)) {
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
}
