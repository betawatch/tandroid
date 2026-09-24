package ci;

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
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.u40;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.d60;
import org.telegram.ui.qy;
import org.telegram.ui.vu0;
import org.telegram.ui.web.f1;
import org.telegram.ui.wn;
import org.telegram.ui.yz0;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes4.dex */
public final /* synthetic */ class y6 implements j8, org.telegram.ui.Components.d5, org.telegram.ui.ActionBar.z1, t5.b, r9.g, u40 {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ y6(Object obj, Object obj2, long j3, Object obj3, int i10) {
        this.a = i10;
        this.c = obj;
        this.d = obj2;
        this.b = j3;
        this.e = obj3;
    }

    @Override // org.telegram.ui.Components.d5
    public void J(int i10, int i11, boolean z10) {
        wn.c0((wn) this.c, (ArrayList) this.d, this.b, (mm0) this.e, z10, i10);
    }

    @Override // org.telegram.ui.Components.u40
    public void Q(TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, boolean z10, TLRPC.VideoSize videoSize) {
        wn wnVar = (wn) this.c;
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
        wnVar.getConnectionsManager().sendRequest(tL_photos_uploadProfilePhoto, new ai.fa(wnVar, fileLocationArr, str, fileLocationArr2, this.b));
    }

    @Override // r9.g
    public ScheduledFuture a(final n2.e eVar) {
        switch (this.a) {
            case 5:
                r9.f fVar = (r9.f) this.c;
                Runnable runnable = (Runnable) this.d;
                return fVar.b.schedule(new r9.d(fVar, runnable, eVar, 1), this.b, (TimeUnit) this.e);
            default:
                final r9.f fVar2 = (r9.f) this.c;
                final Callable callable = (Callable) this.d;
                return fVar2.b.schedule(new Callable() { // from class: r9.e
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return f.this.a.submit(new f1(17, callable, eVar));
                    }
                }, this.b, (TimeUnit) this.e);
        }
    }

    @Override // org.telegram.ui.Components.u40
    public /* synthetic */ boolean e() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.z1
    public void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.a) {
            case 2:
                ChatObject.Call call = (ChatObject.Call) this.c;
                org.telegram.ui.Cells.a2[] a2VarArr = (org.telegram.ui.Cells.a2[]) this.d;
                Runnable runnable = (Runnable) this.e;
                boolean z10 = false;
                org.telegram.ui.Cells.a2 a2Var2 = a2VarArr[0];
                if (a2Var2 != null && a2Var2.b()) {
                    z10 = true;
                }
                d60.w1(call, z10, this.b, runnable);
                break;
            default:
                yz0 yz0Var = (yz0) this.c;
                qy qyVar = (qy) this.d;
                TLRPC.User user = (TLRPC.User) this.e;
                ProfileActivity profileActivity = yz0Var.b;
                profileActivity.N1 = true;
                Bundle i11 = a4.a.i("scrollToTopOnResume", true);
                long j3 = -this.b;
                i11.putLong("chat_id", j3);
                if (profileActivity.getMessagesController().checkCanOpenChat(i11, qyVar)) {
                    wn wnVar = new wn(i11);
                    NotificationCenter notificationCenter = profileActivity.getNotificationCenter();
                    int i12 = NotificationCenter.closeChats;
                    notificationCenter.removeObserver(profileActivity, i12);
                    profileActivity.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i12, new Object[0]);
                    profileActivity.getMessagesController().addUserToChat(j3, user, 0, null, wnVar, true, null, null);
                    profileActivity.presentFragment(wnVar, true);
                    break;
                }
                break;
        }
    }

    @Override // ci.j8
    public Bitmap g(BitmapFactory.Options options) {
        b7 b7Var = (b7) this.c;
        l8 l8Var = (l8) this.d;
        long j3 = this.b;
        String str = (String) this.e;
        if (!l8Var.K) {
            return BitmapFactory.decodeFile(str, options);
        }
        String str2 = l8Var.N;
        if (str2 != null) {
            return BitmapFactory.decodeFile(str2, options);
        }
        try {
            return MediaStore.Video.Thumbnails.getThumbnail(b7Var.getContext().getContentResolver(), j3, 1, options);
        } catch (Throwable unused) {
            b7Var.invalidate();
            return null;
        }
    }

    @Override // org.telegram.ui.Components.u40
    public /* synthetic */ vu0 getCloseIntoObject() {
        return null;
    }

    @Override // org.telegram.ui.Components.u40
    public /* synthetic */ String getInitialSearchString() {
        return null;
    }

    @Override // t5.b
    public Object i() {
        da.b bVar = (da.b) this.c;
        Iterable iterable = (Iterable) this.d;
        l5.i iVar = (l5.i) this.e;
        s5.h hVar = (s5.h) ((s5.d) bVar.c);
        hVar.getClass();
        if (iterable.iterator().hasNext()) {
            String str = "UPDATE events SET num_attempts = num_attempts + 1 WHERE _id in " + s5.h.g(iterable);
            SQLiteDatabase a2 = hVar.a();
            a2.beginTransaction();
            try {
                a2.compileStatement(str).execute();
                Cursor rawQuery = a2.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE num_attempts >= 16 GROUP BY transport_name", null);
                while (rawQuery.moveToNext()) {
                    try {
                        hVar.e(rawQuery.getInt(0), o5.c.f, rawQuery.getString(1));
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
        hVar.c(new ai.z1(((u5.a) bVar.g).q() + this.b, iVar));
        return null;
    }

    @Override // org.telegram.ui.Components.u40
    public /* synthetic */ boolean t() {
        return false;
    }

    public /* synthetic */ y6(Object obj, Object obj2, Object obj3, long j3, int i10) {
        this.a = i10;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.b = j3;
    }

    public /* synthetic */ y6(yz0 yz0Var, long j3, qy qyVar, TLRPC.User user) {
        this.a = 3;
        this.c = yz0Var;
        this.b = j3;
        this.d = qyVar;
        this.e = user;
    }

    @Override // org.telegram.ui.Components.u40
    public /* synthetic */ void B(float f7) {
    }

    @Override // org.telegram.ui.Components.u40
    public /* synthetic */ void P() {
    }

    @Override // org.telegram.ui.Components.u40
    public /* synthetic */ void L(boolean z10, boolean z11) {
    }
}
