package org.telegram.ui;

import android.R;
import android.net.Uri;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class np0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ca.i b;

    public /* synthetic */ np0(ca.i iVar, int i7) {
        this.a = i7;
        this.b = iVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x005d, code lost:
    
        if (r2 != 7) goto L31;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        e2.m mVar;
        switch (this.a) {
            case 0:
                PhotoViewer photoViewer = (PhotoViewer) this.b.c;
                qq0 qq0Var = photoViewer.E2;
                if (qq0Var != null) {
                    org.telegram.ui.Components.u51 u51Var = photoViewer.F2;
                    if (qq0Var.e != u51Var) {
                        qq0Var.c = false;
                        qq0Var.d = false;
                        if (qq0Var.b) {
                            qq0Var.a++;
                            qq0Var.b = false;
                        }
                        qq0Var.setImageResource(R.color.transparent);
                    }
                    if (u51Var != null) {
                        l2.i0 i0Var = u51Var.d;
                        if (i0Var != null) {
                            try {
                                i0Var.F1();
                                e2.u uVar = i0Var.S;
                                if (uVar != null && (mVar = uVar.I) != null) {
                                    int i7 = mVar.c;
                                    if (i7 != 6) {
                                        break;
                                    }
                                }
                            } catch (Exception unused) {
                            }
                        }
                        long U = u51Var.U() - u51Var.S();
                        if (!qq0Var.c && !qq0Var.d && !qq0Var.b && U < 5250.0f) {
                            Uri uri = u51Var.F;
                            int i10 = qq0Var.a + 1;
                            qq0Var.a = i10;
                            Utilities.e.c(new f10(qq0Var, uri, i10, 5));
                            qq0Var.b = true;
                        }
                    }
                    qq0Var.e = u51Var;
                    break;
                }
                break;
            case 1:
                qq0.a(((PhotoViewer) this.b.c).E2);
                break;
            default:
                qq0.a(((PhotoViewer) this.b.c).E2);
                break;
        }
    }
}
