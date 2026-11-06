package bi;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Pair;
import android.view.View;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.dp;
import org.telegram.messenger.qp;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.cj0;
import org.telegram.ui.Components.pq;
import org.telegram.ui.Components.tq;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.c40;
import org.telegram.ui.la1;
import org.telegram.ui.rv0;
import org.telegram.ui.ww;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final /* synthetic */ class i implements la1, org.telegram.ui.ActionBar.r1, org.telegram.messenger.lc, cj0, dp, w5.b, v5.e, ua.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ i(Object obj, long j3, Object obj2, int i7) {
        this.a = i7;
        this.c = obj;
        this.b = j3;
        this.d = obj2;
    }

    @Override // org.telegram.messenger.dp
    public void a(boolean z9, TLRPC.TL_chatAdminRights tL_chatAdminRights, String str) {
        org.telegram.messenger.g0.h3(new o((rv0) this.c, this.b, tL_chatAdminRights, str, z9, (ww) this.d));
    }

    @Override // v5.e
    public Object apply(Object obj) {
        String str = (String) this.c;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        int i7 = ((r5.c) this.d).a;
        Cursor rawQuery = sQLiteDatabase.rawQuery("SELECT 1 FROM log_event_dropped WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(i7)});
        try {
            boolean z9 = rawQuery.getCount() > 0;
            rawQuery.close();
            long j3 = this.b;
            if (z9) {
                sQLiteDatabase.execSQL(rf.b.h(j3, "UPDATE log_event_dropped SET events_dropped_count = events_dropped_count + ", " WHERE log_source = ? AND reason = ?"), new String[]{str, Integer.toString(i7)});
                return null;
            }
            ContentValues contentValues = new ContentValues();
            contentValues.put("log_source", str);
            contentValues.put("reason", Integer.valueOf(i7));
            contentValues.put("events_dropped_count", Long.valueOf(j3));
            sQLiteDatabase.insert("log_event_dropped", null, contentValues);
            return null;
        } catch (Throwable th2) {
            rawQuery.close();
            throw th2;
        }
    }

    @Override // ua.a
    public void c(ua.b bVar) {
        ((x9.a) bVar.get()).d((String) this.c, this.b, (da.p1) this.d);
    }

    @Override // org.telegram.ui.Components.cj0
    public void f(float f10, float f11, int i7, View view) {
        ProfileActivity.k0((ProfileActivity) this.c, (Context) this.d, this.b, view, i7, f10, f11);
    }

    @Override // org.telegram.messenger.lc
    public void f0(ImageReceiver imageReceiver, boolean z9, boolean z10, boolean z11) {
        ResultCallback resultCallback = (ResultCallback) this.c;
        long j3 = this.b;
        File file = (File) this.d;
        org.telegram.messenger.jc p10 = imageReceiver.p();
        if (!z9 || p10 == null || p10.c.isRecycled()) {
            return;
        }
        Bitmap bitmap = p10.c;
        if (bitmap == null) {
            Drawable drawable = p10.d;
            if (drawable instanceof BitmapDrawable) {
                bitmap = ((BitmapDrawable) drawable).getBitmap();
            }
        }
        if (bitmap != null) {
            if (resultCallback != null) {
                resultCallback.onComplete(new Pair(Long.valueOf(j3), bitmap));
            }
            Utilities.e.c(new fi.z8(file, bitmap));
        } else if (resultCallback != null) {
            resultCallback.onComplete(null);
        }
    }

    @Override // org.telegram.ui.Components.cj0
    public /* synthetic */ boolean f1(View view) {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.r1
    public void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        switch (this.a) {
            case 1:
                k7 k7Var = (k7) this.c;
                TL_stars.InputSavedStarGift inputSavedStarGift = (TL_stars.InputSavedStarGift) this.d;
                vf.b h = u1Var.h(-1, true, true);
                h.d();
                TL_stars.deleteStarGift deletestargift = new TL_stars.deleteStarGift();
                deletestargift.stargift = inputSavedStarGift;
                ConnectionsManager.getInstance(k7Var.a).sendRequest(deletestargift, new h3(k7Var, h, this.b, 0));
                break;
            case 2:
                fi.n8 n8Var = (fi.n8) this.c;
                ArrayList arrayList = (ArrayList) this.d;
                n8Var.d.put(Long.valueOf(this.b), arrayList);
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    n8Var.b.k(Boolean.TRUE, ((Long) obj).longValue());
                }
                n8Var.j(true);
                n8Var.f(true);
                n8Var.g(true);
                u1Var.dismiss();
                n8Var.y.L = true;
                break;
            case 3:
            case 4:
            default:
                c40 c40Var = (c40) this.c;
                qp.s1(c40Var.k1.a).n(c40Var.l1(), (TLRPC.User) this.d, null, (org.telegram.ui.ActionBar.f2) c40Var.Z1.M().getFragmentStack().get(c40Var.Z1.M().getFragmentStack().size() - 1), new r3(c40Var, this.b, 26));
                break;
            case 5:
                tq tqVar = (tq) this.c;
                fi.d dVar = (fi.d) this.d;
                if (!dVar.Q) {
                    dVar.setLoading(true);
                    TL_phone.getGroupCallStreamRtmpUrl getgroupcallstreamrtmpurl = new TL_phone.getGroupCallStreamRtmpUrl();
                    getgroupcallstreamrtmpurl.peer = qp.s1(tqVar.a).j1(this.b);
                    getgroupcallstreamrtmpurl.revoke = true;
                    ConnectionsManager.getInstance(tqVar.a).sendRequest(getgroupcallstreamrtmpurl, new pq(tqVar, dVar, 0));
                    break;
                }
                break;
        }
    }

    @Override // w5.b
    public Object h() {
        ia.c cVar = (ia.c) this.c;
        o5.i iVar = (o5.i) this.d;
        v5.d dVar = (v5.d) cVar.c;
        long s5 = ((x5.a) cVar.g).s() + this.b;
        v5.g gVar = (v5.g) dVar;
        gVar.getClass();
        gVar.c(new di.c1(s5, iVar));
        return null;
    }

    @Override // org.telegram.ui.la1
    public void j(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        ((z) this.c).u0(true, this.b, tL_inputCheckPasswordSRP, (TwoStepVerificationActivity) this.d);
    }

    public /* synthetic */ i(Object obj, Object obj2, long j3, int i7) {
        this.a = i7;
        this.c = obj;
        this.d = obj2;
        this.b = j3;
    }

    @Override // org.telegram.messenger.lc
    public /* synthetic */ void O(ImageReceiver imageReceiver) {
    }

    @Override // org.telegram.messenger.lc
    public /* synthetic */ void t0(int i7, Drawable drawable) {
    }

    @Override // org.telegram.ui.Components.cj0
    public /* synthetic */ void r0(View view, float f10, float f11) {
    }
}
