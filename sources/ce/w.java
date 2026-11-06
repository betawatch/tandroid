package ce;

import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes.dex */
public final class w extends de.b implements u, c, de.e {
    public static final /* synthetic */ AtomicReferenceFieldUpdater e = AtomicReferenceFieldUpdater.newUpdater(w.class, Object.class, "_state$volatile");
    private volatile /* synthetic */ Object _state$volatile;
    public int d;

    public w(Object obj) {
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
    @Override // ce.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object B(ce.d r18, kd.c r19) {
        /*
            Method dump skipped, instructions count: 329
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ce.w.B(ce.d, kd.c):java.lang.Object");
    }

    @Override // de.e
    public final c P(id.h hVar, int i7, be.a aVar) {
        return ((((i7 < 0 || i7 >= 2) && i7 != -2) || aVar != be.a.b) && !((i7 == 0 || i7 == -3) && aVar == be.a.a)) ? new b(this, hVar, i7, aVar, 1) : this;
    }

    @Override // ce.d
    public final Object a(Object obj, id.c cVar) {
        if (obj == null) {
            obj = de.g.a;
        }
        c(null, obj);
        return gd.k.a;
    }

    public final boolean c(Object obj, Object obj2) {
        int i7;
        y[] yVarArr;
        com.google.android.gms.internal.clearcut.e eVar;
        synchronized (this) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = e;
            Object obj3 = atomicReferenceFieldUpdater.get(this);
            if (obj != null && !kotlin.jvm.internal.j.a(obj3, obj)) {
                return false;
            }
            if (kotlin.jvm.internal.j.a(obj3, obj2)) {
                return true;
            }
            atomicReferenceFieldUpdater.set(this, obj2);
            int i10 = this.d;
            if ((i10 & 1) != 0) {
                this.d = i10 + 2;
                return true;
            }
            int i11 = i10 + 1;
            this.d = i11;
            y[] yVarArr2 = this.a;
            while (true) {
                if (yVarArr2 != null) {
                    for (y yVar : yVarArr2) {
                        if (yVar != null) {
                            AtomicReference atomicReference = yVar.a;
                            while (true) {
                                Object obj4 = atomicReference.get();
                                if (obj4 != null && obj4 != (eVar = x.b)) {
                                    com.google.android.gms.internal.clearcut.e eVar2 = x.a;
                                    if (obj4 != eVar2) {
                                        while (!atomicReference.compareAndSet(obj4, eVar2)) {
                                            if (atomicReference.get() != obj4) {
                                                break;
                                            }
                                        }
                                        ((zd.m) obj4).resumeWith(gd.k.a);
                                        break;
                                    }
                                    while (!atomicReference.compareAndSet(obj4, eVar)) {
                                        if (atomicReference.get() != obj4) {
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                synchronized (this) {
                    i7 = this.d;
                    if (i7 == i11) {
                        this.d = i11 + 1;
                        return true;
                    }
                    yVarArr = this.a;
                }
                yVarArr2 = yVarArr;
                i11 = i7;
            }
        }
    }
}
