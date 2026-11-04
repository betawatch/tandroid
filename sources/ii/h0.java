package ii;

import android.app.DownloadManager;
import android.database.Cursor;
import android.net.Uri;
import android.os.Environment;
import android.text.TextUtils;
import android.util.Pair;
import gi.f6;
import java.io.File;
import org.json.JSONObject;
import org.telegram.messenger.a8;
import org.telegram.messenger.hp;
import org.telegram.messenger.l10;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class h0 {
    public Long a;
    public final String b;
    public final String c;
    public File d;
    public final String e;
    public long f;
    public long g;
    public boolean h;
    public boolean i;
    public long j;
    public boolean k;
    public boolean l;
    public final Runnable m = new f6(this, 16);
    public final /* synthetic */ i0 n;

    public h0(i0 i0Var, String str, String str2) {
        this.n = i0Var;
        this.b = str;
        this.c = str2;
        TLRPC.User a22 = hp.s1(i0Var.b).a2(Long.valueOf(i0Var.c));
        DownloadManager.Request request = new DownloadManager.Request(Uri.parse(str));
        request.setTitle(l10.p(a22));
        request.setDescription(TextUtils.isEmpty(str2) ? "Downloading file..." : a1.g.q("Downloading ", str2, "..."));
        request.setNotificationVisibility(0);
        request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, str2);
        this.a = Long.valueOf(i0Var.d.enqueue(request));
    }

    public final void a() {
        i0 i0Var = this.n;
        i0Var.getClass();
        this.i = true;
        Long l10 = this.a;
        if (l10 != null) {
            i0Var.d.remove(l10.longValue());
            this.a = null;
        }
        i0Var.e.remove(this);
        i0Var.e();
    }

    public final Pair b() {
        if (this.h) {
            return new Pair(Long.valueOf(this.g), Long.valueOf(this.g));
        }
        if (this.a == null || this.i) {
            return new Pair(Long.valueOf(this.f), Long.valueOf(this.g));
        }
        if (System.currentTimeMillis() - this.j < 150) {
            return new Pair(Long.valueOf(this.f), Long.valueOf(this.g));
        }
        d();
        return new Pair(Long.valueOf(this.f), Long.valueOf(this.g));
    }

    public final boolean c() {
        return (this.h || this.a == null) ? false : true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00b0, code lost:
    
        if (0 == 0) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d() {
        i0 i0Var = this.n;
        if (this.h || this.i) {
            return;
        }
        Runnable runnable = this.m;
        org.telegram.messenger.g0.r(runnable);
        this.j = System.currentTimeMillis();
        DownloadManager.Query query = new DownloadManager.Query();
        query.setFilterById(this.a.longValue());
        Cursor cursor = null;
        try {
            try {
                cursor = i0Var.d.query(query);
                if (cursor.moveToFirst()) {
                    int i3 = cursor.getInt(cursor.getColumnIndex("status"));
                    if (i3 == 8) {
                        File file = new File(Uri.parse(cursor.getString(cursor.getColumnIndex("local_uri"))).getPath());
                        this.d = file;
                        this.h = true;
                        long length = file.length();
                        this.g = length;
                        if (length <= 0) {
                            a();
                        }
                        i0Var.f();
                    } else if (i3 == 16) {
                        a();
                        cursor.close();
                        return;
                    } else {
                        this.f = cursor.getLong(cursor.getColumnIndex("bytes_so_far"));
                        this.g = cursor.getLong(cursor.getColumnIndex("total_size"));
                        org.telegram.messenger.g0.i3(runnable, 160L);
                    }
                } else if (!this.h) {
                    a();
                }
            } catch (Exception e10) {
                a8.g(e10, true);
            }
            cursor.close();
            i0Var.e();
        } catch (Throwable th2) {
            if (0 != 0) {
                cursor.close();
            }
            throw th2;
        }
    }

    public h0(i0 i0Var, JSONObject jSONObject) {
        this.n = i0Var;
        this.b = jSONObject.optString("url");
        this.c = jSONObject.optString("file_name");
        this.g = jSONObject.optLong("size");
        this.h = jSONObject.optBoolean("done");
        this.e = jSONObject.optString("mime");
        String optString = jSONObject.optString("path");
        if (TextUtils.isEmpty(optString)) {
            return;
        }
        this.d = new File(optString);
    }
}
