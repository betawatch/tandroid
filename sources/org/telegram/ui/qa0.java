package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.location.Location;
import android.location.LocationManager;
import android.net.Uri;
import android.opengl.GLSurfaceView;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.Property;
import android.view.MotionEvent;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.maps.model.LatLng;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import org.telegram.messenger.IMapsProvider;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public class qa0 extends org.telegram.ui.ActionBar.g2 implements org.telegram.messenger.fs {
    public Location A0;
    public int B0;
    public bg.m C0;
    public org.telegram.messenger.ca D0;
    public boolean E;
    public boolean E0;
    public org.telegram.messenger.da F;
    public org.telegram.messenger.qa F0;
    public org.telegram.messenger.sa G;
    public da0 G0;
    public org.telegram.messenger.xa H;
    public TLRPC.TL_channelLocation H0;
    public org.telegram.messenger.sa I;
    public TLRPC.TL_channelLocation I0;
    public boolean J;
    public org.telegram.messenger.fj J0;
    public float K;
    public boolean K0;
    public k8.a L;
    public boolean L0;
    public double M;
    public na0 M0;
    public boolean N;
    public final int N0;
    public org.telegram.ui.Components.wg0 O;
    public int O0;
    public bi.t2 P;
    public la0 P0;
    public ia0 Q;
    public aa0 Q0;
    public et R;
    public ka0 R0;
    public org.telegram.ui.Components.ek0 S;
    public org.telegram.ui.Cells.y3 S0;
    public org.telegram.ui.Components.kl T;
    public TL_stories.MediaArea T0;
    public View U;
    public boolean U0;
    public v4.c0 V;
    public boolean V0;
    public org.telegram.ui.ActionBar.g5 W;
    public Boolean W0;
    public FrameLayout X;
    public FrameLayout Y;
    public fh.g Z;
    public ImageView a;
    public final RectF a0;
    public TextView b;
    public int b0;
    public ImageView c;
    public int c0;
    public org.telegram.ui.ActionBar.g5 d;
    public TextureView d0;
    public LinearLayout e;
    public org.telegram.ui.Components.w80 e0;
    public ImageView f;
    public final RectF f0;
    public final Paint g0;
    public TextView h;
    public int h0;
    public boolean i0;
    public boolean j0;
    public boolean k0;
    public boolean l0;
    public long m0;
    public TextView n;
    public boolean n0;
    public final ArrayList o0;
    public final a0.h p0;
    public long q0;
    public org.telegram.ui.ActionBar.g5 r;
    public boolean r0;
    public hi.l3 s;
    public AnimatorSet s0;
    public boolean t0;
    public boolean u0;
    public boolean v0;
    public boolean w;
    public boolean w0;
    public final UndoView[] x;
    public boolean x0;
    public boolean y;
    public boolean y0;
    public Location z0;

    public qa0(int i7) {
        super(null);
        this.x = new UndoView[2];
        this.a0 = new RectF();
        this.f0 = new RectF();
        this.g0 = new Paint();
        this.j0 = true;
        this.k0 = false;
        this.l0 = true;
        this.n0 = true;
        this.o0 = new ArrayList();
        this.p0 = new a0.h();
        this.q0 = -1L;
        this.t0 = true;
        this.O0 = (org.telegram.messenger.g0.q.x - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - org.telegram.messenger.g0.L(66.0f);
        this.V0 = true;
        this.N0 = i7;
        org.telegram.messenger.g0.a0();
    }

    public static void Z(qa0 qa0Var, Canvas canvas, RectF rectF) {
        Paint paint = qa0Var.g0;
        int i7 = org.telegram.ui.ActionBar.m6.h5;
        paint.setColor(qa0Var.getThemedColor(i7));
        canvas.drawRect(rectF, paint);
        ViewGroup viewGroup = (ViewGroup) qa0Var.fragmentView;
        org.telegram.ui.Components.ek0 ek0Var = qa0Var.S;
        if (ek0Var != null && ek0Var.getVisibility() == 0) {
            org.telegram.ui.Components.ek0 ek0Var2 = qa0Var.S;
            ih.d.a(ek0Var2, canvas, rectF, ek0Var2, viewGroup);
            return;
        }
        if (qa0Var.P.getVisibility() == 0) {
            RectF rectF2 = qa0Var.f0;
            canvas.save();
            canvas.translate(qa0Var.P.getX(), qa0Var.P.getY());
            canvas.clipRect(0.0f, 0.0f, qa0Var.P.getWidth(), viewGroup.getHeight() - qa0Var.P.getY());
            Drawable background = qa0Var.P.getBackground();
            if (background != null) {
                background.draw(canvas);
            }
            org.telegram.messenger.xa xaVar = qa0Var.H;
            ai.l0 l0Var = xaVar != null ? (ai.l0) ((a8.r7) xaVar).b : null;
            if (l0Var != null && l0Var.getParent() == qa0Var.P && l0Var.getVisibility() == 0 && l0Var.getAlpha() > 0.0f) {
                TextureView textureView = qa0Var.d0;
                if (textureView != null && textureView.isAttachedToWindow() && jh.k.c(qa0Var.d0, qa0Var.P, rectF2)) {
                    if (l0Var.getAlpha() < 1.0f) {
                        canvas.saveLayerAlpha(rectF2, (int) (l0Var.getAlpha() * 255.0f));
                    } else {
                        canvas.save();
                    }
                    canvas.translate(rectF2.left, rectF2.top);
                    qa0Var.d0.draw(canvas);
                    canvas.restore();
                } else if (qa0Var.e0 != null) {
                    rectF2.set(l0Var.getX(), l0Var.getY(), l0Var.getX() + l0Var.getWidth(), l0Var.getY() + l0Var.getHeight());
                    org.telegram.ui.Components.w80 w80Var = qa0Var.e0;
                    float alpha = l0Var.getAlpha();
                    Paint paint2 = w80Var.c;
                    Bitmap bitmap = w80Var.e;
                    if (bitmap != null && !bitmap.isRecycled() && alpha > 0.0f) {
                        paint2.setAlpha((int) (Math.min(1.0f, alpha) * 255.0f));
                        canvas.drawBitmap(bitmap, (Rect) null, rectF2, paint2);
                    }
                }
            }
            View view = qa0Var.U;
            if (view != null && view.getParent() != null && view.getVisibility() == 0 && view.getAlpha() > 0.0f) {
                canvas.save();
                canvas.translate(view.getX(), view.getY());
                view.draw(canvas);
                canvas.restore();
            }
            canvas.restore();
        }
        if (qa0Var.R.getVisibility() != 0) {
            return;
        }
        int L = org.telegram.messenger.g0.L(22.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + qa0Var.mSystemInsets.b;
        float f10 = L;
        if (rectF.top >= f10) {
            return;
        }
        canvas.save();
        canvas.clipRect(0.0f, Math.min(rectF.top, f10), viewGroup.getWidth(), f10);
        if (qa0Var.b0 < L) {
            paint.setColor(qa0Var.getThemedColor(i7));
            paint.setAlpha(org.telegram.messenger.ks.j3);
            canvas.drawRect(0.0f, Math.max(qa0Var.b0, rectF.top), viewGroup.getWidth(), f10, paint);
        }
        et etVar = qa0Var.R;
        ih.d.a(etVar, canvas, rectF, etVar, viewGroup);
        canvas.restore();
    }

    public static /* synthetic */ void a0(qa0 qa0Var) {
        qa0Var.glassEngine.g();
        View view = qa0Var.fragmentView;
        if (view != null) {
            view.invalidate();
        }
    }

    public static /* synthetic */ void b0(qa0 qa0Var) {
        aa0 aa0Var;
        qa0Var.getLocationController().j(qa0Var.m0);
        if (qa0Var.isPaused || (aa0Var = qa0Var.Q0) == null) {
            return;
        }
        org.telegram.messenger.g0.h3(aa0Var, 5000L);
    }

    public static void c0(qa0 qa0Var, boolean z10, TLRPC.User user, int i7) {
        TLRPC.Message message;
        TLRPC.MessageMedia messageMedia;
        if (!z10) {
            qa0Var.I0(i7, 0, user);
            return;
        }
        org.telegram.messenger.pd h = qa0Var.getLocationController().h(qa0Var.m0);
        if (h != null) {
            TLRPC.TL_messages_editMessage tL_messages_editMessage = new TLRPC.TL_messages_editMessage();
            tL_messages_editMessage.peer = qa0Var.getMessagesController().l1(h.a);
            tL_messages_editMessage.id = h.b;
            tL_messages_editMessage.flags |= TLObject.FLAG_14;
            TLRPC.TL_inputMediaGeoLive tL_inputMediaGeoLive = new TLRPC.TL_inputMediaGeoLive();
            tL_messages_editMessage.media = tL_inputMediaGeoLive;
            tL_inputMediaGeoLive.stopped = false;
            tL_inputMediaGeoLive.geo_point = new TLRPC.TL_inputGeoPoint();
            Location location = org.telegram.messenger.qd.f(qa0Var.currentAccount).s;
            tL_messages_editMessage.media.geo_point.lat = org.telegram.messenger.g0.b0(location.getLatitude());
            tL_messages_editMessage.media.geo_point._long = org.telegram.messenger.g0.b0(location.getLongitude());
            tL_messages_editMessage.media.geo_point.accuracy_radius = (int) location.getAccuracy();
            TLRPC.InputMedia inputMedia = tL_messages_editMessage.media;
            TLRPC.InputGeoPoint inputGeoPoint = inputMedia.geo_point;
            if (inputGeoPoint.accuracy_radius != 0) {
                inputGeoPoint.flags |= 1;
            }
            int i10 = h.g;
            int i11 = h.f;
            if (i10 != i11) {
                inputMedia.proximity_notification_radius = i11;
                inputMedia.flags |= 8;
            }
            inputMedia.heading = org.telegram.messenger.qd.e(location);
            TLRPC.InputMedia inputMedia2 = tL_messages_editMessage.media;
            int i12 = inputMedia2.flags;
            inputMedia2.flags = i12 | 4;
            int i13 = ConnectionsManager.DEFAULT_DATACENTER_ID;
            int i14 = i7 == Integer.MAX_VALUE ? Integer.MAX_VALUE : h.d + i7;
            h.d = i14;
            inputMedia2.period = i14;
            if (i7 != Integer.MAX_VALUE) {
                i13 = h.c + i7;
            }
            h.c = i13;
            inputMedia2.flags = i12 | 6;
            org.telegram.messenger.fj fjVar = h.h;
            if (fjVar != null && (message = fjVar.k) != null && (messageMedia = message.media) != null) {
                messageMedia.period = i14;
                qa0Var.getMessagesStorage().r1(h.h.k, null, null, true);
            }
            qa0Var.getConnectionsManager().sendRequest(tL_messages_editMessage, null);
            org.telegram.messenger.ks.e().k(org.telegram.messenger.ks.G4, new Object[0]);
        }
    }

    public static /* synthetic */ void e0(qa0 qa0Var, int i7) {
        float e10;
        float f10;
        TLRPC.TL_messageMediaVenue H = qa0Var.T.H(i7);
        if (H == null || H.icon == null || qa0Var.F == null) {
            return;
        }
        qa0Var.K0 = true;
        qa0Var.simpleActionBar.o(true);
        if ("pin".equals(H.icon)) {
            e10 = qa0Var.F.e();
            f10 = 4.0f;
        } else {
            e10 = qa0Var.F.e();
            f10 = 9.0f;
        }
        float f11 = e10 - f10;
        org.telegram.messenger.da daVar = qa0Var.F;
        IMapsProvider k10 = org.telegram.messenger.t0.k();
        TLRPC.GeoPoint geoPoint = H.geo;
        daVar.b(((pb.b) k10).newCameraUpdateLatLngZoom(new org.telegram.messenger.ab(geoPoint.lat, geoPoint._long), f11));
        Location location = qa0Var.A0;
        if (location != null) {
            location.setLatitude(H.geo.lat);
            qa0Var.A0.setLongitude(H.geo._long);
        }
        qa0Var.Q.L(qa0Var.A0);
    }

    public static View q0(View view, Class cls) {
        if (cls.isInstance(view)) {
            return (View) cls.cast(view);
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        for (int i7 = 0; i7 < viewGroup.getChildCount(); i7++) {
            View q02 = q0(viewGroup.getChildAt(i7), cls);
            if (q02 != null) {
                return q02;
            }
        }
        return null;
    }

    public static org.telegram.messenger.ab z0(org.telegram.messenger.ab abVar, double d, double d2) {
        double d10 = abVar.a;
        return new org.telegram.messenger.ab(d10 + Math.toDegrees(d / 6366198.0d), abVar.b + Math.toDegrees(d2 / (Math.cos(Math.toRadians(d10)) * 6366198.0d)));
    }

    public final boolean A0() {
        GLSurfaceView gLSurfaceView;
        org.telegram.messenger.xa xaVar = this.H;
        if (xaVar == null || (gLSurfaceView = (GLSurfaceView) ((a8.r7) xaVar).f) == null || this.J) {
            return false;
        }
        gLSurfaceView.queueEvent(new h60(14, this, gLSurfaceView));
        return true;
    }

    public final void B0(ma0 ma0Var) {
        double d;
        double d2;
        TLRPC.Message message;
        if (ma0Var == null || (message = ma0Var.b) == null) {
            org.telegram.messenger.fj fjVar = this.J0;
            if (fjVar != null) {
                TLRPC.GeoPoint geoPoint = fjVar.k.media.geo;
                d = geoPoint.lat;
                d2 = geoPoint._long;
            } else {
                TLRPC.GeoPoint geoPoint2 = this.H0.geo_point;
                d = geoPoint2.lat;
                d2 = geoPoint2._long;
            }
        } else {
            TLRPC.GeoPoint geoPoint3 = message.media.geo;
            d = geoPoint3.lat;
            d2 = geoPoint3._long;
        }
        boolean z10 = org.telegram.messenger.s2.a;
        org.telegram.messenger.t0.r();
        if (this.z0 != null) {
            try {
                getParentActivity().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(String.format(Locale.US, "http://maps.google.com/maps".concat("?saddr=%f,%f&daddr=%f,%f"), Double.valueOf(this.z0.getLatitude()), Double.valueOf(this.z0.getLongitude()), Double.valueOf(d), Double.valueOf(d2)))));
                return;
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
                return;
            }
        }
        try {
            getParentActivity().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(String.format(Locale.US, "http://maps.google.com/maps".concat("?saddr=&daddr=%f,%f"), Double.valueOf(d), Double.valueOf(d2)))));
        } catch (Exception e11) {
            org.telegram.messenger.a8.g(e11, true);
        }
    }

    public final void C0(final boolean z10) {
        if (this.M0 == null || o0() || getParentActivity() == null || this.z0 == null || !l0()) {
            return;
        }
        final TLRPC.User c22 = org.telegram.messenger.n5.E(this.m0) ? getMessagesController().c2(Long.valueOf(this.m0)) : null;
        showDialog(org.telegram.ui.Components.c5.B(getParentActivity(), z10, c22, new org.telegram.messenger.nr() { // from class: org.telegram.ui.fa0
            @Override // org.telegram.messenger.nr
            public final void a(int i7) {
                qa0.c0(qa0.this, z10, c22, i7);
            }
        }, null));
    }

    public final void D0() {
        SurfaceView surfaceView;
        if (this.e0 == null || this.H == null) {
            return;
        }
        TextureView textureView = this.d0;
        if ((textureView == null || !textureView.isAttachedToWindow()) && ((surfaceView = this.e0.d) == null || !surfaceView.isAttachedToWindow())) {
            ai.l0 l0Var = (ai.l0) ((a8.r7) this.H).b;
            TextureView textureView2 = (TextureView) q0(l0Var, TextureView.class);
            this.d0 = textureView2;
            org.telegram.ui.Components.w80 w80Var = this.e0;
            SurfaceView surfaceView2 = textureView2 == null ? (SurfaceView) q0(l0Var, SurfaceView.class) : null;
            if (w80Var.d != surfaceView2) {
                w80Var.d = surfaceView2;
                w80Var.a();
            }
            TextureView textureView3 = this.d0;
            if (textureView3 != null) {
                TextureView.SurfaceTextureListener surfaceTextureListener = textureView3.getSurfaceTextureListener();
                if (!(surfaceTextureListener instanceof oa0)) {
                    this.d0.setSurfaceTextureListener(new oa0(this, surfaceTextureListener));
                }
            }
            P0();
        }
        TextureView textureView4 = this.d0;
        if (textureView4 == null) {
            this.e0.a();
            return;
        }
        TextureView.SurfaceTextureListener surfaceTextureListener2 = textureView4.getSurfaceTextureListener();
        if (surfaceTextureListener2 instanceof oa0) {
            return;
        }
        this.d0.setSurfaceTextureListener(new oa0(this, surfaceTextureListener2));
    }

    public final void E0(Location location) {
        if (location == null) {
            return;
        }
        this.z0 = new Location(location);
        ma0 ma0Var = (ma0) this.p0.f(getUserConfig().e());
        org.telegram.messenger.pd h = getLocationController().h(this.m0);
        if (ma0Var != null && h != null && ma0Var.b.id == h.b) {
            org.telegram.messenger.ab abVar = new org.telegram.messenger.ab(location.getLatitude(), location.getLongitude());
            ma0Var.e.b(abVar);
            org.telegram.messenger.ca caVar = ma0Var.f;
            if (caVar != null) {
                caVar.b(abVar);
            }
            if (this.q0 == ma0Var.a) {
                this.F.b(((pb.b) org.telegram.messenger.t0.k()).newCameraUpdateLatLng(ma0Var.e.a()));
            }
        }
        if (this.J0 == null && this.H0 == null && this.F != null) {
            org.telegram.messenger.ab abVar2 = new org.telegram.messenger.ab(location.getLatitude(), location.getLongitude());
            ia0 ia0Var = this.Q;
            if (ia0Var != null) {
                ia0Var.M(this.z0);
            }
            if (!this.K0) {
                this.A0 = new Location(location);
                if (this.L0) {
                    this.F.b(((pb.b) org.telegram.messenger.t0.k()).newCameraUpdateLatLng(abVar2));
                } else {
                    this.L0 = true;
                    this.F.h(((pb.b) org.telegram.messenger.t0.k()).newCameraUpdateLatLngZoom(abVar2, this.F.e() - 4.0f));
                }
            }
        } else {
            this.Q.M(this.z0);
        }
        org.telegram.ui.Components.wg0 wg0Var = this.O;
        if (wg0Var != null) {
            wg0Var.c(true);
        }
        k8.a aVar = this.L;
        if (aVar != null) {
            double latitude = this.z0.getLatitude();
            double longitude = this.z0.getLongitude();
            m8.a aVar2 = (m8.a) aVar.b;
            LatLng latLng = new LatLng(latitude, longitude);
            try {
                v7.f fVar = (v7.f) aVar2.a;
                Parcel p12 = fVar.p1();
                v7.b.b(p12, latLng);
                fVar.t1(p12, 3);
            } catch (RemoteException e10) {
                throw new androidx.car.app.j(e10);
            }
        }
        bg.m mVar = this.C0;
        if (mVar != null) {
            mVar.a(this.z0);
        }
        Q0(true);
        R0();
    }

    public final void F0(View view) {
        fh.g c10 = getBaseSimpleGlass().c.c(view, null, false);
        c10.p(c8.i0.m(getResourceProvider()));
        c10.r(org.telegram.messenger.g0.L(23.0f));
        c10.q(org.telegram.messenger.g0.L(6.0f));
        view.setBackground(c10);
        c8.ra.a(view);
    }

    public final void G0(org.telegram.messenger.fj fjVar) {
        this.J0 = fjVar;
        this.m0 = org.telegram.messenger.fj.B0(fjVar.k);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void H0(ma0 ma0Var) {
        if (ma0Var.h != null) {
            return;
        }
        TLRPC.User user = ma0Var.c;
        TLRPC.Chat chat = ma0Var.d;
        if (user == null && chat == 0) {
            return;
        }
        org.telegram.ui.Components.b9 b9Var = new org.telegram.ui.Components.b9((org.telegram.ui.ActionBar.h6) null);
        if (user != null) {
            b9Var.r(user);
        } else {
            b9Var.q(chat);
        }
        ImageReceiver imageReceiver = new ImageReceiver(null);
        imageReceiver.d = this.currentAccount;
        imageReceiver.h1 = new at(19, this, ma0Var);
        imageReceiver.P();
        if (user == null) {
            user = chat;
        }
        imageReceiver.i0(user, b9Var, null);
        ma0Var.h = imageReceiver;
    }

    public final void I0(int i7, int i10, TLRPC.User user) {
        TLRPC.TL_messageMediaGeoLive tL_messageMediaGeoLive = new TLRPC.TL_messageMediaGeoLive();
        TLRPC.TL_geoPoint tL_geoPoint = new TLRPC.TL_geoPoint();
        tL_messageMediaGeoLive.geo = tL_geoPoint;
        tL_geoPoint.lat = org.telegram.messenger.g0.b0(this.z0.getLatitude());
        tL_messageMediaGeoLive.geo._long = org.telegram.messenger.g0.b0(this.z0.getLongitude());
        tL_messageMediaGeoLive.heading = org.telegram.messenger.qd.e(this.z0);
        int i11 = tL_messageMediaGeoLive.flags;
        tL_messageMediaGeoLive.period = i7;
        tL_messageMediaGeoLive.proximity_notification_radius = i10;
        tL_messageMediaGeoLive.flags = i11 | 9;
        this.M0.b(tL_messageMediaGeoLive, this.N0, true, 0, 0L);
        if (i10 <= 0) {
            finishFragment();
            return;
        }
        this.O.M = true;
        this.c.setImageResource(R.drawable.msg_location_alert2);
        org.telegram.ui.Components.wg0 wg0Var = this.O;
        if (wg0Var != null) {
            wg0Var.a();
        }
        w0().k(0L, 24, Integer.valueOf(i10), user, null, null);
    }

    public final void J0(boolean z10, boolean z11) {
        Boolean bool = this.W0;
        if (bool == null || bool.booleanValue() != z10) {
            this.W0 = Boolean.valueOf(z10);
            if (z11) {
                this.b.setVisibility(0);
                this.b.animate().alpha(z10 ? 1.0f : 0.0f).scaleX(z10 ? 1.0f : 0.7f).scaleY(z10 ? 1.0f : 0.7f).setInterpolator(org.telegram.ui.Components.nr.h).setDuration(420L).withEndAction(new org.telegram.ui.Components.rp0(9, this, z10)).start();
            } else {
                this.b.setVisibility(z10 ? 0 : 8);
                this.b.setAlpha(z10 ? 1.0f : 0.0f);
                this.b.setScaleX(z10 ? 1.0f : 0.7f);
                this.b.setScaleY(z10 ? 1.0f : 0.7f);
            }
        }
    }

    public final void K0() {
        if (this.F == null || !this.y0) {
            return;
        }
        if (this.C0 == null) {
            try {
                SensorManager sensorManager = (SensorManager) org.telegram.messenger.t0.b.getSystemService("sensor");
                if (sensorManager == null) {
                    return;
                }
                if (sensorManager.getDefaultSensor(11) == null) {
                    if (sensorManager.getDefaultSensor(2) == null) {
                        return;
                    }
                    if (sensorManager.getDefaultSensor(1) == null) {
                        return;
                    }
                }
                this.C0 = new bg.m(new da0(this, 3));
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
                return;
            }
        }
        this.C0.a(this.z0);
        bg.m mVar = this.C0;
        if (mVar.f) {
            return;
        }
        try {
            if (mVar.b == null) {
                SensorManager sensorManager2 = (SensorManager) org.telegram.messenger.t0.b.getSystemService("sensor");
                mVar.b = sensorManager2;
                if (sensorManager2 == null) {
                    return;
                }
                Sensor defaultSensor = sensorManager2.getDefaultSensor(11);
                mVar.c = defaultSensor;
                if (defaultSensor == null) {
                    mVar.d = mVar.b.getDefaultSensor(1);
                    mVar.e = mVar.b.getDefaultSensor(2);
                }
            }
            Sensor sensor = mVar.c;
            if (sensor != null) {
                mVar.b.registerListener(mVar, sensor, 1);
            } else {
                Sensor sensor2 = mVar.d;
                if (sensor2 == null || mVar.e == null) {
                    return;
                }
                mVar.b.registerListener(mVar, sensor2, 1);
                mVar.b.registerListener(mVar, mVar.e, 1);
            }
            mVar.f = true;
            mVar.I = 0L;
        } catch (Exception e11) {
            org.telegram.messenger.a8.g(e11, true);
        }
    }

    public final void L0() {
        if (!this.y0 || this.k0) {
            return;
        }
        if (this.G0 == null) {
            org.telegram.messenger.qa onCreateLocationRequest = ((h6.m) org.telegram.messenger.t0.j()).onCreateLocationRequest();
            this.F0 = onCreateLocationRequest;
            ((org.telegram.messenger.z9) onCreateLocationRequest).c();
            ((org.telegram.messenger.z9) this.F0).b();
            ((org.telegram.messenger.z9) this.F0).a();
            this.G0 = new da0(this, 2);
        }
        try {
            ((h6.m) org.telegram.messenger.t0.j()).requestLocationUpdates(this.F0, this.G0);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public final void M0() {
        bg.m mVar = this.C0;
        if (mVar == null || !mVar.f) {
            return;
        }
        mVar.f = false;
        mVar.x = false;
        try {
            mVar.b.unregisterListener(mVar);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public final void N0(boolean z10) {
        int i7;
        int i10;
        FrameLayout.LayoutParams layoutParams;
        v4.f1 K = this.R.K(0);
        if (K != null) {
            i7 = (int) K.a.getY();
            i10 = Math.min(i7, 0) + this.O0;
            this.b0 = (this.O0 + i7) - this.h0;
        } else {
            i7 = -this.P.getMeasuredHeight();
            this.b0 = -org.telegram.messenger.g0.L(41.0f);
            i10 = 0;
        }
        this.R.invalidate();
        if (((FrameLayout.LayoutParams) this.P.getLayoutParams()) != null) {
            if (i10 <= 0) {
                if (((ai.l0) ((a8.r7) this.H).b).getVisibility() == 0) {
                    ((ai.l0) ((a8.r7) this.H).b).setVisibility(4);
                    this.P.setVisibility(4);
                }
            } else if (((ai.l0) ((a8.r7) this.H).b).getVisibility() == 4) {
                ((ai.l0) ((a8.r7) this.H).b).setVisibility(0);
                this.P.setVisibility(0);
            }
            this.P.setTranslationY(Math.min(0, i7));
            int i11 = -i7;
            ((ai.l0) ((a8.r7) this.H).b).setTranslationY(Math.max(0, i11 / 2));
            FrameLayout frameLayout = this.X;
            if (frameLayout != null) {
                frameLayout.setTranslationY(-Math.min(0, i7));
                float l10 = Utilities.l((org.telegram.messenger.f3.z(53.0f, i10 - this.h0, org.telegram.messenger.g0.L(46.0f) + ri.a.d(this.mSystemInsets.b)) - org.telegram.messenger.g0.L(7.0f)) / org.telegram.messenger.g0.L(48.0f));
                FrameLayout frameLayout2 = this.X;
                frameLayout2.setAlpha(l10);
                frameLayout2.setVisibility(l10 > 0.0f ? 0 : 4);
                FrameLayout frameLayout3 = this.Y;
                frameLayout3.setAlpha(l10);
                frameLayout3.setVisibility(l10 > 0.0f ? 0 : 4);
                P0();
            }
            View view = this.U;
            if (view != null) {
                int L = ((i10 / 2) + (i11 - org.telegram.messenger.g0.L(view.getTag() != null ? 69.0f : 48.0f))) - (this.h0 / 2);
                this.B0 = L;
                view.setTranslationY(L);
            }
            if (z10 || (layoutParams = (FrameLayout.LayoutParams) ((ai.l0) ((a8.r7) this.H).b).getLayoutParams()) == null || layoutParams.height == u0()) {
                return;
            }
            layoutParams.height = u0();
            org.telegram.messenger.da daVar = this.F;
            if (daVar != null) {
                daVar.n(org.telegram.messenger.g0.L(70.0f), 0, org.telegram.messenger.g0.L(70.0f), t0());
            }
            ((ai.l0) ((a8.r7) this.H).b).setLayoutParams(layoutParams);
        }
    }

    public final void O0() {
        if (!this.u0) {
            this.e.setVisibility(8);
        } else {
            if (!this.w0) {
                this.S.setEmptyView(this.e);
                return;
            }
            this.S.setEmptyView(null);
            this.e.setVisibility(8);
            this.S.setVisibility(8);
        }
    }

    public final void P0() {
        org.telegram.messenger.xa xaVar;
        bi.t2 t2Var;
        org.telegram.ui.Components.w80 w80Var = this.e0;
        if (w80Var == null || (xaVar = this.H) == null) {
            return;
        }
        ai.l0 l0Var = (ai.l0) ((a8.r7) xaVar).b;
        boolean z10 = this.d0 == null && this.y0 && !isFinishing() && (t2Var = this.P) != null && t2Var.getVisibility() == 0 && l0Var.getParent() != null && l0Var.getVisibility() == 0;
        if (w80Var.g == z10) {
            return;
        }
        w80Var.g = z10;
        if (z10) {
            w80Var.a();
        } else {
            w80Var.d();
        }
    }

    public final void Q0(boolean z10) {
        Location location;
        if (this.F == null || (location = this.z0) == null) {
            return;
        }
        bg.m mVar = this.C0;
        boolean z11 = mVar != null && mVar.H;
        try {
            org.telegram.messenger.ca caVar = this.D0;
            int i7 = R.drawable.map_pin_circle;
            if (caVar == null) {
                h9.g1 g1Var = (h9.g1) ((pb.b) org.telegram.messenger.t0.k()).onCreateMarkerOptions();
                ((m8.g) g1Var.b).a = new LatLng(this.z0.getLatitude(), this.z0.getLongitude());
                m8.g gVar = (m8.g) g1Var.b;
                gVar.r = true;
                gVar.e = 0.5f;
                gVar.f = 0.5f;
                gVar.d = c8.r9.b(z11 ? R.drawable.map_pin_cone2 : R.drawable.map_pin_circle);
                this.D0 = this.F.a(g1Var);
                this.E0 = z11;
            } else if (z10) {
                double latitude = location.getLatitude();
                double longitude = this.z0.getLongitude();
                m8.f fVar = caVar.a;
                LatLng latLng = new LatLng(latitude, longitude);
                fVar.getClass();
                try {
                    v7.i iVar = (v7.i) fVar.a;
                    Parcel p12 = iVar.p1();
                    v7.b.b(p12, latLng);
                    iVar.t1(p12, 3);
                } catch (RemoteException e10) {
                    throw new androidx.car.app.j(e10);
                }
            }
            org.telegram.messenger.ca caVar2 = this.D0;
            if (caVar2 == null) {
                return;
            }
            if (z11 != this.E0) {
                if (z11) {
                    i7 = R.drawable.map_pin_cone2;
                }
                caVar2.a.a(c8.r9.b(i7));
                this.E0 = z11;
            }
            this.D0.c(z11 ? this.C0.G : 0.0f);
        } catch (Exception e11) {
            org.telegram.messenger.a8.g(e11, true);
        }
    }

    public final void R0() {
        TLRPC.MessageMedia messageMedia;
        int i7;
        if (this.b == null) {
            return;
        }
        if (this.r0) {
            J0(false, true);
            r0();
            return;
        }
        int currentTime = getConnectionsManager() != null ? getConnectionsManager().getCurrentTime() : 0;
        ArrayList arrayList = this.o0;
        int size = arrayList.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            TLRPC.Message message = ((ma0) arrayList.get(i11)).b;
            if (message != null && (messageMedia = message.media) != null && ((i7 = messageMedia.period) == Integer.MAX_VALUE || message.date + i7 > currentTime)) {
                i10++;
            }
        }
        boolean z10 = this.p0.f(getUserConfig().e()) != null;
        if (this.z0 != null && !z10) {
            i10++;
        }
        J0(i10 >= 2, true);
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.A6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.n5));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.a7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.b7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Ji));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.fj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.ij));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.U7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.T7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.S7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.R7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Q7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.P7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.O7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.yj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.wj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.xj));
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x0907  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0910  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0837  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x083c  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x069e  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x061e  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x061a  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0642  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x084b  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0859 A[LOOP:0: B:92:0x0856->B:94:0x0859, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x08a4  */
    @Override // org.telegram.ui.ActionBar.g2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View createView(Context context) {
        boolean z10;
        org.telegram.messenger.fj fjVar;
        org.telegram.messenger.fj fjVar2;
        TLRPC.TL_channelLocation tL_channelLocation;
        org.telegram.messenger.fj fjVar3;
        int i7;
        ri.a baseSimpleGlass;
        org.telegram.ui.Components.ek0 ek0Var;
        TLRPC.Message message;
        TLRPC.MessageMedia messageMedia;
        final int i10 = 0;
        this.v0 = false;
        this.u0 = false;
        this.w0 = false;
        ia0 ia0Var = this.Q;
        if (ia0Var != null) {
            ia0Var.F();
        }
        org.telegram.ui.Components.kl klVar = this.T;
        if (klVar != null) {
            klVar.F();
        }
        if (this.H0 != null) {
            Location location = new Location("network");
            this.A0 = location;
            location.setLatitude(this.H0.geo_point.lat);
            this.A0.setLongitude(this.H0.geo_point._long);
        } else if (this.J0 != null) {
            Location location2 = new Location("network");
            this.A0 = location2;
            location2.setLatitude(this.J0.k.media.geo.lat);
            this.A0.setLongitude(this.J0.k.media.geo._long);
        }
        final int i11 = 1;
        this.k0 = (getParentActivity() == null || getParentActivity().checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") == 0) ? false : true;
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        org.telegram.ui.ActionBar.r4 r4Var = this.parentLayout;
        if (r4Var != null && ((ActionBarLayout) r4Var).T0) {
            this.simpleActionBar.setOccupyStatusBar(false);
        }
        this.simpleActionBar.setActionBarMenuOnItemClick(new ha0(this));
        org.telegram.ui.ActionBar.f5 t6 = this.simpleActionBar.t();
        org.telegram.ui.ActionBar.g5 b10 = t6.b(0, R.drawable.msg_map_type);
        this.d = b10;
        final int i12 = 2;
        b10.e(2, R.drawable.msg_map, org.telegram.messenger.gd.N0(2131748497, null));
        this.d.e(3, R.drawable.msg_satellite, org.telegram.messenger.gd.N0(2131745752, null));
        this.d.e(4, R.drawable.msg_hybrid, org.telegram.messenger.gd.N0(2131749082, null));
        this.d.setContentDescription(org.telegram.messenger.gd.N0(2131754838, null));
        TLRPC.TL_channelLocation tL_channelLocation2 = this.H0;
        int i13 = this.N0;
        if (tL_channelLocation2 != null) {
            this.simpleActionBar.setTitle(org.telegram.messenger.gd.N0(2131752208, null));
        } else {
            org.telegram.messenger.fj fjVar4 = this.J0;
            if (fjVar4 == null) {
                this.simpleActionBar.setTitle(org.telegram.messenger.gd.N0(2131745260, null));
                if (i13 != 4) {
                    org.telegram.ui.ActionBar.g5 b11 = t6.b(0, R.drawable.outline_header_search);
                    b11.O();
                    b11.C0 = new bi.w1(this, 16);
                    this.r = b11;
                    b11.setSearchFieldHint(org.telegram.messenger.gd.N0(2131745640, null));
                    this.r.setContentDescription(org.telegram.messenger.gd.N0(2131745640, null));
                }
            } else if (fjVar4.C3()) {
                this.simpleActionBar.setTitle(org.telegram.messenger.gd.N0(2131753963, null));
                org.telegram.ui.ActionBar.g5 b12 = t6.b(0, R.drawable.ic_ab_other);
                this.W = b12;
                b12.e(6, R.drawable.filled_directions, org.telegram.messenger.gd.N0(2131750456, null));
            } else {
                if (i13 != 3) {
                    String str = this.J0.k.media.title;
                    if (str == null || str.length() <= 0) {
                        this.simpleActionBar.setTitle(org.telegram.messenger.gd.N0(2131752208, null));
                    } else {
                        this.simpleActionBar.setTitle(org.telegram.messenger.gd.N0(2131745208, null));
                    }
                }
                if (i13 != 3) {
                    org.telegram.ui.ActionBar.g5 b13 = t6.b(0, R.drawable.ic_ab_other);
                    this.W = b13;
                    b13.e(1, R.drawable.msg_openin, org.telegram.messenger.gd.N0(2131747602, null));
                    if (!getLocationController().i(this.m0) && this.V0) {
                        this.W.e(5, R.drawable.msg_location, org.telegram.messenger.gd.N0(2131745416, null));
                    }
                    this.W.setContentDescription(org.telegram.messenger.gd.N0(2131754838, null));
                }
            }
        }
        FrameLayout pa0Var = new pa0(this, context);
        this.fragmentView = pa0Var;
        int i14 = org.telegram.ui.ActionBar.m6.h5;
        org.telegram.ui.ActionBar.t6.h(i14, pa0Var, getResourceProvider());
        this.h0 = org.telegram.messenger.g0.L((i13 == 0 || i13 == 1) ? 26.0f : 16.0f);
        bi.t2 t2Var = new bi.t2(context, 28);
        this.P = t2Var;
        t2Var.setBackgroundDrawable(new org.telegram.ui.Components.sc(x0()));
        FrameLayout frameLayout = new FrameLayout(context);
        this.X = frameLayout;
        this.P.addView(frameLayout, c8.ma.e(-1, -2, 51));
        this.Y = new FrameLayout(context);
        FrameLayout.LayoutParams e10 = c8.ma.e(-1, -2, 83);
        e10.bottomMargin = org.telegram.messenger.g0.L(1.0f) + org.telegram.messenger.g0.L(29.0f) + this.h0;
        this.P.addView(this.Y, e10);
        if (this.J0 != null && i13 == 3) {
            TextView textView = new TextView(context);
            F0(textView);
            org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.mj, getResourceProvider());
            textView.setTextSize(1, 14.0f);
            textView.setTypeface(org.telegram.messenger.g0.o());
            textView.setGravity(17);
            textView.setPadding(org.telegram.messenger.g0.L(24.0f), 0, org.telegram.messenger.g0.L(24.0f), 0);
            this.simpleActionBar.addView(textView, c8.ma.e(-2, 58, 1));
            textView.setText(org.telegram.messenger.gd.N0(2131747601, null));
            textView.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.ba0
                public final /* synthetic */ qa0 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    boolean z11;
                    org.telegram.messenger.da daVar;
                    int i15 = i11;
                    int i16 = 4;
                    qa0 qa0Var = this.b;
                    switch (i15) {
                        case 0:
                            if (qa0Var.getParentActivity() == null || qa0Var.z0 == null || !qa0Var.l0() || qa0Var.F == null) {
                                return;
                            }
                            hi.l3 l3Var = qa0Var.s;
                            if (l3Var != null) {
                                l3Var.f(true);
                            }
                            org.telegram.messenger.mp.g1().edit().putInt("proximityhint", 3).commit();
                            org.telegram.messenger.pd h = qa0Var.getLocationController().h(qa0Var.m0);
                            if (qa0Var.y) {
                                qa0Var.x[0].d(1, true);
                            }
                            if (h != null && h.f > 0) {
                                qa0Var.c.setImageResource(R.drawable.msg_location_alert);
                                k8.a aVar = qa0Var.L;
                                if (aVar != null) {
                                    aVar.b1();
                                    qa0Var.L = null;
                                }
                                qa0Var.y = true;
                                qa0Var.w0().k(0L, 25, 0, null, new aa0(qa0Var, 3), new h60(15, qa0Var, h));
                                return;
                            }
                            k8.a aVar2 = qa0Var.L;
                            int i17 = 6;
                            if (aVar2 == null) {
                                qa0Var.m0(500);
                            } else {
                                try {
                                    v7.f fVar = (v7.f) ((m8.a) aVar2.b).a;
                                    Parcel o12 = fVar.o1(fVar.p1(), 6);
                                    double readDouble = o12.readDouble();
                                    o12.recycle();
                                    qa0Var.M = readDouble;
                                } catch (RemoteException e11) {
                                    throw new androidx.car.app.j(e11);
                                }
                            }
                            TLRPC.User c22 = org.telegram.messenger.n5.E(qa0Var.m0) ? qa0Var.getMessagesController().c2(Long.valueOf(qa0Var.m0)) : null;
                            Activity parentActivity = qa0Var.getParentActivity();
                            da0 da0Var = new da0(qa0Var, i17);
                            at atVar = new at(20, qa0Var, c22);
                            aa0 aa0Var = new aa0(qa0Var, 4);
                            org.telegram.ui.Components.wg0 wg0Var = new org.telegram.ui.Components.wg0(parentActivity);
                            wg0Var.a = null;
                            wg0Var.d = -1;
                            wg0Var.e = false;
                            wg0Var.f = false;
                            wg0Var.h = null;
                            wg0Var.n = new Rect();
                            new Paint();
                            wg0Var.x = true;
                            wg0Var.G = org.telegram.ui.Components.nr.h;
                            wg0Var.setWillNotDraw(false);
                            wg0Var.R = aa0Var;
                            wg0Var.E = ViewConfiguration.get(parentActivity).getScaledTouchSlop();
                            Rect rect = new Rect();
                            Drawable mutate = parentActivity.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
                            org.telegram.ui.ActionBar.t6.x(wg0Var, mutate, org.telegram.ui.ActionBar.m6.h5, null, PorterDuff.Mode.MULTIPLY);
                            mutate.getPadding(rect);
                            int i18 = rect.left;
                            wg0Var.y = i18;
                            org.telegram.ui.Components.sg0 sg0Var = new org.telegram.ui.Components.sg0(wg0Var.getContext());
                            wg0Var.w = sg0Var;
                            sg0Var.setBackgroundDrawable(mutate);
                            sg0Var.setPadding(i18, (org.telegram.messenger.g0.L(8.0f) + rect.top) - 1, i18, 0);
                            sg0Var.setVisibility(4);
                            wg0Var.addView(sg0Var, 0, c8.ma.e(-1, -2, 80));
                            org.telegram.messenger.gd.l();
                            wg0Var.P = org.telegram.messenger.gd.g0.booleanValue();
                            wg0Var.N = c22;
                            wg0Var.J = da0Var;
                            org.telegram.ui.Components.tb0 tb0Var = new org.telegram.ui.Components.tb0(parentActivity, null);
                            wg0Var.H = tb0Var;
                            tb0Var.setTextOffset(org.telegram.messenger.g0.L(10.0f));
                            tb0Var.setItemCount(5);
                            org.telegram.ui.Components.tb0 tb0Var2 = new org.telegram.ui.Components.tb0(parentActivity, null);
                            wg0Var.I = tb0Var2;
                            tb0Var2.setItemCount(5);
                            tb0Var2.setTextOffset(-org.telegram.messenger.g0.L(10.0f));
                            org.telegram.ui.Components.tg0 tg0Var = new org.telegram.ui.Components.tg0(wg0Var, parentActivity);
                            wg0Var.Q = tg0Var;
                            tg0Var.setOrientation(1);
                            FrameLayout frameLayout2 = new FrameLayout(parentActivity);
                            tg0Var.addView(frameLayout2, c8.ma.t(-1, -2, 51, 22, 0, 0, 4));
                            TextView textView2 = new TextView(parentActivity);
                            textView2.setText(org.telegram.messenger.gd.N0(2131748563, null));
                            org.telegram.messenger.f3.l(textView2, org.telegram.ui.ActionBar.m6.j5, null, 1, 20.0f);
                            frameLayout2.addView(textView2, c8.ma.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
                            textView2.setOnTouchListener(new gi.a(21));
                            LinearLayout linearLayout = new LinearLayout(parentActivity);
                            linearLayout.setOrientation(0);
                            linearLayout.setWeightSum(1.0f);
                            tg0Var.addView(linearLayout, c8.ma.o(-1, -2));
                            System.currentTimeMillis();
                            FrameLayout frameLayout3 = new FrameLayout(parentActivity);
                            TextView textView3 = new TextView(parentActivity);
                            wg0Var.L = textView3;
                            org.telegram.ui.Components.ug0 ug0Var = new org.telegram.ui.Components.ug0(parentActivity);
                            wg0Var.K = ug0Var;
                            linearLayout.addView(tb0Var, c8.ma.l(0.5f, 0, org.telegram.messenger.ks.t4));
                            tb0Var.setFormatter(new org.telegram.ui.Components.rg0(wg0Var, 0));
                            tb0Var.setMinValue(0);
                            tb0Var.setMaxValue(10);
                            tb0Var.setWrapSelectorWheel(false);
                            tb0Var.setTextOffset(org.telegram.messenger.g0.L(20.0f));
                            org.telegram.ui.Components.rg0 rg0Var = new org.telegram.ui.Components.rg0(wg0Var, 1);
                            tb0Var.setOnValueChangedListener(rg0Var);
                            tb0Var2.setMinValue(0);
                            tb0Var2.setMaxValue(10);
                            tb0Var2.setWrapSelectorWheel(false);
                            tb0Var2.setTextOffset(-org.telegram.messenger.g0.L(20.0f));
                            linearLayout.addView(tb0Var2, c8.ma.l(0.5f, 0, org.telegram.messenger.ks.t4));
                            tb0Var2.setFormatter(new org.telegram.ui.Components.rg0(wg0Var, 2));
                            tb0Var2.setOnValueChangedListener(rg0Var);
                            tb0Var.setValue(0);
                            tb0Var2.setValue(6);
                            tg0Var.addView(frameLayout3, c8.ma.t(-1, 48, 83, 16, 15, 16, 16));
                            ug0Var.setPadding(org.telegram.messenger.g0.L(34.0f), 0, org.telegram.messenger.g0.L(34.0f), 0);
                            ug0Var.setGravity(17);
                            org.telegram.ui.ActionBar.t6.U(ug0Var, org.telegram.ui.ActionBar.m6.Ji, null);
                            ug0Var.setTextSize(1, 14.0f);
                            ug0Var.setMaxLines(2);
                            ug0Var.setTypeface(org.telegram.messenger.g0.o());
                            ug0Var.setBackgroundDrawable(org.telegram.ui.ActionBar.a6.f(org.telegram.ui.ActionBar.m6.Fi, 4.0f));
                            frameLayout3.addView(ug0Var, c8.ma.c(48.0f, -1));
                            ug0Var.setOnClickListener(new org.telegram.ui.Components.m8(21, wg0Var, atVar));
                            textView3.setPadding(org.telegram.messenger.g0.L(34.0f), 0, org.telegram.messenger.g0.L(34.0f), 0);
                            textView3.setGravity(17);
                            org.telegram.ui.ActionBar.t6.U(textView3, org.telegram.ui.ActionBar.m6.q5, null);
                            textView3.setTextSize(1, 14.0f);
                            textView3.setAlpha(0.0f);
                            textView3.setScaleX(0.5f);
                            textView3.setScaleY(0.5f);
                            frameLayout3.addView(textView3, c8.ma.c(48.0f, -1));
                            sg0Var.addView(tg0Var, c8.ma.e(-1, -2, 51));
                            qa0Var.O = wg0Var;
                            ((FrameLayout) qa0Var.fragmentView).addView(wg0Var, c8.ma.c(-1.0f, -1));
                            org.telegram.ui.Components.wg0 wg0Var2 = qa0Var.O;
                            wg0Var2.r = false;
                            AnimatorSet animatorSet = wg0Var2.s;
                            if (animatorSet != null) {
                                animatorSet.cancel();
                                wg0Var2.s = null;
                            }
                            org.telegram.ui.Components.sg0 sg0Var2 = wg0Var2.w;
                            Point point = org.telegram.messenger.g0.q;
                            sg0Var2.measure(View.MeasureSpec.makeMeasureSpec((wg0Var2.y * 2) + point.x, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(point.y, TLObject.FLAG_31));
                            if (wg0Var2.r) {
                                z11 = true;
                            } else {
                                sg0Var2.setVisibility(0);
                                if (wg0Var2.x) {
                                    wg0Var2.setLayerType(2, null);
                                }
                                sg0Var2.setTranslationY(sg0Var2.getMeasuredHeight());
                                AnimatorSet animatorSet2 = new AnimatorSet();
                                wg0Var2.s = animatorSet2;
                                animatorSet2.playTogether(ObjectAnimator.ofFloat(sg0Var2, (Property<org.telegram.ui.Components.sg0, Float>) View.TRANSLATION_Y, 0.0f));
                                wg0Var2.s.setDuration(400L);
                                wg0Var2.s.setStartDelay(20L);
                                wg0Var2.s.setInterpolator(wg0Var2.G);
                                z11 = true;
                                wg0Var2.s.addListener(new org.telegram.ui.Components.vg0(wg0Var2, 1 == true ? 1 : 0));
                                org.telegram.messenger.ks.e().k(98, 512);
                                wg0Var2.s.start();
                            }
                            wg0Var2.c(z11);
                            return;
                        case 1:
                            try {
                                TLRPC.GeoPoint geoPoint = qa0Var.J0.k.media.geo;
                                double d = geoPoint.lat;
                                double d2 = geoPoint._long;
                                qa0Var.getParentActivity().startActivity(new Intent("android.intent.action.VIEW", Uri.parse("geo:" + d + "," + d2 + "?q=" + d + "," + d2)));
                                return;
                            } catch (Exception e12) {
                                org.telegram.messenger.a8.g(e12, true);
                                return;
                            }
                        case 2:
                            int i19 = qa0Var.N0;
                            Activity parentActivity2 = qa0Var.getParentActivity();
                            if (parentActivity2 != null && parentActivity2.checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") != 0) {
                                if (qa0Var.getParentActivity() == null) {
                                    return;
                                }
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(qa0Var.getParentActivity());
                                int i20 = org.telegram.ui.ActionBar.m6.L5;
                                alertDialog$Builder.m(R.raw.permission_request_location, 72, qa0Var.getThemedColor(i20), null);
                                alertDialog$Builder.n(i20, qa0Var.getResourceProvider());
                                SpannableStringBuilder W2 = org.telegram.messenger.g0.W2(org.telegram.messenger.gd.N0(2131747110, null));
                                org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
                                t1Var.U = W2;
                                alertDialog$Builder.h(org.telegram.messenger.gd.N0(2131747106, null), new da0(qa0Var, i16));
                                alertDialog$Builder.k(org.telegram.messenger.gd.N0(2131747637, null), null);
                                qa0Var.showDialog(t1Var);
                                return;
                            }
                            if (qa0Var.l0() || i19 == 3) {
                                if ((qa0Var.J0 != null && i19 != 3) || qa0Var.H0 != null) {
                                    if (qa0Var.z0 == null || (daVar = qa0Var.F) == null) {
                                        return;
                                    }
                                    daVar.b(((pb.b) org.telegram.messenger.t0.k()).newCameraUpdateLatLngZoom(new org.telegram.messenger.ab(qa0Var.z0.getLatitude(), qa0Var.z0.getLongitude()), qa0Var.F.e() - 4.0f));
                                    return;
                                }
                                if (qa0Var.z0 == null || qa0Var.F == null) {
                                    return;
                                }
                                ImageView imageView = qa0Var.a;
                                int i21 = org.telegram.ui.ActionBar.m6.mj;
                                org.telegram.ui.ActionBar.t6.s(imageView, i21, qa0Var.getResourceProvider(), PorterDuff.Mode.MULTIPLY);
                                qa0Var.a.setTag(Integer.valueOf(i21));
                                qa0Var.Q.L(null);
                                qa0Var.K0 = false;
                                qa0Var.F.b(((pb.b) org.telegram.messenger.t0.k()).newCameraUpdateLatLng(new org.telegram.messenger.ab(qa0Var.z0.getLatitude(), qa0Var.z0.getLongitude())));
                                return;
                            }
                            return;
                        default:
                            qa0Var.q0 = -1L;
                            qa0Var.K0 = true;
                            if (qa0Var.r0()) {
                                qa0Var.r0 = true;
                                qa0Var.J0(false, true);
                                return;
                            }
                            return;
                    }
                }
            });
        }
        org.telegram.ui.ActionBar.m5 titleTextView = this.simpleActionBar.getTitleTextView();
        if (titleTextView != null) {
            fh.g c10 = getBaseSimpleGlass().c.c(titleTextView, null, false);
            c10.p(c8.i0.m(getResourceProvider()));
            c10.r(org.telegram.messenger.g0.L(23.0f));
            titleTextView.setBackground(c10);
            Paint.FontMetricsInt fontMetricsInt = titleTextView.getTextPaint().getFontMetricsInt();
            int max = Math.max(0, (org.telegram.messenger.g0.L(46.0f) - (fontMetricsInt.descent - fontMetricsInt.ascent)) / 2);
            titleTextView.setPadding(org.telegram.messenger.g0.L(18.0f), max, org.telegram.messenger.g0.L(18.0f), max);
        }
        ImageView imageView = new ImageView(context);
        this.a = imageView;
        F0(imageView);
        this.a.setImageResource(R.drawable.msg_current_location);
        ImageView imageView2 = this.a;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView2.setScaleType(scaleType);
        ImageView imageView3 = this.a;
        int i15 = org.telegram.ui.ActionBar.m6.mj;
        org.telegram.ui.ActionBar.h6 resourceProvider = getResourceProvider();
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        org.telegram.ui.ActionBar.t6.s(imageView3, i15, resourceProvider, mode);
        this.a.setTag(Integer.valueOf(i15));
        this.a.setContentDescription(org.telegram.messenger.gd.N0(2131754830, null));
        this.Y.addView(this.a, c8.ma.e(58, 58, 85));
        this.a.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.ba0
            public final /* synthetic */ qa0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                boolean z11;
                org.telegram.messenger.da daVar;
                int i152 = i12;
                int i16 = 4;
                qa0 qa0Var = this.b;
                switch (i152) {
                    case 0:
                        if (qa0Var.getParentActivity() == null || qa0Var.z0 == null || !qa0Var.l0() || qa0Var.F == null) {
                            return;
                        }
                        hi.l3 l3Var = qa0Var.s;
                        if (l3Var != null) {
                            l3Var.f(true);
                        }
                        org.telegram.messenger.mp.g1().edit().putInt("proximityhint", 3).commit();
                        org.telegram.messenger.pd h = qa0Var.getLocationController().h(qa0Var.m0);
                        if (qa0Var.y) {
                            qa0Var.x[0].d(1, true);
                        }
                        if (h != null && h.f > 0) {
                            qa0Var.c.setImageResource(R.drawable.msg_location_alert);
                            k8.a aVar = qa0Var.L;
                            if (aVar != null) {
                                aVar.b1();
                                qa0Var.L = null;
                            }
                            qa0Var.y = true;
                            qa0Var.w0().k(0L, 25, 0, null, new aa0(qa0Var, 3), new h60(15, qa0Var, h));
                            return;
                        }
                        k8.a aVar2 = qa0Var.L;
                        int i17 = 6;
                        if (aVar2 == null) {
                            qa0Var.m0(500);
                        } else {
                            try {
                                v7.f fVar = (v7.f) ((m8.a) aVar2.b).a;
                                Parcel o12 = fVar.o1(fVar.p1(), 6);
                                double readDouble = o12.readDouble();
                                o12.recycle();
                                qa0Var.M = readDouble;
                            } catch (RemoteException e11) {
                                throw new androidx.car.app.j(e11);
                            }
                        }
                        TLRPC.User c22 = org.telegram.messenger.n5.E(qa0Var.m0) ? qa0Var.getMessagesController().c2(Long.valueOf(qa0Var.m0)) : null;
                        Activity parentActivity = qa0Var.getParentActivity();
                        da0 da0Var = new da0(qa0Var, i17);
                        at atVar = new at(20, qa0Var, c22);
                        aa0 aa0Var = new aa0(qa0Var, 4);
                        org.telegram.ui.Components.wg0 wg0Var = new org.telegram.ui.Components.wg0(parentActivity);
                        wg0Var.a = null;
                        wg0Var.d = -1;
                        wg0Var.e = false;
                        wg0Var.f = false;
                        wg0Var.h = null;
                        wg0Var.n = new Rect();
                        new Paint();
                        wg0Var.x = true;
                        wg0Var.G = org.telegram.ui.Components.nr.h;
                        wg0Var.setWillNotDraw(false);
                        wg0Var.R = aa0Var;
                        wg0Var.E = ViewConfiguration.get(parentActivity).getScaledTouchSlop();
                        Rect rect = new Rect();
                        Drawable mutate = parentActivity.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
                        org.telegram.ui.ActionBar.t6.x(wg0Var, mutate, org.telegram.ui.ActionBar.m6.h5, null, PorterDuff.Mode.MULTIPLY);
                        mutate.getPadding(rect);
                        int i18 = rect.left;
                        wg0Var.y = i18;
                        org.telegram.ui.Components.sg0 sg0Var = new org.telegram.ui.Components.sg0(wg0Var.getContext());
                        wg0Var.w = sg0Var;
                        sg0Var.setBackgroundDrawable(mutate);
                        sg0Var.setPadding(i18, (org.telegram.messenger.g0.L(8.0f) + rect.top) - 1, i18, 0);
                        sg0Var.setVisibility(4);
                        wg0Var.addView(sg0Var, 0, c8.ma.e(-1, -2, 80));
                        org.telegram.messenger.gd.l();
                        wg0Var.P = org.telegram.messenger.gd.g0.booleanValue();
                        wg0Var.N = c22;
                        wg0Var.J = da0Var;
                        org.telegram.ui.Components.tb0 tb0Var = new org.telegram.ui.Components.tb0(parentActivity, null);
                        wg0Var.H = tb0Var;
                        tb0Var.setTextOffset(org.telegram.messenger.g0.L(10.0f));
                        tb0Var.setItemCount(5);
                        org.telegram.ui.Components.tb0 tb0Var2 = new org.telegram.ui.Components.tb0(parentActivity, null);
                        wg0Var.I = tb0Var2;
                        tb0Var2.setItemCount(5);
                        tb0Var2.setTextOffset(-org.telegram.messenger.g0.L(10.0f));
                        org.telegram.ui.Components.tg0 tg0Var = new org.telegram.ui.Components.tg0(wg0Var, parentActivity);
                        wg0Var.Q = tg0Var;
                        tg0Var.setOrientation(1);
                        FrameLayout frameLayout2 = new FrameLayout(parentActivity);
                        tg0Var.addView(frameLayout2, c8.ma.t(-1, -2, 51, 22, 0, 0, 4));
                        TextView textView2 = new TextView(parentActivity);
                        textView2.setText(org.telegram.messenger.gd.N0(2131748563, null));
                        org.telegram.messenger.f3.l(textView2, org.telegram.ui.ActionBar.m6.j5, null, 1, 20.0f);
                        frameLayout2.addView(textView2, c8.ma.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
                        textView2.setOnTouchListener(new gi.a(21));
                        LinearLayout linearLayout = new LinearLayout(parentActivity);
                        linearLayout.setOrientation(0);
                        linearLayout.setWeightSum(1.0f);
                        tg0Var.addView(linearLayout, c8.ma.o(-1, -2));
                        System.currentTimeMillis();
                        FrameLayout frameLayout3 = new FrameLayout(parentActivity);
                        TextView textView3 = new TextView(parentActivity);
                        wg0Var.L = textView3;
                        org.telegram.ui.Components.ug0 ug0Var = new org.telegram.ui.Components.ug0(parentActivity);
                        wg0Var.K = ug0Var;
                        linearLayout.addView(tb0Var, c8.ma.l(0.5f, 0, org.telegram.messenger.ks.t4));
                        tb0Var.setFormatter(new org.telegram.ui.Components.rg0(wg0Var, 0));
                        tb0Var.setMinValue(0);
                        tb0Var.setMaxValue(10);
                        tb0Var.setWrapSelectorWheel(false);
                        tb0Var.setTextOffset(org.telegram.messenger.g0.L(20.0f));
                        org.telegram.ui.Components.rg0 rg0Var = new org.telegram.ui.Components.rg0(wg0Var, 1);
                        tb0Var.setOnValueChangedListener(rg0Var);
                        tb0Var2.setMinValue(0);
                        tb0Var2.setMaxValue(10);
                        tb0Var2.setWrapSelectorWheel(false);
                        tb0Var2.setTextOffset(-org.telegram.messenger.g0.L(20.0f));
                        linearLayout.addView(tb0Var2, c8.ma.l(0.5f, 0, org.telegram.messenger.ks.t4));
                        tb0Var2.setFormatter(new org.telegram.ui.Components.rg0(wg0Var, 2));
                        tb0Var2.setOnValueChangedListener(rg0Var);
                        tb0Var.setValue(0);
                        tb0Var2.setValue(6);
                        tg0Var.addView(frameLayout3, c8.ma.t(-1, 48, 83, 16, 15, 16, 16));
                        ug0Var.setPadding(org.telegram.messenger.g0.L(34.0f), 0, org.telegram.messenger.g0.L(34.0f), 0);
                        ug0Var.setGravity(17);
                        org.telegram.ui.ActionBar.t6.U(ug0Var, org.telegram.ui.ActionBar.m6.Ji, null);
                        ug0Var.setTextSize(1, 14.0f);
                        ug0Var.setMaxLines(2);
                        ug0Var.setTypeface(org.telegram.messenger.g0.o());
                        ug0Var.setBackgroundDrawable(org.telegram.ui.ActionBar.a6.f(org.telegram.ui.ActionBar.m6.Fi, 4.0f));
                        frameLayout3.addView(ug0Var, c8.ma.c(48.0f, -1));
                        ug0Var.setOnClickListener(new org.telegram.ui.Components.m8(21, wg0Var, atVar));
                        textView3.setPadding(org.telegram.messenger.g0.L(34.0f), 0, org.telegram.messenger.g0.L(34.0f), 0);
                        textView3.setGravity(17);
                        org.telegram.ui.ActionBar.t6.U(textView3, org.telegram.ui.ActionBar.m6.q5, null);
                        textView3.setTextSize(1, 14.0f);
                        textView3.setAlpha(0.0f);
                        textView3.setScaleX(0.5f);
                        textView3.setScaleY(0.5f);
                        frameLayout3.addView(textView3, c8.ma.c(48.0f, -1));
                        sg0Var.addView(tg0Var, c8.ma.e(-1, -2, 51));
                        qa0Var.O = wg0Var;
                        ((FrameLayout) qa0Var.fragmentView).addView(wg0Var, c8.ma.c(-1.0f, -1));
                        org.telegram.ui.Components.wg0 wg0Var2 = qa0Var.O;
                        wg0Var2.r = false;
                        AnimatorSet animatorSet = wg0Var2.s;
                        if (animatorSet != null) {
                            animatorSet.cancel();
                            wg0Var2.s = null;
                        }
                        org.telegram.ui.Components.sg0 sg0Var2 = wg0Var2.w;
                        Point point = org.telegram.messenger.g0.q;
                        sg0Var2.measure(View.MeasureSpec.makeMeasureSpec((wg0Var2.y * 2) + point.x, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(point.y, TLObject.FLAG_31));
                        if (wg0Var2.r) {
                            z11 = true;
                        } else {
                            sg0Var2.setVisibility(0);
                            if (wg0Var2.x) {
                                wg0Var2.setLayerType(2, null);
                            }
                            sg0Var2.setTranslationY(sg0Var2.getMeasuredHeight());
                            AnimatorSet animatorSet2 = new AnimatorSet();
                            wg0Var2.s = animatorSet2;
                            animatorSet2.playTogether(ObjectAnimator.ofFloat(sg0Var2, (Property<org.telegram.ui.Components.sg0, Float>) View.TRANSLATION_Y, 0.0f));
                            wg0Var2.s.setDuration(400L);
                            wg0Var2.s.setStartDelay(20L);
                            wg0Var2.s.setInterpolator(wg0Var2.G);
                            z11 = true;
                            wg0Var2.s.addListener(new org.telegram.ui.Components.vg0(wg0Var2, 1 == true ? 1 : 0));
                            org.telegram.messenger.ks.e().k(98, 512);
                            wg0Var2.s.start();
                        }
                        wg0Var2.c(z11);
                        return;
                    case 1:
                        try {
                            TLRPC.GeoPoint geoPoint = qa0Var.J0.k.media.geo;
                            double d = geoPoint.lat;
                            double d2 = geoPoint._long;
                            qa0Var.getParentActivity().startActivity(new Intent("android.intent.action.VIEW", Uri.parse("geo:" + d + "," + d2 + "?q=" + d + "," + d2)));
                            return;
                        } catch (Exception e12) {
                            org.telegram.messenger.a8.g(e12, true);
                            return;
                        }
                    case 2:
                        int i19 = qa0Var.N0;
                        Activity parentActivity2 = qa0Var.getParentActivity();
                        if (parentActivity2 != null && parentActivity2.checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") != 0) {
                            if (qa0Var.getParentActivity() == null) {
                                return;
                            }
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(qa0Var.getParentActivity());
                            int i20 = org.telegram.ui.ActionBar.m6.L5;
                            alertDialog$Builder.m(R.raw.permission_request_location, 72, qa0Var.getThemedColor(i20), null);
                            alertDialog$Builder.n(i20, qa0Var.getResourceProvider());
                            SpannableStringBuilder W2 = org.telegram.messenger.g0.W2(org.telegram.messenger.gd.N0(2131747110, null));
                            org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
                            t1Var.U = W2;
                            alertDialog$Builder.h(org.telegram.messenger.gd.N0(2131747106, null), new da0(qa0Var, i16));
                            alertDialog$Builder.k(org.telegram.messenger.gd.N0(2131747637, null), null);
                            qa0Var.showDialog(t1Var);
                            return;
                        }
                        if (qa0Var.l0() || i19 == 3) {
                            if ((qa0Var.J0 != null && i19 != 3) || qa0Var.H0 != null) {
                                if (qa0Var.z0 == null || (daVar = qa0Var.F) == null) {
                                    return;
                                }
                                daVar.b(((pb.b) org.telegram.messenger.t0.k()).newCameraUpdateLatLngZoom(new org.telegram.messenger.ab(qa0Var.z0.getLatitude(), qa0Var.z0.getLongitude()), qa0Var.F.e() - 4.0f));
                                return;
                            }
                            if (qa0Var.z0 == null || qa0Var.F == null) {
                                return;
                            }
                            ImageView imageView4 = qa0Var.a;
                            int i21 = org.telegram.ui.ActionBar.m6.mj;
                            org.telegram.ui.ActionBar.t6.s(imageView4, i21, qa0Var.getResourceProvider(), PorterDuff.Mode.MULTIPLY);
                            qa0Var.a.setTag(Integer.valueOf(i21));
                            qa0Var.Q.L(null);
                            qa0Var.K0 = false;
                            qa0Var.F.b(((pb.b) org.telegram.messenger.t0.k()).newCameraUpdateLatLng(new org.telegram.messenger.ab(qa0Var.z0.getLatitude(), qa0Var.z0.getLongitude())));
                            return;
                        }
                        return;
                    default:
                        qa0Var.q0 = -1L;
                        qa0Var.K0 = true;
                        if (qa0Var.r0()) {
                            qa0Var.r0 = true;
                            qa0Var.J0(false, true);
                            return;
                        }
                        return;
                }
            }
        });
        TextView textView2 = new TextView(context);
        this.b = textView2;
        F0(textView2);
        this.b.setGravity(17);
        this.b.setTextSize(1, 15.0f);
        org.telegram.ui.ActionBar.t6.U(this.b, org.telegram.ui.ActionBar.m6.Fi, this.resourceProvider);
        this.b.setTypeface(org.telegram.messenger.g0.o());
        this.b.setPadding(org.telegram.messenger.g0.L(22.0f), 0, org.telegram.messenger.g0.L(22.0f), 0);
        this.b.setText(org.telegram.messenger.gd.N0(2131748551, null));
        this.Y.addView(this.b, c8.ma.e(-2, 58, 81));
        final int i16 = 3;
        this.b.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.ba0
            public final /* synthetic */ qa0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                boolean z11;
                org.telegram.messenger.da daVar;
                int i152 = i16;
                int i162 = 4;
                qa0 qa0Var = this.b;
                switch (i152) {
                    case 0:
                        if (qa0Var.getParentActivity() == null || qa0Var.z0 == null || !qa0Var.l0() || qa0Var.F == null) {
                            return;
                        }
                        hi.l3 l3Var = qa0Var.s;
                        if (l3Var != null) {
                            l3Var.f(true);
                        }
                        org.telegram.messenger.mp.g1().edit().putInt("proximityhint", 3).commit();
                        org.telegram.messenger.pd h = qa0Var.getLocationController().h(qa0Var.m0);
                        if (qa0Var.y) {
                            qa0Var.x[0].d(1, true);
                        }
                        if (h != null && h.f > 0) {
                            qa0Var.c.setImageResource(R.drawable.msg_location_alert);
                            k8.a aVar = qa0Var.L;
                            if (aVar != null) {
                                aVar.b1();
                                qa0Var.L = null;
                            }
                            qa0Var.y = true;
                            qa0Var.w0().k(0L, 25, 0, null, new aa0(qa0Var, 3), new h60(15, qa0Var, h));
                            return;
                        }
                        k8.a aVar2 = qa0Var.L;
                        int i17 = 6;
                        if (aVar2 == null) {
                            qa0Var.m0(500);
                        } else {
                            try {
                                v7.f fVar = (v7.f) ((m8.a) aVar2.b).a;
                                Parcel o12 = fVar.o1(fVar.p1(), 6);
                                double readDouble = o12.readDouble();
                                o12.recycle();
                                qa0Var.M = readDouble;
                            } catch (RemoteException e11) {
                                throw new androidx.car.app.j(e11);
                            }
                        }
                        TLRPC.User c22 = org.telegram.messenger.n5.E(qa0Var.m0) ? qa0Var.getMessagesController().c2(Long.valueOf(qa0Var.m0)) : null;
                        Activity parentActivity = qa0Var.getParentActivity();
                        da0 da0Var = new da0(qa0Var, i17);
                        at atVar = new at(20, qa0Var, c22);
                        aa0 aa0Var = new aa0(qa0Var, 4);
                        org.telegram.ui.Components.wg0 wg0Var = new org.telegram.ui.Components.wg0(parentActivity);
                        wg0Var.a = null;
                        wg0Var.d = -1;
                        wg0Var.e = false;
                        wg0Var.f = false;
                        wg0Var.h = null;
                        wg0Var.n = new Rect();
                        new Paint();
                        wg0Var.x = true;
                        wg0Var.G = org.telegram.ui.Components.nr.h;
                        wg0Var.setWillNotDraw(false);
                        wg0Var.R = aa0Var;
                        wg0Var.E = ViewConfiguration.get(parentActivity).getScaledTouchSlop();
                        Rect rect = new Rect();
                        Drawable mutate = parentActivity.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
                        org.telegram.ui.ActionBar.t6.x(wg0Var, mutate, org.telegram.ui.ActionBar.m6.h5, null, PorterDuff.Mode.MULTIPLY);
                        mutate.getPadding(rect);
                        int i18 = rect.left;
                        wg0Var.y = i18;
                        org.telegram.ui.Components.sg0 sg0Var = new org.telegram.ui.Components.sg0(wg0Var.getContext());
                        wg0Var.w = sg0Var;
                        sg0Var.setBackgroundDrawable(mutate);
                        sg0Var.setPadding(i18, (org.telegram.messenger.g0.L(8.0f) + rect.top) - 1, i18, 0);
                        sg0Var.setVisibility(4);
                        wg0Var.addView(sg0Var, 0, c8.ma.e(-1, -2, 80));
                        org.telegram.messenger.gd.l();
                        wg0Var.P = org.telegram.messenger.gd.g0.booleanValue();
                        wg0Var.N = c22;
                        wg0Var.J = da0Var;
                        org.telegram.ui.Components.tb0 tb0Var = new org.telegram.ui.Components.tb0(parentActivity, null);
                        wg0Var.H = tb0Var;
                        tb0Var.setTextOffset(org.telegram.messenger.g0.L(10.0f));
                        tb0Var.setItemCount(5);
                        org.telegram.ui.Components.tb0 tb0Var2 = new org.telegram.ui.Components.tb0(parentActivity, null);
                        wg0Var.I = tb0Var2;
                        tb0Var2.setItemCount(5);
                        tb0Var2.setTextOffset(-org.telegram.messenger.g0.L(10.0f));
                        org.telegram.ui.Components.tg0 tg0Var = new org.telegram.ui.Components.tg0(wg0Var, parentActivity);
                        wg0Var.Q = tg0Var;
                        tg0Var.setOrientation(1);
                        FrameLayout frameLayout2 = new FrameLayout(parentActivity);
                        tg0Var.addView(frameLayout2, c8.ma.t(-1, -2, 51, 22, 0, 0, 4));
                        TextView textView22 = new TextView(parentActivity);
                        textView22.setText(org.telegram.messenger.gd.N0(2131748563, null));
                        org.telegram.messenger.f3.l(textView22, org.telegram.ui.ActionBar.m6.j5, null, 1, 20.0f);
                        frameLayout2.addView(textView22, c8.ma.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
                        textView22.setOnTouchListener(new gi.a(21));
                        LinearLayout linearLayout = new LinearLayout(parentActivity);
                        linearLayout.setOrientation(0);
                        linearLayout.setWeightSum(1.0f);
                        tg0Var.addView(linearLayout, c8.ma.o(-1, -2));
                        System.currentTimeMillis();
                        FrameLayout frameLayout3 = new FrameLayout(parentActivity);
                        TextView textView3 = new TextView(parentActivity);
                        wg0Var.L = textView3;
                        org.telegram.ui.Components.ug0 ug0Var = new org.telegram.ui.Components.ug0(parentActivity);
                        wg0Var.K = ug0Var;
                        linearLayout.addView(tb0Var, c8.ma.l(0.5f, 0, org.telegram.messenger.ks.t4));
                        tb0Var.setFormatter(new org.telegram.ui.Components.rg0(wg0Var, 0));
                        tb0Var.setMinValue(0);
                        tb0Var.setMaxValue(10);
                        tb0Var.setWrapSelectorWheel(false);
                        tb0Var.setTextOffset(org.telegram.messenger.g0.L(20.0f));
                        org.telegram.ui.Components.rg0 rg0Var = new org.telegram.ui.Components.rg0(wg0Var, 1);
                        tb0Var.setOnValueChangedListener(rg0Var);
                        tb0Var2.setMinValue(0);
                        tb0Var2.setMaxValue(10);
                        tb0Var2.setWrapSelectorWheel(false);
                        tb0Var2.setTextOffset(-org.telegram.messenger.g0.L(20.0f));
                        linearLayout.addView(tb0Var2, c8.ma.l(0.5f, 0, org.telegram.messenger.ks.t4));
                        tb0Var2.setFormatter(new org.telegram.ui.Components.rg0(wg0Var, 2));
                        tb0Var2.setOnValueChangedListener(rg0Var);
                        tb0Var.setValue(0);
                        tb0Var2.setValue(6);
                        tg0Var.addView(frameLayout3, c8.ma.t(-1, 48, 83, 16, 15, 16, 16));
                        ug0Var.setPadding(org.telegram.messenger.g0.L(34.0f), 0, org.telegram.messenger.g0.L(34.0f), 0);
                        ug0Var.setGravity(17);
                        org.telegram.ui.ActionBar.t6.U(ug0Var, org.telegram.ui.ActionBar.m6.Ji, null);
                        ug0Var.setTextSize(1, 14.0f);
                        ug0Var.setMaxLines(2);
                        ug0Var.setTypeface(org.telegram.messenger.g0.o());
                        ug0Var.setBackgroundDrawable(org.telegram.ui.ActionBar.a6.f(org.telegram.ui.ActionBar.m6.Fi, 4.0f));
                        frameLayout3.addView(ug0Var, c8.ma.c(48.0f, -1));
                        ug0Var.setOnClickListener(new org.telegram.ui.Components.m8(21, wg0Var, atVar));
                        textView3.setPadding(org.telegram.messenger.g0.L(34.0f), 0, org.telegram.messenger.g0.L(34.0f), 0);
                        textView3.setGravity(17);
                        org.telegram.ui.ActionBar.t6.U(textView3, org.telegram.ui.ActionBar.m6.q5, null);
                        textView3.setTextSize(1, 14.0f);
                        textView3.setAlpha(0.0f);
                        textView3.setScaleX(0.5f);
                        textView3.setScaleY(0.5f);
                        frameLayout3.addView(textView3, c8.ma.c(48.0f, -1));
                        sg0Var.addView(tg0Var, c8.ma.e(-1, -2, 51));
                        qa0Var.O = wg0Var;
                        ((FrameLayout) qa0Var.fragmentView).addView(wg0Var, c8.ma.c(-1.0f, -1));
                        org.telegram.ui.Components.wg0 wg0Var2 = qa0Var.O;
                        wg0Var2.r = false;
                        AnimatorSet animatorSet = wg0Var2.s;
                        if (animatorSet != null) {
                            animatorSet.cancel();
                            wg0Var2.s = null;
                        }
                        org.telegram.ui.Components.sg0 sg0Var2 = wg0Var2.w;
                        Point point = org.telegram.messenger.g0.q;
                        sg0Var2.measure(View.MeasureSpec.makeMeasureSpec((wg0Var2.y * 2) + point.x, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(point.y, TLObject.FLAG_31));
                        if (wg0Var2.r) {
                            z11 = true;
                        } else {
                            sg0Var2.setVisibility(0);
                            if (wg0Var2.x) {
                                wg0Var2.setLayerType(2, null);
                            }
                            sg0Var2.setTranslationY(sg0Var2.getMeasuredHeight());
                            AnimatorSet animatorSet2 = new AnimatorSet();
                            wg0Var2.s = animatorSet2;
                            animatorSet2.playTogether(ObjectAnimator.ofFloat(sg0Var2, (Property<org.telegram.ui.Components.sg0, Float>) View.TRANSLATION_Y, 0.0f));
                            wg0Var2.s.setDuration(400L);
                            wg0Var2.s.setStartDelay(20L);
                            wg0Var2.s.setInterpolator(wg0Var2.G);
                            z11 = true;
                            wg0Var2.s.addListener(new org.telegram.ui.Components.vg0(wg0Var2, 1 == true ? 1 : 0));
                            org.telegram.messenger.ks.e().k(98, 512);
                            wg0Var2.s.start();
                        }
                        wg0Var2.c(z11);
                        return;
                    case 1:
                        try {
                            TLRPC.GeoPoint geoPoint = qa0Var.J0.k.media.geo;
                            double d = geoPoint.lat;
                            double d2 = geoPoint._long;
                            qa0Var.getParentActivity().startActivity(new Intent("android.intent.action.VIEW", Uri.parse("geo:" + d + "," + d2 + "?q=" + d + "," + d2)));
                            return;
                        } catch (Exception e12) {
                            org.telegram.messenger.a8.g(e12, true);
                            return;
                        }
                    case 2:
                        int i19 = qa0Var.N0;
                        Activity parentActivity2 = qa0Var.getParentActivity();
                        if (parentActivity2 != null && parentActivity2.checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") != 0) {
                            if (qa0Var.getParentActivity() == null) {
                                return;
                            }
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(qa0Var.getParentActivity());
                            int i20 = org.telegram.ui.ActionBar.m6.L5;
                            alertDialog$Builder.m(R.raw.permission_request_location, 72, qa0Var.getThemedColor(i20), null);
                            alertDialog$Builder.n(i20, qa0Var.getResourceProvider());
                            SpannableStringBuilder W2 = org.telegram.messenger.g0.W2(org.telegram.messenger.gd.N0(2131747110, null));
                            org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
                            t1Var.U = W2;
                            alertDialog$Builder.h(org.telegram.messenger.gd.N0(2131747106, null), new da0(qa0Var, i162));
                            alertDialog$Builder.k(org.telegram.messenger.gd.N0(2131747637, null), null);
                            qa0Var.showDialog(t1Var);
                            return;
                        }
                        if (qa0Var.l0() || i19 == 3) {
                            if ((qa0Var.J0 != null && i19 != 3) || qa0Var.H0 != null) {
                                if (qa0Var.z0 == null || (daVar = qa0Var.F) == null) {
                                    return;
                                }
                                daVar.b(((pb.b) org.telegram.messenger.t0.k()).newCameraUpdateLatLngZoom(new org.telegram.messenger.ab(qa0Var.z0.getLatitude(), qa0Var.z0.getLongitude()), qa0Var.F.e() - 4.0f));
                                return;
                            }
                            if (qa0Var.z0 == null || qa0Var.F == null) {
                                return;
                            }
                            ImageView imageView4 = qa0Var.a;
                            int i21 = org.telegram.ui.ActionBar.m6.mj;
                            org.telegram.ui.ActionBar.t6.s(imageView4, i21, qa0Var.getResourceProvider(), PorterDuff.Mode.MULTIPLY);
                            qa0Var.a.setTag(Integer.valueOf(i21));
                            qa0Var.Q.L(null);
                            qa0Var.K0 = false;
                            qa0Var.F.b(((pb.b) org.telegram.messenger.t0.k()).newCameraUpdateLatLng(new org.telegram.messenger.ab(qa0Var.z0.getLatitude(), qa0Var.z0.getLongitude())));
                            return;
                        }
                        return;
                    default:
                        qa0Var.q0 = -1L;
                        qa0Var.K0 = true;
                        if (qa0Var.r0()) {
                            qa0Var.r0 = true;
                            qa0Var.J0(false, true);
                            return;
                        }
                        return;
                }
            }
        });
        J0(false, false);
        ImageView imageView4 = new ImageView(context);
        this.c = imageView4;
        F0(imageView4);
        org.telegram.ui.ActionBar.t6.s(this.c, org.telegram.ui.ActionBar.m6.lj, getResourceProvider(), mode);
        this.c.setScaleType(scaleType);
        this.c.setContentDescription(org.telegram.messenger.gd.N0(2131754846, null));
        this.X.addView(this.c, c8.ma.e(58, 58, 53));
        this.c.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.ba0
            public final /* synthetic */ qa0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                boolean z11;
                org.telegram.messenger.da daVar;
                int i152 = i10;
                int i162 = 4;
                qa0 qa0Var = this.b;
                switch (i152) {
                    case 0:
                        if (qa0Var.getParentActivity() == null || qa0Var.z0 == null || !qa0Var.l0() || qa0Var.F == null) {
                            return;
                        }
                        hi.l3 l3Var = qa0Var.s;
                        if (l3Var != null) {
                            l3Var.f(true);
                        }
                        org.telegram.messenger.mp.g1().edit().putInt("proximityhint", 3).commit();
                        org.telegram.messenger.pd h = qa0Var.getLocationController().h(qa0Var.m0);
                        if (qa0Var.y) {
                            qa0Var.x[0].d(1, true);
                        }
                        if (h != null && h.f > 0) {
                            qa0Var.c.setImageResource(R.drawable.msg_location_alert);
                            k8.a aVar = qa0Var.L;
                            if (aVar != null) {
                                aVar.b1();
                                qa0Var.L = null;
                            }
                            qa0Var.y = true;
                            qa0Var.w0().k(0L, 25, 0, null, new aa0(qa0Var, 3), new h60(15, qa0Var, h));
                            return;
                        }
                        k8.a aVar2 = qa0Var.L;
                        int i17 = 6;
                        if (aVar2 == null) {
                            qa0Var.m0(500);
                        } else {
                            try {
                                v7.f fVar = (v7.f) ((m8.a) aVar2.b).a;
                                Parcel o12 = fVar.o1(fVar.p1(), 6);
                                double readDouble = o12.readDouble();
                                o12.recycle();
                                qa0Var.M = readDouble;
                            } catch (RemoteException e11) {
                                throw new androidx.car.app.j(e11);
                            }
                        }
                        TLRPC.User c22 = org.telegram.messenger.n5.E(qa0Var.m0) ? qa0Var.getMessagesController().c2(Long.valueOf(qa0Var.m0)) : null;
                        Activity parentActivity = qa0Var.getParentActivity();
                        da0 da0Var = new da0(qa0Var, i17);
                        at atVar = new at(20, qa0Var, c22);
                        aa0 aa0Var = new aa0(qa0Var, 4);
                        org.telegram.ui.Components.wg0 wg0Var = new org.telegram.ui.Components.wg0(parentActivity);
                        wg0Var.a = null;
                        wg0Var.d = -1;
                        wg0Var.e = false;
                        wg0Var.f = false;
                        wg0Var.h = null;
                        wg0Var.n = new Rect();
                        new Paint();
                        wg0Var.x = true;
                        wg0Var.G = org.telegram.ui.Components.nr.h;
                        wg0Var.setWillNotDraw(false);
                        wg0Var.R = aa0Var;
                        wg0Var.E = ViewConfiguration.get(parentActivity).getScaledTouchSlop();
                        Rect rect = new Rect();
                        Drawable mutate = parentActivity.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
                        org.telegram.ui.ActionBar.t6.x(wg0Var, mutate, org.telegram.ui.ActionBar.m6.h5, null, PorterDuff.Mode.MULTIPLY);
                        mutate.getPadding(rect);
                        int i18 = rect.left;
                        wg0Var.y = i18;
                        org.telegram.ui.Components.sg0 sg0Var = new org.telegram.ui.Components.sg0(wg0Var.getContext());
                        wg0Var.w = sg0Var;
                        sg0Var.setBackgroundDrawable(mutate);
                        sg0Var.setPadding(i18, (org.telegram.messenger.g0.L(8.0f) + rect.top) - 1, i18, 0);
                        sg0Var.setVisibility(4);
                        wg0Var.addView(sg0Var, 0, c8.ma.e(-1, -2, 80));
                        org.telegram.messenger.gd.l();
                        wg0Var.P = org.telegram.messenger.gd.g0.booleanValue();
                        wg0Var.N = c22;
                        wg0Var.J = da0Var;
                        org.telegram.ui.Components.tb0 tb0Var = new org.telegram.ui.Components.tb0(parentActivity, null);
                        wg0Var.H = tb0Var;
                        tb0Var.setTextOffset(org.telegram.messenger.g0.L(10.0f));
                        tb0Var.setItemCount(5);
                        org.telegram.ui.Components.tb0 tb0Var2 = new org.telegram.ui.Components.tb0(parentActivity, null);
                        wg0Var.I = tb0Var2;
                        tb0Var2.setItemCount(5);
                        tb0Var2.setTextOffset(-org.telegram.messenger.g0.L(10.0f));
                        org.telegram.ui.Components.tg0 tg0Var = new org.telegram.ui.Components.tg0(wg0Var, parentActivity);
                        wg0Var.Q = tg0Var;
                        tg0Var.setOrientation(1);
                        FrameLayout frameLayout2 = new FrameLayout(parentActivity);
                        tg0Var.addView(frameLayout2, c8.ma.t(-1, -2, 51, 22, 0, 0, 4));
                        TextView textView22 = new TextView(parentActivity);
                        textView22.setText(org.telegram.messenger.gd.N0(2131748563, null));
                        org.telegram.messenger.f3.l(textView22, org.telegram.ui.ActionBar.m6.j5, null, 1, 20.0f);
                        frameLayout2.addView(textView22, c8.ma.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
                        textView22.setOnTouchListener(new gi.a(21));
                        LinearLayout linearLayout = new LinearLayout(parentActivity);
                        linearLayout.setOrientation(0);
                        linearLayout.setWeightSum(1.0f);
                        tg0Var.addView(linearLayout, c8.ma.o(-1, -2));
                        System.currentTimeMillis();
                        FrameLayout frameLayout3 = new FrameLayout(parentActivity);
                        TextView textView3 = new TextView(parentActivity);
                        wg0Var.L = textView3;
                        org.telegram.ui.Components.ug0 ug0Var = new org.telegram.ui.Components.ug0(parentActivity);
                        wg0Var.K = ug0Var;
                        linearLayout.addView(tb0Var, c8.ma.l(0.5f, 0, org.telegram.messenger.ks.t4));
                        tb0Var.setFormatter(new org.telegram.ui.Components.rg0(wg0Var, 0));
                        tb0Var.setMinValue(0);
                        tb0Var.setMaxValue(10);
                        tb0Var.setWrapSelectorWheel(false);
                        tb0Var.setTextOffset(org.telegram.messenger.g0.L(20.0f));
                        org.telegram.ui.Components.rg0 rg0Var = new org.telegram.ui.Components.rg0(wg0Var, 1);
                        tb0Var.setOnValueChangedListener(rg0Var);
                        tb0Var2.setMinValue(0);
                        tb0Var2.setMaxValue(10);
                        tb0Var2.setWrapSelectorWheel(false);
                        tb0Var2.setTextOffset(-org.telegram.messenger.g0.L(20.0f));
                        linearLayout.addView(tb0Var2, c8.ma.l(0.5f, 0, org.telegram.messenger.ks.t4));
                        tb0Var2.setFormatter(new org.telegram.ui.Components.rg0(wg0Var, 2));
                        tb0Var2.setOnValueChangedListener(rg0Var);
                        tb0Var.setValue(0);
                        tb0Var2.setValue(6);
                        tg0Var.addView(frameLayout3, c8.ma.t(-1, 48, 83, 16, 15, 16, 16));
                        ug0Var.setPadding(org.telegram.messenger.g0.L(34.0f), 0, org.telegram.messenger.g0.L(34.0f), 0);
                        ug0Var.setGravity(17);
                        org.telegram.ui.ActionBar.t6.U(ug0Var, org.telegram.ui.ActionBar.m6.Ji, null);
                        ug0Var.setTextSize(1, 14.0f);
                        ug0Var.setMaxLines(2);
                        ug0Var.setTypeface(org.telegram.messenger.g0.o());
                        ug0Var.setBackgroundDrawable(org.telegram.ui.ActionBar.a6.f(org.telegram.ui.ActionBar.m6.Fi, 4.0f));
                        frameLayout3.addView(ug0Var, c8.ma.c(48.0f, -1));
                        ug0Var.setOnClickListener(new org.telegram.ui.Components.m8(21, wg0Var, atVar));
                        textView3.setPadding(org.telegram.messenger.g0.L(34.0f), 0, org.telegram.messenger.g0.L(34.0f), 0);
                        textView3.setGravity(17);
                        org.telegram.ui.ActionBar.t6.U(textView3, org.telegram.ui.ActionBar.m6.q5, null);
                        textView3.setTextSize(1, 14.0f);
                        textView3.setAlpha(0.0f);
                        textView3.setScaleX(0.5f);
                        textView3.setScaleY(0.5f);
                        frameLayout3.addView(textView3, c8.ma.c(48.0f, -1));
                        sg0Var.addView(tg0Var, c8.ma.e(-1, -2, 51));
                        qa0Var.O = wg0Var;
                        ((FrameLayout) qa0Var.fragmentView).addView(wg0Var, c8.ma.c(-1.0f, -1));
                        org.telegram.ui.Components.wg0 wg0Var2 = qa0Var.O;
                        wg0Var2.r = false;
                        AnimatorSet animatorSet = wg0Var2.s;
                        if (animatorSet != null) {
                            animatorSet.cancel();
                            wg0Var2.s = null;
                        }
                        org.telegram.ui.Components.sg0 sg0Var2 = wg0Var2.w;
                        Point point = org.telegram.messenger.g0.q;
                        sg0Var2.measure(View.MeasureSpec.makeMeasureSpec((wg0Var2.y * 2) + point.x, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(point.y, TLObject.FLAG_31));
                        if (wg0Var2.r) {
                            z11 = true;
                        } else {
                            sg0Var2.setVisibility(0);
                            if (wg0Var2.x) {
                                wg0Var2.setLayerType(2, null);
                            }
                            sg0Var2.setTranslationY(sg0Var2.getMeasuredHeight());
                            AnimatorSet animatorSet2 = new AnimatorSet();
                            wg0Var2.s = animatorSet2;
                            animatorSet2.playTogether(ObjectAnimator.ofFloat(sg0Var2, (Property<org.telegram.ui.Components.sg0, Float>) View.TRANSLATION_Y, 0.0f));
                            wg0Var2.s.setDuration(400L);
                            wg0Var2.s.setStartDelay(20L);
                            wg0Var2.s.setInterpolator(wg0Var2.G);
                            z11 = true;
                            wg0Var2.s.addListener(new org.telegram.ui.Components.vg0(wg0Var2, 1 == true ? 1 : 0));
                            org.telegram.messenger.ks.e().k(98, 512);
                            wg0Var2.s.start();
                        }
                        wg0Var2.c(z11);
                        return;
                    case 1:
                        try {
                            TLRPC.GeoPoint geoPoint = qa0Var.J0.k.media.geo;
                            double d = geoPoint.lat;
                            double d2 = geoPoint._long;
                            qa0Var.getParentActivity().startActivity(new Intent("android.intent.action.VIEW", Uri.parse("geo:" + d + "," + d2 + "?q=" + d + "," + d2)));
                            return;
                        } catch (Exception e12) {
                            org.telegram.messenger.a8.g(e12, true);
                            return;
                        }
                    case 2:
                        int i19 = qa0Var.N0;
                        Activity parentActivity2 = qa0Var.getParentActivity();
                        if (parentActivity2 != null && parentActivity2.checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") != 0) {
                            if (qa0Var.getParentActivity() == null) {
                                return;
                            }
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(qa0Var.getParentActivity());
                            int i20 = org.telegram.ui.ActionBar.m6.L5;
                            alertDialog$Builder.m(R.raw.permission_request_location, 72, qa0Var.getThemedColor(i20), null);
                            alertDialog$Builder.n(i20, qa0Var.getResourceProvider());
                            SpannableStringBuilder W2 = org.telegram.messenger.g0.W2(org.telegram.messenger.gd.N0(2131747110, null));
                            org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
                            t1Var.U = W2;
                            alertDialog$Builder.h(org.telegram.messenger.gd.N0(2131747106, null), new da0(qa0Var, i162));
                            alertDialog$Builder.k(org.telegram.messenger.gd.N0(2131747637, null), null);
                            qa0Var.showDialog(t1Var);
                            return;
                        }
                        if (qa0Var.l0() || i19 == 3) {
                            if ((qa0Var.J0 != null && i19 != 3) || qa0Var.H0 != null) {
                                if (qa0Var.z0 == null || (daVar = qa0Var.F) == null) {
                                    return;
                                }
                                daVar.b(((pb.b) org.telegram.messenger.t0.k()).newCameraUpdateLatLngZoom(new org.telegram.messenger.ab(qa0Var.z0.getLatitude(), qa0Var.z0.getLongitude()), qa0Var.F.e() - 4.0f));
                                return;
                            }
                            if (qa0Var.z0 == null || qa0Var.F == null) {
                                return;
                            }
                            ImageView imageView42 = qa0Var.a;
                            int i21 = org.telegram.ui.ActionBar.m6.mj;
                            org.telegram.ui.ActionBar.t6.s(imageView42, i21, qa0Var.getResourceProvider(), PorterDuff.Mode.MULTIPLY);
                            qa0Var.a.setTag(Integer.valueOf(i21));
                            qa0Var.Q.L(null);
                            qa0Var.K0 = false;
                            qa0Var.F.b(((pb.b) org.telegram.messenger.t0.k()).newCameraUpdateLatLng(new org.telegram.messenger.ab(qa0Var.z0.getLatitude(), qa0Var.z0.getLongitude())));
                            return;
                        }
                        return;
                    default:
                        qa0Var.q0 = -1L;
                        qa0Var.K0 = true;
                        if (qa0Var.r0()) {
                            qa0Var.r0 = true;
                            qa0Var.J0(false, true);
                            return;
                        }
                        return;
                }
            }
        });
        TLRPC.Chat O0 = org.telegram.messenger.n5.z(this.m0) ? getMessagesController().O0(Long.valueOf(-this.m0)) : null;
        org.telegram.messenger.fj fjVar5 = this.J0;
        if (fjVar5 != null && fjVar5.C3()) {
            org.telegram.messenger.fj fjVar6 = this.J0;
            int currentTime = getConnectionsManager().getCurrentTime();
            TLRPC.Message message2 = fjVar6.k;
            if (message2.date + org.telegram.messenger.fj.n1(message2).period > currentTime && (!org.telegram.messenger.v3.T(O0) || O0.megagroup)) {
                org.telegram.messenger.pd h = getLocationController().h(this.m0);
                if (h == null || h.f <= 0) {
                    if (org.telegram.messenger.n5.E(this.m0) && this.J0.Z0() == getUserConfig().e()) {
                        this.c.setVisibility(4);
                        this.c.setAlpha(0.0f);
                        this.c.setScaleX(0.4f);
                        this.c.setScaleY(0.4f);
                    }
                    this.c.setImageResource(R.drawable.msg_location_alert);
                } else {
                    this.c.setImageResource(R.drawable.msg_location_alert2);
                }
                hi.l3 l3Var = new hi.l3(context, 1);
                this.s = l3Var;
                l3Var.setLayerType(2, null);
                hi.l3 l3Var2 = this.s;
                l3Var2.d = 4000L;
                l3Var2.o(1.0f, -21.0f);
                this.s.setPadding(0, org.telegram.messenger.g0.L(4.0f), 0, 0);
                this.s.l(getBaseSimpleGlass().c);
                this.X.addView(this.s, c8.ma.d(-1, -2.0f, 51, 8.0f, 56.0f, 8.0f, 0.0f));
                LinearLayout linearLayout = new LinearLayout(context);
                this.e = linearLayout;
                linearLayout.setOrientation(1);
                this.e.setGravity(1);
                this.e.setPadding(0, org.telegram.messenger.g0.L(160.0f), 0, 0);
                this.e.setVisibility(8);
                pa0Var.addView(this.e, c8.ma.c(-1.0f, -1));
                this.e.setOnTouchListener(new gi.a(i12));
                ImageView imageView5 = new ImageView(context);
                this.f = imageView5;
                imageView5.setImageResource(R.drawable.location_empty);
                org.telegram.ui.ActionBar.t6.s(this.f, org.telegram.ui.ActionBar.m6.W5, getResourceProvider(), mode);
                this.e.addView(this.f, c8.ma.o(-2, -2));
                TextView textView3 = new TextView(context);
                this.h = textView3;
                int i17 = org.telegram.ui.ActionBar.m6.X5;
                org.telegram.ui.ActionBar.t6.U(textView3, i17, getResourceProvider());
                this.h.setGravity(17);
                this.h.setTypeface(org.telegram.messenger.g0.o());
                this.h.setTextSize(1, 17.0f);
                this.h.setText(org.telegram.messenger.gd.N0(2131747986, null));
                TextView f10 = org.telegram.messenger.n10.f(this.e, this.h, c8.ma.t(-2, -2, 17, 0, 11, 0, 0), context);
                this.n = f10;
                org.telegram.ui.ActionBar.t6.U(f10, i17, getResourceProvider());
                this.n.setGravity(17);
                this.n.setTextSize(1, 15.0f);
                this.n.setPadding(org.telegram.messenger.g0.L(40.0f), 0, org.telegram.messenger.g0.L(40.0f), 0);
                this.e.addView(this.n, c8.ma.t(-2, -2, 17, 0, 6, 0, 0));
                this.R = new et(5, context, this);
                fh.g c11 = getBaseSimpleGlass().f.c(this.R, null, false);
                gh.e eVar = new gh.e(getResourceProvider());
                eVar.e = new g0.e(17);
                eVar.f(-1, 553648127);
                eVar.e(0, 0);
                eVar.d(372454195, 0);
                float N = org.telegram.messenger.g0.N(8.0f);
                float f11 = -org.telegram.messenger.g0.N(0.6666667f);
                eVar.n = N;
                eVar.r = f11;
                eVar.f = org.telegram.messenger.g0.N(0.55f);
                eVar.h = 0.0f;
                c11.p(eVar);
                c11.s(org.telegram.messenger.g0.L(29.0f), org.telegram.messenger.g0.L(29.0f), 0.0f, 0.0f);
                c11.q(org.telegram.messenger.g0.L(12.0f));
                this.Z = c11;
                et etVar = this.R;
                ia0 ia0Var2 = new ia0(this, context, this.N0, this.m0, getResourceProvider(), this.w, i13 != 8);
                this.Q = ia0Var2;
                etVar.setAdapter(ia0Var2);
                et etVar2 = this.R;
                v4.c0 c0Var = new v4.c0(1, false);
                this.V = c0Var;
                etVar2.setLayoutManager(c0Var);
                if (this.T0 == null) {
                    this.S0 = new org.telegram.ui.Cells.y3(context, this.resourceProvider);
                    ka0 ka0Var = new ka0(this, context, new org.telegram.ui.Components.bt0(this), this, new ja0(this), getResourceProvider());
                    this.R0 = ka0Var;
                    org.telegram.ui.ActionBar.t6.h(i14, ka0Var, getResourceProvider());
                    this.R0.addView(this.S0, c8.ma.e(-1, 32, 55));
                    this.Q.Z = this.R0;
                    this.R.setOverScrollMode(2);
                    v4.k kVar = new v4.k();
                    z10 = false;
                    kVar.m = false;
                    kVar.C = false;
                    kVar.o(org.telegram.ui.Components.nr.h);
                    kVar.n(350L);
                    this.R.setItemAnimator(kVar);
                } else {
                    z10 = false;
                }
                this.Q.O(this.k0, z10);
                this.Q.getClass();
                this.R.setVerticalScrollBarEnabled(z10);
                pa0Var.addView(this.R, c8.ma.e(-1, -1, 51));
                fjVar = this.J0;
                if (fjVar != null && (message = fjVar.k) != null && (messageMedia = message.media) != null && !TextUtils.isEmpty(messageMedia.address)) {
                    ia0 ia0Var3 = this.Q;
                    ia0Var3.I = this.J0.k.media.address;
                    ia0Var3.Q();
                }
                this.R.setOnScrollListener(new ga0(this, i11));
                final int i18 = 0;
                ((v4.k) this.R.getItemAnimator()).C = false;
                this.R.setOnItemLongClickListener(new at(18, this, context));
                this.R.setOnItemClickListener(new org.telegram.ui.Components.qj0(this) { // from class: org.telegram.ui.ca0
                    public final /* synthetic */ qa0 b;

                    {
                        this.b = this;
                    }

                    @Override // org.telegram.ui.Components.qj0
                    public final void c(int i19, View view) {
                        org.telegram.messenger.fj fjVar7;
                        TLRPC.TL_messageMediaVenue tL_messageMediaVenue;
                        int i20 = i18;
                        qa0 qa0Var = this.b;
                        switch (i20) {
                            case 0:
                                qa0Var.q0 = -1L;
                                int i21 = qa0Var.N0;
                                int i22 = 7;
                                if (i21 != 4) {
                                    if (i21 != 5) {
                                        if (i19 == 1 && (fjVar7 = qa0Var.J0) != null && (!fjVar7.C3() || i21 == 6)) {
                                            org.telegram.messenger.da daVar = qa0Var.F;
                                            if (daVar != null) {
                                                IMapsProvider k10 = org.telegram.messenger.t0.k();
                                                TLRPC.GeoPoint geoPoint = qa0Var.J0.k.media.geo;
                                                daVar.b(((pb.b) k10).newCameraUpdateLatLngZoom(new org.telegram.messenger.ab(geoPoint.lat, geoPoint._long), qa0Var.F.e() - 4.0f));
                                                break;
                                            }
                                        } else if (i19 == 1 && i21 != 2) {
                                            if (qa0Var.M0 != null && qa0Var.A0 != null) {
                                                TLRPC.TL_messageMediaGeo tL_messageMediaGeo = new TLRPC.TL_messageMediaGeo();
                                                TLRPC.TL_geoPoint tL_geoPoint = new TLRPC.TL_geoPoint();
                                                tL_messageMediaGeo.geo = tL_geoPoint;
                                                tL_geoPoint.lat = org.telegram.messenger.g0.b0(qa0Var.A0.getLatitude());
                                                tL_messageMediaGeo.geo._long = org.telegram.messenger.g0.b0(qa0Var.A0.getLongitude());
                                                qa0Var.M0.b(tL_messageMediaGeo, qa0Var.N0, true, 0, 0L);
                                                qa0Var.finishFragment();
                                                break;
                                            }
                                        } else if (i21 != 2 || !qa0Var.getLocationController().i(qa0Var.m0) || qa0Var.Q.d(i19) != 7) {
                                            if (i21 != 2 || !qa0Var.getLocationController().i(qa0Var.m0) || qa0Var.Q.d(i19) != 6) {
                                                if ((i19 != 2 || i21 != 1) && ((i19 != 1 || i21 != 2) && (i19 != 3 || i21 != 3))) {
                                                    Object I = qa0Var.Q.I(i19);
                                                    if (!(I instanceof TLRPC.TL_messageMediaVenue)) {
                                                        if (I instanceof ma0) {
                                                            ma0 ma0Var = (ma0) I;
                                                            qa0Var.q0 = ma0Var.a;
                                                            if (qa0Var.r0) {
                                                                qa0Var.r0 = false;
                                                                qa0Var.R0();
                                                            }
                                                            qa0Var.F.b(((pb.b) org.telegram.messenger.t0.k()).newCameraUpdateLatLngZoom(ma0Var.e.a(), qa0Var.F.e() - 4.0f));
                                                            break;
                                                        }
                                                    } else {
                                                        qa0Var.M0.b((TLRPC.TL_messageMediaVenue) I, qa0Var.N0, true, 0, 0L);
                                                        qa0Var.finishFragment();
                                                        break;
                                                    }
                                                } else if (!qa0Var.getLocationController().i(qa0Var.m0)) {
                                                    qa0Var.C0(false);
                                                    break;
                                                } else {
                                                    qa0Var.getLocationController().k(qa0Var.m0);
                                                    qa0Var.Q.f();
                                                    qa0Var.finishFragment();
                                                    break;
                                                }
                                            } else {
                                                qa0Var.C0(qa0Var.getLocationController().h(qa0Var.m0).d != Integer.MAX_VALUE);
                                                break;
                                            }
                                        } else {
                                            qa0Var.getLocationController().k(qa0Var.m0);
                                            qa0Var.Q.f();
                                            qa0Var.finishFragment();
                                            break;
                                        }
                                    } else {
                                        org.telegram.messenger.da daVar2 = qa0Var.F;
                                        if (daVar2 != null) {
                                            IMapsProvider k11 = org.telegram.messenger.t0.k();
                                            TLRPC.GeoPoint geoPoint2 = qa0Var.H0.geo_point;
                                            daVar2.b(((pb.b) k11).newCameraUpdateLatLngZoom(new org.telegram.messenger.ab(geoPoint2.lat, geoPoint2._long), qa0Var.F.e() - 4.0f));
                                            break;
                                        }
                                    }
                                } else if (i19 == 1 && (tL_messageMediaVenue = (TLRPC.TL_messageMediaVenue) qa0Var.Q.I(i19)) != null) {
                                    if (qa0Var.m0 != 0) {
                                        org.telegram.ui.ActionBar.t1[] t1VarArr = {new org.telegram.ui.ActionBar.t1(3, qa0Var.getParentActivity(), null)};
                                        TLRPC.TL_channels_editLocation tL_channels_editLocation = new TLRPC.TL_channels_editLocation();
                                        tL_channels_editLocation.address = tL_messageMediaVenue.address;
                                        tL_channels_editLocation.channel = qa0Var.getMessagesController().j1(-qa0Var.m0);
                                        TLRPC.TL_inputGeoPoint tL_inputGeoPoint = new TLRPC.TL_inputGeoPoint();
                                        tL_channels_editLocation.geo_point = tL_inputGeoPoint;
                                        TLRPC.GeoPoint geoPoint3 = tL_messageMediaVenue.geo;
                                        tL_inputGeoPoint.lat = geoPoint3.lat;
                                        tL_inputGeoPoint._long = geoPoint3._long;
                                        t1VarArr[0].setOnCancelListener(new di.z(qa0Var, qa0Var.getConnectionsManager().sendRequest(tL_channels_editLocation, new z9(qa0Var, t1VarArr, tL_messageMediaVenue, 19)), i22));
                                        qa0Var.showDialog(t1VarArr[0]);
                                        break;
                                    } else {
                                        qa0Var.M0.b(tL_messageMediaVenue, 4, true, 0, 0L);
                                        qa0Var.finishFragment();
                                        break;
                                    }
                                }
                                break;
                            default:
                                qa0.e0(qa0Var, i19);
                                break;
                        }
                    }
                });
                this.Q.P(this.O0);
                pa0Var.addView(this.P, pa0Var.indexOfChild(this.R), c8.ma.e(-1, -1, 51));
                org.telegram.messenger.xa onCreateMapView = ((pb.b) org.telegram.messenger.t0.k()).onCreateMapView(context);
                this.H = onCreateMapView;
                ((ai.l0) ((a8.r7) onCreateMapView).b).setAlpha(0.0f);
                org.telegram.messenger.xa xaVar = this.H;
                a8.r7 r7Var = (a8.r7) xaVar;
                r7Var.c = new da0(this, 0);
                r7Var.d = new da0(this, i11);
                r7Var.e = new aa0(this, 7);
                new Thread(new ea0(this, xaVar, i11)).start();
                fjVar2 = this.J0;
                if (fjVar2 != null && this.H0 == null) {
                    if (O0 != null && i13 == 4 && this.m0 != 0) {
                        FrameLayout frameLayout2 = new FrameLayout(context);
                        frameLayout2.setBackgroundResource(R.drawable.livepin);
                        this.P.addView(frameLayout2, c8.ma.e(62, 76, 49));
                        org.telegram.ui.Components.q9 q9Var = new org.telegram.ui.Components.q9(context);
                        q9Var.setRoundRadius(org.telegram.messenger.g0.L(26.0f));
                        q9Var.f(O0, new org.telegram.ui.Components.b9(O0));
                        frameLayout2.addView(q9Var, c8.ma.d(52, 52.0f, 51, 5.0f, 5.0f, 0.0f, 0.0f));
                        this.U = frameLayout2;
                        frameLayout2.setTag(1);
                    }
                    if (this.U == null) {
                        ImageView e11 = org.telegram.messenger.n10.e(context, R.drawable.map_pin2);
                        this.P.addView(e11, c8.ma.e(28, 48, 49));
                        this.U = e11;
                    }
                    org.telegram.ui.Components.ek0 ek0Var2 = new org.telegram.ui.Components.ek0(context, null);
                    this.S = ek0Var2;
                    int i19 = 8;
                    ek0Var2.setVisibility(8);
                    this.S.setLayoutManager(new v4.c0(1, false));
                    org.telegram.ui.Components.kl klVar2 = new org.telegram.ui.Components.kl(this, context, getResourceProvider(), i13 == 8);
                    this.T = klVar2;
                    klVar2.n = new da0(this, i19);
                    pa0Var.addView(this.S, c8.ma.e(-1, -1, 51));
                    this.S.setOnScrollListener(new ga0(this, 0));
                    this.S.setOnItemClickListener(new org.telegram.ui.Components.qj0(this) { // from class: org.telegram.ui.ca0
                        public final /* synthetic */ qa0 b;

                        {
                            this.b = this;
                        }

                        @Override // org.telegram.ui.Components.qj0
                        public final void c(int i192, View view) {
                            org.telegram.messenger.fj fjVar7;
                            TLRPC.TL_messageMediaVenue tL_messageMediaVenue;
                            int i20 = i11;
                            qa0 qa0Var = this.b;
                            switch (i20) {
                                case 0:
                                    qa0Var.q0 = -1L;
                                    int i21 = qa0Var.N0;
                                    int i22 = 7;
                                    if (i21 != 4) {
                                        if (i21 != 5) {
                                            if (i192 == 1 && (fjVar7 = qa0Var.J0) != null && (!fjVar7.C3() || i21 == 6)) {
                                                org.telegram.messenger.da daVar = qa0Var.F;
                                                if (daVar != null) {
                                                    IMapsProvider k10 = org.telegram.messenger.t0.k();
                                                    TLRPC.GeoPoint geoPoint = qa0Var.J0.k.media.geo;
                                                    daVar.b(((pb.b) k10).newCameraUpdateLatLngZoom(new org.telegram.messenger.ab(geoPoint.lat, geoPoint._long), qa0Var.F.e() - 4.0f));
                                                    break;
                                                }
                                            } else if (i192 == 1 && i21 != 2) {
                                                if (qa0Var.M0 != null && qa0Var.A0 != null) {
                                                    TLRPC.TL_messageMediaGeo tL_messageMediaGeo = new TLRPC.TL_messageMediaGeo();
                                                    TLRPC.TL_geoPoint tL_geoPoint = new TLRPC.TL_geoPoint();
                                                    tL_messageMediaGeo.geo = tL_geoPoint;
                                                    tL_geoPoint.lat = org.telegram.messenger.g0.b0(qa0Var.A0.getLatitude());
                                                    tL_messageMediaGeo.geo._long = org.telegram.messenger.g0.b0(qa0Var.A0.getLongitude());
                                                    qa0Var.M0.b(tL_messageMediaGeo, qa0Var.N0, true, 0, 0L);
                                                    qa0Var.finishFragment();
                                                    break;
                                                }
                                            } else if (i21 != 2 || !qa0Var.getLocationController().i(qa0Var.m0) || qa0Var.Q.d(i192) != 7) {
                                                if (i21 != 2 || !qa0Var.getLocationController().i(qa0Var.m0) || qa0Var.Q.d(i192) != 6) {
                                                    if ((i192 != 2 || i21 != 1) && ((i192 != 1 || i21 != 2) && (i192 != 3 || i21 != 3))) {
                                                        Object I = qa0Var.Q.I(i192);
                                                        if (!(I instanceof TLRPC.TL_messageMediaVenue)) {
                                                            if (I instanceof ma0) {
                                                                ma0 ma0Var = (ma0) I;
                                                                qa0Var.q0 = ma0Var.a;
                                                                if (qa0Var.r0) {
                                                                    qa0Var.r0 = false;
                                                                    qa0Var.R0();
                                                                }
                                                                qa0Var.F.b(((pb.b) org.telegram.messenger.t0.k()).newCameraUpdateLatLngZoom(ma0Var.e.a(), qa0Var.F.e() - 4.0f));
                                                                break;
                                                            }
                                                        } else {
                                                            qa0Var.M0.b((TLRPC.TL_messageMediaVenue) I, qa0Var.N0, true, 0, 0L);
                                                            qa0Var.finishFragment();
                                                            break;
                                                        }
                                                    } else if (!qa0Var.getLocationController().i(qa0Var.m0)) {
                                                        qa0Var.C0(false);
                                                        break;
                                                    } else {
                                                        qa0Var.getLocationController().k(qa0Var.m0);
                                                        qa0Var.Q.f();
                                                        qa0Var.finishFragment();
                                                        break;
                                                    }
                                                } else {
                                                    qa0Var.C0(qa0Var.getLocationController().h(qa0Var.m0).d != Integer.MAX_VALUE);
                                                    break;
                                                }
                                            } else {
                                                qa0Var.getLocationController().k(qa0Var.m0);
                                                qa0Var.Q.f();
                                                qa0Var.finishFragment();
                                                break;
                                            }
                                        } else {
                                            org.telegram.messenger.da daVar2 = qa0Var.F;
                                            if (daVar2 != null) {
                                                IMapsProvider k11 = org.telegram.messenger.t0.k();
                                                TLRPC.GeoPoint geoPoint2 = qa0Var.H0.geo_point;
                                                daVar2.b(((pb.b) k11).newCameraUpdateLatLngZoom(new org.telegram.messenger.ab(geoPoint2.lat, geoPoint2._long), qa0Var.F.e() - 4.0f));
                                                break;
                                            }
                                        }
                                    } else if (i192 == 1 && (tL_messageMediaVenue = (TLRPC.TL_messageMediaVenue) qa0Var.Q.I(i192)) != null) {
                                        if (qa0Var.m0 != 0) {
                                            org.telegram.ui.ActionBar.t1[] t1VarArr = {new org.telegram.ui.ActionBar.t1(3, qa0Var.getParentActivity(), null)};
                                            TLRPC.TL_channels_editLocation tL_channels_editLocation = new TLRPC.TL_channels_editLocation();
                                            tL_channels_editLocation.address = tL_messageMediaVenue.address;
                                            tL_channels_editLocation.channel = qa0Var.getMessagesController().j1(-qa0Var.m0);
                                            TLRPC.TL_inputGeoPoint tL_inputGeoPoint = new TLRPC.TL_inputGeoPoint();
                                            tL_channels_editLocation.geo_point = tL_inputGeoPoint;
                                            TLRPC.GeoPoint geoPoint3 = tL_messageMediaVenue.geo;
                                            tL_inputGeoPoint.lat = geoPoint3.lat;
                                            tL_inputGeoPoint._long = geoPoint3._long;
                                            t1VarArr[0].setOnCancelListener(new di.z(qa0Var, qa0Var.getConnectionsManager().sendRequest(tL_channels_editLocation, new z9(qa0Var, t1VarArr, tL_messageMediaVenue, 19)), i22));
                                            qa0Var.showDialog(t1VarArr[0]);
                                            break;
                                        } else {
                                            qa0Var.M0.b(tL_messageMediaVenue, 4, true, 0, 0L);
                                            qa0Var.finishFragment();
                                            break;
                                        }
                                    }
                                    break;
                                default:
                                    qa0.e0(qa0Var, i192);
                                    break;
                            }
                        }
                    });
                } else if ((fjVar2 != null && !fjVar2.C3()) || this.H0 != null) {
                    tL_channelLocation = this.H0;
                    if (tL_channelLocation != null) {
                        this.Q.P = tL_channelLocation;
                    } else {
                        org.telegram.messenger.fj fjVar7 = this.J0;
                        if (fjVar7 != null) {
                            ia0 ia0Var4 = this.Q;
                            ia0Var4.O = fjVar7;
                            ia0Var4.f();
                        }
                    }
                }
                fjVar3 = this.J0;
                if (fjVar3 != null && i13 == 6) {
                    ia0 ia0Var5 = this.Q;
                    ia0Var5.O = fjVar3;
                    ia0Var5.f();
                }
                for (i7 = 0; i7 < 2; i7++) {
                    UndoView undoView = new UndoView(context);
                    UndoView[] undoViewArr = this.x;
                    undoViewArr[i7] = undoView;
                    undoView.setAdditionalTranslationY(org.telegram.messenger.g0.L(10.0f));
                    undoViewArr[i7].setTranslationZ(org.telegram.messenger.g0.L(5.0f));
                    FrameLayout.LayoutParams d = c8.ma.d(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f);
                    d.bottomMargin = org.telegram.messenger.g0.L(29.0f) + this.h0 + d.bottomMargin;
                    this.P.addView(undoViewArr[i7], d);
                }
                if (this.J0 == null && this.H0 == null && this.I0 != null) {
                    this.K0 = true;
                    ImageView imageView6 = this.a;
                    int i20 = org.telegram.ui.ActionBar.m6.lj;
                    org.telegram.ui.ActionBar.t6.s(imageView6, i20, getResourceProvider(), PorterDuff.Mode.MULTIPLY);
                    this.a.setTag(Integer.valueOf(i20));
                }
                baseSimpleGlass = getBaseSimpleGlass();
                View view = new View(context);
                this.navigationBarFadeView = view;
                view.setBackground(baseSimpleGlass.b(view));
                pa0Var.addView(this.navigationBarFadeView, c8.ma.e(-1, 0, 80));
                View view2 = this.simpleActionBar;
                org.telegram.ui.ActionBar.h6 resourceProvider2 = getResourceProvider();
                baseSimpleGlass.m = pa0Var;
                baseSimpleGlass.n = null;
                baseSimpleGlass.g(pa0Var, view2, resourceProvider2);
                baseSimpleGlass.o = new oa(this, i11);
                this.simpleActionBar.setBackground(null);
                this.glassEngine.b(this.R);
                ek0Var = this.S;
                if (ek0Var != null) {
                    this.glassEngine.b(ek0Var);
                }
                if (baseSimpleGlass.g != null && org.telegram.messenger.bz.f()) {
                    this.e0 = new org.telegram.ui.Components.w80(new aa0(this, 2));
                }
                j0();
                O0();
                return this.fragmentView;
            }
        }
        this.c.setVisibility(8);
        this.c.setImageResource(R.drawable.msg_location_alert);
        hi.l3 l3Var3 = new hi.l3(context, 1);
        this.s = l3Var3;
        l3Var3.setLayerType(2, null);
        hi.l3 l3Var22 = this.s;
        l3Var22.d = 4000L;
        l3Var22.o(1.0f, -21.0f);
        this.s.setPadding(0, org.telegram.messenger.g0.L(4.0f), 0, 0);
        this.s.l(getBaseSimpleGlass().c);
        this.X.addView(this.s, c8.ma.d(-1, -2.0f, 51, 8.0f, 56.0f, 8.0f, 0.0f));
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.e = linearLayout2;
        linearLayout2.setOrientation(1);
        this.e.setGravity(1);
        this.e.setPadding(0, org.telegram.messenger.g0.L(160.0f), 0, 0);
        this.e.setVisibility(8);
        pa0Var.addView(this.e, c8.ma.c(-1.0f, -1));
        this.e.setOnTouchListener(new gi.a(i12));
        ImageView imageView52 = new ImageView(context);
        this.f = imageView52;
        imageView52.setImageResource(R.drawable.location_empty);
        org.telegram.ui.ActionBar.t6.s(this.f, org.telegram.ui.ActionBar.m6.W5, getResourceProvider(), mode);
        this.e.addView(this.f, c8.ma.o(-2, -2));
        TextView textView32 = new TextView(context);
        this.h = textView32;
        int i172 = org.telegram.ui.ActionBar.m6.X5;
        org.telegram.ui.ActionBar.t6.U(textView32, i172, getResourceProvider());
        this.h.setGravity(17);
        this.h.setTypeface(org.telegram.messenger.g0.o());
        this.h.setTextSize(1, 17.0f);
        this.h.setText(org.telegram.messenger.gd.N0(2131747986, null));
        TextView f102 = org.telegram.messenger.n10.f(this.e, this.h, c8.ma.t(-2, -2, 17, 0, 11, 0, 0), context);
        this.n = f102;
        org.telegram.ui.ActionBar.t6.U(f102, i172, getResourceProvider());
        this.n.setGravity(17);
        this.n.setTextSize(1, 15.0f);
        this.n.setPadding(org.telegram.messenger.g0.L(40.0f), 0, org.telegram.messenger.g0.L(40.0f), 0);
        this.e.addView(this.n, c8.ma.t(-2, -2, 17, 0, 6, 0, 0));
        this.R = new et(5, context, this);
        fh.g c112 = getBaseSimpleGlass().f.c(this.R, null, false);
        gh.e eVar2 = new gh.e(getResourceProvider());
        eVar2.e = new g0.e(17);
        eVar2.f(-1, 553648127);
        eVar2.e(0, 0);
        eVar2.d(372454195, 0);
        float N2 = org.telegram.messenger.g0.N(8.0f);
        float f112 = -org.telegram.messenger.g0.N(0.6666667f);
        eVar2.n = N2;
        eVar2.r = f112;
        eVar2.f = org.telegram.messenger.g0.N(0.55f);
        eVar2.h = 0.0f;
        c112.p(eVar2);
        c112.s(org.telegram.messenger.g0.L(29.0f), org.telegram.messenger.g0.L(29.0f), 0.0f, 0.0f);
        c112.q(org.telegram.messenger.g0.L(12.0f));
        this.Z = c112;
        et etVar3 = this.R;
        ia0 ia0Var22 = new ia0(this, context, this.N0, this.m0, getResourceProvider(), this.w, i13 != 8);
        this.Q = ia0Var22;
        etVar3.setAdapter(ia0Var22);
        et etVar22 = this.R;
        v4.c0 c0Var2 = new v4.c0(1, false);
        this.V = c0Var2;
        etVar22.setLayoutManager(c0Var2);
        if (this.T0 == null) {
        }
        this.Q.O(this.k0, z10);
        this.Q.getClass();
        this.R.setVerticalScrollBarEnabled(z10);
        pa0Var.addView(this.R, c8.ma.e(-1, -1, 51));
        fjVar = this.J0;
        if (fjVar != null) {
            ia0 ia0Var32 = this.Q;
            ia0Var32.I = this.J0.k.media.address;
            ia0Var32.Q();
        }
        this.R.setOnScrollListener(new ga0(this, i11));
        final int i182 = 0;
        ((v4.k) this.R.getItemAnimator()).C = false;
        this.R.setOnItemLongClickListener(new at(18, this, context));
        this.R.setOnItemClickListener(new org.telegram.ui.Components.qj0(this) { // from class: org.telegram.ui.ca0
            public final /* synthetic */ qa0 b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.Components.qj0
            public final void c(int i192, View view3) {
                org.telegram.messenger.fj fjVar72;
                TLRPC.TL_messageMediaVenue tL_messageMediaVenue;
                int i202 = i182;
                qa0 qa0Var = this.b;
                switch (i202) {
                    case 0:
                        qa0Var.q0 = -1L;
                        int i21 = qa0Var.N0;
                        int i22 = 7;
                        if (i21 != 4) {
                            if (i21 != 5) {
                                if (i192 == 1 && (fjVar72 = qa0Var.J0) != null && (!fjVar72.C3() || i21 == 6)) {
                                    org.telegram.messenger.da daVar = qa0Var.F;
                                    if (daVar != null) {
                                        IMapsProvider k10 = org.telegram.messenger.t0.k();
                                        TLRPC.GeoPoint geoPoint = qa0Var.J0.k.media.geo;
                                        daVar.b(((pb.b) k10).newCameraUpdateLatLngZoom(new org.telegram.messenger.ab(geoPoint.lat, geoPoint._long), qa0Var.F.e() - 4.0f));
                                        break;
                                    }
                                } else if (i192 == 1 && i21 != 2) {
                                    if (qa0Var.M0 != null && qa0Var.A0 != null) {
                                        TLRPC.TL_messageMediaGeo tL_messageMediaGeo = new TLRPC.TL_messageMediaGeo();
                                        TLRPC.TL_geoPoint tL_geoPoint = new TLRPC.TL_geoPoint();
                                        tL_messageMediaGeo.geo = tL_geoPoint;
                                        tL_geoPoint.lat = org.telegram.messenger.g0.b0(qa0Var.A0.getLatitude());
                                        tL_messageMediaGeo.geo._long = org.telegram.messenger.g0.b0(qa0Var.A0.getLongitude());
                                        qa0Var.M0.b(tL_messageMediaGeo, qa0Var.N0, true, 0, 0L);
                                        qa0Var.finishFragment();
                                        break;
                                    }
                                } else if (i21 != 2 || !qa0Var.getLocationController().i(qa0Var.m0) || qa0Var.Q.d(i192) != 7) {
                                    if (i21 != 2 || !qa0Var.getLocationController().i(qa0Var.m0) || qa0Var.Q.d(i192) != 6) {
                                        if ((i192 != 2 || i21 != 1) && ((i192 != 1 || i21 != 2) && (i192 != 3 || i21 != 3))) {
                                            Object I = qa0Var.Q.I(i192);
                                            if (!(I instanceof TLRPC.TL_messageMediaVenue)) {
                                                if (I instanceof ma0) {
                                                    ma0 ma0Var = (ma0) I;
                                                    qa0Var.q0 = ma0Var.a;
                                                    if (qa0Var.r0) {
                                                        qa0Var.r0 = false;
                                                        qa0Var.R0();
                                                    }
                                                    qa0Var.F.b(((pb.b) org.telegram.messenger.t0.k()).newCameraUpdateLatLngZoom(ma0Var.e.a(), qa0Var.F.e() - 4.0f));
                                                    break;
                                                }
                                            } else {
                                                qa0Var.M0.b((TLRPC.TL_messageMediaVenue) I, qa0Var.N0, true, 0, 0L);
                                                qa0Var.finishFragment();
                                                break;
                                            }
                                        } else if (!qa0Var.getLocationController().i(qa0Var.m0)) {
                                            qa0Var.C0(false);
                                            break;
                                        } else {
                                            qa0Var.getLocationController().k(qa0Var.m0);
                                            qa0Var.Q.f();
                                            qa0Var.finishFragment();
                                            break;
                                        }
                                    } else {
                                        qa0Var.C0(qa0Var.getLocationController().h(qa0Var.m0).d != Integer.MAX_VALUE);
                                        break;
                                    }
                                } else {
                                    qa0Var.getLocationController().k(qa0Var.m0);
                                    qa0Var.Q.f();
                                    qa0Var.finishFragment();
                                    break;
                                }
                            } else {
                                org.telegram.messenger.da daVar2 = qa0Var.F;
                                if (daVar2 != null) {
                                    IMapsProvider k11 = org.telegram.messenger.t0.k();
                                    TLRPC.GeoPoint geoPoint2 = qa0Var.H0.geo_point;
                                    daVar2.b(((pb.b) k11).newCameraUpdateLatLngZoom(new org.telegram.messenger.ab(geoPoint2.lat, geoPoint2._long), qa0Var.F.e() - 4.0f));
                                    break;
                                }
                            }
                        } else if (i192 == 1 && (tL_messageMediaVenue = (TLRPC.TL_messageMediaVenue) qa0Var.Q.I(i192)) != null) {
                            if (qa0Var.m0 != 0) {
                                org.telegram.ui.ActionBar.t1[] t1VarArr = {new org.telegram.ui.ActionBar.t1(3, qa0Var.getParentActivity(), null)};
                                TLRPC.TL_channels_editLocation tL_channels_editLocation = new TLRPC.TL_channels_editLocation();
                                tL_channels_editLocation.address = tL_messageMediaVenue.address;
                                tL_channels_editLocation.channel = qa0Var.getMessagesController().j1(-qa0Var.m0);
                                TLRPC.TL_inputGeoPoint tL_inputGeoPoint = new TLRPC.TL_inputGeoPoint();
                                tL_channels_editLocation.geo_point = tL_inputGeoPoint;
                                TLRPC.GeoPoint geoPoint3 = tL_messageMediaVenue.geo;
                                tL_inputGeoPoint.lat = geoPoint3.lat;
                                tL_inputGeoPoint._long = geoPoint3._long;
                                t1VarArr[0].setOnCancelListener(new di.z(qa0Var, qa0Var.getConnectionsManager().sendRequest(tL_channels_editLocation, new z9(qa0Var, t1VarArr, tL_messageMediaVenue, 19)), i22));
                                qa0Var.showDialog(t1VarArr[0]);
                                break;
                            } else {
                                qa0Var.M0.b(tL_messageMediaVenue, 4, true, 0, 0L);
                                qa0Var.finishFragment();
                                break;
                            }
                        }
                        break;
                    default:
                        qa0.e0(qa0Var, i192);
                        break;
                }
            }
        });
        this.Q.P(this.O0);
        pa0Var.addView(this.P, pa0Var.indexOfChild(this.R), c8.ma.e(-1, -1, 51));
        org.telegram.messenger.xa onCreateMapView2 = ((pb.b) org.telegram.messenger.t0.k()).onCreateMapView(context);
        this.H = onCreateMapView2;
        ((ai.l0) ((a8.r7) onCreateMapView2).b).setAlpha(0.0f);
        org.telegram.messenger.xa xaVar2 = this.H;
        a8.r7 r7Var2 = (a8.r7) xaVar2;
        r7Var2.c = new da0(this, 0);
        r7Var2.d = new da0(this, i11);
        r7Var2.e = new aa0(this, 7);
        new Thread(new ea0(this, xaVar2, i11)).start();
        fjVar2 = this.J0;
        if (fjVar2 != null) {
        }
        if (fjVar2 != null) {
            tL_channelLocation = this.H0;
            if (tL_channelLocation != null) {
            }
            fjVar3 = this.J0;
            if (fjVar3 != null) {
                ia0 ia0Var52 = this.Q;
                ia0Var52.O = fjVar3;
                ia0Var52.f();
            }
            while (i7 < 2) {
            }
            if (this.J0 == null) {
                this.K0 = true;
                ImageView imageView62 = this.a;
                int i202 = org.telegram.ui.ActionBar.m6.lj;
                org.telegram.ui.ActionBar.t6.s(imageView62, i202, getResourceProvider(), PorterDuff.Mode.MULTIPLY);
                this.a.setTag(Integer.valueOf(i202));
            }
            baseSimpleGlass = getBaseSimpleGlass();
            View view3 = new View(context);
            this.navigationBarFadeView = view3;
            view3.setBackground(baseSimpleGlass.b(view3));
            pa0Var.addView(this.navigationBarFadeView, c8.ma.e(-1, 0, 80));
            View view22 = this.simpleActionBar;
            org.telegram.ui.ActionBar.h6 resourceProvider22 = getResourceProvider();
            baseSimpleGlass.m = pa0Var;
            baseSimpleGlass.n = null;
            baseSimpleGlass.g(pa0Var, view22, resourceProvider22);
            baseSimpleGlass.o = new oa(this, i11);
            this.simpleActionBar.setBackground(null);
            this.glassEngine.b(this.R);
            ek0Var = this.S;
            if (ek0Var != null) {
            }
            if (baseSimpleGlass.g != null) {
                this.e0 = new org.telegram.ui.Components.w80(new aa0(this, 2));
            }
            j0();
            O0();
            return this.fragmentView;
        }
        tL_channelLocation = this.H0;
        if (tL_channelLocation != null) {
        }
        fjVar3 = this.J0;
        if (fjVar3 != null) {
        }
        while (i7 < 2) {
        }
        if (this.J0 == null) {
        }
        baseSimpleGlass = getBaseSimpleGlass();
        View view32 = new View(context);
        this.navigationBarFadeView = view32;
        view32.setBackground(baseSimpleGlass.b(view32));
        pa0Var.addView(this.navigationBarFadeView, c8.ma.e(-1, 0, 80));
        View view222 = this.simpleActionBar;
        org.telegram.ui.ActionBar.h6 resourceProvider222 = getResourceProvider();
        baseSimpleGlass.m = pa0Var;
        baseSimpleGlass.n = null;
        baseSimpleGlass.g(pa0Var, view222, resourceProvider222);
        baseSimpleGlass.o = new oa(this, i11);
        this.simpleActionBar.setBackground(null);
        this.glassEngine.b(this.R);
        ek0Var = this.S;
        if (ek0Var != null) {
        }
        if (baseSimpleGlass.g != null) {
        }
        j0();
        O0();
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.fs
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        ia0 ia0Var;
        ia0 ia0Var2;
        if (i7 == org.telegram.messenger.ks.t) {
            removeSelfFromStack(true);
            return;
        }
        if (i7 == org.telegram.messenger.ks.y4) {
            this.k0 = false;
            ia0 ia0Var3 = this.Q;
            if (ia0Var3 != null) {
                ia0Var3.O(false, false);
            }
            L0();
            return;
        }
        if (i7 == org.telegram.messenger.ks.z4) {
            this.k0 = true;
            ia0 ia0Var4 = this.Q;
            if (ia0Var4 != null) {
                ia0Var4.O(true, false);
                return;
            }
            return;
        }
        if (i7 == org.telegram.messenger.ks.G4) {
            ia0 ia0Var5 = this.Q;
            if (ia0Var5 != null) {
                ia0Var5.f();
            }
            R0();
            return;
        }
        if (i7 == 1) {
            if (((Boolean) objArr[2]).booleanValue() || ((Long) objArr[0]).longValue() != this.m0 || this.J0 == null) {
                return;
            }
            ArrayList arrayList = (ArrayList) objArr[1];
            boolean z10 = false;
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                org.telegram.messenger.fj fjVar = (org.telegram.messenger.fj) arrayList.get(i11);
                if (fjVar.C3()) {
                    i0(fjVar.k);
                    z10 = true;
                } else {
                    TLRPC.Message message = fjVar.k;
                    if ((message.action instanceof TLRPC.TL_messageActionGeoProximityReached) && org.telegram.messenger.n5.E(org.telegram.messenger.fj.B0(message))) {
                        this.c.setImageResource(R.drawable.msg_location_alert);
                        k8.a aVar = this.L;
                        if (aVar != null) {
                            aVar.b1();
                            this.L = null;
                        }
                    }
                }
            }
            if (!z10 || (ia0Var2 = this.Q) == null) {
                return;
            }
            ia0Var2.N(this.o0);
            return;
        }
        if (i7 == org.telegram.messenger.ks.m0) {
            long longValue = ((Long) objArr[0]).longValue();
            if (longValue != this.m0 || this.J0 == null) {
                return;
            }
            ArrayList arrayList2 = (ArrayList) objArr[1];
            boolean z11 = false;
            for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                org.telegram.messenger.fj fjVar2 = (org.telegram.messenger.fj) arrayList2.get(i12);
                if (fjVar2.C3()) {
                    TLRPC.Message message2 = fjVar2.k;
                    TLRPC.Peer peer = message2.from_id;
                    ma0 ma0Var = (ma0) this.p0.f(peer != null ? org.telegram.messenger.fj.B1(peer) : org.telegram.messenger.fj.B0(message2));
                    if (ma0Var != null) {
                        org.telegram.messenger.pd h = getLocationController().h(longValue);
                        if (h == null || h.b != fjVar2.e1()) {
                            TLRPC.Message message3 = fjVar2.k;
                            ma0Var.b = message3;
                            TLRPC.GeoPoint geoPoint = message3.media.geo;
                            org.telegram.messenger.ab abVar = new org.telegram.messenger.ab(geoPoint.lat, geoPoint._long);
                            ma0Var.e.b(abVar);
                            if (this.q0 == ma0Var.a) {
                                this.F.b(((pb.b) org.telegram.messenger.t0.k()).newCameraUpdateLatLng(ma0Var.e.a()));
                            }
                            org.telegram.messenger.ca caVar = ma0Var.f;
                            if (caVar != null) {
                                caVar.a();
                                ma0Var.f.b(abVar);
                                int i13 = fjVar2.k.media.heading;
                                if (i13 != 0) {
                                    ma0Var.f.c(i13);
                                    if (!ma0Var.g) {
                                        ma0Var.f.a.a(c8.r9.b(R.drawable.map_pin_cone2));
                                        ma0Var.g = true;
                                    }
                                } else if (ma0Var.g) {
                                    ma0Var.f.c(0.0f);
                                    ma0Var.f.a.a(c8.r9.b(R.drawable.map_pin_circle));
                                    ma0Var.g = false;
                                }
                            }
                        }
                        z11 = true;
                    }
                }
            }
            if (z11 && (ia0Var = this.Q) != null) {
                ia0Var.f();
                org.telegram.ui.Components.wg0 wg0Var = this.O;
                if (wg0Var != null) {
                    wg0Var.c(true);
                }
            }
            if (z11) {
                R0();
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final boolean finishFragment(boolean z10) {
        if (A0()) {
            return false;
        }
        return super.finishFragment(z10);
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        int i7 = 0;
        while (true) {
            UndoView[] undoViewArr = this.x;
            if (i7 >= undoViewArr.length) {
                break;
            }
            arrayList.add(new org.telegram.ui.ActionBar.v6(undoViewArr[i7], 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.wj));
            i7++;
        }
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.R, 32768, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.h5));
        org.telegram.ui.ActionBar.g5 g5Var = this.r;
        arrayList.add(new org.telegram.ui.ActionBar.v6(g5Var != null ? g5Var.getSearchField() : null, 16777216, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.j5));
        arrayList.add(new org.telegram.ui.ActionBar.v6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.jj));
        arrayList.add(new org.telegram.ui.ActionBar.v6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.kj));
        arrayList.add(new org.telegram.ui.ActionBar.v6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.pj));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.R, 393216, new Class[]{org.telegram.ui.Cells.r6.class}, new String[]{"imageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.ej));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.R, 393216, new Class[]{org.telegram.ui.Cells.r6.class}, new String[]{"imageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.hj));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.R, 393248, new Class[]{org.telegram.ui.Cells.r6.class}, new String[]{"imageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.dj));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.R, 393248, new Class[]{org.telegram.ui.Cells.r6.class}, new String[]{"imageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.gj));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.R, 196608, new Class[]{org.telegram.ui.Cells.x4.class}, new String[]{"frameLayout"}, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.Hi));
        return arrayList;
    }

    public final ma0 i0(TLRPC.Message message) {
        Location location;
        TLRPC.GeoPoint geoPoint = message.media.geo;
        double d = geoPoint.lat;
        double d2 = geoPoint._long;
        long B1 = org.telegram.messenger.fj.B1(message.from_id);
        a0.h hVar = this.p0;
        ma0 ma0Var = (ma0) hVar.f(B1);
        if (ma0Var == null) {
            ma0Var = new ma0();
            ma0Var.b = message;
            if (message.from_id instanceof TLRPC.TL_peerUser) {
                ma0Var.c = getMessagesController().c2(Long.valueOf(ma0Var.b.from_id.user_id));
                ma0Var.a = ma0Var.b.from_id.user_id;
            } else {
                long B0 = org.telegram.messenger.fj.B0(message);
                if (org.telegram.messenger.n5.E(B0)) {
                    ma0Var.c = getMessagesController().c2(Long.valueOf(B0));
                } else {
                    ma0Var.d = getMessagesController().O0(Long.valueOf(-B0));
                }
                ma0Var.a = B0;
            }
            H0(ma0Var);
            try {
                h9.g1 g1Var = (h9.g1) ((pb.b) org.telegram.messenger.t0.k()).onCreateMarkerOptions();
                m8.g gVar = (m8.g) g1Var.b;
                m8.g gVar2 = (m8.g) g1Var.b;
                gVar.a = new LatLng(d, d2);
                Bitmap n02 = n0(ma0Var);
                if (n02 != null) {
                    gVar2.d = c8.r9.a(n02);
                    gVar2.e = 0.5f;
                    gVar2.f = 0.8010882f;
                    ma0Var.e = this.F.a(g1Var);
                    if (!org.telegram.messenger.o10.C(ma0Var.c)) {
                        h9.g1 g1Var2 = (h9.g1) ((pb.b) org.telegram.messenger.t0.k()).onCreateMarkerOptions();
                        ((m8.g) g1Var2.b).a = new LatLng(d, d2);
                        m8.g gVar3 = (m8.g) g1Var2.b;
                        gVar3.r = true;
                        gVar3.e = 0.5f;
                        gVar3.f = 0.5f;
                        org.telegram.messenger.ca a10 = this.F.a(g1Var2);
                        ma0Var.f = a10;
                        int i7 = message.media.heading;
                        if (i7 != 0) {
                            a10.c(i7);
                            ma0Var.f.a.a(c8.r9.b(R.drawable.map_pin_cone2));
                            ma0Var.g = true;
                        } else {
                            a10.c(0.0f);
                            ma0Var.f.a.a(c8.r9.b(R.drawable.map_pin_circle));
                            ma0Var.g = false;
                        }
                    }
                    this.o0.add(ma0Var);
                    hVar.k(ma0Var, ma0Var.a);
                    org.telegram.messenger.pd h = getLocationController().h(this.m0);
                    if (ma0Var.a == getUserConfig().e() && h != null && ma0Var.b.id == h.b && (location = this.z0) != null) {
                        double latitude = location.getLatitude();
                        double longitude = this.z0.getLongitude();
                        m8.f fVar = ma0Var.e.a;
                        LatLng latLng = new LatLng(latitude, longitude);
                        fVar.getClass();
                        try {
                            v7.i iVar = (v7.i) fVar.a;
                            Parcel p12 = iVar.p1();
                            v7.b.b(p12, latLng);
                            iVar.t1(p12, 3);
                        } catch (RemoteException e10) {
                            throw new androidx.car.app.j(e10);
                        }
                    }
                }
            } catch (Exception e11) {
                org.telegram.messenger.a8.g(e11, true);
            }
        } else {
            ma0Var.b = message;
            m8.f fVar2 = ma0Var.e.a;
            LatLng latLng2 = new LatLng(d, d2);
            fVar2.getClass();
            try {
                v7.i iVar2 = (v7.i) fVar2.a;
                Parcel p13 = iVar2.p1();
                v7.b.b(p13, latLng2);
                iVar2.t1(p13, 3);
                if (this.q0 == ma0Var.a) {
                    this.F.b(((pb.b) org.telegram.messenger.t0.k()).newCameraUpdateLatLng(ma0Var.e.a()));
                }
            } catch (RemoteException e12) {
                throw new androidx.car.app.j(e12);
            }
        }
        org.telegram.ui.Components.wg0 wg0Var = this.O;
        if (wg0Var != null) {
            wg0Var.c(true);
        }
        R0();
        return ma0Var;
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final boolean isLightStatusBar() {
        return i0.a.h(getThemedColor(org.telegram.ui.ActionBar.m6.d6)) > 0.699999988079071d;
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return false;
    }

    public final void j0() {
        if (this.fragmentView == null || this.R == null) {
            return;
        }
        i0.b bVar = this.mSystemInsets;
        int i7 = bVar.b;
        int i10 = bVar.d;
        FrameLayout frameLayout = this.X;
        if (frameLayout != null) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) frameLayout.getLayoutParams();
            int d = ri.a.d(i7) - org.telegram.messenger.g0.L(6.0f);
            if (layoutParams.topMargin != d) {
                layoutParams.topMargin = d;
                this.X.requestLayout();
            }
        }
        this.R.setClipToPadding(false);
        this.R.setPadding(0, 0, 0, i10);
        org.telegram.ui.Components.ek0 ek0Var = this.S;
        if (ek0Var != null) {
            ek0Var.setClipToPadding(false);
            ri.a.e(this.S, i7, i10, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight(), 0);
        }
        if (this.fragmentView.getMeasuredHeight() > 0) {
            s0(false);
        }
    }

    public final void k0() {
        fh.g gVar = this.Z;
        if (gVar != null) {
            gVar.updateColors();
        }
        et etVar = this.R;
        if (etVar != null) {
            etVar.invalidate();
        }
        if (this.F != null) {
            int i7 = org.telegram.messenger.g0.B(getThemedColor(org.telegram.ui.ActionBar.m6.d6)) < 0.721f ? R.raw.mapstyle_night : 0;
            if (i7 != 0) {
                if (!this.i0) {
                    this.i0 = true;
                    this.F.i(((pb.b) org.telegram.messenger.t0.k()).loadRawResourceStyle(org.telegram.messenger.t0.b, i7));
                    k8.a aVar = this.L;
                    if (aVar != null) {
                        aVar.g1(-1);
                        this.L.c1(553648127);
                    }
                }
            } else if (this.i0) {
                this.i0 = false;
                this.F.i(null);
                k8.a aVar2 = this.L;
                if (aVar2 != null) {
                    aVar2.g1(-16777216);
                    this.L.c1(TLObject.FLAG_29);
                }
            }
            D0();
        }
    }

    public final boolean l0() {
        if (o0()) {
            return false;
        }
        if (getParentActivity().getPackageManager().hasSystemFeature("android.hardware.location.gps")) {
            try {
                if (!((LocationManager) org.telegram.messenger.t0.b.getSystemService("location")).isProviderEnabled("gps")) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                    int i7 = org.telegram.ui.ActionBar.m6.L5;
                    alertDialog$Builder.m(R.raw.permission_request_location, 72, getThemedColor(i7), null);
                    alertDialog$Builder.n(i7, getResourceProvider());
                    alertDialog$Builder.a.U = org.telegram.messenger.gd.N0(2131749354, null);
                    alertDialog$Builder.k(org.telegram.messenger.gd.N0(2131751794, null), new da0(this, 5));
                    alertDialog$Builder.h(org.telegram.messenger.gd.N0(2131752577, null), null);
                    showDialog(alertDialog$Builder.a);
                    return false;
                }
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
                return true;
            }
        }
        return true;
    }

    public final void m0(int i7) {
        v7.h fVar;
        if (this.F == null) {
            return;
        }
        List<org.telegram.messenger.fb> asList = Arrays.asList(new org.telegram.messenger.eb(), new org.telegram.messenger.db());
        org.telegram.messenger.ta onCreateCircleOptions = ((pb.b) org.telegram.messenger.t0.k()).onCreateCircleOptions();
        double latitude = this.z0.getLatitude();
        double longitude = this.z0.getLongitude();
        hi.w4 w4Var = (hi.w4) onCreateCircleOptions;
        m8.b bVar = (m8.b) w4Var.b;
        LatLng latLng = new LatLng(latitude, longitude);
        bVar.getClass();
        bVar.a = latLng;
        double d = i7;
        m8.b bVar2 = (m8.b) w4Var.b;
        bVar2.b = d;
        if (x0()) {
            bVar2.d = -1771658281;
            bVar2.e = 476488663;
        } else {
            bVar2.d = -1774024971;
            bVar2.e = 474121973;
        }
        ArrayList arrayList = new ArrayList();
        for (org.telegram.messenger.fb fbVar : asList) {
            if (fbVar instanceof org.telegram.messenger.eb) {
                arrayList.add(new m8.c(20, 1));
            } else if (fbVar instanceof org.telegram.messenger.db) {
                arrayList.add(new m8.c(20, 0));
            }
        }
        bVar2.r = arrayList;
        bVar2.c = 2;
        org.telegram.messenger.da daVar = this.F;
        k8.a aVar = daVar.a;
        aVar.getClass();
        try {
            l8.e eVar = (l8.e) aVar.b;
            Parcel p12 = eVar.p1();
            v7.b.b(p12, bVar2);
            Parcel o12 = eVar.o1(p12, 35);
            IBinder readStrongBinder = o12.readStrongBinder();
            int i10 = v7.g.b;
            if (readStrongBinder == null) {
                fVar = null;
            } else {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.ICircleDelegate");
                fVar = queryLocalInterface instanceof v7.h ? (v7.h) queryLocalInterface : new v7.f(readStrongBinder, "com.google.android.gms.maps.model.internal.ICircleDelegate", 11);
            }
            o12.recycle();
            m8.a aVar2 = new m8.a(fVar);
            k8.a aVar3 = new k8.a(10, daVar, aVar2);
            daVar.c.put(aVar2, aVar3);
            this.L = aVar3;
        } catch (RemoteException e10) {
            throw new androidx.car.app.j(e10);
        }
    }

    public final Bitmap n0(ma0 ma0Var) {
        Bitmap bitmap = null;
        try {
            Bitmap createBitmap = Bitmap.createBitmap(org.telegram.messenger.g0.L(62.0f), org.telegram.messenger.g0.L(85.0f), Bitmap.Config.ARGB_8888);
            try {
                createBitmap.eraseColor(0);
                Canvas canvas = new Canvas(createBitmap);
                Drawable drawable = org.telegram.messenger.t0.b.getResources().getDrawable(R.drawable.map_pin_photo);
                drawable.setBounds(0, 0, org.telegram.messenger.g0.L(62.0f), org.telegram.messenger.g0.L(85.0f));
                drawable.draw(canvas);
                Paint paint = new Paint(1);
                RectF rectF = new RectF();
                canvas.save();
                canvas.save();
                org.telegram.ui.Components.b9 b9Var = new org.telegram.ui.Components.b9((org.telegram.ui.ActionBar.h6) null);
                TLRPC.User user = ma0Var.c;
                if (user != null) {
                    b9Var.r(user);
                } else {
                    TLRPC.Chat chat = ma0Var.d;
                    if (chat != null) {
                        b9Var.q(chat);
                    }
                }
                canvas.translate(org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f));
                b9Var.setBounds(0, 0, org.telegram.messenger.g0.L(50.0f), org.telegram.messenger.g0.L(50.0f));
                b9Var.draw(canvas);
                canvas.restore();
                ImageReceiver imageReceiver = ma0Var.h;
                Bitmap n10 = (imageReceiver == null || !imageReceiver.J()) ? null : ma0Var.h.n();
                if (n10 != null && !n10.isRecycled()) {
                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                    BitmapShader bitmapShader = new BitmapShader(n10, tileMode, tileMode);
                    Matrix matrix = new Matrix();
                    float L = org.telegram.messenger.g0.L(50.0f) / n10.getWidth();
                    matrix.postScale(L, L);
                    matrix.postTranslate(org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f));
                    paint.setShader(bitmapShader);
                    bitmapShader.setLocalMatrix(matrix);
                    rectF.set(org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(56.0f), org.telegram.messenger.g0.L(56.0f));
                    canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(25.0f), org.telegram.messenger.g0.L(25.0f), paint);
                }
                canvas.restore();
                try {
                    canvas.setBitmap(null);
                    return createBitmap;
                } catch (Exception unused) {
                    return createBitmap;
                }
            } catch (Throwable th2) {
                th = th2;
                bitmap = createBitmap;
                org.telegram.messenger.a8.g(th, true);
                return bitmap;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public boolean o0() {
        return this instanceof jm;
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final boolean onBackPressed(boolean z10) {
        org.telegram.ui.Components.wg0 wg0Var = this.O;
        if (wg0Var == null) {
            org.telegram.messenger.xa xaVar = this.H;
            if (xaVar == null || ((GLSurfaceView) ((a8.r7) xaVar).f) == null || this.J) {
                return super.onBackPressed(z10);
            }
            if (z10) {
                A0();
            }
        } else if (z10) {
            wg0Var.a();
            return false;
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final void onBecomeFullyHidden() {
        UndoView undoView = this.x[0];
        if (undoView != null) {
            undoView.d(0, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        getNotificationCenter().c(this, org.telegram.messenger.ks.t);
        org.telegram.messenger.ks.e().c(this, org.telegram.messenger.ks.y4);
        org.telegram.messenger.ks.e().c(this, org.telegram.messenger.ks.z4);
        org.telegram.messenger.ks.e().c(this, org.telegram.messenger.ks.G4);
        org.telegram.messenger.fj fjVar = this.J0;
        if (fjVar != null && fjVar.C3()) {
            getNotificationCenter().c(this, 1);
            getNotificationCenter().c(this, org.telegram.messenger.ks.m0);
        }
        return true;
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        org.telegram.ui.Components.w80 w80Var = this.e0;
        if (w80Var != null) {
            w80Var.i = true;
            w80Var.g = false;
            w80Var.d();
            w80Var.d = null;
            w80Var.e = null;
            w80Var.f = null;
        }
        org.telegram.messenger.ks.e().n(this, org.telegram.messenger.ks.y4);
        org.telegram.messenger.ks.e().n(this, org.telegram.messenger.ks.z4);
        org.telegram.messenger.ks.e().n(this, org.telegram.messenger.ks.G4);
        getNotificationCenter().n(this, org.telegram.messenger.ks.t);
        getNotificationCenter().n(this, 1);
        getNotificationCenter().n(this, org.telegram.messenger.ks.m0);
        M0();
        if (this.G0 != null) {
            try {
                ((h6.m) org.telegram.messenger.t0.j()).removeLocationUpdates(this.G0);
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        }
        this.C0 = null;
        this.D0 = null;
        try {
            org.telegram.messenger.xa xaVar = this.H;
            if (xaVar != null) {
                ((a8.r7) xaVar).A();
            }
        } catch (Exception e11) {
            org.telegram.messenger.a8.g(e11, true);
        }
        UndoView undoView = this.x[0];
        if (undoView != null) {
            undoView.d(0, true);
        }
        ia0 ia0Var = this.Q;
        if (ia0Var != null) {
            ia0Var.F();
        }
        org.telegram.ui.Components.kl klVar = this.T;
        if (klVar != null) {
            klVar.F();
        }
        aa0 aa0Var = this.Q0;
        if (aa0Var != null) {
            org.telegram.messenger.g0.r(aa0Var);
            this.Q0 = null;
        }
        ArrayList arrayList = this.o0;
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            ma0 ma0Var = (ma0) arrayList.get(i7);
            ImageReceiver imageReceiver = ma0Var.h;
            if (imageReceiver != null) {
                imageReceiver.R();
                ma0Var.h = null;
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final void onInsets(int i7, int i10, int i11, int i12) {
        j0();
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final void onLowMemory() {
        h6.m mVar;
        super.onLowMemory();
        org.telegram.messenger.xa xaVar = this.H;
        if (xaVar == null || !this.x0 || (mVar = (h6.m) ((m.o3) ((ai.l0) ((a8.r7) xaVar).b).b).b) == null) {
            return;
        }
        try {
            l8.f fVar = (l8.f) mVar.c;
            fVar.t1(fVar.p1(), 6);
        } catch (RemoteException e10) {
            throw new androidx.car.app.j(e10);
        }
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final void onPause() {
        super.onPause();
        org.telegram.messenger.xa xaVar = this.H;
        if (xaVar != null && this.x0) {
            try {
                ((a8.r7) xaVar).B();
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        }
        UndoView undoView = this.x[0];
        if (undoView != null) {
            undoView.d(0, true);
        }
        this.y0 = false;
        M0();
        if (this.G0 != null) {
            try {
                ((h6.m) org.telegram.messenger.t0.j()).removeLocationUpdates(this.G0);
            } catch (Exception e11) {
                org.telegram.messenger.a8.g(e11, true);
            }
        }
        P0();
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final void onResume() {
        Activity parentActivity;
        super.onResume();
        org.telegram.messenger.g0.Z2(getParentActivity(), this.classGuid);
        org.telegram.messenger.g0.B2(getParentActivity(), this.classGuid);
        org.telegram.messenger.xa xaVar = this.H;
        if (xaVar != null && this.x0) {
            try {
                ((a8.r7) xaVar).F();
            } catch (Throwable th2) {
                org.telegram.messenger.a8.g(th2, true);
            }
        }
        this.y0 = true;
        K0();
        L0();
        D0();
        s0(true);
        if (o0()) {
            this.t0 = false;
        } else if (this.t0 && (parentActivity = getParentActivity()) != null) {
            this.t0 = false;
            if (parentActivity.checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") != 0) {
                parentActivity.requestPermissions(new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"}, 2);
            }
        }
        aa0 aa0Var = this.Q0;
        if (aa0Var != null) {
            org.telegram.messenger.g0.r(aa0Var);
            org.telegram.messenger.g0.h3(this.Q0, 5000L);
        }
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            k0();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        try {
            org.telegram.ui.ActionBar.g5 g5Var = this.r;
            if (g5Var == null || g5Var.getSearchField() == null) {
                return;
            }
            this.r.getSearchField().setCursorColor(getThemedColor(org.telegram.ui.ActionBar.m6.j5));
        } catch (Exception e11) {
            org.telegram.messenger.a8.g(e11, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (!z10 || z11) {
            return;
        }
        try {
            if (((ai.l0) ((a8.r7) this.H).b).getParent() instanceof ViewGroup) {
                ((ViewGroup) ((ai.l0) ((a8.r7) this.H).b).getParent()).removeView((ai.l0) ((a8.r7) this.H).b);
            }
        } catch (Exception unused) {
        }
        bi.t2 t2Var = this.P;
        if (t2Var != null) {
            t2Var.addView((ai.l0) ((a8.r7) this.H).b, 0, c8.ma.e(-1, u0(), 51));
            N0(false);
            y0();
            D0();
            return;
        }
        View view = this.fragmentView;
        if (view != null) {
            ((FrameLayout) view).addView((ai.l0) ((a8.r7) this.H).b, 0, c8.ma.e(-1, -1, 51));
        }
    }

    public final void p0(ArrayList arrayList) {
        org.telegram.messenger.va onCreateLatLngBoundsBuilder = this.n0 ? ((pb.b) org.telegram.messenger.t0.k()).onCreateLatLngBoundsBuilder() : null;
        int currentTime = getConnectionsManager().getCurrentTime();
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            TLRPC.Message message = (TLRPC.Message) arrayList.get(i7);
            int i10 = message.date;
            TLRPC.MessageMedia messageMedia = message.media;
            int i11 = messageMedia.period;
            if (i10 + i11 > currentTime || i11 == Integer.MAX_VALUE) {
                if (onCreateLatLngBoundsBuilder != null) {
                    TLRPC.GeoPoint geoPoint = messageMedia.geo;
                    ((hi.t5) onCreateLatLngBoundsBuilder).q(new org.telegram.messenger.ab(geoPoint.lat, geoPoint._long));
                }
                i0(message);
                if (this.c.getVisibility() != 8 && org.telegram.messenger.fj.B1(message.from_id) != getUserConfig().e()) {
                    this.c.setVisibility(0);
                    this.E = true;
                    this.c.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(180L).setListener(new ay(this, 4)).start();
                }
            }
        }
        if (onCreateLatLngBoundsBuilder != null) {
            if (this.n0) {
                this.R.w0(0, org.telegram.messenger.g0.L(99.0f), null);
            }
            this.n0 = false;
            this.Q.N(this.o0);
            if (this.J0.C3()) {
                try {
                    hi.t5 t5Var = (hi.t5) onCreateLatLngBoundsBuilder;
                    org.telegram.messenger.ab a10 = t5Var.j().a();
                    org.telegram.messenger.ab z02 = z0(a10, 100.0d, 100.0d);
                    t5Var.q(z0(a10, -100.0d, -100.0d));
                    t5Var.q(z02);
                    org.telegram.messenger.ba j3 = t5Var.j();
                    if (arrayList.size() > 1) {
                        try {
                            org.telegram.messenger.sa newCameraUpdateLatLngBounds = ((pb.b) org.telegram.messenger.t0.k()).newCameraUpdateLatLngBounds(j3, org.telegram.messenger.g0.L(113.0f));
                            this.G = newCameraUpdateLatLngBounds;
                            this.F.h(newCameraUpdateLatLngBounds);
                            this.G = null;
                        } catch (Exception e10) {
                            org.telegram.messenger.a8.g(e10, true);
                        }
                    }
                } catch (Exception unused) {
                }
            }
        }
    }

    public final boolean r0() {
        boolean z10;
        boolean z11;
        int i7;
        TLRPC.Message message;
        TLRPC.MessageMedia messageMedia;
        int i10;
        boolean z12 = false;
        if (this.F != null) {
            ArrayList arrayList = new ArrayList();
            int currentTime = getConnectionsManager() != null ? getConnectionsManager().getCurrentTime() : 0;
            ArrayList arrayList2 = this.o0;
            int size = arrayList2.size();
            for (int i11 = 0; i11 < size; i11++) {
                ma0 ma0Var = (ma0) arrayList2.get(i11);
                org.telegram.messenger.ca caVar = ma0Var.e;
                if (caVar != null && (message = ma0Var.b) != null && (messageMedia = message.media) != null && ((i10 = messageMedia.period) == Integer.MAX_VALUE || message.date + i10 > currentTime)) {
                    arrayList.add(caVar.a());
                }
            }
            boolean z13 = this.p0.f(getUserConfig().e()) != null;
            Location location = this.z0;
            if (location != null && !z13) {
                arrayList.add(new org.telegram.messenger.ab(location.getLatitude(), this.z0.getLongitude()));
            }
            if (arrayList.size() >= 2) {
                try {
                    org.telegram.messenger.va onCreateLatLngBoundsBuilder = ((pb.b) org.telegram.messenger.t0.k()).onCreateLatLngBoundsBuilder();
                    int size2 = arrayList.size();
                    double d = -1.7976931348623157E308d;
                    int i12 = 0;
                    double d2 = Double.MAX_VALUE;
                    double d10 = Double.MAX_VALUE;
                    double d11 = -1.7976931348623157E308d;
                    while (i12 < size2) {
                        org.telegram.messenger.ab abVar = (org.telegram.messenger.ab) arrayList.get(i12);
                        z10 = z12;
                        try {
                            ((hi.t5) onCreateLatLngBoundsBuilder).q(abVar);
                            i7 = size2;
                            z11 = true;
                        } catch (Exception e10) {
                            e = e10;
                            z11 = true;
                            org.telegram.messenger.a8.g(e, z11);
                            return z10;
                        }
                        try {
                            double d12 = abVar.a;
                            if (d12 < d2) {
                                d2 = d12;
                            }
                            if (d12 > d) {
                                d = d12;
                            }
                            double d13 = abVar.b;
                            if (d13 < d10) {
                                d10 = d13;
                            }
                            if (d13 > d11) {
                                d11 = d13;
                            }
                            i12++;
                            z12 = z10;
                            size2 = i7;
                        } catch (Exception e11) {
                            e = e11;
                            org.telegram.messenger.a8.g(e, z11);
                            return z10;
                        }
                    }
                    z10 = z12;
                    z11 = true;
                    double d14 = (d2 + d) / 2.0d;
                    double d15 = (d10 + d11) / 2.0d;
                    double radians = Math.toRadians(d - d2) * 6366198.0d;
                    double radians2 = Math.toRadians(d11 - d10) * 6366198.0d * Math.cos(Math.toRadians(d14));
                    if (radians < 30.0d || radians2 < 30.0d) {
                        hi.t5 t5Var = (hi.t5) onCreateLatLngBoundsBuilder;
                        t5Var.q(new org.telegram.messenger.ab(Math.toDegrees(2.356194387921959E-6d) + d14, d15 + Math.toDegrees(15.0d / (Math.cos(Math.toRadians(d14)) * 6366198.0d))));
                        t5Var.q(new org.telegram.messenger.ab(d14 + Math.toDegrees(-2.356194387921959E-6d), d15 + Math.toDegrees((-15.0d) / (Math.cos(Math.toRadians(d14)) * 6366198.0d))));
                    }
                    this.F.c(((pb.b) org.telegram.messenger.t0.k()).newCameraUpdateLatLngBounds(((hi.t5) onCreateLatLngBoundsBuilder).j(), org.telegram.messenger.g0.L(60.0f)));
                    return true;
                } catch (Exception e12) {
                    e = e12;
                    z10 = z12;
                }
            }
        }
        return false;
    }

    public final void s0(boolean z10) {
        if (this.R != null) {
            int i7 = this.mSystemInsets.d;
            int measuredHeight = this.fragmentView.getMeasuredHeight();
            if (measuredHeight == 0) {
                return;
            }
            int i10 = this.N0;
            if (i10 == 6) {
                this.O0 = org.telegram.messenger.f3.z(66.0f, measuredHeight, i7);
            } else if (i10 == 2) {
                this.O0 = org.telegram.messenger.f3.z(73.0f, measuredHeight, i7);
            } else {
                this.O0 = org.telegram.messenger.f3.z(66.0f, measuredHeight, i7);
            }
            ka0 ka0Var = this.R0;
            if (ka0Var != null && ka0Var.m0(8) > 0) {
                this.O0 -= org.telegram.messenger.g0.L(200.0f);
            }
            this.c0 = org.telegram.messenger.g0.L(100.0f) + (measuredHeight - this.O0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.P.getLayoutParams();
            layoutParams.height = org.telegram.messenger.g0.L(29.0f) + this.O0;
            this.P.setLayoutParams(layoutParams);
            this.Q.P(this.O0);
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) ((ai.l0) ((a8.r7) this.H).b).getLayoutParams();
            if (layoutParams2 != null) {
                layoutParams2.height = u0();
                org.telegram.messenger.da daVar = this.F;
                if (daVar != null) {
                    daVar.n(org.telegram.messenger.g0.L(70.0f), 0, org.telegram.messenger.g0.L(70.0f), t0());
                }
                ((ai.l0) ((a8.r7) this.H).b).setLayoutParams(layoutParams2);
            }
            this.Q.f();
            if (!z10) {
                N0(false);
                return;
            }
            int i11 = i10 == 3 ? 73 : (i10 == 1 || i10 == 2) ? 66 : 0;
            this.V.h1(0, -org.telegram.messenger.g0.L(i11));
            N0(false);
            this.R.post(new ii(this, i11, 23));
        }
    }

    public final int t0() {
        return org.telegram.messenger.g0.L(10.0f) + this.h0 + this.c0;
    }

    public final int u0() {
        return org.telegram.messenger.g0.L(10.0f) + this.O0 + this.c0;
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final boolean useSimpleActionBar() {
        return true;
    }

    public final boolean v0() {
        ArrayList arrayList = (ArrayList) getLocationController().c.f(org.telegram.messenger.fj.B0(this.J0.k));
        if (arrayList == null || !arrayList.isEmpty()) {
            arrayList = null;
        } else {
            p0(arrayList);
        }
        if (org.telegram.messenger.n5.z(this.m0)) {
            TLRPC.Chat O0 = getMessagesController().O0(Long.valueOf(-this.m0));
            if (org.telegram.messenger.v3.T(O0) && !O0.megagroup) {
                return false;
            }
        }
        TLRPC.TL_messages_getRecentLocations tL_messages_getRecentLocations = new TLRPC.TL_messages_getRecentLocations();
        long B0 = org.telegram.messenger.fj.B0(this.J0.k);
        tL_messages_getRecentLocations.peer = getMessagesController().l1(B0);
        tL_messages_getRecentLocations.limit = 100;
        getConnectionsManager().sendRequest(tL_messages_getRecentLocations, new fi.s5(this, B0, 1));
        return arrayList != null;
    }

    public final UndoView w0() {
        UndoView[] undoViewArr = this.x;
        if (undoViewArr[0].getVisibility() == 0) {
            UndoView undoView = undoViewArr[0];
            undoViewArr[0] = undoViewArr[1];
            undoViewArr[1] = undoView;
            undoView.d(2, true);
            this.P.removeView(undoViewArr[0]);
            this.P.addView(undoViewArr[0]);
        }
        return undoViewArr[0];
    }

    public final boolean x0() {
        return (getResourceProvider() == null && org.telegram.ui.ActionBar.m6.I.q()) || org.telegram.messenger.g0.B(getThemedColor(org.telegram.ui.ActionBar.m6.d6)) < 0.721f;
    }

    public final void y0() {
        SharedPreferences g12;
        int i7;
        ImageView imageView = this.c;
        if (imageView == null || imageView.getVisibility() != 0 || this.E || (i7 = (g12 = org.telegram.messenger.mp.g1()).getInt("proximityhint", 0)) >= 3) {
            return;
        }
        g12.edit().putInt("proximityhint", i7 + 1).commit();
        if (org.telegram.messenger.n5.E(this.m0)) {
            this.s.v(org.telegram.messenger.gd.a0("ProximityTooltioUser", null, 2131746416, org.telegram.messenger.o10.k(getMessagesController().c2(Long.valueOf(this.m0)), true)));
        } else {
            this.s.v(org.telegram.messenger.gd.N0(2131746417, null));
        }
        this.s.x();
    }
}
