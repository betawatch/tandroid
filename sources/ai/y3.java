package ai;

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
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.d50;
import org.telegram.ui.Components.ym0;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.cy;
import org.telegram.ui.ju0;
import org.telegram.ui.jz0;
import org.telegram.ui.q50;
import org.telegram.ui.qn;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes4.dex */
public final /* synthetic */ class y3 implements org.telegram.ui.ActionBar.a2, ei.y7, org.telegram.ui.Components.e5, t5.b, s9.g, d50 {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ y3(Object obj, long j10, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = j10;
        this.d = obj2;
        this.e = obj3;
    }

    @Override // org.telegram.ui.Components.e5
    public void C(int i10, int i11, boolean z10) {
        qn.h0((qn) this.c, (ArrayList) this.d, this.b, (ym0) this.e, z10, i10);
    }

    @Override // org.telegram.ui.Components.d50
    public void Q(TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, boolean z10, TLRPC.VideoSize videoSize) {
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
            int i10 = tL_photos_uploadProfilePhoto.flags;
            tL_photos_uploadProfilePhoto.video_start_ts = d;
            tL_photos_uploadProfilePhoto.flags = i10 | 6;
        }
        if (videoSize != null) {
            tL_photos_uploadProfilePhoto.video_emoji_markup = videoSize;
            tL_photos_uploadProfilePhoto.flags |= 16;
        }
        qnVar.getConnectionsManager().sendRequest(tL_photos_uploadProfilePhoto, new ci.b8(qnVar, fileLocationArr, str, fileLocationArr2, this.b));
    }

    @Override // s9.g
    public ScheduledFuture a(final le.b bVar) {
        switch (this.a) {
            case 6:
                s9.f fVar = (s9.f) this.c;
                Runnable runnable = (Runnable) this.d;
                return fVar.b.schedule(new s9.d(fVar, runnable, bVar, 1), this.b, (TimeUnit) this.e);
            default:
                final s9.f fVar2 = (s9.f) this.c;
                final Callable callable = (Callable) this.d;
                return fVar2.b.schedule(new Callable() { // from class: s9.e
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return f.this.a.submit(new p2.b(16, callable, bVar));
                    }
                }, this.b, (TimeUnit) this.e);
        }
    }

    @Override // org.telegram.ui.Components.d50
    public /* synthetic */ boolean e() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.a) {
            case 0:
                l7 l7Var = (l7) this.c;
                TL_stars.starGiftDepositPayload[] stargiftdepositpayloadArr = (TL_stars.starGiftDepositPayload[]) this.d;
                ug.m1 m1Var = (ug.m1) this.e;
                l7Var.getClass();
                l7Var.P1(this.b, stargiftdepositpayloadArr[0], b2Var.h(i10, true, true), m1Var);
                break;
            case 3:
                ChatObject.Call call = (ChatObject.Call) this.c;
                org.telegram.ui.Cells.a2[] a2VarArr = (org.telegram.ui.Cells.a2[]) this.d;
                Runnable runnable = (Runnable) this.e;
                boolean z10 = false;
                org.telegram.ui.Cells.a2 a2Var = a2VarArr[0];
                if (a2Var != null && a2Var.b()) {
                    z10 = true;
                }
                q50.x1(call, z10, this.b, runnable);
                break;
            default:
                jz0 jz0Var = (jz0) this.c;
                cy cyVar = (cy) this.d;
                TLRPC.User user = (TLRPC.User) this.e;
                ProfileActivity profileActivity = jz0Var.b;
                profileActivity.O1 = true;
                Bundle h = a1.g.h("scrollToTopOnResume", true);
                long j10 = -this.b;
                h.putLong("chat_id", j10);
                if (profileActivity.getMessagesController().checkCanOpenChat(h, cyVar)) {
                    qn qnVar = new qn(h);
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

    @Override // org.telegram.ui.Components.d50
    public /* synthetic */ ju0 getCloseIntoObject() {
        return null;
    }

    @Override // org.telegram.ui.Components.d50
    public /* synthetic */ String getInitialSearchString() {
        return null;
    }

    @Override // t5.b
    public Object j() {
        ea.b bVar = (ea.b) this.c;
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
        gVar.c(new ci.d1(((u5.a) bVar.g).d() + this.b, iVar));
        return null;
    }

    @Override // ei.y7
    public Bitmap k(BitmapFactory.Options options) {
        ei.r6 r6Var = (ei.r6) this.c;
        ei.a8 a8Var = (ei.a8) this.d;
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

    @Override // org.telegram.ui.Components.d50
    public /* synthetic */ boolean v() {
        return false;
    }

    public /* synthetic */ y3(Object obj, Object obj2, long j10, Object obj3, int i10) {
        this.a = i10;
        this.c = obj;
        this.d = obj2;
        this.b = j10;
        this.e = obj3;
    }

    public /* synthetic */ y3(Object obj, Object obj2, Object obj3, long j10, int i10) {
        this.a = i10;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.b = j10;
    }

    @Override // org.telegram.ui.Components.d50
    public /* synthetic */ void E(float f7) {
    }

    @Override // org.telegram.ui.Components.d50
    public /* synthetic */ void P() {
    }

    @Override // org.telegram.ui.Components.d50
    public /* synthetic */ void K(boolean z10, boolean z11) {
    }
}
