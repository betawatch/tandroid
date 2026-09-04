package di;

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
import org.telegram.ui.Components.c91;
import org.telegram.ui.Components.d91;
import org.telegram.ui.Components.de0;
import org.telegram.ui.Components.jf0;
import org.telegram.ui.Components.t61;
import org.telegram.ui.Components.vz;
import org.telegram.ui.Components.wz;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes4.dex */
public final /* synthetic */ class ta implements CameraView.CameraViewDelegate, r0.n, org.telegram.ui.ActionBar.a2, c91, Utilities.CallbackVoidReturn, t61, j9, m8 {
    public final /* synthetic */ int a;
    public final /* synthetic */ pc b;

    public /* synthetic */ ta(pc pcVar, int i10) {
        this.a = i10;
        this.b = pcVar;
    }

    @Override // r0.n
    public r0.l1 T0(View view, r0.l1 l1Var) {
        i0.c defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(l1Var, false);
        int i10 = defaultWindowInsets.a;
        pc pcVar = this.b;
        pcVar.Y = i10;
        pcVar.Z = defaultWindowInsets.b;
        pcVar.a0 = defaultWindowInsets.c;
        pcVar.b0 = defaultWindowInsets.d;
        pcVar.n.requestLayout();
        return r0.l1.b;
    }

    @Override // org.telegram.ui.Components.c91
    public void b(float f7) {
        pc pcVar = this.b;
        sb sbVar = pcVar.B0;
        if (sbVar != null) {
            pcVar.T1 = f7;
            sbVar.setZoom(f7);
        }
        pcVar.j0(true);
    }

    @Override // org.telegram.ui.Components.t61
    public void c(vz vzVar) {
        MediaController.SavedFilterState savedFilterState;
        pc pcVar = this.b;
        if (vzVar == null) {
            pcVar.getClass();
            return;
        }
        o8 o8Var = pcVar.K1;
        if (o8Var == null || (savedFilterState = o8Var.a1) == null) {
            return;
        }
        vzVar.f(new wz(savedFilterState));
    }

    @Override // di.m8
    public Bitmap d(BitmapFactory.Options options) {
        return BitmapFactory.decodeFile(this.b.K1.L.getAbsolutePath(), options);
    }

    @Override // di.j9
    public void e(final ga gaVar, final boolean z10, final boolean z11, boolean z12, final boolean z13, final TLRPC.InputPeer inputPeer, final int i10, b7 b7Var, final bi.oa oaVar) {
        switch (this.a) {
            case 10:
                ArrayList arrayList = gaVar.b;
                pc pcVar = this.b;
                if (pcVar.K1 != null) {
                    pcVar.X0.x(5, true);
                    pcVar.K1.E0 = gaVar;
                    int i11 = pcVar.c;
                    int i12 = ja.a;
                    SerializedData serializedData = new SerializedData(true);
                    ja.c(serializedData, gaVar);
                    SerializedData serializedData2 = new SerializedData(serializedData.length());
                    serializedData.cleanup();
                    ja.c(serializedData2, gaVar);
                    MessagesController.getInstance(i11).getMainSettings().edit().putString("story_privacy2", Utilities.bytesToHex(serializedData2.toByteArray())).apply();
                    serializedData2.cleanup();
                    o8 o8Var = pcVar.K1;
                    o8Var.G0 = z12;
                    o8Var.H0 = z11;
                    o8Var.F0.clear();
                    pcVar.K1.F0.addAll(arrayList);
                    o8 o8Var2 = pcVar.K1;
                    o8Var2.l = true;
                    o8Var2.v0 = inputPeer;
                    ArrayList arrayList2 = pcVar.H1;
                    if (arrayList2 != null) {
                        int size = arrayList2.size();
                        int i13 = 0;
                        while (i13 < size) {
                            Object obj = arrayList2.get(i13);
                            i13++;
                            o8 o8Var3 = (o8) obj;
                            o8Var3.E0 = gaVar;
                            ArrayList arrayList3 = o8Var3.F0;
                            o8Var3.G0 = z12;
                            o8Var3.H0 = z11;
                            arrayList3.clear();
                            arrayList3.addAll(arrayList);
                            o8Var3.l = true;
                            o8Var3.v0 = inputPeer;
                        }
                    }
                    pcVar.i(new qa(pcVar, b7Var, 0));
                    break;
                }
                break;
            default:
                int i14 = R.raw.permission_request_camera;
                int i15 = R.string.PermissionNoCameraMicVideo;
                String[] strArr = z13 ? new String[0] : new String[]{"android.permission.CAMERA", "android.permission.RECORD_AUDIO"};
                final pc pcVar2 = this.b;
                de0.d(i14, i15, strArr, new Utilities.Callback() { // from class: di.ra
                    @Override // org.telegram.messenger.Utilities.Callback
                    public final void run(Object obj2) {
                        final pc pcVar3 = pc.this;
                        int i16 = pcVar3.c;
                        boolean booleanValue = ((Boolean) obj2).booleanValue();
                        final bi.oa oaVar2 = oaVar;
                        if (!booleanValue) {
                            oaVar2.run();
                            return;
                        }
                        sb sbVar = pcVar3.B0;
                        final boolean z14 = sbVar == null || sbVar.isFrontface();
                        final TL_stories.TL_startLive tL_startLive = new TL_stories.TL_startLive();
                        tL_startLive.noforwards = true ^ z11;
                        TLRPC.InputPeer inputPeer2 = inputPeer;
                        tL_startLive.peer = inputPeer2 == null ? new TLRPC.TL_inputPeerSelf() : inputPeer2;
                        final long clientUserId = (inputPeer2 == null || (inputPeer2 instanceof TLRPC.TL_inputPeerSelf)) ? UserConfig.getInstance(i16).getClientUserId() : DialogObject.getPeerDialogId(inputPeer2);
                        tL_startLive.privacy_rules.addAll(gaVar.b);
                        tL_startLive.random_id = Utilities.random.nextLong();
                        final boolean z15 = z13;
                        tL_startLive.rtmp_stream = z15;
                        tL_startLive.messages_enabled = Boolean.valueOf(z10);
                        tL_startLive.send_paid_messages_stars = Long.valueOf(i10);
                        ConnectionsManager.getInstance(i16).sendRequest(tL_startLive, new RequestDelegate() { // from class: di.sa
                            @Override // org.telegram.tgnet.RequestDelegate
                            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                AndroidUtilities.runOnUIThread(new xa(pc.this, tLObject, tL_startLive, z15, clientUserId, z14, tL_error, oaVar2));
                            }
                        });
                    }
                });
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.a) {
            case 2:
                pc pcVar = this.b;
                pcVar.getClass();
                try {
                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                    pcVar.b.startActivity(intent);
                    break;
                } catch (Exception e7) {
                    FileLog.e(e7);
                    return;
                }
            case 3:
                pc pcVar2 = this.b;
                pcVar2.getClass();
                try {
                    Intent intent2 = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent2.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                    pcVar2.b.startActivity(intent2);
                    break;
                } catch (Exception e10) {
                    FileLog.e(e10);
                    return;
                }
            case 4:
            case 6:
            case 7:
            default:
                pc pcVar3 = this.b;
                pcVar3.getClass();
                try {
                    Intent intent3 = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent3.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                    pcVar3.b.startActivity(intent3);
                    break;
                } catch (Exception e11) {
                    FileLog.e(e11);
                }
            case 5:
                pc pcVar4 = this.b;
                pcVar4.getClass();
                try {
                    Intent intent4 = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent4.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                    pcVar4.b.startActivity(intent4);
                    break;
                } catch (Exception e12) {
                    FileLog.e(e12);
                    return;
                }
            case 8:
                pc pcVar5 = this.b;
                int i11 = pcVar5.c;
                o8 o8Var = pcVar5.K1;
                if (o8Var != null) {
                    o8Var.D0 = MessagesController.getInstance(i11).storyEntitiesAllowed();
                    pcVar5.V1 = !pcVar5.K1.c;
                    pcVar5.i(null);
                    pcVar5.l();
                    pcVar5.m();
                    pcVar5.y();
                    o8 o8Var2 = pcVar5.K1;
                    o8Var2.i(true);
                    o8Var2.C0 = pcVar5.c1.getText();
                    pcVar5.K1 = null;
                    pcVar5.W(o8Var2, true);
                    b1 b1Var = MessagesController.getInstance(i11).getStoriesController().w;
                    if (o8Var2.c) {
                        b1Var.d(o8Var2);
                    } else {
                        ArrayList arrayList = b1Var.b;
                        if (!o8Var2.u) {
                            b1Var.e(o8Var2);
                            o8Var2.b = Utilities.random.nextLong();
                            a1 a1Var = new a1(o8Var2);
                            arrayList.remove(o8Var2);
                            arrayList.add(0, o8Var2);
                            b1Var.a(a1Var);
                        }
                    }
                    pcVar5.K(0, true);
                    break;
                }
                break;
            case 9:
                pc pcVar6 = this.b;
                o8 o8Var3 = pcVar6.K1;
                if (o8Var3 != null && !o8Var3.g && ((!o8Var3.n || o8Var3.u) && o8Var3.c)) {
                    MessagesController.getInstance(pcVar6.c).getStoriesController().w.b(pcVar6.K1);
                    pcVar6.K1 = null;
                }
                o8 o8Var4 = pcVar6.K1;
                if (o8Var4 != null && (o8Var4.o || o8Var4.g || (o8Var4.n && !o8Var4.u))) {
                    pcVar6.q(true);
                    break;
                } else {
                    pcVar6.K(0, true);
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.messenger.camera.CameraView.CameraViewDelegate
    public void onCameraInit() {
        pc pcVar = this.b;
        String C = pcVar.C();
        if (TextUtils.equals(C, pcVar.F())) {
            C = null;
        }
        pcVar.e0(pcVar.f0 == 0 ? C : null);
        d91 d91Var = pcVar.V0;
        if (d91Var != null) {
            pcVar.T1 = 0.0f;
            d91Var.b(0.0f, false);
        }
        pcVar.m0(true);
    }

    @Override // org.telegram.messenger.Utilities.CallbackVoidReturn
    public Object run() {
        dc dcVar;
        pc pcVar = this.b;
        jf0 jf0Var = pcVar.B1;
        Bitmap uiBlurBitmap = jf0Var != null ? jf0Var.getUiBlurBitmap() : null;
        return (uiBlurBitmap != null || (dcVar = pcVar.X0) == null || dcVar.getTextureView() == null) ? uiBlurBitmap : pcVar.X0.getTextureView().getUiBlurBitmap();
    }
}
