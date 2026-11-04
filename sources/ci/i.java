package ci;

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
import org.telegram.messenger.hp;
import org.telegram.messenger.uo;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.gj0;
import org.telegram.ui.Components.pq;
import org.telegram.ui.Components.tq;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.ca1;
import org.telegram.ui.iv0;
import org.telegram.ui.uw;
import org.telegram.ui.x30;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class i implements ca1, org.telegram.ui.ActionBar.p1, org.telegram.messenger.ec, gj0, uo, v5.b, u5.e, ta.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ i(Object obj, long j10, Object obj2, int i3) {
        this.a = i3;
        this.c = obj;
        this.b = j10;
        this.d = obj2;
    }

    @Override // org.telegram.messenger.uo
    public void a(boolean z10, TLRPC.TL_chatAdminRights tL_chatAdminRights, String str) {
        org.telegram.messenger.g0.h3(new n((iv0) this.c, this.b, tL_chatAdminRights, str, z10, (uw) this.d));
    }

    @Override // u5.e
    public Object apply(Object obj) {
        String str = (String) this.c;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        int i3 = ((q5.c) this.d).a;
        Cursor rawQuery = sQLiteDatabase.rawQuery("SELECT 1 FROM log_event_dropped WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(i3)});
        try {
            boolean z10 = rawQuery.getCount() > 0;
            rawQuery.close();
            long j10 = this.b;
            if (z10) {
                sQLiteDatabase.execSQL(t4.c.e(j10, "UPDATE log_event_dropped SET events_dropped_count = events_dropped_count + ", " WHERE log_source = ? AND reason = ?"), new String[]{str, Integer.toString(i3)});
                return null;
            }
            ContentValues contentValues = new ContentValues();
            contentValues.put("log_source", str);
            contentValues.put("reason", Integer.valueOf(i3));
            contentValues.put("events_dropped_count", Long.valueOf(j10));
            sQLiteDatabase.insert("log_event_dropped", null, contentValues);
            return null;
        } catch (Throwable th2) {
            rawQuery.close();
            throw th2;
        }
    }

    @Override // org.telegram.ui.Components.gj0
    public void b(float f10, float f11, int i3, View view) {
        ProfileActivity.k0((ProfileActivity) this.c, (Context) this.d, this.b, view, i3, f10, f11);
    }

    @Override // org.telegram.ui.Components.gj0
    public /* synthetic */ boolean b1(View view) {
        return false;
    }

    @Override // ta.a
    public void c(ta.b bVar) {
        ((w9.a) bVar.get()).d((String) this.c, this.b, (ca.p1) this.d);
    }

    @Override // v5.b
    public Object d() {
        ha.c cVar = (ha.c) this.c;
        n5.i iVar = (n5.i) this.d;
        u5.d dVar = (u5.d) cVar.c;
        long o10 = ((w5.a) cVar.g).o() + this.b;
        u5.g gVar = (u5.g) dVar;
        gVar.getClass();
        gVar.c(new ei.c1(o10, iVar));
        return null;
    }

    @Override // org.telegram.ui.ActionBar.p1
    public void g(org.telegram.ui.ActionBar.s1 s1Var, int i3) {
        switch (this.a) {
            case 1:
                l6 l6Var = (l6) this.c;
                TL_stars.InputSavedStarGift inputSavedStarGift = (TL_stars.InputSavedStarGift) this.d;
                sf.b h = s1Var.h(-1, true, true);
                h.d();
                TL_stars.deleteStarGift deletestargift = new TL_stars.deleteStarGift();
                deletestargift.stargift = inputSavedStarGift;
                ConnectionsManager.getInstance(l6Var.a).sendRequest(deletestargift, new u2(l6Var, h, this.b, 0));
                break;
            case 2:
                gi.o8 o8Var = (gi.o8) this.c;
                ArrayList arrayList = (ArrayList) this.d;
                o8Var.d.put(Long.valueOf(this.b), arrayList);
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    o8Var.b.k(Boolean.TRUE, ((Long) obj).longValue());
                }
                o8Var.j(true);
                o8Var.f(true);
                o8Var.g(true);
                s1Var.dismiss();
                o8Var.y.M = true;
                break;
            case 3:
            case 4:
            default:
                x30 x30Var = (x30) this.c;
                hp.s1(x30Var.l1.a).n(x30Var.k1(), (TLRPC.User) this.d, null, (org.telegram.ui.ActionBar.d2) x30Var.a2.M().getFragmentStack().get(x30Var.a2.M().getFragmentStack().size() - 1), new e3(x30Var, this.b, 26));
                break;
            case 5:
                tq tqVar = (tq) this.c;
                gi.d dVar = (gi.d) this.d;
                if (!dVar.R) {
                    dVar.setLoading(true);
                    TL_phone.getGroupCallStreamRtmpUrl getgroupcallstreamrtmpurl = new TL_phone.getGroupCallStreamRtmpUrl();
                    getgroupcallstreamrtmpurl.peer = hp.s1(tqVar.a).j1(this.b);
                    getgroupcallstreamrtmpurl.revoke = true;
                    ConnectionsManager.getInstance(tqVar.a).sendRequest(getgroupcallstreamrtmpurl, new pq(tqVar, dVar, 0));
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.ca1
    public void l(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        ((v) this.c).u0(true, this.b, tL_inputCheckPasswordSRP, (TwoStepVerificationActivity) this.d);
    }

    @Override // org.telegram.messenger.ec
    public void l0(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        ResultCallback resultCallback = (ResultCallback) this.c;
        long j10 = this.b;
        File file = (File) this.d;
        org.telegram.messenger.cc p10 = imageReceiver.p();
        if (!z10 || p10 == null || p10.c.isRecycled()) {
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
                resultCallback.onComplete(new Pair(Long.valueOf(j10), bitmap));
            }
            Utilities.e.c(new gi.a9(file, bitmap));
        } else if (resultCallback != null) {
            resultCallback.onComplete(null);
        }
    }

    public /* synthetic */ i(Object obj, Object obj2, long j10, int i3) {
        this.a = i3;
        this.c = obj;
        this.d = obj2;
        this.b = j10;
    }

    @Override // org.telegram.messenger.ec
    public /* synthetic */ void D(ImageReceiver imageReceiver) {
    }

    @Override // org.telegram.messenger.ec
    public /* synthetic */ void F0(int i3, Drawable drawable) {
    }

    @Override // org.telegram.ui.Components.gj0
    public /* synthetic */ void r0(View view, float f10, float f11) {
    }
}
