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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public class la0 extends org.telegram.ui.ActionBar.d2 implements org.telegram.messenger.cs {
    public Location A0;
    public int B0;
    public TLRPC.TL_channelLocation C0;
    public TLRPC.TL_channelLocation D0;
    public boolean E;
    public org.telegram.messenger.zi E0;
    public org.telegram.messenger.z9 F;
    public boolean F0;
    public org.telegram.messenger.na G;
    public boolean G0;
    public org.telegram.messenger.sa H;
    public ia0 H0;
    public org.telegram.messenger.na I;
    public final int I0;
    public boolean J;
    public int J0;
    public float K;
    public ga0 K0;
    public m2.t L;
    public u90 L0;
    public double M;
    public fa0 M0;
    public boolean N;
    public org.telegram.ui.Cells.x3 N0;
    public org.telegram.ui.Components.kg0 O;
    public TL_stories.MediaArea O0;
    public ai.d2 P;
    public boolean P0;
    public da0 Q;
    public boolean Q0;
    public xs R;
    public Boolean R0;
    public org.telegram.ui.Components.tj0 S;
    public org.telegram.ui.Components.sk T;
    public View U;
    public u4.b0 V;
    public org.telegram.ui.ActionBar.f5 W;
    public FrameLayout X;
    public FrameLayout Y;
    public gh.g Z;
    public ImageView a;
    public final RectF a0;
    public TextView b;
    public int b0;
    public ImageView c;
    public int c0;
    public org.telegram.ui.ActionBar.f5 d;
    public TextureView d0;
    public LinearLayout e;
    public org.telegram.ui.Components.c80 e0;
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
    public org.telegram.ui.ActionBar.f5 r;
    public boolean r0;
    public gi.l3 s;
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

    public la0(int i3) {
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
        this.J0 = (org.telegram.messenger.g0.q.x - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - org.telegram.messenger.g0.L(66.0f);
        this.Q0 = true;
        this.I0 = i3;
        org.telegram.messenger.g0.a0();
    }

    public static void Z(la0 la0Var, Canvas canvas, RectF rectF) {
        Paint paint = la0Var.g0;
        int i3 = org.telegram.ui.ActionBar.k6.h5;
        paint.setColor(la0Var.getThemedColor(i3));
        canvas.drawRect(rectF, paint);
        ViewGroup viewGroup = (ViewGroup) la0Var.fragmentView;
        org.telegram.ui.Components.tj0 tj0Var = la0Var.S;
        if (tj0Var != null && tj0Var.getVisibility() == 0) {
            org.telegram.ui.Components.tj0 tj0Var2 = la0Var.S;
            jh.d.a(tj0Var2, canvas, rectF, tj0Var2, viewGroup);
            return;
        }
        if (la0Var.P.getVisibility() == 0) {
            RectF rectF2 = la0Var.f0;
            canvas.save();
            canvas.translate(la0Var.P.getX(), la0Var.P.getY());
            canvas.clipRect(0.0f, 0.0f, la0Var.P.getWidth(), viewGroup.getHeight() - la0Var.P.getY());
            Drawable background = la0Var.P.getBackground();
            if (background != null) {
                background.draw(canvas);
            }
            org.telegram.messenger.sa saVar = la0Var.H;
            ai.c0 c0Var = saVar != null ? (ai.c0) ((b8.ke) saVar).b : null;
            if (c0Var != null && c0Var.getParent() == la0Var.P && c0Var.getVisibility() == 0 && c0Var.getAlpha() > 0.0f) {
                TextureView textureView = la0Var.d0;
                if (textureView != null && textureView.isAttachedToWindow() && kh.k.c(la0Var.d0, la0Var.P, rectF2)) {
                    if (c0Var.getAlpha() < 1.0f) {
                        canvas.saveLayerAlpha(rectF2, (int) (c0Var.getAlpha() * 255.0f));
                    } else {
                        canvas.save();
                    }
                    canvas.translate(rectF2.left, rectF2.top);
                    la0Var.d0.draw(canvas);
                    canvas.restore();
                } else if (la0Var.e0 != null) {
                    rectF2.set(c0Var.getX(), c0Var.getY(), c0Var.getX() + c0Var.getWidth(), c0Var.getY() + c0Var.getHeight());
                    org.telegram.ui.Components.c80 c80Var = la0Var.e0;
                    float alpha = c0Var.getAlpha();
                    Paint paint2 = c80Var.c;
                    Bitmap bitmap = c80Var.e;
                    if (bitmap != null && !bitmap.isRecycled() && alpha > 0.0f) {
                        paint2.setAlpha((int) (Math.min(1.0f, alpha) * 255.0f));
                        canvas.drawBitmap(bitmap, (Rect) null, rectF2, paint2);
                    }
                }
            }
            View view = la0Var.U;
            if (view != null && view.getParent() != null && view.getVisibility() == 0 && view.getAlpha() > 0.0f) {
                canvas.save();
                canvas.translate(view.getX(), view.getY());
                view.draw(canvas);
                canvas.restore();
            }
            canvas.restore();
        }
        if (la0Var.R.getVisibility() != 0) {
            return;
        }
        int L = org.telegram.messenger.g0.L(22.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + la0Var.mSystemInsets.b;
        float f10 = L;
        if (rectF.top >= f10) {
            return;
        }
        canvas.save();
        canvas.clipRect(0.0f, Math.min(rectF.top, f10), viewGroup.getWidth(), f10);
        if (la0Var.b0 < L) {
            paint.setColor(la0Var.getThemedColor(i3));
            paint.setAlpha(org.telegram.messenger.hs.j3);
            canvas.drawRect(0.0f, Math.max(la0Var.b0, rectF.top), viewGroup.getWidth(), f10, paint);
        }
        xs xsVar = la0Var.R;
        jh.d.a(xsVar, canvas, rectF, xsVar, viewGroup);
        canvas.restore();
    }

    public static /* synthetic */ void a0(la0 la0Var) {
        la0Var.glassEngine.g();
        View view = la0Var.fragmentView;
        if (view != null) {
            view.invalidate();
        }
    }

    public static void b0(la0 la0Var, boolean z10, TLRPC.User user, int i3) {
        TLRPC.Message message;
        TLRPC.MessageMedia messageMedia;
        if (!z10) {
            la0Var.I0(i3, 0, user);
            return;
        }
        org.telegram.messenger.kd h = la0Var.getLocationController().h(la0Var.m0);
        if (h != null) {
            TLRPC.TL_messages_editMessage tL_messages_editMessage = new TLRPC.TL_messages_editMessage();
            tL_messages_editMessage.peer = la0Var.getMessagesController().j1(h.a);
            tL_messages_editMessage.id = h.b;
            tL_messages_editMessage.flags |= TLObject.FLAG_14;
            TLRPC.TL_inputMediaGeoLive tL_inputMediaGeoLive = new TLRPC.TL_inputMediaGeoLive();
            tL_messages_editMessage.media = tL_inputMediaGeoLive;
            tL_inputMediaGeoLive.stopped = false;
            tL_inputMediaGeoLive.geo_point = new TLRPC.TL_inputGeoPoint();
            Location location = org.telegram.messenger.ld.f(la0Var.currentAccount).s;
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
            inputMedia.heading = org.telegram.messenger.ld.e(location);
            TLRPC.InputMedia inputMedia2 = tL_messages_editMessage.media;
            int i12 = inputMedia2.flags;
            inputMedia2.flags = i12 | 4;
            int i13 = ConnectionsManager.DEFAULT_DATACENTER_ID;
            int i14 = i3 == Integer.MAX_VALUE ? Integer.MAX_VALUE : h.d + i3;
            h.d = i14;
            inputMedia2.period = i14;
            if (i3 != Integer.MAX_VALUE) {
                i13 = h.c + i3;
            }
            h.c = i13;
            inputMedia2.flags = i12 | 6;
            org.telegram.messenger.zi ziVar = h.h;
            if (ziVar != null && (message = ziVar.k) != null && (messageMedia = message.media) != null) {
                messageMedia.period = i14;
                la0Var.getMessagesStorage().r1(h.h.k, null, null, true);
            }
            la0Var.getConnectionsManager().sendRequest(tL_messages_editMessage, null);
            org.telegram.messenger.hs.e().k(org.telegram.messenger.hs.D4, new Object[0]);
        }
    }

    public static /* synthetic */ void c0(la0 la0Var) {
        u90 u90Var;
        la0Var.getLocationController().j(la0Var.m0);
        if (la0Var.isPaused || (u90Var = la0Var.L0) == null) {
            return;
        }
        org.telegram.messenger.g0.i3(u90Var, 5000L);
    }

    public static /* synthetic */ void e0(la0 la0Var, int i3) {
        float e10;
        float f10;
        TLRPC.TL_messageMediaVenue H = la0Var.T.H(i3);
        if (H == null || H.icon == null || la0Var.F == null) {
            return;
        }
        la0Var.F0 = true;
        la0Var.simpleActionBar.j(true);
        if ("pin".equals(H.icon)) {
            e10 = la0Var.F.e();
            f10 = 4.0f;
        } else {
            e10 = la0Var.F.e();
            f10 = 9.0f;
        }
        float f11 = e10 - f10;
        org.telegram.messenger.z9 z9Var = la0Var.F;
        IMapsProvider k10 = org.telegram.messenger.t0.k();
        TLRPC.GeoPoint geoPoint = H.geo;
        z9Var.b(((mb.b) k10).newCameraUpdateLatLngZoom(new org.telegram.messenger.va(geoPoint.lat, geoPoint._long), f11));
        Location location = la0Var.A0;
        if (location != null) {
            location.setLatitude(H.geo.lat);
            la0Var.A0.setLongitude(H.geo._long);
        }
        la0Var.Q.L(la0Var.A0);
    }

    public static View q0(View view, Class cls) {
        if (cls.isInstance(view)) {
            return (View) cls.cast(view);
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        for (int i3 = 0; i3 < viewGroup.getChildCount(); i3++) {
            View q02 = q0(viewGroup.getChildAt(i3), cls);
            if (q02 != null) {
                return q02;
            }
        }
        return null;
    }

    public static org.telegram.messenger.va z0(org.telegram.messenger.va vaVar, double d, double d10) {
        double d11 = vaVar.a;
        return new org.telegram.messenger.va(d11 + Math.toDegrees(d / 6366198.0d), vaVar.b + Math.toDegrees(d10 / (Math.cos(Math.toRadians(d11)) * 6366198.0d)));
    }

    public final boolean A0() {
        GLSurfaceView gLSurfaceView;
        org.telegram.messenger.sa saVar = this.H;
        if (saVar == null || (gLSurfaceView = (GLSurfaceView) ((b8.ke) saVar).f) == null || this.J) {
            return false;
        }
        gLSurfaceView.queueEvent(new ly(26, this, gLSurfaceView));
        return true;
    }

    public final void B0(ha0 ha0Var) {
        double d;
        double d10;
        TLRPC.Message message;
        if (ha0Var == null || (message = ha0Var.b) == null) {
            org.telegram.messenger.zi ziVar = this.E0;
            if (ziVar != null) {
                TLRPC.GeoPoint geoPoint = ziVar.k.media.geo;
                d = geoPoint.lat;
                d10 = geoPoint._long;
            } else {
                TLRPC.GeoPoint geoPoint2 = this.C0.geo_point;
                d = geoPoint2.lat;
                d10 = geoPoint2._long;
            }
        } else {
            TLRPC.GeoPoint geoPoint3 = message.media.geo;
            d = geoPoint3.lat;
            d10 = geoPoint3._long;
        }
        boolean z10 = org.telegram.messenger.r2.a;
        org.telegram.messenger.t0.r();
        if (this.z0 != null) {
            try {
                getParentActivity().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(String.format(Locale.US, "http://maps.google.com/maps".concat("?saddr=%f,%f&daddr=%f,%f"), Double.valueOf(this.z0.getLatitude()), Double.valueOf(this.z0.getLongitude()), Double.valueOf(d), Double.valueOf(d10)))));
                return;
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
                return;
            }
        }
        try {
            getParentActivity().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(String.format(Locale.US, "http://maps.google.com/maps".concat("?saddr=&daddr=%f,%f"), Double.valueOf(d), Double.valueOf(d10)))));
        } catch (Exception e11) {
            org.telegram.messenger.a8.g(e11, true);
        }
    }

    public final void C0(final boolean z10) {
        if (this.H0 == null || o0() || getParentActivity() == null || this.z0 == null || !l0()) {
            return;
        }
        final TLRPC.User a22 = org.telegram.messenger.m5.E(this.m0) ? getMessagesController().a2(Long.valueOf(this.m0)) : null;
        showDialog(org.telegram.ui.Components.t4.D(getParentActivity(), z10, a22, new org.telegram.messenger.kr() { // from class: org.telegram.ui.z90
            @Override // org.telegram.messenger.kr
            public final void a(int i3) {
                la0.b0(la0.this, z10, a22, i3);
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
            ai.c0 c0Var = (ai.c0) ((b8.ke) this.H).b;
            TextureView textureView2 = (TextureView) q0(c0Var, TextureView.class);
            this.d0 = textureView2;
            org.telegram.ui.Components.c80 c80Var = this.e0;
            SurfaceView surfaceView2 = textureView2 == null ? (SurfaceView) q0(c0Var, SurfaceView.class) : null;
            if (c80Var.d != surfaceView2) {
                c80Var.d = surfaceView2;
                c80Var.a();
            }
            TextureView textureView3 = this.d0;
            if (textureView3 != null) {
                TextureView.SurfaceTextureListener surfaceTextureListener = textureView3.getSurfaceTextureListener();
                if (!(surfaceTextureListener instanceof ja0)) {
                    this.d0.setSurfaceTextureListener(new ja0(this, surfaceTextureListener));
                }
            }
            M0();
        }
        TextureView textureView4 = this.d0;
        if (textureView4 == null) {
            this.e0.a();
            return;
        }
        TextureView.SurfaceTextureListener surfaceTextureListener2 = textureView4.getSurfaceTextureListener();
        if (surfaceTextureListener2 instanceof ja0) {
            return;
        }
        this.d0.setSurfaceTextureListener(new ja0(this, surfaceTextureListener2));
    }

    public final void E0(Location location) {
        if (location == null) {
            return;
        }
        this.z0 = new Location(location);
        ha0 ha0Var = (ha0) this.p0.f(getUserConfig().e());
        org.telegram.messenger.kd h = getLocationController().h(this.m0);
        if (ha0Var != null && h != null && ha0Var.b.id == h.b) {
            org.telegram.messenger.va vaVar = new org.telegram.messenger.va(location.getLatitude(), location.getLongitude());
            ha0Var.e.b(vaVar);
            org.telegram.messenger.y9 y9Var = ha0Var.f;
            if (y9Var != null) {
                y9Var.b(vaVar);
            }
            if (this.q0 == ha0Var.a) {
                this.F.b(((mb.b) org.telegram.messenger.t0.k()).newCameraUpdateLatLng(ha0Var.e.a()));
            }
        }
        if (this.E0 == null && this.C0 == null && this.F != null) {
            org.telegram.messenger.va vaVar2 = new org.telegram.messenger.va(location.getLatitude(), location.getLongitude());
            da0 da0Var = this.Q;
            if (da0Var != null) {
                da0Var.M(this.z0);
            }
            if (!this.F0) {
                this.A0 = new Location(location);
                if (this.G0) {
                    this.F.b(((mb.b) org.telegram.messenger.t0.k()).newCameraUpdateLatLng(vaVar2));
                } else {
                    this.G0 = true;
                    this.F.h(((mb.b) org.telegram.messenger.t0.k()).newCameraUpdateLatLngZoom(vaVar2, this.F.e() - 4.0f));
                }
            }
        } else {
            this.Q.M(this.z0);
        }
        org.telegram.ui.Components.kg0 kg0Var = this.O;
        if (kg0Var != null) {
            kg0Var.c(true);
        }
        m2.t tVar = this.L;
        if (tVar != null) {
            double latitude = this.z0.getLatitude();
            double longitude = this.z0.getLongitude();
            l8.a aVar = (l8.a) tVar.b;
            LatLng latLng = new LatLng(latitude, longitude);
            try {
                u7.f fVar = (u7.f) aVar.a;
                Parcel P0 = fVar.P0();
                u7.b.b(P0, latLng);
                fVar.T0(P0, 3);
            } catch (RemoteException e10) {
                throw new androidx.car.app.j(e10);
            }
        }
        N0();
    }

    public final void F0(View view) {
        gh.g c2 = getBaseSimpleGlass().c.c(view, null, false);
        c2.p(b8.cd.m(getResourceProvider()));
        c2.r(org.telegram.messenger.g0.L(23.0f));
        c2.q(org.telegram.messenger.g0.L(6.0f));
        view.setBackground(c2);
        b8.pf.a(view);
    }

    public final void G0(org.telegram.messenger.zi ziVar) {
        this.E0 = ziVar;
        this.m0 = org.telegram.messenger.zi.B0(ziVar.k);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void H0(ha0 ha0Var) {
        if (ha0Var.h != null) {
            return;
        }
        TLRPC.User user = ha0Var.c;
        TLRPC.Chat chat = ha0Var.d;
        if (user == null && chat == 0) {
            return;
        }
        org.telegram.ui.Components.u8 u8Var = new org.telegram.ui.Components.u8((org.telegram.ui.ActionBar.e6) null);
        if (user != null) {
            u8Var.r(user);
        } else {
            u8Var.q(chat);
        }
        ImageReceiver imageReceiver = new ImageReceiver(null);
        imageReceiver.d = this.currentAccount;
        imageReceiver.h1 = new org.telegram.ui.Components.i41(26, this, ha0Var);
        imageReceiver.P();
        if (user == null) {
            user = chat;
        }
        imageReceiver.i0(user, u8Var, null);
        ha0Var.h = imageReceiver;
    }

    public final void I0(int i3, int i10, TLRPC.User user) {
        TLRPC.TL_messageMediaGeoLive tL_messageMediaGeoLive = new TLRPC.TL_messageMediaGeoLive();
        TLRPC.TL_geoPoint tL_geoPoint = new TLRPC.TL_geoPoint();
        tL_messageMediaGeoLive.geo = tL_geoPoint;
        tL_geoPoint.lat = org.telegram.messenger.g0.b0(this.z0.getLatitude());
        tL_messageMediaGeoLive.geo._long = org.telegram.messenger.g0.b0(this.z0.getLongitude());
        tL_messageMediaGeoLive.heading = org.telegram.messenger.ld.e(this.z0);
        int i11 = tL_messageMediaGeoLive.flags;
        tL_messageMediaGeoLive.period = i3;
        tL_messageMediaGeoLive.proximity_notification_radius = i10;
        tL_messageMediaGeoLive.flags = i11 | 9;
        this.H0.d(tL_messageMediaGeoLive, this.I0, true, 0, 0L);
        if (i10 <= 0) {
            finishFragment();
            return;
        }
        this.O.M = true;
        this.c.setImageResource(R.drawable.msg_location_alert2);
        org.telegram.ui.Components.kg0 kg0Var = this.O;
        if (kg0Var != null) {
            kg0Var.a();
        }
        w0().k(0L, 24, Integer.valueOf(i10), user, null, null);
    }

    public final void J0(boolean z10, boolean z11) {
        Boolean bool = this.R0;
        if (bool == null || bool.booleanValue() != z10) {
            this.R0 = Boolean.valueOf(z10);
            if (z11) {
                this.b.setVisibility(0);
                this.b.animate().alpha(z10 ? 1.0f : 0.0f).scaleX(z10 ? 1.0f : 0.7f).scaleY(z10 ? 1.0f : 0.7f).setInterpolator(org.telegram.ui.Components.xq.h).setDuration(420L).withEndAction(new org.telegram.ui.Components.up0(8, this, z10)).start();
            } else {
                this.b.setVisibility(z10 ? 0 : 8);
                this.b.setAlpha(z10 ? 1.0f : 0.0f);
                this.b.setScaleX(z10 ? 1.0f : 0.7f);
                this.b.setScaleY(z10 ? 1.0f : 0.7f);
            }
        }
    }

    public final void K0(boolean z10) {
        int i3;
        int i10;
        FrameLayout.LayoutParams layoutParams;
        u4.d1 K = this.R.K(0);
        if (K != null) {
            i3 = (int) K.a.getY();
            i10 = Math.min(i3, 0) + this.J0;
            this.b0 = (this.J0 + i3) - this.h0;
        } else {
            i3 = -this.P.getMeasuredHeight();
            this.b0 = -org.telegram.messenger.g0.L(41.0f);
            i10 = 0;
        }
        this.R.invalidate();
        if (((FrameLayout.LayoutParams) this.P.getLayoutParams()) != null) {
            if (i10 <= 0) {
                if (((ai.c0) ((b8.ke) this.H).b).getVisibility() == 0) {
                    ((ai.c0) ((b8.ke) this.H).b).setVisibility(4);
                    this.P.setVisibility(4);
                }
            } else if (((ai.c0) ((b8.ke) this.H).b).getVisibility() == 4) {
                ((ai.c0) ((b8.ke) this.H).b).setVisibility(0);
                this.P.setVisibility(0);
            }
            this.P.setTranslationY(Math.min(0, i3));
            int i11 = -i3;
            ((ai.c0) ((b8.ke) this.H).b).setTranslationY(Math.max(0, i11 / 2));
            FrameLayout frameLayout = this.X;
            if (frameLayout != null) {
                frameLayout.setTranslationY(-Math.min(0, i3));
                float l10 = Utilities.l((org.telegram.messenger.k5.z(53.0f, i10 - this.h0, org.telegram.messenger.g0.L(46.0f) + pi.a.d(this.mSystemInsets.b)) - org.telegram.messenger.g0.L(7.0f)) / org.telegram.messenger.g0.L(48.0f));
                FrameLayout frameLayout2 = this.X;
                frameLayout2.setAlpha(l10);
                frameLayout2.setVisibility(l10 > 0.0f ? 0 : 4);
                FrameLayout frameLayout3 = this.Y;
                frameLayout3.setAlpha(l10);
                frameLayout3.setVisibility(l10 > 0.0f ? 0 : 4);
                M0();
            }
            View view = this.U;
            if (view != null) {
                int L = ((i10 / 2) + (i11 - org.telegram.messenger.g0.L(view.getTag() != null ? 69.0f : 48.0f))) - (this.h0 / 2);
                this.B0 = L;
                view.setTranslationY(L);
            }
            if (z10 || (layoutParams = (FrameLayout.LayoutParams) ((ai.c0) ((b8.ke) this.H).b).getLayoutParams()) == null || layoutParams.height == u0()) {
                return;
            }
            layoutParams.height = u0();
            org.telegram.messenger.z9 z9Var = this.F;
            if (z9Var != null) {
                z9Var.o(org.telegram.messenger.g0.L(70.0f), 0, org.telegram.messenger.g0.L(70.0f), t0());
            }
            ((ai.c0) ((b8.ke) this.H).b).setLayoutParams(layoutParams);
        }
    }

    public final void L0() {
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

    public final void M0() {
        org.telegram.messenger.sa saVar;
        ai.d2 d2Var;
        org.telegram.ui.Components.c80 c80Var = this.e0;
        if (c80Var == null || (saVar = this.H) == null) {
            return;
        }
        ai.c0 c0Var = (ai.c0) ((b8.ke) saVar).b;
        boolean z10 = this.d0 == null && this.y0 && !isFinishing() && (d2Var = this.P) != null && d2Var.getVisibility() == 0 && c0Var.getParent() != null && c0Var.getVisibility() == 0;
        if (c80Var.g == z10) {
            return;
        }
        c80Var.g = z10;
        if (z10) {
            c80Var.a();
        } else {
            c80Var.d();
        }
    }

    public final void N0() {
        TLRPC.MessageMedia messageMedia;
        int i3;
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
            TLRPC.Message message = ((ha0) arrayList.get(i11)).b;
            if (message != null && (messageMedia = message.media) != null && ((i3 = messageMedia.period) == Integer.MAX_VALUE || message.date + i3 > currentTime)) {
                i10++;
            }
        }
        boolean z10 = this.p0.f(getUserConfig().e()) != null;
        if (this.z0 != null && !z10) {
            i10++;
        }
        J0(i10 >= 2, true);
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.A6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.n5));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.a7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.b7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Gi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.cj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.fj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.U7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.T7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.S7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.R7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Q7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.P7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.O7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.vj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.tj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.uj));
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x08c2  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x08cb  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x07f2  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x07f7  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0658  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x05d8  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x05d4  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x05fc  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0806  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0814 A[LOOP:0: B:89:0x0811->B:91:0x0814, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x085f  */
    @Override // org.telegram.ui.ActionBar.d2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View createView(Context context) {
        boolean z10;
        org.telegram.messenger.zi ziVar;
        org.telegram.messenger.zi ziVar2;
        TLRPC.TL_channelLocation tL_channelLocation;
        org.telegram.messenger.zi ziVar3;
        int i3;
        pi.a baseSimpleGlass;
        org.telegram.ui.Components.tj0 tj0Var;
        TLRPC.Message message;
        TLRPC.MessageMedia messageMedia;
        final int i10 = 0;
        this.v0 = false;
        this.u0 = false;
        this.w0 = false;
        da0 da0Var = this.Q;
        if (da0Var != null) {
            da0Var.F();
        }
        org.telegram.ui.Components.sk skVar = this.T;
        if (skVar != null) {
            skVar.F();
        }
        if (this.C0 != null) {
            Location location = new Location("network");
            this.A0 = location;
            location.setLatitude(this.C0.geo_point.lat);
            this.A0.setLongitude(this.C0.geo_point._long);
        } else if (this.E0 != null) {
            Location location2 = new Location("network");
            this.A0 = location2;
            location2.setLatitude(this.E0.k.media.geo.lat);
            this.A0.setLongitude(this.E0.k.media.geo._long);
        }
        final int i11 = 1;
        this.k0 = (getParentActivity() == null || getParentActivity().checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") == 0) ? false : true;
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        org.telegram.ui.ActionBar.q4 q4Var = this.parentLayout;
        if (q4Var != null && ((ActionBarLayout) q4Var).T0) {
            this.simpleActionBar.setOccupyStatusBar(false);
        }
        this.simpleActionBar.setActionBarMenuOnItemClick(new ca0(this));
        org.telegram.ui.ActionBar.e5 o10 = this.simpleActionBar.o();
        org.telegram.ui.ActionBar.f5 b10 = o10.b(0, R.drawable.msg_map_type);
        this.d = b10;
        final int i12 = 2;
        b10.e(2, R.drawable.msg_map, org.telegram.messenger.bd.M0(2131748698, null));
        this.d.e(3, R.drawable.msg_satellite, org.telegram.messenger.bd.M0(2131745958, null));
        this.d.e(4, R.drawable.msg_hybrid, org.telegram.messenger.bd.M0(2131749283, null));
        this.d.setContentDescription(org.telegram.messenger.bd.M0(2131754839, null));
        TLRPC.TL_channelLocation tL_channelLocation2 = this.C0;
        int i13 = this.I0;
        if (tL_channelLocation2 != null) {
            this.simpleActionBar.setTitle(org.telegram.messenger.bd.M0(2131752220, null));
        } else {
            org.telegram.messenger.zi ziVar4 = this.E0;
            if (ziVar4 == null) {
                this.simpleActionBar.setTitle(org.telegram.messenger.bd.M0(2131745466, null));
                if (i13 != 4) {
                    org.telegram.ui.ActionBar.f5 b11 = o10.b(0, R.drawable.outline_header_search);
                    b11.N();
                    b11.C0 = new lg.w1(this, 15);
                    this.r = b11;
                    b11.setSearchFieldHint(org.telegram.messenger.bd.M0(2131745846, null));
                    this.r.setContentDescription(org.telegram.messenger.bd.M0(2131745846, null));
                }
            } else if (ziVar4.D3()) {
                this.simpleActionBar.setTitle(org.telegram.messenger.bd.M0(2131753966, null));
                org.telegram.ui.ActionBar.f5 b12 = o10.b(0, R.drawable.ic_ab_other);
                this.W = b12;
                b12.e(6, R.drawable.filled_directions, org.telegram.messenger.bd.M0(2131750481, null));
            } else {
                if (i13 != 3) {
                    String str = this.E0.k.media.title;
                    if (str == null || str.length() <= 0) {
                        this.simpleActionBar.setTitle(org.telegram.messenger.bd.M0(2131752220, null));
                    } else {
                        this.simpleActionBar.setTitle(org.telegram.messenger.bd.M0(2131745414, null));
                    }
                }
                if (i13 != 3) {
                    org.telegram.ui.ActionBar.f5 b13 = o10.b(0, R.drawable.ic_ab_other);
                    this.W = b13;
                    b13.e(1, R.drawable.msg_openin, org.telegram.messenger.bd.M0(2131747804, null));
                    if (!getLocationController().i(this.m0) && this.Q0) {
                        this.W.e(5, R.drawable.msg_location, org.telegram.messenger.bd.M0(2131745622, null));
                    }
                    this.W.setContentDescription(org.telegram.messenger.bd.M0(2131754839, null));
                }
            }
        }
        FrameLayout ka0Var = new ka0(this, context);
        this.fragmentView = ka0Var;
        int i14 = org.telegram.ui.ActionBar.k6.h5;
        org.telegram.ui.ActionBar.r6.i(i14, ka0Var, getResourceProvider());
        this.h0 = org.telegram.messenger.g0.L((i13 == 0 || i13 == 1) ? 26.0f : 16.0f);
        ai.d2 d2Var = new ai.d2(context, 28);
        this.P = d2Var;
        d2Var.setBackgroundDrawable(new org.telegram.ui.Components.mc(x0()));
        FrameLayout frameLayout = new FrameLayout(context);
        this.X = frameLayout;
        this.P.addView(frameLayout, b8.mf.e(-1, -2, 51));
        this.Y = new FrameLayout(context);
        FrameLayout.LayoutParams e10 = b8.mf.e(-1, -2, 83);
        e10.bottomMargin = org.telegram.messenger.g0.L(1.0f) + org.telegram.messenger.g0.L(29.0f) + this.h0;
        this.P.addView(this.Y, e10);
        if (this.E0 != null && i13 == 3) {
            TextView textView = new TextView(context);
            F0(textView);
            org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.jj, getResourceProvider());
            textView.setTextSize(1, 14.0f);
            textView.setTypeface(org.telegram.messenger.g0.o());
            textView.setGravity(17);
            textView.setPadding(org.telegram.messenger.g0.L(24.0f), 0, org.telegram.messenger.g0.L(24.0f), 0);
            this.simpleActionBar.addView(textView, b8.mf.e(-2, 58, 1));
            textView.setText(org.telegram.messenger.bd.M0(2131747803, null));
            textView.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.v90
                public final /* synthetic */ la0 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    boolean z11;
                    org.telegram.messenger.z9 z9Var;
                    int i15 = i11;
                    int i16 = 2;
                    la0 la0Var = this.b;
                    switch (i15) {
                        case 0:
                            if (la0Var.getParentActivity() == null || la0Var.z0 == null || !la0Var.l0() || la0Var.F == null) {
                                return;
                            }
                            gi.l3 l3Var = la0Var.s;
                            if (l3Var != null) {
                                l3Var.f(true);
                            }
                            org.telegram.messenger.hp.e1().edit().putInt("proximityhint", 3).commit();
                            org.telegram.messenger.kd h = la0Var.getLocationController().h(la0Var.m0);
                            if (la0Var.y) {
                                la0Var.x[0].d(1, true);
                            }
                            int i17 = 27;
                            if (h != null && h.f > 0) {
                                la0Var.c.setImageResource(R.drawable.msg_location_alert);
                                m2.t tVar = la0Var.L;
                                if (tVar != null) {
                                    tVar.U0();
                                    la0Var.L = null;
                                }
                                la0Var.y = true;
                                la0Var.w0().k(0L, 25, 0, null, new u90(la0Var, 3), new ly(27, la0Var, h));
                                return;
                            }
                            m2.t tVar2 = la0Var.L;
                            if (tVar2 == null) {
                                la0Var.m0(500);
                            } else {
                                try {
                                    u7.f fVar = (u7.f) ((l8.a) tVar2.b).a;
                                    Parcel O0 = fVar.O0(fVar.P0(), 6);
                                    double readDouble = O0.readDouble();
                                    O0.recycle();
                                    la0Var.M = readDouble;
                                } catch (RemoteException e11) {
                                    throw new androidx.car.app.j(e11);
                                }
                            }
                            TLRPC.User a22 = org.telegram.messenger.m5.E(la0Var.m0) ? la0Var.getMessagesController().a2(Long.valueOf(la0Var.m0)) : null;
                            Activity parentActivity = la0Var.getParentActivity();
                            x90 x90Var = new x90(la0Var, 4);
                            org.telegram.ui.Components.i41 i41Var = new org.telegram.ui.Components.i41(i17, la0Var, a22);
                            u90 u90Var = new u90(la0Var, 4);
                            org.telegram.ui.Components.kg0 kg0Var = new org.telegram.ui.Components.kg0(parentActivity);
                            kg0Var.a = null;
                            kg0Var.d = -1;
                            kg0Var.e = false;
                            kg0Var.f = false;
                            kg0Var.h = null;
                            kg0Var.n = new Rect();
                            new Paint();
                            kg0Var.x = true;
                            kg0Var.G = org.telegram.ui.Components.xq.h;
                            kg0Var.setWillNotDraw(false);
                            kg0Var.R = u90Var;
                            kg0Var.E = ViewConfiguration.get(parentActivity).getScaledTouchSlop();
                            Rect rect = new Rect();
                            Drawable mutate = parentActivity.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
                            org.telegram.ui.ActionBar.r6.y(kg0Var, mutate, org.telegram.ui.ActionBar.k6.h5, null, PorterDuff.Mode.MULTIPLY);
                            mutate.getPadding(rect);
                            int i18 = rect.left;
                            kg0Var.y = i18;
                            org.telegram.ui.Components.gg0 gg0Var = new org.telegram.ui.Components.gg0(kg0Var.getContext());
                            kg0Var.w = gg0Var;
                            gg0Var.setBackgroundDrawable(mutate);
                            gg0Var.setPadding(i18, (org.telegram.messenger.g0.L(8.0f) + rect.top) - 1, i18, 0);
                            gg0Var.setVisibility(4);
                            kg0Var.addView(gg0Var, 0, b8.mf.e(-1, -2, 80));
                            org.telegram.messenger.bd.l();
                            kg0Var.P = org.telegram.messenger.bd.g0.booleanValue();
                            kg0Var.N = a22;
                            kg0Var.J = x90Var;
                            org.telegram.ui.Components.cb0 cb0Var = new org.telegram.ui.Components.cb0(parentActivity, null);
                            kg0Var.H = cb0Var;
                            cb0Var.setTextOffset(org.telegram.messenger.g0.L(10.0f));
                            cb0Var.setItemCount(5);
                            org.telegram.ui.Components.cb0 cb0Var2 = new org.telegram.ui.Components.cb0(parentActivity, null);
                            kg0Var.I = cb0Var2;
                            cb0Var2.setItemCount(5);
                            cb0Var2.setTextOffset(-org.telegram.messenger.g0.L(10.0f));
                            org.telegram.ui.Components.hg0 hg0Var = new org.telegram.ui.Components.hg0(kg0Var, parentActivity);
                            kg0Var.Q = hg0Var;
                            hg0Var.setOrientation(1);
                            FrameLayout frameLayout2 = new FrameLayout(parentActivity);
                            hg0Var.addView(frameLayout2, b8.mf.t(-1, -2, 51, 22, 0, 0, 4));
                            TextView textView2 = new TextView(parentActivity);
                            textView2.setText(org.telegram.messenger.bd.M0(2131748764, null));
                            org.telegram.messenger.k5.n(textView2, org.telegram.ui.ActionBar.k6.j5, null, 1, 20.0f);
                            frameLayout2.addView(textView2, b8.mf.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
                            textView2.setOnTouchListener(new fi.a(20));
                            LinearLayout linearLayout = new LinearLayout(parentActivity);
                            linearLayout.setOrientation(0);
                            linearLayout.setWeightSum(1.0f);
                            hg0Var.addView(linearLayout, b8.mf.o(-1, -2));
                            System.currentTimeMillis();
                            FrameLayout frameLayout3 = new FrameLayout(parentActivity);
                            TextView textView3 = new TextView(parentActivity);
                            kg0Var.L = textView3;
                            org.telegram.ui.Components.ig0 ig0Var = new org.telegram.ui.Components.ig0(parentActivity);
                            kg0Var.K = ig0Var;
                            linearLayout.addView(cb0Var, b8.mf.l(0.5f, 0, org.telegram.messenger.hs.t4));
                            cb0Var.setFormatter(new org.telegram.ui.Components.fg0(kg0Var, 0));
                            cb0Var.setMinValue(0);
                            cb0Var.setMaxValue(10);
                            cb0Var.setWrapSelectorWheel(false);
                            cb0Var.setTextOffset(org.telegram.messenger.g0.L(20.0f));
                            org.telegram.ui.Components.fg0 fg0Var = new org.telegram.ui.Components.fg0(kg0Var, 1);
                            cb0Var.setOnValueChangedListener(fg0Var);
                            cb0Var2.setMinValue(0);
                            cb0Var2.setMaxValue(10);
                            cb0Var2.setWrapSelectorWheel(false);
                            cb0Var2.setTextOffset(-org.telegram.messenger.g0.L(20.0f));
                            linearLayout.addView(cb0Var2, b8.mf.l(0.5f, 0, org.telegram.messenger.hs.t4));
                            cb0Var2.setFormatter(new org.telegram.ui.Components.fg0(kg0Var, 2));
                            cb0Var2.setOnValueChangedListener(fg0Var);
                            cb0Var.setValue(0);
                            cb0Var2.setValue(6);
                            hg0Var.addView(frameLayout3, b8.mf.t(-1, 48, 83, 16, 15, 16, 16));
                            ig0Var.setPadding(org.telegram.messenger.g0.L(34.0f), 0, org.telegram.messenger.g0.L(34.0f), 0);
                            ig0Var.setGravity(17);
                            org.telegram.ui.ActionBar.r6.V(ig0Var, org.telegram.ui.ActionBar.k6.Gi, null);
                            ig0Var.setTextSize(1, 14.0f);
                            ig0Var.setMaxLines(2);
                            ig0Var.setTypeface(org.telegram.messenger.g0.o());
                            ig0Var.setBackgroundDrawable(org.telegram.ui.ActionBar.y5.f(org.telegram.ui.ActionBar.k6.Ci, 4.0f));
                            frameLayout3.addView(ig0Var, b8.mf.c(48.0f, -1));
                            ig0Var.setOnClickListener(new org.telegram.ui.Components.q2(25, kg0Var, i41Var));
                            textView3.setPadding(org.telegram.messenger.g0.L(34.0f), 0, org.telegram.messenger.g0.L(34.0f), 0);
                            textView3.setGravity(17);
                            org.telegram.ui.ActionBar.r6.V(textView3, org.telegram.ui.ActionBar.k6.q5, null);
                            textView3.setTextSize(1, 14.0f);
                            textView3.setAlpha(0.0f);
                            textView3.setScaleX(0.5f);
                            textView3.setScaleY(0.5f);
                            frameLayout3.addView(textView3, b8.mf.c(48.0f, -1));
                            gg0Var.addView(hg0Var, b8.mf.e(-1, -2, 51));
                            la0Var.O = kg0Var;
                            ((FrameLayout) la0Var.fragmentView).addView(kg0Var, b8.mf.c(-1.0f, -1));
                            org.telegram.ui.Components.kg0 kg0Var2 = la0Var.O;
                            kg0Var2.r = false;
                            AnimatorSet animatorSet = kg0Var2.s;
                            if (animatorSet != null) {
                                animatorSet.cancel();
                                kg0Var2.s = null;
                            }
                            org.telegram.ui.Components.gg0 gg0Var2 = kg0Var2.w;
                            Point point = org.telegram.messenger.g0.q;
                            gg0Var2.measure(View.MeasureSpec.makeMeasureSpec((kg0Var2.y * 2) + point.x, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(point.y, TLObject.FLAG_31));
                            if (kg0Var2.r) {
                                z11 = true;
                            } else {
                                gg0Var2.setVisibility(0);
                                if (kg0Var2.x) {
                                    kg0Var2.setLayerType(2, null);
                                }
                                gg0Var2.setTranslationY(gg0Var2.getMeasuredHeight());
                                AnimatorSet animatorSet2 = new AnimatorSet();
                                kg0Var2.s = animatorSet2;
                                animatorSet2.playTogether(ObjectAnimator.ofFloat(gg0Var2, (Property<org.telegram.ui.Components.gg0, Float>) View.TRANSLATION_Y, 0.0f));
                                kg0Var2.s.setDuration(400L);
                                kg0Var2.s.setStartDelay(20L);
                                kg0Var2.s.setInterpolator(kg0Var2.G);
                                z11 = true;
                                kg0Var2.s.addListener(new org.telegram.ui.Components.jg0(kg0Var2, 1 == true ? 1 : 0));
                                org.telegram.messenger.hs.e().k(98, 512);
                                kg0Var2.s.start();
                            }
                            kg0Var2.c(z11);
                            return;
                        case 1:
                            try {
                                TLRPC.GeoPoint geoPoint = la0Var.E0.k.media.geo;
                                double d = geoPoint.lat;
                                double d10 = geoPoint._long;
                                la0Var.getParentActivity().startActivity(new Intent("android.intent.action.VIEW", Uri.parse("geo:" + d + "," + d10 + "?q=" + d + "," + d10)));
                                return;
                            } catch (Exception e12) {
                                org.telegram.messenger.a8.g(e12, true);
                                return;
                            }
                        case 2:
                            int i19 = la0Var.I0;
                            Activity parentActivity2 = la0Var.getParentActivity();
                            if (parentActivity2 != null && parentActivity2.checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") != 0) {
                                if (la0Var.getParentActivity() == null) {
                                    return;
                                }
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(la0Var.getParentActivity());
                                int i20 = org.telegram.ui.ActionBar.k6.L5;
                                alertDialog$Builder.m(R.raw.permission_request_location, 72, la0Var.getThemedColor(i20), null);
                                alertDialog$Builder.n(i20, la0Var.getResourceProvider());
                                SpannableStringBuilder X2 = org.telegram.messenger.g0.X2(org.telegram.messenger.bd.M0(2131747312, null));
                                org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.a;
                                s1Var.U = X2;
                                alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131747308, null), new x90(la0Var, i16));
                                alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131747839, null), null);
                                la0Var.showDialog(s1Var);
                                return;
                            }
                            if (la0Var.l0() || i19 == 3) {
                                if ((la0Var.E0 != null && i19 != 3) || la0Var.C0 != null) {
                                    if (la0Var.z0 == null || (z9Var = la0Var.F) == null) {
                                        return;
                                    }
                                    z9Var.b(((mb.b) org.telegram.messenger.t0.k()).newCameraUpdateLatLngZoom(new org.telegram.messenger.va(la0Var.z0.getLatitude(), la0Var.z0.getLongitude()), la0Var.F.e() - 4.0f));
                                    return;
                                }
                                if (la0Var.z0 == null || la0Var.F == null) {
                                    return;
                                }
                                ImageView imageView = la0Var.a;
                                int i21 = org.telegram.ui.ActionBar.k6.jj;
                                org.telegram.ui.ActionBar.r6.t(imageView, i21, la0Var.getResourceProvider(), PorterDuff.Mode.MULTIPLY);
                                la0Var.a.setTag(Integer.valueOf(i21));
                                la0Var.Q.L(null);
                                la0Var.F0 = false;
                                la0Var.F.b(((mb.b) org.telegram.messenger.t0.k()).newCameraUpdateLatLng(new org.telegram.messenger.va(la0Var.z0.getLatitude(), la0Var.z0.getLongitude())));
                                return;
                            }
                            return;
                        default:
                            la0Var.q0 = -1L;
                            la0Var.F0 = true;
                            if (la0Var.r0()) {
                                la0Var.r0 = true;
                                la0Var.J0(false, true);
                                return;
                            }
                            return;
                    }
                }
            });
        }
        ImageView imageView = new ImageView(context);
        this.a = imageView;
        F0(imageView);
        this.a.setImageResource(R.drawable.msg_current_location);
        ImageView imageView2 = this.a;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView2.setScaleType(scaleType);
        ImageView imageView3 = this.a;
        int i15 = org.telegram.ui.ActionBar.k6.jj;
        org.telegram.ui.ActionBar.e6 resourceProvider = getResourceProvider();
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        org.telegram.ui.ActionBar.r6.t(imageView3, i15, resourceProvider, mode);
        this.a.setTag(Integer.valueOf(i15));
        this.a.setContentDescription(org.telegram.messenger.bd.M0(2131754831, null));
        this.Y.addView(this.a, b8.mf.e(58, 58, 85));
        this.a.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.v90
            public final /* synthetic */ la0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                boolean z11;
                org.telegram.messenger.z9 z9Var;
                int i152 = i12;
                int i16 = 2;
                la0 la0Var = this.b;
                switch (i152) {
                    case 0:
                        if (la0Var.getParentActivity() == null || la0Var.z0 == null || !la0Var.l0() || la0Var.F == null) {
                            return;
                        }
                        gi.l3 l3Var = la0Var.s;
                        if (l3Var != null) {
                            l3Var.f(true);
                        }
                        org.telegram.messenger.hp.e1().edit().putInt("proximityhint", 3).commit();
                        org.telegram.messenger.kd h = la0Var.getLocationController().h(la0Var.m0);
                        if (la0Var.y) {
                            la0Var.x[0].d(1, true);
                        }
                        int i17 = 27;
                        if (h != null && h.f > 0) {
                            la0Var.c.setImageResource(R.drawable.msg_location_alert);
                            m2.t tVar = la0Var.L;
                            if (tVar != null) {
                                tVar.U0();
                                la0Var.L = null;
                            }
                            la0Var.y = true;
                            la0Var.w0().k(0L, 25, 0, null, new u90(la0Var, 3), new ly(27, la0Var, h));
                            return;
                        }
                        m2.t tVar2 = la0Var.L;
                        if (tVar2 == null) {
                            la0Var.m0(500);
                        } else {
                            try {
                                u7.f fVar = (u7.f) ((l8.a) tVar2.b).a;
                                Parcel O0 = fVar.O0(fVar.P0(), 6);
                                double readDouble = O0.readDouble();
                                O0.recycle();
                                la0Var.M = readDouble;
                            } catch (RemoteException e11) {
                                throw new androidx.car.app.j(e11);
                            }
                        }
                        TLRPC.User a22 = org.telegram.messenger.m5.E(la0Var.m0) ? la0Var.getMessagesController().a2(Long.valueOf(la0Var.m0)) : null;
                        Activity parentActivity = la0Var.getParentActivity();
                        x90 x90Var = new x90(la0Var, 4);
                        org.telegram.ui.Components.i41 i41Var = new org.telegram.ui.Components.i41(i17, la0Var, a22);
                        u90 u90Var = new u90(la0Var, 4);
                        org.telegram.ui.Components.kg0 kg0Var = new org.telegram.ui.Components.kg0(parentActivity);
                        kg0Var.a = null;
                        kg0Var.d = -1;
                        kg0Var.e = false;
                        kg0Var.f = false;
                        kg0Var.h = null;
                        kg0Var.n = new Rect();
                        new Paint();
                        kg0Var.x = true;
                        kg0Var.G = org.telegram.ui.Components.xq.h;
                        kg0Var.setWillNotDraw(false);
                        kg0Var.R = u90Var;
                        kg0Var.E = ViewConfiguration.get(parentActivity).getScaledTouchSlop();
                        Rect rect = new Rect();
                        Drawable mutate = parentActivity.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
                        org.telegram.ui.ActionBar.r6.y(kg0Var, mutate, org.telegram.ui.ActionBar.k6.h5, null, PorterDuff.Mode.MULTIPLY);
                        mutate.getPadding(rect);
                        int i18 = rect.left;
                        kg0Var.y = i18;
                        org.telegram.ui.Components.gg0 gg0Var = new org.telegram.ui.Components.gg0(kg0Var.getContext());
                        kg0Var.w = gg0Var;
                        gg0Var.setBackgroundDrawable(mutate);
                        gg0Var.setPadding(i18, (org.telegram.messenger.g0.L(8.0f) + rect.top) - 1, i18, 0);
                        gg0Var.setVisibility(4);
                        kg0Var.addView(gg0Var, 0, b8.mf.e(-1, -2, 80));
                        org.telegram.messenger.bd.l();
                        kg0Var.P = org.telegram.messenger.bd.g0.booleanValue();
                        kg0Var.N = a22;
                        kg0Var.J = x90Var;
                        org.telegram.ui.Components.cb0 cb0Var = new org.telegram.ui.Components.cb0(parentActivity, null);
                        kg0Var.H = cb0Var;
                        cb0Var.setTextOffset(org.telegram.messenger.g0.L(10.0f));
                        cb0Var.setItemCount(5);
                        org.telegram.ui.Components.cb0 cb0Var2 = new org.telegram.ui.Components.cb0(parentActivity, null);
                        kg0Var.I = cb0Var2;
                        cb0Var2.setItemCount(5);
                        cb0Var2.setTextOffset(-org.telegram.messenger.g0.L(10.0f));
                        org.telegram.ui.Components.hg0 hg0Var = new org.telegram.ui.Components.hg0(kg0Var, parentActivity);
                        kg0Var.Q = hg0Var;
                        hg0Var.setOrientation(1);
                        FrameLayout frameLayout2 = new FrameLayout(parentActivity);
                        hg0Var.addView(frameLayout2, b8.mf.t(-1, -2, 51, 22, 0, 0, 4));
                        TextView textView2 = new TextView(parentActivity);
                        textView2.setText(org.telegram.messenger.bd.M0(2131748764, null));
                        org.telegram.messenger.k5.n(textView2, org.telegram.ui.ActionBar.k6.j5, null, 1, 20.0f);
                        frameLayout2.addView(textView2, b8.mf.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
                        textView2.setOnTouchListener(new fi.a(20));
                        LinearLayout linearLayout = new LinearLayout(parentActivity);
                        linearLayout.setOrientation(0);
                        linearLayout.setWeightSum(1.0f);
                        hg0Var.addView(linearLayout, b8.mf.o(-1, -2));
                        System.currentTimeMillis();
                        FrameLayout frameLayout3 = new FrameLayout(parentActivity);
                        TextView textView3 = new TextView(parentActivity);
                        kg0Var.L = textView3;
                        org.telegram.ui.Components.ig0 ig0Var = new org.telegram.ui.Components.ig0(parentActivity);
                        kg0Var.K = ig0Var;
                        linearLayout.addView(cb0Var, b8.mf.l(0.5f, 0, org.telegram.messenger.hs.t4));
                        cb0Var.setFormatter(new org.telegram.ui.Components.fg0(kg0Var, 0));
                        cb0Var.setMinValue(0);
                        cb0Var.setMaxValue(10);
                        cb0Var.setWrapSelectorWheel(false);
                        cb0Var.setTextOffset(org.telegram.messenger.g0.L(20.0f));
                        org.telegram.ui.Components.fg0 fg0Var = new org.telegram.ui.Components.fg0(kg0Var, 1);
                        cb0Var.setOnValueChangedListener(fg0Var);
                        cb0Var2.setMinValue(0);
                        cb0Var2.setMaxValue(10);
                        cb0Var2.setWrapSelectorWheel(false);
                        cb0Var2.setTextOffset(-org.telegram.messenger.g0.L(20.0f));
                        linearLayout.addView(cb0Var2, b8.mf.l(0.5f, 0, org.telegram.messenger.hs.t4));
                        cb0Var2.setFormatter(new org.telegram.ui.Components.fg0(kg0Var, 2));
                        cb0Var2.setOnValueChangedListener(fg0Var);
                        cb0Var.setValue(0);
                        cb0Var2.setValue(6);
                        hg0Var.addView(frameLayout3, b8.mf.t(-1, 48, 83, 16, 15, 16, 16));
                        ig0Var.setPadding(org.telegram.messenger.g0.L(34.0f), 0, org.telegram.messenger.g0.L(34.0f), 0);
                        ig0Var.setGravity(17);
                        org.telegram.ui.ActionBar.r6.V(ig0Var, org.telegram.ui.ActionBar.k6.Gi, null);
                        ig0Var.setTextSize(1, 14.0f);
                        ig0Var.setMaxLines(2);
                        ig0Var.setTypeface(org.telegram.messenger.g0.o());
                        ig0Var.setBackgroundDrawable(org.telegram.ui.ActionBar.y5.f(org.telegram.ui.ActionBar.k6.Ci, 4.0f));
                        frameLayout3.addView(ig0Var, b8.mf.c(48.0f, -1));
                        ig0Var.setOnClickListener(new org.telegram.ui.Components.q2(25, kg0Var, i41Var));
                        textView3.setPadding(org.telegram.messenger.g0.L(34.0f), 0, org.telegram.messenger.g0.L(34.0f), 0);
                        textView3.setGravity(17);
                        org.telegram.ui.ActionBar.r6.V(textView3, org.telegram.ui.ActionBar.k6.q5, null);
                        textView3.setTextSize(1, 14.0f);
                        textView3.setAlpha(0.0f);
                        textView3.setScaleX(0.5f);
                        textView3.setScaleY(0.5f);
                        frameLayout3.addView(textView3, b8.mf.c(48.0f, -1));
                        gg0Var.addView(hg0Var, b8.mf.e(-1, -2, 51));
                        la0Var.O = kg0Var;
                        ((FrameLayout) la0Var.fragmentView).addView(kg0Var, b8.mf.c(-1.0f, -1));
                        org.telegram.ui.Components.kg0 kg0Var2 = la0Var.O;
                        kg0Var2.r = false;
                        AnimatorSet animatorSet = kg0Var2.s;
                        if (animatorSet != null) {
                            animatorSet.cancel();
                            kg0Var2.s = null;
                        }
                        org.telegram.ui.Components.gg0 gg0Var2 = kg0Var2.w;
                        Point point = org.telegram.messenger.g0.q;
                        gg0Var2.measure(View.MeasureSpec.makeMeasureSpec((kg0Var2.y * 2) + point.x, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(point.y, TLObject.FLAG_31));
                        if (kg0Var2.r) {
                            z11 = true;
                        } else {
                            gg0Var2.setVisibility(0);
                            if (kg0Var2.x) {
                                kg0Var2.setLayerType(2, null);
                            }
                            gg0Var2.setTranslationY(gg0Var2.getMeasuredHeight());
                            AnimatorSet animatorSet2 = new AnimatorSet();
                            kg0Var2.s = animatorSet2;
                            animatorSet2.playTogether(ObjectAnimator.ofFloat(gg0Var2, (Property<org.telegram.ui.Components.gg0, Float>) View.TRANSLATION_Y, 0.0f));
                            kg0Var2.s.setDuration(400L);
                            kg0Var2.s.setStartDelay(20L);
                            kg0Var2.s.setInterpolator(kg0Var2.G);
                            z11 = true;
                            kg0Var2.s.addListener(new org.telegram.ui.Components.jg0(kg0Var2, 1 == true ? 1 : 0));
                            org.telegram.messenger.hs.e().k(98, 512);
                            kg0Var2.s.start();
                        }
                        kg0Var2.c(z11);
                        return;
                    case 1:
                        try {
                            TLRPC.GeoPoint geoPoint = la0Var.E0.k.media.geo;
                            double d = geoPoint.lat;
                            double d10 = geoPoint._long;
                            la0Var.getParentActivity().startActivity(new Intent("android.intent.action.VIEW", Uri.parse("geo:" + d + "," + d10 + "?q=" + d + "," + d10)));
                            return;
                        } catch (Exception e12) {
                            org.telegram.messenger.a8.g(e12, true);
                            return;
                        }
                    case 2:
                        int i19 = la0Var.I0;
                        Activity parentActivity2 = la0Var.getParentActivity();
                        if (parentActivity2 != null && parentActivity2.checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") != 0) {
                            if (la0Var.getParentActivity() == null) {
                                return;
                            }
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(la0Var.getParentActivity());
                            int i20 = org.telegram.ui.ActionBar.k6.L5;
                            alertDialog$Builder.m(R.raw.permission_request_location, 72, la0Var.getThemedColor(i20), null);
                            alertDialog$Builder.n(i20, la0Var.getResourceProvider());
                            SpannableStringBuilder X2 = org.telegram.messenger.g0.X2(org.telegram.messenger.bd.M0(2131747312, null));
                            org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.a;
                            s1Var.U = X2;
                            alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131747308, null), new x90(la0Var, i16));
                            alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131747839, null), null);
                            la0Var.showDialog(s1Var);
                            return;
                        }
                        if (la0Var.l0() || i19 == 3) {
                            if ((la0Var.E0 != null && i19 != 3) || la0Var.C0 != null) {
                                if (la0Var.z0 == null || (z9Var = la0Var.F) == null) {
                                    return;
                                }
                                z9Var.b(((mb.b) org.telegram.messenger.t0.k()).newCameraUpdateLatLngZoom(new org.telegram.messenger.va(la0Var.z0.getLatitude(), la0Var.z0.getLongitude()), la0Var.F.e() - 4.0f));
                                return;
                            }
                            if (la0Var.z0 == null || la0Var.F == null) {
                                return;
                            }
                            ImageView imageView4 = la0Var.a;
                            int i21 = org.telegram.ui.ActionBar.k6.jj;
                            org.telegram.ui.ActionBar.r6.t(imageView4, i21, la0Var.getResourceProvider(), PorterDuff.Mode.MULTIPLY);
                            la0Var.a.setTag(Integer.valueOf(i21));
                            la0Var.Q.L(null);
                            la0Var.F0 = false;
                            la0Var.F.b(((mb.b) org.telegram.messenger.t0.k()).newCameraUpdateLatLng(new org.telegram.messenger.va(la0Var.z0.getLatitude(), la0Var.z0.getLongitude())));
                            return;
                        }
                        return;
                    default:
                        la0Var.q0 = -1L;
                        la0Var.F0 = true;
                        if (la0Var.r0()) {
                            la0Var.r0 = true;
                            la0Var.J0(false, true);
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
        org.telegram.ui.ActionBar.r6.V(this.b, org.telegram.ui.ActionBar.k6.Ci, this.resourceProvider);
        this.b.setTypeface(org.telegram.messenger.g0.o());
        this.b.setPadding(org.telegram.messenger.g0.L(22.0f), 0, org.telegram.messenger.g0.L(22.0f), 0);
        this.b.setText(org.telegram.messenger.bd.M0(2131748752, null));
        this.Y.addView(this.b, b8.mf.e(-2, 58, 81));
        final int i16 = 3;
        this.b.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.v90
            public final /* synthetic */ la0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                boolean z11;
                org.telegram.messenger.z9 z9Var;
                int i152 = i16;
                int i162 = 2;
                la0 la0Var = this.b;
                switch (i152) {
                    case 0:
                        if (la0Var.getParentActivity() == null || la0Var.z0 == null || !la0Var.l0() || la0Var.F == null) {
                            return;
                        }
                        gi.l3 l3Var = la0Var.s;
                        if (l3Var != null) {
                            l3Var.f(true);
                        }
                        org.telegram.messenger.hp.e1().edit().putInt("proximityhint", 3).commit();
                        org.telegram.messenger.kd h = la0Var.getLocationController().h(la0Var.m0);
                        if (la0Var.y) {
                            la0Var.x[0].d(1, true);
                        }
                        int i17 = 27;
                        if (h != null && h.f > 0) {
                            la0Var.c.setImageResource(R.drawable.msg_location_alert);
                            m2.t tVar = la0Var.L;
                            if (tVar != null) {
                                tVar.U0();
                                la0Var.L = null;
                            }
                            la0Var.y = true;
                            la0Var.w0().k(0L, 25, 0, null, new u90(la0Var, 3), new ly(27, la0Var, h));
                            return;
                        }
                        m2.t tVar2 = la0Var.L;
                        if (tVar2 == null) {
                            la0Var.m0(500);
                        } else {
                            try {
                                u7.f fVar = (u7.f) ((l8.a) tVar2.b).a;
                                Parcel O0 = fVar.O0(fVar.P0(), 6);
                                double readDouble = O0.readDouble();
                                O0.recycle();
                                la0Var.M = readDouble;
                            } catch (RemoteException e11) {
                                throw new androidx.car.app.j(e11);
                            }
                        }
                        TLRPC.User a22 = org.telegram.messenger.m5.E(la0Var.m0) ? la0Var.getMessagesController().a2(Long.valueOf(la0Var.m0)) : null;
                        Activity parentActivity = la0Var.getParentActivity();
                        x90 x90Var = new x90(la0Var, 4);
                        org.telegram.ui.Components.i41 i41Var = new org.telegram.ui.Components.i41(i17, la0Var, a22);
                        u90 u90Var = new u90(la0Var, 4);
                        org.telegram.ui.Components.kg0 kg0Var = new org.telegram.ui.Components.kg0(parentActivity);
                        kg0Var.a = null;
                        kg0Var.d = -1;
                        kg0Var.e = false;
                        kg0Var.f = false;
                        kg0Var.h = null;
                        kg0Var.n = new Rect();
                        new Paint();
                        kg0Var.x = true;
                        kg0Var.G = org.telegram.ui.Components.xq.h;
                        kg0Var.setWillNotDraw(false);
                        kg0Var.R = u90Var;
                        kg0Var.E = ViewConfiguration.get(parentActivity).getScaledTouchSlop();
                        Rect rect = new Rect();
                        Drawable mutate = parentActivity.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
                        org.telegram.ui.ActionBar.r6.y(kg0Var, mutate, org.telegram.ui.ActionBar.k6.h5, null, PorterDuff.Mode.MULTIPLY);
                        mutate.getPadding(rect);
                        int i18 = rect.left;
                        kg0Var.y = i18;
                        org.telegram.ui.Components.gg0 gg0Var = new org.telegram.ui.Components.gg0(kg0Var.getContext());
                        kg0Var.w = gg0Var;
                        gg0Var.setBackgroundDrawable(mutate);
                        gg0Var.setPadding(i18, (org.telegram.messenger.g0.L(8.0f) + rect.top) - 1, i18, 0);
                        gg0Var.setVisibility(4);
                        kg0Var.addView(gg0Var, 0, b8.mf.e(-1, -2, 80));
                        org.telegram.messenger.bd.l();
                        kg0Var.P = org.telegram.messenger.bd.g0.booleanValue();
                        kg0Var.N = a22;
                        kg0Var.J = x90Var;
                        org.telegram.ui.Components.cb0 cb0Var = new org.telegram.ui.Components.cb0(parentActivity, null);
                        kg0Var.H = cb0Var;
                        cb0Var.setTextOffset(org.telegram.messenger.g0.L(10.0f));
                        cb0Var.setItemCount(5);
                        org.telegram.ui.Components.cb0 cb0Var2 = new org.telegram.ui.Components.cb0(parentActivity, null);
                        kg0Var.I = cb0Var2;
                        cb0Var2.setItemCount(5);
                        cb0Var2.setTextOffset(-org.telegram.messenger.g0.L(10.0f));
                        org.telegram.ui.Components.hg0 hg0Var = new org.telegram.ui.Components.hg0(kg0Var, parentActivity);
                        kg0Var.Q = hg0Var;
                        hg0Var.setOrientation(1);
                        FrameLayout frameLayout2 = new FrameLayout(parentActivity);
                        hg0Var.addView(frameLayout2, b8.mf.t(-1, -2, 51, 22, 0, 0, 4));
                        TextView textView22 = new TextView(parentActivity);
                        textView22.setText(org.telegram.messenger.bd.M0(2131748764, null));
                        org.telegram.messenger.k5.n(textView22, org.telegram.ui.ActionBar.k6.j5, null, 1, 20.0f);
                        frameLayout2.addView(textView22, b8.mf.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
                        textView22.setOnTouchListener(new fi.a(20));
                        LinearLayout linearLayout = new LinearLayout(parentActivity);
                        linearLayout.setOrientation(0);
                        linearLayout.setWeightSum(1.0f);
                        hg0Var.addView(linearLayout, b8.mf.o(-1, -2));
                        System.currentTimeMillis();
                        FrameLayout frameLayout3 = new FrameLayout(parentActivity);
                        TextView textView3 = new TextView(parentActivity);
                        kg0Var.L = textView3;
                        org.telegram.ui.Components.ig0 ig0Var = new org.telegram.ui.Components.ig0(parentActivity);
                        kg0Var.K = ig0Var;
                        linearLayout.addView(cb0Var, b8.mf.l(0.5f, 0, org.telegram.messenger.hs.t4));
                        cb0Var.setFormatter(new org.telegram.ui.Components.fg0(kg0Var, 0));
                        cb0Var.setMinValue(0);
                        cb0Var.setMaxValue(10);
                        cb0Var.setWrapSelectorWheel(false);
                        cb0Var.setTextOffset(org.telegram.messenger.g0.L(20.0f));
                        org.telegram.ui.Components.fg0 fg0Var = new org.telegram.ui.Components.fg0(kg0Var, 1);
                        cb0Var.setOnValueChangedListener(fg0Var);
                        cb0Var2.setMinValue(0);
                        cb0Var2.setMaxValue(10);
                        cb0Var2.setWrapSelectorWheel(false);
                        cb0Var2.setTextOffset(-org.telegram.messenger.g0.L(20.0f));
                        linearLayout.addView(cb0Var2, b8.mf.l(0.5f, 0, org.telegram.messenger.hs.t4));
                        cb0Var2.setFormatter(new org.telegram.ui.Components.fg0(kg0Var, 2));
                        cb0Var2.setOnValueChangedListener(fg0Var);
                        cb0Var.setValue(0);
                        cb0Var2.setValue(6);
                        hg0Var.addView(frameLayout3, b8.mf.t(-1, 48, 83, 16, 15, 16, 16));
                        ig0Var.setPadding(org.telegram.messenger.g0.L(34.0f), 0, org.telegram.messenger.g0.L(34.0f), 0);
                        ig0Var.setGravity(17);
                        org.telegram.ui.ActionBar.r6.V(ig0Var, org.telegram.ui.ActionBar.k6.Gi, null);
                        ig0Var.setTextSize(1, 14.0f);
                        ig0Var.setMaxLines(2);
                        ig0Var.setTypeface(org.telegram.messenger.g0.o());
                        ig0Var.setBackgroundDrawable(org.telegram.ui.ActionBar.y5.f(org.telegram.ui.ActionBar.k6.Ci, 4.0f));
                        frameLayout3.addView(ig0Var, b8.mf.c(48.0f, -1));
                        ig0Var.setOnClickListener(new org.telegram.ui.Components.q2(25, kg0Var, i41Var));
                        textView3.setPadding(org.telegram.messenger.g0.L(34.0f), 0, org.telegram.messenger.g0.L(34.0f), 0);
                        textView3.setGravity(17);
                        org.telegram.ui.ActionBar.r6.V(textView3, org.telegram.ui.ActionBar.k6.q5, null);
                        textView3.setTextSize(1, 14.0f);
                        textView3.setAlpha(0.0f);
                        textView3.setScaleX(0.5f);
                        textView3.setScaleY(0.5f);
                        frameLayout3.addView(textView3, b8.mf.c(48.0f, -1));
                        gg0Var.addView(hg0Var, b8.mf.e(-1, -2, 51));
                        la0Var.O = kg0Var;
                        ((FrameLayout) la0Var.fragmentView).addView(kg0Var, b8.mf.c(-1.0f, -1));
                        org.telegram.ui.Components.kg0 kg0Var2 = la0Var.O;
                        kg0Var2.r = false;
                        AnimatorSet animatorSet = kg0Var2.s;
                        if (animatorSet != null) {
                            animatorSet.cancel();
                            kg0Var2.s = null;
                        }
                        org.telegram.ui.Components.gg0 gg0Var2 = kg0Var2.w;
                        Point point = org.telegram.messenger.g0.q;
                        gg0Var2.measure(View.MeasureSpec.makeMeasureSpec((kg0Var2.y * 2) + point.x, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(point.y, TLObject.FLAG_31));
                        if (kg0Var2.r) {
                            z11 = true;
                        } else {
                            gg0Var2.setVisibility(0);
                            if (kg0Var2.x) {
                                kg0Var2.setLayerType(2, null);
                            }
                            gg0Var2.setTranslationY(gg0Var2.getMeasuredHeight());
                            AnimatorSet animatorSet2 = new AnimatorSet();
                            kg0Var2.s = animatorSet2;
                            animatorSet2.playTogether(ObjectAnimator.ofFloat(gg0Var2, (Property<org.telegram.ui.Components.gg0, Float>) View.TRANSLATION_Y, 0.0f));
                            kg0Var2.s.setDuration(400L);
                            kg0Var2.s.setStartDelay(20L);
                            kg0Var2.s.setInterpolator(kg0Var2.G);
                            z11 = true;
                            kg0Var2.s.addListener(new org.telegram.ui.Components.jg0(kg0Var2, 1 == true ? 1 : 0));
                            org.telegram.messenger.hs.e().k(98, 512);
                            kg0Var2.s.start();
                        }
                        kg0Var2.c(z11);
                        return;
                    case 1:
                        try {
                            TLRPC.GeoPoint geoPoint = la0Var.E0.k.media.geo;
                            double d = geoPoint.lat;
                            double d10 = geoPoint._long;
                            la0Var.getParentActivity().startActivity(new Intent("android.intent.action.VIEW", Uri.parse("geo:" + d + "," + d10 + "?q=" + d + "," + d10)));
                            return;
                        } catch (Exception e12) {
                            org.telegram.messenger.a8.g(e12, true);
                            return;
                        }
                    case 2:
                        int i19 = la0Var.I0;
                        Activity parentActivity2 = la0Var.getParentActivity();
                        if (parentActivity2 != null && parentActivity2.checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") != 0) {
                            if (la0Var.getParentActivity() == null) {
                                return;
                            }
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(la0Var.getParentActivity());
                            int i20 = org.telegram.ui.ActionBar.k6.L5;
                            alertDialog$Builder.m(R.raw.permission_request_location, 72, la0Var.getThemedColor(i20), null);
                            alertDialog$Builder.n(i20, la0Var.getResourceProvider());
                            SpannableStringBuilder X2 = org.telegram.messenger.g0.X2(org.telegram.messenger.bd.M0(2131747312, null));
                            org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.a;
                            s1Var.U = X2;
                            alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131747308, null), new x90(la0Var, i162));
                            alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131747839, null), null);
                            la0Var.showDialog(s1Var);
                            return;
                        }
                        if (la0Var.l0() || i19 == 3) {
                            if ((la0Var.E0 != null && i19 != 3) || la0Var.C0 != null) {
                                if (la0Var.z0 == null || (z9Var = la0Var.F) == null) {
                                    return;
                                }
                                z9Var.b(((mb.b) org.telegram.messenger.t0.k()).newCameraUpdateLatLngZoom(new org.telegram.messenger.va(la0Var.z0.getLatitude(), la0Var.z0.getLongitude()), la0Var.F.e() - 4.0f));
                                return;
                            }
                            if (la0Var.z0 == null || la0Var.F == null) {
                                return;
                            }
                            ImageView imageView4 = la0Var.a;
                            int i21 = org.telegram.ui.ActionBar.k6.jj;
                            org.telegram.ui.ActionBar.r6.t(imageView4, i21, la0Var.getResourceProvider(), PorterDuff.Mode.MULTIPLY);
                            la0Var.a.setTag(Integer.valueOf(i21));
                            la0Var.Q.L(null);
                            la0Var.F0 = false;
                            la0Var.F.b(((mb.b) org.telegram.messenger.t0.k()).newCameraUpdateLatLng(new org.telegram.messenger.va(la0Var.z0.getLatitude(), la0Var.z0.getLongitude())));
                            return;
                        }
                        return;
                    default:
                        la0Var.q0 = -1L;
                        la0Var.F0 = true;
                        if (la0Var.r0()) {
                            la0Var.r0 = true;
                            la0Var.J0(false, true);
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
        org.telegram.ui.ActionBar.r6.t(this.c, org.telegram.ui.ActionBar.k6.ij, getResourceProvider(), mode);
        this.c.setScaleType(scaleType);
        this.c.setContentDescription(org.telegram.messenger.bd.M0(2131754847, null));
        this.X.addView(this.c, b8.mf.e(58, 58, 53));
        this.c.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.v90
            public final /* synthetic */ la0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                boolean z11;
                org.telegram.messenger.z9 z9Var;
                int i152 = i10;
                int i162 = 2;
                la0 la0Var = this.b;
                switch (i152) {
                    case 0:
                        if (la0Var.getParentActivity() == null || la0Var.z0 == null || !la0Var.l0() || la0Var.F == null) {
                            return;
                        }
                        gi.l3 l3Var = la0Var.s;
                        if (l3Var != null) {
                            l3Var.f(true);
                        }
                        org.telegram.messenger.hp.e1().edit().putInt("proximityhint", 3).commit();
                        org.telegram.messenger.kd h = la0Var.getLocationController().h(la0Var.m0);
                        if (la0Var.y) {
                            la0Var.x[0].d(1, true);
                        }
                        int i17 = 27;
                        if (h != null && h.f > 0) {
                            la0Var.c.setImageResource(R.drawable.msg_location_alert);
                            m2.t tVar = la0Var.L;
                            if (tVar != null) {
                                tVar.U0();
                                la0Var.L = null;
                            }
                            la0Var.y = true;
                            la0Var.w0().k(0L, 25, 0, null, new u90(la0Var, 3), new ly(27, la0Var, h));
                            return;
                        }
                        m2.t tVar2 = la0Var.L;
                        if (tVar2 == null) {
                            la0Var.m0(500);
                        } else {
                            try {
                                u7.f fVar = (u7.f) ((l8.a) tVar2.b).a;
                                Parcel O0 = fVar.O0(fVar.P0(), 6);
                                double readDouble = O0.readDouble();
                                O0.recycle();
                                la0Var.M = readDouble;
                            } catch (RemoteException e11) {
                                throw new androidx.car.app.j(e11);
                            }
                        }
                        TLRPC.User a22 = org.telegram.messenger.m5.E(la0Var.m0) ? la0Var.getMessagesController().a2(Long.valueOf(la0Var.m0)) : null;
                        Activity parentActivity = la0Var.getParentActivity();
                        x90 x90Var = new x90(la0Var, 4);
                        org.telegram.ui.Components.i41 i41Var = new org.telegram.ui.Components.i41(i17, la0Var, a22);
                        u90 u90Var = new u90(la0Var, 4);
                        org.telegram.ui.Components.kg0 kg0Var = new org.telegram.ui.Components.kg0(parentActivity);
                        kg0Var.a = null;
                        kg0Var.d = -1;
                        kg0Var.e = false;
                        kg0Var.f = false;
                        kg0Var.h = null;
                        kg0Var.n = new Rect();
                        new Paint();
                        kg0Var.x = true;
                        kg0Var.G = org.telegram.ui.Components.xq.h;
                        kg0Var.setWillNotDraw(false);
                        kg0Var.R = u90Var;
                        kg0Var.E = ViewConfiguration.get(parentActivity).getScaledTouchSlop();
                        Rect rect = new Rect();
                        Drawable mutate = parentActivity.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
                        org.telegram.ui.ActionBar.r6.y(kg0Var, mutate, org.telegram.ui.ActionBar.k6.h5, null, PorterDuff.Mode.MULTIPLY);
                        mutate.getPadding(rect);
                        int i18 = rect.left;
                        kg0Var.y = i18;
                        org.telegram.ui.Components.gg0 gg0Var = new org.telegram.ui.Components.gg0(kg0Var.getContext());
                        kg0Var.w = gg0Var;
                        gg0Var.setBackgroundDrawable(mutate);
                        gg0Var.setPadding(i18, (org.telegram.messenger.g0.L(8.0f) + rect.top) - 1, i18, 0);
                        gg0Var.setVisibility(4);
                        kg0Var.addView(gg0Var, 0, b8.mf.e(-1, -2, 80));
                        org.telegram.messenger.bd.l();
                        kg0Var.P = org.telegram.messenger.bd.g0.booleanValue();
                        kg0Var.N = a22;
                        kg0Var.J = x90Var;
                        org.telegram.ui.Components.cb0 cb0Var = new org.telegram.ui.Components.cb0(parentActivity, null);
                        kg0Var.H = cb0Var;
                        cb0Var.setTextOffset(org.telegram.messenger.g0.L(10.0f));
                        cb0Var.setItemCount(5);
                        org.telegram.ui.Components.cb0 cb0Var2 = new org.telegram.ui.Components.cb0(parentActivity, null);
                        kg0Var.I = cb0Var2;
                        cb0Var2.setItemCount(5);
                        cb0Var2.setTextOffset(-org.telegram.messenger.g0.L(10.0f));
                        org.telegram.ui.Components.hg0 hg0Var = new org.telegram.ui.Components.hg0(kg0Var, parentActivity);
                        kg0Var.Q = hg0Var;
                        hg0Var.setOrientation(1);
                        FrameLayout frameLayout2 = new FrameLayout(parentActivity);
                        hg0Var.addView(frameLayout2, b8.mf.t(-1, -2, 51, 22, 0, 0, 4));
                        TextView textView22 = new TextView(parentActivity);
                        textView22.setText(org.telegram.messenger.bd.M0(2131748764, null));
                        org.telegram.messenger.k5.n(textView22, org.telegram.ui.ActionBar.k6.j5, null, 1, 20.0f);
                        frameLayout2.addView(textView22, b8.mf.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
                        textView22.setOnTouchListener(new fi.a(20));
                        LinearLayout linearLayout = new LinearLayout(parentActivity);
                        linearLayout.setOrientation(0);
                        linearLayout.setWeightSum(1.0f);
                        hg0Var.addView(linearLayout, b8.mf.o(-1, -2));
                        System.currentTimeMillis();
                        FrameLayout frameLayout3 = new FrameLayout(parentActivity);
                        TextView textView3 = new TextView(parentActivity);
                        kg0Var.L = textView3;
                        org.telegram.ui.Components.ig0 ig0Var = new org.telegram.ui.Components.ig0(parentActivity);
                        kg0Var.K = ig0Var;
                        linearLayout.addView(cb0Var, b8.mf.l(0.5f, 0, org.telegram.messenger.hs.t4));
                        cb0Var.setFormatter(new org.telegram.ui.Components.fg0(kg0Var, 0));
                        cb0Var.setMinValue(0);
                        cb0Var.setMaxValue(10);
                        cb0Var.setWrapSelectorWheel(false);
                        cb0Var.setTextOffset(org.telegram.messenger.g0.L(20.0f));
                        org.telegram.ui.Components.fg0 fg0Var = new org.telegram.ui.Components.fg0(kg0Var, 1);
                        cb0Var.setOnValueChangedListener(fg0Var);
                        cb0Var2.setMinValue(0);
                        cb0Var2.setMaxValue(10);
                        cb0Var2.setWrapSelectorWheel(false);
                        cb0Var2.setTextOffset(-org.telegram.messenger.g0.L(20.0f));
                        linearLayout.addView(cb0Var2, b8.mf.l(0.5f, 0, org.telegram.messenger.hs.t4));
                        cb0Var2.setFormatter(new org.telegram.ui.Components.fg0(kg0Var, 2));
                        cb0Var2.setOnValueChangedListener(fg0Var);
                        cb0Var.setValue(0);
                        cb0Var2.setValue(6);
                        hg0Var.addView(frameLayout3, b8.mf.t(-1, 48, 83, 16, 15, 16, 16));
                        ig0Var.setPadding(org.telegram.messenger.g0.L(34.0f), 0, org.telegram.messenger.g0.L(34.0f), 0);
                        ig0Var.setGravity(17);
                        org.telegram.ui.ActionBar.r6.V(ig0Var, org.telegram.ui.ActionBar.k6.Gi, null);
                        ig0Var.setTextSize(1, 14.0f);
                        ig0Var.setMaxLines(2);
                        ig0Var.setTypeface(org.telegram.messenger.g0.o());
                        ig0Var.setBackgroundDrawable(org.telegram.ui.ActionBar.y5.f(org.telegram.ui.ActionBar.k6.Ci, 4.0f));
                        frameLayout3.addView(ig0Var, b8.mf.c(48.0f, -1));
                        ig0Var.setOnClickListener(new org.telegram.ui.Components.q2(25, kg0Var, i41Var));
                        textView3.setPadding(org.telegram.messenger.g0.L(34.0f), 0, org.telegram.messenger.g0.L(34.0f), 0);
                        textView3.setGravity(17);
                        org.telegram.ui.ActionBar.r6.V(textView3, org.telegram.ui.ActionBar.k6.q5, null);
                        textView3.setTextSize(1, 14.0f);
                        textView3.setAlpha(0.0f);
                        textView3.setScaleX(0.5f);
                        textView3.setScaleY(0.5f);
                        frameLayout3.addView(textView3, b8.mf.c(48.0f, -1));
                        gg0Var.addView(hg0Var, b8.mf.e(-1, -2, 51));
                        la0Var.O = kg0Var;
                        ((FrameLayout) la0Var.fragmentView).addView(kg0Var, b8.mf.c(-1.0f, -1));
                        org.telegram.ui.Components.kg0 kg0Var2 = la0Var.O;
                        kg0Var2.r = false;
                        AnimatorSet animatorSet = kg0Var2.s;
                        if (animatorSet != null) {
                            animatorSet.cancel();
                            kg0Var2.s = null;
                        }
                        org.telegram.ui.Components.gg0 gg0Var2 = kg0Var2.w;
                        Point point = org.telegram.messenger.g0.q;
                        gg0Var2.measure(View.MeasureSpec.makeMeasureSpec((kg0Var2.y * 2) + point.x, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(point.y, TLObject.FLAG_31));
                        if (kg0Var2.r) {
                            z11 = true;
                        } else {
                            gg0Var2.setVisibility(0);
                            if (kg0Var2.x) {
                                kg0Var2.setLayerType(2, null);
                            }
                            gg0Var2.setTranslationY(gg0Var2.getMeasuredHeight());
                            AnimatorSet animatorSet2 = new AnimatorSet();
                            kg0Var2.s = animatorSet2;
                            animatorSet2.playTogether(ObjectAnimator.ofFloat(gg0Var2, (Property<org.telegram.ui.Components.gg0, Float>) View.TRANSLATION_Y, 0.0f));
                            kg0Var2.s.setDuration(400L);
                            kg0Var2.s.setStartDelay(20L);
                            kg0Var2.s.setInterpolator(kg0Var2.G);
                            z11 = true;
                            kg0Var2.s.addListener(new org.telegram.ui.Components.jg0(kg0Var2, 1 == true ? 1 : 0));
                            org.telegram.messenger.hs.e().k(98, 512);
                            kg0Var2.s.start();
                        }
                        kg0Var2.c(z11);
                        return;
                    case 1:
                        try {
                            TLRPC.GeoPoint geoPoint = la0Var.E0.k.media.geo;
                            double d = geoPoint.lat;
                            double d10 = geoPoint._long;
                            la0Var.getParentActivity().startActivity(new Intent("android.intent.action.VIEW", Uri.parse("geo:" + d + "," + d10 + "?q=" + d + "," + d10)));
                            return;
                        } catch (Exception e12) {
                            org.telegram.messenger.a8.g(e12, true);
                            return;
                        }
                    case 2:
                        int i19 = la0Var.I0;
                        Activity parentActivity2 = la0Var.getParentActivity();
                        if (parentActivity2 != null && parentActivity2.checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") != 0) {
                            if (la0Var.getParentActivity() == null) {
                                return;
                            }
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(la0Var.getParentActivity());
                            int i20 = org.telegram.ui.ActionBar.k6.L5;
                            alertDialog$Builder.m(R.raw.permission_request_location, 72, la0Var.getThemedColor(i20), null);
                            alertDialog$Builder.n(i20, la0Var.getResourceProvider());
                            SpannableStringBuilder X2 = org.telegram.messenger.g0.X2(org.telegram.messenger.bd.M0(2131747312, null));
                            org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.a;
                            s1Var.U = X2;
                            alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131747308, null), new x90(la0Var, i162));
                            alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131747839, null), null);
                            la0Var.showDialog(s1Var);
                            return;
                        }
                        if (la0Var.l0() || i19 == 3) {
                            if ((la0Var.E0 != null && i19 != 3) || la0Var.C0 != null) {
                                if (la0Var.z0 == null || (z9Var = la0Var.F) == null) {
                                    return;
                                }
                                z9Var.b(((mb.b) org.telegram.messenger.t0.k()).newCameraUpdateLatLngZoom(new org.telegram.messenger.va(la0Var.z0.getLatitude(), la0Var.z0.getLongitude()), la0Var.F.e() - 4.0f));
                                return;
                            }
                            if (la0Var.z0 == null || la0Var.F == null) {
                                return;
                            }
                            ImageView imageView42 = la0Var.a;
                            int i21 = org.telegram.ui.ActionBar.k6.jj;
                            org.telegram.ui.ActionBar.r6.t(imageView42, i21, la0Var.getResourceProvider(), PorterDuff.Mode.MULTIPLY);
                            la0Var.a.setTag(Integer.valueOf(i21));
                            la0Var.Q.L(null);
                            la0Var.F0 = false;
                            la0Var.F.b(((mb.b) org.telegram.messenger.t0.k()).newCameraUpdateLatLng(new org.telegram.messenger.va(la0Var.z0.getLatitude(), la0Var.z0.getLongitude())));
                            return;
                        }
                        return;
                    default:
                        la0Var.q0 = -1L;
                        la0Var.F0 = true;
                        if (la0Var.r0()) {
                            la0Var.r0 = true;
                            la0Var.J0(false, true);
                            return;
                        }
                        return;
                }
            }
        });
        TLRPC.Chat M0 = org.telegram.messenger.m5.z(this.m0) ? getMessagesController().M0(Long.valueOf(-this.m0)) : null;
        org.telegram.messenger.zi ziVar5 = this.E0;
        if (ziVar5 != null && ziVar5.D3()) {
            org.telegram.messenger.zi ziVar6 = this.E0;
            int currentTime = getConnectionsManager().getCurrentTime();
            TLRPC.Message message2 = ziVar6.k;
            if (message2.date + org.telegram.messenger.zi.o1(message2).period > currentTime && (!org.telegram.messenger.t3.T(M0) || M0.megagroup)) {
                org.telegram.messenger.kd h = getLocationController().h(this.m0);
                if (h == null || h.f <= 0) {
                    if (org.telegram.messenger.m5.E(this.m0) && this.E0.Z0() == getUserConfig().e()) {
                        this.c.setVisibility(4);
                        this.c.setAlpha(0.0f);
                        this.c.setScaleX(0.4f);
                        this.c.setScaleY(0.4f);
                    }
                    this.c.setImageResource(R.drawable.msg_location_alert);
                } else {
                    this.c.setImageResource(R.drawable.msg_location_alert2);
                }
                gi.l3 l3Var = new gi.l3(context, 1);
                this.s = l3Var;
                l3Var.setLayerType(2, null);
                gi.l3 l3Var2 = this.s;
                l3Var2.d = 4000L;
                l3Var2.o(1.0f, -21.0f);
                this.s.setPadding(0, org.telegram.messenger.g0.L(4.0f), 0, 0);
                this.s.l(getBaseSimpleGlass().c);
                this.X.addView(this.s, b8.mf.d(-1, -2.0f, 51, 8.0f, 56.0f, 8.0f, 0.0f));
                LinearLayout linearLayout = new LinearLayout(context);
                this.e = linearLayout;
                linearLayout.setOrientation(1);
                this.e.setGravity(1);
                this.e.setPadding(0, org.telegram.messenger.g0.L(160.0f), 0, 0);
                this.e.setVisibility(8);
                ka0Var.addView(this.e, b8.mf.c(-1.0f, -1));
                this.e.setOnTouchListener(new fi.a(i12));
                ImageView imageView5 = new ImageView(context);
                this.f = imageView5;
                imageView5.setImageResource(R.drawable.location_empty);
                org.telegram.ui.ActionBar.r6.t(this.f, org.telegram.ui.ActionBar.k6.W5, getResourceProvider(), mode);
                this.e.addView(this.f, b8.mf.o(-2, -2));
                TextView textView3 = new TextView(context);
                this.h = textView3;
                int i17 = org.telegram.ui.ActionBar.k6.X5;
                org.telegram.ui.ActionBar.r6.V(textView3, i17, getResourceProvider());
                this.h.setGravity(17);
                this.h.setTypeface(org.telegram.messenger.g0.o());
                this.h.setTextSize(1, 17.0f);
                this.h.setText(org.telegram.messenger.bd.M0(2131748187, null));
                TextView f10 = org.telegram.messenger.camera.q.f(this.e, this.h, b8.mf.t(-2, -2, 17, 0, 11, 0, 0), context);
                this.n = f10;
                org.telegram.ui.ActionBar.r6.V(f10, i17, getResourceProvider());
                this.n.setGravity(17);
                this.n.setTextSize(1, 15.0f);
                this.n.setPadding(org.telegram.messenger.g0.L(40.0f), 0, org.telegram.messenger.g0.L(40.0f), 0);
                this.e.addView(this.n, b8.mf.t(-2, -2, 17, 0, 6, 0, 0));
                this.R = new xs(5, context, this);
                gh.g c2 = getBaseSimpleGlass().f.c(this.R, null, false);
                hh.e eVar = new hh.e(getResourceProvider());
                eVar.e = new gi.i8(14);
                eVar.f(-1, 553648127);
                eVar.e(0, 0);
                eVar.d(372454195, 0);
                float N = org.telegram.messenger.g0.N(8.0f);
                float f11 = -org.telegram.messenger.g0.N(0.6666667f);
                eVar.n = N;
                eVar.r = f11;
                eVar.f = org.telegram.messenger.g0.N(0.55f);
                eVar.h = 0.0f;
                c2.p(eVar);
                c2.s(org.telegram.messenger.g0.L(29.0f), org.telegram.messenger.g0.L(29.0f), 0.0f, 0.0f);
                c2.q(org.telegram.messenger.g0.L(12.0f));
                this.Z = c2;
                xs xsVar = this.R;
                da0 da0Var2 = new da0(this, context, this.I0, this.m0, getResourceProvider(), this.w, i13 != 8);
                this.Q = da0Var2;
                xsVar.setAdapter(da0Var2);
                xs xsVar2 = this.R;
                u4.b0 b0Var = new u4.b0(1, false);
                this.V = b0Var;
                xsVar2.setLayoutManager(b0Var);
                if (this.O0 == null) {
                    this.N0 = new org.telegram.ui.Cells.x3(context, this.resourceProvider);
                    fa0 fa0Var = new fa0(this, context, new org.telegram.ui.Components.os0(this), this, new ea0(this), getResourceProvider());
                    this.M0 = fa0Var;
                    org.telegram.ui.ActionBar.r6.i(i14, fa0Var, getResourceProvider());
                    this.M0.addView(this.N0, b8.mf.e(-1, 32, 55));
                    this.Q.Z = this.M0;
                    this.R.setOverScrollMode(2);
                    u4.k kVar = new u4.k();
                    z10 = false;
                    kVar.m = false;
                    kVar.C = false;
                    kVar.o(org.telegram.ui.Components.xq.h);
                    kVar.n(350L);
                    this.R.setItemAnimator(kVar);
                } else {
                    z10 = false;
                }
                this.Q.O(this.k0, z10);
                this.Q.getClass();
                this.R.setVerticalScrollBarEnabled(z10);
                ka0Var.addView(this.R, b8.mf.e(-1, -1, 51));
                ziVar = this.E0;
                if (ziVar != null && (message = ziVar.k) != null && (messageMedia = message.media) != null && !TextUtils.isEmpty(messageMedia.address)) {
                    da0 da0Var3 = this.Q;
                    da0Var3.I = this.E0.k.media.address;
                    da0Var3.Q();
                }
                this.R.setOnScrollListener(new ba0(this, i11));
                final int i18 = 0;
                ((u4.k) this.R.getItemAnimator()).C = false;
                this.R.setOnItemLongClickListener((org.telegram.ui.Components.hj0) new org.telegram.ui.Components.i41(25, this, context));
                this.R.setOnItemClickListener(new org.telegram.ui.Components.fj0(this) { // from class: org.telegram.ui.w90
                    public final /* synthetic */ la0 b;

                    {
                        this.b = this;
                    }

                    @Override // org.telegram.ui.Components.fj0
                    public final void f(int i19, View view) {
                        org.telegram.messenger.zi ziVar7;
                        TLRPC.TL_messageMediaVenue tL_messageMediaVenue;
                        int i20 = i18;
                        la0 la0Var = this.b;
                        switch (i20) {
                            case 0:
                                la0Var.q0 = -1L;
                                int i21 = la0Var.I0;
                                int i22 = 7;
                                if (i21 != 4) {
                                    if (i21 != 5) {
                                        if (i19 == 1 && (ziVar7 = la0Var.E0) != null && (!ziVar7.D3() || i21 == 6)) {
                                            org.telegram.messenger.z9 z9Var = la0Var.F;
                                            if (z9Var != null) {
                                                IMapsProvider k10 = org.telegram.messenger.t0.k();
                                                TLRPC.GeoPoint geoPoint = la0Var.E0.k.media.geo;
                                                z9Var.b(((mb.b) k10).newCameraUpdateLatLngZoom(new org.telegram.messenger.va(geoPoint.lat, geoPoint._long), la0Var.F.e() - 4.0f));
                                                break;
                                            }
                                        } else if (i19 == 1 && i21 != 2) {
                                            if (la0Var.H0 != null && la0Var.A0 != null) {
                                                TLRPC.TL_messageMediaGeo tL_messageMediaGeo = new TLRPC.TL_messageMediaGeo();
                                                TLRPC.TL_geoPoint tL_geoPoint = new TLRPC.TL_geoPoint();
                                                tL_messageMediaGeo.geo = tL_geoPoint;
                                                tL_geoPoint.lat = org.telegram.messenger.g0.b0(la0Var.A0.getLatitude());
                                                tL_messageMediaGeo.geo._long = org.telegram.messenger.g0.b0(la0Var.A0.getLongitude());
                                                la0Var.H0.d(tL_messageMediaGeo, la0Var.I0, true, 0, 0L);
                                                la0Var.finishFragment();
                                                break;
                                            }
                                        } else if (i21 != 2 || !la0Var.getLocationController().i(la0Var.m0) || la0Var.Q.d(i19) != 7) {
                                            if (i21 != 2 || !la0Var.getLocationController().i(la0Var.m0) || la0Var.Q.d(i19) != 6) {
                                                if ((i19 != 2 || i21 != 1) && ((i19 != 1 || i21 != 2) && (i19 != 3 || i21 != 3))) {
                                                    Object I = la0Var.Q.I(i19);
                                                    if (!(I instanceof TLRPC.TL_messageMediaVenue)) {
                                                        if (I instanceof ha0) {
                                                            ha0 ha0Var = (ha0) I;
                                                            la0Var.q0 = ha0Var.a;
                                                            if (la0Var.r0) {
                                                                la0Var.r0 = false;
                                                                la0Var.N0();
                                                            }
                                                            la0Var.F.b(((mb.b) org.telegram.messenger.t0.k()).newCameraUpdateLatLngZoom(ha0Var.e.a(), la0Var.F.e() - 4.0f));
                                                            break;
                                                        }
                                                    } else {
                                                        la0Var.H0.d((TLRPC.TL_messageMediaVenue) I, la0Var.I0, true, 0, 0L);
                                                        la0Var.finishFragment();
                                                        break;
                                                    }
                                                } else if (!la0Var.getLocationController().i(la0Var.m0)) {
                                                    la0Var.C0(false);
                                                    break;
                                                } else {
                                                    la0Var.getLocationController().k(la0Var.m0);
                                                    la0Var.Q.f();
                                                    la0Var.finishFragment();
                                                    break;
                                                }
                                            } else {
                                                la0Var.C0(la0Var.getLocationController().h(la0Var.m0).d != Integer.MAX_VALUE);
                                                break;
                                            }
                                        } else {
                                            la0Var.getLocationController().k(la0Var.m0);
                                            la0Var.Q.f();
                                            la0Var.finishFragment();
                                            break;
                                        }
                                    } else {
                                        org.telegram.messenger.z9 z9Var2 = la0Var.F;
                                        if (z9Var2 != null) {
                                            IMapsProvider k11 = org.telegram.messenger.t0.k();
                                            TLRPC.GeoPoint geoPoint2 = la0Var.C0.geo_point;
                                            z9Var2.b(((mb.b) k11).newCameraUpdateLatLngZoom(new org.telegram.messenger.va(geoPoint2.lat, geoPoint2._long), la0Var.F.e() - 4.0f));
                                            break;
                                        }
                                    }
                                } else if (i19 == 1 && (tL_messageMediaVenue = (TLRPC.TL_messageMediaVenue) la0Var.Q.I(i19)) != null) {
                                    if (la0Var.m0 != 0) {
                                        org.telegram.ui.ActionBar.s1[] s1VarArr = {new org.telegram.ui.ActionBar.s1(3, la0Var.getParentActivity(), null)};
                                        TLRPC.TL_channels_editLocation tL_channels_editLocation = new TLRPC.TL_channels_editLocation();
                                        tL_channels_editLocation.address = tL_messageMediaVenue.address;
                                        tL_channels_editLocation.channel = la0Var.getMessagesController().h1(-la0Var.m0);
                                        TLRPC.TL_inputGeoPoint tL_inputGeoPoint = new TLRPC.TL_inputGeoPoint();
                                        tL_channels_editLocation.geo_point = tL_inputGeoPoint;
                                        TLRPC.GeoPoint geoPoint3 = tL_messageMediaVenue.geo;
                                        tL_inputGeoPoint.lat = geoPoint3.lat;
                                        tL_inputGeoPoint._long = geoPoint3._long;
                                        s1VarArr[0].setOnCancelListener(new ci.b0(la0Var, la0Var.getConnectionsManager().sendRequest(tL_channels_editLocation, new y9(la0Var, s1VarArr, tL_messageMediaVenue, 19)), i22));
                                        la0Var.showDialog(s1VarArr[0]);
                                        break;
                                    } else {
                                        la0Var.H0.d(tL_messageMediaVenue, 4, true, 0, 0L);
                                        la0Var.finishFragment();
                                        break;
                                    }
                                }
                                break;
                            default:
                                la0.e0(la0Var, i19);
                                break;
                        }
                    }
                });
                this.Q.P(this.J0);
                ka0Var.addView(this.P, ka0Var.indexOfChild(this.R), b8.mf.e(-1, -1, 51));
                org.telegram.messenger.sa onCreateMapView = ((mb.b) org.telegram.messenger.t0.k()).onCreateMapView(context);
                this.H = onCreateMapView;
                ((ai.c0) ((b8.ke) onCreateMapView).b).setAlpha(0.0f);
                org.telegram.messenger.sa saVar = this.H;
                b8.ke keVar = (b8.ke) saVar;
                keVar.c = new x90(this, 0);
                keVar.d = new x90(this, i11);
                keVar.e = new u90(this, 7);
                new Thread(new y90(this, saVar, i11)).start();
                ziVar2 = this.E0;
                if (ziVar2 != null && this.C0 == null) {
                    if (M0 != null && i13 == 4 && this.m0 != 0) {
                        FrameLayout frameLayout2 = new FrameLayout(context);
                        frameLayout2.setBackgroundResource(R.drawable.livepin);
                        this.P.addView(frameLayout2, b8.mf.e(62, 76, 49));
                        org.telegram.ui.Components.k9 k9Var = new org.telegram.ui.Components.k9(context);
                        k9Var.setRoundRadius(org.telegram.messenger.g0.L(26.0f));
                        k9Var.e(M0, new org.telegram.ui.Components.u8(M0));
                        frameLayout2.addView(k9Var, b8.mf.d(52, 52.0f, 51, 5.0f, 5.0f, 0.0f, 0.0f));
                        this.U = frameLayout2;
                        frameLayout2.setTag(1);
                    }
                    if (this.U == null) {
                        ImageView e11 = org.telegram.messenger.camera.q.e(context, R.drawable.map_pin2);
                        this.P.addView(e11, b8.mf.e(28, 48, 49));
                        this.U = e11;
                    }
                    org.telegram.ui.Components.tj0 tj0Var2 = new org.telegram.ui.Components.tj0(context, null);
                    this.S = tj0Var2;
                    tj0Var2.setVisibility(8);
                    this.S.setLayoutManager(new u4.b0(1, false));
                    org.telegram.ui.Components.sk skVar2 = new org.telegram.ui.Components.sk(this, context, getResourceProvider(), i13 == 8);
                    this.T = skVar2;
                    skVar2.n = new x90(this, 6);
                    ka0Var.addView(this.S, b8.mf.e(-1, -1, 51));
                    this.S.setOnScrollListener(new ba0(this, 0));
                    this.S.setOnItemClickListener(new org.telegram.ui.Components.fj0(this) { // from class: org.telegram.ui.w90
                        public final /* synthetic */ la0 b;

                        {
                            this.b = this;
                        }

                        @Override // org.telegram.ui.Components.fj0
                        public final void f(int i19, View view) {
                            org.telegram.messenger.zi ziVar7;
                            TLRPC.TL_messageMediaVenue tL_messageMediaVenue;
                            int i20 = i11;
                            la0 la0Var = this.b;
                            switch (i20) {
                                case 0:
                                    la0Var.q0 = -1L;
                                    int i21 = la0Var.I0;
                                    int i22 = 7;
                                    if (i21 != 4) {
                                        if (i21 != 5) {
                                            if (i19 == 1 && (ziVar7 = la0Var.E0) != null && (!ziVar7.D3() || i21 == 6)) {
                                                org.telegram.messenger.z9 z9Var = la0Var.F;
                                                if (z9Var != null) {
                                                    IMapsProvider k10 = org.telegram.messenger.t0.k();
                                                    TLRPC.GeoPoint geoPoint = la0Var.E0.k.media.geo;
                                                    z9Var.b(((mb.b) k10).newCameraUpdateLatLngZoom(new org.telegram.messenger.va(geoPoint.lat, geoPoint._long), la0Var.F.e() - 4.0f));
                                                    break;
                                                }
                                            } else if (i19 == 1 && i21 != 2) {
                                                if (la0Var.H0 != null && la0Var.A0 != null) {
                                                    TLRPC.TL_messageMediaGeo tL_messageMediaGeo = new TLRPC.TL_messageMediaGeo();
                                                    TLRPC.TL_geoPoint tL_geoPoint = new TLRPC.TL_geoPoint();
                                                    tL_messageMediaGeo.geo = tL_geoPoint;
                                                    tL_geoPoint.lat = org.telegram.messenger.g0.b0(la0Var.A0.getLatitude());
                                                    tL_messageMediaGeo.geo._long = org.telegram.messenger.g0.b0(la0Var.A0.getLongitude());
                                                    la0Var.H0.d(tL_messageMediaGeo, la0Var.I0, true, 0, 0L);
                                                    la0Var.finishFragment();
                                                    break;
                                                }
                                            } else if (i21 != 2 || !la0Var.getLocationController().i(la0Var.m0) || la0Var.Q.d(i19) != 7) {
                                                if (i21 != 2 || !la0Var.getLocationController().i(la0Var.m0) || la0Var.Q.d(i19) != 6) {
                                                    if ((i19 != 2 || i21 != 1) && ((i19 != 1 || i21 != 2) && (i19 != 3 || i21 != 3))) {
                                                        Object I = la0Var.Q.I(i19);
                                                        if (!(I instanceof TLRPC.TL_messageMediaVenue)) {
                                                            if (I instanceof ha0) {
                                                                ha0 ha0Var = (ha0) I;
                                                                la0Var.q0 = ha0Var.a;
                                                                if (la0Var.r0) {
                                                                    la0Var.r0 = false;
                                                                    la0Var.N0();
                                                                }
                                                                la0Var.F.b(((mb.b) org.telegram.messenger.t0.k()).newCameraUpdateLatLngZoom(ha0Var.e.a(), la0Var.F.e() - 4.0f));
                                                                break;
                                                            }
                                                        } else {
                                                            la0Var.H0.d((TLRPC.TL_messageMediaVenue) I, la0Var.I0, true, 0, 0L);
                                                            la0Var.finishFragment();
                                                            break;
                                                        }
                                                    } else if (!la0Var.getLocationController().i(la0Var.m0)) {
                                                        la0Var.C0(false);
                                                        break;
                                                    } else {
                                                        la0Var.getLocationController().k(la0Var.m0);
                                                        la0Var.Q.f();
                                                        la0Var.finishFragment();
                                                        break;
                                                    }
                                                } else {
                                                    la0Var.C0(la0Var.getLocationController().h(la0Var.m0).d != Integer.MAX_VALUE);
                                                    break;
                                                }
                                            } else {
                                                la0Var.getLocationController().k(la0Var.m0);
                                                la0Var.Q.f();
                                                la0Var.finishFragment();
                                                break;
                                            }
                                        } else {
                                            org.telegram.messenger.z9 z9Var2 = la0Var.F;
                                            if (z9Var2 != null) {
                                                IMapsProvider k11 = org.telegram.messenger.t0.k();
                                                TLRPC.GeoPoint geoPoint2 = la0Var.C0.geo_point;
                                                z9Var2.b(((mb.b) k11).newCameraUpdateLatLngZoom(new org.telegram.messenger.va(geoPoint2.lat, geoPoint2._long), la0Var.F.e() - 4.0f));
                                                break;
                                            }
                                        }
                                    } else if (i19 == 1 && (tL_messageMediaVenue = (TLRPC.TL_messageMediaVenue) la0Var.Q.I(i19)) != null) {
                                        if (la0Var.m0 != 0) {
                                            org.telegram.ui.ActionBar.s1[] s1VarArr = {new org.telegram.ui.ActionBar.s1(3, la0Var.getParentActivity(), null)};
                                            TLRPC.TL_channels_editLocation tL_channels_editLocation = new TLRPC.TL_channels_editLocation();
                                            tL_channels_editLocation.address = tL_messageMediaVenue.address;
                                            tL_channels_editLocation.channel = la0Var.getMessagesController().h1(-la0Var.m0);
                                            TLRPC.TL_inputGeoPoint tL_inputGeoPoint = new TLRPC.TL_inputGeoPoint();
                                            tL_channels_editLocation.geo_point = tL_inputGeoPoint;
                                            TLRPC.GeoPoint geoPoint3 = tL_messageMediaVenue.geo;
                                            tL_inputGeoPoint.lat = geoPoint3.lat;
                                            tL_inputGeoPoint._long = geoPoint3._long;
                                            s1VarArr[0].setOnCancelListener(new ci.b0(la0Var, la0Var.getConnectionsManager().sendRequest(tL_channels_editLocation, new y9(la0Var, s1VarArr, tL_messageMediaVenue, 19)), i22));
                                            la0Var.showDialog(s1VarArr[0]);
                                            break;
                                        } else {
                                            la0Var.H0.d(tL_messageMediaVenue, 4, true, 0, 0L);
                                            la0Var.finishFragment();
                                            break;
                                        }
                                    }
                                    break;
                                default:
                                    la0.e0(la0Var, i19);
                                    break;
                            }
                        }
                    });
                } else if ((ziVar2 != null && !ziVar2.D3()) || this.C0 != null) {
                    tL_channelLocation = this.C0;
                    if (tL_channelLocation != null) {
                        this.Q.P = tL_channelLocation;
                    } else {
                        org.telegram.messenger.zi ziVar7 = this.E0;
                        if (ziVar7 != null) {
                            da0 da0Var4 = this.Q;
                            da0Var4.O = ziVar7;
                            da0Var4.f();
                        }
                    }
                }
                ziVar3 = this.E0;
                if (ziVar3 != null && i13 == 6) {
                    da0 da0Var5 = this.Q;
                    da0Var5.O = ziVar3;
                    da0Var5.f();
                }
                for (i3 = 0; i3 < 2; i3++) {
                    UndoView undoView = new UndoView(context);
                    UndoView[] undoViewArr = this.x;
                    undoViewArr[i3] = undoView;
                    undoView.setAdditionalTranslationY(org.telegram.messenger.g0.L(10.0f));
                    undoViewArr[i3].setTranslationZ(org.telegram.messenger.g0.L(5.0f));
                    FrameLayout.LayoutParams d = b8.mf.d(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f);
                    d.bottomMargin = org.telegram.messenger.g0.L(29.0f) + this.h0 + d.bottomMargin;
                    this.P.addView(undoViewArr[i3], d);
                }
                if (this.E0 == null && this.C0 == null && this.D0 != null) {
                    this.F0 = true;
                    ImageView imageView6 = this.a;
                    int i19 = org.telegram.ui.ActionBar.k6.ij;
                    org.telegram.ui.ActionBar.r6.t(imageView6, i19, getResourceProvider(), PorterDuff.Mode.MULTIPLY);
                    this.a.setTag(Integer.valueOf(i19));
                }
                baseSimpleGlass = getBaseSimpleGlass();
                View view = new View(context);
                this.navigationBarFadeView = view;
                view.setBackground(baseSimpleGlass.b(view));
                ka0Var.addView(this.navigationBarFadeView, b8.mf.e(-1, 0, 80));
                View view2 = this.simpleActionBar;
                org.telegram.ui.ActionBar.e6 resourceProvider2 = getResourceProvider();
                baseSimpleGlass.l = ka0Var;
                baseSimpleGlass.m = null;
                baseSimpleGlass.g(ka0Var, view2, resourceProvider2);
                baseSimpleGlass.n = new na(this, i11);
                this.simpleActionBar.setBackground(null);
                this.glassEngine.b(this.R);
                tj0Var = this.S;
                if (tj0Var != null) {
                    this.glassEngine.b(tj0Var);
                }
                if (baseSimpleGlass.g != null && org.telegram.messenger.az.f()) {
                    this.e0 = new org.telegram.ui.Components.c80(new u90(this, 2));
                }
                j0();
                L0();
                return this.fragmentView;
            }
        }
        this.c.setVisibility(8);
        this.c.setImageResource(R.drawable.msg_location_alert);
        gi.l3 l3Var3 = new gi.l3(context, 1);
        this.s = l3Var3;
        l3Var3.setLayerType(2, null);
        gi.l3 l3Var22 = this.s;
        l3Var22.d = 4000L;
        l3Var22.o(1.0f, -21.0f);
        this.s.setPadding(0, org.telegram.messenger.g0.L(4.0f), 0, 0);
        this.s.l(getBaseSimpleGlass().c);
        this.X.addView(this.s, b8.mf.d(-1, -2.0f, 51, 8.0f, 56.0f, 8.0f, 0.0f));
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.e = linearLayout2;
        linearLayout2.setOrientation(1);
        this.e.setGravity(1);
        this.e.setPadding(0, org.telegram.messenger.g0.L(160.0f), 0, 0);
        this.e.setVisibility(8);
        ka0Var.addView(this.e, b8.mf.c(-1.0f, -1));
        this.e.setOnTouchListener(new fi.a(i12));
        ImageView imageView52 = new ImageView(context);
        this.f = imageView52;
        imageView52.setImageResource(R.drawable.location_empty);
        org.telegram.ui.ActionBar.r6.t(this.f, org.telegram.ui.ActionBar.k6.W5, getResourceProvider(), mode);
        this.e.addView(this.f, b8.mf.o(-2, -2));
        TextView textView32 = new TextView(context);
        this.h = textView32;
        int i172 = org.telegram.ui.ActionBar.k6.X5;
        org.telegram.ui.ActionBar.r6.V(textView32, i172, getResourceProvider());
        this.h.setGravity(17);
        this.h.setTypeface(org.telegram.messenger.g0.o());
        this.h.setTextSize(1, 17.0f);
        this.h.setText(org.telegram.messenger.bd.M0(2131748187, null));
        TextView f102 = org.telegram.messenger.camera.q.f(this.e, this.h, b8.mf.t(-2, -2, 17, 0, 11, 0, 0), context);
        this.n = f102;
        org.telegram.ui.ActionBar.r6.V(f102, i172, getResourceProvider());
        this.n.setGravity(17);
        this.n.setTextSize(1, 15.0f);
        this.n.setPadding(org.telegram.messenger.g0.L(40.0f), 0, org.telegram.messenger.g0.L(40.0f), 0);
        this.e.addView(this.n, b8.mf.t(-2, -2, 17, 0, 6, 0, 0));
        this.R = new xs(5, context, this);
        gh.g c22 = getBaseSimpleGlass().f.c(this.R, null, false);
        hh.e eVar2 = new hh.e(getResourceProvider());
        eVar2.e = new gi.i8(14);
        eVar2.f(-1, 553648127);
        eVar2.e(0, 0);
        eVar2.d(372454195, 0);
        float N2 = org.telegram.messenger.g0.N(8.0f);
        float f112 = -org.telegram.messenger.g0.N(0.6666667f);
        eVar2.n = N2;
        eVar2.r = f112;
        eVar2.f = org.telegram.messenger.g0.N(0.55f);
        eVar2.h = 0.0f;
        c22.p(eVar2);
        c22.s(org.telegram.messenger.g0.L(29.0f), org.telegram.messenger.g0.L(29.0f), 0.0f, 0.0f);
        c22.q(org.telegram.messenger.g0.L(12.0f));
        this.Z = c22;
        xs xsVar3 = this.R;
        da0 da0Var22 = new da0(this, context, this.I0, this.m0, getResourceProvider(), this.w, i13 != 8);
        this.Q = da0Var22;
        xsVar3.setAdapter(da0Var22);
        xs xsVar22 = this.R;
        u4.b0 b0Var2 = new u4.b0(1, false);
        this.V = b0Var2;
        xsVar22.setLayoutManager(b0Var2);
        if (this.O0 == null) {
        }
        this.Q.O(this.k0, z10);
        this.Q.getClass();
        this.R.setVerticalScrollBarEnabled(z10);
        ka0Var.addView(this.R, b8.mf.e(-1, -1, 51));
        ziVar = this.E0;
        if (ziVar != null) {
            da0 da0Var32 = this.Q;
            da0Var32.I = this.E0.k.media.address;
            da0Var32.Q();
        }
        this.R.setOnScrollListener(new ba0(this, i11));
        final int i182 = 0;
        ((u4.k) this.R.getItemAnimator()).C = false;
        this.R.setOnItemLongClickListener((org.telegram.ui.Components.hj0) new org.telegram.ui.Components.i41(25, this, context));
        this.R.setOnItemClickListener(new org.telegram.ui.Components.fj0(this) { // from class: org.telegram.ui.w90
            public final /* synthetic */ la0 b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.Components.fj0
            public final void f(int i192, View view3) {
                org.telegram.messenger.zi ziVar72;
                TLRPC.TL_messageMediaVenue tL_messageMediaVenue;
                int i20 = i182;
                la0 la0Var = this.b;
                switch (i20) {
                    case 0:
                        la0Var.q0 = -1L;
                        int i21 = la0Var.I0;
                        int i22 = 7;
                        if (i21 != 4) {
                            if (i21 != 5) {
                                if (i192 == 1 && (ziVar72 = la0Var.E0) != null && (!ziVar72.D3() || i21 == 6)) {
                                    org.telegram.messenger.z9 z9Var = la0Var.F;
                                    if (z9Var != null) {
                                        IMapsProvider k10 = org.telegram.messenger.t0.k();
                                        TLRPC.GeoPoint geoPoint = la0Var.E0.k.media.geo;
                                        z9Var.b(((mb.b) k10).newCameraUpdateLatLngZoom(new org.telegram.messenger.va(geoPoint.lat, geoPoint._long), la0Var.F.e() - 4.0f));
                                        break;
                                    }
                                } else if (i192 == 1 && i21 != 2) {
                                    if (la0Var.H0 != null && la0Var.A0 != null) {
                                        TLRPC.TL_messageMediaGeo tL_messageMediaGeo = new TLRPC.TL_messageMediaGeo();
                                        TLRPC.TL_geoPoint tL_geoPoint = new TLRPC.TL_geoPoint();
                                        tL_messageMediaGeo.geo = tL_geoPoint;
                                        tL_geoPoint.lat = org.telegram.messenger.g0.b0(la0Var.A0.getLatitude());
                                        tL_messageMediaGeo.geo._long = org.telegram.messenger.g0.b0(la0Var.A0.getLongitude());
                                        la0Var.H0.d(tL_messageMediaGeo, la0Var.I0, true, 0, 0L);
                                        la0Var.finishFragment();
                                        break;
                                    }
                                } else if (i21 != 2 || !la0Var.getLocationController().i(la0Var.m0) || la0Var.Q.d(i192) != 7) {
                                    if (i21 != 2 || !la0Var.getLocationController().i(la0Var.m0) || la0Var.Q.d(i192) != 6) {
                                        if ((i192 != 2 || i21 != 1) && ((i192 != 1 || i21 != 2) && (i192 != 3 || i21 != 3))) {
                                            Object I = la0Var.Q.I(i192);
                                            if (!(I instanceof TLRPC.TL_messageMediaVenue)) {
                                                if (I instanceof ha0) {
                                                    ha0 ha0Var = (ha0) I;
                                                    la0Var.q0 = ha0Var.a;
                                                    if (la0Var.r0) {
                                                        la0Var.r0 = false;
                                                        la0Var.N0();
                                                    }
                                                    la0Var.F.b(((mb.b) org.telegram.messenger.t0.k()).newCameraUpdateLatLngZoom(ha0Var.e.a(), la0Var.F.e() - 4.0f));
                                                    break;
                                                }
                                            } else {
                                                la0Var.H0.d((TLRPC.TL_messageMediaVenue) I, la0Var.I0, true, 0, 0L);
                                                la0Var.finishFragment();
                                                break;
                                            }
                                        } else if (!la0Var.getLocationController().i(la0Var.m0)) {
                                            la0Var.C0(false);
                                            break;
                                        } else {
                                            la0Var.getLocationController().k(la0Var.m0);
                                            la0Var.Q.f();
                                            la0Var.finishFragment();
                                            break;
                                        }
                                    } else {
                                        la0Var.C0(la0Var.getLocationController().h(la0Var.m0).d != Integer.MAX_VALUE);
                                        break;
                                    }
                                } else {
                                    la0Var.getLocationController().k(la0Var.m0);
                                    la0Var.Q.f();
                                    la0Var.finishFragment();
                                    break;
                                }
                            } else {
                                org.telegram.messenger.z9 z9Var2 = la0Var.F;
                                if (z9Var2 != null) {
                                    IMapsProvider k11 = org.telegram.messenger.t0.k();
                                    TLRPC.GeoPoint geoPoint2 = la0Var.C0.geo_point;
                                    z9Var2.b(((mb.b) k11).newCameraUpdateLatLngZoom(new org.telegram.messenger.va(geoPoint2.lat, geoPoint2._long), la0Var.F.e() - 4.0f));
                                    break;
                                }
                            }
                        } else if (i192 == 1 && (tL_messageMediaVenue = (TLRPC.TL_messageMediaVenue) la0Var.Q.I(i192)) != null) {
                            if (la0Var.m0 != 0) {
                                org.telegram.ui.ActionBar.s1[] s1VarArr = {new org.telegram.ui.ActionBar.s1(3, la0Var.getParentActivity(), null)};
                                TLRPC.TL_channels_editLocation tL_channels_editLocation = new TLRPC.TL_channels_editLocation();
                                tL_channels_editLocation.address = tL_messageMediaVenue.address;
                                tL_channels_editLocation.channel = la0Var.getMessagesController().h1(-la0Var.m0);
                                TLRPC.TL_inputGeoPoint tL_inputGeoPoint = new TLRPC.TL_inputGeoPoint();
                                tL_channels_editLocation.geo_point = tL_inputGeoPoint;
                                TLRPC.GeoPoint geoPoint3 = tL_messageMediaVenue.geo;
                                tL_inputGeoPoint.lat = geoPoint3.lat;
                                tL_inputGeoPoint._long = geoPoint3._long;
                                s1VarArr[0].setOnCancelListener(new ci.b0(la0Var, la0Var.getConnectionsManager().sendRequest(tL_channels_editLocation, new y9(la0Var, s1VarArr, tL_messageMediaVenue, 19)), i22));
                                la0Var.showDialog(s1VarArr[0]);
                                break;
                            } else {
                                la0Var.H0.d(tL_messageMediaVenue, 4, true, 0, 0L);
                                la0Var.finishFragment();
                                break;
                            }
                        }
                        break;
                    default:
                        la0.e0(la0Var, i192);
                        break;
                }
            }
        });
        this.Q.P(this.J0);
        ka0Var.addView(this.P, ka0Var.indexOfChild(this.R), b8.mf.e(-1, -1, 51));
        org.telegram.messenger.sa onCreateMapView2 = ((mb.b) org.telegram.messenger.t0.k()).onCreateMapView(context);
        this.H = onCreateMapView2;
        ((ai.c0) ((b8.ke) onCreateMapView2).b).setAlpha(0.0f);
        org.telegram.messenger.sa saVar2 = this.H;
        b8.ke keVar2 = (b8.ke) saVar2;
        keVar2.c = new x90(this, 0);
        keVar2.d = new x90(this, i11);
        keVar2.e = new u90(this, 7);
        new Thread(new y90(this, saVar2, i11)).start();
        ziVar2 = this.E0;
        if (ziVar2 != null) {
        }
        if (ziVar2 != null) {
            tL_channelLocation = this.C0;
            if (tL_channelLocation != null) {
            }
            ziVar3 = this.E0;
            if (ziVar3 != null) {
                da0 da0Var52 = this.Q;
                da0Var52.O = ziVar3;
                da0Var52.f();
            }
            while (i3 < 2) {
            }
            if (this.E0 == null) {
                this.F0 = true;
                ImageView imageView62 = this.a;
                int i192 = org.telegram.ui.ActionBar.k6.ij;
                org.telegram.ui.ActionBar.r6.t(imageView62, i192, getResourceProvider(), PorterDuff.Mode.MULTIPLY);
                this.a.setTag(Integer.valueOf(i192));
            }
            baseSimpleGlass = getBaseSimpleGlass();
            View view3 = new View(context);
            this.navigationBarFadeView = view3;
            view3.setBackground(baseSimpleGlass.b(view3));
            ka0Var.addView(this.navigationBarFadeView, b8.mf.e(-1, 0, 80));
            View view22 = this.simpleActionBar;
            org.telegram.ui.ActionBar.e6 resourceProvider22 = getResourceProvider();
            baseSimpleGlass.l = ka0Var;
            baseSimpleGlass.m = null;
            baseSimpleGlass.g(ka0Var, view22, resourceProvider22);
            baseSimpleGlass.n = new na(this, i11);
            this.simpleActionBar.setBackground(null);
            this.glassEngine.b(this.R);
            tj0Var = this.S;
            if (tj0Var != null) {
            }
            if (baseSimpleGlass.g != null) {
                this.e0 = new org.telegram.ui.Components.c80(new u90(this, 2));
            }
            j0();
            L0();
            return this.fragmentView;
        }
        tL_channelLocation = this.C0;
        if (tL_channelLocation != null) {
        }
        ziVar3 = this.E0;
        if (ziVar3 != null) {
        }
        while (i3 < 2) {
        }
        if (this.E0 == null) {
        }
        baseSimpleGlass = getBaseSimpleGlass();
        View view32 = new View(context);
        this.navigationBarFadeView = view32;
        view32.setBackground(baseSimpleGlass.b(view32));
        ka0Var.addView(this.navigationBarFadeView, b8.mf.e(-1, 0, 80));
        View view222 = this.simpleActionBar;
        org.telegram.ui.ActionBar.e6 resourceProvider222 = getResourceProvider();
        baseSimpleGlass.l = ka0Var;
        baseSimpleGlass.m = null;
        baseSimpleGlass.g(ka0Var, view222, resourceProvider222);
        baseSimpleGlass.n = new na(this, i11);
        this.simpleActionBar.setBackground(null);
        this.glassEngine.b(this.R);
        tj0Var = this.S;
        if (tj0Var != null) {
        }
        if (baseSimpleGlass.g != null) {
        }
        j0();
        L0();
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.cs
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        da0 da0Var;
        da0 da0Var2;
        if (i3 == org.telegram.messenger.hs.t) {
            removeSelfFromStack(true);
            return;
        }
        if (i3 == org.telegram.messenger.hs.v4) {
            this.k0 = false;
            da0 da0Var3 = this.Q;
            if (da0Var3 != null) {
                da0Var3.O(false, false);
            }
            org.telegram.messenger.z9 z9Var = this.F;
            if (z9Var != null) {
                try {
                    z9Var.k(true);
                    return;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return;
                }
            }
            return;
        }
        if (i3 == org.telegram.messenger.hs.w4) {
            this.k0 = true;
            da0 da0Var4 = this.Q;
            if (da0Var4 != null) {
                da0Var4.O(true, false);
                return;
            }
            return;
        }
        if (i3 == org.telegram.messenger.hs.D4) {
            da0 da0Var5 = this.Q;
            if (da0Var5 != null) {
                da0Var5.f();
            }
            N0();
            return;
        }
        if (i3 == 1) {
            if (((Boolean) objArr[2]).booleanValue() || ((Long) objArr[0]).longValue() != this.m0 || this.E0 == null) {
                return;
            }
            ArrayList arrayList = (ArrayList) objArr[1];
            boolean z10 = false;
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                org.telegram.messenger.zi ziVar = (org.telegram.messenger.zi) arrayList.get(i11);
                if (ziVar.D3()) {
                    i0(ziVar.k);
                    z10 = true;
                } else {
                    TLRPC.Message message = ziVar.k;
                    if ((message.action instanceof TLRPC.TL_messageActionGeoProximityReached) && org.telegram.messenger.m5.E(org.telegram.messenger.zi.B0(message))) {
                        this.c.setImageResource(R.drawable.msg_location_alert);
                        m2.t tVar = this.L;
                        if (tVar != null) {
                            tVar.U0();
                            this.L = null;
                        }
                    }
                }
            }
            if (!z10 || (da0Var2 = this.Q) == null) {
                return;
            }
            da0Var2.N(this.o0);
            return;
        }
        if (i3 == org.telegram.messenger.hs.m0) {
            long longValue = ((Long) objArr[0]).longValue();
            if (longValue != this.m0 || this.E0 == null) {
                return;
            }
            ArrayList arrayList2 = (ArrayList) objArr[1];
            boolean z11 = false;
            for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                org.telegram.messenger.zi ziVar2 = (org.telegram.messenger.zi) arrayList2.get(i12);
                if (ziVar2.D3()) {
                    TLRPC.Message message2 = ziVar2.k;
                    TLRPC.Peer peer = message2.from_id;
                    ha0 ha0Var = (ha0) this.p0.f(peer != null ? org.telegram.messenger.zi.C1(peer) : org.telegram.messenger.zi.B0(message2));
                    if (ha0Var != null) {
                        org.telegram.messenger.kd h = getLocationController().h(longValue);
                        if (h == null || h.b != ziVar2.f1()) {
                            TLRPC.Message message3 = ziVar2.k;
                            ha0Var.b = message3;
                            TLRPC.GeoPoint geoPoint = message3.media.geo;
                            org.telegram.messenger.va vaVar = new org.telegram.messenger.va(geoPoint.lat, geoPoint._long);
                            ha0Var.e.b(vaVar);
                            if (this.q0 == ha0Var.a) {
                                this.F.b(((mb.b) org.telegram.messenger.t0.k()).newCameraUpdateLatLng(ha0Var.e.a()));
                            }
                            org.telegram.messenger.y9 y9Var = ha0Var.f;
                            if (y9Var != null) {
                                y9Var.a();
                                ha0Var.f.b(vaVar);
                                int i13 = ziVar2.k.media.heading;
                                if (i13 != 0) {
                                    ha0Var.f.c(i13);
                                    if (!ha0Var.g) {
                                        ha0Var.f.a.a(b8.wd.b(R.drawable.map_pin_cone2));
                                        ha0Var.g = true;
                                    }
                                } else if (ha0Var.g) {
                                    ha0Var.f.c(0);
                                    ha0Var.f.a.a(b8.wd.b(R.drawable.map_pin_circle));
                                    ha0Var.g = false;
                                }
                            }
                        }
                        z11 = true;
                    }
                }
            }
            if (z11 && (da0Var = this.Q) != null) {
                da0Var.f();
                org.telegram.ui.Components.kg0 kg0Var = this.O;
                if (kg0Var != null) {
                    kg0Var.c(true);
                }
            }
            if (z11) {
                N0();
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final boolean finishFragment(boolean z10) {
        if (A0()) {
            return false;
        }
        return super.finishFragment(z10);
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        int i3 = 0;
        while (true) {
            UndoView[] undoViewArr = this.x;
            if (i3 >= undoViewArr.length) {
                break;
            }
            arrayList.add(new org.telegram.ui.ActionBar.t6(undoViewArr[i3], 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.tj));
            i3++;
        }
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.R, 32768, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.h5));
        org.telegram.ui.ActionBar.f5 f5Var = this.r;
        arrayList.add(new org.telegram.ui.ActionBar.t6(f5Var != null ? f5Var.getSearchField() : null, 16777216, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.j5));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.gj));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.hj));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.mj));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.R, 393216, new Class[]{org.telegram.ui.Cells.p6.class}, new String[]{"imageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.bj));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.R, 393216, new Class[]{org.telegram.ui.Cells.p6.class}, new String[]{"imageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.ej));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.R, 393248, new Class[]{org.telegram.ui.Cells.p6.class}, new String[]{"imageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.aj));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.R, 393248, new Class[]{org.telegram.ui.Cells.p6.class}, new String[]{"imageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.dj));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.R, 196608, new Class[]{org.telegram.ui.Cells.w4.class}, new String[]{"frameLayout"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Ei));
        return arrayList;
    }

    public final ha0 i0(TLRPC.Message message) {
        Location location;
        TLRPC.GeoPoint geoPoint = message.media.geo;
        double d = geoPoint.lat;
        double d10 = geoPoint._long;
        long C1 = org.telegram.messenger.zi.C1(message.from_id);
        a0.h hVar = this.p0;
        ha0 ha0Var = (ha0) hVar.f(C1);
        if (ha0Var == null) {
            ha0Var = new ha0();
            ha0Var.b = message;
            if (message.from_id instanceof TLRPC.TL_peerUser) {
                ha0Var.c = getMessagesController().a2(Long.valueOf(ha0Var.b.from_id.user_id));
                ha0Var.a = ha0Var.b.from_id.user_id;
            } else {
                long B0 = org.telegram.messenger.zi.B0(message);
                if (org.telegram.messenger.m5.E(B0)) {
                    ha0Var.c = getMessagesController().a2(Long.valueOf(B0));
                } else {
                    ha0Var.d = getMessagesController().M0(Long.valueOf(-B0));
                }
                ha0Var.a = B0;
            }
            H0(ha0Var);
            try {
                gi.v5 v5Var = (gi.v5) ((mb.b) org.telegram.messenger.t0.k()).onCreateMarkerOptions();
                l8.g gVar = (l8.g) v5Var.b;
                l8.g gVar2 = (l8.g) v5Var.b;
                gVar.a = new LatLng(d, d10);
                Bitmap n02 = n0(ha0Var);
                if (n02 != null) {
                    gVar2.d = b8.wd.a(n02);
                    gVar2.e = 0.5f;
                    gVar2.f = 0.907f;
                    ha0Var.e = this.F.a(v5Var);
                    if (!org.telegram.messenger.l10.B(ha0Var.c)) {
                        gi.v5 v5Var2 = (gi.v5) ((mb.b) org.telegram.messenger.t0.k()).onCreateMarkerOptions();
                        ((l8.g) v5Var2.b).a = new LatLng(d, d10);
                        l8.g gVar3 = (l8.g) v5Var2.b;
                        gVar3.r = true;
                        gVar3.e = 0.5f;
                        gVar3.f = 0.5f;
                        org.telegram.messenger.y9 a10 = this.F.a(v5Var2);
                        ha0Var.f = a10;
                        int i3 = message.media.heading;
                        if (i3 != 0) {
                            a10.c(i3);
                            ha0Var.f.a.a(b8.wd.b(R.drawable.map_pin_cone2));
                            ha0Var.g = true;
                        } else {
                            a10.c(0);
                            ha0Var.f.a.a(b8.wd.b(R.drawable.map_pin_circle));
                            ha0Var.g = false;
                        }
                    }
                    this.o0.add(ha0Var);
                    hVar.k(ha0Var, ha0Var.a);
                    org.telegram.messenger.kd h = getLocationController().h(this.m0);
                    if (ha0Var.a == getUserConfig().e() && h != null && ha0Var.b.id == h.b && (location = this.z0) != null) {
                        double latitude = location.getLatitude();
                        double longitude = this.z0.getLongitude();
                        l8.f fVar = ha0Var.e.a;
                        LatLng latLng = new LatLng(latitude, longitude);
                        fVar.getClass();
                        try {
                            u7.i iVar = (u7.i) fVar.a;
                            Parcel P0 = iVar.P0();
                            u7.b.b(P0, latLng);
                            iVar.T0(P0, 3);
                        } catch (RemoteException e10) {
                            throw new androidx.car.app.j(e10);
                        }
                    }
                }
            } catch (Exception e11) {
                org.telegram.messenger.a8.g(e11, true);
            }
        } else {
            ha0Var.b = message;
            l8.f fVar2 = ha0Var.e.a;
            LatLng latLng2 = new LatLng(d, d10);
            fVar2.getClass();
            try {
                u7.i iVar2 = (u7.i) fVar2.a;
                Parcel P02 = iVar2.P0();
                u7.b.b(P02, latLng2);
                iVar2.T0(P02, 3);
                if (this.q0 == ha0Var.a) {
                    this.F.b(((mb.b) org.telegram.messenger.t0.k()).newCameraUpdateLatLng(ha0Var.e.a()));
                }
            } catch (RemoteException e12) {
                throw new androidx.car.app.j(e12);
            }
        }
        org.telegram.ui.Components.kg0 kg0Var = this.O;
        if (kg0Var != null) {
            kg0Var.c(true);
        }
        N0();
        return ha0Var;
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final boolean isLightStatusBar() {
        return i0.a.h(getThemedColor(org.telegram.ui.ActionBar.k6.d6)) > 0.699999988079071d;
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return false;
    }

    public final void j0() {
        if (this.fragmentView == null || this.R == null) {
            return;
        }
        i0.b bVar = this.mSystemInsets;
        int i3 = bVar.b;
        int i10 = bVar.d;
        FrameLayout frameLayout = this.X;
        if (frameLayout != null) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) frameLayout.getLayoutParams();
            int d = pi.a.d(i3) - org.telegram.messenger.g0.L(6.0f);
            if (layoutParams.topMargin != d) {
                layoutParams.topMargin = d;
                this.X.requestLayout();
            }
        }
        this.R.setClipToPadding(false);
        this.R.setPadding(0, 0, 0, i10);
        org.telegram.ui.Components.tj0 tj0Var = this.S;
        if (tj0Var != null) {
            tj0Var.setClipToPadding(false);
            pi.a.e(this.S, i3, i10, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight(), 0);
        }
        if (this.fragmentView.getMeasuredHeight() > 0) {
            s0(false);
        }
    }

    public final void k0() {
        gh.g gVar = this.Z;
        if (gVar != null) {
            gVar.updateColors();
        }
        xs xsVar = this.R;
        if (xsVar != null) {
            xsVar.invalidate();
        }
        if (this.F != null) {
            int i3 = org.telegram.messenger.g0.B(getThemedColor(org.telegram.ui.ActionBar.k6.d6)) < 0.721f ? R.raw.mapstyle_night : 0;
            if (i3 != 0) {
                if (!this.i0) {
                    this.i0 = true;
                    this.F.i(((mb.b) org.telegram.messenger.t0.k()).loadRawResourceStyle(org.telegram.messenger.t0.b, i3));
                    m2.t tVar = this.L;
                    if (tVar != null) {
                        tVar.g1(-1);
                        this.L.a1(553648127);
                    }
                }
            } else if (this.i0) {
                this.i0 = false;
                this.F.i(null);
                m2.t tVar2 = this.L;
                if (tVar2 != null) {
                    tVar2.g1(-16777216);
                    this.L.a1(TLObject.FLAG_29);
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
                    int i3 = org.telegram.ui.ActionBar.k6.L5;
                    alertDialog$Builder.m(R.raw.permission_request_location, 72, getThemedColor(i3), null);
                    alertDialog$Builder.n(i3, getResourceProvider());
                    alertDialog$Builder.a.U = org.telegram.messenger.bd.M0(2131749538, null);
                    alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131751806, null), new x90(this, 3));
                    alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131752589, null), null);
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

    public final void m0(int i3) {
        u7.h fVar;
        if (this.F == null) {
            return;
        }
        List<org.telegram.messenger.ab> asList = Arrays.asList(new org.telegram.messenger.za(), new org.telegram.messenger.ya());
        org.telegram.messenger.oa onCreateCircleOptions = ((mb.b) org.telegram.messenger.t0.k()).onCreateCircleOptions();
        double latitude = this.z0.getLatitude();
        double longitude = this.z0.getLongitude();
        hi.d dVar = (hi.d) onCreateCircleOptions;
        l8.b bVar = (l8.b) dVar.b;
        LatLng latLng = new LatLng(latitude, longitude);
        bVar.getClass();
        bVar.a = latLng;
        double d = i3;
        l8.b bVar2 = (l8.b) dVar.b;
        bVar2.b = d;
        if (x0()) {
            bVar2.d = -1771658281;
            bVar2.e = 476488663;
        } else {
            bVar2.d = -1774024971;
            bVar2.e = 474121973;
        }
        ArrayList arrayList = new ArrayList();
        for (org.telegram.messenger.ab abVar : asList) {
            if (abVar instanceof org.telegram.messenger.za) {
                arrayList.add(new l8.c(20, 1));
            } else if (abVar instanceof org.telegram.messenger.ya) {
                arrayList.add(new l8.c(20, 0));
            }
        }
        bVar2.r = arrayList;
        bVar2.c = 2;
        org.telegram.messenger.z9 z9Var = this.F;
        p4.q qVar = z9Var.a;
        qVar.getClass();
        try {
            k8.e eVar = (k8.e) qVar.a;
            Parcel P0 = eVar.P0();
            u7.b.b(P0, bVar2);
            Parcel O0 = eVar.O0(P0, 35);
            IBinder readStrongBinder = O0.readStrongBinder();
            int i10 = u7.g.b;
            if (readStrongBinder == null) {
                fVar = null;
            } else {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.ICircleDelegate");
                fVar = queryLocalInterface instanceof u7.h ? (u7.h) queryLocalInterface : new u7.f(readStrongBinder, "com.google.android.gms.maps.model.internal.ICircleDelegate", 10);
            }
            O0.recycle();
            l8.a aVar = new l8.a(fVar);
            m2.t tVar = new m2.t(7, z9Var, aVar);
            z9Var.c.put(aVar, tVar);
            this.L = tVar;
        } catch (RemoteException e10) {
            throw new androidx.car.app.j(e10);
        }
    }

    public final Bitmap n0(ha0 ha0Var) {
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
                org.telegram.ui.Components.u8 u8Var = new org.telegram.ui.Components.u8((org.telegram.ui.ActionBar.e6) null);
                TLRPC.User user = ha0Var.c;
                if (user != null) {
                    u8Var.r(user);
                } else {
                    TLRPC.Chat chat = ha0Var.d;
                    if (chat != null) {
                        u8Var.q(chat);
                    }
                }
                canvas.translate(org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f));
                u8Var.setBounds(0, 0, org.telegram.messenger.g0.L(50.0f), org.telegram.messenger.g0.L(50.0f));
                u8Var.draw(canvas);
                canvas.restore();
                ImageReceiver imageReceiver = ha0Var.h;
                Bitmap n4 = (imageReceiver == null || !imageReceiver.J()) ? null : ha0Var.h.n();
                if (n4 != null && !n4.isRecycled()) {
                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                    BitmapShader bitmapShader = new BitmapShader(n4, tileMode, tileMode);
                    Matrix matrix = new Matrix();
                    float L = org.telegram.messenger.g0.L(50.0f) / n4.getWidth();
                    matrix.postTranslate(org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f));
                    matrix.postScale(L, L);
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
        return this instanceof em;
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final boolean onBackPressed(boolean z10) {
        org.telegram.ui.Components.kg0 kg0Var = this.O;
        if (kg0Var == null) {
            org.telegram.messenger.sa saVar = this.H;
            if (saVar == null || ((GLSurfaceView) ((b8.ke) saVar).f) == null || this.J) {
                return super.onBackPressed(z10);
            }
            if (z10) {
                A0();
            }
        } else if (z10) {
            kg0Var.a();
            return false;
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void onBecomeFullyHidden() {
        UndoView undoView = this.x[0];
        if (undoView != null) {
            undoView.d(0, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        getNotificationCenter().c(this, org.telegram.messenger.hs.t);
        org.telegram.messenger.hs.e().c(this, org.telegram.messenger.hs.v4);
        org.telegram.messenger.hs.e().c(this, org.telegram.messenger.hs.w4);
        org.telegram.messenger.hs.e().c(this, org.telegram.messenger.hs.D4);
        org.telegram.messenger.zi ziVar = this.E0;
        if (ziVar != null && ziVar.D3()) {
            getNotificationCenter().c(this, 1);
            getNotificationCenter().c(this, org.telegram.messenger.hs.m0);
        }
        return true;
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        org.telegram.ui.Components.c80 c80Var = this.e0;
        if (c80Var != null) {
            c80Var.i = true;
            c80Var.g = false;
            c80Var.d();
            c80Var.d = null;
            c80Var.e = null;
            c80Var.f = null;
        }
        org.telegram.messenger.hs.e().n(this, org.telegram.messenger.hs.v4);
        org.telegram.messenger.hs.e().n(this, org.telegram.messenger.hs.w4);
        org.telegram.messenger.hs.e().n(this, org.telegram.messenger.hs.D4);
        getNotificationCenter().n(this, org.telegram.messenger.hs.t);
        getNotificationCenter().n(this, 1);
        getNotificationCenter().n(this, org.telegram.messenger.hs.m0);
        try {
            org.telegram.messenger.z9 z9Var = this.F;
            if (z9Var != null) {
                z9Var.k(false);
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        try {
            org.telegram.messenger.sa saVar = this.H;
            if (saVar != null) {
                ((b8.ke) saVar).x();
            }
        } catch (Exception e11) {
            org.telegram.messenger.a8.g(e11, true);
        }
        UndoView undoView = this.x[0];
        if (undoView != null) {
            undoView.d(0, true);
        }
        da0 da0Var = this.Q;
        if (da0Var != null) {
            da0Var.F();
        }
        org.telegram.ui.Components.sk skVar = this.T;
        if (skVar != null) {
            skVar.F();
        }
        u90 u90Var = this.L0;
        if (u90Var != null) {
            org.telegram.messenger.g0.r(u90Var);
            this.L0 = null;
        }
        ArrayList arrayList = this.o0;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            ha0 ha0Var = (ha0) arrayList.get(i3);
            ImageReceiver imageReceiver = ha0Var.h;
            if (imageReceiver != null) {
                imageReceiver.R();
                ha0Var.h = null;
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void onInsets(int i3, int i10, int i11, int i12) {
        j0();
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void onLowMemory() {
        android.support.v4.media.session.a0 a0Var;
        super.onLowMemory();
        org.telegram.messenger.sa saVar = this.H;
        if (saVar == null || !this.x0 || (a0Var = (android.support.v4.media.session.a0) ((m.o3) ((ai.c0) ((b8.ke) saVar).b).b).b) == null) {
            return;
        }
        try {
            k8.f fVar = (k8.f) a0Var.c;
            fVar.T0(fVar.P0(), 6);
        } catch (RemoteException e10) {
            throw new androidx.car.app.j(e10);
        }
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void onPause() {
        super.onPause();
        org.telegram.messenger.sa saVar = this.H;
        if (saVar != null && this.x0) {
            try {
                ((b8.ke) saVar).y();
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
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void onResume() {
        Activity parentActivity;
        super.onResume();
        org.telegram.messenger.g0.a3(getParentActivity(), this.classGuid);
        org.telegram.messenger.g0.B2(getParentActivity(), this.classGuid);
        org.telegram.messenger.sa saVar = this.H;
        if (saVar != null && this.x0) {
            try {
                ((b8.ke) saVar).A();
            } catch (Throwable th2) {
                org.telegram.messenger.a8.g(th2, true);
            }
        }
        this.y0 = true;
        D0();
        org.telegram.messenger.z9 z9Var = this.F;
        if (z9Var != null) {
            try {
                z9Var.k(true);
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        }
        s0(true);
        if (o0()) {
            this.t0 = false;
        } else if (this.t0 && (parentActivity = getParentActivity()) != null) {
            this.t0 = false;
            if (parentActivity.checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") != 0) {
                parentActivity.requestPermissions(new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"}, 2);
            }
        }
        u90 u90Var = this.L0;
        if (u90Var != null) {
            org.telegram.messenger.g0.r(u90Var);
            org.telegram.messenger.g0.i3(this.L0, 5000L);
        }
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            k0();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        try {
            org.telegram.ui.ActionBar.f5 f5Var = this.r;
            if (f5Var == null || f5Var.getSearchField() == null) {
                return;
            }
            this.r.getSearchField().setCursorColor(getThemedColor(org.telegram.ui.ActionBar.k6.j5));
        } catch (Exception e11) {
            org.telegram.messenger.a8.g(e11, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (!z10 || z11) {
            return;
        }
        try {
            if (((ai.c0) ((b8.ke) this.H).b).getParent() instanceof ViewGroup) {
                ((ViewGroup) ((ai.c0) ((b8.ke) this.H).b).getParent()).removeView((ai.c0) ((b8.ke) this.H).b);
            }
        } catch (Exception unused) {
        }
        ai.d2 d2Var = this.P;
        if (d2Var != null) {
            d2Var.addView((ai.c0) ((b8.ke) this.H).b, 0, b8.mf.e(-1, u0(), 51));
            K0(false);
            y0();
            D0();
            return;
        }
        View view = this.fragmentView;
        if (view != null) {
            ((FrameLayout) view).addView((ai.c0) ((b8.ke) this.H).b, 0, b8.mf.e(-1, -1, 51));
        }
    }

    public final void p0(ArrayList arrayList) {
        org.telegram.messenger.qa onCreateLatLngBoundsBuilder = this.n0 ? ((mb.b) org.telegram.messenger.t0.k()).onCreateLatLngBoundsBuilder() : null;
        int currentTime = getConnectionsManager().getCurrentTime();
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            TLRPC.Message message = (TLRPC.Message) arrayList.get(i3);
            int i10 = message.date;
            TLRPC.MessageMedia messageMedia = message.media;
            int i11 = messageMedia.period;
            if (i10 + i11 > currentTime || i11 == Integer.MAX_VALUE) {
                if (onCreateLatLngBoundsBuilder != null) {
                    TLRPC.GeoPoint geoPoint = messageMedia.geo;
                    ((gi.w5) onCreateLatLngBoundsBuilder).V(new org.telegram.messenger.va(geoPoint.lat, geoPoint._long));
                }
                i0(message);
                if (this.c.getVisibility() != 8 && org.telegram.messenger.zi.C1(message.from_id) != getUserConfig().e()) {
                    this.c.setVisibility(0);
                    this.E = true;
                    this.c.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(180L).setListener(new y20(this, 3)).start();
                }
            }
        }
        if (onCreateLatLngBoundsBuilder != null) {
            if (this.n0) {
                this.R.w0(0, org.telegram.messenger.g0.L(99.0f), null);
            }
            this.n0 = false;
            this.Q.N(this.o0);
            if (this.E0.D3()) {
                try {
                    gi.w5 w5Var = (gi.w5) onCreateLatLngBoundsBuilder;
                    org.telegram.messenger.va a10 = w5Var.R().a();
                    org.telegram.messenger.va z02 = z0(a10, 100.0d, 100.0d);
                    w5Var.V(z0(a10, -100.0d, -100.0d));
                    w5Var.V(z02);
                    org.telegram.messenger.x9 R = w5Var.R();
                    if (arrayList.size() > 1) {
                        try {
                            org.telegram.messenger.na newCameraUpdateLatLngBounds = ((mb.b) org.telegram.messenger.t0.k()).newCameraUpdateLatLngBounds(R, org.telegram.messenger.g0.L(113.0f));
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
        int i3;
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
                ha0 ha0Var = (ha0) arrayList2.get(i11);
                org.telegram.messenger.y9 y9Var = ha0Var.e;
                if (y9Var != null && (message = ha0Var.b) != null && (messageMedia = message.media) != null && ((i10 = messageMedia.period) == Integer.MAX_VALUE || message.date + i10 > currentTime)) {
                    arrayList.add(y9Var.a());
                }
            }
            boolean z13 = this.p0.f(getUserConfig().e()) != null;
            Location location = this.z0;
            if (location != null && !z13) {
                arrayList.add(new org.telegram.messenger.va(location.getLatitude(), this.z0.getLongitude()));
            }
            if (arrayList.size() >= 2) {
                try {
                    org.telegram.messenger.qa onCreateLatLngBoundsBuilder = ((mb.b) org.telegram.messenger.t0.k()).onCreateLatLngBoundsBuilder();
                    int size2 = arrayList.size();
                    double d = -1.7976931348623157E308d;
                    int i12 = 0;
                    double d10 = Double.MAX_VALUE;
                    double d11 = Double.MAX_VALUE;
                    double d12 = -1.7976931348623157E308d;
                    while (i12 < size2) {
                        org.telegram.messenger.va vaVar = (org.telegram.messenger.va) arrayList.get(i12);
                        z10 = z12;
                        try {
                            ((gi.w5) onCreateLatLngBoundsBuilder).V(vaVar);
                            i3 = size2;
                            z11 = true;
                        } catch (Exception e10) {
                            e = e10;
                            z11 = true;
                            org.telegram.messenger.a8.g(e, z11);
                            return z10;
                        }
                        try {
                            double d13 = vaVar.a;
                            if (d13 < d10) {
                                d10 = d13;
                            }
                            if (d13 > d) {
                                d = d13;
                            }
                            double d14 = vaVar.b;
                            if (d14 < d11) {
                                d11 = d14;
                            }
                            if (d14 > d12) {
                                d12 = d14;
                            }
                            i12++;
                            z12 = z10;
                            size2 = i3;
                        } catch (Exception e11) {
                            e = e11;
                            org.telegram.messenger.a8.g(e, z11);
                            return z10;
                        }
                    }
                    z10 = z12;
                    z11 = true;
                    double d15 = (d10 + d) / 2.0d;
                    double d16 = (d11 + d12) / 2.0d;
                    double radians = Math.toRadians(d - d10) * 6366198.0d;
                    double radians2 = Math.toRadians(d12 - d11) * 6366198.0d * Math.cos(Math.toRadians(d15));
                    if (radians < 30.0d || radians2 < 30.0d) {
                        gi.w5 w5Var = (gi.w5) onCreateLatLngBoundsBuilder;
                        w5Var.V(new org.telegram.messenger.va(Math.toDegrees(2.356194387921959E-6d) + d15, d16 + Math.toDegrees(15.0d / (Math.cos(Math.toRadians(d15)) * 6366198.0d))));
                        w5Var.V(new org.telegram.messenger.va(d15 + Math.toDegrees(-2.356194387921959E-6d), d16 + Math.toDegrees((-15.0d) / (Math.cos(Math.toRadians(d15)) * 6366198.0d))));
                    }
                    this.F.c(((mb.b) org.telegram.messenger.t0.k()).newCameraUpdateLatLngBounds(((gi.w5) onCreateLatLngBoundsBuilder).R(), org.telegram.messenger.g0.L(60.0f)));
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
            int i3 = this.mSystemInsets.d;
            int measuredHeight = this.fragmentView.getMeasuredHeight();
            if (measuredHeight == 0) {
                return;
            }
            int i10 = this.I0;
            if (i10 == 6) {
                this.J0 = org.telegram.messenger.k5.z(66.0f, measuredHeight, i3);
            } else if (i10 == 2) {
                this.J0 = org.telegram.messenger.k5.z(73.0f, measuredHeight, i3);
            } else {
                this.J0 = org.telegram.messenger.k5.z(66.0f, measuredHeight, i3);
            }
            fa0 fa0Var = this.M0;
            if (fa0Var != null && fa0Var.m0(8) > 0) {
                this.J0 -= org.telegram.messenger.g0.L(200.0f);
            }
            this.c0 = org.telegram.messenger.g0.L(100.0f) + (measuredHeight - this.J0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.P.getLayoutParams();
            layoutParams.height = org.telegram.messenger.g0.L(29.0f) + this.J0;
            this.P.setLayoutParams(layoutParams);
            this.Q.P(this.J0);
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) ((ai.c0) ((b8.ke) this.H).b).getLayoutParams();
            if (layoutParams2 != null) {
                layoutParams2.height = u0();
                org.telegram.messenger.z9 z9Var = this.F;
                if (z9Var != null) {
                    z9Var.o(org.telegram.messenger.g0.L(70.0f), 0, org.telegram.messenger.g0.L(70.0f), t0());
                }
                ((ai.c0) ((b8.ke) this.H).b).setLayoutParams(layoutParams2);
            }
            this.Q.f();
            if (!z10) {
                K0(false);
                return;
            }
            int i11 = i10 == 3 ? 73 : (i10 == 1 || i10 == 2) ? 66 : 0;
            this.V.h1(0, -org.telegram.messenger.g0.L(i11));
            K0(false);
            this.R.post(new org.telegram.ui.Components.o2(this, i11, 17));
        }
    }

    public final int t0() {
        return org.telegram.messenger.g0.L(10.0f) + this.h0 + this.c0;
    }

    public final int u0() {
        return org.telegram.messenger.g0.L(10.0f) + this.J0 + this.c0;
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final boolean useSimpleActionBar() {
        return true;
    }

    public final boolean v0() {
        ArrayList arrayList = (ArrayList) getLocationController().c.f(org.telegram.messenger.zi.B0(this.E0.k));
        if (arrayList == null || !arrayList.isEmpty()) {
            arrayList = null;
        } else {
            p0(arrayList);
        }
        if (org.telegram.messenger.m5.z(this.m0)) {
            TLRPC.Chat M0 = getMessagesController().M0(Long.valueOf(-this.m0));
            if (org.telegram.messenger.t3.T(M0) && !M0.megagroup) {
                return false;
            }
        }
        TLRPC.TL_messages_getRecentLocations tL_messages_getRecentLocations = new TLRPC.TL_messages_getRecentLocations();
        long B0 = org.telegram.messenger.zi.B0(this.E0.k);
        tL_messages_getRecentLocations.peer = getMessagesController().j1(B0);
        tL_messages_getRecentLocations.limit = 100;
        getConnectionsManager().sendRequest(tL_messages_getRecentLocations, new ei.c6(this, B0, 1));
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
        return (getResourceProvider() == null && org.telegram.ui.ActionBar.k6.I.q()) || org.telegram.messenger.g0.B(getThemedColor(org.telegram.ui.ActionBar.k6.d6)) < 0.721f;
    }

    public final void y0() {
        SharedPreferences e12;
        int i3;
        ImageView imageView = this.c;
        if (imageView == null || imageView.getVisibility() != 0 || this.E || (i3 = (e12 = org.telegram.messenger.hp.e1()).getInt("proximityhint", 0)) >= 3) {
            return;
        }
        e12.edit().putInt("proximityhint", i3 + 1).commit();
        if (org.telegram.messenger.m5.E(this.m0)) {
            this.s.u(org.telegram.messenger.bd.a0("ProximityTooltioUser", null, 2131746620, org.telegram.messenger.l10.j(getMessagesController().a2(Long.valueOf(this.m0)), true)));
        } else {
            this.s.u(org.telegram.messenger.bd.M0(2131746621, null));
        }
        this.s.w();
    }
}
