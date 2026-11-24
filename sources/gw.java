// default package

import android.animation.ValueAnimator;
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
import org.telegram.messenger.a;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.ProxyListActivity;
import org.telegram.ui.m;
import org.telegram.ui.o;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class gw implements vs2 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ gw(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:142:0x046f, code lost:
    
        if (r4 == 0) goto L130;
     */
    @Override // vs2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void accept(Object obj) {
        vf6 vf6Var;
        ImageView imageView;
        db6 h;
        int i;
        byte b = this.a;
        byte b2 = 25;
        Location location = null;
        byte b3 = 1;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                m mVar = (m) obj2;
                Float f = (Float) obj;
                o oVar = mVar.M;
                if (mVar == oVar.v0[0]) {
                    if (oVar.i0.e0.getCurrentProgress() > f.floatValue()) {
                        oVar.i0.e0.a(false, 0.0f);
                    }
                    oVar.i0.e0.a(true, f.floatValue());
                    break;
                }
                break;
            case 1:
                ow0 ow0Var = (ow0) obj2;
                Float f2 = (Float) obj;
                ow0Var.F.setLoadProgressAnimated(f2.floatValue());
                if (f2.floatValue() == 1.0f) {
                    ValueAnimator duration = ValueAnimator.ofFloat(1.0f, 0.0f).setDuration(200L);
                    duration.setInterpolator(s33.f);
                    duration.addUpdateListener(new kv0(ow0Var, (byte) 1));
                    duration.addListener(new g0(ow0Var, b2));
                    duration.start();
                    break;
                }
                break;
            case 2:
                m21 m21Var = (m21) obj2;
                Float f3 = (Float) obj;
                i11 i11Var = m21Var.p;
                if (i11Var != null) {
                    if (!m21Var.e.top) {
                        i11Var.b(r12.getHeight() - f3.floatValue());
                        break;
                    }
                }
                break;
            case 3:
                ((a09) obj2).d((List) obj);
                break;
            case 4:
                v02 v02Var = ((x02) obj2).W3;
                if (v02Var != null) {
                    v02Var.P0(obj);
                    break;
                }
                break;
            case 5:
                s12 s12Var = (s12) obj2;
                Float f4 = (Float) obj;
                s12Var.J.setLoadProgressAnimated(f4.floatValue());
                if (f4.floatValue() == 1.0f) {
                    ValueAnimator duration2 = ValueAnimator.ofFloat(1.0f, 0.0f).setDuration(200L);
                    duration2.setInterpolator(s33.f);
                    duration2.addUpdateListener(new j12(s12Var, b3));
                    duration2.addListener(new bb1((Object) s12Var, (byte) 14));
                    duration2.start();
                    s12Var.Q();
                    break;
                }
                break;
            case 6:
                TLRPC.User user = (TLRPC.User) obj;
                kf2 kf2Var = ((bf2) obj2).b;
                ef2 z0 = kf2Var.z0();
                ArrayList arrayList = kf2Var.F;
                vf6 vf6Var2 = kf2Var.M;
                ArrayList arrayList2 = (vf6Var2 == null || vf6Var2.m() == 0) ? arrayList : kf2Var.H;
                if (vf6Var2 != null) {
                    int m = vf6Var2.m();
                    vf6Var = vf6Var2;
                    break;
                }
                vf6Var = kf2Var.K;
                if (vf6Var.f(user.id) == null) {
                    if (hc2.T(kf2Var.n)) {
                        TLRPC.TL_channelParticipant tL_channelParticipant = new TLRPC.TL_channelParticipant();
                        tL_channelParticipant.inviter_id = kf2Var.getUserConfig().e();
                        TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                        tL_channelParticipant.peer = tL_peerUser;
                        tL_peerUser.user_id = user.id;
                        tL_channelParticipant.date = kf2Var.getConnectionsManager().getCurrentTime();
                        arrayList2.add(0, tL_channelParticipant);
                        vf6Var.k(tL_channelParticipant, user.id);
                    } else {
                        TLRPC.TL_chatParticipant tL_chatParticipant = new TLRPC.TL_chatParticipant();
                        tL_chatParticipant.user_id = user.id;
                        tL_chatParticipant.inviter_id = kf2Var.getUserConfig().e();
                        arrayList2.add(0, tL_chatParticipant);
                        vf6Var.k(tL_chatParticipant, user.id);
                    }
                }
                if (arrayList2 == arrayList) {
                    Collections.sort(arrayList, new sa((byte) 26));
                }
                kf2Var.C0(z0);
                break;
            case 7:
                qx qxVar = (qx) obj2;
                int intValue = ((Integer) obj).intValue();
                switch (qxVar.a) {
                    case 5:
                        q88 q88Var = (q88) qxVar.d;
                        q88Var.y0(false);
                        k38 k38Var = q88Var.L1;
                        k38Var.h(intValue, true);
                        k38Var.g();
                        q88Var.setNewColor(intValue);
                        nw5 nw5Var = q88Var.w1;
                        nw5Var.setSelectedColorIndex(k38Var.d());
                        nw5Var.getAdapter().f();
                        break;
                    default:
                        x6b x6bVar = (x6b) qxVar.d;
                        x6bVar.I0(false);
                        k38 k38Var2 = (k38) qxVar.c;
                        k38Var2.h(intValue, true);
                        k38Var2.g();
                        x6bVar.setNewColor(intValue);
                        it7 it7Var = x6bVar.m1;
                        it7Var.setSelectedColorIndex(k38Var2.d());
                        it7Var.getAdapter().f();
                        break;
                }
            case 8:
                ((oj3) obj2).S.P4(((Float) obj).floatValue());
                break;
            case 9:
                qa6 qa6Var = (qa6) obj2;
                qa6Var.F = (ty4) obj;
                int i2 = gl.B(qa6Var.getThemedColor(bkb.c6)) < 0.721f ? R.raw.mapstyle_night : 0;
                if (i2 != 0) {
                    qa6Var.i0 = true;
                    qa6Var.F.i(((ize) a.j()).loadRawResourceStyle(a.b, i2));
                }
                qa6Var.F.n(gl.L(70.0f), 0, gl.L(70.0f), qa6Var.n0());
                if (qa6Var.F != null) {
                    ((st) ((gl2) qa6Var.H).b).animate().alpha(1.0f).setStartDelay(200L).setDuration(100L).setUpdateListener(new ni4(qa6Var, (byte) 22)).start();
                    boolean z = qa6Var.U0;
                    ty4 ty4Var = qa6Var.F;
                    float f5 = z ? ty4Var.f() + 4.0f : ty4Var.e() - 4.0f;
                    TLRPC.TL_channelLocation tL_channelLocation = qa6Var.H0;
                    if (tL_channelLocation != null) {
                        TLRPC.GeoPoint geoPoint = tL_channelLocation.geo_point;
                        double d = geoPoint.lat;
                        double d2 = geoPoint._long;
                        la6 la6Var = new la6();
                        if (cf3.D(qa6Var.m0)) {
                            la6Var.c = qa6Var.getMessagesController().V1(Long.valueOf(qa6Var.m0));
                        } else {
                            la6Var.d = qa6Var.getMessagesController().K0(Long.valueOf(-qa6Var.m0));
                        }
                        la6Var.a = qa6Var.m0;
                        qa6Var.G0(la6Var);
                        try {
                            z24 z24Var = (z24) ((ize) a.j()).onCreateMarkerOptions();
                            ((zi6) z24Var.b).a = new LatLng(d, d2);
                            Bitmap h0 = qa6Var.h0(la6Var);
                            if (h0 != null) {
                                ((zi6) z24Var.b).d = eod.a(h0);
                                zi6 zi6Var = (zi6) z24Var.b;
                                zi6Var.e = 0.5f;
                                zi6Var.f = 0.8010882f;
                                la6Var.e = qa6Var.F.a(z24Var);
                                if (!l7c.C(la6Var.c)) {
                                    z24 z24Var2 = (z24) ((ize) a.j()).onCreateMarkerOptions();
                                    ((zi6) z24Var2.b).a = new LatLng(d, d2);
                                    zi6 zi6Var2 = (zi6) z24Var2.b;
                                    zi6Var2.r = true;
                                    zi6Var2.d = eod.b(R.drawable.map_pin_circle);
                                    zi6 zi6Var3 = (zi6) z24Var2.b;
                                    zi6Var3.e = 0.5f;
                                    zi6Var3.f = 0.5f;
                                    la6Var.f = qa6Var.F.a(z24Var2);
                                }
                                qa6Var.o0.add(la6Var);
                                qa6Var.p0.k(la6Var, la6Var.a);
                            }
                        } catch (Exception e) {
                            fa4.g(e, true);
                        }
                        qa6Var.F.h(((ize) a.j()).newCameraUpdateLatLngZoom(la6Var.e.a(), f5));
                    } else {
                        k27 k27Var = qa6Var.J0;
                        if (k27Var == null) {
                            Location location2 = new Location("network");
                            qa6Var.A0 = location2;
                            TLRPC.TL_channelLocation tL_channelLocation2 = qa6Var.I0;
                            if (tL_channelLocation2 != null) {
                                TLRPC.GeoPoint geoPoint2 = tL_channelLocation2.geo_point;
                                qa6Var.F.h(((ize) a.j()).newCameraUpdateLatLngZoom(new yh5(geoPoint2.lat, geoPoint2._long), f5));
                                qa6Var.A0.setLatitude(qa6Var.I0.geo_point.lat);
                                qa6Var.A0.setLongitude(qa6Var.I0.geo_point._long);
                                qa6Var.A0.setAccuracy(qa6Var.I0.geo_point.accuracy_radius);
                                qa6Var.Q.L(qa6Var.A0);
                            } else {
                                location2.setLatitude(20.659322d);
                                qa6Var.A0.setLongitude(-11.40625d);
                            }
                        } else if (k27Var.C3()) {
                            la6 b0 = qa6Var.b0(qa6Var.J0.k);
                            if (!qa6Var.p0()) {
                                qa6Var.F.h(((ize) a.j()).newCameraUpdateLatLngZoom(b0.e.a(), f5));
                            }
                        } else {
                            double latitude = qa6Var.A0.getLatitude();
                            double longitude = qa6Var.A0.getLongitude();
                            yh5 yh5Var = new yh5(latitude, longitude);
                            try {
                                ty4 ty4Var2 = qa6Var.F;
                                z24 z24Var3 = (z24) ((ize) a.j()).onCreateMarkerOptions();
                                ((zi6) z24Var3.b).a = new LatLng(latitude, longitude);
                                ((zi6) z24Var3.b).d = eod.b(R.drawable.map_pin2);
                                ty4Var2.a(z24Var3);
                            } catch (Exception e2) {
                                fa4.g(e2, true);
                            }
                            qa6Var.F.h(((ize) a.j()).newCameraUpdateLatLngZoom(yh5Var, f5));
                            qa6Var.n0 = false;
                            qa6Var.p0();
                        }
                    }
                    qa6Var.F.g().Z();
                    qa6Var.F.g().b0();
                    qa6Var.F.g().Y();
                    qa6Var.F.l(new z96(qa6Var, (byte) 7));
                    qa6Var.F.m(new k32((byte) 1));
                    ty4 ty4Var3 = qa6Var.F;
                    t96 t96Var = new t96(qa6Var, (byte) 6);
                    wk4 wk4Var = ty4Var3.a;
                    ry4 ry4Var = new ry4(t96Var, b3);
                    wk4Var.getClass();
                    try {
                        a6e a6eVar = (a6e) wk4Var.b;
                        r4d r4dVar = new r4d(ry4Var, 0);
                        Parcel R = a6eVar.R();
                        sgd.c(R, r4dVar);
                        a6eVar.V(R, 97);
                        LocationManager locationManager = (LocationManager) a.b.getSystemService("location");
                        List<String> providers = locationManager.getProviders(true);
                        for (int size = providers.size() - 1; size >= 0; size--) {
                            location = locationManager.getLastKnownLocation(providers.get(size));
                            if (location != null) {
                                qa6Var.z0 = location;
                                qa6Var.D0(location);
                                qa6Var.J0();
                                qa6Var.K0();
                                if (qa6Var.j0 && qa6Var.getParentActivity() != null) {
                                    qa6Var.j0 = false;
                                    qa6Var.f0();
                                }
                                imageView = qa6Var.c;
                                if (imageView != null && imageView.getVisibility() == 0 && (h = qa6Var.getLocationController().h(qa6Var.m0)) != null && (i = h.f) > 0) {
                                    qa6Var.g0(i);
                                }
                            }
                        }
                        qa6Var.z0 = location;
                        qa6Var.D0(location);
                        qa6Var.J0();
                        qa6Var.K0();
                        if (qa6Var.j0) {
                            qa6Var.j0 = false;
                            qa6Var.f0();
                        }
                        imageView = qa6Var.c;
                        if (imageView != null) {
                            qa6Var.g0(i);
                        }
                    } catch (RemoteException e3) {
                        fvc.g(e3);
                        return;
                    }
                }
                gl.d3(new t96(qa6Var, (byte) 5));
                break;
            case 10:
                hj3 hj3Var = (hj3) obj2;
                int i3 = ((fi0) obj).a;
                gl.d3(new kz5(hj3Var, i3 != 0 ? ci0.i(i3) : null, b2));
                break;
            case 11:
                ((x6b) obj2).w0((Integer) obj);
                break;
            case 12:
                kv1 kv1Var = (kv1) obj2;
                if (((fi0) obj).a == 0) {
                    gl.d3(kv1Var);
                    break;
                }
                break;
            case 13:
                RectF rectF = ProfileActivity.Z6;
                ((ArrayList) obj2).add((TLRPC.User) obj);
                break;
            case 14:
                ProfileActivity profileActivity = (ProfileActivity) obj2;
                TLRPC.User user2 = (TLRPC.User) obj;
                RectF rectF2 = ProfileActivity.Z6;
                for (int i4 = 0; i4 < profileActivity.v2.participants.participants.size(); i4++) {
                    if (profileActivity.v2.participants.participants.get(i4).user_id == user2.id) {
                        profileActivity.v2.participants.participants.remove(i4);
                        profileActivity.Y3(true, false);
                        break;
                    }
                }
                break;
            case 15:
                View view = ((ProxyListActivity) obj2).b.T((View) obj).a;
                if (view instanceof yt8) {
                    yt8 yt8Var = (yt8) view;
                    yt8Var.setChecked(yt8Var.d == gba.y1);
                    yt8Var.b();
                    break;
                }
                break;
            case 16:
                h1a h1aVar = (h1a) obj2;
                if (((fi0) obj).a == 0) {
                    gl.d3(new y0a(h1aVar, b3));
                    break;
                }
                break;
            default:
                i8c i8cVar = (i8c) obj2;
                int i5 = ((fi0) obj).a;
                boolean z2 = i5 == 0;
                String i6 = z2 ? null : ci0.i(i5);
                fa4.b("StarsController.buy onResult " + z2 + " " + i6);
                gl.d3(new vj6((Object) i8cVar, z2, (Object) i6, (byte) 24));
                break;
        }
    }
}
