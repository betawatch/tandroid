package ai;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.FactCheckController;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.TranslateController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.cr0;
import org.telegram.ui.ly;
import org.telegram.ui.qx;
import org.telegram.ui.ry;
import org.telegram.ui.so;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes4.dex */
public final /* synthetic */ class l implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ l(Object obj, long j3, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = j3;
        this.d = obj2;
        this.e = obj3;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        int i10 = this.a;
        int i11 = 3;
        long j3 = this.b;
        Object obj2 = this.e;
        Object obj3 = this.d;
        Object obj4 = this.c;
        switch (i10) {
            case 0:
                b0 b0Var = (b0) obj4;
                a0 a0Var = (a0) obj2;
                ((org.telegram.ui.ActionBar.b2) obj3).dismiss();
                if (((Boolean) obj).booleanValue()) {
                    ci.lc E = ci.lc.E(b0Var.e0.getParentActivity(), b0Var.f);
                    E.N = j3;
                    ci.bc bcVar = E.c1;
                    if (bcVar != null) {
                        bcVar.setDialogId(j3);
                    }
                    E.M = false;
                    E.R(ci.gc.c(a0Var));
                    break;
                }
                break;
            case 1:
                l9 l9Var = (l9) obj4;
                Utilities.Callback callback = (Utilities.Callback) obj3;
                MessagesController messagesController = (MessagesController) obj2;
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                if (tL_premium_boostsStatus != null) {
                    ChannelBoostsController boostsController = messagesController.getBoostsController();
                    long j10 = this.b;
                    boostsController.userCanBoostChannel(j10, tL_premium_boostsStatus, new l(l9Var, callback, j10, tL_premium_boostsStatus, 2));
                    callback.run(Boolean.FALSE);
                    break;
                } else {
                    callback.run(Boolean.FALSE);
                    break;
                }
            case 2:
                l9 l9Var2 = (l9) obj4;
                Utilities.Callback callback2 = (Utilities.Callback) obj3;
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus2 = (TL_stories.TL_premium_boostsStatus) obj2;
                ChannelBoostsController.CanApplyBoost canApplyBoost = (ChannelBoostsController.CanApplyBoost) obj;
                if (canApplyBoost != null) {
                    org.telegram.ui.ActionBar.n2 R = LaunchActivity.R();
                    j jVar = l9Var2.j(j3) ? new j(l9Var2, j3, i11) : null;
                    int i12 = rg.j0.V0;
                    if (R != null && tL_premium_boostsStatus2 != null && R.getContext() != null) {
                        rg.j0 j0Var = new rg.j0(18, R.getCurrentAccount(), R.getContext(), R, R.getResourceProvider());
                        j0Var.G1(canApplyBoost);
                        j0Var.F1(tL_premium_boostsStatus2, true);
                        j0Var.H1(j3);
                        j0Var.Q0 = jVar;
                        j0Var.show();
                    }
                    callback2.run(Boolean.FALSE);
                    break;
                } else {
                    callback2.run(Boolean.FALSE);
                    break;
                }
            case 3:
                ((FactCheckController) obj4).lambda$loadMissing$3(this.b, (ArrayList) obj3, (HashMap) obj2, (ArrayList) obj);
                break;
            case 4:
                ((MessagesController) obj4).lambda$checkSensitive$448(this.b, (boolean[]) obj3, (Runnable) obj2, (Boolean) obj);
                break;
            case 5:
                ((TranslateController) obj4).lambda$checkTranslation$6((MessageObject) obj3, (String) obj2, this.b, (TLRPC.TL_textWithEntities) obj);
                break;
            case 6:
                so.Y((so) obj4, (org.telegram.ui.ActionBar.b2) obj3, (TL_stories.TL_premium_boostsStatus) obj2, this.b, (ChannelBoostsController.CanApplyBoost) obj);
                break;
            case 7:
                qx qxVar = (qx) obj4;
                org.telegram.ui.ActionBar.n2[] n2VarArr = (org.telegram.ui.ActionBar.n2[]) obj2;
                qxVar.getClass();
                ((org.telegram.ui.ActionBar.b2) obj3).dismiss();
                ry ryVar = qxVar.b;
                ryVar.getMessagesController().loadChannelParticipants(Long.valueOf(j3));
                ly lyVar = ryVar.C2;
                ryVar.removeSelfFromStack();
                if (n2VarArr[1] != null) {
                    n2VarArr[0].removeSelfFromStack();
                    n2VarArr[1].finishFragment();
                } else {
                    n2VarArr[0].finishFragment();
                }
                if (lyVar != null) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(MessagesStorage.TopicKey.of(-j3, 0L));
                    lyVar.u(ryVar, arrayList, null, false, ryVar.J2, ryVar.K2, ryVar.L2, null);
                    break;
                }
                break;
            case 8:
                PhotoViewer photoViewer = (PhotoViewer) obj4;
                String str = (String) obj3;
                MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) obj2;
                Bitmap bitmap = (Bitmap) obj;
                Drawable[] drawableArr = PhotoViewer.U8;
                if (bitmap == null) {
                    AndroidUtilities.runOnUIThread(new cr0(photoViewer, 16));
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
                        AndroidUtilities.runOnUIThread(new org.telegram.messenger.voip.f(photoViewer, photoEntry, this.b, str, createBitmap, 6));
                        break;
                    } catch (Exception e) {
                        FileLog.e(e);
                        AndroidUtilities.runOnUIThread(new cr0(photoViewer, 17));
                        return;
                    }
                }
            case 9:
                xh.c1 c1Var = (xh.c1) obj3;
                nf.e eVar = (nf.e) obj;
                eVar.d();
                c1Var.v1(j3, new e4((xh.r1) obj4, eVar, (Utilities.Callback) obj2, c1Var, 19));
                break;
            default:
                yh.y3.s0((yh.y3) obj4, (TL_stories.TL_premium_boostsStatus) obj3, this.b, (MessagesController) obj2, (ChannelBoostsController.CanApplyBoost) obj);
                break;
        }
    }

    public /* synthetic */ l(Object obj, Object obj2, long j3, Object obj3, int i10) {
        this.a = i10;
        this.c = obj;
        this.d = obj2;
        this.b = j3;
        this.e = obj3;
    }

    public /* synthetic */ l(Object obj, Object obj2, Object obj3, long j3, int i10) {
        this.a = i10;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.b = j3;
    }
}
