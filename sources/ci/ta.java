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
import org.telegram.ui.Components.d91;
import org.telegram.ui.Components.de0;
import org.telegram.ui.Components.e91;
import org.telegram.ui.Components.jf0;
import org.telegram.ui.Components.t61;
import org.telegram.ui.Components.vz;
import org.telegram.ui.Components.wz;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes4.dex */
public final /* synthetic */ class ta implements CameraView.CameraViewDelegate, r0.n, org.telegram.ui.ActionBar.a2, d91, Utilities.CallbackVoidReturn, t61, k9, m8 {
    public final /* synthetic */ int a;
    public final /* synthetic */ oc b;

    public /* synthetic */ ta(oc ocVar, int i10) {
        this.a = i10;
        this.b = ocVar;
    }

    @Override // r0.n
    public r0.l1 Q0(View view, r0.l1 l1Var) {
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(l1Var, false);
        int i10 = defaultWindowInsets.a;
        oc ocVar = this.b;
        ocVar.Y = i10;
        ocVar.Z = defaultWindowInsets.b;
        ocVar.a0 = defaultWindowInsets.c;
        ocVar.b0 = defaultWindowInsets.d;
        ocVar.n.requestLayout();
        return r0.l1.b;
    }

    @Override // org.telegram.ui.Components.d91
    public void a(float f7) {
        oc ocVar = this.b;
        rb rbVar = ocVar.B0;
        if (rbVar != null) {
            ocVar.T1 = f7;
            rbVar.setZoom(f7);
        }
        ocVar.j0(true);
    }

    @Override // org.telegram.ui.Components.t61
    public void b(vz vzVar) {
        MediaController.SavedFilterState savedFilterState;
        oc ocVar = this.b;
        if (vzVar == null) {
            ocVar.getClass();
            return;
        }
        o8 o8Var = ocVar.K1;
        if (o8Var == null || (savedFilterState = o8Var.a1) == null) {
            return;
        }
        vzVar.f(new wz(savedFilterState));
    }

    @Override // ci.m8
    public Bitmap c(BitmapFactory.Options options) {
        return BitmapFactory.decodeFile(this.b.K1.L.getAbsolutePath(), options);
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.a) {
            case 2:
                oc ocVar = this.b;
                ocVar.getClass();
                try {
                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                    ocVar.b.startActivity(intent);
                    break;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            case 3:
                oc ocVar2 = this.b;
                ocVar2.getClass();
                try {
                    Intent intent2 = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent2.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                    ocVar2.b.startActivity(intent2);
                    break;
                } catch (Exception e7) {
                    FileLog.e(e7);
                    return;
                }
            case 4:
            case 6:
            case 7:
            default:
                oc ocVar3 = this.b;
                ocVar3.getClass();
                try {
                    Intent intent3 = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent3.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                    ocVar3.b.startActivity(intent3);
                    break;
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
            case 5:
                oc ocVar4 = this.b;
                ocVar4.getClass();
                try {
                    Intent intent4 = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent4.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                    ocVar4.b.startActivity(intent4);
                    break;
                } catch (Exception e11) {
                    FileLog.e(e11);
                    return;
                }
            case 8:
                oc ocVar5 = this.b;
                int i11 = ocVar5.c;
                o8 o8Var = ocVar5.K1;
                if (o8Var != null) {
                    o8Var.D0 = MessagesController.getInstance(i11).storyEntitiesAllowed();
                    ocVar5.V1 = !ocVar5.K1.c;
                    ocVar5.i(null);
                    ocVar5.l();
                    ocVar5.m();
                    ocVar5.y();
                    o8 o8Var2 = ocVar5.K1;
                    o8Var2.i(true);
                    o8Var2.C0 = ocVar5.c1.getText();
                    ocVar5.K1 = null;
                    ocVar5.W(o8Var2, true);
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
                    ocVar5.K(0, true);
                    break;
                }
                break;
            case 9:
                oc ocVar6 = this.b;
                o8 o8Var3 = ocVar6.K1;
                if (o8Var3 != null && !o8Var3.g && ((!o8Var3.n || o8Var3.u) && o8Var3.c)) {
                    MessagesController.getInstance(ocVar6.c).getStoriesController().w.b(ocVar6.K1);
                    ocVar6.K1 = null;
                }
                o8 o8Var4 = ocVar6.K1;
                if (o8Var4 != null && (o8Var4.o || o8Var4.g || (o8Var4.n && !o8Var4.u))) {
                    ocVar6.q(true);
                    break;
                } else {
                    ocVar6.K(0, true);
                    break;
                }
                break;
        }
    }

    @Override // ci.k9
    public void k(final ga gaVar, final boolean z10, final boolean z11, boolean z12, final boolean z13, final TLRPC.InputPeer inputPeer, final int i10, b9 b9Var, final androidx.fragment.app.a0 a0Var) {
        switch (this.a) {
            case 10:
                ArrayList arrayList = gaVar.b;
                oc ocVar = this.b;
                if (ocVar.K1 != null) {
                    ocVar.X0.x(5, true);
                    ocVar.K1.E0 = gaVar;
                    int i11 = ocVar.c;
                    int i12 = ja.a;
                    SerializedData serializedData = new SerializedData(true);
                    ja.c(serializedData, gaVar);
                    SerializedData serializedData2 = new SerializedData(serializedData.length());
                    serializedData.cleanup();
                    ja.c(serializedData2, gaVar);
                    MessagesController.getInstance(i11).getMainSettings().edit().putString("story_privacy2", Utilities.bytesToHex(serializedData2.toByteArray())).apply();
                    serializedData2.cleanup();
                    o8 o8Var = ocVar.K1;
                    o8Var.G0 = z12;
                    o8Var.H0 = z11;
                    o8Var.F0.clear();
                    ocVar.K1.F0.addAll(arrayList);
                    o8 o8Var2 = ocVar.K1;
                    o8Var2.l = true;
                    o8Var2.v0 = inputPeer;
                    ArrayList arrayList2 = ocVar.H1;
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
                    ocVar.i(new qa(ocVar, b9Var, 0));
                    break;
                }
                break;
            default:
                int i14 = R.raw.permission_request_camera;
                int i15 = R.string.PermissionNoCameraMicVideo;
                String[] strArr = z13 ? new String[0] : new String[]{"android.permission.CAMERA", "android.permission.RECORD_AUDIO"};
                final oc ocVar2 = this.b;
                de0.d(i14, i15, strArr, new Utilities.Callback() { // from class: ci.ra
                    @Override // org.telegram.messenger.Utilities.Callback
                    public final void run(Object obj2) {
                        final oc ocVar3 = oc.this;
                        int i16 = ocVar3.c;
                        boolean booleanValue = ((Boolean) obj2).booleanValue();
                        final androidx.fragment.app.a0 a0Var2 = a0Var;
                        if (!booleanValue) {
                            a0Var2.run();
                            return;
                        }
                        rb rbVar = ocVar3.B0;
                        final boolean z14 = rbVar == null || rbVar.isFrontface();
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
                        ConnectionsManager.getInstance(i16).sendRequest(tL_startLive, new RequestDelegate() { // from class: ci.sa
                            @Override // org.telegram.tgnet.RequestDelegate
                            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                AndroidUtilities.runOnUIThread(new xa(oc.this, tLObject, tL_startLive, z15, clientUserId, z14, tL_error, a0Var2));
                            }
                        });
                    }
                });
                break;
        }
    }

    @Override // org.telegram.messenger.camera.CameraView.CameraViewDelegate
    public void onCameraInit() {
        oc ocVar = this.b;
        String C = ocVar.C();
        if (TextUtils.equals(C, ocVar.F())) {
            C = null;
        }
        ocVar.e0(ocVar.f0 == 0 ? C : null);
        e91 e91Var = ocVar.V0;
        if (e91Var != null) {
            ocVar.T1 = 0.0f;
            e91Var.b(0.0f, false);
        }
        ocVar.m0(true);
    }

    @Override // org.telegram.messenger.Utilities.CallbackVoidReturn
    public Object run() {
        cc ccVar;
        oc ocVar = this.b;
        jf0 jf0Var = ocVar.B1;
        Bitmap uiBlurBitmap = jf0Var != null ? jf0Var.getUiBlurBitmap() : null;
        return (uiBlurBitmap != null || (ccVar = ocVar.X0) == null || ccVar.getTextureView() == null) ? uiBlurBitmap : ocVar.X0.getTextureView().getUiBlurBitmap();
    }
}
