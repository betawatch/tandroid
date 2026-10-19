package ei;

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
import org.telegram.ui.Components.cg0;
import org.telegram.ui.Components.e00;
import org.telegram.ui.Components.f00;
import org.telegram.ui.Components.p71;
import org.telegram.ui.Components.w91;
import org.telegram.ui.Components.we0;
import org.telegram.ui.Components.x91;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes4.dex */
public final /* synthetic */ class ca implements CameraView.CameraViewDelegate, r0.n, org.telegram.ui.ActionBar.a2, w91, Utilities.CallbackVoidReturn, p71, v8, y7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ vb b;

    public /* synthetic */ ca(vb vbVar, int i10) {
        this.a = i10;
        this.b = vbVar;
    }

    @Override // r0.n
    public r0.k1 B0(View view, r0.k1 k1Var) {
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(k1Var, false);
        int i10 = defaultWindowInsets.a;
        vb vbVar = this.b;
        vbVar.Y = i10;
        vbVar.Z = defaultWindowInsets.b;
        vbVar.a0 = defaultWindowInsets.c;
        vbVar.b0 = defaultWindowInsets.d;
        vbVar.n.requestLayout();
        return r0.k1.b;
    }

    @Override // org.telegram.ui.Components.w91
    public void b(float f7) {
        vb vbVar = this.b;
        ya yaVar = vbVar.B0;
        if (yaVar != null) {
            vbVar.T1 = f7;
            yaVar.setZoom(f7);
        }
        vbVar.i0(true);
    }

    @Override // org.telegram.ui.Components.p71
    public void c(e00 e00Var) {
        MediaController.SavedFilterState savedFilterState;
        vb vbVar = this.b;
        if (e00Var == null) {
            vbVar.getClass();
            return;
        }
        a8 a8Var = vbVar.K1;
        if (a8Var == null || (savedFilterState = a8Var.a1) == null) {
            return;
        }
        e00Var.f(new f00(savedFilterState));
    }

    @Override // ei.v8
    public void e(final p9 p9Var, final boolean z10, final boolean z11, boolean z12, final boolean z13, final TLRPC.InputPeer inputPeer, final int i10, p6 p6Var, final com.google.firebase.messaging.s sVar) {
        switch (this.a) {
            case 10:
                ArrayList arrayList = p9Var.b;
                vb vbVar = this.b;
                if (vbVar.K1 != null) {
                    vbVar.X0.x(5, true);
                    vbVar.K1.E0 = p9Var;
                    int i11 = vbVar.c;
                    int i12 = s9.a;
                    SerializedData serializedData = new SerializedData(true);
                    s9.c(serializedData, p9Var);
                    SerializedData serializedData2 = new SerializedData(serializedData.length());
                    serializedData.cleanup();
                    s9.c(serializedData2, p9Var);
                    MessagesController.getInstance(i11).getMainSettings().edit().putString("story_privacy2", Utilities.bytesToHex(serializedData2.toByteArray())).apply();
                    serializedData2.cleanup();
                    a8 a8Var = vbVar.K1;
                    a8Var.G0 = z12;
                    a8Var.H0 = z11;
                    a8Var.F0.clear();
                    vbVar.K1.F0.addAll(arrayList);
                    a8 a8Var2 = vbVar.K1;
                    a8Var2.l = true;
                    a8Var2.v0 = inputPeer;
                    ArrayList arrayList2 = vbVar.H1;
                    if (arrayList2 != null) {
                        int size = arrayList2.size();
                        int i13 = 0;
                        while (i13 < size) {
                            Object obj = arrayList2.get(i13);
                            i13++;
                            a8 a8Var3 = (a8) obj;
                            a8Var3.E0 = p9Var;
                            ArrayList arrayList3 = a8Var3.F0;
                            a8Var3.G0 = z12;
                            a8Var3.H0 = z11;
                            arrayList3.clear();
                            arrayList3.addAll(arrayList);
                            a8Var3.l = true;
                            a8Var3.v0 = inputPeer;
                        }
                    }
                    vbVar.h(new z9(vbVar, p6Var, 0));
                    break;
                }
                break;
            default:
                int i14 = R.raw.permission_request_camera;
                int i15 = R.string.PermissionNoCameraMicVideo;
                String[] strArr = z13 ? new String[0] : new String[]{"android.permission.CAMERA", "android.permission.RECORD_AUDIO"};
                final vb vbVar2 = this.b;
                we0.b(i14, i15, strArr, new Utilities.Callback() { // from class: ei.aa
                    @Override // org.telegram.messenger.Utilities.Callback
                    public final void run(Object obj2) {
                        boolean z14;
                        final boolean z15;
                        final vb vbVar3 = vb.this;
                        int i16 = vbVar3.c;
                        boolean booleanValue = ((Boolean) obj2).booleanValue();
                        final com.google.firebase.messaging.s sVar2 = sVar;
                        if (!booleanValue) {
                            sVar2.run();
                            return;
                        }
                        ya yaVar = vbVar3.B0;
                        if (yaVar == null || yaVar.isFrontface()) {
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
                        tL_startLive.privacy_rules.addAll(p9Var.b);
                        tL_startLive.random_id = Utilities.random.nextLong();
                        final boolean z16 = z13;
                        tL_startLive.rtmp_stream = z16;
                        tL_startLive.messages_enabled = Boolean.valueOf(z10);
                        tL_startLive.send_paid_messages_stars = Long.valueOf(i10);
                        ConnectionsManager.getInstance(i16).sendRequest(tL_startLive, new RequestDelegate() { // from class: ei.ba
                            @Override // org.telegram.tgnet.RequestDelegate
                            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                AndroidUtilities.runOnUIThread(new ai.s8(vb.this, tLObject, tL_startLive, z16, clientUserId, z15, tL_error, sVar2));
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
                vb vbVar = this.b;
                vbVar.getClass();
                try {
                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                    vbVar.b.startActivity(intent);
                    break;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            case 3:
                vb vbVar2 = this.b;
                vbVar2.getClass();
                try {
                    Intent intent2 = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent2.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                    vbVar2.b.startActivity(intent2);
                    break;
                } catch (Exception e7) {
                    FileLog.e(e7);
                    return;
                }
            case 4:
            case 6:
            case 7:
            default:
                vb vbVar3 = this.b;
                vbVar3.getClass();
                try {
                    Intent intent3 = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent3.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                    vbVar3.b.startActivity(intent3);
                    break;
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
            case 5:
                vb vbVar4 = this.b;
                vbVar4.getClass();
                try {
                    Intent intent4 = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent4.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                    vbVar4.b.startActivity(intent4);
                    break;
                } catch (Exception e11) {
                    FileLog.e(e11);
                    return;
                }
            case 8:
                vb vbVar5 = this.b;
                int i11 = vbVar5.c;
                a8 a8Var = vbVar5.K1;
                if (a8Var != null) {
                    a8Var.D0 = MessagesController.getInstance(i11).storyEntitiesAllowed();
                    vbVar5.V1 = !vbVar5.K1.c;
                    vbVar5.h(null);
                    vbVar5.k();
                    vbVar5.l();
                    vbVar5.x();
                    a8 a8Var2 = vbVar5.K1;
                    a8Var2.i(true);
                    a8Var2.C0 = vbVar5.c1.getText();
                    vbVar5.K1 = null;
                    vbVar5.V(a8Var2, true);
                    a1 a1Var = MessagesController.getInstance(i11).getStoriesController().w;
                    if (a8Var2.c) {
                        a1Var.d(a8Var2);
                    } else {
                        ArrayList arrayList = a1Var.b;
                        if (!a8Var2.u) {
                            a1Var.e(a8Var2);
                            a8Var2.b = Utilities.random.nextLong();
                            z0 z0Var = new z0(a8Var2);
                            arrayList.remove(a8Var2);
                            arrayList.add(0, a8Var2);
                            a1Var.a(z0Var);
                        }
                    }
                    vbVar5.J(0, true);
                    break;
                }
                break;
            case 9:
                vb vbVar6 = this.b;
                a8 a8Var3 = vbVar6.K1;
                if (a8Var3 != null && !a8Var3.g && ((!a8Var3.n || a8Var3.u) && a8Var3.c)) {
                    MessagesController.getInstance(vbVar6.c).getStoriesController().w.b(vbVar6.K1);
                    vbVar6.K1 = null;
                }
                a8 a8Var4 = vbVar6.K1;
                if (a8Var4 != null && (a8Var4.o || a8Var4.g || (a8Var4.n && !a8Var4.u))) {
                    vbVar6.p(true);
                    break;
                } else {
                    vbVar6.J(0, true);
                    break;
                }
                break;
        }
    }

    @Override // ei.y7
    public Bitmap k(BitmapFactory.Options options) {
        return BitmapFactory.decodeFile(this.b.K1.L.getAbsolutePath(), options);
    }

    @Override // org.telegram.messenger.camera.CameraView.CameraViewDelegate
    public void onCameraInit() {
        vb vbVar = this.b;
        String B = vbVar.B();
        if (TextUtils.equals(B, vbVar.E())) {
            B = null;
        }
        vbVar.d0(vbVar.f0 == 0 ? B : null);
        x91 x91Var = vbVar.V0;
        if (x91Var != null) {
            vbVar.T1 = 0.0f;
            x91Var.b(0.0f, false);
        }
        vbVar.l0(true);
    }

    @Override // org.telegram.messenger.Utilities.CallbackVoidReturn
    public Object run() {
        jb jbVar;
        vb vbVar = this.b;
        cg0 cg0Var = vbVar.B1;
        Bitmap uiBlurBitmap = cg0Var != null ? cg0Var.getUiBlurBitmap() : null;
        return (uiBlurBitmap != null || (jbVar = vbVar.X0) == null || jbVar.getTextureView() == null) ? uiBlurBitmap : vbVar.X0.getTextureView().getUiBlurBitmap();
    }
}
