package kh;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.camera.CameraView;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.h81;
import org.telegram.ui.Components.hz;
import org.telegram.ui.Components.i81;
import org.telegram.ui.Components.iz;
import org.telegram.ui.Components.kd0;
import org.telegram.ui.Components.qe0;
import org.telegram.ui.Components.x51;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final /* synthetic */ class ea implements CameraView.CameraViewDelegate, r0.o, org.telegram.ui.ActionBar.b2, h81, Utilities.CallbackVoidReturn, x51, w8, y7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ wb b;

    public /* synthetic */ ea(wb wbVar, int i9) {
        this.a = i9;
        this.b = wbVar;
    }

    @Override // r0.o
    public r0.m1 L0(View view, r0.m1 m1Var) {
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(m1Var, false);
        int i9 = defaultWindowInsets.a;
        wb wbVar = this.b;
        wbVar.U = i9;
        wbVar.V = defaultWindowInsets.b;
        wbVar.W = defaultWindowInsets.c;
        wbVar.X = defaultWindowInsets.d;
        wbVar.n.requestLayout();
        return r0.m1.b;
    }

    @Override // org.telegram.ui.Components.h81
    public void b(float f10) {
        wb wbVar = this.b;
        za zaVar = wbVar.x0;
        if (zaVar != null) {
            wbVar.P1 = f10;
            zaVar.setZoom(f10);
        }
        wbVar.j0(true);
    }

    @Override // org.telegram.ui.Components.x51
    public void c(hz hzVar) {
        MediaController.SavedFilterState savedFilterState;
        wb wbVar = this.b;
        if (hzVar == null) {
            wbVar.getClass();
            return;
        }
        a8 a8Var = wbVar.G1;
        if (a8Var == null || (savedFilterState = a8Var.a1) == null) {
            return;
        }
        hzVar.f(new iz(savedFilterState));
    }

    @Override // kh.w8
    public void d(final r9 r9Var, final boolean z10, final boolean z11, boolean z12, final boolean z13, final TLRPC.InputPeer inputPeer, final int i9, o8 o8Var, final f1 f1Var) {
        switch (this.a) {
            case 10:
                ArrayList arrayList = r9Var.b;
                wb wbVar = this.b;
                if (wbVar.G1 != null) {
                    wbVar.T0.x(5, true);
                    wbVar.G1.E0 = r9Var;
                    int i10 = wbVar.c;
                    int i11 = u9.a;
                    SerializedData serializedData = new SerializedData(true);
                    u9.c(serializedData, r9Var);
                    SerializedData serializedData2 = new SerializedData(serializedData.length());
                    serializedData.cleanup();
                    u9.c(serializedData2, r9Var);
                    MessagesController.getInstance(i10).getMainSettings().edit().putString("story_privacy2", Utilities.bytesToHex(serializedData2.toByteArray())).apply();
                    serializedData2.cleanup();
                    a8 a8Var = wbVar.G1;
                    a8Var.G0 = z12;
                    a8Var.H0 = z11;
                    a8Var.F0.clear();
                    wbVar.G1.F0.addAll(arrayList);
                    a8 a8Var2 = wbVar.G1;
                    a8Var2.l = true;
                    a8Var2.v0 = inputPeer;
                    ArrayList arrayList2 = wbVar.D1;
                    if (arrayList2 != null) {
                        int size = arrayList2.size();
                        int i12 = 0;
                        while (i12 < size) {
                            Object obj = arrayList2.get(i12);
                            i12++;
                            a8 a8Var3 = (a8) obj;
                            a8Var3.E0 = r9Var;
                            ArrayList arrayList3 = a8Var3.F0;
                            a8Var3.G0 = z12;
                            a8Var3.H0 = z11;
                            arrayList3.clear();
                            arrayList3.addAll(arrayList);
                            a8Var3.l = true;
                            a8Var3.v0 = inputPeer;
                        }
                    }
                    wbVar.i(new ba(wbVar, o8Var, 0));
                    break;
                }
                break;
            default:
                int i13 = R.raw.permission_request_camera;
                int i14 = R.string.PermissionNoCameraMicVideo;
                String[] strArr = z13 ? new String[0] : new String[]{"android.permission.CAMERA", "android.permission.RECORD_AUDIO"};
                final wb wbVar2 = this.b;
                kd0.d(i13, i14, strArr, new Utilities.Callback() { // from class: kh.ca
                    @Override // org.telegram.messenger.Utilities.Callback
                    public final void run(Object obj2) {
                        final wb wbVar3 = wb.this;
                        int i15 = wbVar3.c;
                        boolean booleanValue = ((Boolean) obj2).booleanValue();
                        final f1 f1Var2 = f1Var;
                        if (!booleanValue) {
                            f1Var2.run();
                            return;
                        }
                        za zaVar = wbVar3.x0;
                        final boolean z14 = zaVar == null || zaVar.isFrontface();
                        final TL_stories.TL_startLive tL_startLive = new TL_stories.TL_startLive();
                        tL_startLive.noforwards = true ^ z11;
                        TLRPC.InputPeer inputPeer2 = inputPeer;
                        tL_startLive.peer = inputPeer2 == null ? new TLRPC.TL_inputPeerSelf() : inputPeer2;
                        final long clientUserId = (inputPeer2 == null || (inputPeer2 instanceof TLRPC.TL_inputPeerSelf)) ? UserConfig.getInstance(i15).getClientUserId() : DialogObject.getPeerDialogId(inputPeer2);
                        tL_startLive.privacy_rules.addAll(r9Var.b);
                        tL_startLive.random_id = Utilities.random.nextLong();
                        final boolean z15 = z13;
                        tL_startLive.rtmp_stream = z15;
                        tL_startLive.messages_enabled = Boolean.valueOf(z10);
                        tL_startLive.send_paid_messages_stars = Long.valueOf(i9);
                        ConnectionsManager.getInstance(i15).sendRequest(tL_startLive, new RequestDelegate() { // from class: kh.da
                            @Override // org.telegram.tgnet.RequestDelegate
                            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                AndroidUtilities.runOnUIThread(new gh.l6(wb.this, tLObject, tL_startLive, z15, clientUserId, z14, tL_error, f1Var2));
                            }
                        });
                    }
                });
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.b2
    public void f(org.telegram.ui.ActionBar.c2 c2Var, int i9) {
        switch (this.a) {
            case 2:
                wb wbVar = this.b;
                wbVar.getClass();
                try {
                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                    wbVar.b.startActivity(intent);
                    break;
                } catch (Exception e10) {
                    FileLog.e(e10);
                    return;
                }
            case 3:
                wb wbVar2 = this.b;
                wbVar2.getClass();
                try {
                    Intent intent2 = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent2.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                    wbVar2.b.startActivity(intent2);
                    break;
                } catch (Exception e11) {
                    FileLog.e(e11);
                    return;
                }
            case 4:
            case 6:
            case 7:
            default:
                wb wbVar3 = this.b;
                wbVar3.getClass();
                try {
                    Intent intent3 = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent3.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                    wbVar3.b.startActivity(intent3);
                    break;
                } catch (Exception e12) {
                    FileLog.e(e12);
                }
            case 5:
                wb wbVar4 = this.b;
                wbVar4.getClass();
                try {
                    Intent intent4 = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent4.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                    wbVar4.b.startActivity(intent4);
                    break;
                } catch (Exception e13) {
                    FileLog.e(e13);
                    return;
                }
            case 8:
                wb wbVar5 = this.b;
                int i10 = wbVar5.c;
                a8 a8Var = wbVar5.G1;
                if (a8Var != null) {
                    a8Var.D0 = MessagesController.getInstance(i10).storyEntitiesAllowed();
                    wbVar5.R1 = !wbVar5.G1.c;
                    wbVar5.i(null);
                    wbVar5.l();
                    wbVar5.m();
                    wbVar5.y();
                    a8 a8Var2 = wbVar5.G1;
                    a8Var2.i(true);
                    a8Var2.C0 = wbVar5.Y0.getText();
                    wbVar5.G1 = null;
                    wbVar5.W(a8Var2, true);
                    b1 b1Var = MessagesController.getInstance(i10).getStoriesController().w;
                    if (a8Var2.c) {
                        b1Var.d(a8Var2);
                    } else {
                        ArrayList arrayList = b1Var.b;
                        if (!a8Var2.u) {
                            b1Var.e(a8Var2);
                            a8Var2.b = Utilities.random.nextLong();
                            a1 a1Var = new a1(a8Var2);
                            arrayList.remove(a8Var2);
                            arrayList.add(0, a8Var2);
                            b1Var.a(a1Var);
                        }
                    }
                    wbVar5.K(0, true);
                    break;
                }
                break;
            case 9:
                wb wbVar6 = this.b;
                a8 a8Var3 = wbVar6.G1;
                if (a8Var3 != null && !a8Var3.g && ((!a8Var3.n || a8Var3.u) && a8Var3.c)) {
                    MessagesController.getInstance(wbVar6.c).getStoriesController().w.c(wbVar6.G1);
                    wbVar6.G1 = null;
                }
                a8 a8Var4 = wbVar6.G1;
                if (a8Var4 != null && (a8Var4.o || a8Var4.g || (a8Var4.n && !a8Var4.u))) {
                    wbVar6.q(true);
                    break;
                } else {
                    wbVar6.K(0, true);
                    break;
                }
                break;
        }
    }

    @Override // kh.y7
    public Bitmap g(BitmapFactory.Options options) {
        return BitmapFactory.decodeFile(this.b.G1.L.getAbsolutePath(), options);
    }

    @Override // org.telegram.messenger.camera.CameraView.CameraViewDelegate
    public void onCameraInit() {
        wb wbVar = this.b;
        String C = wbVar.C();
        if (TextUtils.equals(C, wbVar.F())) {
            C = null;
        }
        wbVar.e0(wbVar.b0 == 0 ? C : null);
        i81 i81Var = wbVar.R0;
        if (i81Var != null) {
            wbVar.P1 = 0.0f;
            i81Var.b(0.0f, false);
        }
        wbVar.m0(true);
    }

    @Override // org.telegram.messenger.Utilities.CallbackVoidReturn
    public Object run() {
        kb kbVar;
        wb wbVar = this.b;
        qe0 qe0Var = wbVar.x1;
        Bitmap uiBlurBitmap = qe0Var != null ? qe0Var.getUiBlurBitmap() : null;
        return (uiBlurBitmap != null || (kbVar = wbVar.T0) == null || kbVar.getTextureView() == null) ? uiBlurBitmap : wbVar.T0.getTextureView().getUiBlurBitmap();
    }
}
