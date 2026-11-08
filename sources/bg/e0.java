package bg;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.provider.MediaStore;
import bi.k7;
import di.c1;
import fi.c7;
import fi.e7;
import fi.y5;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import org.telegram.messenger.r3;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.r1;
import org.telegram.ui.ActionBar.u1;
import org.telegram.ui.Cells.c2;
import org.telegram.ui.Components.i30;
import org.telegram.ui.Components.jk0;
import org.telegram.ui.Components.rt;
import org.telegram.ui.Components.t4;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.an;
import org.telegram.ui.c40;
import org.telegram.ui.rv0;
import org.telegram.ui.wq0;
import org.telegram.ui.ww;
import wg.f1;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final /* synthetic */ class e0 implements i30, r1, c7, t4, w5.b, v9.g {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ e0(Object obj, long j3, Object obj2, Object obj3, int i7) {
        this.a = i7;
        this.c = obj;
        this.b = j3;
        this.d = obj2;
        this.e = obj3;
    }

    @Override // org.telegram.ui.Components.t4
    public void L(int i7, int i10, boolean z9) {
        an.E1((an) this.c, (ArrayList) this.d, this.b, (jk0) this.e, z9, i7);
    }

    @Override // org.telegram.ui.Components.i30
    public void U(TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, boolean z9, TLRPC.VideoSize videoSize) {
        an anVar = (an) this.c;
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
            int i7 = tL_photos_uploadProfilePhoto.flags;
            tL_photos_uploadProfilePhoto.video_start_ts = d;
            tL_photos_uploadProfilePhoto.flags = i7 | 6;
        }
        if (videoSize != null) {
            tL_photos_uploadProfilePhoto.video_emoji_markup = videoSize;
            tL_photos_uploadProfilePhoto.flags |= 16;
        }
        anVar.getConnectionsManager().sendRequest(tL_photos_uploadProfilePhoto, new g0(anVar, fileLocationArr, str, fileLocationArr2, this.b));
    }

    @Override // v9.g
    public ScheduledFuture a(final rt rtVar) {
        switch (this.a) {
            case 7:
                v9.f fVar = (v9.f) this.c;
                Runnable runnable = (Runnable) this.d;
                return fVar.b.schedule(new v9.d(fVar, runnable, rtVar, 1), this.b, (TimeUnit) this.e);
            default:
                final v9.f fVar2 = (v9.f) this.c;
                final Callable callable = (Callable) this.d;
                return fVar2.b.schedule(new Callable() { // from class: v9.e
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return f.this.a.submit(new u9.f(10, callable, rtVar));
                    }
                }, this.b, (TimeUnit) this.e);
        }
    }

    @Override // fi.c7
    public Bitmap c(BitmapFactory.Options options) {
        y5 y5Var = (y5) this.c;
        e7 e7Var = (e7) this.d;
        long j3 = this.b;
        String str = (String) this.e;
        if (!e7Var.K) {
            return BitmapFactory.decodeFile(str, options);
        }
        String str2 = e7Var.N;
        if (str2 != null) {
            return BitmapFactory.decodeFile(str2, options);
        }
        try {
            return MediaStore.Video.Thumbnails.getThumbnail(y5Var.getContext().getContentResolver(), j3, 1, options);
        } catch (Throwable unused) {
            y5Var.invalidate();
            return null;
        }
    }

    @Override // org.telegram.ui.Components.i30
    public /* synthetic */ boolean e() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.r1
    public void g(u1 u1Var, int i7) {
        switch (this.a) {
            case 1:
                k7 k7Var = (k7) this.c;
                TL_stars.starGiftDepositPayload[] stargiftdepositpayloadArr = (TL_stars.starGiftDepositPayload[]) this.d;
                f1 f1Var = (f1) this.e;
                k7Var.getClass();
                k7Var.r1(this.b, stargiftdepositpayloadArr[0], u1Var.h(i7, true, true), f1Var);
                break;
            case 4:
                r3 r3Var = (r3) this.c;
                c2[] c2VarArr = (c2[]) this.d;
                Runnable runnable = (Runnable) this.e;
                boolean z9 = false;
                c2 c2Var = c2VarArr[0];
                if (c2Var != null && c2Var.b()) {
                    z9 = true;
                }
                c40.B1(r3Var, z9, this.b, runnable);
                break;
            default:
                rv0 rv0Var = (rv0) this.c;
                ww wwVar = (ww) this.d;
                TLRPC.User user = (TLRPC.User) this.e;
                ProfileActivity profileActivity = rv0Var.b;
                profileActivity.M1 = true;
                Bundle k10 = a8.p0.k("scrollToTopOnResume", true);
                long j3 = -this.b;
                k10.putLong("chat_id", j3);
                if (profileActivity.getMessagesController().E(k10, wwVar, null, null)) {
                    an anVar = new an(k10);
                    profileActivity.getNotificationCenter().n(profileActivity, 4);
                    profileActivity.getNotificationCenter().k(4, new Object[0]);
                    profileActivity.getMessagesController().m(j3, user, 0, null, anVar, true, null, null, null);
                    profileActivity.presentFragment(anVar, true);
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.i30
    public /* synthetic */ wq0 getCloseIntoObject() {
        return null;
    }

    @Override // org.telegram.ui.Components.i30
    public /* synthetic */ String getInitialSearchString() {
        return null;
    }

    @Override // w5.b
    public Object h() {
        ia.c cVar = (ia.c) this.c;
        Iterable iterable = (Iterable) this.d;
        o5.i iVar = (o5.i) this.e;
        v5.g gVar = (v5.g) ((v5.d) cVar.c);
        gVar.getClass();
        if (iterable.iterator().hasNext()) {
            String str = "UPDATE events SET num_attempts = num_attempts + 1 WHERE _id in " + v5.g.g(iterable);
            SQLiteDatabase a10 = gVar.a();
            a10.beginTransaction();
            try {
                a10.compileStatement(str).execute();
                Cursor rawQuery = a10.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE num_attempts >= 16 GROUP BY transport_name", null);
                while (rawQuery.moveToNext()) {
                    try {
                        gVar.e(rawQuery.getInt(0), r5.c.f, rawQuery.getString(1));
                    } catch (Throwable th2) {
                        rawQuery.close();
                        throw th2;
                    }
                }
                rawQuery.close();
                a10.compileStatement("DELETE FROM events WHERE num_attempts >= 16").execute();
                a10.setTransactionSuccessful();
            } finally {
                a10.endTransaction();
            }
        }
        gVar.c(new c1(((x5.a) cVar.g).s() + this.b, iVar));
        return null;
    }

    @Override // org.telegram.ui.Components.i30
    public /* synthetic */ boolean x() {
        return false;
    }

    public /* synthetic */ e0(Object obj, Object obj2, long j3, Object obj3, int i7) {
        this.a = i7;
        this.c = obj;
        this.d = obj2;
        this.b = j3;
        this.e = obj3;
    }

    public /* synthetic */ e0(Object obj, Object obj2, Object obj3, long j3, int i7) {
        this.a = i7;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.b = j3;
    }

    @Override // org.telegram.ui.Components.i30
    public /* synthetic */ void T() {
    }

    @Override // org.telegram.ui.Components.i30
    public /* synthetic */ void H(float f10) {
    }

    @Override // org.telegram.ui.Components.i30
    public /* synthetic */ void O(boolean z9, boolean z10) {
    }
}
