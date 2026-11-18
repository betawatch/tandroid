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
import org.telegram.messenger.j10;
import org.telegram.messenger.mp;
import org.telegram.messenger.x10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.b81;
import org.telegram.ui.Components.c81;
import org.telegram.ui.Components.cz;
import org.telegram.ui.Components.u51;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes4.dex */
public final /* synthetic */ class b9 implements CameraView.CameraViewDelegate, r0.m, org.telegram.ui.ActionBar.r1, b81, u51, w7, b7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ta b;

    public /* synthetic */ b9(ta taVar, int i7) {
        this.a = i7;
        this.b = taVar;
    }

    @Override // r0.m
    public r0.l1 P0(View view, r0.l1 l1Var) {
        i0.b I0 = org.telegram.messenger.g0.I0(l1Var, false);
        int i7 = I0.a;
        ta taVar = this.b;
        taVar.Z = i7;
        taVar.a0 = I0.b;
        taVar.b0 = I0.c;
        taVar.c0 = I0.d;
        taVar.n.requestLayout();
        return r0.l1.b;
    }

    @Override // org.telegram.ui.Components.u51
    public void a(cz czVar) {
        ff ffVar;
        ta taVar = this.b;
        if (czVar == null) {
            taVar.getClass();
            return;
        }
        d7 d7Var = taVar.L1;
        if (d7Var == null || (ffVar = d7Var.a1) == null) {
            return;
        }
        czVar.d(new org.telegram.ui.Cells.c5(ffVar));
    }

    @Override // org.telegram.ui.Components.b81
    public void b(float f10) {
        ta taVar = this.b;
        w9 w9Var = taVar.C0;
        if (w9Var != null) {
            taVar.U1 = f10;
            w9Var.setZoom(f10);
        }
        taVar.i0(true);
    }

    @Override // hi.b7
    public Bitmap c(BitmapFactory.Options options) {
        return BitmapFactory.decodeFile(this.b.L1.L.getAbsolutePath(), options);
    }

    @Override // org.telegram.ui.ActionBar.r1
    public void h(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        switch (this.a) {
            case 2:
                ta taVar = this.b;
                taVar.getClass();
                try {
                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent.setData(Uri.parse("package:" + org.telegram.messenger.t0.b.getPackageName()));
                    taVar.b.startActivity(intent);
                    break;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return;
                }
            case 3:
                ta taVar2 = this.b;
                taVar2.getClass();
                try {
                    Intent intent2 = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent2.setData(Uri.parse("package:" + org.telegram.messenger.t0.b.getPackageName()));
                    taVar2.b.startActivity(intent2);
                    break;
                } catch (Exception e11) {
                    org.telegram.messenger.a8.g(e11, true);
                    return;
                }
            case 4:
            case 6:
            default:
                ta taVar3 = this.b;
                try {
                    Intent intent3 = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent3.setData(Uri.parse("package:" + org.telegram.messenger.t0.b.getPackageName()));
                    taVar3.b.startActivity(intent3);
                    break;
                } catch (Exception e12) {
                    org.telegram.messenger.a8.g(e12, true);
                }
            case 5:
                ta taVar4 = this.b;
                taVar4.getClass();
                try {
                    Intent intent4 = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent4.setData(Uri.parse("package:" + org.telegram.messenger.t0.b.getPackageName()));
                    taVar4.b.startActivity(intent4);
                    break;
                } catch (Exception e13) {
                    org.telegram.messenger.a8.g(e13, true);
                    return;
                }
            case 7:
                ta taVar5 = this.b;
                int i10 = taVar5.c;
                d7 d7Var = taVar5.L1;
                if (d7Var != null) {
                    d7Var.D0 = mp.u1(i10).j5();
                    taVar5.W1 = !taVar5.L1.c;
                    taVar5.h(null);
                    taVar5.k();
                    taVar5.l();
                    taVar5.x();
                    d7 d7Var2 = taVar5.L1;
                    d7Var2.i(true);
                    d7Var2.C0 = taVar5.d1.getText();
                    taVar5.L1 = null;
                    taVar5.V(d7Var2, true);
                    b1 b1Var = mp.u1(i10).R1().w;
                    if (d7Var2.c) {
                        b1Var.d(d7Var2);
                    } else {
                        ArrayList arrayList = b1Var.b;
                        if (!d7Var2.u) {
                            b1Var.e(d7Var2);
                            d7Var2.b = Utilities.b.nextLong();
                            a1 a1Var = new a1(d7Var2);
                            arrayList.remove(d7Var2);
                            arrayList.add(0, d7Var2);
                            b1Var.a(a1Var);
                        }
                    }
                    taVar5.J(0, true);
                    break;
                }
                break;
            case 8:
                ta taVar6 = this.b;
                d7 d7Var3 = taVar6.L1;
                if (d7Var3 != null && !d7Var3.g && ((!d7Var3.n || d7Var3.u) && d7Var3.c)) {
                    mp.u1(taVar6.c).R1().w.b(taVar6.L1);
                    taVar6.L1 = null;
                }
                d7 d7Var4 = taVar6.L1;
                if (d7Var4 != null && (d7Var4.o || d7Var4.g || (d7Var4.n && !d7Var4.u))) {
                    taVar6.p(true);
                    break;
                } else {
                    taVar6.J(0, true);
                    break;
                }
                break;
        }
    }

    @Override // hi.w7
    public void i(final o8 o8Var, final boolean z10, final boolean z11, boolean z12, final boolean z13, final TLRPC.InputPeer inputPeer, final int i7, r1 r1Var, final k kVar) {
        int i10 = 0;
        switch (this.a) {
            case 9:
                ArrayList arrayList = o8Var.b;
                ta taVar = this.b;
                if (taVar.L1 != null) {
                    taVar.Y0.x(5, true);
                    taVar.L1.E0 = o8Var;
                    int i11 = taVar.c;
                    int i12 = r8.a;
                    SerializedData serializedData = new SerializedData(true);
                    r8.c(serializedData, o8Var);
                    SerializedData serializedData2 = new SerializedData(serializedData.length());
                    serializedData.cleanup();
                    r8.c(serializedData2, o8Var);
                    mp.u1(i11).h7.edit().putString("story_privacy2", Utilities.f(serializedData2.toByteArray())).apply();
                    serializedData2.cleanup();
                    d7 d7Var = taVar.L1;
                    d7Var.G0 = z12;
                    d7Var.H0 = z11;
                    d7Var.F0.clear();
                    taVar.L1.F0.addAll(arrayList);
                    d7 d7Var2 = taVar.L1;
                    d7Var2.l = true;
                    d7Var2.v0 = inputPeer;
                    ArrayList arrayList2 = taVar.I1;
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
                    taVar.h(new y8(taVar, r1Var, i10));
                    break;
                }
                break;
            default:
                String[] strArr = z13 ? new String[0] : new String[]{"android.permission.CAMERA", "android.permission.RECORD_AUDIO"};
                final ta taVar2 = this.b;
                c8.na.b(strArr, new x10() { // from class: hi.z8
                    @Override // org.telegram.messenger.x10
                    public final void a(Object obj2) {
                        boolean z14;
                        final boolean z15;
                        final ta taVar3 = ta.this;
                        int i14 = taVar3.c;
                        boolean booleanValue = ((Boolean) obj2).booleanValue();
                        final k kVar2 = kVar;
                        if (!booleanValue) {
                            kVar2.run();
                            return;
                        }
                        w9 w9Var = taVar3.C0;
                        if (w9Var == null || w9Var.isFrontface()) {
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
                        final long e10 = (inputPeer2 == null || (inputPeer2 instanceof TLRPC.TL_inputPeerSelf)) ? j10.i(i14).e() : org.telegram.messenger.n5.n(inputPeer2);
                        tL_startLive.privacy_rules.addAll(o8Var.b);
                        tL_startLive.random_id = Utilities.b.nextLong();
                        final boolean z16 = z13;
                        tL_startLive.rtmp_stream = z16;
                        tL_startLive.messages_enabled = Boolean.valueOf(z10);
                        tL_startLive.send_paid_messages_stars = Long.valueOf(i7);
                        ConnectionsManager.getInstance(i14).sendRequest(tL_startLive, new RequestDelegate() { // from class: hi.a9
                            @Override // org.telegram.tgnet.RequestDelegate
                            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                org.telegram.messenger.g0.g3(new di.r7(ta.this, tLObject, tL_startLive, z16, e10, z15, tL_error, kVar2));
                            }
                        });
                    }
                });
                break;
        }
    }

    @Override // org.telegram.messenger.camera.CameraView.CameraViewDelegate
    public void onCameraInit() {
        ta taVar = this.b;
        String B = taVar.B();
        if (TextUtils.equals(B, taVar.E())) {
            B = null;
        }
        taVar.d0(taVar.g0 == 0 ? B : null);
        c81 c81Var = taVar.W0;
        if (c81Var != null) {
            taVar.U1 = 0.0f;
            c81Var.b(false, 0.0f);
        }
        taVar.l0(true);
    }
}
