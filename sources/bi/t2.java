package bi;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ax;
import org.telegram.ui.ey;
import org.telegram.ui.oo;
import org.telegram.ui.xx;
import org.telegram.ui.zq0;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final /* synthetic */ class t2 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ t2(di.h7 h7Var, Utilities.Callback callback, long j10, TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus) {
        this.a = 3;
        this.c = h7Var;
        this.e = callback;
        this.b = j10;
        this.d = tL_premium_boostsStatus;
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
                h7.x0((h7) obj4, (TL_stories.TL_premium_boostsStatus) obj3, this.b, (MessagesController) obj2, (ChannelBoostsController.CanApplyBoost) obj);
                break;
            case 1:
                di.r rVar = (di.r) obj4;
                di.q qVar = (di.q) obj2;
                ((org.telegram.ui.ActionBar.e2) obj3).dismiss();
                if (((Boolean) obj).booleanValue()) {
                    fi.sb D = fi.sb.D(rVar.e0.getParentActivity(), rVar.f);
                    D.N = j10;
                    fi.ib ibVar = D.c1;
                    if (ibVar != null) {
                        ibVar.setDialogId(j10);
                    }
                    D.M = false;
                    D.Q(fi.nb.c(qVar));
                    break;
                }
                break;
            case 2:
                di.h7 h7Var = (di.h7) obj4;
                Utilities.Callback callback = (Utilities.Callback) obj3;
                MessagesController messagesController = (MessagesController) obj2;
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                if (tL_premium_boostsStatus != null) {
                    ChannelBoostsController boostsController = messagesController.getBoostsController();
                    long j11 = this.b;
                    boostsController.userCanBoostChannel(j11, tL_premium_boostsStatus, new t2(h7Var, callback, j11, tL_premium_boostsStatus));
                    callback.run(Boolean.FALSE);
                    break;
                } else {
                    callback.run(Boolean.FALSE);
                    break;
                }
            case 3:
                di.h7 h7Var2 = (di.h7) obj4;
                Utilities.Callback callback2 = (Utilities.Callback) obj2;
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus2 = (TL_stories.TL_premium_boostsStatus) obj3;
                ChannelBoostsController.CanApplyBoost canApplyBoost = (ChannelBoostsController.CanApplyBoost) obj;
                if (canApplyBoost != null) {
                    org.telegram.ui.ActionBar.r2 R = LaunchActivity.R();
                    r3 r3Var = h7Var2.j(j10) ? new r3(h7Var2, j10, 5) : null;
                    int i11 = tg.j0.W0;
                    if (R != null && tL_premium_boostsStatus2 != null && R.getContext() != null) {
                        tg.j0 j0Var = new tg.j0(18, R.getCurrentAccount(), R.getContext(), R, R.getResourceProvider());
                        j0Var.K1(canApplyBoost);
                        j0Var.J1(tL_premium_boostsStatus2, true);
                        j0Var.L1(j10);
                        j0Var.Q0 = r3Var;
                        j0Var.show();
                    }
                    callback2.run(Boolean.FALSE);
                    break;
                } else {
                    callback2.run(Boolean.FALSE);
                    break;
                }
            case 4:
                oo.Z((oo) obj4, (org.telegram.ui.ActionBar.e2) obj2, (TL_stories.TL_premium_boostsStatus) obj3, this.b, (ChannelBoostsController.CanApplyBoost) obj);
                break;
            case 5:
                ax axVar = (ax) obj4;
                org.telegram.ui.ActionBar.r2[] r2VarArr = (org.telegram.ui.ActionBar.r2[]) obj2;
                axVar.getClass();
                ((org.telegram.ui.ActionBar.e2) obj3).dismiss();
                ey eyVar = axVar.b;
                eyVar.getMessagesController().loadChannelParticipants(Long.valueOf(j10));
                xx xxVar = eyVar.C2;
                eyVar.removeSelfFromStack();
                if (r2VarArr[1] != null) {
                    r2VarArr[0].removeSelfFromStack();
                    r2VarArr[1].finishFragment();
                } else {
                    r2VarArr[0].finishFragment();
                }
                if (xxVar != null) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(MessagesStorage.TopicKey.of(-j10, 0L));
                    xxVar.v(eyVar, arrayList, null, false, eyVar.J2, eyVar.K2, eyVar.L2, null);
                    break;
                }
                break;
            case 6:
                PhotoViewer photoViewer = (PhotoViewer) obj4;
                String str = (String) obj3;
                MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) obj2;
                Bitmap bitmap = (Bitmap) obj;
                Drawable[] drawableArr = PhotoViewer.U8;
                if (bitmap == null) {
                    AndroidUtilities.runOnUIThread(new zq0(photoViewer, 16));
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
                        AndroidUtilities.runOnUIThread(new a0(photoViewer, photoEntry, this.b, str, createBitmap, 15));
                        break;
                    } catch (Exception e) {
                        FileLog.e(e);
                        AndroidUtilities.runOnUIThread(new zq0(photoViewer, 17));
                        return;
                    }
                }
            default:
                zh.a1 a1Var = (zh.a1) obj3;
                qf.c cVar = (qf.c) obj;
                cVar.d();
                a1Var.P1(j10, new di.y2((zh.p1) obj4, cVar, (Utilities.Callback) obj2, a1Var, 19));
                break;
        }
    }

    public /* synthetic */ t2(Object obj, Object obj2, long j10, Object obj3, int i10) {
        this.a = i10;
        this.c = obj;
        this.d = obj2;
        this.b = j10;
        this.e = obj3;
    }

    public /* synthetic */ t2(Object obj, Object obj2, Object obj3, long j10, int i10) {
        this.a = i10;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.b = j10;
    }

    public /* synthetic */ t2(oo ooVar, org.telegram.ui.ActionBar.e2 e2Var, TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus, long j10) {
        this.a = 4;
        this.c = ooVar;
        this.e = e2Var;
        this.d = tL_premium_boostsStatus;
        this.b = j10;
    }
}
