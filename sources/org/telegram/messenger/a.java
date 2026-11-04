package org.telegram.messenger;

import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.util.LongSparseArray;
import androidx.recyclerview.widget.RecyclerView;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.TimeZone;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ a(Object obj, int i3) {
        this.a = i3;
        this.b = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:141:0x029c  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int i3;
        int i10;
        Bitmap bitmap;
        TLRPC.Document document;
        Bitmap bitmap2 = null;
        switch (this.a) {
            case 0:
                b bVar = (b) this.b;
                while (true) {
                    synchronized (bVar.a) {
                        while (!bVar.e) {
                            try {
                                bVar.a.wait();
                            } catch (InterruptedException unused) {
                            }
                        }
                        i3 = bVar.f;
                        i10 = bVar.g + 1;
                        bVar.g = i10;
                    }
                    bVar.b.obtainMessage(1, i10, i3).sendToTarget();
                    try {
                        Thread.sleep(5000L);
                        if (bVar.e && bVar.f == i3 && bVar.h != i10 && !bVar.i) {
                            bVar.i = true;
                            try {
                                bVar.d.run();
                            } catch (Throwable th2) {
                                a8.g(th2, true);
                            }
                        }
                    } catch (InterruptedException unused2) {
                    }
                }
                break;
            case 1:
                RecyclerView recyclerView = (RecyclerView) this.b;
                if (recyclerView.getAdapter() != null) {
                    recyclerView.getAdapter().f();
                    return;
                }
                return;
            case 2:
                h2 h2Var = (h2) this.b;
                g0.r(h2Var.b0);
                h2Var.N = false;
                h2Var.invalidate();
                return;
            case 3:
                ((g2) this.b).invalidateSelf();
                return;
            case 4:
                ((f4) this.b).invalidateSelf();
                return;
            case 5:
                g4 g4Var = (g4) this.b;
                StringBuilder sb2 = new StringBuilder("emoji/compound/0_");
                g4Var.getClass();
                sb2.append(g4Var.a);
                sb2.append("_");
                String o10 = a1.g.o(g4Var.b, ".png", sb2);
                HashMap hashMap = i6.a;
                try {
                    int i11 = g0.p > 1.0f ? 1 : 2;
                    try {
                        InputStream open = t0.b.getAssets().open(o10);
                        BitmapFactory.Options options = new BitmapFactory.Options();
                        options.inJustDecodeBounds = false;
                        options.inSampleSize = i11;
                        bitmap = BitmapFactory.decodeStream(open, null, options);
                        try {
                            open.close();
                        } catch (Throwable th3) {
                            th = th3;
                            a8.g(th, true);
                            bitmap2 = bitmap;
                            if (bitmap2 != null) {
                            }
                            g4.f.remove(Integer.valueOf(g4Var.c));
                            return;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        bitmap = null;
                    }
                    bitmap2 = bitmap;
                } catch (Throwable th5) {
                    if (r2.a) {
                        a8.e("Error loading emoji", th5);
                    }
                }
                if (bitmap2 != null) {
                    g4.e.put(g4Var.c, bitmap2);
                    ai.y1 y1Var = i6.l;
                    g0.r(y1Var);
                    g0.h3(y1Var);
                }
                g4.f.remove(Integer.valueOf(g4Var.c));
                return;
            case 6:
                ((ei.i4) this.b).d(true);
                return;
            case 7:
                x6 x6Var = (x6) this.b;
                LongSparseArray longSparseArray = x6Var.c;
                while (longSparseArray.size() > 0) {
                    long keyAt = longSparseArray.keyAt(0);
                    HashMap hashMap2 = (HashMap) longSparseArray.valueAt(0);
                    longSparseArray.removeAt(0);
                    ArrayList arrayList = new ArrayList(hashMap2.keySet());
                    x6Var.d.addAll(arrayList);
                    o00 o00Var = new o00(x6Var, keyAt, arrayList, hashMap2, 1);
                    if (arrayList.isEmpty()) {
                        o00Var.a(new ArrayList());
                    } else {
                        qr a02 = qr.a0(x6Var.a);
                        a02.a.c(new fg(a02, arrayList, o00Var, 19));
                    }
                }
                longSparseArray.clear();
                return;
            case 8:
                f8 f8Var = (f8) this.b;
                f8Var.c();
                try {
                    f8Var.c.executeFast("DELETE FROM paths WHERE 1").stepThis().dispose();
                    f8Var.c.executeFast("DELETE FROM paths_by_dialog_id WHERE 1").stepThis().dispose();
                    return;
                } catch (Exception e10) {
                    a8.g(e10, true);
                    return;
                }
            case 9:
                TLRPC.TL_theme tL_theme = (TLRPC.TL_theme) this.b;
                ArrayList arrayList2 = org.telegram.ui.ActionBar.k6.F;
                int size = arrayList2.size();
                for (int i12 = 0; i12 < size; i12++) {
                    TLRPC.TL_theme tL_theme2 = ((org.telegram.ui.ActionBar.j6) arrayList2.get(i12)).G;
                    if (tL_theme2 != null && tL_theme2.id == tL_theme.id) {
                        TLRPC.Document document2 = tL_theme2.document;
                        if (document2 == null || (document = tL_theme.document) == null) {
                            return;
                        }
                        document2.file_reference = document.file_reference;
                        org.telegram.ui.ActionBar.k6.y1(true, false);
                        return;
                    }
                }
                return;
            case 10:
                j2.k kVar = (j2.k) this.b;
                kVar.getClass();
                FilesMigrationService.d = false;
                FilesMigrationService filesMigrationService = (FilesMigrationService) kVar.b;
                filesMigrationService.stopForeground(true);
                filesMigrationService.stopSelf();
                return;
            case 11:
                ((zb) ((androidx.mediarouter.app.f) this.b).b).i(null);
                return;
            case 12:
                ((ImageReceiver) this.b).invalidate();
                return;
            case 13:
                if (((bd) ((androidx.mediarouter.app.f) this.b).b).q0().getTimeZone().equals(TimeZone.getDefault())) {
                    return;
                }
                bd.E0().Y0();
                return;
            case 14:
                org.telegram.ui.ActionBar.s1 s1Var = (org.telegram.ui.ActionBar.s1) this.b;
                String[] strArr = MediaController.W1;
                try {
                    s1Var.dismiss();
                    return;
                } catch (Exception e11) {
                    a8.g(e11, true);
                    return;
                }
            case 15:
                ((fe) this.b).d.q(true, true, false, false);
                return;
            case 16:
                ((MediaController) ((g2.x) this.b).e).q(true, true, false, false);
                return;
            case 17:
                com.google.android.gms.internal.clearcut.e2 e2Var = (com.google.android.gms.internal.clearcut.e2) this.b;
                if (!PhotoViewer.v1().U1()) {
                    MediaController.Z1 = null;
                    MediaController.O(0);
                    return;
                } else {
                    a aVar = new a(e2Var, 17);
                    MediaController.Z1 = aVar;
                    g0.i3(aVar, 2000L);
                    return;
                }
            case 18:
                ((we) this.b).d();
                return;
            case 19:
                cf cfVar = (cf) this.b;
                try {
                    mi.b0 b0Var = new mi.b0();
                    b0Var.b = cfVar;
                    Thread thread = new Thread(b0Var, "VideoConvertRunnable");
                    thread.start();
                    thread.join();
                    return;
                } catch (Exception e12) {
                    a8.g(e12, true);
                    return;
                }
            case 20:
                hs.e().k(hs.P4, 0, (TLRPC.Document) this.b, 7);
                return;
            case 21:
                ((org.telegram.ui.Components.yb) this.b).f();
                return;
            case 22:
                TLObject tLObject = (TLObject) this.b;
                if (tLObject instanceof TLRPC.TL_auth_loggedOut) {
                    TLRPC.TL_auth_loggedOut tL_auth_loggedOut = (TLRPC.TL_auth_loggedOut) tLObject;
                    if (tL_auth_loggedOut.future_auth_token != null) {
                        SharedPreferences sharedPreferences = t0.b.getSharedPreferences("saved_tokens", 0);
                        int i13 = sharedPreferences.getInt("count", 0);
                        SerializedData serializedData = new SerializedData(tL_auth_loggedOut.getObjectSize());
                        tL_auth_loggedOut.serializeToStream(serializedData);
                        sharedPreferences.edit().putString(k2.p1.i(i13, "log_out_token_"), Utilities.f(serializedData.toByteArray())).putInt("count", i13 + 1).apply();
                        BackupAgent.a();
                        return;
                    }
                    return;
                }
                return;
            case 23:
                Runnable runnable = (Runnable) this.b;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 24:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.b;
                if (tL_error != null) {
                    org.telegram.ui.Components.fc.d0(tL_error);
                    return;
                }
                return;
            case 25:
                ((org.telegram.ui.tf) this.b).run();
                return;
            case 26:
                ir irVar = (ir) this.b;
                if (irVar != null) {
                    irVar.o(true);
                    return;
                }
                return;
            case 27:
                ((u3) this.b).a(null);
                return;
            case 28:
                ((MusicPlayerService) this.b).stopSelf();
                return;
            default:
                try {
                    t0.b.getContentResolver().call(Uri.parse("content://com.huawei.android.launcher.settings/badge/"), "change_badge", (String) null, (Bundle) this.b);
                    return;
                } catch (Exception e13) {
                    a8.g(e13, true);
                    return;
                }
        }
    }
}
