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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.kl0;
import org.telegram.ui.Components.mr;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.h01;
import org.telegram.ui.i60;
import org.telegram.ui.uy;
import org.telegram.ui.vg1;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes4.dex */
public final /* synthetic */ class t9 implements org.telegram.ui.ActionBar.a2, ChatObject.Call.OnParticipantsLoad, ImageReceiver.ImageReceiverDelegate, kl0, MessagesController.IsInChatCheckedCallback, t5.b, s5.f, pa.a, vg1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ t9(Object obj, long j3, Object obj2, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = j3;
        this.d = obj2;
    }

    @Override // s5.f
    public Object apply(Object obj) {
        String str = (String) this.c;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        int i10 = ((o5.c) this.d).a;
        Cursor rawQuery = sQLiteDatabase.rawQuery("SELECT 1 FROM log_event_dropped WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(i10)});
        try {
            boolean z10 = rawQuery.getCount() > 0;
            rawQuery.close();
            long j3 = this.b;
            if (z10) {
                sQLiteDatabase.execSQL(org.telegram.ui.Cells.c1.j(j3, "UPDATE log_event_dropped SET events_dropped_count = events_dropped_count + ", " WHERE log_source = ? AND reason = ?"), new String[]{str, Integer.toString(i10)});
                return null;
            }
            ContentValues contentValues = new ContentValues();
            contentValues.put("log_source", str);
            contentValues.put("reason", Integer.valueOf(i10));
            contentValues.put("events_dropped_count", Long.valueOf(j3));
            sQLiteDatabase.insert("log_event_dropped", null, contentValues);
            return null;
        } catch (Throwable th2) {
            rawQuery.close();
            throw th2;
        }
    }

    @Override // org.telegram.ui.Components.kl0
    public void c(float f7, float f10, int i10, View view) {
        ProfileActivity.b0((ProfileActivity) this.c, (Context) this.d, this.b, view, i10, f7, f10);
    }

    @Override // org.telegram.ui.Components.kl0
    public /* synthetic */ boolean c1(View view) {
        return false;
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        ResultCallback resultCallback = (ResultCallback) this.c;
        long j3 = this.b;
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
                resultCallback.onComplete(new Pair(Long.valueOf(j3), bitmap));
            }
            Utilities.globalQueue.postRunnable(new pa(file, bitmap));
        } else if (resultCallback != null) {
            resultCallback.onComplete(null);
        }
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public /* synthetic */ void didSetImageBitmap(int i10, String str, Drawable drawable) {
        org.telegram.messenger.h5.a(this, i10, str, drawable);
    }

    @Override // org.telegram.ui.vg1
    public void e(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        ((yh.g) this.c).h0(true, this.b, tL_inputCheckPasswordSRP, (TwoStepVerificationActivity) this.d);
    }

    @Override // pa.a
    public void f(pa.b bVar) {
        ((t9.a) bVar.get()).d((String) this.c, this.b, (y9.b1) this.d);
    }

    @Override // t5.b
    public Object i() {
        da.b bVar = (da.b) this.c;
        l5.i iVar = (l5.i) this.d;
        s5.d dVar = (s5.d) bVar.c;
        long q6 = ((u5.a) bVar.g).q() + this.b;
        s5.h hVar = (s5.h) dVar;
        hVar.getClass();
        hVar.c(new ai.z1(q6, iVar));
        return null;
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void k(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.a) {
            case 0:
                ba baVar = (ba) this.c;
                ArrayList arrayList = (ArrayList) this.d;
                baVar.d.put(Long.valueOf(this.b), arrayList);
                int size = arrayList.size();
                int i11 = 0;
                while (i11 < size) {
                    Object obj = arrayList.get(i11);
                    i11++;
                    baVar.b.k(Boolean.TRUE, ((Long) obj).longValue());
                }
                baVar.i(true);
                baVar.e(true);
                baVar.f(true);
                b2Var.dismiss();
                baVar.x.K = true;
                break;
            case 3:
                mr.Q((mr) this.c, (d) this.d, this.b);
                break;
            default:
                i60 i60Var = (i60) this.c;
                i60Var.d.getMessagesController().addUserToChat(i60Var.i1(), (TLRPC.User) this.d, 0, null, (org.telegram.ui.ActionBar.n2) i60Var.i0.O().getFragmentStack().get(i60Var.i0.O().getFragmentStack().size() - 1), new ai.j(i60Var, this.b, 24));
                break;
        }
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public /* synthetic */ void onAnimationReady(ImageReceiver imageReceiver) {
        org.telegram.messenger.h5.b(this, imageReceiver);
    }

    @Override // org.telegram.messenger.ChatObject.Call.OnParticipantsLoad
    public void onLoad(ArrayList arrayList) {
        ((VoIPService) this.c).lambda$createGroupInstance$69(this.b, (int[]) this.d, arrayList);
    }

    @Override // org.telegram.messenger.MessagesController.IsInChatCheckedCallback
    public void run(boolean z10, TLRPC.TL_chatAdminRights tL_chatAdminRights, String str) {
        AndroidUtilities.runOnUIThread(new ai.h3((h01) this.c, this.b, tL_chatAdminRights, str, z10, (uy) this.d));
    }

    public /* synthetic */ t9(Object obj, Object obj2, long j3, int i10) {
        this.a = i10;
        this.c = obj;
        this.d = obj2;
        this.b = j3;
    }

    @Override // org.telegram.ui.Components.kl0
    public /* synthetic */ void q0(View view, float f7, float f10) {
    }
}
