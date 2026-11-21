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
import org.telegram.ui.Components.e81;
import org.telegram.ui.Components.ez;
import org.telegram.ui.Components.f81;
import org.telegram.ui.Components.x51;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes4.dex */
public final /* synthetic */ class a9 implements CameraView.CameraViewDelegate, r0.m, org.telegram.ui.ActionBar.q1, e81, x51, v7, a7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ sa b;

    public /* synthetic */ a9(sa saVar, int i7) {
        this.a = i7;
        this.b = saVar;
    }

    @Override // r0.m
    public r0.l1 P0(View view, r0.l1 l1Var) {
        i0.b I0 = org.telegram.messenger.g0.I0(l1Var, false);
        int i7 = I0.a;
        sa saVar = this.b;
        saVar.Z = i7;
        saVar.a0 = I0.b;
        saVar.b0 = I0.c;
        saVar.c0 = I0.d;
        saVar.n.requestLayout();
        return r0.l1.b;
    }

    @Override // org.telegram.ui.Components.x51
    public void a(ez ezVar) {
        ff ffVar;
        sa saVar = this.b;
        if (ezVar == null) {
            saVar.getClass();
            return;
        }
        c7 c7Var = saVar.L1;
        if (c7Var == null || (ffVar = c7Var.a1) == null) {
            return;
        }
        ezVar.d(new org.telegram.ui.Cells.c5(ffVar));
    }

    @Override // org.telegram.ui.Components.e81
    public void b(float f10) {
        sa saVar = this.b;
        v9 v9Var = saVar.C0;
        if (v9Var != null) {
            saVar.U1 = f10;
            v9Var.setZoom(f10);
        }
        saVar.i0(true);
    }

    @Override // hi.a7
    public Bitmap c(BitmapFactory.Options options) {
        return BitmapFactory.decodeFile(this.b.L1.L.getAbsolutePath(), options);
    }

    @Override // hi.v7
    public void g(final n8 n8Var, final boolean z10, final boolean z11, boolean z12, final boolean z13, final TLRPC.InputPeer inputPeer, final int i7, c cVar, final l lVar) {
        int i10 = 0;
        switch (this.a) {
            case 9:
                ArrayList arrayList = n8Var.b;
                sa saVar = this.b;
                if (saVar.L1 != null) {
                    saVar.Y0.x(5, true);
                    saVar.L1.E0 = n8Var;
                    int i11 = saVar.c;
                    int i12 = q8.a;
                    SerializedData serializedData = new SerializedData(true);
                    q8.c(serializedData, n8Var);
                    SerializedData serializedData2 = new SerializedData(serializedData.length());
                    serializedData.cleanup();
                    q8.c(serializedData2, n8Var);
                    mp.u1(i11).h7.edit().putString("story_privacy2", Utilities.f(serializedData2.toByteArray())).apply();
                    serializedData2.cleanup();
                    c7 c7Var = saVar.L1;
                    c7Var.G0 = z12;
                    c7Var.H0 = z11;
                    c7Var.F0.clear();
                    saVar.L1.F0.addAll(arrayList);
                    c7 c7Var2 = saVar.L1;
                    c7Var2.l = true;
                    c7Var2.v0 = inputPeer;
                    ArrayList arrayList2 = saVar.I1;
                    if (arrayList2 != null) {
                        int size = arrayList2.size();
                        int i13 = 0;
                        while (i13 < size) {
                            Object obj = arrayList2.get(i13);
                            i13++;
                            c7 c7Var3 = (c7) obj;
                            c7Var3.E0 = n8Var;
                            ArrayList arrayList3 = c7Var3.F0;
                            c7Var3.G0 = z12;
                            c7Var3.H0 = z11;
                            arrayList3.clear();
                            arrayList3.addAll(arrayList);
                            c7Var3.l = true;
                            c7Var3.v0 = inputPeer;
                        }
                    }
                    saVar.h(new x8(saVar, cVar, i10));
                    break;
                }
                break;
            default:
                String[] strArr = z13 ? new String[0] : new String[]{"android.permission.CAMERA", "android.permission.RECORD_AUDIO"};
                final sa saVar2 = this.b;
                c8.na.b(strArr, new x10() { // from class: hi.y8
                    @Override // org.telegram.messenger.x10
                    public final void a(Object obj2) {
                        boolean z14;
                        final boolean z15;
                        final sa saVar3 = sa.this;
                        int i14 = saVar3.c;
                        boolean booleanValue = ((Boolean) obj2).booleanValue();
                        final l lVar2 = lVar;
                        if (!booleanValue) {
                            lVar2.run();
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
                        final long e10 = (inputPeer2 == null || (inputPeer2 instanceof TLRPC.TL_inputPeerSelf)) ? j10.i(i14).e() : org.telegram.messenger.n5.n(inputPeer2);
                        tL_startLive.privacy_rules.addAll(n8Var.b);
                        tL_startLive.random_id = Utilities.b.nextLong();
                        final boolean z16 = z13;
                        tL_startLive.rtmp_stream = z16;
                        tL_startLive.messages_enabled = Boolean.valueOf(z10);
                        tL_startLive.send_paid_messages_stars = Long.valueOf(i7);
                        ConnectionsManager.getInstance(i14).sendRequest(tL_startLive, new RequestDelegate() { // from class: hi.z8
                            @Override // org.telegram.tgnet.RequestDelegate
                            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                org.telegram.messenger.g0.g3(new di.r7(sa.this, tLObject, tL_startLive, z16, e10, z15, tL_error, lVar2));
                            }
                        });
                    }
                });
                break;
        }
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
                c7 c7Var = saVar5.L1;
                if (c7Var != null) {
                    c7Var.D0 = mp.u1(i10).j5();
                    saVar5.W1 = !saVar5.L1.c;
                    saVar5.h(null);
                    saVar5.k();
                    saVar5.l();
                    saVar5.x();
                    c7 c7Var2 = saVar5.L1;
                    c7Var2.i(true);
                    c7Var2.C0 = saVar5.d1.getText();
                    saVar5.L1 = null;
                    saVar5.V(c7Var2, true);
                    b1 b1Var = mp.u1(i10).R1().w;
                    if (c7Var2.c) {
                        b1Var.d(c7Var2);
                    } else {
                        ArrayList arrayList = b1Var.b;
                        if (!c7Var2.u) {
                            b1Var.e(c7Var2);
                            c7Var2.b = Utilities.b.nextLong();
                            a1 a1Var = new a1(c7Var2);
                            arrayList.remove(c7Var2);
                            arrayList.add(0, c7Var2);
                            b1Var.a(a1Var);
                        }
                    }
                    saVar5.J(0, true);
                    break;
                }
                break;
            case 8:
                sa saVar6 = this.b;
                c7 c7Var3 = saVar6.L1;
                if (c7Var3 != null && !c7Var3.g && ((!c7Var3.n || c7Var3.u) && c7Var3.c)) {
                    mp.u1(saVar6.c).R1().w.b(saVar6.L1);
                    saVar6.L1 = null;
                }
                c7 c7Var4 = saVar6.L1;
                if (c7Var4 != null && (c7Var4.o || c7Var4.g || (c7Var4.n && !c7Var4.u))) {
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
        f81 f81Var = saVar.W0;
        if (f81Var != null) {
            saVar.U1 = 0.0f;
            f81Var.b(false, 0.0f);
        }
        saVar.l0(true);
    }
}
