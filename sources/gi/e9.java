package gi;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import b8.nf;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.camera.CameraView;
import org.telegram.messenger.h10;
import org.telegram.messenger.hp;
import org.telegram.messenger.u10;
import org.telegram.messenger.ze;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.a51;
import org.telegram.ui.Components.i71;
import org.telegram.ui.Components.j71;
import org.telegram.ui.Components.nh;
import org.telegram.ui.Components.py;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class e9 implements CameraView.CameraViewDelegate, r0.m, org.telegram.ui.ActionBar.p1, i71, a51, x7, d7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ va b;

    public /* synthetic */ e9(va vaVar, int i3) {
        this.a = i3;
        this.b = vaVar;
    }

    @Override // r0.m
    public r0.k1 R0(View view, r0.k1 k1Var) {
        i0.b I0 = org.telegram.messenger.g0.I0(k1Var, false);
        int i3 = I0.a;
        va vaVar = this.b;
        vaVar.Z = i3;
        vaVar.a0 = I0.b;
        vaVar.b0 = I0.c;
        vaVar.c0 = I0.d;
        vaVar.n.requestLayout();
        return r0.k1.b;
    }

    @Override // org.telegram.ui.Components.a51
    public void a(py pyVar) {
        ze zeVar;
        va vaVar = this.b;
        if (pyVar == null) {
            vaVar.getClass();
            return;
        }
        f7 f7Var = vaVar.L1;
        if (f7Var == null || (zeVar = f7Var.a1) == null) {
            return;
        }
        pyVar.e(new nh(zeVar, 1));
    }

    @Override // org.telegram.ui.Components.i71
    public void b(float f10) {
        va vaVar = this.b;
        y9 y9Var = vaVar.C0;
        if (y9Var != null) {
            vaVar.U1 = f10;
            y9Var.setZoom(f10);
        }
        vaVar.i0(true);
    }

    @Override // gi.x7
    public void c(final r8 r8Var, final boolean z10, final boolean z11, boolean z12, final boolean z13, final TLRPC.InputPeer inputPeer, final int i3, g2.c cVar, final f6 f6Var) {
        switch (this.a) {
            case 9:
                ArrayList arrayList = r8Var.b;
                va vaVar = this.b;
                if (vaVar.L1 != null) {
                    vaVar.Y0.x(5, true);
                    vaVar.L1.E0 = r8Var;
                    int i10 = vaVar.c;
                    int i11 = u8.a;
                    SerializedData serializedData = new SerializedData(true);
                    u8.c(serializedData, r8Var);
                    SerializedData serializedData2 = new SerializedData(serializedData.length());
                    serializedData.cleanup();
                    u8.c(serializedData2, r8Var);
                    hp.s1(i10).e7.edit().putString("story_privacy2", Utilities.f(serializedData2.toByteArray())).apply();
                    serializedData2.cleanup();
                    f7 f7Var = vaVar.L1;
                    f7Var.G0 = z12;
                    f7Var.H0 = z11;
                    f7Var.F0.clear();
                    vaVar.L1.F0.addAll(arrayList);
                    f7 f7Var2 = vaVar.L1;
                    f7Var2.l = true;
                    f7Var2.v0 = inputPeer;
                    ArrayList arrayList2 = vaVar.I1;
                    if (arrayList2 != null) {
                        int size = arrayList2.size();
                        int i12 = 0;
                        while (i12 < size) {
                            Object obj = arrayList2.get(i12);
                            i12++;
                            f7 f7Var3 = (f7) obj;
                            f7Var3.E0 = r8Var;
                            ArrayList arrayList3 = f7Var3.F0;
                            f7Var3.G0 = z12;
                            f7Var3.H0 = z11;
                            arrayList3.clear();
                            arrayList3.addAll(arrayList);
                            f7Var3.l = true;
                            f7Var3.v0 = inputPeer;
                        }
                    }
                    vaVar.h(new b9(vaVar, cVar, 0));
                    break;
                }
                break;
            default:
                String[] strArr = z13 ? new String[0] : new String[]{"android.permission.CAMERA", "android.permission.RECORD_AUDIO"};
                final va vaVar2 = this.b;
                nf.b(strArr, new u10() { // from class: gi.c9
                    @Override // org.telegram.messenger.u10
                    public final void a(Object obj2) {
                        boolean z14;
                        final boolean z15;
                        final va vaVar3 = va.this;
                        int i13 = vaVar3.c;
                        boolean booleanValue = ((Boolean) obj2).booleanValue();
                        final f6 f6Var2 = f6Var;
                        if (!booleanValue) {
                            f6Var2.run();
                            return;
                        }
                        y9 y9Var = vaVar3.C0;
                        if (y9Var == null || y9Var.isFrontface()) {
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
                        final long e10 = (inputPeer2 == null || (inputPeer2 instanceof TLRPC.TL_inputPeerSelf)) ? h10.i(i13).e() : org.telegram.messenger.m5.n(inputPeer2);
                        tL_startLive.privacy_rules.addAll(r8Var.b);
                        tL_startLive.random_id = Utilities.b.nextLong();
                        final boolean z16 = z13;
                        tL_startLive.rtmp_stream = z16;
                        tL_startLive.messages_enabled = Boolean.valueOf(z10);
                        tL_startLive.send_paid_messages_stars = Long.valueOf(i3);
                        ConnectionsManager.getInstance(i13).sendRequest(tL_startLive, new RequestDelegate() { // from class: gi.d9
                            @Override // org.telegram.tgnet.RequestDelegate
                            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                org.telegram.messenger.g0.h3(new ci.w7(va.this, tLObject, tL_startLive, z16, e10, z15, tL_error, f6Var2));
                            }
                        });
                    }
                });
                break;
        }
    }

    @Override // gi.d7
    public Bitmap f(BitmapFactory.Options options) {
        return BitmapFactory.decodeFile(this.b.L1.L.getAbsolutePath(), options);
    }

    @Override // org.telegram.ui.ActionBar.p1
    public void g(org.telegram.ui.ActionBar.s1 s1Var, int i3) {
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
                f7 f7Var = vaVar5.L1;
                if (f7Var != null) {
                    f7Var.D0 = hp.s1(i10).X4();
                    vaVar5.W1 = !vaVar5.L1.c;
                    vaVar5.h(null);
                    vaVar5.k();
                    vaVar5.l();
                    vaVar5.x();
                    f7 f7Var2 = vaVar5.L1;
                    f7Var2.i(true);
                    f7Var2.C0 = vaVar5.d1.getText();
                    vaVar5.L1 = null;
                    vaVar5.V(f7Var2, true);
                    z0 z0Var = hp.s1(i10).P1().w;
                    if (f7Var2.c) {
                        z0Var.d(f7Var2);
                    } else {
                        ArrayList arrayList = z0Var.b;
                        if (!f7Var2.u) {
                            z0Var.e(f7Var2);
                            f7Var2.b = Utilities.b.nextLong();
                            y0 y0Var = new y0(f7Var2);
                            arrayList.remove(f7Var2);
                            arrayList.add(0, f7Var2);
                            z0Var.a(y0Var);
                        }
                    }
                    vaVar5.J(0, true);
                    break;
                }
                break;
            case 8:
                va vaVar6 = this.b;
                f7 f7Var3 = vaVar6.L1;
                if (f7Var3 != null && !f7Var3.g && ((!f7Var3.n || f7Var3.u) && f7Var3.c)) {
                    hp.s1(vaVar6.c).P1().w.b(vaVar6.L1);
                    vaVar6.L1 = null;
                }
                f7 f7Var4 = vaVar6.L1;
                if (f7Var4 != null && (f7Var4.o || f7Var4.g || (f7Var4.n && !f7Var4.u))) {
                    vaVar6.p(true);
                    break;
                } else {
                    vaVar6.J(0, true);
                    break;
                }
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
        vaVar.d0(vaVar.g0 == 0 ? B : null);
        j71 j71Var = vaVar.W0;
        if (j71Var != null) {
            vaVar.U1 = 0.0f;
            j71Var.b(false, 0.0f);
        }
        vaVar.l0(true);
    }
}
