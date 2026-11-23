package hi;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.camera.CameraView;
import org.telegram.messenger.ff;
import org.telegram.messenger.i10;
import org.telegram.messenger.mp;
import org.telegram.messenger.w10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.bz;
import org.telegram.ui.Components.f81;
import org.telegram.ui.Components.g81;
import org.telegram.ui.Components.w51;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final /* synthetic */ class v9 implements CameraView.CameraViewDelegate, r0.m, org.telegram.ui.ActionBar.q1, f81, w51, q8, v7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ nb b;

    public /* synthetic */ v9(nb nbVar, int i7) {
        this.a = i7;
        this.b = nbVar;
    }

    @Override // org.telegram.ui.Components.w51
    public void a(bz bzVar) {
        ff ffVar;
        nb nbVar = this.b;
        if (bzVar == null) {
            nbVar.getClass();
            return;
        }
        x7 x7Var = nbVar.L1;
        if (x7Var == null || (ffVar = x7Var.a1) == null) {
            return;
        }
        bzVar.d(new org.telegram.ui.ActionBar.i5(ffVar));
    }

    @Override // hi.v7
    public Bitmap b(BitmapFactory.Options options) {
        return BitmapFactory.decodeFile(this.b.L1.L.getAbsolutePath(), options);
    }

    @Override // org.telegram.ui.Components.f81
    public void c(float f10) {
        nb nbVar = this.b;
        qa qaVar = nbVar.C0;
        if (qaVar != null) {
            nbVar.U1 = f10;
            qaVar.setZoom(f10);
        }
        nbVar.i0(true);
    }

    @Override // hi.q8
    public void h(final i9 i9Var, final boolean z10, final boolean z11, boolean z12, final boolean z13, final TLRPC.InputPeer inputPeer, final int i7, c cVar, final w wVar) {
        int i10 = 0;
        switch (this.a) {
            case 9:
                ArrayList arrayList = i9Var.b;
                nb nbVar = this.b;
                if (nbVar.L1 != null) {
                    nbVar.Y0.x(5, true);
                    nbVar.L1.E0 = i9Var;
                    int i11 = nbVar.c;
                    int i12 = l9.a;
                    SerializedData serializedData = new SerializedData(true);
                    l9.c(serializedData, i9Var);
                    SerializedData serializedData2 = new SerializedData(serializedData.length());
                    serializedData.cleanup();
                    l9.c(serializedData2, i9Var);
                    mp.u1(i11).h7.edit().putString("story_privacy2", Utilities.f(serializedData2.toByteArray())).apply();
                    serializedData2.cleanup();
                    x7 x7Var = nbVar.L1;
                    x7Var.G0 = z12;
                    x7Var.H0 = z11;
                    x7Var.F0.clear();
                    nbVar.L1.F0.addAll(arrayList);
                    x7 x7Var2 = nbVar.L1;
                    x7Var2.l = true;
                    x7Var2.v0 = inputPeer;
                    ArrayList arrayList2 = nbVar.I1;
                    if (arrayList2 != null) {
                        int size = arrayList2.size();
                        int i13 = 0;
                        while (i13 < size) {
                            Object obj = arrayList2.get(i13);
                            i13++;
                            x7 x7Var3 = (x7) obj;
                            x7Var3.E0 = i9Var;
                            ArrayList arrayList3 = x7Var3.F0;
                            x7Var3.G0 = z12;
                            x7Var3.H0 = z11;
                            arrayList3.clear();
                            arrayList3.addAll(arrayList);
                            x7Var3.l = true;
                            x7Var3.v0 = inputPeer;
                        }
                    }
                    nbVar.h(new s9(nbVar, cVar, i10));
                    break;
                }
                break;
            default:
                String[] strArr = z13 ? new String[0] : new String[]{"android.permission.CAMERA", "android.permission.RECORD_AUDIO"};
                final nb nbVar2 = this.b;
                c8.oa.b(strArr, new w10() { // from class: hi.t9
                    @Override // org.telegram.messenger.w10
                    public final void a(Object obj2) {
                        boolean z14;
                        final boolean z15;
                        final nb nbVar3 = nb.this;
                        int i14 = nbVar3.c;
                        boolean booleanValue = ((Boolean) obj2).booleanValue();
                        final w wVar2 = wVar;
                        if (!booleanValue) {
                            wVar2.run();
                            return;
                        }
                        qa qaVar = nbVar3.C0;
                        if (qaVar == null || qaVar.isFrontface()) {
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
                        final long e10 = (inputPeer2 == null || (inputPeer2 instanceof TLRPC.TL_inputPeerSelf)) ? i10.i(i14).e() : org.telegram.messenger.n5.n(inputPeer2);
                        tL_startLive.privacy_rules.addAll(i9Var.b);
                        tL_startLive.random_id = Utilities.b.nextLong();
                        final boolean z16 = z13;
                        tL_startLive.rtmp_stream = z16;
                        tL_startLive.messages_enabled = Boolean.valueOf(z10);
                        tL_startLive.send_paid_messages_stars = Long.valueOf(i7);
                        ConnectionsManager.getInstance(i14).sendRequest(tL_startLive, new RequestDelegate() { // from class: hi.u9
                            @Override // org.telegram.tgnet.RequestDelegate
                            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                org.telegram.messenger.g0.g3(new di.r7(nb.this, tLObject, tL_startLive, z16, e10, z15, tL_error, wVar2));
                            }
                        });
                    }
                });
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.q1
    public void i(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        switch (this.a) {
            case 2:
                nb nbVar = this.b;
                try {
                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent.setData(Uri.parse("package:" + org.telegram.messenger.t0.b.getPackageName()));
                    nbVar.b.startActivity(intent);
                    break;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return;
                }
            case 3:
                nb nbVar2 = this.b;
                try {
                    Intent intent2 = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent2.setData(Uri.parse("package:" + org.telegram.messenger.t0.b.getPackageName()));
                    nbVar2.b.startActivity(intent2);
                    break;
                } catch (Exception e11) {
                    org.telegram.messenger.a8.g(e11, true);
                    return;
                }
            case 4:
            case 6:
            default:
                nb nbVar3 = this.b;
                try {
                    Intent intent3 = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent3.setData(Uri.parse("package:" + org.telegram.messenger.t0.b.getPackageName()));
                    nbVar3.b.startActivity(intent3);
                    break;
                } catch (Exception e12) {
                    org.telegram.messenger.a8.g(e12, true);
                }
            case 5:
                nb nbVar4 = this.b;
                try {
                    Intent intent4 = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent4.setData(Uri.parse("package:" + org.telegram.messenger.t0.b.getPackageName()));
                    nbVar4.b.startActivity(intent4);
                    break;
                } catch (Exception e13) {
                    org.telegram.messenger.a8.g(e13, true);
                    return;
                }
            case 7:
                nb nbVar5 = this.b;
                int i10 = nbVar5.c;
                x7 x7Var = nbVar5.L1;
                if (x7Var != null) {
                    x7Var.D0 = mp.u1(i10).j5();
                    nbVar5.W1 = !nbVar5.L1.c;
                    nbVar5.h(null);
                    nbVar5.k();
                    nbVar5.l();
                    nbVar5.x();
                    x7 x7Var2 = nbVar5.L1;
                    x7Var2.i(true);
                    x7Var2.C0 = nbVar5.d1.getText();
                    nbVar5.L1 = null;
                    nbVar5.V(x7Var2, true);
                    j1 j1Var = mp.u1(i10).R1().w;
                    if (x7Var2.c) {
                        j1Var.d(x7Var2);
                    } else {
                        ArrayList arrayList = j1Var.b;
                        if (!x7Var2.u) {
                            j1Var.e(x7Var2);
                            x7Var2.b = Utilities.b.nextLong();
                            i1 i1Var = new i1(x7Var2);
                            arrayList.remove(x7Var2);
                            arrayList.add(0, x7Var2);
                            j1Var.a(i1Var);
                        }
                    }
                    nbVar5.J(0, true);
                    break;
                }
                break;
            case 8:
                nb nbVar6 = this.b;
                x7 x7Var3 = nbVar6.L1;
                if (x7Var3 != null && !x7Var3.g && ((!x7Var3.n || x7Var3.u) && x7Var3.c)) {
                    mp.u1(nbVar6.c).R1().w.b(nbVar6.L1);
                    nbVar6.L1 = null;
                }
                x7 x7Var4 = nbVar6.L1;
                if (x7Var4 != null && (x7Var4.o || x7Var4.g || (x7Var4.n && !x7Var4.u))) {
                    nbVar6.p(true);
                    break;
                } else {
                    nbVar6.J(0, true);
                    break;
                }
                break;
        }
    }

    @Override // r0.m
    public r0.l1 l1(View view, r0.l1 l1Var) {
        i0.b I0 = org.telegram.messenger.g0.I0(l1Var, false);
        int i7 = I0.a;
        nb nbVar = this.b;
        nbVar.Z = i7;
        nbVar.a0 = I0.b;
        nbVar.b0 = I0.c;
        nbVar.c0 = I0.d;
        nbVar.n.requestLayout();
        return r0.l1.b;
    }

    @Override // org.telegram.messenger.camera.CameraView.CameraViewDelegate
    public void onCameraInit() {
        nb nbVar = this.b;
        String B = nbVar.B();
        if (TextUtils.equals(B, nbVar.E())) {
            B = null;
        }
        nbVar.d0(nbVar.g0 == 0 ? B : null);
        g81 g81Var = nbVar.W0;
        if (g81Var != null) {
            nbVar.U1 = 0.0f;
            g81Var.b(false, 0.0f);
        }
        nbVar.l0(true);
    }
}
