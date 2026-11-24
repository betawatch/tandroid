// default package

import android.app.DownloadManager;
import android.database.Cursor;
import android.net.Uri;
import android.os.Environment;
import android.text.TextUtils;
import android.util.Pair;
import java.io.File;
import org.json.JSONObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final class lq0 {
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
    public final Runnable m = new f00(this, 21);
    public final /* synthetic */ mq0 n;

    public lq0(mq0 mq0Var, String str, String str2) {
        this.n = mq0Var;
        this.b = str;
        this.c = str2;
        TLRPC.User W1 = oc7.r1(mq0Var.b).W1(Long.valueOf(mq0Var.c));
        DownloadManager.Request request = new DownloadManager.Request(Uri.parse(str));
        request.setTitle(m9c.r(W1));
        request.setDescription(TextUtils.isEmpty(str2) ? "Downloading file..." : kt6.o("Downloading ", str2, "..."));
        request.setNotificationVisibility(0);
        request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, str2);
        this.a = Long.valueOf(mq0Var.d.enqueue(request));
    }

    public final void a() {
        mq0 mq0Var = this.n;
        mq0Var.getClass();
        this.i = true;
        Long l = this.a;
        if (l != null) {
            mq0Var.d.remove(l.longValue());
            this.a = null;
        }
        mq0Var.e.remove(this);
        mq0Var.e();
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

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00a7, code lost:
    
        if (0 == 0) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d() {
        mq0 mq0Var = this.n;
        if (this.h || this.i) {
            return;
        }
        Runnable runnable = this.m;
        gm.r(runnable);
        this.j = System.currentTimeMillis();
        DownloadManager.Query query = new DownloadManager.Query();
        query.setFilterById(this.a.longValue());
        Cursor cursor = null;
        try {
            try {
                cursor = mq0Var.d.query(query);
                if (cursor.moveToFirst()) {
                    int i = cursor.getInt(cursor.getColumnIndex("status"));
                    if (i == 8) {
                        File file = new File(Uri.parse(cursor.getString(cursor.getColumnIndex("local_uri"))).getPath());
                        this.d = file;
                        this.h = true;
                        long length = file.length();
                        this.g = length;
                        if (length <= 0) {
                            a();
                        }
                        mq0Var.f();
                    } else if (i == 16) {
                        a();
                        cursor.close();
                        return;
                    } else {
                        this.f = cursor.getLong(cursor.getColumnIndex("bytes_so_far"));
                        this.g = cursor.getLong(cursor.getColumnIndex("total_size"));
                        gm.d3(runnable, 160L);
                    }
                } else if (!this.h) {
                    a();
                }
            } catch (Exception e) {
                fc4.g(e, true);
            }
            cursor.close();
            mq0Var.e();
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    public lq0(mq0 mq0Var, JSONObject jSONObject) {
        this.n = mq0Var;
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
