package a9;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.provider.MediaStore;
import gf.g0;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import lh.q6;
import lh.x7;
import lh.z7;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.a2;
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.Cells.y1;
import org.telegram.ui.Components.i40;
import org.telegram.ui.Components.ol0;
import org.telegram.ui.Components.x4;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.cu0;
import org.telegram.ui.dz0;
import org.telegram.ui.gy;
import org.telegram.ui.rn;
import org.telegram.ui.s50;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final /* synthetic */ class d implements j, e3.b, i40, x7, x4, a2 {
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

    @Override // org.telegram.ui.Components.x4
    public void I(int i10, int i11, boolean z10) {
        rn.s0((rn) this.b, (ArrayList) this.e, this.c, (ol0) this.d, z10, i10);
    }

    @Override // org.telegram.ui.Components.i40
    public void Q(TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, boolean z10, TLRPC.VideoSize videoSize) {
        rn rnVar = (rn) this.b;
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
        rnVar.getConnectionsManager().sendRequest(tL_photos_uploadProfilePhoto, new g0(rnVar, fileLocationArr, str, fileLocationArr2, this.c));
    }

    @Override // a9.j
    public ScheduledFuture a(final i iVar) {
        switch (this.a) {
            case 0:
                h hVar = (h) this.b;
                Runnable runnable = (Runnable) this.e;
                return hVar.b.schedule(new f(hVar, runnable, iVar, 1), this.c, (TimeUnit) this.d);
            default:
                final h hVar2 = (h) this.b;
                final Callable callable = (Callable) this.e;
                return hVar2.b.schedule(new Callable() { // from class: a9.g
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return h.this.a.submit(new a1.e(3, callable, iVar));
                    }
                }, this.c, (TimeUnit) this.d);
        }
    }

    @Override // org.telegram.ui.Components.i40
    public /* synthetic */ boolean e() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void f(b2 b2Var, int i10) {
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
                s50.w1(call, z10, this.c, runnable);
                break;
            default:
                dz0 dz0Var = (dz0) this.b;
                gy gyVar = (gy) this.e;
                TLRPC.User user = (TLRPC.User) this.d;
                ProfileActivity profileActivity = dz0Var.b;
                profileActivity.J1 = true;
                Bundle h = p.h("scrollToTopOnResume", true);
                long j10 = -this.c;
                h.putLong("chat_id", j10);
                if (profileActivity.getMessagesController().checkCanOpenChat(h, gyVar)) {
                    rn rnVar = new rn(h);
                    NotificationCenter notificationCenter = profileActivity.getNotificationCenter();
                    int i11 = NotificationCenter.closeChats;
                    notificationCenter.removeObserver(profileActivity, i11);
                    profileActivity.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i11, new Object[0]);
                    profileActivity.getMessagesController().addUserToChat(j10, user, 0, null, rnVar, true, null, null);
                    profileActivity.presentFragment(rnVar, true);
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.i40
    public /* synthetic */ cu0 getCloseIntoObject() {
        return null;
    }

    @Override // org.telegram.ui.Components.i40
    public /* synthetic */ String getInitialSearchString() {
        return null;
    }

    @Override // lh.x7
    public Bitmap h(BitmapFactory.Options options) {
        q6 q6Var = (q6) this.b;
        z7 z7Var = (z7) this.e;
        long j10 = this.c;
        String str = (String) this.d;
        if (!z7Var.K) {
            return BitmapFactory.decodeFile(str, options);
        }
        String str2 = z7Var.N;
        if (str2 != null) {
            return BitmapFactory.decodeFile(str2, options);
        }
        try {
            return MediaStore.Video.Thumbnails.getThumbnail(q6Var.getContext().getContentResolver(), j10, 1, options);
        } catch (Throwable unused) {
            q6Var.invalidate();
            return null;
        }
    }

    @Override // e3.b
    public Object i() {
        c3.g gVar = (c3.g) this.b;
        Iterable iterable = (Iterable) this.e;
        w2.i iVar = (w2.i) this.d;
        d3.h hVar = (d3.h) ((d3.d) gVar.c);
        hVar.getClass();
        if (iterable.iterator().hasNext()) {
            String str = "UPDATE events SET num_attempts = num_attempts + 1 WHERE _id in " + d3.h.g(iterable);
            SQLiteDatabase a2 = hVar.a();
            a2.beginTransaction();
            try {
                a2.compileStatement(str).execute();
                Cursor rawQuery = a2.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE num_attempts >= 16 GROUP BY transport_name", null);
                while (rawQuery.moveToNext()) {
                    try {
                        hVar.e(rawQuery.getInt(0), z2.c.f, rawQuery.getString(1));
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
        hVar.c(new d3.e(((f3.a) gVar.g).E() + this.c, iVar));
        return null;
    }

    @Override // org.telegram.ui.Components.i40
    public /* synthetic */ boolean v() {
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

    public /* synthetic */ d(dz0 dz0Var, long j10, gy gyVar, TLRPC.User user) {
        this.a = 7;
        this.b = dz0Var;
        this.c = j10;
        this.e = gyVar;
        this.d = user;
    }

    @Override // org.telegram.ui.Components.i40
    public /* synthetic */ void P() {
    }

    @Override // org.telegram.ui.Components.i40
    public /* synthetic */ void E(float f10) {
    }

    @Override // org.telegram.ui.Components.i40
    public /* synthetic */ void J(boolean z10, boolean z11) {
    }
}
