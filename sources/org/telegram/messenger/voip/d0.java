package org.telegram.messenger.voip;

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
import org.telegram.messenger.ip;
import org.telegram.messenger.kc;
import org.telegram.messenger.mc;
import org.telegram.messenger.vp;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.k2;
import org.telegram.ui.ActionBar.u1;
import org.telegram.ui.ActionBar.w3;
import org.telegram.ui.ActionBar.x1;
import org.telegram.ui.Cells.f1;
import org.telegram.ui.Components.cr;
import org.telegram.ui.Components.hf;
import org.telegram.ui.Components.hk0;
import org.telegram.ui.Components.zq;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.ay;
import org.telegram.ui.b50;
import org.telegram.ui.dx0;
import org.telegram.ui.gc1;
import rh.e4;
import vh.r6;
import z9.b1;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class d0 implements mc, u1, hk0, ip, t5.b, gc1, s5.e, qa.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ d0(Object obj, long j10, Object obj2, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = j10;
        this.d = obj2;
    }

    @Override // org.telegram.messenger.ip
    public void a(boolean z10, TLRPC.TL_chatAdminRights tL_chatAdminRights, String str) {
        org.telegram.messenger.i0.g3(new hf((dx0) this.c, this.b, tL_chatAdminRights, str, z10, (ay) this.d));
    }

    @Override // s5.e
    public Object apply(Object obj) {
        String str = (String) this.c;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        int i10 = ((o5.c) this.d).a;
        Cursor rawQuery = sQLiteDatabase.rawQuery("SELECT 1 FROM log_event_dropped WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(i10)});
        try {
            boolean z10 = rawQuery.getCount() > 0;
            rawQuery.close();
            long j10 = this.b;
            if (z10) {
                sQLiteDatabase.execSQL(f1.n(j10, "UPDATE log_event_dropped SET events_dropped_count = events_dropped_count + ", " WHERE log_source = ? AND reason = ?"), new String[]{str, Integer.toString(i10)});
                return null;
            }
            ContentValues contentValues = new ContentValues();
            contentValues.put("log_source", str);
            contentValues.put("reason", Integer.valueOf(i10));
            contentValues.put("events_dropped_count", Long.valueOf(j10));
            sQLiteDatabase.insert("log_event_dropped", null, contentValues);
            return null;
        } catch (Throwable th2) {
            rawQuery.close();
            throw th2;
        }
    }

    @Override // org.telegram.ui.Components.hk0
    public void b(float f7, float f10, int i10, View view) {
        ProfileActivity.j0((ProfileActivity) this.c, (Context) this.d, this.b, view, i10, f7, f10);
    }

    @Override // t5.b
    public Object g() {
        ea.d dVar = (ea.d) this.c;
        l5.i iVar = (l5.i) this.d;
        s5.d dVar2 = (s5.d) dVar.c;
        long g10 = ((u5.a) dVar.g).g() + this.b;
        s5.g gVar = (s5.g) dVar2;
        gVar.getClass();
        gVar.c(new m4.x0(g10, iVar));
        return null;
    }

    @Override // org.telegram.ui.ActionBar.u1
    public void h(x1 x1Var, int i10) {
        switch (this.a) {
            case 2:
                cr crVar = (cr) this.c;
                vh.d dVar = (vh.d) this.d;
                if (!dVar.Q) {
                    dVar.setLoading(true);
                    TL_phone.getGroupCallStreamRtmpUrl getgroupcallstreamrtmpurl = new TL_phone.getGroupCallStreamRtmpUrl();
                    getgroupcallstreamrtmpurl.peer = vp.r1(crVar.a).i1(this.b);
                    getgroupcallstreamrtmpurl.revoke = true;
                    ConnectionsManager.getInstance(crVar.a).sendRequest(getgroupcallstreamrtmpurl, new zq(crVar, dVar, 0));
                    break;
                }
                break;
            case 3:
                b50 b50Var = (b50) this.c;
                vp.r1(b50Var.k1.a).n(b50Var.k1(), (TLRPC.User) this.d, null, (k2) b50Var.Z1.M().getFragmentStack().get(b50Var.Z1.M().getFragmentStack().size() - 1), new bi.e(b50Var, this.b, 15));
                break;
            case 8:
                e4 e4Var = (e4) this.c;
                TL_stars.InputSavedStarGift inputSavedStarGift = (TL_stars.InputSavedStarGift) this.d;
                gf.e h = x1Var.h(-1, true, true);
                h.d();
                TL_stars.deleteStarGift deletestargift = new TL_stars.deleteStarGift();
                deletestargift.stargift = inputSavedStarGift;
                ConnectionsManager.getInstance(e4Var.a).sendRequest(deletestargift, new mg.x(e4Var, h, this.b, 4));
                break;
            default:
                r6 r6Var = (r6) this.c;
                ArrayList arrayList = (ArrayList) this.d;
                r6Var.d.put(Long.valueOf(this.b), arrayList);
                int size = arrayList.size();
                int i11 = 0;
                while (i11 < size) {
                    Object obj = arrayList.get(i11);
                    i11++;
                    r6Var.b.k(Boolean.TRUE, ((Long) obj).longValue());
                }
                r6Var.j(true);
                r6Var.f(true);
                r6Var.g(true);
                x1Var.dismiss();
                r6Var.y.L = true;
                break;
        }
    }

    @Override // org.telegram.ui.Components.hk0
    public /* synthetic */ boolean h1(View view) {
        return false;
    }

    @Override // qa.a
    public void i(qa.b bVar) {
        ((u9.a) bVar.get()).d((String) this.c, this.b, (b1) this.d);
    }

    @Override // org.telegram.ui.gc1
    public void m(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        ((rh.i) this.c).t0(true, this.b, tL_inputCheckPasswordSRP, (TwoStepVerificationActivity) this.d);
    }

    @Override // org.telegram.messenger.mc
    public void o(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        ResultCallback resultCallback = (ResultCallback) this.c;
        long j10 = this.b;
        File file = (File) this.d;
        kc p5 = imageReceiver.p();
        if (!z10 || p5 == null || p5.c.isRecycled()) {
            return;
        }
        Bitmap bitmap = p5.c;
        if (bitmap == null) {
            Drawable drawable = p5.d;
            if (drawable instanceof BitmapDrawable) {
                bitmap = ((BitmapDrawable) drawable).getBitmap();
            }
        }
        if (bitmap != null) {
            if (resultCallback != null) {
                resultCallback.onComplete(new Pair(Long.valueOf(j10), bitmap));
            }
            Utilities.e.c(new w3(file, bitmap));
        } else if (resultCallback != null) {
            resultCallback.onComplete(null);
        }
    }

    public /* synthetic */ d0(Object obj, Object obj2, long j10, int i10) {
        this.a = i10;
        this.c = obj;
        this.d = obj2;
        this.b = j10;
    }

    @Override // org.telegram.messenger.mc
    public /* synthetic */ void j(ImageReceiver imageReceiver) {
    }

    @Override // org.telegram.messenger.mc
    public /* synthetic */ void q(int i10, Drawable drawable) {
    }

    @Override // org.telegram.ui.Components.hk0
    public /* synthetic */ void q0(View view, float f7, float f10) {
    }
}
