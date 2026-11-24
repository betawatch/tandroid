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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class gx implements gu2 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ gx(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:142:0x046e, code lost:
    
        if (r5 == 0) goto L130;
     */
    @Override // gu2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void accept(Object obj) {
        vh6 vh6Var;
        ImageView imageView;
        cd6 h;
        int i;
        byte b = this.a;
        byte b2 = 26;
        byte b3 = 24;
        Location location = null;
        byte b4 = 1;
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
                wx0 wx0Var = (wx0) obj2;
                Float f2 = (Float) obj;
                wx0Var.F.setLoadProgressAnimated(f2.floatValue());
                if (f2.floatValue() == 1.0f) {
                    ValueAnimator duration = ValueAnimator.ofFloat(1.0f, 0.0f).setDuration(200L);
                    duration.setInterpolator(d53.f);
                    duration.addUpdateListener(new uw0(wx0Var, (byte) 1));
                    duration.addListener(new g0(wx0Var, (byte) 27));
                    duration.start();
                    break;
                }
                break;
            case 2:
                u31 u31Var = (u31) obj2;
                Float f3 = (Float) obj;
                q21 q21Var = u31Var.q;
                if (q21Var != null) {
                    if (!u31Var.e.top) {
                        q21Var.b(r13.getHeight() - f3.floatValue());
                        break;
                    }
                }
                break;
            case 3:
                ((c29) obj2).d((List) obj);
                break;
            case 4:
                g22 g22Var = ((i22) obj2).W3;
                if (g22Var != null) {
                    g22Var.f0(obj);
                    break;
                }
                break;
            case 5:
                e32 e32Var = (e32) obj2;
                Float f4 = (Float) obj;
                e32Var.J.setLoadProgressAnimated(f4.floatValue());
                if (f4.floatValue() == 1.0f) {
                    ValueAnimator duration2 = ValueAnimator.ofFloat(1.0f, 0.0f).setDuration(200L);
                    duration2.setInterpolator(d53.f);
                    duration2.addUpdateListener(new u22(e32Var, b4));
                    duration2.addListener(new b91((Object) e32Var, (byte) 16));
                    duration2.start();
                    e32Var.P();
                    break;
                }
                break;
            case 6:
                TLRPC.User user = (TLRPC.User) obj;
                wg2 wg2Var = ((ng2) obj2).b;
                qg2 A0 = wg2Var.A0();
                ArrayList arrayList = wg2Var.F;
                vh6 vh6Var2 = wg2Var.M;
                ArrayList arrayList2 = (vh6Var2 == null || vh6Var2.m() == 0) ? arrayList : wg2Var.H;
                if (vh6Var2 != null) {
                    int m = vh6Var2.m();
                    vh6Var = vh6Var2;
                    break;
                }
                vh6Var = wg2Var.K;
                if (vh6Var.f(user.id) == null) {
                    if (sd2.T(wg2Var.n)) {
                        TLRPC.TL_channelParticipant tL_channelParticipant = new TLRPC.TL_channelParticipant();
                        tL_channelParticipant.inviter_id = wg2Var.getUserConfig().e();
                        TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                        tL_channelParticipant.peer = tL_peerUser;
                        tL_peerUser.user_id = user.id;
                        tL_channelParticipant.date = wg2Var.getConnectionsManager().getCurrentTime();
                        arrayList2.add(0, tL_channelParticipant);
                        vh6Var.k(tL_channelParticipant, user.id);
                    } else {
                        TLRPC.TL_chatParticipant tL_chatParticipant = new TLRPC.TL_chatParticipant();
                        tL_chatParticipant.user_id = user.id;
                        tL_chatParticipant.inviter_id = wg2Var.getUserConfig().e();
                        arrayList2.add(0, tL_chatParticipant);
                        vh6Var.k(tL_chatParticipant, user.id);
                    }
                }
                if (arrayList2 == arrayList) {
                    Collections.sort(arrayList, new sa(b2));
                }
                wg2Var.D0(A0);
                break;
            case 7:
                ry ryVar = (ry) obj2;
                int intValue = ((Integer) obj).intValue();
                switch (ryVar.a) {
                    case 5:
                        sa8 sa8Var = (sa8) ryVar.d;
                        sa8Var.y0(false);
                        m58 m58Var = sa8Var.L1;
                        m58Var.h(intValue, true);
                        m58Var.g();
                        sa8Var.setNewColor(intValue);
                        ny5 ny5Var = sa8Var.w1;
                        ny5Var.setSelectedColorIndex(m58Var.d());
                        ny5Var.getAdapter().f();
                        break;
                    default:
                        z8b z8bVar = (z8b) ryVar.d;
                        z8bVar.I0(false);
                        m58 m58Var2 = (m58) ryVar.c;
                        m58Var2.h(intValue, true);
                        m58Var2.g();
                        z8bVar.setNewColor(intValue);
                        jv7 jv7Var = z8bVar.m1;
                        jv7Var.setSelectedColorIndex(m58Var2.d());
                        jv7Var.getAdapter().f();
                        break;
                }
            case 8:
                ((zk3) obj2).S.T4(((Float) obj).floatValue());
                break;
            case 9:
                pc6 pc6Var = (pc6) obj2;
                pc6Var.F = (s05) obj;
                int i2 = gm.B(pc6Var.getThemedColor(cmb.c6)) < 0.721f ? R.raw.mapstyle_night : 0;
                if (i2 != 0) {
                    pc6Var.i0 = true;
                    pc6Var.F.i(((k1f) a.j()).loadRawResourceStyle(a.b, i2));
                }
                pc6Var.F.n(gm.L(70.0f), 0, gm.L(70.0f), pc6Var.o0());
                if (pc6Var.F != null) {
                    ((su) ((sm2) pc6Var.H).b).animate().alpha(1.0f).setStartDelay(200L).setDuration(100L).setUpdateListener(new fh4(pc6Var, b3)).start();
                    boolean z = pc6Var.U0;
                    s05 s05Var = pc6Var.F;
                    float f5 = z ? s05Var.f() + 4.0f : s05Var.e() - 4.0f;
                    TLRPC.TL_channelLocation tL_channelLocation = pc6Var.H0;
                    if (tL_channelLocation != null) {
                        TLRPC.GeoPoint geoPoint = tL_channelLocation.geo_point;
                        double d = geoPoint.lat;
                        double d2 = geoPoint._long;
                        kc6 kc6Var = new kc6();
                        if (pg3.D(pc6Var.m0)) {
                            kc6Var.c = pc6Var.getMessagesController().W1(Long.valueOf(pc6Var.m0));
                        } else {
                            kc6Var.d = pc6Var.getMessagesController().L0(Long.valueOf(-pc6Var.m0));
                        }
                        kc6Var.a = pc6Var.m0;
                        pc6Var.H0(kc6Var);
                        try {
                            ai4 ai4Var = (ai4) ((k1f) a.j()).onCreateMarkerOptions();
                            ((cl6) ai4Var.b).a = new LatLng(d, d2);
                            Bitmap i0 = pc6Var.i0(kc6Var);
                            if (i0 != null) {
                                ((cl6) ai4Var.b).d = hqd.a(i0);
                                cl6 cl6Var = (cl6) ai4Var.b;
                                cl6Var.e = 0.5f;
                                cl6Var.f = 0.8010882f;
                                kc6Var.e = pc6Var.F.a(ai4Var);
                                if (!m9c.D(kc6Var.c)) {
                                    ai4 ai4Var2 = (ai4) ((k1f) a.j()).onCreateMarkerOptions();
                                    ((cl6) ai4Var2.b).a = new LatLng(d, d2);
                                    cl6 cl6Var2 = (cl6) ai4Var2.b;
                                    cl6Var2.r = true;
                                    cl6Var2.d = hqd.b(R.drawable.map_pin_circle);
                                    cl6 cl6Var3 = (cl6) ai4Var2.b;
                                    cl6Var3.e = 0.5f;
                                    cl6Var3.f = 0.5f;
                                    kc6Var.f = pc6Var.F.a(ai4Var2);
                                }
                                pc6Var.o0.add(kc6Var);
                                pc6Var.p0.k(kc6Var, kc6Var.a);
                            }
                        } catch (Exception e) {
                            fc4.g(e, true);
                        }
                        pc6Var.F.h(((k1f) a.j()).newCameraUpdateLatLngZoom(kc6Var.e.a(), f5));
                    } else {
                        k47 k47Var = pc6Var.J0;
                        if (k47Var == null) {
                            Location location2 = new Location("network");
                            pc6Var.A0 = location2;
                            TLRPC.TL_channelLocation tL_channelLocation2 = pc6Var.I0;
                            if (tL_channelLocation2 != null) {
                                TLRPC.GeoPoint geoPoint2 = tL_channelLocation2.geo_point;
                                pc6Var.F.h(((k1f) a.j()).newCameraUpdateLatLngZoom(new xj5(geoPoint2.lat, geoPoint2._long), f5));
                                pc6Var.A0.setLatitude(pc6Var.I0.geo_point.lat);
                                pc6Var.A0.setLongitude(pc6Var.I0.geo_point._long);
                                pc6Var.A0.setAccuracy(pc6Var.I0.geo_point.accuracy_radius);
                                pc6Var.Q.L(pc6Var.A0);
                            } else {
                                location2.setLatitude(20.659322d);
                                pc6Var.A0.setLongitude(-11.40625d);
                            }
                        } else if (k47Var.C3()) {
                            kc6 c0 = pc6Var.c0(pc6Var.J0.k);
                            if (!pc6Var.q0()) {
                                pc6Var.F.h(((k1f) a.j()).newCameraUpdateLatLngZoom(c0.e.a(), f5));
                            }
                        } else {
                            double latitude = pc6Var.A0.getLatitude();
                            double longitude = pc6Var.A0.getLongitude();
                            xj5 xj5Var = new xj5(latitude, longitude);
                            try {
                                s05 s05Var2 = pc6Var.F;
                                ai4 ai4Var3 = (ai4) ((k1f) a.j()).onCreateMarkerOptions();
                                ((cl6) ai4Var3.b).a = new LatLng(latitude, longitude);
                                ((cl6) ai4Var3.b).d = hqd.b(R.drawable.map_pin2);
                                s05Var2.a(ai4Var3);
                            } catch (Exception e2) {
                                fc4.g(e2, true);
                            }
                            pc6Var.F.h(((k1f) a.j()).newCameraUpdateLatLngZoom(xj5Var, f5));
                            pc6Var.n0 = false;
                            pc6Var.q0();
                        }
                    }
                    pc6Var.F.g().m0();
                    pc6Var.F.g().o0();
                    pc6Var.F.g().l0();
                    pc6Var.F.l(new yb6(pc6Var, (byte) 7));
                    pc6Var.F.m(new a32((byte) 2));
                    s05 s05Var3 = pc6Var.F;
                    sb6 sb6Var = new sb6(pc6Var, (byte) 6);
                    wm4 wm4Var = s05Var3.a;
                    wx4 wx4Var = new wx4((Object) sb6Var, (byte) 4);
                    wm4Var.getClass();
                    try {
                        d8e d8eVar = (d8e) wm4Var.b;
                        t6d t6dVar = new t6d(wx4Var, (short) 0);
                        Parcel R = d8eVar.R();
                        tid.c(R, t6dVar);
                        d8eVar.V(R, 97);
                        LocationManager locationManager = (LocationManager) a.b.getSystemService("location");
                        List<String> providers = locationManager.getProviders(true);
                        for (int size = providers.size() - 1; size >= 0; size--) {
                            location = locationManager.getLastKnownLocation(providers.get(size));
                            if (location != null) {
                                pc6Var.z0 = location;
                                pc6Var.E0(location);
                                pc6Var.K0();
                                pc6Var.L0();
                                if (pc6Var.j0 && pc6Var.getParentActivity() != null) {
                                    pc6Var.j0 = false;
                                    pc6Var.g0();
                                }
                                imageView = pc6Var.c;
                                if (imageView != null && imageView.getVisibility() == 0 && (h = pc6Var.getLocationController().h(pc6Var.m0)) != null && (i = h.f) > 0) {
                                    pc6Var.h0(i);
                                }
                            }
                        }
                        pc6Var.z0 = location;
                        pc6Var.E0(location);
                        pc6Var.K0();
                        pc6Var.L0();
                        if (pc6Var.j0) {
                            pc6Var.j0 = false;
                            pc6Var.g0();
                        }
                        imageView = pc6Var.c;
                        if (imageView != null) {
                            pc6Var.h0(i);
                        }
                    } catch (RemoteException e3) {
                        i2d.h(e3);
                        return;
                    }
                }
                gm.c3(new sb6(pc6Var, (byte) 5));
                break;
            case 10:
                sk3 sk3Var = (sk3) obj2;
                int i3 = ((fj0) obj).a;
                gm.c3(new k16(sk3Var, i3 != 0 ? cj0.i(i3) : null, b2));
                break;
            case 11:
                ((z8b) obj2).w0((Integer) obj);
                break;
            case 12:
                ww1 ww1Var = (ww1) obj2;
                if (((fj0) obj).a == 0) {
                    gm.c3(ww1Var);
                    break;
                }
                break;
            case 13:
                RectF rectF = ProfileActivity.e7;
                ((ArrayList) obj2).add((TLRPC.User) obj);
                break;
            case 14:
                ProfileActivity profileActivity = (ProfileActivity) obj2;
                TLRPC.User user2 = (TLRPC.User) obj;
                RectF rectF2 = ProfileActivity.e7;
                for (int i4 = 0; i4 < profileActivity.v2.participants.participants.size(); i4++) {
                    if (profileActivity.v2.participants.participants.get(i4).user_id == user2.id) {
                        profileActivity.v2.participants.participants.remove(i4);
                        profileActivity.c4(true, false);
                        break;
                    }
                }
                break;
            case 15:
                View view = ((ProxyListActivity) obj2).b.T((View) obj).a;
                if (view instanceof zv8) {
                    zv8 zv8Var = (zv8) view;
                    zv8Var.setChecked(zv8Var.d == gda.x1);
                    zv8Var.b();
                    break;
                }
                break;
            case 16:
                j3a j3aVar = (j3a) obj2;
                if (((fj0) obj).a == 0) {
                    gm.c3(new a3a(j3aVar, b4));
                    break;
                }
                break;
            default:
                jac jacVar = (jac) obj2;
                int i5 = ((fj0) obj).a;
                boolean z2 = i5 == 0;
                String i6 = z2 ? null : cj0.i(i5);
                fc4.b("StarsController.buy onResult " + z2 + " " + i6);
                gm.c3(new yl6(jacVar, z2, i6, b3));
                break;
        }
    }
}
