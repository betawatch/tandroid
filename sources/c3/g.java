package c3;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.provider.MediaStore;
import ff.g0;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import kh.a8;
import kh.r6;
import kh.y7;
import n5.a0;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.ActionBar.c2;
import org.telegram.ui.Cells.z1;
import org.telegram.ui.Components.d40;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.x4;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.bu0;
import org.telegram.ui.dy;
import org.telegram.ui.dz0;
import org.telegram.ui.o50;
import org.telegram.ui.qn;
import w2.i;
import xf.o0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class g implements e3.b, d40, y7, x4, b2, z8.g {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ g(Object obj, Object obj2, long j10, Object obj3, int i9) {
        this.a = i9;
        this.c = obj;
        this.d = obj2;
        this.b = j10;
        this.e = obj3;
    }

    @Override // org.telegram.ui.Components.x4
    public void B(int i9, int i10, boolean z10) {
        qn.r0((qn) this.c, (ArrayList) this.d, this.b, (ll0) this.e, z10, i9);
    }

    @Override // org.telegram.ui.Components.d40
    public void P(TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, boolean z10, TLRPC.VideoSize videoSize) {
        qn qnVar = (qn) this.c;
        TLRPC.FileLocation[] fileLocationArr = (TLRPC.FileLocation[]) this.d;
        TLRPC.FileLocation[] fileLocationArr2 = (TLRPC.FileLocation[]) this.e;
        if (inputFile == null && inputFile2 == null && videoSize == null) {
            fileLocationArr[0] = photoSize2.location;
            fileLocationArr2[0] = photoSize.location;
            return;
        }
        TLRPC.TL_photos_uploadProfilePhoto tL_photos_uploadProfilePhoto = new TLRPC.TL_photos_uploadProfilePhoto();
        if (inputFile != null) {
            tL_photos_uploadProfilePhoto.file = inputFile;
            tL_photos_uploadProfilePhoto.flags |= 1;
        }
        if (inputFile2 != null) {
            tL_photos_uploadProfilePhoto.video = inputFile2;
            int i9 = tL_photos_uploadProfilePhoto.flags;
            tL_photos_uploadProfilePhoto.video_start_ts = d;
            tL_photos_uploadProfilePhoto.flags = i9 | 6;
        }
        if (videoSize != null) {
            tL_photos_uploadProfilePhoto.video_emoji_markup = videoSize;
            tL_photos_uploadProfilePhoto.flags |= 16;
        }
        qnVar.getConnectionsManager().sendRequest(tL_photos_uploadProfilePhoto, new g0(qnVar, fileLocationArr, str, fileLocationArr2, this.b));
    }

    @Override // z8.g
    public ScheduledFuture a(final a0 a0Var) {
        switch (this.a) {
            case 6:
                z8.f fVar = (z8.f) this.c;
                Runnable runnable = (Runnable) this.d;
                return fVar.b.schedule(new z8.d(fVar, runnable, a0Var, 1), this.b, (TimeUnit) this.e);
            default:
                final z8.f fVar2 = (z8.f) this.c;
                final Callable callable = (Callable) this.d;
                return fVar2.b.schedule(new Callable() { // from class: z8.e
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return f.this.a.submit(new o0(8, callable, a0Var));
                    }
                }, this.b, (TimeUnit) this.e);
        }
    }

    @Override // org.telegram.ui.Components.d40
    public /* synthetic */ boolean e() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.b2
    public void f(c2 c2Var, int i9) {
        switch (this.a) {
            case 4:
                ChatObject.Call call = (ChatObject.Call) this.c;
                z1[] z1VarArr = (z1[]) this.d;
                Runnable runnable = (Runnable) this.e;
                boolean z10 = false;
                z1 z1Var = z1VarArr[0];
                if (z1Var != null && z1Var.b()) {
                    z10 = true;
                }
                o50.w1(call, z10, this.b, runnable);
                break;
            default:
                dz0 dz0Var = (dz0) this.c;
                dy dyVar = (dy) this.d;
                TLRPC.User user = (TLRPC.User) this.e;
                ProfileActivity profileActivity = dz0Var.b;
                profileActivity.J1 = true;
                Bundle i10 = aa.d.i("scrollToTopOnResume", true);
                long j10 = -this.b;
                i10.putLong("chat_id", j10);
                if (profileActivity.getMessagesController().checkCanOpenChat(i10, dyVar)) {
                    qn qnVar = new qn(i10);
                    NotificationCenter notificationCenter = profileActivity.getNotificationCenter();
                    int i11 = NotificationCenter.closeChats;
                    notificationCenter.removeObserver(profileActivity, i11);
                    profileActivity.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i11, new Object[0]);
                    profileActivity.getMessagesController().addUserToChat(j10, user, 0, null, qnVar, true, null, null);
                    profileActivity.presentFragment(qnVar, true);
                    break;
                }
                break;
        }
    }

    @Override // kh.y7
    public Bitmap g(BitmapFactory.Options options) {
        r6 r6Var = (r6) this.c;
        a8 a8Var = (a8) this.d;
        long j10 = this.b;
        String str = (String) this.e;
        if (!a8Var.K) {
            return BitmapFactory.decodeFile(str, options);
        }
        String str2 = a8Var.N;
        if (str2 != null) {
            return BitmapFactory.decodeFile(str2, options);
        }
        try {
            return MediaStore.Video.Thumbnails.getThumbnail(r6Var.getContext().getContentResolver(), j10, 1, options);
        } catch (Throwable unused) {
            r6Var.invalidate();
            return null;
        }
    }

    @Override // org.telegram.ui.Components.d40
    public /* synthetic */ bu0 getCloseIntoObject() {
        return null;
    }

    @Override // org.telegram.ui.Components.d40
    public /* synthetic */ String getInitialSearchString() {
        return null;
    }

    @Override // e3.b
    public Object j() {
        h hVar = (h) this.c;
        Iterable iterable = (Iterable) this.d;
        i iVar = (i) this.e;
        d3.h hVar2 = (d3.h) ((d3.d) hVar.c);
        hVar2.getClass();
        if (iterable.iterator().hasNext()) {
            String str = "UPDATE events SET num_attempts = num_attempts + 1 WHERE _id in " + d3.h.g(iterable);
            SQLiteDatabase a2 = hVar2.a();
            a2.beginTransaction();
            try {
                a2.compileStatement(str).execute();
                Cursor rawQuery = a2.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE num_attempts >= 16 GROUP BY transport_name", null);
                while (rawQuery.moveToNext()) {
                    try {
                        hVar2.e(rawQuery.getInt(0), z2.c.f, rawQuery.getString(1));
                    } catch (Throwable th) {
                        rawQuery.close();
                        throw th;
                    }
                }
                rawQuery.close();
                a2.compileStatement("DELETE FROM events WHERE num_attempts >= 16").execute();
                a2.setTransactionSuccessful();
            } finally {
                a2.endTransaction();
            }
        }
        hVar2.c(new d3.e(((f3.a) hVar.g).d() + this.b, iVar));
        return null;
    }

    @Override // org.telegram.ui.Components.d40
    public /* synthetic */ boolean u() {
        return false;
    }

    public /* synthetic */ g(Object obj, Object obj2, Object obj3, long j10, int i9) {
        this.a = i9;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.b = j10;
    }

    public /* synthetic */ g(dz0 dz0Var, long j10, dy dyVar, TLRPC.User user) {
        this.a = 5;
        this.c = dz0Var;
        this.b = j10;
        this.d = dyVar;
        this.e = user;
    }

    @Override // org.telegram.ui.Components.d40
    public /* synthetic */ void O() {
    }

    @Override // org.telegram.ui.Components.d40
    public /* synthetic */ void D(float f10) {
    }

    @Override // org.telegram.ui.Components.d40
    public /* synthetic */ void J(boolean z10, boolean z11) {
    }
}
