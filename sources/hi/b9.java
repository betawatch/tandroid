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
import org.telegram.messenger.gf;
import org.telegram.messenger.m10;
import org.telegram.messenger.np;
import org.telegram.messenger.z10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.cf;
import org.telegram.ui.Components.j51;
import org.telegram.ui.Components.r71;
import org.telegram.ui.Components.s71;
import org.telegram.ui.Components.wy;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class b9 implements CameraView.CameraViewDelegate, r0.m, org.telegram.ui.ActionBar.q1, r71, j51, w7, b7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ sa b;

    public /* synthetic */ b9(sa saVar, int i7) {
        this.a = i7;
        this.b = saVar;
    }

    @Override // r0.m
    public r0.k1 M0(View view, r0.k1 k1Var) {
        i0.c I0 = org.telegram.messenger.g0.I0(k1Var, false);
        int i7 = I0.a;
        sa saVar = this.b;
        saVar.Z = i7;
        saVar.a0 = I0.b;
        saVar.b0 = I0.c;
        saVar.c0 = I0.d;
        saVar.n.requestLayout();
        return r0.k1.b;
    }

    @Override // hi.w7
    public void a(final o8 o8Var, final boolean z10, final boolean z11, boolean z12, final boolean z13, final TLRPC.InputPeer inputPeer, final int i7, h4 h4Var, final e1 e1Var) {
        int i10 = 0;
        switch (this.a) {
            case 9:
                ArrayList arrayList = o8Var.b;
                sa saVar = this.b;
                if (saVar.L1 != null) {
                    saVar.Y0.x(5, true);
                    saVar.L1.E0 = o8Var;
                    int i11 = saVar.c;
                    int i12 = r8.a;
                    SerializedData serializedData = new SerializedData(true);
                    r8.c(serializedData, o8Var);
                    SerializedData serializedData2 = new SerializedData(serializedData.length());
                    serializedData.cleanup();
                    r8.c(serializedData2, o8Var);
                    np.s1(i11).f7.edit().putString("story_privacy2", Utilities.f(serializedData2.toByteArray())).apply();
                    serializedData2.cleanup();
                    d7 d7Var = saVar.L1;
                    d7Var.G0 = z12;
                    d7Var.H0 = z11;
                    d7Var.F0.clear();
                    saVar.L1.F0.addAll(arrayList);
                    d7 d7Var2 = saVar.L1;
                    d7Var2.l = true;
                    d7Var2.v0 = inputPeer;
                    ArrayList arrayList2 = saVar.I1;
                    if (arrayList2 != null) {
                        int size = arrayList2.size();
                        int i13 = 0;
                        while (i13 < size) {
                            Object obj = arrayList2.get(i13);
                            i13++;
                            d7 d7Var3 = (d7) obj;
                            d7Var3.E0 = o8Var;
                            ArrayList arrayList3 = d7Var3.F0;
                            d7Var3.G0 = z12;
                            d7Var3.H0 = z11;
                            arrayList3.clear();
                            arrayList3.addAll(arrayList);
                            d7Var3.l = true;
                            d7Var3.v0 = inputPeer;
                        }
                    }
                    saVar.h(new y8(saVar, h4Var, i10));
                    break;
                }
                break;
            default:
                String[] strArr = z13 ? new String[0] : new String[]{"android.permission.CAMERA", "android.permission.RECORD_AUDIO"};
                final sa saVar2 = this.b;
                c8.ka.b(strArr, new z10() { // from class: hi.z8
                    @Override // org.telegram.messenger.z10
                    public final void a(Object obj2) {
                        boolean z14;
                        final boolean z15;
                        final sa saVar3 = sa.this;
                        int i14 = saVar3.c;
                        boolean booleanValue = ((Boolean) obj2).booleanValue();
                        final e1 e1Var2 = e1Var;
                        if (!booleanValue) {
                            e1Var2.run();
                            return;
                        }
                        v9 v9Var = saVar3.C0;
                        if (v9Var == null || v9Var.isFrontface()) {
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
                        final long e10 = (inputPeer2 == null || (inputPeer2 instanceof TLRPC.TL_inputPeerSelf)) ? m10.i(i14).e() : org.telegram.messenger.m5.n(inputPeer2);
                        tL_startLive.privacy_rules.addAll(o8Var.b);
                        tL_startLive.random_id = Utilities.b.nextLong();
                        final boolean z16 = z13;
                        tL_startLive.rtmp_stream = z16;
                        tL_startLive.messages_enabled = Boolean.valueOf(z10);
                        tL_startLive.send_paid_messages_stars = Long.valueOf(i7);
                        ConnectionsManager.getInstance(i14).sendRequest(tL_startLive, new RequestDelegate() { // from class: hi.a9
                            @Override // org.telegram.tgnet.RequestDelegate
                            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                org.telegram.messenger.g0.h3(new di.o7(sa.this, tLObject, tL_startLive, z16, e10, z15, tL_error, e1Var2));
                            }
                        });
                    }
                });
                break;
        }
    }

    @Override // org.telegram.ui.Components.j51
    public void b(wy wyVar) {
        gf gfVar;
        sa saVar = this.b;
        if (wyVar == null) {
            saVar.getClass();
            return;
        }
        d7 d7Var = saVar.L1;
        if (d7Var == null || (gfVar = d7Var.a1) == null) {
            return;
        }
        wyVar.d(new cf(gfVar));
    }

    @Override // org.telegram.ui.Components.r71
    public void c(float f10) {
        sa saVar = this.b;
        v9 v9Var = saVar.C0;
        if (v9Var != null) {
            saVar.U1 = f10;
            v9Var.setZoom(f10);
        }
        saVar.i0(true);
    }

    @Override // hi.b7
    public Bitmap d(BitmapFactory.Options options) {
        return BitmapFactory.decodeFile(this.b.L1.L.getAbsolutePath(), options);
    }

    @Override // org.telegram.ui.ActionBar.q1
    public void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        switch (this.a) {
            case 2:
                sa saVar = this.b;
                try {
                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent.setData(Uri.parse("package:" + org.telegram.messenger.t0.b.getPackageName()));
                    saVar.b.startActivity(intent);
                    break;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return;
                }
            case 3:
                sa saVar2 = this.b;
                try {
                    Intent intent2 = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent2.setData(Uri.parse("package:" + org.telegram.messenger.t0.b.getPackageName()));
                    saVar2.b.startActivity(intent2);
                    break;
                } catch (Exception e11) {
                    org.telegram.messenger.a8.g(e11, true);
                    return;
                }
            case 4:
            case 6:
            default:
                sa saVar3 = this.b;
                try {
                    Intent intent3 = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent3.setData(Uri.parse("package:" + org.telegram.messenger.t0.b.getPackageName()));
                    saVar3.b.startActivity(intent3);
                    break;
                } catch (Exception e12) {
                    org.telegram.messenger.a8.g(e12, true);
                }
            case 5:
                sa saVar4 = this.b;
                try {
                    Intent intent4 = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent4.setData(Uri.parse("package:" + org.telegram.messenger.t0.b.getPackageName()));
                    saVar4.b.startActivity(intent4);
                    break;
                } catch (Exception e13) {
                    org.telegram.messenger.a8.g(e13, true);
                    return;
                }
            case 7:
                sa saVar5 = this.b;
                int i10 = saVar5.c;
                d7 d7Var = saVar5.L1;
                if (d7Var != null) {
                    d7Var.D0 = np.s1(i10).Y4();
                    saVar5.W1 = !saVar5.L1.c;
                    saVar5.h(null);
                    saVar5.k();
                    saVar5.l();
                    saVar5.x();
                    d7 d7Var2 = saVar5.L1;
                    d7Var2.i(true);
                    d7Var2.C0 = saVar5.d1.getText();
                    saVar5.L1 = null;
                    saVar5.V(d7Var2, true);
                    a1 a1Var = np.s1(i10).P1().w;
                    if (d7Var2.c) {
                        a1Var.d(d7Var2);
                    } else {
                        ArrayList arrayList = a1Var.b;
                        if (!d7Var2.u) {
                            a1Var.e(d7Var2);
                            d7Var2.b = Utilities.b.nextLong();
                            z0 z0Var = new z0(d7Var2);
                            arrayList.remove(d7Var2);
                            arrayList.add(0, d7Var2);
                            a1Var.a(z0Var);
                        }
                    }
                    saVar5.J(0, true);
                    break;
                }
                break;
            case 8:
                sa saVar6 = this.b;
                d7 d7Var3 = saVar6.L1;
                if (d7Var3 != null && !d7Var3.g && ((!d7Var3.n || d7Var3.u) && d7Var3.c)) {
                    np.s1(saVar6.c).P1().w.b(saVar6.L1);
                    saVar6.L1 = null;
                }
                d7 d7Var4 = saVar6.L1;
                if (d7Var4 != null && (d7Var4.o || d7Var4.g || (d7Var4.n && !d7Var4.u))) {
                    saVar6.p(true);
                    break;
                } else {
                    saVar6.J(0, true);
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.messenger.camera.CameraView.CameraViewDelegate
    public void onCameraInit() {
        sa saVar = this.b;
        String B = saVar.B();
        if (TextUtils.equals(B, saVar.E())) {
            B = null;
        }
        saVar.d0(saVar.g0 == 0 ? B : null);
        s71 s71Var = saVar.W0;
        if (s71Var != null) {
            saVar.U1 = 0.0f;
            s71Var.b(false, 0.0f);
        }
        saVar.l0(true);
    }
}
