package di;

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
import org.telegram.messenger.ap;
import org.telegram.messenger.np;
import org.telegram.messenger.r10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.fr;
import org.telegram.ui.Components.jr;
import org.telegram.ui.Components.rj0;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.cx;
import org.telegram.ui.f40;
import org.telegram.ui.oa1;
import org.telegram.ui.rv0;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class h implements oa1, org.telegram.ui.ActionBar.q1, org.telegram.messenger.kc, rj0, ap, w5.b, v5.e, ua.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ h(Object obj, long j3, Object obj2, int i7) {
        this.a = i7;
        this.c = obj;
        this.b = j3;
        this.d = obj2;
    }

    @Override // org.telegram.messenger.ap
    public void a(boolean z10, TLRPC.TL_chatAdminRights tL_chatAdminRights, String str) {
        org.telegram.messenger.g0.g3(new m((rv0) this.c, this.b, tL_chatAdminRights, str, z10, (cx) this.d));
    }

    @Override // v5.e
    public Object apply(Object obj) {
        String str = (String) this.c;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        int i7 = ((r5.c) this.d).a;
        Cursor rawQuery = sQLiteDatabase.rawQuery("SELECT 1 FROM log_event_dropped WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(i7)});
        try {
            boolean z10 = rawQuery.getCount() > 0;
            rawQuery.close();
            long j3 = this.b;
            if (z10) {
                sQLiteDatabase.execSQL(p5.c.j(j3, "UPDATE log_event_dropped SET events_dropped_count = events_dropped_count + ", " WHERE log_source = ? AND reason = ?"), new String[]{str, Integer.toString(i7)});
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
    public void b(ua.b bVar) {
        ((x9.a) bVar.get()).d((String) this.c, this.b, (da.p1) this.d);
    }

    @Override // org.telegram.ui.Components.rj0
    public /* synthetic */ boolean b1(View view) {
        return false;
    }

    @Override // org.telegram.ui.Components.rj0
    public void f(float f10, float f11, int i7, View view) {
        ProfileActivity.h0((ProfileActivity) this.c, (Context) this.d, this.b, view, i7, f10, f11);
    }

    @Override // w5.b
    public Object g() {
        ia.c cVar = (ia.c) this.c;
        o5.i iVar = (o5.i) this.d;
        v5.d dVar = (v5.d) cVar.c;
        long r10 = ((x5.a) cVar.g).r() + this.b;
        v5.g gVar = (v5.g) dVar;
        gVar.getClass();
        gVar.c(new ai.d0(r10, iVar));
        return null;
    }

    @Override // org.telegram.ui.ActionBar.q1
    public void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        switch (this.a) {
            case 1:
                f6 f6Var = (f6) this.c;
                TL_stars.InputSavedStarGift inputSavedStarGift = (TL_stars.InputSavedStarGift) this.d;
                vf.b h = t1Var.h(-1, true, true);
                h.d();
                TL_stars.deleteStarGift deletestargift = new TL_stars.deleteStarGift();
                deletestargift.stargift = inputSavedStarGift;
                ConnectionsManager.getInstance(f6Var.a).sendRequest(deletestargift, new q2(f6Var, h, this.b, 0));
                break;
            case 2:
                hi.k8 k8Var = (hi.k8) this.c;
                ArrayList arrayList = (ArrayList) this.d;
                k8Var.d.put(Long.valueOf(this.b), arrayList);
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    k8Var.b.k(Boolean.TRUE, ((Long) obj).longValue());
                }
                k8Var.j(true);
                k8Var.f(true);
                k8Var.g(true);
                t1Var.dismiss();
                k8Var.y.M = true;
                break;
            case 3:
                org.telegram.ui.ActionBar.g2 g2Var = (org.telegram.ui.ActionBar.g2) this.c;
                r10 r10Var = (r10) this.d;
                TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                bg.f0 f0Var = new bg.f0(g2Var, this.b, twoStepVerificationActivity, r10Var, 3);
                twoStepVerificationActivity.a0 = 1;
                twoStepVerificationActivity.c0 = f0Var;
                twoStepVerificationActivity.x0(new ii.b(g2Var, twoStepVerificationActivity, 0));
                break;
            case 4:
            case 5:
            default:
                f40 f40Var = (f40) this.c;
                np.u1(f40Var.o1.a).n(f40Var.m1(), (TLRPC.User) this.d, null, (org.telegram.ui.ActionBar.g2) f40Var.d2.M().getFragmentStack().get(f40Var.d2.M().getFragmentStack().size() - 1), new bi.c4(f40Var, this.b, 27));
                break;
            case 6:
                jr jrVar = (jr) this.c;
                hi.e eVar = (hi.e) this.d;
                if (!eVar.R) {
                    eVar.setLoading(true);
                    TL_phone.getGroupCallStreamRtmpUrl getgroupcallstreamrtmpurl = new TL_phone.getGroupCallStreamRtmpUrl();
                    getgroupcallstreamrtmpurl.peer = np.u1(jrVar.a).l1(this.b);
                    getgroupcallstreamrtmpurl.revoke = true;
                    ConnectionsManager.getInstance(jrVar.a).sendRequest(getgroupcallstreamrtmpurl, new fr(jrVar, eVar, 0));
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.oa1
    public void k(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        ((t) this.c).v0(true, this.b, tL_inputCheckPasswordSRP, (TwoStepVerificationActivity) this.d);
    }

    @Override // org.telegram.messenger.kc
    public void m0(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        ResultCallback resultCallback = (ResultCallback) this.c;
        long j3 = this.b;
        File file = (File) this.d;
        org.telegram.messenger.ic p10 = imageReceiver.p();
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
                resultCallback.onComplete(new Pair(Long.valueOf(j3), bitmap));
            }
            Utilities.e.c(new org.telegram.ui.ActionBar.z1(5, file, bitmap));
        } else if (resultCallback != null) {
            resultCallback.onComplete(null);
        }
    }

    public /* synthetic */ h(Object obj, Object obj2, long j3, int i7) {
        this.a = i7;
        this.c = obj;
        this.d = obj2;
        this.b = j3;
    }

    @Override // org.telegram.messenger.kc
    public /* synthetic */ void V(ImageReceiver imageReceiver) {
    }

    @Override // org.telegram.messenger.kc
    public /* synthetic */ void G0(int i7, Drawable drawable) {
    }

    @Override // org.telegram.ui.Components.rj0
    public /* synthetic */ void s0(View view, float f10, float f11) {
    }
}
