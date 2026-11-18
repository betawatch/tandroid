package org.telegram.ui.ActionBar;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.fs;
import org.telegram.messenger.j10;
import org.telegram.messenger.w7;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class f6 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ fs b;
    public final /* synthetic */ Object c;

    public /* synthetic */ f6(fs fsVar, Object obj, int i7) {
        this.a = i7;
        this.b = fsVar;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v1, types: [android.graphics.Bitmap] */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v3, types: [android.graphics.Bitmap] */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v3, types: [java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r14v4, types: [java.lang.Boolean] */
    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                h6 h6Var = (h6) this.b;
                ArrayList arrayList = (ArrayList) this.c;
                if (tLObject instanceof Vector) {
                    Vector vector = (Vector) tLObject;
                    int size = vector.objects.size();
                    String str = null;
                    ArrayList arrayList2 = null;
                    int i7 = 0;
                    while (true) {
                        boolean z10 = true;
                        if (i7 >= size) {
                            org.telegram.messenger.g0.g3(new di.p6(h6Var, arrayList2, z10, 13));
                            break;
                        } else {
                            TLRPC.WallPaper wallPaper = (TLRPC.WallPaper) vector.objects.get(i7);
                            if (wallPaper instanceof TLRPC.TL_wallPaper) {
                                TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) wallPaper;
                                if (tL_wallPaper.pattern) {
                                    w7.G(j10.t0);
                                    File J = w7.J(tL_wallPaper.document, str, true, true);
                                    int size2 = arrayList.size();
                                    String str2 = str;
                                    ?? r14 = str2;
                                    int i10 = 0;
                                    ?? r13 = str2;
                                    while (i10 < size2) {
                                        k6 k6Var = (k6) arrayList.get(i10);
                                        if (k6Var.o.equals(tL_wallPaper.slug)) {
                                            if (r14 == null) {
                                                r14 = Boolean.valueOf(J.exists());
                                            }
                                            if (r13 != 0 || r14.booleanValue()) {
                                                r13 = h6.b(r13, "application/x-tgwallpattern".equals(tL_wallPaper.document.mime_type), J, k6Var);
                                                if (arrayList2 == null) {
                                                    arrayList2 = new ArrayList();
                                                }
                                                arrayList2.add(k6Var);
                                            } else {
                                                String r10 = w7.r(null, tL_wallPaper.document);
                                                if (h6Var.b == null) {
                                                    h6Var.b = new HashMap();
                                                }
                                                g6 g6Var = (g6) h6Var.b.get(r10);
                                                if (g6Var == null) {
                                                    g6Var = new g6();
                                                    g6Var.b = new ArrayList();
                                                    g6Var.a = tL_wallPaper;
                                                    h6Var.b.put(r10, g6Var);
                                                }
                                                g6Var.b.add(k6Var);
                                            }
                                        }
                                        i10++;
                                        r13 = r13;
                                    }
                                    if (r13 != 0) {
                                        r13.recycle();
                                    }
                                }
                            }
                            i7++;
                            str = null;
                        }
                    }
                }
                break;
            default:
                org.telegram.messenger.g0.g3(new kg.i0((m6) this.b, tLObject, (m6) this.c, 25));
                break;
        }
    }
}
