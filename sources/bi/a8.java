package bi;

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
import org.telegram.ui.Components.d50;
import org.telegram.ui.Components.km0;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.eo;
import org.telegram.ui.ev0;
import org.telegram.ui.j60;
import org.telegram.ui.n01;
import org.telegram.ui.web.x1;
import org.telegram.ui.wy;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final /* synthetic */ class a8 implements p9, org.telegram.ui.Components.c5, org.telegram.ui.ActionBar.c2, t5.b, r9.g, d50 {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ a8(Object obj, Object obj2, long j3, Object obj3, int i10) {
        this.a = i10;
        this.c = obj;
        this.d = obj2;
        this.b = j3;
        this.e = obj3;
    }

    @Override // org.telegram.ui.Components.c5
    public void I(int i10, int i11, boolean z10) {
        eo.r0((eo) this.c, (ArrayList) this.d, this.b, (km0) this.e, z10, i10);
    }

    @Override // org.telegram.ui.Components.d50
    public void Q(TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, boolean z10, TLRPC.VideoSize videoSize) {
        eo eoVar = (eo) this.c;
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
        eoVar.getConnectionsManager().sendRequest(tL_photos_uploadProfilePhoto, new org.telegram.messenger.voip.c(eoVar, fileLocationArr, str, fileLocationArr2, this.b));
    }

    @Override // r9.g
    public ScheduledFuture a(final l2.h hVar) {
        switch (this.a) {
            case 5:
                r9.f fVar = (r9.f) this.c;
                Runnable runnable = (Runnable) this.d;
                return fVar.b.schedule(new r9.d(fVar, runnable, hVar, 1), this.b, (TimeUnit) this.e);
            default:
                final r9.f fVar2 = (r9.f) this.c;
                final Callable callable = (Callable) this.d;
                return fVar2.b.schedule(new Callable() { // from class: r9.e
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return f.this.a.submit(new x1(16, callable, hVar));
                    }
                }, this.b, (TimeUnit) this.e);
        }
    }

    @Override // org.telegram.ui.Components.d50
    public /* synthetic */ boolean e() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.c2
    public void f(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        switch (this.a) {
            case 2:
                ChatObject.Call call = (ChatObject.Call) this.c;
                org.telegram.ui.Cells.z1[] z1VarArr = (org.telegram.ui.Cells.z1[]) this.d;
                Runnable runnable = (Runnable) this.e;
                boolean z10 = false;
                org.telegram.ui.Cells.z1 z1Var = z1VarArr[0];
                if (z1Var != null && z1Var.b()) {
                    z10 = true;
                }
                j60.w1(call, z10, this.b, runnable);
                break;
            default:
                n01 n01Var = (n01) this.c;
                wy wyVar = (wy) this.d;
                TLRPC.User user = (TLRPC.User) this.e;
                ProfileActivity profileActivity = n01Var.b;
                profileActivity.N1 = true;
                Bundle i11 = a4.a.i("scrollToTopOnResume", true);
                long j3 = -this.b;
                i11.putLong("chat_id", j3);
                if (profileActivity.getMessagesController().checkCanOpenChat(i11, wyVar)) {
                    eo eoVar = new eo(i11);
                    NotificationCenter notificationCenter = profileActivity.getNotificationCenter();
                    int i12 = NotificationCenter.closeChats;
                    notificationCenter.removeObserver(profileActivity, i12);
                    profileActivity.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i12, new Object[0]);
                    profileActivity.getMessagesController().addUserToChat(j3, user, 0, null, eoVar, true, null, null);
                    profileActivity.presentFragment(eoVar, true);
                    break;
                }
                break;
        }
    }

    @Override // t5.b
    public Object g() {
        da.b bVar = (da.b) this.c;
        Iterable iterable = (Iterable) this.d;
        l5.i iVar = (l5.i) this.e;
        s5.g gVar = (s5.g) ((s5.d) bVar.c);
        gVar.getClass();
        if (iterable.iterator().hasNext()) {
            String str = "UPDATE events SET num_attempts = num_attempts + 1 WHERE _id in " + s5.g.g(iterable);
            SQLiteDatabase a2 = gVar.a();
            a2.beginTransaction();
            try {
                a2.compileStatement(str).execute();
                Cursor rawQuery = a2.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE num_attempts >= 16 GROUP BY transport_name", null);
                while (rawQuery.moveToNext()) {
                    try {
                        gVar.e(rawQuery.getInt(0), o5.c.f, rawQuery.getString(1));
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
        gVar.c(new za(((u5.a) bVar.g).u() + this.b, iVar));
        return null;
    }

    @Override // org.telegram.ui.Components.d50
    public /* synthetic */ ev0 getCloseIntoObject() {
        return null;
    }

    @Override // org.telegram.ui.Components.d50
    public /* synthetic */ String getInitialSearchString() {
        return null;
    }

    @Override // bi.p9
    public Bitmap i(BitmapFactory.Options options) {
        e8 e8Var = (e8) this.c;
        r9 r9Var = (r9) this.d;
        long j3 = this.b;
        String str = (String) this.e;
        if (!r9Var.K) {
            return BitmapFactory.decodeFile(str, options);
        }
        String str2 = r9Var.N;
        if (str2 != null) {
            return BitmapFactory.decodeFile(str2, options);
        }
        try {
            return MediaStore.Video.Thumbnails.getThumbnail(e8Var.getContext().getContentResolver(), j3, 1, options);
        } catch (Throwable unused) {
            e8Var.invalidate();
            return null;
        }
    }

    @Override // org.telegram.ui.Components.d50
    public /* synthetic */ boolean t() {
        return false;
    }

    public /* synthetic */ a8(Object obj, Object obj2, Object obj3, long j3, int i10) {
        this.a = i10;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.b = j3;
    }

    public /* synthetic */ a8(n01 n01Var, long j3, wy wyVar, TLRPC.User user) {
        this.a = 3;
        this.c = n01Var;
        this.b = j3;
        this.d = wyVar;
        this.e = user;
    }

    @Override // org.telegram.ui.Components.d50
    public /* synthetic */ void C(float f7) {
    }

    @Override // org.telegram.ui.Components.d50
    public /* synthetic */ void P() {
    }

    @Override // org.telegram.ui.Components.d50
    public /* synthetic */ void K(boolean z10, boolean z11) {
    }
}
