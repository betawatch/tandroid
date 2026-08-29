package b9;

import a4.w;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.provider.MediaStore;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import jf.f0;
import nh.f6;
import nh.m7;
import nh.o7;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.ActionBar.c2;
import org.telegram.ui.Cells.y1;
import org.telegram.ui.Components.b5;
import org.telegram.ui.Components.r40;
import org.telegram.ui.Components.yl0;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.dz0;
import org.telegram.ui.fy;
import org.telegram.ui.r50;
import org.telegram.ui.tn;
import org.telegram.ui.zt0;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final /* synthetic */ class d implements i, g3.b, r40, m7, b5, b2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ d(Object obj, Object obj2, long j10, Object obj3, int i10) {
        this.a = i10;
        this.b = obj;
        this.e = obj2;
        this.c = j10;
        this.d = obj3;
    }

    @Override // org.telegram.ui.Components.b5
    public void I(int i10, int i11, boolean z10) {
        tn.s0((tn) this.b, (ArrayList) this.e, this.c, (yl0) this.d, z10, i10);
    }

    @Override // org.telegram.ui.Components.r40
    public void Q(TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, boolean z10, TLRPC.VideoSize videoSize) {
        tn tnVar = (tn) this.b;
        TLRPC.FileLocation[] fileLocationArr = (TLRPC.FileLocation[]) this.e;
        TLRPC.FileLocation[] fileLocationArr2 = (TLRPC.FileLocation[]) this.d;
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
            int i10 = tL_photos_uploadProfilePhoto.flags;
            tL_photos_uploadProfilePhoto.video_start_ts = d;
            tL_photos_uploadProfilePhoto.flags = i10 | 6;
        }
        if (videoSize != null) {
            tL_photos_uploadProfilePhoto.video_emoji_markup = videoSize;
            tL_photos_uploadProfilePhoto.flags |= 16;
        }
        tnVar.getConnectionsManager().sendRequest(tL_photos_uploadProfilePhoto, new f0(tnVar, fileLocationArr, str, fileLocationArr2, this.c));
    }

    @Override // b9.i
    public ScheduledFuture a(final ha.c cVar) {
        switch (this.a) {
            case 0:
                h hVar = (h) this.b;
                Runnable runnable = (Runnable) this.e;
                return hVar.b.schedule(new f(hVar, runnable, cVar, 1), this.c, (TimeUnit) this.d);
            default:
                final h hVar2 = (h) this.b;
                final Callable callable = (Callable) this.e;
                return hVar2.b.schedule(new Callable() { // from class: b9.g
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return h.this.a.submit(new a1.e(10, callable, cVar));
                    }
                }, this.c, (TimeUnit) this.d);
        }
    }

    @Override // org.telegram.ui.Components.r40
    public /* synthetic */ boolean e() {
        return true;
    }

    @Override // g3.b
    public Object f() {
        e3.f fVar = (e3.f) this.b;
        Iterable iterable = (Iterable) this.e;
        y2.i iVar = (y2.i) this.d;
        f3.h hVar = (f3.h) ((f3.d) fVar.c);
        hVar.getClass();
        if (iterable.iterator().hasNext()) {
            String str = "UPDATE events SET num_attempts = num_attempts + 1 WHERE _id in " + f3.h.g(iterable);
            SQLiteDatabase a2 = hVar.a();
            a2.beginTransaction();
            try {
                a2.compileStatement(str).execute();
                Cursor rawQuery = a2.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE num_attempts >= 16 GROUP BY transport_name", null);
                while (rawQuery.moveToNext()) {
                    try {
                        hVar.e(rawQuery.getInt(0), b3.c.f, rawQuery.getString(1));
                    } catch (Throwable th2) {
                        rawQuery.close();
                        throw th2;
                    }
                }
                rawQuery.close();
                a2.compileStatement("DELETE FROM events WHERE num_attempts >= 16").execute();
                a2.setTransactionSuccessful();
            } finally {
                a2.endTransaction();
            }
        }
        hVar.c(new f3.e(((h3.a) fVar.g).e() + this.c, iVar));
        return null;
    }

    @Override // org.telegram.ui.ActionBar.b2
    public void g(c2 c2Var, int i10) {
        switch (this.a) {
            case 6:
                ChatObject.Call call = (ChatObject.Call) this.b;
                y1[] y1VarArr = (y1[]) this.d;
                Runnable runnable = (Runnable) this.e;
                boolean z10 = false;
                y1 y1Var = y1VarArr[0];
                if (y1Var != null && y1Var.b()) {
                    z10 = true;
                }
                r50.w1(call, z10, this.c, runnable);
                break;
            default:
                dz0 dz0Var = (dz0) this.b;
                fy fyVar = (fy) this.e;
                TLRPC.User user = (TLRPC.User) this.d;
                ProfileActivity profileActivity = dz0Var.b;
                profileActivity.J1 = true;
                Bundle i11 = w.i("scrollToTopOnResume", true);
                long j10 = -this.c;
                i11.putLong("chat_id", j10);
                if (profileActivity.getMessagesController().checkCanOpenChat(i11, fyVar)) {
                    tn tnVar = new tn(i11);
                    NotificationCenter notificationCenter = profileActivity.getNotificationCenter();
                    int i12 = NotificationCenter.closeChats;
                    notificationCenter.removeObserver(profileActivity, i12);
                    profileActivity.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i12, new Object[0]);
                    profileActivity.getMessagesController().addUserToChat(j10, user, 0, null, tnVar, true, null, null);
                    profileActivity.presentFragment(tnVar, true);
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.r40
    public /* synthetic */ zt0 getCloseIntoObject() {
        return null;
    }

    @Override // org.telegram.ui.Components.r40
    public /* synthetic */ String getInitialSearchString() {
        return null;
    }

    @Override // nh.m7
    public Bitmap h(BitmapFactory.Options options) {
        f6 f6Var = (f6) this.b;
        o7 o7Var = (o7) this.e;
        long j10 = this.c;
        String str = (String) this.d;
        if (!o7Var.K) {
            return BitmapFactory.decodeFile(str, options);
        }
        String str2 = o7Var.N;
        if (str2 != null) {
            return BitmapFactory.decodeFile(str2, options);
        }
        try {
            return MediaStore.Video.Thumbnails.getThumbnail(f6Var.getContext().getContentResolver(), j10, 1, options);
        } catch (Throwable unused) {
            f6Var.invalidate();
            return null;
        }
    }

    @Override // org.telegram.ui.Components.r40
    public /* synthetic */ boolean u() {
        return false;
    }

    public /* synthetic */ d(Object obj, Object obj2, Object obj3, long j10, int i10) {
        this.a = i10;
        this.b = obj;
        this.e = obj2;
        this.d = obj3;
        this.c = j10;
    }

    public /* synthetic */ d(ChatObject.Call call, y1[] y1VarArr, long j10, Runnable runnable) {
        this.a = 6;
        this.b = call;
        this.d = y1VarArr;
        this.c = j10;
        this.e = runnable;
    }

    public /* synthetic */ d(dz0 dz0Var, long j10, fy fyVar, TLRPC.User user) {
        this.a = 7;
        this.b = dz0Var;
        this.c = j10;
        this.e = fyVar;
        this.d = user;
    }

    @Override // org.telegram.ui.Components.r40
    public /* synthetic */ void P() {
    }

    @Override // org.telegram.ui.Components.r40
    public /* synthetic */ void D(float f9) {
    }

    @Override // org.telegram.ui.Components.r40
    public /* synthetic */ void K(boolean z10, boolean z11) {
    }
}
