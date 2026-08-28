package b9;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Pair;
import android.view.View;
import bg.i2;
import c3.h;
import d3.f;
import g9.b1;
import gh.r;
import java.io.File;
import java.util.ArrayList;
import kh.aa;
import kh.n9;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.g5;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.ActionBar.c2;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.Components.cr;
import org.telegram.ui.Components.nk0;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.dy;
import org.telegram.ui.dz0;
import org.telegram.ui.nf1;
import org.telegram.ui.o50;
import w2.i;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements x9.a, e3.b, f, nf1, b2, ChatObject.Call.OnParticipantsLoad, ImageReceiver.ImageReceiverDelegate, nk0, MessagesController.IsInChatCheckedCallback {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ a(Object obj, long j10, Object obj2, int i9) {
        this.a = i9;
        this.c = obj;
        this.b = j10;
        this.d = obj2;
    }

    @Override // d3.f
    public Object apply(Object obj) {
        String str = (String) this.c;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        int i9 = ((z2.c) this.d).a;
        Cursor rawQuery = sQLiteDatabase.rawQuery("SELECT 1 FROM log_event_dropped WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(i9)});
        try {
            boolean z10 = rawQuery.getCount() > 0;
            rawQuery.close();
            long j10 = this.b;
            if (z10) {
                sQLiteDatabase.execSQL(aa.d.n(j10, "UPDATE log_event_dropped SET events_dropped_count = events_dropped_count + ", " WHERE log_source = ? AND reason = ?"), new String[]{str, Integer.toString(i9)});
                return null;
            }
            ContentValues contentValues = new ContentValues();
            contentValues.put("log_source", str);
            contentValues.put("reason", Integer.valueOf(i9));
            contentValues.put("events_dropped_count", Long.valueOf(j10));
            sQLiteDatabase.insert("log_event_dropped", null, contentValues);
            return null;
        } catch (Throwable th) {
            rawQuery.close();
            throw th;
        }
    }

    @Override // org.telegram.ui.Components.nk0
    public void c(float f10, float f11, int i9, View view) {
        ProfileActivity.a0((ProfileActivity) this.c, (Context) this.d, this.b, view, i9, f10, f11);
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        ResultCallback resultCallback = (ResultCallback) this.c;
        long j10 = this.b;
        File file = (File) this.d;
        ImageReceiver.BitmapHolder bitmapSafe = imageReceiver.getBitmapSafe();
        if (!z10 || bitmapSafe == null || bitmapSafe.bitmap.isRecycled()) {
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
            Utilities.globalQueue.postRunnable(new aa(file, bitmap));
        } else if (resultCallback != null) {
            resultCallback.onComplete(null);
        }
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public /* synthetic */ void didSetImageBitmap(int i9, String str, Drawable drawable) {
        g5.a(this, i9, str, drawable);
    }

    @Override // x9.a
    public void e(x9.b bVar) {
        ((b) bVar.get()).d((String) this.c, this.b, (b1) this.d);
    }

    @Override // org.telegram.ui.ActionBar.b2
    public void f(c2 c2Var, int i9) {
        switch (this.a) {
            case 4:
                n9 n9Var = (n9) this.c;
                ArrayList arrayList = (ArrayList) this.d;
                n9Var.d.put(Long.valueOf(this.b), arrayList);
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    n9Var.b.k(Boolean.TRUE, ((Long) obj).longValue());
                }
                n9Var.i(true);
                n9Var.e(true);
                n9Var.f(true);
                c2Var.dismiss();
                n9Var.x.G = true;
                break;
            case 7:
                cr.P((cr) this.c, (kh.d) this.d, this.b);
                break;
            default:
                o50 o50Var = (o50) this.c;
                o50Var.d.getMessagesController().addUserToChat(o50Var.i1(), (TLRPC.User) this.d, 0, null, (o2) o50Var.e0.O().getFragmentStack().get(o50Var.e0.O().getFragmentStack().size() - 1), new i2(o50Var, this.b, 26));
                break;
        }
    }

    @Override // org.telegram.ui.Components.nk0
    public /* synthetic */ boolean f1(View view) {
        return false;
    }

    @Override // org.telegram.ui.nf1
    public void h(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        ((r) this.c).g0(true, this.b, tL_inputCheckPasswordSRP, (TwoStepVerificationActivity) this.d);
    }

    @Override // e3.b
    public Object j() {
        h hVar = (h) this.c;
        i iVar = (i) this.d;
        d3.d dVar = (d3.d) hVar.c;
        long d = ((f3.a) hVar.g).d() + this.b;
        d3.h hVar2 = (d3.h) dVar;
        hVar2.getClass();
        hVar2.c(new d3.e(d, iVar));
        return null;
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public /* synthetic */ void onAnimationReady(ImageReceiver imageReceiver) {
        g5.b(this, imageReceiver);
    }

    @Override // org.telegram.messenger.ChatObject.Call.OnParticipantsLoad
    public void onLoad(ArrayList arrayList) {
        ((VoIPService) this.c).lambda$createGroupInstance$69(this.b, (int[]) this.d, arrayList);
    }

    @Override // org.telegram.messenger.MessagesController.IsInChatCheckedCallback
    public void run(boolean z10, TLRPC.TL_chatAdminRights tL_chatAdminRights, String str) {
        AndroidUtilities.runOnUIThread(new gh.i((dz0) this.c, this.b, tL_chatAdminRights, str, z10, (dy) this.d));
    }

    public /* synthetic */ a(Object obj, Object obj2, long j10, int i9) {
        this.a = i9;
        this.c = obj;
        this.d = obj2;
        this.b = j10;
    }

    @Override // org.telegram.ui.Components.nk0
    public /* synthetic */ void g0(View view, float f10, float f11) {
    }
}
