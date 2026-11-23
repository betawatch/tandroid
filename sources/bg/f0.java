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
import hi.v7;
import hi.x7;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import org.telegram.messenger.p10;
import org.telegram.messenger.t3;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.g2;
import org.telegram.ui.ActionBar.q1;
import org.telegram.ui.ActionBar.t1;
import org.telegram.ui.Cells.d2;
import org.telegram.ui.Components.nd0;
import org.telegram.ui.Components.t30;
import org.telegram.ui.Components.yk0;
import org.telegram.ui.Components.z4;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.bn;
import org.telegram.ui.bx;
import org.telegram.ui.e40;
import org.telegram.ui.ma1;
import org.telegram.ui.qv0;
import org.telegram.ui.wq0;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public final /* synthetic */ class f0 implements t30, j1, v7, ma1, z4, q1, w5.b, v9.h {
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

    @Override // org.telegram.ui.Components.z4
    public void I(int i7, int i10, boolean z10) {
        bn.A1((bn) this.c, (ArrayList) this.d, this.b, (yk0) this.e, z10, i7);
    }

    @Override // org.telegram.ui.Components.t30
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

    @Override // bi.j1
    public void a(TLRPC.TL_textWithEntities tL_textWithEntities, boolean z10) {
        f6 f6Var = (f6) this.c;
        k1 k1Var = (k1) this.d;
        TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) this.e;
        f6Var.getClass();
        if (k1Var.G1) {
            return;
        }
        f6Var.p1(tL_starGiftUnique, this.b, tL_textWithEntities, z10, k1Var);
    }

    @Override // hi.v7
    public Bitmap b(BitmapFactory.Options options) {
        hi.f6 f6Var = (hi.f6) this.c;
        x7 x7Var = (x7) this.d;
        long j3 = this.b;
        String str = (String) this.e;
        if (!x7Var.K) {
            return BitmapFactory.decodeFile(str, options);
        }
        String str2 = x7Var.N;
        if (str2 != null) {
            return BitmapFactory.decodeFile(str2, options);
        }
        try {
            return MediaStore.Video.Thumbnails.getThumbnail(f6Var.getContext().getContentResolver(), j3, 1, options);
        } catch (Throwable unused) {
            f6Var.invalidate();
            return null;
        }
    }

    @Override // v9.h
    public ScheduledFuture c(final nd0 nd0Var) {
        switch (this.a) {
            case 8:
                v9.g gVar = (v9.g) this.c;
                Runnable runnable = (Runnable) this.d;
                return gVar.b.schedule(new v9.e(gVar, runnable, nd0Var, 1), this.b, (TimeUnit) this.e);
            default:
                final v9.g gVar2 = (v9.g) this.c;
                final Callable callable = (Callable) this.d;
                return gVar2.b.schedule(new Callable() { // from class: v9.f
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return g.this.a.submit(new b(0, callable, nd0Var));
                    }
                }, this.b, (TimeUnit) this.e);
        }
    }

    @Override // org.telegram.ui.Components.t30
    public /* synthetic */ boolean f() {
        return true;
    }

    @Override // org.telegram.ui.Components.t30
    public /* synthetic */ wq0 getCloseIntoObject() {
        return null;
    }

    @Override // org.telegram.ui.Components.t30
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
        gVar.c(new ai.z(((x5.a) cVar.g).o() + this.b, iVar));
        return null;
    }

    @Override // org.telegram.ui.ActionBar.q1
    public void i(t1 t1Var, int i7) {
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
                e40.C1(t3Var, z10, this.b, runnable);
                break;
            default:
                qv0 qv0Var = (qv0) this.c;
                bx bxVar = (bx) this.d;
                TLRPC.User user = (TLRPC.User) this.e;
                ProfileActivity profileActivity = qv0Var.b;
                profileActivity.N1 = true;
                Bundle k10 = a8.p0.k("scrollToTopOnResume", true);
                long j3 = -this.b;
                k10.putLong("chat_id", j3);
                if (profileActivity.getMessagesController().E(k10, bxVar, null, null)) {
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

    @Override // org.telegram.ui.ma1
    public void j(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        g2 g2Var = (g2) this.c;
        TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) this.d;
        p10 p10Var = (p10) this.e;
        int currentAccount = g2Var.getCurrentAccount();
        boolean[] zArr = ii.n.a;
        if (zArr[currentAccount]) {
            return;
        }
        zArr[currentAccount] = true;
        ii.n.b(g2Var, this.b, tL_inputCheckPasswordSRP, twoStepVerificationActivity, p10Var, null);
    }

    @Override // org.telegram.ui.Components.t30
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

    @Override // org.telegram.ui.Components.t30
    public /* synthetic */ void U() {
    }

    @Override // org.telegram.ui.Components.t30
    public /* synthetic */ void H(float f10) {
    }

    @Override // org.telegram.ui.Components.t30
    public /* synthetic */ void P(boolean z10, boolean z11) {
    }
}
