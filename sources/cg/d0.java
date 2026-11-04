package cg;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.provider.MediaStore;
import ci.l6;
import ei.c1;
import gi.d7;
import gi.f7;
import gi.y5;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import org.telegram.messenger.r3;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.p1;
import org.telegram.ui.ActionBar.s1;
import org.telegram.ui.Cells.c2;
import org.telegram.ui.Components.e30;
import org.telegram.ui.Components.i9;
import org.telegram.ui.Components.nk0;
import org.telegram.ui.Components.r4;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.iv0;
import org.telegram.ui.mq0;
import org.telegram.ui.uw;
import org.telegram.ui.wm;
import org.telegram.ui.x30;
import xg.e1;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class d0 implements e30, p1, d7, r4, v5.b, u9.h {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ d0(Object obj, long j10, Object obj2, Object obj3, int i3) {
        this.a = i3;
        this.c = obj;
        this.b = j10;
        this.d = obj2;
        this.e = obj3;
    }

    @Override // org.telegram.ui.Components.r4
    public void L(int i3, int i10, boolean z10) {
        wm.E1((wm) this.c, (ArrayList) this.d, this.b, (nk0) this.e, z10, i3);
    }

    @Override // org.telegram.ui.Components.e30
    public void U(TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, boolean z10, TLRPC.VideoSize videoSize) {
        wm wmVar = (wm) this.c;
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
            int i3 = tL_photos_uploadProfilePhoto.flags;
            tL_photos_uploadProfilePhoto.video_start_ts = d;
            tL_photos_uploadProfilePhoto.flags = i3 | 6;
        }
        if (videoSize != null) {
            tL_photos_uploadProfilePhoto.video_emoji_markup = videoSize;
            tL_photos_uploadProfilePhoto.flags |= 16;
        }
        wmVar.getConnectionsManager().sendRequest(tL_photos_uploadProfilePhoto, new f0(wmVar, fileLocationArr, str, fileLocationArr2, this.b));
    }

    @Override // u9.h
    public ScheduledFuture a(final i9 i9Var) {
        switch (this.a) {
            case 7:
                u9.g gVar = (u9.g) this.c;
                Runnable runnable = (Runnable) this.d;
                return gVar.b.schedule(new u9.e(gVar, runnable, i9Var, 1), this.b, (TimeUnit) this.e);
            default:
                final u9.g gVar2 = (u9.g) this.c;
                final Callable callable = (Callable) this.d;
                return gVar2.b.schedule(new Callable() { // from class: u9.f
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return g.this.a.submit(new a(1, callable, i9Var));
                    }
                }, this.b, (TimeUnit) this.e);
        }
    }

    @Override // v5.b
    public Object d() {
        ha.c cVar = (ha.c) this.c;
        Iterable iterable = (Iterable) this.d;
        n5.i iVar = (n5.i) this.e;
        u5.g gVar = (u5.g) ((u5.d) cVar.c);
        gVar.getClass();
        if (iterable.iterator().hasNext()) {
            String str = "UPDATE events SET num_attempts = num_attempts + 1 WHERE _id in " + u5.g.g(iterable);
            SQLiteDatabase a10 = gVar.a();
            a10.beginTransaction();
            try {
                a10.compileStatement(str).execute();
                Cursor rawQuery = a10.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE num_attempts >= 16 GROUP BY transport_name", null);
                while (rawQuery.moveToNext()) {
                    try {
                        gVar.e(rawQuery.getInt(0), q5.c.f, rawQuery.getString(1));
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
        gVar.c(new c1(((w5.a) cVar.g).o() + this.b, iVar));
        return null;
    }

    @Override // org.telegram.ui.Components.e30
    public /* synthetic */ boolean e() {
        return true;
    }

    @Override // gi.d7
    public Bitmap f(BitmapFactory.Options options) {
        y5 y5Var = (y5) this.c;
        f7 f7Var = (f7) this.d;
        long j10 = this.b;
        String str = (String) this.e;
        if (!f7Var.K) {
            return BitmapFactory.decodeFile(str, options);
        }
        String str2 = f7Var.N;
        if (str2 != null) {
            return BitmapFactory.decodeFile(str2, options);
        }
        try {
            return MediaStore.Video.Thumbnails.getThumbnail(y5Var.getContext().getContentResolver(), j10, 1, options);
        } catch (Throwable unused) {
            y5Var.invalidate();
            return null;
        }
    }

    @Override // org.telegram.ui.ActionBar.p1
    public void g(s1 s1Var, int i3) {
        switch (this.a) {
            case 1:
                l6 l6Var = (l6) this.c;
                TL_stars.starGiftDepositPayload[] stargiftdepositpayloadArr = (TL_stars.starGiftDepositPayload[]) this.d;
                e1 e1Var = (e1) this.e;
                l6Var.getClass();
                l6Var.r1(this.b, stargiftdepositpayloadArr[0], s1Var.h(i3, true, true), e1Var);
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
                x30.y1(r3Var, z10, this.b, runnable);
                break;
            default:
                iv0 iv0Var = (iv0) this.c;
                uw uwVar = (uw) this.d;
                TLRPC.User user = (TLRPC.User) this.e;
                ProfileActivity profileActivity = iv0Var.b;
                profileActivity.N1 = true;
                Bundle k10 = a1.g.k("scrollToTopOnResume", true);
                long j10 = -this.b;
                k10.putLong("chat_id", j10);
                if (profileActivity.getMessagesController().E(k10, uwVar, null, null)) {
                    wm wmVar = new wm(k10);
                    profileActivity.getNotificationCenter().n(profileActivity, 4);
                    profileActivity.getNotificationCenter().k(4, new Object[0]);
                    profileActivity.getMessagesController().m(j10, user, 0, null, wmVar, true, null, null, null);
                    profileActivity.presentFragment(wmVar, true);
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.e30
    public /* synthetic */ mq0 getCloseIntoObject() {
        return null;
    }

    @Override // org.telegram.ui.Components.e30
    public /* synthetic */ String getInitialSearchString() {
        return null;
    }

    @Override // org.telegram.ui.Components.e30
    public /* synthetic */ boolean x() {
        return false;
    }

    public /* synthetic */ d0(Object obj, Object obj2, long j10, Object obj3, int i3) {
        this.a = i3;
        this.c = obj;
        this.d = obj2;
        this.b = j10;
        this.e = obj3;
    }

    public /* synthetic */ d0(Object obj, Object obj2, Object obj3, long j10, int i3) {
        this.a = i3;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.b = j10;
    }

    @Override // org.telegram.ui.Components.e30
    public /* synthetic */ void T() {
    }

    @Override // org.telegram.ui.Components.e30
    public /* synthetic */ void H(float f10) {
    }

    @Override // org.telegram.ui.Components.e30
    public /* synthetic */ void O(boolean z10, boolean z11) {
    }
}
