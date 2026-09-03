package kh;

import android.app.Dialog;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FactCheckController;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.TranslateController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ky;
import org.telegram.ui.qx;
import org.telegram.ui.qy;
import org.telegram.ui.tq0;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final /* synthetic */ class y0 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ y0(Object obj, long j10, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = j10;
        this.d = obj2;
        this.e = obj3;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        int i10 = this.a;
        long j10 = this.b;
        Object obj2 = this.e;
        Object obj3 = this.d;
        Object obj4 = this.c;
        switch (i10) {
            case 0:
                r1 r1Var = (r1) obj3;
                ze.c cVar = (ze.c) obj;
                cVar.d();
                r1Var.v1(j10, new gg.c1((g2) obj4, cVar, (Utilities.Callback) obj2, r1Var));
                break;
            case 1:
                ((FactCheckController) obj4).lambda$loadMissing$3(this.b, (ArrayList) obj3, (HashMap) obj2, (ArrayList) obj);
                break;
            case 2:
                ((MessagesController) obj4).lambda$checkSensitive$448(this.b, (boolean[]) obj3, (Runnable) obj2, (Boolean) obj);
                break;
            case 3:
                ((TranslateController) obj4).lambda$checkTranslation$6((MessageObject) obj3, (String) obj2, this.b, (TLRPC.TL_textWithEntities) obj);
                break;
            case 4:
                qx qxVar = (qx) obj4;
                org.telegram.ui.ActionBar.p2[] p2VarArr = (org.telegram.ui.ActionBar.p2[]) obj2;
                qxVar.getClass();
                ((org.telegram.ui.ActionBar.d2) obj3).dismiss();
                qy qyVar = qxVar.b;
                qyVar.getMessagesController().loadChannelParticipants(Long.valueOf(j10));
                ky kyVar = qyVar.z2;
                qyVar.removeSelfFromStack();
                if (p2VarArr[1] != null) {
                    p2VarArr[0].removeSelfFromStack();
                    p2VarArr[1].finishFragment();
                } else {
                    p2VarArr[0].finishFragment();
                }
                if (kyVar != null) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(MessagesStorage.TopicKey.of(-j10, 0L));
                    kyVar.w(qyVar, arrayList, null, false, qyVar.G2, qyVar.H2, qyVar.I2, null);
                    break;
                }
                break;
            default:
                PhotoViewer photoViewer = (PhotoViewer) obj4;
                String str = (String) obj3;
                MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) obj2;
                Bitmap bitmap = (Bitmap) obj;
                Drawable[] drawableArr = PhotoViewer.Q8;
                if (bitmap == null) {
                    AndroidUtilities.runOnUIThread(new tq0(photoViewer, 16));
                    break;
                } else {
                    try {
                        FileOutputStream fileOutputStream = new FileOutputStream(new File(str));
                        bitmap.compress(Bitmap.CompressFormat.JPEG, 90, fileOutputStream);
                        fileOutputStream.close();
                        Bitmap createBitmap = Bitmap.createBitmap(AndroidUtilities.dp(26.0f), AndroidUtilities.dp(26.0f), Bitmap.Config.ARGB_8888);
                        Canvas canvas = new Canvas(createBitmap);
                        Paint paint = new Paint(3);
                        canvas.translate(createBitmap.getWidth() / 2.0f, createBitmap.getHeight() / 2.0f);
                        float max = Math.max(createBitmap.getWidth() / bitmap.getWidth(), createBitmap.getHeight() / bitmap.getHeight());
                        canvas.scale(max, max);
                        canvas.drawBitmap(bitmap, (-bitmap.getWidth()) / 2.0f, (-bitmap.getHeight()) / 2.0f, paint);
                        AndroidUtilities.runOnUIThread(new g1(photoViewer, photoEntry, this.b, str, createBitmap, 14));
                        break;
                    } catch (Exception e) {
                        FileLog.e(e);
                        AndroidUtilities.runOnUIThread(new tq0(photoViewer, 17));
                    }
                }
        }
    }

    public /* synthetic */ y0(Object obj, Dialog dialog, long j10, Object obj2, int i10) {
        this.a = i10;
        this.c = obj;
        this.d = dialog;
        this.b = j10;
        this.e = obj2;
    }

    public /* synthetic */ y0(Object obj, Object obj2, Object obj3, long j10, int i10) {
        this.a = i10;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.b = j10;
    }
}
