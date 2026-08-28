package mh;

import android.app.DownloadManager;
import android.database.Cursor;
import android.net.Uri;
import android.os.Environment;
import android.text.TextUtils;
import android.util.Pair;
import java.io.File;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class j0 {
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
    public final Runnable m = new kh.f1(this, 24);
    public final /* synthetic */ k0 n;

    public j0(k0 k0Var, String str, String str2) {
        this.n = k0Var;
        this.b = str;
        this.c = str2;
        TLRPC.User user = MessagesController.getInstance(k0Var.b).getUser(Long.valueOf(k0Var.c));
        DownloadManager.Request request = new DownloadManager.Request(Uri.parse(str));
        request.setTitle(UserObject.getUserName(user));
        request.setDescription(TextUtils.isEmpty(str2) ? "Downloading file..." : aa.d.o("Downloading ", str2, "..."));
        request.setNotificationVisibility(0);
        request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, str2);
        this.a = Long.valueOf(k0Var.d.enqueue(request));
    }

    public final void a() {
        k0 k0Var = this.n;
        k0Var.getClass();
        this.i = true;
        Long l10 = this.a;
        if (l10 != null) {
            k0Var.d.remove(l10.longValue());
            this.a = null;
        }
        k0Var.e.remove(this);
        k0Var.e();
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
        k0 k0Var = this.n;
        if (this.h || this.i) {
            return;
        }
        Runnable runnable = this.m;
        AndroidUtilities.cancelRunOnUIThread(runnable);
        this.j = System.currentTimeMillis();
        DownloadManager.Query query = new DownloadManager.Query();
        query.setFilterById(this.a.longValue());
        Cursor cursor = null;
        try {
            try {
                cursor = k0Var.d.query(query);
                if (cursor.moveToFirst()) {
                    int i9 = cursor.getInt(cursor.getColumnIndex("status"));
                    if (i9 == 8) {
                        File file = new File(Uri.parse(cursor.getString(cursor.getColumnIndex("local_uri"))).getPath());
                        this.d = file;
                        this.h = true;
                        long length = file.length();
                        this.g = length;
                        if (length <= 0) {
                            a();
                        }
                        k0Var.f();
                    } else if (i9 == 16) {
                        a();
                        cursor.close();
                        return;
                    } else {
                        this.f = cursor.getLong(cursor.getColumnIndex("bytes_so_far"));
                        this.g = cursor.getLong(cursor.getColumnIndex("total_size"));
                        AndroidUtilities.runOnUIThread(runnable, 160L);
                    }
                } else if (!this.h) {
                    a();
                }
            } catch (Exception e10) {
                FileLog.e(e10);
            }
            cursor.close();
            k0Var.e();
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    public j0(k0 k0Var, JSONObject jSONObject) {
        this.n = k0Var;
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
