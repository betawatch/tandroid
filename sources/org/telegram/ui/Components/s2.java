package org.telegram.ui.Components;

import android.content.Context;
import android.net.Uri;
import java.io.IOException;
import java.util.LinkedHashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class s2 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ long b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ s2(Context context, String str, long j10, boolean z10, qf.c cVar) {
        this.d = context;
        this.e = str;
        this.b = j10;
        this.c = z10;
        this.f = cVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        org.telegram.ui.Wallet.i0 i0Var;
        iz0 r6;
        switch (this.a) {
            case 0:
                qf.d.p((Context) this.d, Uri.parse((String) this.e), this.b == 0, this.c, (qf.c) this.f);
                return;
            case 1:
                m8.G((m8) this.d, this.b, this.c, (TLRPC.Document) this.e, (Runnable) this.f);
                return;
            default:
                org.telegram.ui.Wallet.p0 p0Var = (org.telegram.ui.Wallet.p0) this.d;
                long j10 = this.b;
                String str = (String) this.e;
                boolean z10 = this.c;
                Utilities.Callback callback = (Utilities.Callback) this.f;
                org.telegram.ui.Wallet.i0 i0Var2 = null;
                try {
                    Object obj = org.telegram.ui.Wallet.p0.f;
                    synchronized (obj) {
                        p0Var.c(j10);
                        r6 = p0Var.r();
                    }
                    if (((LinkedHashMap) r6.e).containsKey(str)) {
                        i0Var = p0Var.h(r6, str, j10);
                        try {
                            synchronized (obj) {
                                try {
                                    p0Var.c(j10);
                                    if (z10) {
                                        r6.b = ConnectionsManager.getInstance(p0Var.b).getCurrentTime();
                                        if (p0Var.d.exists()) {
                                            p0Var.v(r6, new LinkedHashMap());
                                        } else {
                                            if (!p0Var.q().edit().putInt("lastUsageDate", r6.b).commit()) {
                                                throw new IOException("usage write");
                                            }
                                            AndroidUtilities.runOnUIThread(new org.telegram.ui.u90(12));
                                        }
                                    }
                                } catch (Exception e) {
                                    FileLog.e(e);
                                } finally {
                                }
                            }
                            i0Var2 = i0Var;
                        } catch (Exception e10) {
                            e = e10;
                            FileLog.e(e);
                            if (i0Var != null) {
                                i0Var.close();
                            }
                            AndroidUtilities.runOnUIThread(new bi.y2(p0Var, i0Var2, callback, j10, 26));
                            return;
                        }
                    }
                } catch (Exception e11) {
                    e = e11;
                    i0Var = null;
                }
                AndroidUtilities.runOnUIThread(new bi.y2(p0Var, i0Var2, callback, j10, 26));
                return;
        }
    }

    public /* synthetic */ s2(m8 m8Var, long j10, boolean z10, TLRPC.Document document, Runnable runnable) {
        this.d = m8Var;
        this.b = j10;
        this.c = z10;
        this.e = document;
        this.f = runnable;
    }

    public /* synthetic */ s2(org.telegram.ui.Wallet.p0 p0Var, long j10, String str, boolean z10, Utilities.Callback callback) {
        this.d = p0Var;
        this.b = j10;
        this.e = str;
        this.c = z10;
        this.f = callback;
    }
}
