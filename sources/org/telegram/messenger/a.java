package org.telegram.messenger;

import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.LongSparseArray;
import androidx.recyclerview.widget.RecyclerView;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.TimeZone;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ a(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:143:0x02b9  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int i10;
        int i11;
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
                        i10 = bVar.f;
                        i11 = bVar.g + 1;
                        bVar.g = i11;
                    }
                    bVar.b.obtainMessage(1, i11, i10).sendToTarget();
                    try {
                        Thread.sleep(5000L);
                        if (bVar.e && bVar.f == i10 && bVar.h != i11 && !bVar.i) {
                            bVar.i = true;
                            try {
                                bVar.d.run();
                            } catch (Throwable th2) {
                                f8.g(th2, true);
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
                l2 l2Var = (l2) this.b;
                i0.r(l2Var.a0);
                l2Var.M = false;
                l2Var.invalidate();
                return;
            case 3:
                ((k2) this.b).invalidateSelf();
                return;
            case 4:
                ((i4) this.b).invalidateSelf();
                return;
            case 5:
                j4 j4Var = (j4) this.b;
                StringBuilder sb2 = new StringBuilder("emoji/compound/0_");
                j4Var.getClass();
                sb2.append(j4Var.a);
                sb2.append("_");
                String p5 = a1.g.p(sb2, j4Var.b, ".png");
                HashMap hashMap = k6.a;
                try {
                    int i12 = i0.p > 1.0f ? 1 : 2;
                    try {
                        InputStream open = w0.b.getAssets().open(p5);
                        BitmapFactory.Options options = new BitmapFactory.Options();
                        options.inJustDecodeBounds = false;
                        options.inSampleSize = i12;
                        bitmap = BitmapFactory.decodeStream(open, null, options);
                        try {
                            open.close();
                        } catch (Throwable th3) {
                            th = th3;
                            f8.g(th, true);
                            bitmap2 = bitmap;
                            if (bitmap2 != null) {
                            }
                            j4.f.remove(Integer.valueOf(j4Var.c));
                            return;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        bitmap = null;
                    }
                    bitmap2 = bitmap;
                } catch (Throwable th5) {
                    if (v2.a) {
                        f8.e("Error loading emoji", th5);
                    }
                }
                if (bitmap2 != null) {
                    j4.e.put(j4Var.c, bitmap2);
                    ag.f3 f3Var = k6.l;
                    i0.r(f3Var);
                    i0.g3(f3Var);
                }
                j4.f.remove(Integer.valueOf(j4Var.c));
                return;
            case 6:
                ((k2.t0) this.b).d(true);
                return;
            case 7:
                a7 a7Var = (a7) this.b;
                LongSparseArray longSparseArray = a7Var.c;
                while (longSparseArray.size() > 0) {
                    long keyAt = longSparseArray.keyAt(0);
                    HashMap hashMap2 = (HashMap) longSparseArray.valueAt(0);
                    longSparseArray.removeAt(0);
                    ArrayList arrayList = new ArrayList(hashMap2.keySet());
                    a7Var.d.addAll(arrayList);
                    k10 k10Var = new k10(a7Var, keyAt, arrayList, hashMap2, 1);
                    if (arrayList.isEmpty()) {
                        k10Var.a(new ArrayList());
                    } else {
                        hs a02 = hs.a0(a7Var.a);
                        a02.a.c(new mg(a02, arrayList, k10Var, 19));
                    }
                }
                longSparseArray.clear();
                return;
            case 8:
                k8 k8Var = (k8) this.b;
                k8Var.c();
                try {
                    k8Var.c.executeFast("DELETE FROM paths WHERE 1").stepThis().dispose();
                    k8Var.c.executeFast("DELETE FROM paths_by_dialog_id WHERE 1").stepThis().dispose();
                    return;
                } catch (Exception e) {
                    f8.g(e, true);
                    return;
                }
            case 9:
                TLRPC.TL_theme tL_theme = (TLRPC.TL_theme) this.b;
                ArrayList arrayList2 = org.telegram.ui.ActionBar.t6.F;
                int size = arrayList2.size();
                for (int i13 = 0; i13 < size; i13++) {
                    TLRPC.TL_theme tL_theme2 = ((org.telegram.ui.ActionBar.s6) arrayList2.get(i13)).F;
                    if (tL_theme2 != null && tL_theme2.id == tL_theme.id) {
                        TLRPC.Document document2 = tL_theme2.document;
                        if (document2 == null || (document = tL_theme.document) == null) {
                            return;
                        }
                        document2.file_reference = document.file_reference;
                        org.telegram.ui.ActionBar.t6.y1(true, false);
                        return;
                    }
                }
                return;
            case 10:
                h2.k kVar = (h2.k) this.b;
                kVar.getClass();
                FilesMigrationService.d = false;
                FilesMigrationService filesMigrationService = (FilesMigrationService) kVar.b;
                filesMigrationService.stopForeground(true);
                filesMigrationService.stopSelf();
                return;
            case 11:
                ((hc) ((androidx.mediarouter.app.f) this.b).b).i(null);
                return;
            case 12:
                ((ImageReceiver) this.b).invalidate();
                return;
            case 13:
                if (((cd) ((androidx.mediarouter.app.f) this.b).b).p0().getTimeZone().equals(TimeZone.getDefault())) {
                    return;
                }
                cd.D0().V0();
                return;
            case 14:
                org.telegram.ui.ActionBar.x1 x1Var = (org.telegram.ui.ActionBar.x1) this.b;
                String[] strArr = MediaController.U1;
                try {
                    x1Var.dismiss();
                    return;
                } catch (Exception e7) {
                    f8.g(e7, true);
                    return;
                }
            case 15:
                ((le) this.b).d.q(true, true, false, false);
                return;
            case 16:
                ((MediaController) ((e2.w) this.b).e).q(true, true, false, false);
                return;
            case 17:
                com.google.android.gms.internal.clearcut.g2 g2Var = (com.google.android.gms.internal.clearcut.g2) this.b;
                if (!PhotoViewer.v1().U1()) {
                    MediaController.X1 = null;
                    MediaController.O(0);
                    return;
                } else {
                    a aVar = new a(g2Var, 17);
                    MediaController.X1 = aVar;
                    i0.h3(aVar, 2000L);
                    return;
                }
            case 18:
                ((df) this.b).d();
                return;
            case 19:
                jf jfVar = (jf) this.b;
                try {
                    mg.c2 c2Var = new mg.c2();
                    c2Var.b = jfVar;
                    Thread thread = new Thread(c2Var, "VideoConvertRunnable");
                    thread.start();
                    thread.join();
                    return;
                } catch (Exception e10) {
                    f8.g(e10, true);
                    return;
                }
            case 20:
                zs.e().k(zs.P4, 0, (TLRPC.Document) this.b, 7);
                return;
            case 21:
                ((org.telegram.ui.Components.ub) this.b).f();
                return;
            case 22:
                TLObject tLObject = (TLObject) this.b;
                if (tLObject instanceof TLRPC.TL_auth_loggedOut) {
                    TLRPC.TL_auth_loggedOut tL_auth_loggedOut = (TLRPC.TL_auth_loggedOut) tLObject;
                    if (tL_auth_loggedOut.future_auth_token != null) {
                        SharedPreferences sharedPreferences = w0.b.getSharedPreferences("saved_tokens", 0);
                        int i14 = sharedPreferences.getInt("count", 0);
                        SerializedData serializedData = new SerializedData(tL_auth_loggedOut.getObjectSize());
                        tL_auth_loggedOut.serializeToStream(serializedData);
                        sharedPreferences.edit().putString(i0.a.i(i14, "log_out_token_"), Utilities.f(serializedData.toByteArray())).putInt("count", i14 + 1).apply();
                        BackupAgent.a();
                        return;
                    }
                    return;
                }
                return;
            case 23:
                TL_update.TL_updateLangPack tL_updateLangPack = (TL_update.TL_updateLangPack) this.b;
                cd D0 = cd.D0();
                TLRPC.TL_langPackDifference tL_langPackDifference = tL_updateLangPack.difference;
                if (D0.B == null) {
                    return;
                }
                String lowerCase = tL_langPackDifference.lang_code.replace('-', '_').toLowerCase();
                if (lowerCase.equals(D0.B.c) || lowerCase.equals(D0.B.e)) {
                    D0.Y0(D0.B, tL_langPackDifference, null);
                    return;
                }
                return;
            case 24:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.b;
                if (tL_error != null) {
                    org.telegram.ui.Components.cc.d0(tL_error);
                    return;
                }
                return;
            case 25:
                Runnable runnable = (Runnable) this.b;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 26:
                ((org.telegram.ui.lg) this.b).run();
                return;
            case 27:
                zr zrVar = (zr) this.b;
                if (zrVar != null) {
                    zrVar.i(true);
                    return;
                }
                return;
            case 28:
                ((x3) this.b).a(null);
                return;
            default:
                ((MusicPlayerService) this.b).stopSelf();
                return;
        }
    }

    public /* synthetic */ a(vp vpVar, TL_update.TL_updateLangPack tL_updateLangPack) {
        this.a = 23;
        this.b = tL_updateLangPack;
    }
}
