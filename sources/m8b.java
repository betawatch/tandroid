// default package

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a;
import org.telegram.messenger.camera.CameraView;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final /* synthetic */ class m8b implements CameraView.CameraViewDelegate, qq7, ee, a1d, mcc, i7b, e6b {
    public final /* synthetic */ byte a;
    public final /* synthetic */ v9b b;

    public /* synthetic */ m8b(v9b v9bVar, byte b) {
        this.a = b;
        this.b = v9bVar;
    }

    @Override // qq7
    public final wzc C0(View view, wzc wzcVar) {
        iq5 H0 = gm.H0(wzcVar, false);
        int i = H0.a;
        v9b v9bVar = this.b;
        v9bVar.Z = i;
        v9bVar.a0 = H0.b;
        v9bVar.b0 = H0.c;
        v9bVar.c0 = H0.d;
        v9bVar.n.requestLayout();
        return wzc.b;
    }

    @Override // mcc
    public final void a(uf4 uf4Var) {
        g6b g6bVar;
        lo6 lo6Var;
        if (uf4Var == null || (g6bVar = this.b.L1) == null || (lo6Var = g6bVar.a1) == null) {
            return;
        }
        uf4Var.c(new ni6(lo6Var, (byte) 29));
    }

    @Override // a1d
    public final void b(float f) {
        v9b v9bVar = this.b;
        a9b a9bVar = v9bVar.C0;
        if (a9bVar != null) {
            v9bVar.U1 = f;
            a9bVar.setZoom(f);
        }
        v9bVar.i0(true);
    }

    @Override // i7b
    public final void c(final y7b y7bVar, final boolean z, final boolean z2, boolean z3, final boolean z4, final TLRPC.InputPeer inputPeer, final int i, b7b b7bVar, final nsa nsaVar) {
        int i2 = 0;
        switch (this.a) {
            case 9:
                ArrayList arrayList = y7bVar.b;
                v9b v9bVar = this.b;
                if (v9bVar.L1 != null) {
                    v9bVar.Y0.x(5, true);
                    v9bVar.L1.E0 = y7bVar;
                    int i3 = v9bVar.c;
                    int i4 = c8b.a;
                    SerializedData serializedData = new SerializedData(true);
                    c8b.c(serializedData, y7bVar);
                    SerializedData serializedData2 = new SerializedData(serializedData.length());
                    serializedData.cleanup();
                    c8b.c(serializedData2, y7bVar);
                    oc7.r1(i3).X3.edit().putString("story_privacy2", Utilities.f(serializedData2.toByteArray())).apply();
                    serializedData2.cleanup();
                    g6b g6bVar = v9bVar.L1;
                    g6bVar.G0 = z3;
                    g6bVar.H0 = z2;
                    g6bVar.F0.clear();
                    v9bVar.L1.F0.addAll(arrayList);
                    g6b g6bVar2 = v9bVar.L1;
                    g6bVar2.l = true;
                    g6bVar2.v0 = inputPeer;
                    ArrayList arrayList2 = v9bVar.I1;
                    if (arrayList2 != null) {
                        int size = arrayList2.size();
                        while (i2 < size) {
                            Object obj = arrayList2.get(i2);
                            i2++;
                            g6b g6bVar3 = (g6b) obj;
                            g6bVar3.E0 = y7bVar;
                            ArrayList arrayList3 = g6bVar3.F0;
                            g6bVar3.G0 = z3;
                            g6bVar3.H0 = z2;
                            arrayList3.clear();
                            arrayList3.addAll(arrayList);
                            g6bVar3.l = true;
                            g6bVar3.v0 = inputPeer;
                        }
                    }
                    v9bVar.f(new b7b((Object) v9bVar, (Object) b7bVar, (byte) 3));
                    break;
                }
                break;
            default:
                String[] strArr = z4 ? new String[0] : new String[]{"android.permission.CAMERA", "android.permission.RECORD_AUDIO"};
                final v9b v9bVar2 = this.b;
                use.b(strArr, strArr, new qac() { // from class: k8b
                    @Override // qac
                    public final void a(Object obj2) {
                        boolean z5;
                        final boolean z6;
                        final v9b v9bVar3 = v9b.this;
                        int i5 = v9bVar3.c;
                        boolean booleanValue = ((Boolean) obj2).booleanValue();
                        final nsa nsaVar2 = nsaVar;
                        if (!booleanValue) {
                            nsaVar2.run();
                            return;
                        }
                        a9b a9bVar = v9bVar3.C0;
                        if (a9bVar == null || a9bVar.isFrontface()) {
                            z5 = true;
                            z6 = true;
                        } else {
                            z6 = false;
                            z5 = true;
                        }
                        final TL_stories.TL_startLive tL_startLive = new TL_stories.TL_startLive();
                        tL_startLive.noforwards = z2 ^ z5;
                        TLRPC.InputPeer inputPeer2 = inputPeer;
                        tL_startLive.peer = inputPeer2 == null ? new TLRPC.TL_inputPeerSelf() : inputPeer2;
                        final long e = (inputPeer2 == null || (inputPeer2 instanceof TLRPC.TL_inputPeerSelf)) ? z8c.h(i5).e() : pg3.m(inputPeer2);
                        tL_startLive.privacy_rules.addAll(y7bVar.b);
                        tL_startLive.random_id = Utilities.b.nextLong();
                        final boolean z7 = z4;
                        tL_startLive.rtmp_stream = z7;
                        tL_startLive.messages_enabled = Boolean.valueOf(z);
                        tL_startLive.send_paid_messages_stars = Long.valueOf(i);
                        ConnectionsManager.getInstance(i5).sendRequest(tL_startLive, new RequestDelegate() { // from class: l8b
                            @Override // org.telegram.tgnet.RequestDelegate
                            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                gm.c3(new iua(v9b.this, tLObject, tL_startLive, z7, e, z6, tL_error, nsaVar2));
                            }
                        });
                    }
                });
                break;
        }
    }

    @Override // e6b
    public final Bitmap n(BitmapFactory.Options options) {
        return BitmapFactory.decodeFile(this.b.L1.L.getAbsolutePath(), options);
    }

    @Override // org.telegram.messenger.camera.CameraView.CameraViewDelegate
    public final void onCameraInit() {
        v9b v9bVar = this.b;
        String A = v9bVar.A();
        if (TextUtils.equals(A, v9bVar.D())) {
            A = null;
        }
        v9bVar.d0(v9bVar.g0 == 0 ? A : null);
        b1d b1dVar = v9bVar.W0;
        if (b1dVar != null) {
            v9bVar.U1 = 0.0f;
            b1dVar.b(false, 0.0f);
        }
        v9bVar.l0(true);
    }

    @Override // ee
    public final void r(he heVar, int i) {
        byte b = this.a;
        g6b g6bVar = null;
        v9b v9bVar = this.b;
        switch (b) {
            case 2:
                try {
                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent.setData(Uri.parse("package:" + a.b.getPackageName()));
                    v9bVar.b.startActivity(intent);
                    break;
                } catch (Exception e) {
                    fc4.g(e, true);
                    return;
                }
            case 3:
                try {
                    Intent intent2 = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent2.setData(Uri.parse("package:" + a.b.getPackageName()));
                    v9bVar.b.startActivity(intent2);
                    break;
                } catch (Exception e2) {
                    fc4.g(e2, true);
                    return;
                }
            case 4:
            case 6:
            default:
                try {
                    Intent intent3 = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent3.setData(Uri.parse("package:" + a.b.getPackageName()));
                    v9bVar.b.startActivity(intent3);
                    break;
                } catch (Exception e3) {
                    fc4.g(e3, true);
                    return;
                }
            case 5:
                try {
                    Intent intent4 = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent4.setData(Uri.parse("package:" + a.b.getPackageName()));
                    v9bVar.b.startActivity(intent4);
                    break;
                } catch (Exception e4) {
                    fc4.g(e4, true);
                    return;
                }
            case 7:
                int i2 = v9bVar.c;
                g6b g6bVar2 = v9bVar.L1;
                if (g6bVar2 != null) {
                    g6bVar2.D0 = oc7.r1(i2).f5();
                    v9bVar.W1 = !v9bVar.L1.c;
                    v9bVar.f(null);
                    v9bVar.i();
                    v9bVar.j();
                    v9bVar.w();
                    g6b g6bVar3 = v9bVar.L1;
                    g6bVar3.i(true);
                    g6bVar3.C0 = v9bVar.d1.getText();
                    v9bVar.L1 = null;
                    v9bVar.V(g6bVar3, true);
                    tr3 tr3Var = oc7.r1(i2).N1().w;
                    if (g6bVar3.c) {
                        tr3Var.d(g6bVar3);
                    } else {
                        ArrayList arrayList = tr3Var.b;
                        if (!g6bVar3.u) {
                            tr3Var.e(g6bVar3);
                            g6bVar3.b = Utilities.b.nextLong();
                            sr3 sr3Var = new sr3(g6bVar3);
                            arrayList.remove(g6bVar3);
                            arrayList.add(0, g6bVar3);
                            tr3Var.a(sr3Var);
                        }
                    }
                    v9bVar.I(0, true);
                    break;
                }
                break;
            case 8:
                g6b g6bVar4 = v9bVar.L1;
                if (g6bVar4 == null || g6bVar4.g || ((g6bVar4.n && !g6bVar4.u) || !g6bVar4.c)) {
                    g6bVar = g6bVar4;
                } else {
                    oc7.r1(v9bVar.c).N1().w.b(v9bVar.L1);
                    v9bVar.L1 = null;
                }
                if (g6bVar != null && (g6bVar.o || g6bVar.g || (g6bVar.n && !g6bVar.u))) {
                    v9bVar.o(true);
                    break;
                } else {
                    v9bVar.I(0, true);
                    break;
                }
                break;
        }
    }
}
