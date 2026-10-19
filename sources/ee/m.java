package ee;

import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes.dex */
public final class m extends fe.b implements k, b {
    public static final /* synthetic */ AtomicReferenceFieldUpdater e = AtomicReferenceFieldUpdater.newUpdater(m.class, Object.class, "_state$volatile");
    private volatile /* synthetic */ Object _state$volatile;
    public int d;

    public m(Object obj) {
        this._state$volatile = obj;
    }

    @Override // ee.c
    public final Object a(Object obj, md.c cVar) {
        d(obj);
        return id.i.a;
    }

    public final Object c() {
        Object obj = e.get(this);
        if (obj == fe.e.a) {
            return null;
        }
        return obj;
    }

    public final void d(Object obj) {
        int i10;
        o[] oVarArr;
        com.google.android.gms.internal.clearcut.e eVar;
        if (obj == null) {
            obj = fe.e.a;
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
                                if (obj2 != null && obj2 != (eVar = n.b)) {
                                    com.google.android.gms.internal.clearcut.e eVar2 = n.a;
                                    if (obj2 != eVar2) {
                                        while (!atomicReference.compareAndSet(obj2, eVar2)) {
                                            if (atomicReference.get() != obj2) {
                                                break;
                                            }
                                        }
                                        ((be.m) obj2).resumeWith(id.i.a);
                                        break;
                                    }
                                    while (!atomicReference.compareAndSet(obj2, eVar)) {
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
    /* JADX WARN: Removed duplicated region for block: B:17:0x00cc A[Catch: all -> 0x003d, TryCatch #0 {all -> 0x003d, blocks: (B:13:0x0037, B:15:0x00c4, B:17:0x00cc, B:20:0x00d3, B:21:0x00d7, B:25:0x00da, B:27:0x00fb, B:30:0x010b, B:31:0x0127, B:37:0x0137, B:33:0x012e, B:36:0x0134, B:46:0x00e0, B:49:0x00e7, B:57:0x0052, B:59:0x005d, B:60:0x00b5), top: B:7:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x010b A[Catch: all -> 0x003d, TryCatch #0 {all -> 0x003d, blocks: (B:13:0x0037, B:15:0x00c4, B:17:0x00cc, B:20:0x00d3, B:21:0x00d7, B:25:0x00da, B:27:0x00fb, B:30:0x010b, B:31:0x0127, B:37:0x0137, B:33:0x012e, B:36:0x0134, B:46:0x00e0, B:49:0x00e7, B:57:0x0052, B:59:0x005d, B:60:0x00b5), top: B:7:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00e6  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x010a -> B:15:0x00c4). Please report as a decompilation issue!!! */
    @Override // ee.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object l(ee.c r18, md.c r19) {
        /*
            Method dump skipped, instructions count: 329
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ee.m.l(ee.c, md.c):java.lang.Object");
    }
}
