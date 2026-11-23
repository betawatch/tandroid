package org.telegram.ui.ActionBar;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.gs;
import org.telegram.messenger.k10;
import org.telegram.messenger.w7;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final /* synthetic */ class e6 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ gs b;
    public final /* synthetic */ Object c;

    public /* synthetic */ e6(gs gsVar, Object obj, int i7) {
        this.a = i7;
        this.b = gsVar;
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
                g6 g6Var = (g6) this.b;
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
                            org.telegram.messenger.g0.g3(new di.p6(g6Var, arrayList2, z10, 13));
                            break;
                        } else {
                            TLRPC.WallPaper wallPaper = (TLRPC.WallPaper) vector.objects.get(i7);
                            if (wallPaper instanceof TLRPC.TL_wallPaper) {
                                TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) wallPaper;
                                if (tL_wallPaper.pattern) {
                                    w7.G(k10.t0);
                                    File J = w7.J(tL_wallPaper.document, str, true, true);
                                    int size2 = arrayList.size();
                                    String str2 = str;
                                    ?? r14 = str2;
                                    int i10 = 0;
                                    ?? r13 = str2;
                                    while (i10 < size2) {
                                        j6 j6Var = (j6) arrayList.get(i10);
                                        if (j6Var.o.equals(tL_wallPaper.slug)) {
                                            if (r14 == null) {
                                                r14 = Boolean.valueOf(J.exists());
                                            }
                                            if (r13 != 0 || r14.booleanValue()) {
                                                r13 = g6.b(r13, "application/x-tgwallpattern".equals(tL_wallPaper.document.mime_type), J, j6Var);
                                                if (arrayList2 == null) {
                                                    arrayList2 = new ArrayList();
                                                }
                                                arrayList2.add(j6Var);
                                            } else {
                                                String r10 = w7.r(null, tL_wallPaper.document);
                                                if (g6Var.b == null) {
                                                    g6Var.b = new HashMap();
                                                }
                                                f6 f6Var = (f6) g6Var.b.get(r10);
                                                if (f6Var == null) {
                                                    f6Var = new f6();
                                                    f6Var.b = new ArrayList();
                                                    f6Var.a = tL_wallPaper;
                                                    g6Var.b.put(r10, f6Var);
                                                }
                                                f6Var.b.add(j6Var);
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
                org.telegram.messenger.g0.g3(new kg.y((l6) this.b, tLObject, (l6) this.c, 26));
                break;
        }
    }
}
