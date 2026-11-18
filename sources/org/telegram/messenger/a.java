package org.telegram.messenger;

import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.CancellationSignal;
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

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ a(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:135:0x0289  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int i7;
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
                        i7 = bVar.f;
                        i10 = bVar.g + 1;
                        bVar.g = i10;
                    }
                    bVar.b.obtainMessage(1, i10, i7).sendToTarget();
                    try {
                        Thread.sleep(5000L);
                        if (bVar.e && bVar.f == i7 && bVar.h != i10 && !bVar.i) {
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
                ((h4) this.b).invalidateSelf();
                return;
            case 5:
                i4 i4Var = (i4) this.b;
                StringBuilder sb2 = new StringBuilder("emoji/compound/0_");
                i4Var.getClass();
                sb2.append(i4Var.a);
                sb2.append("_");
                String n10 = a8.p0.n(i4Var.b, ".png", sb2);
                HashMap hashMap = j6.a;
                try {
                    int i11 = g0.p > 1.0f ? 1 : 2;
                    try {
                        InputStream open = t0.b.getAssets().open(n10);
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
                            i4.f.remove(Integer.valueOf(i4Var.c));
                            return;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        bitmap = null;
                    }
                    bitmap2 = bitmap;
                } catch (Throwable th5) {
                    if (s2.a) {
                        a8.e("Error loading emoji", th5);
                    }
                }
                if (bitmap2 != null) {
                    i4.e.put(i4Var.c, bitmap2);
                    j2 j2Var = j6.l;
                    g0.r(j2Var);
                    g0.g3(j2Var);
                }
                i4.f.remove(Integer.valueOf(i4Var.c));
                return;
            case 6:
                ((fi.y3) this.b).d(true);
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
                    q00 q00Var = new q00(x6Var, keyAt, arrayList, hashMap2, 1);
                    if (arrayList.isEmpty()) {
                        q00Var.a(new ArrayList());
                    } else {
                        tr a02 = tr.a0(x6Var.a);
                        a02.a.c(new yf(a02, arrayList, q00Var, 19));
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
                ArrayList arrayList2 = org.telegram.ui.ActionBar.n6.F;
                int size = arrayList2.size();
                for (int i12 = 0; i12 < size; i12++) {
                    TLRPC.TL_theme tL_theme2 = ((org.telegram.ui.ActionBar.m6) arrayList2.get(i12)).G;
                    if (tL_theme2 != null && tL_theme2.id == tL_theme.id) {
                        TLRPC.Document document2 = tL_theme2.document;
                        if (document2 == null || (document = tL_theme.document) == null) {
                            return;
                        }
                        document2.file_reference = document.file_reference;
                        org.telegram.ui.ActionBar.n6.y1(true, false);
                        return;
                    }
                }
                return;
            case 10:
                k2.k kVar = (k2.k) this.b;
                kVar.getClass();
                FilesMigrationService.d = false;
                FilesMigrationService filesMigrationService = (FilesMigrationService) kVar.b;
                filesMigrationService.stopForeground(true);
                filesMigrationService.stopSelf();
                return;
            case 11:
                ((CancellationSignal) this.b).cancel();
                return;
            case 12:
                ((ec) ((androidx.mediarouter.app.f) this.b).b).i(null);
                return;
            case 13:
                ((ImageReceiver) this.b).invalidate();
                return;
            case 14:
                if (((gd) ((androidx.mediarouter.app.f) this.b).b).q0().getTimeZone().equals(TimeZone.getDefault())) {
                    return;
                }
                gd.E0().Y0();
                return;
            case 15:
                org.telegram.ui.ActionBar.u1 u1Var = (org.telegram.ui.ActionBar.u1) this.b;
                String[] strArr = MediaController.W1;
                try {
                    u1Var.dismiss();
                    return;
                } catch (Exception e11) {
                    a8.g(e11, true);
                    return;
                }
            case 16:
                ((je) this.b).d.q(true, true, false, false);
                return;
            case 17:
                ((MediaController) ((h2.w) this.b).e).q(true, true, false, false);
                return;
            case 18:
                com.google.android.gms.internal.clearcut.e2 e2Var = (com.google.android.gms.internal.clearcut.e2) this.b;
                if (!PhotoViewer.p1().P1()) {
                    MediaController.Z1 = null;
                    MediaController.O(0);
                    return;
                } else {
                    a aVar = new a(e2Var, 18);
                    MediaController.Z1 = aVar;
                    g0.h3(aVar, 2000L);
                    return;
                }
            case 19:
                ((cf) this.b).d();
                return;
            case 20:
                jf jfVar = (jf) this.b;
                try {
                    j6.o oVar = new j6.o();
                    oVar.b = jfVar;
                    Thread thread = new Thread(oVar, "VideoConvertRunnable");
                    thread.start();
                    thread.join();
                    return;
                } catch (Exception e12) {
                    a8.g(e12, true);
                    return;
                }
            case 21:
                ks.e().k(ks.S4, 0, (TLRPC.Document) this.b, 7);
                return;
            case 22:
                ((org.telegram.ui.Components.ec) this.b).f();
                return;
            case 23:
                TLObject tLObject = (TLObject) this.b;
                if (tLObject instanceof TLRPC.TL_auth_loggedOut) {
                    TLRPC.TL_auth_loggedOut tL_auth_loggedOut = (TLRPC.TL_auth_loggedOut) tLObject;
                    if (tL_auth_loggedOut.future_auth_token != null) {
                        SharedPreferences sharedPreferences = t0.b.getSharedPreferences("saved_tokens", 0);
                        int i13 = sharedPreferences.getInt("count", 0);
                        SerializedData serializedData = new SerializedData(tL_auth_loggedOut.getObjectSize());
                        tL_auth_loggedOut.serializeToStream(serializedData);
                        sharedPreferences.edit().putString(i5.c.i(i13, "log_out_token_"), Utilities.f(serializedData.toByteArray())).putInt("count", i13 + 1).apply();
                        BackupAgent.a();
                        return;
                    }
                    return;
                }
                return;
            case 24:
                Runnable runnable = (Runnable) this.b;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 25:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.b;
                if (tL_error != null) {
                    org.telegram.ui.Components.lc.e0(tL_error);
                    return;
                }
                return;
            case 26:
                ((org.telegram.ui.vf) this.b).run();
                return;
            case 27:
                lr lrVar = (lr) this.b;
                if (lrVar != null) {
                    lrVar.d(true);
                    return;
                }
                return;
            case 28:
                ((a4) this.b).a(null);
                return;
            default:
                ((MusicPlayerService) this.b).stopSelf();
                return;
        }
    }
}
