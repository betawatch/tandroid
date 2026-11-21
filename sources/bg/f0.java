package bg;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.provider.MediaStore;
import bi.j1;
import bi.k1;
import di.f6;
import hi.a7;
import hi.c7;
import hi.v5;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import org.telegram.messenger.q10;
import org.telegram.messenger.t3;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.g2;
import org.telegram.ui.ActionBar.q1;
import org.telegram.ui.ActionBar.t1;
import org.telegram.ui.Cells.d2;
import org.telegram.ui.Components.a5;
import org.telegram.ui.Components.w30;
import org.telegram.ui.Components.yk0;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.bn;
import org.telegram.ui.cx;
import org.telegram.ui.f40;
import org.telegram.ui.oa1;
import org.telegram.ui.rv0;
import org.telegram.ui.wq0;
import p4.z;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes.dex */
public final /* synthetic */ class f0 implements w30, j1, a7, oa1, a5, q1, w5.b, v9.g {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ f0(Object obj, long j3, g2 g2Var, Object obj2, int i7) {
        this.a = i7;
        this.c = obj;
        this.b = j3;
        this.d = g2Var;
        this.e = obj2;
    }

    @Override // org.telegram.ui.Components.a5
    public void O(int i7, int i10, boolean z10) {
        bn.A1((bn) this.c, (ArrayList) this.d, this.b, (yk0) this.e, z10, i7);
    }

    @Override // org.telegram.ui.Components.w30
    public void V(TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, boolean z10, TLRPC.VideoSize videoSize) {
        bn bnVar = (bn) this.c;
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
        bnVar.getConnectionsManager().sendRequest(tL_photos_uploadProfilePhoto, new h0(bnVar, fileLocationArr, str, fileLocationArr2, this.b));
    }

    @Override // v9.g
    public ScheduledFuture a(final v4.f0 f0Var) {
        switch (this.a) {
            case 8:
                v9.f fVar = (v9.f) this.c;
                Runnable runnable = (Runnable) this.d;
                return fVar.b.schedule(new v9.d(fVar, runnable, f0Var, 1), this.b, (TimeUnit) this.e);
            default:
                final v9.f fVar2 = (v9.f) this.c;
                final Callable callable = (Callable) this.d;
                return fVar2.b.schedule(new Callable() { // from class: v9.e
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return f.this.a.submit(new z(26, callable, f0Var));
                    }
                }, this.b, (TimeUnit) this.e);
        }
    }

    @Override // bi.j1
    public void b(TLRPC.TL_textWithEntities tL_textWithEntities, boolean z10) {
        f6 f6Var = (f6) this.c;
        k1 k1Var = (k1) this.d;
        TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) this.e;
        f6Var.getClass();
        if (k1Var.G1) {
            return;
        }
        f6Var.p1(tL_starGiftUnique, this.b, tL_textWithEntities, z10, k1Var);
    }

    @Override // hi.a7
    public Bitmap c(BitmapFactory.Options options) {
        v5 v5Var = (v5) this.c;
        c7 c7Var = (c7) this.d;
        long j3 = this.b;
        String str = (String) this.e;
        if (!c7Var.K) {
            return BitmapFactory.decodeFile(str, options);
        }
        String str2 = c7Var.N;
        if (str2 != null) {
            return BitmapFactory.decodeFile(str2, options);
        }
        try {
            return MediaStore.Video.Thumbnails.getThumbnail(v5Var.getContext().getContentResolver(), j3, 1, options);
        } catch (Throwable unused) {
            v5Var.invalidate();
            return null;
        }
    }

    @Override // org.telegram.ui.Components.w30
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
        gVar.c(new ai.d0(((x5.a) cVar.g).r() + this.b, iVar));
        return null;
    }

    @Override // org.telegram.ui.Components.w30
    public /* synthetic */ wq0 getCloseIntoObject() {
        return null;
    }

    @Override // org.telegram.ui.Components.w30
    public /* synthetic */ String getInitialSearchString() {
        return null;
    }

    @Override // org.telegram.ui.ActionBar.q1
    public void h(t1 t1Var, int i7) {
        switch (this.a) {
            case 5:
                t3 t3Var = (t3) this.c;
                d2[] d2VarArr = (d2[]) this.d;
                Runnable runnable = (Runnable) this.e;
                boolean z10 = false;
                d2 d2Var = d2VarArr[0];
                if (d2Var != null && d2Var.b()) {
                    z10 = true;
                }
                f40.C1(t3Var, z10, this.b, runnable);
                break;
            default:
                rv0 rv0Var = (rv0) this.c;
                cx cxVar = (cx) this.d;
                TLRPC.User user = (TLRPC.User) this.e;
                ProfileActivity profileActivity = rv0Var.b;
                profileActivity.N1 = true;
                Bundle k10 = a8.p0.k("scrollToTopOnResume", true);
                long j3 = -this.b;
                k10.putLong("chat_id", j3);
                if (profileActivity.getMessagesController().E(k10, cxVar, null, null)) {
                    bn bnVar = new bn(k10);
                    profileActivity.getNotificationCenter().n(profileActivity, 4);
                    profileActivity.getNotificationCenter().k(4, new Object[0]);
                    profileActivity.getMessagesController().m(j3, user, 0, null, bnVar, true, null, null, null);
                    profileActivity.presentFragment(bnVar, true);
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.oa1
    public void k(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        g2 g2Var = (g2) this.c;
        TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) this.d;
        q10 q10Var = (q10) this.e;
        int currentAccount = g2Var.getCurrentAccount();
        boolean[] zArr = ii.n.a;
        if (zArr[currentAccount]) {
            return;
        }
        zArr[currentAccount] = true;
        ii.n.b(g2Var, this.b, tL_inputCheckPasswordSRP, twoStepVerificationActivity, q10Var, null);
    }

    @Override // org.telegram.ui.Components.w30
    public /* synthetic */ boolean x() {
        return false;
    }

    public /* synthetic */ f0(Object obj, Object obj2, long j3, Object obj3, int i7) {
        this.a = i7;
        this.c = obj;
        this.d = obj2;
        this.b = j3;
        this.e = obj3;
    }

    public /* synthetic */ f0(Object obj, Object obj2, Object obj3, long j3, int i7) {
        this.a = i7;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.b = j3;
    }

    @Override // org.telegram.ui.Components.w30
    public /* synthetic */ void U() {
    }

    @Override // org.telegram.ui.Components.w30
    public /* synthetic */ void I(float f10) {
    }

    @Override // org.telegram.ui.Components.w30
    public /* synthetic */ void Q(boolean z10, boolean z11) {
    }
}
