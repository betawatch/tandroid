package fi;

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
import org.telegram.ui.Components.e00;
import org.telegram.ui.Components.ec1;
import org.telegram.ui.Components.eg0;
import org.telegram.ui.Components.f00;
import org.telegram.ui.Components.fc1;
import org.telegram.ui.Components.g81;
import org.telegram.ui.Components.xe0;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final /* synthetic */ class y9 implements CameraView.CameraViewDelegate, r0.n, org.telegram.ui.ActionBar.b2, ec1, Utilities.CallbackVoidReturn, g81, r8, u7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ sb b;

    public /* synthetic */ y9(sb sbVar, int i10) {
        this.a = i10;
        this.b = sbVar;
    }

    @Override // r0.n
    public r0.k1 P0(View view, r0.k1 k1Var) {
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(k1Var, false);
        int i10 = defaultWindowInsets.a;
        sb sbVar = this.b;
        sbVar.Y = i10;
        sbVar.Z = defaultWindowInsets.b;
        sbVar.a0 = defaultWindowInsets.c;
        sbVar.b0 = defaultWindowInsets.d;
        sbVar.n.requestLayout();
        return r0.k1.b;
    }

    @Override // org.telegram.ui.Components.ec1
    public void a(float f7) {
        sb sbVar = this.b;
        va vaVar = sbVar.B0;
        if (vaVar != null) {
            sbVar.T1 = f7;
            vaVar.setZoom(f7);
        }
        sbVar.i0(true);
    }

    @Override // fi.r8
    public void b(final l9 l9Var, final boolean z10, final boolean z11, boolean z12, final boolean z13, final TLRPC.InputPeer inputPeer, final int i10, e2.q0 q0Var, final di.s8 s8Var) {
        switch (this.a) {
            case 10:
                ArrayList arrayList = l9Var.b;
                sb sbVar = this.b;
                if (sbVar.K1 != null) {
                    sbVar.X0.x(5, true);
                    sbVar.K1.E0 = l9Var;
                    int i11 = sbVar.c;
                    int i12 = o9.a;
                    SerializedData serializedData = new SerializedData(true);
                    o9.c(serializedData, l9Var);
                    SerializedData serializedData2 = new SerializedData(serializedData.length());
                    serializedData.cleanup();
                    o9.c(serializedData2, l9Var);
                    MessagesController.getInstance(i11).getMainSettings().edit().putString("story_privacy2", Utilities.bytesToHex(serializedData2.toByteArray())).apply();
                    serializedData2.cleanup();
                    w7 w7Var = sbVar.K1;
                    w7Var.G0 = z12;
                    w7Var.H0 = z11;
                    w7Var.F0.clear();
                    sbVar.K1.F0.addAll(arrayList);
                    w7 w7Var2 = sbVar.K1;
                    w7Var2.l = true;
                    w7Var2.v0 = inputPeer;
                    ArrayList arrayList2 = sbVar.H1;
                    if (arrayList2 != null) {
                        int size = arrayList2.size();
                        int i13 = 0;
                        while (i13 < size) {
                            Object obj = arrayList2.get(i13);
                            i13++;
                            w7 w7Var3 = (w7) obj;
                            w7Var3.E0 = l9Var;
                            ArrayList arrayList3 = w7Var3.F0;
                            w7Var3.G0 = z12;
                            w7Var3.H0 = z11;
                            arrayList3.clear();
                            arrayList3.addAll(arrayList);
                            w7Var3.l = true;
                            w7Var3.v0 = inputPeer;
                        }
                    }
                    sbVar.h(new v9(sbVar, q0Var, 0));
                    break;
                }
                break;
            default:
                int i14 = R.raw.permission_request_camera;
                int i15 = R.string.PermissionNoCameraMicVideo;
                String[] strArr = z13 ? new String[0] : new String[]{"android.permission.CAMERA", "android.permission.RECORD_AUDIO"};
                final sb sbVar2 = this.b;
                xe0.b(i14, i15, strArr, new Utilities.Callback() { // from class: fi.w9
                    @Override // org.telegram.messenger.Utilities.Callback
                    public final void run(Object obj2) {
                        boolean z14;
                        final boolean z15;
                        final sb sbVar3 = sb.this;
                        int i16 = sbVar3.c;
                        boolean booleanValue = ((Boolean) obj2).booleanValue();
                        final di.s8 s8Var2 = s8Var;
                        if (!booleanValue) {
                            s8Var2.run();
                            return;
                        }
                        va vaVar = sbVar3.B0;
                        if (vaVar == null || vaVar.isFrontface()) {
                            z14 = true;
                            z15 = true;
                        } else {
                            z15 = false;
                            z14 = true;
                        }
                        final TL_stories.TL_startLive tL_startLive = new TL_stories.TL_startLive();
                        tL_startLive.noforwards = z14 ^ z11;
                        TLRPC.InputPeer inputPeer2 = inputPeer;
                        tL_startLive.peer = inputPeer2 == null ? new TLRPC.TL_inputPeerSelf() : inputPeer2;
                        final long clientUserId = (inputPeer2 == null || (inputPeer2 instanceof TLRPC.TL_inputPeerSelf)) ? UserConfig.getInstance(i16).getClientUserId() : DialogObject.getPeerDialogId(inputPeer2);
                        tL_startLive.privacy_rules.addAll(l9Var.b);
                        tL_startLive.random_id = Utilities.random.nextLong();
                        final boolean z16 = z13;
                        tL_startLive.rtmp_stream = z16;
                        tL_startLive.messages_enabled = Boolean.valueOf(z10);
                        tL_startLive.send_paid_messages_stars = Long.valueOf(i10);
                        ConnectionsManager.getInstance(i16).sendRequest(tL_startLive, new RequestDelegate() { // from class: fi.x9
                            @Override // org.telegram.tgnet.RequestDelegate
                            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                AndroidUtilities.runOnUIThread(new bi.o8(sb.this, tLObject, tL_startLive, z16, clientUserId, z15, tL_error, s8Var2));
                            }
                        });
                    }
                });
                break;
        }
    }

    @Override // org.telegram.ui.Components.g81
    public void d(e00 e00Var) {
        MediaController.SavedFilterState savedFilterState;
        sb sbVar = this.b;
        if (e00Var == null) {
            sbVar.getClass();
            return;
        }
        w7 w7Var = sbVar.K1;
        if (w7Var == null || (savedFilterState = w7Var.a1) == null) {
            return;
        }
        e00Var.f(new f00(savedFilterState));
    }

    @Override // fi.u7
    public Bitmap g(BitmapFactory.Options options) {
        return BitmapFactory.decodeFile(this.b.K1.L.getAbsolutePath(), options);
    }

    @Override // org.telegram.ui.ActionBar.b2
    public void h(org.telegram.ui.ActionBar.e2 e2Var, int i10) {
        switch (this.a) {
            case 2:
                sb sbVar = this.b;
                sbVar.getClass();
                try {
                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                    sbVar.b.startActivity(intent);
                    break;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            case 3:
                sb sbVar2 = this.b;
                sbVar2.getClass();
                try {
                    Intent intent2 = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent2.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                    sbVar2.b.startActivity(intent2);
                    break;
                } catch (Exception e10) {
                    FileLog.e(e10);
                    return;
                }
            case 4:
            case 6:
            case 7:
            default:
                sb sbVar3 = this.b;
                sbVar3.getClass();
                try {
                    Intent intent3 = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent3.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                    sbVar3.b.startActivity(intent3);
                    break;
                } catch (Exception e11) {
                    FileLog.e(e11);
                }
            case 5:
                sb sbVar4 = this.b;
                sbVar4.getClass();
                try {
                    Intent intent4 = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent4.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                    sbVar4.b.startActivity(intent4);
                    break;
                } catch (Exception e12) {
                    FileLog.e(e12);
                    return;
                }
            case 8:
                sb sbVar5 = this.b;
                int i11 = sbVar5.c;
                w7 w7Var = sbVar5.K1;
                if (w7Var != null) {
                    w7Var.D0 = MessagesController.getInstance(i11).storyEntitiesAllowed();
                    sbVar5.V1 = !sbVar5.K1.c;
                    sbVar5.h(null);
                    sbVar5.k();
                    sbVar5.l();
                    sbVar5.x();
                    w7 w7Var2 = sbVar5.K1;
                    w7Var2.i(true);
                    w7Var2.C0 = sbVar5.c1.getText();
                    sbVar5.K1 = null;
                    sbVar5.V(w7Var2, true);
                    a1 a1Var = MessagesController.getInstance(i11).getStoriesController().w;
                    if (w7Var2.c) {
                        a1Var.d(w7Var2);
                    } else {
                        ArrayList arrayList = a1Var.b;
                        if (!w7Var2.u) {
                            a1Var.e(w7Var2);
                            w7Var2.b = Utilities.random.nextLong();
                            z0 z0Var = new z0(w7Var2);
                            arrayList.remove(w7Var2);
                            arrayList.add(0, w7Var2);
                            a1Var.a(z0Var);
                        }
                    }
                    sbVar5.J(0, true);
                    break;
                }
                break;
            case 9:
                sb sbVar6 = this.b;
                w7 w7Var3 = sbVar6.K1;
                if (w7Var3 != null && !w7Var3.g && ((!w7Var3.n || w7Var3.u) && w7Var3.c)) {
                    MessagesController.getInstance(sbVar6.c).getStoriesController().w.b(sbVar6.K1);
                    sbVar6.K1 = null;
                }
                w7 w7Var4 = sbVar6.K1;
                if (w7Var4 != null && (w7Var4.o || w7Var4.g || (w7Var4.n && !w7Var4.u))) {
                    sbVar6.p(true);
                    break;
                } else {
                    sbVar6.J(0, true);
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.messenger.camera.CameraView.CameraViewDelegate
    public void onCameraInit() {
        sb sbVar = this.b;
        String B = sbVar.B();
        if (TextUtils.equals(B, sbVar.E())) {
            B = null;
        }
        sbVar.d0(sbVar.f0 == 0 ? B : null);
        fc1 fc1Var = sbVar.V0;
        if (fc1Var != null) {
            sbVar.T1 = 0.0f;
            fc1Var.b(0.0f, false);
        }
        sbVar.l0(true);
    }

    @Override // org.telegram.messenger.Utilities.CallbackVoidReturn
    public Object run() {
        gb gbVar;
        sb sbVar = this.b;
        eg0 eg0Var = sbVar.B1;
        Bitmap uiBlurBitmap = eg0Var != null ? eg0Var.getUiBlurBitmap() : null;
        return (uiBlurBitmap != null || (gbVar = sbVar.X0) == null || gbVar.getTextureView() == null) ? uiBlurBitmap : sbVar.X0.getTextureView().getUiBlurBitmap();
    }
}
