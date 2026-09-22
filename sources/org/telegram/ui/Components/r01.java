package org.telegram.ui.Components;

import java.util.HashMap;
import java.util.Iterator;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class r01 implements ki.n0, NotificationCenter.NotificationCenterDelegate {
    public final int a;
    public final boolean b;
    public final HashMap c = new HashMap();
    public boolean d;

    public r01(int i10, boolean z10) {
        this.a = i10;
        this.b = z10;
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.fileUploaded);
    }

    public final synchronized void a(long j3) {
        p01 p01Var = (p01) this.c.remove(Long.valueOf(j3));
        if (p01Var == null) {
            return;
        }
        p01Var.e = true;
        if (p01Var.d) {
            FileLoader.getInstance(this.a).cancelFileUpload(p01Var.a.getAbsolutePath(), this.b);
        }
    }

    public final synchronized void b(boolean z10) {
        try {
            if (this.d) {
                return;
            }
            this.d = true;
            NotificationCenter.getInstance(this.a).removeObserver(this, NotificationCenter.fileUploaded);
            if (z10) {
                Iterator it = this.c.values().iterator();
                while (it.hasNext()) {
                    p01 p01Var = (p01) it.next();
                    if (p01Var.d && !p01Var.e) {
                        FileLoader.getInstance(this.a).cancelFileUpload(p01Var.a.getAbsolutePath(), this.b);
                    }
                    it.remove();
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final void c(p01 p01Var) {
        if (p01Var.d) {
            return;
        }
        p01Var.d = true;
        FileLoader.getInstance(this.a).uploadFile(p01Var.a.getAbsolutePath(), this.b, false, 1L, 33554432, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0039, code lost:
    
        r0.f = (org.telegram.tgnet.TLRPC.InputFile) r6[1];
        r0.g = (org.telegram.tgnet.TLRPC.InputEncryptedFile) r6[2];
        r0.h = (byte[]) r6[3];
        r0.i = (byte[]) r6[4];
        r0.c = java.lang.Math.max(r0.c, ((java.lang.Long) r6[5]).longValue());
     */
    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (!this.d && i10 == NotificationCenter.fileUploaded && objArr.length >= 6) {
            String str = (String) objArr[0];
            Iterator it = this.c.values().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                p01 p01Var = (p01) it.next();
                if (!p01Var.e && p01Var.a.getAbsolutePath().equals(str)) {
                    break;
                }
            }
        }
    }
}
