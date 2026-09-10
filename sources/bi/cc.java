package bi;

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
import org.telegram.ui.Components.c00;
import org.telegram.ui.Components.d00;
import org.telegram.ui.Components.g71;
import org.telegram.ui.Components.me0;
import org.telegram.ui.Components.p91;
import org.telegram.ui.Components.q91;
import org.telegram.ui.Components.sf0;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final /* synthetic */ class cc implements CameraView.CameraViewDelegate, r0.n, org.telegram.ui.ActionBar.c2, p91, Utilities.CallbackVoidReturn, g71, ma, p9 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ce b;

    public /* synthetic */ cc(ce ceVar, int i10) {
        this.a = i10;
        this.b = ceVar;
    }

    @Override // r0.n
    public r0.l1 Q0(View view, r0.l1 l1Var) {
        i0.c defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(l1Var, false);
        int i10 = defaultWindowInsets.a;
        ce ceVar = this.b;
        ceVar.Y = i10;
        ceVar.Z = defaultWindowInsets.b;
        ceVar.a0 = defaultWindowInsets.c;
        ceVar.b0 = defaultWindowInsets.d;
        ceVar.n.requestLayout();
        return r0.l1.b;
    }

    @Override // org.telegram.ui.Components.p91
    public void a(float f7) {
        ce ceVar = this.b;
        bd bdVar = ceVar.B0;
        if (bdVar != null) {
            ceVar.T1 = f7;
            bdVar.setZoom(f7);
        }
        ceVar.j0(true);
    }

    @Override // org.telegram.ui.Components.g71
    public void c(c00 c00Var) {
        MediaController.SavedFilterState savedFilterState;
        ce ceVar = this.b;
        if (c00Var == null) {
            ceVar.getClass();
            return;
        }
        r9 r9Var = ceVar.K1;
        if (r9Var == null || (savedFilterState = r9Var.a1) == null) {
            return;
        }
        c00Var.f(new d00(savedFilterState));
    }

    @Override // org.telegram.ui.ActionBar.c2
    public void f(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        switch (this.a) {
            case 2:
                ce ceVar = this.b;
                ceVar.getClass();
                try {
                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                    ceVar.b.startActivity(intent);
                    break;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            case 3:
                ce ceVar2 = this.b;
                ceVar2.getClass();
                try {
                    Intent intent2 = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent2.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                    ceVar2.b.startActivity(intent2);
                    break;
                } catch (Exception e7) {
                    FileLog.e(e7);
                    return;
                }
            case 4:
            case 6:
            case 7:
            default:
                ce ceVar3 = this.b;
                ceVar3.getClass();
                try {
                    Intent intent3 = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent3.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                    ceVar3.b.startActivity(intent3);
                    break;
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
            case 5:
                ce ceVar4 = this.b;
                ceVar4.getClass();
                try {
                    Intent intent4 = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent4.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                    ceVar4.b.startActivity(intent4);
                    break;
                } catch (Exception e11) {
                    FileLog.e(e11);
                    return;
                }
            case 8:
                ce ceVar5 = this.b;
                int i11 = ceVar5.c;
                r9 r9Var = ceVar5.K1;
                if (r9Var != null) {
                    r9Var.D0 = MessagesController.getInstance(i11).storyEntitiesAllowed();
                    ceVar5.V1 = !ceVar5.K1.c;
                    ceVar5.i(null);
                    ceVar5.l();
                    ceVar5.m();
                    ceVar5.y();
                    r9 r9Var2 = ceVar5.K1;
                    r9Var2.i(true);
                    r9Var2.C0 = ceVar5.c1.getText();
                    ceVar5.K1 = null;
                    ceVar5.W(r9Var2, true);
                    f1 f1Var = MessagesController.getInstance(i11).getStoriesController().w;
                    if (r9Var2.c) {
                        f1Var.d(r9Var2);
                    } else {
                        ArrayList arrayList = f1Var.b;
                        if (!r9Var2.u) {
                            f1Var.e(r9Var2);
                            r9Var2.b = Utilities.random.nextLong();
                            e1 e1Var = new e1(r9Var2);
                            arrayList.remove(r9Var2);
                            arrayList.add(0, r9Var2);
                            f1Var.a(e1Var);
                        }
                    }
                    ceVar5.K(0, true);
                    break;
                }
                break;
            case 9:
                ce ceVar6 = this.b;
                r9 r9Var3 = ceVar6.K1;
                if (r9Var3 != null && !r9Var3.g && ((!r9Var3.n || r9Var3.u) && r9Var3.c)) {
                    MessagesController.getInstance(ceVar6.c).getStoriesController().w.b(ceVar6.K1);
                    ceVar6.K1 = null;
                }
                r9 r9Var4 = ceVar6.K1;
                if (r9Var4 != null && (r9Var4.o || r9Var4.g || (r9Var4.n && !r9Var4.u))) {
                    ceVar6.q(true);
                    break;
                } else {
                    ceVar6.K(0, true);
                    break;
                }
                break;
        }
    }

    @Override // bi.ma
    public void g(final pb pbVar, final boolean z10, final boolean z11, boolean z12, final boolean z13, final TLRPC.InputPeer inputPeer, final int i10, a1.e eVar, final a3.d dVar) {
        switch (this.a) {
            case 10:
                ArrayList arrayList = pbVar.b;
                ce ceVar = this.b;
                if (ceVar.K1 != null) {
                    ceVar.X0.x(5, true);
                    ceVar.K1.E0 = pbVar;
                    int i11 = ceVar.c;
                    int i12 = sb.a;
                    SerializedData serializedData = new SerializedData(true);
                    sb.c(serializedData, pbVar);
                    SerializedData serializedData2 = new SerializedData(serializedData.length());
                    serializedData.cleanup();
                    sb.c(serializedData2, pbVar);
                    MessagesController.getInstance(i11).getMainSettings().edit().putString("story_privacy2", Utilities.bytesToHex(serializedData2.toByteArray())).apply();
                    serializedData2.cleanup();
                    r9 r9Var = ceVar.K1;
                    r9Var.G0 = z12;
                    r9Var.H0 = z11;
                    r9Var.F0.clear();
                    ceVar.K1.F0.addAll(arrayList);
                    r9 r9Var2 = ceVar.K1;
                    r9Var2.l = true;
                    r9Var2.v0 = inputPeer;
                    ArrayList arrayList2 = ceVar.H1;
                    if (arrayList2 != null) {
                        int size = arrayList2.size();
                        int i13 = 0;
                        while (i13 < size) {
                            Object obj = arrayList2.get(i13);
                            i13++;
                            r9 r9Var3 = (r9) obj;
                            r9Var3.E0 = pbVar;
                            ArrayList arrayList3 = r9Var3.F0;
                            r9Var3.G0 = z12;
                            r9Var3.H0 = z11;
                            arrayList3.clear();
                            arrayList3.addAll(arrayList);
                            r9Var3.l = true;
                            r9Var3.v0 = inputPeer;
                        }
                    }
                    ceVar.i(new zb(ceVar, eVar, 0));
                    break;
                }
                break;
            default:
                int i14 = R.raw.permission_request_camera;
                int i15 = R.string.PermissionNoCameraMicVideo;
                String[] strArr = z13 ? new String[0] : new String[]{"android.permission.CAMERA", "android.permission.RECORD_AUDIO"};
                final ce ceVar2 = this.b;
                me0.d(i14, i15, strArr, new Utilities.Callback() { // from class: bi.ac
                    @Override // org.telegram.messenger.Utilities.Callback
                    public final void run(Object obj2) {
                        final ce ceVar3 = ce.this;
                        int i16 = ceVar3.c;
                        boolean booleanValue = ((Boolean) obj2).booleanValue();
                        final a3.d dVar2 = dVar;
                        if (!booleanValue) {
                            dVar2.run();
                            return;
                        }
                        bd bdVar = ceVar3.B0;
                        final boolean z14 = bdVar == null || bdVar.isFrontface();
                        final TL_stories.TL_startLive tL_startLive = new TL_stories.TL_startLive();
                        tL_startLive.noforwards = true ^ z11;
                        TLRPC.InputPeer inputPeer2 = inputPeer;
                        tL_startLive.peer = inputPeer2 == null ? new TLRPC.TL_inputPeerSelf() : inputPeer2;
                        final long clientUserId = (inputPeer2 == null || (inputPeer2 instanceof TLRPC.TL_inputPeerSelf)) ? UserConfig.getInstance(i16).getClientUserId() : DialogObject.getPeerDialogId(inputPeer2);
                        tL_startLive.privacy_rules.addAll(pbVar.b);
                        tL_startLive.random_id = Utilities.random.nextLong();
                        final boolean z15 = z13;
                        tL_startLive.rtmp_stream = z15;
                        tL_startLive.messages_enabled = Boolean.valueOf(z10);
                        tL_startLive.send_paid_messages_stars = Long.valueOf(i10);
                        ConnectionsManager.getInstance(i16).sendRequest(tL_startLive, new RequestDelegate() { // from class: bi.bc
                            @Override // org.telegram.tgnet.RequestDelegate
                            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                AndroidUtilities.runOnUIThread(new gc(ce.this, tLObject, tL_startLive, z15, clientUserId, z14, tL_error, dVar2));
                            }
                        });
                    }
                });
                break;
        }
    }

    @Override // bi.p9
    public Bitmap i(BitmapFactory.Options options) {
        return BitmapFactory.decodeFile(this.b.K1.L.getAbsolutePath(), options);
    }

    @Override // org.telegram.messenger.camera.CameraView.CameraViewDelegate
    public void onCameraInit() {
        ce ceVar = this.b;
        String C = ceVar.C();
        if (TextUtils.equals(C, ceVar.F())) {
            C = null;
        }
        ceVar.e0(ceVar.f0 == 0 ? C : null);
        q91 q91Var = ceVar.V0;
        if (q91Var != null) {
            ceVar.T1 = 0.0f;
            q91Var.b(0.0f, false);
        }
        ceVar.m0(true);
    }

    @Override // org.telegram.messenger.Utilities.CallbackVoidReturn
    public Object run() {
        nd ndVar;
        ce ceVar = this.b;
        sf0 sf0Var = ceVar.B1;
        Bitmap uiBlurBitmap = sf0Var != null ? sf0Var.getUiBlurBitmap() : null;
        return (uiBlurBitmap != null || (ndVar = ceVar.X0) == null || ndVar.getTextureView() == null) ? uiBlurBitmap : ceVar.X0.getTextureView().getUiBlurBitmap();
    }
}
