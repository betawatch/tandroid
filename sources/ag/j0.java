package ag;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.provider.MediaStore;
import bi.h7;
import di.d1;
import fi.o6;
import fi.u7;
import fi.w7;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import li.e3;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.ActionBar.e2;
import org.telegram.ui.Cells.y1;
import org.telegram.ui.Components.e5;
import org.telegram.ui.Components.f50;
import org.telegram.ui.Components.hn0;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.cy;
import org.telegram.ui.qu0;
import org.telegram.ui.rz0;
import org.telegram.ui.un;
import org.telegram.ui.v50;
import sg.u;
import vg.n1;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final /* synthetic */ class j0 implements f50, b2, u7, e5, u5.b, t9.g {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ j0(Object obj, long j10, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = j10;
        this.d = obj2;
        this.e = obj3;
    }

    @Override // org.telegram.ui.Components.e5
    public void G(int i10, int i11, boolean z10) {
        un.Y((un) this.c, (ArrayList) this.d, this.b, (hn0) this.e, z10, i10);
    }

    @Override // org.telegram.ui.Components.f50
    public void R(TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, boolean z10, TLRPC.VideoSize videoSize) {
        un unVar = (un) this.c;
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
            int i10 = tL_photos_uploadProfilePhoto.flags;
            tL_photos_uploadProfilePhoto.video_start_ts = d;
            tL_photos_uploadProfilePhoto.flags = i10 | 6;
        }
        if (videoSize != null) {
            tL_photos_uploadProfilePhoto.video_emoji_markup = videoSize;
            tL_photos_uploadProfilePhoto.flags |= 16;
        }
        unVar.getConnectionsManager().sendRequest(tL_photos_uploadProfilePhoto, new l0(unVar, fileLocationArr, str, fileLocationArr2, this.b));
    }

    @Override // t9.g
    public ScheduledFuture a(final e3 e3Var) {
        switch (this.a) {
            case 7:
                t9.f fVar = (t9.f) this.c;
                Runnable runnable = (Runnable) this.d;
                return fVar.b.schedule(new t9.d(fVar, runnable, e3Var, 1), this.b, (TimeUnit) this.e);
            default:
                final t9.f fVar2 = (t9.f) this.c;
                final Callable callable = (Callable) this.d;
                return fVar2.b.schedule(new Callable() { // from class: t9.e
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return f.this.a.submit(new u(4, callable, e3Var));
                    }
                }, this.b, (TimeUnit) this.e);
        }
    }

    @Override // org.telegram.ui.Components.f50
    public /* synthetic */ boolean e() {
        return true;
    }

    @Override // u5.b
    public Object f() {
        aa.b0 b0Var = (aa.b0) this.c;
        Iterable iterable = (Iterable) this.d;
        m5.i iVar = (m5.i) this.e;
        t5.g gVar = (t5.g) ((t5.d) b0Var.f);
        gVar.getClass();
        if (iterable.iterator().hasNext()) {
            String str = "UPDATE events SET num_attempts = num_attempts + 1 WHERE _id in " + t5.g.g(iterable);
            SQLiteDatabase a2 = gVar.a();
            a2.beginTransaction();
            try {
                a2.compileStatement(str).execute();
                Cursor rawQuery = a2.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE num_attempts >= 16 GROUP BY transport_name", null);
                while (rawQuery.moveToNext()) {
                    try {
                        gVar.e(rawQuery.getInt(0), p5.c.f, rawQuery.getString(1));
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
        gVar.c(new d1(((v5.a) b0Var.e).o() + this.b, iVar));
        return null;
    }

    @Override // fi.u7
    public Bitmap g(BitmapFactory.Options options) {
        o6 o6Var = (o6) this.c;
        w7 w7Var = (w7) this.d;
        long j10 = this.b;
        String str = (String) this.e;
        if (!w7Var.K) {
            return BitmapFactory.decodeFile(str, options);
        }
        String str2 = w7Var.N;
        if (str2 != null) {
            return BitmapFactory.decodeFile(str2, options);
        }
        try {
            return MediaStore.Video.Thumbnails.getThumbnail(o6Var.getContext().getContentResolver(), j10, 1, options);
        } catch (Throwable unused) {
            o6Var.invalidate();
            return null;
        }
    }

    @Override // org.telegram.ui.Components.f50
    public /* synthetic */ qu0 getCloseIntoObject() {
        return null;
    }

    @Override // org.telegram.ui.Components.f50
    public /* synthetic */ String getInitialSearchString() {
        return null;
    }

    @Override // org.telegram.ui.ActionBar.b2
    public void h(e2 e2Var, int i10) {
        switch (this.a) {
            case 1:
                h7 h7Var = (h7) this.c;
                TL_stars.starGiftDepositPayload[] stargiftdepositpayloadArr = (TL_stars.starGiftDepositPayload[]) this.d;
                n1 n1Var = (n1) this.e;
                h7Var.getClass();
                h7Var.O1(this.b, stargiftdepositpayloadArr[0], e2Var.h(i10, true, true), n1Var);
                break;
            case 4:
                ChatObject.Call call = (ChatObject.Call) this.c;
                y1[] y1VarArr = (y1[]) this.d;
                Runnable runnable = (Runnable) this.e;
                boolean z10 = false;
                y1 y1Var = y1VarArr[0];
                if (y1Var != null && y1Var.b()) {
                    z10 = true;
                }
                v50.w1(call, z10, this.b, runnable);
                break;
            default:
                rz0 rz0Var = (rz0) this.c;
                cy cyVar = (cy) this.d;
                TLRPC.User user = (TLRPC.User) this.e;
                ProfileActivity profileActivity = rz0Var.b;
                profileActivity.N1 = true;
                Bundle i11 = a1.g.i("scrollToTopOnResume", true);
                long j10 = -this.b;
                i11.putLong("chat_id", j10);
                if (profileActivity.getMessagesController().checkCanOpenChat(i11, cyVar)) {
                    un unVar = new un(i11);
                    NotificationCenter notificationCenter = profileActivity.getNotificationCenter();
                    int i12 = NotificationCenter.closeChats;
                    notificationCenter.removeObserver(profileActivity, i12);
                    profileActivity.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i12, new Object[0]);
                    profileActivity.getMessagesController().addUserToChat(j10, user, 0, null, unVar, true, null, null);
                    profileActivity.presentFragment(unVar, true);
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.f50
    public /* synthetic */ boolean u() {
        return false;
    }

    public /* synthetic */ j0(Object obj, Object obj2, long j10, Object obj3, int i10) {
        this.a = i10;
        this.c = obj;
        this.d = obj2;
        this.b = j10;
        this.e = obj3;
    }

    public /* synthetic */ j0(Object obj, Object obj2, Object obj3, long j10, int i10) {
        this.a = i10;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.b = j10;
    }

    @Override // org.telegram.ui.Components.f50
    public /* synthetic */ void Q() {
    }

    @Override // org.telegram.ui.Components.f50
    public /* synthetic */ void F(float f7) {
    }

    @Override // org.telegram.ui.Components.f50
    public /* synthetic */ void L(boolean z10, boolean z11) {
    }
}
