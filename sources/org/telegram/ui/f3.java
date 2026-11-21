package org.telegram.ui;

import android.graphics.Bitmap;
import android.graphics.RectF;
import android.location.Location;
import android.location.LocationManager;
import android.os.Parcel;
import android.os.RemoteException;
import android.view.View;
import android.widget.ImageView;
import com.google.android.gms.maps.model.LatLng;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final /* synthetic */ class f3 implements q0.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ f3(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:121:0x03d2, code lost:
    
        if (r7 != 0) goto L118;
     */
    @Override // q0.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void accept(Object obj) {
        a0.h hVar;
        ImageView imageView;
        org.telegram.messenger.pd h;
        int i7;
        int i10 = 3;
        Location location = null;
        switch (this.a) {
            case 0:
                k3 k3Var = (k3) this.b;
                Float f10 = (Float) obj;
                g4 g4Var = k3Var.M;
                if (k3Var == g4Var.v0[0]) {
                    if (g4Var.i0.e0.getCurrentProgress() > f10.floatValue()) {
                        g4Var.i0.e0.a(false, 0.0f);
                    }
                    g4Var.i0.e0.a(true, f10.floatValue());
                    return;
                }
                return;
            case 1:
                ((org.telegram.ui.Components.gi0) this.b).h((List) obj);
                return;
            case 2:
                TLRPC.User user = (TLRPC.User) obj;
                rq rqVar = ((iq) this.b).b;
                lq B0 = rqVar.B0();
                ArrayList arrayList = rqVar.F;
                a0.h hVar2 = rqVar.M;
                ArrayList arrayList2 = (hVar2 == null || hVar2.m() == 0) ? arrayList : rqVar.H;
                if (hVar2 != null) {
                    int m10 = hVar2.m();
                    hVar = hVar2;
                    break;
                }
                hVar = rqVar.K;
                if (hVar.f(user.id) == null) {
                    if (org.telegram.messenger.v3.T(rqVar.n)) {
                        TLRPC.TL_channelParticipant tL_channelParticipant = new TLRPC.TL_channelParticipant();
                        tL_channelParticipant.inviter_id = rqVar.getUserConfig().e();
                        TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                        tL_channelParticipant.peer = tL_peerUser;
                        tL_peerUser.user_id = user.id;
                        tL_channelParticipant.date = rqVar.getConnectionsManager().getCurrentTime();
                        arrayList2.add(0, tL_channelParticipant);
                        hVar.k(tL_channelParticipant, user.id);
                    } else {
                        TLRPC.TL_chatParticipant tL_chatParticipant = new TLRPC.TL_chatParticipant();
                        tL_chatParticipant.user_id = user.id;
                        tL_chatParticipant.inviter_id = rqVar.getUserConfig().e();
                        arrayList2.add(0, tL_chatParticipant);
                        hVar.k(tL_chatParticipant, user.id);
                    }
                }
                if (arrayList2 == arrayList) {
                    Collections.sort(arrayList, new pe(i10));
                }
                rqVar.F0(B0);
                return;
            case 3:
                qa0 qa0Var = (qa0) this.b;
                qa0Var.F = (org.telegram.messenger.da) obj;
                int i11 = org.telegram.messenger.g0.B(qa0Var.getThemedColor(org.telegram.ui.ActionBar.m6.d6)) < 0.721f ? R.raw.mapstyle_night : 0;
                if (i11 != 0) {
                    qa0Var.i0 = true;
                    qa0Var.F.i(((pb.b) org.telegram.messenger.t0.k()).loadRawResourceStyle(org.telegram.messenger.t0.b, i11));
                }
                qa0Var.F.n(org.telegram.messenger.g0.L(70.0f), 0, org.telegram.messenger.g0.L(70.0f), qa0Var.t0());
                if (qa0Var.F != null) {
                    ((ai.l0) ((a8.r7) qa0Var.H).b).animate().alpha(1.0f).setStartDelay(200L).setDuration(100L).setUpdateListener(new a3(qa0Var, 15)).start();
                    float f11 = qa0Var.U0 ? qa0Var.F.f() + 4.0f : qa0Var.F.e() - 4.0f;
                    TLRPC.TL_channelLocation tL_channelLocation = qa0Var.H0;
                    if (tL_channelLocation != null) {
                        TLRPC.GeoPoint geoPoint = tL_channelLocation.geo_point;
                        double d = geoPoint.lat;
                        double d2 = geoPoint._long;
                        ma0 ma0Var = new ma0();
                        if (org.telegram.messenger.n5.E(qa0Var.m0)) {
                            ma0Var.c = qa0Var.getMessagesController().c2(Long.valueOf(qa0Var.m0));
                        } else {
                            ma0Var.d = qa0Var.getMessagesController().O0(Long.valueOf(-qa0Var.m0));
                        }
                        ma0Var.a = qa0Var.m0;
                        qa0Var.H0(ma0Var);
                        try {
                            h9.g1 g1Var = (h9.g1) ((pb.b) org.telegram.messenger.t0.k()).onCreateMarkerOptions();
                            ((m8.g) g1Var.b).a = new LatLng(d, d2);
                            Bitmap n02 = qa0Var.n0(ma0Var);
                            if (n02 != null) {
                                ((m8.g) g1Var.b).d = c8.r9.a(n02);
                                m8.g gVar = (m8.g) g1Var.b;
                                gVar.e = 0.5f;
                                gVar.f = 0.8010882f;
                                ma0Var.e = qa0Var.F.a(g1Var);
                                if (!org.telegram.messenger.o10.C(ma0Var.c)) {
                                    h9.g1 g1Var2 = (h9.g1) ((pb.b) org.telegram.messenger.t0.k()).onCreateMarkerOptions();
                                    ((m8.g) g1Var2.b).a = new LatLng(d, d2);
                                    m8.g gVar2 = (m8.g) g1Var2.b;
                                    gVar2.r = true;
                                    gVar2.d = c8.r9.b(R.drawable.map_pin_circle);
                                    m8.g gVar3 = (m8.g) g1Var2.b;
                                    gVar3.e = 0.5f;
                                    gVar3.f = 0.5f;
                                    ma0Var.f = qa0Var.F.a(g1Var2);
                                }
                                qa0Var.o0.add(ma0Var);
                                qa0Var.p0.k(ma0Var, ma0Var.a);
                            }
                        } catch (Exception e10) {
                            org.telegram.messenger.a8.g(e10, true);
                        }
                        qa0Var.F.h(((pb.b) org.telegram.messenger.t0.k()).newCameraUpdateLatLngZoom(ma0Var.e.a(), f11));
                    } else {
                        org.telegram.messenger.fj fjVar = qa0Var.J0;
                        if (fjVar == null) {
                            Location location2 = new Location("network");
                            qa0Var.A0 = location2;
                            TLRPC.TL_channelLocation tL_channelLocation2 = qa0Var.I0;
                            if (tL_channelLocation2 != null) {
                                TLRPC.GeoPoint geoPoint2 = tL_channelLocation2.geo_point;
                                qa0Var.F.h(((pb.b) org.telegram.messenger.t0.k()).newCameraUpdateLatLngZoom(new org.telegram.messenger.ab(geoPoint2.lat, geoPoint2._long), f11));
                                qa0Var.A0.setLatitude(qa0Var.I0.geo_point.lat);
                                qa0Var.A0.setLongitude(qa0Var.I0.geo_point._long);
                                qa0Var.A0.setAccuracy(qa0Var.I0.geo_point.accuracy_radius);
                                qa0Var.Q.L(qa0Var.A0);
                            } else {
                                location2.setLatitude(20.659322d);
                                qa0Var.A0.setLongitude(-11.40625d);
                            }
                        } else if (fjVar.C3()) {
                            ma0 i02 = qa0Var.i0(qa0Var.J0.k);
                            if (!qa0Var.v0()) {
                                qa0Var.F.h(((pb.b) org.telegram.messenger.t0.k()).newCameraUpdateLatLngZoom(i02.e.a(), f11));
                            }
                        } else {
                            double latitude = qa0Var.A0.getLatitude();
                            double longitude = qa0Var.A0.getLongitude();
                            org.telegram.messenger.ab abVar = new org.telegram.messenger.ab(latitude, longitude);
                            try {
                                org.telegram.messenger.da daVar = qa0Var.F;
                                h9.g1 g1Var3 = (h9.g1) ((pb.b) org.telegram.messenger.t0.k()).onCreateMarkerOptions();
                                ((m8.g) g1Var3.b).a = new LatLng(latitude, longitude);
                                ((m8.g) g1Var3.b).d = c8.r9.b(R.drawable.map_pin2);
                                daVar.a(g1Var3);
                            } catch (Exception e11) {
                                org.telegram.messenger.a8.g(e11, true);
                            }
                            qa0Var.F.h(((pb.b) org.telegram.messenger.t0.k()).newCameraUpdateLatLngZoom(abVar, f11));
                            qa0Var.n0 = false;
                            qa0Var.v0();
                        }
                    }
                    qa0Var.F.g().w2();
                    qa0Var.F.g().B2();
                    qa0Var.F.g().r2();
                    qa0Var.F.l(new da0(qa0Var, 7));
                    qa0Var.F.m(new m60(i10));
                    org.telegram.messenger.da daVar2 = qa0Var.F;
                    aa0 aa0Var = new aa0(qa0Var, 6);
                    k8.a aVar = daVar2.a;
                    org.telegram.messenger.j1 j1Var = new org.telegram.messenger.j1(aa0Var, 7);
                    l8.e eVar = (l8.e) aVar.b;
                    try {
                        k8.c cVar = new k8.c(j1Var, 0);
                        Parcel p12 = eVar.p1();
                        v7.b.c(p12, cVar);
                        eVar.t1(p12, 97);
                        LocationManager locationManager = (LocationManager) org.telegram.messenger.t0.b.getSystemService("location");
                        List<String> providers = locationManager.getProviders(true);
                        for (int size = providers.size() - 1; size >= 0; size--) {
                            location = locationManager.getLastKnownLocation(providers.get(size));
                            if (location != null) {
                                qa0Var.z0 = location;
                                qa0Var.E0(location);
                                qa0Var.K0();
                                qa0Var.L0();
                                if (qa0Var.j0 && qa0Var.getParentActivity() != null) {
                                    qa0Var.j0 = false;
                                    qa0Var.l0();
                                }
                                imageView = qa0Var.c;
                                if (imageView != null && imageView.getVisibility() == 0 && (h = qa0Var.getLocationController().h(qa0Var.m0)) != null && (i7 = h.f) > 0) {
                                    qa0Var.m0(i7);
                                }
                            }
                        }
                        qa0Var.z0 = location;
                        qa0Var.E0(location);
                        qa0Var.K0();
                        qa0Var.L0();
                        if (qa0Var.j0) {
                            qa0Var.j0 = false;
                            qa0Var.l0();
                        }
                        imageView = qa0Var.c;
                        if (imageView != null) {
                            qa0Var.m0(i7);
                        }
                    } catch (RemoteException e12) {
                        throw new androidx.car.app.j(e12);
                    }
                }
                org.telegram.messenger.g0.g3(new aa0(qa0Var, 5));
                return;
            case 4:
                r3 r3Var = (r3) this.b;
                int i12 = ((f5.f) obj).a;
                org.telegram.messenger.g0.g3(new h60(27, r3Var, i12 != 0 ? org.telegram.messenger.r1.j(i12) : null));
                return;
            case 5:
                wf0 wf0Var = (wf0) this.b;
                if (((f5.f) obj).a == 0) {
                    org.telegram.messenger.g0.g3(wf0Var);
                    return;
                }
                return;
            case 6:
                RectF rectF = ProfileActivity.Z6;
                ((ArrayList) this.b).add((TLRPC.User) obj);
                return;
            case 7:
                ProfileActivity profileActivity = (ProfileActivity) this.b;
                TLRPC.User user2 = (TLRPC.User) obj;
                for (int i13 = 0; i13 < profileActivity.v2.participants.participants.size(); i13++) {
                    if (profileActivity.v2.participants.participants.get(i13).user_id == user2.id) {
                        profileActivity.v2.participants.participants.remove(i13);
                        profileActivity.H5(true, false);
                        return;
                    }
                }
                return;
            default:
                View view = ((ProxyListActivity) this.b).b.T((View) obj).a;
                if (view instanceof rx0) {
                    rx0 rx0Var = (rx0) view;
                    rx0Var.setChecked(rx0Var.d == org.telegram.messenger.bz.B1);
                    rx0Var.b();
                    return;
                }
                return;
        }
    }
}
