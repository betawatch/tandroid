package d9;

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
import lf.f0;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.c2;
import org.telegram.ui.ActionBar.d2;
import org.telegram.ui.Cells.z1;
import org.telegram.ui.Components.jm0;
import org.telegram.ui.Components.x40;
import org.telegram.ui.Components.y4;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.d60;
import org.telegram.ui.lu0;
import org.telegram.ui.py;
import org.telegram.ui.qz0;
import org.telegram.ui.xn;
import qh.j5;
import qh.q6;
import qh.s6;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public final /* synthetic */ class c implements h, g3.b, x40, y4, c2, q6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ c(Object obj, Object obj2, long j10, Object obj3, int i10) {
        this.a = i10;
        this.b = obj;
        this.e = obj2;
        this.c = j10;
        this.d = obj3;
    }

    @Override // org.telegram.ui.Components.y4
    public void I(int i10, int i11, boolean z4) {
        xn.s0((xn) this.b, (ArrayList) this.e, this.c, (jm0) this.d, z4, i10);
    }

    @Override // org.telegram.ui.Components.x40
    public void Q(TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, boolean z4, TLRPC.VideoSize videoSize) {
        xn xnVar = (xn) this.b;
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
        xnVar.getConnectionsManager().sendRequest(tL_photos_uploadProfilePhoto, new f0(xnVar, fileLocationArr, str, fileLocationArr2, this.c));
    }

    @Override // d9.h
    public ScheduledFuture a(final y5.h hVar) {
        switch (this.a) {
            case 0:
                g gVar = (g) this.b;
                Runnable runnable = (Runnable) this.e;
                return gVar.b.schedule(new e(gVar, runnable, hVar, 1), this.c, (TimeUnit) this.d);
            default:
                final g gVar2 = (g) this.b;
                final Callable callable = (Callable) this.e;
                return gVar2.b.schedule(new Callable() { // from class: d9.f
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return g.this.a.submit(new a1.e(14, callable, hVar));
                    }
                }, this.c, (TimeUnit) this.d);
        }
    }

    @Override // qh.q6
    public Bitmap c(BitmapFactory.Options options) {
        j5 j5Var = (j5) this.b;
        s6 s6Var = (s6) this.e;
        long j10 = this.c;
        String str = (String) this.d;
        if (!s6Var.K) {
            return BitmapFactory.decodeFile(str, options);
        }
        String str2 = s6Var.N;
        if (str2 != null) {
            return BitmapFactory.decodeFile(str2, options);
        }
        try {
            return MediaStore.Video.Thumbnails.getThumbnail(j5Var.getContext().getContentResolver(), j10, 1, options);
        } catch (Throwable unused) {
            j5Var.invalidate();
            return null;
        }
    }

    @Override // org.telegram.ui.Components.x40
    public /* synthetic */ boolean e() {
        return true;
    }

    @Override // g3.b
    public Object g() {
        e3.g gVar = (e3.g) this.b;
        Iterable iterable = (Iterable) this.e;
        y2.i iVar = (y2.i) this.d;
        f3.h hVar = (f3.h) ((f3.d) gVar.c);
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
        hVar.c(new f3.e(((h3.a) gVar.g).W() + this.c, iVar));
        return null;
    }

    @Override // org.telegram.ui.Components.x40
    public /* synthetic */ lu0 getCloseIntoObject() {
        return null;
    }

    @Override // org.telegram.ui.Components.x40
    public /* synthetic */ String getInitialSearchString() {
        return null;
    }

    @Override // org.telegram.ui.ActionBar.c2
    public void j(d2 d2Var, int i10) {
        switch (this.a) {
            case 5:
                ChatObject.Call call = (ChatObject.Call) this.b;
                z1[] z1VarArr = (z1[]) this.d;
                Runnable runnable = (Runnable) this.e;
                boolean z4 = false;
                z1 z1Var = z1VarArr[0];
                if (z1Var != null && z1Var.b()) {
                    z4 = true;
                }
                d60.w1(call, z4, this.c, runnable);
                break;
            default:
                qz0 qz0Var = (qz0) this.b;
                py pyVar = (py) this.e;
                TLRPC.User user = (TLRPC.User) this.d;
                ProfileActivity profileActivity = qz0Var.b;
                profileActivity.K1 = true;
                Bundle i11 = android.support.v4.media.a.i("scrollToTopOnResume", true);
                long j10 = -this.c;
                i11.putLong("chat_id", j10);
                if (profileActivity.getMessagesController().checkCanOpenChat(i11, pyVar)) {
                    xn xnVar = new xn(i11);
                    NotificationCenter notificationCenter = profileActivity.getNotificationCenter();
                    int i12 = NotificationCenter.closeChats;
                    notificationCenter.removeObserver(profileActivity, i12);
                    profileActivity.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i12, new Object[0]);
                    profileActivity.getMessagesController().addUserToChat(j10, user, 0, null, xnVar, true, null, null);
                    profileActivity.presentFragment(xnVar, true);
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.x40
    public /* synthetic */ boolean u() {
        return false;
    }

    public /* synthetic */ c(Object obj, Object obj2, Object obj3, long j10, int i10) {
        this.a = i10;
        this.b = obj;
        this.e = obj2;
        this.d = obj3;
        this.c = j10;
    }

    public /* synthetic */ c(ChatObject.Call call, z1[] z1VarArr, long j10, Runnable runnable) {
        this.a = 5;
        this.b = call;
        this.d = z1VarArr;
        this.c = j10;
        this.e = runnable;
    }

    public /* synthetic */ c(qz0 qz0Var, long j10, py pyVar, TLRPC.User user) {
        this.a = 6;
        this.b = qz0Var;
        this.c = j10;
        this.e = pyVar;
        this.d = user;
    }

    @Override // org.telegram.ui.Components.x40
    public /* synthetic */ void P() {
    }

    @Override // org.telegram.ui.Components.x40
    public /* synthetic */ void D(float f10) {
    }

    @Override // org.telegram.ui.Components.x40
    public /* synthetic */ void K(boolean z4, boolean z10) {
    }
}
