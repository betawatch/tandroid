package ci;

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
import org.telegram.ui.Components.aa1;
import org.telegram.ui.Components.ba1;
import org.telegram.ui.Components.pe0;
import org.telegram.ui.Components.s71;
import org.telegram.ui.Components.vf0;
import org.telegram.ui.Components.yz;
import org.telegram.ui.Components.zz;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes4.dex */
public final /* synthetic */ class pa implements CameraView.CameraViewDelegate, r0.n, org.telegram.ui.ActionBar.a2, aa1, Utilities.CallbackVoidReturn, s71, g9, i8 {
    public final /* synthetic */ int a;
    public final /* synthetic */ kc b;

    public /* synthetic */ pa(kc kcVar, int i10) {
        this.a = i10;
        this.b = kcVar;
    }

    @Override // r0.n
    public r0.l1 Q0(View view, r0.l1 l1Var) {
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(l1Var, false);
        int i10 = defaultWindowInsets.a;
        kc kcVar = this.b;
        kcVar.Y = i10;
        kcVar.Z = defaultWindowInsets.b;
        kcVar.a0 = defaultWindowInsets.c;
        kcVar.b0 = defaultWindowInsets.d;
        kcVar.n.requestLayout();
        return r0.l1.b;
    }

    @Override // org.telegram.ui.Components.aa1
    public void a(float f7) {
        kc kcVar = this.b;
        nb nbVar = kcVar.B0;
        if (nbVar != null) {
            kcVar.T1 = f7;
            nbVar.setZoom(f7);
        }
        kcVar.j0(true);
    }

    @Override // org.telegram.ui.Components.s71
    public void c(yz yzVar) {
        MediaController.SavedFilterState savedFilterState;
        kc kcVar = this.b;
        if (yzVar == null) {
            kcVar.getClass();
            return;
        }
        k8 k8Var = kcVar.K1;
        if (k8Var == null || (savedFilterState = k8Var.a1) == null) {
            return;
        }
        yzVar.f(new zz(savedFilterState));
    }

    @Override // ci.i8
    public Bitmap f(BitmapFactory.Options options) {
        return BitmapFactory.decodeFile(this.b.K1.L.getAbsolutePath(), options);
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.a) {
            case 2:
                kc kcVar = this.b;
                kcVar.getClass();
                try {
                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                    kcVar.b.startActivity(intent);
                    break;
                } catch (Exception e7) {
                    FileLog.e(e7);
                    return;
                }
            case 3:
                kc kcVar2 = this.b;
                kcVar2.getClass();
                try {
                    Intent intent2 = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent2.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                    kcVar2.b.startActivity(intent2);
                    break;
                } catch (Exception e10) {
                    FileLog.e(e10);
                    return;
                }
            case 4:
            case 6:
            case 7:
            default:
                kc kcVar3 = this.b;
                kcVar3.getClass();
                try {
                    Intent intent3 = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent3.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                    kcVar3.b.startActivity(intent3);
                    break;
                } catch (Exception e11) {
                    FileLog.e(e11);
                }
            case 5:
                kc kcVar4 = this.b;
                kcVar4.getClass();
                try {
                    Intent intent4 = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent4.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                    kcVar4.b.startActivity(intent4);
                    break;
                } catch (Exception e12) {
                    FileLog.e(e12);
                    return;
                }
            case 8:
                kc kcVar5 = this.b;
                int i11 = kcVar5.c;
                k8 k8Var = kcVar5.K1;
                if (k8Var != null) {
                    k8Var.D0 = MessagesController.getInstance(i11).storyEntitiesAllowed();
                    kcVar5.V1 = !kcVar5.K1.c;
                    kcVar5.i(null);
                    kcVar5.l();
                    kcVar5.m();
                    kcVar5.y();
                    k8 k8Var2 = kcVar5.K1;
                    k8Var2.i(true);
                    k8Var2.C0 = kcVar5.c1.getText();
                    kcVar5.K1 = null;
                    kcVar5.W(k8Var2, true);
                    b1 b1Var = MessagesController.getInstance(i11).getStoriesController().w;
                    if (k8Var2.c) {
                        b1Var.d(k8Var2);
                    } else {
                        ArrayList arrayList = b1Var.b;
                        if (!k8Var2.u) {
                            b1Var.e(k8Var2);
                            k8Var2.b = Utilities.random.nextLong();
                            a1 a1Var = new a1(k8Var2);
                            arrayList.remove(k8Var2);
                            arrayList.add(0, k8Var2);
                            b1Var.a(a1Var);
                        }
                    }
                    kcVar5.K(0, true);
                    break;
                }
                break;
            case 9:
                kc kcVar6 = this.b;
                k8 k8Var3 = kcVar6.K1;
                if (k8Var3 != null && !k8Var3.g && ((!k8Var3.n || k8Var3.u) && k8Var3.c)) {
                    MessagesController.getInstance(kcVar6.c).getStoriesController().w.b(kcVar6.K1);
                    kcVar6.K1 = null;
                }
                k8 k8Var4 = kcVar6.K1;
                if (k8Var4 != null && (k8Var4.o || k8Var4.g || (k8Var4.n && !k8Var4.u))) {
                    kcVar6.q(true);
                    break;
                } else {
                    kcVar6.K(0, true);
                    break;
                }
                break;
        }
    }

    @Override // ci.g9
    public void i(final ca caVar, final boolean z10, final boolean z11, boolean z12, final boolean z13, final TLRPC.InputPeer inputPeer, final int i10, x8 x8Var, final androidx.fragment.app.a0 a0Var) {
        switch (this.a) {
            case 10:
                ArrayList arrayList = caVar.b;
                kc kcVar = this.b;
                if (kcVar.K1 != null) {
                    kcVar.X0.x(5, true);
                    kcVar.K1.E0 = caVar;
                    int i11 = kcVar.c;
                    int i12 = fa.a;
                    SerializedData serializedData = new SerializedData(true);
                    fa.c(serializedData, caVar);
                    SerializedData serializedData2 = new SerializedData(serializedData.length());
                    serializedData.cleanup();
                    fa.c(serializedData2, caVar);
                    MessagesController.getInstance(i11).getMainSettings().edit().putString("story_privacy2", Utilities.bytesToHex(serializedData2.toByteArray())).apply();
                    serializedData2.cleanup();
                    k8 k8Var = kcVar.K1;
                    k8Var.G0 = z12;
                    k8Var.H0 = z11;
                    k8Var.F0.clear();
                    kcVar.K1.F0.addAll(arrayList);
                    k8 k8Var2 = kcVar.K1;
                    k8Var2.l = true;
                    k8Var2.v0 = inputPeer;
                    ArrayList arrayList2 = kcVar.H1;
                    if (arrayList2 != null) {
                        int size = arrayList2.size();
                        int i13 = 0;
                        while (i13 < size) {
                            Object obj = arrayList2.get(i13);
                            i13++;
                            k8 k8Var3 = (k8) obj;
                            k8Var3.E0 = caVar;
                            ArrayList arrayList3 = k8Var3.F0;
                            k8Var3.G0 = z12;
                            k8Var3.H0 = z11;
                            arrayList3.clear();
                            arrayList3.addAll(arrayList);
                            k8Var3.l = true;
                            k8Var3.v0 = inputPeer;
                        }
                    }
                    kcVar.i(new ma(kcVar, x8Var, 0));
                    break;
                }
                break;
            default:
                int i14 = R.raw.permission_request_camera;
                int i15 = R.string.PermissionNoCameraMicVideo;
                String[] strArr = z13 ? new String[0] : new String[]{"android.permission.CAMERA", "android.permission.RECORD_AUDIO"};
                final kc kcVar2 = this.b;
                pe0.d(i14, i15, strArr, new Utilities.Callback() { // from class: ci.na
                    @Override // org.telegram.messenger.Utilities.Callback
                    public final void run(Object obj2) {
                        final kc kcVar3 = kc.this;
                        int i16 = kcVar3.c;
                        boolean booleanValue = ((Boolean) obj2).booleanValue();
                        final androidx.fragment.app.a0 a0Var2 = a0Var;
                        if (!booleanValue) {
                            a0Var2.run();
                            return;
                        }
                        nb nbVar = kcVar3.B0;
                        final boolean z14 = nbVar == null || nbVar.isFrontface();
                        final TL_stories.TL_startLive tL_startLive = new TL_stories.TL_startLive();
                        tL_startLive.noforwards = true ^ z11;
                        TLRPC.InputPeer inputPeer2 = inputPeer;
                        tL_startLive.peer = inputPeer2 == null ? new TLRPC.TL_inputPeerSelf() : inputPeer2;
                        final long clientUserId = (inputPeer2 == null || (inputPeer2 instanceof TLRPC.TL_inputPeerSelf)) ? UserConfig.getInstance(i16).getClientUserId() : DialogObject.getPeerDialogId(inputPeer2);
                        tL_startLive.privacy_rules.addAll(caVar.b);
                        tL_startLive.random_id = Utilities.random.nextLong();
                        final boolean z15 = z13;
                        tL_startLive.rtmp_stream = z15;
                        tL_startLive.messages_enabled = Boolean.valueOf(z10);
                        tL_startLive.send_paid_messages_stars = Long.valueOf(i10);
                        ConnectionsManager.getInstance(i16).sendRequest(tL_startLive, new RequestDelegate() { // from class: ci.oa
                            @Override // org.telegram.tgnet.RequestDelegate
                            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                AndroidUtilities.runOnUIThread(new ta(kc.this, tLObject, tL_startLive, z15, clientUserId, z14, tL_error, a0Var2));
                            }
                        });
                    }
                });
                break;
        }
    }

    @Override // org.telegram.messenger.camera.CameraView.CameraViewDelegate
    public void onCameraInit() {
        kc kcVar = this.b;
        String C = kcVar.C();
        if (TextUtils.equals(C, kcVar.F())) {
            C = null;
        }
        kcVar.e0(kcVar.f0 == 0 ? C : null);
        ba1 ba1Var = kcVar.V0;
        if (ba1Var != null) {
            kcVar.T1 = 0.0f;
            ba1Var.b(0.0f, false);
        }
        kcVar.m0(true);
    }

    @Override // org.telegram.messenger.Utilities.CallbackVoidReturn
    public Object run() {
        yb ybVar;
        kc kcVar = this.b;
        vf0 vf0Var = kcVar.B1;
        Bitmap uiBlurBitmap = vf0Var != null ? vf0Var.getUiBlurBitmap() : null;
        return (uiBlurBitmap != null || (ybVar = kcVar.X0) == null || ybVar.getTextureView() == null) ? uiBlurBitmap : kcVar.X0.getTextureView().getUiBlurBitmap();
    }
}
