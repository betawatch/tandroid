package bg;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.provider.MediaStore;
import di.c6;
import hi.b7;
import hi.d7;
import hi.x5;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import org.telegram.messenger.r3;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.q1;
import org.telegram.ui.Cells.c2;
import org.telegram.ui.Components.cf;
import org.telegram.ui.Components.l30;
import org.telegram.ui.Components.ok0;
import org.telegram.ui.Components.r4;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.an;
import org.telegram.ui.c40;
import org.telegram.ui.pv0;
import org.telegram.ui.uq0;
import org.telegram.ui.yw;
import ug.t1;
import wg.c1;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final /* synthetic */ class e0 implements l30, q1, b7, r4, w5.b, v9.g {
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

    @Override // org.telegram.ui.Components.r4
    public void L(int i7, int i10, boolean z10) {
        an.A1((an) this.c, (ArrayList) this.d, this.b, (ok0) this.e, z10, i7);
    }

    @Override // org.telegram.ui.Components.l30
    public void V(TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, boolean z10, TLRPC.VideoSize videoSize) {
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
    public ScheduledFuture a(final cf cfVar) {
        switch (this.a) {
            case 7:
                v9.f fVar = (v9.f) this.c;
                Runnable runnable = (Runnable) this.d;
                return fVar.b.schedule(new v9.d(fVar, runnable, cfVar, 1), this.b, (TimeUnit) this.e);
            default:
                final v9.f fVar2 = (v9.f) this.c;
                final Callable callable = (Callable) this.d;
                return fVar2.b.schedule(new Callable() { // from class: v9.e
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return f.this.a.submit(new t1(2, callable, cfVar));
                    }
                }, this.b, (TimeUnit) this.e);
        }
    }

    @Override // hi.b7
    public Bitmap d(BitmapFactory.Options options) {
        x5 x5Var = (x5) this.c;
        d7 d7Var = (d7) this.d;
        long j3 = this.b;
        String str = (String) this.e;
        if (!d7Var.K) {
            return BitmapFactory.decodeFile(str, options);
        }
        String str2 = d7Var.N;
        if (str2 != null) {
            return BitmapFactory.decodeFile(str2, options);
        }
        try {
            return MediaStore.Video.Thumbnails.getThumbnail(x5Var.getContext().getContentResolver(), j3, 1, options);
        } catch (Throwable unused) {
            x5Var.invalidate();
            return null;
        }
    }

    @Override // org.telegram.ui.Components.l30
    public /* synthetic */ boolean e() {
        return true;
    }

    @Override // w5.b
    public Object g() {
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
        gVar.c(new ai.d0(((x5.a) cVar.g).s() + this.b, iVar, 14));
        return null;
    }

    @Override // org.telegram.ui.Components.l30
    public /* synthetic */ uq0 getCloseIntoObject() {
        return null;
    }

    @Override // org.telegram.ui.Components.l30
    public /* synthetic */ String getInitialSearchString() {
        return null;
    }

    @Override // org.telegram.ui.ActionBar.q1
    public void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        switch (this.a) {
            case 1:
                c6 c6Var = (c6) this.c;
                TL_stars.starGiftDepositPayload[] stargiftdepositpayloadArr = (TL_stars.starGiftDepositPayload[]) this.d;
                c1 c1Var = (c1) this.e;
                c6Var.getClass();
                c6Var.r1(this.b, stargiftdepositpayloadArr[0], t1Var.h(i7, true, true), c1Var);
                break;
            case 4:
                r3 r3Var = (r3) this.c;
                c2[] c2VarArr = (c2[]) this.d;
                Runnable runnable = (Runnable) this.e;
                boolean z10 = false;
                c2 c2Var = c2VarArr[0];
                if (c2Var != null && c2Var.b()) {
                    z10 = true;
                }
                c40.B1(r3Var, z10, this.b, runnable);
                break;
            default:
                pv0 pv0Var = (pv0) this.c;
                yw ywVar = (yw) this.d;
                TLRPC.User user = (TLRPC.User) this.e;
                ProfileActivity profileActivity = pv0Var.b;
                profileActivity.N1 = true;
                Bundle k10 = a8.p0.k("scrollToTopOnResume", true);
                long j3 = -this.b;
                k10.putLong("chat_id", j3);
                if (profileActivity.getMessagesController().E(k10, ywVar, null, null)) {
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

    @Override // org.telegram.ui.Components.l30
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

    @Override // org.telegram.ui.Components.l30
    public /* synthetic */ void U() {
    }

    @Override // org.telegram.ui.Components.l30
    public /* synthetic */ void I(float f10) {
    }

    @Override // org.telegram.ui.Components.l30
    public /* synthetic */ void O(boolean z10, boolean z11) {
    }
}
