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
import org.telegram.ui.Components.h71;
import org.telegram.ui.Components.ne0;
import org.telegram.ui.Components.p91;
import org.telegram.ui.Components.q91;
import org.telegram.ui.Components.tf0;
import org.telegram.ui.Components.wz;
import org.telegram.ui.Components.xz;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes4.dex */
public final /* synthetic */ class qa implements CameraView.CameraViewDelegate, r0.n, org.telegram.ui.ActionBar.z1, p91, Utilities.CallbackVoidReturn, h71, h9, j8 {
    public final /* synthetic */ int a;
    public final /* synthetic */ lc b;

    public /* synthetic */ qa(lc lcVar, int i10) {
        this.a = i10;
        this.b = lcVar;
    }

    @Override // r0.n
    public r0.l1 Q0(View view, r0.l1 l1Var) {
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(l1Var, false);
        int i10 = defaultWindowInsets.a;
        lc lcVar = this.b;
        lcVar.Y = i10;
        lcVar.Z = defaultWindowInsets.b;
        lcVar.a0 = defaultWindowInsets.c;
        lcVar.b0 = defaultWindowInsets.d;
        lcVar.n.requestLayout();
        return r0.l1.b;
    }

    @Override // org.telegram.ui.Components.p91
    public void a(float f7) {
        lc lcVar = this.b;
        ob obVar = lcVar.B0;
        if (obVar != null) {
            lcVar.T1 = f7;
            obVar.setZoom(f7);
        }
        lcVar.j0(true);
    }

    @Override // org.telegram.ui.Components.h71
    public void c(wz wzVar) {
        MediaController.SavedFilterState savedFilterState;
        lc lcVar = this.b;
        if (wzVar == null) {
            lcVar.getClass();
            return;
        }
        l8 l8Var = lcVar.K1;
        if (l8Var == null || (savedFilterState = l8Var.a1) == null) {
            return;
        }
        wzVar.f(new xz(savedFilterState));
    }

    @Override // org.telegram.ui.ActionBar.z1
    public void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.a) {
            case 2:
                lc lcVar = this.b;
                lcVar.getClass();
                try {
                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                    lcVar.b.startActivity(intent);
                    break;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            case 3:
                lc lcVar2 = this.b;
                lcVar2.getClass();
                try {
                    Intent intent2 = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent2.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                    lcVar2.b.startActivity(intent2);
                    break;
                } catch (Exception e7) {
                    FileLog.e(e7);
                    return;
                }
            case 4:
            case 6:
            case 7:
            default:
                lc lcVar3 = this.b;
                lcVar3.getClass();
                try {
                    Intent intent3 = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent3.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                    lcVar3.b.startActivity(intent3);
                    break;
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
            case 5:
                lc lcVar4 = this.b;
                lcVar4.getClass();
                try {
                    Intent intent4 = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent4.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                    lcVar4.b.startActivity(intent4);
                    break;
                } catch (Exception e11) {
                    FileLog.e(e11);
                    return;
                }
            case 8:
                lc lcVar5 = this.b;
                int i11 = lcVar5.c;
                l8 l8Var = lcVar5.K1;
                if (l8Var != null) {
                    l8Var.D0 = MessagesController.getInstance(i11).storyEntitiesAllowed();
                    lcVar5.V1 = !lcVar5.K1.c;
                    lcVar5.i(null);
                    lcVar5.l();
                    lcVar5.m();
                    lcVar5.y();
                    l8 l8Var2 = lcVar5.K1;
                    l8Var2.i(true);
                    l8Var2.C0 = lcVar5.c1.getText();
                    lcVar5.K1 = null;
                    lcVar5.W(l8Var2, true);
                    b1 b1Var = MessagesController.getInstance(i11).getStoriesController().w;
                    if (l8Var2.c) {
                        b1Var.d(l8Var2);
                    } else {
                        ArrayList arrayList = b1Var.b;
                        if (!l8Var2.u) {
                            b1Var.e(l8Var2);
                            l8Var2.b = Utilities.random.nextLong();
                            a1 a1Var = new a1(l8Var2);
                            arrayList.remove(l8Var2);
                            arrayList.add(0, l8Var2);
                            b1Var.a(a1Var);
                        }
                    }
                    lcVar5.K(0, true);
                    break;
                }
                break;
            case 9:
                lc lcVar6 = this.b;
                l8 l8Var3 = lcVar6.K1;
                if (l8Var3 != null && !l8Var3.g && ((!l8Var3.n || l8Var3.u) && l8Var3.c)) {
                    MessagesController.getInstance(lcVar6.c).getStoriesController().w.b(lcVar6.K1);
                    lcVar6.K1 = null;
                }
                l8 l8Var4 = lcVar6.K1;
                if (l8Var4 != null && (l8Var4.o || l8Var4.g || (l8Var4.n && !l8Var4.u))) {
                    lcVar6.q(true);
                    break;
                } else {
                    lcVar6.K(0, true);
                    break;
                }
                break;
        }
    }

    @Override // ci.j8
    public Bitmap g(BitmapFactory.Options options) {
        return BitmapFactory.decodeFile(this.b.K1.L.getAbsolutePath(), options);
    }

    @Override // ci.h9
    public void k(final da daVar, final boolean z10, final boolean z11, boolean z12, final boolean z13, final TLRPC.InputPeer inputPeer, final int i10, y8 y8Var, final androidx.fragment.app.a0 a0Var) {
        switch (this.a) {
            case 10:
                ArrayList arrayList = daVar.b;
                lc lcVar = this.b;
                if (lcVar.K1 != null) {
                    lcVar.X0.x(5, true);
                    lcVar.K1.E0 = daVar;
                    int i11 = lcVar.c;
                    int i12 = ga.a;
                    SerializedData serializedData = new SerializedData(true);
                    ga.c(serializedData, daVar);
                    SerializedData serializedData2 = new SerializedData(serializedData.length());
                    serializedData.cleanup();
                    ga.c(serializedData2, daVar);
                    MessagesController.getInstance(i11).getMainSettings().edit().putString("story_privacy2", Utilities.bytesToHex(serializedData2.toByteArray())).apply();
                    serializedData2.cleanup();
                    l8 l8Var = lcVar.K1;
                    l8Var.G0 = z12;
                    l8Var.H0 = z11;
                    l8Var.F0.clear();
                    lcVar.K1.F0.addAll(arrayList);
                    l8 l8Var2 = lcVar.K1;
                    l8Var2.l = true;
                    l8Var2.v0 = inputPeer;
                    ArrayList arrayList2 = lcVar.H1;
                    if (arrayList2 != null) {
                        int size = arrayList2.size();
                        int i13 = 0;
                        while (i13 < size) {
                            Object obj = arrayList2.get(i13);
                            i13++;
                            l8 l8Var3 = (l8) obj;
                            l8Var3.E0 = daVar;
                            ArrayList arrayList3 = l8Var3.F0;
                            l8Var3.G0 = z12;
                            l8Var3.H0 = z11;
                            arrayList3.clear();
                            arrayList3.addAll(arrayList);
                            l8Var3.l = true;
                            l8Var3.v0 = inputPeer;
                        }
                    }
                    lcVar.i(new na(lcVar, y8Var, 0));
                    break;
                }
                break;
            default:
                int i14 = R.raw.permission_request_camera;
                int i15 = R.string.PermissionNoCameraMicVideo;
                String[] strArr = z13 ? new String[0] : new String[]{"android.permission.CAMERA", "android.permission.RECORD_AUDIO"};
                final lc lcVar2 = this.b;
                ne0.d(i14, i15, strArr, new Utilities.Callback() { // from class: ci.oa
                    @Override // org.telegram.messenger.Utilities.Callback
                    public final void run(Object obj2) {
                        final lc lcVar3 = lc.this;
                        int i16 = lcVar3.c;
                        boolean booleanValue = ((Boolean) obj2).booleanValue();
                        final androidx.fragment.app.a0 a0Var2 = a0Var;
                        if (!booleanValue) {
                            a0Var2.run();
                            return;
                        }
                        ob obVar = lcVar3.B0;
                        final boolean z14 = obVar == null || obVar.isFrontface();
                        final TL_stories.TL_startLive tL_startLive = new TL_stories.TL_startLive();
                        tL_startLive.noforwards = true ^ z11;
                        TLRPC.InputPeer inputPeer2 = inputPeer;
                        tL_startLive.peer = inputPeer2 == null ? new TLRPC.TL_inputPeerSelf() : inputPeer2;
                        final long clientUserId = (inputPeer2 == null || (inputPeer2 instanceof TLRPC.TL_inputPeerSelf)) ? UserConfig.getInstance(i16).getClientUserId() : DialogObject.getPeerDialogId(inputPeer2);
                        tL_startLive.privacy_rules.addAll(daVar.b);
                        tL_startLive.random_id = Utilities.random.nextLong();
                        final boolean z15 = z13;
                        tL_startLive.rtmp_stream = z15;
                        tL_startLive.messages_enabled = Boolean.valueOf(z10);
                        tL_startLive.send_paid_messages_stars = Long.valueOf(i10);
                        ConnectionsManager.getInstance(i16).sendRequest(tL_startLive, new RequestDelegate() { // from class: ci.pa
                            @Override // org.telegram.tgnet.RequestDelegate
                            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                AndroidUtilities.runOnUIThread(new ua(lc.this, tLObject, tL_startLive, z15, clientUserId, z14, tL_error, a0Var2));
                            }
                        });
                    }
                });
                break;
        }
    }

    @Override // org.telegram.messenger.camera.CameraView.CameraViewDelegate
    public void onCameraInit() {
        lc lcVar = this.b;
        String C = lcVar.C();
        if (TextUtils.equals(C, lcVar.F())) {
            C = null;
        }
        lcVar.e0(lcVar.f0 == 0 ? C : null);
        q91 q91Var = lcVar.V0;
        if (q91Var != null) {
            lcVar.T1 = 0.0f;
            q91Var.b(0.0f, false);
        }
        lcVar.m0(true);
    }

    @Override // org.telegram.messenger.Utilities.CallbackVoidReturn
    public Object run() {
        zb zbVar;
        lc lcVar = this.b;
        tf0 tf0Var = lcVar.B1;
        Bitmap uiBlurBitmap = tf0Var != null ? tf0Var.getUiBlurBitmap() : null;
        return (uiBlurBitmap != null || (zbVar = lcVar.X0) == null || zbVar.getTextureView() == null) ? uiBlurBitmap : lcVar.X0.getTextureView().getUiBlurBitmap();
    }
}
