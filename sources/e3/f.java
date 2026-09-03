package e3;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Pair;
import android.view.View;
import gg.y1;
import java.io.File;
import java.util.ArrayList;
import k9.b1;
import lh.j;
import lh.q;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.j5;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.c2;
import org.telegram.ui.ActionBar.c4;
import org.telegram.ui.ActionBar.d2;
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.Components.il0;
import org.telegram.ui.Components.ir;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.e60;
import org.telegram.ui.ig1;
import org.telegram.ui.qy;
import org.telegram.ui.vz0;
import ph.y7;
import y2.i;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final /* synthetic */ class f implements g3.b, f3.f, ba.a, ig1, ChatObject.Call.OnParticipantsLoad, ImageReceiver.ImageReceiverDelegate, c2, il0, MessagesController.IsInChatCheckedCallback {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ f(Object obj, long j10, Object obj2, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = j10;
        this.d = obj2;
    }

    @Override // org.telegram.ui.Components.il0
    public /* synthetic */ boolean Z0(View view) {
        return false;
    }

    @Override // f3.f
    public Object apply(Object obj) {
        String str = (String) this.c;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        int i10 = ((b3.c) this.d).a;
        Cursor rawQuery = sQLiteDatabase.rawQuery("SELECT 1 FROM log_event_dropped WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(i10)});
        try {
            boolean z4 = rawQuery.getCount() > 0;
            rawQuery.close();
            long j10 = this.b;
            if (z4) {
                sQLiteDatabase.execSQL(e2.c.i(j10, "UPDATE log_event_dropped SET events_dropped_count = events_dropped_count + ", " WHERE log_source = ? AND reason = ?"), new String[]{str, Integer.toString(i10)});
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

    @Override // org.telegram.ui.Components.il0
    public void c(float f10, float f11, int i10, View view) {
        ProfileActivity.b0((ProfileActivity) this.c, (Context) this.d, this.b, view, i10, f10, f11);
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public void didSetImage(ImageReceiver imageReceiver, boolean z4, boolean z10, boolean z11) {
        ResultCallback resultCallback = (ResultCallback) this.c;
        long j10 = this.b;
        File file = (File) this.d;
        ImageReceiver.BitmapHolder bitmapSafe = imageReceiver.getBitmapSafe();
        if (!z4 || bitmapSafe == null || bitmapSafe.bitmap.isRecycled()) {
            return;
        }
        Bitmap bitmap = bitmapSafe.bitmap;
        if (bitmap == null) {
            Drawable drawable = bitmapSafe.drawable;
            if (drawable instanceof BitmapDrawable) {
                bitmap = ((BitmapDrawable) drawable).getBitmap();
            }
        }
        if (bitmap != null) {
            if (resultCallback != null) {
                resultCallback.onComplete(new Pair(Long.valueOf(j10), bitmap));
            }
            Utilities.globalQueue.postRunnable(new c4(file, bitmap));
        } else if (resultCallback != null) {
            resultCallback.onComplete(null);
        }
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public /* synthetic */ void didSetImageBitmap(int i10, String str, Drawable drawable) {
        j5.a(this, i10, str, drawable);
    }

    @Override // ba.a
    public void f(ba.b bVar) {
        ((f9.a) bVar.get()).d((String) this.c, this.b, (b1) this.d);
    }

    @Override // org.telegram.ui.ig1
    public void g(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        ((q) this.c).h0(true, this.b, tL_inputCheckPasswordSRP, (TwoStepVerificationActivity) this.d);
    }

    @Override // g3.b
    public Object h() {
        g gVar = (g) this.c;
        i iVar = (i) this.d;
        f3.d dVar = (f3.d) gVar.c;
        long l10 = ((h3.a) gVar.g).l() + this.b;
        f3.h hVar = (f3.h) dVar;
        hVar.getClass();
        hVar.c(new f3.e(l10, iVar));
        return null;
    }

    @Override // org.telegram.ui.ActionBar.c2
    public void l(d2 d2Var, int i10) {
        switch (this.a) {
            case 6:
                ir.Q((ir) this.c, (ph.d) this.d, this.b);
                break;
            case 7:
                e60 e60Var = (e60) this.c;
                e60Var.d.getMessagesController().addUserToChat(e60Var.i1(), (TLRPC.User) this.d, 0, null, (p2) e60Var.f0.O().getFragmentStack().get(e60Var.f0.O().getFragmentStack().size() - 1), new y1(e60Var, this.b, 20));
                break;
            default:
                y7 y7Var = (y7) this.c;
                ArrayList arrayList = (ArrayList) this.d;
                y7Var.d.put(Long.valueOf(this.b), arrayList);
                int size = arrayList.size();
                int i11 = 0;
                while (i11 < size) {
                    Object obj = arrayList.get(i11);
                    i11++;
                    y7Var.b.k(Boolean.TRUE, ((Long) obj).longValue());
                }
                y7Var.i(true);
                y7Var.e(true);
                y7Var.f(true);
                d2Var.dismiss();
                y7Var.x.H = true;
                break;
        }
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public /* synthetic */ void onAnimationReady(ImageReceiver imageReceiver) {
        j5.b(this, imageReceiver);
    }

    @Override // org.telegram.messenger.ChatObject.Call.OnParticipantsLoad
    public void onLoad(ArrayList arrayList) {
        ((VoIPService) this.c).lambda$createGroupInstance$69(this.b, (int[]) this.d, arrayList);
    }

    @Override // org.telegram.messenger.MessagesController.IsInChatCheckedCallback
    public void run(boolean z4, TLRPC.TL_chatAdminRights tL_chatAdminRights, String str) {
        AndroidUtilities.runOnUIThread(new j((vz0) this.c, this.b, tL_chatAdminRights, str, z4, (qy) this.d));
    }

    public /* synthetic */ f(Object obj, Object obj2, long j10, int i10) {
        this.a = i10;
        this.c = obj;
        this.d = obj2;
        this.b = j10;
    }

    @Override // org.telegram.ui.Components.il0
    public /* synthetic */ void n0(View view, float f10, float f11) {
    }
}
