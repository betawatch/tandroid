package nh;

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
import org.telegram.ui.Components.ef0;
import org.telegram.ui.Components.k61;
import org.telegram.ui.Components.qz;
import org.telegram.ui.Components.rz;
import org.telegram.ui.Components.t81;
import org.telegram.ui.Components.u81;
import org.telegram.ui.Components.yd0;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final /* synthetic */ class p9 implements CameraView.CameraViewDelegate, r0.o, org.telegram.ui.ActionBar.b2, t81, Utilities.CallbackVoidReturn, k61, j8, m7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ gb b;

    public /* synthetic */ p9(gb gbVar, int i10) {
        this.a = i10;
        this.b = gbVar;
    }

    @Override // r0.o
    public r0.m1 I0(View view, r0.m1 m1Var) {
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(m1Var, false);
        int i10 = defaultWindowInsets.a;
        gb gbVar = this.b;
        gbVar.U = i10;
        gbVar.V = defaultWindowInsets.b;
        gbVar.W = defaultWindowInsets.c;
        gbVar.X = defaultWindowInsets.d;
        gbVar.n.requestLayout();
        return r0.m1.b;
    }

    @Override // org.telegram.ui.Components.t81
    public void a(float f9) {
        gb gbVar = this.b;
        ka kaVar = gbVar.x0;
        if (kaVar != null) {
            gbVar.P1 = f9;
            kaVar.setZoom(f9);
        }
        gbVar.j0(true);
    }

    @Override // org.telegram.ui.Components.k61
    public void b(qz qzVar) {
        MediaController.SavedFilterState savedFilterState;
        gb gbVar = this.b;
        if (qzVar == null) {
            gbVar.getClass();
            return;
        }
        o7 o7Var = gbVar.G1;
        if (o7Var == null || (savedFilterState = o7Var.a1) == null) {
            return;
        }
        qzVar.f(new rz(savedFilterState));
    }

    @Override // nh.j8
    public void e(final c9 c9Var, final boolean z10, final boolean z11, boolean z12, final boolean z13, final TLRPC.InputPeer inputPeer, final int i10, b6 b6Var, final m6 m6Var) {
        switch (this.a) {
            case 10:
                ArrayList arrayList = c9Var.b;
                gb gbVar = this.b;
                if (gbVar.G1 != null) {
                    gbVar.T0.x(5, true);
                    gbVar.G1.E0 = c9Var;
                    int i11 = gbVar.c;
                    int i12 = f9.a;
                    SerializedData serializedData = new SerializedData(true);
                    f9.c(serializedData, c9Var);
                    SerializedData serializedData2 = new SerializedData(serializedData.length());
                    serializedData.cleanup();
                    f9.c(serializedData2, c9Var);
                    MessagesController.getInstance(i11).getMainSettings().edit().putString("story_privacy2", Utilities.bytesToHex(serializedData2.toByteArray())).apply();
                    serializedData2.cleanup();
                    o7 o7Var = gbVar.G1;
                    o7Var.G0 = z12;
                    o7Var.H0 = z11;
                    o7Var.F0.clear();
                    gbVar.G1.F0.addAll(arrayList);
                    o7 o7Var2 = gbVar.G1;
                    o7Var2.l = true;
                    o7Var2.v0 = inputPeer;
                    ArrayList arrayList2 = gbVar.D1;
                    if (arrayList2 != null) {
                        int size = arrayList2.size();
                        int i13 = 0;
                        while (i13 < size) {
                            Object obj = arrayList2.get(i13);
                            i13++;
                            o7 o7Var3 = (o7) obj;
                            o7Var3.E0 = c9Var;
                            ArrayList arrayList3 = o7Var3.F0;
                            o7Var3.G0 = z12;
                            o7Var3.H0 = z11;
                            arrayList3.clear();
                            arrayList3.addAll(arrayList);
                            o7Var3.l = true;
                            o7Var3.v0 = inputPeer;
                        }
                    }
                    gbVar.i(new m9(gbVar, b6Var, 0));
                    break;
                }
                break;
            default:
                int i14 = R.raw.permission_request_camera;
                int i15 = R.string.PermissionNoCameraMicVideo;
                String[] strArr = z13 ? new String[0] : new String[]{"android.permission.CAMERA", "android.permission.RECORD_AUDIO"};
                final gb gbVar2 = this.b;
                yd0.d(i14, i15, strArr, new Utilities.Callback() { // from class: nh.n9
                    @Override // org.telegram.messenger.Utilities.Callback
                    public final void run(Object obj2) {
                        final gb gbVar3 = gb.this;
                        int i16 = gbVar3.c;
                        boolean booleanValue = ((Boolean) obj2).booleanValue();
                        final m6 m6Var2 = m6Var;
                        if (!booleanValue) {
                            m6Var2.run();
                            return;
                        }
                        ka kaVar = gbVar3.x0;
                        final boolean z14 = kaVar == null || kaVar.isFrontface();
                        final TL_stories.TL_startLive tL_startLive = new TL_stories.TL_startLive();
                        tL_startLive.noforwards = true ^ z11;
                        TLRPC.InputPeer inputPeer2 = inputPeer;
                        tL_startLive.peer = inputPeer2 == null ? new TLRPC.TL_inputPeerSelf() : inputPeer2;
                        final long clientUserId = (inputPeer2 == null || (inputPeer2 instanceof TLRPC.TL_inputPeerSelf)) ? UserConfig.getInstance(i16).getClientUserId() : DialogObject.getPeerDialogId(inputPeer2);
                        tL_startLive.privacy_rules.addAll(c9Var.b);
                        tL_startLive.random_id = Utilities.random.nextLong();
                        final boolean z15 = z13;
                        tL_startLive.rtmp_stream = z15;
                        tL_startLive.messages_enabled = Boolean.valueOf(z10);
                        tL_startLive.send_paid_messages_stars = Long.valueOf(i10);
                        ConnectionsManager.getInstance(i16).sendRequest(tL_startLive, new RequestDelegate() { // from class: nh.o9
                            @Override // org.telegram.tgnet.RequestDelegate
                            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                AndroidUtilities.runOnUIThread(new jh.i6(gb.this, tLObject, tL_startLive, z15, clientUserId, z14, tL_error, m6Var2));
                            }
                        });
                    }
                });
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.b2
    public void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        switch (this.a) {
            case 2:
                gb gbVar = this.b;
                gbVar.getClass();
                try {
                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                    gbVar.b.startActivity(intent);
                    break;
                } catch (Exception e10) {
                    FileLog.e(e10);
                    return;
                }
            case 3:
                gb gbVar2 = this.b;
                gbVar2.getClass();
                try {
                    Intent intent2 = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent2.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                    gbVar2.b.startActivity(intent2);
                    break;
                } catch (Exception e11) {
                    FileLog.e(e11);
                    return;
                }
            case 4:
            case 6:
            case 7:
            default:
                gb gbVar3 = this.b;
                gbVar3.getClass();
                try {
                    Intent intent3 = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent3.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                    gbVar3.b.startActivity(intent3);
                    break;
                } catch (Exception e12) {
                    FileLog.e(e12);
                }
            case 5:
                gb gbVar4 = this.b;
                gbVar4.getClass();
                try {
                    Intent intent4 = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent4.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                    gbVar4.b.startActivity(intent4);
                    break;
                } catch (Exception e13) {
                    FileLog.e(e13);
                    return;
                }
            case 8:
                gb gbVar5 = this.b;
                int i11 = gbVar5.c;
                o7 o7Var = gbVar5.G1;
                if (o7Var != null) {
                    o7Var.D0 = MessagesController.getInstance(i11).storyEntitiesAllowed();
                    gbVar5.R1 = !gbVar5.G1.c;
                    gbVar5.i(null);
                    gbVar5.l();
                    gbVar5.m();
                    gbVar5.y();
                    o7 o7Var2 = gbVar5.G1;
                    o7Var2.i(true);
                    o7Var2.C0 = gbVar5.Y0.getText();
                    gbVar5.G1 = null;
                    gbVar5.W(o7Var2, true);
                    a1 a1Var = MessagesController.getInstance(i11).getStoriesController().w;
                    if (o7Var2.c) {
                        a1Var.d(o7Var2);
                    } else {
                        ArrayList arrayList = a1Var.b;
                        if (!o7Var2.u) {
                            a1Var.e(o7Var2);
                            o7Var2.b = Utilities.random.nextLong();
                            z0 z0Var = new z0(o7Var2);
                            arrayList.remove(o7Var2);
                            arrayList.add(0, o7Var2);
                            a1Var.a(z0Var);
                        }
                    }
                    gbVar5.K(0, true);
                    break;
                }
                break;
            case 9:
                gb gbVar6 = this.b;
                o7 o7Var3 = gbVar6.G1;
                if (o7Var3 != null && !o7Var3.g && ((!o7Var3.n || o7Var3.u) && o7Var3.c)) {
                    MessagesController.getInstance(gbVar6.c).getStoriesController().w.c(gbVar6.G1);
                    gbVar6.G1 = null;
                }
                o7 o7Var4 = gbVar6.G1;
                if (o7Var4 != null && (o7Var4.o || o7Var4.g || (o7Var4.n && !o7Var4.u))) {
                    gbVar6.q(true);
                    break;
                } else {
                    gbVar6.K(0, true);
                    break;
                }
                break;
        }
    }

    @Override // nh.m7
    public Bitmap h(BitmapFactory.Options options) {
        return BitmapFactory.decodeFile(this.b.G1.L.getAbsolutePath(), options);
    }

    @Override // org.telegram.messenger.camera.CameraView.CameraViewDelegate
    public void onCameraInit() {
        gb gbVar = this.b;
        String C = gbVar.C();
        if (TextUtils.equals(C, gbVar.F())) {
            C = null;
        }
        gbVar.e0(gbVar.b0 == 0 ? C : null);
        u81 u81Var = gbVar.R0;
        if (u81Var != null) {
            gbVar.P1 = 0.0f;
            u81Var.b(0.0f, false);
        }
        gbVar.m0(true);
    }

    @Override // org.telegram.messenger.Utilities.CallbackVoidReturn
    public Object run() {
        va vaVar;
        gb gbVar = this.b;
        ef0 ef0Var = gbVar.x1;
        Bitmap uiBlurBitmap = ef0Var != null ? ef0Var.getUiBlurBitmap() : null;
        return (uiBlurBitmap != null || (vaVar = gbVar.T0) == null || vaVar.getTextureView() == null) ? uiBlurBitmap : gbVar.T0.getTextureView().getUiBlurBitmap();
    }
}
