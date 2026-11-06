package fi;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.c20;
import org.telegram.messenger.camera.CameraView;
import org.telegram.messenger.hf;
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.g51;
import org.telegram.ui.Components.q71;
import org.telegram.ui.Components.r71;
import org.telegram.ui.Components.ry;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final /* synthetic */ class d9 implements CameraView.CameraViewDelegate, r0.m, org.telegram.ui.ActionBar.r1, q71, g51, y7, c7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ va b;

    public /* synthetic */ d9(va vaVar, int i7) {
        this.a = i7;
        this.b = vaVar;
    }

    @Override // r0.m
    public r0.k1 S0(View view, r0.k1 k1Var) {
        i0.b I0 = org.telegram.messenger.g0.I0(k1Var, false);
        int i7 = I0.a;
        va vaVar = this.b;
        vaVar.Y = i7;
        vaVar.Z = I0.b;
        vaVar.a0 = I0.c;
        vaVar.b0 = I0.d;
        vaVar.n.requestLayout();
        return r0.k1.b;
    }

    @Override // org.telegram.ui.Components.g51
    public void a(ry ryVar) {
        hf hfVar;
        va vaVar = this.b;
        if (ryVar == null) {
            vaVar.getClass();
            return;
        }
        e7 e7Var = vaVar.K1;
        if (e7Var == null || (hfVar = e7Var.a1) == null) {
            return;
        }
        ryVar.d(new org.telegram.ui.Components.n(hfVar));
    }

    @Override // org.telegram.ui.Components.q71
    public void b(float f10) {
        va vaVar = this.b;
        y9 y9Var = vaVar.B0;
        if (y9Var != null) {
            vaVar.T1 = f10;
            y9Var.setZoom(f10);
        }
        vaVar.i0(true);
    }

    @Override // fi.c7
    public Bitmap c(BitmapFactory.Options options) {
        return BitmapFactory.decodeFile(this.b.K1.L.getAbsolutePath(), options);
    }

    @Override // org.telegram.ui.ActionBar.r1
    public void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        switch (this.a) {
            case 2:
                va vaVar = this.b;
                vaVar.getClass();
                try {
                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent.setData(Uri.parse("package:" + org.telegram.messenger.t0.b.getPackageName()));
                    vaVar.b.startActivity(intent);
                    break;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return;
                }
            case 3:
                va vaVar2 = this.b;
                vaVar2.getClass();
                try {
                    Intent intent2 = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent2.setData(Uri.parse("package:" + org.telegram.messenger.t0.b.getPackageName()));
                    vaVar2.b.startActivity(intent2);
                    break;
                } catch (Exception e11) {
                    org.telegram.messenger.a8.g(e11, true);
                    return;
                }
            case 4:
            case 6:
            default:
                va vaVar3 = this.b;
                try {
                    Intent intent3 = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent3.setData(Uri.parse("package:" + org.telegram.messenger.t0.b.getPackageName()));
                    vaVar3.b.startActivity(intent3);
                    break;
                } catch (Exception e12) {
                    org.telegram.messenger.a8.g(e12, true);
                }
            case 5:
                va vaVar4 = this.b;
                vaVar4.getClass();
                try {
                    Intent intent4 = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent4.setData(Uri.parse("package:" + org.telegram.messenger.t0.b.getPackageName()));
                    vaVar4.b.startActivity(intent4);
                    break;
                } catch (Exception e13) {
                    org.telegram.messenger.a8.g(e13, true);
                    return;
                }
            case 7:
                va vaVar5 = this.b;
                int i10 = vaVar5.c;
                e7 e7Var = vaVar5.K1;
                if (e7Var != null) {
                    e7Var.D0 = qp.s1(i10).X4();
                    vaVar5.V1 = !vaVar5.K1.c;
                    vaVar5.h(null);
                    vaVar5.k();
                    vaVar5.l();
                    vaVar5.x();
                    e7 e7Var2 = vaVar5.K1;
                    e7Var2.i(true);
                    e7Var2.C0 = vaVar5.c1.getText();
                    vaVar5.K1 = null;
                    vaVar5.V(e7Var2, true);
                    z0 z0Var = qp.s1(i10).P1().w;
                    if (e7Var2.c) {
                        z0Var.d(e7Var2);
                    } else {
                        ArrayList arrayList = z0Var.b;
                        if (!e7Var2.u) {
                            z0Var.e(e7Var2);
                            e7Var2.b = Utilities.b.nextLong();
                            y0 y0Var = new y0(e7Var2);
                            arrayList.remove(e7Var2);
                            arrayList.add(0, e7Var2);
                            z0Var.a(y0Var);
                        }
                    }
                    vaVar5.J(0, true);
                    break;
                }
                break;
            case 8:
                va vaVar6 = this.b;
                e7 e7Var3 = vaVar6.K1;
                if (e7Var3 != null && !e7Var3.g && ((!e7Var3.n || e7Var3.u) && e7Var3.c)) {
                    qp.s1(vaVar6.c).P1().w.b(vaVar6.K1);
                    vaVar6.K1 = null;
                }
                e7 e7Var4 = vaVar6.K1;
                if (e7Var4 != null && (e7Var4.o || e7Var4.g || (e7Var4.n && !e7Var4.u))) {
                    vaVar6.p(true);
                    break;
                } else {
                    vaVar6.J(0, true);
                    break;
                }
                break;
        }
    }

    @Override // fi.y7
    public void l(final q8 q8Var, final boolean z9, final boolean z10, boolean z11, final boolean z12, final TLRPC.InputPeer inputPeer, final int i7, f2.h hVar, final di.s7 s7Var) {
        int i10 = 0;
        switch (this.a) {
            case 9:
                ArrayList arrayList = q8Var.b;
                va vaVar = this.b;
                if (vaVar.K1 != null) {
                    vaVar.X0.x(5, true);
                    vaVar.K1.E0 = q8Var;
                    int i11 = vaVar.c;
                    int i12 = t8.a;
                    SerializedData serializedData = new SerializedData(true);
                    t8.c(serializedData, q8Var);
                    SerializedData serializedData2 = new SerializedData(serializedData.length());
                    serializedData.cleanup();
                    t8.c(serializedData2, q8Var);
                    qp.s1(i11).e7.edit().putString("story_privacy2", Utilities.f(serializedData2.toByteArray())).apply();
                    serializedData2.cleanup();
                    e7 e7Var = vaVar.K1;
                    e7Var.G0 = z11;
                    e7Var.H0 = z10;
                    e7Var.F0.clear();
                    vaVar.K1.F0.addAll(arrayList);
                    e7 e7Var2 = vaVar.K1;
                    e7Var2.l = true;
                    e7Var2.v0 = inputPeer;
                    ArrayList arrayList2 = vaVar.H1;
                    if (arrayList2 != null) {
                        int size = arrayList2.size();
                        int i13 = 0;
                        while (i13 < size) {
                            Object obj = arrayList2.get(i13);
                            i13++;
                            e7 e7Var3 = (e7) obj;
                            e7Var3.E0 = q8Var;
                            ArrayList arrayList3 = e7Var3.F0;
                            e7Var3.G0 = z11;
                            e7Var3.H0 = z10;
                            arrayList3.clear();
                            arrayList3.addAll(arrayList);
                            e7Var3.l = true;
                            e7Var3.v0 = inputPeer;
                        }
                    }
                    vaVar.h(new a9(vaVar, hVar, i10));
                    break;
                }
                break;
            default:
                String[] strArr = z12 ? new String[0] : new String[]{"android.permission.CAMERA", "android.permission.RECORD_AUDIO"};
                final va vaVar2 = this.b;
                c8.ia.b(strArr, new c20() { // from class: fi.b9
                    @Override // org.telegram.messenger.c20
                    public final void a(Object obj2) {
                        boolean z13;
                        final boolean z14;
                        final va vaVar3 = va.this;
                        int i14 = vaVar3.c;
                        boolean booleanValue = ((Boolean) obj2).booleanValue();
                        final di.s7 s7Var2 = s7Var;
                        if (!booleanValue) {
                            s7Var2.run();
                            return;
                        }
                        y9 y9Var = vaVar3.B0;
                        if (y9Var == null || y9Var.isFrontface()) {
                            z13 = true;
                            z14 = true;
                        } else {
                            z14 = false;
                            z13 = true;
                        }
                        final TL_stories.TL_startLive tL_startLive = new TL_stories.TL_startLive();
                        tL_startLive.noforwards = z13 ^ z10;
                        TLRPC.InputPeer inputPeer2 = inputPeer;
                        tL_startLive.peer = inputPeer2 == null ? new TLRPC.TL_inputPeerSelf() : inputPeer2;
                        final long e10 = (inputPeer2 == null || (inputPeer2 instanceof TLRPC.TL_inputPeerSelf)) ? p10.i(i14).e() : org.telegram.messenger.m5.n(inputPeer2);
                        tL_startLive.privacy_rules.addAll(q8Var.b);
                        tL_startLive.random_id = Utilities.b.nextLong();
                        final boolean z15 = z12;
                        tL_startLive.rtmp_stream = z15;
                        tL_startLive.messages_enabled = Boolean.valueOf(z9);
                        tL_startLive.send_paid_messages_stars = Long.valueOf(i7);
                        ConnectionsManager.getInstance(i14).sendRequest(tL_startLive, new RequestDelegate() { // from class: fi.c9
                            @Override // org.telegram.tgnet.RequestDelegate
                            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                org.telegram.messenger.g0.h3(new bi.v8(va.this, tLObject, tL_startLive, z15, e10, z14, tL_error, s7Var2));
                            }
                        });
                    }
                });
                break;
        }
    }

    @Override // org.telegram.messenger.camera.CameraView.CameraViewDelegate
    public void onCameraInit() {
        va vaVar = this.b;
        String B = vaVar.B();
        if (TextUtils.equals(B, vaVar.E())) {
            B = null;
        }
        vaVar.d0(vaVar.f0 == 0 ? B : null);
        r71 r71Var = vaVar.V0;
        if (r71Var != null) {
            vaVar.T1 = 0.0f;
            r71Var.b(false, 0.0f);
        }
        vaVar.l0(true);
    }
}
